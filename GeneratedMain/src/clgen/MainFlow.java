package clgen;
import clgen.MainFlow;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import com.rem.parser.ParseContext;
import com.rem.parser.token.IToken;
import lists.HeroStats;
import java.lang.StringBuilder;
import com.rem.parser.parser.IParser;
import lists.Rules;
import java.util.List;
import lists.Listnames;
import com.rem.parser.parser.RegexParser;
import lists.GeneralTokens;
public class MainFlow extends FlowController  {
	//Externals


	protected Source SourceClass = new Source();
	public class Source extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
			}
		}, new StringEntry("Source"), "interface ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  interface ");
			new StringEntry("Source").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Range RangeClass = new Range();
	public class Range extends ExternalClassEntry {
		protected final String floatCast = "(float)(int)";



	protected Modifier ModifierClass = new Modifier();
	public class Modifier extends ExternalClassEntry {
		protected final String doubleCast = "(float)(double)";




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("Modifier"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Modifier").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("decrease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("amount")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("value")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(doubleCast+"value".toString())))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Range").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("Range"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Range").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("left")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("right")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("initialLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("initialRight")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("left")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(floatCast+"initialLeft".toString())))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("right")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(floatCast+"initialRight".toString())))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("initialLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("initialRight")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("left")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("initialLeft")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("right")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(floatCast+"initialRight".toString())))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("initialLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("initialRight")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("left")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(floatCast+"initialLeft".toString())))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("right")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("initialRight")))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Exac*/new ExternalStatement(new StringEntry("getModifier")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getRandom")),new ExternalStatement.Parameters())))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Exac*/new ExternalStatement(new StringEntry("getRandom")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("difference")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("right")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("left")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("+ ", /*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("difference")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("random"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("left")))))))}), Arrays.asList(new ExternalClassEntry[]{RangeClass.ModifierClass}));
	}
}
	protected Lists ListsClass = new Lists();
	public class Lists extends ExternalClassEntry {



	protected Maps MapsClass = new Maps();
	public class Maps extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Lists").get(builder);builder.append(";");
			}
		}, new StringEntry("Maps"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Maps").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Lists").get(builder);builder.append(";");
			}
		}, new StringEntry("Lists"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Lists").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{ListsClass.MapsClass}));
	}
}
	protected Criteria CriteriaClass = new Criteria();
	public class Criteria extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Criteria").get(builder);builder.append(";");
			}
		}, new StringEntry("Criteria"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Criteria").get(builder);
			new StringEntry("<TypeName>").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("satisfies")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry("TypeName".toString())))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Aspect AspectClass = new Aspect();
	public class Aspect extends ExternalClassEntry {



	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Id"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Id").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);builder.append(".");new StringEntry("Aspect").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Aspect"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Aspect").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("name")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("description")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspect")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{AspectClass.IdClass}));
	}
}
	protected Aspects AspectsClass = new Aspects();
	public class Aspects extends ExternalClassEntry {

	
public void setup(final ParseContext data) {
	EventsClass.addEventMethods(AspectClass,new HashMap<String,ExternalStatement.Body>());
}
	
public ExternalStatement getId(final String name) {
	return /*Optr*/new ExternalStatement("->", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspects"))))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(name)), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}
	
public void declaration(final IToken declarationToken) {
	final String aspectName = Generator.camelize(declarationToken.get("aspectName").toString());
	final String aspectDescription = declarationToken.get("description").toString();
AspectsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);builder.append(".");new StringEntry("Aspects").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);builder.append(".");new StringEntry("Aspect").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		},new StringEntry(aspectName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspect")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(aspectName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspect")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspect")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspect")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	for(final IToken element:declarationToken.getAllSafely("event")) {
			final String eventName = Generator.camelize(element.get("event_names").toString());
			final ExternalContext eventContext = EventsClass.addToEventMethod(element.get("event_names").toString(),AspectClass,/*Body*/new ExternalStatement.Body());
			final ExternalMethodEntry eventMethod = new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(eventName.toString())))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body());
			for(final IToken atom:element.getAllSafely("body_element")) {
				eventMethod.appendToBody(getBodyElement(atom,eventContext));
			}
			AspectsClass.getSubClass(aspectName).addMethod(eventMethod);
	}
	AspectsClass.getMethod("createAspect").prependToBody(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(aspectName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("aspectName")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspects")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(aspectName))))),new ExternalStatement.Parameters())))))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);builder.append(".");new StringEntry("Aspects").get(builder);builder.append(";");
			}
		}, new StringEntry("Aspects"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Aspects").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspect"))), /*Exac*/new ExternalStatement(new StringEntry("createAspect")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("aspectName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Items ItemsClass = new Items();
	public class Items extends ExternalClassEntry {

	
public void setup(final ParseContext data) {
	createList(AspectClass);
	EntityClass.addGainLoss(AspectClass,ItemClass);
	ItemClass.getSubClass("Modifier").getContext().setEnder(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getValue")),new ExternalStatement.Parameters())));
}
	
public void declaration(final IToken itemToken) {
	final String className = Generator.camelize(itemToken.get("itemName").toString());
ItemsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);builder.append(".");new StringEntry("Items").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);builder.append(".");new StringEntry("Item").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		},new StringEntry(className), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(className).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Items")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Items")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	ItemsClass.getSubClass(className).getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("name")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(itemToken.get("itemName").toString()))))))));
	ItemsClass.getMethod("createItem").prependToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("itemName"))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(className.toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Items")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters())))))));
	for(final IToken element:itemToken.getAllSafely("hp")) {
ItemsClass.getSubClass(className).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("hp")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
ItemsClass.getSubClass(className).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("maxHp")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("attack")) {
ItemsClass.getSubClass(className).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("dmg")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("defense")) {
ItemsClass.getSubClass(className).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("def")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("value")) {
ItemsClass.getSubClass(className).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("weight")) {
ItemsClass.getSubClass(className).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("weight")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("gain_aspect")) {
			this.gain(element,"change_item","change_item",/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getItem")),new ExternalStatement.Parameters())),AspectsClass,ItemsClass.getSubClass(className));
	}
	for(final IToken element:itemToken.getAllSafely("gain_trait")) {
			this.gain(element,"equip","unequip",/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getHost")),new ExternalStatement.Parameters())),TraitsClass,ItemsClass.getSubClass(className));
	}
	for(final IToken element:itemToken.getAllSafely("gain_attack")) {
			this.gain(element,"equip","unequip",/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getHost")),new ExternalStatement.Parameters())),AttacksClass,ItemsClass.getSubClass(className));
	}
	for(final IToken element:itemToken.getAllSafely("event")) {
			final ExternalStatement.Body bodyElementList = new ExternalStatement.Body();
			final ExternalContext context = EventsClass.addToEventMethod(element.toString(),ItemsClass.getSubClass(className),bodyElementList);
			for(final IToken atom:element.getAllSafely("body_element")) {
				bodyElementList.add(getBodyElement(atom,context));
			}
			EventsClass.addToEventMethod(element.toString(),ItemsClass.getSubClass(className),bodyElementList);
	}
}
	
public void gain(final IToken gainToken,final String gainEventName,final String loseEventName,final ExternalStatement subject,final ExternalClassEntry gainClass,final ExternalClassEntry itemClass) {
	final String specificClassName = Generator.camelize(gainToken.toString());
	final ExternalClassEntry specificClass = gainClass.getSubClass(specificClassName);
	final ExternalClassEntry idClass = gainClass.getSubClass("Id");
	final String asList = gainClass.getName().toLowerCase();
	final ExternalContext gainContext = EventsClass.addToEventMethod(gainEventName,itemClass,new ExternalStatement.Body());
	final ExternalContext loseContext = EventsClass.addToEventMethod(loseEventName,itemClass,new ExternalStatement.Body());
	if (gainToken.get("boolean_statement") ==  null) {
		EventsClass.addToEventMethod(gainEventName,itemClass,/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("gain"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(specificClass.getFullName()))),new ExternalStatement.Parameters())),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
		EventsClass.addToEventMethod(loseEventName,itemClass,/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	else  {
		for(final IToken atom:gainToken.getAllSafely("boolean_statement")) {
				final ExternalStatement gainHeader = getBooleanStatement(atom,gainContext);
				final ExternalStatement loseHeader = getBooleanStatement(atom,loseContext);
				EventsClass.addToEventMethod(gainEventName,itemClass,/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom,false,gainContext)))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("gain"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(specificClass.getFullName()))),new ExternalStatement.Parameters())),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))))));
				EventsClass.addToEventMethod(loseEventName,itemClass,/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&& ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom,true,gainContext)))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))))));
		}
	}
}


	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Id"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Id").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);builder.append(".");new StringEntry("Items").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Items"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Items").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Exac*/new ExternalStatement(new StringEntry("createItem")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("itemName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{ItemsClass.IdClass}));
	}
}
	protected Item ItemClass = new Item();
	public class Item extends ExternalClassEntry {



	protected Modifier ModifierClass = new Modifier();
	public class Modifier extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("Modifier"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Modifier").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("range")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("host")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("decrease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("amount")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))), /*Enty*/new ExternalStatement(new StringEntry("decrease"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))), /*Enty*/new ExternalStatement(new StringEntry("getEquipper"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);builder.append(".");new StringEntry("Item").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("Item"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Item").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("name")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("equipper")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("hp")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("maxHp")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("dmg")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("def")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("weight")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Equip"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("equipper")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Unequip"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("equipper")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeItem"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body())}), Arrays.asList(new ExternalClassEntry[]{ItemClass.ModifierClass}));
	}
}
	protected Attack AttackClass = new Attack();
	public class Attack extends ExternalClassEntry {



	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Id"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Id").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Damage DamageClass = new Damage();
	public class Damage extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);builder.append(".");new StringEntry("Attack").get(builder);builder.append(";");
			}
		}, new StringEntry("Damage"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Damage").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("modifier")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("hit")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("newValue")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newValue")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setModifier")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("newModifier")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("modifier")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newModifier")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setHit")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("newHit")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("hit")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newHit")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getTotal")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("value")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("modifier")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);builder.append(".");new StringEntry("Attack").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);builder.append(".");new StringEntry("Skill").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Attack"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Skill")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Attack").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Skill")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getRange")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("entity")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entity"))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Exac*/new ExternalStatement(new StringEntry("getCost")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("entity")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(float)cost"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entity"))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Exac*/new ExternalStatement(new StringEntry("getCooldown")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("isOffCooldown")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Tick"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement(">", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getDescription")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setFocus")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("newFocus")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("hasEntityFocus")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFocus")))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Exac*/new ExternalStatement(new StringEntry("compareTo")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack"))), /*Name*/new ExternalStatement(new StringEntry("otherAttack")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherAttack"))), /*Name*/new ExternalStatement(new StringEntry("cooldown")))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("hasEntityFocus")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherAttack"))), /*Name*/new ExternalStatement(new StringEntry("experience")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("experience"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("experience")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherAttack"))), /*Name*/new ExternalStatement(new StringEntry("experience"))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherAttack"))), /*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown"))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("attack")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("attacker"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("defender")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("cooldown")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getCost")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Damage"))))), /*Name*/new ExternalStatement(new StringEntry("damage")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getDamage")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("PreAttack"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage"))), /*Enty*/new ExternalStatement(new StringEntry("getHit"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Hit"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("experience")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3"))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Miss"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("experience")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("PostAttack"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Damage"))))), /*Exac*/new ExternalStatement(new StringEntry("getDamage")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("attacker"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("defender")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{AttackClass.IdClass,AttackClass.DamageClass}));
	}
}
	protected Attacks AttacksClass = new Attacks();
	public class Attacks extends ExternalClassEntry {

	
public ExternalStatement getId(final String name) {
	return /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attacks")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(name.toString()))))))), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}
	
public void declaration(final IToken declarationToken) {
	final String attackName = Generator.camelize(declarationToken.get("attackName").toString());
	final ExternalStatement description = new ExternalStatement("+");
	for(final IToken element:declarationToken.getAllSafely("description")) {
			description.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.toString())))));
	}
AttacksClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);builder.append(".");new StringEntry("Attacks").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);builder.append(".");new StringEntry("Attack").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);builder.append(".");new StringEntry("Skill").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		},new StringEntry(attackName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(attackName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(attackName.toString()))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getDescription")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(description)))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Damage"))))), /*Exac*/new ExternalStatement(new StringEntry("getDamage")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("attacker"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("defender")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Damage"))))), /*Name*/new ExternalStatement(new StringEntry("damage")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Damage"))))),new ExternalStatement.Parameters()))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	final ExternalContext damageContext = AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").getCurrentContext();
	Boolean isFirst = true;
	for(IToken.Key __element__KEY:declarationToken.keySet()) {
		if(__element__KEY.getName().equals("cooldown")){ final IToken element = declarationToken.get(__element__KEY);
AttacksClass.getSubClass(attackName.toString()).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("cost")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element))))))));
		}
		if(__element__KEY.getName().equals("range")){ final IToken element = declarationToken.get(__element__KEY);
AttacksClass.getSubClass(attackName.toString()).getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("range")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element))))))));
		}
		if(__element__KEY.getName().equals("damage")){ final IToken element = declarationToken.get(__element__KEY);
			for(IToken.Key __atom__KEY:element.keySet()) {
			if(__atom__KEY.getName().equals("by_stat")){ final IToken atom = element.get(__atom__KEY);
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage"))), /*Enty*/new ExternalStatement(new StringEntry("setValue"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(atom))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker")))))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("attacker"))), /*Enty*/new ExternalStatement(new StringEntry("getItemDamage"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))))));
			}
			if(__atom__KEY.getName().equals("body_element")){ final IToken atom = element.get(__atom__KEY);
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body());
			}
			}
		}
		if(__element__KEY.getName().equals("miss")){ final IToken element = declarationToken.get(__element__KEY);
			final ExternalStatement setMiss = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage"))), /*Enty*/new ExternalStatement(new StringEntry("setHit"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))));
			for(final IToken atom:element.getAllSafely("option")) {
				final ExternalStatement chance = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getChance(atom.get("has_chance")))));
				if (atom.get("boolean_statement") !=  null) {
				final ExternalStatement bool = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom.get("boolean_statement"),damageContext))));
				if (isFirst) {
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(bool))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chance))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(setMiss))))))))));
					isFirst = false;
				}
				else  {
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(bool))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chance))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(setMiss))))))))));
				}
				}
				else  {
				if (isFirst) {
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chance))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(setMiss))))))));
					isFirst = false;
				}
				else  {
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chance))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(setMiss))))))));
				}
				}
			}
		}
	}
AttacksClass.getSubClass(attackName.toString()).getMethod("getDamage").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);builder.append(".");new StringEntry("Attacks").get(builder);builder.append(";");
			}
		}, new StringEntry("Attacks"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Attacks").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attack"))), /*Exac*/new ExternalStatement(new StringEntry("createAttack")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("attackName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Skill SkillClass = new Skill();
	public class Skill extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);builder.append(".");new StringEntry("Skill").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
			}
		}, new StringEntry("Skill"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Skill").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("experience")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("cooldown")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("range")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("cost")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("hasEntityFocus")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Criteria")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ofEntity"))))), /*Name*/new ExternalStatement(new StringEntry("targetCriteria")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Exac*/new ExternalStatement(new StringEntry("getCost")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("entity")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(float)cost"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entity"))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getRange")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("entity")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entity"))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("isOffCooldown")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Tick"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("cooldown")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setFocus")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("newFocus")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("hasEntityFocus")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newFocus")))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("user")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("isOffCooldown")),new ExternalStatement.Parameters())),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Lists")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("EntityList"))))), /*Name*/new ExternalStatement(new StringEntry("potentialTargets")))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("potential"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("user"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("getEntitiesWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getRange")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("user")))))))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("targetCriteria"))), /*Enty*/new ExternalStatement(new StringEntry("satisfies"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("potential")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("use")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("user")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("potential")))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("user"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("victim")))}), /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getDescription")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Skills SkillsClass = new Skills();
	public class Skills extends ExternalClassEntry {

	
public void setup(final ParseContext data) {
	createCriteria(EntityClass);
	createList(EntityClass);
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);builder.append(".");new StringEntry("Skills").get(builder);builder.append(";");
			}
		}, new StringEntry("Skills"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Skills").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Affinity AffinityClass = new Affinity();
	public class Affinity extends ExternalClassEntry {



	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Id"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Id").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);builder.append(".");new StringEntry("Affinity").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Affinity"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Affinity").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("name")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Exac*/new ExternalStatement(new StringEntry("modify")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("defender"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("damage")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0")))))))}), Arrays.asList(new ExternalClassEntry[]{AffinityClass.IdClass}));
	}
}
	protected Affinities AffinitiesClass = new Affinities();
	public class Affinities extends ExternalClassEntry {

	
public void declaration(final IToken declarationToken) {
	final String affinityName = declarationToken.get("affinityName").toString();
	final String affinityClassName = Generator.camelize(affinityName.toString());
	final ExternalStatement weaknesses = new ExternalStatement("||");
	final ExternalStatement strengths = new ExternalStatement("||");
	for(final IToken element:declarationToken.getAllSafely("strength_name")) {
			strengths.add(hasAffinity(Generator.camelize(element.toString())));
	}
	for(final IToken element:declarationToken.getAllSafely("weakness_name")) {
			weaknesses.add(hasAffinity(Generator.camelize(element.toString())));
	}
AffinitiesClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);builder.append(".");new StringEntry("Affinities").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);builder.append(".");new StringEntry("Affinity").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		},new StringEntry(affinityClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinity")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(affinityClassName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinity")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(affinityName.toString()))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Exac*/new ExternalStatement(new StringEntry("modify")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("defender"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("damage")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(strengths))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("*= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(weaknesses))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("/= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damage")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	AffinitiesClass.getMethod("createAffinity").prependToBody(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(affinityClassName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("affinityName")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinities")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(affinityClassName.toString())))))),new ExternalStatement.Parameters())))))));
}
	
