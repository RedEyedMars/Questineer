package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ImageBraces extends ParseList {

	@Override
	public String getName() {
		return "imageBraces";
	}
	@Override
	public String getSingular() {
		return "imageBrace";
	}

	public static final BracedParser IMAGE_FILE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"image_file_name"),"IMAGE_FILE","imageBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				IMAGE_FILE);
}