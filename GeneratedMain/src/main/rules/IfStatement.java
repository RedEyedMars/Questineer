package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class IfStatement extends ConcreteRule {

	public static final IRule parser = new IfStatement();

	public IfStatement(){
		super("if_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					GeneralTokens.IF,
					Rules.boolean_statement,
					new ManyParser(
							ConditionTokens.NEWLINE),
					GeneralBraces.BODY,
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									new ManyParser(
											ConditionTokens.NEWLINE),
									GeneralTokens.ELSE,
									new ManyParser(
											ConditionTokens.NEWLINE),
									
									new ChoiceParser(
											GeneralBraces.BODY,
										new ChainParser(
											GeneralTokens.IF,
											Rules.boolean_statement,
											new ManyParser(
													ConditionTokens.NEWLINE),
											GeneralBraces.BODY))),"else_statement"))));

	}

}