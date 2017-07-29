package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class QuestDeclaration extends ConcreteRule {

	public static final IRule parser = new QuestDeclaration();

	public QuestDeclaration(){
		super("quest_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"questName"),
					QuestBraces.QUEST_DESCRIPTION));

	}

}