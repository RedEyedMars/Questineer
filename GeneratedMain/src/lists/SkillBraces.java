package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class SkillBraces extends ParseList {

	@Override
	public String getName() {
		return "skillBraces";
	}
	@Override
	public String getSingular() {
		return "skillBrace";
	}

	public static final BracedParser SKILL_FILE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"skill_file_name"),"SKILL_FILE","skillBraces",",.");
	public static final BracedParser SKILL_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"description"),"SKILL_DESCRIPTION","skillBraces","\n\t,.");

	public static final ChoiceParser parser = new ChoiceParser(
				SKILL_FILE,SKILL_DESCRIPTION);
}