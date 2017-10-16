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
	public static final ExactParser NEWTABTAB = new ExactParser("NEWTABTAB","mapTokens","\n\t\t");
	public static final ExactParser NEWTABTABTAB = new ExactParser("NEWTABTABTAB","mapTokens","\n\t\t\t");
	public static final ExactParser MAPS = new ExactParser("MAPS","mapTokens","maps");
	public static final ExactParser COLON = new ExactParser("COLON","mapTokens",":");
	public static final ExactParser RECTANGLE = new ExactParser("RECTANGLE","mapTokens","Rectangle");
	public static final ExactParser DASH = new ExactParser("DASH","mapTokens","-");
	public static final ExactParser COMMA = new ExactParser("COMMA","mapTokens",",");
	public static final ExactParser ENTRY = new ExactParser("ENTRY","mapTokens","Entry");
	public static final ExactParser EXITS = new ExactParser("EXITS","mapTokens","Exits");
	public static final ExactParser PATCHES = new ExactParser("PATCHES","mapTokens","Patches");
	public static final ExactParser PERCENT = new ExactParser("PERCENT","mapTokens","%");
	public static final ExactParser MAP = new ExactParser("MAP","mapTokens","map");
	public static final RegexParser AREA_BLUEPRINT = new RegexParser("AREA_BLUEPRINT","mapTokens","[^\\n]+");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,NEWTABTAB,NEWTABTABTAB,MAPS,COLON,RECTANGLE,DASH,COMMA,ENTRY,EXITS,PATCHES,PERCENT,MAP,AREA_BLUEPRINT);
}