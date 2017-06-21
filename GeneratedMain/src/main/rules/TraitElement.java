package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class TraitElement extends ConcreteRule {

	public static final IRule parser = new TraitElement();

	public TraitElement(){
		super("trait_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					ConditionTokens.NEWLINE,
					Comments.COMMENTS,
				new ChainParser(
					ConditionTokens.REQUIRE,
					Rules.requirement),
					Rules.imposition,
					Rules.acquisition));

	}

}