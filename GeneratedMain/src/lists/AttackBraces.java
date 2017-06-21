package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AttackBraces extends ParseList {

	@Override
	public String getName() {
		return "attackBraces";
	}
	@Override
	public String getSingular() {
		return "attackBrace";
	}

	public static final BracedParser ATTACK_FILE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"attack_file_name"),"ATTACK_FILE","attackBraces",",.");
	public static final BracedParser ATTACK_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"description"),"ATTACK_DESCRIPTION","attackBraces","\n\t,.");

	public static final ChoiceParser parser = new ChoiceParser(
				ATTACK_FILE,ATTACK_DESCRIPTION);
}