package com.rem.qstnr.entities;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.behaviours.skills.supports.Support;
import java.util.ArrayList;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import java.util.Comparator;
import java.util.function.Predicate;
import com.rem.qstnr.entities.items.Item;
import com.rem.qstnr.gui.images.ImageStates;
import java.util.List;
import com.rem.qstnr.gui.Gui;
import java.util.Collections;
import com.rem.qstnr.entities.relations.associations.Associations;
import com.rem.qstnr.misc.Range;
import java.util.LinkedList;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.gui.Renderer;
import com.rem.qstnr.environments.Environment;
import com.rem.qstnr.entities.mods.affinities.Affinity;
import com.rem.qstnr.entities.mods.traits.Trait;
import com.rem.qstnr.misc.interfaces.Tickable;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.misc.Int;
import com.rem.qstnr.entities.relations.associations.Association;
import com.rem.qstnr.misc.streams.Streamer;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.entities.mods.conditions.Condition;
import com.rem.qstnr.entities.behaviours.activities.Activities;
import com.rem.qstnr.entities.behaviours.activities.ActivityType;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attack;
import com.rem.qstnr.entities.behaviours.quests.Quest;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.entities.relations.Relationship;
import com.rem.qstnr.misc.ListMaps;
import com.rem.qstnr.events.Event;
import com.rem.qstnr.misc.interfaces.Loaddable;
import java.util.stream.IntStream;
public class Entity implements Source, Loaddable, Tickable {
	public static Integer ALIVE = 0;
	public static Integer DEAD = 1;
	protected String name = null;
	protected Integer status = ALIVE;
	protected Float weightHeld = 0f;
	protected Integer walkingSpeed = 20;
	protected Tile spawn = null;
	protected List<Item> equippedItems = Collections.synchronizedList(new ArrayList<Item>());
	protected Skill focusSkill = null;
	protected Environment.Location location = new Environment.Location(this);
	protected Relationship.EntityMap relationships = new Relationship.EntityMap();
	protected LinkedList<Activity> activityList = new LinkedList<Activity>();
	protected LinkedList<Entity.Event> events = new LinkedList<Entity.Event>();
	protected List<Listenable<Events.Die>> dieListeners = null;
	protected List<Listenable<Events.PreAttack>> pre_attackListeners = null;
	protected List<Listenable<Events.Unequip>> unequipListeners = null;
	protected List<Listenable<Events.Idle>> idleListeners = null;
	protected List<Listenable<Events.Joined>> joinedListeners = null;
	protected List<Listenable<Events.Start>> startListeners = null;
	protected List<Listenable<Events.Tick>> tickListeners = null;
	protected List<Listenable<Events.Gain>> gainListeners = null;
	protected List<Listenable<Events.Miss>> missListeners = null;
	protected List<Listenable<Events.Loss>> lossListeners = null;
	protected List<Listenable<Events.Fail>> failListeners = null;
	protected List<Listenable<Events.Hit>> hitListeners = null;
	protected List<Listenable<Events.Equip>> equipListeners = null;
	protected List<Listenable<Events.Load>> loadListeners = null;
	protected List<Listenable<Events.StartQuest>> startQuestListeners = null;
	protected List<Listenable<Events.Success>> successListeners = null;
	protected List<Listenable<Events.PostAttack>> post_attackListeners = null;
	protected List<Listenable<Events.Collect>> collectListeners = null;
	protected List<Listenable<Events.ChangeItem>> change_itemListeners = null;
	protected ListMaps.Sources.Condition conditions = new ListMaps.Sources.Condition();
	protected ListMaps.Sources.Trait traits = new ListMaps.Sources.Trait();
	protected ListMaps.Sources.Affinity affinitys = new ListMaps.Sources.Affinity();
	protected ListMaps.Sources.Association associations = new ListMaps.Sources.Association();
	protected ListMaps.Sources.Skill skills = new ListMaps.Sources.Skill();
	protected ListMaps.Sources.Attack attacks = new ListMaps.Sources.Attack();
	protected ListMaps.Sources.Support supports = new ListMaps.Sources.Support();
	protected ListMaps.Sources.Quest quests = new ListMaps.Sources.Quest();
	protected ListMaps.Sources.Activity activitys = new ListMaps.Sources.Activity();
	protected Entity.STR str = new Entity.STR();
	protected Entity.MND mnd = new Entity.MND();
	protected Entity.CON con = new Entity.CON();
	protected Entity.KNW knw = new Entity.KNW();
	protected Entity.DEX dex = new Entity.DEX();
	protected Entity.CRM crm = new Entity.CRM();
	protected int violentMotivation = 5;
	protected int helpingMotivation = 5;
	protected int questingMotivation = 5;
	protected int trackingMotivation = 5;
	protected int learningMotivation = 5;
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public Integer getStatus(){
		return status;
	}
	public void setStatus(Integer newStatus){
		status=newStatus;
	}
	public Float getWeightHeld(){
		return weightHeld;
	}
	public void setWeightHeld(Float newWeightHeld){
		weightHeld=newWeightHeld;
	}
	public Integer getWalkingSpeed(){
		return walkingSpeed;
	}
	public void setWalkingSpeed(Integer newWalkingSpeed){
		walkingSpeed=newWalkingSpeed;
	}
	public Tile getSpawn(){
		return spawn;
	}
	public void setSpawn(Tile newSpawn){
		spawn=newSpawn;
	}
	public List<Item> getEquippedItems(){
		return equippedItems;
	}
	public void setEquippedItems(List<Item> newEquippedItems){
		equippedItems=newEquippedItems;
	}
	public Skill getFocusSkill(){
		return focusSkill;
	}
	public void setFocusSkill(Skill newFocusSkill){
		focusSkill=newFocusSkill;
	}
	public Environment.Location getLocation(){
		return location;
	}
	public void setLocation(Environment.Location newLocation){
		location=newLocation;
	}
	public Relationship.EntityMap getRelationships(){
		return relationships;
	}
	public void setRelationships(Relationship.EntityMap newRelationships){
		relationships=newRelationships;
	}
	public LinkedList<Activity> getActivityList(){
		return activityList;
	}
	public void setActivityList(LinkedList<Activity> newActivityList){
		activityList=newActivityList;
	}
	public LinkedList<Entity.Event> getEvents(){
		return events;
	}
	public void setEvents(LinkedList<Entity.Event> newEvents){
		events=newEvents;
	}
	public Entity.Id getId(){
		return null;
	}
	public void display(){
		getDrawable().display(Renderer.topLayer);
	}
	public void undisplay(){
		getDrawable().undisplay(Renderer.topLayer);
	}
	public Gui.Drawable getDrawable(){
		return null;
	}
	public Gui.Image.States changeTo(){
		return null;
	}
	public boolean getIsPlayerAffiliated(){
		return false;
	}
	public Float getItemDamage(){
		return Streamer.sum(equippedItems,(S,item)->item.getDmg(Entity.this));
	}
	public Float getItemDefense(){
		return Streamer.sum(equippedItems,(S,item)->item.getDef(Entity.this));
	}
	public Boolean canEquip(Item item){
		return this.str.getValue()>weightHeld+item.getWeight();
	}
	public void equip(Item item){
		equippedItems.add(item);
		weightHeld=weightHeld+item.getWeight();
		item.on(new Events.Equip(this,item));
	}
	public void unequip(Item item){
		equippedItems.remove(item);
		weightHeld=weightHeld-item.getWeight();
		item.on(new Events.Unequip(this,item));
	}
	public void addEvent(Entity.Event event){
		events.push(event);
	}
	public void exploreEntryPoint(Tile point){
		if(activityList.isEmpty()==false){
			activityList.getFirst().rememberEntryPoint(point);
		}
	}
	public void explore(Area newArea){
		if(activityList.isEmpty()==false){
			activityList.getFirst().explore(newArea);
		}
	}
	public Boolean hasExplored(Area area){
		if(activityList.isEmpty()==false){
			return activityList.getFirst().hasExplored(area);
		}
		else{
			return false;
		}
	}
	public Boolean isIdle(){
		return true;
	}
	public void changeState(ImageStates newState){
	}
	public Boolean load(){
		on(new Events.Load(this));
		return true;
	}
	public Boolean tick(Double millisSinceLastFrame){
		if(events.isEmpty()==false){
			if(activityList.isEmpty()==false){
				while(events.isEmpty()==false){
					activityList.getFirst().listen(this,events.pollFirst());
				}
				activityList.getFirst().on(new Events.Tick(this));
			}
			else{
				while(events.isEmpty()==false){
					listen(events.pollFirst());
				}
			}
		}
		else{
			if(activityList.isEmpty()==false){
				activityList.getFirst().on(new Events.Tick(this));
			}
		}
		on(new Events.Tick(this));
		return true;
	}
	public Boolean spawnAt(Tile toSpawn){
		if(toSpawn==null){
			throw new RuntimeException("Failed to spawn");
		}
		spawn=toSpawn;
		changeState(ImageStates.idle);
		toSpawn.accept(this);
		if(location.getArea()==null){
			location.setArea(toSpawn.getArea());
		}
		return load();
	}
	public void listen(Entity.Event event){
		if(event.getId()==Entity.Event.FailedToMove.id){
		}
	}
	public void join(Entity recruiter,Association newAssociation){
		newAssociation.add(this);
		gain(newAssociation,recruiter);
		on(new Events.Joined(recruiter,this));
		newAssociation.on(new Events.Joined(recruiter,this));
	}
	public Boolean isFriendlyWith(Entity otherEntity){
		Relationship privateRelationship = relationships.get(otherEntity);
		if(privateRelationship!=null){
			return privateRelationship.getInfluence()>=0;
		}
		else{
			return Streamer.has(associations.getCompleteList(),otherEntity);
		}
	}
	public Activity start(Activity newActivity){
		newActivity.setHost(this);
		newActivity.on(new Events.Load(this));
		activityList.add(0,newActivity);
		return newActivity;
	}
	public void stop(Activity oldActivity){
		activityList.remove(oldActivity);
	}
	public void takeDamage(Source attacker,int damageToTake){
		if(getRandomStat().impose(-damageToTake,attacker)==false){
			die(attacker);
		}
	}
	public void die(Source killer){
		undisplay();
		status=DEAD;
		location.getTile().setOccupant(null);
		if(hasCorpse()){
			location.getTile().setTerrain(getCorpse());
		}
		on(new Events.Die(killer,this));
	}
	public Boolean hasCorpse(){
		return false;
	}
	public Terrain.Corpse getCorpse(){
		return null;
	}
	public void influence(Entity otherEntity,Relationship.Reason reason,Integer amount){
		relationships.get(otherEntity,new Relationship.Factory()).influence(reason,amount);
	}
	public int motivationFor(ActivityType.Id findId){
		switch(findId){
			case Violent :{
				return violentMotivation;
			}
			case Helping :{
				return helpingMotivation;
			}
			case Questing :{
				return questingMotivation;
			}
			case Tracking :{
				return trackingMotivation;
			}
			case Learning :{
				return learningMotivation;
			}
		}
		return -1;
	}
	public boolean swapMotivations(ActivityType.Id decreaseId,ActivityType.Id increaseId){
		switch(decreaseId){
			case Violent :{
				if(violentMotivation==0){
					return false;
				}
				break;
			}
			case Helping :{
				if(helpingMotivation==0){
					return false;
				}
				break;
			}
			case Questing :{
				if(questingMotivation==0){
					return false;
				}
				break;
			}
			case Tracking :{
				if(trackingMotivation==0){
					return false;
				}
				break;
			}
			case Learning :{
				if(learningMotivation==0){
					return false;
				}
				break;
			}
		}
		switch(increaseId){
			case Violent :{
				if(violentMotivation==10){
					return false;
				}
				break;
			}
			case Helping :{
				if(helpingMotivation==10){
					return false;
				}
				break;
			}
			case Questing :{
				if(questingMotivation==10){
					return false;
				}
				break;
			}
			case Tracking :{
				if(trackingMotivation==10){
					return false;
				}
				break;
			}
			case Learning :{
				if(learningMotivation==10){
					return false;
				}
				break;
			}
		}
		switch(decreaseId){
			case Violent :{
				--violentMotivation;
				break;
			}
			case Helping :{
				--helpingMotivation;
				break;
			}
			case Questing :{
				--questingMotivation;
				break;
			}
			case Tracking :{
				--trackingMotivation;
				break;
			}
			case Learning :{
				--learningMotivation;
				break;
			}
		}
		switch(increaseId){
			case Violent :{
				++violentMotivation;
				break;
			}
			case Helping :{
				++helpingMotivation;
				break;
			}
			case Questing :{
				++questingMotivation;
				break;
			}
			case Tracking :{
				++trackingMotivation;
				break;
			}
			case Learning :{
				++learningMotivation;
				break;
			}
		}
		return false;
	}
	public Boolean isDead(){
		return status==DEAD;
	}
	public Boolean on(Events.Die event){
		return true;
	}
	public Boolean add(Events.Die.Listener newListener){
		if(dieListeners==null){
			dieListeners=new ArrayList<Listenable<Events.Die>>();
		}
		return dieListeners.add(newListener);
	}
	public List<Listenable<Events.Die>> getDieListeners(){
		return dieListeners;
	}
	public void setDieListeners(List<Listenable<Events.Die>> newDieListeners){
		dieListeners=newDieListeners;
	}
	public Boolean on(Events.PreAttack event){
		return true;
	}
	public Boolean add(Events.PreAttack.Listener newListener){
		if(pre_attackListeners==null){
			pre_attackListeners=new ArrayList<Listenable<Events.PreAttack>>();
		}
		return pre_attackListeners.add(newListener);
	}
	public List<Listenable<Events.PreAttack>> getPreAttackListeners(){
		return pre_attackListeners;
	}
	public void setPreAttackListeners(List<Listenable<Events.PreAttack>> newPreAttackListeners){
		pre_attackListeners=newPreAttackListeners;
	}
	public Boolean on(Events.Unequip event){
		return true;
	}
	public Boolean add(Events.Unequip.Listener newListener){
		if(unequipListeners==null){
			unequipListeners=new ArrayList<Listenable<Events.Unequip>>();
		}
		return unequipListeners.add(newListener);
	}
	public List<Listenable<Events.Unequip>> getUnequipListeners(){
		return unequipListeners;
	}
	public void setUnequipListeners(List<Listenable<Events.Unequip>> newUnequipListeners){
		unequipListeners=newUnequipListeners;
	}
	public Boolean on(Events.Idle event){
		return true;
	}
	public Boolean add(Events.Idle.Listener newListener){
		if(idleListeners==null){
			idleListeners=new ArrayList<Listenable<Events.Idle>>();
		}
		return idleListeners.add(newListener);
	}
	public List<Listenable<Events.Idle>> getIdleListeners(){
		return idleListeners;
	}
	public void setIdleListeners(List<Listenable<Events.Idle>> newIdleListeners){
		idleListeners=newIdleListeners;
	}
	public Boolean on(Events.Joined event){
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
	public Boolean on(Events.Start event){
		return true;
	}
	public Boolean add(Events.Start.Listener newListener){
		if(startListeners==null){
			startListeners=new ArrayList<Listenable<Events.Start>>();
		}
		return startListeners.add(newListener);
	}
	public List<Listenable<Events.Start>> getStartListeners(){
		return startListeners;
	}
	public void setStartListeners(List<Listenable<Events.Start>> newStartListeners){
		startListeners=newStartListeners;
	}
	public Boolean on(Events.Tick event){
		return true;
	}
	public Boolean add(Events.Tick.Listener newListener){
		if(tickListeners==null){
			tickListeners=new ArrayList<Listenable<Events.Tick>>();
		}
		return tickListeners.add(newListener);
	}
	public List<Listenable<Events.Tick>> getTickListeners(){
		return tickListeners;
	}
	public void setTickListeners(List<Listenable<Events.Tick>> newTickListeners){
		tickListeners=newTickListeners;
	}
	public Boolean on(Events.Gain event){
		return true;
	}
	public Boolean add(Events.Gain.Listener newListener){
		if(gainListeners==null){
			gainListeners=new ArrayList<Listenable<Events.Gain>>();
		}
		return gainListeners.add(newListener);
	}
	public List<Listenable<Events.Gain>> getGainListeners(){
		return gainListeners;
	}
	public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
		gainListeners=newGainListeners;
	}
	public Boolean on(Events.Miss event){
		return true;
	}
	public Boolean add(Events.Miss.Listener newListener){
		if(missListeners==null){
			missListeners=new ArrayList<Listenable<Events.Miss>>();
		}
		return missListeners.add(newListener);
	}
	public List<Listenable<Events.Miss>> getMissListeners(){
		return missListeners;
	}
	public void setMissListeners(List<Listenable<Events.Miss>> newMissListeners){
		missListeners=newMissListeners;
	}
	public Boolean on(Events.Loss event){
		return true;
	}
	public Boolean add(Events.Loss.Listener newListener){
		if(lossListeners==null){
			lossListeners=new ArrayList<Listenable<Events.Loss>>();
		}
		return lossListeners.add(newListener);
	}
	public List<Listenable<Events.Loss>> getLossListeners(){
		return lossListeners;
	}
	public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
		lossListeners=newLossListeners;
	}
	public Boolean on(Events.Fail event){
		return true;
	}
	public Boolean add(Events.Fail.Listener newListener){
		if(failListeners==null){
			failListeners=new ArrayList<Listenable<Events.Fail>>();
		}
		return failListeners.add(newListener);
	}
	public List<Listenable<Events.Fail>> getFailListeners(){
		return failListeners;
	}
	public void setFailListeners(List<Listenable<Events.Fail>> newFailListeners){
		failListeners=newFailListeners;
	}
	public Boolean on(Events.Hit event){
		Float eventDamage = event.getDamage().getTotal();
		if(eventDamage<0.1f&&eventDamage>-0.1){
			return false;
		}
		Float preciseDamage = eventDamage-this.con.getValue()-this.getItemDefense();
		Integer damageToTake = (int)(float)preciseDamage;
		Float eventModifier = event.getDamage().getModifier();
		event.getAttacker().getEquippedItems().parallelStream().forEach( item->item.decreaseHp(Entity.this,(int)(item.getDef(Entity.this)*eventModifier/eventDamage)));
		if(damageToTake<1){
			damageToTake=1;
		}
		IntStream.range(0,damageToTake).parallel().forEach( I->takeDamage(event.getAttacker(),1));
		return true;
	}
	public Boolean add(Events.Hit.Listener newListener){
		if(hitListeners==null){
			hitListeners=new ArrayList<Listenable<Events.Hit>>();
		}
		return hitListeners.add(newListener);
	}
	public List<Listenable<Events.Hit>> getHitListeners(){
		return hitListeners;
	}
	public void setHitListeners(List<Listenable<Events.Hit>> newHitListeners){
		hitListeners=newHitListeners;
	}
	public Boolean on(Events.Equip event){
		return true;
	}
	public Boolean add(Events.Equip.Listener newListener){
		if(equipListeners==null){
			equipListeners=new ArrayList<Listenable<Events.Equip>>();
		}
		return equipListeners.add(newListener);
	}
	public List<Listenable<Events.Equip>> getEquipListeners(){
		return equipListeners;
	}
	public void setEquipListeners(List<Listenable<Events.Equip>> newEquipListeners){
		equipListeners=newEquipListeners;
	}
	public Boolean on(Events.Load event){
		if("Forest".equals(spawn.getParent().getName())){
			join(null,Associations.get("defaultWild"));
		}
		if(event.getHost() instanceof Entities.Hero){
			join(null,Associations.get("defaultHeroesGuild"));
		}
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
	public Boolean on(Events.StartQuest event){
		return true;
	}
	public Boolean add(Events.StartQuest.Listener newListener){
		if(startQuestListeners==null){
			startQuestListeners=new ArrayList<Listenable<Events.StartQuest>>();
		}
		return startQuestListeners.add(newListener);
	}
	public List<Listenable<Events.StartQuest>> getStartQuestListeners(){
		return startQuestListeners;
	}
	public void setStartQuestListeners(List<Listenable<Events.StartQuest>> newStartQuestListeners){
		startQuestListeners=newStartQuestListeners;
	}
	public Boolean on(Events.Success event){
		return true;
	}
	public Boolean add(Events.Success.Listener newListener){
		if(successListeners==null){
			successListeners=new ArrayList<Listenable<Events.Success>>();
		}
		return successListeners.add(newListener);
	}
	public List<Listenable<Events.Success>> getSuccessListeners(){
		return successListeners;
	}
	public void setSuccessListeners(List<Listenable<Events.Success>> newSuccessListeners){
		successListeners=newSuccessListeners;
	}
	public Boolean on(Events.PostAttack event){
		return true;
	}
	public Boolean add(Events.PostAttack.Listener newListener){
		if(post_attackListeners==null){
			post_attackListeners=new ArrayList<Listenable<Events.PostAttack>>();
		}
		return post_attackListeners.add(newListener);
	}
	public List<Listenable<Events.PostAttack>> getPostAttackListeners(){
		return post_attackListeners;
	}
	public void setPostAttackListeners(List<Listenable<Events.PostAttack>> newPostAttackListeners){
		post_attackListeners=newPostAttackListeners;
	}
	public Boolean on(Events.Collect event){
		return true;
	}
	public Boolean add(Events.Collect.Listener newListener){
		if(collectListeners==null){
			collectListeners=new ArrayList<Listenable<Events.Collect>>();
		}
		return collectListeners.add(newListener);
	}
	public List<Listenable<Events.Collect>> getCollectListeners(){
		return collectListeners;
	}
	public void setCollectListeners(List<Listenable<Events.Collect>> newCollectListeners){
		collectListeners=newCollectListeners;
	}
	public Boolean on(Events.ChangeItem event){
		return true;
	}
	public Boolean add(Events.ChangeItem.Listener newListener){
		if(change_itemListeners==null){
			change_itemListeners=new ArrayList<Listenable<Events.ChangeItem>>();
		}
		return change_itemListeners.add(newListener);
	}
	public List<Listenable<Events.ChangeItem>> getChangeItemListeners(){
		return change_itemListeners;
	}
	public void setChangeItemListeners(List<Listenable<Events.ChangeItem>> newChangeItemListeners){
		change_itemListeners=newChangeItemListeners;
	}
	public Boolean has(Condition.Id findId){
		return Streamer.has(conditions.getAll(), condition->condition.getId(),findId);
	}
	public Condition get(Condition.Id findId){
		return Streamer.get(conditions.getAll(), condition->condition.getId(),findId);
	}
	public void gain(Condition condition,Source source){
		conditions.add(source,condition);
	}
	public void gain(Condition condition){
		conditions.add(this,condition);
	}
	public void lose(Condition.Id removeId,Source source){
		Condition toRemove = Streamer.get(conditions.getFrom(source), condition->condition.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Condition"+":"+removeId+"  not found!");
		}
		else{
			conditions.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Condition getConditions(){
		return conditions;
	}
	public void setConditions(ListMaps.Sources.Condition newConditions){
		conditions=newConditions;
	}
	public Boolean has(Trait.Id findId){
		return Streamer.has(traits.getAll(), trait->trait.getId(),findId);
	}
	public Trait get(Trait.Id findId){
		return Streamer.get(traits.getAll(), trait->trait.getId(),findId);
	}
	public void gain(Trait trait,Source source){
		traits.add(source,trait);
	}
	public void gain(Trait trait){
		traits.add(this,trait);
	}
	public void lose(Trait.Id removeId,Source source){
		Trait toRemove = Streamer.get(traits.getFrom(source), trait->trait.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Trait"+":"+removeId+"  not found!");
		}
		else{
			traits.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Trait getTraits(){
		return traits;
	}
	public void setTraits(ListMaps.Sources.Trait newTraits){
		traits=newTraits;
	}
	public Boolean has(Affinity.Id findId){
		return Streamer.has(affinitys.getAll(), affinity->affinity.getId(),findId);
	}
	public Affinity get(Affinity.Id findId){
		return Streamer.get(affinitys.getAll(), affinity->affinity.getId(),findId);
	}
	public void gain(Affinity affinity,Source source){
		affinitys.add(source,affinity);
	}
	public void gain(Affinity affinity){
		affinitys.add(this,affinity);
	}
	public void lose(Affinity.Id removeId,Source source){
		Affinity toRemove = Streamer.get(affinitys.getFrom(source), affinity->affinity.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Affinity"+":"+removeId+"  not found!");
		}
		else{
			affinitys.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Affinity getAffinitys(){
		return affinitys;
	}
	public void setAffinitys(ListMaps.Sources.Affinity newAffinitys){
		affinitys=newAffinitys;
	}
	public Boolean has(Association.Id findId){
		return Streamer.has(associations.getAll(), association->association.getId(),findId);
	}
	public Association get(Association.Id findId){
		return Streamer.get(associations.getAll(), association->association.getId(),findId);
	}
	public void gain(Association association,Source source){
		associations.add(source,association);
	}
	public void gain(Association association){
		associations.add(this,association);
	}
	public void lose(Association.Id removeId,Source source){
		Association toRemove = Streamer.get(associations.getFrom(source), association->association.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Association"+":"+removeId+"  not found!");
		}
		else{
			associations.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Association getAssociations(){
		return associations;
	}
	public void setAssociations(ListMaps.Sources.Association newAssociations){
		associations=newAssociations;
	}
	public Boolean has(Skill.Id findId){
		return Streamer.has(skills.getAll(), skill->skill.getId(),findId);
	}
	public Skill get(Skill.Id findId){
		return Streamer.get(skills.getAll(), skill->skill.getId(),findId);
	}
	public void gain(Skill skill,Source source){
		skills.add(source,skill);
		skill.load();
	}
	public void gain(Skill skill){
		skills.add(this,skill);
	}
	public void lose(Skill.Id removeId,Source source){
		Skill toRemove = Streamer.get(skills.getFrom(source), skill->skill.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Skill"+":"+removeId+"  not found!");
		}
		else{
			skills.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Skill getSkills(){
		return skills;
	}
	public void setSkills(ListMaps.Sources.Skill newSkills){
		skills=newSkills;
	}
	public Boolean has(Attack.Id findId){
		return Streamer.has(attacks.getAll(), attack->attack.getAttackId(),findId);
	}
	public Attack get(Attack.Id findId){
		return Streamer.get(attacks.getAll(), attack->attack.getAttackId(),findId);
	}
	public void gain(Attack attack,Source source){
		attacks.add(source,attack);
		Activities.Attacking.allUsables.add(attack);
		Activities.Hunt.allUsables.add(attack);
		Activities.Kill.allUsables.add(attack);
		Activities.KillDen.allUsables.add(attack);
		Activities.RemoveTerrain.allUsables.add(attack);
	}
	public void gain(Attack attack){
		attacks.add(this,attack);
	}
	public void lose(Attack.Id removeId,Source source){
		Attack toRemove = Streamer.get(attacks.getFrom(source), attack->attack.getAttackId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Attack"+":"+removeId+"  not found!");
		}
		else{
			attacks.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Attack getAttacks(){
		return attacks;
	}
	public void setAttacks(ListMaps.Sources.Attack newAttacks){
		attacks=newAttacks;
	}
	public Boolean has(Support.Id findId){
		return Streamer.has(supports.getAll(), support->support.getSupportId(),findId);
	}
	public Support get(Support.Id findId){
		return Streamer.get(supports.getAll(), support->support.getSupportId(),findId);
	}
	public void gain(Support support,Source source){
		supports.add(source,support);
		Activities.Supporting.allUsables.add(support);
	}
	public void gain(Support support){
		supports.add(this,support);
	}
	public void lose(Support.Id removeId,Source source){
		Support toRemove = Streamer.get(supports.getFrom(source), support->support.getSupportId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Support"+":"+removeId+"  not found!");
		}
		else{
			supports.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Support getSupports(){
		return supports;
	}
	public void setSupports(ListMaps.Sources.Support newSupports){
		supports=newSupports;
	}
	public Boolean has(Quest.Id findId){
		return Streamer.has(quests.getAll(), quest->quest.getId(),findId);
	}
	public Quest get(Quest.Id findId){
		return Streamer.get(quests.getAll(), quest->quest.getId(),findId);
	}
	public void gain(Quest quest,Source source){
		quests.add(source,quest);
		Activities.Questing.allUsables.add(quest);
	}
	public void gain(Quest quest){
		quests.add(this,quest);
	}
	public void lose(Quest.Id removeId,Source source){
		Quest toRemove = Streamer.get(quests.getFrom(source), quest->quest.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Quest"+":"+removeId+"  not found!");
		}
		else{
			quests.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Quest getQuests(){
		return quests;
	}
	public void setQuests(ListMaps.Sources.Quest newQuests){
		quests=newQuests;
	}
	public Boolean has(Activity.Id findId){
		return Streamer.has(activitys.getAll(), activity->activity.getId(),findId);
	}
	public Activity get(Activity.Id findId){
		return Streamer.get(activitys.getAll(), activity->activity.getId(),findId);
	}
	public void gain(Activity activity,Source source){
		activitys.add(source,activity);
	}
	public void gain(Activity activity){
		activitys.add(this,activity);
	}
	public void lose(Activity.Id removeId,Source source){
		Activity toRemove = Streamer.get(activitys.getFrom(source), activity->activity.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Activity"+":"+removeId+"  not found!");
		}
		else{
			activitys.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Activity getActivitys(){
		return activitys;
	}
	public void setActivitys(ListMaps.Sources.Activity newActivitys){
		activitys=newActivitys;
	}
	public Entity.STR getStr(){
		return str;
	}
	public void setStr(Entity.STR newStr){
		str=newStr;
	}
	public Entity.MND getMnd(){
		return mnd;
	}
	public void setMnd(Entity.MND newMnd){
		mnd=newMnd;
	}
	public Entity.CON getCon(){
		return con;
	}
	public void setCon(Entity.CON newCon){
		con=newCon;
	}
	public Entity.KNW getKnw(){
		return knw;
	}
	public void setKnw(Entity.KNW newKnw){
		knw=newKnw;
	}
	public Entity.DEX getDex(){
		return dex;
	}
	public void setDex(Entity.DEX newDex){
		dex=newDex;
	}
	public Entity.CRM getCrm(){
		return crm;
	}
	public void setCrm(Entity.CRM newCrm){
		crm=newCrm;
	}
	public Entity.Stat getRandomStat(){
		switch(Range.getRandom(0,6)){
			case 0 :{
				return str;
			}
			case 1 :{
				return mnd;
			}
			case 2 :{
				return con;
			}
			case 3 :{
				return knw;
			}
			case 4 :{
				return dex;
			}
			case 5 :{
				return crm;
			}
		}
		return null;
	}
	public int getViolentMotivation(){
		return violentMotivation;
	}
	public void setViolentMotivation(int newViolentMotivation){
		violentMotivation=newViolentMotivation;
	}
	public int getHelpingMotivation(){
		return helpingMotivation;
	}
	public void setHelpingMotivation(int newHelpingMotivation){
		helpingMotivation=newHelpingMotivation;
	}
	public int getQuestingMotivation(){
		return questingMotivation;
	}
	public void setQuestingMotivation(int newQuestingMotivation){
		questingMotivation=newQuestingMotivation;
	}
	public int getTrackingMotivation(){
		return trackingMotivation;
	}
	public void setTrackingMotivation(int newTrackingMotivation){
		trackingMotivation=newTrackingMotivation;
	}
	public int getLearningMotivation(){
		return learningMotivation;
	}
	public void setLearningMotivation(int newLearningMotivation){
		learningMotivation=newLearningMotivation;
	}
	public Entity (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
		super();
		this.name=name;
		this.status=status;
		this.weightHeld=weightHeld;
		this.walkingSpeed=walkingSpeed;
		this.spawn=spawn;
		this.equippedItems=equippedItems;
		this.focusSkill=focusSkill;
		this.location=location;
		this.relationships=relationships;
		this.activityList=activityList;
		this.events=events;
		this.dieListeners=dieListeners;
		this.pre_attackListeners=pre_attackListeners;
		this.unequipListeners=unequipListeners;
		this.idleListeners=idleListeners;
		this.joinedListeners=joinedListeners;
		this.startListeners=startListeners;
		this.tickListeners=tickListeners;
		this.gainListeners=gainListeners;
		this.missListeners=missListeners;
		this.lossListeners=lossListeners;
		this.failListeners=failListeners;
		this.hitListeners=hitListeners;
		this.equipListeners=equipListeners;
		this.loadListeners=loadListeners;
		this.startQuestListeners=startQuestListeners;
		this.successListeners=successListeners;
		this.post_attackListeners=post_attackListeners;
		this.collectListeners=collectListeners;
		this.change_itemListeners=change_itemListeners;
		this.conditions=conditions;
		this.traits=traits;
		this.affinitys=affinitys;
		this.associations=associations;
		this.skills=skills;
		this.attacks=attacks;
		this.supports=supports;
		this.quests=quests;
		this.activitys=activitys;
		this.str=str;
		this.mnd=mnd;
		this.con=con;
		this.knw=knw;
		this.dex=dex;
		this.crm=crm;
		this.violentMotivation=violentMotivation;
		this.helpingMotivation=helpingMotivation;
		this.questingMotivation=questingMotivation;
		this.trackingMotivation=trackingMotivation;
		this.learningMotivation=learningMotivation;
	}
	public Entity (){
		super();
	}
	public static enum Id {
		 Hero,
		 BarTender,
		 Mayor,
		 PrayingMatris,
		 KillerBees,
		 Wolf,
		 DireWolf,
		 BearCub,
		 MotherBear,
		 ElderStag
	}
	public static interface Factory {
		public Entity create();
	}
	public static interface Stat {
		public Integer getValue();
		public Integer getValue(Entity user);
		public void setValue(Integer newValue);
		public Boolean impose(Integer amount,Source source);
		public void release(Source source);
		public String getName();
	}
	public static class Event {
		public Entity.Event.Id getId(){
			return null;
		}
		public Event (){
			super();
		}
		public static class Id {
			public Id (){
				super();
			}
		}
		public static class MovedToNewArea extends Entity.Event {
			public static Entity.Event.Id id = new Entity.Event.Id();
			protected Area oldArea = null;
			protected Area newArea = null;
			public Area getOldArea(){
				return oldArea;
			}
			public void setOldArea(Area newOldArea){
				oldArea=newOldArea;
			}
			public Area getNewArea(){
				return newArea;
			}
			public void setNewArea(Area newNewArea){
				newArea=newNewArea;
			}
			public Entity.Event.Id getId(){
				return id;
			}
			public MovedToNewArea (Area oldArea,Area newArea){
				this.oldArea=oldArea;
				this.newArea=newArea;
			}
			public MovedToNewArea (){
				super();
			}
		}
		public static class FailedToMove extends Entity.Event {
			public static Entity.Event.FailedToMove.Id id = new Entity.Event.FailedToMove.Id();
			protected Tile causalTile = null;
			public Tile getCausalTile(){
				return causalTile;
			}
			public void setCausalTile(Tile newCausalTile){
				causalTile=newCausalTile;
			}
			public Entity.Event.Id getId(){
				return id;
			}
			public FailedToMove (Tile causalTile){
				this.causalTile=causalTile;
			}
			public FailedToMove (){
				super();
			}
			public static class Id extends Entity.Event.Id {
				public Id (){
					super();
				}
			}
			public static class TileHasOccupant extends Entity.Event.FailedToMove {
				public static Entity.Event.FailedToMove.Id id = new Entity.Event.FailedToMove.Id();
				protected Entity causalOccupant = null;
				public Entity getCausalOccupant(){
					return causalOccupant;
				}
				public void setCausalOccupant(Entity newCausalOccupant){
					causalOccupant=newCausalOccupant;
				}
				public Entity.Event.Id getId(){
					return id;
				}
				public TileHasOccupant (Tile causalTile,Entity causalOccupant){
					super(causalTile);
					this.causalOccupant=causalOccupant;
				}
				public TileHasOccupant (Entity causalOccupant){
					super();
					this.causalOccupant=causalOccupant;
				}
				public TileHasOccupant (){
					super();
				}
				public TileHasOccupant (Tile causalTile){
					super(causalTile);
				}
			}
			public static class TerrainImpassable extends Entity.Event.FailedToMove {
				public static Entity.Event.FailedToMove.Id id = new Entity.Event.FailedToMove.Id();
				protected Terrain causalTerrain = null;
				public Terrain getCausalTerrain(){
					return causalTerrain;
				}
				public void setCausalTerrain(Terrain newCausalTerrain){
					causalTerrain=newCausalTerrain;
				}
				public Entity.Event.Id getId(){
					return id;
				}
				public TerrainImpassable (Tile causalTile,Terrain causalTerrain){
					super(causalTile);
					this.causalTerrain=causalTerrain;
				}
				public TerrainImpassable (Terrain causalTerrain){
					super();
					this.causalTerrain=causalTerrain;
				}
				public TerrainImpassable (){
					super();
				}
				public TerrainImpassable (Tile causalTile){
					super(causalTile);
				}
			}
		}
	}
	public static class Comparators {
		public Comparators (){
			super();
		}
		public static class Distance {
			public Distance (){
				super();
			}
			public static class Ascending implements Comparator<Entity> {
				protected Environment.Position origin = null;
				public Environment.Position getOrigin(){
					return origin;
				}
				public void setOrigin(Environment.Position newOrigin){
					origin=newOrigin;
				}
				public Ascending (Environment.Position origin){
					this.origin=origin;
				}
				public int compare(Entity entity1,Entity entity2){
					return (int)((double)origin.getDistanceTo(entity1.location)-(double)origin.getDistanceTo(entity2.location));
				}
				public Ascending (){
					super();
				}
			}
			public static class Descending implements Comparator<Entity> {
				protected Environment.Position origin = null;
				public Environment.Position getOrigin(){
					return origin;
				}
				public void setOrigin(Environment.Position newOrigin){
					origin=newOrigin;
				}
				public Descending (Environment.Position origin){
					this.origin=origin;
				}
				public int compare(Entity entity1,Entity entity2){
					return (int)((double)origin.getDistanceTo(entity2.location)-(double)origin.getDistanceTo(entity1.location));
				}
				public Descending (){
					super();
				}
			}
		}
	}
	public static interface Criteria extends Predicate<Entity> {
		public static class True implements Entity.Criteria {
			public boolean test(Entity candidate){
				return true;
			}
		}
		public static class Free implements Predicate<Tile> {
			public boolean test(Tile candidate){
				return true;
			}
		}
		public static class AngleTo implements Predicate<Entity> {
			protected Environment.Position to = null;
			protected Double angleLeft = 0.0;
			protected Double angleRight = 0.0;
			public Environment.Position getTo(){
				return to;
			}
			public void setTo(Environment.Position newTo){
				to=newTo;
			}
			public Double getAngleLeft(){
				return angleLeft;
			}
			public void setAngleLeft(Double newAngleLeft){
				angleLeft=newAngleLeft;
			}
			public Double getAngleRight(){
				return angleRight;
			}
			public void setAngleRight(Double newAngleRight){
				angleRight=newAngleRight;
			}
			public boolean test(Entity candidate){
				double direction = candidate.getLocation().getDirectionTo(to);
				return direction<=angleLeft&direction>=angleRight;
			}
		}
	}
	public static class STR implements Entity.Stat {
		protected Integer value = 0;
		protected ListMaps.Sources.Int history = new ListMaps.Sources.Int();
		public Integer getValue(){
			return value;
		}
		public ListMaps.Sources.Int getHistory(){
			return history;
		}
		public void setHistory(ListMaps.Sources.Int newHistory){
			history=newHistory;
		}
		public Integer getValue(Entity user){
			return user.str.getValue();
		}
		public void setValue(Integer newValue){
			value=newValue;
		}
		public Boolean impose(Integer amount,Source source){
			synchronized(this){
				history.add(source,new Int(amount));
			}
			value+=amount;
			return value>0;
		}
		public void release(Source source){
			synchronized(this){
				history.removeLast(source);
			}
		}
		public String getName(){
			return "STR";
		}
		public STR (Integer value,ListMaps.Sources.Int history){
			super();
			this.value=value;
			this.history=history;
		}
		public STR (){
			super();
		}
	}
	public static class MND implements Entity.Stat {
		protected Integer value = 0;
		protected ListMaps.Sources.Int history = new ListMaps.Sources.Int();
		public Integer getValue(){
			return value;
		}
		public ListMaps.Sources.Int getHistory(){
			return history;
		}
		public void setHistory(ListMaps.Sources.Int newHistory){
			history=newHistory;
		}
		public Integer getValue(Entity user){
			return user.mnd.getValue();
		}
		public void setValue(Integer newValue){
			value=newValue;
		}
		public Boolean impose(Integer amount,Source source){
			synchronized(this){
				history.add(source,new Int(amount));
			}
			value+=amount;
			return value>0;
		}
		public void release(Source source){
			synchronized(this){
				history.removeLast(source);
			}
		}
		public String getName(){
			return "MND";
		}
		public MND (Integer value,ListMaps.Sources.Int history){
			super();
			this.value=value;
			this.history=history;
		}
		public MND (){
			super();
		}
	}
	public static class CON implements Entity.Stat {
		protected Integer value = 0;
		protected ListMaps.Sources.Int history = new ListMaps.Sources.Int();
		public Integer getValue(){
			return value;
		}
		public ListMaps.Sources.Int getHistory(){
			return history;
		}
		public void setHistory(ListMaps.Sources.Int newHistory){
			history=newHistory;
		}
		public Integer getValue(Entity user){
			return user.con.getValue();
		}
		public void setValue(Integer newValue){
			value=newValue;
		}
		public Boolean impose(Integer amount,Source source){
			synchronized(this){
				history.add(source,new Int(amount));
			}
			value+=amount;
			return value>0;
		}
		public void release(Source source){
			synchronized(this){
				history.removeLast(source);
			}
		}
		public String getName(){
			return "CON";
		}
		public CON (Integer value,ListMaps.Sources.Int history){
			super();
			this.value=value;
			this.history=history;
		}
		public CON (){
			super();
		}
	}
	public static class KNW implements Entity.Stat {
		protected Integer value = 0;
		protected ListMaps.Sources.Int history = new ListMaps.Sources.Int();
		public Integer getValue(){
			return value;
		}
		public ListMaps.Sources.Int getHistory(){
			return history;
		}
		public void setHistory(ListMaps.Sources.Int newHistory){
			history=newHistory;
		}
		public Integer getValue(Entity user){
			return user.knw.getValue();
		}
		public void setValue(Integer newValue){
			value=newValue;
		}
		public Boolean impose(Integer amount,Source source){
			synchronized(this){
				history.add(source,new Int(amount));
			}
			value+=amount;
			return value>0;
		}
		public void release(Source source){
			synchronized(this){
				history.removeLast(source);
			}
		}
		public String getName(){
			return "KNW";
		}
		public KNW (Integer value,ListMaps.Sources.Int history){
			super();
			this.value=value;
			this.history=history;
		}
		public KNW (){
			super();
		}
	}
	public static class DEX implements Entity.Stat {
		protected Integer value = 0;
		protected ListMaps.Sources.Int history = new ListMaps.Sources.Int();
		public Integer getValue(){
			return value;
		}
		public ListMaps.Sources.Int getHistory(){
			return history;
		}
		public void setHistory(ListMaps.Sources.Int newHistory){
			history=newHistory;
		}
		public Integer getValue(Entity user){
			return user.dex.getValue();
		}
		public void setValue(Integer newValue){
			value=newValue;
		}
		public Boolean impose(Integer amount,Source source){
			synchronized(this){
				history.add(source,new Int(amount));
			}
			value+=amount;
			return value>0;
		}
		public void release(Source source){
			synchronized(this){
				history.removeLast(source);
			}
		}
		public String getName(){
			return "DEX";
		}
		public DEX (Integer value,ListMaps.Sources.Int history){
			super();
			this.value=value;
			this.history=history;
		}
		public DEX (){
			super();
		}
	}
	public static class CRM implements Entity.Stat {
		protected Integer value = 0;
		protected ListMaps.Sources.Int history = new ListMaps.Sources.Int();
		public Integer getValue(){
			return value;
		}
		public ListMaps.Sources.Int getHistory(){
			return history;
		}
		public void setHistory(ListMaps.Sources.Int newHistory){
			history=newHistory;
		}
		public Integer getValue(Entity user){
			return user.crm.getValue();
		}
		public void setValue(Integer newValue){
			value=newValue;
		}
		public Boolean impose(Integer amount,Source source){
			synchronized(this){
				history.add(source,new Int(amount));
			}
			value+=amount;
			return value>0;
		}
		public void release(Source source){
			synchronized(this){
				history.removeLast(source);
			}
		}
		public String getName(){
			return "CRM";
		}
		public CRM (Integer value,ListMaps.Sources.Int history){
			super();
			this.value=value;
			this.history=history;
		}
		public CRM (){
			super();
		}
	}
}
