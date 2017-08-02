package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class BodyElement extends ConcreteRule {

	public static final IRule parser = new BodyElement();

	public BodyElement(){
		super("body_element");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					Rules.return_statement,
					Rules.if_statement,
					Rules.while_statement,
					Rules.for_statement,
					new AddTokenParser(
						
						new ChainParser(
							Rules.variable_call,
							Rules.acquisition),"acquisition"),
					new AddTokenParser(
						
						new ChainParser(
							Rules.variable_call,
							Rules.imposition),"imposition"),
					new AddTokenParser(
						
						new ChainParser(
							Rules.variable_call,
							Rules.quest_addition),"quest_addition"),
					Rules.variable_declaration,
					Rules.statement));

	}

}