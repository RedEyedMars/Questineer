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
public class Activities extends ExternalClassEntry {

	
public void setup(final ParseContext data)  {
	MainFlow.methods.createCriteria(MainFlow.classes.ActivityClass);
	MainFlow.classes.EventsClass.addToEventMethod("load",MainFlow.classes.ActivityClass,/*Body*/new ExternalStatement.Body());
	MainFlow.classes.EventsClass.addToEventMethod("idle",MainFlow.classes.ActivityClass,/*Body*/new ExternalStatement.Body());
	MainFlow.classes.EventsClass.addToEventMethod("success",MainFlow.classes.ActivityClass,/*Body*/new ExternalStatement.Body());
	MainFlow.classes.EventsClass.addToEventMethod("fail",MainFlow.classes.ActivityClass,/*Body*/new ExternalStatement.Body());
}
	
public void declaration(final IToken declarationToken)  {
	final String activityName = FlowController.camelize(declarationToken.get("activityName").toString());
	final String description = declarationToken.get("description").toString();
MainFlow.classes.ActivitiesClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(activityName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activity")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(activityName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_108();
		add_variable_109();
		add_variable_110(); 
	   /* Methods */
		add_method_79();
		add_method_80();
		add_method_81();
		add_method_82();
		add_method_83();
		add_method_84(); 
	   /* Classes */
	}
		private void add_variable_108() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),new ExternalStatement.Parameters()))));
	 	}
		private void add_variable_109() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Usable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),"", /*Name*/new ExternalStatement(new StringEntry("allUsables")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Usable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),new ExternalStatement.Parameters()))));
	 	}
		private void add_variable_110() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_79() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Exac*/new ExternalStatement(new StringEntry("getName")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(activityName.toString()))))))));
	 	}
		private void add_method_80() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Exac*/new ExternalStatement(new StringEntry("getDescription")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(description.toString()))))))));
	 	}
		private void add_method_81() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Usable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),"", /*Exac*/new ExternalStatement(new StringEntry("getUsables")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("allUsables"))))))));
	 	}
		private void add_method_82() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Exac*/new ExternalStatement(new StringEntry("hasSucceeded")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_83() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Exac*/new ExternalStatement(new StringEntry("hasFailed")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_84() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Exac*/new ExternalStatement(new StringEntry("getId")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))))))));
	 	}
	
});
	for(final IToken element:declarationToken.getAllSafely("variable_header")) {
			MainFlow.methods.addVariableHeader(element,MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()));
	}
	for(final IToken element:declarationToken.getAllSafely("variable_declaration")) {
			final ExternalVariableEntry variable = MainFlow.methods.addVariableHeader(element.get("variable_header"),MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()));
			variable.setIsWeak(true);
			if (element.get("statement") != null) {
			variable.setAssignment(MainFlow.methods.getStatement(element.get("statement"),MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getContext()));
			}
	}
	MainFlow.classes.ActivitiesClass.getMethod("create").prependToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("activityName"))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(activityName.toString())))))))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activities")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(activityName.toString())))))),new ExternalStatement.Parameters())))))));
	for(final IToken element:declarationToken.getAllSafely("className")) {
			final String methodName = "gain["+element.toString()+",Source]";
			final String variableName = element.toString().toLowerCase();
			MainFlow.classes.EntityClass.getMethod(methodName.toString()).appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activities")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(activityName.toString())))))))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("allUsables"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(variableName.toString())))))))))));
	}
	for(final IToken element:declarationToken.getAllSafely("endState")) {
			if (element.get("SUCCEED") != null) {
			final ExternalContext successContext = MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("hasSucceeded[Entity]").getContext();
			MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("hasSucceeded[Entity]").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getBooleanStatement(element.get("boolean_statement"),successContext)))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))))));
			}
			else  {
			final ExternalContext failContext = MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("hasFailed[Entity]").getContext();
			MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("hasFailed[Entity]").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getBooleanStatement(element.get("boolean_statement"),failContext)))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))))))));
			}
	}
	for(final IToken element:declarationToken.getAllSafely("getTarget")) {
MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTarget")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Criteria")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Target"))))),"", /*Name*/new ExternalStatement(new StringEntry("targetCriteria")))}), "", /*Body*/new ExternalStatement.Body()));
			final ExternalContext getTargetContext = MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("getTarget[Entity,EntityCriteria]").getContext();
			for(final IToken atom:element.getAllSafely("body_element")) {
				MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("getTarget[Entity,EntityCriteria]").appendToBody(MainFlow.methods.getBodyElement(atom,getTargetContext));
			}
	}
	for(final IToken element:declarationToken.getAllSafely("getDestination")) {
MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Exac*/new ExternalStatement(new StringEntry("getDestination")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host")))}), "", /*Body*/new ExternalStatement.Body()));
			final ExternalContext getTargetContext = MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("getDestination[Entity]").getContext();
			for(final IToken atom:element.getAllSafely("body_element")) {
				MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("getDestination[Entity]").appendToBody(MainFlow.methods.getBodyElement(atom,getTargetContext));
			}
	}
	if (declarationToken.get("step") != null) {
		for(final IToken element:declarationToken.getAllSafely("step")) {
MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Exac*/new ExternalStatement(new StringEntry("step")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host")))}), "", /*Body*/new ExternalStatement.Body()));
				final ExternalContext stepContext = MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("step").getContext();
				MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("step").appendToBody(MainFlow.methods.getBodyElements(element,stepContext));
		}
	}
	if (declarationToken.get("listen") != null) {
		for(final IToken element:declarationToken.getAllSafely("listen")) {
MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("listen")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity"))),"", /*Name*/new ExternalStatement(new StringEntry("host"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Entity")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Event"))))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()));
				final ExternalContext listenContext = MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("listen").getContext();
				MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("listen").appendToBody(MainFlow.methods.getBodyElements(element,listenContext));
		}
	}
	for(final IToken element:declarationToken.getAllSafely("event")) {
			final ExternalContext eventContext = MainFlow.classes.EventsClass.getEventContext(element.get("event_names").toString(),MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()));
			MainFlow.classes.EventsClass.addToEventMethod(element.get("event_names").toString(),MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()),MainFlow.methods.getBodyElements(element,eventContext));
	}
	MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("hasSucceeded[Entity]").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))));
	MainFlow.classes.ActivitiesClass.getSubClass(activityName.toString()).getMethod("hasFailed[Entity]").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))));
}



	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("activities")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("Activities"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Activities").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_78(); 
	   /* Classes */
	}
	
		private void add_method_78() {
	 		addMethod(new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activity"))),"", /*Exac*/new ExternalStatement(new StringEntry("create")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("activityName")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
	
}