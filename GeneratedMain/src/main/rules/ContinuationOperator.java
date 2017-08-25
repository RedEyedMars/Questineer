package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ContinuationOperator extends ConcreteRule {

	public static final IRule parser = new ContinuationOperator();

	public ContinuationOperator(){
		super("continuation_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AnimationTokens.ANIT_AND,
					AnimationTokens.ANIT_OR));

	}

}