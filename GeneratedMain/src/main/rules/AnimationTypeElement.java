package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class AnimationTypeElement extends ConcreteRule {

	public static final IRule parser = new AnimationTypeElement();

	public AnimationTypeElement(){
		super("animation_type_element");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					AssociationTokens.NEWLINE,
					Comments.COMMENTS,
					new AddTokenParser(
						
						new ChainParser(
							new AddTokenParser(
								AssociationTokens.NAME,"variableName"),
							Rules.anit_operator,
							new AddTokenParser(
								
							new ChoiceParser(
									AnimationTokens.INTEGER,
									AnimationTokens.FLOAT,
									AssociationTokens.NAME,
									AnimationBraces.ANIMATION_TYPE_FRAME_DATA),"value"),
							new OptionalParser(
									
										new ChainParser(
											AssociationTokens.IF,
											Rules.animation_type_boolean,
											new ManyParser(
													
														new ChainParser(
															Rules.anit_continuation_operator,
															Rules.animation_type_boolean))))),"statement"),
					Rules.animation_type_declaration));

	}

}