package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class QuestImports extends ParseList {

	@Override
	public String getName() {
		return "questImports";
	}
	@Override
	public String getSingular() {
		return "questImport";
	}

	public static final ImportParser IMPORT_QUEST = new ImportParser(
						new ChainParser(
							QuestBraces.QUEST_FILE,
							QuestTokens.QSTS),"IMPORT_QUEST","questImports","><<\"entities/behaviours/quests/\",quest_file_name,\".qsts\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.quest_type_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_QUEST);
}