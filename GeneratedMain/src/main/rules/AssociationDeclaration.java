package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AssociationDeclaration extends ConcreteRule {

	public static final IRule parser = new AssociationDeclaration();

	public AssociationDeclaration(){
		super("association_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"associationName","association_names"),
					new ManyParser(
							
							new ChoiceParser(
									Comments.COMMENTS,
									Rules.association_element,
									AssociationTokens.NEWLINE))));

	}

}