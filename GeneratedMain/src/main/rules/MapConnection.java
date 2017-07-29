package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class MapConnection extends ConcreteRule {

	public static final IRule parser = new MapConnection();

	public MapConnection(){
		super("map_connection");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					MapTokens.CONNECTION,
					TileTokens.OPEN_PARA,
					new AddTokenParser(
						new ListNameElementParser("tile_symbols"),"path_symbol"),
					TileTokens.CLOSE_PARA,
					new ManyParser(
							
							new ChoiceParser(
								new ChainParser(
									AssociationTokens.NEWTAB,
									new AddTokenParser(
										
										new ChainParser(
											new MultipleParser(
													ConditionTokens.PLUS),
											new ListNameElementParser("tile_symbols")),"benign_symbol")),
									new MultipleParser(
											AssociationTokens.NEWLINE)))));

	}

}