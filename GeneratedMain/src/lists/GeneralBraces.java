package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class GeneralBraces extends ParseList {

	@Override
	public String getName() {
		return "generalBraces";
	}
	@Override
	public String getSingular() {
		return "generalBrace";
	}

	public static final BracedParser QUOTE = new BracedParser(
							new AddTokenParser(
								ConditionTokens.WILD,"quote"),"QUOTE","generalBraces","\",\"");
	public static final BracedParser BODY = new BracedParser(
							new ManyParser(
									
									new ChoiceParser(
											ConditionTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.body_element)),"BODY","generalBraces","{,}");
	public static final BracedParser METHOD_PARAMETERS = new BracedParser(
						new ChainParser(
							new OptionalParser(
									Rules.statement),
							new ManyParser(
									
										new ChainParser(
											GeneralTokens.COMMA,
											new ManyParser(
													ConditionTokens.NEWLINE),
											Rules.statement))),"METHOD_PARAMETERS","generalBraces","(,)");
	public static final BracedParser BRACED_STATEMENT = new BracedParser(
							Rules.statement,"BRACED_STATEMENT","generalBraces","(,)");

	public static final ChoiceParser parser = new ChoiceParser(
				QUOTE,BODY,METHOD_PARAMETERS,BRACED_STATEMENT);
}