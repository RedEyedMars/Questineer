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
public class Renderer extends ExternalClassEntry {
		protected final ExternalStatement renderLayersBody = new ExternalStatement(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("baseLayer"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
		protected final ExternalStatement animateLayersBody = new ExternalStatement(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("baseLayer"))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
		protected final ExternalStatement loadLayersBody = new ExternalStatement(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("baseLayer"))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));

	
public void addLayer(final String layerName)  {
	final String realLayerName = layerName + "Layer";
	renderLayersBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realLayerName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
	animateLayersBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realLayerName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
	loadLayersBody.add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realLayerName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
	MainFlow.classes.RendererClass.getMethod("end").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(realLayerName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("end"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
MainFlow.classes.RendererClass.addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),"", /*Enty*/new ExternalStatement(new StringEntry(realLayerName.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),new ExternalStatement.Parameters()))));
}


	public final Layer LayerClass = new Layer();
	public class Layer extends ExternalClassEntry {



	public final ControlEvent ControlEventClass = new ControlEvent();
	public class ControlEvent extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("ControlEvent"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("ControlEvent").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */ 
	   /* Methods */
		add_method_457(); 
	   /* Classes */
	}
	
		private void add_method_457() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("act")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
}
	public final Addition AdditionClass = new Addition();
	public class Addition extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Addition"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ControlEvent")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Addition").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_802(); 
	   /* Methods */
		add_method_458(); 
	   /* Classes */
	}
		private void add_variable_802() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("toAdd")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_458() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("act")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toAdd"))))))))))));
	 	}
	
}
	public final Removal RemovalClass = new Removal();
	public class Removal extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Removal"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ControlEvent")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Removal").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_803(); 
	   /* Methods */
		add_method_459(); 
	   /* Classes */
	}
		private void add_variable_803() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("toRemove")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_459() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("act")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toRemove"))))))))))));
	 	}
	
}

	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Layer"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Thread")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Layer").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_791();
		add_variable_792();
		add_variable_793();
		add_variable_794();
		add_variable_795();
		add_variable_796(); 
	   /* Methods */
		add_method_450();
		add_method_451();
		add_method_452();
		add_method_453();
		add_method_454();
		add_method_455();
		add_method_456(); 
	   /* Classes */
		add_subclass_194();
		add_subclass_195();
		add_subclass_196();
	}
		private void add_variable_791() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("UNSTARTED")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
	 	}
		private void add_variable_792() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("WAITING_FOR_EVENT")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_793() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("PROCESSING_EVENTS")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))));
	 	}
		private void add_variable_794() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))))),"", /*Name*/new ExternalStatement(new StringEntry("layer")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))))),new ExternalStatement.Parameters()))));
	 	}
		private void add_variable_795() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ControlEvent"))))),"", /*Name*/new ExternalStatement(new StringEntry("events")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ControlEvent"))))),new ExternalStatement.Parameters()))));
	 	}
		private void add_variable_796() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("status")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("UNSTARTED"))))));
	 	}
	
		private void add_method_450() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("toAdd")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Addition"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toAdd")))))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("status")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("WAITING_FOR_EVENT")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("notifyAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))));
	 	}
		private void add_method_451() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("remove")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("toRemove")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Removal"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toRemove")))))))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("status")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("WAITING_FOR_EVENT")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("notifyAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))));
	 	}
		private void add_method_452() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("run")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("isRunning")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("status")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("WAITING_FOR_EVENT")))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("&&", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("isRunning")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("isEmpty"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
					/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events")))),
			/*Body*/new ExternalStatement.Body(
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("wait"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("status")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("PROCESSING_EVENTS")))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("isEmpty"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))),
			/*Body*/new ExternalStatement.Body(
					/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events")))),
			/*Body*/new ExternalStatement.Body(
						/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer")))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))), /*Enty*/new ExternalStatement(new StringEntry("act"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("Exception")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))))));
	 	}
		private void add_method_453() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("end")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("status")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("WAITING_FOR_EVENT")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("events"))), /*Enty*/new ExternalStatement(new StringEntry("notifyAll"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))));
	 	}
		private void add_method_454() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("start")),new ExternalStatement.Parameters()))))));
	 	}
		private void add_method_455() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("previousTexture")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-2")))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))))),
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("getTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("previousTexture")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("previousTexture")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("getTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glBindTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TEXTURE_2D")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("previousTexture"))))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))))));
	 	}
		private void add_method_456() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*FIHd*/new ExternalStatement(";", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("j")), /*Exac*/new ExternalStatement(new StringEntry("0"))), new ExternalStatement("< ", /*Name*/new ExternalStatement(new StringEntry("j")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))), /*Enty*/new ExternalStatement(new StringEntry("size"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))), new ExternalStatement(new StringEntry("++"),"",/*Name*/new ExternalStatement(new StringEntry("j")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("j"))))))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))));
	 	}
	
		private void add_subclass_194() {
	 		addSubClass(MainFlow.classes.RendererClass.LayerClass.ControlEventClass);
	 	}
		private void add_subclass_195() {
	 		addSubClass(MainFlow.classes.RendererClass.LayerClass.AdditionClass);
	 	}
		private void add_subclass_196() {
	 		addSubClass(MainFlow.classes.RendererClass.LayerClass.RemovalClass);
	 	}
}
	public final Animator AnimatorClass = new Animator();
	public class Animator extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Animator"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Thread")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Animator").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_804(); 
	   /* Methods */
		add_method_460();
		add_method_461();
		add_method_462(); 
	   /* Classes */
	}
		private void add_variable_804() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("animationTicks")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
	
		private void add_method_460() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("run")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("isRunning")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Optr*/new ExternalStatement("<", /*Optr*/new ExternalStatement("&&", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("isRunning")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animationTicks")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1 ")))),
			/*Body*/new ExternalStatement.Body(
					/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("wait")),new ExternalStatement.Parameters()))))),
