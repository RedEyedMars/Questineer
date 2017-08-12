package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileCost extends ConcreteRule {

	public static final IRule parser = new TileCost();

	public TileCost(){
		super("tile_cost");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					TileTokens.FREE,
				new ChainParser(
					new OptionalParser(
							new AddTokenParser(
								GeneralTokens.INTEGER,"payment")),
					new AddTokenParser(
						
					new ChoiceParser(
							new ListNameElementParser("payment_long_type_names"),
							new ListNameElementParser("payment_short_type_names"),
							new ListNameElementParser("item_names")),"paymentType"),
					new AddTokenParser(
						
					new ChoiceParser(
							ConditionTokens.PLUS,
							ConditionTokens.MINUS),"operator"),
					new AddTokenParser(
						Rules.num,"amount"),
					GeneralTokens.PERCENT,
					GeneralTokens.IN,
					new AddTokenParser(
						Rules.num,"radius"),
					TileTokens.ARRR,
					new OptionalParser(
							
								new ChainParser(
									TileTokens.TILE_AND,
									Rules.tile_cost))),
				new ChainParser(
					new OptionalParser(
							new AddTokenParser(
								GeneralTokens.INTEGER,"payment")),
					new AddTokenParser(
						
					new ChoiceParser(
							new ListNameElementParser("payment_long_type_names"),
							new ListNameElementParser("payment_short_type_names"),
							new ListNameElementParser("item_names")),"paymentType"),
					new OptionalParser(
							
								new ChainParser(
									TileTokens.TILE_AND,
									Rules.tile_cost)))));

	}

}