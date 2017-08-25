package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileDeclaration extends ConcreteRule {

	public static final IRule parser = new TileDeclaration();

	public TileDeclaration(){
		super("tile_declaration");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							TileTokens.BACKGROUND,
							PaymentTokens.COLON,
							new ListNameElementParser("tile_names"),
							new ManyParser(
									
										new ChainParser(
											AnimationTokens.COMMA,
											new ListNameElementParser("tile_names")))),"background"),
					new AddTokenParser(
						
						new ChainParser(
							TileTokens.UNDERNEATH,
							PaymentTokens.COLON,
							new ListNameElementParser("tile_names"),
							new ManyParser(
									
										new ChainParser(
											AnimationTokens.COMMA,
											new ListNameElementParser("tile_names")))),"underneath"),
					new AddTokenParser(
						
						new ChainParser(
							TileTokens.PATHS,
							PaymentTokens.COLON,
							new ListNameElementParser("tile_names"),
							new ManyParser(
									
										new ChainParser(
											AnimationTokens.COMMA,
											new ListNameElementParser("tile_names")))),"paths"),
					Rules.tile_definition));

	}

}