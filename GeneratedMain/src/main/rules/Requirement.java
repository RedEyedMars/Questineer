package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class Requirement extends ConcreteRule {

	public static final IRule parser = new Requirement();

	public Requirement(){
		super("requirement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.requirement_element,
					new ManyParser(
							
								new ChainParser(
									GeneralTokens.OR,
									Rules.requirement_element))));

	}

}