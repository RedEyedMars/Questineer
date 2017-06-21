package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AspectAcquisition extends ConcreteRule {

	public static final IRule parser = new AspectAcquisition();

	public AspectAcquisition(){
		super("aspect_acquisition");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.variable_call,
					new AddTokenParser(
						
					new ChoiceParser(
							GeneralTokens.GAINS,
							GeneralTokens.LOSES),"operator"),
					
					new ChoiceParser(
							GeneralTokens.THIS,
							new ListNameElementParser("aspect_names"),
							new ListNameElementParser("trait_names"),
							new ListNameElementParser("attack_names")),
					new OptionalParser(
							
								new ChainParser(
									GeneralTokens.FROM,
									new AddTokenParser(
										ImageTokens.NAME,"source_name")))));

	}

}