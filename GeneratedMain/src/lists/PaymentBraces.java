package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class PaymentBraces extends ParseList {

	@Override
	public String getName() {
		return "paymentBraces";
	}
	@Override
	public String getSingular() {
		return "paymentBrace";
	}

	public static final BracedParser PAYMENT_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"payment_file_name"),"PAYMENT_FILE","paymentBraces",",.");

	public static final ChoiceParser parser = new ChoiceParser(
				PAYMENT_FILE);
}