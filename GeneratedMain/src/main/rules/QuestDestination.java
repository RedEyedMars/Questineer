package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class QuestDestination extends ConcreteRule {

	public static final IRule parser = new QuestDestination();

	public QuestDestination(){
		super("quest_destination");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					QuestTokens.GOTO,
					
						new ChainParser(
							Rules.quest_tile_description,
							new ManyParser(
									
										new ChainParser(
											QuestTokens.QUEST_OR,
											Rules.quest_tile_description))),
					QuestTokens.REACHED,
					GeneralBraces.BODY));

	}

}