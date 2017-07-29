package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ConditionDeclaration extends ConcreteRule {

	public static final IRule parser = new ConditionDeclaration();

	public ConditionDeclaration(){
		super("condition_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"conditionName","condition_names"),
					new OptionalParser(
							ConditionBraces.CONDITION_DESCRIPTION),
					new ManyParser(
							Rules.condition_element)));

	}

}