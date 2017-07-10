package clgen;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import com.rem.parser.ParseContext;
import com.rem.parser.token.IToken;
import lists.HeroStats;
import lists.EventNames;
import java.lang.StringBuilder;
import com.rem.parser.parser.IParser;
import lists.Rules;
import java.util.List;
import lists.Listnames;
import com.rem.parser.parser.RegexParser;
import lists.GeneralTokens;
public class MainFlow extends FlowController  {
	//Externals


	protected Range RangeClass = new Range();
	public class Range extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Range"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Lists ListsClass = new Lists();
	public class Lists extends ExternalClassEntry {



	protected Maps MapsClass = new Maps();
	public class Maps extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Maps"), 
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Lists"), 
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Criteria"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("satisfies")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry("TypeName".toString())))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Aspect AspectClass = new Aspect();
	public class Aspect extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Aspect"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Aspect").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Aspects AspectsClass = new Aspects();
	public class Aspects extends ExternalClassEntry {

	
public ExternalStatement getId(final String name) {
	return /*Optr*/new ExternalStatement("->", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Aspects"))))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(name)), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Aspects"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Source SourceClass = new Source();
	public class Source extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Source"), 
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		},new StringEntry(className), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(className).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Item")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(true, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Items")), /*Name*/new ExternalStatement(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Items")), /*Name*/new ExternalStatement(new StringEntry("Id"))))),new ExternalStatement.Parameters())))}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	ItemsClass.getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("name")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(itemToken.get("itemName").toString()))))))));
	ItemsClass.getMethod("createItem").prependToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("itemName"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("equals")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(className.toString()))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Items")), /*Name*/new ExternalStatement(new StringEntry("className"))))),new ExternalStatement.Parameters())))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}));
	for(final IToken element:itemToken.getAllSafely("hp")) {
ItemsClass.getSubClass("className").getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("hp")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
ItemsClass.getSubClass("className").getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("maxHp")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("attack")) {
ItemsClass.getSubClass("className").getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("dmg")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("defense")) {
ItemsClass.getSubClass("className").getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("def")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("value")) {
ItemsClass.getSubClass("className").getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("weight")) {
ItemsClass.getSubClass("className").getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("weight")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getRange(element)))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))))))))));
	}
	for(final IToken element:itemToken.getAllSafely("gain_aspect")) {
			for(final IToken atom:element.getAllSafely("aspect_names")) {
				this.gain(atom,"change_item","change_item","getItem",AspectsClass,ItemsClass.getSubClass("className"));
			}
	}
	for(final IToken element:itemToken.getAllSafely("gain_trait")) {
			for(final IToken atom:element.getAllSafely("trait_names")) {
				this.gain(atom,"equip","unequip","getItem",TraitsClass,ItemsClass.getSubClass("className"));
			}
	}
	for(final IToken element:itemToken.getAllSafely("gain_attack")) {
			for(final IToken atom:element.getAllSafely("attack_names")) {
				this.gain(atom,"equip","unequip","getItem",AttacksClass,ItemsClass.getSubClass("className"));
			}
	}
	for(final IToken element:itemToken.getAllSafely("event")) {
			final ExternalStatement.Body bodyElementList = new ExternalStatement.Body();
			final ExternalContext context = EventsClass.addToEventMethod(element.toString(),ItemsClass.getSubClass("className"),bodyElementList);
			for(final IToken atom:element.getAllSafely("body_element")) {
				bodyElementList.add(getBodyElement(atom,context));
			}
			EventsClass.addToEventMethod(element.toString(),ItemsClass.getSubClass("className"),bodyElementList);
	}
}
	
