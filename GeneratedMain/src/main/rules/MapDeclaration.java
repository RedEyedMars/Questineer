package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class MapDeclaration extends ConcreteRule {

	public static final IRule parser = new MapDeclaration();

	public MapDeclaration(){
		super("map_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new ManyParser(
							AssociationTokens.NEWLINE),
					
							new ManyParser(
									new AddTokenParser(
										AssociationTokens.NAME,"mapElementName")),
					PaymentTokens.COLON,
					new ManyParser(
							AssociationTokens.NEWLINE),
					new AddTokenParser(
						
							new MultipleParser(
									new ListNameElementParser("tile_symbols")),"line"),
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									AssociationTokens.NEWTAB,
									new MultipleParser(
											new ListNameElementParser("tile_symbols"))),"line"))));

	}

}