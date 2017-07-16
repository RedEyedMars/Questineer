package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class MapBraces extends ParseList {

	@Override
	public String getName() {
		return "mapBraces";
	}
	@Override
	public String getSingular() {
		return "mapBrace";
	}

	public static final BracedParser MAP_FILE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"map_file_name"),"MAP_FILE","mapBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				MAP_FILE);
}