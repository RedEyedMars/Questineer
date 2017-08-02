package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class QuestTypeDeclaration extends ConcreteRule {

	public static final IRule parser = new QuestTypeDeclaration();

	public QuestTypeDeclaration(){
		super("quest_type_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					QuestTokens.TYPE,
					new AddTokenParser(
						AssociationTokens.NAME,"questName"),
					QuestBraces.QUEST_DESCRIPTION,
					new ManyParser(
							Rules.quest_type_element)));

	}

}