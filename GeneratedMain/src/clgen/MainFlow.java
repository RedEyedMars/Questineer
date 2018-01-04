package clgen;
import java.util.*;
import java.io.*;
import lists.*;
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
public class MainFlow extends FlowController  {
	public static class classes {
		public static final Listenable ListenableClass = new Listenable();
		public static final Source SourceClass = new Source();
		public static final Loaddable LoaddableClass = new Loaddable();
		public static final Tickable TickableClass = new Tickable();
		public static final Usable UsableClass = new Usable();
		public static final Range RangeClass = new Range();
		public static final Operators OperatorsClass = new Operators();
		public static final Evaluable EvaluableClass = new Evaluable();
		public static final ListMaps ListMapsClass = new ListMaps();
		public static final Criteria CriteriaClass = new Criteria();
		public static final Game GameClass = new Game();
		public static final Menu MenuClass = new Menu();
		public static final Treasury TreasuryClass = new Treasury();
		public static final Activity ActivityClass = new Activity();
		public static final Activities ActivitiesClass = new Activities();
		public static final Attack AttackClass = new Attack();
		public static final Attacks AttacksClass = new Attacks();
		public static final Support SupportClass = new Support();
		public static final Supports SupportsClass = new Supports();
		public static final Skill SkillClass = new Skill();
		public static final Skills SkillsClass = new Skills();
		public static final Quest QuestClass = new Quest();
		public static final Quests QuestsClass = new Quests();
		public static final Aspect AspectClass = new Aspect();
		public static final Aspects AspectsClass = new Aspects();
		public static final Items ItemsClass = new Items();
		public static final Item ItemClass = new Item();
		public static final Affinity AffinityClass = new Affinity();
		public static final Affinities AffinitiesClass = new Affinities();
		public static final Condition ConditionClass = new Condition();
		public static final Conditions ConditionsClass = new Conditions();
		public static final Trait TraitClass = new Trait();
		public static final Traits TraitsClass = new Traits();
		public static final Association AssociationClass = new Association();
		public static final Associations AssociationsClass = new Associations();
		public static final Relationship RelationshipClass = new Relationship();
		public static final Int IntClass = new Int();
		public static final Entities EntitiesClass = new Entities();
		public static final Entity EntityClass = new Entity();
		public static final EntryPoints EntryPointsClass = new EntryPoints();
		public static final Tiles TilesClass = new Tiles();
		public static final Tile TileClass = new Tile();
		public static final Areas AreasClass = new Areas();
		public static final Area AreaClass = new Area();
		public static final Environment EnvironmentClass = new Environment();
		public static final Environments EnvironmentsClass = new Environments();
		public static final Direction DirectionClass = new Direction();
		public static final Events EventsClass = new Events();
		public static final Event EventClass = new Event();
		public static final Renderer RendererClass = new Renderer();
		public static final InputHandler InputHandlerClass = new InputHandler();
		public static final ImageStates ImageStatesClass = new ImageStates();
		public static final Images ImagesClass = new Images();
		public static final Colours ColoursClass = new Colours();
		public static final Drawables DrawablesClass = new Drawables();
		public static final ImageLoader ImageLoaderClass = new ImageLoader();
		public static final Gui GuiClass = new Gui();
	}
	public static MainFlow variables = null;
	public static MainFlow methods = null;
	//Externals


	//Internals
	protected final String __VAR__packageName = "com.rem.qstnr";
	protected final IParser __VAR__rootParser = Rules.base;
	protected final List __VAR__listnames = Listnames.parser;
	protected final List __VAR__rules = Rules.parser;
	protected final RegexParser __VAR__lazyNameParser = GeneralTokens.NAME;
	protected final Set<String> __VAR__declaredCritSet = new HashSet<String>();
	protected final Set<String> __VAR__declaredListSet = new HashSet<String>();
	protected final Set<String> __VAR__declaredMapSet = new HashSet<String>();
	protected final String __VAR__TT = "<T>T";
	protected final String __VAR__mainStringArgs = "String[]";
	protected final Integer __VAR__INT_SIZE = 4;
	protected final String __VAR__finalImageStatesClassName = "final Gui.Image.States";
	protected final String __VAR__floatBufferArray = "FloatBuffer[][]";

