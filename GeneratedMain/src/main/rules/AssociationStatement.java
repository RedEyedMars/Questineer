package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AssociationStatement extends ConcreteRule {

	public static final IRule parser = new AssociationStatement();

	public AssociationStatement(){
		super("association_statement");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					Rules.variable_call,
					new AddTokenParser(
						
							GeneralTokens.ASSOCIATION_JOIN,"method"),
					new ListNameElementParser("association_names"),
					GeneralBraces.METHOD_ARGUMENTS,
					new AddTokenParser(
						Rules.statement,"recruiter")));

	}

}