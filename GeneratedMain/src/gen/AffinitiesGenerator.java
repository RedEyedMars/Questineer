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

public class AffinitiesGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private ClassEntry superAffinityClass = (ClassEntry)null;
	private ClassEntry superAffinitiesClass = (ClassEntry)null;
	private ListEntry createAffinityBody = new ListEntry();


	public static final Element declareAffinitiesElement = new Element("declareAffinities",new String[]{"package ",/*Game Package*/".entities.mods.affinities;"+
			"\nimport ",/*Game Package*/".entities.*;"+
			"\npublic class Affinities {",/*Contents*/""+
			"\n	public static class Id {"+
			"\n	}"+
			"\n}"});
	public static final Element declareAffinityElement = new Element("declareAffinity",new String[]{"package ",/*Game Package*/".entities.mods.affinities;"+
			"\nimport ",/*Game Package*/".entities.*;"+
			"\npublic abstract class Affinity {"+
			"\n	public abstract Affinities.Id getId();"+
			"\n	public abstract String getName();"+
			"\n	public abstract Double modify(Entity defender, Double damage);"+
			"\n}"});
	public static final Element modifyBodyElement = new Element("modifyBody",new String[]{"if(",/*Strengths*/"){"+
			"\n				damage*=2.0;"+
			"\n			}"+
			"\n			if(",/*Weaknesses*/"){"+
			"\n				damage/=2.0;"+
			"\n			}"+
			"\n			return damage;"});
	public static final Element hasAffinityElement = new Element("hasAffinity",new String[]{"defender.hasAffinity(Affinities.",/*Affinity Name*/".id)"});
	public AffinitiesGenerator(){
		addElement("declareAffinities",declareAffinitiesElement);
		addElement("declareAffinity",declareAffinityElement);
		addElement("modifyBody",modifyBodyElement);
		addElement("hasAffinity",hasAffinityElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/mods/affinities");
		directory.mkdirs();
		createAffinityBody.setDelimiter("");
	}
	public void generate(ParseContext data){
		MethodEntry createAffinityMethod = new MethodEntry("createAffinity","Affinity",new ListEntry(new VariableEntry("affinityName","String")),new ListEntry(createAffinityBody,new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))));
		ClassEntry idClass = (ClassEntry)Generators.general.init(new ClassEntry("entities.mods.affinities","Id",null,null,new ListEntry(),new ListEntry(),new ListEntry()));
		superAffinitiesClass = Generators.general.init(new ClassEntry("entities.mods.affinities","Affinities",null,null,new ListEntry(),new ListEntry(createAffinityMethod.get("STATIC_COMPLETE")),new ListEntry(idClass)));
		superAffinityClass = Generators.general.init(new ClassEntry("entities.mods.affinities","Affinity",null,null,new ListEntry(),new ListEntry(new MethodEntry("getId","Affinities.Id",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))),new MethodEntry("getName","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))),new MethodEntry("modify","Double",new ListEntry(new VariableEntry("defender","Entity"),new VariableEntry("damage","Double")),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("0.0")))))),new ListEntry()));
		Generators.affinities.addFile(directory,"Affinities.java",superAffinitiesClass.get("COMPLETE"));
		Generators.affinities.addFile(directory,"Affinity.java",superAffinityClass.get("COMPLETE"));
	}
	public Entry generateAffinity(IToken affinity){
		String affinityName = affinity.get("affinityName").getString();
		ListEntry weaknesses = new ListEntry();
		weaknesses.setDelimiter("||");
		ListEntry strengths = new ListEntry();
		strengths.setDelimiter("||");
		for(IToken.Key quarkKey:affinity.keySet()){
			if("strength_name".equals(quarkKey.getName())){
				IToken quark = affinity.get(quarkKey);
				strengths.add(new ElementEntry(AffinitiesGenerator.hasAffinityElement,new ListEntry(new StringEntry(Generator.camelize(quark.getString())))));
			}
			else if("weakness_name".equals(quarkKey.getName())){
				IToken quark = affinity.get(quarkKey);
				weaknesses.add(new ElementEntry(AffinitiesGenerator.hasAffinityElement,new ListEntry(new StringEntry(Generator.camelize(quark.getString())))));
			}
		}
		superAffinitiesClass.addSubClass(new ClassEntry("entities.mods.affinities",affinityName,superAffinityClass,null,new ListEntry(),new ListEntry(new MethodEntry("getName","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new QuoteEntry(affinityName))))),new MethodEntry("modify","Double",new ListEntry(new VariableEntry("defender","Entity"),new VariableEntry("damage","Double")),new ListEntry(new ElementEntry(AffinitiesGenerator.modifyBodyElement,new ListEntry(strengths,weaknesses))))),new ListEntry()));
		return null;
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public ClassEntry getSuperAffinityClass(){
		return superAffinityClass;
	}

	public ClassEntry getSuperAffinitiesClass(){
		return superAffinitiesClass;
	}

	public ListEntry getCreateAffinityBody(){
		return createAffinityBody;
	}

	public String getName(){
		return "Affinities";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}