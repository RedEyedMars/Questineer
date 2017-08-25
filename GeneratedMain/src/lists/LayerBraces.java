package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class LayerBraces extends ParseList {

	@Override
	public String getName() {
		return "layerBraces";
	}
	@Override
	public String getSingular() {
		return "layerBrace";
	}

	public static final BracedParser LAYER_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"layer_file_name"),"LAYER_FILE","layerBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				LAYER_FILE);
}