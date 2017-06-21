package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class Traits extends ParseList {

	@Override
	public String getName() {
		return "traits";
	}
	@Override
	public String getSingular() {
		return "trait";
	}

	public static final ImportParser IMPORT_TRAIT = new ImportParser(
						new ChainParser(
							TraitBraces.TRAITS_FILE,
							TraitTokens.TRTS),"IMPORT_TRAIT","traits","><<\"entities/mods/traits/\",trait_file_name,\".trts\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											ConditionTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.trait_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_TRAIT);
}