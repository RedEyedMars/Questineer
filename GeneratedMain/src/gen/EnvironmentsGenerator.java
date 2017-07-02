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

public class EnvironmentsGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private ClassEntry superEnvironmentClass = (ClassEntry)null;
	private ClassEntry superMapClass = (ClassEntry)null;
	private ClassEntry superPositionClass = (ClassEntry)null;


	public EnvironmentsGenerator(){
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"environments");
		directory.mkdirs();
	}
	public void generate(ParseContext data){
		String colon = ":";
		VariableEntry candidateEntity = new VariableEntry("candidate","Entity");
		superEnvironmentClass = Generators.general.init(new ClassEntry("environments","Environment",null,null,new ListEntry(new VariableEntry("position","Position"),new VariableEntry("map","Map")),new ListEntry(new MethodEntry("getEntitiesWithin","List.Entity",new ListEntry(new VariableEntry("range","Float")),new ListEntry(new BodyDecVarEntry(new VariableEntry("inRange","List.Entity")),new BodyConditionalEntry("for",new BodyOperatorEntry(new BodyExactEntry(candidateEntity.get("SHOW_TYPE")),colon,new BodyMetCalEntry(new StringEntry("map"),new StringEntry("getEntities"),new ListEntry())),new ListEntry(new BodyConditionalEntry("if",new BodyMetCalEntry(new BodyMetCalEntry(new StringEntry("candidate"),new StringEntry("getPosition"),new ListEntry()),new StringEntry("isWithinRange"),new ListEntry(new BodyExactEntry(new StringEntry("position")),new BodyExactEntry(new StringEntry("range")))),new ListEntry(new BodyMetCalEntry(new StringEntry("inRange"),new StringEntry("add"),new ListEntry(new BodyExactEntry(new StringEntry("candidate")))))))),new BodyReturnEntry(new StringEntry("inRange"))))),new ListEntry()));
		Generators.environments.addFile(directory,"Environment.java",superEnvironmentClass.get("COMPLETE"));
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public ClassEntry getSuperEnvironmentClass(){
		return superEnvironmentClass;
	}

	public ClassEntry getSuperMapClass(){
		return superMapClass;
	}

	public ClassEntry getSuperPositionClass(){
		return superPositionClass;
	}

	public String getName(){
		return "Environments";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}