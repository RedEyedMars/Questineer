package clent;
import com.rem.parser.generation.*;
import clgen.*;
public class ExternalVariableEntry extends ExternalImportEntry implements Entry {
	private int tabs = 0;
	private Entry type;
	private Entry name;
	private Entry assignment = null;
	
	public ExternalVariableEntry(Entry type, Entry name, ExternalImportEntry assignment){
		this.type = type;
		this.name = name;
		this.assignment = assignment;
		addImport(new ImportEntry(type));
		addSubImport(assignment);
	}
	public ExternalVariableEntry(Entry type, Entry name){
		this.type = type;
		this.name = name;
		addImport(new ImportEntry(type));
	}
	public String getName(){
		StringBuilder builder = new StringBuilder();
		name.get(builder);
		return builder.toString();
	}
	public Entry getType(){
		return type;
	}
	public void setTabs(int newTabs){
		tabs = newTabs;
	}
	public Entry getAsMember() {
		final ExternalVariableEntry self = this;
		return new Entry(){
			@Override
			public void get(StringBuilder builder) {
				new TabEntry(tabs, new StringEntry("protected ")).get(builder);
				self.get(builder);
				builder.append(";");
			}
			
		};
	}
	public Entry getAsParameter(){
		return new Entry(){
			@Override
			public void get(StringBuilder builder) {
				builder.append("final ");
				type.get(builder);
				builder.append(" ");
				name.get(builder);
			}
			
		};
	}
	public Entry getAsConstructorElement(){
		final ExternalVariableEntry self = this;
		return new Entry(){
			@Override
			public void get(StringBuilder builder) {
				new TabEntry(tabs, new StringEntry("if(")).get(builder);
				name.get(builder);
				builder.append(" != null){");
				new TabEntry(tabs+1, new StringEntry("this.")).get(builder);
				name.get(builder);
				builder.append(" = ");
				name.get(builder);
				builder.append(";");
				new TabEntry(tabs, new StringEntry("}")).get(builder);
			}
			
		};
	}
	public void get(StringBuilder builder){
		if(type != null){
			type.get(builder);
			builder.append(" ");
		}
		name.get(builder);
		if(assignment != null){
			builder.append(" = ");
			assignment.get(builder);
		}
	}
}