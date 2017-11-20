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
								AssociationTokens.WILD,"image_file_name"),"IMAGE_FILE","imageBraces",",.");
	public static final BracedParser ANIMATION_ID_FLIP = new BracedParser(
						new ChainParser(
							new AddTokenParser(
								AssociationTokens.NAME,"normal"),
							EntityTokens.PIPE,
							new AddTokenParser(
								AssociationTokens.NAME,"reverse")),"ANIMATION_ID_FLIP","imageBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				IMAGE_FILE,ANIMATION_ID_FLIP);
}