package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileDeclaration extends ConcreteRule {

	public static final IRule parser = new TileDeclaration();

	public TileDeclaration(){
		super("tile_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						new MultipleParser(
							AssociationTokens.NAME),"tileName","tile_names"),
					new OptionalParser(
							
								new ChainParser(
									TileTokens.EXTENDS,
									TileTokens.PATH)),
					TileTokens.OPEN_PARA,
					new AddTokenToListParser(
						AssociationTokens.NAME,"symbolName","tile_symbols"),
					TileTokens.CLOSE_PARA,
					new ManyParser(
							Rules.tile_element)));

	}

}