package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Statement extends ConcreteRule {

	public static final IRule parser = new Statement();

	public Statement(){
		super("statement");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new OptionalParser(
							ConditionTokens.NOT),
					new AddTokenParser(
						GeneralBraces.BRACED_STATEMENT,"braced"),
					new ManyParser(
							
								new ChainParser(
									Rules.operator,
									new ManyParser(
											ConditionTokens.NEWLINE),
									Rules.statement))),
				new ChainParser(
					new OptionalParser(
							ConditionTokens.NOT),
					Rules.variable_call,
					new ManyParser(
							
								new ChainParser(
									Rules.operator,
									new ManyParser(
											ConditionTokens.NEWLINE),
									Rules.statement)))));

	}

}