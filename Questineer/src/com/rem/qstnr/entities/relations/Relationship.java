package com.rem.qstnr.entities.relations;
import com.rem.qstnr.entities.Entity;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.qstnr.misc.Int;
import com.rem.qstnr.entities.relations.Relationship;
import com.rem.qstnr.misc.ListMaps;
import java.util.List;
import java.util.Map;
public class Relationship {
	protected Entity self;
	protected Entity other;
	protected Integer influence = 0;
	protected ListMaps.Reasons.Int influences;
	public Entity getSelf(){
		return self;
	}
	public void setSelf(Entity newSelf){
		self=newSelf;
	}
	public Entity getOther(){
		return other;
	}
	public void setOther(Entity newOther){
		other=newOther;
	}
	public Integer getInfluence(){
		return influence;
	}
	public void setInfluence(Integer newInfluence){
		influence=newInfluence;
	}
	public void influence(Relationship.Reason reason,Integer amount){
		influences.add(reason,new Int(amount));
		influence+=amount;
	}
	public ListMaps.Reasons.Int getInfluences(){
		return influences;
	}
	public void setInfluences(ListMaps.Reasons.Int newInfluences){
		influences=newInfluences;
	}
	public Relationship (Entity self,Entity other,Integer influence,ListMaps.Reasons.Int influences){
		super();
		this.self=self;
		this.other=other;
		this.influence=influence;
		this.influences=influences;
	}
	public Relationship (){
		super();
	}
	public static enum Predefined {
	}
	public static class Factory {
		public Relationship create(){
			return new Relationship();
		}
		public Factory (){
			super();
		}
	}
	public static class Reason {
		protected String name = null;
		protected String description = null;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public String getDescription(){
			return description;
		}
		public void setDescription(String newDescription){
			description=newDescription;
		}
		public boolean equals(Object otherReason){
			return otherReason!=null&&((Reason)otherReason).name.equals(name);
		}
		public int hashCode(){
			return name.hashCode();
		}
		public Reason (String name,String description){
			super();
			this.name=name;
			this.description=description;
		}
		public Reason (){
			super();
		}
		public static class Factory {
			public Relationship.Reason create(){
				return null;
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Reasons {
		public static Relationship.Reason create(String reasonName){
			if("AttackedFellowMember".equals(reasonName)||"AttackedFellowMember".replace(" ","").equals("AttackedFellowMember")){
				return new Relationship.Reasons.AttackedFellowMember();
			}
			if("WithinTerritory".equals(reasonName)||"WithinTerritory".replace(" ","").equals("WithinTerritory")){
				return new Relationship.Reasons.WithinTerritory();
			}
			if("Bitten".equals(reasonName)||"Bitten".replace(" ","").equals("Bitten")){
				return new Relationship.Reasons.Bitten();
			}
			return null;
		}
		public Reasons (){
			super();
		}
		public static class Bitten extends Relationship.Reason {
			protected Object _1;
			protected Object _2;
			protected Object _3;
			public Bitten (){
				if(name==null){
					name="Bitten";
				}
			}
			public String getDescription(){
				StringBuilder builder = new StringBuilder();
				builder.append(_1.toString());
				builder.append(" has bitten ");
				builder.append(_2.toString());
				builder.append(", causing ");
				builder.append(_3.toString());
				builder.append(" in damage!");
				return builder.toString();
			}
			public Object get1(){
				return _1;
			}
			public void set1(Object new1){
				_1=new1;
			}
			public Object get2(){
				return _2;
			}
			public void set2(Object new2){
				_2=new2;
			}
			public Object get3(){
				return _3;
			}
			public void set3(Object new3){
				_3=new3;
			}
			public Bitten (Object _1,Object _2,Object _3){
				this._1=_1;
				this._2=_2;
				this._3=_3;
			}
			public Bitten (String name,String description,Object _1,Object _2,Object _3){
				super(name,description);
				this._1=_1;
				this._2=_2;
				this._3=_3;
			}
			public Bitten (String name,String description){
				super(name,description);
			}
			public static class Factory extends Relationship.Reason.Factory {
				public Relationship.Reason create(){
					return new Relationship.Reasons.Bitten();
				}
				public Factory (){
					super();
				}
			}
		}
		public static class WithinTerritory extends Relationship.Reason {
			protected Object _1;
			protected Object _2;
			public WithinTerritory (){
				if(name==null){
					name="WithinTerritory";
				}
			}
			public String getDescription(){
				StringBuilder builder = new StringBuilder();
				builder.append(_1.toString());
				builder.append(" is within ");
				builder.append(_2.toString());
				builder.append("'s territory");
				return builder.toString();
			}
			public Object get1(){
				return _1;
			}
			public void set1(Object new1){
				_1=new1;
			}
			public Object get2(){
				return _2;
			}
			public void set2(Object new2){
				_2=new2;
			}
			public WithinTerritory (Object _1,Object _2){
				this._1=_1;
				this._2=_2;
			}
			public WithinTerritory (String name,String description,Object _1,Object _2){
				super(name,description);
				this._1=_1;
				this._2=_2;
			}
			public WithinTerritory (String name,String description){
				super(name,description);
			}
			public static class Factory extends Relationship.Reason.Factory {
				public Relationship.Reason create(){
					return new Relationship.Reasons.WithinTerritory();
				}
				public Factory (){
					super();
				}
			}
		}
		public static class AttackedFellowMember extends Relationship.Reason {
			protected Object _1;
			protected Object _2;
			protected Object _3;
			public AttackedFellowMember (){
				if(name==null){
					name="AttackedFellowMember";
				}
			}
			public String getDescription(){
				StringBuilder builder = new StringBuilder();
				builder.append(_1.toString());
				builder.append(" is attack ");
				builder.append(_2.toString());
				builder.append("'s ");
				builder.append(_3.toString());
				builder.append("mate");
				return builder.toString();
			}
			public Object get1(){
				return _1;
			}
			public void set1(Object new1){
				_1=new1;
			}
			public Object get2(){
				return _2;
			}
			public void set2(Object new2){
				_2=new2;
			}
			public Object get3(){
				return _3;
			}
			public void set3(Object new3){
				_3=new3;
			}
			public AttackedFellowMember (Object _1,Object _2,Object _3){
				this._1=_1;
				this._2=_2;
				this._3=_3;
			}
			public AttackedFellowMember (String name,String description,Object _1,Object _2,Object _3){
				super(name,description);
				this._1=_1;
				this._2=_2;
				this._3=_3;
			}
			public AttackedFellowMember (String name,String description){
				super(name,description);
			}
			public static class Factory extends Relationship.Reason.Factory {
				public Relationship.Reason create(){
					return new Relationship.Reasons.AttackedFellowMember();
				}
				public Factory (){
					super();
				}
			}
		}
	}
	public static class EntityMap {
		protected Map<Entity, java.util.List<Relationship>> map = new HashMap<Entity, java.util.List<Relationship>>();
		public Map<Entity, java.util.List<Relationship>> getMap(){
			return map;
		}
		public void setMap(Map<Entity, java.util.List<Relationship>> newMap){
			map=newMap;
		}
		public boolean add(Relationship addObject){
			synchronized(this){
				if(map.containsKey((Entity)addObject.getOther())==false){
					map.put((Entity)addObject.getOther(),new ArrayList<Relationship>());
				}
				return map.get((Entity)addObject.getOther()).add(addObject);
			}
		}
		public Relationship get(Entity id,Relationship.Factory factory){
			synchronized(this){
				List<Relationship> result = map.get(id);
				if(result==null){
					result=new ArrayList<Relationship>();
					map.put(id,result);
					Relationship newObject = factory.create();
					result.add(newObject);
					return newObject;
				}
				else{
					if(result.isEmpty()){
						Relationship newObject = factory.create();
						result.add(newObject);
						return newObject;
					}
					else{
						return result.get(0);
					}
				}
			}
		}
		public Relationship get(Entity findId){
			synchronized(this){
				List<Relationship> result = map.get(findId);
				if(result!=null&&result.isEmpty()==false){
					return result.get(0);
				}
				else{
					return null;
				}
			}
		}
		public List<Relationship> getAll(Entity findId){
			synchronized(this){
				return map.get(findId);
			}
		}
		public boolean has(Entity findId){
			synchronized(this){
				return map.containsKey(findId)&&map.get(findId).isEmpty()==false;
			}
		}
		public boolean remove(Relationship addObject){
			synchronized(this){
				if(map.containsKey((Entity)addObject.getOther())){
					return map.get((Entity)addObject.getOther()).remove(addObject);
				}
				else{
					return false;
				}
			}
		}
		public EntityMap (Map<Entity, java.util.List<Relationship>> map){
			super();
			this.map=map;
		}
		public EntityMap (){
			super();
		}
	}
}
