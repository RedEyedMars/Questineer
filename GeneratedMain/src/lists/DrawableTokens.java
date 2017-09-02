package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class DrawableTokens extends ParseList {

	@Override
	public String getName() {
		return "drawableTokens";
	}
	@Override
	public String getSingular() {
		return "drawableToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","drawableTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser INTEGER = new RegexParser("INTEGER","drawableTokens","[-]?\\d+");
	public static final RegexParser FLOAT = new RegexParser("FLOAT","drawableTokens","[-]?\\d+\\Q.\\E\\d+");
	public static final RegexParser WILD = new RegexParser("WILD","drawableTokens",".*");
	public static final ExactParser STAR = new ExactParser("STAR","drawableTokens","*");
	public static final ExactParser DRAWABLE_AS_DEFAULT_STATE = new ExactParser("DRAWABLE_AS_DEFAULT_STATE","drawableTokens","*");
	public static final ExactParser IMAGE_STATE_CHANGE = new ExactParser("IMAGE_STATE_CHANGE","drawableTokens","->");
	public static final ExactParser DRAWABLE_X = new ExactParser("DRAWABLE_X","drawableTokens","X");
	public static final ExactParser DRAWABLE_Y = new ExactParser("DRAWABLE_Y","drawableTokens","Y");
	public static final ExactParser DRAWABLE_WIDTH = new ExactParser("DRAWABLE_WIDTH","drawableTokens","Width");
	public static final ExactParser DRAWABLE_HEIGHT = new ExactParser("DRAWABLE_HEIGHT","drawableTokens","Height");
	public static final ExactParser DRAWABLE_ANGLE = new ExactParser("DRAWABLE_ANGLE","drawableTokens","Angle");
	public static final ExactParser DWBS = new ExactParser("DWBS","drawableTokens","dwbs");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","drawableTokens","\n");
	public static final ExactParser DRAWABLE_AMPERSAND = new ExactParser("DRAWABLE_AMPERSAND","drawableTokens","&");
	public static final ExactParser DOT = new ExactParser("DOT","drawableTokens",".");
	public static final ExactParser COMMA = new ExactParser("COMMA","drawableTokens",",");
	public static final ExactParser PLUS = new ExactParser("PLUS","drawableTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","drawableTokens","-");
	public static final ExactParser DIVIDE = new ExactParser("DIVIDE","drawableTokens","/");
	public static final ExactParser MULTIPLY = new ExactParser("MULTIPLY","drawableTokens","*");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,INTEGER,FLOAT,WILD,STAR,DRAWABLE_AS_DEFAULT_STATE,IMAGE_STATE_CHANGE,DRAWABLE_X,DRAWABLE_Y,DRAWABLE_WIDTH,DRAWABLE_HEIGHT,DRAWABLE_ANGLE,DWBS,NEWLINE,DRAWABLE_AMPERSAND,DOT,COMMA,PLUS,MINUS,DIVIDE,MULTIPLY);
}