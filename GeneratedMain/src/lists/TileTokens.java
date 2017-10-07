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
	public static final ExactParser DASH = new ExactParser("DASH","tileTokens","-");
	public static final ExactParser TILE_IMAGE_ACCESS = new ExactParser("TILE_IMAGE_ACCESS","tileTokens","->");
	public static final ExactParser TILE = new ExactParser("TILE","tileTokens","tile");
	public static final ExactParser DOT = new ExactParser("DOT","tileTokens",".");
	public static final ExactParser PERCENT = new ExactParser("PERCENT","tileTokens","%");
	public static final ExactParser PLUS = new ExactParser("PLUS","tileTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","tileTokens","-");
	public static final ExactParser PIPE = new ExactParser("PIPE","tileTokens","|");
	public static final ExactParser COLON = new ExactParser("COLON","tileTokens",":");
	public static final ExactParser FREE = new ExactParser("FREE","tileTokens","Free");
	public static final ExactParser TILE_AND = new ExactParser("TILE_AND","tileTokens","&");
	public static final ExactParser CIRCLE = new ExactParser("CIRCLE","tileTokens","Circle");
	public static final ExactParser COURT = new ExactParser("COURT","tileTokens","Court");
	public static final ExactParser SQUARE = new ExactParser("SQUARE","tileTokens","Square");
	public static final ExactParser FORESLASH = new ExactParser("FORESLASH","tileTokens","/");
	public static final ExactParser EDGE_EQUALS = new ExactParser("EDGE_EQUALS","tileTokens","==");
	public static final ExactParser EDGE_NOT_EQUALS = new ExactParser("EDGE_NOT_EQUALS","tileTokens","!=");
	public static final ExactParser FLOOR = new ExactParser("FLOOR","tileTokens","Floor");
	public static final ExactParser TERRAIN = new ExactParser("TERRAIN","tileTokens","Terrain");
	public static final ExactParser DENS = new ExactParser("DENS","tileTokens","Dens");
	public static final ExactParser CHESTS = new ExactParser("CHESTS","tileTokens","Chests");
	public static final ExactParser NORTH = new ExactParser("NORTH","tileTokens","North");
	public static final ExactParser EAST = new ExactParser("EAST","tileTokens","East");
	public static final ExactParser SOUTH = new ExactParser("SOUTH","tileTokens","South");
	public static final ExactParser WEST = new ExactParser("WEST","tileTokens","West");
	public static final ExactParser NEIGHBOUR = new ExactParser("NEIGHBOUR","tileTokens","Neighbour");
	public static final ExactParser DIRECTION = new ExactParser("DIRECTION","tileTokens","Direction");
	public static final ExactParser IN = new ExactParser("IN","tileTokens","in");
	public static final ExactParser PASSABLE = new ExactParser("PASSABLE","tileTokens","Passable");
	public static final ExactParser STAR = new ExactParser("STAR","tileTokens","*");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,DASH,TILE_IMAGE_ACCESS,TILE,DOT,PERCENT,PLUS,MINUS,PIPE,COLON,FREE,TILE_AND,CIRCLE,COURT,SQUARE,FORESLASH,EDGE_EQUALS,EDGE_NOT_EQUALS,FLOOR,TERRAIN,DENS,CHESTS,NORTH,EAST,SOUTH,WEST,NEIGHBOUR,DIRECTION,IN,PASSABLE,STAR);
}