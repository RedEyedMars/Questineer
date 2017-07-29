package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AssociationTokens extends ParseList {

	@Override
	public String getName() {
		return "associationTokens";
	}
	@Override
	public String getSingular() {
		return "associationToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","associationTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","associationTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","associationTokens","\n");
	public static final ExactParser NEWTAB = new ExactParser("NEWTAB","associationTokens","\n\t");
	public static final ExactParser ASOS = new ExactParser("ASOS","associationTokens","asos");
	public static final ExactParser START = new ExactParser("START","associationTokens","start");
	public static final ExactParser JOIN = new ExactParser("JOIN","associationTokens","join");
	public static final ExactParser ON = new ExactParser("ON","associationTokens","on");
	public static final ExactParser IF = new ExactParser("IF","associationTokens","if");
	public static final ExactParser ASSOCIATION = new ExactParser("ASSOCIATION","associationTokens","association");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,NEWTAB,ASOS,START,JOIN,ON,IF,ASSOCIATION);
}