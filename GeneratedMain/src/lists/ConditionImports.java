package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ConditionImports extends ParseList {

	@Override
	public String getName() {
		return "conditionImports";
	}
	@Override
	public String getSingular() {
		return "conditionImport";
	}

	public static final ImportParser IMPORT_CONDITION = new ImportParser(
						new ChainParser(
							ConditionBraces.CONDITION_FILE,
							ConditionTokens.CNDS),"IMPORT_CONDITION","conditionImports","><<\"entities/mods/conditions/\",condition_file_name,\".cnds\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											ConditionTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.condition_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_CONDITION);
}