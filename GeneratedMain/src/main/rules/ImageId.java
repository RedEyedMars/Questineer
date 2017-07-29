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
										GeneralTokens.INTEGER,"left"),
									new OptionalParser(
											
												new ChainParser(
													ActivityTokens.COMMA,
													new AddTokenParser(
														GeneralTokens.INTEGER,"right")))))));

	}

}