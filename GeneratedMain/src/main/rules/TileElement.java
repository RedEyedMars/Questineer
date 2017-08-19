package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileElement extends ConcreteRule {

	public static final IRule parser = new TileElement();

	public TileElement(){
		super("tile_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
				new ChainParser(
					new ManyParser(
							AssociationTokens.NEWLINE),
					Comments.COMMENTS),
				new ChainParser(
					AssociationTokens.NEWTAB,
					new AddTokenParser(
						
						new ChainParser(
							TileTokens.CONNECT,
							new ListNameElementParser("tile_names"),
							new OptionalParser(
									
										new ChainParser(
											PaymentTokens.COLON,
											Rules.tile_cost,
											new ManyParser(
													
														new ChainParser(
															EntityTokens.PIPE,
															Rules.tile_cost))))),"connection")),
				new ChainParser(
					AssociationTokens.NEWTAB,
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								
							new ChoiceParser(
									TileTokens.COMMON,
									TileTokens.UNCOMMON,
									TileTokens.RARE,
									TileTokens.EPIC,
									TileTokens.LEGENDARY,
									TileTokens.SEEDED),"rarity"),
							new OptionalParser(
									
										new ChainParser(
											PaymentTokens.COLON,
											Rules.tile_cost,
											new ManyParser(
													
														new ChainParser(
															EntityTokens.PIPE,
															Rules.tile_cost))))),"rate")),
				new ChainParser(
					AssociationTokens.NEWTAB,
					new AddTokenParser(
						
						new ChainParser(
							TileTokens.CRAWLER,
							new MultipleParser(
									Rules.crawler_element)),"crawler")),
				new ChainParser(
					AssociationTokens.NEWTAB,
					new AddTokenParser(
						
						new ChainParser(
							new MultipleParser(
									
									new ChoiceParser(
											ConditionTokens.PLUS,
											ConditionTokens.MINUS)),
							Rules.entity_declaration),"entity")),
					new MultipleParser(
							AssociationTokens.NEWLINE)));

	}

}