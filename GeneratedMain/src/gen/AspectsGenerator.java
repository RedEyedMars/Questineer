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

public class AspectsGenerator extends Generator {

	private File directory = null;
	private HashMap<String,Set<String>> aspectMap = new HashMap<String,Set<String>>();
	private String packageName = null;
	private ClassEntry superAspectClass = (ClassEntry)null;
	private ClassEntry superAspectsClass = (ClassEntry)null;
	private ClassEntry idClass = (ClassEntry)null;
	private ListEntry createAspectBody = new ListEntry();


	public static final Element newAspectElement = new Element("newAspect",new String[]{"new Aspects.",/*Aspect Name*/"()"});
	public static final Element aspectIdElement = new Element("aspectId",new String[]{"Aspects.",/*Aspect Name*/".id"});
	public static final Element importPackageElement = new Element("importPackage",new String[]{"import ",/*Game Package*/".",/*Import Name*/".*;"});
	public static final Element declareAspectMemberElement = new Element("declareAspectMember",new String[]{"public static class ",/*Class Name*/" extends Aspect {"+
			"\n		public static final Aspects.Id id = new Aspects.Id();"+
			"\n		public ",/*Class Name*/"(){"+
			"\n			super(",/*Name*/", ",/*Description*/");"+
			"\n		}",/*Methods*/""+
			"\n		public Aspects.Id getId(){"+
			"\n			return id;"+
			"\n		}"+
			"\n	}"});
	public static final Element declareAspectsElement = new Element("declareAspects",new String[]{"package ",/*Game Package*/".entities.items.aspects;",/*Imports*/""+
			"\npublic class Aspects {",/*Aspect Classes*/"\n",/*Aspect Create Method*/""+
			"\n	public static class Id {"+
			"\n	}"+
			"\n}"});
	public static final Element createAspectsMethodElement = new Element("createAspectsMethod",new String[]{"	public Aspect create(String aspectName){",/*Ifs*/""+
			"\n		return null;"+
			"\n	}"});
	public static final Element createListIfElement = new Element("createListIf",new String[]{"if(",/*Aspect Name*/".equals(aspectName)){"+
			"\n			return new Aspects.",/*Aspect Class Name*/"();"+
			"\n		}"});
	public AspectsGenerator(){
		addElement("newAspect",newAspectElement);
		addElement("aspectId",aspectIdElement);
		addElement("importPackage",importPackageElement);
		addElement("declareAspectMember",declareAspectMemberElement);
		addElement("declareAspects",declareAspectsElement);
		addElement("createAspectsMethod",createAspectsMethodElement);
		addElement("createListIf",createListIfElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/items/aspects");
		directory.mkdirs();
		createAspectBody.setDelimiter("");
	}
	public void generate(ParseContext data){
		MethodEntry createAspectMethod = new MethodEntry("createAspect","Aspect",new ListEntry(new VariableEntry("aspectName","String")),new ListEntry(createAspectBody,new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))));
		idClass = (ClassEntry)new ClassEntry("entities.items.aspects","Id",null,null,new ListEntry(),new ListEntry(),new ListEntry());
		superAspectsClass = Generators.general.init(new ClassEntry("entities.items.aspects","Aspects",null,null,new ListEntry(),new ListEntry(createAspectMethod.get("STATIC_COMPLETE")),new ListEntry(idClass)));
		superAspectClass = Generators.general.init(new ClassEntry("entities.items.aspects","Aspect",null,new ListEntry(Generators.general.get("Source")),new ListEntry(new VariableEntry("name","String"),new VariableEntry("description","String")),new ListEntry(),new ListEntry()));
		superAspectClass.addImport("entities.mods.conditions","Conditions");
		Generators.events.addEventMethods(superAspectClass,new ListEntry(),new ListEntry());
		superAspectClass.addMethod(new MethodEntry("getId",idClass,new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))));
		Generators.aspects.addFile(directory,"Aspect.java",superAspectClass.get("COMPLETE"));
		Generators.aspects.addFile(directory,"Aspects.java",superAspectsClass.get("COMPLETE"));
	}
	public Entry generateAspect(IToken aspect){
		String aspectName = Generator.camelize(aspect.get("aspectName").getString());
		String aspectDescription = aspect.get("description").getString();
		VariableEntry idVariable = new VariableEntry("id","Aspects.Id");
		ClassEntry aspectClass = new ClassEntry("entities.items.aspects",aspectName,superAspectClass,new ListEntry(Generators.general.get("Source")),new ListEntry(idVariable.get("PUBLIC").get("STATIC_FINAL"),new VariableEntry("name","String"),new VariableEntry("description","String")),new ListEntry(),new ListEntry());
		superAspectsClass.addSubClass(aspectClass);
		List<IToken> elementEvent = aspect.getAll("event");
		if(elementEvent != null){
			for(IToken element:elementEvent){
				IContext eventContext = (IContext)Generators.events.getEventContext(element.get("event_names").getString(),aspectClass);
				ListEntry eventBody = new ListEntry();
				eventBody.setDelimiter("");
				List<IToken> atomBodyElement = element.getAll("body_element");
				if(atomBodyElement != null){
					for(IToken atom:atomBodyElement){
						eventBody.add(Generators.general.generateBodyElement(atom,eventContext));
					}
				}
				String eventMethodName = Generators.aspects.buildString("on",Generator.camelize(element.get("event_names").getString()));
				String eventParameter = Generators.aspects.buildString("Events.",Generator.camelize(element.get("event_names").getString()));
				aspectClass.addMethod(new MethodEntry(eventMethodName,"void",new ListEntry(new VariableEntry("event",eventParameter)),eventBody));
			}
		}
		createAspectBody.add(new ElementEntry(AspectsGenerator.createListIfElement,new ListEntry(new QuoteEntry(aspect.get("aspectName").getString()),new StringEntry(aspectName))));
		return null;
	}
	public BodyStaticEntry id(String aspectName){
		aspectName = Generators.aspects.buildString("Aspects.",aspectName);
		return new BodyStaticEntry(Generators.general.get(aspectName),new StringEntry("id"));
	}

	public File getDirectory(){
		return directory;
	}

	public HashMap<String,Set<String>> getAspectMap(){
		return aspectMap;
	}

	public String getPackageName(){
		return packageName;
	}

	public ClassEntry getSuperAspectClass(){
		return superAspectClass;
	}

	public ClassEntry getSuperAspectsClass(){
		return superAspectsClass;
	}

	public ClassEntry getIdClass(){
		return idClass;
	}

	public ListEntry getCreateAspectBody(){
		return createAspectBody;
	}

	public String getName(){
		return "Aspects";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}