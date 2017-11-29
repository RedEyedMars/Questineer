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
public class Gui extends ExternalClassEntry {

	
public void setup()  {
	MainFlow.classes.GuiClass.DrawableClass.setup();
}
	
public void importAny(final IToken import_any)  {
	for(final IToken import_colours:import_any.getAllSafely("IMPORT_COLOUR")) {
			for(final IToken element:import_colours.getAllSafely("colour_declaration")) {
				MainFlow.classes.GuiClass.ColourClass.declaration(element);
			}
	}
	for(final IToken import_animation_types:import_any.getAllSafely("IMPORT_ANIMATION_TYPE")) {
			for(final IToken element:import_animation_types.getAllSafely("animation_type_declaration")) {
				MainFlow.classes.ImageLoaderClass.declaration(element,MainFlow.classes.GuiClass.ImageClass.AnimationTypeClass);
			}
	}
	for(final IToken import_images:import_any.getAllSafely("IMPORT_IMAGE")) {
			for(final IToken element:import_images.getAllSafely("image_declaration")) {
				MainFlow.classes.GuiClass.ImageClass.declaration(element);
			}
	}
	for(final IToken import_draws:import_any.getAllSafely("IMPORT_DRAWABLE")) {
			for(final IToken element:import_draws.getAllSafely("drawable_declaration")) {
				MainFlow.classes.GuiClass.DrawableClass.declaration(element);
			}
			for(final IToken element:import_draws.getAllSafely("multiple_drawable_declaration")) {
				MainFlow.classes.GuiClass.DrawableClass.multipleDeclaration(element);
			}
	}
	for(final IToken import_layers:import_any.getAllSafely("IMPORT_LAYER")) {
			for(final IToken element:import_layers.getAllSafely("layer_declaration")) {
				MainFlow.classes.RendererClass.addLayer(element.get("layerName").toString());
			}
	}
}


