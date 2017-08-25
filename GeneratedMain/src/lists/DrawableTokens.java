package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class DrawableTokens extends ParseList {

	@Override
	public String getName() {
		return "drawableTokens";
	}
	@Override
	public String getSingular() {
		return "drawableToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","drawableTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser INTEGER = new RegexParser("INTEGER","drawableTokens","[-]?\\d+");
	public static final RegexParser WILD = new RegexParser("WILD","drawableTokens",".*");
	public static final ExactParser DWBS = new ExactParser("DWBS","drawableTokens","dwbs");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","drawableTokens","\n");
	public static final ExactParser DOT = new ExactParser("DOT","drawableTokens",".");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,INTEGER,WILD,DWBS,NEWLINE,DOT);
}