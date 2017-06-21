package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class TraitBraces extends ParseList {

	@Override
	public String getName() {
		return "traitBraces";
	}
	@Override
	public String getSingular() {
		return "traitBrace";
	}

	public static final BracedParser TRAITS_FILE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"trait_file_name"),"TRAITS_FILE","traitBraces",",.");
	public static final BracedParser TRAIT_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"description"),"TRAIT_DESCRIPTION","traitBraces","\n\t,.");

	public static final ChoiceParser parser = new ChoiceParser(
				TRAITS_FILE,TRAIT_DESCRIPTION);
}