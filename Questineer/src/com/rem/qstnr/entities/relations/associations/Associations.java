package com.rem.qstnr.entities.relations.associations;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.qstnr.entities.relations.associations.Associations;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.entities.relations.associations.Association;
import com.rem.qstnr.events.Events;
import java.util.List;
import com.rem.qstnr.entities.items.Items;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attacks;
import java.util.Map;
public class Associations {
	public static Map<String, Association> complete = new HashMap<String, Association>();
	protected List<Listenable<Events.Load>> loadListeners = null;
	public static Association create(String associationName){
		if(associationName.equals("Cubs")){
			return new Associations.Cubs();
		}
		if(associationName.equals("Pack")){
			return new Associations.Pack();
		}
		if(associationName.equals("Hive")){
			return new Associations.Hive();
		}
		if(associationName.equals("Party")){
			return new Associations.Party();
		}
		if(associationName.equals("HeroesGuild")){
			return new Associations.HeroesGuild();
		}
		if(associationName.equals("Wild")){
			return new Associations.Wild();
		}
		return null;
	}
	public static void add(Association newAssociation){
		complete.put(newAssociation.getName(),newAssociation);
	}
	public static Association get(String associationName){
		return complete.get(associationName);
	}
	public Boolean on(Events.Load event){
		Associations.add(new Associations.Wild("defaultWild"));
		Associations.add(new Associations.HeroesGuild("defaultHeroesGuild"));
		return true;
	}
	public Boolean add(Events.Load.Listener newListener){
		if(loadListeners==null){
			loadListeners=new ArrayList<Listenable<Events.Load>>();
		}
		return loadListeners.add(newListener);
	}
	public List<Listenable<Events.Load>> getLoadListeners(){
		return loadListeners;
	}
	public void setLoadListeners(List<Listenable<Events.Load>> newLoadListeners){
		loadListeners=newLoadListeners;
	}
	public Associations (List<Listenable<Events.Load>> loadListeners){
		super();
		this.loadListeners=loadListeners;
	}
	public Associations (){
		super();
	}
	public static class Wild extends Association {
		public static Association.Id id = Association.Id.Wild;
		public static Integer productNumber = 0;
		protected String name;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public Wild (){
			if(name==null){
				name="Wild"+productNumber;
				++productNumber;
			}
		}
		public Wild (String name){
			this.name=name;
		}
		public Association.Id getId(){
			return id;
		}
		public Wild (String name,Set<Entity> members){
			super(name,members);
			this.name=name;
		}
		public static class Factory implements Association.Factory {
			public Association create(){
				return new Associations.Wild();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class HeroesGuild extends Association {
		public static Association.Id id = Association.Id.HeroesGuild;
		public static Integer productNumber = 0;
		protected String name;
		protected List<Listenable<Events.Joined>> joinedListeners = null;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public HeroesGuild (){
			if(name==null){
				name="HeroesGuild"+productNumber;
				++productNumber;
			}
		}
		public HeroesGuild (String name){
			this.name=name;
		}
		public Association.Id getId(){
			return id;
		}
		public Boolean on(Events.Joined event){
			event.getRecruit().join(null,new Associations.Party(event.getRecruit().getName()+"\'s Party"));
			event.getRecruit().gain(new Attacks.Swing(),this);
			event.getRecruit().equip(new Items.Stick());
			return true;
		}
		public Boolean add(Events.Joined.Listener newListener){
			if(joinedListeners==null){
				joinedListeners=new ArrayList<Listenable<Events.Joined>>();
			}
			return joinedListeners.add(newListener);
		}
		public List<Listenable<Events.Joined>> getJoinedListeners(){
			return joinedListeners;
		}
		public void setJoinedListeners(List<Listenable<Events.Joined>> newJoinedListeners){
			joinedListeners=newJoinedListeners;
		}
		public HeroesGuild (String name,List<Listenable<Events.Joined>> joinedListeners){
			super();
			this.name=name;
			this.joinedListeners=joinedListeners;
		}
		public HeroesGuild (String name,Set<Entity> members,List<Listenable<Events.Joined>> joinedListeners){
			super(name,members);
			this.name=name;
			this.joinedListeners=joinedListeners;
		}
		public HeroesGuild (String name,Set<Entity> members){
			super(name,members);
		}
		public static class Factory implements Association.Factory {
			public Association create(){
				return new Associations.HeroesGuild();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Party extends Association {
		public static Association.Id id = Association.Id.Party;
		public static Integer productNumber = 0;
		protected String name;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public Party (){
			if(name==null){
				name="Party"+productNumber;
				++productNumber;
			}
		}
		public Party (String name){
			this.name=name;
		}
		public Association.Id getId(){
			return id;
		}
		public Party (String name,Set<Entity> members){
			super(name,members);
			this.name=name;
		}
		public static class Factory implements Association.Factory {
			public Association create(){
				return new Associations.Party();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Hive extends Association {
		public static Association.Id id = Association.Id.Hive;
		public static Integer productNumber = 0;
		protected String name;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public Hive (){
			if(name==null){
				name="Hive"+productNumber;
				++productNumber;
			}
		}
		public Hive (String name){
			this.name=name;
		}
		public Association.Id getId(){
			return id;
		}
		public Hive (String name,Set<Entity> members){
			super(name,members);
			this.name=name;
		}
		public static class Factory implements Association.Factory {
			public Association create(){
				return new Associations.Hive();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Pack extends Association {
		public static Association.Id id = Association.Id.Pack;
		public static Integer productNumber = 0;
		protected String name;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public Pack (){
			if(name==null){
				name="Pack"+productNumber;
				++productNumber;
			}
		}
		public Pack (String name){
			this.name=name;
		}
		public Association.Id getId(){
			return id;
		}
		public Pack (String name,Set<Entity> members){
			super(name,members);
			this.name=name;
		}
		public static class Factory implements Association.Factory {
			public Association create(){
				return new Associations.Pack();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Cubs extends Association {
		public static Association.Id id = Association.Id.Cubs;
		public static Integer productNumber = 0;
		protected String name;
		public String getName(){
			return name;
		}
		public void setName(String newName){
			name=newName;
		}
		public Cubs (){
			if(name==null){
				name="Cubs"+productNumber;
				++productNumber;
			}
		}
		public Cubs (String name){
			this.name=name;
		}
		public Association.Id getId(){
			return id;
		}
		public Cubs (String name,Set<Entity> members){
			super(name,members);
			this.name=name;
		}
		public static class Factory implements Association.Factory {
			public Association create(){
				return new Associations.Cubs();
			}
			public Factory (){
				super();
			}
		}
	}
}
