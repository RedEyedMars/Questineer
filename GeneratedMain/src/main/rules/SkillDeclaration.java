package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class SkillDeclaration extends ConcreteRule {

	public static final IRule parser = new SkillDeclaration();

	public SkillDeclaration(){
		super("skill_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						ConditionTokens.NAME,"skillName","skill_names"),
					new OptionalParser(
							SkillBraces.SKILL_DESCRIPTION),
					new ManyParser(
							
							new ChoiceParser(
									ConditionTokens.NEWLINE,
									Comments.COMMENTS,
								new ChainParser(
									ConditionTokens.PLUS,
									new AddTokenParser(
										new ListNameElementParser("skill_names"),"strength_name")),
								new ChainParser(
									ConditionTokens.MINUS,
									new AddTokenParser(
										new ListNameElementParser("skill_names"),"weakness_name"))))));

	}

}