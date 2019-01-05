package com.rem.qstnr.entities.relations.associations;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.entities.relations.associations.Association;
import com.rem.qstnr.events.Events;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
public class Association implements Source {
	protected String name;
	protected Set<Entity> members = new HashSet<Entity>();
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public Set<Entity> getMembers(){
		return members;
	}
	public void setMembers(Set<Entity> newMembers){
		members=newMembers;
	}
	public boolean add(Entity newMember){
		return members.add(newMember);
	}
	public void remove(Entity toRemove){
		members.remove(toRemove);
	}
	public boolean contains(Entity findMember){
		return members.contains(findMember);
	}
	public Association.Id getId(){
		return null;
	}
	public Boolean on(Events.Joined event){
		return false;
	}
	public Association (String name,Set<Entity> members){
		super();
		this.name=name;
		this.members=members;
	}
	public Association (){
		super();
	}
	public static enum Id {
		 Wild,
		 HeroesGuild,
		 Party,
		 Hive,
		 Pack,
		 Cubs
	}
	public static interface Factory {
		public Association create();
	}
	public static class IdMap {
		protected Map<Association.Id, java.util.List<Association>> map = new HashMap<Association.Id, java.util.List<Association>>();
		public Map<Association.Id, java.util.List<Association>> getMap(){
			return map;
		}
		public void setMap(Map<Association.Id, java.util.List<Association>> newMap){
			map=newMap;
		}
		public boolean add(Association addObject){
			synchronized(this){
				if(map.containsKey((Association.Id)addObject.getId())==false){
					map.put((Association.Id)addObject.getId(),new ArrayList<Association>());
				}
				return map.get((Association.Id)addObject.getId()).add(addObject);
			}
		}
		public Association get(Association.Id id,Association.Factory factory){
			synchronized(this){
				List<Association> result = map.get(id);
				if(result==null){
					result=new ArrayList<Association>();
					map.put(id,result);
					Association newObject = factory.create();
					result.add(newObject);
					return newObject;
				}
				else{
					if(result.isEmpty()){
						Association newObject = factory.create();
						result.add(newObject);
						return newObject;
					}
					else{
						return result.get(0);
					}
				}
			}
		}
		public Association get(Association.Id findId){
			synchronized(this){
				List<Association> result = map.get(findId);
				if(result!=null&&result.isEmpty()==false){
					return result.get(0);
				}
				else{
					return null;
				}
			}
		}
		public List<Association> getAll(Association.Id findId){
			synchronized(this){
				return map.get(findId);
			}
		}
		public boolean has(Association.Id findId){
			synchronized(this){
				return map.containsKey(findId)&&map.get(findId).isEmpty()==false;
			}
		}
		public boolean remove(Association addObject){
			synchronized(this){
				if(map.containsKey((Association.Id)addObject.getId())){
					return map.get((Association.Id)addObject.getId()).remove(addObject);
				}
				else{
					return false;
				}
			}
		}
		public IdMap (Map<Association.Id, java.util.List<Association>> map){
			super();
			this.map=map;
		}
		public IdMap (){
			super();
		}
	}
}
