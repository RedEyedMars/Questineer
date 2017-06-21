package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class StatImposition extends ConcreteRule {

	public static final IRule parser = new StatImposition();

	public StatImposition(){
		super("stat_imposition");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.variable_call,
					
					new ChoiceParser(
						new ChainParser(
							new AddTokenParser(
								GeneralTokens.IMPOSE,"operator"),
							new AddTokenParser(
								GeneralTokens.INTEGER,"amount"),
							GeneralTokens.ON,
							new ListNameElementParser("hero_stats")),
						new ChainParser(
							new AddTokenParser(
								GeneralTokens.RELEASE,"operator"),
							new ListNameElementParser("hero_stats")))));

	}

}