public void gain(final IToken gainToken,final String gainEventName,final String loseEventName,final String subject,final ExternalClassEntry gainClass,final ExternalClassEntry itemClass) {
	final String specificClassName = Generator.camelize(gainToken.toString());
	final ExternalClassEntry specificClass = gainClass.getSubClass(specificClassName);
	final ExternalClassEntry idClass = gainClass.getSubClass("Id");
	final String asList = gainClass.getName().toLowerCase() + "s";
	if (gainToken.get("boolean_statement") ==  null) {
itemClass.getMethod("*").appendToBody(new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asList)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("add")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(specificClass.getFullName()))),new ExternalStatement.Parameters()))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
	}
	else  {
		final ExternalContext gainContext = EventsClass.addToEventMethod(gainEventName,specificClass,new ExternalStatement.Body());
		final ExternalContext loseContext = EventsClass.addToEventMethod(gainEventName,specificClass,new ExternalStatement.Body());
		for(final IToken atom:gainToken.getAllSafely("boolean_statement")) {
				final ExternalStatement gainHeader = getBooleanStatement(atom,gainContext);
				final ExternalStatement loseHeader = getBooleanStatement(atom,loseContext);
				EventsClass.addToEventMethod(gainEventName,specificClass,/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom,gainContext)))), /*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("has")));
						set("(");
						add(new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("gain")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(specificClass.getFullName()))),new ExternalStatement.Parameters())),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}));
				EventsClass.addToEventMethod(loseEventName,specificClass,/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("&& ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getBooleanStatement(atom,gainContext)))), /*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("has")));
						set("(");
						add(new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("lose")));
						set("(");
						add(new ExternalStatement.Parameters(/*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(specificClass.getFullName()))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}));
		}
	}
}


	protected Id IdClass = new Id();
	public class Id extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Id"), 
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Items"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Item"))), /*Exac*/new ExternalStatement(new StringEntry("createItem")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("itemName")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))}), Arrays.asList(new ExternalClassEntry[]{ItemsClass.IdClass}));
	}
}
	protected Item ItemClass = new Item();
	public class Item extends ExternalClassEntry {



	protected Modifier ModifierClass = new Modifier();
	public class Modifier extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Modifier"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("Modifier").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Entity")), /*Name*/new ExternalStatement(new StringEntry("Modifier")))).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Entity")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("range")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Entity")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Item"))), /*Name*/new ExternalStatement(new StringEntry("host")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Item"))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("use")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("use")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("decrease")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("inputEntity"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Float"))), /*Name*/new ExternalStatement(new StringEntry("amount")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("decrease")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputEntity")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Float"))), /*Exac*/new ExternalStatement(new StringEntry("getValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("range"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("use")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("host"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				})))))}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}

	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Item"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Item").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("String"))), /*Name*/new ExternalStatement(new StringEntry("name")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("String"))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Entity"))), /*Name*/new ExternalStatement(new StringEntry("equipper")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("hp")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("maxHp")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("dmg")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("def")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("value")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("weight")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters())),new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))), /*Name*/new ExternalStatement(new StringEntry("hp")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Item")), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(0, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Events")), /*Name*/new ExternalStatement(new StringEntry("Equip"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("equipper")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getHost")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				})))))),new ExternalMethodEntry(0, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Events")), /*Name*/new ExternalStatement(new StringEntry("Unequip"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("equipper")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))))),new ExternalMethodEntry(0, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Events")), /*Name*/new ExternalStatement(new StringEntry("ChangeItem"))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body())}), Arrays.asList(new ExternalClassEntry[]{ItemClass.ModifierClass}));
	}
}
	protected Attack AttackClass = new Attack();
	public class Attack extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Attack"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Attack").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Attacks AttacksClass = new Attacks();
	public class Attacks extends ExternalClassEntry {

	
public ExternalStatement getId(final String name) {
	return /*Optr*/new ExternalStatement("->", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Attacks"))))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(name)), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Attacks"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Skill SkillClass = new Skill();
	public class Skill extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Skill"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Skill").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Skills SkillsClass = new Skills();
	public class Skills extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Skills"), 
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




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Affinity"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Affinity").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Affinities AffinitiesClass = new Affinities();
	public class Affinities extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Affinities"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Condition ConditionClass = new Condition();
	public class Condition extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Condition"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Condition").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Conditions ConditionsClass = new Conditions();
	public class Conditions extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Conditions"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Trait TraitClass = new Trait();
	public class Trait extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Trait"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Trait").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Traits TraitsClass = new Traits();
	public class Traits extends ExternalClassEntry {

	
public ExternalStatement getId(final String name) {
	return /*Optr*/new ExternalStatement("->", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Traits"))))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(name)), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
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
			}
		}, new StringEntry("Traits"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected Entity EntityClass = new Entity();
	public class Entity extends ExternalClassEntry {

	
public ExternalStatement getRange(final IToken rangeToken) {
	if (rangeToken.get("rangeToken") !=  null) {
		final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
		parameters.add(getSingleRange(rangeToken));
		for(final IToken element:rangeToken.getAllSafely("extra")) {
				parameters.add(getSingleRange(element));
		}
		return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("MultiModifier"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(parameters))))));
	}
	return getSingleRange(rangeToken);
}
	
