package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ItemBraces extends ParseList {

	@Override
	public String getName() {
		return "itemBraces";
	}
	@Override
	public String getSingular() {
		return "itemBrace";
	}

	public static final BracedParser ITEM_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"item_file_name"),"ITEM_FILE","itemBraces",",.");
	public static final BracedParser ITEM_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"description"),"ITEM_DESCRIPTION","itemBraces","\n\t,;;");

	public static final ChoiceParser parser = new ChoiceParser(
				ITEM_FILE,ITEM_DESCRIPTION);
}