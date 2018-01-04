package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class IsAStatement extends ConcreteRule {

	public static final IRule parser = new IsAStatement();

	public IsAStatement(){
		super("isA_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.variable_call,
					GeneralTokens.IS_A_IS,
					GeneralTokens.IS_A_A,
					Rules.type_name));

	}

}