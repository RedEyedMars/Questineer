package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class CrawlerElement extends ConcreteRule {

	public static final IRule parser = new CrawlerElement();

	public CrawlerElement(){
		super("crawler_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
				new ChainParser(
					ConditionTokens.NEWTABTAB,
					TileTokens.TILE_LENGTH,
					new AddTokenParser(
						Rules.range,"length")),
				new ChainParser(
					ConditionTokens.NEWTABTAB,
					TileTokens.BRANCH,
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									
										new ChainParser(
											new AddTokenParser(
												AnimationTokens.INTEGER,"sides"),
											TileTokens.SIDES)),
							new MultipleParser(
									Rules.branch_element)),"branch")),
				new ChainParser(
					ConditionTokens.NEWTABTAB,
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								
									TileTokens.ENCOUNTER,"eventName"),
							GeneralBraces.BODY),"event")),
				new ChainParser(
					ConditionTokens.NEWTABTAB,
					new AddTokenParser(
						
						new ChainParser(
							TileBraces.TILE_CRAWLER_TYPE,
							
							new ChoiceParser(
									TileTokens.OTHERWISE,
								new ChainParser(
									new AddTokenParser(
										Rules.num,"chance"),
									GeneralTokens.PERCENT))),"generate_shape"))));

	}

}