package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnitArithmeticOperator extends ConcreteRule {

	public static final IRule parser = new AnitArithmeticOperator();

	public AnitArithmeticOperator(){
		super("anit_arithmetic_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AnimationTokens.ANIT_PLUS,
					AnimationTokens.ANIT_MINUS,
					AnimationTokens.ANIT_DIVIDE,
					AnimationTokens.ANIT_MULTIPLY));

	}

}