package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class HeroStats extends ParseList {

	@Override
	public String getName() {
		return "hero_stats";
	}
	@Override
	public String getSingular() {
		return "hero_stat";
	}

	public static final ExactParser STR = new ExactParser("STR","hero_stats","STR");
	public static final ExactParser DEX = new ExactParser("DEX","hero_stats","DEX");
	public static final ExactParser CON = new ExactParser("CON","hero_stats","CON");
	public static final ExactParser KNW = new ExactParser("KNW","hero_stats","KNW");
	public static final ExactParser MND = new ExactParser("MND","hero_stats","MND");
	public static final ExactParser CRM = new ExactParser("CRM","hero_stats","CRM");

	public static final ChoiceParser parser = new ChoiceParser(
				STR,DEX,CON,KNW,MND,CRM);
}