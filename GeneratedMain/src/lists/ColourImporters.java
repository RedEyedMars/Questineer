package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ColourImporters extends ParseList {

	@Override
	public String getName() {
		return "colourImporters";
	}
	@Override
	public String getSingular() {
		return "colourImporter";
	}

	public static final ImportParser IMPORT_COLOUR = new ImportParser(
						new ChainParser(
							ColourBraces.COLOUR_FILE,
							ColourTokens.COLOURS),"IMPORT_COLOUR","colourImporters","><<\"gui/\",colour_file_name,\".colours\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.colour_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_COLOUR);
}