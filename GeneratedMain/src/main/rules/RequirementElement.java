package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class RequirementElement extends ConcreteRule {

	public static final IRule parser = new RequirementElement();

	public RequirementElement(){
		super("requirement_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							
								new ChainParser(
									EntityTokens.STAT,
									GeneralTokens.IN,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName")),
							GeneralTokens.ORDINAL,
							AnimationTokens.INTEGER),"require_stat"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							
								new ChainParser(
									AttackTokens.ATTACK,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName")),
							TraitTokens.EXP,
							GeneralTokens.ORDINAL,
							AnimationTokens.INTEGER),"require_exp"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							
								new ChainParser(
									AttackTokens.ATTACK,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName"))),"require_attack"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							
								new ChainParser(
									TraitTokens.TRAIT,
									GeneralTokens.OF,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName"))),"require_trait"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							
								new ChainParser(
									AssociationTokens.ASSOCIATION,
									GeneralTokens.WITH,
									new AddTokenParser(
										AssociationTokens.NAME,"variableName"))),"require_association"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("hero_stats"),
							GeneralTokens.ORDINAL,
							AnimationTokens.INTEGER),"require_stat"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("attack_names"),
							TraitTokens.EXP,
							GeneralTokens.ORDINAL,
							AnimationTokens.INTEGER),"require_exp"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("attack_names")),"require_attack"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("trait_names")),"require_trait"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("association_names")),"require_association")));

	}

}