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
public class Events extends ExternalClassEntry {
		protected final Map<String,List<Entry>> variableDefs = new HashMap<String,List<Entry>>();
		protected final Set<String> eventNameSet = new HashSet<String>();

	
public void declaration(final IToken declaration)  {
	final String eventName = declaration.get("eventName").toString();
	eventNameSet.add(eventName);
	final String cev = FlowController.camelize(eventName.toString());
MainFlow.classes.EventsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(cev), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Event")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(cev).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_795(); 
	   /* Methods */ 
	   /* Classes */
	}
		private void add_variable_795() {
	 		addVariable(new ExternalVariableEntry(true,true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Event")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id"))))),"", /*Name*/new ExternalStatement(new StringEntry("id")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Event")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Id")))), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(eventName.toString()))))))))));
	 	}
	
	
});
MainFlow.classes.EventsClass.getSubClass(cev).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("Listener"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Object")), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listenable"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(cev.toString())))))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Listener").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_463(); 
	   /* Classes */
	}
	
		private void add_method_463() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("listen")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(cev.toString())))))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
});
MainFlow.classes.EventClass.IdClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(eventName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	for(final IToken element:declaration.getAllSafely("parameter")) {
			for(final IToken atom:element.getAllSafely("type_name")) {
MainFlow.classes.EventsClass.getSubClass(cev).addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.methods.getTypeName(atom).toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(element.get("name").toString()))));
			}
	}
}
	
public void addParameter(final String eventName,final ExternalMethodEntry method)  {
	method.addParameter(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(eventName))),"", /*Name*/new ExternalStatement(new StringEntry("event"))));
}
	
public ExternalContext getEventContext(final String eName,final ExternalClassEntry inputClass)  {
	final ExternalMethodEntry newMethod = new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(FlowController.camelize(eName)))))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body());
	final String newMethodName = newMethod.getName();
	if (inputClass.getMethod(newMethodName) == null) {
inputClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(FlowController.camelize(eName)))))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()));
inputClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(FlowController.camelize(eName))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listener"))))),"", /*Name*/new ExternalStatement(new StringEntry("newListener")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(eName.toString())), /*Name*/new ExternalStatement(new StringEntry("Listeners"))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newListener"))))))))))));
		MainFlow.methods.createList(MainFlow.classes.ListenableClass);
inputClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listenable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(eName.toString())), /*Name*/new ExternalStatement(new StringEntry("Listeners")))), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listenable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),new ExternalStatement.Parameters()))));
	}
	return inputClass.getMethod(newMethodName).getContext();
}
	
public ExternalContext addToEventMethod(final String eName,final ExternalClassEntry inputClass,final ExternalStatement.Body body)  {
	final ExternalMethodEntry newMethod = new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(FlowController.camelize(eName)))))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body());
	final String newMethodName = newMethod.getName();
	if (inputClass.getMethod(newMethodName) == null) {
inputClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("on")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(FlowController.camelize(eName)))))),"", /*Name*/new ExternalStatement(new StringEntry("event")))}), "", /*Body*/new ExternalStatement.Body()));
inputClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Events")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(FlowController.camelize(eName))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listener"))))),"", /*Name*/new ExternalStatement(new StringEntry("newListener")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(eName.toString())), /*Name*/new ExternalStatement(new StringEntry("Listeners"))))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newListener"))))))))))));
		MainFlow.methods.createList(MainFlow.classes.ListenableClass);
inputClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listenable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(eName.toString())), /*Name*/new ExternalStatement(new StringEntry("Listeners")))), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Listenable")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))))),new ExternalStatement.Parameters()))));
	}
	final ExternalMethodEntry establishedMethod = inputClass.getMethod(newMethodName);
	establishedMethod.appendToBody(body);
	return establishedMethod.getContext();
}
	
public void addEventMethods(final ExternalClassEntry inputClass,final Map<String,ExternalStatement.Body> bodiesToAdd)  {
	for (final String name :  eventNameSet) {
		if (bodiesToAdd.containsKey(name)) {
			addToEventMethod(name,inputClass,bodiesToAdd.get(name));
		}
		else  {
			addToEventMethod(name,inputClass,/*Body*/new ExternalStatement.Body());
		}
	}
}
	
public void addEventMethodsExclusive(final ExternalClassEntry inputClass,final Map<String,ExternalStatement.Body> bodiesToAdd)  {
	for (final String name :  eventNameSet) {
		if (bodiesToAdd.containsKey(name)) {
			addToEventMethod(name,inputClass,bodiesToAdd.get(name));
		}
	}
}



	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("Events"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Events").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */ 
	   /* Classes */
	}
	
	
}