package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class DrawableBraces extends ParseList {

	@Override
	public String getName() {
		return "drawableBraces";
	}
	@Override
	public String getSingular() {
		return "drawableBrace";
	}

	public static final BracedParser DRAWABLE_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"drawable_file_name"),"DRAWABLE_FILE","drawableBraces",",.");
	public static final BracedParser DRAWABLE_DIMENSIONS = new BracedParser(
						new ChainParser(
							new AddTokenParser(
								
								new ChainParser(
									Rules.drawable_multiple_value,
									new ManyParser(
											
												new ChainParser(
													Rules.drawable_arthmetic_operator,
													Rules.drawable_multiple_value))),"leftParameter"),
							AnimationTokens.COMMA,
							new AddTokenParser(
								
								new ChainParser(
									Rules.drawable_multiple_value,
									new ManyParser(
											
												new ChainParser(
													Rules.drawable_arthmetic_operator,
													Rules.drawable_multiple_value))),"rightParameter")),"DRAWABLE_DIMENSIONS","drawableBraces","(,)");
	public static final BracedParser MULTIPLE_DRAWABLE_POINTS = new BracedParser(
						new ChainParser(
							new AddTokenParser(
								AnimationTokens.INTEGER,"point"),
							new ManyParser(
									
										new ChainParser(
											AnimationTokens.COMMA,
											new AddTokenParser(
												AnimationTokens.INTEGER,"point")))),"MULTIPLE_DRAWABLE_POINTS","drawableBraces","[,]");

	public static final ChoiceParser parser = new ChoiceParser(
				DRAWABLE_FILE,DRAWABLE_DIMENSIONS,MULTIPLE_DRAWABLE_POINTS);
}