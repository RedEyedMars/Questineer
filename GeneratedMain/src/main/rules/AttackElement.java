package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AttackElement extends ConcreteRule {

	public static final IRule parser = new AttackElement();

	public AttackElement(){
		super("attack_element");
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
							SupportTokens.RANGE,
							Rules.stat_range),"range"),
					new AddTokenParser(
						
						new ChainParser(
							SupportTokens.COOLDOWN,
							Rules.stat_range),"cooldown"),
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								new OptionalParser(
									
									new ChoiceParser(
											SupportTokens.BODY_DMG,
											SupportTokens.MIND_DMG)),"dmg_type"),
							SupportTokens.DAMAGE,
							
							new ChoiceParser(
									new AddTokenParser(
										Rules.stat_range,"by_stat"),
									GeneralBraces.BODY)),"damage"),
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