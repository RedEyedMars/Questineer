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

public class BodyElementEntry implements Entry {
	public BodyElementEntry getSelf(){
		return this;
	}


	private IContext parentContext = (IContext)null;
	private Entry value = null;
	private Integer tab = 0;

	public BodyElementEntry(Entry iValue){
		value = iValue;
	}
	public BodyElementEntry(Entry iValue,IContext iContext){
		parentContext = iContext;
		value = iValue;
	}

	public IContext getParentContext(){
		return parentContext;
	}	public Entry getValue(){
		return value;
	}
	public Integer getTab(){
		return tab;
	}
	public void get(StringBuilder builder){
		tab = parentContext.getTab();
		tab = tab + 1;
		if((true == true)){
			new TabEntry(tab,new ListEntry(value)).get(builder);
		}
	}
}