package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnitContinuationOperator extends ConcreteRule {

	public static final IRule parser = new AnitContinuationOperator();

	public AnitContinuationOperator(){
		super("anit_continuation_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AnimationTokens.ANIT_AND,
					AnimationTokens.ANIT_OR));

	}

}