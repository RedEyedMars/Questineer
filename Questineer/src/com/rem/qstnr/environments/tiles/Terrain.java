package com.rem.qstnr.environments.tiles;
import com.rem.qstnr.entities.Entity;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.qstnr.environments.tiles.Tile;
import java.util.function.Predicate;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.gui.Gui;
import java.util.List;
import java.util.Map;
public class Terrain {
	protected Tile floorTile = null;
	public Tile getFloorTile(){
		return floorTile;
	}
	public void setFloorTile(Tile newFloorTile){
		floorTile=newFloorTile;
	}
	public Terrain.Id getId(){
		return null;
	}
	public Terrain (Tile newFloorTile){
		super();
		setFloorTile(newFloorTile);
	}
	public boolean isPassable(int x,int y){
		return false;
	}
	public Entity.Event accept(Entity newOccupant){
		return floorTile.accept(newOccupant);
	}
	public Gui.Drawable getDrawable(){
		return null;
	}
	public Boolean load(){
		return true;
	}
	public Boolean tick(Double milliseconds){
		return true;
	}
	public void display(){
	}
	public void undisplay(){
	}
	public int getWidth(){
		return 1;
	}
	public int getHeight(){
		return 1;
	}
	public Terrain (){
		super();
	}
	public static class Id extends Tile.Id {
		public Id (){
			super();
		}
	}
	public static interface Factory {
		public Terrain create();
	}
	public static interface Criteria extends Predicate<Terrain> {
	}
	public static class Corpse extends Terrain {
		public Corpse (){
			super();
		}
		public Corpse (Tile floorTile){
			super(floorTile);
		}
	}
	public static class MonsterDen extends Terrain {
		protected int hp = 100;
		protected int maxHp = hp;
		public int getHp(){
			return hp;
		}
		public void setHp(int newHp){
			hp=newHp;
		}
		public int getMaxHp(){
			return maxHp;
		}
		public void setMaxHp(int newMaxHp){
			maxHp=newMaxHp;
		}
		public MonsterDen (){
			super();
		}
		public boolean isDead(){
			return hp<=0;
		}
		public MonsterDen (int hp,int maxHp){
			super();
			this.hp=hp;
			this.maxHp=maxHp;
		}
		public MonsterDen (Tile floorTile,int hp,int maxHp){
			super(floorTile);
			this.hp=hp;
			this.maxHp=maxHp;
		}
		public MonsterDen (Tile floorTile){
			super(floorTile);
		}
		public static class Id extends Terrain.Id {
			public Id (){
				super();
			}
		}
	}
	public static class Chest extends Terrain {
		public Chest (){
			super();
		}
		public Chest (Tile floorTile){
			super(floorTile);
		}
		public static class Id extends Terrain.Id {
			public Id (){
				super();
			}
		}
	}
	public static class IdMap {
		protected Map<Terrain.Id, java.util.List<Terrain>> map = new HashMap<Terrain.Id, java.util.List<Terrain>>();
		public Map<Terrain.Id, java.util.List<Terrain>> getMap(){
			return map;
		}
		public void setMap(Map<Terrain.Id, java.util.List<Terrain>> newMap){
			map=newMap;
		}
		public boolean add(Terrain addObject){
			synchronized(this){
				if(map.containsKey((Terrain.Id)addObject.getId())==false){
					map.put((Terrain.Id)addObject.getId(),new ArrayList<Terrain>());
				}
				return map.get((Terrain.Id)addObject.getId()).add(addObject);
			}
		}
		public Terrain get(Terrain.Id id,Terrain.Factory factory){
			synchronized(this){
				List<Terrain> result = map.get(id);
				if(result==null){
					result=new ArrayList<Terrain>();
					map.put(id,result);
					Terrain newObject = factory.create();
					result.add(newObject);
					return newObject;
				}
				else{
					if(result.isEmpty()){
						Terrain newObject = factory.create();
						result.add(newObject);
						return newObject;
					}
					else{
						return result.get(0);
					}
				}
			}
		}
		public Terrain get(Terrain.Id findId){
			synchronized(this){
				List<Terrain> result = map.get(findId);
				if(result!=null&&result.isEmpty()==false){
					return result.get(0);
				}
				else{
					return null;
				}
			}
		}
		public List<Terrain> getAll(Terrain.Id findId){
			synchronized(this){
				return map.get(findId);
			}
		}
		public boolean has(Terrain.Id findId){
			synchronized(this){
				return map.containsKey(findId)&&map.get(findId).isEmpty()==false;
			}
		}
		public boolean remove(Terrain addObject){
			synchronized(this){
				if(map.containsKey((Terrain.Id)addObject.getId())){
					return map.get((Terrain.Id)addObject.getId()).remove(addObject);
				}
				else{
					return false;
				}
			}
		}
		public IdMap (Map<Terrain.Id, java.util.List<Terrain>> map){
			super();
			this.map=map;
		}
		public IdMap (){
			super();
		}
	}
}
