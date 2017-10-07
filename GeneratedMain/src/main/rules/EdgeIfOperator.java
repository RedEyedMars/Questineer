package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class EdgeIfOperator extends ConcreteRule {

	public static final IRule parser = new EdgeIfOperator();

	public EdgeIfOperator(){
		super("edge_if_operator");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					TileTokens.EDGE_EQUALS,
					TileTokens.EDGE_NOT_EQUALS));

	}

}