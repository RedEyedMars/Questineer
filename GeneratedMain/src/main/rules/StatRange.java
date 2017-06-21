package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class StatRange extends ConcreteRule {

	public static final IRule parser = new StatRange();

	public StatRange(){
		super("statRange");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
				new ChainParser(
					Rules.range,
					new OptionalParser(
							new ListNameElementParser("hero_stats")),
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									
									new ChoiceParser(
											GeneralTokens.COMMA,
											ConditionTokens.PLUS),
									Rules.range,
									new OptionalParser(
											new ListNameElementParser("hero_stats"))),"extra"))));

	}

}