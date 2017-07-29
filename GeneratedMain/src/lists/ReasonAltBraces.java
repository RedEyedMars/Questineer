package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ReasonAltBraces extends ParseList {

	@Override
	public String getName() {
		return "reasonAltBraces";
	}
	@Override
	public String getSingular() {
		return "reasonAltBrace";
	}

	public static final CharitableBracedParser REASON_NAME = new CharitableBracedParser(
							AssociationTokens.WILD,"REASON_NAME","reasonAltBraces",",\n");

	public static final ChoiceParser parser = new ChoiceParser(
				REASON_NAME);
}