package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnimationTypeBoolean extends ConcreteRule {

	public static final IRule parser = new AnimationTypeBoolean();

	public AnimationTypeBoolean(){
		super("animation_type_boolean");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"leftName"),
					Rules.anit_boolean_operator,
					new AddTokenParser(
						
					new ChoiceParser(
							AnimationTokens.INTEGER,
							AnimationTokens.FLOAT,
							AssociationTokens.NAME,
							AnimationBraces.ANIMATION_TYPE_FRAME_DATA),"value"),
					new ManyParser(
							
								new ChainParser(
									Rules.anit_arithmetic_operator,
									new AddTokenParser(
										
									new ChoiceParser(
											AnimationTokens.INTEGER,
											AnimationTokens.FLOAT,
											AssociationTokens.NAME,
											AnimationBraces.ANIMATION_TYPE_FRAME_DATA),"value")))));

	}

}