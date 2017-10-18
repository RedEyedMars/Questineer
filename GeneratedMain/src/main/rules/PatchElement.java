package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class PatchElement extends ConcreteRule {

	public static final IRule parser = new PatchElement();

	public PatchElement(){
		super("patch_element");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new ListNameElementParser("tile_names"),
					new OptionalParser(
							
								new ChainParser(
									new AddTokenParser(
										AnimationTokens.INTEGER,"patchWidth"),
									ImageTokens.CROSS,
									new AddTokenParser(
										AnimationTokens.INTEGER,"patchHeight")))));

	}

}