	public static void main(final String[] args)  {
		if(args.length==1) {
	new MainFlow().parse(args[0]);
		}
		else {
	System.err.println("No filename provided!");
		}
	}
	public String getPackageName()  {
		return __VAR__packageName;
	}
	public String get_packageName()  {
		return __VAR__packageName;
	}
	public IParser getRootParser()  {
		return __VAR__rootParser;
	}
	public IParser get_rootParser()  {
		return __VAR__rootParser;
	}
	public List getListnames()  {
		return __VAR__listnames;
	}
	public List get_listnames()  {
		return __VAR__listnames;
	}
	public List getRules()  {
		return __VAR__rules;
	}
	public List get_rules()  {
		return __VAR__rules;
	}
	public RegexParser getLazyNameParser()  {
		return __VAR__lazyNameParser;
	}
	public RegexParser get_lazyNameParser()  {
		return __VAR__lazyNameParser;
	}
	public ExternalStatement.Body getBodyElements(final IToken elementsToken,final ExternalContext context)  {
		final ExternalStatement.Body result = new ExternalStatement.Body();
		result.setParentContext(context);
		for(final IToken element:elementsToken.getAllSafely("body_element")) {
				result.add(MainFlow.methods.getBodyElement(element,result.getContext()));
		}
		return result;
	}
	public ExternalStatement getBodyElement(final IToken elementToken,final ExternalContext context)  {
		for(IToken.Key __element__KEY:elementToken.keySet()) {
			if(__element__KEY.getName().equals("statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("return_statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("acquisition")){ final IToken element = elementToken.get(__element__KEY);
				final ExternalStatement subject = MainFlow.methods.getVariableCall(element.get("variable_call"),context);
				return MainFlow.methods.getAcquisition(element.get("acquisition"),true,subject,context);
			}
			if(__element__KEY.getName().equals("imposition")){ final IToken element = elementToken.get(__element__KEY);
				final ExternalStatement subject = MainFlow.methods.getVariableCall(element.get("variable_call"),context);
				final Boolean doom = element.get("imposition").get("IMPOSE") != null || element.get("imposition").get("PLUS") != null;
				return MainFlow.classes.EntityClass.getImposition(element.get("imposition"),doom,subject);
			}
			if(__element__KEY.getName().equals("activity_statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getActivityStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("association_statement")){ final IToken element = elementToken.get(__element__KEY);
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getAssociationStatement(element,context))))));
			}
			if(__element__KEY.getName().equals("variable_declaration")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getVariableDeclaration(element,context);
			}
			if(__element__KEY.getName().equals("if_statement")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getIfStatement(element,context);
			}
			if(__element__KEY.getName().equals("for_statement")){ final IToken element = elementToken.get(__element__KEY);
				return MainFlow.methods.getForStatement(element,context);
			}
		}
		return null;
	}
	public ExternalStatement getVariableDeclaration(final IToken variableDeclarationToken,final ExternalContext context)  {
		final String typeName = MainFlow.methods.getTypeName(variableDeclarationToken.get("variable_header").get("type_name"));
		final ExternalContext type = context.getClassContext(typeName);
		if (type == null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableDeclarationToken) + "Could not find type:"+typeName+"!");
		}
		if (variableDeclarationToken.get("statement") != null) {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variable_header").get("variableName").toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(MainFlow.methods.getStatement(variableDeclarationToken.get("statement"),context)))))));
		}
		else  {
			return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableDeclarationToken.get("variable_header").get("variableName").toString())), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))));
		}
	}
	public ExternalVariableEntry getVariableFromHeader(final IToken variableHeaderToken,final ExternalContext context)  {
		final String typeName = MainFlow.methods.getTypeName(variableHeaderToken.get("type_name"));
		final ExternalContext type = context.getClassContext(typeName);
		if (type == null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableHeaderToken) + "Could not find type:"+typeName+"!");
		}
		return new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString())));
	}
	public ExternalVariableEntry addVariableHeader(final IToken variableHeaderToken,final ExternalClassEntry inputClass)  {
		final String typeName = MainFlow.methods.getTypeName(variableHeaderToken.get("type_name"));
		final ExternalContext type = inputClass.getContext().getClassContext(typeName);
		if (type == null) {
			throw new RuntimeException(Generator.completeTokenErrorMessage(variableHeaderToken) + "Could not find type:"+typeName+"!");
		}
inputClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))));
		return inputClass.getVariable(variableHeaderToken.get("variableName").toString());
	}
	public ExternalStatement getIfStatement(final IToken ifStatementToken,final ExternalContext context)  {
		final ExternalStatement header = new ExternalStatement();
		final ExternalStatement elseHeader = new ExternalStatement();
		final ExternalStatement.Body body = new ExternalStatement.Body();
		final ExternalStatement.Body elseBody = new ExternalStatement.Body();
		body.setParentContext(context);
		elseBody.setParentContext(context);
		Integer mode = 0;
		for(IToken.Key __element__KEY:ifStatementToken.keySet()) {
			if(__element__KEY.getName().equals("boolean_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				header.add(MainFlow.methods.getBooleanStatement(element,context));
			}
			if(__element__KEY.getName().equals("body_element")){ final IToken element = ifStatementToken.get(__element__KEY);
				body.add(MainFlow.methods.getBodyElement(element,body.getContext()));
			}
			if(__element__KEY.getName().equals("else_statement")){ final IToken element = ifStatementToken.get(__element__KEY);
				mode = 1;
				for(IToken.Key __atom__KEY:element.keySet()) {
				if(__atom__KEY.getName().equals("body_element")){ final IToken atom = element.get(__atom__KEY);
					elseBody.add(MainFlow.methods.getBodyElement(atom,elseBody.getContext()));
					if (atom.get("variable_declaration") != null) {
					elseBody.getContext().add(MainFlow.methods.getVariableFromHeader(atom.get("variable_declaration").get("variable_header"),elseBody.getContext()));
					}
				}
				if(__atom__KEY.getName().equals("boolean_statement")){ final IToken atom = element.get(__atom__KEY);
					elseHeader.add(MainFlow.methods.getBooleanStatement(atom,context));
					mode = 2;
				}
				}
			}
		}
		if (mode == 0 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)));
		}
		else if (mode == 1 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else if (mode == 2 ) {
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(header))),
			/*InCl*/new ExternalStatement(body)),
		/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(elseHeader))),
			/*InCl*/new ExternalStatement(elseBody)));
		}
		else  {
			return null;
		}
	}
	public ExternalStatement getForStatement(final IToken forStatementToken,final ExternalContext context)  {
		if (forStatementToken.get("fromList") != null) {
			final IToken variableHeaderToken = forStatementToken.get("fromList").get("variable_header");
			final String typeName = MainFlow.methods.getTypeName(variableHeaderToken.get("type_name"));
			final ExternalContext type = context.getClassContext(typeName);
			if (type == null) {
				throw new RuntimeException(Generator.completeTokenErrorMessage(variableHeaderToken) + "Could not find type:"+typeName+"!");
			}
			context.add(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))));
			final ExternalStatement right = MainFlow.methods.getStatement(forStatementToken.get("fromList").get("statement"),context);
			final ExternalStatement.Body body = MainFlow.methods.getBodyElements(forStatementToken,context);
			return /*InCl*/new ExternalStatement(
		/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*Optr*/new ExternalStatement(": ", new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))),"", /*Enty*/new ExternalStatement(new StringEntry(variableHeaderToken.get("variableName").toString()))), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(right)))),
			/*InCl*/new ExternalStatement(body)));
		}
		return null;
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final ExternalContext context)  {
		return MainFlow.methods.getBooleanStatement(booleanStatement,false,context);
	}
	public ExternalStatement getBooleanStatement(final IToken booleanStatement,final Boolean negate,final ExternalContext context)  {
		final ExternalStatement operator = new ExternalStatement();
		for(IToken.Key __element__KEY:booleanStatement.keySet()) {
			if(__element__KEY.getName().equals("has_chance")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getChance(element));
			}
			if(__element__KEY.getName().equals("isA_statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getIsAStatement(element,context));
			}
			if(__element__KEY.getName().equals("spawn_statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.get("environmentName").toString().toString()))), /*Enty*/new ExternalStatement(new StringEntry("equals"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("spawn"))), /*Enty*/new ExternalStatement(new StringEntry("getParent"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Enty*/new ExternalStatement(new StringEntry("getName"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))));
			}
			if(__element__KEY.getName().equals("has_statement")){ final IToken element = booleanStatement.get(__element__KEY);
				final ExternalStatement variableCall = MainFlow.methods.getVariableCall(element.get("variable_call"),context);
				final ExternalStatement hasCall = MainFlow.methods.getRequirement(element.get("requirement"),variableCall,negate);
				if (element.get("NOT") != null) {
				hasCall.negate();
				}
				operator.add(hasCall);
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = booleanStatement.get(__element__KEY);
				operator.add(MainFlow.methods.getStatement(element,negate,context));
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = booleanStatement.get(__element__KEY);
				if (element.toString() == "&") {
				if (negate) {
					operator.set("||");
				}
				else  {
					operator.set("&&");
				}
				}
				else if (element.toString() == "|") {
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
	public ExternalStatement getIsAStatement(final IToken element,final ExternalContext context)  {
		final ExternalStatement result = new ExternalStatement();
		result.set(" instanceof ");
		result.add(MainFlow.methods.getVariableCall(element.get("variable_call"),context));
		result.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(MainFlow.methods.getTypeName(element.get("type_name")).toString())))));
		return result;
	}
	public ExternalStatement getRequirement(final IToken requirementToken,final ExternalStatement candidate,final Boolean showAsTrue)  {
		final ExternalStatement requireHeader = new ExternalStatement();
		String delimiter = "&&";
		if (showAsTrue) {
			delimiter = "||";
		}
		requireHeader.set(delimiter);
		for(final IToken quanta:requirementToken.getAllSafely("require_stat")) {
				final String statName = quanta.get("hero_stats").toString().toLowerCase();
				final String methodName = "get"+FlowController.camelize(statName.toString());
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(candidate)), /*Enty*/new ExternalStatement(new StringEntry(methodName.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())), /*Name*/new ExternalStatement(new StringEntry("getValue"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
				String operator = quanta.get("ORDINAL").toString();
				if (quanta.get("NOT") != null && showAsTrue || quanta.get("NOT") == null &&! showAsTrue) {
				operator = MainFlow.methods.negateOperator(operator);
				}
				innerHead.set(operator);
				innerHead.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(quanta.get("INTEGER").toString())))));
				requireHeader.add(innerHead);
		}
		for(final IToken quanta:requirementToken.getAllSafely("require_trait")) {
				final ExternalStatement id = MainFlow.classes.TraitsClass.getId(FlowController.camelize(quanta.get("trait_names").toString()));
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(candidate)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(id)))))));
				if (quanta.get("NOT") != null) {
				innerHead.negate();
				}
				if (showAsTrue == false) {
				innerHead.negate();
				}
				requireHeader.add(innerHead);
		}
		for(final IToken quanta:requirementToken.getAllSafely("require_attack")) {
				final ExternalStatement id = MainFlow.classes.AttacksClass.getId(FlowController.camelize(quanta.get("attack_names").toString()));
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(candidate)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(id)))))));
				if (quanta.get("NOT") != null) {
				innerHead.negate();
				}
				if (showAsTrue == false) {
				innerHead.negate();
				}
				requireHeader.add(innerHead);
		}
		for(final IToken quanta:requirementToken.getAllSafely("require_association")) {
				ExternalStatement idValue;
				if (quanta.get("association_names") != null) {
				idValue = MainFlow.classes.AssociationsClass.getId(FlowController.camelize(quanta.get("association_names").toString()));
				}
				else  {
				final String variableName = quanta.get("variableName").toString();
				idValue = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(variableName.toString()))), /*Enty*/new ExternalStatement(new StringEntry("getId"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
				}
				final ExternalStatement id = idValue;
				final ExternalStatement innerHead = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(candidate)), /*Name*/new ExternalStatement(new StringEntry("has"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(id)))))));
				if (quanta.get("NOT") != null) {
				innerHead.negate();
				}
				if (showAsTrue == false) {
				innerHead.negate();
				}
				requireHeader.add(innerHead);
		}
		return requireHeader;
	}
	public ExternalStatement getActivityStatement(final IToken element,final ExternalContext context)  {
		final ExternalStatement subject = MainFlow.methods.getVariableCall(element.get("variable_call"),context);
		final String method = element.get("method").toString();
		final String activityName = FlowController.camelize(element.get("activitynames").toString());
		final ExternalStatement.Parameters arguments = new ExternalStatement.Parameters();
		for(final IToken atom:element.getAllSafely("statement")) {
				arguments.add(MainFlow.methods.getStatement(atom,context));
		}
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(subject)), /*Enty*/new ExternalStatement(new StringEntry(method.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Activities")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(activityName.toString())))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(arguments))))))))));
	}
	public ExternalStatement getAssociationStatement(final IToken element,final ExternalContext context)  {
		final ExternalStatement subject = MainFlow.methods.getVariableCall(element.get("variable_call"),context);
		final String method = element.get("method").toString();
		final String associationName = FlowController.camelize(element.get("association_names").toString());
		final ExternalStatement.Parameters arguments = new ExternalStatement.Parameters();
		for(final IToken atom:element.getAllSafely("statement")) {
				arguments.add(MainFlow.methods.getStatement(atom,context));
		}
		final ExternalStatement recruiter = MainFlow.methods.getStatement(element.get("recruiter").get("statement"),context);
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(subject)), /*Enty*/new ExternalStatement(new StringEntry(method.toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(recruiter))),/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Associations")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(associationName.toString())))))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(arguments))))))))));
	}
	public ExternalStatement getStatement(final IToken statementToken,final ExternalContext context)  {
		return MainFlow.methods.getStatement(statementToken,false,context);
	}
	public ExternalStatement getStatement(final IToken statementToken,final Boolean initialNegate,final ExternalContext context)  {
		final ExternalStatement ret = new ExternalStatement();
		Boolean negate = initialNegate;
		for(IToken.Key __element__KEY:statementToken.keySet()) {
			if(__element__KEY.getName().equals("NOT")){ final IToken element = statementToken.get(__element__KEY);
				negate =! negate;
			}
			if(__element__KEY.getName().equals("variable_call")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement variableCall = MainFlow.methods.getVariableCall(element,context);
				ret.add(variableCall);
			}
			if(__element__KEY.getName().equals("activity_statement")){ final IToken element = statementToken.get(__element__KEY);
				ret.add(MainFlow.methods.getActivityStatement(element,context));
			}
			if(__element__KEY.getName().equals("statement")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStatement(element,context);
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("operator")){ final IToken element = statementToken.get(__element__KEY);
				if (negate) {
				ret.set(MainFlow.methods.negateOperator(element.toString()));
				}
				else  {
				ret.set(element.toString());
				}
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = statementToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStatement(element,context);
				subStatement.brace();
				ret.add(subStatement);
			}
		}
		if (ret.getSize() == 1  && negate) {
			ret.negate();
		}
		return ret;
	}
	public ExternalStatement getVariableCall(final IToken variableCallToken,final ExternalContext context)  {
		ExternalContext currentContext = context;
		final ExternalStatement ret = new ExternalStatement(".");
		for(IToken.Key __element__KEY:variableCallToken.keySet()) {
			if(__element__KEY.getName().equals("range")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("left").toString())))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.get("right").toString()))))))));
			}
			if(__element__KEY.getName().equals("braced")){ final IToken element = variableCallToken.get(__element__KEY);
				final ExternalStatement subStatement = MainFlow.methods.getStatement(element,context);
				subStatement.brace();
				ret.add(subStatement);
			}
			if(__element__KEY.getName().equals("exact")){ final IToken element = variableCallToken.get(__element__KEY);
				if (element.get("FLOAT") != null) {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(element.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))));
				}
				else  {
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
			}
			if(__element__KEY.getName().equals("quote")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(element.toString().toString())))));
			}
			if(__element__KEY.getName().equals("variable_group")){ final IToken element = variableCallToken.get(__element__KEY);
				ret.add(MainFlow.methods.getIdFromName(element));
			}
			if(__element__KEY.getName().equals("cast")){ final IToken element = variableCallToken.get(__element__KEY);
				final String typeName = MainFlow.methods.getTypeName(element.get("type_name"));
				final ExternalContext typeContext = currentContext.getClassContext(typeName);
				if (typeContext == null) {
				throw new RuntimeException("Could not find "+typeName.toString()+" type in context!");
				}
				final ExternalStatement castStatement = new ExternalStatement();
				castStatement.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString())))))));
				castStatement.brace();
				final ExternalStatement fullStatement = new ExternalStatement();
				fullStatement.add(castStatement);
				fullStatement.add(MainFlow.methods.getStatement(element.get("statement"),context));
				ret.add(fullStatement);
			}
			if(__element__KEY.getName().equals("access_static")){ final IToken element = variableCallToken.get(__element__KEY);
				final String typeName = MainFlow.methods.getTypeName(element.get("type_name"));
				final ExternalContext typeContext = currentContext.getClassContext(typeName);
				if (typeContext == null) {
				throw new RuntimeException("Could not find "+typeName.toString()+" type in context!");
				}
				final String variableName = element.get("variableName").toString();
				currentContext = typeContext.link(variableName);
				if (currentContext == null) {
				throw new RuntimeException("Could not find "+variableName.toString()+" variable in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(typeName.toString()))), /*Enty*/new ExternalStatement(new StringEntry(variableName.toString())))));
			}
			if(__element__KEY.getName().equals("variableName")){ final IToken element = variableCallToken.get(__element__KEY);
				if (currentContext.hasLink(element.toString()) == false) {
				currentContext = currentContext.link("event");
				if (currentContext == null) {
					throw new RuntimeException("Could not find "+element.toString()+" variable in context!");
				}
				else  {
					currentContext = currentContext.link(element.toString());
					if (currentContext == null) {
						throw new RuntimeException("Could not find "+element.toString()+" variable in context!");
					}
					else  {
						ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("event"))), /*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(element.toString()).toString()))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))));
					}
				}
				}
				else  {
				currentContext = currentContext.link(element.toString());
				if (ret.size() == 0 ) {
					ret.add(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(element.toString())))));
				}
				else  {
					ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry("get"+FlowController.camelize(element.toString()).toString())),new ExternalStatement.Parameters())));
				}
				}
			}
			if(__element__KEY.getName().equals("method")){ final IToken element = variableCallToken.get(__element__KEY);
				final String methodName;
				if (element.get("methodName") != null) {
				methodName = element.get("methodName").toString();
				}
				else  {
				methodName = MainFlow.methods.getTypeName(element.get("type_name"));
				}
				final ExternalStatement.Parameters parameters = new ExternalStatement.Parameters();
				for(final IToken atom:element.getAllSafely("statement")) {
					parameters.add(MainFlow.methods.getStatement(atom,context));
				}
				if (element.get("NEW") != null) {
				currentContext = currentContext.getClassContext(methodName);
				if (currentContext == null) {
					throw new RuntimeException("Could not find \"+methodName+\" type in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(methodName.toString())))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
				}
				else  {
				currentContext = currentContext.link(methodName);
				if (currentContext == null) {
					throw new RuntimeException("Could not find "+element.toString()+" method in context!");
				}
				ret.add(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Enty*/new ExternalStatement(new StringEntry(element.toString())),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(parameters)))))));
				}
			}
		}
		if (currentContext != null && currentContext.hasEnder()) {
			ret.add(currentContext.getEnder());
		}
		return ret;
	}
	public ExternalStatement getIdFromName(final IToken nameToken)  {
		for(IToken.Key __element__KEY:nameToken.keySet()) {
			if(__element__KEY.getName().equals("association_names")){ final IToken element = nameToken.get(__element__KEY);
				return MainFlow.classes.AssociationsClass.getId(FlowController.camelize(element.toString()));
			}
			if(__element__KEY.getName().equals("affinity_names")){ final IToken element = nameToken.get(__element__KEY);
				return MainFlow.classes.AffinitiesClass.getId(FlowController.camelize(element.toString()));
			}
			if(__element__KEY.getName().equals("condition_names")){ final IToken element = nameToken.get(__element__KEY);
				return MainFlow.classes.ConditionsClass.getId(FlowController.camelize(element.toString()));
			}
			if(__element__KEY.getName().equals("skill_names")){ final IToken element = nameToken.get(__element__KEY);
				return MainFlow.classes.SkillsClass.getId(FlowController.camelize(element.toString()));
			}
			if(__element__KEY.getName().equals("trait_names")){ final IToken element = nameToken.get(__element__KEY);
				return MainFlow.classes.TraitsClass.getId(FlowController.camelize(element.toString()));
			}
			if(__element__KEY.getName().equals("association_names")){ final IToken element = nameToken.get(__element__KEY);
				return MainFlow.classes.AssociationsClass.getId(FlowController.camelize(element.toString()));
			}
		}
		return null;
	}
	public ExternalStatement getAcquisition(final IToken acquisitionToken,final Boolean forGainBody,final ExternalStatement subject,final ExternalContext context)  {
		ExternalContext source;
		final String sourceName;
		if (acquisitionToken.get("source_name") != null) {
			sourceName = acquisitionToken.get("source_name").toString();
		}
		else  {
			sourceName = "this";
		}
		source = context.link(sourceName);
		if (source == null) {
			throw new RuntimeException("Could not find "+sourceName+" source in context!");
		}
		final ExternalStatement gainObj;
		final ExternalStatement id;
		if (acquisitionToken.get("THIS") != null) {
			gainObj = /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Enty*/new ExternalStatement(new StringEntry("clone"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())));
			id = /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("this"))), /*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("aspect_names") != null) {
			final String className = FlowController.camelize(acquisitionToken.get("aspect_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspects")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Aspects")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("trait_names") != null) {
			final String className = FlowController.camelize(acquisitionToken.get("trait_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Traits")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Traits")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("attack_names") != null) {
			final String className = FlowController.camelize(acquisitionToken.get("attack_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attacks")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Attacks")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else if (acquisitionToken.get("condition_names") != null) {
			final String className = FlowController.camelize(acquisitionToken.get("condition_names").toString());
			gainObj = /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(new StringEntry(className))))),new ExternalStatement.Parameters()));
			id = /*Optr*/new ExternalStatement(".", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Conditions")), /*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(className.toString())))))))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("id"))));
		}
		else  {
			gainObj = null;
			id = null;
		}
		if (acquisitionToken.get("operator").get("GAINS") != null) {
			if (forGainBody) {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("gain"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(gainObj))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
			else  {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(id))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
		}
		else  {
			if (forGainBody) {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("lose"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(id))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
			else  {
				return /*InCl*/new ExternalStatement(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(subject)), /*Name*/new ExternalStatement(new StringEntry("gain"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*InCl*/new ExternalStatement(gainObj))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(sourceName.toString()))))))))));
			}
		}
	}
	public ExternalStatement primeRange(final IToken rangeToken)  {
		String left = rangeToken.get("left").toString();
		String right = rangeToken.get("right").toString();
		if (rangeToken.get("percent") != null) {
			left = MainFlow.methods.percentify(left);
			right = MainFlow.methods.percentify(right);
		}
		return /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(left.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(/*Concat*/new ExternalStatement("", /*Enty*/new ExternalStatement(new StringEntry(right.toString())), /*Name*/new ExternalStatement(new StringEntry("f")))))))));
	}
	public ExternalStatement getChance(final IToken chanceToken)  {
		final Double value = Double.parseDouble(chanceToken.toString()) / 100.0;
		return /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Range")))), /*Enty*/new ExternalStatement(new StringEntry("chance"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Enty*/new ExternalStatement(new StringEntry(value.toString()))))))));
	}
	public void createList(final ExternalClassEntry listClass)  {
		final String listName = listClass.getFullName() + "List";
		if (MainFlow.variables.get_declaredListSet().add(listName)) {
listClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(null, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry("List"), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("ArrayList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName())))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry("List").get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_33(); 
	   /* Classes */
	}
	
		private void add_method_33() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"))),"", /*Exac*/new ExternalStatement(new StringEntry("*")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(listClass.getFullName()))),"", new ExternalStatement(new StringEntry("..."), /*Name*/new ExternalStatement(new StringEntry("elements"))))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("super")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Arrays")))), /*Enty*/new ExternalStatement(new StringEntry("asList"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("elements")))))))))))))));
	 	}
	
});
		}
	}
	public void createCriteria(final ExternalClassEntry critClass)  {
		final String critName = critClass.getName() + "Criteria";
		if (MainFlow.variables.get_declaredCritSet().add(critName)) {
			
			final ExternalClassEntry critNameClass = new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("criteria")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(critName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Criteria"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName())))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(critName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_34(); 
	   /* Classes */
	}
	
		private void add_method_34() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Exac*/new ExternalStatement(new StringEntry("satisfies")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(critClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("candidate")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))))));
	 	}
	
};
			critNameClass.__INIT__();
			final StringBuilder __BUILDER__;
			final File __DIRECTORY__;
			__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("criteria")).get(__BUILDER__);
	__DIRECTORY__ = new File(MainFlow.__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	MainFlow.methods.addFile(__DIRECTORY__,FlowController.camelize(critName)+".java", critNameClass);
		}
	}
	public void createListMap(final ExternalClassEntry leftClass,final ExternalClassEntry rightClass)  {
		final String leftName = leftClass.getName() + "s";
		final String rightName = "_" + rightClass.getName();
		final String fullName = "Maps."+leftName+"."+rightName;
		if (MainFlow.variables.get_declaredListSet().add(fullName)) {
			if (MainFlow.classes.ListMapsClass.getSubClass(leftName) == null) {
MainFlow.classes.ListMapsClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(leftName), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(leftName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */ 
	   /* Classes */
	}
	
	
});
			}
