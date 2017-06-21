package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AttackElement extends ConcreteRule {

	public static final IRule parser = new AttackElement();

	public AttackElement(){
		super("attack_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					ConditionTokens.NEWLINE,
					Comments.COMMENTS,
					new AddTokenParser(
						
						new ChainParser(
							AttackTokens.RANGE,
							Rules.statRange),"range"),
					new AddTokenParser(
						
						new ChainParser(
							AttackTokens.COOLDOWN,
							Rules.statRange),"cooldown"),
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								new OptionalParser(
									
									new ChoiceParser(
											AttackTokens.BODY_DMG,
											AttackTokens.MIND_DMG)),"dmg_type"),
							AttackTokens.DAMAGE,
							
							new ChoiceParser(
									new AddTokenParser(
										Rules.statRange,"by_stat"),
									GeneralBraces.BODY)),"damage"),
					new AddTokenParser(
						
						new ChainParser(
							AttackTokens.MISS,
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											new ManyParser(
													ConditionTokens.NEWLINE),
											Rules.has_chance,
											new OptionalParser(
													
														new ChainParser(
															GeneralTokens.IF,
															Rules.boolean_statement))),"option"))),"miss")));

	}

}