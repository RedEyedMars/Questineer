package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileElement extends ConcreteRule {

	public static final IRule parser = new TileElement();

	public TileElement(){
		super("tile_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
				new ChainParser(
					new ManyParser(
							ConditionTokens.NEWLINE),
					Comments.COMMENTS),
				new ChainParser(
					ConditionTokens.NEWTAB,
					new AddTokenParser(
						
						new ChainParser(
							new MultipleParser(
									
									new ChoiceParser(
											ConditionTokens.PLUS,
											ConditionTokens.MINUS)),
							Rules.entity_declaration),"entity")),
					new MultipleParser(
							ConditionTokens.NEWLINE)));

	}

}