public ExternalStatement hasAffinity(final String affinityName) {
	return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defender"))), /*Enty*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinities")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(affinityName.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))))))));
}
	
public ExternalStatement getId(final String name) {
	return /*Optr*/new ExternalStatement("->", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinities"))))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(name)), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);builder.append(".");new StringEntry("Affinities").get(builder);builder.append(";");
			}
		}, new StringEntry("Affinities"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Affinities").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Affinity"))), /*Exac*/new ExternalStatement(new StringEntry("createAffinity")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("affinityName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Condition ConditionClass = new Condition();
	public class Condition extends ExternalClassEntry {



	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Id"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Id").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);builder.append(".");new StringEntry("Condition").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Condition"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Condition").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("name")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("description")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{ConditionClass.IdClass}));
	}
}
	protected Conditions ConditionsClass = new Conditions();
	public class Conditions extends ExternalClassEntry {

	
public void setup(final ParseContext data) {
	EventsClass.addEventMethods(ConditionClass,new HashMap<String,ExternalStatement.Body>());
}
	
public void declaration(final IToken declarationToken) {
	final String conditionName = Generator.camelize(declarationToken.get("conditionName").toString());
	final String conditionDescription = declarationToken.get("description").toString();
ConditionsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);builder.append(".");new StringEntry("Conditions").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);builder.append(".");new StringEntry("Condition").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		},new StringEntry(conditionName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(conditionName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(conditionName.toString()))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getDescription")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(conditionDescription.toString())))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	final ExternalStatement.Body requirementsBody = new ExternalStatement.Body();
	final ExternalStatement.Body gainBody = new ExternalStatement.Body();
	final ExternalStatement.Body lossBody = new ExternalStatement.Body();
	final ExternalStatement.Body tickBody = new ExternalStatement.Body();
	final ExternalStatement eventHost = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
	final ExternalStatement candidate = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))));
	for(final IToken element:declarationToken.getAllSafely("requirement")) {
			requirementsBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getRequirement(element,candidate,false)))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))));
	}
	for(final IToken element:declarationToken.getAllSafely("imposition")) {
			gainBody.add(EntityClass.getImposition(element,true,eventHost));
			lossBody.add(EntityClass.getImposition(element,false,eventHost));
	}
	final ExternalContext gainContext = EventsClass.addToEventMethod("gain",ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
	final ExternalContext loseContext = EventsClass.addToEventMethod("loss",ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
	final ExternalContext tickContext = EventsClass.addToEventMethod("tick",ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
	for(final IToken element:declarationToken.getAllSafely("acquisition")) {
			gainBody.add(getAcquisition(element,true,eventHost,gainContext));
			gainBody.add(getAcquisition(element,false,eventHost,loseContext));
	}
	for(final IToken element:declarationToken.getAllSafely("accumulation")) {
			for(final IToken atom:element.getAllSafely("imposition")) {
				tickBody.add(EntityClass.getImposition(atom,true,eventHost));
			}
			for(final IToken atom:element.getAllSafely("acquisition")) {
				tickBody.add(getAcquisition(atom,true,eventHost,tickContext));
			}
	}
	Boolean isFirst = true;
	for(final IToken element:declarationToken.getAllSafely("to_lose")) {
			for(final IToken atom:element.getAllSafely("chance_pair")) {
				final ExternalStatement chanceHeader = new ExternalStatement();
				for(final IToken quark:atom.getAllSafely("has_chance")) {
					chanceHeader.add(getChance(quark));
				}
				if (atom.get("boolean_statement") ==  null) {
				if (isFirst) {
					tickBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chanceHeader))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))))));
				}
				else  {
					tickBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chanceHeader))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))))));
				}
				isFirst = true;
				}
				else  {
				if (isFirst) {
					tickBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom.get("boolean_statement"),tickContext)))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chanceHeader))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))))))));
					isFirst = false;
				}
				else  {
					tickBody.add(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom.get("boolean_statement"),tickContext)))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(chanceHeader))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))))))));
				}
				}
			}
	}
	requirementsBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))));
	final HashMap<String,ExternalStatement.Body> eventBodies = new HashMap<String,ExternalStatement.Body>();
	for(final IToken element:declarationToken.getAllSafely("event")) {
			ExternalStatement.Body eventBody = new ExternalStatement.Body();
			String eventName = element.get("event_names").toString();
			if (eventName.equals("lose")) {
			eventName = "loss";
			}
			ExternalContext eventContext = EventsClass.addToEventMethod(eventName,ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
			if (eventName.equals("gain")) {
			eventBody = gainBody;
			}
			else if (eventName.equals("loss")) {
			eventBody = lossBody;
			}
			else if (eventName.equals("tick")) {
			eventBody = tickBody;
			}
			for(final IToken atom:element.getAllSafely("body_element")) {
				eventBody.add(getBodyElement(atom,eventContext));
			}
			eventBodies.put(eventName,eventBody);
	}
	eventBodies.put("gain",gainBody);
	eventBodies.put("loss",lossBody);
	eventBodies.put("tick",tickBody);
	EventsClass.addEventMethodsExclusive(ConditionsClass.getSubClass(conditionName),eventBodies);
ConditionsClass.getSubClass(conditionName).addMethod(new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("hasRequirements")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body()));
	ConditionsClass.getSubClass(conditionName).getMethod("hasRequirements").appendToBody(requirementsBody);
	ConditionsClass.getMethod("createCondition").prependToBody(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(conditionName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("conditionName")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(conditionName))))),new ExternalStatement.Parameters())))))));
}
	
public ExternalStatement getId(final String name) {
	return /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(name.toString()))))))), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);builder.append(".");new StringEntry("Conditions").get(builder);builder.append(";");
			}
		}, new StringEntry("Conditions"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Conditions").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition"))), /*Exac*/new ExternalStatement(new StringEntry("createCondition")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("conditionName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Trait TraitClass = new Trait();
	public class Trait extends ExternalClassEntry {



	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
			}
		}, new StringEntry("Id"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Id").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
			}
		}, new StringEntry("Trait"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Trait").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("name")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("description")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Trait")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("hasRequirements")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))}), Arrays.asList(new ExternalClassEntry[]{TraitClass.IdClass}));
	}
}
	protected Traits TraitsClass = new Traits();
	public class Traits extends ExternalClassEntry {

	
public ExternalStatement getId(final String name) {
	return /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Traits")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(name.toString()))))))), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}
	
public void declaration(final IToken declarationToken) {
	final String traitName = Generator.camelize(declarationToken.get("traitName").toString());
	final ExternalStatement.Body gainBody = new ExternalStatement.Body();
	final ExternalStatement.Body lossBody = new ExternalStatement.Body();
	final ExternalStatement.Body requirementsBody = new ExternalStatement.Body();
	final ExternalStatement eventHost = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getHost"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
	final ExternalStatement candidate = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))));
	for(final IToken element:declarationToken.getAllSafely("impose")) {
			gainBody.add(EntityClass.getImposition(element,true,eventHost));
			lossBody.add(EntityClass.getImposition(element,false,eventHost));
	}
TraitsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Traits").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Trait").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
			}
		},new StringEntry(traitName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Trait")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(traitName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Trait")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Trait")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Trait")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(traitName.toString()))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("hasRequirements")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	final Map<String,ExternalStatement.Body> eventBodies = new HashMap<String,ExternalStatement.Body>();
	eventBodies.put("gain",gainBody);
	eventBodies.put("loss",lossBody);
	EventsClass.addEventMethodsExclusive(TraitsClass.getSubClass(traitName.toString()),eventBodies);
	for(final IToken element:declarationToken.getAllSafely("requirement")) {
			TraitsClass.getSubClass(traitName.toString()).getMethod("hasRequirements").prependToBody(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getRequirement(element,candidate,false)))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))));
	}
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);builder.append(".");new StringEntry("Traits").get(builder);builder.append(";");
			}
		}, new StringEntry("Traits"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Traits").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Trait"))), /*Exac*/new ExternalStatement(new StringEntry("createTrait")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("traitName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Int IntClass = new Int();
	public class Int extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Int").get(builder);builder.append(";");
			}
		}, new StringEntry("Int"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Int").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("newValue")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newValue"))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Entity EntityClass = new Entity();
	public class Entity extends ExternalClassEntry {

	
public void setup(final ParseContext data) {
	final List<String> namesToAdd = new ArrayList<String>();
	namesToAdd.add("hit");
	final Map<String,ExternalStatement.Body> bodiesToAdd = new HashMap<String,ExternalStatement.Body>();
	bodiesToAdd.put("hit",onHitBody());
	EventsClass.addEventMethods(EntityClass,bodiesToAdd);
	EntityClass.addGainLoss(ConditionClass,EntityClass);
	EntityClass.addGainLoss(AttackClass,EntityClass);
	EntityClass.addGainLoss(TraitClass,EntityClass);
	EntityClass.addGainLoss(AffinityClass,EntityClass);
	createList(ItemClass);
	createListMap(SourceClass,IntClass);
	final Set<String> statNames = data.getListElements("hero_stats");
	final ExternalStatement.Parameters allStatList = new ExternalStatement.Parameters();
	final ExternalStatement.Body randomStatBody = /*Body*/new ExternalStatement.Body();
	for (final String statName :  statNames) {
		final String vName = statName.toLowerCase();
EntityClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		},new StringEntry(statName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(statName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Stat")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Lists")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Maps")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Sources")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("_Int"))))), /*Name*/new ExternalStatement(new StringEntry("history")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Lists")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Maps")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Sources")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("_Int"))))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("newValue")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newValue")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("impose")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("amount"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("history"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Int"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount")))))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("value")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("value")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("release")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("history"))), /*Enty*/new ExternalStatement(new StringEntry("removeLast"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source"))))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(statName.toString())))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
EntityClass.getSubClass(statName.toString()).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		},new StringEntry("Modifier"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Modifier").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("percent")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("initialPercent")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("percent")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(float)(double)initialPercent")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity"))), /*Enty*/new ExternalStatement(new StringEntry(vName.toString()))), /*Name*/new ExternalStatement(new StringEntry("value")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("percent"))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("decrease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("amount")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("percent")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity"))), /*Enty*/new ExternalStatement(new StringEntry(vName.toString()))), /*Name*/new ExternalStatement(new StringEntry("value")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		EntityClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(statName.toString())))))), /*Enty*/new ExternalStatement(new StringEntry(vName.toString()))));
		randomStatBody.add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(allStatList.getSize().toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(vName.toString()))))))).setBraces("",":")));
		allStatList.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(vName.toString())))));
		EntityClass.getSubClass(statName.toString()).getContext().setEnder(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getValue")),new ExternalStatement.Parameters())));
	}
EntityClass.addMethod(new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Stat"))))), /*Exac*/new ExternalStatement(new StringEntry("getRandomStat")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("randomIndex")), /*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("random"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(allStatList.getSize().toString())))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(double)randomIndex")))),
			/*InCl*/new ExternalStatement(randomStatBody)),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
}
	
public ExternalStatement.Body onHitBody() {
	return /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("eventDamage")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getDamage"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("getTotal"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("eventDamage")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.1f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("eventDamage")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-0.1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("preciseDamage")), /*Optr*/new ExternalStatement("- ", /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("eventDamage")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Enty*/new ExternalStatement(new StringEntry("con"))), /*Enty*/new ExternalStatement(new StringEntry("getValue"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Enty*/new ExternalStatement(new StringEntry("getItemDefense"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("damageToTake")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(float)preciseDamage")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("eventModifier")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getDamage"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("getModifier"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("item"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("getEquippedItems"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getHp"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("decrease"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getDmg"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("eventModifier")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("eventDamage"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeItem"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item")))))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("damageToTake")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("13 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3"))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getRandomStat")),new ExternalStatement.Parameters()), /*Enty*/new ExternalStatement(new StringEntry("impose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-3")))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("on")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Die"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("5")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2"))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getRandomStat")),new ExternalStatement.Parameters()), /*Enty*/new ExternalStatement(new StringEntry("impose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-2")))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("on")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Die"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("damageToTake")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getRandomStat")),new ExternalStatement.Parameters()), /*Enty*/new ExternalStatement(new StringEntry("impose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1")))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("on")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Die"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("getAttacker"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))))))));
}
	
public ExternalStatement getRange(final IToken rangeToken) {
	if (rangeToken.get("rangeToken") !=  null) {
		final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
		parameters.add(getSingleRange(rangeToken));
		for(final IToken element:rangeToken.getAllSafely("extra")) {
				parameters.add(getSingleRange(element));
		}
		return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MultiModifier"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(parameters))))));
	}
	return getSingleRange(rangeToken);
}
	
public ExternalStatement getSingleRange(final IToken singleRangeToken) {
	if (singleRangeToken.get("hero_stats") !=  null) {
		if (singleRangeToken.get("percent") !=  null) {
			return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("hero_stats").toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(percentify(singleRangeToken.get("left")).toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(percentify(singleRangeToken.get("right")).toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))), /*Enty*/new ExternalStatement(new StringEntry("getRandom"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
		}
		else  {
			return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("hero_stats").toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("left").toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("right").toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))), /*Enty*/new ExternalStatement(new StringEntry("getRandom"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
		}
	}
	else  {
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(primeRange(singleRangeToken))), /*Enty*/new ExternalStatement(new StringEntry("getModifier"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
	}
}
	
public ExternalStatement getImposition(final IToken impositionToken,final Boolean forGainBody,final ExternalStatement subject) {
	Boolean useImpose = false;
	final IToken operator = impositionToken.get("operator");
	if (forGainBody &&  operator.get("IMPOSE") ==  null) {
		useImpose = true;
	}
	else if (operator.get("IMPOSE") !=  null &&!  forGainBody) {
		useImpose = true;
	}
	final String impositionStat = impositionToken.get("hero_stats").toString().toLowerCase();
	final String statGetMethod = "get"+Generator.camelize(impositionStat.toString());
	if (useImpose) {
		Integer count = 0;
		for(final IToken element:impositionToken.getAllSafely("PLUS")) {
				count = count+1;
		}
		for(final IToken element:impositionToken.getAllSafely("MINUS")) {
				count = count -  1;
		}
		for(final IToken element:impositionToken.getAllSafely("amount")) {
				count = count +  Integer.parseInt(element.toString());
		}
		final Integer realCount = count;
		return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Enty*/new ExternalStatement(new StringEntry(statGetMethod.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("impose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realCount.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))));
	}
	else  {
		return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Enty*/new ExternalStatement(new StringEntry(statGetMethod.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("release"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))));
	}
}
	
public void addGainLoss(final ExternalClassEntry inputClass,final ExternalClassEntry outputClass) {
	final String asVariable = inputClass.getName().toLowerCase();
	final String asList = asVariable+"s";
outputClass.addMethod(new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("has")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputClass.getFullName())), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("findId")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputClass.getFullName()))), /*Enty*/new ExternalStatement(new StringEntry(asVariable.toString()))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asList.toString()))), /*Enty*/new ExternalStatement(new StringEntry("getAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("getId"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("findId")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))));
outputClass.addMethod(new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("gain")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputClass.getFullName()))), /*Enty*/new ExternalStatement(new StringEntry(asVariable.toString()))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asList.toString()))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asVariable.toString()))))))))))));
	final String errorMessage = inputClass.getName() +  ":\"+removeId+\"  not found!";
outputClass.addMethod(new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("lose")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputClass.getFullName())), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("removeId"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("toRemove")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputClass.getFullName()))), /*Enty*/new ExternalStatement(new StringEntry(asVariable.toString()))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asList.toString()))), /*Enty*/new ExternalStatement(new StringEntry("getFrom"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source"))))))))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asVariable.toString()))), /*Enty*/new ExternalStatement(new StringEntry("getId"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("removeId")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("toRemove")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asVariable.toString())))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toRemove")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Thrw*/new ExternalStatement(new TabEntry(new StringEntry("throw new RuntimeException(\"")), new StringEntry("\");"),"", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(errorMessage.toString()))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(asList.toString()))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toRemove"))))))))))))));
	createListMap(SourceClass,inputClass);
	final String sources = "Sources";
	final String inputName = "_" +  inputClass.getName();
outputClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Lists")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Maps")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(sources)))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(inputName))))), /*Enty*/new ExternalStatement(new StringEntry(asList.toString()))));
}


	protected Modifier ModifierClass = new Modifier();
	public class Modifier extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("Modifier"), "interface ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static interface ");
			new StringEntry("Modifier").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity")))}), /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("decrease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("newValue")))}), /*Body*/new ExternalStatement.Body())}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected MultiModifier MultiModifierClass = new MultiModifier();
	public class MultiModifier extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("MultiModifier"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier")))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("MultiModifier").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier")))).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("MultiModifier"))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), new ExternalStatement(new StringEntry("..."), /*Name*/new ExternalStatement(new StringEntry("mods"))))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("super")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Arrays")))), /*Enty*/new ExternalStatement(new StringEntry("asList"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("mods")))))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("sum")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("mod"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sum")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("mod"))), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity"))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sum"))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("decrease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("amount")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("mod"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("mod"))), /*Enty*/new ExternalStatement(new StringEntry("decrease"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity")))),/*Optr*/new ExternalStatement("/ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount")))), /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("size")),new ExternalStatement.Parameters())))))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Stat StatClass = new Stat();
	public class Stat extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
			}
		}, new StringEntry("Stat"), "interface ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static interface ");
			new StringEntry("Stat").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Exac*/new ExternalStatement(new StringEntry("getValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("newValue")))}), /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("impose")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("amount"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("release")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body()),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))), /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body())}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);builder.append(".");new StringEntry("Entity").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Source").get(builder);builder.append(";");
			}
		}, new StringEntry("Entity"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Entity").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("weightHeld")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("walkingSpeed")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.2f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Lists")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ItemList"))))), /*Name*/new ExternalStatement(new StringEntry("equippedItems")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Lists")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ItemList"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Location"))))), /*Name*/new ExternalStatement(new StringEntry("location")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Location"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1001")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1001")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1001f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1001f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Set"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))))))), /*Name*/new ExternalStatement(new StringEntry("pathStoppers")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Set"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getItemDamage")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("sum")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("item"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("equippedItems"))))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sum")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getDmg"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sum"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getItemDefense")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("sum")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("item"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("equippedItems"))))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sum")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getDef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("sum"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("canEquip")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("item")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("+ ", /*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("str"))), /*Enty*/new ExternalStatement(new StringEntry("getValue"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("weightHeld")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getWeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("equip")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("item")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("equippedItems"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("weightHeld")), /*Optr*/new ExternalStatement("+ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("weightHeld")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getWeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Equip"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item")))))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("equip")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("item")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("equippedItems"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("weightHeld")), /*Optr*/new ExternalStatement("+ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("weightHeld")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("getWeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("use"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item"))), /*Enty*/new ExternalStatement(new StringEntry("on"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Unequip"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("item")))))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("rememberIncomingPath")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("in"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("to")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("pathStoppers"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("in")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("pathStoppers"))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("in")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashSet"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))))),new ExternalStatement.Parameters()))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("pathStoppers"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("in"))))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("to")))))))))))}), Arrays.asList(new ExternalClassEntry[]{EntityClass.ModifierClass,EntityClass.MultiModifierClass,EntityClass.StatClass}));
	}
}
	protected Environment EnvironmentClass = new Environment();
	public class Environment extends ExternalClassEntry {



	protected Position PositionClass = new Position();
	public class Position extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);builder.append(".");new StringEntry("Environment").get(builder);builder.append(";");
			}
		}, new StringEntry("Position"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Position").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("zoneX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1001"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("zoneY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1001"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1001f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1001f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment"))), /*Name*/new ExternalStatement(new StringEntry("parent")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getX")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("* ", /*Optr*/new ExternalStatement("+ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f"))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getY")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("* ", /*Optr*/new ExternalStatement("+ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f"))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Exac*/new ExternalStatement(new StringEntry("getDistanceTo")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position"))), /*Name*/new ExternalStatement(new StringEntry("otherPosition")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("xDirection")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getX")),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("yDirection")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getY")),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("sqrt"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("pow"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0")))))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("pow"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Exac*/new ExternalStatement(new StringEntry("getDirectionTo")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position"))), /*Name*/new ExternalStatement(new StringEntry("otherPosition")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("xDirection")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getX")),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("yDirection")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getY")),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("/ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3.0 ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("atan2"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection"))))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("isWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position"))))), /*Name*/new ExternalStatement(new StringEntry("otherPosition"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("range"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleRight")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("xDirection")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getX")),new ExternalStatement.Parameters())), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition"))), /*Enty*/new ExternalStatement(new StringEntry("getX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("yDirection")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getY")),new ExternalStatement.Parameters())), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition"))), /*Enty*/new ExternalStatement(new StringEntry("getY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("radius")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("sqrt"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("pow"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0")))))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("pow"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0")))))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement("* ", /*Optr*/new ExternalStatement("<= ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement("* ", /*Optr*/new ExternalStatement(">= ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("<= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("radius")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3.0 ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0 ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3.0 ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement("<= ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("/ ", /*Optr*/new ExternalStatement(">= ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("<= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("radius")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0 ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angle")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("atan2"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection")))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("<= ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement(">= ", /*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("<= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("radius")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angle")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angle")))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Location LocationClass = new Location();
	public class Location extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);builder.append(".");new StringEntry("Environment").get(builder);builder.append(";");
			}
		}, new StringEntry("Location"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position")))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Location").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position")))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("host")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("facing")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("zonified")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("isWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Location"))))), /*Name*/new ExternalStatement(new StringEntry("otherLocation"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("range"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleRight")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("tFacing")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherLocation"))), /*Enty*/new ExternalStatement(new StringEntry("getFacing"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherLocation")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range")))),/*Optr*/new ExternalStatement("+ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tFacing")))),/*Optr*/new ExternalStatement("+ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tFacing"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))), /*Exac*/new ExternalStatement(new StringEntry("getEntitiesWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("within")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getEntitiesWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))), /*Exac*/new ExternalStatement(new StringEntry("getEntitiesWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("within"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleRight")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getEntitiesWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setParent")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment"))), /*Name*/new ExternalStatement(new StringEntry("newParent")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("parent")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newParent")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("move")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("xDirection"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("yDirection")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("update")),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("move")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("xDirection"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("yDirection")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(float)(double)xDirection"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(float)(double)yDirection"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("update")),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("moveTo")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("xDirection"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("yDirection")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zonified")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getZone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("zoneX")), /*Optr*/new ExternalStatement("/ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(float)xDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("zoneY")), /*Optr*/new ExternalStatement("/ ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(float)xDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Optr*/new ExternalStatement("* ", /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("xDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Optr*/new ExternalStatement("* ", /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("yDirection")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getZone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("zonified")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("update")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zonified")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getZone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("> ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zonified")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getZone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("locationY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000 ")))),
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zonified")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getZone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("locationY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f")))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parent"))), /*Enty*/new ExternalStatement(new StringEntry("getZone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("zonified")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Tile TileClass = new Tile();
	public class Tile extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);builder.append(".");new StringEntry("Environment").get(builder);builder.append(";");
			}
		}, new StringEntry("Tile"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position")))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Tile").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position")))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("width")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("height")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("isWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position"))), /*Name*/new ExternalStatement(new StringEntry("otherPosition")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherPosition")))),/*Optr*/new ExternalStatement("/", /*Optr*/new ExternalStatement("+ ", /*Optr*/new ExternalStatement("/", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("4f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("height")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("4f")))),/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0")))))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);builder.append(".");new StringEntry("Environment").get(builder);builder.append(";");
			}
		}, new StringEntry("Environment"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Environment").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))))))), /*Name*/new ExternalStatement(new StringEntry("entityZones")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))), /*Exac*/new ExternalStatement(new StringEntry("getZone")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("zoneX"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("zoneY")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entityZones"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entityZones"))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))))),new ExternalStatement.Parameters()))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entityZones"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX"))))))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entityZones"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX"))))))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))),new ExternalStatement.Parameters()))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entityZones"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneX"))))))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("zoneY"))))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("addEntity")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("entity")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entity"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("setParent"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("entity"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("update"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))), /*Exac*/new ExternalStatement(new StringEntry("getEntitiesWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position"))))), /*Name*/new ExternalStatement(new StringEntry("position"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("within")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getEntitiesWithin")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2.0")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("PI")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0")))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))), /*Exac*/new ExternalStatement(new StringEntry("getEntitiesWithin")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Position"))))), /*Name*/new ExternalStatement(new StringEntry("position"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("within"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleLeft"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("angleRight")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))), /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))),/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))),/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getZone")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))),/*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position"))), /*Enty*/new ExternalStatement(new StringEntry("getZoneY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("position")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("within")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleLeft")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("angleRight")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("candidate"))))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))))))}), Arrays.asList(new ExternalClassEntry[]{EnvironmentClass.PositionClass,EnvironmentClass.LocationClass,EnvironmentClass.TileClass}));
	}
}
	protected Path PathClass = new Path();
	public class Path extends ExternalClassEntry {



	protected Way WayClass = new Way();
	public class Way extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);builder.append(".");new StringEntry("Path").get(builder);builder.append(";");
			}
		}, new StringEntry("Way"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path")))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Way").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path")))).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Comparable"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashSet"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))))), /*Name*/new ExternalStatement(new StringEntry("checkSet")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashSet"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("goal")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("distanceToGoal")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("parentWay")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("goal")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parentWay"))), /*Enty*/new ExternalStatement(new StringEntry("getGoal"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(":", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("path"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parentWay"))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("add")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("path")))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("distanceToGoal")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("goal"))), /*Enty*/new ExternalStatement(new StringEntry("getDistanceTo"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("get")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("size")),new ExternalStatement.Parameters())), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setGoal")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("newGoal")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("goal")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newGoal")))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("at")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("destination")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("isEmpty")),new ExternalStatement.Parameters())),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("get")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("size")),new ExternalStatement.Parameters())), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))), /*Enty*/new ExternalStatement(new StringEntry("isStopper"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("get")),new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("size")),new ExternalStatement.Parameters())), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("destination"))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("boolean"))), /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("newPath")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("checkSet"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newPath")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("distanceToGoal")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("goal"))), /*Enty*/new ExternalStatement(new StringEntry("getDistanceTo"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newPath")))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newPath"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("int"))), /*Exac*/new ExternalStatement(new StringEntry("compareTo")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("otherWay")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("distance")), /*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherWay"))), /*Enty*/new ExternalStatement(new StringEntry("getDistanceToGoal"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("distanceToGoal")))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(double)distance")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&& ", /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherWay"))), /*Enty*/new ExternalStatement(new StringEntry("size"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("size")),new ExternalStatement.Parameters())), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("checkSet"))), /*Enty*/new ExternalStatement(new StringEntry("containsAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("otherWay"))), /*Enty*/new ExternalStatement(new StringEntry("getCheckSet"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int)(double)distance")))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);builder.append(".");new StringEntry("Path").get(builder);builder.append(";");
			}
		}, new StringEntry("Path"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Tile")))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Path").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Environment")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Tile")))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("leftPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("rightPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("upPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("downPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Name*/new ExternalStatement(new StringEntry("isStop")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Exac*/new ExternalStatement(new StringEntry("step")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("stepper"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("next")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("speed")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getWalkingSpeed"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("leftPath")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("move"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("speed")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("rightPath")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("move"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("speed")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("upPath")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("move"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("speed"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("downPath")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("move"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("speed"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))), /*Name*/new ExternalStatement(new StringEntry("direction")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getDirectionTo")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("move"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("cos"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("direction")))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("speed")))),/*Optr*/new ExternalStatement("* ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("sin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("direction")))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("speed"))))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next"))), /*Enty*/new ExternalStatement(new StringEntry("isWithin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("getLocation"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
			/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next"))), /*Enty*/new ExternalStatement(new StringEntry("isStopper"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("stepper"))), /*Enty*/new ExternalStatement(new StringEntry("rememberIncomingPath"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next"))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("next"))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setLeft")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("newLeft")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("leftPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newLeft")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("leftPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newLeft")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newLeft"))), /*Enty*/new ExternalStatement(new StringEntry("setRight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("updateStatus")),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setRight")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("newRight")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("rightPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newRight")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("rightPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newRight")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newRight"))), /*Enty*/new ExternalStatement(new StringEntry("setLeft"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("updateStatus")),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setUp")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("newUp")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("upPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newUp")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("upPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newUp")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newUp"))), /*Enty*/new ExternalStatement(new StringEntry("setDown"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("updateStatus")),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("setDown")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("newDown")))}), /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("downPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newDown")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("downPath")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newDown")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newDown"))), /*Enty*/new ExternalStatement(new StringEntry("setUp"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("updateStatus")),new ExternalStatement.Parameters()))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Name*/new ExternalStatement(new StringEntry("updateStatus")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("count")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("leftPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("rightPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("upPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("downPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("isStop")), /*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("isStopper")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("isStop"))))))),new ExternalMethodEntry(0, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))))), /*Exac*/new ExternalStatement(new StringEntry("getWaysTo")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("goalPath")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("TreeSet"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))))), /*Name*/new ExternalStatement(new StringEntry("ways")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("TreeSet"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("firstWay")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstWay"))), /*Enty*/new ExternalStatement(new StringEntry("setGoal"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("goalPath"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstWay"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("firstWay"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))), /*Name*/new ExternalStatement(new StringEntry("count")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))))), /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("&&! ", /*Optr*/new ExternalStatement("< ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("50 ")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("isEmpty"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("count")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("way")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("pollFirst"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))), /*Enty*/new ExternalStatement(new StringEntry("at"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("goalPath")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Path"))), /*Name*/new ExternalStatement(new StringEntry("currentPath")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("- ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))), /*Enty*/new ExternalStatement(new StringEntry("size"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1")))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("leftPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("newWay")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("leftPath")))))))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))))))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("rightPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("newWay")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("rightPath")))))))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))))))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("upPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("newWay")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("upPath")))))))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))))))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!= ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("downPath")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))), /*Name*/new ExternalStatement(new StringEntry("newWay")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Way"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("way"))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("currentPath"))), /*Name*/new ExternalStatement(new StringEntry("downPath")))))))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ways"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newWay"))))))))))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))))))}), Arrays.asList(new ExternalClassEntry[]{PathClass.WayClass}));
	}
}
	protected Events EventsClass = new Events();
	public class Events extends ExternalClassEntry {
		protected final Map<String,List<Entry>> variableDefs = new HashMap<String,List<Entry>>();
		protected final Set<String> eventNameSet = new HashSet<String>();

	
public void declaration(final IToken declaration) {
	final String eventName = declaration.get("eventName").toString();
	eventNameSet.add(eventName);
	final String cev = Generator.camelize(eventName.toString());
EventsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);builder.append(".");new StringEntry("Events").get(builder);builder.append(";");
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);builder.append(".");new StringEntry("Event").get(builder);builder.append(";");
			}
		},new StringEntry(cev), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Event")), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(cev).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Event")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	for(final IToken element:declaration.getAllSafely("parameter")) {
			for(final IToken atom:element.getAllSafely("type_name")) {
EventsClass.getSubClass(cev).addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(getTypeName(atom).toString())))), /*Enty*/new ExternalStatement(new StringEntry(element.get("name").toString()))));
			}
	}
}
	
