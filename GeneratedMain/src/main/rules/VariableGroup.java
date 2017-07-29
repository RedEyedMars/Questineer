package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class VariableGroup extends ConcreteRule {

	public static final IRule parser = new VariableGroup();

	public VariableGroup(){
		super("variable_group");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new ListNameElementParser("association_names"),
					new OptionalParser(
							AssociationTokens.ASSOCIATION)),
				new ChainParser(
					new ListNameElementParser("skill_names"),
					new OptionalParser(
							SkillTokens.SKILL)),
				new ChainParser(
					new ListNameElementParser("affinity_names"),
					AffinityTokens.AFFINITY),
				new ChainParser(
					new ListNameElementParser("attack_names"),
					new OptionalParser(
							AttackTokens.ATTACK)),
				new ChainParser(
					new ListNameElementParser("trait_names"),
					new OptionalParser(
							TraitTokens.TRAIT)),
				new ChainParser(
					new ListNameElementParser("condition_names"),
					new OptionalParser(
							ConditionTokens.CONDITION)),
				new ChainParser(
					new ListNameElementParser("map_names"),
					new OptionalParser(
							new AddTokenParser(
								AssociationTokens.NAME,"symbolName")),
					new OptionalParser(
							MapTokens.MAP),
					new OptionalParser(
							TileTokens.TILE))));

	}

}