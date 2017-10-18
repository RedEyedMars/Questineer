package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class MapAltBraces extends ParseList {

	@Override
	public String getName() {
		return "mapAltBraces";
	}
	@Override
	public String getSingular() {
		return "mapAltBrace";
	}

	public static final CharitableBracedParser AREA_BLUEPRINT = new CharitableBracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"area_blueprint"),"AREA_BLUEPRINT","mapAltBraces",",\\n");

	public static final ChoiceParser parser = new ChoiceParser(
				AREA_BLUEPRINT);
}