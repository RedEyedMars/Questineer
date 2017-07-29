package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ReasonDeclaration extends ConcreteRule {

	public static final IRule parser = new ReasonDeclaration();

	public ReasonDeclaration(){
		super("reason_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						ReasonAltBraces.REASON_NAME,"reasonName","reason_names"),
					ReasonBraces.REASON_DESCRIPTION));

	}

}