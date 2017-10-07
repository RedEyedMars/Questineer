package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EdgeDefinition extends ConcreteRule {

	public static final IRule parser = new EdgeDefinition();

	public EdgeDefinition(){
		super("edge_definition");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					TileTokens.FORESLASH,
					new AddTokenParser(
						AssociationTokens.NAME,"edgeTileName"),
					new ManyParser(
							
								new ChainParser(
									EntityTokens.PIPE,
									new AddTokenParser(
										AssociationTokens.NAME,"edgeTileName"))),
					Rules.direction_name,
					new ManyParser(
							
								new ChainParser(
									EntityTokens.PIPE,
									Rules.direction_name)),
					new ManyParser(
							
								new ChainParser(
									AssociationTokens.NEWLINE,
									Rules.edge_if))));

	}

}