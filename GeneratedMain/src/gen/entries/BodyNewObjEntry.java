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

public class BodyNewObjEntry implements Entry,IBodyStatement {
	public BodyNewObjEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private ClassEntry type = (ClassEntry)null;
	private ListEntry parameters = (ListEntry)null;

	public BodyNewObjEntry(ClassEntry iClass){
		type = iClass;
		parameters = new ListEntry();
	}
	public BodyNewObjEntry(ClassEntry iClass,ListEntry iParameters){
		type = iClass;
		parameters = iParameters;
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
	public ListEntry getParameters(){
		return parameters;
	}
	public void get(StringBuilder builder){
		importList.add(type.getImportPackage());
		for(Entry e:parameters){
			IBodyStatement be = (IBodyStatement)e;
			importList.add(be.getImportList());
		}
		if((parameters != null)){
			new ElementEntry(GeneralGenerator.newObjectCallElement,new ListEntry(type.get("COMPLETE_NAME"),parameters)).get(builder);
		}
	}
}