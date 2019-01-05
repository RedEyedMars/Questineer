package com.rem.qstnr.entities.behaviours.skills.supports;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.behaviours.skills.supports.Support;
import com.rem.qstnr.environments.tiles.Tile;
import java.util.function.Predicate;
import java.util.function.Function;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.environments.tiles.Terrain;
public class Support extends Skill {
	public void on(Events.Tick event){
		if(cooldown>0){
			cooldown-=1;
		}
	}
	public Support.Id getSupportId(){
		return null;
	}
	public Support (){
		super();
	}
	public Support (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
		super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
	}
	public static class Id {
		public Id (){
			super();
		}
	}
}
