package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ActivityStatement extends ConcreteRule {

	public static final IRule parser = new ActivityStatement();

	public ActivityStatement(){
		super("activity_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.variable_call,
					new OptionalParser(
							PaymentTokens.COLON),
					new AddTokenParser(
						
							GeneralTokens.ACTIVITY_START,"method"),
					new ListNameElementParser("activitynames"),
					
					new ChoiceParser(
							Rules.statement,
							GeneralBraces.METHOD_ARGUMENTS)));

	}

}