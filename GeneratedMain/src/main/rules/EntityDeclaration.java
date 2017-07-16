package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EntityDeclaration extends ConcreteRule {

	public static final IRule parser = new EntityDeclaration();

	public EntityDeclaration(){
		super("entity_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new ManyParser(
							ConditionTokens.NEWLINE),
					new AddTokenParser(
						
							new MultipleParser(
									ConditionTokens.NAME),"entityName"),
					new ManyParser(
							ConditionTokens.NEWLINE),
					EntityBraces.ENTITY_DEFINITION));

	}

}