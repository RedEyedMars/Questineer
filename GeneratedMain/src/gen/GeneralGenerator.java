package gen;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import gen.checks.*;
import gen.entries.*;
import gen.properties.*;
import lists.*;

public class GeneralGenerator extends Generator {

	private HashMap<String,ClassEntry> types = new HashMap<String,ClassEntry>();
	private String packageName = null;
	private File directory = null;
	private File miscDirectory = null;
	private ListEntry declaredListClasses = new ListEntry();
	private HashMap<String,ListEntry> mapOfListMapClasses = new HashMap<String,ListEntry>();
	private ListEntry declaredListMapClasses = new ListEntry();
	private HashSet<String> declaredListSet = new HashSet<String>();
	private ClassEntry superListClass = (ClassEntry)null;
	private ClassEntry superListMapClass = (ClassEntry)null;


	public static final Element semicolonedElement = new Element("semicoloned",new String[]{"",/*subject*/";"});
	public static final Element asPackageNameElement = new Element("asPackageName",new String[]{"",/*Game*/".",/*Package*/""});
	public static final Element declarePackageElement = new Element("declarePackage",new String[]{"package ",/*Game Package*/".",/*Import Name*/";"});
	public static final Element plainPackageElement = new Element("plainPackage",new String[]{"",/*Game Package*/".",/*Import Name*/""});
	public static final Element importElement = new Element("import",new String[]{"import ",/*Game*/".",/*Package*/";"});
	public static final Element importStdPackageElement = new Element("importStdPackage",new String[]{"import ",/*Import Name*/".",/*Class Name*/";"});
	public static final Element importGamePackageElement = new Element("importGamePackage",new String[]{"import ",/*Game Package*/".",/*Import Name*/".",/*Class Name*/";"});
	public static final Element equalsElement = new Element("equals",new String[]{"",/*left*/".equals(",/*right*/")"});
	public static final Element notEqualsElement = new Element("notEquals",new String[]{"!",/*left*/".equals(",/*right*/")"});
	public static final Element bracedElement = new Element("braced",new String[]{"(",/*Content*/")"});
	public static final Element negateElement = new Element("negate",new String[]{"!(",/*Content*/")"});
	public static final Element bodyElement = new Element("body",new String[]{"{",/*Contents*/"\n}"});
	public static final Element operatorElement = new Element("operator",new String[]{"",/*left*/"",/*operator*/"",/*right*/""});
	public static final Element setVarElement = new Element("setVar",new String[]{"",/*variable name*/" = ",/*assignment*/";"});
	public static final Element declareGetMethodElement = new Element("declareGetMethod",new String[]{"\n\tpublic ",/*Type*/" get",/*Variable Name*/"(){\n\t\treturn ",/*Variable Name*/";\n\t}"});
	public static final Element ifStatementElement = new Element("ifStatement",new String[]{"if(",/*Boolean*/"){",/*Contents*/""});
	public static final Element elseWithIfElement = new Element("elseWithIf",new String[]{"else ",/*Body*/""});
	public static final Element elseWithBodyElement = new Element("elseWithBody",new String[]{"else {",/*Body*/""});
	public static final Element forStatementElement = new Element("forStatement",new String[]{"for(",/*Element*/":",/*List*/"){",/*Contents*/""});
	public static final Element returnCallElement = new Element("returnCall",new String[]{"return ",/*Statement*/""});
	public static final Element methodCallElement = new Element("methodCall",new String[]{"",/*Subject*/".",/*MethodName*/"(",/*Parameters*/")"});
	public static final Element hasCallElement = new Element("hasCall",new String[]{"",/*Subject*/".has",/*Group Name*/"(",/*Argument*/")"});
	public static final Element subjectlessMethodCallElement = new Element("subjectlessMethodCall",new String[]{"",/*MethodName*/"(",/*Parameters*/")"});
	public static final Element newObjectCallElement = new Element("newObjectCall",new String[]{"new ",/*MethodName*/"(",/*Parameters*/")"});
	public static final Element getMethodElement = new Element("getMethod",new String[]{"get",/*VariableName*/""});
	public static final Element conditionalWithHeaderElement = new Element("conditionalWithHeader",new String[]{"",/*Name*/"(",/*Header*/"){",/*Body*/""});
	public static final Element conditionalWithoutHeaderElement = new Element("conditionalWithoutHeader",new String[]{"",/*Name*/"{",/*Body*/""});
	public static final Element variableAsParameterElement = new Element("variableAsParameter",new String[]{"initial",/*Parameter Name*/""});
	public static final Element declareVariableElement = new Element("declareVariable",new String[]{"",/*Variable Type*/" = ",/*Assignment*/";"});
	public static final Element declareMemberElement = new Element("declareMember",new String[]{"",/*Variable Type*/" ",/*Variable Name*/" = ",/*Variable Assignment*/";"});
	public static final Element exactElement = new Element("exact",new String[]{"",/*Contents*/""});
	public static final Element typeAndNameElement = new Element("typeAndName",new String[]{"",/*Type*/" ",/*Name*/""});
	public static final Element percentifyElement = new Element("percentify",new String[]{"",/*Subject*/"*0.01f"});
	public static final Element newRangeElement = new Element("newRange",new String[]{"new Range(",/*Left*/"f, ",/*Right*/"f)"});
	public static final Element isChanceElement = new Element("isChance",new String[]{"Math.random()<=",/*Percent*/""});
	public static final Element nameWithTemplateParametersElement = new Element("nameWithTemplateParameters",new String[]{"",/*Name*/"<",/*Template Parameters*/">"});
	public static final Element templateParametersElement = new Element("templateParameters",new String[]{"<",/*Template Parameters*/">"});
	public static final Element extendsElement = new Element("extends",new String[]{"extends ",/*Extends Class Name*/""});
	public static final Element extendsAndImplementsElement = new Element("extendsAndImplements",new String[]{"extends ",/*Extends Class Name*/" implements ",/*Interface List*/""});
	public static final Element implementsElement = new Element("implements",new String[]{" implements ",/*Interface List*/""});
	public static final Element packageStatementElement = new Element("packageStatement",new String[]{"package ",/*Game Package*/";\n"});
	public static final Element getCallElement = new Element("getCall",new String[]{"get",/*Method Name*/""});
	public static final Element declareMethodElement = new Element("declareMethod",new String[]{"public ",/*Header*/"(",/*Parameters*/"){",/*Body*/"\n\t}"});
	public static final Element declareStaticMethodElement = new Element("declareStaticMethod",new String[]{"public static ",/*Header*/"(",/*Parameters*/"){",/*Body*/"\n\t}"});
	public static final Element declareInterfaceMethodElement = new Element("declareInterfaceMethod",new String[]{"public ",/*Header*/"(",/*Parameters*/");"});
	public static final Element declareInterfaceElement = new Element("declareInterface",new String[]{"",/*Package*/"\n",/*Imports*/""+
			"\npublic interface ",/*Class Name*/" {",/*Methods*/""+
			"\n}"});
	public static final Element declareSubInterfaceElement = new Element("declareSubInterface",new String[]{"public static interface ",/*Class Name*/" {",/*Methods*/""+
			"\n}"});
	public static final Element declareClassElement = new Element("declareClass",new String[]{"",/*Package*/"\n"+
			"",/*Imports*/"\n"+
			"public ",/*Static*/" class ",/*Class Name*/" ",/*Extends*/"{\n"+
			"",/*Members*/"\n"+
			"",/*Default Constructor*/""+
			"\tpublic ",/*Class Name*/"(",/*Class Parameters*/"){",/*Class Assignments*/"\n\t}\n"+
			"",/*Methods*/"\n"+
			"}"});
	public static final Element declareCustomWithDefaultElement = new Element("declareCustomWithDefault",new String[]{"",/*Package*/"\n"+
			"",/*Imports*/"\n"+
			"public class ",/*Class Name*/" ",/*Extends*/"{\n"+
			"",/*Members*/"\n"+
			"\tpublic ",/*Class Name*/"(){",/*Constructor Body*/"}\n"+
			"\tpublic ",/*Class Name*/"(",/*Class Parameters*/"){",/*Class Assignments*/"\n",/*Constructor Body*/"\n\t}\n"+
			"",/*Methods*/"\n"+
			"",/*Sub Classes*/"\n"+
			"}"});
	public static final Element declareCustomSubWithDefaultElement = new Element("declareCustomSubWithDefault",new String[]{"public static class ",/*Class Name*/" ",/*Extends*/"{\n"+
			"",/*Members*/"\n"+
			"\tpublic ",/*Class Name*/"(){ ",/*Constructor Body*/"\n\t}\n"+
			"\tpublic ",/*Class Name*/"(",/*Class Parameters*/"){",/*Class Assignments*/"\n",/*Constructor Body*/"\n\t}\n"+
			"",/*Methods*/"\n"+
			"",/*Sub Classes*/"\n"+
			"}"});
	public static final Element declareCustomElement = new Element("declareCustom",new String[]{"",/*Package*/"\n"+
			"",/*Imports*/"\n"+
			"public class ",/*Class Name*/" ",/*Extends*/"{\n"+
			"",/*Members*/"\n"+
			"\tpublic ",/*Class Name*/"(){",/*Constructor Body*/" }\n"+
			"",/*Methods*/"\n"+
			"",/*Sub Classes*/"\n"+
			"}"});
	public static final Element declareCustomSubElement = new Element("declareCustomSub",new String[]{"public static class ",/*Class Name*/" ",/*Extends*/"{\n"+
			"",/*Members*/"\n"+
			"\tpublic ",/*Class Name*/"(){",/*Constructor Body*/"}\n"+
			"",/*Methods*/"\n"+
			"",/*Sub Classes*/"\n"+
			"}"});
	public static final Element cloneElement = new Element("clone",new String[]{"",/*Subject*/".clone()"});
	public static final Element getIdElement = new Element("getId",new String[]{"",/*Subject*/".getId()"});
	public static final Element defaultConstructorElement = new Element("defaultConstructor",new String[]{"\tpublic ",/*Class Name*/"(){}\n"});
	public static final Element declareListClassElement = new Element("declareListClass",new String[]{"package ",/*Game Package*/".misc;"+
			"\nimport java.util.*;"+
			"\npublic class List {",/*Lists*/""+
			"\n	public static class Map{",/*Maps*/""+
			"\n	}"+
			"\n}"});
	public static final Element listConstructorBodyElement = new Element("listConstructorBody",new String[]{"super(Arrays.asList(initialElements));"});
	public static final Element declareMapSuperClassElement = new Element("declareMapSuperClass",new String[]{"public static class ",/*Left Name*/"{",/*Contents*/""+
			"\n		}"});
	public static final Element mapClassAddBodyElement = new Element("mapClassAddBody",new String[]{""+
			"\n					if(!super.containsKey(key)){"+
			"\n						super.put(key,new ",/*Right Name*/"());"+
			"\n					}"+
			"\n					complete.add(element);"+
			"\n					super.get(key).add(element);"});
	public static final Element mapClassRemoveLastBodyElement = new Element("mapClassRemoveLastBody",new String[]{""+
			"\n					if(super.containsKey(key)&&!super.get(key).isEmpty()){"+
			"\n						complete.remove(super.get(key).removeLast());"+
			"\n					}"});
	public static final Element mapClassRemoveAllBodyElement = new Element("mapClassRemoveAllBody",new String[]{""+
			"\n					if(super.containsKey(key)){"+
			"\n						",/*Right Name*/" list = super.get(key);"+
			"\n						while(!list.isEmpty()){"+
			"\n							complete.remove(list.removeLast());"+
			"\n						}						"+
			"\n					}"});
	public static final Element mapClassRemoveBodyElement = new Element("mapClassRemoveBody",new String[]{""+
			"\n					super.get(key).remove(element);"+
			"\n					complete.remove(element);"});
	public static final Element rangeIIbodyElement = new Element("rangeIIbody",new String[]{"\t\tleft = (float)initialLeft;\n"+
			"\t\tright = (float)initialRight;\n"});
	public static final Element rangeFIbodyElement = new Element("rangeFIbody",new String[]{"\t\tleft = initialLeft;\n"+
			"\t\tright = (float)initialRight;\n"});
	public static final Element rangeIFbodyElement = new Element("rangeIFbody",new String[]{"\t\tleft = (float)initialLeft;\n"+
			"\t\tright = initialRight;\n"});
	public static final Element rangeGetModifierBodyElement = new Element("rangeGetModifierBody",new String[]{"\t\treturn new Entity.Modifier(){\n"+
			"\t\t\tprivate Float value = getRandom();\n"+
			"\t\t\t@Override\n"+
			"\t\t\tpublic void decrease(Entity inputEntity,Float amount){"+
			"\t\t\t\tvalue -= amount;"+
			"\t\t\t}"+
			"\t\t\t@Override\n"+
			"\t\t\tpublic Float use(Entity inputEntity){\n"+
			"\t\t\t\treturn value;\n"+
			"\t\t\t}\n\t\t}"});
	public static final Element rangeGetRandomBodyElement = new Element("rangeGetRandomBody",new String[]{"\t\treturn (float)(double)(((right-left)*Math.random())+left)"});
	public GeneralGenerator(){
		addElement("semicoloned",semicolonedElement);
		addElement("asPackageName",asPackageNameElement);
		addElement("declarePackage",declarePackageElement);
		addElement("plainPackage",plainPackageElement);
		addElement("import",importElement);
		addElement("importStdPackage",importStdPackageElement);
		addElement("importGamePackage",importGamePackageElement);
		addElement("equals",equalsElement);
		addElement("notEquals",notEqualsElement);
		addElement("braced",bracedElement);
		addElement("negate",negateElement);
		addElement("body",bodyElement);
		addElement("operator",operatorElement);
		addElement("setVar",setVarElement);
		addElement("declareGetMethod",declareGetMethodElement);
		addElement("ifStatement",ifStatementElement);
		addElement("elseWithIf",elseWithIfElement);
		addElement("elseWithBody",elseWithBodyElement);
		addElement("forStatement",forStatementElement);
		addElement("returnCall",returnCallElement);
		addElement("methodCall",methodCallElement);
		addElement("hasCall",hasCallElement);
		addElement("subjectlessMethodCall",subjectlessMethodCallElement);
		addElement("newObjectCall",newObjectCallElement);
		addElement("getMethod",getMethodElement);
		addElement("conditionalWithHeader",conditionalWithHeaderElement);
		addElement("conditionalWithoutHeader",conditionalWithoutHeaderElement);
		addElement("variableAsParameter",variableAsParameterElement);
		addElement("declareVariable",declareVariableElement);
		addElement("declareMember",declareMemberElement);
		addElement("exact",exactElement);
		addElement("typeAndName",typeAndNameElement);
		addElement("percentify",percentifyElement);
		addElement("newRange",newRangeElement);
		addElement("isChance",isChanceElement);
		addElement("nameWithTemplateParameters",nameWithTemplateParametersElement);
		addElement("templateParameters",templateParametersElement);
		addElement("extends",extendsElement);
		addElement("extendsAndImplements",extendsAndImplementsElement);
		addElement("implements",implementsElement);
		addElement("packageStatement",packageStatementElement);
		addElement("getCall",getCallElement);
		addElement("declareMethod",declareMethodElement);
		addElement("declareStaticMethod",declareStaticMethodElement);
		addElement("declareInterfaceMethod",declareInterfaceMethodElement);
		addElement("declareInterface",declareInterfaceElement);
		addElement("declareSubInterface",declareSubInterfaceElement);
		addElement("declareClass",declareClassElement);
		addElement("declareCustomWithDefault",declareCustomWithDefaultElement);
		addElement("declareCustomSubWithDefault",declareCustomSubWithDefaultElement);
		addElement("declareCustom",declareCustomElement);
		addElement("declareCustomSub",declareCustomSubElement);
		addElement("clone",cloneElement);
		addElement("getId",getIdElement);
		addElement("defaultConstructor",defaultConstructorElement);
		addElement("declareListClass",declareListClassElement);
		addElement("listConstructorBody",listConstructorBodyElement);
		addElement("declareMapSuperClass",declareMapSuperClassElement);
		addElement("mapClassAddBody",mapClassAddBodyElement);
		addElement("mapClassRemoveLastBody",mapClassRemoveLastBodyElement);
		addElement("mapClassRemoveAllBody",mapClassRemoveAllBodyElement);
		addElement("mapClassRemoveBody",mapClassRemoveBodyElement);
		addElement("rangeIIbody",rangeIIbodyElement);
		addElement("rangeFIbody",rangeFIbodyElement);
		addElement("rangeIFbody",rangeIFbodyElement);
		addElement("rangeGetModifierBody",rangeGetModifierBodyElement);
		addElement("rangeGetRandomBody",rangeGetRandomBodyElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = "com.rem.qstnr";
		directory = new File("../Questineer/src","com/rem/qstnr");
		miscDirectory = new File(directory,"misc");
		directory.mkdirs();
		miscDirectory.mkdirs();
		ClassEntry sourceClass = (ClassEntry)Generators.general.init(new ClassEntry("misc","Source",null,null,new ListEntry(),new ListEntry(),new ListEntry()));
		Generators.general.addFile(miscDirectory,"Source.java",sourceClass.get("INTERFACE"));
		Generators.general.get("Integer").setDefaultAssignment(new BodyExactEntry(new StringEntry("0")));
		Generators.general.get("Float").setDefaultAssignment(new BodyExactEntry(new StringEntry("0f")));
		Generators.general.get("String").setDefaultAssignment(new BodyExactEntry(new StringEntry("\"\"")));
		Generators.general.get("Boolean").setDefaultAssignment(new BodyExactEntry(new StringEntry("false")));
	}
	public void generate(ParseContext data){
		String setValueBody = "value = newValue;";
		ClassEntry intClass = (ClassEntry)Generators.general.init(new ClassEntry("misc","Int",null,null,new ListEntry(new VariableEntry("value","Integer")),new ListEntry(new MethodEntry("setValue","void",new ListEntry(new VariableEntry("newValue","Integer")),new ListEntry(new StringEntry(setValueBody)))),new ListEntry()));
		ClassEntry rangeClass = (ClassEntry)Generators.general.init(new ClassEntry("misc","Range",null,null,new ListEntry(new VariableEntry("left","Float"),new VariableEntry("right","Float")),new ListEntry(new MethodEntry("Range","",new ListEntry(new VariableEntry("initialLeft","Integer"),new VariableEntry("initialRight","Integer")),new ListEntry(new ElementEntry(GeneralGenerator.rangeIIbodyElement,new ListEntry()))),new MethodEntry("Range","",new ListEntry(new VariableEntry("initialLeft","Float"),new VariableEntry("initialRight","Integer")),new ListEntry(new ElementEntry(GeneralGenerator.rangeFIbodyElement,new ListEntry()))),new MethodEntry("Range","",new ListEntry(new VariableEntry("initialLeft","Integer"),new VariableEntry("initialRight","Float")),new ListEntry(new ElementEntry(GeneralGenerator.rangeIFbodyElement,new ListEntry()))),new MethodEntry("getModifier","Entity.Modifier",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.rangeGetModifierBodyElement,new ListEntry()))),new MethodEntry("getRandom","Float",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.rangeGetRandomBodyElement,new ListEntry())))),new ListEntry()));
		superListMapClass = new ClassEntry("misc","Map",null,null,new ListEntry(),new ListEntry(),new ListEntry());
		superListClass = Generators.general.init(new ClassEntry("misc","List",null,null,new ListEntry(),new ListEntry(),new ListEntry(superListMapClass)));
		ListEntry listImportList = (ListEntry)superListClass.getImportList();
		listImportList.add(new TabEntry(0,new ListEntry(new ElementEntry(GeneralGenerator.importStdPackageElement,new ListEntry(new StringEntry("java.util"),new StringEntry("Arrays"))))));
		Generators.general.addFile(miscDirectory,"Int.java",intClass.get("COMPLETE"));
		Generators.general.addFile(miscDirectory,"Range.java",rangeClass.get("COMPLETE"));
		Generators.general.addFile(miscDirectory,"List.java",superListClass.get("COMPLETE"));
	}
	public Entry generateTypeName(IToken typeName){
		StringBuilder nameBuilder = new StringBuilder();
		ListEntry name = new ListEntry();
		name.setDelimiter(".");
		List<IToken> elementTypeName = typeName.getAll("typeName");
		if(elementTypeName != null){
			for(IToken element:elementTypeName){
				name.add(new StringEntry(Generator.camelize(element.getString())));
			}
		}
		name.get(nameBuilder);
		return new StringEntry(nameBuilder.toString());
	}
	public Entry generateBodyElement(IToken bodyElement,IContext context){
		Integer tabs = (Integer)context.getTab();
		for(IToken.Key elementKey:bodyElement.keySet()){
			if("statement".equals(elementKey.getName())){
				IToken element = bodyElement.get(elementKey);
				return new BodyLineEntry(generateStatement(element,context),context);
			}
			else if("return_statement".equals(elementKey.getName())){
				IToken element = bodyElement.get(elementKey);
				return new BodyReturnEntry(generateStatement(element,context),context);
			}
			else if("acquisition".equals(elementKey.getName())){
				IToken element = bodyElement.get(elementKey);
				IBodyStatement subject = (IBodyStatement)Generators.general.generateVariableCall(element.get("variable_call"),context);
				List<IToken> atomAcquisition = element.getAll("acquisition");
				if(atomAcquisition != null){
					for(IToken atom:atomAcquisition){
						return new BodyLineEntry(generateAcquisition(atom,true,subject,context),context);
					}
				}
			}
			else if("imposition".equals(elementKey.getName())){
				IToken element = bodyElement.get(elementKey);
				IBodyStatement subject = (IBodyStatement)Generators.general.generateVariableCall(element.get("variable_call"),context);
				List<IToken> atomImposition = element.getAll("imposition");
				if(atomImposition != null){
					for(IToken atom:atomImposition){
						if((atom.get("IMPOSE") != null || atom.get("PLUS") != null)){
							return new BodyLineEntry(Generators.entities.generateImposition(atom,true,subject),context);
						}
						else {
							return new BodyLineEntry(Generators.entities.generateImposition(atom,false,subject),context);
						}
					}
				}
			}
			else if("variable_declaration".equals(elementKey.getName())){
				IToken element = bodyElement.get(elementKey);
				return new BodyLineEntry(generateVariableDeclaration(element,context),context);
			}
			else if("if_statement".equals(elementKey.getName())){
				IToken element = bodyElement.get(elementKey);
				return generateIfStatement(element,context);
			}
		}
		return null;
	}
	public Entry generateVariableDeclaration(IToken variableDeclaration,IContext context){
		StringEntry typeName = (StringEntry)Generators.general.generateTypeName(variableDeclaration.get("type_name"));
		if((!types.containsKey(typeName.toString()))){
			throw new UnableToGenerateException("Could not find type:"+typeName.toString()+"!",variableDeclaration);
		}
		VariableEntry newVariable = new VariableEntry(variableDeclaration.get("variableName").getString(),typeName.toString());
		context.addVariable(new VariableEntry(newVariable));
		newVariable.setMode(VariableEntry.WITH_TYPE);
		Entry assignment = new ElementEntry(GeneralGenerator.exactElement,new ListEntry(new StringEntry("null")));
		List<IToken> elementStatement = variableDeclaration.getAll("statement");
		if(elementStatement != null){
			for(IToken element:elementStatement){
				assignment = generateStatement(element,context);
			}
		}
		return new BodyDecVarEntry(newVariable,assignment);
	}
	public Entry generateIfStatement(IToken ifStatement,IContext ifContext){
		IBodyStatement header = (IBodyStatement)null;
		ListEntry elseStatements = new ListEntry();
		elseStatements.setDelimiter("");
		Integer tabs = (Integer)ifContext.getTab();
		NamelessContextEntry subContext = new NamelessContextEntry(ifContext);
		BodyLinesEntry ret = new BodyLinesEntry(ifContext);
		BodyLinesEntry body = new BodyLinesEntry(subContext);
		for(IToken.Key elementKey:ifStatement.keySet()){
			if("boolean_statement".equals(elementKey.getName())){
				IToken element = ifStatement.get(elementKey);
				header = (IBodyStatement)generateBooleanStatement(element,ifContext);
				ret.addLine(new BodyConditionalEntry("if",header,body,ifContext));
			}
			else if("body_element".equals(elementKey.getName())){
				IToken element = ifStatement.get(elementKey);
				body.addLine((IBodyElement)generateBodyElement(element,subContext));
			}
			else if("else_statement".equals(elementKey.getName())){
				IToken element = ifStatement.get(elementKey);
				NamelessContextEntry elseContext = new NamelessContextEntry(ifContext);
				IBodyStatement elseHeader = (IBodyStatement)null;
				BodyLinesEntry elseBody = new BodyLinesEntry(elseContext);
				String elseName = "else";
				for(IToken.Key atomKey:element.keySet()){
					if("body_element".equals(atomKey.getName())){
						IToken atom = element.get(atomKey);
						elseBody.addLine((IBodyElement)generateBodyElement(atom,elseContext));
					}
					else if("boolean_statement".equals(atomKey.getName())){
						IToken atom = element.get(atomKey);
						elseHeader = (IBodyStatement)generateBooleanStatement(atom,ifContext);
						elseName = "else if";
					}
				}
				ret.addLine(new BodyConditionalEntry(elseName,elseHeader,elseBody,ifContext));
			}
		}
		return ret;
	}
	public Entry generateBooleanStatement(IToken booleanStatement,IContext context){
		BodyOperatorEntry ret = (BodyOperatorEntry)null;
		for(IToken.Key elementKey:booleanStatement.keySet()){
			if("has_chance".equals(elementKey.getName())){
				IToken element = booleanStatement.get(elementKey);
				if((ret == null)){
					ret = (BodyOperatorEntry)generateChance(element);
				}
				else {
					ret.setRight(generateChance(element));
				}
			}
			else if("has_statement".equals(elementKey.getName())){
				IToken element = booleanStatement.get(elementKey);
				IBodyStatement variableCall = (IBodyStatement)null;
				IBodyStatement hasCall = (IBodyStatement)null;
				List<IToken> atomVariableCall = element.getAll("variable_call");
				if(atomVariableCall != null){
					for(IToken atom:atomVariableCall){
						variableCall = (IBodyStatement)generateVariableCall(atom,context);
					}
				}
				List<IToken> atomRequirement = element.getAll("requirement");
				if(atomRequirement != null){
					for(IToken atom:atomRequirement){
						hasCall = (IBodyStatement)generateRequirement(atom,variableCall,true);
					}
				}
				if((element.get("NOT") != null)){
					hasCall = new BodyNegateEntry(hasCall);
				}
				if((ret == null)){
					ret = new BodyOperatorEntry(hasCall);
				}
				else {
					ret.setRight(hasCall);
				}
			}
			else if("statement".equals(elementKey.getName())){
				IToken element = booleanStatement.get(elementKey);
				if((ret == null)){
					ret = new BodyOperatorEntry(generateStatement(element,context));
				}
				else {
					ret.setRight(generateStatement(element,context));
				}
			}
			else if("operator".equals(elementKey.getName())){
				IToken element = booleanStatement.get(elementKey);
				if((element.getString().equals("&"))){
					ret = new BodyOperatorEntry(ret,"&&");
				}
				else {
					if((element.getString().equals("|"))){
						ret = new BodyOperatorEntry(ret,"||");
					}
				}
			}
		}
		return ret;
	}
	public Entry generateRequirement(IToken requirement,IBodyStatement candidate,Boolean showAsTrue){
		BodyOperatorEntry requireHeader = (BodyOperatorEntry)null;
		String delimiter = "&&";
		if((showAsTrue == true)){
			delimiter = "||";
		}
		List<IToken> quantaRequireStat = requirement.getAll("require_stat");
		if(quantaRequireStat != null){
			for(IToken quanta:quantaRequireStat){
				String methodName = Generators.entities.statGetMethod(Generator.camelize(quanta.get("hero_stats").getString()));
				IBodyStatement innerHead = (IBodyStatement)this.helpNegate(quanta.get("NOT"),showAsTrue,new BodyOperatorEntry(new BodyMetCalEntry(new BodyMetCalEntry(candidate,new StringEntry(methodName),new ListEntry()),new StringEntry("getValue"),new ListEntry()),quanta.get("ORDINAL").getString(),new BodyExactEntry(new StringEntry(quanta.get("INTEGER").getString()))));
				if((requireHeader == null)){
					requireHeader = new BodyOperatorEntry(innerHead);
				}
				else {
					requireHeader = new BodyOperatorEntry(requireHeader,delimiter,innerHead);
				}
			}
		}
		List<IToken> quantaRequireTrait = requirement.getAll("require_trait");
		if(quantaRequireTrait != null){
			for(IToken quanta:quantaRequireTrait){
				IBodyStatement id = (IBodyStatement)Generators.traits.id(Generator.camelize(quanta.get("trait_names").getString()));
				IBodyStatement innerHead = (IBodyStatement)this.helpNegate(quanta.get("NOT"),showAsTrue,new BodyMetCalEntry(candidate,new StringEntry("has"),new ListEntry(id)));
				if((requireHeader == null)){
					requireHeader = new BodyOperatorEntry(innerHead);
				}
				else {
					requireHeader = new BodyOperatorEntry(requireHeader,delimiter,innerHead);
				}
			}
		}
		List<IToken> quantaRequireAttack = requirement.getAll("require_attack");
		if(quantaRequireAttack != null){
			for(IToken quanta:quantaRequireAttack){
				IBodyStatement id = (IBodyStatement)Generators.attacks.id(Generator.camelize(quanta.get("attack_names").getString()));
				IBodyStatement innerHead = (IBodyStatement)this.helpNegate(quanta.get("NOT"),showAsTrue,new BodyMetCalEntry(candidate,new StringEntry("has"),new ListEntry(id)));
				if((requireHeader == null)){
					requireHeader = new BodyOperatorEntry(innerHead);
				}
				else {
					requireHeader = new BodyOperatorEntry(requireHeader,delimiter,innerHead);
				}
			}
		}
		return requireHeader;
	}
	public IBodyStatement helpNegate(IToken notToken,Boolean showAsTrue,IBodyStatement statement){
		if((notToken == null)){
			if((showAsTrue == true)){
				return (IBodyStatement)statement;
			}
			else {
				return (IBodyStatement)new BodyNegateEntry(statement);
			}
		}
		else {
			if((showAsTrue == true)){
				return (IBodyStatement)new BodyNegateEntry(statement);
			}
			else {
				return (IBodyStatement)statement;
			}
		}
	}
	public Entry generateStatement(IToken statement,IContext context){
		BodyOperatorEntry ret = (BodyOperatorEntry)null;
		Boolean negate = false;
		for(IToken.Key elementKey:statement.keySet()){
			if("NOT".equals(elementKey.getName())){
				IToken element = statement.get(elementKey);
				negate = true;
			}
			else if("variable_call".equals(elementKey.getName())){
				IToken element = statement.get(elementKey);
				if((ret == null)){
					if((negate == true)){
						ret = new BodyOperatorEntry(new BodyNegateEntry(generateVariableCall(element,context)));
					}
					else {
						ret = new BodyOperatorEntry(generateVariableCall(element,context));
					}
				}
				else {
					if((negate == true)){
						ret.setRight(new BodyNegateEntry(generateVariableCall(element,context)));
					}
					else {
						ret.setRight(generateVariableCall(element,context));
					}
				}
				negate = false;
			}
			else if("statement".equals(elementKey.getName())){
				IToken element = statement.get(elementKey);
				if((ret == null)){
					ret = (BodyOperatorEntry)generateStatement(element,context);
				}
				else {
					ret.setRight(generateStatement(element,context));
				}
			}
			else if("operator".equals(elementKey.getName())){
				IToken element = statement.get(elementKey);
				ret = new BodyOperatorEntry(ret,element.getString());
			}
			else if("braced".equals(elementKey.getName())){
				IToken element = statement.get(elementKey);
				if((ret == null)){
					if((negate == true)){
						ret = new BodyOperatorEntry(new BodyNegateEntry(generateStatement(element,context)));
					}
					else {
						ret = new BodyOperatorEntry(new BodyBracedEntry(generateStatement(element,context)));
					}
				}
				else {
					if((negate == true)){
						ret.setRight(new BodyNegateEntry(new BodyNegateEntry(generateStatement(element,context))));
					}
					else {
						ret.setRight(new BodyNegateEntry(new BodyBracedEntry(generateStatement(element,context))));
					}
				}
				negate = false;
			}
		}
		return ret;
	}
	public Entry generateVariableCall(IToken variableCall,IContext context){
		IContext currentContext = context;
		IBodyStatement ret = (IBodyStatement)null;
		VariableEntry lastVariable = (VariableEntry)null;
		for(IToken.Key elementKey:variableCall.keySet()){
			if("range".equals(elementKey.getName())){
				IToken element = variableCall.get(elementKey);
				ret = new BodyNewObjEntry(Generators.general.get("Range"),new ListEntry(new BodyExactEntry(new StringEntry(element.get("left").getString())),new BodyExactEntry(new StringEntry(element.get("right").getString()))));
			}
			else if("exact".equals(elementKey.getName())){
				IToken element = variableCall.get(elementKey);
				ret = new BodyExactEntry(new StringEntry(element.getString()));
			}
			else if("quote".equals(elementKey.getName())){
				IToken element = variableCall.get(elementKey);
				ret = new BodyExactEntry(new QuoteEntry(element.getString()));
			}
			else if("variableName".equals(elementKey.getName())){
				IToken element = variableCall.get(elementKey);
				VariableEntry contextVariable = (VariableEntry)currentContext.getVariable(element.getString());
				if((contextVariable != null)){
					currentContext = contextVariable.getType();
				}
				else {
					throw new UnableToGenerateException("Could not find "+element.getString()+" variable in context",variableCall);
				}
				lastVariable = new VariableEntry(contextVariable);
				if((ret == null)){
					ret = new BodyExactEntry(lastVariable.get("SIMPLE"));
				}
				else {
					ret = new BodyMetCalEntry(ret,lastVariable.get("SHOW_AS_GET"),new ListEntry());
				}
			}
			else if("method".equals(elementKey.getName())){
				IToken element = variableCall.get(elementKey);
				String methodName = null;
				ListEntry parameters = new ListEntry();
				for(IToken.Key atomKey:element.keySet()){
					if("methodName".equals(atomKey.getName())){
						IToken atom = element.get(atomKey);
						methodName = atom.getString();
					}
					else if("type_name".equals(atomKey.getName())){
						IToken atom = element.get(atomKey);
						StringEntry typeName = (StringEntry)generateTypeName(atom);
						methodName = typeName.toString();
					}
					else if("statement".equals(atomKey.getName())){
						IToken atom = element.get(atomKey);
						parameters.add(generateStatement(atom,context));
					}
				}
				if((element.get("NEW") != null)){
					if((types.containsKey(methodName.toString()))){
						currentContext = Generators.general.getType(methodName.toString());
						lastVariable = null;
					}
					else {
						throw new UnableToGenerateException("Could not find "+methodName.toString()+" constructor",variableCall);
					}
					ret = new BodyNewObjEntry(Generators.general.get(methodName),parameters);
				}
				else {
					VariableEntry contextMethod = (VariableEntry)currentContext.getMethodHeader(methodName.toString());
					if((contextMethod != null)){
						currentContext = contextMethod.getType();
						lastVariable = new VariableEntry(contextMethod);
					}
					else {
						throw new UnableToGenerateException("Could not find "+methodName.toString()+" method in context",variableCall);
					}
					if((ret == null)){
						ret = new BodyMetCalEntry(lastVariable.get("SIMPLE"),parameters);
					}
					else {
						ret = new BodyMetCalEntry(ret,lastVariable.get("SIMPLE"),parameters);
					}
				}
			}
		}
		if((lastVariable != null)){
			if((lastVariable.hasEnder())){
				ret = new BodyMetCalEntry(ret,lastVariable.get("SHOW_AS_END"),new ListEntry());
			}
		}
		return ret;
	}
	public Entry generateAcquisition(IToken acquisition,Boolean forGainBody,IBodyStatement subject,IContext context){
		VariableEntry source = (VariableEntry)null;
		if((acquisition.get("source_name") != null)){
			source = context.getVariable(acquisition.get("source_name").getString());
			if((source == null)){
				throw new UnableToGenerateException("Could not find "+acquisition.get("source_name").getString()+" in context!",acquisition);
			}
		}
		else {
			source = new VariableEntry("this","Trait");
		}
		Entry gainObj = (Entry)null;
		Entry id = (Entry)null;
		if((acquisition.get("THIS") != null)){
			gainObj = new BodyMetCalEntry(new BodyExactEntry(new StringEntry("this")),new StringEntry("clone"),new ListEntry());
			id = new BodyMetCalEntry(new BodyExactEntry(new StringEntry("this")),new StringEntry("getId"),new ListEntry());
		}
		if((acquisition.get("aspect_names") != null)){
			String className = Generators.general.buildString("Aspects.",Generator.camelize(acquisition.get("aspect_names").getString()));
			gainObj = new BodyNewObjEntry(Generators.general.get(className),new ListEntry());
			id = Generators.aspects.id(Generator.camelize(acquisition.get("aspect_names").getString()));
		}
		if((acquisition.get("trait_names") != null)){
			String className = Generators.general.buildString("Traits.",Generator.camelize(acquisition.get("trait_names").getString()));
			gainObj = new BodyNewObjEntry(Generators.general.get(className),new ListEntry());
			id = Generators.traits.id(Generator.camelize(acquisition.get("trait_names").getString()));
		}
		if((acquisition.get("attack_names") != null)){
			String className = Generators.general.buildString("Attacks.",Generator.camelize(acquisition.get("attack_names").getString()));
			gainObj = new BodyNewObjEntry(Generators.general.get(className),new ListEntry());
			id = Generators.attacks.id(Generator.camelize(acquisition.get("attack_names").getString()));
		}
		if((acquisition.get("condition_names") != null)){
			String className = Generators.general.buildString("Conditions.",Generator.camelize(acquisition.get("condition_names").getString()));
			gainObj = new BodyNewObjEntry(Generators.general.get(className),new ListEntry());
			id = Generators.attacks.id(Generator.camelize(acquisition.get("condition_names").getString()));
		}
		if((acquisition.get("operator").get("GAINS") != null)){
			if((forGainBody == true)){
				return new BodyMetCalEntry(subject,new StringEntry("gain"),new ListEntry(gainObj,new BodyExactEntry(source)));
			}
			else {
				return new BodyMetCalEntry(subject,new StringEntry("lose"),new ListEntry(id,new BodyExactEntry(source)));
			}
		}
		else {
			if((forGainBody == true)){
				return new BodyMetCalEntry(subject,new StringEntry("lose"),new ListEntry(id,new BodyExactEntry(source)));
			}
			else {
				return new BodyMetCalEntry(subject,new StringEntry("gain"),new ListEntry(gainObj,new BodyExactEntry(source)));
			}
		}
	}
	public Entry generateRange(IToken range){
		String left = (String)null;
		String right = (String)null;
		if((range.get("percent") != null)){
			left = Generators.general.percentify(range.get("left").getString());
			right = Generators.general.percentify(range.get("right").getString());
		}
		else {
			left = range.get("left").getString();
			right = range.get("right").getString();
		}
		String leftPercent = Generators.general.buildString(left,"f");
		String rightPercent = Generators.general.buildString(right,"f");
		return new BodyNewObjEntry(Generators.general.get("Range"),new ListEntry(new BodyExactEntry(new StringEntry(leftPercent)),new BodyExactEntry(new StringEntry(rightPercent))));
	}
	public ClassEntry getType(String type){
		if((types.containsKey(type))){
			return (ClassEntry)types.get(type);
		}
		else {
			types.put(type,new ClassEntry(type));
			types.get(type).addVariable(new VariableEntry("this",type));
			return (ClassEntry)types.get(type);
		}
	}
	public Entry generateChance(IToken chance){
		Double value = (Double)Double.parseDouble(chance.getString());
		value = value / 100;
		return new BodyOperatorEntry(new BodyExactEntry(new StringEntry("Math.random()")),"<=",new BodyExactEntry(new StringEntry(value.toString())));
	}
	public ClassEntry get(String type){
		return (ClassEntry)Generators.general.getType(type);
	}
	public void createList(ClassEntry list){
		String listName = list.getName();
		if((declaredListSet.add(listName))){
			ClassEntry fullName = (ClassEntry)list.get("NAME_WITH_IMPORTS");
			ClassEntry listClass = (ClassEntry)new ClassEntry("java.util","ArrayList",new ListEntry(fullName));
			superListClass.addSubClass(new ClassEntry("misc",list,listClass,null,new ListEntry(),new ListEntry(new MethodEntry(listName,"",new ListEntry(new VariableEntry("...initialElements",fullName)),new ListEntry(new ElementEntry(GeneralGenerator.listConstructorBodyElement,new ListEntry())))),new ListEntry()));
		}
	}
	public ClassEntry createListMap(ClassEntry left,ClassEntry right){
		String rightName = Generators.general.buildString("_",right.getName());
		String fullName = Generators.general.buildString("Map.",left.getName(),".",rightName);
		if((declaredListSet.add(fullName))){
			ClassEntry fullLeft = (ClassEntry)left.get("NAME_WITH_IMPORTS");
			ClassEntry fullRight = (ClassEntry)right.get("NAME_WITH_IMPORTS");
			ClassEntry listClass = (ClassEntry)new ClassEntry("java.util","LinkedList",new ListEntry(fullRight));
			ClassEntry hashMapClass = (ClassEntry)new ClassEntry("java.util","HashMap",new ListEntry(fullLeft,listClass));
			superListMapClass.addSubClass(new ClassEntry("misc",left,null,null,new ListEntry(),new ListEntry(),new ListEntry()));
			HashMap<String,ClassEntry> mapSubClasses = (HashMap<String,ClassEntry>)superListMapClass.getSubClasses();
			ClassEntry leftClass = (ClassEntry)mapSubClasses.get(left.getName());
			leftClass.addSubClass(new ClassEntry("misc",rightName,hashMapClass,new ListEntry(),new ListEntry(new VariableEntry("complete",listClass)),new ListEntry(new MethodEntry("getFrom",listClass,new ListEntry(new VariableEntry("key",fullLeft)),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("super.get(key)"))))),new MethodEntry("add","void",new ListEntry(new VariableEntry("key",fullLeft),new VariableEntry("element",fullRight)),new ListEntry(new ElementEntry(GeneralGenerator.mapClassAddBodyElement,new ListEntry(listClass)))),new MethodEntry("removeLast","void",new ListEntry(new VariableEntry("key",fullLeft)),new ListEntry(new ElementEntry(GeneralGenerator.mapClassRemoveLastBodyElement,new ListEntry()))),new MethodEntry("removeAll","void",new ListEntry(new VariableEntry("key",fullLeft)),new ListEntry(new ElementEntry(GeneralGenerator.mapClassRemoveAllBodyElement,new ListEntry(listClass)))),new MethodEntry("remove","void",new ListEntry(new VariableEntry("key",fullLeft),new VariableEntry("element",fullRight)),new ListEntry(new ElementEntry(GeneralGenerator.mapClassRemoveBodyElement,new ListEntry()))),new MethodEntry("getAll",listClass,new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("complete")))))),new ListEntry()));
		}
		return (ClassEntry)Generators.general.getType(Generators.general.buildString("List.",fullName));
	}
	public ClassEntry init(ClassEntry iClass){
		ClassEntry knownClass = (ClassEntry)Generators.general.getType(iClass.getJustCompleteName());
		knownClass.copy(iClass);
		return knownClass;
	}
	public String percentify(String input){
		Double d = (Double)Double.parseDouble(input);
		Double result = (Double)d / 100;
		return (String)result.toString();
	}

	public HashMap<String,ClassEntry> getTypes(){
		return types;
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public File getMiscDirectory(){
		return miscDirectory;
	}

	public ListEntry getDeclaredListClasses(){
		return declaredListClasses;
	}

	public HashMap<String,ListEntry> getMapOfListMapClasses(){
		return mapOfListMapClasses;
	}

	public ListEntry getDeclaredListMapClasses(){
		return declaredListMapClasses;
	}

	public HashSet<String> getDeclaredListSet(){
		return declaredListSet;
	}

	public ClassEntry getSuperListClass(){
		return superListClass;
	}

	public ClassEntry getSuperListMapClass(){
		return superListMapClass;
	}

	public String getName(){
		return "General";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}