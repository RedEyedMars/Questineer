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

public class AttacksGenerator extends Generator {

	private String packageName = null;
	private File directory = null;
	private ClassEntry superAttackClass = (ClassEntry)null;
	private ClassEntry superAttacksClass = (ClassEntry)null;
	private VariableEntry idVariable = (VariableEntry)null;


	public static final Element attackIdElement = new Element("attackId",new String[]{"Attacks.",/*Attack Name*/".id"});
	public static final Element declareAttacksElement = new Element("declareAttacks",new String[]{"package ",/*Game Package*/".entities.attacks;"+
			"\nimport ",/*Game Package*/".entities.*;"+
			"\nimport ",/*Game Package*/".misc.*;"+
			"\npublic class Attacks {",/*Contents*/""+
			"\n	public static class Id {"+
			"\n	}"+
			"\n}"});
	public static final Element attackGetCostBodyElement = new Element("attackGetCostBody",new String[]{"return (int)(float)cost.use(entity)"});
	public static final Element attackGetRangeBodyElement = new Element("attackGetRangeBody",new String[]{"return range.use(entity)"});
	public static final Element attackIsOffCDBodyElement = new Element("attackIsOffCDBody",new String[]{"return cooldown==0"});
	public static final Element attackSetFocusBodyElement = new Element("attackSetFocusBody",new String[]{"hasEntityFocus = onThis"});
	public static final Element attackOnTickBodyElement = new Element("attackOnTickBody",new String[]{"if(cooldown>0){"+
			"\n			--cooldown;"+
			"\n		}"});
	public static final Element attackAttackBodyElement = new Element("attackAttackBody",new String[]{"cooldown = getCost(attacker);"+
			"\n		Damage damage = getDamage(attacker,defender);"+
			"\n		attacker.onPreAttack(new Events.PreAttack(attacker,defender,damage));"+
			"\n		if(damage.getHit()){"+
			"\n			defender.onHit(new Events.Hit(attacker,defender,damage));"+
			"\n			experience+=3;"+
			"\n		}"+
			"\n		else {"+
			"\n			defender.onMiss(new Events.Miss(attacker,defender,damage));"+
			"\n			++experience;"+
			"\n		}"+
			"\n		attacker.onPostAttack(new Events.PostAttack(attacker,defender,damage));"});
	public static final Element declareAttackElement = new Element("declareAttack",new String[]{"package ",/*Game Package*/".entities.attacks;"+
			"\nimport ",/*Game Package*/".entities.*;"+
			"\nimport ",/*Game Package*/".events.*;"+
			"\npublic abstract class Attack {"+
			"\n	protected Integer experience = 0;"+
			"\n	protected Entity.Modifier range;"+
			"\n	protected Entity.Modifier cost;"+
			"\n	protected Integer cooldown = 0;"+
			"\n	protected Boolean hasEntityFocus = false;"+
			"\n	public Float getRange(Entity entity){"+
			"\n		return range.use(entity);"+
			"\n	}"+
			"\n	public Integer getCost(Entity entity){"+
			"\n		return (int)(float)cost.use(entity);"+
			"\n	}"+
			"\n	public Integer getCooldown(){"+
			"\n		return cooldown;"+
			"\n	}	"+
			"\n	public Boolean isOffCooldown(){"+
			"\n		return cooldown==0;"+
			"\n	}"+
			"\n	public void onTick(Events.Tick event){"+
			"\n		if(cooldown>0){"+
			"\n			--cooldown;"+
			"\n		}"+
			"\n	}"+
			"\n	public abstract Attacks.Id getId();"+
			"\n	public abstract String getName();"+
			"\n	public abstract String getDescription();"+
			"\n	public abstract Attack.Damage getDamage(Entity attacker, Entity defender);"+
			"\n	public void attack(Entity attacker, Entity defender){"+
			"\n		cooldown = getCost(attacker);"+
			"\n		Damage damage = getDamage(attacker,defender);"+
			"\n		attacker.onPreAttack(new Events.PreAttack(attacker,defender,damage));"+
			"\n		if(damage.getHit()){"+
			"\n			defender.onHit(new Events.Hit(attacker,defender,damage));"+
			"\n			experience+=3;"+
			"\n		}"+
			"\n		else {"+
			"\n			defender.onMiss(new Events.Miss(attacker,defender,damage));"+
			"\n			++experience;"+
			"\n		}"+
			"\n		attacker.onPostAttack(new Events.PostAttack(attacker,defender,damage));"+
			"\n	}"+
			"\n	public void setFocus(Boolean onThis){"+
			"\n		hasEntityFocus = onThis;"+
			"\n	}"+
			"\n	public int compareTo(Attack otherAttack){"+
			"\n		if(cooldown==otherAttack.cooldown){"+
			"\n			if(hasEntityFocus){"+
			"\n				return otherAttack.experience-experience;"+
			"\n			}"+
			"\n			else {"+
			"\n				return experience-otherAttack.experience;"+
			"\n			}"+
			"\n		}"+
			"\n		else {"+
			"\n			return otherAttack.cooldown-cooldown;"+
			"\n		} "+
			"\n	}"+
			"\n	public static class Damage {"+
			"\n		private Float value = 0f;"+
			"\n		private Float modifier = 1f;"+
			"\n		private Boolean hit = true;"+
			"\n		public Float getValue(){"+
			"\n			return value;"+
			"\n		}"+
			"\n		public Float getModifier(){"+
			"\n			return modifier;"+
			"\n		}"+
			"\n		public void setValue(Float newValue){"+
			"\n			value = newValue;"+
			"\n		}"+
			"\n		public void setValue(Integer newValue){"+
			"\n			value = (float)newValue;"+
			"\n		}"+
			"\n		public void setModifier(Float newModifier){"+
			"\n			modifier = newModifier;"+
			"\n		}"+
			"\n		public void setHit(Boolean newHit){"+
			"\n			hit = newHit;"+
			"\n		}"+
			"\n		public Float getTotal(){"+
			"\n			return value*modifier;"+
			"\n		}"+
			"\n		public Boolean getHit(){"+
			"\n			return hit;"+
			"\n		}"+
			"\n	}"+
			"\n}"});
	public static final Element subAttackElement = new Element("subAttack",new String[]{"public static class ",/*Attack*/" extends Attack {"+
			"\n		public static Attacks.Id id = new Attacks.Id();"+
			"\n		public ",/*Attack*/"(){",/*Setup*/""+
			"\n		}"+
			"\n		",/*Contents*/""+
			"\n		public Attacks.Id getId(){"+
			"\n			return id;"+
			"\n		}"+
			"\n	}"});
	public static final Element declareDamageMethodElement = new Element("declareDamageMethod",new String[]{"public Attack.Damage getDamage(Entity attacker, Entity defender){",/*Body*/""+
			"\n		}"});
	public static final Element declareGetMethodElement = new Element("declareGetMethod",new String[]{"public ",/*Type*/" get",/*Name*/"(){"+
			"\n			return ",/*Name*/";"+
			"\n		}"});
	public static final Element setVariableElement = new Element("setVariable",new String[]{"",/*Left*/" = ",/*Right*/";"});
	public AttacksGenerator(){
		addElement("attackId",attackIdElement);
		addElement("declareAttacks",declareAttacksElement);
		addElement("attackGetCostBody",attackGetCostBodyElement);
		addElement("attackGetRangeBody",attackGetRangeBodyElement);
		addElement("attackIsOffCDBody",attackIsOffCDBodyElement);
		addElement("attackSetFocusBody",attackSetFocusBodyElement);
		addElement("attackOnTickBody",attackOnTickBodyElement);
		addElement("attackAttackBody",attackAttackBodyElement);
		addElement("declareAttack",declareAttackElement);
		addElement("subAttack",subAttackElement);
		addElement("declareDamageMethod",declareDamageMethodElement);
		addElement("declareGetMethod",declareGetMethodElement);
		addElement("setVariable",setVariableElement);
	}
	public void setup(ParseContext data){
		this.addPage();
		packageName = Generators.general.getPackageName();
		directory = new File(Generators.general.getDirectory(),"entities/attacks");
		directory.mkdirs();
	}
	public void generate(ParseContext data){
		ClassEntry idClass = (ClassEntry)new ClassEntry("entities.attacks","Id",null,null,new ListEntry(),new ListEntry(),new ListEntry());
		idVariable = new VariableEntry("id",idClass);
		ClassEntry damageClass = (ClassEntry)Generators.general.init(new ClassEntry("entities.attacks","Damage",null,null,new ListEntry(new VariableEntry("value","Float","0f"),new VariableEntry("modifier","Float","1f"),new VariableEntry("hit","Boolean","false")),new ListEntry(new MethodEntry("setValue","void",new ListEntry(new VariableEntry("newValue","Float")),new ListEntry(new ElementEntry(GeneralGenerator.semicolonedElement,new ListEntry(new StringEntry("value = newValue"))))),new MethodEntry("setModifier","void",new ListEntry(new VariableEntry("newModifier","Float")),new ListEntry(new ElementEntry(GeneralGenerator.semicolonedElement,new ListEntry(new StringEntry("modifier = newModifier"))))),new MethodEntry("setHit","void",new ListEntry(new VariableEntry("newHit","Boolean")),new ListEntry(new ElementEntry(GeneralGenerator.semicolonedElement,new ListEntry(new StringEntry("hit = newHit"))))),new MethodEntry("getTotal","Float",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("value*modifier")))))),new ListEntry()));
		superAttacksClass = Generators.general.init(new ClassEntry("entities.attacks","Attacks",null,null,new ListEntry(),new ListEntry(),new ListEntry(idClass)));
		superAttacksClass.addImport("misc","Range");
		superAttackClass = Generators.general.init(new ClassEntry("entities.attacks","Attack",null,new ListEntry(Generators.general.get("Source")),new ListEntry(new VariableEntry("experience","Integer"),new VariableEntry("cooldown","Integer"),new VariableEntry("range","Entity.Modifier"),new VariableEntry("cost","Entity.Modifier"),new VariableEntry("hasEntityFocus","Boolean")),new ListEntry(new MethodEntry("getCost","Integer",new ListEntry(new VariableEntry("entity","Entity")),new ListEntry(new ElementEntry(AttacksGenerator.attackGetCostBodyElement,new ListEntry()))),new MethodEntry("getRange","Float",new ListEntry(new VariableEntry("entity","Entity")),new ListEntry(new ElementEntry(AttacksGenerator.attackGetRangeBodyElement,new ListEntry()))),new MethodEntry("isOffCooldown","Boolean",new ListEntry(),new ListEntry(new ElementEntry(AttacksGenerator.attackIsOffCDBodyElement,new ListEntry()))),new MethodEntry("setFocus","void",new ListEntry(new VariableEntry("onThis","Boolean")),new ListEntry(new ElementEntry(AttacksGenerator.attackSetFocusBodyElement,new ListEntry()))),new MethodEntry("onTick","void",new ListEntry(new VariableEntry("event","Events.Tick")),new ListEntry(new ElementEntry(AttacksGenerator.attackOnTickBodyElement,new ListEntry()))),new MethodEntry("attack","void",new ListEntry(new VariableEntry("attacker","Entity"),new VariableEntry("defender","Entity")),new ListEntry(new ElementEntry(AttacksGenerator.attackAttackBodyElement,new ListEntry()))),new MethodEntry("getName","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))),new MethodEntry("getDescription","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))),new MethodEntry("getDamage","Attack.Damage",new ListEntry(new VariableEntry("attacker","Entity"),new VariableEntry("defender","Entity")),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null"))))),new MethodEntry("getId","Attacks.Id",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new StringEntry("null")))))),new ListEntry(damageClass)));
		Generators.attacks.addFile(directory,"Attacks.java",superAttacksClass.get("COMPLETE"));
		Generators.attacks.addFile(directory,"Attack.java",superAttackClass.get("COMPLETE"));
	}
	public Entry generateAttackDeclaration(IToken attackDeclaration){
		String attackName = Generator.camelize(attackDeclaration.get("attackName").getString());
		ClassEntry attackClass = new ClassEntry("entities.attacks",attackName,superAttackClass,null,new ListEntry(idVariable.get("PUBLIC").get("STATIC_FINAL")),new ListEntry(),new ListEntry());
		superAttacksClass.addSubClass(attackClass);
		attackClass.decrementTab(1);
		ListEntry description = new ListEntry();
		description.setDelimiter("+");
		attackClass.addMethod(new MethodEntry("getName","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(new QuoteEntry(attackName))))));
		attackClass.addMethod(new MethodEntry("getDescription","String",new ListEntry(),new ListEntry(new ElementEntry(GeneralGenerator.returnCallElement,new ListEntry(description)))));
		NamelessContextEntry damageContext = new NamelessContextEntry(attackClass);
		damageContext.addVariable(new VariableEntry("attacker","Entity"));
		damageContext.addVariable(new VariableEntry("defender","Entity"));
		damageContext.addVariable(new VariableEntry("damage","Attack.Damage"));
		damageContext.incrementTab(3);
		ListEntry damageBody = new ListEntry(new BodyLineEntry(new BodyDecVarEntry(new VariableEntry("damage","Attack.Damage")),damageContext));
		damageBody.setDelimiter("");
		String damageIfName = "if";
		for(IToken.Key quarkKey:attackDeclaration.keySet()){
			if("description".equals(quarkKey.getName())){
				IToken quark = attackDeclaration.get(quarkKey);
				description.add(new QuoteEntry(quark.getString()));
			}
			else if("cooldown".equals(quarkKey.getName())){
				IToken quark = attackDeclaration.get(quarkKey);
				attackClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("cost")),"=",Generators.entities.generateRange(quark)));
			}
			else if("range".equals(quarkKey.getName())){
				IToken quark = attackDeclaration.get(quarkKey);
				attackClass.addToConstructor(new BodyOperatorEntry(new BodyExactEntry(new StringEntry("range")),"=",Generators.entities.generateRange(quark)));
			}
			else if("damage".equals(quarkKey.getName())){
				IToken quark = attackDeclaration.get(quarkKey);
				for(IToken.Key energyKey:quark.keySet()){
					if("by_stat".equals(energyKey.getName())){
						IToken energy = quark.get(energyKey);
						IBodyStatement statRange = (IBodyStatement)Generators.entities.generateRange(energy);
						damageBody.add(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("damage")),new StringEntry("setValue"),new ListEntry(new BodyOperatorEntry(new BodyMetCalEntry(statRange,new StringEntry("use"),new ListEntry(new BodyExactEntry(new StringEntry("attacker")))),"*",new BodyMetCalEntry(new BodyExactEntry(new StringEntry("attacker")),new StringEntry("getItemDamage"),new ListEntry())))));
					}
					else if("body_element".equals(energyKey.getName())){
						IToken energy = quark.get(energyKey);
						damageBody.add(Generators.general.generateBodyElement(energy,damageContext));
					}
				}
			}
			else if("miss".equals(quarkKey.getName())){
				IToken quark = attackDeclaration.get(quarkKey);
				BodyLineEntry setMiss = new BodyLineEntry(new BodyMetCalEntry(new BodyExactEntry(new StringEntry("damage")),new StringEntry("setHit"),new ListEntry(new BodyExactEntry(new StringEntry("false")))));
				List<IToken> energyOption = quark.getAll("option");
				if(energyOption != null){
					for(IToken energy:energyOption){
						IBodyStatement chance = (IBodyStatement)null;
						IBodyStatement bool = (IBodyStatement)null;
						for(IToken.Key quantaKey:energy.keySet()){
							if("has_chance".equals(quantaKey.getName())){
								IToken quanta = energy.get(quantaKey);
								chance = (IBodyStatement)Generators.general.generateChance(quanta);
							}
							else if("boolean_statement".equals(quantaKey.getName())){
								IToken quanta = energy.get(quantaKey);
								bool = (IBodyStatement)Generators.general.generateBooleanStatement(quanta,damageContext);
							}
						}
						if((bool != null)){
							damageBody.add(new BodyConditionalEntry(damageIfName,bool,new ListEntry(new BodyConditionalEntry("if",chance,new ListEntry(setMiss),new NamelessContextEntry(new NamelessContextEntry(damageContext)))),new NamelessContextEntry(damageContext)));
						}
						else {
							damageBody.add(new BodyConditionalEntry(damageIfName,chance,new ListEntry(setMiss),new NamelessContextEntry(damageContext)));
						}
						damageIfName = "else if";
					}
				}
			}
		}
		damageBody.add(new BodyReturnEntry(new BodyExactEntry(new StringEntry("damage"))));
		attackClass.addMethod(new MethodEntry("getDamage","Attack.Damage",new ListEntry(new VariableEntry("attacker","Entity"),new VariableEntry("defender","Entity")),damageBody));
		return null;
	}
	public BodyStaticEntry id(String attackName){
		attackName = Generators.traits.buildString("Attacks.",attackName);
		return new BodyStaticEntry(Generators.general.get(attackName),new StringEntry("id"));
	}

	public String getPackageName(){
		return packageName;
	}

	public File getDirectory(){
		return directory;
	}

	public ClassEntry getSuperAttackClass(){
		return superAttackClass;
	}

	public ClassEntry getSuperAttacksClass(){
		return superAttacksClass;
	}

	public VariableEntry getIdVariable(){
		return idVariable;
	}

	public String getName(){
		return "Attacks";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}