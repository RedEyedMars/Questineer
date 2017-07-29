package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ReasonBraces extends ParseList {

	@Override
	public String getName() {
		return "reasonBraces";
	}
	@Override
	public String getSingular() {
		return "reasonBrace";
	}

	public static final BracedParser REASON_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"reason_file_name"),"REASON_FILE","reasonBraces",",.");
	public static final BracedParser REASON_DESCRIPTION = new BracedParser(
							new MultipleParser(
									
									new ChoiceParser(
										new ChainParser(
											ReasonTokens.VAR,
											new AddTokenParser(
												Rules.num,"variableIndex")),
											new AddTokenParser(
												ReasonTokens.NON_VAR,"description"))),"REASON_DESCRIPTION","reasonBraces","\n\t,;;");

	public static final ChoiceParser parser = new ChoiceParser(
				REASON_FILE,REASON_DESCRIPTION);
}