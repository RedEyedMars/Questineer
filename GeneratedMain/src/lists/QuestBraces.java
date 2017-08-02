package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class QuestBraces extends ParseList {

	@Override
	public String getName() {
		return "questBraces";
	}
	@Override
	public String getSingular() {
		return "questBrace";
	}

	public static final BracedParser TILE_NAME_SELECT = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"tileName"),"TILE_NAME_SELECT","questBraces","[,]");
	public static final BracedParser QUEST_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"quest_file_name"),"QUEST_FILE","questBraces",",.");
	public static final BracedParser QUEST_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"description"),"QUEST_DESCRIPTION","questBraces","\n\t,;;");

	public static final ChoiceParser parser = new ChoiceParser(
				TILE_NAME_SELECT,QUEST_FILE,QUEST_DESCRIPTION);
}