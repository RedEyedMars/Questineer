package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ShapeType extends ConcreteRule {

	public static final IRule parser = new ShapeType();

	public ShapeType(){
		super("shape_type");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					TileTokens.CIRCLE,
					TileTokens.COURT,
					TileTokens.SQUARE));

	}

}