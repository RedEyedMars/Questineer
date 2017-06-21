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

public class BodyNegateEntry implements Entry,IBodyStatement {
	public BodyNegateEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private IBodyStatement value = (IBodyStatement)null;

	public BodyNegateEntry(IBodyStatement iValue){
		value = iValue;
	}
	public BodyNegateEntry(Entry iValue){
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
			new ElementEntry(GeneralGenerator.negateElement,new ListEntry(value)).get(builder);
		}
	}
}