MainFlow.classes.ListMapsClass.getSubClass(leftName).addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(rightName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName())),/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName())))))), new ArrayList<Entry>(Arrays.asList(new Entry[]{/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Iterable"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(rightName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */
		add_variable_58(); 
	   /* Methods */
		add_method_35();
		add_method_36();
		add_method_37();
		add_method_38();
		add_method_39();
		add_method_40();
		add_method_41(); 
	   /* Classes */
	}
		private void add_variable_58() {
	 		addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Name*/new ExternalStatement(new StringEntry("completeList")), /*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),new ExternalStatement.Parameters())));
	 	}
	
		private void add_method_35() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Iterator"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Exac*/new ExternalStatement(new StringEntry("iterator")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))), /*Enty*/new ExternalStatement(new StringEntry("iterator"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	 	}
		private void add_method_36() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("LinkedList"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Exac*/new ExternalStatement(new StringEntry("getFrom")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("super"))), /*Enty*/new ExternalStatement(new StringEntry("get"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))))));
	 	}
		private void add_method_37() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("add")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("element")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&!", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true")))), /*Call*/new ExternalStatement("",
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
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))))));
	 	}
		private void add_method_38() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("removeLast")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("&&!", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
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
			 		new ExternalStatement.Parameters())))))))))))));
	 	}
		private void add_method_39() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("removeAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key")))}), "", /*Body*/new ExternalStatement.Body(
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
			 		new ExternalStatement.Parameters())))))))));
	 	}
		private void add_method_40() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("remove")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(leftClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("element")))}), "", /*Body*/new ExternalStatement.Body(
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
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("element"))))))))))));
	 	}
		private void add_method_41() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("List"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(rightClass.getFullName()))))),"", /*Exac*/new ExternalStatement(new StringEntry("getAll")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("completeList"))))))));
	 	}
	
});
		}
	}
	public void createMap(final ExternalClassEntry keyClass,final ExternalClassEntry valueClass)  {
		final String keyName = keyClass.getName() + "Map";
		final String valueName = "_" + valueClass.getName();
		final String fullName = "Maps."+keyName+"."+valueName;
		if (MainFlow.variables.get_declaredMapSet().add(fullName)) {
			
			final ExternalClassEntry keyNameClass = new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("maps")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(keyName), "class ", null, new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append(" class ");
			new StringEntry(keyName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */ 
	   /* Classes */
	}
	
	
};
			keyNameClass.__INIT__();
			final StringBuilder __BUILDER__;
			final File __DIRECTORY__;
			__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("maps")).get(__BUILDER__);
	__DIRECTORY__ = new File(MainFlow.__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	MainFlow.methods.addFile(__DIRECTORY__,FlowController.camelize(keyName)+".java", keyNameClass);
keyNameClass.addSubClass(new ExternalClassEntry(){public void __INIT__(){super.__SETUP__(new Entry(){
			public void get(StringBuilder __BUILDER__){/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("maps")).get(__BUILDER__);
			}
		}, 
		new Entry(){
			public void get(StringBuilder __BUILDER__){
			}
		},new StringEntry(valueName), "class ", /*TypeName*/new ExternalStatement.TypeName(new StringEntry("HashMap"), new ExternalStatement(new StringEntry("<"), new StringEntry(">"), ",", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(keyClass.getFullName())),/*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName())))), new ArrayList<Entry>(Arrays.asList(new Entry[]{})), 
		new Entry(){
		public void get(StringBuilder builder){
			builder.append("static class ");
			new StringEntry(valueName).get(builder);
			new StringEntry("").get(builder);
		}
	});
       /* Variables */ 
	   /* Methods */
		add_method_42(); 
	   /* Classes */
	}
	
		private void add_method_42() {
	 		addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName()))),"", /*Exac*/new ExternalStatement(new StringEntry("get")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(keyClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("key"))),
/*PARAMS*/				new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new ExternalStatement(".", /*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName())), /*TypeName*/new ExternalStatement.TypeName(new StringEntry("Factory"))))),"", /*Name*/new ExternalStatement(new StringEntry("factory")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry(valueClass.getFullName()))),"", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("get")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("result")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("factory"))), /*Enty*/new ExternalStatement(new StringEntry("create"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("put")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("key")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result")))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("result"))))))))));
	 	}
	
});
		}
	}
	public String percentify(final String input)  {
		final Double result = Double.parseDouble(input) / 100.0;
		return result.toString();
	}
	public String percentify(final IToken input)  {
		return MainFlow.methods.percentify(input.toString());
	}
	public String negateOperator(final String operator)  {
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
			return "COULD NOT NEGATE ("+operator+")";
		}
	}
	public Set<String> getDeclaredCritSet()  {
		return __VAR__declaredCritSet;
	}
	public Set<String> get_declaredCritSet()  {
		return __VAR__declaredCritSet;
	}
	public Set<String> getDeclaredListSet()  {
		return __VAR__declaredListSet;
	}
	public Set<String> get_declaredListSet()  {
		return __VAR__declaredListSet;
	}
	public Set<String> getDeclaredMapSet()  {
		return __VAR__declaredMapSet;
	}
	public Set<String> get_declaredMapSet()  {
		return __VAR__declaredMapSet;
	}
	public String getTT()  {
		return __VAR__TT;
	}
	public String get_TT()  {
		return __VAR__TT;
	}
	public String getMainStringArgs()  {
		return __VAR__mainStringArgs;
	}
	public String get_mainStringArgs()  {
		return __VAR__mainStringArgs;
	}
	public void setupGui()  {
		MainFlow.classes.GuiClass.setup();
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,true, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("StringBuilder"))),"", /*Name*/new ExternalStatement(new StringEntry("_log")), /*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("StringBuilder"))),new ExternalStatement.Parameters()))));
MainFlow.classes.GuiClass.addMethod(new ExternalMethodEntry(1, true,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("log")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("toLog")))}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("_log"))), /*Enty*/new ExternalStatement(new StringEntry("append"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("toLog"))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("_log"))), /*Enty*/new ExternalStatement(new StringEntry("append"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("\\n".toString()))))))))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("finishedKey")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Keyboard")))), /*Enty*/new ExternalStatement(new StringEntry("KEY_ESCAPE"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("String"))),"", /*Name*/new ExternalStatement(new StringEntry("window_title")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("OpenGL Window".toString()))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("VSyncEnabled")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("useCurrentDisplay")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("fullScreen")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Boolean"))),"", /*Name*/new ExternalStatement(new StringEntry("showMessages")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("true"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(true,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("displayWidth")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1024"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("displayHeight")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("786"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("displayColorBits")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("displayFrequency")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("depthBufferBits")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("24"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DisplayMode"))),"", /*Name*/new ExternalStatement(new StringEntry("originalDisplayMode")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
MainFlow.classes.GuiClass.addVariable(new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DisplayMode"))),"", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))));
		MainFlow.classes.GuiClass.getMethod("*").appendToBody(/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("load")),new ExternalStatement.Parameters()))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("run")),new ExternalStatement.Parameters())))));
