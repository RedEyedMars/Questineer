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

public class BodyExactEntry implements Entry,IBodyStatement {
	public BodyExactEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private Entry value = null;

	public BodyExactEntry(Entry iEntry){
		value = iEntry;
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd() {
		return true;
	}	public Entry getValue(){
		return value;
	}
	public void get(StringBuilder builder){
		if((value != null)){
			value.get(builder);
		}
	}
}