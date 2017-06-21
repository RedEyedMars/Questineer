package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Import extends ConcreteRule {

	public static final IRule parser = new Import();

	public Import(){
		super("import");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					ItemImports.IMPORT_ITEM,
					ImageImports.IMPORT_IMAGE,
					Traits.IMPORT_TRAIT,
					AspectImports.IMPORT_ASPECT,
					AffinityImports.IMPORT_AFFINITY,
					Attacks.IMPORT_ATTACK));

	}

}