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
						AssociationTokens.NAME,"imageName","image_names"),
					
						new ChainParser(
							new AddTokenParser(
								AnimationTokens.INTEGER,"frameWidth"),
							ImageTokens.CROSS,
							new OptionalParser(
									new AddTokenParser(
										AnimationTokens.INTEGER,"frameHeight"))),
					GeneralTokens.EQUALSIGN,
					ImageBraces.IMAGE_FILE,
					Rules.image_type,
					new ManyParser(
							Rules.animation_state)));

	}

}