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
								AssociationTokens.WILD,"quote"),"QUOTE","generalBraces","\",\"");
	public static final BracedParser BODY = new BracedParser(
							new ManyParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Comments.COMMENTS,
											Rules.body_element)),"BODY","generalBraces","{,}");
	public static final BracedParser METHOD_ARGUMENTS = new BracedParser(
						new ChainParser(
							new ManyParser(
									AssociationTokens.NEWLINE),
							new OptionalParser(
									Rules.statement),
							new ManyParser(
									
										new ChainParser(
											ActivityTokens.COMMA,
											new ManyParser(
													AssociationTokens.NEWLINE),
											Rules.statement))),"METHOD_ARGUMENTS","generalBraces","(,)");
	public static final BracedParser METHOD_PARAMETERS = new BracedParser(
							new OptionalParser(
									
										new ChainParser(
											Rules.variable_header,
											new ManyParser(
													
														new ChainParser(
															ActivityTokens.COMMA,
															Rules.variable_header)))),"METHOD_PARAMETERS","generalBraces","(,)");
	public static final BracedParser BRACED_STATEMENT = new BracedParser(
							Rules.statement,"BRACED_STATEMENT","generalBraces","(,)");
	public static final BracedParser TILE_ID_CHOICE = new BracedParser(
						new ChainParser(
							new MultipleParser(
									new AddTokenParser(
										AssociationTokens.NAME,"tileName")),
							new ManyParser(
									
										new ChainParser(
											EntityTokens.PIPE,
											new MultipleParser(
													new AddTokenParser(
														AssociationTokens.NAME,"tileName"))))),"TILE_ID_CHOICE","generalBraces","[,]");
	public static final BracedParser ENTITY_ID_CHOICE = new BracedParser(
						new ChainParser(
							new MultipleParser(
									new AddTokenParser(
										AssociationTokens.NAME,"tileName")),
							new ManyParser(
									
										new ChainParser(
											EntityTokens.PIPE,
											new MultipleParser(
													new AddTokenParser(
														AssociationTokens.NAME,"tileName"))))),"ENTITY_ID_CHOICE","generalBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				QUOTE,BODY,METHOD_ARGUMENTS,METHOD_PARAMETERS,BRACED_STATEMENT,TILE_ID_CHOICE,ENTITY_ID_CHOICE);
}