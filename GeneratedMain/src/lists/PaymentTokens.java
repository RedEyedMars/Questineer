package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class PaymentTokens extends ParseList {

	@Override
	public String getName() {
		return "paymentTokens";
	}
	@Override
	public String getSingular() {
		return "paymentToken";
	}

	public static final RegexParser NAME = new RegexParser("NAME","paymentTokens","[a-zA-Z_][a-zA-Z0-9_]*");
	public static final RegexParser WILD = new RegexParser("WILD","paymentTokens",".*");
	public static final ExactParser PAYMENT = new ExactParser("PAYMENT","paymentTokens","payment");
	public static final ExactParser DASH = new ExactParser("DASH","paymentTokens","-");
	public static final ExactParser COLON = new ExactParser("COLON","paymentTokens",":");

	public static final ChoiceParser parser = new ChoiceParser(
				NAME,WILD,PAYMENT,DASH,COLON);
}