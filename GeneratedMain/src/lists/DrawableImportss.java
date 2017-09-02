package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class DrawableImportss extends ParseList {

	@Override
	public String getName() {
		return "drawableImportss";
	}
	@Override
	public String getSingular() {
		return "drawableImports";
	}

	public static final ImportParser IMPORT_DRAWABLE = new ImportParser(
						new ChainParser(
							DrawableBraces.DRAWABLE_FILE,
							DrawableTokens.DWBS),"IMPORT_DRAWABLE","drawableImportss","><<\"gui/\",drawable_file_name,\".dwbs\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.multiple_drawable_declaration,
											Rules.drawable_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_DRAWABLE);
}