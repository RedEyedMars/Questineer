package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImageDeclaration extends ConcreteRule {

	public static final IRule parser = new ImageDeclaration();

	public ImageDeclaration(){
		super("image_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						ConditionTokens.NAME,"imageName","image_names"),
					
						new ChainParser(
							new AddTokenParser(
								GeneralTokens.INTEGER,"left"),
							ImageTokens.CROSS,
							new OptionalParser(
									new AddTokenParser(
										GeneralTokens.INTEGER,"right"))),
					GeneralTokens.EQUALSIGN,
					ImageBraces.IMAGE_FILE));

	}

}