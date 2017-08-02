package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class QuestAddition extends ConcreteRule {

	public static final IRule parser = new QuestAddition();

	public QuestAddition(){
		super("quest_addition");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					GeneralTokens.QUEST_ADD,
					new ListNameElementParser("activitynames"),
					new OptionalParser(
							
								new ChainParser(
									Rules.statement,
									new ManyParser(
											
												new ChainParser(
													GeneralTokens.QUEST_SEPARATOR,
													Rules.statement))))));

	}

}