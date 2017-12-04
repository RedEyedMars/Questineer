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
					AnimationBraces.ANIMATION_TYPE_COORDINATE_VARIABLE,
					AnimationBraces.ANIMATION_TYPE_FLIP_VARIABLE,
					AnimationBraces.ANIMATION_TYPE_SQUARE_VARIABLE,
					Rules.animation_variable_value_basic));

	}

}