public void addParameter(final String eventName,final ExternalMethodEntry method) {
	method.addParameter(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(eventName))), /*Name*/new ExternalStatement(new StringEntry("event"))));
}
	
public ExternalContext addToEventMethod(final String eName,final ExternalClassEntry inputClass,final ExternalStatement.Body body) {
	final ExternalMethodEntry newMethod = new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(Generator.camelize(eName)))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body());
	final String newMethodName = newMethod.getName();
	if (inputClass.getMethod(newMethodName) ==  null) {
inputClass.addMethod(new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(Generator.camelize(eName)))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body()));
	}
	final ExternalMethodEntry establishedMethod = inputClass.getMethod(newMethodName);
	establishedMethod.appendToBody(body);
	return establishedMethod.getCurrentContext();
}
	
public void addEventMethods(final ExternalClassEntry inputClass,final Map<String,ExternalStatement.Body> bodiesToAdd) {
	for (final String name :  eventNameSet) {
		if (bodiesToAdd.containsKey(name)) {
			addToEventMethod(name,inputClass,bodiesToAdd.get(name));
		}
		else  {
			addToEventMethod(name,inputClass,/*Body*/new ExternalStatement.Body());
		}
	}
}
	
public void addEventMethodsExclusive(final ExternalClassEntry inputClass,final Map<String,ExternalStatement.Body> bodiesToAdd) {
	for (final String name :  eventNameSet) {
		if (bodiesToAdd.containsKey(name)) {
			addToEventMethod(name,inputClass,bodiesToAdd.get(name));
		}
	}
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);builder.append(".");new StringEntry("Events").get(builder);builder.append(";");
			}
		}, new StringEntry("Events"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Events").get(builder);
			new StringEntry("").get(builder);
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




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);builder.append(".");new StringEntry("Event").get(builder);builder.append(";");
			}
		}, new StringEntry("Event"), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Event").get(builder);
			new StringEntry("").get(builder);
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
	protected final Set<String> declaredCritSet = new HashSet<String>();
	protected final Set<String> declaredListSet = new HashSet<String>();
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
	public ExternalStatement getBodyElement(final IToken elementToken,final ExternalContext context) {
		for(IToken.Key __element__KEY:elementToken.keySet()) {
			if(__element__KEY.getName().equals("statement")){ final IToken element = elementToken.get(__element__KEY);
				return getStatement(element,context);
			}
			if(__element__KEY.getName().equals("return_statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("acquisition")){ final IToken element = elementToken.get(__element__KEY);
				final ExternalStatement subject = getVariableCall(element.get("variable_call"),context);
				return getAcquisition(element.get("acquisition"),true,subject,context);
			}
			if(__element__KEY.getName().equals("imposition")){ final IToken element = elementToken.get(__element__KEY);
				final ExternalStatement subject = getVariableCall(element.get("variable_call"),context);
				final Boolean doom = element.get("imposition").get("IMPOSE") !=  null ||  element.get("imposition").get("PLUS") !=  null;
				return EntityClass.getImposition(element.get("imposition"),doom,subject);
			}
			if(__element__KEY.getName().equals("variable_declaration")){ final IToken element = elementToken.get(__element__KEY);
				return getVariableDeclaration(element,context);
			}
			if(__element__KEY.getName().equals("if_statement")){ final IToken element = elementToken.get(__element__KEY);
				return getIfStatement(element,context);
			}
		}
		return null;
	}
	public ExternalStatement getVariableDeclaration(final IToken variableDeclarationToken,final ExternalContext context) {
		final String typeName = getTypeName(variableDeclarationToken.get("type_name"));
		final ExternalContext type = context.getClassContext(typeName);
		if (type ==  null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableDeclarationToken) +  "Could not find type:"+"!");
		}
		if (variableDeclarationToken.get("statement") !=  null) {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variableName").toString())))), /*Enty*/new ExternalStatement(new StringEntry(typeName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getStatement(variableDeclarationToken.get("statement"),context)))))));
		}
		else  {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variableName").toString())))), /*Enty*/new ExternalStatement(new StringEntry(typeName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))));
		}
	}
	public ExternalStatement getIfStatement(final IToken ifStatementToken,final ExternalContext context) {
		final ExternalStatement header = new ExternalStatement();
		final ExternalStatement elseHeader = new ExternalStatement();
		final ExternalStatement.Body body = new ExternalStatement.Body();
		final ExternalStatement.Body elseBody = new ExternalStatement.Body();
		Integer mode = 0;
		for(IToken.Key __element__KEY:ifStatementToken.keySet()) {
			if(__element__KEY.getName().equals("boolean_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				header.add(getBooleanStatement(element,context));
			}
			if(__element__KEY.getName().equals("body_element")){ final IToken element = ifStatementToken.get(__element__KEY);
				body.add(getBodyElement(element,context));
			}
			if(__element__KEY.getName().equals("else_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				mode = 1;
				for(IToken.Key __atom__KEY:element.keySet()) {
				if(__atom__KEY.getName().equals("body_element")){ final IToken atom = element.get(__atom__KEY);
					elseBody.add(getBodyElement(atom,context));
				}
				if(__atom__KEY.getName().equals("boolean_statement")){ final IToken atom = element.get(__atom__KEY);
					elseHeader.add(getBooleanStatement(atom,context));
					mode = 2;
				}
				}
			}
		}
		if (mode ==  0 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)));
		}
		else if (mode ==  1 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else if (mode ==  2 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(elseHeader))),
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else  {
			return null;
		}
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final ExternalContext context) {
		return getBooleanStatement(booleanStatement,false,context);
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final Boolean negate,final ExternalContext context) {
		final ExternalStatement operator = new ExternalStatement();
		for(IToken.Key __element__KEY:booleanStatement.keySet()) {
			if(__element__KEY.getName().equals("has_chance")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(getChance(element));
			}
			if(__element__KEY.getName().equals("has_statement")){ final IToken element = booleanStatement.get(__element__KEY);
				final ExternalStatement variableCall = getVariableCall(element.get("variable_call"),context);
				final ExternalStatement hasCall = getRequirement(element.get("requirement"),variableCall,negate);
				if (element.get("NOT") !=  null) {
				hasCall.negate();
				}
				operator.add(hasCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(getStatement(element,negate,context));
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = booleanStatement.get(__element__KEY);
				if (element.toString() ==  "&") {
				if (negate) {
					operator.set("||");
				}
				else  {
					operator.set("&&");
				}
				}
				else if (element.toString() ==  "|") {
				if (negate) {
					operator.set("&&");
				}
				else  {
					operator.set("||");
				}
				}
			}
		}
		return operator;
	}
	public ExternalStatement getRequirement(final IToken requirementToken,final ExternalStatement candidate,final Boolean showAsTrue) {
		final ExternalStatement requireHeader = new ExternalStatement();
		String delimiter = "&&";
		if (showAsTrue) {
			delimiter = "||";
		}
		requireHeader.set(delimiter);
		for(final IToken quanta:requirementToken.getAllSafely("require_stat")) {
				final String statName = quanta.get("hero_stats").toString().toLowerCase();
				final String methodName = "get"+Generator.camelize(statName.toString());
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(candidate)), /*Enty*/new ExternalStatement(new StringEntry(methodName.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Name*/new ExternalStatement(new StringEntry("getValue"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
				String operator = quanta.get("ORDINAL").toString();
				if (quanta.get("NOT") !=  null &&  showAsTrue ||  quanta.get("NOT") ==  null &&!  showAsTrue) {
				operator = negateOperator(operator);
				}
				innerHead.set(operator);
				innerHead.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(quanta.get("INTEGER").toString())))));
				requireHeader.add(innerHead);
		}
		for(final IToken quanta:requirementToken.getAllSafely("require_trait")) {
				final ExternalStatement id = TraitsClass.getId(Generator.camelize(quanta.get("trait_names").toString()));
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(candidate)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id)))))));
				if (quanta.get("NOT") !=  null) {
				innerHead.negate();
				}
				if (showAsTrue ==  false) {
				innerHead.negate();
				}
				requireHeader.add(innerHead);
		}
		for(final IToken quanta:requirementToken.getAllSafely("require_attack")) {
				final ExternalStatement id = AttacksClass.getId(Generator.camelize(quanta.get("attack_names").toString()));
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(candidate)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id)))))));
				if (quanta.get("NOT") !=  null) {
				innerHead.negate();
				}
				if (showAsTrue ==  false) {
				innerHead.negate();
				}
				requireHeader.add(innerHead);
		}
		return requireHeader;
	}
	public ExternalStatement getStatement(final IToken statementToken,final ExternalContext context) {
		return getStatement(statementToken,false,context);
	}
	public ExternalStatement getStatement(final IToken statementToken,final Boolean initialNegate,final ExternalContext context) {
		final ExternalStatement ret = new ExternalStatement();
		Boolean negate = initialNegate;
		for(IToken.Key __element__KEY:statementToken.keySet()) {
			if(__element__KEY.getName().equals("NOT")){ final IToken element = statementToken.get(__element__KEY);
				negate =!  negate;
			}
			if(__element__KEY.getName().equals("variable_call")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement variableCall = getVariableCall(element,context);
				ret.add(variableCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = getStatement(element,context);
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = statementToken.get(__element__KEY);
				if (negate) {
				ret.set(negateOperator(element.toString()));
				}
				else  {
				ret.set(element.toString());
				}
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = getStatement(element,context);
				ret.add(subStatement);
			}
		}
		if (ret.getSize() ==  1  &&  negate) {
			ret.negate();
		}
		return ret;
	}
	public ExternalStatement getVariableCall(final IToken variableCallToken,final ExternalContext context) {
		ExternalContext currentContext = context;
		final ExternalStatement ret = new ExternalStatement(".");
		for(IToken.Key __element__KEY:variableCallToken.keySet()) {
			if(__element__KEY.getName().equals("range")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("left").toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("right").toString()))))))));
			}
			if(__element__KEY.getName().equals("exact")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
			}
			if(__element__KEY.getName().equals("quote")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.toString())))));
			}
			if(__element__KEY.getName().equals("variableName")){ final IToken element = variableCallToken.get(__element__KEY);
				currentContext = currentContext.link(element.toString());
				if (currentContext ==  null) {
				throw new RuntimeException("Could not find \"+element+\" variable in context!");
				}
				if (ret.size() ==  0 ) {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+Generator.camelize(element.toString()).toString())),new ExternalStatement.Parameters())));
				}
			}
			if(__element__KEY.getName().equals("method")){ final IToken element = variableCallToken.get(__element__KEY);
				final String methodName;
				if (element.get("methodName") !=  null) {
				methodName = element.get("methodName").toString();
				}
				else  {
				methodName = getTypeName(element.get("type_name"));
				}
				final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
				for(final IToken atom:element.getAllSafely("statement")) {
					parameters.add(getStatement(atom,context));
				}
				if (element.get("NEW") !=  null) {
				currentContext = currentContext.getClassContext(methodName);
				if (currentContext ==  null) {
					throw new RuntimeException("Could not find \"+methodName+\" type in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(methodName.toString())))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(parameters)))))));
				}
				else  {
				currentContext = currentContext.link(methodName);
				if (currentContext ==  null) {
					throw new RuntimeException("Could not find "+" method in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(element.toString())),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(parameters)))))));
				}
			}
		}
		if (currentContext !=  null &&  currentContext.hasEnder()) {
			ret.add(currentContext.getEnder());
		}
		return ret;
	}
	public ExternalStatement getAcquisition(final IToken acquisitionToken,final Boolean forGainBody,final ExternalStatement subject,final ExternalContext context) {
		ExternalContext source;
		final String sourceName;
		if (acquisitionToken.get("source_name") !=  null) {
			sourceName = acquisitionToken.get("source_name").toString();
		}
		else  {
			sourceName = "this";
		}
		source = context.link(sourceName);
		if (source ==  null) {
			throw new RuntimeException("Could not find "+" source in context!");
		}
		final ExternalStatement gainObj;
		final ExternalStatement id;
		if (acquisitionToken.get("THIS") !=  null) {
			gainObj = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Enty*/new ExternalStatement(new StringEntry("clone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
			id = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("aspect_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("aspect_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspects")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspects")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("trait_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("trait_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Traits")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Traits")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("attack_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("attack_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attacks")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attacks")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("condition_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("condition_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else  {
			gainObj = null;
			id = null;
		}
		if (acquisitionToken.get("operator").get("GAINS") !=  null) {
			if (forGainBody) {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("gain"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(gainObj))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
			else  {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
		}
		else  {
			if (forGainBody) {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
			else  {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("gain"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(gainObj))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
		}
	}
	public ExternalStatement primeRange(final IToken rangeToken) {
		String left = rangeToken.get("left").toString();
		String right = rangeToken.get("left").toString();
		if (rangeToken.get("percent") !=  null) {
			left = percentify(left);
			right = percentify(right);
		}
		return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(left.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(right.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))));
	}
	public ExternalStatement getChance(final IToken chanceToken) {
		final Double value = Double.parseDouble(chanceToken.toString()) /  100.0;
		return /*Optr*/new ExternalStatement("<= ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("random"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(value.toString()))));
	}
	public void createList(final ExternalClassEntry listClass) {
		final String listName = listClass.getName() +  "List";
		if (declaredListSet.add(listName)) {
ListsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Lists").get(builder);builder.append(";");
			}
		},new StringEntry(listName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName())))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(listName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName())))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(listName.toString())))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName()))), new ExternalStatement(new StringEntry("..."), /*Name*/new ExternalStatement(new StringEntry("elements"))))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("super")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Arrays")))), /*Enty*/new ExternalStatement(new StringEntry("asList"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))))))))))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public void createCriteria(final ExternalClassEntry critClass) {
		final String critName = "of" + critClass.getName();
		if (declaredCritSet.add(critName)) {
CriteriaClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Criteria").get(builder);builder.append(";");
			}
		},new StringEntry(critName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Criteria"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName())))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(critName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Criteria"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName())))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("satisfies")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public void createListMap(final ExternalClassEntry leftClass,final ExternalClassEntry rightClass) {
		final String leftName = leftClass.getName() + "s";
		final String rightName = "_" + rightClass.getName();
		final String fullName = "Maps."+rightName;
		if (declaredListSet.add(fullName)) {
			if (ListsClass.getSubClass("Maps").getSubClass(leftName) ==  null) {
ListsClass.getSubClass("Maps").addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(leftClass.getPackage().toString())).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(leftClass.getPackage().toString())).get(builder);builder.append(".");new StringEntry("Lists").get(builder);builder.append(";");
			}
		},new StringEntry(leftName), "class ", new StringEntry(""), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(leftName).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
			}
