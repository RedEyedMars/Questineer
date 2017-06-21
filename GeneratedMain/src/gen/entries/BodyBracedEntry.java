package gen.entries;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import gen.*;
import gen.checks.*;
import gen.properties.*;
import lists.*;

public class BodyBracedEntry implements Entry,IBodyStatement {
	public BodyBracedEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private IBodyStatement value = (IBodyStatement)null;

	public BodyBracedEntry(IBodyStatement iValue){
		value = iValue;
	}
	public BodyBracedEntry(Entry iValue){
		value = (IBodyStatement)iValue;
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd() {
		return true;
	}
	public IBodyStatement getValue(){
		return value;
	}
	public void get(StringBuilder builder){
		importList.add(value.getImportList());
		if((value != null)){
			new ElementEntry(GeneralGenerator.bracedElement,new ListEntry(value)).get(builder);
		}
	}
}