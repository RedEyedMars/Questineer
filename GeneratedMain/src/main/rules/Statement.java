package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Statement extends ConcreteRule {

	public static final IRule parser = new Statement();

	public Statement(){
		super("statement");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							GeneralTokens.ENTITY,
							GeneralBraces.ENTITY_ID_CHOICE),"entity_selector"),
					new AddTokenParser(
						
						new ChainParser(
							
							new ChoiceParser(
									new ListNameElementParser("map_names"),
									ConditionTokens.STAR),
							GeneralBraces.TILE_ID_CHOICE),"map_selector"),
				new ChainParser(
					new OptionalParser(
							ConditionTokens.NOT),
					Rules.variable_call,
					new ManyParser(
							
								new ChainParser(
									Rules.operator,
									new ManyParser(
											AssociationTokens.NEWLINE),
									Rules.statement)))));

	}

}