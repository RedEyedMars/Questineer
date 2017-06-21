package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImportAny extends ConcreteRule {

	public static final IRule parser = new ImportAny();

	public ImportAny(){
		super("import_any");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					EventImports.IMPORT_EVENT,
					ItemImports.IMPORT_ITEM,
					ImageImports.IMPORT_IMAGE,
					Traits.IMPORT_TRAIT,
					AspectImports.IMPORT_ASPECT,
					AffinityImports.IMPORT_AFFINITY,
					ConditionImports.IMPORT_CONDITION,
					Attacks.IMPORT_ATTACK));

	}

}