MainFlow.classes.GuiClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("initializeDisplay")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("originalDisplayMode")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("getDisplayMode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("log"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("GLApp.initDisplay(): Current display mode is ".toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayHeight")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayHeight")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayWidth")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayWidth")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayColorBits")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayColorBits")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getBitsPerPixel"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayFrequency")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("-1 ")))),
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayFrequency")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getFrequency"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("useCurrentDisplay")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode")))))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getDisplayMode")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayWidth")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayHeight")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayColorBits")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayFrequency"))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getDisplayMode")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1024")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("768")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("32")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("60"))))))))),
/*BODY*/				
					/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
						/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getDisplayMode")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1024")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("768")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("16")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("60"))))))))),
/*BODY*/				
						/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
							/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement(null,new StringEntry(")"),"(",/*Name*/new ExternalStatement(new StringEntry("getDisplayMode")),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getBitsPerPixel"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("originalDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getFrequency"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
							/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode")))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))),
			/*Body*/new ExternalStatement.Body(
								/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("err"))), /*Enty*/new ExternalStatement(new StringEntry("println"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("Gui Load Display Cant find a compatible Display Mode!!!".toString()))))))))))))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Gui")))), /*Enty*/new ExternalStatement(new StringEntry("log"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("+", /*Optr*/new ExternalStatement("+", /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("initializeDisplay: Setting display mode to ".toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode")))), /*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry(" with pixel depth = ".toString())))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("depthBufferBits"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("setDisplayMode"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayMode")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode")))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayWidth")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayHeight")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayColorBits")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getBitsPerPixel"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("displayFrequency")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("displayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getFrequency"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))))),
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
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("initializeDisplay: Failed to create display: ".toString()))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("exit"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("create"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*NObj*/new ExternalStatement.NewObject(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("PixelFormat"))),new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("0")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("depthBufferBits")))),/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("8")))))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("setTitle"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("window_title"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("setFullscreen"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("fullScreen"))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("setVSyncEnabled"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("VSyncEnabled"))))))))))),
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
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("initializeDisplay: Failed to create OpenGL window".toString()))))))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("System"))), /*Enty*/new ExternalStatement(new StringEntry("exit"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))))))));
		final String displayModeArrayType = "DisplayMode[]";
