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

public class BodyConditionalEntry implements Entry,IBodyElement {
	public BodyConditionalEntry getSelf(){
		return this;
	}


	private IContext parentContext = (IContext)null;
	private Integer tab = 0;
	private ListEntry importList = new SetEntry();
	private String name = null;
	private IBodyStatement header = (IBodyStatement)null;
	private BodyLinesEntry body = (BodyLinesEntry)null;

	public BodyConditionalEntry(String iName,BodyLinesEntry iBody,IContext iContext){
		name = iName;
		body = iBody;
		parentContext = iContext;
	}
	public BodyConditionalEntry(String iName,IBodyStatement iHeader,BodyLinesEntry iBody,IContext iContext){
		name = iName;
		header = iHeader;
		body = iBody;
		parentContext = iContext;
	}
	public BodyConditionalEntry(String iName,IBodyStatement iHeader,BodyLinesEntry iBody){
		name = iName;
		header = iHeader;
		body = iBody;
	}
	public BodyConditionalEntry(String iName,ListEntry iBody,IContext iContext){
		name = iName;
		body = new BodyLinesEntry(iBody,new NamelessContextEntry(iContext));
		parentContext = iContext;
	}
	public BodyConditionalEntry(String iName,IBodyStatement iHeader,ListEntry iBody,IContext iContext){
		name = iName;
		header = iHeader;
		body = new BodyLinesEntry(iBody,new NamelessContextEntry(iContext));
		parentContext = iContext;
	}
	public BodyConditionalEntry(String iName,IBodyStatement iHeader,ListEntry iBody){
		name = iName;
		header = iHeader;
		body = new BodyLinesEntry(iBody);
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
	public void setParentContext(IContext newParent){
		body.setParentContext(newParent);
		parentContext = newParent;
	}
	public String getName(){
		return name;
	}
	public IBodyStatement getHeader(){
		return header;
	}
	public BodyLinesEntry getBody(){
		return body;
	}
	public void get(StringBuilder builder){
		tab = parentContext.getTab();
		tab = tab + 1;
		StringBuilder delimiterBuilder = new StringBuilder();
		if((header != null)){
			importList.add(header.getImportList());
		}
		ListEntry values = (ListEntry)body.getValues();
		for(Entry e:values){
			IBodyElement be = (IBodyElement)e;
			importList.add(be.getImportList());
		}
		if((header != null)){
			new TabEntry(tab,new ListEntry(new ElementEntry(GeneralGenerator.conditionalWithHeaderElement,new ListEntry(new StringEntry(name),header,body)))).get(builder);
		}
		else if((header == null)){
			new TabEntry(tab,new ListEntry(new ElementEntry(GeneralGenerator.conditionalWithoutHeaderElement,new ListEntry(new StringEntry(name),body)))).get(builder);
		}
		if((name != null)){
			new TabEntry(tab,new ListEntry(new StringEntry("}"))).get(builder);
		}
	}
}