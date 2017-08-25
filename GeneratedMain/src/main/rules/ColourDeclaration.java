package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ColourDeclaration extends ConcreteRule {

	public static final IRule parser = new ColourDeclaration();

	public ColourDeclaration(){
		super("colour_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"colourName"),
					
					new ChoiceParser(
							new AddTokenParser(
								
								new ChainParser(
									new AddTokenParser(
										AnimationTokens.INTEGER,"red"),
									new AddTokenParser(
										AnimationTokens.INTEGER,"blue"),
									new AddTokenParser(
										AnimationTokens.INTEGER,"green")),"asInt"),
							new AddTokenParser(
								
								new ChainParser(
									new AddTokenParser(
										
									new ChoiceParser(
											AnimationTokens.FLOAT,
											AnimationTokens.INTEGER),"red"),
									new AddTokenParser(
										
									new ChoiceParser(
											AnimationTokens.FLOAT,
											AnimationTokens.INTEGER),"blue"),
									new AddTokenParser(
										
									new ChoiceParser(
											AnimationTokens.FLOAT,
											AnimationTokens.INTEGER),"green")),"asFloat"))));

	}

}