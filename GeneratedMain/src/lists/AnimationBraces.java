package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AnimationBraces extends ParseList {

	@Override
	public String getName() {
		return "animationBraces";
	}
	@Override
	public String getSingular() {
		return "animationBrace";
	}

	public static final BracedParser ANIMATION_TYPE_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"animation_type_file_name"),"ANIMATION_TYPE_FILE","animationBraces",",.");
	public static final BracedParser ANIMATION_TYPE_VARIABLES = new BracedParser(
						new ChainParser(
							new OptionalParser(
									Rules.animation_type_variable_declaration),
							new ManyParser(
									
										new ChainParser(
											AnimationTokens.COMMA,
											Rules.animation_type_variable_declaration))),"ANIMATION_TYPE_VARIABLES","animationBraces","(,)");
	public static final BracedParser ANIMATION_TYPE_BODY = new BracedParser(
							new ManyParser(
									Rules.animation_type_element),"ANIMATION_TYPE_BODY","animationBraces","{,}");
	public static final BracedParser ANIMATION_TYPE_FRAME_DATA = new BracedParser(
							new AddTokenParser(
								AssociationTokens.NAME,"frameName"),"ANIMATION_TYPE_FRAME_DATA","animationBraces","[,]");
	public static final BracedParser QUOTE = new BracedParser(
							AssociationTokens.WILD,"QUOTE","animationBraces","\",\"");

	public static final ChoiceParser parser = new ChoiceParser(
				ANIMATION_TYPE_FILE,ANIMATION_TYPE_VARIABLES,ANIMATION_TYPE_BODY,ANIMATION_TYPE_FRAME_DATA,QUOTE);
}