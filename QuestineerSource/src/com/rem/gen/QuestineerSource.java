package com.rem.gen;
import com.rem.gen.Entity;
import com.rem.gen.Conditions;
import com.rem.gen.Traits;
import com.rem.gen.Supports;
import com.rem.gen.Gui;
import com.rem.gen.Items;
import java.util.HashSet;
import com.rem.gen.Affinities;
import com.rem.gen.Quests;
import com.rem.gen.Associations;
import com.rem.gen.Treasury;
import com.rem.gen.Area;
import com.rem.gen.Game;
import com.rem.gen.Tiles;
import com.rem.gen.Environment;
import java.util.Set;
import com.rem.gen.ActivityTypes;
import com.rem.gen.Skills;
import com.rem.gen.Events;
import com.rem.gen.Activities;
import com.rem.gen.Tile;
import com.rem.gen.Environments;
import com.rem.gen.Aspects;
import com.rem.gen.Relationship;
import com.rem.gen.Attacks;
import com.rem.gen.QuestineerSource;
public class QuestineerSource {
	public static boolean running = true;
	public static String packageName = "com.rem.qstnr";
	public static Set<String> declaredCritSet = new HashSet<String>();
	public static Set<String> declaredListSet = new HashSet<String>();
	public static Set<String> declaredMapSet = new HashSet<String>();
	public static int INT_SIZE = 4;
	public static String finalImageStatesClassName = "final Gui.Image.States";
	public static String floatBufferArray = "FloatBuffer[][]";
	public static void main(String[] args){
		QuestineerSource.init();
		com.rem.lang.helpers.ParseControlPort.ruminate(QuestineerSource::isRunning,args,new com.rem.gen.parser.Parser(),QuestineerSource::setup,QuestineerSource::generate);
	}
	public static void init(){
		com.rem.lang.helpers.output.OutputClassStructure.suppliment("java.awt.image","BufferedImage");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("java.awt.image","PixelGrabber");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("javax.imageio","ImageIO");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("java.nio","ByteOrder");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("java.nio","ByteBuffer");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("java.nio","FloatBuffer");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("java.nio","IntBuffer");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl","Sys");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.opengl","GL11");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.opengl","GL12");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.opengl","DisplayMode");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.opengl","Display");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.opengl","PixelFormat");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.input","Keyboard");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.input","Mouse");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.input","Cursor");
