package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class VariableCall extends ConcreteRule {

	public static final IRule parser = new VariableCall();

	public VariableCall(){
		super("variable_call");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new AddTokenParser(
						Rules.range,"range"),
					new ManyParser(
							
							new ChoiceParser(
								new ChainParser(
									GeneralTokens.ACCESS,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName")),
								new ChainParser(
									DrawableTokens.DOT,
									Rules.method)))),
					new AddTokenParser(
						
					new ChoiceParser(
							GeneralTokens.TRUE,
							GeneralTokens.FALSE,
							GeneralTokens.NULL,
							AnimationTokens.FLOAT,
							AnimationTokens.INTEGER),"exact"),
				new ChainParser(
					Rules.variable_call_element,
					new ManyParser(
							
							new ChoiceParser(
								new ChainParser(
									GeneralTokens.ACCESS,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName")),
								new ChainParser(
									DrawableTokens.DOT,
									Rules.method))))));

	}

}