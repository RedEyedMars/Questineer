package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnimationTypeVariableDeclaration extends ConcreteRule {

	public static final IRule parser = new AnimationTypeVariableDeclaration();

	public AnimationTypeVariableDeclaration(){
		super("animation_type_variable_declaration");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"typeName"),
					new AddTokenParser(
						AssociationTokens.NAME,"variableName"),
					AnimationTokens.ANIT_EQUALS,
					new AddTokenParser(
						
					new ChoiceParser(
							AnimationTokens.INTEGER,
							AnimationTokens.FLOAT,
							new AddTokenParser(
								AnimationBraces.QUOTE,"quote")),"value")),
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"variableName"),
					AnimationTokens.ANIT_EQUALS,
					new AddTokenParser(
						
					new ChoiceParser(
							AnimationTokens.INTEGER,
							AnimationTokens.FLOAT,
							new AddTokenParser(
								AnimationBraces.QUOTE,"quote")),"value"))));

	}

}