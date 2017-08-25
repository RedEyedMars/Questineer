package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ColourTokens extends ParseList {

	@Override
	public String getName() {
		return "colourTokens";
	}
	@Override
	public String getSingular() {
		return "colourToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","colourTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser FLOAT = new RegexParser("FLOAT","colourTokens","[-]?\\d+\\Q.\\E\\d+");
	public static final RegexParser INTEGER = new RegexParser("INTEGER","colourTokens","[-]?\\d+");
	public static final RegexParser WILD = new RegexParser("WILD","colourTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","colourTokens","\n");
	public static final ExactParser COLOURS = new ExactParser("COLOURS","colourTokens","colours");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,FLOAT,INTEGER,WILD,NEWLINE,COLOURS);
}