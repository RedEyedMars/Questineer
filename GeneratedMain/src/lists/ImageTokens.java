package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ImageTokens extends ParseList {

	@Override
	public String getName() {
		return "imageTokens";
	}
	@Override
	public String getSingular() {
		return "imageToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","imageTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","imageTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","imageTokens","\n");
	public static final ExactParser COMMA = new ExactParser("COMMA","imageTokens",",");
	public static final RegexParser CROSS = new RegexParser("CROSS","imageTokens","[Xx]");
	public static final ExactParser DASH = new ExactParser("DASH","imageTokens","-");
	public static final ExactParser LESSTHAN = new ExactParser("LESSTHAN","imageTokens",">");
	public static final ExactParser IMGS = new ExactParser("IMGS","imageTokens","imgs");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,COMMA,CROSS,DASH,LESSTHAN,IMGS);
}