package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DrawableMultipleValue extends ConcreteRule {

	public static final IRule parser = new DrawableMultipleValue();

	public DrawableMultipleValue(){
		super("drawable_multiple_value");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					DrawableTokens.DRAWABLE_X,
					DrawableTokens.DRAWABLE_Y,
					DrawableTokens.DRAWABLE_WIDTH,
					DrawableTokens.DRAWABLE_HEIGHT,
					DrawableTokens.DRAWABLE_ANGLE,
					AnimationTokens.FLOAT,
					AnimationTokens.INTEGER));

	}

}