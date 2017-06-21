package gen;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import gen.checks.*;
import gen.entries.*;
import gen.properties.*;
import lists.*;

public class ImageGenerator extends Generator {



	public static final Element idByNameElement = new Element("idByName",new String[]{"RemImages.",/*imageName*/""});
	public ImageGenerator(){
		addElement("idByName",idByNameElement);
	}
	public Entry generateId(IToken id){
		ListEntry ret = new ListEntry();
		ret.setDelimiter("");
		ret.add(new StringEntry(id.get("image_names").getString()));
		if((id.get("left") != null)){
			ret.add(new StringEntry(id.get("left").getString()));
		}
		if((id.get("right") != null)){
			ret.add(new StringEntry(id.get("left").getString()));
		}
		return new ElementEntry(ImageGenerator.idByNameElement,new ListEntry(ret));
	}
	public Entry generateAnimation(IToken animation){
		return null;
	}


	public String getName(){
		return "Image";
	}

		public void generateRoot(IToken root){
	}

		public void generate(ParseContext data){
	}

		public void setup(ParseContext context){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}