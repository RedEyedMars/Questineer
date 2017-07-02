package clgen;
import com.rem.parser.generation.*;
import clent.*;
import java.util.*;
import java.io.File;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.rem.parser.token.IToken;
import clent.ExternalMethodEntry;
import java.util.List;
import clent.ExternalClassEntry;
import java.util.Iterator;
import com.rem.parser.ParseContext;
import lists.HeroStats;
import lists.EventNames;
import com.rem.parser.parser.IParser;
import lists.Rules;
import lists.Listnames;
import com.rem.parser.parser.RegexParser;
import lists.GeneralTokens;
public class MainFlow extends FlowController  {
	//Externals


	protected Events EventsClass = new Events();
	public class Events extends ExternalClassEntry {
		protected final Map<String,List<Entry>> variableDefs = new HashMap<String,List<Entry>>();
		protected final Set<String> eventNameSet = new HashSet<String>();

	
public void declaration(final IToken declaration) {
	final String eventName = declaration.get("eventName").toString();
	eventNameSet.add(eventName);
	final String cev = Generator.camelize(eventName);
EventsClass.addSubClass(new ExternalClassEntry(new Entry(){
			public void get(StringBuilder builder){/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);builder.append(".");new StringEntry("Event").get(builder);builder.append(";");
			}
		},new StringEntry(cev), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(cev).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("Event").get(builder);
					}
				}.get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})));
	for(final IToken element:declaration.getAllSafely("parameter")) {
		for(final IToken atom:element.getAllSafely("type_name")) {
EventsClass.getSubClass(cev).addVariable(new ExternalVariableEntry(/*Name*/new Entry(){
					public void get(StringBuilder builder){
						/*Enty*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(getTypeName(atom).toString()).get(builder);
					}
				}.get(builder);
					}
				}, /*Enty*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(element.get("name").toString()).get(builder);
					}
				}));
		}
	}
}
	
public void addParameter(final String eventName,final ExternalMethodEntry method) {
	method.addParameter(new ExternalVariableEntry(/*Name*/new Entry(){
					public void get(StringBuilder builder){
						/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(eventName).get(builder);
					}
				}.get(builder);
					}
				}, /*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("event").get(builder);
					}
				}));
}
	
public void addEventMethod(final String eName,final List<ExternalBodyEntry> body,final ExternalClassEntry inputClass) {
	final ExternalMethodEntry newMethod = new ExternalMethodEntry(1, /*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("void").get(builder);
					}
				}, /*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("on").get(builder);
					}
				}, /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(/*Name*/new Entry(){
					public void get(StringBuilder builder){
						/*Name*/new Entry(){
					public void get(StringBuilder builder){
						/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("Events").get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(Generator.camelize(eName)).get(builder);
					}
				}.get(builder);
					}
				}.get(builder);
					}
				}, /*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("event").get(builder);
					}
				})}), /*Body*/Arrays.asList(new ExternalBodyEntry[]{}));
	newMethod.addBody(body);
	inputClass.addMethod(newMethod);
}
	
