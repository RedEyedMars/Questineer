package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ConditionElement extends ConcreteRule {

	public static final IRule parser = new ConditionElement();

	public ConditionElement(){
		super("condition_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					AssociationTokens.NEWLINE,
					Comments.COMMENTS,
				new ChainParser(
					ConditionTokens.REQUIRE,
					Rules.requirement),
					new AddTokenParser(
						
						new ChainParser(
							ConditionTokens.LOSS,
							new AddTokenParser(
								
								new ChainParser(
									Rules.has_chance,
									new OptionalParser(
											
												new ChainParser(
													AssociationTokens.IF,
													Rules.boolean_statement))),"chance_pair"),
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											ConditionTokens.NEWTABTAB,
											Rules.has_chance,
											new OptionalParser(
													
														new ChainParser(
															AssociationTokens.IF,
															Rules.boolean_statement))),"chance_pair"))),"to_lose"),
					new AddTokenParser(
						
						new ChainParser(
							
							new ChoiceParser(
									ConditionTokens.STAR,
									ConditionTokens.ACCUMULATE),
							
							new ChoiceParser(
									Rules.imposition,
									Rules.acquisition)),"accumulation"),
					Rules.imposition,
					Rules.acquisition,
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("event_names"),
							new OptionalParser(
									Rules.animation),
							GeneralBraces.BODY),"event")));

	}

}