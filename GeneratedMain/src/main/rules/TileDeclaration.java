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
									ConditionTokens.NAME),"tileName","tile_names"),
					TileTokens.OPEN_PARA,
					new AddTokenToListParser(
						ConditionTokens.NAME,"symbolName","tile_symbols"),
					TileTokens.CLOSE_PARA,
					new ManyParser(
							Rules.tile_element)));

	}

}