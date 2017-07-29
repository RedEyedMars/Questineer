package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class MapTokens extends ParseList {

	@Override
	public String getName() {
		return "mapTokens";
	}
	@Override
	public String getSingular() {
		return "mapToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","mapTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","mapTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","mapTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","mapTokens","\n\t");
	public static final ExactParser TAB = new ExactParser("TAB","mapTokens","\t");
	public static final ExactParser MAPS = new ExactParser("MAPS","mapTokens","maps");
	public static final ExactParser MAP = new ExactParser("MAP","mapTokens","map");
	public static final ExactParser CONNECTION = new ExactParser("CONNECTION","mapTokens","Connection");
	public static final ExactParser DOT = new ExactParser("DOT","mapTokens",".");
	public static final ExactParser PLUS = new ExactParser("PLUS","mapTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","mapTokens","-");
	public static final ExactParser COLON = new ExactParser("COLON","mapTokens",":");
	public static final ExactParser OPEN_PARA = new ExactParser("OPEN_PARA","mapTokens","(");
	public static final ExactParser CLOSE_PARA = new ExactParser("CLOSE_PARA","mapTokens",")");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,TAB,MAPS,MAP,CONNECTION,DOT,PLUS,MINUS,COLON,OPEN_PARA,CLOSE_PARA);
}