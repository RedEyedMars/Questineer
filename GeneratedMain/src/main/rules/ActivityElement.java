package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ActivityElement extends ConcreteRule {

	public static final IRule parser = new ActivityElement();

	public ActivityElement(){
		super("activity_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					Comments.COMMENTS,
				new ChainParser(
					ConditionTokens.PLUS,
					Rules.variable_declaration),
				new ChainParser(
					ActivityTokens.GET,
					
					new ChoiceParser(
							new AddTokenParser(
								
								new ChainParser(
									ActivityTokens.TARGET,
									GeneralBraces.BODY),"getTarget"),
							new AddTokenParser(
								
								new ChainParser(
									ActivityTokens.DESTINATION,
									GeneralBraces.BODY),"getDestination"))),
					new AddTokenParser(
						
						new ChainParser(
							
							new ChoiceParser(
									ActivityTokens.SUCCEED,
									ActivityTokens.FAIL),
							AssociationTokens.IF,
							Rules.boolean_statement),"endState"),
					new AddTokenParser(
						
						new ChainParser(
							ActivityTokens.LISTEN,
							GeneralBraces.BODY),"listen"),
					new AddTokenParser(
						
						new ChainParser(
							ActivityTokens.STEP,
							GeneralBraces.BODY),"step"),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("event_names"),
							GeneralBraces.BODY),"event"),
					AssociationTokens.NEWLINE));

	}

}