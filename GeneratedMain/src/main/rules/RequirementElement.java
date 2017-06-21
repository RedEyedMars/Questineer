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
							new ListNameElementParser("hero_stats"),
							GeneralTokens.ORDINAL,
							GeneralTokens.INTEGER),"require_stat"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("attack_names"),
							TraitTokens.EXP,
							GeneralTokens.ORDINAL,
							GeneralTokens.INTEGER),"require_exp"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("attack_names")),"require_attack"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									ConditionTokens.NOT),
							new ListNameElementParser("trait_names")),"require_trait")));

	}

}