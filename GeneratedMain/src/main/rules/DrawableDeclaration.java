package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class DrawableDeclaration extends ConcreteRule {

	public static final IRule parser = new DrawableDeclaration();

	public DrawableDeclaration(){
		super("drawable_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"drawableName"),
					AssociationTokens.NEWLINE,
					new MultipleParser(
							Rules.drawable_grid_element)));

	}

}