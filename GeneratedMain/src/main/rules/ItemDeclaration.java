package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ItemDeclaration extends ConcreteRule {

	public static final IRule parser = new ItemDeclaration();

	public ItemDeclaration(){
		super("item_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"itemName","item_names"),
					new ManyParser(
							Rules.item_parameter),
					new ManyParser(
							
								new ChainParser(
									AssociationTokens.NEWTAB,
									new ManyParser(
											Rules.item_parameter)))));

	}

}