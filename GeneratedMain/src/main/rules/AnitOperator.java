package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnitOperator extends ConcreteRule {

	public static final IRule parser = new AnitOperator();

	public AnitOperator(){
		super("anit_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AnimationTokens.ANIT_EQUALS,
					AnimationTokens.ANIT_PLUSEQUALS));

	}

}