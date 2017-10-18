package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileDefinitionElement extends ConcreteRule {

	public static final IRule parser = new TileDefinitionElement();

	public TileDefinitionElement(){
		super("tile_definition_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					TileBraces.TILE_DIMENSIONS,
				new ChainParser(
					TileTokens.IMPASSABLE,
					GeneralTokens.SEMICOLON),
				new ChainParser(
					TileTokens.PASSABLE,
					GeneralTokens.SEMICOLON),
				new ChainParser(
					Rules.tile_rate,
					GeneralTokens.SEMICOLON),
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"imageName"),
					new ManyParser(
							
								new ChainParser(
									TileTokens.TILE_IMAGE_ACCESS,
									new AddTokenParser(
										AssociationTokens.NAME,"imageId"))),
					GeneralTokens.SEMICOLON)));

	}

}