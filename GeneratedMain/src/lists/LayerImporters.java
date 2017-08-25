package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class LayerImporters extends ParseList {

	@Override
	public String getName() {
		return "layerImporters";
	}
	@Override
	public String getSingular() {
		return "layerImporter";
	}

	public static final ImportParser IMPORT_LAYER = new ImportParser(
						new ChainParser(
							LayerBraces.LAYER_FILE,
							LayerTokens.LAYERS),"IMPORT_LAYER","layerImporters","><<\"gui/\",layer_file_name,\".layers\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.layer_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_LAYER);
}