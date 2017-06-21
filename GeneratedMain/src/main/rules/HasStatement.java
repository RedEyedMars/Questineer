package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class HasStatement extends ConcreteRule {

	public static final IRule parser = new HasStatement();

	public HasStatement(){
		super("has_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new OptionalParser(
							ConditionTokens.NOT),
					Rules.variable_call,
					GeneralTokens.HAS,
					Rules.requirement));

	}

}