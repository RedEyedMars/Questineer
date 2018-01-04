package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class StatRange extends ConcreteRule {

	public static final IRule parser = new StatRange();

	public StatRange(){
		super("stat_range");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					GeneralBraces.BRACED_STATEMENT,
					new OptionalParser(
							new ListNameElementParser("hero_stats")),
					new OptionalParser(
							
								new ChainParser(
									new AddTokenParser(
										
									new ChoiceParser(
											ConditionTokens.PLUS,
											DrawableTokens.MULTIPLY,
											DrawableTokens.DIVIDE,
											ConditionTokens.MINUS),"operator"),
									Rules.stat_range))),
				new ChainParser(
					new AddTokenParser(
						Rules.num,"left"),
					new OptionalParser(
							
								new ChainParser(
									
									new ChoiceParser(
											PaymentTokens.DASH,
											GeneralTokens.DOTDOT),
									new AddTokenParser(
										Rules.num,"right"))),
					new OptionalParser(
							new AddTokenParser(
								GeneralTokens.PERCENT,"percent")),
					new OptionalParser(
							new ListNameElementParser("hero_stats")),
					new OptionalParser(
							
								new ChainParser(
									new AddTokenParser(
										
									new ChoiceParser(
											ConditionTokens.PLUS,
											DrawableTokens.MULTIPLY,
											DrawableTokens.DIVIDE,
											ConditionTokens.MINUS),"operator"),
									Rules.stat_range)))));

	}

}