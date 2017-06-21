package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GeneralTokens extends ParseList {

	@Override
	public String getName() {
		return "generalTokens";
	}
	@Override
	public String getSingular() {
		return "generalToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","generalTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser FLOAT = new RegexParser("FLOAT","generalTokens","[-]?\\d*\\Q.\\E\\d+");
	public static final RegexParser INTEGER = new RegexParser("INTEGER","generalTokens","[-]?\\d+");
	public static final RegexParser WILD = new RegexParser("WILD","generalTokens",".*");
	public static final RegexParser ORDINAL = new RegexParser("ORDINAL","generalTokens","[<>][=]?");
	public static final ExactParser COLON = new ExactParser("COLON","generalTokens",":");
	public static final ExactParser SEMICOLON = new ExactParser("SEMICOLON","generalTokens",";");
	public static final ExactParser DOTDOT = new ExactParser("DOTDOT","generalTokens","..");
	public static final ExactParser ACCESS = new ExactParser("ACCESS","generalTokens","->");
	public static final ExactParser DOT = new ExactParser("DOT","generalTokens",".");
	public static final ExactParser IF = new ExactParser("IF","generalTokens","if");
	public static final ExactParser ELSE = new ExactParser("ELSE","generalTokens","else");
	public static final ExactParser EQUALSIGN = new ExactParser("EQUALSIGN","generalTokens","=");
	public static final ExactParser EQUALS = new ExactParser("EQUALS","generalTokens","==");
	public static final ExactParser NOTEQUALS = new ExactParser("NOTEQUALS","generalTokens","!=");
	public static final ExactParser PLUS = new ExactParser("PLUS","generalTokens","+");
	public static final ExactParser MINUS = new ExactParser("MINUS","generalTokens","-");
	public static final ExactParser MULTIPLY = new ExactParser("MULTIPLY","generalTokens","*");
	public static final ExactParser DIVIDE = new ExactParser("DIVIDE","generalTokens","/");
	public static final ExactParser AND = new ExactParser("AND","generalTokens","&");
	public static final ExactParser OR = new ExactParser("OR","generalTokens","|");
	public static final ExactParser NOT = new ExactParser("NOT","generalTokens","!");
	public static final ExactParser PERCENT = new ExactParser("PERCENT","generalTokens","%");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","generalTokens","\n");
	public static final ExactParser COMMA = new ExactParser("COMMA","generalTokens",",");
	public static final ExactParser DASH = new ExactParser("DASH","generalTokens","-");
	public static final ExactParser TRUE = new ExactParser("TRUE","generalTokens","true");
	public static final ExactParser FALSE = new ExactParser("FALSE","generalTokens","false");
	public static final ExactParser NULL = new ExactParser("NULL","generalTokens","null");
	public static final ExactParser CHANCE = new ExactParser("CHANCE","generalTokens","chance");
	public static final ExactParser GAINS = new ExactParser("GAINS","generalTokens","gains");
	public static final ExactParser LOSES = new ExactParser("LOSES","generalTokens","loses");
	public static final ExactParser FROM = new ExactParser("FROM","generalTokens","from");
	public static final ExactParser THIS = new ExactParser("THIS","generalTokens","this");
	public static final ExactParser ON = new ExactParser("ON","generalTokens","on");
	public static final ExactParser IMPOSE = new ExactParser("IMPOSE","generalTokens","impose");
	public static final ExactParser RELEASE = new ExactParser("RELEASE","generalTokens","release");
	public static final ExactParser HAS = new ExactParser("HAS","generalTokens","has");
	public static final ExactParser RETURN = new ExactParser("RETURN","generalTokens","return");
	public static final ExactParser NEW = new ExactParser("NEW","generalTokens","new");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,FLOAT,INTEGER,WILD,ORDINAL,COLON,SEMICOLON,DOTDOT,ACCESS,DOT,IF,ELSE,EQUALSIGN,EQUALS,NOTEQUALS,PLUS,MINUS,MULTIPLY,DIVIDE,AND,OR,NOT,PERCENT,NEWLINE,COMMA,DASH,TRUE,FALSE,NULL,CHANCE,GAINS,LOSES,FROM,THIS,ON,IMPOSE,RELEASE,HAS,RETURN,NEW);
}