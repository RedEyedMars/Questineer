package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnimationVariableValue extends ConcreteRule {

	public static final IRule parser = new AnimationVariableValue();

	public AnimationVariableValue(){
		super("animation_variable_value");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AnimationTokens.INTEGER,
					AnimationTokens.FLOAT,
					new AddTokenParser(
						AnimationBraces.QUOTE,"quote")));

	}

}