MainFlow.classes.GuiClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DisplayMode"))),"", /*Exac*/new ExternalStatement(new StringEntry("getDisplayMode")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("width"))),
/*PARAMS*/				new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("height"))),
/*PARAMS*/				new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("colourBits"))),
/*PARAMS*/				new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("frequency")))}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(/*Enty*/new ExternalStatement(new StringEntry(displayModeArrayType.toString())))),"", /*Name*/new ExternalStatement(new StringEntry("allDisplayModes")), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("getAvailableDisplayModes"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))))),
/*BODY*/				
			/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("DisplayMode"))),"", /*Name*/new ExternalStatement(new StringEntry("tempDisplayMode")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null")))))),
/*BODY*/				
			/*Cond*/new ExternalStatement.Conditional(
			"for ", 
			/*FIHd*/new ExternalStatement(";", new ExternalVariableEntry(false,false, false, /*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Integer"))),"", /*Name*/new ExternalStatement(new StringEntry("i")), /*Exac*/new ExternalStatement(new StringEntry("0"))), new ExternalStatement("< ", /*Name*/new ExternalStatement(new StringEntry("i")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("allDisplayModes"))), /*Enty*/new ExternalStatement(new StringEntry("length"))))), new ExternalStatement(new StringEntry("++"),"",/*Name*/new ExternalStatement(new StringEntry("i")))),
			/*Body*/new ExternalStatement.Body(
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("tempDisplayMode")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("allDisplayModes[i]")))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("==", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("==", /*Optr*/new ExternalStatement("&&", /*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tempDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getWidth"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("width")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tempDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getHeight"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("height")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tempDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getBitsPerPixel"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("colourBits")))), /*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tempDisplayMode"))), /*Enty*/new ExternalStatement(new StringEntry("getFrequency"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("frequency")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("tempDisplayMode"))))))))))),
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
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Quot*/new ExternalStatement(new QuoteEntry("getDisplayMode Failed".toString()))))))))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("return ")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("null"))))))));
MainFlow.classes.GuiClass.addMethod(new ExternalMethodEntry(1, false,/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("void"))),"", /*Exac*/new ExternalStatement(new StringEntry("run")), /*Parameters*/Arrays.asList(new ExternalVariableEntry[]{}), "", /*Body*/new ExternalStatement.Body(
		/*Cond*/new ExternalStatement.Conditional(
			"try ", null,
			/*Body*/new ExternalStatement.Body(
			/*Cond*/new ExternalStatement.Conditional(
			"while ", 
			/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("isRunning")))),
			/*Body*/new ExternalStatement.Body(
				/*Cond*/new ExternalStatement.Conditional(
			"if ", 
			/*Optr*/new ExternalStatement("==", /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("isVisible"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))), /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Thread")))), /*Enty*/new ExternalStatement(new StringEntry("sleep"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("200L"))))))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"else if ", 
			/*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("isCloseRequested"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters()))),
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Optr*/new ExternalStatement("=", /*Name*/new ExternalStatement(new StringEntry("isRunning")), /*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("false")))))))),
/*BODY*/				
				/*Cond*/new ExternalStatement.Conditional(
			"else ", null,
			/*Body*/new ExternalStatement.Body(
					/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Thread")))), /*Enty*/new ExternalStatement(new StringEntry("sleep"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters(/*Name*/new ExternalStatement(/*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("1"))))))))))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputHandler"))), /*Enty*/new ExternalStatement(new StringEntry("handle"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("game"))), /*Enty*/new ExternalStatement(new StringEntry("update"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("renderer"))), /*Enty*/new ExternalStatement(new StringEntry("render"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
				/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*TypeName*/new ExternalStatement.TypeName(/*TypeName*/new ExternalStatement.TypeName(new StringEntry("Display")))), /*Enty*/new ExternalStatement(new StringEntry("update"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))))),
