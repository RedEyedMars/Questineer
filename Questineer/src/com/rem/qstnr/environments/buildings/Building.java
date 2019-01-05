package com.rem.qstnr.environments.buildings;
import com.rem.qstnr.environments.buildings.Building;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.qstnr.overview.treasuries.Treasury;
import com.rem.qstnr.environments.Area;
import java.util.List;
import java.util.Map;
public abstract class Building implements Area.Generator {
	public Building.Type getId(){
		return Type.NONE;
	}
	public List<Treasury.Cost> getCosts(){
		return null;
	}
	public abstract void generateAt(int x,int y,Area newArea);
	public void place(Area area,int x,int y){
		generateAt(x,y,area);
	}
	public Building (){
		super();
	}
	public static enum Imports {
		 costs
	}
	public static enum Type {
		 NONE
	}
	public static interface Factory {
		public Building create();
	}
	public static class TypeMap {
		protected Map<Building.Type, java.util.List<Building>> map = new HashMap<Building.Type, java.util.List<Building>>();
		public Map<Building.Type, java.util.List<Building>> getMap(){
			return map;
		}
		public void setMap(Map<Building.Type, java.util.List<Building>> newMap){
			map=newMap;
		}
		public boolean add(Building addObject){
			synchronized(this){
				if(map.containsKey((Building.Type)addObject.getId())==false){
					map.put((Building.Type)addObject.getId(),new ArrayList<Building>());
				}
				return map.get((Building.Type)addObject.getId()).add(addObject);
			}
		}
		public Building get(Building.Type id,Building.Factory factory){
			synchronized(this){
				List<Building> result = map.get(id);
				if(result==null){
					result=new ArrayList<Building>();
					map.put(id,result);
					Building newObject = factory.create();
					result.add(newObject);
					return newObject;
				}
				else{
					if(result.isEmpty()){
						Building newObject = factory.create();
						result.add(newObject);
						return newObject;
					}
					else{
						return result.get(0);
					}
				}
			}
		}
		public Building get(Building.Type findId){
			synchronized(this){
				List<Building> result = map.get(findId);
				if(result!=null&&result.isEmpty()==false){
					return result.get(0);
				}
				else{
					return null;
				}
			}
		}
		public List<Building> getAll(Building.Type findId){
			synchronized(this){
				return map.get(findId);
			}
		}
		public boolean has(Building.Type findId){
			synchronized(this){
				return map.containsKey(findId)&&map.get(findId).isEmpty()==false;
			}
		}
		public boolean remove(Building addObject){
			synchronized(this){
				if(map.containsKey((Building.Type)addObject.getId())){
					return map.get((Building.Type)addObject.getId()).remove(addObject);
				}
				else{
					return false;
				}
			}
		}
		public TypeMap (Map<Building.Type, java.util.List<Building>> map){
			super();
			this.map=map;
		}
		public TypeMap (){
			super();
		}
	}
}
