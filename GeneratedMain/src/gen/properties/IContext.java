package gen.properties;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import gen.*;
import gen.checks.*;
import gen.entries.*;
import lists.*;

public interface IContext extends Entry {


	public HashMap<String,VariableEntry> getVariables();
	public HashMap<String,VariableEntry> getMethodHeaders();
	public HashMap<String,MethodEntry> getMethods();
	public IContext getParent();
	public Integer getTab();
	public VariableEntry getVariable(String variableName);
	public void addVariable(VariableEntry variable);
	public MethodEntry getMethod(String methodName);
	public VariableEntry getMethodHeader(String methodName);
	public void addMethod(MethodEntry method);
	public void addMethodHeader(VariableEntry header);
	public void setup(IContext initialParent);
	public void setParent(IContext newParent);
	public void incrementTab(Integer amount);
	public void decrementTab(Integer amount);
}