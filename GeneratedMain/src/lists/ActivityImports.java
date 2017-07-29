package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ActivityImports extends ParseList {

	@Override
	public String getName() {
		return "activityImports";
	}
	@Override
	public String getSingular() {
		return "activityImport";
	}

	public static final ImportParser IMPORT_ACTIVITY = new ImportParser(
						new ChainParser(
							ActivityBraces.ACTIVITY_FILE,
							ActivityTokens.ATVS),"IMPORT_ACTIVITY","activityImports","><<\"entities/behaviours/activities/\",activity_file_name,\".atvs\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.activity_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_ACTIVITY);
}