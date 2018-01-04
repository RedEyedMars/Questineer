package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ItemTokens extends ParseList {

	@Override
	public String getName() {
		return "itemTokens";
	}
	@Override
	public String getSingular() {
		return "itemToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","itemTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","itemTokens",".*");
	public static final ExactParser ITMS = new ExactParser("ITMS","itemTokens","itms");
	public static final ExactParser HP = new ExactParser("HP","itemTokens","hp");
	public static final ExactParser DEF = new ExactParser("DEF","itemTokens","def");
	public static final ExactParser DMG = new ExactParser("DMG","itemTokens","dmg");
	public static final ExactParser VAL = new ExactParser("VAL","itemTokens","value");
	public static final ExactParser WEI = new ExactParser("WEI","itemTokens","weight");
	public static final ExactParser HIT = new ExactParser("HIT","itemTokens","hit");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","itemTokens","\n\t");
	public static final ExactParser NEWTABTAB = new ExactParser("NEWTABTAB","itemTokens","\n\t\t");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,ITMS,HP,DEF,DMG,VAL,WEI,HIT,NEWTAB,NEWTABTAB);
}