	public final Renderable RenderableClass = new Renderable();
	public class Renderable extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Renderable"), "interface ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static interface ");
			new StringEntry("Renderable").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */ 
	   /* Methods */
		add_method_525();
		add_method_526();
		add_method_527(); 
	   /* Classes */
	}
	
		private void add_method_525() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_526() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_527() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
}
	public final Statable StatableClass = new Statable();
	public class Statable extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Statable"), "interface ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static interface ");
			new StringEntry("Statable").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */ 
	   /* Methods */
		add_method_528();
		add_method_529(); 
	   /* Classes */
	}
	
		private void add_method_528() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_529() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
}
	public final Image ImageClass = new Image();
	public class Image extends ExternalClassEntry {
		protected final Map<String,Set<String>> declaredTextureBuffers = new HashMap<String,Set<String>>();
		protected final Map<String,Set<String>> animationStateFirstSet = new HashMap<String,Set<String>>();
		protected final Set<String> animationStatesByImage = new HashSet<String>();
		protected final Set<String> animationStates = new HashSet<String>();
		protected final Map<String,ExternalStatement.Body> animationStateAscendBodies = new HashMap<String,ExternalStatement.Body>();
		protected final Map<String,ExternalStatement.Body> animationStateChangeSwitches = new HashMap<String,ExternalStatement.Body>();
		protected final Map<String,Map<String,ExternalStatement.Body>> animationStateChangeBodies = new HashMap<String,Map<String,ExternalStatement.Body>>();
		protected final Map<String,Map<String,ExternalStatement>> firstOrDefaultFlipMethods = new HashMap<String,Map<String,ExternalStatement>>();
		protected final Map<String,Map<String,ExternalStatement>> firstOrDefaultStateVariables = new HashMap<String,Map<String,ExternalStatement>>();

	
	public void declaration(final IToken input)  {
		try  {
			final String imageName = input.get("imageName").toString();
			final String imageClassName = FlowController.camelize(input.get("imageName").toString());
			final String imageFileName = "../Resource/gui/images/" + input.get("image_file_name").toString() + "." + input.get("image_type").toString();
			final BufferedImage bimg = ImageIO.read(new File(imageFileName));
			final Integer pWidth = bimg.getWidth();
			final Integer pHeight = bimg.getHeight();
MainFlow.classes.ImagesClass.addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString())))))),"", /*Enty*/new ExternalStatement(new StringEntry(imageName.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString())))))),new ExternalStatement.Parameters()))));
MainFlow.classes.ImagesClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(imageClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Statable"))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(imageClassName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */ 
	   /* Classes */
	}
	
	
});
			MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("imageFileName")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(imageFileName.toString())))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("pixels")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Dimensions"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(pWidth.toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(pHeight.toString()))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("frames")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Dimensions"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(input.get("frameWidth").toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(input.get("frameHeight").toString())))))))))));
			if (declaredTextureBuffers.containsKey(input.get("frameWidth").toString()) == false || declaredTextureBuffers.get(input.get("frameWidth").toString()).contains(input.get("frameHeight").toString()) == false) {
				declareTextureBuffer(input.get("frameWidth").toString(),input.get("frameHeight").toString());
			}
			final String textureBufferMethodLoaderClassName = "TextureBuffer" + input.get("frameWidth").toString() + "x" + input.get("frameHeight").toString() + "Loader";
			MainFlow.classes.ImageLoaderClass.getSubClass(textureBufferMethodLoaderClassName.toString()).getMethod("run").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))))))), /*Enty*/new ExternalStatement(new StringEntry("setTextureBuffer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("textureBuffer")))))))))));
			final String imageLoaderClassName = "ImageData" + pWidth.toString() + "x" + pHeight.toString() + "Loader";
			MainFlow.classes.ImageLoaderClass.declareImageLoader(imageName,imageFileName,pWidth,pHeight);
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("States"), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("States").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_534(); 
	   /* Classes */
	}
	
		private void add_method_534() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("changeState")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates"))),"", /*Name*/new ExternalStatement(new StringEntry("newState")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
});
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),new ExternalStatement.Parameters()))))));
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),new ExternalStatement.Parameters()))))))))));
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setCurrent"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("current"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("state"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setParentState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parentState"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))))))));
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Images")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(imageClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setCurrent"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("current"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("state"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))), /*Enty*/new ExternalStatement(new StringEntry("setParentState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parentState"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))))))))))));
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asDrawable")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))));
			Boolean isFirst = true;
			if (input.get("animation_state") == null) {
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("defaultState")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Images"))), /*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))))));
				MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setCurrent")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("defaultState"))))))))));
			}
			animationStateFirstSet.put(imageClassName,new HashSet<String>());
			animationStateChangeBodies.put(imageClassName,new HashMap<String,ExternalStatement.Body>());
			firstOrDefaultFlipMethods.put(imageClassName,new HashMap<String,ExternalStatement>());
			firstOrDefaultStateVariables.put(imageClassName,new HashMap<String,ExternalStatement>());
			firstOrDefaultFlipMethods.get(imageClassName).put("",new ExternalStatement());
			firstOrDefaultStateVariables.get(imageClassName).put("",new ExternalStatement());
			final ExternalStatement.Body stateAscendBody = new ExternalStatement.Body();
			animationStateAscendBodies.put(imageClassName,stateAscendBody);
			final ExternalStatement.Body stateSwitchBody = new ExternalStatement.Body();
			animationStateChangeSwitches.put(imageClassName,stateSwitchBody);
			final ExternalStatement.Body defaultStateBody = new ExternalStatement.Body();
			animationStateChangeBodies.get(imageClassName).put("",defaultStateBody);
			MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").getMethod("changeState").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement(".", /*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState")))), /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates"))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("ASCEND")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState")))),
			/*InCl*/new ExternalStatement(stateAscendBody)),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("parentState")))),
			/*InCl*/new ExternalStatement(stateSwitchBody))));
			animationStateChangeSwitches.get(imageClassName).add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("DEFAULT")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState")))),
			/*InCl*/new ExternalStatement(defaultStateBody)),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))).setBraces("",":")));
			for(final IToken atom:input.getAllSafely("animation_state")) {
					getAnimationStateDeclaration(atom,imageName,imageClassName,"");
			}
		}
		catch (IOException   e0) {
			e0.printStackTrace();
		}
	}
	
	public void getAnimationStateDeclaration(final IToken declaration,final String imageName,final String imageClassName,final String parentStateName)  {
		for(IToken.Key __atom__KEY:declaration.keySet()) {
			if(__atom__KEY.getName().equals("parentState")){ final IToken atom = declaration.get(__atom__KEY);
				final String currentStateName;
				if (parentStateName.equals("")) {
				currentStateName = atom.get("animationId").toString();
				}
				else  {
				currentStateName = atom.get("animationId").toString() + "_" + parentStateName;
				}
				final ExternalStatement.Body currentSwitchBody = new ExternalStatement.Body();
				animationStateChangeBodies.get(imageClassName).put(currentStateName,currentSwitchBody);
				animationStateChangeSwitches.get(imageClassName).add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"switch ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newState")))),
			/*InCl*/new ExternalStatement(currentSwitchBody)),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))).setBraces("",":")));
				final ExternalStatement firstOrDefaultVariable = new ExternalStatement();
				firstOrDefaultStateVariables.get(imageClassName).put(currentStateName,firstOrDefaultVariable);
				final ExternalStatement firstOrDefaultMethod = new ExternalStatement();
				firstOrDefaultFlipMethods.get(imageClassName).put(currentStateName,firstOrDefaultMethod);
				declareFlipMethod(animationStatesByImage.add(imageClassName),imageClassName,atom.get("animationId").toString(),currentStateName,parentStateName,firstOrDefaultStateVariables.get(imageClassName).get(currentStateName));
				for(final IToken quark:atom.getAllSafely("animation_state")) {
					getAnimationStateDeclaration(quark,imageName,imageClassName,currentStateName);
				}
				if (animationStates.add(currentStateName)) {
MainFlow.classes.ImageStatesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString()))));
				}
				if (animationStates.add(atom.get("animationId").toString())) {
MainFlow.classes.ImageStatesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(atom.get("animationId").toString()))));
				}
			}
			if(__atom__KEY.getName().equals("finalState")){ final IToken atom = declaration.get(__atom__KEY);
				Boolean isFirst = animationStatesByImage.add(imageClassName);
				List<ExternalStatement.Parameters> arguments = new ArrayList<ExternalStatement.Parameters>();
				arguments.add(new ExternalStatement.Parameters());
				final ExternalStatement.Parameters multipleArguments = new ExternalStatement.Parameters();
				final ExternalStatement.Parameters xArgumentLayer = new ExternalStatement.Parameters();
				final List<ExternalStatement.Parameters> yArgumentLayers = new ArrayList<ExternalStatement.Parameters>();
				Integer yArgumentLayerSize = 0;
				Integer valueIndex = 0;
				for(final IToken element:atom.getAllSafely("animation_variable_value")) {
					for(final IToken value:element.getAllSafely("range")) {
						final List<ExternalStatement.Parameters> oldArguments = arguments;
						arguments = new ArrayList<ExternalStatement.Parameters>();
						final Integer lowerBound = Integer.parseInt(value.get("lowerBound").toString());
						final Integer upperBound = Integer.parseInt(value.get("upperBound").toString());
						for (final ExternalStatement.Parameters args :  oldArguments) {
						if (valueIndex == 1 ) {
							yArgumentLayerSize = upperBound - lowerBound + 1;
						}
						for (Integer i = 0; i <=  upperBound - lowerBound; ++i) {
							final ExternalStatement.Parameters newArg = new ExternalStatement.Parameters();
							newArg.addAll(args);
							final Integer index = i+lowerBound;
							newArg.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(index.toString())))));
							arguments.add(newArg);
							if (valueIndex == 0 ) {
								final ExternalStatement.Parameters yArgumentLayer = new ExternalStatement.Parameters();
								yArgumentLayers.add(yArgumentLayer);
								xArgumentLayer.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Gui.Renderable[]{")), /*InCl*/new ExternalStatement(yArgumentLayer))), /*Name*/new ExternalStatement(new StringEntry("}")))))));
							}
						}
						}
					}
					for(final IToken value:element.getAllSafely("INTEGER")) {
						for (final ExternalStatement.Parameters args :  arguments) {
						args.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(value.toString())))));
						}
						if (valueIndex == 0 ) {
						final ExternalStatement.Parameters yArgumentLayer = new ExternalStatement.Parameters();
						yArgumentLayers.add(yArgumentLayer);
						xArgumentLayer.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Gui.Renderable[]{")), /*InCl*/new ExternalStatement(yArgumentLayer))), /*Name*/new ExternalStatement(new StringEntry("}")))))));
						}
						else if (valueIndex == 1 ) {
						yArgumentLayerSize = 1 ;
						}
					}
					for(final IToken value:element.getAllSafely("FLOAT")) {
						for (final ExternalStatement.Parameters args :  arguments) {
						args.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(value.toString())))));
						}
					}
					for(final IToken value:element.getAllSafely("quote")) {
						for (final ExternalStatement.Parameters args :  arguments) {
						args.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(value.toString().toString())))));
						}
					}
					valueIndex += 1;
				}
				multipleArguments.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Gui.Renderable[][]{")), /*InCl*/new ExternalStatement(xArgumentLayer))), /*Name*/new ExternalStatement(new StringEntry("}")))))));
				final String creationMethod = "create" + atom.get("animationTypeName").toString();
				final String currentStateName;
				if (parentStateName.equals("")) {
				currentStateName = atom.get("animationId").toString();
				}
				else  {
				currentStateName = parentStateName + "_" + atom.get("animationId").toString();
				}
				if (arguments.size() == 1) {
				if (animationStates.add(atom.get("animationId").toString())) {
MainFlow.classes.ImageStatesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(atom.get("animationId").toString()))));
				}
				if (animationStates.add(currentStateName)) {
MainFlow.classes.ImageStatesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString()))));
				}
				}
				else  {
				for (Integer i = 0; i <  arguments.size(); ++i) {
					if (animationStates.add(atom.get("animationId").toString() + "_" + i)) {
MainFlow.classes.ImageStatesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(atom.get("animationId").toString())), /*Name*/new ExternalStatement(new StringEntry("_")))), /*Enty*/new ExternalStatement(new StringEntry(i.toString()))))));
					}
					if (animationStates.add(currentStateName + "_" + i)) {
MainFlow.classes.ImageStatesClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("_")))), /*Enty*/new ExternalStatement(new StringEntry(i.toString()))))));
					}
				}
				}
				if (arguments.size() == 1) {
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State")))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Images"))), /*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))), /*Enty*/new ExternalStatement(new StringEntry(creationMethod.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(arguments.get(0))))))))));
				if (animationStateFirstSet.get(imageClassName).add(parentStateName)) {
					firstOrDefaultFlipMethods.get(imageClassName).get(parentStateName).add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())),new ExternalStatement.Parameters())))));
					firstOrDefaultStateVariables.get(imageClassName).get(parentStateName).add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State")))))));
				}
				declareFlipMethod(isFirst,imageClassName,atom.get("animationId").toString(),currentStateName,parentStateName,/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State")))))));
				}
				else  {
				Integer realIndex = 0;
				for (final ExternalStatement.Parameters args :  arguments) {
					final Integer indexValue = realIndex;
					if (animationStateFirstSet.get(imageClassName).add(parentStateName)) {
						firstOrDefaultFlipMethods.get(imageClassName).get(parentStateName).add(/*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("_")))), /*Enty*/new ExternalStatement(new StringEntry(realIndex.toString())))),new ExternalStatement.Parameters())))));
						firstOrDefaultStateVariables.get(imageClassName).get(parentStateName).add(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State_")))))), /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(indexValue.toString())))));
					}
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State_")))), /*Enty*/new ExternalStatement(new StringEntry(indexValue.toString())))), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Images"))), /*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))), /*Enty*/new ExternalStatement(new StringEntry(creationMethod.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(args)))))))));
					yArgumentLayers.get(realIndex / yArgumentLayerSize).add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State_")))), /*Enty*/new ExternalStatement(new StringEntry(indexValue.toString())))))));
					declareFlipMethod(isFirst,imageClassName,atom.get("animationId").toString() + "_" + realIndex,currentStateName + "_" + realIndex,parentStateName,/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Name*/new ExternalStatement(new StringEntry("State_")))), /*Enty*/new ExternalStatement(new StringEntry(indexValue.toString())))))));
					realIndex += 1;
					isFirst = false;
				}
				}
				isFirst = false;
			}
		}
	}
	
	public void declareFlipMethod(final Boolean isFirst,final String imageClassName,final String singleStateName,final String currentStateName,final String parentStateName,final ExternalStatement currentStateVariable)  {
		final ExternalStatement firstOrDefaultMethod = firstOrDefaultFlipMethods.get(imageClassName).get(currentStateName);
		if (parentStateName.equals("")) {
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setCurrent")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentStateVariable))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("state")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("parentState")), /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates"))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("DEFAULT")))))))));
			animationStateAscendBodies.get(imageClassName).add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(firstOrDefaultMethod)))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))).setBraces("",":")));
		}
		else  {
MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setCurrent")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(currentStateVariable))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("state")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("parentState")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(parentStateName.toString())))))))))))));
			animationStateAscendBodies.get(imageClassName).add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(parentStateName.toString())),new ExternalStatement.Parameters()))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))).setBraces("",":")));
		}
		if (isFirst) {
			MainFlow.classes.ImagesClass.getSubClass(imageClassName.toString()).getSubClass("StatesClass").getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())),new ExternalStatement.Parameters())))));
		}
		animationStateChangeBodies.get(imageClassName).get(parentStateName).add(/*InCl*/new ExternalStatement(
		/*Case*/new ExternalStatement.Conditional(
			"case ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(singleStateName.toString())))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(currentStateName.toString())),new ExternalStatement.Parameters()))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry(""))))).setBraces("",":")));
	}
	
	public void declareTextureBuffer(final String frameWidth,final String frameHeight)  {
		final Float width = Float.parseFloat(frameWidth);
		final Float height = Float.parseFloat(frameHeight);
		final Integer widthI = Integer.parseInt(frameWidth);
		final Integer heightI = Integer.parseInt(frameHeight);
		final Float xFactor = 0.00f / width;
		final Float yFactor = 0.00f / height;
		final String textureBufferMethodLoaderClassName = "TextureBuffer" + frameWidth.toString() + "x" + frameHeight.toString() + "Loader";
		final String textureBufferMethodLoaderName = "loadTextureBuffer" + frameWidth.toString() + "x" + frameHeight.toString()+"Loader";
		final String textureBufferName = "textureBuffer" + frameWidth.toString() + "x" + frameHeight.toString();
		if (declaredTextureBuffers.isEmpty()) {
MainFlow.classes.ImageLoaderClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatBufferArray().toString())))))))),"", /*Name*/new ExternalStatement(new StringEntry("textureBuffers")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Map"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer")),/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatBufferArray().toString())))))))),new ExternalStatement.Parameters()))));
		}
		MainFlow.classes.ImageLoaderClass.getMethod("load").prependToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(textureBufferMethodLoaderName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("start"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
		MainFlow.classes.ImageLoaderClass.getMethod("load").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(textureBufferMethodLoaderName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("join"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("InterruptedException")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()")))))));
MainFlow.classes.ImageLoaderClass.addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Thread"))),"", /*Enty*/new ExternalStatement(new StringEntry(textureBufferMethodLoaderName.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageLoader")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(textureBufferMethodLoaderClassName.toString())))))),new ExternalStatement.Parameters()))));
MainFlow.classes.ImageLoaderClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(textureBufferMethodLoaderClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Thread")), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(textureBufferMethodLoaderClassName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_542(); 
	   /* Classes */
	}
	
		private void add_method_542() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("run")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatBufferArray().toString())))),"", /*Name*/new ExternalStatement(new StringEntry("textureBuffer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new FloatBuffer[")), /*Enty*/new ExternalStatement(new StringEntry(frameWidth.toString())))), /*Name*/new ExternalStatement(new StringEntry("][")))), /*Enty*/new ExternalStatement(new StringEntry(frameHeight.toString())))), /*Name*/new ExternalStatement(new StringEntry("]")))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ByteBuffer"))),"", /*Name*/new ExternalStatement(new StringEntry("byteBuffer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))))));
	 	}
	
});
		for (Integer x = 0; x <  widthI; ++x) {
			for (Integer y = 0; y <  heightI; ++y) {
				final String currentTextureBuffer = "textureBuffer[" + x.toString() + "][" + y.toString() + "]";
				final StringBuilder floatArrayValues = new StringBuilder();
				floatArrayValues.append("new float[]{");
				floatArrayValues.append(x / width + xFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(y / height + 1 / height - yFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(x / width + xFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(y / height + yFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(x / width + 1 / width - xFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(y / height + 1 / height - yFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(x / width + 1 / width - xFactor);
				floatArrayValues.append("f,");
				floatArrayValues.append(y / height + yFactor);
				floatArrayValues.append("f}");
				MainFlow.classes.ImageLoaderClass.getSubClass(textureBufferMethodLoaderClassName.toString()).getMethod("run").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("byteBuffer")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ByteBuffer")))), /*Enty*/new ExternalStatement(new StringEntry("allocateDirect"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("*", /*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("4")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("4")))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("byteBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("order"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ByteOrder")))), /*Enty*/new ExternalStatement(new StringEntry("nativeOrder"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Enty*/new ExternalStatement(new StringEntry(currentTextureBuffer.toString())), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("byteBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("asFloatBuffer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(currentTextureBuffer.toString()))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(floatArrayValues.toString()))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(currentTextureBuffer.toString()))), /*Enty*/new ExternalStatement(new StringEntry("position"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))))))));
			}
		}
		if (declaredTextureBuffers.containsKey(frameWidth) == false) {
			declaredTextureBuffers.put(frameWidth,new HashSet<String>());
		}
		declaredTextureBuffers.get(frameWidth).add(frameHeight);
	}


	public final Dimensions DimensionsClass = new Dimensions();
	public class Dimensions extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Dimensions"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Dimensions").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_966();
		add_variable_967(); 
	   /* Methods */ 
	   /* Classes */
	}
		private void add_variable_966() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("width")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
	 	}
		private void add_variable_967() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("height")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
	 	}
	
	
}
	public final Crop CropClass = new Crop();
	public class Crop extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Crop"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Crop").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_968();
		add_variable_969(); 
	   /* Methods */
		add_method_543();
		add_method_544();
		add_method_545();
		add_method_546();
		add_method_547(); 
	   /* Classes */
	}
		private void add_variable_968() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("frameX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_969() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("frameY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
	
		private void add_method_543() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_544() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTexCoordPointer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("textureBuffer[frameX][frameY]"))))))))))));
	 	}
		private void add_method_545() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setFrameX")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("newX")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("frameX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newX")))))))));
	 	}
		private void add_method_546() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setFrameY")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("newY")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("frameY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newY")))))))));
	 	}
		private void add_method_547() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getImageTexture")),new ExternalStatement.Parameters()))))));
	 	}
	
}
	public final States StatesClass = new States();
	public class States extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("States"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable")),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Statable"))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("States").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_972();
		add_variable_973();
		add_variable_974(); 
	   /* Methods */
		add_method_548();
		add_method_549();
		add_method_550();
		add_method_551();
		add_method_552();
		add_method_553(); 
	   /* Classes */
	}
		private void add_variable_972() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("current")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_973() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates"))),"", /*Name*/new ExternalStatement(new StringEntry("state")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates")))), /*Enty*/new ExternalStatement(new StringEntry("DEFAULT"))))));
	 	}
		private void add_variable_974() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates"))),"", /*Name*/new ExternalStatement(new StringEntry("parentState")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates")))), /*Enty*/new ExternalStatement(new StringEntry("DEFAULT"))))));
	 	}
	
		private void add_method_548() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("current"))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_549() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("current"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_550() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("current"))), /*Enty*/new ExternalStatement(new StringEntry("getTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_551() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("changeState")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageStates"))),"", /*Name*/new ExternalStatement(new StringEntry("newState")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_552() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))));
	 	}
		private void add_method_553() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Exac*/new ExternalStatement(new StringEntry("asStates")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("drawable")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("drawable"))), /*Enty*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))));
	 	}
	
}
	public final AnimationType AnimationTypeClass = new AnimationType();
	public class AnimationType extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("AnimationType"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("AnimationType").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_977();
		add_variable_978(); 
	   /* Methods */
		add_method_554();
		add_method_555();
		add_method_556();
		add_method_557();
		add_method_558();
		add_method_559();
		add_method_560(); 
	   /* Classes */
	}
		private void add_variable_977() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
		private void add_variable_978() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))));
	 	}
	
		private void add_method_554() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_555() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTexCoordPointer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("textureBuffer[x][y]"))))))))))));
	 	}
		private void add_method_556() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animationRender")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTexCoordPointer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("textureBuffer[x][y]"))))))))))));
	 	}
		private void add_method_557() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getImageTexture")),new ExternalStatement.Parameters()))))));
	 	}
		private void add_method_558() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setFrameX")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("newX")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("x")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newX")))))))));
	 	}
		private void add_method_559() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setFrameY")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("newY")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("y")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newY")))))))));
	 	}
		private void add_method_560() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("tick")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Double"))),"", /*Name*/new ExternalStatement(new StringEntry("millisSinceLastFrame")))}), "", /*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("animate")),new ExternalStatement.Parameters()))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setFrameX")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("x")))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("setFrameY")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("y")))))))))));
	 	}
	
}

	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Image"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Image").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_939();
		add_variable_940();
		add_variable_941();
		add_variable_942();
		add_variable_943(); 
	   /* Methods */
		add_method_530();
		add_method_531();
		add_method_532();
		add_method_533(); 
	   /* Classes */
		add_subclass_228();
		add_subclass_229();
		add_subclass_230();
		add_subclass_231();
	}
		private void add_variable_939() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("imageFileName")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_940() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Dimensions"))))),"", /*Name*/new ExternalStatement(new StringEntry("pixels")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_941() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Dimensions"))))),"", /*Name*/new ExternalStatement(new StringEntry("frames")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_942() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("texture")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
	 	}
		private void add_variable_943() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatBufferArray().toString())))),"", /*Name*/new ExternalStatement(new StringEntry("textureBuffer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_530() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getImageTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("texture"))))))));
	 	}
		private void add_method_531() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_532() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTexCoordPointer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("2")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("textureBuffer[0][0]"))))))))))));
	 	}
		private void add_method_533() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Crop"))))),"", /*Exac*/new ExternalStatement(new StringEntry("getCrop")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("frameX"))),