ListsClass.getSubClass("Maps").getSubClass(leftName).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
builder.append("\nimport ");/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);builder.append(".");new StringEntry("Lists").get(builder);builder.append(";");
			}
		},new StringEntry(rightName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName())),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName())))))), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(rightName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName())),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName())))))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))), /*Name*/new ExternalStatement(new StringEntry("completeList")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))), /*Exac*/new ExternalStatement(new StringEntry("getFrom")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("element")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),new ExternalStatement.Parameters()))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("removeLast")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("isEmpty"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("removeLast"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("removeAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key")))}), /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("containsKey"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("removeAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("clear"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("remove")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("element")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))))),new ExternalMethodEntry(1, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))), /*Exac*/new ExternalStatement(new StringEntry("getAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList")))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public String percentify(final String input) {
		final Double result = Double.parseDouble(input) /  100.0;
		return result.toString();
	}
	public String percentify(final IToken input) {
		return percentify(input.toString());
	}
	public String negateOperator(final String operator) {
		if ("==".equals(operator)) {
			return "!=";
		}
		else if ("!=".equals(operator)) {
			return "==";
		}
		else if ("<".equals(operator)) {
			return ">=";
		}
		else if ("<=".equals(operator)) {
			return ">";
		}
		else if (">".equals(operator)) {
			return "<=";
		}
		else if (">=".equals(operator)) {
			return "<";
		}
		else if ("&&".equals(operator)) {
			return "||";
		}
		else if ("||".equals(operator)) {
			return "&&";
		}
		else  {
			return "COULD NOT NEGATE ("+")";
		}
	}
	public Set<String> getDeclaredCritSet() {
		return declaredCritSet;
	}
	public Set<String> getDeclaredListSet() {
		return declaredListSet;
	}
	public void assignListElementNames(final ParseContext context,final IToken root) {
		context.retainList(new HeroStats());
	}
	public String getDirectory(final String fileName,final String knownDirectory) {
		return "../Resource/";
	}
	public void setup(final ParseContext data) {
	}
	public void generate(final ParseContext data) {
		setup();
		final IToken root = data.getRoot();
		for(final IToken imports:root.getAllSafely("import_any")) {
				for(final IToken import_events:imports.getAllSafely("IMPORT_EVENT")) {
					for(final IToken element:import_events.getAllSafely("event_declaration")) {
						EventsClass.declaration(element);
					}
				}
		}
		ConditionsClass.setup(data);
		AspectsClass.setup(data);
		ItemsClass.setup(data);
		EntityClass.setup(data);
		SkillsClass.setup(data);
		for(final IToken imports:root.getAllSafely("import_any")) {
				importAny(imports);
		}
		output("../Questineer/src",data);
	}
	public void importAny(final IToken import_any) {
		for(final IToken import_events:import_any.getAllSafely("IMPORT_EVENT")) {
				for(final IToken element:import_events.getAllSafely("event_declaration")) {
				}
		}
		for(final IToken import_items:import_any.getAllSafely("IMPORT_ITEM")) {
				for(final IToken element:import_items.getAllSafely("import_any")) {
					importAny(element);
				}
				for(final IToken element:import_items.getAllSafely("item_declaration")) {
					ItemsClass.declaration(element);
				}
		}
		for(final IToken import_aspects:import_any.getAllSafely("IMPORT_ASPECT")) {
				for(final IToken element:import_aspects.getAllSafely("aspect_declaration")) {
					AspectsClass.declaration(element);
				}
		}
		for(final IToken import_affinities:import_any.getAllSafely("IMPORT_AFFINITY")) {
				for(final IToken element:import_affinities.getAllSafely("affinity_declaration")) {
					AffinitiesClass.declaration(element);
				}
		}
		for(final IToken import_traits:import_any.getAllSafely("IMPORT_TRAIT")) {
				for(final IToken element:import_traits.getAllSafely("trait_declaration")) {
					TraitsClass.declaration(element);
				}
		}
		for(final IToken import_attacks:import_any.getAllSafely("IMPORT_ATTACK")) {
				for(final IToken element:import_attacks.getAllSafely("attack_declaration")) {
					AttacksClass.declaration(element);
				}
		}
		for(final IToken import_conditions:import_any.getAllSafely("IMPORT_CONDITION")) {
				for(final IToken element:import_conditions.getAllSafely("condition_declaration")) {
					ConditionsClass.declaration(element);
				}
		}
	}
	public String getTypeName(final IToken nameToken) {
		final StringBuilder nameBuilder = new StringBuilder();
		Boolean isFirst = true;
		for(final IToken element:nameToken.getAllSafely("typeName")) {
				if (isFirst == false) {
				nameBuilder.append(".");
				}
				else  {
				isFirst = false;
				}
				nameBuilder.append(Generator.camelize(element.toString()));
		}
		return nameBuilder.toString();
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
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Source")+".java", SourceClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Range")+".java", RangeClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Lists")+".java", ListsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Criteria")+".java", CriteriaClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Aspect")+".java", AspectClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Aspects")+".java", AspectsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Items")+".java", ItemsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Item")+".java", ItemClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Attack")+".java", AttackClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Attacks")+".java", AttacksClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Skill")+".java", SkillClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Skills")+".java", SkillsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Affinity")+".java", AffinityClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Affinities")+".java", AffinitiesClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Condition")+".java", ConditionClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Conditions")+".java", ConditionsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Trait")+".java", TraitClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Traits")+".java", TraitsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Int")+".java", IntClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Entity")+".java", EntityClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Environment")+".java", EnvironmentClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Path")+".java", PathClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Events")+".java", EventsClass);
				builder = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(packageName.toString())).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
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
	public void setup(){SourceClass.__INIT__();
		RangeClass.__INIT__();
		ListsClass.__INIT__();
		CriteriaClass.__INIT__();
		AspectClass.__INIT__();
		AspectsClass.__INIT__();
		ItemsClass.__INIT__();
		ItemClass.__INIT__();
		AttackClass.__INIT__();
		AttacksClass.__INIT__();
		SkillClass.__INIT__();
		SkillsClass.__INIT__();
		AffinityClass.__INIT__();
		AffinitiesClass.__INIT__();
		ConditionClass.__INIT__();
		ConditionsClass.__INIT__();
		TraitClass.__INIT__();
		TraitsClass.__INIT__();
		IntClass.__INIT__();
		EntityClass.__INIT__();
		EnvironmentClass.__INIT__();
		PathClass.__INIT__();
		EventsClass.__INIT__();
		EventClass.__INIT__();
	}
	public void output(String rootDirectory, ParseContext data){
		__ROOT_DIRECTORY__ = rootDirectory;
		getGenerators()[0].generate(data);;
	}

}