package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ColourBraces extends ParseList {

	@Override
	public String getName() {
		return "colourBraces";
	}
	@Override
	public String getSingular() {
		return "colourBrace";
	}

	public static final BracedParser COLOUR_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"colour_file_name"),"COLOUR_FILE","colourBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				COLOUR_FILE);
}