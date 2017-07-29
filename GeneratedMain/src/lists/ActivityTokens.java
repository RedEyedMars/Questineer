package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ActivityTokens extends ParseList {

	@Override
	public String getName() {
		return "activityTokens";
	}
	@Override
	public String getSingular() {
		return "activityToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","activityTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","activityTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","activityTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","activityTokens","\n\t");
	public static final ExactParser ATVS = new ExactParser("ATVS","activityTokens","atvs");
	public static final ExactParser ACTIVITY = new ExactParser("ACTIVITY","activityTokens","activity");
	public static final ExactParser COMMA = new ExactParser("COMMA","activityTokens",",");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,ATVS,ACTIVITY,COMMA);
}