/*PARAMS*/				new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("frameY")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Crop"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("frameX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("frameY")))))))))));
	 	}
	
		private void add_subclass_228() {
	 		addSubClass(MainFlow.classes.GuiClass.ImageClass.DimensionsClass);
	 	}
		private void add_subclass_229() {
	 		addSubClass(MainFlow.classes.GuiClass.ImageClass.CropClass);
	 	}
		private void add_subclass_230() {
	 		addSubClass(MainFlow.classes.GuiClass.ImageClass.StatesClass);
	 	}
		private void add_subclass_231() {
	 		addSubClass(MainFlow.classes.GuiClass.ImageClass.AnimationTypeClass);
	 	}
}
	public final Colour ColourClass = new Colour();
	public class Colour extends ExternalClassEntry {

	
	public void declaration(final IToken input)  {
		final String colourName = FlowController.camelize(input.get("colourName").toString());
MainFlow.classes.ColoursClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(colourName), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Colour")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(colourName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */ 
	   /* Classes */
	}
	
	
});
		for(IToken.Key __element__KEY:input.keySet()) {
			if(__element__KEY.getName().equals("asInt")){ final IToken element = input.get(__element__KEY);
				final Integer redInt = Integer.parseInt(element.get("red").toString());
				final Integer greenInt = Integer.parseInt(element.get("green").toString());
				final Integer blueInt = Integer.parseInt(element.get("blue").toString());
				final Float redFloat = Float.parseFloat(element.get("red").toString()) / 256f;
				final Float greenFloat = Float.parseFloat(element.get("green").toString()) / 256f;
				final Float blueFloat = Float.parseFloat(element.get("blue").toString()) / 256f;
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatArrayType().toString())))),"", /*Exac*/new ExternalStatement(new StringEntry("asFloatArray")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Float[]{")), /*Enty*/new ExternalStatement(new StringEntry(redFloat.toString())))), /*Name*/new ExternalStatement(new StringEntry("f,")))), /*Enty*/new ExternalStatement(new StringEntry(greenFloat.toString())))), /*Name*/new ExternalStatement(new StringEntry("f,")))), /*Enty*/new ExternalStatement(new StringEntry(blueFloat.toString())))), /*Name*/new ExternalStatement(new StringEntry("f}"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_intArrayType().toString())))),"", /*Exac*/new ExternalStatement(new StringEntry("asIntArray")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Integer[]{")), /*Enty*/new ExternalStatement(new StringEntry(redInt.toString())))), /*Name*/new ExternalStatement(new StringEntry(",")))), /*Enty*/new ExternalStatement(new StringEntry(greenInt.toString())))), /*Name*/new ExternalStatement(new StringEntry(",")))), /*Enty*/new ExternalStatement(new StringEntry(blueInt.toString())))), /*Name*/new ExternalStatement(new StringEntry("}"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getRedI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(redInt.toString()))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getGreenI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(greenInt.toString()))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getBlueI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(blueInt.toString()))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getRedF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(redFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getGreenF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(greenFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getBlueF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(blueFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glDisable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TEXTURE_2D"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glDisable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_LIGHTING"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glColor3f"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(redFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(greenFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(blueFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glBegin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TRIANGLE_STRIPS"))))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("endRender")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnd"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TEXTURE_2D"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glEnable"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_LIGHTING"))))))))))));
			}
			if(__element__KEY.getName().equals("asFloat")){ final IToken element = input.get(__element__KEY);
				final Float redFloat = Float.parseFloat(element.get("red").toString());
				final Float greenFloat = Float.parseFloat(element.get("green").toString());
				final Float blueFloat = Float.parseFloat(element.get("blue").toString());
				final Float redIntValue = redFloat * 256f;
				final Float greenIntValue = greenFloat * 256f;
				final Float blueIntValue = blueFloat * 256f;
				final Integer redInt = redIntValue.intValue();
				final Integer greenInt = greenIntValue.intValue();
				final Integer blueInt = blueIntValue.intValue();
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatArrayType().toString())))),"", /*Exac*/new ExternalStatement(new StringEntry("asFloatArray")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Float[]{")), /*Enty*/new ExternalStatement(new StringEntry(redFloat.toString())))), /*Name*/new ExternalStatement(new StringEntry("f,")))), /*Enty*/new ExternalStatement(new StringEntry(greenFloat.toString())))), /*Name*/new ExternalStatement(new StringEntry("f,")))), /*Enty*/new ExternalStatement(new StringEntry(blueFloat.toString())))), /*Name*/new ExternalStatement(new StringEntry("f}"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_intArrayType().toString())))),"", /*Exac*/new ExternalStatement(new StringEntry("asIntArray")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("new Integer[]{")), /*Enty*/new ExternalStatement(new StringEntry(redInt.toString())))), /*Name*/new ExternalStatement(new StringEntry(",")))), /*Enty*/new ExternalStatement(new StringEntry(greenInt.toString())))), /*Name*/new ExternalStatement(new StringEntry(",")))), /*Enty*/new ExternalStatement(new StringEntry(blueInt.toString())))), /*Name*/new ExternalStatement(new StringEntry("}"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getRedI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(redInt.toString()))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getGreenI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(greenInt.toString()))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getBlueI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(blueInt.toString()))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getRedF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(redFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getGreenF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(greenFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))));
MainFlow.classes.ColoursClass.getSubClass(colourName.toString()).addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getBlueF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(blueFloat.toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))))))));
			}
		}
	}



	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Colour"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Colour").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */ 
	   /* Methods */
		add_method_561();
		add_method_562();
		add_method_563();
		add_method_564();
		add_method_565();
		add_method_566();
		add_method_567();
		add_method_568();
		add_method_569();
		add_method_570();
		add_method_571(); 
	   /* Classes */
	}
	
		private void add_method_561() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getRedF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_562() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getGreenF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_563() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Exac*/new ExternalStatement(new StringEntry("getBlueF")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_564() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getRedI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_565() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getGreenI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_566() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getBlueI")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_567() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_floatArrayType().toString())))),"", /*Exac*/new ExternalStatement(new StringEntry("asFloatArray")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_568() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_intArrayType().toString())))),"", /*Exac*/new ExternalStatement(new StringEntry("asIntegerArray")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_569() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))));
	 	}
		private void add_method_570() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_571() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("endRender")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
}
	public final Drawable DrawableClass = new Drawable();
	public class Drawable extends ExternalClassEntry {
		protected final Integer LEFT_SUPPLEMENTARY = 1;
		protected final Integer RIGHT_SUPPLEMENTARY = 2;
		protected final Integer NORMAL = 3;

	
	public void setup()  {
		MainFlow.classes.GuiClass.DrawableClass.getMethod("setVisualX").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newVisualX")))))))))))))));
		MainFlow.classes.GuiClass.DrawableClass.getMethod("setVisualY").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newVisualY")))))))))))))));
		MainFlow.classes.GuiClass.DrawableClass.getMethod("setVisualWidth").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newVisualWidth")))))))))))))));
		MainFlow.classes.GuiClass.DrawableClass.getMethod("setVisualHeight").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newVisualHeight")))))))))))))));
		MainFlow.classes.GuiClass.DrawableClass.getMethod("setAngle").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setAngle"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newAngle")))))))))))))));
		MainFlow.classes.GuiClass.DrawableClass.getMethod("setAngle").prependToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("visualAngle")), /*Optr*/new ExternalStatement("/", /*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("(float)(newAngle")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("180.0 ")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math.PI)"))))))));
	}
	
	public void declaration(final IToken input)  {
		final String drawableName = input.get("drawableName").toString();
		final String drawableClassName = FlowController.camelize(input.get("drawableName").toString());
MainFlow.classes.DrawablesClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(drawableClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(drawableClassName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_599();
		add_method_600();
		add_method_601(); 
	   /* Classes */
	}
	
		private void add_method_599() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_600() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString())))))),"", /*Name*/new ExternalStatement(new StringEntry("image")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("image")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString())))))),"", /*Name*/new ExternalStatement(new StringEntry("newImage")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newImage"))), /*Enty*/new ExternalStatement(new StringEntry("setVertexBuffer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertexBuffer"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newImage"))))))));
	 	}
		private void add_method_601() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString())))))),"", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Colour"))))),"", /*Name*/new ExternalStatement(new StringEntry("colour")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString())))))),"", /*Name*/new ExternalStatement(new StringEntry("newColour")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Colour"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColour"))), /*Enty*/new ExternalStatement(new StringEntry("setVertexBuffer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertexBuffer"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("newColour"))))))));
	 	}
	
});
MainFlow.classes.DrawablesClass.addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString())))))),"", /*Enty*/new ExternalStatement(new StringEntry(drawableName.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString())))))),new ExternalStatement.Parameters()))));
		MainFlow.classes.ImageLoaderClass.getMethod("load").prependToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Drawables"))), /*Enty*/new ExternalStatement(new StringEntry(drawableName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
		final StringBuilder vertexArray = new StringBuilder();
		Float gridWidth = -1f;
		Float gridHeight = -1f;
		Boolean buildingWidth = true;
		for(final IToken element:input.getAllSafely("drawable_grid_element")) {
				if (element.get("endLine") != null) {
				gridHeight += 1f;
				buildingWidth = false;
				}
				else if (buildingWidth) {
				gridWidth += 1f;
				}
		}
		Float gridX = 0f;
		Float gridY = 0f;
		Float gridAHeight = gridHeight - 1;
		Integer numberOfElements = 0;
		final Map<Integer,Float> gridXMap = new HashMap<Integer,Float>();
		final Map<Integer,Float> gridYMap = new HashMap<Integer,Float>();
		for(final IToken element:input.getAllSafely("drawable_grid_element")) {
				if (element.get("point") != null) {
				for(final IToken atom:element.getAllSafely("point")) {
						gridXMap.put(Integer.parseInt(atom.toString()),gridX / gridWidth);
						gridYMap.put(Integer.parseInt(atom.toString()),1f  - gridY / gridAHeight);
				}
				numberOfElements += 1;
				}
				if (element.get("endLine") != null) {
				gridY += 1f;
				gridX = 0f;
				}
				else  {
				gridX += 1f;
				}
		}
		vertexArray.append("float[] vertices = new float[]{");
		String comma = "";
		for (Integer i = 0; i <  numberOfElements; ++i) {
			vertexArray.append(comma);
			vertexArray.append(gridXMap.get(i + 1));
			vertexArray.append("f,");
			vertexArray.append(gridYMap.get(i + 1));
			vertexArray.append("f,0f");
			comma = ",";
		}
		vertexArray.append("}");
		final Integer sizeOfByteBuffer = numberOfElements * 4  * 3;
		MainFlow.classes.DrawablesClass.getSubClass(drawableClassName.toString()).getMethod("load").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(vertexArray.toString()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ByteBuffer"))),"", /*Name*/new ExternalStatement(new StringEntry("byteBuffer")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ByteBuffer")))), /*Enty*/new ExternalStatement(new StringEntry("allocateDirect"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sizeOfByteBuffer.toString())))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("byteBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("order"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ByteOrder")))), /*Enty*/new ExternalStatement(new StringEntry("nativeOrder"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("vertexBuffer")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("byteBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("asFloatBuffer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertexBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("clear"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertexBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("put"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertices"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertexBuffer"))), /*Enty*/new ExternalStatement(new StringEntry("position"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))))))))));
		final Integer numberOfElementsValue = numberOfElements;
