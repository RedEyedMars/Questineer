package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImageId extends ConcreteRule {

	public static final IRule parser = new ImageId();

	public ImageId(){
		super("image_id");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new ListNameElementParser("image_names"),
					new OptionalParser(
							
								new ChainParser(
									new AddTokenParser(
										AnimationTokens.INTEGER,"frameWidth"),
									new OptionalParser(
											
												new ChainParser(
													AnimationTokens.COMMA,
													new AddTokenParser(
														AnimationTokens.INTEGER,"frameHeight")))))));

	}

}