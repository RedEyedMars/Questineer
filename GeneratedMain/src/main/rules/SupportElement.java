package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class SupportElement extends ConcreteRule {

	public static final IRule parser = new SupportElement();

	public SupportElement(){
		super("support_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					AssociationTokens.NEWLINE,
					Comments.COMMENTS,
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.RANGE,
							Rules.statRange),"range"),
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.COOLDOWN,
							Rules.statRange),"cooldown"),
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.MISS,
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											new ManyParser(
													AssociationTokens.NEWLINE),
											Rules.has_chance,
											new OptionalParser(
													
														new ChainParser(
															AssociationTokens.IF,
															Rules.boolean_statement))),"option"))),"miss")));

	}

}