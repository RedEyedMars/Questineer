package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnimationState extends ConcreteRule {

	public static final IRule parser = new AnimationState();

	public AnimationState(){
		super("animation_state");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					AssociationTokens.NEWTAB,
					new AddTokenParser(
						AssociationTokens.NAME,"animationId"),
					new ManyParser(
							
								new ChainParser(
									DrawableTokens.IMAGE_STATE_CHANGE,
									new AddTokenParser(
										AssociationTokens.NAME,"animationId"))),
					PaymentTokens.COLON,
					new AddTokenParser(
						AssociationTokens.NAME,"animationTypeName"),
					new ManyParser(
							Rules.animation_variable_value)));

	}

}