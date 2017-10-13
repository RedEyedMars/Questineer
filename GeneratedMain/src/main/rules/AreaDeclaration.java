package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AreaDeclaration extends ConcreteRule {

	public static final IRule parser = new AreaDeclaration();

	public AreaDeclaration(){
		super("area_declaration");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					new ManyParser(
							AssociationTokens.NEWLINE),
					new AddTokenParser(
						AssociationTokens.NAME,"areaName"),
					new AddTokenParser(
						AnimationTokens.INTEGER,"chance"),
					GeneralTokens.PERCENT,
					PaymentTokens.COLON,
					new ManyParser(
							
								new ChainParser(
									AssociationTokens.NEWTAB,
									Rules.area_shape_name,
									MapBraces.AREA_DIMENSIONS,
									new ManyParser(
											
												new ChainParser(
													ConditionTokens.NEWTABTAB,
													Rules.area_element))))));

	}

}