/*BODY*/				
					/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("InterruptedException")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("-=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animationTicks")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(animateLayersBody)))))))));
	 	}
		private void add_method_461() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animationTicks")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("notifyAll")),new ExternalStatement.Parameters()))))))));
	 	}
		private void add_method_462() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("end")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("<", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animationTicks")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"synchronized ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animationTicks")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("notifyAll")),new ExternalStatement.Parameters()))))))))));
	 	}
	
}

	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("Renderer"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Renderer").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_764();
		add_variable_765();
		add_variable_766();
		add_variable_767();
		add_variable_768();
		add_variable_769();
		add_variable_770();
		add_variable_771();
		add_variable_772();
		add_variable_773();
		add_variable_774();
		add_variable_775();
		add_variable_776();
		add_variable_777();
		add_variable_778();
		add_variable_779();
		add_variable_780(); 
	   /* Methods */
		add_method_442();
		add_method_443();
		add_method_444();
		add_method_445();
		add_method_446();
		add_method_447();
		add_method_448();
		add_method_449(); 
	   /* Classes */
		add_subclass_197();
		add_subclass_198();
	}
		private void add_variable_764() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Animator"))))),"", /*Name*/new ExternalStatement(new StringEntry("animator")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_765() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("viewX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_766() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("viewY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_767() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("viewZ")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_768() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("aspectRatio")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_769() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("viewportX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_770() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("viewportY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_771() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("viewportWidth")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_772() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("viewportHeight")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_773() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Long"))),"", /*Name*/new ExternalStatement(new StringEntry("ticksPerSecond")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0L"))))));
	 	}
		private void add_variable_774() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Long"))),"", /*Name*/new ExternalStatement(new StringEntry("animationInterval")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("180L"))))));
	 	}
		private void add_variable_775() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Long"))),"", /*Name*/new ExternalStatement(new StringEntry("previousAnimationTime")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0L"))))));
	 	}
		private void add_variable_776() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Long"))),"", /*Name*/new ExternalStatement(new StringEntry("lastFrameTime")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0L"))))));
	 	}
		private void add_variable_777() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))),"", /*Name*/new ExternalStatement(new StringEntry("secondsSinceLastFrame")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0"))))));
	 	}
		private void add_variable_778() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))),"", /*Name*/new ExternalStatement(new StringEntry("avgSecsPerFrame")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.01"))))));
	 	}
		private void add_variable_779() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("frameCount")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_780() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),"", /*Name*/new ExternalStatement(new StringEntry("baseLayer")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),new ExternalStatement.Parameters()))));
	 	}
	
		private void add_method_442() {
	 		addMethod(new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),"", /*Name*/new ExternalStatement(new StringEntry("layer")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))))))))))));
	 	}
		private void add_method_443() {
	 		addMethod(new ExternalMethodEntry(0, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("image"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),"", /*Name*/new ExternalStatement(new StringEntry("layer")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("drawable")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Name*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image")))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))))))));
	 	}
		private void add_method_444() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glClear"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("|", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_COLOR_BUFFER_BIT")))), /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_DEPTH_BUFFER_BIT"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glMatrixMode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_MODELVIEW"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glLoadIdentity"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GLU")))), /*Enty*/new ExternalStatement(new StringEntry("gluLookAt"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTranslatef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-0.7521f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewX")))),/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-0.565f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewY")))),/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1.107f ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewZ"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glScalef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1.504f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1.12875f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement(">", /*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("currentTimeMillis"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("previousAnimationTime")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animationInterval")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("previousAnimationTime")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("currentTimeMillis"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animator"))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnableClientState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_VERTEX_ARRAY"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnableClientState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TEXTURE_COORD_ARRAY"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glFrontFace"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_CW"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glPushMatrix"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(renderLayersBody)))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glPopMatrix"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glDisableClientState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_VERTEX_ARRAY"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glDisableClientState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TEXTURE_COORD_ARRAY"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("frameCount")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement(">", /*Optr*/new ExternalStatement("-", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Sys")))), /*Enty*/new ExternalStatement(new StringEntry("getTime"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("lastFrameTime")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ticksPerSecond")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("frameCount")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))))))));
	 	}
		private void add_method_445() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DisplayMode"))),"", /*Name*/new ExternalStatement(new StringEntry("displayMode")))}), "", /*Body*/new ExternalStatement.Body(
	/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("ticksPerSecond")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Sys")))), /*Enty*/new ExternalStatement(new StringEntry("getTimerResolution"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("aspectRatio")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("aspectRatio")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(float)displayMode.getWidth() / (float)displayMode.getHeight()")))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("viewportHeight")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("viewportWidth")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int) (displayMode.getHeight() * aspectRatio)")))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement(">", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewportWidth")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("viewportWidth")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("viewportHeight")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int) (displayMode.getWidth() / aspectRatio )")))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("viewportX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int) ((displayMode.getWidth()-viewportWidth) / 2)")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("viewportY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(int) ((displayMode.getHeight()-viewportHeight) / 2)")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_DEPTH_TEST"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glDepthFunc"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_LEQUAL"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glClearColor"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_NORMALIZE"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_CULL_FACE"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TEXTURE_2D"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_BLEND"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glBlendFunc"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_SRC_ALPHA")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_ONE_MINUS_SRC_ALPHA"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_ALPHA_TEST"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glAlphaFunc"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_GREATER")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glLightModeli"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL12")))), /*Enty*/new ExternalStatement(new StringEntry("GL_LIGHT_MODEL_COLOR_CONTROL")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL12")))), /*Enty*/new ExternalStatement(new StringEntry("GL_SEPARATE_SPECULAR_COLOR"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glViewport"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewportX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewportY")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewportWidth")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewportHeight"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setPerspective")),new ExternalStatement.Parameters()))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glMatrixMode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_MODELVIEW"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glLoadIdentity"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("updateTimer")),new ExternalStatement.Parameters()))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("update"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("animator")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Animator"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animator"))), /*Enty*/new ExternalStatement(new StringEntry("start"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(loadLayersBody)))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("Exception")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("err"))), /*Enty*/new ExternalStatement(new StringEntry("println"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("Renderer Load Failed".toString()))))))))))))));
	 	}
		private void add_method_446() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("end")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Keyboard")))), /*Enty*/new ExternalStatement(new StringEntry("destroy"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("destroy"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("animator"))), /*Enty*/new ExternalStatement(new StringEntry("end"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("baseLayer"))), /*Enty*/new ExternalStatement(new StringEntry("end"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_447() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setPerspective")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glMatrixMode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_PROJECTION"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glLoadIdentity"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GLU")))), /*Enty*/new ExternalStatement(new StringEntry("gluPerspective"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("40f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("aspectRatio")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1000f"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glMatrixMode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_MODELVIEW"))))))))))));
	 	}
		private void add_method_448() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("updateTimer")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))),"", /*Name*/new ExternalStatement(new StringEntry("numToAvg")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("50.0")))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("secondsSinceLastFrame")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement("(double)(Sys.getTime() - lastFrameTime) / (double)ticksPerSecond"))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("lastFrameTime")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Sys")))), /*Enty*/new ExternalStatement(new StringEntry("getTime"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
	/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("<", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("secondsSinceLastFrame")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1 ")))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("avgSecsPerFrame")), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("avgSecsPerFrame")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("numToAvg")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("secondsSinceLastFrame")))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("/=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("avgSecsPerFrame")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("numToAvg")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1.0"))))))))));
	 	}
		private void add_method_449() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("moveView")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("moveX"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("moveY")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewX")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("moveX"))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("viewY")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("moveY"))))))));
	 	}
	
		private void add_subclass_197() {
	 		addSubClass(MainFlow.classes.RendererClass.LayerClass);
	 	}
		private void add_subclass_198() {
	 		addSubClass(MainFlow.classes.RendererClass.AnimatorClass);
	 	}
}