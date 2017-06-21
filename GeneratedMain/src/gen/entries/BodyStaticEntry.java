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

public class BodyStaticEntry implements Entry,IBodyStatement {
	public BodyStaticEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private ClassEntry type = (ClassEntry)null;
	private Entry value = (Entry)null;

	public BodyStaticEntry(ClassEntry iClass,Entry iValue){
		value = iValue;
		type = iClass;
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd() {
		return true;
	}
	public ClassEntry getType(){
		return type;
	}
	public Entry getValue(){
		return value;
	}
	public void get(StringBuilder builder){
		importList.add(type.getImportPackage());
		if((value != null)){
			new ElementEntry(GeneralGenerator.asPackageNameElement,new ListEntry(type.get("COMPLETE_NAME"),value)).get(builder);
		}
	}
}