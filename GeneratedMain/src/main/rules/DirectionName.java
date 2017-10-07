package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DirectionName extends ConcreteRule {

	public static final IRule parser = new DirectionName();

	public DirectionName(){
		super("direction_name");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					TileTokens.NORTH,
					TileTokens.EAST,
					TileTokens.SOUTH,
					TileTokens.WEST));

	}

}