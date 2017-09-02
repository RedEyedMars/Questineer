package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class MultipleDrawableDeclaration extends ConcreteRule {

	public static final IRule parser = new MultipleDrawableDeclaration();

	public MultipleDrawableDeclaration(){
		super("multiple_drawable_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					ConditionTokens.STAR,
					ConditionTokens.STAR,
					new AddTokenParser(
						AssociationTokens.NAME,"multipleName"),
					new MultipleParser(
							Rules.drawable_multiple_element)));

	}

}