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
	public static final ExactParser NEWTABTAB = new ExactParser("NEWTABTAB","tileTokens","\n\t\t");
	public static final ExactParser NEWTABTABTAB = new ExactParser("NEWTABTABTAB","tileTokens","\n\t\t\t");
	public static final ExactParser DASH = new ExactParser("DASH","tileTokens","-");
	public static final ExactParser TILE = new ExactParser("TILE","tileTokens","tile");
	public static final ExactParser PATH = new ExactParser("PATH","tileTokens","Path");
	public static final ExactParser PATHS = new ExactParser("PATHS","tileTokens","Paths");
	public static final ExactParser START = new ExactParser("START","tileTokens","Start");
	public static final ExactParser BACKGROUND = new ExactParser("BACKGROUND","tileTokens","Background");
	public static final ExactParser ARRR = new ExactParser("ARRR","tileTokens","R");
	public static final ExactParser DOT = new ExactParser("DOT","tileTokens",".");
	public static final ExactParser PERCENT = new ExactParser("PERCENT","tileTokens","%");
	public static final ExactParser PLUS = new ExactParser("PLUS","tileTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","tileTokens","-");
	public static final ExactParser EXTENDS = new ExactParser("EXTENDS","tileTokens","<");
	public static final ExactParser OPEN_PARA = new ExactParser("OPEN_PARA","tileTokens","(");
	public static final ExactParser CLOSE_PARA = new ExactParser("CLOSE_PARA","tileTokens",")");
	public static final ExactParser PIPE = new ExactParser("PIPE","tileTokens","|");
	public static final ExactParser COLON = new ExactParser("COLON","tileTokens",":");
	public static final ExactParser COMMON = new ExactParser("COMMON","tileTokens","Common");
	public static final ExactParser UNCOMMON = new ExactParser("UNCOMMON","tileTokens","Uncommon");
	public static final ExactParser RARE = new ExactParser("RARE","tileTokens","Rare");
	public static final ExactParser EPIC = new ExactParser("EPIC","tileTokens","Epic");
	public static final ExactParser LEGENDARY = new ExactParser("LEGENDARY","tileTokens","Legendary");
	public static final ExactParser SEEDED = new ExactParser("SEEDED","tileTokens","Seeded");
	public static final ExactParser FREE = new ExactParser("FREE","tileTokens","Free");
	public static final ExactParser TILE_AND = new ExactParser("TILE_AND","tileTokens","&");
	public static final ExactParser UNDERNEATH = new ExactParser("UNDERNEATH","tileTokens","Underneath");
	public static final ExactParser CRAWLER = new ExactParser("CRAWLER","tileTokens","Crawler");
	public static final ExactParser BRANCH = new ExactParser("BRANCH","tileTokens","Branch");
	public static final ExactParser SIDES = new ExactParser("SIDES","tileTokens","Sides");
	public static final ExactParser OTHERWISE = new ExactParser("OTHERWISE","tileTokens","otherwise");
	public static final ExactParser ENCOUNTER = new ExactParser("ENCOUNTER","tileTokens","encounter");
	public static final ExactParser SMALL = new ExactParser("SMALL","tileTokens","Small");
	public static final ExactParser MEDIUM = new ExactParser("MEDIUM","tileTokens","Medium");
	public static final ExactParser LARGE = new ExactParser("LARGE","tileTokens","Large");
	public static final ExactParser HUGE = new ExactParser("HUGE","tileTokens","Huge");
	public static final ExactParser ROOM = new ExactParser("ROOM","tileTokens","Room");
	public static final ExactParser LENGTH = new ExactParser("LENGTH","tileTokens","length");
	public static final ExactParser TILE_LENGTH = new ExactParser("TILE_LENGTH","tileTokens","Length");
	public static final ExactParser CONNECT = new ExactParser("CONNECT","tileTokens","Connect");
	public static final ExactParser CIRCLE = new ExactParser("CIRCLE","tileTokens","Circle");
	public static final ExactParser COURT = new ExactParser("COURT","tileTokens","Court");
	public static final ExactParser SQUARE = new ExactParser("SQUARE","tileTokens","Square");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,NEWTABTAB,NEWTABTABTAB,DASH,TILE,PATH,PATHS,START,BACKGROUND,ARRR,DOT,PERCENT,PLUS,MINUS,EXTENDS,OPEN_PARA,CLOSE_PARA,PIPE,COLON,COMMON,UNCOMMON,RARE,EPIC,LEGENDARY,SEEDED,FREE,TILE_AND,UNDERNEATH,CRAWLER,BRANCH,SIDES,OTHERWISE,ENCOUNTER,SMALL,MEDIUM,LARGE,HUGE,ROOM,LENGTH,TILE_LENGTH,CONNECT,CIRCLE,COURT,SQUARE);
}