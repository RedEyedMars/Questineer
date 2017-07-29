package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ReasonImports extends ParseList {

	@Override
	public String getName() {
		return "reasonImports";
	}
	@Override
	public String getSingular() {
		return "reasonImport";
	}

	public static final ImportParser IMPORT_REASON = new ImportParser(
						new ChainParser(
							ReasonBraces.REASON_FILE,
							ReasonTokens.RSNS),"IMPORT_REASON","reasonImports","><<\"entities/relations/reasons/\",reason_file_name,\".afls\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.reason_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_REASON);
}