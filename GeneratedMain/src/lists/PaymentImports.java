package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class PaymentImports extends ParseList {

	@Override
	public String getName() {
		return "paymentImports";
	}
	@Override
	public String getSingular() {
		return "paymentImport";
	}

	public static final ImportParser IMPORT_PAYMENT_TYPE = new ImportParser(
						new ChainParser(
							PaymentBraces.PAYMENT_FILE,
							PaymentTokens.PAYMENT),"IMPORT_PAYMENT_TYPE","paymentImports","><<\"overview/treasuries/\",payment_file_name,\".payment\">>\n",
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.payment_type_declaration)));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_PAYMENT_TYPE);
}