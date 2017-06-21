package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ConditionTokens extends ParseList {

	@Override
	public String getName() {
		return "conditionTokens";
	}
	@Override
	public String getSingular() {
		return "conditionToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","conditionTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","conditionTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","conditionTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","conditionTokens","\n\t");
	public static final ExactParser NEWTABTAB = new ExactParser("NEWTABTAB","conditionTokens","\n\t\t");
	public static final ExactParser CNDS = new ExactParser("CNDS","conditionTokens","cnds");
	public static final ExactParser PLUS = new ExactParser("PLUS","conditionTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","conditionTokens","-");
	public static final ExactParser REQUIRE = new ExactParser("REQUIRE","conditionTokens","?");
	public static final ExactParser NOT = new ExactParser("NOT","conditionTokens","!");
	public static final ExactParser STAR = new ExactParser("STAR","conditionTokens","*");
	public static final ExactParser ACCUMULATE = new ExactParser("ACCUMULATE","conditionTokens","accumulate");
	public static final ExactParser CONDITION = new ExactParser("CONDITION","conditionTokens","condition");
	public static final ExactParser LOSS = new ExactParser("LOSS","conditionTokens","loss");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,NEWTABTAB,CNDS,PLUS,MINUS,REQUIRE,NOT,STAR,ACCUMULATE,CONDITION,LOSS);
}