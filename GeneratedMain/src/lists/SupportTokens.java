package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class SupportTokens extends ParseList {

	@Override
	public String getName() {
		return "supportTokens";
	}
	@Override
	public String getSingular() {
		return "supportToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","supportTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","supportTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","supportTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","supportTokens","\n\t");
	public static final ExactParser SUPS = new ExactParser("SUPS","supportTokens","sups");
	public static final ExactParser SUPPORT = new ExactParser("SUPPORT","supportTokens","support");
	public static final ExactParser RANGE = new ExactParser("RANGE","supportTokens","range");
	public static final ExactParser COOLDOWN = new ExactParser("COOLDOWN","supportTokens","cd");
	public static final ExactParser DAMAGE = new ExactParser("DAMAGE","supportTokens","damage");
	public static final ExactParser MISS = new ExactParser("MISS","supportTokens","miss");
	public static final ExactParser BODY_DMG = new ExactParser("BODY_DMG","supportTokens","body");
	public static final ExactParser MIND_DMG = new ExactParser("MIND_DMG","supportTokens","mind");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,SUPS,SUPPORT,RANGE,COOLDOWN,DAMAGE,MISS,BODY_DMG,MIND_DMG);
}