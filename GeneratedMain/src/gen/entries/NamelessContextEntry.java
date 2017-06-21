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

public class NamelessContextEntry implements Entry,IContext {
	public NamelessContextEntry getSelf(){
		return this;
	}


	private HashMap<String,VariableEntry> variables = new HashMap<String,VariableEntry>();
	private HashMap<String,VariableEntry> methodHeaders = new HashMap<String,VariableEntry>();
	private HashMap<String,MethodEntry> methods = new HashMap<String,MethodEntry>();
	private IContext parent = (IContext)null;
	private Integer tab = 0;

	public NamelessContextEntry(IContext initialParent){
		this.setup(initialParent);
	}

	public HashMap<String,VariableEntry> getVariables(){
		return variables;
	}
	public HashMap<String,VariableEntry> getMethodHeaders(){
		return methodHeaders;
	}
	public HashMap<String,MethodEntry> getMethods(){
		return methods;
	}
	public IContext getParent(){
		return parent;
	}
	public Integer getTab(){
		return tab;
	}
	public VariableEntry getVariable(String variableName) {
		if((variables.containsKey(variableName))){
			return variables.get(variableName);
		}
		else {
			if((parent != null)){
				return parent.getVariable(variableName);
			}
			else {
				return null;
			}
		}
	}
	public void addVariable(VariableEntry variable) {
		variables.put(variable.getName(),variable);
	}
	public MethodEntry getMethod(String methodName) {
		if((methods.containsKey(methodName))){
			return methods.get(methodName);
		}
		else {
			if((parent != null)){
				return parent.getMethod(methodName);
			}
			else {
				return null;
			}
		}
	}
	public VariableEntry getMethodHeader(String methodName) {
		if((methodHeaders.containsKey(methodName))){
			return methodHeaders.get(methodName);
		}
		else {
			if((parent != null)){
				return parent.getMethodHeader(methodName);
			}
			else {
				return null;
			}
		}
	}
	public void addMethod(MethodEntry method) {
		methodHeaders.put(method.getName(),method.getHeader());
		methods.put(method.getName(),method);
	}
	public void addMethodHeader(VariableEntry header) {
		methodHeaders.put(header.getName(),header);
	}
	public void setup(IContext initialParent) {
		parent = initialParent;
		if((parent != null)){
			tab = parent.getTab();
			tab = tab + 1;
		}
	}
	public void setParent(IContext newParent) {
		parent = newParent;
		if((parent != null)){
			tab = parent.getTab();
			tab = tab + 1;
		}
	}
	public void incrementTab(Integer amount) {
		tab = tab + amount;
	}
	public void decrementTab(Integer amount) {
		tab = tab - amount;
	}
	public void get(StringBuilder builder){
	}
}