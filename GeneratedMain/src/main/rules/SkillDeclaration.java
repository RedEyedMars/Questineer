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
						AssociationTokens.NAME,"skillName","skill_names"),
					new OptionalParser(
							GeneralBraces.METHOD_PARAMETERS),
					SkillBraces.SKILL_DESCRIPTION,
					new ManyParser(
							Rules.skill_element)));

	}

}