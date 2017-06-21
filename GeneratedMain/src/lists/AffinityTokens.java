package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AffinityTokens extends ParseList {

	@Override
	public String getName() {
		return "affinityTokens";
	}
	@Override
	public String getSingular() {
		return "affinityToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","affinityTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","affinityTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","affinityTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","affinityTokens","\n\t");
	public static final ExactParser AFTS = new ExactParser("AFTS","affinityTokens","afts");
	public static final ExactParser PLUS = new ExactParser("PLUS","affinityTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","affinityTokens","-");
	public static final ExactParser AFFINITY = new ExactParser("AFFINITY","affinityTokens","affinity");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,AFTS,PLUS,MINUS,AFFINITY);
}