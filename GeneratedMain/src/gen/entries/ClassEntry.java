package gen.entries;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import gen.*;
import gen.checks.*;
import gen.properties.*;
import lists.*;

public class ClassEntry implements Entry,IContext {
	public ClassEntry getSelf(){
		return this;
	}

	public static final Integer NAME = 0;
	public static final Integer NAME_WITH_IMPORTS = 1;
	public static final Integer COMPLETE_NAME = 2;
	public static final Integer COMPLETE = 3;
	public static final Integer INTERFACE = 4;

	private HashMap<String,VariableEntry> variables = new HashMap<String,VariableEntry>();
	private HashMap<String,VariableEntry> methodHeaders = new HashMap<String,VariableEntry>();
	private HashMap<String,MethodEntry> methods = new HashMap<String,MethodEntry>();
	private IContext parent = (IContext)null;
	private Integer tab = 0;
	private String name = null;
	private Integer mode = NAME;
	private ImportEntry importPackage = null;
	private ListEntry importList = new SetEntry();
	private Entry nameWithTemps = null;
	private ListEntry templateParameters = null;
	private ListEntry parentClasses = null;
	private ClassEntry parentClass = null;
	private ListEntry completeName = new ListEntry();
	private ListEntry variableList = new ListEntry();
	private ListEntry methodList = new ListEntry();
	private BodyLinesEntry constructorBody = null;
	private ListEntry constructorParameters = new ListEntry();
	private ListEntry constructorAssignments = new ListEntry();
	private ListEntry subClassList = new ListEntry();
	private BodyEntryEntry defaultAssignment = new BodyEntryEntry(null);
	private BodyEntryEntry defaultEnder = new BodyEntryEntry(null);
	private HashMap<String,ClassEntry> subClasses = new HashMap<String,ClassEntry>();
	private HashMap<String,BodyLinesEntry> methodBodies = new HashMap<String,BodyLinesEntry>();
	private ListEntry surroundClass = new ListEntry();
	private Boolean isInited = false;

	public ClassEntry(String iName){
		name = iName;
		importPackage = new ImportEntry("java.lang",name);
		completeName.add(new StringEntry(name));
	}
	public ClassEntry(ClassEntry iClone){
		this.copy(iClone);
	}
	public ClassEntry(String iPackageName,String iName,ListEntry iTemplateParameters){
		this.init(iPackageName,iName,iTemplateParameters,null,null,new ListEntry(),new ListEntry(),new ListEntry());
	}
	public ClassEntry(String iPackageName,ClassEntry iName,ClassEntry iParentClass,ListEntry iInterfaces,ListEntry iVariables,ListEntry iMethods,ListEntry iSubClasses){
		String sName = iName.getName();
		this.init(iPackageName,sName,null,iParentClass,iInterfaces,iVariables,iMethods,iSubClasses);
	}
	public ClassEntry(String iPackageName,String iName,ClassEntry iParentClass,ListEntry iInterfaces,ListEntry iVariables,ListEntry iMethods,ListEntry iSubClasses){
		this.init(iPackageName,iName,null,iParentClass,iInterfaces,iVariables,iMethods,iSubClasses);
	}

