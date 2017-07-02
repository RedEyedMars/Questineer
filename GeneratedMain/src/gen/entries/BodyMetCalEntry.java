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

public class BodyMetCalEntry implements Entry,IBodyStatement {
	public BodyMetCalEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private IBodyStatement subject = (IBodyStatement)null;
	private Entry methodName = null;
	private ListEntry parameters = (ListEntry)null;

	public BodyMetCalEntry(Entry iMethodName){
		methodName = iMethodName;
		parameters = new ListEntry();
	}
	public BodyMetCalEntry(Entry iMethodName,ListEntry iParameters){
		methodName = iMethodName;
		parameters = iParameters;
	}
	public BodyMetCalEntry(IBodyStatement iSubject,Entry iMethodName,ListEntry iParameters){
		subject = iSubject;
		methodName = iMethodName;
		parameters = iParameters;
	}
	public BodyMetCalEntry(Entry iSubject,Entry iMethodName,ListEntry iParameters){
		subject = new BodyExactEntry(iSubject);
		methodName = iMethodName;
		parameters = iParameters;
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd() {
		return true;
	}
	public IBodyStatement getSubject(){
		return subject;
	}	public Entry getMethodName(){
		return methodName;
	}
	public ListEntry getParameters(){
		return parameters;
	}
	public void get(StringBuilder builder){
		if((subject != null)){
			importList.add(subject.getImportList());
		}
		for(Entry e:parameters){
			IBodyStatement be = (IBodyStatement)e;
			importList.add(be.getImportList());
		}
		if((subject == null)){
			new ElementEntry(GeneralGenerator.subjectlessMethodCallElement,new ListEntry(methodName,parameters)).get(builder);
		}
		else if((subject != null)){
			new ElementEntry(GeneralGenerator.methodCallElement,new ListEntry(subject,methodName,parameters)).get(builder);
		}
	}
}