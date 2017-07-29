package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AssociationBraces extends ParseList {

	@Override
	public String getName() {
		return "associationBraces";
	}
	@Override
	public String getSingular() {
		return "associationBrace";
	}

	public static final BracedParser ASSOCIATION_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"association_file_name"),"ASSOCIATION_FILE","associationBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				ASSOCIATION_FILE);
}