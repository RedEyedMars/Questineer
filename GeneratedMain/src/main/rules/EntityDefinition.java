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
					ConditionTokens.NEWLINE,
					Comments.COMMENTS,
				new ChainParser(
					new AddTokenParser(
						
						new ChainParser(
							new ListNameElementParser("hero_stats"),
							
							new ChoiceParser(
									Rules.range,
									Rules.num)),"statRange"),
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									EntityTokens.PIPE,
									new ListNameElementParser("hero_stats"),
									
									new ChoiceParser(
											Rules.range,
											Rules.num)),"statRange")))));

	}

}