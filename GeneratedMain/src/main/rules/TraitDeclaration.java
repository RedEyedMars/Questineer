package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TraitDeclaration extends ConcreteRule {

	public static final IRule parser = new TraitDeclaration();

	public TraitDeclaration(){
		super("trait_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"traitName","trait_names"),
					TraitBraces.TRAIT_DESCRIPTION,
					new ManyParser(
							Rules.trait_element)));

	}

}