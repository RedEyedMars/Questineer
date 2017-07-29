package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class SkillTokens extends ParseList {

	@Override
	public String getName() {
		return "skillTokens";
	}
	@Override
	public String getSingular() {
		return "skillToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","skillTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","skillTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","skillTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","skillTokens","\n\t");
	public static final ExactParser SKLS = new ExactParser("SKLS","skillTokens","skls");
	public static final ExactParser PLUS = new ExactParser("PLUS","skillTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","skillTokens","-");
	public static final ExactParser SKILL = new ExactParser("SKILL","skillTokens","skill");
	public static final ExactParser USE = new ExactParser("USE","skillTokens","use");
	public static final ExactParser REQUIRE = new ExactParser("REQUIRE","skillTokens","?");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,SKLS,PLUS,MINUS,SKILL,USE,REQUIRE);
}