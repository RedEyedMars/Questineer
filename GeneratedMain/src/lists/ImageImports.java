package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class ImageImports extends ParseList {

	@Override
	public String getName() {
		return "imageImports";
	}
	@Override
	public String getSingular() {
		return "imageImport";
	}

	public static final ImportParser IMPORT_IMAGE = new ImportParser(
							
								new ChainParser(
									ImageBraces.IMAGE_FILE,
									ImageTokens.IMGS),"IMPORT_IMAGE","imageImports","><<image_file_name,\".imgs\">>\n",new NamedParserContainer(
							new MultipleParser(
									
									new ChoiceParser(
											AssociationTokens.NEWLINE,
											Rules.image_declaration)),"blank"));

	public static final ChoiceParser parser = new ChoiceParser(
				IMPORT_IMAGE);
}