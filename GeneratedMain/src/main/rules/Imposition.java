package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Imposition extends ConcreteRule {

	public static final IRule parser = new Imposition();

	public Imposition(){
		super("imposition");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.IMPOSE,"operator"),
					new AddTokenParser(
						GeneralTokens.INTEGER,"amount"),
					AssociationTokens.ON,
					new ListNameElementParser("hero_stats")),
				new ChainParser(
					new AddTokenParser(
						GeneralTokens.RELEASE,"operator"),
					new ListNameElementParser("hero_stats")),
				new ChainParser(
					new AddTokenParser(
						new MultipleParser(
							
							new ChoiceParser(
									ConditionTokens.PLUS,
									ConditionTokens.MINUS)),"operator"),
					new ListNameElementParser("hero_stats"))));

	}

}