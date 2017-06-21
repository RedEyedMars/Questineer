package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TraitAcquisition extends ConcreteRule {

	public static final IRule parser = new TraitAcquisition();

	public TraitAcquisition(){
		super("trait_acquisition");
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
							new ListNameElementParser("trait_names")),
					new OptionalParser(
							
								new ChainParser(
									GeneralTokens.FROM,
									new AddTokenParser(
										ImageTokens.NAME,"source_name")))));

	}

}