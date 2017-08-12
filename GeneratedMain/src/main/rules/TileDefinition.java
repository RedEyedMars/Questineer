package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileDefinition extends ConcreteRule {

	public static final IRule parser = new TileDefinition();

	public TileDefinition(){
		super("tile_definition");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"tileName","tile_names"),
					new ManyParser(
							Rules.tile_element)));

	}

}