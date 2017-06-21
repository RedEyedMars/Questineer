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

public class BodyDecVarEntry implements Entry,IBodyStatement {
	public BodyDecVarEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private VariableEntry variable = (VariableEntry)null;
	private IBodyStatement assignment = (IBodyStatement)null;

	public BodyDecVarEntry(VariableEntry iVariable){
		variable = iVariable;
		assignment = variable.getAssignment();
	}
	public BodyDecVarEntry(Entry iVariable){
		variable = (VariableEntry)iVariable;
		ClassEntry vType = (ClassEntry)null;
		assignment = variable.getAssignment();
	}
	public BodyDecVarEntry(VariableEntry iVariable,IBodyStatement iAssignment){
		variable = iVariable;
		assignment = iAssignment;
	}
	public BodyDecVarEntry(Entry iVariable,Entry iAssignment){
		variable = (VariableEntry)iVariable;
		assignment = (IBodyStatement)iAssignment;
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd() {
		return true;
	}
	public VariableEntry getVariable(){
		return variable;
	}
	public IBodyStatement getAssignment(){
		return assignment;
	}
	public void get(StringBuilder builder){
		ClassEntry vType = (ClassEntry)variable.getType();
		importList.add(vType.getImportList());
		if((assignment != null)){
			importList.add(assignment.getImportList());
		}
		if((assignment == null)){
			new ListEntry(variable.get("SHOW_COMPLETE_TYPE")).get(builder);
		}
		else if((assignment != null)){
			new ElementEntry(GeneralGenerator.operatorElement,new ListEntry(variable.get("SHOW_COMPLETE_TYPE"),new StringEntry("="),assignment)).get(builder);
		}
	}
}