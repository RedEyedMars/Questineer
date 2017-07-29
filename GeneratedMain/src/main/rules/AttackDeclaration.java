package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AttackDeclaration extends ConcreteRule {

	public static final IRule parser = new AttackDeclaration();

	public AttackDeclaration(){
		super("attack_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"attackName","attack_names"),
					AttackBraces.ATTACK_DESCRIPTION,
					new ManyParser(
							Rules.attack_element)));

	}

}