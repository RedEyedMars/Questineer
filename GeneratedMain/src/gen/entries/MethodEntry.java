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

public class MethodEntry implements Entry,IContext {
	public MethodEntry getSelf(){
		return this;
	}

	public static final Integer COMPLETE = 0;
	public static final Integer INTERFACE = 1;
	public static final Integer HEADER = 2;
	public static final Integer IMPORTS = 3;
	public static final Integer STATIC_COMPLETE = 4;

	private HashMap<String,VariableEntry> variables = new HashMap<String,VariableEntry>();
	private HashMap<String,VariableEntry> methodHeaders = new HashMap<String,VariableEntry>();
	private HashMap<String,MethodEntry> methods = new HashMap<String,MethodEntry>();
	private IContext parent = (IContext)null;
	private Integer tab = 0;
	private VariableEntry header = (VariableEntry)null;
	private ListEntry parameters = new ListEntry();
	private BodyLinesEntry body = (BodyLinesEntry)null;
	private ListEntry imports = new ListEntry();
	private Integer mode = COMPLETE;

	public MethodEntry(String methodName,String methodType){
		IContext self = (IContext)this.getSelf();
		this.init(methodName,Generators.general.get(methodType),new ListEntry(),new BodyLinesEntry(new ListEntry(),self));
	}
	public MethodEntry(String methodName,ClassEntry methodType){
		IContext self = (IContext)this.getSelf();
		this.init(methodName,methodType,new ListEntry(),new BodyLinesEntry(new ListEntry(),self));
	}
	public MethodEntry(String methodName,String methodType,ListEntry initialParameters){
		IContext self = (IContext)this.getSelf();
		this.init(methodName,Generators.general.get(methodType),initialParameters,new BodyLinesEntry(new ListEntry(),self));
		mode = INTERFACE;
	}
	public MethodEntry(String methodName,String methodType,ListEntry initialParameters,ListEntry initialBody){
		IContext self = (IContext)this.getSelf();
		this.init(methodName,Generators.general.get(methodType),initialParameters,new BodyLinesEntry(initialBody,self));
	}
	public MethodEntry(String methodName,ClassEntry methodType,ListEntry initialParameters,ListEntry initialBody){
		IContext self = (IContext)this.getSelf();
		this.init(methodName,methodType,initialParameters,new BodyLinesEntry(initialBody,self));
	}
	public MethodEntry(String methodName,ClassEntry methodType,ListEntry initialParameters,BodyLinesEntry initialBody){
		initialBody.setParentContext(this.getSelf());
		this.init(methodName,methodType,initialParameters,initialBody);
	}
	public MethodEntry(MethodEntry otherMethod){
		String oName = otherMethod.getName();
		String oType = otherMethod.getTypeName();
		ListEntry oParameters = (ListEntry)otherMethod.getParameters();
		BodyLinesEntry oBody = (BodyLinesEntry)otherMethod.getBody();
		this.init(oName,Generators.general.get(oType),oParameters,oBody);
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
	public VariableEntry getHeader(){
		return header;
	}
	public ListEntry getParameters(){
		return parameters;
	}
	public BodyLinesEntry getBody(){
		return body;
	}
	public ListEntry getImports(){
		return imports;
	}
	public Integer getMode(){
		return mode;
	}
	public void init(String methodName,ClassEntry methodType,ListEntry initialParameters,BodyLinesEntry initialBody){
		header = new VariableEntry(methodName,methodType);
		header.setMode(VariableEntry.SHOW_COMPLETE_TYPE);
		imports.add(header.getImport());
		parameters = initialParameters;
		for(Entry parameter:parameters){
			VariableEntry p = (VariableEntry)parameter;
			p.setMode(VariableEntry.SHOW_COMPLETE_TYPE);
			imports.add(p.getImport());
			this.addVariable(p);
		}
		body = initialBody;
		MethodEntry self = (MethodEntry)this.getSelf();
		body.setParentContext(new NamelessContextEntry(new NamelessContextEntry(self)));
		imports.setDelimiter("");
	}
	public ClassEntry getType(){
		return header.getType();
	}
	public void addParameter(VariableEntry newParameter){
		parameters.add(newParameter.get("SHOW_TYPE"));
		imports.add(newParameter.getImport());
	}
	public void addBodyElement(IBodyElement newBodyElement){
		newBodyElement.setParentContext(this.getSelf());
		body.addLine(newBodyElement);
	}
	public void setMode(Integer newMode){
		mode = newMode;
	}
	public String getName(){
		return header.getName();
	}
	public String getTypeName(){
		return header.getTypeName();
	}
	public Integer numberOfParameters(){
		return parameters.size();
	}
	public Entry getParameter(Integer index){
		return parameters.get(index);
	}
	public Integer numberOfBodyElements(){
		return body.size();
	}
	public IBodyElement getBodyElement(Integer index){
		return body.get(index);
	}
	public MethodEntry get(String option){
		MethodEntry self = (MethodEntry)this.getSelf();
		MethodEntry ret = new MethodEntry(self);
		if((option.equals("STATIC_COMPLETE"))){
			ret.setMode(STATIC_COMPLETE);
			return ret;
		}
		if((option.equals("COMPLETE"))){
			ret.setMode(COMPLETE);
			return ret;
		}
		if((option.equals("INTERFACE"))){
			ret.setMode(INTERFACE);
			return ret;
		}
		if((option.equals("HEADER"))){
			ret.setMode(HEADER);
			return ret;
		}
		if((option.equals("IMPORTS"))){
			ret.setMode(IMPORTS);
			return ret;
		}
		return ret;
	}
	public void get(StringBuilder builder){
		if((mode == COMPLETE)){
			new ElementEntry(GeneralGenerator.declareMethodElement,new ListEntry(header,parameters,body)).get(builder);
		}
		else if((mode == STATIC_COMPLETE)){
			new ElementEntry(GeneralGenerator.declareStaticMethodElement,new ListEntry(header,parameters,body)).get(builder);
		}
		else if((mode == INTERFACE)){
			new ElementEntry(GeneralGenerator.declareInterfaceMethodElement,new ListEntry(header,parameters)).get(builder);
		}
		else if((mode == HEADER)){
			new ElementEntry(GeneralGenerator.exactElement,new ListEntry(header)).get(builder);
		}
		else if((mode == IMPORTS)){
			new ElementEntry(GeneralGenerator.exactElement,new ListEntry(imports)).get(builder);
		}
	}
}