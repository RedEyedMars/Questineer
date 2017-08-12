package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EntityDefinition extends ConcreteRule {

	public static final IRule parser = new EntityDefinition();

	public EntityDefinition(){
		super("entity_definition");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AssociationTokens.NEWLINE,
					Comments.COMMENTS,
				new ChainParser(
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("hero_stats"),
							new AddTokenParser(
								GeneralTokens.INTEGER,"left"),
							new OptionalParser(
									
										new ChainParser(
											PaymentTokens.DASH,
											new AddTokenParser(
												GeneralTokens.INTEGER,"right")))),"statRange"),
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									EntityTokens.PIPE,
									new ListNameElementParser("hero_stats"),
									new AddTokenParser(
										GeneralTokens.INTEGER,"left"),
									new OptionalParser(
											
												new ChainParser(
													PaymentTokens.DASH,
													new AddTokenParser(
														GeneralTokens.INTEGER,"right")))),"statRange"))),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("event_names"),
							GeneralBraces.BODY),"event"),
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("skill_names"),
							new OptionalParser(
									GeneralBraces.METHOD_ARGUMENTS)),"skill"),
					new ListNameElementParser("affinity_names")));

	}

}