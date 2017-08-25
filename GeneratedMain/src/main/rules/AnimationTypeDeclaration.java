package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnimationTypeDeclaration extends ConcreteRule {

	public static final IRule parser = new AnimationTypeDeclaration();

	public AnimationTypeDeclaration(){
		super("animation_type_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"animationTypeName"),
					new OptionalParser(
							AnimationBraces.ANIMATION_TYPE_VARIABLES),
					AnimationBraces.ANIMATION_TYPE_BODY));

	}

}