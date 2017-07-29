package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class AffinityBraces extends ParseList {

	@Override
	public String getName() {
		return "affinityBraces";
	}
	@Override
	public String getSingular() {
		return "affinityBrace";
	}

	public static final BracedParser AFFINITY_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"affinity_file_name"),"AFFINITY_FILE","affinityBraces",",.");
	public static final BracedParser AFFINITY_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"description"),"AFFINITY_DESCRIPTION","affinityBraces","\n\t,.");

	public static final ChoiceParser parser = new ChoiceParser(
				AFFINITY_FILE,AFFINITY_DESCRIPTION);
}