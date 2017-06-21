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

public class BodyLinesEntry implements Entry,IBodyElement {
	public BodyLinesEntry getSelf(){
		return this;
	}


	private IContext parentContext = (IContext)null;
	private Integer tab = 0;
	private ListEntry importList = new SetEntry();
	private ListEntry values = (ListEntry)null;

	public BodyLinesEntry(IContext iContext){
		parentContext = iContext;
		values = new ListEntry();
		values.setDelimiter("");
	}
	public BodyLinesEntry(ListEntry iValues){
		values = new ListEntry();
		values.setDelimiter("");
		for(Entry e:iValues){
			this.addLine(e);
		}
	}
	public BodyLinesEntry(ListEntry iValues,IContext iContext){
		parentContext = iContext;
		values = new ListEntry();
		values.setDelimiter("");
		for(Entry e:iValues){
			this.addLine(e);
		}
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
		for(Entry e:values){
			IBodyElement be = (IBodyElement)e;
			be.setParentContext(newParent);
		}
		parentContext = newParent;
	}
	public ListEntry getValues(){
		return values;
	}
	public void addLine(IBodyElement newLine){
		values.add(newLine);
	}
	public void addLine(IBodyStatement newLine){
		values.add(new BodyLineEntry(newLine,parentContext));
	}
	public String addLine(Entry newEntry){
		Class ec = (Class)newEntry.getClass();
		List<Class> interfaces = (List<Class>)Arrays.asList(ec.getInterfaces());
		for(Class i:interfaces){
			String ecn = i.getSimpleName();
			if((ecn.equals("IBodyElement"))){
				values.add(newEntry);
				return "done";
			}
			else {
				if((ecn.equals("IBodyStatement"))){
					values.add(new BodyLineEntry(newEntry,parentContext));
					return "done";
				}
			}
		}
		values.add(new BodyLineEntry(new BodyExactEntry(newEntry),parentContext));
		return "done";
	}
	public void addAll(BodyLinesEntry importer){
		ListEntry oValues = (ListEntry)importer.getValues();
		for(Entry oe:oValues){
			IBodyElement be = (IBodyElement)oe;
			be.setParentContext(parentContext);
			values.add(be);
		}
	}
	public Integer size(){
		return values.size();
	}
	public IBodyElement get(Integer index){
		return (IBodyElement)values.get(index);
	}
	public void get(StringBuilder builder){
		for(Entry e:values){
			IBodyElement be = (IBodyElement)e;
			importList.add(be.getImportList());
		}
		if((values != null)){
			values.get(builder);
		}
	}
}