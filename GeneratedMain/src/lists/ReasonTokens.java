package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ReasonTokens extends ParseList {

	@Override
	public String getName() {
		return "reasonTokens";
	}
	@Override
	public String getSingular() {
		return "reasonToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","reasonTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","reasonTokens",".*");
	public static final RegexParser NON_VAR = new RegexParser("NON_VAR","reasonTokens","[^$]*");
	public static final ExactParser VAR = new ExactParser("VAR","reasonTokens","$");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","reasonTokens","\n");
	public static final ExactParser RSNS = new ExactParser("RSNS","reasonTokens","rsns");
	public static final ExactParser REASON = new ExactParser("REASON","reasonTokens","reason");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NON_VAR,VAR,NEWLINE,RSNS,REASON);
}