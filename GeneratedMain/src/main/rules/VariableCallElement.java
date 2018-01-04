package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class VariableCallElement extends ConcreteRule {

	public static final IRule parser = new VariableCallElement();

	public VariableCallElement(){
		super("variable_call_element");
	}
	@Override
	public void setup(){
		isSilent(true);
		set(
			new ChoiceParser(
					new AddTokenParser(
						GeneralBraces.BRACED_STATEMENT,"braced"),
					new AddTokenParser(
						
						new ChainParser(
							Rules.type_name,
							GeneralTokens.CAST_ARROW,
							Rules.statement),"cast"),
					new AddTokenParser(
						
						new ChainParser(
							Rules.type_name,
							GeneralTokens.STATIC_ACCESS,
							new AddTokenParser(
								AssociationTokens.NAME,"variableName")),"access_static"),
					Rules.method,
					Rules.variable_group,
					new AddTokenParser(
						AssociationTokens.NAME,"variableName"),
					new AddTokenParser(
						AnimationBraces.QUOTE,"quote")));

	}

}