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

public class BodyLineEntry implements Entry,IBodyElement {
	public BodyLineEntry getSelf(){
		return this;
	}


	private IContext parentContext = (IContext)null;
	private Integer tab = 0;
	private ListEntry importList = new SetEntry();
	private IBodyStatement value = (IBodyStatement)null;

	public BodyLineEntry(Entry iEntry){
		value = (IBodyStatement)iEntry;
	}
	public BodyLineEntry(IBodyStatement iValue){
		value = iValue;
	}
	public BodyLineEntry(IBodyStatement iValue,IContext iContext){
		parentContext = iContext;
		value = iValue;
	}
	public BodyLineEntry(Entry iValue,IContext iContext){
		parentContext = iContext;
		value = (IBodyStatement)iValue;
	}

	public IContext getParentContext(){
		return parentContext;
	}
	public Integer getTab(){
		return tab;
	}
	public ListEntry getImportList(){
		return importList;
	}
	public void setParentContext(IContext newParent) {
		parentContext = newParent;
	}
	public IBodyStatement getValue(){
		return value;
	}
	public void get(StringBuilder builder){
		tab = parentContext.getTab();
		tab = tab + 1;
		importList.add(value.getImportList());
		if((value != null)){
			new TabEntry(tab,new ListEntry(value)).get(builder);
		}
		if((value != null)){
			new StringEntry(";").get(builder);
		}
	}
}