package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class SpawnStatement extends ConcreteRule {

	public static final IRule parser = new SpawnStatement();

	public SpawnStatement(){
		super("spawn_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					GeneralTokens.SPAWNED,
					GeneralTokens.IN,
					new AddTokenParser(
						AssociationTokens.NAME,"environmentName")));

	}

}