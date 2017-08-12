package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class PaymentTypeDeclaration extends ConcreteRule {

	public static final IRule parser = new PaymentTypeDeclaration();

	public PaymentTypeDeclaration(){
		super("payment_type_declaration");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
				new ChainParser(
					new AddTokenParser(
						AssociationTokens.NAME,"typeName"),
					PaymentTokens.COLON,
					new AddTokenToListParser(
						AssociationTokens.NAME,"shortForm","payment_short_type_names"),
					PaymentTokens.DASH,
					new AddTokenToListParser(
						AssociationTokens.NAME,"longForm","payment_long_type_names")),
				new ChainParser(
					new AddTokenToListParser(
						AssociationTokens.NAME,"shortForm","payment_short_type_names"),
					PaymentTokens.DASH,
					new AddTokenToListParser(
						AssociationTokens.NAME,"longForm","payment_long_type_names"))));

	}

}