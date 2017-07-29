package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AssociationElement extends ConcreteRule {

	public static final IRule parser = new AssociationElement();

	public AssociationElement(){
		super("association_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
				new ChainParser(
					AssociationTokens.NEWTAB,
					Rules.association_start),
				new ChainParser(
					AssociationTokens.NEWTAB,
					Rules.association_event),
				new ChainParser(
					AssociationTokens.NEWTAB,
					Rules.association_join)));

	}

}