package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class BranchElement extends ConcreteRule {

	public static final IRule parser = new BranchElement();

	public BranchElement(){
		super("branch_element");
	}
	@Override
	public void setup(){
		set(
				new ChainParser(
					TileTokens.NEWTABTABTAB,
					new AddTokenParser(
						GeneralTokens.INTEGER,"amount"),
					PaymentTokens.DASH,
					new AddTokenParser(
						Rules.num,"chance"),
					GeneralTokens.PERCENT));

	}

}