package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class MapBraces extends ParseList {

	@Override
	public String getName() {
		return "mapBraces";
	}
	@Override
	public String getSingular() {
		return "mapBrace";
	}

	public static final BracedParser MAP_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"map_file_name"),"MAP_FILE","mapBraces",",.");
	public static final BracedParser PATCH_PROBABILITY = new BracedParser(
						new ChainParser(
							new AddTokenParser(
								
								new ChainParser(
									new AddTokenParser(
										AnimationTokens.INTEGER,"amount"),
									PaymentTokens.COLON,
									new AddTokenParser(
										AnimationTokens.INTEGER,"percent"),
									GeneralTokens.PERCENT),"probability"),
							new ManyParser(
									new AddTokenParser(
										
										new ChainParser(
											AnimationTokens.COMMA,
											new AddTokenParser(
												AnimationTokens.INTEGER,"amount"),
											PaymentTokens.COLON,
											new AddTokenParser(
												AnimationTokens.INTEGER,"percent"),
											GeneralTokens.PERCENT),"probability"))),"PATCH_PROBABILITY","mapBraces","(,)");

	public static final ChoiceParser parser = new ChoiceParser(
				MAP_FILE,PATCH_PROBABILITY);
}