package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Animation extends ConcreteRule {

	public static final IRule parser = new Animation();

	public Animation(){
		super("animation");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.image_id,
					new ManyParser(
							new AddTokenParser(
								
								new ChainParser(
									PaymentTokens.DASH,
									new OptionalParser(
											new AddTokenParser(
												AnimationTokens.INTEGER,"frames")),
									ImageTokens.LESSTHAN,
									
									new ChoiceParser(
											new ListNameElementParser("image_names"),
										new ChainParser(
											new AddTokenParser(
												AnimationTokens.INTEGER,"left"),
											new OptionalParser(
													
														new ChainParser(
															AnimationTokens.COMMA,
															new AddTokenParser(
																AnimationTokens.INTEGER,"right")))))),"delta"))));

	}

}