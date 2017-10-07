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
	public static final BracedParser TILE_DIMENSIONS = new BracedParser(
						new ChainParser(
							new AddTokenParser(
								AnimationTokens.INTEGER,"width"),
							AnimationTokens.COMMA,
							new AddTokenParser(
								AnimationTokens.INTEGER,"height")),"TILE_DIMENSIONS","tileBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				TILE_FILE,TILE_DIMENSIONS);
}