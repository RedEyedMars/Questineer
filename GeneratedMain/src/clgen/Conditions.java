package clgen;
import java.util.*;
import java.io.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.MainFlow;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.Runnable;
import java.lang.Iterable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.io.File;
import com.rem.parser.generation.Entry;
import com.rem.parser.generation.ListEntry;
import com.rem.parser.generation.Generator;
import com.rem.parser.parser.IParser;
import com.rem.parser.token.IToken;
import com.rem.parser.ParseContext;
import com.rem.parser.parser.RegexParser;
import lists.Rules;
import lists.GeneralTokens;
import lists.Listnames;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Random;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.util.glu.GLU;
import java.awt.image.PixelGrabber;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.Display;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Cursor;
import org.lwjgl.Sys;
import org.lwjgl.opengl.PixelFormat;
import lists.HeroStats;
public class Conditions extends ExternalClassEntry {

	
public void setup(final ParseContext data)  {
	MainFlow.classes.EventsClass.addEventMethods(MainFlow.classes.ConditionClass,new HashMap<String,ExternalStatement.Body>());
}
	
public void declaration(final IToken declarationToken)  {
	final String conditionName = FlowController.camelize(declarationToken.get("conditionName").toString());
	final String conditionDescription = declarationToken.get("description").toString();
MainFlow.classes.ConditionsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(conditionName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Source"))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(conditionName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_235(); 
	   /* Methods */
		add_method_171();
		add_method_172(); 
	   /* Classes */
	}
		private void add_variable_235() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters()))));
	 	}
	
		private void add_method_171() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(conditionName.toString()))))))));
	 	}
		private void add_method_172() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Exac*/new ExternalStatement(new StringEntry("getDescription")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(conditionDescription.toString()))))))));
	 	}
	
});
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
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getRequirement(element,candidate,false)))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))));
	}
	for(final IToken element:declarationToken.getAllSafely("imposition")) {
			gainBody.add(MainFlow.classes.EntityClass.getImposition(element,true,eventHost));
			lossBody.add(MainFlow.classes.EntityClass.getImposition(element,false,eventHost));
	}
	final ExternalContext gainContext = MainFlow.classes.EventsClass.addToEventMethod("gain",MainFlow.classes.ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
	final ExternalContext loseContext = MainFlow.classes.EventsClass.addToEventMethod("loss",MainFlow.classes.ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
	final ExternalContext tickContext = MainFlow.classes.EventsClass.addToEventMethod("tick",MainFlow.classes.ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
	for(final IToken element:declarationToken.getAllSafely("acquisition")) {
			gainBody.add(MainFlow.methods.getAcquisition(element,true,eventHost,gainContext));
			gainBody.add(MainFlow.methods.getAcquisition(element,false,eventHost,loseContext));
	}
	for(final IToken element:declarationToken.getAllSafely("accumulation")) {
			for(final IToken atom:element.getAllSafely("imposition")) {
				tickBody.add(MainFlow.classes.EntityClass.getImposition(atom,true,eventHost));
			}
			for(final IToken atom:element.getAllSafely("acquisition")) {
				tickBody.add(MainFlow.methods.getAcquisition(atom,true,eventHost,tickContext));
			}
	}
	Boolean isFirst = true;
	for(final IToken element:declarationToken.getAllSafely("to_lose")) {
			for(final IToken atom:element.getAllSafely("chance_pair")) {
				final ExternalStatement chanceHeader = new ExternalStatement();
				for(final IToken quark:atom.getAllSafely("has_chance")) {
					chanceHeader.add(MainFlow.methods.getChance(quark));
				}
				if (atom.get("boolean_statement") == null) {
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
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getBooleanStatement(atom.get("boolean_statement"),tickContext)))),
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
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getBooleanStatement(atom.get("boolean_statement"),tickContext)))),
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
			ExternalContext eventContext = MainFlow.classes.EventsClass.addToEventMethod(eventName,MainFlow.classes.ConditionsClass.getSubClass(conditionName),/*Body*/new ExternalStatement.Body());
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
				eventBody.add(MainFlow.methods.getBodyElement(atom,eventContext));
			}
			eventBodies.put(eventName,eventBody);
	}
	eventBodies.put("gain",gainBody);
	eventBodies.put("loss",lossBody);
	eventBodies.put("tick",tickBody);
	MainFlow.classes.EventsClass.addEventMethodsExclusive(MainFlow.classes.ConditionsClass.getSubClass(conditionName),eventBodies);
MainFlow.classes.ConditionsClass.getSubClass(conditionName).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Exac*/new ExternalStatement(new StringEntry("hasRequirements")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("candidate")))}), "", /*Body*/new ExternalStatement.Body()));
	MainFlow.classes.ConditionsClass.getSubClass(conditionName).getMethod("hasRequirements").appendToBody(requirementsBody);
	MainFlow.classes.ConditionsClass.getMethod("create").prependToBody(/*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(conditionName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("conditionName")))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(conditionName.toString())))))),new ExternalStatement.Parameters())))))));
}
	
public ExternalStatement getId(final String name)  {
	return /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(name.toString()))))))), /*Enty*/new ExternalStatement(new StringEntry("id"))));
}



	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("Conditions"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Conditions").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_170(); 
	   /* Classes */
	}
	
		private void add_method_170() {
	 		addMethod(new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Condition"))),"", /*Exac*/new ExternalStatement(new StringEntry("create")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("conditionName")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
	
}