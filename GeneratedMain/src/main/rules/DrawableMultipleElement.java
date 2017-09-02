package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DrawableMultipleElement extends ConcreteRule {

	public static final IRule parser = new DrawableMultipleElement();

	public DrawableMultipleElement(){
		super("drawable_multiple_element");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					AssociationTokens.NEWTAB,
					new AddTokenParser(
						AssociationTokens.NAME,"drawableName"),
					
					new ChoiceParser(
							DrawableTokens.DRAWABLE_AS_DEFAULT_STATE,
							new MultipleParser(
									
										new ChainParser(
											DrawableTokens.IMAGE_STATE_CHANGE,
											new AddTokenParser(
												AssociationTokens.NAME,"newStateName")))),
					new AddTokenParser(
						
						new ChainParser(
							DrawableBraces.DRAWABLE_DIMENSIONS,
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											Rules.drawable_arthmetic_operator,
											Rules.drawable_multiple_value),"supplementary"))),"position"),
					new AddTokenParser(
						
						new ChainParser(
							DrawableBraces.DRAWABLE_DIMENSIONS,
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											Rules.drawable_arthmetic_operator,
											Rules.drawable_multiple_value),"supplementary"))),"dimensions"),
					DrawableTokens.DRAWABLE_AMPERSAND,
					new OptionalParser(
							new AddTokenParser(
								
								new ChainParser(
									DrawableBraces.DRAWABLE_DIMENSIONS,
									new ManyParser(
											new AddTokenParser(
												
												new ChainParser(
													Rules.drawable_arthmetic_operator,
													Rules.drawable_multiple_value),"supplementary"))),"rotation")),
					DrawableTokens.DRAWABLE_AMPERSAND,
					new AddTokenParser(
						
						new ChainParser(
							Rules.drawable_multiple_value,
							new ManyParser(
									
										new ChainParser(
											Rules.drawable_arthmetic_operator,
											Rules.drawable_multiple_value))),"angle")));

	}

}