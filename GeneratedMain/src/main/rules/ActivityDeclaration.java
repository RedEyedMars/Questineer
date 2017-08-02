package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ActivityDeclaration extends ConcreteRule {

	public static final IRule parser = new ActivityDeclaration();

	public ActivityDeclaration(){
		super("activity_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"activityName","activitynames"),
					new OptionalParser(
							GeneralBraces.METHOD_PARAMETERS),
					new OptionalParser(
							
								new ChainParser(
									new AddTokenParser(
										AssociationTokens.NAME,"className"),
									new ManyParser(
											
												new ChainParser(
													ActivityTokens.COMMA,
													new AddTokenParser(
														AssociationTokens.NAME,"className"))))),
					ActivityBraces.ACTIVITY_DESCRIPTION,
					new ManyParser(
							Rules.activity_element)));

	}

}