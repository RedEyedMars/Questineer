package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AspectDeclaration extends ConcreteRule {

	public static final IRule parser = new AspectDeclaration();

	public AspectDeclaration(){
		super("aspect_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						ConditionTokens.NAME,"aspectName","aspect_names"),
					AspectBraces.ASPECT_DESCRIPTION,
					new ManyParser(
							
							new ChoiceParser(
									ConditionTokens.NEWLINE,
									new AddTokenParser(
										
										new ChainParser(
											new ListNameElementParser("event_names"),
											new OptionalParser(
													Rules.animation),
											GeneralBraces.BODY),"event")))));

	}

}