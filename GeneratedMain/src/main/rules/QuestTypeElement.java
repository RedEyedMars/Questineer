package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class QuestTypeElement extends ConcreteRule {

	public static final IRule parser = new QuestTypeElement();

	public QuestTypeElement(){
		super("quest_type_element");
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
					new AddTokenParser(
						
						new ChainParser(
							ActivityTokens.LISTEN,
							GeneralBraces.BODY),"listen"),
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								
							new ChoiceParser(
									AssociationTokens.START,
									new ListNameElementParser("event_names")),"event_names"),
							GeneralBraces.BODY),"event"),
					AssociationTokens.NEWLINE));

	}

}