/*BODY*/				
		/*Cond*/new ExternalStatement.Conditional(
			"catch ", 
			/*Optr*/new ExternalStatement(" ", /*Exac*/new ExternalStatement(new StringEntry("InterruptedException")), /*Exac*/new ExternalStatement(new StringEntry("e0"))),
			/*Body*/new ExternalStatement.Body(
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Exac*/new ExternalStatement(new StringEntry("e0.printStackTrace()"))))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("inputHandler"))), /*Enty*/new ExternalStatement(new StringEntry("end"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))),
/*BODY*/				
		/*Elem*/new ExternalStatement(new TabEntry(new StringEntry("")), new StringEntry(";"), /*Name*/new ExternalStatement(/*Call*/new ExternalStatement("",
			 	new ExternalStatement(".", /*Acss*/new ExternalStatement(/*Name*/new ExternalStatement(new StringEntry("renderer"))), /*Enty*/new ExternalStatement(new StringEntry("end"))),
			 	new ExternalStatement(new StringEntry("("),new StringEntry(")"),"",
			 		new ExternalStatement.Parameters())))))));
	}
	public Integer getINTSIZE()  {
		return __VAR__INT_SIZE;
	}
	public Integer get_INT_SIZE()  {
		return __VAR__INT_SIZE;
	}
	public String getFinalImageStatesClassName()  {
		return __VAR__finalImageStatesClassName;
	}
	public String get_finalImageStatesClassName()  {
		return __VAR__finalImageStatesClassName;
	}
	public String getFloatBufferArray()  {
		return __VAR__floatBufferArray;
	}
	public String get_floatBufferArray()  {
		return __VAR__floatBufferArray;
	}
	public void assignListElementNames(final ParseContext context,final IToken root)  {
		context.retainList(new HeroStats());
	}
	public String getDirectory(final String fileName,final String knownDirectory)  {
		return "../Resource/";
	}
	public void setup(final ParseContext data)  {
	}
	public void generate(final ParseContext data)  {
		MainFlow.methods.setup("../Questineer/src");
		final IToken root = data.getRoot();
		for(final IToken imports:root.getAllSafely("import_any")) {
				for(final IToken import_events:imports.getAllSafely("IMPORT_EVENT")) {
					for(final IToken element:import_events.getAllSafely("event_declaration")) {
						MainFlow.classes.EventsClass.declaration(element);
					}
				}
		}
		MainFlow.methods.setupGui();
		MainFlow.classes.ConditionsClass.setup(data);
		MainFlow.classes.AspectsClass.setup(data);
		MainFlow.classes.ItemsClass.setup(data);
		MainFlow.classes.EntityClass.setup(data);
		MainFlow.classes.SkillsClass.setup(data);
		MainFlow.classes.ActivitiesClass.setup(data);
		MainFlow.classes.RelationshipClass.setup(data);
		MainFlow.classes.QuestsClass.setup(data);
		MainFlow.classes.TreasuryClass.setup(data);
		MainFlow.classes.EnvironmentClass.setup(data);
		MainFlow.classes.TileClass.setup(data);
		for(final IToken imports:root.getAllSafely("import_any")) {
				MainFlow.methods.importAny(imports);
				MainFlow.classes.GuiClass.importAny(imports);
		}
		output(data);
	}
	public void importAny(final IToken import_any)  {
		for(final IToken import_payment_types:import_any.getAllSafely("IMPORT_PAYMENT_TYPE")) {
				for(final IToken element:import_payment_types.getAllSafely("payment_type_declaration")) {
					MainFlow.classes.TreasuryClass.paymentTypeDec(element);
				}
		}
		for(final IToken import_events:import_any.getAllSafely("IMPORT_EVENT")) {
				for(final IToken element:import_events.getAllSafely("event_declaration")) {
					MainFlow.classes.EventsClass.declaration(element);
				}
		}
		for(final IToken import_items:import_any.getAllSafely("IMPORT_ITEM")) {
				for(final IToken element:import_items.getAllSafely("import_any")) {
					MainFlow.methods.importAny(element);
				}
				for(final IToken element:import_items.getAllSafely("item_declaration")) {
					MainFlow.classes.ItemsClass.declaration(element);
				}
		}
		for(final IToken import_reason:import_any.getAllSafely("IMPORT_REASON")) {
				for(final IToken element:import_reason.getAllSafely("reason_declaration")) {
					MainFlow.classes.RelationshipClass.declaration(element);
				}
		}
		for(final IToken import_aspects:import_any.getAllSafely("IMPORT_ASPECT")) {
				for(final IToken element:import_aspects.getAllSafely("aspect_declaration")) {
					MainFlow.classes.AspectsClass.declaration(element);
				}
		}
		for(final IToken import_affinities:import_any.getAllSafely("IMPORT_AFFINITY")) {
				for(final IToken element:import_affinities.getAllSafely("affinity_declaration")) {
					MainFlow.classes.AffinitiesClass.declaration(element);
				}
		}
		for(final IToken import_traits:import_any.getAllSafely("IMPORT_TRAIT")) {
				for(final IToken element:import_traits.getAllSafely("trait_declaration")) {
					MainFlow.classes.TraitsClass.declaration(element);
				}
		}
		for(final IToken import_conditions:import_any.getAllSafely("IMPORT_CONDITION")) {
				for(final IToken element:import_conditions.getAllSafely("condition_declaration")) {
					MainFlow.classes.ConditionsClass.declaration(element);
				}
		}
		for(final IToken import_activities:import_any.getAllSafely("IMPORT_ACTIVITY")) {
				for(final IToken element:import_activities.getAllSafely("activity_declaration")) {
					MainFlow.classes.ActivitiesClass.declaration(element);
				}
		}
		for(final IToken import_skills:import_any.getAllSafely("IMPORT_SKILL")) {
				for(final IToken element:import_skills.getAllSafely("skill_declaration")) {
					MainFlow.classes.SkillsClass.declaration(element);
				}
		}
		for(final IToken import_attacks:import_any.getAllSafely("IMPORT_ATTACK")) {
				for(final IToken element:import_attacks.getAllSafely("attack_declaration")) {
					MainFlow.classes.AttacksClass.declaration(element);
				}
		}
		for(final IToken import_supports:import_any.getAllSafely("IMPORT_SUPPORT")) {
				for(final IToken element:import_supports.getAllSafely("support_declaration")) {
					MainFlow.classes.SupportsClass.declaration(element);
				}
		}
		for(final IToken import_association:import_any.getAllSafely("IMPORT_ASSOCIATION")) {
				for(final IToken element:import_association.getAllSafely("association_declaration")) {
					MainFlow.classes.AssociationsClass.declaration(element);
				}
		}
		for(final IToken import_map:import_any.getAllSafely("IMPORT_MAP")) {
				MainFlow.classes.EnvironmentClass.declaration(import_map);
		}
		for(final IToken import_quests:import_any.getAllSafely("IMPORT_QUEST")) {
				for(final IToken element:import_quests.getAllSafely("quest_declaration")) {
					MainFlow.classes.QuestsClass.typeDeclaration(element);
				}
		}
	}
	public String getTypeName(final IToken nameToken)  {
		final StringBuilder nameBuilder = new StringBuilder();
		if (nameToken.get("findType") != null) {
			String findName = FlowController.camelize(nameToken.get("typeName").toString());
			for (final ExternalClassEntry subClass :  ExternalClassEntry.allClasses) {
				if (subClass.getName().equals(findName)) {
					return subClass.getFullName();
				}
			}
			throw new RuntimeException("Could not find "+findName+" class!");
		}
		else  {
			Boolean isFirst = true;
			for(final IToken element:nameToken.getAllSafely("typeName")) {
					if (isFirst == false) {
					nameBuilder.append(".");
					}
					else  {
					isFirst = false;
					}
					nameBuilder.append(FlowController.camelize(element.toString()));
			}
		}
		return nameBuilder.toString();
	}
	public Generator[] getGenerators()  {
		final MainFlow self = this;
		return new Generator[]{
		new Generator(){
			public String getName(){
				return "Main";
			}
			public void setup(ParseContext data){
			}
			public void generate(ParseContext data){
				StringBuilder __BUILDER__;
				File __DIRECTORY__;
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Listenable")+".java", MainFlow.classes.ListenableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Source")+".java", MainFlow.classes.SourceClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Loaddable")+".java", MainFlow.classes.LoaddableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Tickable")+".java", MainFlow.classes.TickableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("interfaces")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Usable")+".java", MainFlow.classes.UsableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Range")+".java", MainFlow.classes.RangeClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Operators")+".java", MainFlow.classes.OperatorsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Evaluable")+".java", MainFlow.classes.EvaluableClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("ListMaps")+".java", MainFlow.classes.ListMapsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Criteria")+".java", MainFlow.classes.CriteriaClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("game")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Game")+".java", MainFlow.classes.GameClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("menus")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Menu")+".java", MainFlow.classes.MenuClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("overview")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("treasuries")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Treasury")+".java", MainFlow.classes.TreasuryClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("activities")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Activity")+".java", MainFlow.classes.ActivityClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("activities")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Activities")+".java", MainFlow.classes.ActivitiesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Attack")+".java", MainFlow.classes.AttackClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("attacks")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Attacks")+".java", MainFlow.classes.AttacksClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("supports")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Support")+".java", MainFlow.classes.SupportClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("supports")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Supports")+".java", MainFlow.classes.SupportsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Skill")+".java", MainFlow.classes.SkillClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("skills")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Skills")+".java", MainFlow.classes.SkillsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("quests")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Quest")+".java", MainFlow.classes.QuestClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("behaviours")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("quests")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Quests")+".java", MainFlow.classes.QuestsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Aspect")+".java", MainFlow.classes.AspectClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("aspects")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Aspects")+".java", MainFlow.classes.AspectsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Items")+".java", MainFlow.classes.ItemsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("items")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Item")+".java", MainFlow.classes.ItemClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Affinity")+".java", MainFlow.classes.AffinityClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("affinities")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Affinities")+".java", MainFlow.classes.AffinitiesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Condition")+".java", MainFlow.classes.ConditionClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("conditions")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Conditions")+".java", MainFlow.classes.ConditionsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Trait")+".java", MainFlow.classes.TraitClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("mods")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("traits")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Traits")+".java", MainFlow.classes.TraitsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("relations")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("associations")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Association")+".java", MainFlow.classes.AssociationClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("relations")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("associations")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Associations")+".java", MainFlow.classes.AssociationsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("relations")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Relationship")+".java", MainFlow.classes.RelationshipClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("misc")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Int")+".java", MainFlow.classes.IntClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Entities")+".java", MainFlow.classes.EntitiesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("entities")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Entity")+".java", MainFlow.classes.EntityClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("EntryPoints")+".java", MainFlow.classes.EntryPointsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Tiles")+".java", MainFlow.classes.TilesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Tile")+".java", MainFlow.classes.TileClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Areas")+".java", MainFlow.classes.AreasClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Area")+".java", MainFlow.classes.AreaClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Environment")+".java", MainFlow.classes.EnvironmentClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Environments")+".java", MainFlow.classes.EnvironmentsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("environments")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Direction")+".java", MainFlow.classes.DirectionClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Events")+".java", MainFlow.classes.EventsClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("events")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Event")+".java", MainFlow.classes.EventClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Renderer")+".java", MainFlow.classes.RendererClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("InputHandler")+".java", MainFlow.classes.InputHandlerClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("images")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("ImageStates")+".java", MainFlow.classes.ImageStatesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("images")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Images")+".java", MainFlow.classes.ImagesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("images")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Colours")+".java", MainFlow.classes.ColoursClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("images")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Drawables")+".java", MainFlow.classes.DrawablesClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("images")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("ImageLoader")+".java", MainFlow.classes.ImageLoaderClass);
				__BUILDER__ = new StringBuilder();
	/*Enty*/new ExternalStatement(new StringEntry(MainFlow.variables.get_packageName().toString())).get(__BUILDER__);
				__BUILDER__.append(".");
				/*Name*/new ExternalStatement(new StringEntry("gui")).get(__BUILDER__);
	__DIRECTORY__ = new File(__ROOT_DIRECTORY__, __BUILDER__.toString().replace(".","/"));
	__DIRECTORY__.mkdirs();
	addFile(__DIRECTORY__,FlowController.camelize("Gui")+".java", MainFlow.classes.GuiClass);
				outputAll();
			}
			public void generateRoot(IToken rootToken){
			}
		}};
	}
	public static String __ROOT_DIRECTORY__ = ".";
	@Override
	public void initializeFlowController(){
	  MainFlow.variables = this;
	  MainFlow.methods = this;
	}
	public void setup(String rootDirectory){
		__ROOT_DIRECTORY__ = rootDirectory;
		ExternalClassEntry.suppliment("Math", "java.lang");
		ExternalClassEntry.suppliment("StringBuilder", "java.lang");
		ExternalClassEntry.suppliment("Thread", "java.lang");
		ExternalClassEntry.suppliment("Runnable", "java.lang");
		ExternalClassEntry.suppliment("Iterable", "java.lang");
		ExternalClassEntry.suppliment("Comparable", "java.lang");
		ExternalClassEntry.suppliment("Iterator", "java.util");
		ExternalClassEntry.suppliment("List", "java.util");
		ExternalClassEntry.suppliment("LinkedList", "java.util");
		ExternalClassEntry.suppliment("ArrayList", "java.util");
		ExternalClassEntry.suppliment("Arrays", "java.util");
		ExternalClassEntry.suppliment("Map", "java.util");
		ExternalClassEntry.suppliment("HashMap", "java.util");
		ExternalClassEntry.suppliment("Set", "java.util");
		ExternalClassEntry.suppliment("HashSet", "java.util");
		ExternalClassEntry.suppliment("TreeSet", "java.util");
		ExternalClassEntry.suppliment("Comparator", "java.util");
		ExternalClassEntry.suppliment("Scanner", "java.util");
		ExternalClassEntry.suppliment("Iterator", "java.util");
		ExternalClassEntry.suppliment("Collection", "java.util");
		ExternalClassEntry.suppliment("Collections", "java.util");
		ExternalClassEntry.suppliment("File", "java.io");
		ExternalClassEntry.suppliment("Entry", "com.rem.parser.generation");
		ExternalClassEntry.suppliment("ListEntry", "com.rem.parser.generation");
		ExternalClassEntry.suppliment("Generator", "com.rem.parser.generation");
		ExternalClassEntry.suppliment("IParser", "com.rem.parser.parser");
		ExternalClassEntry.suppliment("IToken", "com.rem.parser.token");
		ExternalClassEntry.suppliment("ParseContext", "com.rem.parser");
		ExternalClassEntry.suppliment("RegexParser", "com.rem.parser.parser");
		ExternalClassEntry.suppliment("Rules", "lists");
		ExternalClassEntry.suppliment("GeneralTokens", "lists");
		ExternalClassEntry.suppliment("Listnames", "lists");
		ExternalClassEntry.suppliment("JFrame", "javax.swing");
		ExternalClassEntry.suppliment("Graphics", "java.awt");
		ExternalClassEntry.suppliment("Random", "java.util");
		MainFlow.classes.ListenableClass.__INIT__();
		MainFlow.classes.SourceClass.__INIT__();
		MainFlow.classes.LoaddableClass.__INIT__();
		MainFlow.classes.TickableClass.__INIT__();
		MainFlow.classes.UsableClass.__INIT__();
		MainFlow.classes.RangeClass.__INIT__();
		MainFlow.classes.OperatorsClass.__INIT__();
		MainFlow.classes.EvaluableClass.__INIT__();
		MainFlow.classes.ListMapsClass.__INIT__();
		MainFlow.classes.CriteriaClass.__INIT__();
		MainFlow.classes.GameClass.__INIT__();
		MainFlow.classes.MenuClass.__INIT__();
		MainFlow.classes.TreasuryClass.__INIT__();
		MainFlow.classes.ActivityClass.__INIT__();
		MainFlow.classes.ActivitiesClass.__INIT__();
		MainFlow.classes.AttackClass.__INIT__();
		MainFlow.classes.AttacksClass.__INIT__();
		MainFlow.classes.SupportClass.__INIT__();
		MainFlow.classes.SupportsClass.__INIT__();
		MainFlow.classes.SkillClass.__INIT__();
		MainFlow.classes.SkillsClass.__INIT__();
		MainFlow.classes.QuestClass.__INIT__();
		MainFlow.classes.QuestsClass.__INIT__();
		MainFlow.classes.AspectClass.__INIT__();
		MainFlow.classes.AspectsClass.__INIT__();
		MainFlow.classes.ItemsClass.__INIT__();
		MainFlow.classes.ItemClass.__INIT__();
		MainFlow.classes.AffinityClass.__INIT__();
		MainFlow.classes.AffinitiesClass.__INIT__();
		MainFlow.classes.ConditionClass.__INIT__();
		MainFlow.classes.ConditionsClass.__INIT__();
		MainFlow.classes.TraitClass.__INIT__();
		MainFlow.classes.TraitsClass.__INIT__();
		MainFlow.classes.AssociationClass.__INIT__();
		MainFlow.classes.AssociationsClass.__INIT__();
		MainFlow.classes.RelationshipClass.__INIT__();
		MainFlow.classes.IntClass.__INIT__();
		MainFlow.classes.EntitiesClass.__INIT__();
		MainFlow.classes.EntityClass.__INIT__();
		MainFlow.classes.EntryPointsClass.__INIT__();
		MainFlow.classes.TilesClass.__INIT__();
		MainFlow.classes.TileClass.__INIT__();
		MainFlow.classes.AreasClass.__INIT__();
		MainFlow.classes.AreaClass.__INIT__();
		MainFlow.classes.EnvironmentClass.__INIT__();
		MainFlow.classes.EnvironmentsClass.__INIT__();
		MainFlow.classes.DirectionClass.__INIT__();
		MainFlow.classes.EventsClass.__INIT__();
		MainFlow.classes.EventClass.__INIT__();
		ExternalClassEntry.suppliment("LinkedList", "java.util");
		MainFlow.classes.RendererClass.__INIT__();
		MainFlow.classes.InputHandlerClass.__INIT__();
		ExternalClassEntry.suppliment("BufferedImage", "java.awt.image");
		ExternalClassEntry.suppliment("ImageIO", "javax.imageio");
		ExternalClassEntry.suppliment("ByteOrder", "java.nio");
		ExternalClassEntry.suppliment("ByteBuffer", "java.nio");
		ExternalClassEntry.suppliment("FloatBuffer", "java.nio");
		ExternalClassEntry.suppliment("IntBuffer", "java.nio");
		ExternalClassEntry.suppliment("GL11", "org.lwjgl.opengl");
		ExternalClassEntry.suppliment("GL12", "org.lwjgl.opengl");
		ExternalClassEntry.suppliment("GLU", "org.lwjgl.util.glu");
		ExternalClassEntry.suppliment("PixelGrabber", "java.awt.image");
		ExternalClassEntry.suppliment("DisplayMode", "org.lwjgl.opengl");
		ExternalClassEntry.suppliment("Display", "org.lwjgl.opengl");
		ExternalClassEntry.suppliment("Keyboard", "org.lwjgl.input");
		ExternalClassEntry.suppliment("Mouse", "org.lwjgl.input");
		ExternalClassEntry.suppliment("Cursor", "org.lwjgl.input");
		ExternalClassEntry.suppliment("Sys", "org.lwjgl");
		ExternalClassEntry.suppliment("PixelFormat", "org.lwjgl.opengl");
		MainFlow.classes.ImageStatesClass.__INIT__();
		MainFlow.classes.ImagesClass.__INIT__();
		MainFlow.classes.ColoursClass.__INIT__();
		MainFlow.classes.DrawablesClass.__INIT__();
		MainFlow.classes.ImageLoaderClass.__INIT__();
		MainFlow.classes.GuiClass.__INIT__();
		ExternalClassEntry.suppliment("HeroStats", "lists");
	}
	public void output(ParseContext data){
		ExternalImportEntry.solidify();
		getGenerators()[0].generate(data);
		for(Generator gen:privateFiles){
			gen.outputAll();
		}
		System.out.println("Output Complete");
	}

}