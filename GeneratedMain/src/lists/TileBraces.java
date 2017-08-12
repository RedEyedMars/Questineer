package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class TileBraces extends ParseList {

	@Override
	public String getName() {
		return "tileBraces";
	}
	@Override
	public String getSingular() {
		return "tileBrace";
	}

	public static final BracedParser TILE_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"tile_file_name"),"TILE_FILE","tileBraces",",.");
	public static final BracedParser TILE_CRAWLER_TYPE_PARAMETERS = new BracedParser(
						new ChainParser(
							new OptionalParser(
									
									new ChoiceParser(
											TileTokens.LENGTH,
											Rules.num)),
							new ManyParser(
									
										new ChainParser(
											ActivityTokens.COMMA,
											
											new ChoiceParser(
													TileTokens.LENGTH,
													Rules.num)))),"TILE_CRAWLER_TYPE_PARAMETERS","tileBraces","(,)");
	public static final BracedParser TILE_CRAWLER_TYPE = new BracedParser(
						new ChainParser(
							new OptionalParser(
									new AddTokenParser(
										
										new ChainParser(
											new ListNameElementParser("tile_names"),
											Rules.shape_type,
											TileBraces.TILE_CRAWLER_TYPE_PARAMETERS),"shape")),
							new ManyParser(
									
										new ChainParser(
											ActivityTokens.COMMA,
											new AddTokenParser(
												
												new ChainParser(
													new ListNameElementParser("tile_names"),
													Rules.shape_type,
													TileBraces.TILE_CRAWLER_TYPE_PARAMETERS),"shape")))),"TILE_CRAWLER_TYPE","tileBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				TILE_FILE,TILE_CRAWLER_TYPE_PARAMETERS,TILE_CRAWLER_TYPE);
}