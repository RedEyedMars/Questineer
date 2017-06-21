package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class TraitTokens extends ParseList {

	@Override
	public String getName() {
		return "traitTokens";
	}
	@Override
	public String getSingular() {
		return "traitToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","traitTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","traitTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","traitTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","traitTokens","\n\t");
	public static final ExactParser TRTS = new ExactParser("TRTS","traitTokens","trts");
	public static final RegexParser ORDINAL = new RegexParser("ORDINAL","traitTokens","[<>][=]?");
	public static final ExactParser REQUIRE = new ExactParser("REQUIRE","traitTokens","?");
	public static final ExactParser EXP = new ExactParser("EXP","traitTokens","EXP");
	public static final ExactParser TRAIT = new ExactParser("TRAIT","traitTokens","trait");
	public static final ExactParser PLUS = new ExactParser("PLUS","traitTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","traitTokens","-");
	public static final ExactParser NOT = new ExactParser("NOT","traitTokens","!");
	public static final ExactParser OR = new ExactParser("OR","traitTokens","|");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,TRTS,ORDINAL,REQUIRE,EXP,TRAIT,PLUS,MINUS,NOT,OR);
}