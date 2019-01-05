package com.rem.qstnr.entities.behaviours.skills;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.misc.interfaces.Source;
import java.util.function.Predicate;
import java.util.function.Function;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.misc.interfaces.Usable;
public class Skill implements Source, Usable {
	protected Integer experience = 0;
	protected Integer cooldown = -1;
	protected Function<Entity, Float> range = null;
	protected Function<Entity, Float> cost = null;
	protected Boolean hasEntityFocus = null;
	protected Predicate<Entity> targetCriteria =  T->true;
	protected Predicate<Tile> destinationCriteria = new Tile.Criteria.Free();
	protected Predicate<Terrain> terrainCriteria =  T->false;
	public Integer getExperience(){
		return experience;
	}
	public void setExperience(Integer newExperience){
		experience=newExperience;
	}
	public Integer getCooldown(){
		return cooldown;
	}
	public void setCooldown(Integer newCooldown){
		cooldown=newCooldown;
	}
	public Function<Entity, Float> getRange(){
		return range;
	}
	public void setRange(Function<Entity, Float> newRange){
		range=newRange;
	}
	public Function<Entity, Float> getCost(){
		return cost;
	}
	public void setCost(Function<Entity, Float> newCost){
		cost=newCost;
	}
	public Boolean getHasEntityFocus(){
		return hasEntityFocus;
	}
	public void setHasEntityFocus(Boolean newHasEntityFocus){
		hasEntityFocus=newHasEntityFocus;
	}
	public Predicate<Entity> getTargetCriteria(){
		return targetCriteria;
	}
	public void setTargetCriteria(Predicate<Entity> newTargetCriteria){
		targetCriteria=newTargetCriteria;
	}
	public Predicate<Tile> getDestinationCriteria(){
		return destinationCriteria;
	}
	public void setDestinationCriteria(Predicate<Tile> newDestinationCriteria){
		destinationCriteria=newDestinationCriteria;
	}
	public Predicate<Terrain> getTerrainCriteria(){
		return terrainCriteria;
	}
	public void setTerrainCriteria(Predicate<Terrain> newTerrainCriteria){
		terrainCriteria=newTerrainCriteria;
	}
	public Integer getCost(Entity entity){
		return (int)(float)cost.apply(entity);
	}
	public Boolean canChase(){
		return true;
	}
	public Float getRange(Entity entity){
		return range.apply(entity);
	}
	public Boolean isOffCooldown(){
		return cooldown==0;
	}
	public void on(Events.Tick event){
		if(cooldown>0){
			++cooldown;
		}
	}
	public void setFocus(Boolean newFocus){
		hasEntityFocus=newFocus;
	}
	public Integer compareTo(Skill otherSkill){
		if(cooldown==otherSkill.cooldown){
			if(hasEntityFocus){
				return otherSkill.experience-experience;
			}
			else{
				return experience-otherSkill.experience;
			}
		}
		else{
			return otherSkill.cooldown-cooldown;
		}
	}
	public void load(){
	}
	public Boolean use(Entity user,Activity activity){
		if(isOffCooldown()){
			return false;
		}
		if(targetCriteria==null||activity.hasTarget()){
			if(targetCriteria==null||targetCriteria.test(activity.getTargetEntity())){
				use(user,activity.getTargetEntity());
				return true;
			}
			return false;
		}
		else{
			user.getLocation().getEntitiesWithin(getRange(user),targetCriteria).stream().findFirst().ifPresent( P->use(user,P));
		}
		return false;
	}
	public Skill copy(){
		return null;
	}
	public void use(Entity user,Entity victim){
	}
	public String getName(){
		return null;
	}
	public String getDescription(){
		return null;
	}
	public Skill.Id getId(){
		return null;
	}
	public Skill (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
		super();
		this.experience=experience;
		this.cooldown=cooldown;
		this.range=range;
		this.cost=cost;
		this.hasEntityFocus=hasEntityFocus;
		this.targetCriteria=targetCriteria;
		this.destinationCriteria=destinationCriteria;
		this.terrainCriteria=terrainCriteria;
	}
	public Skill (){
		super();
	}
	public static class Id extends Usable.Id {
		public Id (){
			super();
		}
	}
	public static class Imports {
		protected Tile tile = null;
		public Tile getTile(){
			return tile;
		}
		public void setTile(Tile newTile){
			tile=newTile;
		}
		public Imports (Tile tile){
			super();
			this.tile=tile;
		}
		public Imports (){
			super();
		}
	}
}
