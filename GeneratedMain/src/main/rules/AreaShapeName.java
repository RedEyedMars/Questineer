package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AreaShapeName extends ConcreteRule {

	public static final IRule parser = new AreaShapeName();

	public AreaShapeName(){
		super("area_shape_name");
	}
	@Override
	public void setup(){
		set(
					MapTokens.RECTANGLE);

	}

}