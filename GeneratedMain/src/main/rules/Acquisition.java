package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Acquisition extends ConcreteRule {

	public static final IRule parser = new Acquisition();

	public Acquisition(){
		super("acquisition");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						
					new ChoiceParser(
							GeneralTokens.GAINS,
							GeneralTokens.LOSES,
							new AddTokenParser(
								ConditionTokens.PLUS,"GAINS"),
							new AddTokenParser(
								ConditionTokens.MINUS,"LOSES")),"operator"),
					
					new ChoiceParser(
							GeneralTokens.THIS,
							new ListNameElementParser("aspect_names"),
							new ListNameElementParser("condition_names"),
							new ListNameElementParser("trait_names"),
							new ListNameElementParser("attack_names")),
					new OptionalParser(
							
								new ChainParser(
									GeneralTokens.FROM,
									new AddTokenParser(
										ConditionTokens.NAME,"source_name")))));

	}

}