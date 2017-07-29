package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class SupportDeclaration extends ConcreteRule {

	public static final IRule parser = new SupportDeclaration();

	public SupportDeclaration(){
		super("support_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"supportName","support_names"),
					SupportBraces.SUPPORT_DESCRIPTION,
					new ManyParser(
							Rules.support_element)));

	}

}