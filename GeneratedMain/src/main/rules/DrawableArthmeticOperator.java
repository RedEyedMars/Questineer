package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DrawableArthmeticOperator extends ConcreteRule {

	public static final IRule parser = new DrawableArthmeticOperator();

	public DrawableArthmeticOperator(){
		super("drawable_arthmetic_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					ConditionTokens.PLUS,
					ConditionTokens.MINUS,
					DrawableTokens.DIVIDE,
					DrawableTokens.MULTIPLY));

	}

}