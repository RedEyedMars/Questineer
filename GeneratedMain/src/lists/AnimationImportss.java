package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AnimationImportss extends ParseList {

	@Override
	public String getName() {
		return "animationImportss";
	}
	@Override
	public String getSingular() {
		return "animationImports";
	}

	public static final ImportParser IMPORT_ANIMATION_TYPE = new ImportParser(
						new ChainParser(
							AnimationBraces.ANIMATION_TYPE_FILE,
							AnimationTokens.ANIMATION_TYPES),"IMPORT_ANIMATION_TYPE","animationImportss","><<\"gui/\",animation_type_file_name,\".animationTypes\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.animation_type_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_ANIMATION_TYPE);
}