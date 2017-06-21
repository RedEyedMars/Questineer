package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TraitRequirement extends ConcreteRule {

	public static final IRule parser = new TraitRequirement();

	public TraitRequirement(){
		super("trait_requirement");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									TraitTokens.NOT),
							new ListNameElementParser("hero_stats"),
							TraitTokens.ORDINAL,
							GeneralTokens.INTEGER),"require_stat"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									TraitTokens.NOT),
							new ListNameElementParser("attack_names"),
							TraitTokens.EXP,
							TraitTokens.ORDINAL,
							GeneralTokens.INTEGER),"require_exp"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									TraitTokens.NOT),
							new ListNameElementParser("attack_names")),"require_attack"),
					new AddTokenParser(
						
						new ChainParser(
							new OptionalParser(
									TraitTokens.NOT),
							new ListNameElementParser("trait_names")),"require_trait")));

	}

}