com.rem.lang.helpers.output.OutputClassStructure.suppliment("org.lwjgl.util.glu","GLU");
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Templates.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Streamer.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Indexable.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Listenable.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Source.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Loaddable.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Tickable.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Usable.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Range.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(ListMaps.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Game.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Menu.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Treasury.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Activity.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Activities.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(ActivityType.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(ActivityTypes.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Attack.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Attacks.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Support.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Supports.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Skill.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Skills.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Quest.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Quests.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Aspect.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Aspects.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Items.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Item.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Affinity.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Affinities.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Condition.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Conditions.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Trait.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Traits.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Association.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Associations.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Relationship.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Int.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Entities.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Entity.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Terrain.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Terrains.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(EntryPoint.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Tiles.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Tile.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(EntryPointJoinable.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Areas.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(AreaSet.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Area.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Building.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Buildings.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Environment.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Environments.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Direction.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Events.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Event.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Renderer.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(InputHandler.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(ImageStates.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Images.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Colours.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Drawables.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(ImageLoader.OUTPUT);
com.rem.lang.helpers.output.OutputClassStructure.addOutputClass(Gui.OUTPUT);
;
	}
	public static boolean isRunning(){
		return running;
	}
	public static Boolean stop(){
		running=false;
		com.rem.lang.helpers.ParseControlPort.end();
		return true;
	}
	public static com.rem.lang.helpers.output.OutputBody getBodyElements(com.rem.gen.parser.Token elementsToken,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputBody result = new com.rem.lang.helpers.output.OutputBody();
		result.setParent(context);
		for(com.rem.gen.parser.Token element:elementsToken.getAllSafely(com.rem.gen.parser.Token.Id._body_element)){
			result.add(getBodyElement(element,result));
		}
		return result;
	}
	public static com.rem.lang.helpers.output.LineableOutput getBodyElement(com.rem.gen.parser.Token elementToken,com.rem.lang.helpers.output.OutputContext context){
		for(com.rem.gen.parser.Token element:elementToken.getAll()){
			switch(element.getName()){
				case _statement :{
					if(elementToken.get(com.rem.gen.parser.Token.Id._inline_if_statement)!=null){
						com.rem.lang.helpers.output.OutputBody body = new com.rem.lang.helpers.output.OutputBody();
						com.rem.lang.helpers.output.OutputBody previousBody = null;
						boolean isFirst = true;
						com.rem.lang.helpers.output.LineableOutput result = null;
						for(com.rem.gen.parser.Token bool:elementToken.get(com.rem.gen.parser.Token.Id._inline_if_statement).getAllSafely(com.rem.gen.parser.Token.Id._boolean_statement)){
							com.rem.lang.helpers.output.OutputBody currentBody = body;
							if(isFirst){
								if(elementToken.get(com.rem.gen.parser.Token.Id._inline_if_statement).get(com.rem.gen.parser.Token.Id._IF)!=null){
									if(elementToken.get(com.rem.gen.parser.Token.Id._inline_if_statement).get(com.rem.gen.parser.Token.Id._ELSE)!=null){
										result=new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(currentBody).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(getBooleanStatement(bool,context))));
									}
									else{
										result=new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(currentBody).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(getBooleanStatement(bool,context))));
									}
								}
								else{
									result=new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(currentBody).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(getBooleanStatement(bool,context))))));
								}
								isFirst=false;
							}
							else{
								previousBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(currentBody).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(getBooleanStatement(bool,context)))));
							}
							previousBody=body;
							body=new com.rem.lang.helpers.output.OutputBody();
						}
						previousBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(getStatement(element,context))));
						return result;
					}
					else{
						return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(getStatement(element,context)));
					}
				}
				case _return_statement :{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(getStatement(element,context)));
				}
				case _acquisition :{
					com.rem.lang.helpers.output.Output subject = getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context);
					return getAcquisition(element.get(com.rem.gen.parser.Token.Id._acquisition),true,subject,context);
				}
				case _imposition :{
					com.rem.lang.helpers.output.Output subject = getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context);
					Boolean doom = element.get(com.rem.gen.parser.Token.Id._imposition).get(com.rem.gen.parser.Token.Id._impose)!=null||element.get(com.rem.gen.parser.Token.Id._imposition).get(com.rem.gen.parser.Token.Id._PLUS)!=null;
					return Entity.getImposition(element.get(com.rem.gen.parser.Token.Id._imposition),doom,subject);
				}
				case _quest_addition :{
					return Quests.getAddition(element.get(com.rem.gen.parser.Token.Id._quest_addition),getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),context);
				}
				case _influence :{
					return Entity.getInfluence(element.get(com.rem.gen.parser.Token.Id._influence),getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),context);
				}
				case _activity_statement :{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(getActivityStatement(element,context)));
				}
				case _association_statement :{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(getAssociationStatement(element,context)));
				}
				case _spawn_statement :{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(getSpawnStatement(element,context)));
				}
				case _variable_declaration :{
					return getVariableDeclaration(element,context);
				}
				case _if_statement :{
					return getIfStatement(element,context);
				}
				case _for_statement :{
					return getForStatement(element,context);
				}
			}
		}
		return null;
	}
	public static com.rem.lang.helpers.output.LineableOutput getVariableDeclaration(com.rem.gen.parser.Token variableDeclarationToken,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputType type = getTypeName(variableDeclarationToken.get(com.rem.gen.parser.Token.Id._variable_header).get(com.rem.gen.parser.Token.Id._type_name));
		if(type==null){
			throw new RuntimeException(variableDeclarationToken.err()+"Could not find type:"+type.evaluate()+"!");
		}
		if(variableDeclarationToken.get(com.rem.gen.parser.Token.Id._statement)!=null){
			return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(type),new com.rem.lang.helpers.output.OutputExact(variableDeclarationToken.get(com.rem.gen.parser.Token.Id._variable_header).get(com.rem.gen.parser.Token.Id._variableName))).assign(getStatement(variableDeclarationToken.get(com.rem.gen.parser.Token.Id._statement),context))));
		}
		else{
			return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(type),new com.rem.lang.helpers.output.OutputExact(variableDeclarationToken.get(com.rem.gen.parser.Token.Id._variable_header).get(com.rem.gen.parser.Token.Id._variableName))).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))));
		}
	}
	public static com.rem.lang.helpers.output.OutputVariable getVariableFromHeader(com.rem.gen.parser.Token variableHeaderToken,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputType type = getTypeName(variableHeaderToken.get(com.rem.gen.parser.Token.Id._type_name));
		if(type==null){
			throw new RuntimeException(variableHeaderToken.err()+"Could not find type:"+type.evaluate()+"!");
		}
		return new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(type),new com.rem.lang.helpers.output.OutputExact(variableHeaderToken.get(com.rem.gen.parser.Token.Id._variableName)));
	}
	public static com.rem.lang.helpers.output.OutputVariable addVariableHeader(com.rem.gen.parser.Token variableHeaderToken,com.rem.lang.helpers.output.OutputClass inputClass){
		com.rem.lang.helpers.output.OutputType type = getTypeName(variableHeaderToken.get(com.rem.gen.parser.Token.Id._type_name));
		if(type==null){
			throw new RuntimeException(variableHeaderToken.err()+"Could not find type:"+type.evaluate()+"!");
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass(inputClass.getFullName()).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(type),new com.rem.lang.helpers.output.OutputExact(variableHeaderToken.get(com.rem.gen.parser.Token.Id._variableName))));
		return inputClass.getVariable((variableHeaderToken.get(com.rem.gen.parser.Token.Id._variableName)).toString());
	}
	public static com.rem.lang.helpers.output.LineableOutput getIfStatement(com.rem.gen.parser.Token ifStatementToken,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputConditionalHeader header = new com.rem.lang.helpers.output.OutputConditionalHeader();
		com.rem.lang.helpers.output.OutputConditionalHeader elseHeader = new com.rem.lang.helpers.output.OutputConditionalHeader();
		com.rem.lang.helpers.output.OutputBody body = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.OutputBody elseBody = new com.rem.lang.helpers.output.OutputBody();
		body.setParent(context);
		elseBody.setParent(context);
		Integer mode = 0;
		for(com.rem.gen.parser.Token element:ifStatementToken.getAll()){
			switch(element.getName()){
				case _boolean_statement :{
					header.call(getBooleanStatement(element,context));
					break;
				}
				case _body_element :{
					body.add(QuestineerSource.getBodyElement(element,body));
					break;
				}
				case _else_statement :{
					mode=1;
					for(com.rem.gen.parser.Token atom:element.getAll()){
						switch(atom.getName()){
							case _body_element :{
								elseBody.add(QuestineerSource.getBodyElement(atom,elseBody));
								break;
							}
							case _boolean_statement :{
								elseHeader.call(getBooleanStatement(atom,context));
								mode=2;
								break;
							}
						}
					}
					break;
				}
			}
		}
		if(mode==0){
			return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(body).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(header)));
		}
		else if(mode==1){
			return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(body).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(header))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(elseBody));
		}
		else if(mode==2){
			return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(body).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(header))).add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(elseBody).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(elseHeader)));
		}
		else{
			return null;
		}
	}
	public static com.rem.lang.helpers.output.LineableOutput getForStatement(com.rem.gen.parser.Token forStatementToken,com.rem.lang.helpers.output.OutputContext context){
		if(forStatementToken.get(com.rem.gen.parser.Token.Id._fromList)!=null){
			com.rem.gen.parser.Token variableHeaderToken = forStatementToken.get(com.rem.gen.parser.Token.Id._fromList).get(com.rem.gen.parser.Token.Id._variable_header);
			com.rem.lang.helpers.output.OutputType type = getTypeName(variableHeaderToken.get(com.rem.gen.parser.Token.Id._type_name));
			if(type==null){
				throw new RuntimeException(variableHeaderToken.err()+"Could not find type:"+type.evaluate()+"!");
			}
			context.addVariable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(type),new com.rem.lang.helpers.output.OutputExact(variableHeaderToken.get(com.rem.gen.parser.Token.Id._variableName))));
			com.rem.lang.helpers.output.Output right = getStatement(forStatementToken.get(com.rem.gen.parser.Token.Id._fromList).get(com.rem.gen.parser.Token.Id._statement),context);
			com.rem.lang.helpers.output.OutputBody body = QuestineerSource.getBodyElements(forStatementToken,context);
			return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("for").body(body).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(type),new com.rem.lang.helpers.output.OutputExact(variableHeaderToken.get(com.rem.gen.parser.Token.Id._variableName)))).separator(":").call(right)));
		}
		return null;
	}
	public static com.rem.lang.helpers.output.OutputOperator getBooleanStatement(com.rem.gen.parser.Token booleanStatement,com.rem.lang.helpers.output.OutputContext context){
		return getBooleanStatement(booleanStatement,false,context);
	}
	public static com.rem.lang.helpers.output.OutputOperator getBooleanStatement(com.rem.gen.parser.Token booleanStatement,Boolean negate,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputOperator operator = new com.rem.lang.helpers.output.OutputOperator();
		for(com.rem.gen.parser.Token element:booleanStatement.getAll()){
			switch(element.getName()){
				case _has_chance :{
					operator.add(getChance(element));
					break;
				}
				case _isA_statement :{
					operator.add(getIsAStatement(element,context));
					break;
				}
				case _spawned_statement :{
					operator.add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputQuote().set((element.get(com.rem.gen.parser.Token.Id._environmentName)).toString()),null).add(new com.rem.lang.helpers.output.OutputExact().set("equals"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("spawn"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getParent"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("getName"),new com.rem.lang.helpers.output.OutputArguments()))));
					break;
				}
				case _has_statement :{
					if(element.get(com.rem.gen.parser.Token.Id._NOT)==null){
						operator.add(getRequirement(element.get(com.rem.gen.parser.Token.Id._requirement),getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),negate));
					}
					else{
						operator.add(getRequirement(element.get(com.rem.gen.parser.Token.Id._requirement),getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),negate).negate());
					}
					break;
				}
				case _statement :{
					operator.add(getStatement(element,negate,context));
					break;
				}
				case _operator :{
					if((element).toString()=="&"){
						if(negate){
							operator.operator("||");
						}
						else{
							operator.operator("&&");
						}
					}
					else if((element).toString()=="|"){
						if(negate){
							operator.operator("&&");
						}
						else{
							operator.operator("||");
						}
					}
					break;
				}
			}
		}
		return operator.operatorlessIfSingle();
	}
	public static com.rem.lang.helpers.output.OutputOperator getIsAStatement(com.rem.gen.parser.Token element,com.rem.lang.helpers.output.OutputContext context){
		return new com.rem.lang.helpers.output.OutputOperator().left(getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context)).operator(" instanceof ").right(new com.rem.lang.helpers.output.OutputExact(getTypeName(element.get(com.rem.gen.parser.Token.Id._type_name))));
	}
	public static com.rem.lang.helpers.output.OutputOperator getRequirement(com.rem.gen.parser.Token requirementToken,com.rem.lang.helpers.output.CallableOutput candidate,Boolean showAsTrue){
		com.rem.lang.helpers.output.OutputOperator requireHeader = new com.rem.lang.helpers.output.OutputOperator().operatorlessIfSingle();
		if(showAsTrue){
			requireHeader.operator("||");
		}
		else{
			requireHeader.operator("&&");
		}
		for(com.rem.gen.parser.Token quanta:requirementToken.getAllSafely(com.rem.gen.parser.Token.Id._require_stat)){
			if(quanta.get(com.rem.gen.parser.Token.Id._NOT)!=null&&showAsTrue||quanta.get(com.rem.gen.parser.Token.Id._NOT)==null&& !showAsTrue){
				requireHeader.add(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact("get"+com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._hero_stat)).toString().toLowerCase())),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("getValue"),new com.rem.lang.helpers.output.OutputArguments())).operator(negateOperator((quanta.get(com.rem.gen.parser.Token.Id._ORDINAL)).toString())).right(new com.rem.lang.helpers.output.OutputExact((quanta.get(com.rem.gen.parser.Token.Id._INTEGER)).toString())));
			}
			else{
				requireHeader.add(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact("get"+com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._hero_stat)).toString().toLowerCase())),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("getValue"),new com.rem.lang.helpers.output.OutputArguments())).operator((quanta.get(com.rem.gen.parser.Token.Id._ORDINAL)).toString()).right(new com.rem.lang.helpers.output.OutputExact((quanta.get(com.rem.gen.parser.Token.Id._INTEGER)).toString())));
			}
		}
		for(com.rem.gen.parser.Token quanta:requirementToken.getAllSafely(com.rem.gen.parser.Token.Id._require_skill)){
			if(quanta.get(com.rem.gen.parser.Token.Id._NOT)!=null!=showAsTrue){
				com.rem.lang.helpers.output.CallableOutput innerHead = new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(Skills.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._skill_names)).toString()))));
				requireHeader.add(innerHead.negate());
			}
			else{
				requireHeader.add(new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(Skills.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._skill_names)).toString())))));
			}
		}
		for(com.rem.gen.parser.Token quanta:requirementToken.getAllSafely(com.rem.gen.parser.Token.Id._require_trait)){
			if(quanta.get(com.rem.gen.parser.Token.Id._NOT)!=null!=showAsTrue){
				com.rem.lang.helpers.output.CallableOutput innerHead = new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(Traits.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._trait_names)).toString()))));
				requireHeader.add(innerHead.negate());
			}
			else{
				requireHeader.add(new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(Traits.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._trait_names)).toString())))));
			}
		}
		for(com.rem.gen.parser.Token quanta:requirementToken.getAllSafely(com.rem.gen.parser.Token.Id._require_attack)){
			if(quanta.get(com.rem.gen.parser.Token.Id._NOT)!=null!=showAsTrue){
				com.rem.lang.helpers.output.CallableOutput innerHead = new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(Attacks.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._attack_names)).toString()))));
				requireHeader.add(innerHead.negate());
			}
			else{
				requireHeader.add(new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(Attacks.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._attack_names)).toString())))));
			}
		}
		for(com.rem.gen.parser.Token quanta:requirementToken.getAllSafely(com.rem.gen.parser.Token.Id._require_association)){
			com.rem.lang.helpers.output.Output id;
			if(quanta.get(com.rem.gen.parser.Token.Id._association_names)!=null){
				id=Associations.getId(com.rem.lang.helpers.output.OutputHelper.camelize((quanta.get(com.rem.gen.parser.Token.Id._association_names)).toString()));
			}
			else{
				id=new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(quanta.get(com.rem.gen.parser.Token.Id._variableName)),null).add(new com.rem.lang.helpers.output.OutputExact().set("getId"),new com.rem.lang.helpers.output.OutputArguments());
			}
			if(quanta.get(com.rem.gen.parser.Token.Id._NOT)!=null!=showAsTrue){
				com.rem.lang.helpers.output.CallableOutput innerHead = new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(id));
				requireHeader.add(innerHead.negate());
			}
			else{
				requireHeader.add(new com.rem.lang.helpers.output.OutputCall().add(candidate,null).add(new com.rem.lang.helpers.output.OutputExact().set("has"),new com.rem.lang.helpers.output.OutputArguments().add(id)));
			}
		}
		return requireHeader;
	}
	public static com.rem.lang.helpers.output.OutputArguments getMethodArguments(com.rem.gen.parser.Token element,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputArguments arguments = new com.rem.lang.helpers.output.OutputArguments();
		for(com.rem.gen.parser.Token args:element.getAllSafely(com.rem.gen.parser.Token.Id._method_arguments)){
			for(com.rem.gen.parser.Token atom:args.getAllSafely(com.rem.gen.parser.Token.Id._statement)){
				arguments.add(getStatement(atom,context));
			}
		}
		return arguments;
	}
	public static com.rem.lang.helpers.output.CallableOutput getActivityStatement(com.rem.gen.parser.Token element,com.rem.lang.helpers.output.OutputContext context){
		return new com.rem.lang.helpers.output.OutputCall().add(getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),null).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._method)),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activities")).add(com.rem.lang.helpers.output.OutputHelper.camelize(element.get(com.rem.gen.parser.Token.Id._activity_names))),new com.rem.lang.helpers.output.OutputArguments().add(QuestineerSource.getMethodArguments(element,context)))));
	}
	public static com.rem.lang.helpers.output.Output getAssociationStatement(com.rem.gen.parser.Token element,com.rem.lang.helpers.output.OutputContext context){
		return new com.rem.lang.helpers.output.OutputCall().add(getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),null).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._method)),new com.rem.lang.helpers.output.OutputArguments().add(getStatement(element.get(com.rem.gen.parser.Token.Id._recruiter).get(com.rem.gen.parser.Token.Id._statement),context)).add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Associations")).add(com.rem.lang.helpers.output.OutputHelper.camelize(element.get(com.rem.gen.parser.Token.Id._association_names))),new com.rem.lang.helpers.output.OutputArguments().add(QuestineerSource.getMethodArguments(element,context)))));
	}
	public static com.rem.lang.helpers.output.CallableOutput getSpawnStatement(com.rem.gen.parser.Token element,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.Output adder = Environments.getId((element.get(com.rem.gen.parser.Token.Id._map_names)).toString());
		if(element.get(com.rem.gen.parser.Token.Id._tile_names)!=null){
			boolean isFirst = true;
			for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._tile_names)){
				com.rem.lang.helpers.output.Output current = adder;
				if(isFirst){
					adder=new com.rem.lang.helpers.output.OutputCall().add(current,null).add(new com.rem.lang.helpers.output.OutputExact().set("getRandomTile"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Tiles")).add(element.get(com.rem.gen.parser.Token.Id._map_names)).add(atom),new com.rem.lang.helpers.output.OutputExact().set("id"))));
				}
				else{
					adder=new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputBraced().set(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Tiles")).add(new com.rem.lang.helpers.output.OutputExact().set("EntryPoint"))).subject(current))).operator(".").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getSisterArea"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("getRandomTile"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Tiles")).add(element.get(com.rem.gen.parser.Token.Id._map_names)).add(atom),new com.rem.lang.helpers.output.OutputExact().set("id")))));
				}
				isFirst=false;
			}
		}
		else if(element.get(com.rem.gen.parser.Token.Id._upperBoundX)!=null&&element.get(com.rem.gen.parser.Token.Id._upperBoundY)!=null){
			com.rem.lang.helpers.output.Output current = adder;
			adder=new com.rem.lang.helpers.output.OutputCall().add(current,null).add(new com.rem.lang.helpers.output.OutputExact().set("getTile"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getRandom"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundX))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._upperBoundX)))))).add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getRandom"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundY))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._upperBoundY)))))));
		}
		else if(element.get(com.rem.gen.parser.Token.Id._upperBoundX)!=null){
			com.rem.lang.helpers.output.Output current = adder;
			adder=new com.rem.lang.helpers.output.OutputCall().add(current,null).add(new com.rem.lang.helpers.output.OutputExact().set("getTile"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getRandom"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundX))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._upperBoundX)))))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundY))));
		}
		else if(element.get(com.rem.gen.parser.Token.Id._upperBoundX)!=null){
			com.rem.lang.helpers.output.Output current = adder;
			adder=new com.rem.lang.helpers.output.OutputCall().add(current,null).add(new com.rem.lang.helpers.output.OutputExact().set("getTile"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundX))).add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getRandom"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundY))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._upperBoundY)))))));
		}
		else{
			com.rem.lang.helpers.output.Output current = adder;
			adder=new com.rem.lang.helpers.output.OutputCall().add(current,null).add(new com.rem.lang.helpers.output.OutputExact().set("getTile"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundX))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._lowerBoundY))));
		}
		com.rem.lang.helpers.output.Output current = adder;
		return new com.rem.lang.helpers.output.OutputCall().add(getVariableCall(element.get(com.rem.gen.parser.Token.Id._variable_call),context),null).add(new com.rem.lang.helpers.output.OutputExact().set("spawnAt"),new com.rem.lang.helpers.output.OutputArguments().add(current));
	}
	public static com.rem.lang.helpers.output.Output getStatement(com.rem.gen.parser.Token statementToken,com.rem.lang.helpers.output.OutputContext context){
		return getStatement(statementToken,false,context);
	}
	public static com.rem.lang.helpers.output.OutputOperator getStatement(com.rem.gen.parser.Token statementToken,Boolean initialNegate,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputOperator ret = new com.rem.lang.helpers.output.OutputOperator();
		Boolean negate = initialNegate;
		for(com.rem.gen.parser.Token element:statementToken.getAll()){
			switch(element.getName()){
				case _NOT :{
					negate=!negate;
					break;
				}
				case _variable_call :{
					ret.add(getVariableCall(element,context));
					break;
				}
				case _activity_statement :{
					ret.add(QuestineerSource.getActivityStatement(element,context));
					break;
				}
				case _statement :{
					ret.add(QuestineerSource.getStatement(element,context));
					break;
				}
				case _entity_selector :{
					ret.add(Entity.getSelector(element.get(com.rem.gen.parser.Token.Id._entity_id_choice)));
					break;
				}
				case _map_selector :{
					if(element.get(com.rem.gen.parser.Token.Id._tile_id_choice).get(com.rem.gen.parser.Token.Id._index)!=null){
						ret.add(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Gui")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("game"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getEnvironments"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact("get"+(element.get(com.rem.gen.parser.Token.Id._map_names)).toString()),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("getAreas"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._tile_id_choice).get(com.rem.gen.parser.Token.Id._index))))));
					}
					else{
						ret.add(Tiles.getSelector((element.get(com.rem.gen.parser.Token.Id._map_names)).toString(),null,element.get(com.rem.gen.parser.Token.Id._tile_id_choice)));
					}
					break;
				}
				case _operator :{
					if(negate){
						ret.operator(negateOperator((element).toString()));
					}
					else{
						ret.operator((element).toString());
					}
					break;
				}
				case _braced_statement :{
					ret.add(new com.rem.lang.helpers.output.OutputBraced(QuestineerSource.getStatement(element,context)));
					break;
				}
			}
		}
		if(ret.isSingle()&&negate){
			return ret.negate();
		}
		else{
			return ret;
		}
	}
	public static com.rem.lang.helpers.output.CallableOutput getVariableCall(com.rem.gen.parser.Token variableCallToken,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputContext currentContext = context;
		com.rem.lang.helpers.output.OutputCall ret = new com.rem.lang.helpers.output.OutputCall();
		for(com.rem.gen.parser.Token element:variableCallToken.getAll()){
			switch(element.getName()){
				case _range :{
					ret.add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._left))).add(new com.rem.lang.helpers.output.OutputExact(element.get(com.rem.gen.parser.Token.Id._right)))));
					break;
				}
				case _braced_statement :{
					ret.add(new com.rem.lang.helpers.output.OutputBraced(QuestineerSource.getStatement(element,context)));
					break;
				}
				case _exact :{
					if(element.get(com.rem.gen.parser.Token.Id._FLOAT)!=null){
						ret.add(new com.rem.lang.helpers.output.OutputExact((element).toString()+"f"));
					}
					else{
						ret.add(new com.rem.lang.helpers.output.OutputExact(element));
					}
					break;
				}
				case _quote :{
					ret.add(new com.rem.lang.helpers.output.OutputQuote().set((element).toString()));
					break;
				}
				case _variable_group :{
					ret.add(getIdFromName(element));
					break;
				}
				case _cast :{
					com.rem.lang.helpers.output.OutputType type = getTypeName(element.get(com.rem.gen.parser.Token.Id._type_name));
					if(type==null){
						throw new RuntimeException("Could not find "+(type.evaluate()).toString()+" type in context!");
					}
					ret.add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(type)).subject(QuestineerSource.getStatement(element.get(com.rem.gen.parser.Token.Id._statement),context)));
					break;
				}
				case _access_static :{
					com.rem.lang.helpers.output.OutputType type = getTypeName(element.get(com.rem.gen.parser.Token.Id._type_name));
					if(type==null){
						throw new RuntimeException("Could not find "+(type.evaluate()).toString()+" type in context!");
					}
					String variableName = (element.get(com.rem.gen.parser.Token.Id._variableName)).toString();
					if(!type.getAsClass().hasVariableInContext(variableName)){
						throw new RuntimeException("Could not find "+(variableName).toString()+" variable in context!");
					}
					ret.add(new com.rem.lang.helpers.output.OutputCall().add(type,null).add(new com.rem.lang.helpers.output.OutputExact(variableName),null));
					break;
				}
				case _variableName :{
					if(!currentContext.hasVariableInContext((element).toString())){
						if(!currentContext.hasVariableInContext("event")){
							if(!currentContext.hasMethodInContext(com.rem.lang.helpers.output.OutputHelper.asGetMethod(element))){
								throw new RuntimeException("Could not find "+(element).toString()+" variable in context!");
							}
							else{
								com.rem.lang.helpers.output.OutputMethod method = currentContext.getMethodFromContext((com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)).toString());
								currentContext=method.getType().getAsClass();
								com.rem.lang.helpers.output.CallableOutput call = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)),new com.rem.lang.helpers.output.OutputArguments());
								if(method.getOnCallEndsWith()!=null){
									call.setOnEnd(method.getOnCallEndsWith());
								}
								ret.add(call);
							}
						}
						else{
							com.rem.lang.helpers.output.OutputContext originalContext = currentContext;
							currentContext=currentContext.getVariableFromContext("event").getType().getAsClass();
							if(!currentContext.hasVariableInContext((element).toString())){
								if(!originalContext.hasMethodInContext((com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)).toString())){
									throw new RuntimeException("Could not find "+(element).toString()+" variable in context!");
								}
								else{
									com.rem.lang.helpers.output.OutputMethod method = currentContext.getMethodFromContext((com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)).toString());
									currentContext=method.getType().getAsClass();
									com.rem.lang.helpers.output.CallableOutput call = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)),new com.rem.lang.helpers.output.OutputArguments());
									if(method.getOnCallEndsWith()!=null){
										call.setOnEnd(method.getOnCallEndsWith());
									}
									ret.add(call);
								}
							}
							else{
								currentContext=currentContext.getVariableFromContext((element).toString()).getType().getAsClass();
								ret.add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact(com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)),new com.rem.lang.helpers.output.OutputArguments()));
							}
						}
					}
					else{
						if(ret.isEmpty()){
							currentContext=currentContext.getVariableFromContext((element).toString()).getType().getAsClass();
							ret.add(new com.rem.lang.helpers.output.OutputExact((element).toString()));
						}
						else{
							com.rem.lang.helpers.output.CallableOutput call = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)),new com.rem.lang.helpers.output.OutputArguments());
							com.rem.lang.helpers.output.OutputMethod method = currentContext.getMethodFromContext((com.rem.lang.helpers.output.OutputHelper.asGetMethod(element)).toString());
							currentContext=method.getType().getAsClass();
							if(method.getOnCallEndsWith()!=null){
								call.setOnEnd(method.getOnCallEndsWith());
							}
							ret.add(call);
						}
					}
					break;
				}
				case _method :{
					com.rem.lang.helpers.output.OutputArguments parameters = new com.rem.lang.helpers.output.OutputArguments();
					if(element.get(com.rem.gen.parser.Token.Id._method_arguments)!=null){
						for(com.rem.gen.parser.Token atom:element.get(com.rem.gen.parser.Token.Id._method_arguments).getAllSafely(com.rem.gen.parser.Token.Id._statement)){
							parameters.add(QuestineerSource.getStatement(atom,context));
						}
					}
					if(element.get(com.rem.gen.parser.Token.Id._NEW)!=null){
						com.rem.lang.helpers.output.OutputType methodName = getTypeName(element.get(com.rem.gen.parser.Token.Id._type_name));
						currentContext=methodName.getAsClass();
						if(currentContext==null){
							throw new RuntimeException("Could not find "+methodName+" type in context!");
						}
						ret.add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(methodName),new com.rem.lang.helpers.output.OutputArguments().add(parameters)));
					}
					else{
						String methodName = (element.get(com.rem.gen.parser.Token.Id._methodName)).toString();
						if(!currentContext.hasMethodInContext(methodName)){
							throw new RuntimeException("Could not find "+(element).toString()+" method in context!");
						}
						com.rem.lang.helpers.output.OutputMethod method = currentContext.getMethodFromContext(methodName);
						currentContext=method.getType().getAsClass();
						com.rem.lang.helpers.output.CallableOutput call = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(methodName),new com.rem.lang.helpers.output.OutputArguments().add(parameters));
						if(method.getOnCallEndsWith()!=null){
							call.setOnEnd(method.getOnCallEndsWith());
						}
						ret.add(call);
					}
					break;
				}
			}
		}
		return ret;
	}
	public static com.rem.lang.helpers.output.Output getIdFromName(com.rem.gen.parser.Token nameToken){
		for(com.rem.gen.parser.Token element:nameToken.getAll()){
			switch(element.getName()){
				case _map_names :{
					return Environments.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _association_names :{
					return Associations.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _affinity_names :{
					return Affinities.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _condition_names :{
					return Conditions.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _skill_names :{
					return Skills.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _trait_names :{
					return Traits.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _activity_names :{
					return Activities.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
				case _activity_type_names :{
					return ActivityTypes.getId(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString()));
				}
			}
		}
		return null;
	}
	public static com.rem.lang.helpers.output.LineableOutput getAcquisition(com.rem.gen.parser.Token acquisitionToken,Boolean forGainBody,com.rem.lang.helpers.output.Output subject,com.rem.lang.helpers.output.OutputContext context){
		com.rem.lang.helpers.output.OutputContext source;
		String sourceName;
		if(acquisitionToken.get(com.rem.gen.parser.Token.Id._source_name)!=null){
			sourceName=(acquisitionToken.get(com.rem.gen.parser.Token.Id._source_name)).toString();
		}
		else{
			sourceName="this";
		}
		if(!context.hasVariableInContext(sourceName)){
			throw new RuntimeException("Could not find "+sourceName+" source in context!");
		}
		source=context.getVariableFromContext(sourceName).getType().getAsClass();
		com.rem.lang.helpers.output.Output gainObj;
		com.rem.lang.helpers.output.Output id;
		if(acquisitionToken.get(com.rem.gen.parser.Token.Id._THIS)!=null){
			gainObj=new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("clone"),new com.rem.lang.helpers.output.OutputArguments());
			id=new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("id"),null);
		}
		else if(acquisitionToken.get(com.rem.gen.parser.Token.Id._aspect_names)!=null){
			String className = com.rem.lang.helpers.output.OutputHelper.camelize((acquisitionToken.get(com.rem.gen.parser.Token.Id._aspect_names)).toString());
			gainObj=new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Aspects")).add(className),new com.rem.lang.helpers.output.OutputArguments());
			id=new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Aspects")).add(className),new com.rem.lang.helpers.output.OutputExact().set("id"));
		}
		else if(acquisitionToken.get(com.rem.gen.parser.Token.Id._trait_names)!=null){
			String className = com.rem.lang.helpers.output.OutputHelper.camelize((acquisitionToken.get(com.rem.gen.parser.Token.Id._trait_names)).toString());
			gainObj=new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Traits")).add(className),new com.rem.lang.helpers.output.OutputArguments());
			id=new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Traits")).add(className),new com.rem.lang.helpers.output.OutputExact().set("id"));
		}
		else if(acquisitionToken.get(com.rem.gen.parser.Token.Id._attack_names)!=null){
			String className = com.rem.lang.helpers.output.OutputHelper.camelize((acquisitionToken.get(com.rem.gen.parser.Token.Id._attack_names)).toString());
			gainObj=new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Attacks")).add(className),new com.rem.lang.helpers.output.OutputArguments());
			id=new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Attacks")).add(className),new com.rem.lang.helpers.output.OutputExact().set("id"));
		}
		else if(acquisitionToken.get(com.rem.gen.parser.Token.Id._condition_names)!=null){
			String className = com.rem.lang.helpers.output.OutputHelper.camelize((acquisitionToken.get(com.rem.gen.parser.Token.Id._condition_names)).toString());
			gainObj=new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Conditions")).add(className),new com.rem.lang.helpers.output.OutputArguments());
			id=new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Conditions")).add(className),new com.rem.lang.helpers.output.OutputExact().set("id"));
		}
		else if(acquisitionToken.get(com.rem.gen.parser.Token.Id._item_names)!=null){
			String className = com.rem.lang.helpers.output.OutputHelper.camelize((acquisitionToken.get(com.rem.gen.parser.Token.Id._item_names)).toString());
			gainObj=new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Items")).add(className),new com.rem.lang.helpers.output.OutputArguments());
			id=new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Items")).add(className),new com.rem.lang.helpers.output.OutputExact().set("id"));
		}
		else{
			gainObj=null;
			id=null;
		}
		if(acquisitionToken.get(com.rem.gen.parser.Token.Id._operator).get(com.rem.gen.parser.Token.Id._GAINS)!=null){
			if(forGainBody){
				if(acquisitionToken.get(com.rem.gen.parser.Token.Id._item_names)!=null){
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("equip"),new com.rem.lang.helpers.output.OutputArguments().add(gainObj))));
				}
				else{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("gain"),new com.rem.lang.helpers.output.OutputArguments().add(gainObj).add(new com.rem.lang.helpers.output.OutputExact(sourceName)))));
				}
			}
			else{
				if(acquisitionToken.get(com.rem.gen.parser.Token.Id._item_names)!=null){
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("unequip"),new com.rem.lang.helpers.output.OutputArguments().add(gainObj))));
				}
				else{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("lose"),new com.rem.lang.helpers.output.OutputArguments().add(id).add(new com.rem.lang.helpers.output.OutputExact(sourceName)))));
				}
			}
		}
		else{
			if(forGainBody){
				if(acquisitionToken.get(com.rem.gen.parser.Token.Id._item_names)!=null){
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("unequip"),new com.rem.lang.helpers.output.OutputArguments().add(gainObj))));
				}
				else{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("lose"),new com.rem.lang.helpers.output.OutputArguments().add(id).add(new com.rem.lang.helpers.output.OutputExact(sourceName)))));
				}
			}
			else{
				if(acquisitionToken.get(com.rem.gen.parser.Token.Id._item_names)!=null){
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("equip"),new com.rem.lang.helpers.output.OutputArguments().add(gainObj))));
				}
				else{
					return new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(subject,null).add(new com.rem.lang.helpers.output.OutputExact().set("gain"),new com.rem.lang.helpers.output.OutputArguments().add(gainObj).add(new com.rem.lang.helpers.output.OutputExact(sourceName)))));
				}
			}
		}
	}
	public static com.rem.lang.helpers.output.CallableOutput primeRange(com.rem.gen.parser.Token rangeToken){
		String left = (rangeToken.get(com.rem.gen.parser.Token.Id._left)).toString();
		String right = (rangeToken.get(com.rem.gen.parser.Token.Id._right)).toString();
		if(rangeToken.get(com.rem.gen.parser.Token.Id._percent)!=null){
			left=percentify(left);
			right=percentify(right);
		}
		return new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(left+"f")).add(new com.rem.lang.helpers.output.OutputExact(right+"f")));
	}
	public static com.rem.lang.helpers.output.CallableOutput getChance(com.rem.gen.parser.Token chanceToken){
		return new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Range")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("chance"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact(Double.parseDouble((chanceToken).toString())/100.0))));
	}
	public static void createListMap(com.rem.lang.helpers.output.OutputClass leftClass,com.rem.lang.helpers.output.OutputClass rightClass){
		String leftName = leftClass.getName().evaluate()+"s";
		String rightName = rightClass.getName().evaluate();
		String rightFullName = rightClass.getPackageName().evaluate()+"."+rightClass.getFullName().evaluate();
		String fullName = "Maps."+leftName+"."+rightName;
		if(declaredListSet.add(fullName)){
			if(com.rem.lang.helpers.output.OutputClassStructure.getClass("ListMaps").getEnclosedClass((leftName).toString())==null){
				com.rem.lang.helpers.output.OutputClassStructure.getClass("ListMaps").encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact(leftName)).extendType(null));
			}
			com.rem.lang.helpers.output.OutputClassStructure.getClass("ListMaps").getEnclosedClass((leftName).toString()).encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact(rightName)).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("HashMap")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(leftClass.getFullName())).add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("LinkedList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName)))))).implement(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Iterable")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName)))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("LinkedList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName))),new com.rem.lang.helpers.output.OutputExact().set("completeList")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("LinkedList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName))),new com.rem.lang.helpers.output.OutputArguments()))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Iterator")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName))),new com.rem.lang.helpers.output.OutputExact().set("iterator")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("completeList"),null).add(new com.rem.lang.helpers.output.OutputExact().set("iterator"),new com.rem.lang.helpers.output.OutputArguments()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("LinkedList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName))),new com.rem.lang.helpers.output.OutputExact().set("getFrom")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(leftClass.getFullName()),new com.rem.lang.helpers.output.OutputExact().set("key")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("add")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(leftClass),new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(rightFullName),new com.rem.lang.helpers.output.OutputExact().set("element")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("put"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key")).add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("LinkedList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName))),new com.rem.lang.helpers.output.OutputArguments())))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("true")).operator("&& !").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("containsKey"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("completeList"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("element"))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("element"))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("removeLast")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(leftClass),new com.rem.lang.helpers.output.OutputExact().set("key")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("completeList"),null).add(new com.rem.lang.helpers.output.OutputExact().set("remove"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputExact().set("removeLast"),new com.rem.lang.helpers.output.OutputArguments())))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("containsKey"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key")))).operator("&& !").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputExact().set("isEmpty"),new com.rem.lang.helpers.output.OutputArguments()))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("removeAll")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(leftClass),new com.rem.lang.helpers.output.OutputExact().set("key")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("completeList"),null).add(new com.rem.lang.helpers.output.OutputExact().set("removeAll"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputExact().set("clear"),new com.rem.lang.helpers.output.OutputArguments())))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("containsKey"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key")))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("remove")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(leftClass),new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(rightFullName),new com.rem.lang.helpers.output.OutputExact().set("element")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("super"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("key"))).add(new com.rem.lang.helpers.output.OutputExact().set("remove"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("element"))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("completeList"),null).add(new com.rem.lang.helpers.output.OutputExact().set("remove"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("element"))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(rightFullName))),new com.rem.lang.helpers.output.OutputExact().set("getAll")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("completeList"))))));
		}
	}
	public static void createIdMap(com.rem.lang.helpers.output.OutputClass idClass,com.rem.lang.helpers.output.OutputClass parentClass){
		createIdMap(idClass,new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getId"),new com.rem.lang.helpers.output.OutputArguments()),parentClass);
	}
	public static void createIdMap(com.rem.lang.helpers.output.OutputClass idClass,com.rem.lang.helpers.output.Output getIdStatement,com.rem.lang.helpers.output.OutputClass parentClass){
		String idName = idClass.getName().evaluate()+"Map";
		String fullName = idClass.getName()+"Maps."+idName+"."+parentClass.getName();
		String parentClassList = "java.util.List<"+parentClass.getName().evaluate()+">";
		if(declaredMapSet.add(fullName)){
			com.rem.lang.helpers.output.OutputClassStructure.getClass(parentClass.getFullName()).encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact(idName)).extendType(null).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Map")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(idClass)).add(new com.rem.lang.helpers.output.OutputType().add(parentClassList))),new com.rem.lang.helpers.output.OutputExact().set("map")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("HashMap")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(idClass)).add(new com.rem.lang.helpers.output.OutputType().add(parentClassList))),new com.rem.lang.helpers.output.OutputArguments()))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("add")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(parentClass),new com.rem.lang.helpers.output.OutputExact().set("addObject")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("synchronized").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("put"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(idClass)).subject(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("addObject"),null).add(getIdStatement,null))).add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("ArrayList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(parentClass))),new com.rem.lang.helpers.output.OutputArguments())))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("containsKey"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(idClass)).subject(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("addObject"),null).add(getIdStatement,null))))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("false"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(idClass)).subject(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("addObject"),null).add(getIdStatement,null)))).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("addObject")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("this")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(parentClass),new com.rem.lang.helpers.output.OutputExact().set("get")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(idClass),new com.rem.lang.helpers.output.OutputExact().set("id"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(parentClass).add(new com.rem.lang.helpers.output.OutputExact().set("Factory")),new com.rem.lang.helpers.output.OutputExact().set("factory")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("synchronized").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(parentClass))),new com.rem.lang.helpers.output.OutputExact().set("result")).assign(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("id")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("result")).operator("=").right(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("ArrayList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(parentClass))),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("put"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("id")).add(new com.rem.lang.helpers.output.OutputExact().set("result"))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(parentClass),new com.rem.lang.helpers.output.OutputExact().set("newObject")).assign(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("factory"),null).add(new com.rem.lang.helpers.output.OutputExact().set("create"),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("result"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("newObject"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("newObject")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("result")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("null"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(parentClass),new com.rem.lang.helpers.output.OutputExact().set("newObject")).assign(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("factory"),null).add(new com.rem.lang.helpers.output.OutputExact().set("create"),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("result"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("newObject"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("newObject")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("result"),null).add(new com.rem.lang.helpers.output.OutputExact().set("isEmpty"),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("result"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("0")))))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("this")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(parentClass),new com.rem.lang.helpers.output.OutputExact().set("get")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(idClass),new com.rem.lang.helpers.output.OutputExact().set("findId")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("synchronized").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(parentClass))),new com.rem.lang.helpers.output.OutputExact().set("result")).assign(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("findId")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("result"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("0")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("result")).operator("!=").right(new com.rem.lang.helpers.output.OutputExact().set("null"))).operator("&&").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("result"),null).add(new com.rem.lang.helpers.output.OutputExact().set("isEmpty"),new com.rem.lang.helpers.output.OutputArguments()))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("false"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("this")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(parentClass))),new com.rem.lang.helpers.output.OutputExact().set("getAll")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(idClass),new com.rem.lang.helpers.output.OutputExact().set("findId")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("synchronized").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("findId")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("this")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("has")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(idClass),new com.rem.lang.helpers.output.OutputExact().set("findId")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("synchronized").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("containsKey"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("findId")))).operator("&&").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("findId"))).add(new com.rem.lang.helpers.output.OutputExact().set("isEmpty"),new com.rem.lang.helpers.output.OutputArguments()))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("false"))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("this")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("remove")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(parentClass),new com.rem.lang.helpers.output.OutputExact().set("addObject")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("synchronized").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(idClass)).subject(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("addObject"),null).add(getIdStatement,null)))).add(new com.rem.lang.helpers.output.OutputExact().set("remove"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("addObject")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("map"),null).add(new com.rem.lang.helpers.output.OutputExact().set("containsKey"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(idClass)).subject(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("addObject"),null).add(getIdStatement,null))))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("this")))))));
		}
	}
	public static String percentify(String input){
		Double result = Double.parseDouble(input)/100.0;
		return (result).toString();
	}
	public static String percentify(com.rem.gen.parser.Token input){
		return QuestineerSource.percentify((input).toString());
	}
	public static String negateOperator(String operator){
		if("==".equals(operator)){
			return "!=";
		}
		else if("!=".equals(operator)){
			return "==";
		}
		else if("<".equals(operator)){
			return ">=";
		}
		else if("<=".equals(operator)){
			return ">";
		}
		else if(">".equals(operator)){
			return "<=";
		}
		else if(">=".equals(operator)){
			return "<";
		}
		else if("&&".equals(operator)){
			return "||";
		}
		else if("||".equals(operator)){
			return "&&";
		}
		else{
			return "COULD NOT NEGATE ("+operator+")";
		}
	}
	public static void setupGui(){
		Gui.setup();
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("StringBuilder")),new com.rem.lang.helpers.output.OutputExact().set("_log")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("StringBuilder")),new com.rem.lang.helpers.output.OutputArguments())));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("log")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("toLog")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("_log"),null).add(new com.rem.lang.helpers.output.OutputExact().set("append"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("toLog"))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("_log"),null).add(new com.rem.lang.helpers.output.OutputExact().set("append"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set("\\n")))))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("finishedKey")).assign(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Keyboard")),new com.rem.lang.helpers.output.OutputExact().set("KEY_ESCAPE"))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("window_title")).assign(new com.rem.lang.helpers.output.OutputQuote().set("OpenGL Window")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("VSyncEnabled")).assign(new com.rem.lang.helpers.output.OutputExact().set("true")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("useCurrentDisplay")).assign(new com.rem.lang.helpers.output.OutputExact().set("false")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("fullScreen")).assign(new com.rem.lang.helpers.output.OutputExact().set("false")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("showMessages")).assign(new com.rem.lang.helpers.output.OutputExact().set("true")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("displayWidth")).assign(new com.rem.lang.helpers.output.OutputExact().set("1024")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("displayHeight")).assign(new com.rem.lang.helpers.output.OutputExact().set("786")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("displayColorBits")).assign(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator()).operator("-").right(new com.rem.lang.helpers.output.OutputExact().set("1"))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("displayFrequency")).assign(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator()).operator("-").right(new com.rem.lang.helpers.output.OutputExact().set("1"))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("depthBufferBits")).assign(new com.rem.lang.helpers.output.OutputExact().set("24")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("DisplayMode")),new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode")).assign(new com.rem.lang.helpers.output.OutputExact().set("null")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("DisplayMode")),new com.rem.lang.helpers.output.OutputExact().set("displayMode")).assign(new com.rem.lang.helpers.output.OutputExact().set("null")));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").getMethod("()").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("load"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("run"),new com.rem.lang.helpers.output.OutputArguments()))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("initializeDisplay")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getDisplayMode"),new com.rem.lang.helpers.output.OutputArguments()))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Gui")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("log"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputQuote().set("GLApp.initDisplay(): Current display mode is ")).operator("+").right(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"))))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayHeight")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHeight"),new com.rem.lang.helpers.output.OutputArguments()))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayHeight")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("-1"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayWidth")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getWidth"),new com.rem.lang.helpers.output.OutputArguments()))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayWidth")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("-1"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayColorBits")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getBitsPerPixel"),new com.rem.lang.helpers.output.OutputArguments()))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayColorBits")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("-1"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayFrequency")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getFrequency"),new com.rem.lang.helpers.output.OutputArguments()))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayFrequency")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("-1"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("try").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("useCurrentDisplay")))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getDisplayMode"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("displayWidth")).add(new com.rem.lang.helpers.output.OutputExact().set("displayHeight")).add(new com.rem.lang.helpers.output.OutputExact().set("displayColorBits")).add(new com.rem.lang.helpers.output.OutputExact().set("displayFrequency")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getDisplayMode"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("1024")).add(new com.rem.lang.helpers.output.OutputExact().set("768")).add(new com.rem.lang.helpers.output.OutputExact().set("32")).add(new com.rem.lang.helpers.output.OutputExact().set("60")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getDisplayMode"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("1024")).add(new com.rem.lang.helpers.output.OutputExact().set("768")).add(new com.rem.lang.helpers.output.OutputExact().set("16")).add(new com.rem.lang.helpers.output.OutputExact().set("60")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getDisplayMode"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getWidth"),new com.rem.lang.helpers.output.OutputArguments())).add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHeight"),new com.rem.lang.helpers.output.OutputArguments())).add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getBitsPerPixel"),new com.rem.lang.helpers.output.OutputArguments())).add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("originalDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getFrequency"),new com.rem.lang.helpers.output.OutputArguments())))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("System")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("err"),null).add(new com.rem.lang.helpers.output.OutputExact().set("println"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set("Gui Load Display Cant find a compatible Display Mode!!!"))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("null")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("null")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("null")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("null"))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Gui")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("log"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputQuote().set("initializeDisplay: Setting display mode to ")).operator("+").right(new com.rem.lang.helpers.output.OutputExact().set("displayMode"))).operator("+").right(new com.rem.lang.helpers.output.OutputQuote().set(" with pixel depth = "))).operator("+").right(new com.rem.lang.helpers.output.OutputExact().set("depthBufferBits"))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("setDisplayMode"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("displayMode")))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("displayMode")))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayWidth")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("displayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getWidth"),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayHeight")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("displayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHeight"),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayColorBits")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("displayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getBitsPerPixel"),new com.rem.lang.helpers.output.OutputArguments())))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("displayFrequency")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("displayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getFrequency"),new com.rem.lang.helpers.output.OutputArguments())))))).add(new com.rem.lang.helpers.output.OutputConditional().init("catch").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("e0"),null).add(new com.rem.lang.helpers.output.OutputExact().set("printStackTrace"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("System")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("err"),null).add(new com.rem.lang.helpers.output.OutputExact().set("println"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set("initializeDisplay: Failed to create display: ")))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("System")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("exit"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("1"))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType.MultiChoice().set(null,new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Exception"))),new com.rem.lang.helpers.output.OutputExact().set("e0"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("try").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("create"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("PixelFormat")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("0")).add(new com.rem.lang.helpers.output.OutputExact().set("depthBufferBits")).add(new com.rem.lang.helpers.output.OutputExact().set("8")))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("setTitle"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("window_title")))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("setFullscreen"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("fullScreen")))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("setVSyncEnabled"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("VSyncEnabled")))))))).add(new com.rem.lang.helpers.output.OutputConditional().init("catch").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("e0"),null).add(new com.rem.lang.helpers.output.OutputExact().set("printStackTrace"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("System")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("err"),null).add(new com.rem.lang.helpers.output.OutputExact().set("println"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set("initializeDisplay: Failed to create OpenGL window")))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("System")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("exit"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("1"))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType.MultiChoice().set(null,new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Exception"))),new com.rem.lang.helpers.output.OutputExact().set("e0")))))));
		String displayModeArrayType = "DisplayMode[]";
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("DisplayMode")),new com.rem.lang.helpers.output.OutputExact().set("getDisplayMode")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("width"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("height"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("colourBits"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("frequency")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("try").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(displayModeArrayType),new com.rem.lang.helpers.output.OutputExact().set("allDisplayModes")).assign(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("getAvailableDisplayModes"),new com.rem.lang.helpers.output.OutputArguments()))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("DisplayMode")),new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode")).assign(new com.rem.lang.helpers.output.OutputExact().set("null")))).add(new com.rem.lang.helpers.output.OutputConditional().init("for").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("allDisplayModes"),new com.rem.lang.helpers.output.OutputArguments().hasntMethodArguments().array(new com.rem.lang.helpers.output.OutputExact().set("i")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getWidth"),new com.rem.lang.helpers.output.OutputArguments())).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("width"))).operator("&&").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHeight"),new com.rem.lang.helpers.output.OutputArguments()))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("height"))).operator("&&").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getBitsPerPixel"),new com.rem.lang.helpers.output.OutputArguments()))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("colourBits"))).operator("&&").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("tempDisplayMode"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getFrequency"),new com.rem.lang.helpers.output.OutputArguments()))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("frequency")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("i")).assign(new com.rem.lang.helpers.output.OutputExact().set("0"))).separator(";").call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("i")).operator("<").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("allDisplayModes"),null).add(new com.rem.lang.helpers.output.OutputExact().set("length"),null))).operator(";").right(new com.rem.lang.helpers.output.OutputOperator().operator("++").right(new com.rem.lang.helpers.output.OutputExact().set("i")))))))).add(new com.rem.lang.helpers.output.OutputConditional().init("catch").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("e0"),null).add(new com.rem.lang.helpers.output.OutputExact().set("printStackTrace"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("System")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("err"),null).add(new com.rem.lang.helpers.output.OutputExact().set("println"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set("getDisplayMode Failed"))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType.MultiChoice().set(null,new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Exception"))),new com.rem.lang.helpers.output.OutputExact().set("e0"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null")))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Gui").method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("run")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("try").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("while").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Thread")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("sleep"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("200L"))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("isVisible"),new com.rem.lang.helpers.output.OutputArguments()))).operator("==").right(new com.rem.lang.helpers.output.OutputExact().set("false"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("isRunning")).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("false"))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("isCloseRequested"),new com.rem.lang.helpers.output.OutputArguments()))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Thread")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("sleep"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("1")))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("inputHandler"),null).add(new com.rem.lang.helpers.output.OutputExact().set("handle"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("game"),null).add(new com.rem.lang.helpers.output.OutputExact().set("update"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("renderer"),null).add(new com.rem.lang.helpers.output.OutputExact().set("render"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Display")),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("update"),new com.rem.lang.helpers.output.OutputArguments()))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputExact().set("isRunning")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("catch").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("e0"),null).add(new com.rem.lang.helpers.output.OutputExact().set("printStackTrace"),new com.rem.lang.helpers.output.OutputArguments())))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType.MultiChoice().set(null,new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("InterruptedException"))),new com.rem.lang.helpers.output.OutputExact().set("e0"))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("inputHandler"),null).add(new com.rem.lang.helpers.output.OutputExact().set("end"),new com.rem.lang.helpers.output.OutputArguments()))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("renderer"),null).add(new com.rem.lang.helpers.output.OutputExact().set("end"),new com.rem.lang.helpers.output.OutputArguments())))));
	}
	public static void setup(com.rem.gen.parser.Parser.Result.Pass data){
	}
	public static void generate(com.rem.gen.parser.Parser.Result.Pass data){
		com.rem.lang.helpers.output.OutputHelper.setupRootDirectory("../Questineer.");
		com.rem.gen.parser.Token root = data.getRoot();
		for(com.rem.gen.parser.Token imports:root.getAllSafely(com.rem.gen.parser.Token.Id._import_any)){
			for(com.rem.gen.parser.Token import_events:imports.getAllSafely(com.rem.gen.parser.Token.Id._import_event)){
				for(com.rem.gen.parser.Token element:import_events.getAllSafely(com.rem.gen.parser.Token.Id._event_declaration)){
					Events.declaration(element);
				}
			}
		}
		setupGui();
		Conditions.setup(data);
		Aspects.setup(data);
		Items.setup(data);
		Entity.setup(data);
		Skills.setup(data);
		Activities.setup(data);
		Relationship.setup(data);
		Quests.setup(data);
		Treasury.setup(data);
		Environment.setup(data);
		Tile.setup(data);
		Area.setup(data);
		for(com.rem.gen.parser.Token imports:root.getAllSafely(com.rem.gen.parser.Token.Id._import_any)){
			Gui.importAny(imports);
		}
		for(com.rem.gen.parser.Token imports:root.getAllSafely(com.rem.gen.parser.Token.Id._import_any)){
			importAny(imports);
		}
		Affinities.output();
		Traits.output();
		Skills.output();
		Tile.output();
		Game.loadDeclaration(root.get(com.rem.gen.parser.Token.Id._loadBody));
		Game.output();
	}
	public static void importAny(com.rem.gen.parser.Token import_any){
		for(com.rem.gen.parser.Token import_payment_types:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_payment_type)){
			for(com.rem.gen.parser.Token element:import_payment_types.getAllSafely(com.rem.gen.parser.Token.Id._payment_type_declaration)){
				Treasury.paymentTypeDec(element);
			}
		}
		for(com.rem.gen.parser.Token import_items:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_item)){
			for(com.rem.gen.parser.Token element:import_items.getAllSafely(com.rem.gen.parser.Token.Id._import_any)){
				importAny(element);
			}
			for(com.rem.gen.parser.Token element:import_items.getAllSafely(com.rem.gen.parser.Token.Id._item_declaration)){
				Items.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_reason:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_reason)){
			for(com.rem.gen.parser.Token element:import_reason.getAllSafely(com.rem.gen.parser.Token.Id._reason_declaration)){
				Relationship.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_aspects:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_aspect)){
			for(com.rem.gen.parser.Token element:import_aspects.getAllSafely(com.rem.gen.parser.Token.Id._aspect_declaration)){
				Aspects.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_affinities:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_affinity)){
			for(com.rem.gen.parser.Token element:import_affinities.getAllSafely(com.rem.gen.parser.Token.Id._affinity_declaration)){
				Affinities.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_traits:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_trait)){
			for(com.rem.gen.parser.Token element:import_traits.getAllSafely(com.rem.gen.parser.Token.Id._trait_declaration)){
				Traits.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_conditions:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_condition)){
			for(com.rem.gen.parser.Token element:import_conditions.getAllSafely(com.rem.gen.parser.Token.Id._condition_declaration)){
				Conditions.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_skills:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_skill)){
			for(com.rem.gen.parser.Token element:import_skills.getAllSafely(com.rem.gen.parser.Token.Id._skill_declaration)){
				Skills.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_activities:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_activity)){
			for(com.rem.gen.parser.Token element:import_activities.getAll()){
				switch(element.getName()){
					case _activity_type_declaration :{
						ActivityTypes.declaration(element);
						break;
					}
					case _activity_declaration :{
						Activities.declaration(element);
						break;
					}
				}
			}
		}
		for(com.rem.gen.parser.Token import_attacks:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_attack)){
			for(com.rem.gen.parser.Token element:import_attacks.getAllSafely(com.rem.gen.parser.Token.Id._attack_declaration)){
				Attacks.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_supports:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_support)){
			for(com.rem.gen.parser.Token element:import_supports.getAllSafely(com.rem.gen.parser.Token.Id._support_declaration)){
				Supports.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_association:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_association)){
			for(com.rem.gen.parser.Token element:import_association.getAllSafely(com.rem.gen.parser.Token.Id._association_declaration)){
				Associations.declaration(element);
			}
		}
		for(com.rem.gen.parser.Token import_map:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_map)){
			Environment.declaration(import_map);
		}
		for(com.rem.gen.parser.Token import_quests:import_any.getAllSafely(com.rem.gen.parser.Token.Id._import_quest)){
			for(com.rem.gen.parser.Token element:import_quests.getAllSafely(com.rem.gen.parser.Token.Id._quest_type_declaration)){
				Quests.typeDeclaration(element);
			}
		}
	}
	public static com.rem.lang.helpers.output.OutputType getTypeName(com.rem.gen.parser.Token nameToken){
		if(nameToken.get(com.rem.gen.parser.Token.Id._mapDeclaration)!=null){
			com.rem.lang.helpers.output.OutputType type = new com.rem.lang.helpers.output.OutputType("HashMap");
			for(com.rem.gen.parser.Token subType:nameToken.get(com.rem.gen.parser.Token.Id._mapDeclaration).getAllSafely(com.rem.gen.parser.Token.Id._type_name)){
				type.template(getTypeName(subType));
			}
			return type;
		}
		if(nameToken.get(com.rem.gen.parser.Token.Id._findType)!=null){
			com.rem.lang.helpers.output.OutputClass fullName = com.rem.lang.helpers.output.OutputClassStructure.findClass(com.rem.lang.helpers.output.OutputHelper.camelize((nameToken.get(com.rem.gen.parser.Token.Id._typeName)).toString()));
			if(fullName!=null){
				return fullName.getFullName();
			}
			throw new RuntimeException("Could not find "+com.rem.lang.helpers.output.OutputHelper.camelize((nameToken.get(com.rem.gen.parser.Token.Id._typeName)).toString())+" class!");
		}
		else{
			com.rem.lang.helpers.output.OutputType type = new com.rem.lang.helpers.output.OutputType();
			for(com.rem.gen.parser.Token element:nameToken.getAllSafely(com.rem.gen.parser.Token.Id._typeName)){
				type.add(new com.rem.lang.helpers.output.OutputExact(com.rem.lang.helpers.output.OutputHelper.camelize((element).toString())));
			}
			if(type.getAsClass()!=null){
				if(nameToken.get(com.rem.gen.parser.Token.Id._isListToken)!=null){
					return new com.rem.lang.helpers.output.OutputType().set(new com.rem.lang.helpers.output.OutputExact("List")).template(type);
				}
				else{
					return type;
				}
			}
			else{
				com.rem.lang.helpers.output.OutputClass fullName = com.rem.lang.helpers.output.OutputClassStructure.findClass(type.evaluate());
				if(fullName!=null){
					return fullName.getFullName();
				}
				throw new RuntimeException("Could not find "+type.evaluate()+" class!");
			}
		}
	}
}