	public HashMap<String,VariableEntry> getVariables(){
		return variables;
	}
	public HashMap<String,VariableEntry> getMethodHeaders(){
		return methodHeaders;
	}
	public HashMap<String,MethodEntry> getMethods(){
		return methods;
	}
	public IContext getParent(){
		return parent;
	}
	public Integer getTab(){
		return tab;
	}
	public VariableEntry getVariable(String variableName) {
		if((variables.containsKey(variableName))){
			return variables.get(variableName);
		}
		else {
			if((parent != null)){
				return parent.getVariable(variableName);
			}
			else {
				return null;
			}
		}
	}
	public void addVariable(VariableEntry v){
		ClassEntry self = (ClassEntry)this.getSelf();
		String vName = v.getName();
		ClassEntry vType = (ClassEntry)v.getType();
		variables.put(vName,v);
		if((!v.getIsHidden())){
			VariableEntry declarationVariable = (VariableEntry)v.get("SHOW_COMPLETE_TYPE").get("DECLARATION");
			declarationVariable.setAccessIfNot(VariableEntry.PUBLIC,VariableEntry.PROTECTED);
			variableList.add(new BodyLineEntry(new BodyDecVarEntry(declarationVariable),self));
			importList.add(vType.getImportPackage());
			if((!v.isStatic())){
				if((!v.isFinal())){
					constructorParameters.add(v.get("AS_PARAMETER").get("SHOW_COMPLETE_TYPE"));
					constructorAssignments.add(new BodyLineEntry(new BodyOperatorEntry(v.get("SIMPLE"),"=",v.get("AS_PARAMETER")),self));
				}
			}
			String getMethodName = Generators.general.buildString("get",Generator.camelize(vName.toString()));
			this.addMethod(new MethodEntry(getMethodName,vType,new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry(vName))))));
		}
	}
	public MethodEntry getMethod(String methodName) {
		if((methods.containsKey(methodName))){
			return methods.get(methodName);
		}
		else {
			if((parent != null)){
				return parent.getMethod(methodName);
			}
			else {
				return null;
			}
		}
	}
	public VariableEntry getMethodHeader(String methodName) {
		if((methodHeaders.containsKey(methodName))){
			return methodHeaders.get(methodName);
		}
		else {
			if((parent != null)){
				return parent.getMethodHeader(methodName);
			}
			else {
				return null;
			}
		}
	}
	public void addMethod(MethodEntry m){
		String methodName = m.getName();
		if((!methods.containsKey(methodName))){
			ClassEntry self = (ClassEntry)this.getSelf();
			methodHeaders.put(methodName,m.getHeader());
			BodyLinesEntry methodBody = new BodyLinesEntry(new ListEntry(),self);
			m.setParent(self);
			methodBodies.put(methodName,methodBody);
			ClassEntry methodType = (ClassEntry)m.getType();
			ListEntry methodParameters = (ListEntry)m.getParameters();
			importList.add(methodType.getImportPackage());
			for(Entry param:methodParameters){
				VariableEntry p = (VariableEntry)param;
				ClassEntry pType = (ClassEntry)p.getType();
				importList.add(pType.getImportPackage());
			}
			MethodEntry realMethod = new MethodEntry(methodName,methodType,methodParameters,methodBody);
			realMethod.setMode(m.getMode());
			methodList.add(new BodyLinesEntry(new ListEntry(new BodyExactEntry(realMethod)),new NamelessContextEntry(self)));
			realMethod.setParent(self);
		}
		BodyLinesEntry methodBody = (BodyLinesEntry)methodBodies.get(methodName);
		methodBody.addAll(m.getBody());
	}
	public void addMethodHeader(VariableEntry header) {
		methodHeaders.put(header.getName(),header);
	}
	public void setup(IContext initialParent) {
		parent = initialParent;
		if((parent != null)){
			tab = parent.getTab();
			tab = tab + 1;
		}
	}
	public void setParent(IContext newParent) {
		parent = newParent;
		if((parent != null)){
			tab = parent.getTab();
			tab = tab + 1;
		}
	}
	public void incrementTab(Integer amount) {
		tab = tab + amount;
	}
	public void decrementTab(Integer amount) {
		tab = tab - amount;
	}
	public String getName(){
		return name;
	}
	public Integer getMode(){
		return mode;
	}	public ImportEntry getImportPackage(){
		return importPackage;
	}	public ListEntry getImportList(){
		return importList;
	}	public Entry getNameWithTemps(){
		return nameWithTemps;
	}	public ListEntry getTemplateParameters(){
		return templateParameters;
	}	public ListEntry getParentClasses(){
		return parentClasses;
	}	public ClassEntry getParentClass(){
		return parentClass;
	}	public ListEntry getCompleteName(){
		return completeName;
	}	public ListEntry getVariableList(){
		return variableList;
	}	public ListEntry getMethodList(){
		return methodList;
	}	public BodyLinesEntry getConstructorBody(){
		return constructorBody;
	}	public ListEntry getConstructorParameters(){
		return constructorParameters;
	}	public ListEntry getConstructorAssignments(){
		return constructorAssignments;
	}	public ListEntry getSubClassList(){
		return subClassList;
	}
	public BodyEntryEntry getDefaultAssignment(){
		return defaultAssignment;
	}
	public BodyEntryEntry getDefaultEnder(){
		return defaultEnder;
	}
	public HashMap<String,ClassEntry> getSubClasses(){
		return subClasses;
	}
	public HashMap<String,BodyLinesEntry> getMethodBodies(){
		return methodBodies;
	}	public ListEntry getSurroundClass(){
		return surroundClass;
	}
	public Boolean getIsInited(){
		return isInited;
	}
	public void init(String iPackageName,String iName,ListEntry iTemplateParameters,ClassEntry iParentClass,ListEntry iInterfaces,ListEntry iVariables,ListEntry iMethods,ListEntry iSubClasses){
		ClassEntry self = (ClassEntry)this.getSelf();
		importList.setDelimiter("");
		completeName.setDelimiter(".");
		variableList.setDelimiter("");
		methodList.setDelimiter("");
		constructorBody = new BodyLinesEntry(new ListEntry(),self);
		constructorAssignments.setDelimiter("");
		subClassList.setDelimiter("");
		isInited = true;
		name = iName;
		importPackage = new ImportEntry(iPackageName,name);
		completeName.clear();
		completeName.add(new StringEntry(name));
		if((iTemplateParameters != null && !iTemplateParameters.isEmpty())){
			templateParameters = iTemplateParameters;
		}
		parentClasses = new ListEntry();
		defaultAssignment.setValue(new BodyNewObjEntry(self,new ListEntry()));
		if((iParentClass != null || iInterfaces != null)){
			parentClasses.setDelimiter(" ");
			if((iParentClass != null)){
				Entry pccn = (Entry)iParentClass.get("COMPLETE_NAME");
				parentClass = iParentClass;
				parentClasses.add(new ElementEntry(GeneralGenerator.extendsElement,new ListEntry(pccn)));
				this.setDefaultEnder(iParentClass.getDefaultEnder());
				importList.add(iParentClass.getImportPackage());
				importList.add(iParentClass.getImportList());
			}
			if((iInterfaces != null && !iInterfaces.isEmpty())){
				ListEntry interfaces = new ListEntry();
				parentClasses.add(new ElementEntry(GeneralGenerator.implementsElement,new ListEntry(interfaces)));
				for(Entry ent:iInterfaces){
					ClassEntry i = (ClassEntry)ent;
					interfaces.add(i.get("COMPLETE_NAME"));
					importList.add(i.getImportPackage());
					importList.add(i.getImportList());
				}
			}
		}
		for(Entry ent:iVariables){
			VariableEntry v = (VariableEntry)ent;
			this.addVariable(v);
		}
		for(Entry ent:iMethods){
			MethodEntry m = (MethodEntry)ent;
			this.addMethod(m);
		}
		for(Entry ent:iSubClasses){
			ClassEntry sc = (ClassEntry)ent;
			this.addSubClass(sc);
		}
		VariableEntry selfVariable = new VariableEntry("this",self);
		selfVariable.setIsHidden(true);
		this.addVariable(selfVariable);
	}
	public void copy(ClassEntry iClone){
		name = iClone.getName();
		completeName = iClone.getCompleteName();
		if((importPackage == null)){
			importPackage = new ImportEntry("java.lang",name);
		}
		importPackage.setSuperPackage(iClone.getImportPackage());
		surroundClass = iClone.getSurroundClass();
		if((isInited == false)){
			this.setDefaultAssignment(iClone.getDefaultAssignment());
			defaultEnder = iClone.getDefaultEnder();
			variables = iClone.getVariables();
			methods = iClone.getMethods();
			methodHeaders = iClone.getMethodHeaders();
			parentClasses = iClone.getParentClasses();
			parentClass = iClone.getParentClass();
			importList = iClone.getImportList();
			variableList = iClone.getVariableList();
			methodList = iClone.getMethodList();
			constructorBody = iClone.getConstructorBody();
			constructorParameters = iClone.getConstructorParameters();
			constructorAssignments = iClone.getConstructorAssignments();
			subClassList = iClone.getSubClassList();
			subClasses = iClone.getSubClasses();
			templateParameters = iClone.getTemplateParameters();
			isInited = true;
		}
	}
	public void addSubClass(ClassEntry sc){
		String className = sc.getFullName();
		if((!subClasses.containsKey(className))){
			subClasses.put(className,sc);
			importList.add(sc.getImportList());
			ClassEntry completeClass = (ClassEntry)sc.get("COMPLETE");
			ClassEntry self = (ClassEntry)this.getSelf();
			subClassList.add(new BodyLinesEntry(new ListEntry(new BodyExactEntry(completeClass)),self));
			sc.setSuperClass(this.getSelf());
		}
	}
	public void addSubInterface(ClassEntry sc){
		String className = sc.getFullName();
		if((!subClasses.containsKey(className))){
			subClasses.put(className,sc);
			importList.add(sc.getImportList());
			ClassEntry completeClass = (ClassEntry)sc.get("INTERFACE");
			ClassEntry self = (ClassEntry)this.getSelf();
			subClassList.add(new BodyLinesEntry(new ListEntry(new BodyExactEntry(completeClass)),self));
			sc.setSuperClass(this.getSelf());
			sc.setDefaultAssignment(new BodyExactEntry(new StringEntry("null")));
		}
	}
	public void addImport(String packageName,String className){
		importList.add(new ImportEntry(packageName,className));
	}
	public void setSuperClass(ClassEntry sc){
		surroundClass.clear();
		surroundClass.add(sc);
		importPackage.setSuperPackage(sc.getImportPackage());
		completeName.clear();
		completeName.add(sc.getCompleteName());
		completeName.add(name);
		ClassEntry self = (ClassEntry)this.getSelf();
		Generators.general.init(self);
	}
	public void setDefaultAssignment(IBodyStatement newAssignment){
		defaultAssignment.setValue(newAssignment);
	}
	public void setDefaultEnder(IBodyStatement newAssignment){
		defaultEnder.setValue(newAssignment);
	}
	public void addToConstructor(IBodyElement be){
		ClassEntry self = (ClassEntry)this.getSelf();
		be.setParentContext(self);
		constructorBody.addLine(be);
	}
	public void addToConstructor(IBodyStatement be){
		constructorBody.addLine(be);
	}
	public String getJustCompleteName(){
		StringBuilder nameBuilder = new StringBuilder();
		completeName.get(nameBuilder);
		return nameBuilder.toString();
	}
	public String getFullName(){
		StringBuilder nameBuilder = new StringBuilder();
		completeName.get(nameBuilder);
		if((templateParameters != null && !templateParameters.isEmpty())){
			nameBuilder.append("<");
			templateParameters.get(nameBuilder);
			nameBuilder.append(">");
		}
		return nameBuilder.toString();
	}
	public void setMode(Integer newMode){
		mode = newMode;
	}
	public void deleteImportPackage(){
		importPackage.setName("");
	}
	public ClassEntry get(String option){
		if((option.equals("INTERFACE"))){
			this.setDefaultAssignment(new BodyExactEntry(new StringEntry("null")));
		}
		ClassEntry self = (ClassEntry)this.getSelf();
		ClassEntry ret = new ClassEntry(self);
		if((option.equals("WITHOUT_IMPORT"))){
			ret.deleteImportPackage();
			return ret;
		}
		if((option.equals("NAME"))){
			ret.setMode(NAME);
			return ret;
		}
		if((option.equals("NAME_WITH_IMPORTS"))){
			ret.setMode(NAME_WITH_IMPORTS);
			return ret;
		}
		if((option.equals("COMPLETE_NAME"))){
			if((mode == NAME_WITH_IMPORTS)){
				ret.setMode(NAME_WITH_IMPORTS);
			}
			else {
				ret.setMode(COMPLETE_NAME);
			}
			return ret;
		}
		if((option.equals("COMPLETE"))){
			ret.setMode(COMPLETE);
			return ret;
		}
		if((option.equals("INTERFACE"))){
			ret.setMode(INTERFACE);
			return ret;
		}
		return ret;
	}
	public void get(StringBuilder builder){
		if((templateParameters != null && !templateParameters.isEmpty())){
			nameWithTemps = (Entry)new ElementEntry(GeneralGenerator.nameWithTemplateParametersElement,new ListEntry(new StringEntry(name),templateParameters));
		}
		else {
			nameWithTemps = (Entry)new StringEntry(name);
		}
		if((mode == NAME)){
			new StringEntry(name).get(builder);
		}
		else if((mode == NAME_WITH_IMPORTS)){
			new ElementEntry(GeneralGenerator.asPackageNameElement,new ListEntry(importPackage.get("PLAIN"),new StringEntry(name))).get(builder);
		}
		else if((mode == COMPLETE_NAME)){
			completeName.get(builder);
		}
		else if((mode == INTERFACE && surroundClass.isEmpty())){
			new ElementEntry(GeneralGenerator.declareInterfaceElement,new ListEntry(importPackage.get("AS_PACKAGE"),importList,new StringEntry(name),methodList)).get(builder);
		}
		else if((mode == INTERFACE && !surroundClass.isEmpty())){
			new ElementEntry(GeneralGenerator.declareSubInterfaceElement,new ListEntry(new StringEntry(name),methodList)).get(builder);
		}
		else if((mode == COMPLETE && surroundClass.isEmpty() && !constructorParameters.isEmpty())){
			new ElementEntry(GeneralGenerator.declareCustomWithDefaultElement,new ListEntry(importPackage.get("AS_PACKAGE"),importList,nameWithTemps,parentClasses,variableList,new StringEntry(name),constructorBody,new StringEntry(name),constructorParameters,constructorAssignments,constructorBody,methodList,subClassList)).get(builder);
		}
		else if((mode == COMPLETE && !surroundClass.isEmpty() && !constructorParameters.isEmpty())){
			new ElementEntry(GeneralGenerator.declareCustomSubWithDefaultElement,new ListEntry(nameWithTemps,parentClasses,variableList,new StringEntry(name),constructorBody,new StringEntry(name),constructorParameters,constructorAssignments,constructorBody,methodList,subClassList)).get(builder);
		}
		else if((mode == COMPLETE && surroundClass.isEmpty() && constructorParameters.isEmpty())){
			new ElementEntry(GeneralGenerator.declareCustomElement,new ListEntry(importPackage.get("AS_PACKAGE"),importList,nameWithTemps,parentClasses,variableList,new StringEntry(name),constructorBody,methodList,subClassList)).get(builder);
		}
		else if((mode == COMPLETE && !surroundClass.isEmpty() && constructorParameters.isEmpty())){
			new ElementEntry(GeneralGenerator.declareCustomSubElement,new ListEntry(nameWithTemps,parentClasses,variableList,new StringEntry(name),constructorBody,methodList,subClassList)).get(builder);
		}
		if((templateParameters != null && !templateParameters.isEmpty() && mode == NAME)){
			new ElementEntry(GeneralGenerator.templateParametersElement,new ListEntry(templateParameters)).get(builder);
		}
		else if((templateParameters != null && !templateParameters.isEmpty() && mode == NAME_WITH_IMPORTS)){
			new ElementEntry(GeneralGenerator.templateParametersElement,new ListEntry(templateParameters)).get(builder);
		}
		else if((templateParameters != null && !templateParameters.isEmpty() && mode == COMPLETE_NAME)){
			new ElementEntry(GeneralGenerator.templateParametersElement,new ListEntry(templateParameters)).get(builder);
		}
	}
}