MainFlow.classes.DrawablesClass.getSubClass(drawableClassName.toString()).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("Image"), "class ", /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString()))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Image").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_1008(); 
	   /* Methods */
		add_method_602();
		add_method_603();
		add_method_604(); 
	   /* Classes */
	}
		private void add_variable_1008() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("image")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_602() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glDrawArrays"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("GL_TRIANGLE_STRIP")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(numberOfElementsValue.toString()))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glPopMatrix"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_603() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image"))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_604() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image"))), /*Enty*/new ExternalStatement(new StringEntry("getTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
	
});
MainFlow.classes.DrawablesClass.getSubClass(drawableClassName.toString()).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("Colour"), "class ", /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(drawableClassName.toString()))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Colour").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_1009(); 
	   /* Methods */
		add_method_605();
		add_method_606(); 
	   /* Classes */
	}
		private void add_variable_1009() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Colour"))))),"", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_605() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_606() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour"))), /*Enty*/new ExternalStatement(new StringEntry("getTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
	
});
		MainFlow.classes.DrawablesClass.getSubClass(drawableClassName.toString()).getSubClass("ColourClass").getMethod("render").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colour"))), /*Enty*/new ExternalStatement(new StringEntry("endRender"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
	}
	
	public void multipleDeclaration(final IToken input)  {
		final String multipleName = input.get("multipleName").toString();
		final String multipleClassName = FlowController.camelize(multipleName.toString());
MainFlow.classes.DrawablesClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(multipleClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(multipleClassName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_607();
		add_method_608();
		add_method_609();
		add_method_610(); 
	   /* Classes */
	}
	
		private void add_method_607() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_608() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_609() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_610() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(multipleClassName.toString())))))),"", /*Name*/new ExternalStatement(new StringEntry("image")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("image")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
});
MainFlow.classes.DrawablesClass.addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(multipleClassName.toString())))))),"", /*Enty*/new ExternalStatement(new StringEntry(multipleName.toString())), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(multipleClassName.toString())))))),new ExternalStatement.Parameters()))));
MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("Image"), "class ", /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(multipleClassName.toString()))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Image").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_1012(); 
	   /* Methods */
		add_method_611();
		add_method_612();
		add_method_613(); 
	   /* Classes */
	}
		private void add_variable_1012() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("imageTexture")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
	 	}
	
		private void add_method_611() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_612() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_613() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("imageTexture"))))))));
	 	}
	
});
		Integer imageIndex = 1;
		final ExternalStatement.Parameters imageParameters = new ExternalStatement.Parameters();
		imageParameters.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image"))), /*Enty*/new ExternalStatement(new StringEntry("getTexture"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))));
		for(final IToken element:input.getAllSafely("drawable_multiple_element")) {
				final String imageName = "image" + imageIndex;
				final String drawableName = element.get("drawableName").toString();
				if (element.get("newStateName") != null) {
				MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getMethod("image").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("States"))))),"", /*Enty*/new ExternalStatement(new StringEntry(imageName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("((Gui.Statable)image).asStates()"))))))));
				for(final IToken atom:element.getAllSafely("newStateName")) {
						MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getMethod("image").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("changeState"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("Gui.Image.States.")), /*Enty*/new ExternalStatement(new StringEntry(atom.toString())))))))))))));
				}
				imageParameters.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Drawables"))), /*Enty*/new ExternalStatement(new StringEntry(drawableName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(imageName.toString())))))))));
				}
				else  {
				imageParameters.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Drawables"))), /*Enty*/new ExternalStatement(new StringEntry(drawableName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("image"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("image")))))))));
				}
				final String changeListenerClassName = FlowController.camelize(imageName.toString()) + "ChangeListener";
MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass").addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(changeListenerClassName), "class ", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener")))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(changeListenerClassName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_614();
		add_method_615();
		add_method_616();
		add_method_617();
		add_method_618(); 
	   /* Classes */
	}
	
		private void add_method_614() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualX")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newX")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_615() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualY")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newY")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_616() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualWidth")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newWidth")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_617() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualHeight")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newHeight")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_618() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setAngle")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newAngle")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
});
				addChangeListener(element.get("angle"),MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass"),imageName,NORMAL,"setAngle");
				addChangeListener(element.get("position"),MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass"),imageName,"setVisualX","setVisualY");
				addChangeListener(element.get("dimensions"),MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass"),imageName,"setVisualWidth","setVisualHeight");
				if (element.get("rotation") != null) {
				addChangeListener(element.get("rotation"),MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass"),imageName,"setVisualRotationPointX","setVisualRotationPointY");
				}
MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass").addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Enty*/new ExternalStatement(new StringEntry(imageName.toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
				MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass").getMethod("render").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
				MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass").getMethod("animate").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(imageName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("animate"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))));
				MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass").getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("add")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(multipleClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image")))), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(changeListenerClassName.toString())))))),new ExternalStatement.Parameters()))))))));
				imageIndex += 1;
		}
		MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getSubClass("ImageClass").getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualX"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualY"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setVisualHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))), /*Enty*/new ExternalStatement(new StringEntry("setAngle"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))))))))))))));
		MainFlow.classes.DrawablesClass.getSubClass(multipleClassName.toString()).getMethod("image").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawables")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(multipleClassName.toString()))))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Image"))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(imageParameters)))))))));
	}
	
	public ExternalStatement getMultipleValue(final IToken input,final Integer status)  {
		ExternalStatement result = null;
		if (input.get("DRAWABLE_ANGLE") != null) {
			if (status == LEFT_SUPPLEMENTARY) {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("cos"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getAngle")),new ExternalStatement.Parameters()))))));
			}
			else if (status == RIGHT_SUPPLEMENTARY) {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("Math"))), /*Enty*/new ExternalStatement(new StringEntry("sin"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getAngle")),new ExternalStatement.Parameters()))))));
			}
			else if (status == NORMAL) {
				return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getAngle")),new ExternalStatement.Parameters()));
			}
		}
		else if (input.get("DRAWABLE_X") != null) {
			return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getVisualX")),new ExternalStatement.Parameters()));
		}
		else if (input.get("DRAWABLE_Y") != null) {
			return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getVisualY")),new ExternalStatement.Parameters()));
		}
		else if (input.get("DRAWABLE_WIDTH") != null) {
			return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getVisualWidth")),new ExternalStatement.Parameters()));
		}
		else if (input.get("DRAWABLE_HEIGHT") != null) {
			return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getVisualHeight")),new ExternalStatement.Parameters()));
		}
		else if (input.get("FLOAT") != null) {
			return /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(input.get("FLOAT").toString())), /*Name*/new ExternalStatement(new StringEntry("f"))))));
		}
		else if (input.get("INTEGER") != null) {
			return /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(input.get("INTEGER").toString()))));
		}
		System.err.println("Drawable.getMultipleValue() could not parse:");
		input.print();
		return null;
	}
	
	public void addChangeListener(final IToken input,final ExternalClassEntry masterClass,final String drawableToChange,final String leftParameterSetMethod,final String rightParameterSetMethod)  {
		addChangeListener(input.get("leftParameter"),masterClass,drawableToChange,LEFT_SUPPLEMENTARY,leftParameterSetMethod);
		addChangeListener(input.get("rightParameter"),masterClass,drawableToChange,RIGHT_SUPPLEMENTARY,rightParameterSetMethod);
	}
	
	public void addChangeListener(final IToken input,final ExternalClassEntry masterClass,final String drawableToChange,final Integer status,final String setMethod)  {
		final String changeListenerClassName = FlowController.camelize(drawableToChange.toString()) + "ChangeListener";
		final ExternalStatement statement = new ExternalStatement();
		final Set<String> toChangeMethods = new HashSet<String>();
		for(IToken.Key __element__KEY:input.keySet()) {
			if(__element__KEY.getName().equals("drawable_multiple_value")){ final IToken element = input.get(__element__KEY);
				statement.add(getMultipleValue(element,status));
				if (element.get("DRAWABLE_WIDTH") != null) {
				toChangeMethods.add("setVisualWidth");
				}
				else if (element.get("DRAWABLE_HEIGHT") != null) {
				toChangeMethods.add("setVisualHeight");
				}
				else if (element.get("DRAWABLE_X") != null) {
				toChangeMethods.add("setVisualX");
				}
				else if (element.get("DRAWABLE_Y") != null) {
				toChangeMethods.add("setVisualY");
				}
				else if (element.get("DRAWABLE_ANGLE") != null) {
				toChangeMethods.add("setAngle");
				}
			}
			if(__element__KEY.getName().equals("drawable_arthmetic_operator")){ final IToken element = input.get(__element__KEY);
				statement.set(element.toString());
			}
		}
		for(final IToken element:input.getAllSafely("supplementary")) {
				for(IToken.Key __atom__KEY:element.keySet()) {
				if(__atom__KEY.getName().equals("drawable_multiple_value")){ final IToken atom = element.get(__atom__KEY);
					statement.add(getMultipleValue(atom,status));
					if (atom.get("DRAWABLE_WIDTH") != null) {
					toChangeMethods.add("setVisualWidth");
					}
					else if (atom.get("DRAWABLE_HEIGHT") != null) {
					toChangeMethods.add("setVisualHeight");
					}
					else if (atom.get("DRAWABLE_X") != null) {
					toChangeMethods.add("setVisualX");
					}
					else if (atom.get("DRAWABLE_Y") != null) {
					toChangeMethods.add("setVisualY");
					}
					else if (atom.get("DRAWABLE_ANGLE") != null) {
					toChangeMethods.add("setAngle");
					}
				}
				if(__atom__KEY.getName().equals("drawable_arthmetic_operator")){ final IToken atom = element.get(__atom__KEY);
					statement.set(atom.toString());
				}
				}
		}
		for (final String changeMethod :  toChangeMethods) {
			masterClass.getSubClass(changeListenerClassName.toString()).getMethod(changeMethod.toString()).appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(drawableToChange.toString()))), /*Enty*/new ExternalStatement(new StringEntry(setMethod.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Name*/new ExternalStatement(new StringEntry("(float)(")), /*InCl*/new ExternalStatement(statement))), /*Name*/new ExternalStatement(new StringEntry(")")))))))))))));
		}
	}


	public final ChangeListener ChangeListenerClass = new ChangeListener();
	public class ChangeListener extends ExternalClassEntry {




	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("ChangeListener"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("ChangeListener").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */ 
	   /* Methods */
		add_method_619();
		add_method_620();
		add_method_621();
		add_method_622();
		add_method_623(); 
	   /* Classes */
	}
	
		private void add_method_619() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualX")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newX")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_620() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualY")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newY")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_621() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualWidth")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newWidth")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_622() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setVisualHeight")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newHeight")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_623() {
	 		addMethod(new ExternalMethodEntry(2, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("setAngle")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("newAngle")))}), "", /*Body*/new ExternalStatement.Body()));
	 	}
	
}

	public void __INIT__(){
		super.__SETUP__(
		null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		}, new StringEntry("Drawable"), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("Drawable").get(builder);
			new StringEntry("").get(builder);
		}
	});	
       /* Variables */
		add_variable_982();
		add_variable_983();
		add_variable_984();
		add_variable_985();
		add_variable_986();
		add_variable_987();
		add_variable_988();
		add_variable_989();
		add_variable_990();
		add_variable_991();
		add_variable_992(); 
	   /* Methods */
		add_method_590();
		add_method_591();
		add_method_592();
		add_method_593();
		add_method_594();
		add_method_595();
		add_method_596();
		add_method_597();
		add_method_598(); 
	   /* Classes */
		add_subclass_241();
	}
		private void add_variable_982() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("FloatBuffer"))),"", /*Name*/new ExternalStatement(new StringEntry("vertexBuffer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_983() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListeners")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_984() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_985() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_986() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualWidth")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))));
	 	}
		private void add_variable_987() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualHeight")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))));
	 	}
		private void add_variable_988() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualRotationPointX")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_989() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualRotationPointY")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_990() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("visualAngle")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_991() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Float"))),"", /*Name*/new ExternalStatement(new StringEntry("angle")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f"))))));
	 	}
		private void add_variable_992() {
	 		addVariable(new ExternalVariableEntry(false, true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),"", /*Name*/new ExternalStatement(new StringEntry("displayLayer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_590() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayLayer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")))), /*Enty*/new ExternalStatement(new StringEntry("botLayer")))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))))));
	 	}
		private void add_method_591() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("display")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Layer"))))),"", /*Name*/new ExternalStatement(new StringEntry("layer")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayLayer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer")))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer"))), /*Enty*/new ExternalStatement(new StringEntry("remove"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayLayer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("layer")))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayLayer"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))))))))))))));
	 	}
		private void add_method_592() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("render")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glPushMatrix"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTranslatef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualY")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0f"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("!=", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualAngle")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0f")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTranslatef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualRotationPointX")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualRotationPointY")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0f"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glRotatef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualAngle")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glTranslatef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1f")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualRotationPointX")))),/*Optr*/new ExternalStatement("*", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1f")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualRotationPointY")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0.0f"))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glScalef"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualWidth")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("visualHeight")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1f"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("GL11")))), /*Enty*/new ExternalStatement(new StringEntry("glVertexPointer"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("3")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("vertexBuffer"))))))))))));
	 	}
		private void add_method_593() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("animate")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_594() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body()));
	 	}
		private void add_method_595() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Exac*/new ExternalStatement(new StringEntry("getTexture")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0"))))))));
	 	}
		private void add_method_596() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("image")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderable"))))),"", /*Name*/new ExternalStatement(new StringEntry("image")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_597() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable"))))),"", /*Name*/new ExternalStatement(new StringEntry("colour")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Colour"))))),"", /*Name*/new ExternalStatement(new StringEntry("colour")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
	 	}
		private void add_method_598() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))),"", /*Name*/new ExternalStatement(new StringEntry("changeListener")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("changeListeners")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Drawable")))), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ChangeListener"))))))),new ExternalStatement.Parameters())))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListeners"))), /*Enty*/new ExternalStatement(new StringEntry("add"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("changeListener"))))))))))));
	 	}
	
		private void add_subclass_241() {
	 		addSubClass(MainFlow.classes.GuiClass.DrawableClass.ChangeListenerClass);
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
			new StringEntry("Gui"), 
			"class ", 
			null, 
			new ArrayList<Entry>(Arrays.asList(new Entry[]{})),
			
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry("Gui").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_932();
		add_variable_933();
		add_variable_934();
		add_variable_935();
		add_variable_936();
		add_variable_937(); 
	   /* Methods */
		add_method_524(); 
	   /* Classes */
		add_subclass_223();
		add_subclass_224();
		add_subclass_232();
		add_subclass_234();
		add_subclass_242();
	}
		private void add_variable_932() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("FloatBuffer"))),"", /*Name*/new ExternalStatement(new StringEntry("placeHolder")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_933() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("isRunning")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))));
	 	}
		private void add_variable_934() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageLoader"))),"", /*Name*/new ExternalStatement(new StringEntry("imageLoader")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_935() {
	 		addVariable(new ExternalVariableEntry(false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("InputHandler"))),"", /*Name*/new ExternalStatement(new StringEntry("inputHandler")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_936() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game"))),"", /*Name*/new ExternalStatement(new StringEntry("game")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
		private void add_variable_937() {
	 		addVariable(new ExternalVariableEntry(true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer"))),"", /*Name*/new ExternalStatement(new StringEntry("renderer")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
	 	}
	
		private void add_method_524() {
	 		addMethod(new ExternalMethodEntry(0, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("load")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("initializeDisplay")),new ExternalStatement.Parameters()))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("inputHandler")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("InputHandler"))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputHandler"))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("imageLoader")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("ImageLoader"))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("imageLoader"))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("renderer")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Renderer"))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("renderer"))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))))))))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("game")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Game"))),new ExternalStatement.Parameters())))),
/*BODY*/				
	/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("game"))), /*Enty*/new ExternalStatement(new StringEntry("load"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
	
		private void add_subclass_223() {
	 		addSubClass(MainFlow.classes.GuiClass.RenderableClass);
	 	}
		private void add_subclass_224() {
	 		addSubClass(MainFlow.classes.GuiClass.StatableClass);
	 	}
		private void add_subclass_232() {
	 		addSubClass(MainFlow.classes.GuiClass.ImageClass);
	 	}
		private void add_subclass_234() {
	 		addSubClass(MainFlow.classes.GuiClass.ColourClass);
	 	}
		private void add_subclass_242() {
	 		addSubClass(MainFlow.classes.GuiClass.DrawableClass);
	 	}
}