package gen;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import gen.checks.*;
import gen.entries.*;
import gen.properties.*;
import lists.*;

public class ItemsGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private String miscDirectory = null;
	private ClassEntry superItemClass = (ClassEntry)null;
	private ClassEntry superItemModifierClass = (ClassEntry)null;
	private ClassEntry superItemsClass = (ClassEntry)null;
	private ListEntry createItemBody = new ListEntry();


	public static final Element outlineElement = new Element("outline",new String[]{"package ",/*Package name*/".entities.items;\n"+
			"import java.util.*;\n"+
			"import ",/*Game Package*/".misc.*;\n"+
			"import ",/*Game Package*/".entities.*;\n"+
			"import ",/*Game Package*/".entities.items.aspects.*;\n"+
			"import ",/*Game Package*/".events.*;\n"+
			"public class Items {",/*classes*/"\n\t",/*createMethod*/"\n}"});
	public static final Element itemElement = new Element("item",new String[]{"public static class ",/*Name*/" extends Item {\n\t\tpublic ",/*Name*/"(){",/*Init*/"\n\t\t}",/*Particulars*/"\n\t}"});
	public static final Element createElement = new Element("create",new String[]{"public static Item create(String itemName){",/*Body*/"\n\t\treturn null;\n\t}"});
	public static final Element createElementElement = new Element("createElement",new String[]{"if(\"",/*Query*/"\".equals(itemName)){\n\t\t\treturn new ",/*Item Name*/"();\n\t\t}"});
	public static final Element bodyElement = new Element("body",new String[]{"{",/*Contents*/"\n}"});
	public static final Element onElement = new Element("on",new String[]{"@Override\n\t\t\tpublic void on",/*EventName*/"(",/*EventName*/"Event event){",/*Contents*/"\t\t\t\t\n}"});
	public static final Element getAspectElement = new Element("getAspect",new String[]{"new Aspects.",/*Aspect Name*/"()"});
	public static final Element addAspectIfElement = new Element("addAspectIf",new String[]{"if(",/*Bool*/" &&!(event.getItem().hasAspect(Aspects.",/*Aspect Name*/".id))){"+
			"\n				event.getItem().gain(new Aspects.",/*Aspect Name*/"(),this);"+
			"\n			}"+
			"\n			else if(",/*Bool*/"&&event.getItem().hasAspect(Aspects.",/*Aspect Name*/".id)){"+
			"\n				event.getItem().lose(Aspects.",/*Aspect Name*/".id,this);"+
			"\n			}"});
	public ItemsGenerator(){
		addElement("outline",outlineElement);
		addElement("item",itemElement);
		addElement("create",createElement);
		addElement("createElement",createElementElement);
		addElement("body",bodyElement);
		addElement("on",onElement);
		addElement("getAspect",getAspectElement);
		addElement("addAspectIf",addAspectIfElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/items");
		directory.mkdirs();
		createItemBody.setDelimiter("");
	}
	public void generate(ParseContext data){
		Generators.general.createList(Generators.general.get("Aspect"));
		MethodEntry createItemMethod = new MethodEntry("createItem","Item",new ListEntry(new VariableEntry("itemName","String")),new ListEntry(createItemBody,new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))));
		superItemsClass = Generators.general.init(new ClassEntry("entities.items","Items",null,null,new ListEntry(),new ListEntry(createItemMethod.get("STATIC")),new ListEntry()));
		String entityModifierClassName = "Entity.Modifier";
		superItemModifierClass = new ClassEntry("entities.items","Modifier",null,new ListEntry(Generators.general.get(entityModifierClassName)),new ListEntry(new VariableEntry("range","Entity.Modifier"),new VariableEntry("host","Item")),new ListEntry(new MethodEntry("use","Float",new ListEntry(new VariableEntry("inputEntity","Entity")),new ListEntry(new BodyReturnEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("range")),new StringEntry("use"),new ListEntry(new BodyExactEntry(new StringEntry("inputEntity"))))))),new MethodEntry("decrease","void",new ListEntry(new VariableEntry("inputEntity","Entity"),new VariableEntry("amount","Float")),new ListEntry(new BodyLineEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("range")),new StringEntry("decrease"),new ListEntry(new BodyExactEntry(new StringEntry("inputEntity")),new BodyExactEntry(new StringEntry("amount"))))))),new MethodEntry("getValue","Float",new ListEntry(),new ListEntry(new BodyReturnEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("range")),new StringEntry("use"),new ListEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("host")),new StringEntry("getEquipper"),new ListEntry()))))))),new ListEntry());
		superItemModifierClass.setDefaultEnder(new BodyExactEntry(new StringEntry("getValue")));
		superItemsClass.addImport("misc","Range");
		superItemsClass.addImport("entities.mods.conditions","Conditions");
		superItemsClass.addImport("entities.mods.traits","Traits");
		superItemsClass.addImport("entities.attacks","Attacks");
		superItemClass = Generators.general.init(new ClassEntry("entities.items","Item",null,new ListEntry(Generators.general.get("Source")),new ListEntry(new VariableEntry("name","String"),new VariableEntry("equipper","Entity","null"),new VariableEntry("hp",superItemModifierClass),new VariableEntry("maxHp",superItemModifierClass),new VariableEntry("dmg",superItemModifierClass),new VariableEntry("def",superItemModifierClass),new VariableEntry("value",superItemModifierClass),new VariableEntry("weight",superItemModifierClass)),new ListEntry(new MethodEntry("onEquip","void",new ListEntry(new VariableEntry("event","Events.Equip")),new ListEntry(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("equipper")),"=",new BodyMetCalEntry(new BodyExactEntry(new StringEntry("event")),new StringEntry("getHost"),new ListEntry())))),new MethodEntry("onUnequip","void",new ListEntry(new VariableEntry("event","Events.Unequip")),new ListEntry(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("equipper")),"=",new BodyExactEntry(new StringEntry("null"))))),new MethodEntry("onChangeItem","void",new ListEntry(new VariableEntry("event","Events.ChangeItem")),new ListEntry())),new ListEntry()));
		superItemClass.addSubClass(superItemModifierClass);
		Generators.entities.addGainLoss("aspect","aspects","Aspect","Aspects.Id",superItemClass);
		Generators.items.addFile(directory,"Items.java",superItemsClass.get("COMPLETE"));
		Generators.items.addFile(directory,"Item.java",superItemClass.get("COMPLETE"));
	}
	public Entry generateItem(IToken item){
		String className = Generator.camelize(item.get("itemName").getString());
		ClassEntry itemClass = (ClassEntry)new ClassEntry("entities.items",className,superItemClass,null,new ListEntry(),new ListEntry(),new ListEntry());
		superItemsClass.addSubClass(itemClass);
		itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("name")),"=",new BodyExactEntry(new QuoteEntry(item.get("itemName").getString()))));
		createItemBody.add(new TabEntry(2,new ListEntry(new ElementEntry(ItemsGenerator.createElementElement,new ListEntry(new StringEntry(item.get("itemName").getString()),new StringEntry(className))))));
		HashMap<String,ListEntry> eventBodies = new HashMap<String,ListEntry>();
		for(IToken.Key elementKey:item.keySet()){
			if("animation".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("image")),"=",new BodyExactEntry(Generators.image.generateAnimation(element))));
			}
			else if("hp".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("hp")),"=",new BodyNewObjEntry(superItemModifierClass,new ListEntry(Generators.entities.generateRange(element),new BodyExactEntry(new StringEntry("this"))))));
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("maxHp")),"=",new BodyNewObjEntry(superItemModifierClass,new ListEntry(Generators.entities.generateRange(element),new BodyExactEntry(new StringEntry("this"))))));
			}
			else if("attack".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("dmg")),"=",new BodyNewObjEntry(superItemModifierClass,new ListEntry(Generators.entities.generateRange(element),new BodyExactEntry(new StringEntry("this"))))));
			}
			else if("defense".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("def")),"=",new BodyNewObjEntry(superItemModifierClass,new ListEntry(Generators.entities.generateRange(element),new BodyExactEntry(new StringEntry("this"))))));
			}
			else if("value".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("value")),"=",new BodyNewObjEntry(superItemModifierClass,new ListEntry(Generators.entities.generateRange(element),new BodyExactEntry(new StringEntry("this"))))));
			}
			else if("weight".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				itemClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("weight")),"=",new BodyNewObjEntry(superItemModifierClass,new ListEntry(Generators.entities.generateRange(element),new BodyExactEntry(new StringEntry("this"))))));
			}
			else if("gain_aspect".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				String gainClassName = null;
				IBodyStatement staticId = (IBodyStatement)null;
				List<IToken> atomAspectNames = element.getAll("aspect_names");
				if(atomAspectNames != null){
					for(IToken atom:atomAspectNames){
						gainClassName = Generators.items.buildString("Aspects.",Generator.camelize(atom.getString()));
						staticId = (IBodyStatement)Generators.aspects.id(Generator.camelize(atom.getString()));
					}
				}
				Entry in = generateGain(element,"change_item","change_item",staticId,"getItem","aspect","aspects","Aspects",gainClassName,itemClass,eventBodies);
			}
			else if("gain_trait".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				String gainClassName = null;
				IBodyStatement staticId = (IBodyStatement)null;
				List<IToken> atomTraitNames = element.getAll("trait_names");
				if(atomTraitNames != null){
					for(IToken atom:atomTraitNames){
						gainClassName = Generators.items.buildString("Traits.",Generator.camelize(atom.getString()));
						staticId = (IBodyStatement)Generators.traits.id(Generator.camelize(atom.getString()));
					}
				}
				Entry in = generateGain(element,"equip","unequip",staticId,"getHost","trait","traits","Traits",gainClassName,itemClass,eventBodies);
			}
			else if("gain_attack".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				String gainClassName = null;
				IBodyStatement staticId = (IBodyStatement)null;
				List<IToken> atomAttackNames = element.getAll("attack_names");
				if(atomAttackNames != null){
					for(IToken atom:atomAttackNames){
						gainClassName = Generators.items.buildString("Attacks.",Generator.camelize(atom.getString()));
						staticId = (IBodyStatement)Generators.attacks.id(Generator.camelize(atom.getString()));
					}
				}
				Entry in = generateGain(element,"equip","unequip",staticId,"getHost","attack","attacks","Attacks",gainClassName,itemClass,eventBodies);
			}
			else if("event".equals(elementKey.getName())){
				IToken element = item.get(elementKey);
				ListEntry eventBody = (ListEntry)eventBodies.get(element.getString());
				if((eventBody == null)){
					eventBody = new ListEntry();
					eventBody.setDelimiter("");
					eventBodies.put(element.getString(),eventBody);
				}
				IContext eventContext = (IContext)Generators.events.getEventContext(element.get("event_names").getString(),itemClass);
				eventContext.decrementTab(1);
				List<IToken> atomBodyElement = element.getAll("body_element");
				if(atomBodyElement != null){
					for(IToken atom:atomBodyElement){
						eventBody.add(Generators.general.generateBodyElement(atom,eventContext));
					}
				}
			}
		}
		Set<String> eventKeys = (Set<String>)eventBodies.keySet();
		for(String key:eventKeys){
			Generators.events.addEventMethod(key,itemClass,eventBodies.get(key));
		}
		return null;
	}
	public Entry generateGain(IToken gain,String gainEventName,String loseEventName,IBodyStatement staticId,String subject,String name,String list,String type,String className,ClassEntry itemClass,HashMap<String,ListEntry> eventBodies){
		if((gain.get("boolean_statement") == null)){
			itemClass.addToConstructor(new BodyMetCalEntry(new BodyExactEntry(new StringEntry(list)),new StringEntry("add"),new ListEntry(new BodyExactEntry(new StringEntry("this")),new BodyNewObjEntry(Generators.general.get(className),new ListEntry()))));
		}
		else {
			IContext eventContext = (IContext)Generators.events.getEventContext(gainEventName,itemClass);
			List<IToken> atomBooleanStatement = gain.getAll("boolean_statement");
			if(atomBooleanStatement != null){
				for(IToken atom:atomBooleanStatement){
					IBodyStatement bool = (IBodyStatement)Generators.general.generateBooleanStatement(atom,eventContext);
					ListEntry itemGainBody = (ListEntry)eventBodies.get(gainEventName);
					if((itemGainBody == null)){
						itemGainBody = new ListEntry();
						itemGainBody.setDelimiter("");
						eventBodies.put(gainEventName,itemGainBody);
					}
					ListEntry itemLoseBody = (ListEntry)eventBodies.get(loseEventName);
					if((itemLoseBody == null)){
						itemLoseBody = new ListEntry();
						itemLoseBody.setDelimiter("");
						eventBodies.put(loseEventName,itemLoseBody);
					}
					BodyMetCalEntry getSubject = new BodyMetCalEntry(new BodyExactEntry(new StringEntry("event")),new StringEntry(subject),new ListEntry());
					BodyMetCalEntry hasType = new BodyMetCalEntry(getSubject,new StringEntry("has"),new ListEntry(staticId));
					BodyOperatorEntry gainHeader = new BodyOperatorEntry(bool,"&&",new BodyNegateEntry(hasType));
					BodyMetCalEntry gainCall = new BodyMetCalEntry(getSubject,new StringEntry("gain"),new ListEntry(new BodyNewObjEntry(Generators.general.get(className),new ListEntry()),new BodyExactEntry(new StringEntry("this"))));
					BodyOperatorEntry loseHeader = new BodyOperatorEntry(bool,"&&",hasType);
					BodyMetCalEntry loseCall = new BodyMetCalEntry(getSubject,new StringEntry("lose"),new ListEntry(staticId,new BodyExactEntry(new StringEntry("this"))));
					itemGainBody.add(new BodyConditionalEntry("if",gainHeader,new BodyLinesEntry(new ListEntry(gainCall),eventContext),eventContext));
					if((gainEventName.equals(loseEventName))){
						itemLoseBody.add(new BodyConditionalEntry("else if",loseHeader,new BodyLinesEntry(new ListEntry(loseCall),eventContext),eventContext));
					}
					else {
						itemLoseBody.add(new BodyConditionalEntry("if",loseHeader,new BodyLinesEntry(new ListEntry(loseCall),eventContext),eventContext));
					}
				}
			}
		}
		return null;
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public String getMiscDirectory(){
		return miscDirectory;
	}

	public ClassEntry getSuperItemClass(){
		return superItemClass;
	}

	public ClassEntry getSuperItemModifierClass(){
		return superItemModifierClass;
	}

	public ClassEntry getSuperItemsClass(){
		return superItemsClass;
	}

	public ListEntry getCreateItemBody(){
		return createItemBody;
	}

	public String getName(){
		return "Items";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}