package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ActivityBraces extends ParseList {

	@Override
	public String getName() {
		return "activityBraces";
	}
	@Override
	public String getSingular() {
		return "activityBrace";
	}

	public static final BracedParser ACTIVITY_FILE = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"activity_file_name"),"ACTIVITY_FILE","activityBraces",",.");
	public static final BracedParser ACTIVITY_DESCRIPTION = new BracedParser(
							new AddTokenParser(
								AssociationTokens.WILD,"description"),"ACTIVITY_DESCRIPTION","activityBraces","\n\t,;;");

	public static final ChoiceParser parser = new ChoiceParser(
				ACTIVITY_FILE,ACTIVITY_DESCRIPTION);
}