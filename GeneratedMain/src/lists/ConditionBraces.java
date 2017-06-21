package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ConditionBraces extends ParseList {

	@Override
	public String getName() {
		return "conditionBraces";
	}
	@Override
	public String getSingular() {
		return "conditionBrace";
	}

	public static final BracedParser CONDITION_FILE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"condition_file_name"),"CONDITION_FILE","conditionBraces",",.");
	public static final BracedParser CONDITION_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"description"),"CONDITION_DESCRIPTION","conditionBraces","\n\t,.");

	public static final ChoiceParser parser = new ChoiceParser(
				CONDITION_FILE,CONDITION_DESCRIPTION);
}