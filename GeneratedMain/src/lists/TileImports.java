package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class TileImports extends ParseList {

	@Override
	public String getName() {
		return "tileImports";
	}
	@Override
	public String getSingular() {
		return "tileImport";
	}

	public static final ImportParser IMPORT_TILE = new ImportParser(
						new ChainParser(
							TileBraces.TILE_FILE,
							TileTokens.TILE),"IMPORT_TILE","tileImports","><<\"environments/tiles/\",tile_file_name,\".tile\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.tile_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_TILE);
}