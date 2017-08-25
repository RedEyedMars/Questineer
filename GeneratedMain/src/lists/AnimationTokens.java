package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AnimationTokens extends ParseList {

	@Override
	public String getName() {
		return "animationTokens";
	}
	@Override
	public String getSingular() {
		return "animationToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","animationTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser FLOAT = new RegexParser("FLOAT","animationTokens","[-]?\\d+\\Q.\\E\\d+");
	public static final RegexParser INTEGER = new RegexParser("INTEGER","animationTokens","[-]?\\d+");
	public static final RegexParser WILD = new RegexParser("WILD","animationTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","animationTokens","\n");
	public static final ExactParser COMMA = new ExactParser("COMMA","animationTokens",",");
	public static final ExactParser IF = new ExactParser("IF","animationTokens","if");
	public static final ExactParser ANIT_EQUALS = new ExactParser("ANIT_EQUALS","animationTokens","=");
	public static final ExactParser ANIT_PLUSEQUALS = new ExactParser("ANIT_PLUSEQUALS","animationTokens","+=");
	public static final ExactParser ANIT_AND = new ExactParser("ANIT_AND","animationTokens","&");
	public static final ExactParser ANIT_OR = new ExactParser("ANIT_OR","animationTokens","|");
	public static final ExactParser ANIMATION_TYPES = new ExactParser("ANIMATION_TYPES","animationTokens","animationTypes");
	public static final ExactParser ANIT_ISEQUAL = new ExactParser("ANIT_ISEQUAL","animationTokens","==");
	public static final ExactParser ANIT_ISNOTEQUAL = new ExactParser("ANIT_ISNOTEQUAL","animationTokens","!=");
	public static final ExactParser ANIT_LESSTHAN = new ExactParser("ANIT_LESSTHAN","animationTokens","<");
	public static final ExactParser ANIT_GREATERTHAN = new ExactParser("ANIT_GREATERTHAN","animationTokens",">");
	public static final ExactParser ANIT_LESSOREQUAL = new ExactParser("ANIT_LESSOREQUAL","animationTokens","<=");
	public static final ExactParser ANIT_GREATEROREQUAL = new ExactParser("ANIT_GREATEROREQUAL","animationTokens",">=");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,FLOAT,INTEGER,WILD,NEWLINE,COMMA,IF,ANIT_EQUALS,ANIT_PLUSEQUALS,ANIT_AND,ANIT_OR,ANIMATION_TYPES,ANIT_ISEQUAL,ANIT_ISNOTEQUAL,ANIT_LESSTHAN,ANIT_GREATERTHAN,ANIT_LESSOREQUAL,ANIT_GREATEROREQUAL);
}