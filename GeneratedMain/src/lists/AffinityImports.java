package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AffinityImports extends ParseList {

	@Override
	public String getName() {
		return "affinityImports";
	}
	@Override
	public String getSingular() {
		return "affinityImport";
	}

	public static final ImportParser IMPORT_AFFINITY = new ImportParser(
						new ChainParser(
							AffinityBraces.AFFINITY_FILE,
							AffinityTokens.AFTS),"IMPORT_AFFINITY","affinityImports","><<\"entities/mods/affinities/\",affinity_file_name,\".afts\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.affinity_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_AFFINITY);
}