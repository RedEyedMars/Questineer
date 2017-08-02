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
	public static final ExactParser GET = new ExactParser("GET","activityTokens","get");
	public static final ExactParser TARGET = new ExactParser("TARGET","activityTokens","target");
	public static final ExactParser DESTINATION = new ExactParser("DESTINATION","activityTokens","destination");
	public static final ExactParser SUCCEED = new ExactParser("SUCCEED","activityTokens","succeed");
	public static final ExactParser FAIL = new ExactParser("FAIL","activityTokens","fail");
	public static final ExactParser PLUS = new ExactParser("PLUS","activityTokens","+");
	public static final ExactParser LISTEN = new ExactParser("LISTEN","activityTokens","listen");
	public static final ExactParser STEP = new ExactParser("STEP","activityTokens","step");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,ATVS,ACTIVITY,COMMA,GET,TARGET,DESTINATION,SUCCEED,FAIL,PLUS,LISTEN,STEP);
}