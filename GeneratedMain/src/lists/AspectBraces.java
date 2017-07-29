package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AspectBraces extends ParseList {

	@Override
	public String getName() {
		return "aspectBraces";
	}
	@Override
	public String getSingular() {
		return "aspectBrace";
	}

	public static final BracedParser ASPECT_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"aspect_file_name"),"ASPECT_FILE","aspectBraces",",.");
	public static final BracedParser ASPECT_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"description"),"ASPECT_DESCRIPTION","aspectBraces","\n\t,.");

	public static final ChoiceParser parser = new ChoiceParser(
				ASPECT_FILE,ASPECT_DESCRIPTION);
}