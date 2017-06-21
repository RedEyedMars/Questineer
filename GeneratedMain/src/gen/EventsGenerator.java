package gen;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import gen.checks.*;
import gen.entries.*;
import gen.properties.*;
import lists.*;

public class EventsGenerator extends Generator {

	private File directory = null;
	private String packageName = null;
	private HashMap<String,ListEntry> variableDefs = new HashMap<String,ListEntry>();
	private HashSet<String> eventNameSet = new HashSet<String>();
	private ListEntry methodHeaders = new ListEntry();
	private ListEntry methodParameters = new ListEntry();
	private ClassEntry superEventsClass = (ClassEntry)null;
	private ClassEntry superEventClass = (ClassEntry)null;


	public EventsGenerator(){
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"events");
		directory.mkdirs();
		superEventsClass = Generators.general.init(new ClassEntry("events","Events",null,null,new ListEntry(),new ListEntry(),new ListEntry()));
		superEventClass = Generators.general.init(new ClassEntry("events","Event",null,null,new ListEntry(),new ListEntry(),new ListEntry()));
		Generators.events.addFile(directory,"Event.java",superEventClass.get("COMPLETE"));
		Generators.events.addFile(directory,"Events.java",superEventsClass.get("COMPLETE"));
	}
	public Entry generateEventDeclaration(IToken eventDeclaration){
		String eventName = eventDeclaration.get("eventName").getString();
		eventNameSet.add(eventName);
		ListEntry variables = new ListEntry();
		List<IToken> elementParameter = eventDeclaration.getAll("parameter");
		if(elementParameter != null){
			for(IToken element:elementParameter){
				List<IToken> atomTypeName = element.getAll("type_name");
				if(atomTypeName != null){
					for(IToken atom:atomTypeName){
						Entry typeName = Generators.general.generateTypeName(atom);
						variables.add(new VariableEntry(element.get("name").getString(),typeName.toString()));
					}
				}
			}
		}
		ClassEntry eventClass = new ClassEntry("events",Generator.camelize(eventName.toString()),superEventClass,null,variables,new ListEntry(),new ListEntry());
		superEventsClass.addSubClass(eventClass);
		Generators.general.init(eventClass);
		String methodHeaderName = Generators.events.buildString("on",Generator.camelize(eventName.toString()));
		String parameterType = Generators.events.buildString("Events.",Generator.camelize(eventName.toString()));
		VariableEntry header = new VariableEntry(methodHeaderName,"void");
		header.setMode(VariableEntry.WITH_TYPE);
		methodHeaders.add(header);
		VariableEntry parameter = new VariableEntry("event",parameterType);
		methodParameters.add(new ListEntry(parameter.get("SHOW_TYPE")));
		return null;
	}
	public NamelessContextEntry getEventContext(String eName,ClassEntry inputClass){
		NamelessContextEntry eventContext = new NamelessContextEntry(inputClass);
		String eventClassName = Generators.events.buildString("Events.",Generator.camelize(eName.toString()));
		eventContext.addVariable(new VariableEntry("event",eventClassName));
		return eventContext;
	}
	public void addEventMethod(String eName,ClassEntry inputClass,ListEntry body){
		String eventName = Generators.events.buildString("on",Generator.camelize(eName.toString()));
		String eventParameter = Generators.events.buildString("Events.",Generator.camelize(eName.toString()));
		ClassEntry inputParentClass = (ClassEntry)inputClass.getParentClass();
		if((inputParentClass == null)){
			inputClass.addMethod(new MethodEntry(eventName,"void",new ListEntry(new VariableEntry("event",eventParameter)),body));
		}
		else {
			HashMap<String,VariableEntry> inputSuperMethods = (HashMap<String,VariableEntry>)inputParentClass.getMethodHeaders();
			if((inputSuperMethods.containsKey(eventName))){
				inputClass.addMethod(new MethodEntry(eventName,"void",new ListEntry(new VariableEntry("event",eventParameter)),new ListEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("super")),new StringEntry(eventName),new ListEntry(new BodyExactEntry(new StringEntry("event")))),body)));
			}
			else {
				inputClass.addMethod(new MethodEntry(eventName,"void",new ListEntry(new VariableEntry("event",eventParameter)),body));
			}
		}
	}
	public void addEventMethods(ClassEntry inputClass,ListEntry nameDefs,ListEntry bodyDefs){
		Integer numberOfNames = nameDefs.size();
		for(String eventName:eventNameSet){
			Boolean setBody = false;
			for(Integer i = 0;i<numberOfNames;++i){
				if((nameDefs.get(i).toString().equals(eventName))){
					Generators.events.addEventMethod(eventName,inputClass,(ListEntry)bodyDefs.get(i));
					setBody = true;
				}
			}
			if((setBody == false)){
				Generators.events.addEventMethod(eventName,inputClass,new ListEntry());
			}
		}
	}

	public File getDirectory(){
		return directory;
	}

	public String getPackageName(){
		return packageName;
	}

	public HashMap<String,ListEntry> getVariableDefs(){
		return variableDefs;
	}

	public HashSet<String> getEventNameSet(){
		return eventNameSet;
	}

	public ListEntry getMethodHeaders(){
		return methodHeaders;
	}

	public ListEntry getMethodParameters(){
		return methodParameters;
	}

	public ClassEntry getSuperEventsClass(){
		return superEventsClass;
	}

	public ClassEntry getSuperEventClass(){
		return superEventClass;
	}

	public String getName(){
		return "Events";
	}

		public void generateRoot(IToken root){
	}

		public void generate(ParseContext data){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}