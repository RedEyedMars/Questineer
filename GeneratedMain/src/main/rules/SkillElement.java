package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class SkillElement extends ConcreteRule {

	public static final IRule parser = new SkillElement();

	public SkillElement(){
		super("skill_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					AssociationTokens.NEWLINE,
					Comments.COMMENTS,
					new AddTokenParser(
						
						new ChainParser(
							ConditionTokens.REQUIRE,
							Rules.boolean_statement),"require"),
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.RANGE,
							Rules.stat_range),"range"),
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.COOLDOWN,
							Rules.stat_range),"cooldown"),
				new ChainParser(
					SkillTokens.USE,
					new AddTokenParser(
						GeneralBraces.BODY,"use")),
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.MISS,
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											new ManyParser(
													AssociationTokens.NEWLINE),
											Rules.has_chance,
											new OptionalParser(
													
														new ChainParser(
															AssociationTokens.IF,
															Rules.boolean_statement))),"option"))),"miss")));

	}

}