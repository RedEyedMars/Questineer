package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AssociationImports extends ParseList {

	@Override
	public String getName() {
		return "associationImports";
	}
	@Override
	public String getSingular() {
		return "associationImport";
	}

	public static final ImportParser IMPORT_ASSOCIATION = new ImportParser(
						new ChainParser(
							AssociationBraces.ASSOCIATION_FILE,
							AssociationTokens.ASOS),"IMPORT_ASSOCIATION","associationImports","><<\"entities/relations/associations/\",association_file_name,\".asos\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.association_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_ASSOCIATION);
}