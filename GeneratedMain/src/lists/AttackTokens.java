package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AttackTokens extends ParseList {

	@Override
	public String getName() {
		return "attackTokens";
	}
	@Override
	public String getSingular() {
		return "attackToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","attackTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","attackTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","attackTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","attackTokens","\n\t");
	public static final ExactParser ATKS = new ExactParser("ATKS","attackTokens","atks");
	public static final ExactParser ATTACK = new ExactParser("ATTACK","attackTokens","attack");
	public static final ExactParser RANGE = new ExactParser("RANGE","attackTokens","range");
	public static final ExactParser COOLDOWN = new ExactParser("COOLDOWN","attackTokens","cd");
	public static final ExactParser DAMAGE = new ExactParser("DAMAGE","attackTokens","damage");
	public static final ExactParser MISS = new ExactParser("MISS","attackTokens","miss");
	public static final ExactParser BODY_DMG = new ExactParser("BODY_DMG","attackTokens","body");
	public static final ExactParser MIND_DMG = new ExactParser("MIND_DMG","attackTokens","mind");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,ATKS,ATTACK,RANGE,COOLDOWN,DAMAGE,MISS,BODY_DMG,MIND_DMG);
}