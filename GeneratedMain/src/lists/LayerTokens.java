package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class LayerTokens extends ParseList {

	@Override
	public String getName() {
		return "layerTokens";
	}
	@Override
	public String getSingular() {
		return "layerToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","layerTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","layerTokens",".*");
	public static final ExactParser NEWLINE = new ExactParser("NEWLINE","layerTokens","\n");
	public static final ExactParser LAYERS = new ExactParser("LAYERS","layerTokens","layers");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,NEWLINE,LAYERS);
}