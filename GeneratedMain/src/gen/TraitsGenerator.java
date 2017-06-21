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

public class TraitsGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private ClassEntry superTraitClass = (ClassEntry)null;
	private ClassEntry superTraitsClass = (ClassEntry)null;
	private ListEntry createTraitBody = new ListEntry();


	public static final Element traitIdElement = new Element("traitId",new String[]{"Traits.",/*Trait Name*/".id"});
	public static final Element declareTraitsClassElement = new Element("declareTraitsClass",new String[]{"package ",/*Game Package*/".entities.mods.traits;\n"+
			"import ",/*Game Package*/".entities.*;\n"+
			"import ",/*Game Package*/".events.*;\n"+
			"public class Traits {",/*Trait Classes*/"\n}"});
	public static final Element returnCallElement = new Element("returnCall",new String[]{"return ",/*Return*/""});
	public static final Element requireTraitElement = new Element("requireTrait",new String[]{"if(!candidate.hasTrait(Traits.",/*Trait Name*/".getId())){"+
			"\n				return false;"+
			"\n			}"});
	public static final Element requireExpElement = new Element("requireExp",new String[]{"if(!(candidate.get",/*Stat Name*/"().getValue()",/*Operation*/" ",/*Value*/")){"+
			"\n				return false;"+
			"\n			}"});
	public static final Element plusElement = new Element("plus",new String[]{"event.getHost().get",/*Stat Name*/"().impose(",/*Amount*/",this);"});
	public static final Element minusElement = new Element("minus",new String[]{"event.getHost().get",/*Stat Name*/"().impose(-",/*Amount*/",this);"});
	public static final Element releaseElement = new Element("release",new String[]{"event.getHost().get",/*Stat Name*/"().impose(this);"});
	public TraitsGenerator(){
		addElement("traitId",traitIdElement);
		addElement("declareTraitsClass",declareTraitsClassElement);
		addElement("returnCall",returnCallElement);
		addElement("requireTrait",requireTraitElement);
		addElement("requireExp",requireExpElement);
		addElement("plus",plusElement);
		addElement("minus",minusElement);
		addElement("release",releaseElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		createTraitBody.setDelimiter("");
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/mods/traits");
		directory.mkdirs();
	}
	public void generate(ParseContext data){
		VariableEntry idVariable = new VariableEntry("id","Traits.Id");
		ClassEntry idClass = (ClassEntry)new ClassEntry("entities.mods.traits","Id",null,null,new ListEntry(),new ListEntry(),new ListEntry());
		MethodEntry createTraitMethod = new MethodEntry("createTrait","Trait",new ListEntry(new VariableEntry("traitName","String")),new ListEntry(createTraitBody,new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))));
		superTraitClass = Generators.general.init(new ClassEntry("entities.mods.traits","Trait",null,new ListEntry(Generators.general.get("Source")),new ListEntry(idVariable.get("STATIC_FINAL").get("PUBLIC"),new VariableEntry("name","String"),new VariableEntry("description","String")),new ListEntry(new MethodEntry("onGain","void",new ListEntry(new VariableEntry("event","Events.Gain")),new ListEntry()),new MethodEntry("onLoss","void",new ListEntry(new VariableEntry("event","Events.Loss")),new ListEntry()),new MethodEntry("hasRequirements","Boolean",new ListEntry(new VariableEntry("candidate","Entity")),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))))),new ListEntry()));
		superTraitsClass = Generators.general.init(new ClassEntry("entities.mods.traits","Traits",null,null,new ListEntry(),new ListEntry(createTraitMethod.get("STATIC_COMPLETE")),new ListEntry(idClass)));
		Generators.traits.addFile(directory,"Trait.java",superTraitClass.get("COMPLETE"));
		Generators.traits.addFile(directory,"Traits.java",superTraitsClass.get("COMPLETE"));
	}
	public Entry generateTrait(IToken trait){
		String traitName = Generator.camelize(trait.get("traitName").getString());
		ListEntry gainBody = new ListEntry();
		gainBody.setDelimiter("");
		ListEntry lossBody = new ListEntry();
		lossBody.setDelimiter("");
		ListEntry requirementsBody = new ListEntry();
		requirementsBody.setDelimiter("");
		BodyExactEntry candidate = new BodyExactEntry(new StringEntry("candidate"));
		IToken quark = trait;
		List<IToken> energyRequirement = quark.getAll("requirement");
		if(energyRequirement != null){
			for(IToken energy:energyRequirement){
				IBodyStatement requireHeader = (IBodyStatement)Generators.general.generateRequirement(energy,candidate,false);
				requirementsBody.add(new BodyConditionalEntry("if",requireHeader,new ListEntry(new BodyReturnEntry(new BodyExactEntry(new StringEntry("false"))))));
			}
		}
		BodyMetCalEntry eventHost = new BodyMetCalEntry(new BodyExactEntry(new StringEntry("event")),new StringEntry("getHost"),new ListEntry());
		List<IToken> energyImpose = quark.getAll("impose");
		if(energyImpose != null){
			for(IToken energy:energyImpose){
				gainBody.add(Generators.entities.generateImposition(energy,true,eventHost));
				lossBody.add(Generators.entities.generateImposition(energy,false,eventHost));
			}
		}
		requirementsBody.add(new BodyReturnEntry(new BodyExactEntry(new StringEntry("true"))));
		superTraitsClass.addSubClass(new ClassEntry("entities.traits",traitName,superTraitClass,null,new ListEntry(),new ListEntry(new MethodEntry("getName","String",new ListEntry(),new ListEntry(new ElementEntry(TraitsGenerator.returnCallElement,new ListEntry(new QuoteEntry(traitName))))),new MethodEntry("getDescription","String",new ListEntry(),new ListEntry(new ElementEntry(TraitsGenerator.returnCallElement,new ListEntry(new QuoteEntry(trait.get("description").getString()))))),new MethodEntry("onGain","void",new ListEntry(new VariableEntry("event","Events.Gain")),gainBody),new MethodEntry("onLoss","void",new ListEntry(new VariableEntry("event","Events.Loss")),lossBody),new MethodEntry("hasRequirements","Boolean",new ListEntry(new VariableEntry("candidate","Entity")),requirementsBody)),new ListEntry()));
		return null;
	}
	public BodyStaticEntry id(String traitName){
		traitName = Generators.traits.buildString("Traits.",traitName);
		return new BodyStaticEntry(Generators.general.get(traitName),new StringEntry("id"));
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public ClassEntry getSuperTraitClass(){
		return superTraitClass;
	}

	public ClassEntry getSuperTraitsClass(){
		return superTraitsClass;
	}

	public ListEntry getCreateTraitBody(){
		return createTraitBody;
	}

	public String getName(){
		return "Traits";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}