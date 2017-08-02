package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class SupportBraces extends ParseList {

	@Override
	public String getName() {
		return "supportBraces";
	}
	@Override
	public String getSingular() {
		return "supportBrace";
	}

	public static final BracedParser SUPPORT_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"support_file_name"),"SUPPORT_FILE","supportBraces",",.");
	public static final BracedParser SUPPORT_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"description"),"SUPPORT_DESCRIPTION","supportBraces","\n\t,;;");

	public static final ChoiceParser parser = new ChoiceParser(
				SUPPORT_FILE,SUPPORT_DESCRIPTION);
}