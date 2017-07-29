package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class SupportImports extends ParseList {

	@Override
	public String getName() {
		return "supportImports";
	}
	@Override
	public String getSingular() {
		return "supportImport";
	}

	public static final ImportParser IMPORT_SUPPORT = new ImportParser(
						new ChainParser(
							SupportBraces.SUPPORT_FILE,
							SupportTokens.SUPS),"IMPORT_SUPPORT","supportImports","><<\"entities/behaviours/skills/supports/\",support_file_name,\".sups\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.support_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_SUPPORT);
}