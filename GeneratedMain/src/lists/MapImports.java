package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class MapImports extends ParseList {

	@Override
	public String getName() {
		return "mapImports";
	}
	@Override
	public String getSingular() {
		return "mapImport";
	}

	public static final ImportParser IMPORT_MAP = new ImportParser(
						new ChainParser(
							MapBraces.MAP_FILE,
							MapTokens.MAPS),"IMPORT_MAP","mapImports","><<\"environments/maps/\",map_file_name,\".maps\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.map_header,
											Rules.area_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_MAP);
}