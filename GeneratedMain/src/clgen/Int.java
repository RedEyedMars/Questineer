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
public class Int extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
			new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
			}
		}, 
			new Entry(){
				public void get(StringBuilder __BUILDER__){
				}}, 
			new StringEntry("Int"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Int").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_311(); 
	   /* Methods */
		add_method_206();
		add_method_207(); 
	   /* Classes */
	}
		private void add_variable_311() {
	 		addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
	
		private void add_method_206() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setValue")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("newValue")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("value")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newValue")))))))));
	 	}
		private void add_method_207() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("increase")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("amount")))}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("+=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("value")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("amount"))))))));
	 	}
	
}