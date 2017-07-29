package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AssociationStart extends ConcreteRule {

	public static final IRule parser = new AssociationStart();

	public AssociationStart(){
		super("association_start");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					AssociationTokens.START,
					new AddTokenParser(
						AssociationTokens.NAME,"specificName"),
					new AddTokenParser(
						
						new ChainParser(
							AssociationTokens.ON,
							new ListNameElementParser("event_names")),"onEvent")));

	}

}