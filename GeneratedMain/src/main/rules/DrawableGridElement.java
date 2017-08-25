package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DrawableGridElement extends ConcreteRule {

	public static final IRule parser = new DrawableGridElement();

	public DrawableGridElement(){
		super("drawable_grid_element");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						AnimationTokens.INTEGER,"point"),
					new AddTokenParser(
						AssociationTokens.NEWLINE,"endLine"),
					new AddTokenParser(
						DrawableTokens.DOT,"space")));

	}

}