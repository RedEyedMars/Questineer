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

public class SkillsGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private ClassEntry superSkillClass = (ClassEntry)null;


	public SkillsGenerator(){
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/skills");
		directory.mkdirs();
	}
	public void generate(ParseContext data){
		Generators.general.createCriteria(Generators.general.get("Entity"));
		ListEntry getCostBody = new ListEntry(new BodyReturnEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("(int)(float)cost")),new StringEntry("use"),new ListEntry(new BodyExactEntry(new StringEntry("entity"))))));
		ListEntry getRangeBody = new ListEntry(new BodyReturnEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("range")),new StringEntry("use"),new ListEntry(new BodyExactEntry(new StringEntry("entity"))))));
		ListEntry isOffCDBody = new ListEntry(new BodyReturnEntry(new BodyOperatorEntry(new StringEntry("cooldown"),"==",new StringEntry("0"))));
		ListEntry onTickBody = new ListEntry(new BodyConditionalEntry("if",new BodyOperatorEntry(new StringEntry("cooldown"),">",new StringEntry("0")),new ListEntry(new BodyExactEntry(new StringEntry("--cooldown")))));
		Generators.general.createList(Generators.general.get("Entity"));
		VariableEntry targets = new VariableEntry("potentialTargets","List.Entity");
		VariableEntry potential = new VariableEntry("potential","Entity");
		BodyMetCalEntry environment = new BodyMetCalEntry(new BodyExactEntry(new StringEntry("user")),new StringEntry("getEnvironment"),new ListEntry());
		BodyMetCalEntry potentialTargetsInEnvironment = new BodyMetCalEntry(environment,new StringEntry("getEntitiesWithin"),new ListEntry(new BodyMetCalEntry(new StringEntry("getRange"),new ListEntry(new BodyExactEntry(new StringEntry("user"))))));
		String colon = ":";
		ListEntry useBody = new ListEntry(new BodyConditionalEntry("if",new BodyMetCalEntry(new StringEntry("isOffCooldown"),new ListEntry()),new ListEntry(new BodyReturnEntry(new StringEntry("false")))),new BodyDecVarEntry(targets),new BodyConditionalEntry("for",new BodyOperatorEntry(potential.get("SHOW_TYPE"),colon,potentialTargetsInEnvironment),new ListEntry(new BodyConditionalEntry("if",new BodyMetCalEntry(new StringEntry("targetCriteria"),new StringEntry("satisfies"),new ListEntry(new BodyExactEntry(potential))),new ListEntry(new BodyMetCalEntry(new StringEntry("use"),new ListEntry(new BodyExactEntry(new StringEntry("user")),new BodyExactEntry(potential))),new BodyReturnEntry(new StringEntry("true")))))),new BodyReturnEntry(new StringEntry("false")));
		superSkillClass = (ClassEntry)Generators.general.init(new ClassEntry("entities.skills","Skill",null,null,new ListEntry(new VariableEntry("experience","Integer"),new VariableEntry("cooldown","Integer"),new VariableEntry("range","Entity.Modifier"),new VariableEntry("cost","Entity.Modifier"),new VariableEntry("hasEntityFocus","Boolean"),new VariableEntry("targetCriteria","Criteria.Entity")),new ListEntry(new MethodEntry("getCost","Integer",new ListEntry(new VariableEntry("entity","Entity")),getCostBody),new MethodEntry("getRange","Float",new ListEntry(new VariableEntry("entity","Entity")),getRangeBody),new MethodEntry("isOffCooldown","Boolean",new ListEntry(),isOffCDBody),new MethodEntry("onTick","void",new ListEntry(new VariableEntry("event","Events.Tick")),onTickBody),new MethodEntry("setFocus","void",new ListEntry(new VariableEntry("onThis","Boolean")),new ListEntry(new BodyOperatorEntry(new StringEntry("hasEntityFocus"),"=",new StringEntry("onThis")))),new MethodEntry("use","Boolean",new ListEntry(new VariableEntry("user","Entity")),useBody),new MethodEntry("use","void",new ListEntry(new VariableEntry("user","Entity"),new VariableEntry("victim","Entity")),new ListEntry()),new MethodEntry("getName","String",new ListEntry(),new ListEntry(new BodyReturnEntry(new StringEntry("null")))),new MethodEntry("getDescription","String",new ListEntry(),new ListEntry(new BodyReturnEntry(new StringEntry("null"))))),new ListEntry()));
		superSkillClass.addImport("misc","List");
		Generators.skills.addFile(directory,"Skill.java",superSkillClass.get("COMPLETE"));
	}
	public ClassEntry get(String option){
		return (ClassEntry)superSkillClass.get(option);
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public ClassEntry getSuperSkillClass(){
		return superSkillClass;
	}

	public String getName(){
		return "Skills";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}