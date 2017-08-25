package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class BooleanOperator extends ConcreteRule {

	public static final IRule parser = new BooleanOperator();

	public BooleanOperator(){
		super("boolean_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AnimationTokens.ANIT_ISEQUAL,
					AnimationTokens.ANIT_ISNOTEQUAL,
					AnimationTokens.ANIT_LESSTHAN,
					AnimationTokens.ANIT_GREATERTHAN,
					AnimationTokens.ANIT_LESSOREQUAL,
					AnimationTokens.ANIT_GREATEROREQUAL));

	}

}