public ExternalStatement getSingleRange(final IToken singleRangeToken) {
	if (singleRangeToken.get("hero_stats") !=  null) {
		if (singleRangeToken.get("percent") !=  null) {
			return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Entity")), /*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("hero_stats").toString()))))), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(percentify(singleRangeToken.get("left")).toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(percentify(singleRangeToken.get("right")).toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getRandom")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
		}
		else  {
			return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Entity")), /*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("hero_stats").toString()))))), /*Name*/new ExternalStatement(new StringEntry("Modifier"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("left").toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(singleRangeToken.get("right").toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getRandom")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
		}
	}
	else  {
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getRange(singleRangeToken))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getModifier")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				});
	}
}
	
public ExternalStatement getImposition(final IToken impositionToken,final Boolean forGainBody,final ExternalStatement subject) {
	final String impositionStat = Generator.camelize(impositionToken.get("hero_stats").toString());
	final String statGetMethod = "get"+impositionStat;
	if (forGainBody) {
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
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(statGetMethod)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("impose")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realCount.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
	}
	else  {
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(statGetMethod)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("release")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
	}
}
	
public void addGainLoss(final ExternalClassEntry inputClass,final ExternalClassEntry outputClass) {
	final String asVariable = inputClass.getName().toLowerCase();
	final String asList = asVariable+"s";
outputClass.addMethod(new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("has")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry(inputClass.getFullName())), /*Name*/new ExternalStatement(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("findId")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("for (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(inputClass.getFullName()))), /*Name*/new ExternalStatement(asVariable)), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asList)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getAll")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				})))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asVariable)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getId")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("findId")))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}))));
outputClass.addMethod(new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("gain")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(inputClass.getFullName()))), /*Name*/new ExternalStatement(asVariable)),
/*PARAMS*/				new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asList)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("add")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asVariable)))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))));
	final String errorMessage = inputClass.getName() +  ":\"+removeId+\"  not found!";
outputClass.addMethod(new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("lose")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry(inputClass.getFullName())), /*Name*/new ExternalStatement(new StringEntry("Id"))))), /*Name*/new ExternalStatement(new StringEntry("removeId"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Source"))), /*Name*/new ExternalStatement(new StringEntry("source")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(inputClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("toRemove")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("for (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(inputClass.getFullName()))), /*Name*/new ExternalStatement(asVariable)), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asList)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getFrom")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				})))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asVariable)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("getId")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("removeId")))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("toRemove")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asVariable)))))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("== ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toRemove")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("throw ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("new RuntimeException(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(errorMessage))))")))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("else ")),
			new TabEntry(new StringEntry("}"))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(asList)));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("remove")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("source")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toRemove"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}))));
	createListMap(SourceClass,inputClass);
outputClass.addVariable(new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Lists")), /*Name*/new ExternalStatement(new StringEntry("Maps")))), /*Name*/new ExternalStatement(new StringEntry("Source"))))), /*Name*/new ExternalStatement(asList)));
}


	protected Modifier ModifierClass = new Modifier();
	public class Modifier extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Modifier"), 
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
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{}));
	}
}
	protected MultiModifier MultiModifierClass = new MultiModifier();
	public class MultiModifier extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("MultiModifier"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static interface ");
			new StringEntry("MultiModifier").get(builder);
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Entity"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public  class ");
			new StringEntry("Entity").get(builder);
			new StringEntry("").get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Object")).get(builder);
			builder.append(" ");
			builder.append(" implements ");
	/*Name*/new ExternalStatement(new StringEntry("Source")).get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{EntityClass.ModifierClass,EntityClass.MultiModifierClass}));
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		},new StringEntry(cev), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(cev).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry("Event")).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
	for(final IToken element:declaration.getAllSafely("parameter")) {
			for(final IToken atom:element.getAllSafely("type_name")) {
EventsClass.getSubClass("cev").addVariable(new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(getTypeName(atom).toString())))), /*Enty*/new ExternalStatement(new StringEntry(element.get("name").toString()))));
			}
	}
}
	
public void addParameter(final String eventName,final ExternalMethodEntry method) {
	method.addParameter(new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(eventName))), /*Name*/new ExternalStatement(new StringEntry("event"))));
}
	
