package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ItemHitElement extends ConcreteRule {

	public static final IRule parser = new ItemHitElement();

	public ItemHitElement(){
		super("item_hit_element");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.has_chance,
					new OptionalParser(
							
								new ChainParser(
									AssociationTokens.IF,
									Rules.boolean_statement)),
					GeneralBraces.BODY));

	}

}