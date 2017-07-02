package clent;
import com.rem.parser.generation.*;
import clgen.*;
import java.util.*;
public class ExternalClassEntry extends ExternalImportEntry {
	private Map<String,ExternalVariableEntry> variables = new HashMap<String,ExternalVariableEntry>();
	private Map<String,ExternalMethodEntry> methods = new HashMap<String,ExternalMethodEntry>();
	private Map<String,ExternalClassEntry> classes = new HashMap<String,ExternalClassEntry>();
	
	private String name;
	private int tabs;
	private Entry header;
	private Entry packageName;
	private boolean isSubClass = false;
	
	public ExternalClassEntry(Entry initialPackageName, Entry preImports, Entry initialName, Entry initialHeader, List<ExternalVariableEntry> initialVariables, List<ExternalMethodEntry> initialMethods, List<ExternalClassEntry> initialSubClasses){
		super(preImports);
		StringBuilder builder = new StringBuilder();
		initialName.get(builder);
		name = builder.toString();
		packageName = initialPackageName;
		ExternalImportEntry.packages.put(name, packageName);
		header = initialHeader;
		
		
		for(ExternalVariableEntry variable:initialVariables){
			addVariable(variable);
		}
		for(ExternalMethodEntry method:initialMethods){
			addMethod(method);
		}
		for(ExternalClassEntry subClass:initialSubClasses){
			addSubClass(subClass);
		}
	}
	
	public void addVariable(final ExternalVariableEntry variable){
		variables.put(variable.getName(), variable);
		addSubImport(variable);
		addMethod(new ExternalMethodEntry(0,variable.getType(),new Entry(){
			@Override
			public void get(StringBuilder builder) {
				builder.append("get");
				builder.append(Generator.camelize(variable.getName()));
			}
		},new ArrayList<ExternalVariableEntry>(),new ArrayList<ExternalBodyEntry>(Arrays.asList(new ExternalBodyEntry[]{
			new ExternalBodyEntry(){
				@Override
				public void get(StringBuilder builder) {
					new TabEntry(tabs, new StringEntry("return ")).get(builder);;
					builder.append(variable.getName());
					builder.append(";");
				}
			}
		}))));
	}
	public void addMethod(ExternalMethodEntry method){
		methods.put(method.getName(), method);
		addSubImport(method);
	}
	public void addSubClass(ExternalClassEntry subClass){
		classes.put(subClass.getName(), subClass);
		addSubImport(subClass);
		subClass.isSubClass  = true;
	}
	public ExternalVariableEntry getVariable(String variableName){
		return variables.get(variableName);
	}
	public ExternalMethodEntry getMethod(String methodName){
		return methods.get(methodName);
	}
	public ExternalClassEntry getSubClass(String subClassName){
		return classes.get(subClassName);
	}
	public String getName(){
		return name;
	}
	public void setTabs(int newTabs){
		tabs = newTabs;
	}
	public void get(StringBuilder builder){
		if(isSubClass == false){
			builder.append("package ");
			packageName.get(builder);
			builder.append(";");
			outputImport(builder);
		}
		new TabEntry(tabs, header).get(builder);
		for(String variableKey:variables.keySet()){
			variables.get(variableKey).setTabs(tabs+1);
			variables.get(variableKey).getAsMember().get(builder);
		}
		new TabEntry(tabs+1,new StringEntry("public ")).get(builder);
		builder.append(name);
		builder.append("(");
		String comma = "";
		for(String variableKey:variables.keySet()){
			builder.append(comma);
			variables.get(variableKey).getAsParameter().get(builder);
			comma = ", ";
		}
		builder.append(") {");
		for(String variableKey:variables.keySet()){
			variables.get(variableKey).setTabs(tabs+2);
			variables.get(variableKey).getAsConstructorElement().get(builder);
		}
		new TabEntry(tabs+1,new StringEntry("}")).get(builder);
		for(String methodKey: methods.keySet()){
			methods.get(methodKey).setTabs(tabs+1);
			methods.get(methodKey).get(builder);
		}
		for(String classKey: classes.keySet()){
			classes.get(classKey).setTabs(tabs+1);
			classes.get(classKey).get(builder);
		}
		new TabEntry(tabs, new StringEntry("}")).get(builder);
	}
}