package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class SkillImports extends ParseList {

	@Override
	public String getName() {
		return "skillImports";
	}
	@Override
	public String getSingular() {
		return "skillImport";
	}

	public static final ImportParser IMPORT_SKILL = new ImportParser(
						new ChainParser(
							SkillBraces.SKILL_FILE,
							SkillTokens.SKLS),"IMPORT_SKILL","skillImports","><<\"entities/behaviours/skills/\",skill_file_name,\".skls\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.skill_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_SKILL);
}