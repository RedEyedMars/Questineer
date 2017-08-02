package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class MapHeader extends ConcreteRule {

	public static final IRule parser = new MapHeader();

	public MapHeader(){
		super("map_header");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"mapName","map_names"),
					TileImports.IMPORT_TILE));

	}

}