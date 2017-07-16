package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AttackImports extends ParseList {

	@Override
	public String getName() {
		return "attackImports";
	}
	@Override
	public String getSingular() {
		return "attackImport";
	}

	public static final ImportParser IMPORT_ATTACK = new ImportParser(
						new ChainParser(
							AttackBraces.ATTACK_FILE,
							AttackTokens.ATKS),"IMPORT_ATTACK","attackImports","><<\"entities/skills/attacks/\",attack_file_name,\".atks\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											ConditionTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.attack_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_ATTACK);
}