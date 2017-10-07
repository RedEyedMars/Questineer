package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EdgeIf extends ConcreteRule {

	public static final IRule parser = new EdgeIf();

	public EdgeIf(){
		super("edge_if");
	}
	@Override
	public void setup(){
		set(
					new AddTokenParser(
						
						new ChainParser(
							AssociationTokens.IF,
							TileTokens.NEIGHBOUR,
							
							new ChoiceParser(
								new ChainParser(
									GeneralTokens.IN,
									TileTokens.DIRECTION),
								new ChainParser(
									AnimationTokens.INTEGER,
									AnimationTokens.INTEGER)),
							Rules.edge_if_operator,
							
									GeneralTokens.NULL),"neighbourIf"));

	}

}