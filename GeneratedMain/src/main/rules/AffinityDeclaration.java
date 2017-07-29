package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AffinityDeclaration extends ConcreteRule {

	public static final IRule parser = new AffinityDeclaration();

	public AffinityDeclaration(){
		super("affinity_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"affinityName","affinity_names"),
					new OptionalParser(
							AffinityBraces.AFFINITY_DESCRIPTION),
					new ManyParser(
							
							new ChoiceParser(
									AssociationTokens.NEWLINE,
									Comments.COMMENTS,
								new ChainParser(
									ConditionTokens.PLUS,
									new AddTokenParser(
										new ListNameElementParser("affinity_names"),"strength_name")),
								new ChainParser(
									ConditionTokens.MINUS,
									new AddTokenParser(
										new ListNameElementParser("affinity_names"),"weakness_name"))))));

	}

}