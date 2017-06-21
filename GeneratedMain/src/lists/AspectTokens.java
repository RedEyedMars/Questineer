package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AspectTokens extends ParseList {

	@Override
	public String getName() {
		return "aspectTokens";
	}
	@Override
	public String getSingular() {
		return "aspectToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","aspectTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","aspectTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","aspectTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","aspectTokens","\n\t");
	public static final ExactParser ASPS = new ExactParser("ASPS","aspectTokens","asps");
	public static final ExactParser ASPECT_NESS = new ExactParser("ASPECT_NESS","aspectTokens","-ness");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,ASPS,ASPECT_NESS);
}