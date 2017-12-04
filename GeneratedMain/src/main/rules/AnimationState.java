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
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								AssociationTokens.NAME,"animationId"),
							ImageBraces.ANIMATION_SUB_STATES),"parentState"),
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								AssociationTokens.NAME,"animationId"),
							new OptionalParser(
									
										new ChainParser(
											EntityTokens.PIPE,
											new AddTokenParser(
												AssociationTokens.NAME,"flipAnimationId"))),
							PaymentTokens.COLON,
							new AddTokenParser(
								AssociationTokens.NAME,"animationTypeName"),
							new ManyParser(
									Rules.animation_variable_value)),"finalState")));

	}

}