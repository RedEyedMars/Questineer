package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AspectImports extends ParseList {

	@Override
	public String getName() {
		return "aspectImports";
	}
	@Override
	public String getSingular() {
		return "aspectImport";
	}

	public static final ImportParser IMPORT_ASPECT = new ImportParser(
						new ChainParser(
							AspectBraces.ASPECT_FILE,
							AspectTokens.ASPS),"IMPORT_ASPECT","aspectImports","><<\"entities/items/aspects/\",aspect_file_name,\".asps\">>\n",new NamedParserContainer(
							new ManyParser(
									
									new ChoiceParser(
											ConditionTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.aspect_declaration)),"blank"));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_ASPECT);
}