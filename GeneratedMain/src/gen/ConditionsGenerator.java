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

public class ConditionsGenerator extends Generator {

	private File directory = null;
	private HashMap<String,Set<String>> conditionMap = new HashMap<String,Set<String>>();
	private String packageName = null;
	private ClassEntry superConditionClass = (ClassEntry)null;
	private ClassEntry superConditionsClass = (ClassEntry)null;
	private ClassEntry idClass = (ClassEntry)null;
	private ListEntry createConditionBody = new ListEntry();


	public static final Element newConditionElement = new Element("newCondition",new String[]{"new Conditions.",/*Condition Name*/"()"});
	public static final Element conditionIdElement = new Element("conditionId",new String[]{"Conditions.",/*Condition Name*/".id"});
	public static final Element importPackageElement = new Element("importPackage",new String[]{"import ",/*Game Package*/".",/*Import Name*/".*;"});
	public static final Element declareConditionMemberElement = new Element("declareConditionMember",new String[]{"public static class ",/*Class Name*/" extends Condition {"+
			"\n		public static final Conditions.Id id = new Conditions.Id();"+
			"\n		public ",/*Class Name*/"(){"+
			"\n			super(",/*Name*/", ",/*Description*/");"+
			"\n		}",/*Methods*/""+
			"\n		public Conditions.Id getId(){"+
			"\n			return id;"+
			"\n		}"+
			"\n	}"});
	public static final Element declareConditionsElement = new Element("declareConditions",new String[]{"package ",/*Game Package*/".entities.items.conditions;",/*Imports*/""+
			"\npublic class Conditions {",/*Condition Classes*/"\n",/*Condition Create Method*/""+
			"\n	public static class Id {"+
			"\n	}"+
			"\n}"});
	public static final Element createConditionsMethodElement = new Element("createConditionsMethod",new String[]{"	public Condition create(String conditionName){",/*Ifs*/""+
			"\n		return null;"+
			"\n	}"});
	public static final Element createListIfElement = new Element("createListIf",new String[]{"if(",/*Condition Name*/".equals(conditionName)){"+
			"\n			return new Conditions.",/*Condition Class Name*/"();"+
			"\n		}"});
	public ConditionsGenerator(){
		addElement("newCondition",newConditionElement);
		addElement("conditionId",conditionIdElement);
		addElement("importPackage",importPackageElement);
		addElement("declareConditionMember",declareConditionMemberElement);
		addElement("declareConditions",declareConditionsElement);
		addElement("createConditionsMethod",createConditionsMethodElement);
		addElement("createListIf",createListIfElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/mods/conditions");
		directory.mkdirs();
		createConditionBody.setDelimiter("");
	}
	public void generate(ParseContext data){
		MethodEntry createConditionMethod = new MethodEntry("createCondition","Condition",new ListEntry(new VariableEntry("conditionName","String")),new ListEntry(createConditionBody,new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))));
		idClass = (ClassEntry)new ClassEntry("entities.mods.conditions","Id",null,null,new ListEntry(),new ListEntry(),new ListEntry());
		superConditionsClass = Generators.general.init(new ClassEntry("entities.mods.conditions","Conditions",null,null,new ListEntry(),new ListEntry(createConditionMethod.get("STATIC_COMPLETE")),new ListEntry(idClass)));
		superConditionClass = Generators.general.init(new ClassEntry("entities.mods.conditions","Condition",null,new ListEntry(Generators.general.get("Source")),new ListEntry(new VariableEntry("name","String"),new VariableEntry("description","String")),new ListEntry(),new ListEntry()));
		Generators.events.addEventMethods(superConditionClass,new ListEntry(),new ListEntry());
		superConditionClass.addMethod(new MethodEntry("getId",idClass,new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))));
		Generators.conditions.addFile(directory,"Condition.java",superConditionClass.get("COMPLETE"));
		Generators.conditions.addFile(directory,"Conditions.java",superConditionsClass.get("COMPLETE"));
	}
	public Entry generateCondition(IToken condition){
		String conditionName = Generator.camelize(condition.get("conditionName").getString());
		String conditionDescription = condition.get("description").getString();
		VariableEntry idVariable = new VariableEntry("id","Conditions.Id");
		ClassEntry conditionClass = new ClassEntry("entities.mods.conditions",conditionName,superConditionClass,new ListEntry(Generators.general.get("Source")),new ListEntry(idVariable.get("PUBLIC").get("STATIC_FINAL"),new VariableEntry("name","String"),new VariableEntry("description","String")),new ListEntry(),new ListEntry());
		superConditionsClass.addSubClass(conditionClass);
		ListEntry requirementsBody = new ListEntry();
		requirementsBody.setDelimiter("");
		ListEntry gainBody = new ListEntry();
		gainBody.setDelimiter("");
		ListEntry lossBody = new ListEntry();
		lossBody.setDelimiter("");
		ListEntry tickBody = new ListEntry();
		tickBody.setDelimiter("");
		BodyMetCalEntry eventHost = new BodyMetCalEntry(new BodyExactEntry(new StringEntry("event")),new StringEntry("getHost"),new ListEntry());
		BodyExactEntry candidate = new BodyExactEntry(new StringEntry("candidate"));
		List<IToken> energyRequirement = condition.getAll("requirement");
		if(energyRequirement != null){
			for(IToken energy:energyRequirement){
				IBodyStatement requireHeader = (IBodyStatement)Generators.general.generateRequirement(energy,candidate,false);
				requirementsBody.add(new BodyConditionalEntry("if",requireHeader,new ListEntry(new BodyReturnEntry(new BodyExactEntry(new StringEntry("false"))))));
			}
		}
		List<IToken> energyImposition = condition.getAll("imposition");
		if(energyImposition != null){
			for(IToken energy:energyImposition){
				gainBody.add(Generators.entities.generateImposition(energy,true,eventHost));
				lossBody.add(Generators.entities.generateImposition(energy,false,eventHost));
			}
		}
		IContext gainContext = (IContext)Generators.events.getEventContext("gain",conditionClass);
		IContext lossContext = (IContext)Generators.events.getEventContext("lose",conditionClass);
		IContext tickContext = (IContext)Generators.events.getEventContext("tick",conditionClass);
		List<IToken> energyAcquisition = condition.getAll("acquisition");
		if(energyAcquisition != null){
			for(IToken energy:energyAcquisition){
				gainBody.add(Generators.general.generateAcquisition(energy,true,eventHost,gainContext));
				lossBody.add(Generators.general.generateAcquisition(energy,false,eventHost,lossContext));
			}
		}
		List<IToken> elementAccumulation = condition.getAll("accumulation");
		if(elementAccumulation != null){
			for(IToken element:elementAccumulation){
				List<IToken> atomImposition = element.getAll("imposition");
				if(atomImposition != null){
					for(IToken atom:atomImposition){
						tickBody.add(Generators.entities.generateImposition(atom,true,eventHost));
					}
				}
				List<IToken> atomAcquisition = element.getAll("acquisition");
				if(atomAcquisition != null){
					for(IToken atom:atomAcquisition){
						tickBody.add(Generators.general.generateAcquisition(atom,true,eventHost,tickContext));
					}
				}
			}
		}
		BodyMetCalEntry loseThisStatement = new BodyMetCalEntry(eventHost,new StringEntry("lose"),new ListEntry(new BodyExactEntry(new StringEntry("id")),new BodyExactEntry(new StringEntry("this"))));
		String ifName = "if";
		List<IToken> energyToLose = condition.getAll("to_lose");
		if(energyToLose != null){
			for(IToken energy:energyToLose){
				List<IToken> quantaChancePair = energy.getAll("chance_pair");
				if(quantaChancePair != null){
					for(IToken quanta:quantaChancePair){
						IBodyStatement chanceHeader = (IBodyStatement)null;
						List<IToken> woahHasChance = quanta.getAll("has_chance");
						if(woahHasChance != null){
							for(IToken woah:woahHasChance){
								chanceHeader = (IBodyStatement)Generators.general.generateChance(woah);
							}
						}
						if((quanta.get("boolean_statement") == null)){
							tickBody.add(new BodyConditionalEntry(ifName,chanceHeader,new ListEntry(loseThisStatement),tickContext));
							ifName = "if";
						}
						else {
							IBodyStatement booleanHeader = (IBodyStatement)null;
							List<IToken> woahBooleanStatement = quanta.getAll("boolean_statement");
							if(woahBooleanStatement != null){
								for(IToken woah:woahBooleanStatement){
									booleanHeader = (IBodyStatement)Generators.general.generateBooleanStatement(woah,tickContext);
								}
							}
							tickBody.add(new BodyConditionalEntry(ifName,booleanHeader,new ListEntry(new BodyConditionalEntry("if",chanceHeader,new ListEntry(loseThisStatement),tickContext)),tickContext));
							ifName = "else if";
						}
					}
				}
			}
		}
		requirementsBody.add(new BodyReturnEntry(new BodyExactEntry(new StringEntry("true"))));
		List<IToken> elementEvent = condition.getAll("event");
		if(elementEvent != null){
			for(IToken element:elementEvent){
				IContext eventContext = (IContext)Generators.events.getEventContext(element.get("event_names").getString(),conditionClass);
				ListEntry eventBody = new ListEntry();
				eventBody.setDelimiter("");
				if((element.get("event_names").getString().equals("gain"))){
					eventBody = gainBody;
				}
				else {
					if((element.get("event_names").getString().equals("loss"))){
						eventBody = lossBody;
					}
					else {
						if((element.get("event_names").getString().equals("tick"))){
							eventBody = tickBody;
						}
					}
				}
				List<IToken> atomBodyElement = element.getAll("body_element");
				if(atomBodyElement != null){
					for(IToken atom:atomBodyElement){
						eventBody.add(Generators.general.generateBodyElement(atom,eventContext));
					}
				}
				if((!element.get("event_names").getString().equals("gain") && !element.get("event_names").getString().equals("loss") && !element.get("event_names").getString().equals("tick"))){
					String eventMethodName = Generators.conditions.buildString("on",Generator.camelize(element.get("event_names").getString()));
					String eventParameter = Generators.conditions.buildString("Events.",Generator.camelize(element.get("event_names").getString()));
					conditionClass.addMethod(new MethodEntry(eventMethodName,"void",new ListEntry(new VariableEntry("event",eventParameter)),eventBody));
				}
			}
		}
		conditionClass.addMethod(new MethodEntry("onGain","void",new ListEntry(new VariableEntry("event","Events.Gain")),gainBody));
		conditionClass.addMethod(new MethodEntry("onLoss","void",new ListEntry(new VariableEntry("event","Events.Loss")),lossBody));
		conditionClass.addMethod(new MethodEntry("onTick","void",new ListEntry(new VariableEntry("event","Events.Tick")),tickBody));
		conditionClass.addMethod(new MethodEntry("hasRequirements","Boolean",new ListEntry(new VariableEntry("candidate","Entity")),requirementsBody));
		createConditionBody.add(new ElementEntry(ConditionsGenerator.createListIfElement,new ListEntry(new QuoteEntry(condition.get("conditionName").getString()),new StringEntry(conditionName))));
		return null;
	}
	public BodyStaticEntry id(String conditionName){
		conditionName = Generators.conditions.buildString("Conditions.",conditionName);
		return new BodyStaticEntry(Generators.general.get(conditionName),new StringEntry("id"));
	}

	public File getDirectory(){
		return directory;
	}

	public HashMap<String,Set<String>> getConditionMap(){
		return conditionMap;
	}

	public String getPackageName(){
		return packageName;
	}

	public ClassEntry getSuperConditionClass(){
		return superConditionClass;
	}

	public ClassEntry getSuperConditionsClass(){
		return superConditionsClass;
	}

	public ClassEntry getIdClass(){
		return idClass;
	}

	public ListEntry getCreateConditionBody(){
		return createConditionBody;
	}

	public String getName(){
		return "Conditions";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}