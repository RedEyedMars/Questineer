package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TileRate extends ConcreteRule {

	public static final IRule parser = new TileRate();

	public TileRate(){
		super("tile_rate");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.tile_cost,
					new ManyParser(
							
								new ChainParser(
									EntityTokens.PIPE,
									Rules.tile_cost))));

	}

}