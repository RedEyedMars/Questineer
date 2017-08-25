package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class DrawableBraces extends ParseList {

	@Override
	public String getName() {
		return "drawableBraces";
	}
	@Override
	public String getSingular() {
		return "drawableBrace";
	}

	public static final BracedParser DRAWABLE_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"drawable_file_name"),"DRAWABLE_FILE","drawableBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				DRAWABLE_FILE);
}