package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ItemParameter extends ConcreteRule {

	public static final IRule parser = new ItemParameter();

	public ItemParameter(){
		super("item_parameter");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
				new ChainParser(
					ItemTokens.HP,
					new AddTokenParser(
						Rules.statRange,"hp")),
				new ChainParser(
					ItemTokens.DMG,
					new AddTokenParser(
						Rules.statRange,"attack")),
				new ChainParser(
					ItemTokens.DEF,
					new AddTokenParser(
						Rules.statRange,"defense")),
				new ChainParser(
					ItemTokens.VAL,
					new AddTokenParser(
						Rules.statRange,"value")),
				new ChainParser(
					ItemTokens.WEI,
					new AddTokenParser(
						Rules.statRange,"weight")),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("event_names"),
							new OptionalParser(
									Rules.animation),
							GeneralBraces.BODY),"event"),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("aspect_names"),
							new OptionalParser(
									
										new ChainParser(
											AssociationTokens.IF,
											Rules.boolean_statement))),"gain_aspect"),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("trait_names"),
							new OptionalParser(
									
										new ChainParser(
											AssociationTokens.IF,
											Rules.boolean_statement))),"gain_trait"),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("attack_names"),
							new OptionalParser(
									
										new ChainParser(
											AssociationTokens.IF,
											Rules.boolean_statement))),"gain_attack")));

	}

}