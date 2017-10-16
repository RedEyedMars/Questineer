package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AreaElement extends ConcreteRule {

	public static final IRule parser = new AreaElement();

	public AreaElement(){
		super("area_element");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							MapTokens.ENTRY,
							new ListNameElementParser("tile_names"),
							new ManyParser(
									
										new ChainParser(
											EntityTokens.PIPE,
											new ListNameElementParser("tile_names"))),
							new OptionalParser(
									new AddTokenParser(
										
										new ChainParser(
											new AddTokenParser(
												AnimationTokens.INTEGER,"lowerBound"),
											new OptionalParser(
													
														new ChainParser(
															PaymentTokens.DASH,
															new AddTokenParser(
																AnimationTokens.INTEGER,"upperBound"))),
											MapTokens.EXITS),"range"))),"entryPointGeneration"),
				new ChainParser(
					MapTokens.PATCHES,
					MapBraces.PATCH_PROBABILITY,
					PaymentTokens.COLON,
					new ManyParser(
							
								new ChainParser(
									MapTokens.NEWTABTABTAB,
									Rules.patch_element)))));

	}

}