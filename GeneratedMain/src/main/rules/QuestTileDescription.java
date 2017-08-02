package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class QuestTileDescription extends ConcreteRule {

	public static final IRule parser = new QuestTileDescription();

	public QuestTileDescription(){
		super("quest_tile_description");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new ListNameElementParser("map_names"),
					QuestBraces.TILE_NAME_SELECT,
					GeneralTokens.ORDINAL,
					GeneralTokens.INTEGER));

	}

}