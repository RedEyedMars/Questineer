package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class EntityBraces extends ParseList {

	@Override
	public String getName() {
		return "entityBraces";
	}
	@Override
	public String getSingular() {
		return "entityBrace";
	}

	public static final BracedParser ENTITY_DEFINITION = new BracedParser(
							new ManyParser(
									Rules.entity_definition),"ENTITY_DEFINITION","entityBraces","{,}");

	public static final ChoiceParser parser = new ChoiceParser(
				ENTITY_DEFINITION);
}