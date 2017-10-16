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
		set(
				new ChainParser(
					new OptionalParser(
							
								new ChainParser(
									
										new ChainParser(
											new AddTokenParser(
												new ListNameElementParser("tile_names"),"floorParentName"),
											new ManyParser(
													
														new ChainParser(
															AnimationTokens.COMMA,
															new AddTokenParser(
																new ListNameElementParser("tile_names"),"floorParentName")))),
									TileTokens.DOUBLE_COLON)),
					new AddTokenToListParser(
						AssociationTokens.NAME,"tileName","tile_names"),
					new OptionalParser(
							TileBraces.TILE_DIMENSIONS),
					new OptionalParser(
							
								new ChainParser(
									TileTokens.PASSABLE,
									GeneralTokens.SEMICOLON)),
					new OptionalParser(
							
								new ChainParser(
									Rules.tile_rate,
									GeneralTokens.SEMICOLON)),
					new OptionalParser(
							
								new ChainParser(
									new AddTokenParser(
										AssociationTokens.NAME,"imageName"),
									new ManyParser(
											
												new ChainParser(
													TileTokens.TILE_IMAGE_ACCESS,
													new AddTokenParser(
														AssociationTokens.NAME,"imageId"))),
									GeneralTokens.SEMICOLON)),
					new ManyParser(
							Rules.tile_element)));

	}

}