public void addEventMethods(final ExternalClassEntry inputClass,final List<String> nameToAdd,final List<List<ExternalBodyEntry>> bodiesToAdd) {
	final Iterator<List<ExternalBodyEntry>> bodyItr = bodiesToAdd.iterator();
	for(String name : nameToAdd) {
		addEventMethod(name,bodyItr.next(),inputClass);
	}
}


	public Events(){
		super(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);builder.append(".");new StringEntry("Event").get(builder);builder.append(";");
			}
		}, new StringEntry("Events"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Events").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Event EventClass = new Event();
	public class Event extends ExternalClassEntry {



	public Event(){
		super(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Event"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Event").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	//Internals
	protected final String packageName = "com.rem.qstnr";
	protected final IParser rootParser = Rules.base;
	protected final List listnames = Listnames.parser;
	protected final List rules = Rules.parser;
	protected final RegexParser lazyNameParser = GeneralTokens.NAME;

	public static void main(final String[] args) {
		if(args.length==1) {
	new MainFlow().parse(args[0]);
		}
		else {
	System.err.println("No filename provided!");
		}
	}
	public void assignListElementNames(final ParseContext context,final IToken root) {
		context.retainList(new HeroStats());
		context.retainList(new EventNames());
	}
	public String getDirectory(final String fileName,final String knownDirectory) {
		return "../Resource/";
	}
	public void setup(final ParseContext data) {
		final IToken root = data.getRoot();
		for(final IToken imports:root.getAllSafely("import_any")) {
			for(final IToken import_events:imports.getAllSafely("IMPORT_EVENT")) {
				for(final IToken element:import_events.getAllSafely("event_declaration")) {
					EventsClass.declaration(element);
				}
			}
		}
	}
	public void generate(final ParseContext data) {
		setup(data);
		final IToken root = data.getRoot();
		for(final IToken imports:root.getAllSafely("import_any")) {
			importAny(imports);
		}
		output("../Questineer/src" , data);
	}
	public void importAny(final IToken import_any) {
		for(final IToken import_events:import_any.getAllSafely("IMPORT_EVENT")) {
			for(final IToken element:import_events.getAllSafely("event_declaration")) {
			}
		}
		for(final IToken import_items:import_any.getAllSafely("IMPORT_ITEM")) {
			for(final IToken element:import_items.getAllSafely("import_any")) {
			}
			for(final IToken element:import_items.getAllSafely("item_declaration")) {
			}
		}
		for(final IToken import_aspects:import_any.getAllSafely("IMPORT_ASPECT")) {
			for(final IToken element:import_aspects.getAllSafely("aspect_declaration")) {
			}
		}
		for(final IToken import_affinities:import_any.getAllSafely("IMPORT_AFFINITY")) {
			for(final IToken element:import_affinities.getAllSafely("affinity_declaration")) {
			}
		}
		for(final IToken import_traits:import_any.getAllSafely("IMPORT_TRAIT")) {
			for(final IToken element:import_traits.getAllSafely("trait_declaration")) {
			}
		}
		for(final IToken import_attacks:import_any.getAllSafely("IMPORT_ATTACK")) {
			for(final IToken element:import_attacks.getAllSafely("attack_declaration")) {
			}
		}
		for(final IToken import_conditions:import_any.getAllSafely("IMPORT_CONDITION")) {
			for(final IToken element:import_conditions.getAllSafely("condition_declaration")) {
			}
		}
	}
	public String getTypeName(final IToken nameToken) {
		return "$TYPE_NAME";
	}
	public String getPackageName() {
		return packageName;
	}
	public IParser getRootParser() {
		return rootParser;
	}
	public List getListnames() {
		return listnames;
	}
	public List getRules() {
		return rules;
	}
	public RegexParser getLazyNameParser() {
		return lazyNameParser;
	}
	public Generator[] getGenerators() {
		final MainFlow self = this;
		return new Generator[]{
		new Generator(){
			public String getName(){
				return "Main";
			}
			public void setup(ParseContext data){
			}
			public void generate(ParseContext data){
				StringBuilder builder;
				File directory;
				builder = new StringBuilder();
	/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Events")+".java", EventsClass);
				builder = new StringBuilder();
	/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry(packageName).get(builder);
					}
				}.get(builder);
				builder.append(".");
				/*Name*/new Entry(){
					public void get(StringBuilder builder){
						new StringEntry("events").get(builder);
					}
				}.get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Event")+".java", EventClass);
				outputAll();
			}
			public void generateRoot(IToken rootToken){
			}
		}};
	}
	private String __ROOT_DIRECTORY__ = ".";
	public void output(String rootDirectory, ParseContext data){
		__ROOT_DIRECTORY__ = rootDirectory;
		getGenerators()[0].generate(data);;
	}

}