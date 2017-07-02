package clent;
import com.rem.parser.generation.*;
import clgen.*;
import java.util.List;
public class ExternalMethodEntry extends ExternalImportEntry {
	private Integer tabs = 0;
	private Entry type;
	private Entry name;
	private List<ExternalVariableEntry> parameters;
	private List<ExternalBodyEntry> body;
	
	public ExternalMethodEntry(Integer tabs, Entry type, Entry name, List<ExternalVariableEntry> parameters, List<ExternalBodyEntry> body){
		this.tabs = tabs;
		this.type = type;
		this.name = name;
		this.parameters = parameters;
		this.body = body;
		addImport(new ImportEntry(type));
		for(ExternalVariableEntry variable:parameters){
			addSubImport(variable);
		}
		for(ExternalBodyEntry element:body){
			addSubImport(element);
		}
	}
	public void setTabs(int newTabs){
		tabs = newTabs;
	}
	public String getName(){
		StringBuilder builder = new StringBuilder();
		name.get(builder);
		return builder.toString();
	}
	public void addParameter(ExternalVariableEntry newParameter){
		parameters.add(newParameter);
	}
	public void addBody(List<ExternalBodyEntry> newBodyParts){
		body.addAll(newBodyParts);
	}
	public void get(StringBuilder builder){
		new TabEntry(tabs, new StringEntry("public ")).get(builder);
		type.get(builder);
		builder.append(" ");
		name.get(builder);
		builder.append("(");
		if(!parameters.isEmpty()){
			parameters.get(0).get(builder);
		}
		for(int i=1;i<parameters.size();++i){
			builder.append(",");
			parameters.get(i).get(builder);
		}
		builder.append(") {");
		for(int i=0;i<body.size();++i){
			body.get(i).setTabs(tabs+1);
			body.get(i).get(builder);
		}
		new TabEntry(tabs, new StringEntry("}")).get(builder);
	}
}