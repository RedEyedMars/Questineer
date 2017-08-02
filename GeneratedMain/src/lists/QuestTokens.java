package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class QuestTokens extends ParseList {

	@Override
	public String getName() {
		return "questTokens";
	}
	@Override
	public String getSingular() {
		return "questToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","questTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","questTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","questTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","questTokens","\n\t");
	public static final ExactParser QSTS = new ExactParser("QSTS","questTokens","qsts");
	public static final ExactParser QUEST = new ExactParser("QUEST","questTokens","quest");
	public static final ExactParser COMMA = new ExactParser("COMMA","questTokens",",");
	public static final ExactParser TYPE = new ExactParser("TYPE","questTokens","type");
	public static final ExactParser GOTO = new ExactParser("GOTO","questTokens","goto");
	public static final ExactParser REACHED = new ExactParser("REACHED","questTokens","reach");
	public static final ExactParser QUEST_OR = new ExactParser("QUEST_OR","questTokens","|");
	public static final ExactParser START = new ExactParser("START","questTokens","start");
	public static final ExactParser LISTEN = new ExactParser("LISTEN","questTokens","listen");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,QSTS,QUEST,COMMA,TYPE,GOTO,REACHED,QUEST_OR,START,LISTEN);
}