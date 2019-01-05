package com.rem.qstnr.entities.behaviours.skills.attacks;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attack;
import java.util.function.Predicate;
import java.util.function.Function;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.environments.tiles.Terrain;
public class Attack extends Skill {
	public Float getRange(Entity entity){
		return range.apply(entity);
	}
	public Integer getCost(Entity entity){
		return (int)(float)cost.apply(entity);
	}
	public Integer getCooldown(){
		return cooldown;
	}
	public Boolean isOffCooldown(){
		return cooldown==0;
	}
	public void on(Events.Tick event){
		if(cooldown>0){
			cooldown-=1;
		}
	}
	public void use(Entity offender,Entity victim){
		attack(offender,victim);
	}
	public void attack(Entity attacker,Entity defender){
		cooldown=getCost(attacker);
		Attack.Damage damage = getDamage(attacker,defender);
		attacker.on(new Events.PreAttack(attacker,defender,damage));
		if(damage.getHit()){
			defender.on(new Events.Hit(attacker,defender,damage));
			experience+=3;
		}
		else{
			defender.on(new Events.Miss(attacker,defender,damage));
			++experience;
		}
		attacker.on(new Events.PostAttack(attacker,defender,damage));
	}
	public Attack.Damage getDamage(Entity attacker,Entity defender){
		return null;
	}
	public Attack.Id getAttackId(){
		return null;
	}
	public Attack (){
		super();
	}
	public Attack (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
		super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
	}
	public static class Id {
		public Id (){
			super();
		}
	}
	public static class Damage {
		protected Float value = 0f;
		protected Float modifier = 1f;
		protected Boolean hit = true;
		public Float getValue(){
			return value;
		}
		public void setValue(Float newValue){
			value=newValue;
		}
		public Float getModifier(){
			return modifier;
		}
		public void setModifier(Float newModifier){
			modifier=newModifier;
		}
		public Boolean getHit(){
			return hit;
		}
		public void setHit(Boolean newHit){
			hit=newHit;
		}
		public Float getTotal(){
			return value*modifier;
		}
		public Damage (Float value,Float modifier,Boolean hit){
			super();
			this.value=value;
			this.modifier=modifier;
			this.hit=hit;
		}
		public Damage (){
			super();
		}
	}
}
