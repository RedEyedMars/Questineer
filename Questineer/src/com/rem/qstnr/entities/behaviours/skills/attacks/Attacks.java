package com.rem.qstnr.entities.behaviours.skills.attacks;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attack;
import com.rem.qstnr.misc.Range;
import java.util.function.Predicate;
import java.util.function.Function;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attacks;
public class Attacks {
	public static Attack create(String attackName){
		if("DaggerThrow".equals("DaggerThrow")){
			return new Attacks.DaggerThrow();
		}
		if("Swing".equals("Swing")){
			return new Attacks.Swing();
		}
		return null;
	}
	public Attacks (){
		super();
	}
	public static class Swing extends Attack {
		public static Attack.Id id = new Attack.Id();
		public static Skill.Id skillId = new Skill.Id();
		public Swing (){
			cost= E->Range.getRandom(4.5f,5.5f)+Range.getRandom(-0.1f,-0.1f)*E.getDex().getValue();
			range= E->1.0f+0.02f*E.getStr().getValue();
		}
		public Attack.Id getAttackId(){
			return id;
		}
		public Skill.Id getId(){
			return skillId;
		}
		public String getName(){
			return "Swing";
		}
		public String getDescription(){
			return "Uses any weapon(if equipped) to attack foe";
		}
		public Attack.Damage getDamage(Entity attacker,Entity defender){
			Attack.Damage damage = new Attack.Damage();
			damage.setValue((1.0f*attacker.getStr().getValue())*attacker.getItemDamage());
			if(attacker.getDex().getValue()>defender.getDex().getValue()){
				if(Range.chance(0.1)){
					damage.setHit(false);
				}
			}
			else if(Range.chance(0.2)){
				damage.setHit(false);
			}
			return damage;
		}
		public Swing (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
	}
	public static class DaggerThrow extends Attack {
		public static Attack.Id id = new Attack.Id();
		public static Skill.Id skillId = new Skill.Id();
		public DaggerThrow (){
			cost= E->Range.getRandom(1.0f,1.5f)+Range.getRandom(-0.025f,-0.025f)*E.getDex().getValue();
			range= E->5.0f+0.05f*E.getStr().getValue();
		}
		public Attack.Id getAttackId(){
			return id;
		}
		public Skill.Id getId(){
			return skillId;
		}
		public String getName(){
			return "DaggerThrow";
		}
		public String getDescription(){
			return "Throws your small blade a the foe";
		}
		public Attack.Damage getDamage(Entity attacker,Entity defender){
			Attack.Damage damage = new Attack.Damage();
			damage.setValue((Range.getRandom(0.75f,0.75f)*attacker.getStr().getValue()+Range.getRandom(0.25f,0.25f)*attacker.getDex().getValue())*attacker.getItemDamage());
			if(attacker.getDex().getValue()>defender.getDex().getValue()){
				if(Range.chance(0.15)){
					damage.setHit(false);
				}
			}
			else if(Range.chance(0.25)){
				damage.setHit(false);
			}
			return damage;
		}
		public DaggerThrow (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
	}
}
