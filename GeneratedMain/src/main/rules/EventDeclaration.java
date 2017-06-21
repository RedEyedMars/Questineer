package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EventDeclaration extends ConcreteRule {

	public static final IRule parser = new EventDeclaration();

	public EventDeclaration(){
		super("event_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						ConditionTokens.NAME,"eventName","event_names"),
					new ManyParser(
							
							new ChoiceParser(
									Comments.COMMENTS,
									new AddTokenParser(
										
										new ChainParser(
											ConditionTokens.NEWTAB,
											Rules.type_name,
											new AddTokenParser(
												ConditionTokens.NAME,"name")),"parameter"),
									ConditionTokens.NEWLINE))));

	}

}