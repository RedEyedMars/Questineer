package com.rem.qstnr.misc.interfaces;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.misc.interfaces.Usable;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.environments.tiles.Tile;
import java.util.function.Predicate;
public interface Usable {
	public Boolean use(Entity user,Activity activity);
	public Boolean canChase();
	public Float getRange(Entity user);
	public Predicate<Entity> getTargetCriteria();
	public Predicate<Tile> getDestinationCriteria();
	public Predicate<Terrain> getTerrainCriteria();
	public Usable.Id getId();
	public static class Id {
	}
	public static class Imports {
		protected Entity entity = null;
		protected Tile tile = null;
		public Entity getEntity(){
			return entity;
		}
		public void setEntity(Entity newEntity){
			entity=newEntity;
		}
		public Tile getTile(){
			return tile;
		}
		public void setTile(Tile newTile){
			tile=newTile;
		}
	}
}