public ExternalContext addToEventMethod(final String eName,final ExternalClassEntry inputClass,final ExternalStatement.Body body) {
	final ExternalMethodEntry newMethod = new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Events")), /*Name*/new ExternalStatement(new StringEntry(Generator.camelize(eName)))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body());
	final String newMethodName = newMethod.getName();
	if (inputClass.getMethod(newMethodName) ==  null) {
inputClass.addMethod(new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Events")), /*Name*/new ExternalStatement(new StringEntry(Generator.camelize(eName)))))), /*Name*/new ExternalStatement(new StringEntry("event")))}), /*Body*/new ExternalStatement.Body()));
	}
	final ExternalMethodEntry establishedMethod = inputClass.getMethod(newMethodName);
	establishedMethod.appendToBody(body);
	return establishedMethod.getCurrentContext();
}
	
public void addEventMethods(final ExternalClassEntry inputClass,final List<String> nameToAdd,final List<ExternalStatement.Body> bodiesToAdd) {
	final Iterator<ExternalStatement.Body> bodyItr = bodiesToAdd.iterator();
	for (final String name : nameToAdd) {
		addToEventMethod(name,inputClass,bodyItr.next());
	}
}



	public void __INIT__(){
		super.__SETUP__(
		new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		}, new StringEntry("Events"), 
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
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
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
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getAcquisition(element,true,subject,context))))));
			}
			if(__element__KEY.getName().equals("imposition")){ final IToken element = elementToken.get(__element__KEY);
				final ExternalStatement subject = getVariableCall(element.get("variable_call"),context);
				final Boolean doom = element.get("IMPOSE") !=  null ||  element.get("PLUS") !=  null;
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(EntityClass.getImposition(element.get("imposition"),doom,subject))))));
			}
			if(__element__KEY.getName().equals("variable_declaration")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getVariableDeclaration(element,context))))));
			}
			if(__element__KEY.getName().equals("if_statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getIfStatement(element,context))))));
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
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variableName").toString())))), /*Enty*/new ExternalStatement(new StringEntry(typeName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(getStatement(variableDeclarationToken.get("statement"),context)))))));
		}
		else  {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variableName").toString())))), /*Enty*/new ExternalStatement(new StringEntry(typeName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))));
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
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(header))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*InCl*/new ExternalStatement(body);
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		});
		}
		else if (mode ==  1 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(header))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*InCl*/new ExternalStatement(body);
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		},
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("else ")),
			new TabEntry(new StringEntry("}"))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*InCl*/new ExternalStatement(elseBody);
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		});
		}
		else if (mode ==  2 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(header))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*InCl*/new ExternalStatement(body);
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		},
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("else if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(elseHeader))))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*InCl*/new ExternalStatement(elseBody);
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		});
		}
		else  {
			return null;
		}
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final ExternalContext context) {
		final ExternalStatement operator = new ExternalStatement();
		for(IToken.Key __element__KEY:booleanStatement.keySet()) {
			if(__element__KEY.getName().equals("has_chance")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(getChance(element));
			}
			if(__element__KEY.getName().equals("has_statement")){ final IToken element = booleanStatement.get(__element__KEY);
				final ExternalStatement variableCall = getVariableCall(element.get("variable_call"),context);
				final ExternalStatement hasCall = getRequirement(element.get("requirement"),variableCall,true);
				if (element.get("NOT") !=  null) {
				hasCall.negate();
				}
				operator.add(hasCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(getStatement(element,context));
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = booleanStatement.get(__element__KEY);
				if (element.toString() ==  "&") {
				operator.set("&&");
				}
				else if (element.toString() ==  "|") {
				operator.set("||");
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
				final String statName = Generator.camelize(quanta.get("hero_stats").toString());
				final String methodName = "get"+statName;
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(candidate)), /*Name*/new ExternalStatement(methodName)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("getValue")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				});
				innerHead.set(quanta.get("ORDINAL").toString());
				innerHead.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(quanta.get("INTEGER").toString())))));
				if (quanta.get("NOT") !=  null) {
				innerHead.negate();
				}
				if (showAsTrue ==  false) {
				innerHead.negate();
				}
				requireHeader.add(innerHead);
		}
		for(final IToken quanta:requirementToken.getAllSafely("require_trait")) {
				final ExternalStatement id = TraitsClass.getId(Generator.camelize(quanta.get("trait_names").toString()));
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(candidate)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("has")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id)))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
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
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(candidate)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("has")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id)))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
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
		final ExternalStatement ret = new ExternalStatement();
		Boolean negate = false;
		for(IToken.Key __element__KEY:statementToken.keySet()) {
			if(__element__KEY.getName().equals("NOT")){ final IToken element = statementToken.get(__element__KEY);
				negate = true;
			}
			if(__element__KEY.getName().equals("variable_call")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement variableCall = getVariableCall(element,context);
				if (negate) {
				variableCall.negate();
				negate = false;
				}
				ret.add(variableCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = getStatement(element,context);
				if (negate) {
				subStatement.negate();
				negate = false;
				}
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = statementToken.get(__element__KEY);
				ret.set(element.toString());
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = getStatement(element,context);
				if (negate) {
				subStatement.negate();
				negate = false;
				}
				ret.add(subStatement);
			}
		}
		return ret;
	}
	public ExternalStatement getVariableCall(final IToken variableCallToken,final ExternalContext context) {
		ExternalContext currentContext = context;
		final ExternalStatement ret = new ExternalStatement();
		ret.set(".");
		for(IToken.Key __element__KEY:variableCallToken.keySet()) {
			if(__element__KEY.getName().equals("range")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("left").toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("right").toString()))))))));
			}
			if(__element__KEY.getName().equals("exact")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
			}
			if(__element__KEY.getName().equals("quote")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.toString())))));
			}
			if(__element__KEY.getName().equals("varibleName")){ final IToken element = variableCallToken.get(__element__KEY);
				currentContext = currentContext.link(element.toString());
				if (currentContext ==  null) {
				throw new RuntimeException("Could not find "+" variable in context!");
				}
				if (ret.size() ==  0 ) {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("get")), /*Name*/new ExternalStatement(new StringEntry(Generator.camelize(element))))))));
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
					throw new RuntimeException("Could not find "+" type in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(methodName.toString())))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(parameters)))))));
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
			gainObj = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("clone")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				});
			id = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("aspect_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("aspect_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Aspects")), /*Name*/new ExternalStatement(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Aspects")))), /*Enty*/new ExternalStatement(new StringEntry("className")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("trait_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("trait_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Traits")), /*Name*/new ExternalStatement(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Traits")))), /*Enty*/new ExternalStatement(new StringEntry("className")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("attack_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("attack_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Attacks")), /*Name*/new ExternalStatement(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Attacks")))), /*Enty*/new ExternalStatement(new StringEntry("className")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("condition_names") !=  null) {
			final String className = Generator.camelize(acquisitionToken.get("condition_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new ExternalStatement(".", /*Name*/new ExternalStatement(new StringEntry("Conditions")), /*Name*/new ExternalStatement(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Conditions")))), /*Enty*/new ExternalStatement(new StringEntry("className")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else  {
			gainObj = null;
			id = null;
		}
		if (acquisitionToken.get("GAINS") !=  null) {
			if (forGainBody) {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("gain")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(gainObj))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(sourceName)))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
			}
			else  {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("lose")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(sourceName)))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
			}
		}
		else  {
			if (forGainBody) {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("lose")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(id))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(sourceName)))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
			}
			else  {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(subject)));
						set(".");
						add(/*Name*/new ExternalStatement(new StringEntry("gain")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(gainObj))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(sourceName)))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
			}
		}
	}
	public ExternalStatement getRange(final IToken rangeToken) {
		String left = rangeToken.get("left").toString();
		String right = rangeToken.get("left").toString();
		if (rangeToken.get("percent") !=  null) {
			left = percentify(left);
			right = percentify(right);
		}
		return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(left), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(right), /*Name*/new ExternalStatement(new StringEntry("f")))))))));
	}
	public ExternalStatement getChance(final IToken chanceToken) {
		final Double value = Double.parseDouble(chanceToken.toString()) /  100.0;
		return /*Optr*/new ExternalStatement("<= ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("random")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(value.toString()))));
	}
	public void createList(final ExternalClassEntry listClass) {
		final String listName = listClass.getName();
		if (declaredListSet.add(listName)) {
ListsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		},new StringEntry(listName), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(listName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry(new StringEntry("ArrayList")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(listClass.getFullName()))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(listClass.getFullName()))), /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(listName.toString())))), new ExternalStatement(new StringEntry("..."), /*Name*/new ExternalStatement(new StringEntry("elements"))))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("super")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Arrays")))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("asList")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public void createCriteria(final ExternalClassEntry critClass) {
		final String critName = critClass.getName();
		if (declaredCritSet.add(critName)) {
CriteriaClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		},new StringEntry(critName), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(critName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry(new StringEntry("Criteria")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(critClass.getFullName()))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Boolean"))), /*Exac*/new ExternalStatement(new StringEntry("satisfies")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(critClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("candidate")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public void createListMap(final ExternalClassEntry leftClass,final ExternalClassEntry rightClass) {
		final String rightName = "_" + rightClass.getName();
		final String fullName = "Map." + leftClass.getName() + "."+rightName;
		if (declaredListSet.add(fullName)) {
			if (ListsClass.getSubClass("Maps").getSubClass(leftClass) ==  null) {
ListsClass.getSubClass("Maps").addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		},new StringEntry("leftClass"), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry("leftClass").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{}), Arrays.asList(new ExternalMethodEntry[]{}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
			}
ListsClass.getSubClass("Maps").getSubClass(leftClass).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder builder){/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
			}
		}, 
		new Entry(){
			public void get(StringBuilder builder){
			}
		},new StringEntry(rightName), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("public static class ");
			new StringEntry(rightName).get(builder);
			builder.append(" ");
			builder.append(" extends ");
	/*Name*/new ExternalStatement(new StringEntry(new StringEntry("HashMap")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(leftClass.getFullName())),/*Name*/new ExternalStatement(new StringEntry(new StringEntry("LinkedList")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName())))).get(builder);
			builder.append(" ");
			new StringEntry("").get(builder);
			builder.append(" {");
		}
	}, Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(new StringEntry("LinkedList")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName())))), /*Name*/new ExternalStatement(new StringEntry("completeList")), /*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(new StringEntry("LinkedList")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName())))),new ExternalStatement.Parameters()))}), Arrays.asList(new ExternalMethodEntry[]{new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(new StringEntry("LinkedList")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName())))), /*Exac*/new ExternalStatement(new StringEntry("getFrom")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("element")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("containsKey")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("put")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement(new StringEntry("new "),new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(new StringEntry("LinkedList")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName())))),new ExternalStatement.Parameters()))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("add")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("add")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("removeLast")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Optr*/new ExternalStatement("&&! ", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("containsKey")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}), /*Call*/new ExternalStatement(){
					{
						add(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("isEmpty")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("remove")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("removeLast")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				})));
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("removeAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Cond*/new ExternalStatement(
			new TabEntry(new StringEntry("if (")),
			new TabEntry(new StringEntry("}")), 
			new ExternalStatement(null, new StringEntry(")"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("containsKey")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))){
			ExternalStatement __BODY__;
			{
				__BODY__ = /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("removeAll")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				})));
						set(").");
						suffix = new StringEntry(")");
					}
				}))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("clear")));
						set("(");
						add(new ExternalStatement.Parameters());
						set(").");
						suffix = new StringEntry(")");
					}
				}))));
				super.add(__BODY__);
			}
			@Override
			public boolean add(ExternalStatement statement){
				return __BODY__.add(statement);
			}
		}))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("void"))), /*Exac*/new ExternalStatement(new StringEntry("remove")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(leftClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName()))), /*Name*/new ExternalStatement(new StringEntry("element")))}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("get")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				});
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("remove")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(){
					{
						add(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))));
						set(".");
						add(/*Enty*/new ExternalStatement(new StringEntry("remove")));
						set("(");
						add(new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))));
						set(").");
						suffix = new StringEntry(")");
					}
				}))))),new ExternalMethodEntry(1, /*Name*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry(new StringEntry("List")+"<"), new StringEntry(">"), ",", /*Name*/new ExternalStatement(new StringEntry(rightClass.getFullName())))), /*Exac*/new ExternalStatement(new StringEntry("getAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), 
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))))))))}), Arrays.asList(new ExternalClassEntry[]{})) ;}});
		}
	}
	public String percentify(final String input) {
		final Double result = Double.parseDouble(input) /  100.0;
		return result.toString();
	}
	public String percentify(final IToken input) {
		return percentify(input.toString());
	}
	public Set<String> getDeclaredCritSet() {
		return declaredCritSet;
	}
	public Set<String> getDeclaredListSet() {
		return declaredListSet;
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
		output("../Questineer/src",data);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Range")+".java", RangeClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Lists")+".java", ListsClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Criteria")+".java", CriteriaClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Source")+".java", SourceClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Items")+".java", ItemsClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Item")+".java", ItemClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Skill")+".java", SkillClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Skills")+".java", SkillsClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Entity")+".java", EntityClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
				builder.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(builder);
	directory = new File(__ROOT_DIRECTORY__, builder.toString().replace(".","/"));
	directory.mkdirs();
	this.addFile(directory,Generator.camelize("Events")+".java", EventsClass);
				builder = new StringBuilder();
	/*Name*/new ExternalStatement(packageName).get(builder);
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
	public void output(String rootDirectory, ParseContext data){
		__ROOT_DIRECTORY__ = rootDirectory;
		getGenerators()[0].generate(data);;
	}

}