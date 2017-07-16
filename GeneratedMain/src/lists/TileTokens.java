package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class TileTokens extends ParseList {

	@Override
	public String getName() {
		return "tileTokens";
	}
	@Override
	public String getSingular() {
		return "tileToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","tileTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","tileTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","tileTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","tileTokens","\n\t");
	public static final ExactParser TILE = new ExactParser("TILE","tileTokens","tile");
	public static final ExactParser PATH = new ExactParser("PATH","tileTokens","Path");
	public static final ExactParser START = new ExactParser("START","tileTokens","Start");
	public static final ExactParser DOT = new ExactParser("DOT","tileTokens",".");
	public static final ExactParser PLUS = new ExactParser("PLUS","tileTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","tileTokens","-");
	public static final ExactParser OPEN_PARA = new ExactParser("OPEN_PARA","tileTokens","(");
	public static final ExactParser CLOSE_PARA = new ExactParser("CLOSE_PARA","tileTokens",")");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,TILE,PATH,START,DOT,PLUS,MINUS,OPEN_PARA,CLOSE_PARA);
}