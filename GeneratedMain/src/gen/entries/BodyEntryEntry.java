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

public class BodyEntryEntry implements Entry,IBodyStatement {
	public BodyEntryEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private IBodyStatement value = (IBodyStatement)null;

	public BodyEntryEntry(IBodyStatement iValue){
		value = iValue;
	}
	public BodyEntryEntry(Entry iValue){
		value = (IBodyStatement)iValue;
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd(){
		if((value == null)){
			return false;
		}
		return value.hasEnd();
	}
	public IBodyStatement getValue(){
		return value;
	}
	public void setValue(IBodyStatement newValue){
		value = newValue;
	}
	public void get(StringBuilder builder){
		if((value != null)){
			importList.add(value.getImportList());
		}
		if((value != null)){
			value.get(builder);
		}
	}
}