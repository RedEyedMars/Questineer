package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ItemImports extends ParseList {

	@Override
	public String getName() {
		return "itemImports";
	}
	@Override
	public String getSingular() {
		return "itemImport";
	}

	public static final ImportParser IMPORT_ITEM = new ImportParser(
						new ChainParser(
							ItemBraces.ITEM_FILE,
							ItemTokens.ITMS),"IMPORT_ITEM","itemImports","><<\"entities/items/\",item_file_name,\".itms\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.import_any,
											Rules.item_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_ITEM);
}