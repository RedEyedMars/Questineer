package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class EntityTokens extends ParseList {

	@Override
	public String getName() {
		return "entityTokens";
	}
	@Override
	public String getSingular() {
		return "entityToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","entityTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","entityTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","entityTokens","\n");
	public static final ExactParser PIPE = new ExactParser("PIPE","entityTokens","|");
	public static final ExactParser STAT = new ExactParser("STAT","entityTokens","stat");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,PIPE,STAT);
}