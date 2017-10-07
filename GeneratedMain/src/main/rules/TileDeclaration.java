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
							new MultipleParser(
									ConditionTokens.STAR),
							TileTokens.FLOOR,
							new MultipleParser(
									ConditionTokens.STAR),
							new ManyParser(
									AssociationTokens.NEWLINE),
							new ManyParser(
									Rules.edge_definition),
							new ManyParser(
									AssociationTokens.NEWLINE),
							new ManyParser(
									Rules.tile_definition)),"floor_declaration"),
					new AddTokenParser(
						
						new ChainParser(
							new MultipleParser(
									ConditionTokens.STAR),
							TileTokens.TERRAIN,
							new MultipleParser(
									ConditionTokens.STAR),
							new ManyParser(
									AssociationTokens.NEWLINE),
							new ManyParser(
									Rules.tile_definition)),"terrain_declaration"),
					new AddTokenParser(
						
						new ChainParser(
							new MultipleParser(
									ConditionTokens.STAR),
							TileTokens.DENS,
							new MultipleParser(
									ConditionTokens.STAR),
							new ManyParser(
									AssociationTokens.NEWLINE),
							new ManyParser(
									Rules.tile_definition)),"dens_declaration"),
					new AddTokenParser(
						
						new ChainParser(
							new MultipleParser(
									ConditionTokens.STAR),
							TileTokens.CHESTS,
							new MultipleParser(
									ConditionTokens.STAR),
							new ManyParser(
									AssociationTokens.NEWLINE),
							new ManyParser(
									Rules.tile_definition)),"chests_declaration")));

	}

}