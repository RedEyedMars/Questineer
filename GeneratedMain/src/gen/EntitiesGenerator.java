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

public class EntitiesGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private File miscDirectory = null;
	private ClassEntry superEntityClass = (ClassEntry)null;
	private ClassEntry multiModifierClass = (ClassEntry)null;


	public static final Element getRandomElement = new Element("getRandom",new String[]{"",/*Subject*/".getRandom()"});
	public static final Element getModifierElement = new Element("getModifier",new String[]{"",/*Subject*/".getModifier()"});
	public static final Element entityStatModifierElement = new Element("entityStatModifier",new String[]{"new Entity.",/*Stat*/".Modifier(new Range(",/*Left*/"f,",/*Right*/"f).getRandom())"});
	public static final Element statVariableElement = new Element("statVariable",new String[]{"private ",/*Stat Type*/" ",/*Stat Name*/" = new ",/*Stat Type*/"(0);"});
	public static final Element declareVariableElement = new Element("declareVariable",new String[]{"private ",/*Type*/" ",/*Name*/" = new ",/*Type*/"();"});
	public static final Element declareStatGetMethodElement = new Element("declareStatGetMethod",new String[]{"public ",/*Type*/" get",/*Camel*/"(){"+
			"\n		return ",/*Name*/";"+
			"\n	}"});
	public static final Element damageMethodBodyElement = new Element("damageMethodBody",new String[]{""+
			"\n		hp -= incDamage;"+
			"\n		history.get(",/*damage*/").add(source);"});
	public static final Element gainMethodBodyElement = new Element("gainMethodBody",new String[]{""+
			"\n		aspects.add(source,incAspect);"});
	public static final Element statImposeBodyElement = new Element("statImposeBody",new String[]{"synchronized(this){"+
			"\n				history.add(source,new Int(amount));"+
			"\n				value+=amount;"+
			"\n				return value>0;"+
			"\n			}"});
	public static final Element statReleaseBodyElement = new Element("statReleaseBody",new String[]{"synchronized(this){"+
			"\n				history.removeLast(source);"+
			"\n			}"});
	public static final Element statModifierDecreaseBodyElement = new Element("statModifierDecreaseBody",new String[]{"percent -= amount/inputEntity.",/*Stat Name*/".value;"});
	public static final Element statModifierUseBodyElement = new Element("statModifierUseBody",new String[]{"return inputEntity.",/*Stat Name*/".value*percent"});
	public static final Element multiConstructorBodyElement = new Element("multiConstructorBody",new String[]{"\n\t\t\tsuper(Arrays.asList(mods));"});
	public static final Element multiDecreaseBodyElement = new Element("multiDecreaseBody",new String[]{"\n\t\t\tfor(Modifier mod:this){\n\t\t\t\tmod.decrease(inputEntity,newValue/size());\n\t\t\t}"});
	public static final Element multiUseBodyElement = new Element("multiUseBody",new String[]{"\n\t\t\tfloat sum = 0f;\n"+
			"\t\t\tfor(Modifier mod:this){\n\t\t\t\tsum+=mod.use(inputEntity);\n\t\t\t}\n"+
			"\t\t\treturn sum"});
	public static final Element declareMethodElement = new Element("declareMethod",new String[]{"public ",/*Header*/"(",/*Parameters*/"){",/*Body*/"\n\t}"});
	public static final Element multiRangeElement = new Element("multiRange",new String[]{"new Entity.MultiModifier(",/*Parameters*/")"});
	public static final Element hasMethodElement = new Element("hasMethod",new String[]{""+
			"\n		for(",/*Param Type*/" ",/*Param Name*/":",/*List*/".getAll()){"+
			"\n			if(",/*Argument*/".getId() == findId){"+
			"\n				return true;"+
			"\n			}"+
			"\n		}"+
			"\n		return false"});
	public static final Element gainMethodElement = new Element("gainMethod",new String[]{""+
			"\n		",/*List*/".add(source,",/*Argument*/");"});
	public static final Element loseMethodElement = new Element("loseMethod",new String[]{""+
			"\n		",/*Class Name*/" toRemove = null;"+
			"\n		for(",/*Param Type*/" ",/*Param Obj*/": ",/*List*/".getFrom(source)){"+
			"\n			if(",/*Argument*/".getId() == removeId){"+
			"\n				toRemove = ",/*Argument*/";"+
			"\n				break;"+
			"\n			}"+
			"\n		}"+
			"\n		if(toRemove==null){"+
			"\n			throw new RuntimeException(\"",/*Class*/":\"+removeId+\" Not found!\");"+
			"\n		}"+
			"\n		else {"+
			"\n			",/*List*/".remove(source,toRemove);"+
			"\n		}"});
	public static final Element itemDamageBodyElement = new Element("itemDamageBody",new String[]{""+
			"\n		Float sum = 0f;"+
			"\n		for(Item item:equippedItems){"+
			"\n			sum+=item.getDmg().use(this);"+
			"\n		}"+
			"\n		return sum"});
	public static final Element itemDefenseBodyElement = new Element("itemDefenseBody",new String[]{""+
			"\n		Float sum = 0f;"+
			"\n		for(Item item:equippedItems){"+
			"\n			sum+=item.getDef().use(this);"+
			"\n		}"+
			"\n		return sum"});
	public static final Element canEquipBodyElement = new Element("canEquipBody",new String[]{""+
			"\n		return this.str.getValue()>weightHeld+item.getWeight().use(this)"});
	public static final Element equipBodyElement = new Element("equipBody",new String[]{"equippedItems.add(item);"+
			"\n		weightHeld+=item.getWeight().use(this);"+
			"\n		item.onEquip(new Events.Equip(this,item));"});
	public static final Element unequipBodyElement = new Element("unequipBody",new String[]{""+
			"\n		equippedItems.remove(item);"+
			"\n		weightHeld-=item.getWeight().use(this);"+
			"\n		item.onUnequip(new Events.Unequip(this,item));"});
	public static final Element onHitBodyElement = new Element("onHitBody",new String[]{""+
			"\n		Float eventDamage = event.getDamage().getTotal();"+
			"\n		if(eventDamage<0.1f&&eventDamage>-0.1){"+
			"\n			return;"+
			"\n		}"+
			"\n		int damageToTake = (int)(float)(eventDamage-this.con.getValue()-this.getItemDefense());"+
			"\n		Float eventModifier = event.getDamage().getModifier();"+
			"\n		for(Item item:event.getAttacker().getEquippedItems()){"+
			"\n			item.getHp().decrease(this,item.getDmg().use(event.getAttacker())*eventModifier/eventDamage);"+
			"\n			item.onChangeItem(new Events.ChangeItem(this,item));"+
			"\n		}"+
			"\n		if(damageToTake<1){"+
			"\n			damageToTake = 1;"+
			"\n		}"+
			"\n		while(damageToTake>13){"+
			"\n			damageToTake-=3;"+
			"\n			if(!getRandomStat().impose(-3,event.getAttacker())){"+
			"\n				onDie(new Events.Die(event.getAttacker(),this));"+
			"\n			}"+
			"\n		}"+
			"\n		while(damageToTake>5){"+
			"\n			damageToTake-=2;"+
			"\n			if(!getRandomStat().impose(-2,event.getAttacker())){"+
			"\n				onDie(new Events.Die(event.getAttacker(),this));"+
			"\n			}"+
			"\n		}"+
			"\n		while(damageToTake>0){"+
			"\n			--damageToTake;"+
			"\n			if(!getRandomStat().impose(-1,event.getAttacker())){"+
			"\n				onDie(new Events.Die(event.getAttacker(),this));"+
			"\n			}"+
			"\n		}"});
	public static final Element randomStatBodyElement = new Element("randomStatBody",new String[]{""+
			"\n		return new Entity.Stat[]{",/*Stats*/"}[(int)(Math.random()*",/*Size*/")]"});
	public EntitiesGenerator(){
		addElement("getRandom",getRandomElement);
		addElement("getModifier",getModifierElement);
		addElement("entityStatModifier",entityStatModifierElement);
		addElement("statVariable",statVariableElement);
		addElement("declareVariable",declareVariableElement);
		addElement("declareStatGetMethod",declareStatGetMethodElement);
		addElement("damageMethodBody",damageMethodBodyElement);
		addElement("gainMethodBody",gainMethodBodyElement);
		addElement("statImposeBody",statImposeBodyElement);
		addElement("statReleaseBody",statReleaseBodyElement);
		addElement("statModifierDecreaseBody",statModifierDecreaseBodyElement);
		addElement("statModifierUseBody",statModifierUseBodyElement);
		addElement("multiConstructorBody",multiConstructorBodyElement);
		addElement("multiDecreaseBody",multiDecreaseBodyElement);
		addElement("multiUseBody",multiUseBodyElement);
		addElement("declareMethod",declareMethodElement);
		addElement("multiRange",multiRangeElement);
		addElement("hasMethod",hasMethodElement);
		addElement("gainMethod",gainMethodElement);
		addElement("loseMethod",loseMethodElement);
		addElement("itemDamageBody",itemDamageBodyElement);
		addElement("itemDefenseBody",itemDefenseBodyElement);
		addElement("canEquipBody",canEquipBodyElement);
		addElement("equipBody",equipBodyElement);
		addElement("unequipBody",unequipBodyElement);
		addElement("onHitBody",onHitBodyElement);
		addElement("randomStatBody",randomStatBodyElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities");
		miscDirectory = new File(Generators.general.getDirectory(),"entities/misc");
		directory.mkdirs();
		miscDirectory.mkdirs();
	}
	public void generate(ParseContext data){
		VariableEntry itemDamageHiddenVariable = new VariableEntry("itemDamage","Float");
		superEntityClass = Generators.general.init(new ClassEntry("entities","Entity",null,new ListEntry(Generators.general.get("Source")),new ListEntry(itemDamageHiddenVariable.get("HIDDEN"),new VariableEntry("weightHeld","Float","0f")),new ListEntry(),new ListEntry()));
		superEntityClass.addImport("events","Events");
		superEntityClass.addImport("java.util","Arrays");
		superEntityClass.addImport("misc","Int");
		Generators.events.addEventMethods(superEntityClass,new ListEntry(new StringEntry("hit")),new ListEntry(new ListEntry(new ElementEntry(EntitiesGenerator.onHitBodyElement,new ListEntry()))));
		Generators.entities.addGainLoss("condition","conditions","Condition","Conditions.Id",superEntityClass);
		Generators.entities.addGainLoss("attack","attacks","Attack","Attacks.Id",superEntityClass);
		Generators.entities.addGainLoss("trait","traits","Trait","Traits.Id",superEntityClass);
		Generators.entities.addGainLoss("affinity","affinities","Affinity","Affinities.Id",superEntityClass);
		Generators.entities.addFile(directory,"Entity.java",superEntityClass.get("COMPLETE"));
		ClassEntry modifierClass = (ClassEntry)new ClassEntry("entities","Modifier",null,null,new ListEntry(),new ListEntry(new MethodEntry("use","Float",new ListEntry(new VariableEntry("inputEntity","Entity"))),new MethodEntry("decrease","void",new ListEntry(new VariableEntry("inputEntity","Entity"),new VariableEntry("newValue","Float")))),new ListEntry());
		superEntityClass.addSubInterface(modifierClass);
		ClassEntry multiListClass = (ClassEntry)Generators.general.init(new ClassEntry("java.util","ArrayList",new ListEntry(modifierClass)));
		multiModifierClass = new ClassEntry("entities","MultiModifier",multiListClass,new ListEntry(modifierClass),new ListEntry(),new ListEntry(new MethodEntry("MultiModifier","",new ListEntry(new VariableEntry("...mods","Entity.Modifier")),new ListEntry(new ElementEntry(EntitiesGenerator.multiConstructorBodyElement,new ListEntry()))),new MethodEntry("use","Float",new ListEntry(new VariableEntry("inputEntity","Entity")),new ListEntry(new ElementEntry(EntitiesGenerator.multiUseBodyElement,new ListEntry()))),new MethodEntry("decrease","void",new ListEntry(new VariableEntry("inputEntity","Entity"),new VariableEntry("newValue","Float")),new ListEntry(new ElementEntry(EntitiesGenerator.multiDecreaseBodyElement,new ListEntry())))),new ListEntry());
		superEntityClass.addSubClass(multiModifierClass);
		Generators.general.createList(Generators.general.get("Item"));
		Generators.general.createListMap(Generators.general.get("Source"),Generators.general.get("Int"));
		superEntityClass.addVariable(new VariableEntry("equippedItems","List.Item"));
		superEntityClass.addMethod(new MethodEntry("getItemDamage","Float",new ListEntry(),new ListEntry(new ElementEntry(EntitiesGenerator.itemDamageBodyElement,new ListEntry()))));
		superEntityClass.addMethod(new MethodEntry("getItemDefense","Float",new ListEntry(),new ListEntry(new ElementEntry(EntitiesGenerator.itemDefenseBodyElement,new ListEntry()))));
		superEntityClass.addMethod(new MethodEntry("canEquip","Boolean",new ListEntry(new VariableEntry("item","Item")),new ListEntry(new ElementEntry(EntitiesGenerator.canEquipBodyElement,new ListEntry()))));
		superEntityClass.addMethod(new MethodEntry("equip","void",new ListEntry(new VariableEntry("item","Item")),new ListEntry(new ElementEntry(EntitiesGenerator.equipBodyElement,new ListEntry()))));
		superEntityClass.addMethod(new MethodEntry("unequip","void",new ListEntry(new VariableEntry("item","Item")),new ListEntry(new ElementEntry(EntitiesGenerator.unequipBodyElement,new ListEntry()))));
		Set<String> statNames = (Set<String>)data.getListElements("hero_stats");
		ClassEntry superStatClass = new ClassEntry("entities","Stat",null,null,new ListEntry(),new ListEntry(new MethodEntry("getValue","Integer",new ListEntry()),new MethodEntry("setValue","void",new ListEntry(new VariableEntry("newValue","Integer"))),new MethodEntry("impose","Boolean",new ListEntry(new VariableEntry("amount","Integer"),new VariableEntry("source","Source"))),new MethodEntry("release","void",new ListEntry(new VariableEntry("source","Source"))),new MethodEntry("getName","String",new ListEntry())),new ListEntry());
		superEntityClass.addSubInterface(superStatClass);
		ListEntry allStatList = new ListEntry();
		for(String stat:statNames){
			String vName = stat.toLowerCase();
			ClassEntry statModifierClass = (ClassEntry)new ClassEntry("entities","Modifier",null,new ListEntry(modifierClass),new ListEntry(new VariableEntry("percent","Float")),new ListEntry(new MethodEntry("use","Float",new ListEntry(new VariableEntry("inputEntity","Entity")),new ListEntry(new ElementEntry(EntitiesGenerator.statModifierUseBodyElement,new ListEntry(new StringEntry(vName))))),new MethodEntry("decrease","void",new ListEntry(new VariableEntry("inputEntity","Entity"),new VariableEntry("amount","Float")),new ListEntry(new ElementEntry(EntitiesGenerator.statModifierDecreaseBodyElement,new ListEntry(new StringEntry(vName)))))),new ListEntry());
			ClassEntry statClass = (ClassEntry)new ClassEntry("entities",stat,null,new ListEntry(superStatClass),new ListEntry(new VariableEntry("value","Integer"),new VariableEntry("history","List.Map.Source._Int")),new ListEntry(new MethodEntry("setValue","void",new ListEntry(new VariableEntry("newValue","Integer")),new ListEntry(new ElementEntry(GeneralGenerator.semicolonedElement,new ListEntry(new StringEntry("value = newValue"))))),new MethodEntry("impose","Boolean",new ListEntry(new VariableEntry("amount","Integer"),new VariableEntry("source","Source")),new ListEntry(new BodyConditionalEntry("synchronized",new BodyExactEntry(new StringEntry("this")),new BodyLinesEntry(new ListEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("history")),new StringEntry("add"),new ListEntry(new BodyExactEntry(new StringEntry("source")),new BodyNewObjEntry(Generators.general.get("Int"),new ListEntry(new BodyExactEntry(new StringEntry("amount")))))),new BodyOperatorEntry(new BodyExactEntry(new StringEntry("value")),"+=",new BodyExactEntry(new StringEntry("amount"))),new BodyReturnEntry(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("value")),">",new BodyExactEntry(new StringEntry("0"))))))))),new MethodEntry("release","void",new ListEntry(new VariableEntry("source","Source")),new ListEntry(new ElementEntry(EntitiesGenerator.statReleaseBodyElement,new ListEntry()))),new MethodEntry("getName","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new QuoteEntry(stat)))))),new ListEntry(statModifierClass));
			superEntityClass.addSubClass(statClass);
			superEntityClass.addVariable(new VariableEntry(vName,statClass));
			allStatList.add(new StringEntry(vName));
			statClass.setDefaultEnder(new BodyExactEntry(new StringEntry("getValue")));
		}
		Integer allStatSizeNum = (Integer)allStatList.size();
		superEntityClass.addMethod(new MethodEntry("getRandomStat","Entity.Stat",new ListEntry(),new ListEntry(new ElementEntry(EntitiesGenerator.randomStatBodyElement,new ListEntry(allStatList,new StringEntry(allStatSizeNum.toString()))))));
	}
	public Entry generateRange(IToken range){
		if((range.get("extra") != null)){
			ListEntry parameters = new ListEntry(generateSingleRange(range));
			List<IToken> elementExtra = range.getAll("extra");
			if(elementExtra != null){
				for(IToken element:elementExtra){
					parameters.add(Generators.entities.generateSingleRange(range));
				}
			}
			return new BodyNewObjEntry(multiModifierClass,parameters);
		}
		else {
			return generateSingleRange(range);
		}
	}
	public Entry generateSingleRange(IToken singleRange){
		if((singleRange.get("hero_stats") != null)){
			String statClassName = Generators.entities.buildString("Entity.",new StringEntry(singleRange.get("hero_stats").getString()),".Modifier");
			if((singleRange.get("percent") != null)){
				String leftPercent = Generators.entities.buildString(Generators.general.percentify(singleRange.get("left").getString()),"f");
				String rightPercent = Generators.entities.buildString(Generators.general.percentify(singleRange.get("right").getString()),"f");
				return new BodyNewObjEntry(Generators.general.get(statClassName),new ListEntry(new BodyMetCalEntry(new BodyNewObjEntry(Generators.general.get("Range"),new ListEntry(new BodyExactEntry(new StringEntry(leftPercent)),new BodyExactEntry(new StringEntry(rightPercent)))),new StringEntry("getRandom"),new ListEntry())));
			}
			else {
				String leftPercent2 = Generators.entities.buildString(singleRange.get("left").getString(),"f");
				String rightPercent2 = Generators.entities.buildString(singleRange.get("right").getString(),"f");
				return new BodyNewObjEntry(Generators.general.get(statClassName),new ListEntry(new BodyMetCalEntry(new BodyNewObjEntry(Generators.general.get("Range"),new ListEntry(new BodyExactEntry(new StringEntry(leftPercent2)),new BodyExactEntry(new StringEntry(rightPercent2)))),new StringEntry("getRandom"),new ListEntry())));
			}
		}
		else {
			IBodyStatement gen_range = (IBodyStatement)Generators.general.generateRange(singleRange);
			return new BodyMetCalEntry(gen_range,new StringEntry("getModifier"),new ListEntry());
		}
	}
	public Entry generateImposition(IToken imposition,Boolean forGainBody,IBodyStatement subject){
		Integer count = 0;
		List<IToken> quantaPLUS = imposition.getAll("PLUS");
		if(quantaPLUS != null){
			for(IToken quanta:quantaPLUS){
				count = count + 1;
			}
		}
		List<IToken> quantaMINUS = imposition.getAll("MINUS");
		if(quantaMINUS != null){
			for(IToken quanta:quantaMINUS){
				count = count - 1;
			}
		}
		List<IToken> quantaAmount = imposition.getAll("amount");
		if(quantaAmount != null){
			for(IToken quanta:quantaAmount){
				Integer amount = (Integer)Integer.parseInt(quanta.getString());
				count = count + amount;
			}
		}
		String statGetMethod = Generators.entities.statGetMethod(Generator.camelize(imposition.get("hero_stats").getString()));
		BodyMetCalEntry getStatName = new BodyMetCalEntry(subject,new StringEntry(statGetMethod),new ListEntry());
		if((forGainBody == true)){
			return new BodyMetCalEntry(getStatName,new StringEntry("impose"),new ListEntry(new BodyExactEntry(new StringEntry(count.toString())),new BodyExactEntry(new StringEntry("this"))));
		}
		else {
			return new BodyMetCalEntry(getStatName,new StringEntry("release"),new ListEntry(new BodyExactEntry(new StringEntry("this"))));
		}
	}
	public void addGainLoss(String obj,String listName,String type,String idType,ClassEntry inputClass){
		inputClass.addMethod(new MethodEntry("has","Boolean",new ListEntry(new VariableEntry("findId",idType)),new ListEntry(new ElementEntry(EntitiesGenerator.hasMethodElement,new ListEntry(new StringEntry(type),new StringEntry(obj),new StringEntry(listName),new StringEntry(obj))))));
		inputClass.addMethod(new MethodEntry("gain","void",new ListEntry(new VariableEntry(obj,type),new VariableEntry("source","Source")),new ListEntry(new ElementEntry(EntitiesGenerator.gainMethodElement,new ListEntry(new StringEntry(listName),new StringEntry(obj))))));
		inputClass.addMethod(new MethodEntry("lose","void",new ListEntry(new VariableEntry("removeId",idType),new VariableEntry("source","Source")),new ListEntry(new ElementEntry(EntitiesGenerator.loseMethodElement,new ListEntry(new StringEntry(type),new StringEntry(type),new StringEntry(obj),new StringEntry(listName),new StringEntry(obj),new StringEntry(obj),new StringEntry(type),new StringEntry(listName))))));
		ClassEntry mapClass = (ClassEntry)Generators.general.createListMap(Generators.general.get("Source"),Generators.general.get(type));
		inputClass.addVariable(new VariableEntry(listName,mapClass));
	}
	public String statGetMethod(String statName){
		statName = statName.toLowerCase();
		return Generators.entities.buildString("get",Generator.camelize(statName.toString()));
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public File getMiscDirectory(){
		return miscDirectory;
	}

	public ClassEntry getSuperEntityClass(){
		return superEntityClass;
	}

	public ClassEntry getMultiModifierClass(){
		return multiModifierClass;
	}

	public String getName(){
		return "Entities";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}