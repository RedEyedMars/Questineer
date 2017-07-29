package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AssociationJoin extends ConcreteRule {

	public static final IRule parser = new AssociationJoin();

	public AssociationJoin(){
		super("association_join");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					AssociationTokens.JOIN,
					new AddTokenParser(
						AssociationTokens.NAME,"specificName"),
					AssociationTokens.IF,
					Rules.boolean_statement));

	}

}