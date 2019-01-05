package com.rem.qstnr.entities.behaviours.activities;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.ArrayList;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.entities.behaviours.activities.ActivityTypes;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.entities.behaviours.skills.Skills;
import com.rem.qstnr.misc.interfaces.Usable;
import java.util.List;
import com.rem.qstnr.entities.behaviours.activities.Activities;
import com.rem.qstnr.entities.behaviours.activities.ActivityType;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.entities.behaviours.quests.Quest;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.entities.mods.affinities.Affinity;
import com.rem.qstnr.entities.mods.traits.Trait;
public class Activities {
	public static Activity create(String activityName){
		if(activityName.equals("TeachAffinity")){
			return new Activities.TeachAffinity();
		}
		if(activityName.equals("TeachTrait")){
			return new Activities.TeachTrait();
		}
		if(activityName.equals("TeachSkill")){
			return new Activities.TeachSkill();
		}
		if(activityName.equals("Exploring")){
			return new Activities.Exploring();
		}
		if(activityName.equals("GotoArea")){
			return new Activities.GotoArea();
		}
		if(activityName.equals("Goto")){
			return new Activities.Goto();
		}
		if(activityName.equals("FindAndGo")){
			return new Activities.FindAndGo();
		}
		if(activityName.equals("ChasingTile")){
			return new Activities.ChasingTile();
		}
		if(activityName.equals("ChasingEntity")){
			return new Activities.ChasingEntity();
		}
		if(activityName.equals("RemoveTerrain")){
			return new Activities.RemoveTerrain();
		}
		if(activityName.equals("KillDen")){
			return new Activities.KillDen();
		}
		if(activityName.equals("Kill")){
			return new Activities.Kill();
		}
		if(activityName.equals("Hunt")){
			return new Activities.Hunt();
		}
		if(activityName.equals("Questing")){
			return new Activities.Questing();
		}
		if(activityName.equals("Supporting")){
			return new Activities.Supporting();
		}
		if(activityName.equals("Attacking")){
			return new Activities.Attacking();
		}
		return null;
	}
	public Activities (){
		super();
	}
	public static class Attacking extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Float range;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Attacking (){
		}
		public String getName(){
			return "Attacking";
		}
		public String getDescription(){
			return "Attack target";
		}
		public ActivityType getType(){
			return ActivityTypes.Violent;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Float getRange(){
			return range;
		}
		public void setRange(Float newRange){
			range=newRange;
		}
		public Attacking (Float range){
			this.range=range;
		}
		public Attacking (Entity host,Float range){
			super();
			this.host=host;
			this.range=range;
		}
		public Attacking (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Float range){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.range=range;
		}
		public Attacking (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class Supporting extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Supporting (){
		}
		public String getName(){
			return "Supporting";
		}
		public String getDescription(){
			return "Keep everyone safe";
		}
		public ActivityType getType(){
			return ActivityTypes.Helping;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Supporting (Entity host){
			super();
			this.host=host;
		}
		public Supporting (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
		}
		public Supporting (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class Questing extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Quest currentQuest = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Questing (){
		}
		public String getName(){
			return "Questing";
		}
		public String getDescription(){
			return "Go to certain places, do certain things, and reap their rewards.";
		}
		public ActivityType getType(){
			return ActivityTypes.Questing;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(currentQuest!=null&&currentQuest.getStatus()==Quest.Status.SUCCESS){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			if(failed||currentQuest!=null){
				return true;
			}
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Quest getCurrentQuest(){
			return currentQuest;
		}
		public void setCurrentQuest(Quest newCurrentQuest){
			currentQuest=newCurrentQuest;
		}
		public Boolean step(Entity host){
			if((currentQuest==null)){
				currentQuest=(Quest)(pick());
				if((currentQuest==null)){
					return false;
				}
			}
			return currentQuest.use(host,null);
		}
		public Questing (Entity host,Quest currentQuest){
			super();
			this.host=host;
			this.currentQuest=currentQuest;
		}
		public Questing (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Quest currentQuest){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.currentQuest=currentQuest;
		}
		public Questing (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class Hunt extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Entity.Criteria criteriaToTarget;
		protected Tile.Criteria huntingGrounds;
		protected Float range;
		protected Events.Die.Listener deathListener;
		protected Activity.Criteria toSucceed;
		protected List<Area> toHuntLocations;
		protected List<Area> huntedLocations;
		protected Area toHunt;
		protected List<Listenable<Events.Load>> loadListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Hunt (){
		}
		public String getName(){
			return "Hunt";
		}
		public String getDescription(){
			return "Hunt monsters until told otherwise.";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(toSucceed.test(this)){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Entity.Criteria getCriteriaToTarget(){
			return criteriaToTarget;
		}
		public void setCriteriaToTarget(Entity.Criteria newCriteriaToTarget){
			criteriaToTarget=newCriteriaToTarget;
		}
		public Tile.Criteria getHuntingGrounds(){
			return huntingGrounds;
		}
		public void setHuntingGrounds(Tile.Criteria newHuntingGrounds){
			huntingGrounds=newHuntingGrounds;
		}
		public Float getRange(){
			return range;
		}
		public void setRange(Float newRange){
			range=newRange;
		}
		public Events.Die.Listener getDeathListener(){
			return deathListener;
		}
		public void setDeathListener(Events.Die.Listener newDeathListener){
			deathListener=newDeathListener;
		}
		public Activity.Criteria getToSucceed(){
			return toSucceed;
		}
		public void setToSucceed(Activity.Criteria newToSucceed){
			toSucceed=newToSucceed;
		}
		public Hunt (Entity.Criteria criteriaToTarget,Tile.Criteria huntingGrounds,Float range,Events.Die.Listener deathListener,Activity.Criteria toSucceed){
			this.criteriaToTarget=criteriaToTarget;
			this.huntingGrounds=huntingGrounds;
			this.range=range;
			this.deathListener=deathListener;
			this.toSucceed=toSucceed;
		}
		public List<Area> getToHuntLocations(){
			return toHuntLocations;
		}
		public void setToHuntLocations(List<Area> newToHuntLocations){
			toHuntLocations=newToHuntLocations;
		}
		public List<Area> getHuntedLocations(){
			return huntedLocations;
		}
		public void setHuntedLocations(List<Area> newHuntedLocations){
			huntedLocations=newHuntedLocations;
		}
		public Area getToHunt(){
			return toHunt;
		}
		public void setToHunt(Area newToHunt){
			toHunt=newToHunt;
		}
		public Boolean step(Entity host){
			if((host.getLocation().getArea()!=toHunt)){
				host.start(new Activities.GotoArea(toHunt));
			}
			else{
				List<Entity> entitiesToTarget = host.getLocation().getEntitiesWithin(50.0f,criteriaToTarget);
				if((!(entitiesToTarget.isEmpty()))){
					entitiesToTarget.sort(new Entity.Comparators.Distance.Ascending(host.getLocation()));
					host.start(new Activities.Kill(entitiesToTarget.get(0)));
				}
				else{
					Terrain.MonsterDen tileToKill = (Terrain.MonsterDen)toHunt.getRandomTile(huntingGrounds).getTerrain();
					if((tileToKill!=null)){
						host.start(new Activities.KillDen(tileToKill));
					}
					else{
						huntedLocations.add(toHunt);
						toHunt=toHuntLocations.remove(0);
						List<Area> toAdd = host.getLocation().getAreasWith(huntingGrounds,new Area.Comparators.Distance.Ascending(host.getLocation()),range);
						toAdd.removeAll(huntedLocations);
						if((!(toAdd.isEmpty()))){
							toHuntLocations.addAll(toAdd);
							step(host);
						}
						else{
							failed=true;
							return false;
						}
					}
					failed=true;
					return false;
				}
			}
			return true;
		}
		public Boolean on(Events.Load event){
			List<Area> toAdd = event.getHost().getLocation().getAreasWith(huntingGrounds,new Area.Comparators.Distance.Ascending(event.getHost().getLocation()),range);
			toHuntLocations.addAll(toAdd);
			if((!(toHuntLocations.isEmpty()))){
				toHunt=toHuntLocations.remove(0);
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
		public Hunt (Entity host,Entity.Criteria criteriaToTarget,Tile.Criteria huntingGrounds,Float range,Events.Die.Listener deathListener,Activity.Criteria toSucceed,List<Area> toHuntLocations,List<Area> huntedLocations,Area toHunt,List<Listenable<Events.Load>> loadListeners){
			super();
			this.host=host;
			this.criteriaToTarget=criteriaToTarget;
			this.huntingGrounds=huntingGrounds;
			this.range=range;
			this.deathListener=deathListener;
			this.toSucceed=toSucceed;
			this.toHuntLocations=toHuntLocations;
			this.huntedLocations=huntedLocations;
			this.toHunt=toHunt;
			this.loadListeners=loadListeners;
		}
		public Hunt (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Entity.Criteria criteriaToTarget,Tile.Criteria huntingGrounds,Float range,Events.Die.Listener deathListener,Activity.Criteria toSucceed,List<Area> toHuntLocations,List<Area> huntedLocations,Area toHunt){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.criteriaToTarget=criteriaToTarget;
			this.huntingGrounds=huntingGrounds;
			this.range=range;
			this.deathListener=deathListener;
			this.toSucceed=toSucceed;
			this.toHuntLocations=toHuntLocations;
			this.huntedLocations=huntedLocations;
			this.toHunt=toHunt;
			this.loadListeners=loadListeners;
		}
		public Hunt (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class Kill extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Entity toKill;
		protected Activity chaseActivity = null;
		protected List<Listenable<Events.Load>> loadListeners = null;
		protected List<Listenable<Events.Idle>> idleListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Kill (){
		}
		public String getName(){
			return "Kill";
		}
		public String getDescription(){
			return "Go kill one particular monster.";
		}
		public ActivityType getType(){
			return ActivityTypes.Violent;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(toKill.isDead()){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Entity getToKill(){
			return toKill;
		}
		public void setToKill(Entity newToKill){
			toKill=newToKill;
		}
		public Kill (Entity toKill){
			this.toKill=toKill;
		}
		public Activity getChaseActivity(){
			return chaseActivity;
		}
		public void setChaseActivity(Activity newChaseActivity){
			chaseActivity=newChaseActivity;
		}
		public void listen(Entity host,Entity.Event event){
		}
		public Boolean on(Events.Load event){
			setTargetEntity(toKill);
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
		public Boolean on(Events.Idle event){
			Usable furthestUsable = getFurthestAvailableUsable(event.getHost(),toKill);
			if((furthestUsable!=null)){
				chaseActivity=host.start(new Activities.ChasingEntity(25,toKill,furthestUsable.getRange(host)));
			}
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
		public Kill (Entity host,Entity toKill,Activity chaseActivity,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Idle>> idleListeners){
			super();
			this.host=host;
			this.toKill=toKill;
			this.chaseActivity=chaseActivity;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public Kill (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Entity toKill,Activity chaseActivity,List<Listenable<Events.Idle>> idleListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.toKill=toKill;
			this.chaseActivity=chaseActivity;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public Kill (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class KillDen extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Terrain.MonsterDen toKill;
		protected Activity chaseActivity = null;
		protected List<Listenable<Events.Load>> loadListeners = null;
		protected List<Listenable<Events.Idle>> idleListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public KillDen (){
		}
		public String getName(){
			return "KillDen";
		}
		public String getDescription(){
			return "Go kill one particular monster den.";
		}
		public ActivityType getType(){
			return ActivityTypes.Violent;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(toKill.isDead()){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Terrain.MonsterDen getToKill(){
			return toKill;
		}
		public void setToKill(Terrain.MonsterDen newToKill){
			toKill=newToKill;
		}
		public KillDen (Terrain.MonsterDen toKill){
			this.toKill=toKill;
		}
		public Activity getChaseActivity(){
			return chaseActivity;
		}
		public void setChaseActivity(Activity newChaseActivity){
			chaseActivity=newChaseActivity;
		}
		public Boolean on(Events.Load event){
			setTargetDen(toKill);
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
		public Boolean on(Events.Idle event){
			Usable furthestUsable = getFurthestAvailableUsable(event.getHost(),toKill);
			if((furthestUsable!=null)){
				chaseActivity=event.getHost().start(new Activities.ChasingTile(25,toKill.getFloorTile(),furthestUsable.getRange(event.getHost())));
			}
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
		public KillDen (Entity host,Terrain.MonsterDen toKill,Activity chaseActivity,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Idle>> idleListeners){
			super();
			this.host=host;
			this.toKill=toKill;
			this.chaseActivity=chaseActivity;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public KillDen (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Terrain.MonsterDen toKill,Activity chaseActivity,List<Listenable<Events.Idle>> idleListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.toKill=toKill;
			this.chaseActivity=chaseActivity;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public KillDen (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class RemoveTerrain extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Terrain toKill;
		protected Activity chaseActivity = null;
		protected Tile floor = null;
		protected List<Listenable<Events.Load>> loadListeners = null;
		protected List<Listenable<Events.Idle>> idleListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public RemoveTerrain (){
		}
		public String getName(){
			return "RemoveTerrain";
		}
		public String getDescription(){
			return "Go kill one particular monster den.";
		}
		public ActivityType getType(){
			return ActivityTypes.Violent;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(floor.getTerrain()!=toKill){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Terrain getToKill(){
			return toKill;
		}
		public void setToKill(Terrain newToKill){
			toKill=newToKill;
		}
		public RemoveTerrain (Terrain toKill){
			this.toKill=toKill;
		}
		public Activity getChaseActivity(){
			return chaseActivity;
		}
		public void setChaseActivity(Activity newChaseActivity){
			chaseActivity=newChaseActivity;
		}
		public Tile getFloor(){
			return floor;
		}
		public void setFloor(Tile newFloor){
			floor=newFloor;
		}
		public Boolean on(Events.Load event){
			floor=toKill.getFloorTile();
			setTargetTerrain(toKill);
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
		public Boolean on(Events.Idle event){
			Usable furthestUsable = getFurthestAvailableUsable(event.getHost(),toKill);
			if((furthestUsable!=null)){
				chaseActivity=event.getHost().start(new Activities.ChasingTile(25,toKill.getFloorTile(),furthestUsable.getRange(event.getHost())));
			}
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
		public RemoveTerrain (Entity host,Terrain toKill,Activity chaseActivity,Tile floor,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Idle>> idleListeners){
			super();
			this.host=host;
			this.toKill=toKill;
			this.chaseActivity=chaseActivity;
			this.floor=floor;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public RemoveTerrain (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Terrain toKill,Activity chaseActivity,Tile floor,List<Listenable<Events.Idle>> idleListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.toKill=toKill;
			this.chaseActivity=chaseActivity;
			this.floor=floor;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public RemoveTerrain (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class ChasingEntity extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Integer ticks;
		protected Entity toChase;
		protected Float successRange;
		protected List<Listenable<Events.Tick>> tickListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public ChasingEntity (){
		}
		public String getName(){
			return "ChasingEntity";
		}
		public String getDescription(){
			return "Get close to one monster(disregard the path).";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(host.getLocation().getDistanceTo(toChase.getLocation())<=successRange){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			if(ticks<=0){
				return true;
			}
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Integer getTicks(){
			return ticks;
		}
		public void setTicks(Integer newTicks){
			ticks=newTicks;
		}
		public Entity getToChase(){
			return toChase;
		}
		public void setToChase(Entity newToChase){
			toChase=newToChase;
		}
		public Float getSuccessRange(){
			return successRange;
		}
		public void setSuccessRange(Float newSuccessRange){
			successRange=newSuccessRange;
		}
		public ChasingEntity (Integer ticks,Entity toChase,Float successRange){
			this.ticks=ticks;
			this.toChase=toChase;
			this.successRange=successRange;
		}
		public Boolean step(Entity host){
			host.getLocation().step(host.getWalkingSpeed(),toChase.getLocation());
			return true;
		}
		public Boolean on(Events.Tick event){
			ticks-=1;
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
		public ChasingEntity (Entity host,Integer ticks,Entity toChase,Float successRange,List<Listenable<Events.Tick>> tickListeners){
			super();
			this.host=host;
			this.ticks=ticks;
			this.toChase=toChase;
			this.successRange=successRange;
			this.tickListeners=tickListeners;
		}
		public ChasingEntity (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Integer ticks,Entity toChase,Float successRange,List<Listenable<Events.Tick>> tickListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.ticks=ticks;
			this.toChase=toChase;
			this.successRange=successRange;
			this.tickListeners=tickListeners;
		}
		public ChasingEntity (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class ChasingTile extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Integer ticks;
		protected Tile toChase;
		protected Float successRange;
		protected List<Listenable<Events.Tick>> tickListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public ChasingTile (){
		}
		public String getName(){
			return "ChasingTile";
		}
		public String getDescription(){
			return "Get close to one particular tile (disregard the path).";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(host.getLocation().getDistanceTo(toChase)<=successRange){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			if(ticks<=0){
				return true;
			}
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Integer getTicks(){
			return ticks;
		}
		public void setTicks(Integer newTicks){
			ticks=newTicks;
		}
		public Tile getToChase(){
			return toChase;
		}
		public void setToChase(Tile newToChase){
			toChase=newToChase;
		}
		public Float getSuccessRange(){
			return successRange;
		}
		public void setSuccessRange(Float newSuccessRange){
			successRange=newSuccessRange;
		}
		public ChasingTile (Integer ticks,Tile toChase,Float successRange){
			this.ticks=ticks;
			this.toChase=toChase;
			this.successRange=successRange;
		}
		public Boolean step(Entity host){
			host.getLocation().step(host.getWalkingSpeed(),toChase);
			return true;
		}
		public Boolean on(Events.Tick event){
			ticks-=1;
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
		public ChasingTile (Entity host,Integer ticks,Tile toChase,Float successRange,List<Listenable<Events.Tick>> tickListeners){
			super();
			this.host=host;
			this.ticks=ticks;
			this.toChase=toChase;
			this.successRange=successRange;
			this.tickListeners=tickListeners;
		}
		public ChasingTile (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Integer ticks,Tile toChase,Float successRange,List<Listenable<Events.Tick>> tickListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.ticks=ticks;
			this.toChase=toChase;
			this.successRange=successRange;
			this.tickListeners=tickListeners;
		}
		public ChasingTile (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class FindAndGo extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Tile.Criteria target;
		protected Area destinationArea = null;
		protected Tile.Way way = null;
		protected Tile destination;
		protected List<Listenable<Events.Load>> loadListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public FindAndGo (){
		}
		public String getName(){
			return "FindAndGo";
		}
		public String getDescription(){
			return "Find a particular tile, follow path to get to it.";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(host.getLocation().isCloseAsPossibleTo(destination)){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Tile.Criteria getTarget(){
			return target;
		}
		public void setTarget(Tile.Criteria newTarget){
			target=newTarget;
		}
		public FindAndGo (Tile.Criteria target){
			this.target=target;
		}
		public Area getDestinationArea(){
			return destinationArea;
		}
		public void setDestinationArea(Area newDestinationArea){
			destinationArea=newDestinationArea;
		}
		public Tile.Way getWay(){
			return way;
		}
		public void setWay(Tile.Way newWay){
			way=newWay;
		}
		public Tile getDestination(){
			return destination;
		}
		public void setDestination(Tile newDestination){
			destination=newDestination;
		}
		public Boolean step(Entity host){
			if((host.getLocation().getArea()!=destinationArea)){
				host.start(new Activities.GotoArea(destinationArea));
			}
			else{
				if((way==null)){
					way=host.getLocation().getWay(destination);
				}
				way.step(host);
			}
			return true;
		}
		public Boolean on(Events.Load event){
			destination=(Tile)host.getLocation().getClosestTile(target);
			if((destination!=null)){
				destinationArea=destination.getArea();
			}
			else{
				failed=true;
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
		public FindAndGo (Entity host,Tile.Criteria target,Area destinationArea,Tile.Way way,Tile destination,List<Listenable<Events.Load>> loadListeners){
			super();
			this.host=host;
			this.target=target;
			this.destinationArea=destinationArea;
			this.way=way;
			this.destination=destination;
			this.loadListeners=loadListeners;
		}
		public FindAndGo (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Tile.Criteria target,Area destinationArea,Tile.Way way,Tile destination){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.target=target;
			this.destinationArea=destinationArea;
			this.way=way;
			this.destination=destination;
			this.loadListeners=loadListeners;
		}
		public FindAndGo (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class Goto extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Tile destination;
		protected Area destinationArea = null;
		protected Tile.Way way = null;
		protected List<Listenable<Events.Load>> loadListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Goto (){
		}
		public String getName(){
			return "Goto";
		}
		public String getDescription(){
			return "Find a particular tile, follow path to get to it.";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(host.getLocation().isCloseAsPossibleTo(destination)){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Tile getDestination(){
			return destination;
		}
		public void setDestination(Tile newDestination){
			destination=newDestination;
		}
		public Goto (Tile destination){
			this.destination=destination;
		}
		public Area getDestinationArea(){
			return destinationArea;
		}
		public void setDestinationArea(Area newDestinationArea){
			destinationArea=newDestinationArea;
		}
		public Tile.Way getWay(){
			return way;
		}
		public void setWay(Tile.Way newWay){
			way=newWay;
		}
		public Boolean step(Entity host){
			if((host.getLocation().getArea()!=destinationArea)){
				host.start(new Activities.GotoArea(destinationArea));
			}
			else{
				if((way==null)){
					way=host.getLocation().getWay(destination);
				}
				way.step(host);
			}
			return true;
		}
		public Boolean on(Events.Load event){
			destinationArea=destination.getArea();
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
		public Goto (Entity host,Tile destination,Area destinationArea,Tile.Way way,List<Listenable<Events.Load>> loadListeners){
			super();
			this.host=host;
			this.destination=destination;
			this.destinationArea=destinationArea;
			this.way=way;
			this.loadListeners=loadListeners;
		}
		public Goto (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Tile destination,Area destinationArea,Tile.Way way){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.destination=destination;
			this.destinationArea=destinationArea;
			this.way=way;
			this.loadListeners=loadListeners;
		}
		public Goto (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class GotoArea extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Area destination;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public GotoArea (){
		}
		public String getName(){
			return "GotoArea";
		}
		public String getDescription(){
			return "Find a particular tile, follow path to get to it.";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(host.getLocation().getArea()==destination){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Area getDestination(){
			return destination;
		}
		public void setDestination(Area newDestination){
			destination=newDestination;
		}
		public GotoArea (Area destination){
			this.destination=destination;
		}
		public Boolean step(Entity host){
			if((host.getLocation().getArea()!=destination)){
				host.start(new Activities.Goto(host.getLocation().getArea().getEntryPointToward(destination)));
			}
			return true;
		}
		public GotoArea (Entity host,Area destination){
			super();
			this.host=host;
			this.destination=destination;
		}
		public GotoArea (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Area destination){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.destination=destination;
		}
		public GotoArea (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class Exploring extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Integer ticks;
		protected Tile destination = null;
		protected Tile.Way way = null;
		protected List<Listenable<Events.Load>> loadListeners = null;
		protected List<Listenable<Events.Idle>> idleListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Exploring (){
		}
		public String getName(){
			return "Exploring";
		}
		public String getDescription(){
			return "Go to unexplored parts of the map.";
		}
		public ActivityType getType(){
			return ActivityTypes.Tracking;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(ticks<=0){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Integer getTicks(){
			return ticks;
		}
		public void setTicks(Integer newTicks){
			ticks=newTicks;
		}
		public Exploring (Integer ticks){
			this.ticks=ticks;
		}
		public Tile getDestination(){
			return destination;
		}
		public void setDestination(Tile newDestination){
			destination=newDestination;
		}
		public Tile.Way getWay(){
			return way;
		}
		public void setWay(Tile.Way newWay){
			way=newWay;
		}
		public Boolean step(Entity host){
			if((destination.getArea()!=host.getLocation().getArea())){
				return false;
			}
			ticks-=1;
			if((destination.hasOccupant(host))){
				return false;
			}
			else{
				way.step(host);
				return true;
			}
		}
		public void listen(Entity host,Entity.Event event){
			if((event instanceof Entity.Event.FailedToMove.TileHasOccupant)){
				Entity.Event.FailedToMove.TileHasOccupant blocked = (Entity.Event.FailedToMove.TileHasOccupant)event;
				if((host.isFriendlyWith(blocked.getCausalOccupant()))){
				}
				else{
					host.start(new Activities.Kill(blocked.getCausalOccupant()));
				}
			}
			else if((event instanceof Entity.Event.FailedToMove.TerrainImpassable)){
				Entity.Event.FailedToMove.TerrainImpassable blocked = (Entity.Event.FailedToMove.TerrainImpassable)event;
				host.start(new Activities.RemoveTerrain(blocked.getCausalTerrain()));
			}
		}
		public Boolean on(Events.Load event){
			destination=event.getHost().getLocation().getUnexploredPoint();
			way=event.getHost().getLocation().getWay(destination);
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
		public Boolean on(Events.Idle event){
			destination=event.getHost().getLocation().getUnexploredPoint();
			if((destination!=null)){
				way=event.getHost().getLocation().getWay(destination);
			}
			else{
				failed=true;
			}
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
		public Exploring (Entity host,Integer ticks,Tile destination,Tile.Way way,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Idle>> idleListeners){
			super();
			this.host=host;
			this.ticks=ticks;
			this.destination=destination;
			this.way=way;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public Exploring (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Integer ticks,Tile destination,Tile.Way way,List<Listenable<Events.Idle>> idleListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.ticks=ticks;
			this.destination=destination;
			this.way=way;
			this.loadListeners=loadListeners;
			this.idleListeners=idleListeners;
		}
		public Exploring (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class TeachSkill extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Entity pupil;
		protected Skill skill;
		protected List<Listenable<Events.Load>> loadListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public TeachSkill (){
		}
		public String getName(){
			return "TeachSkill";
		}
		public String getDescription(){
			return "Teaching an skill";
		}
		public ActivityType getType(){
			return ActivityTypes.Learning;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(pupil.has(skill.getId())){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Entity getPupil(){
			return pupil;
		}
		public void setPupil(Entity newPupil){
			pupil=newPupil;
		}
		public Skill getSkill(){
			return skill;
		}
		public void setSkill(Skill newSkill){
			skill=newSkill;
		}
		public TeachSkill (Entity pupil,Skill skill){
			this.pupil=pupil;
			this.skill=skill;
		}
		public Boolean step(Entity host){
			if((host.has(Skills.TeachSkills.id))){
				Skills.TeachSkills teachSkill = (Skills.TeachSkills)host.get(Skills.TeachSkills.id);
				if((teachSkill.get(skill.getId()).isOffCooldown())){
					teachSkill.get(skill.getId()).use(host,pupil);
				}
			}
			else if((Range.chance(0.1))){
				pupil.gain(skill.copy());
			}
			return true;
		}
		public Boolean on(Events.Load event){
			if((pupil.has(skill.getId()))){
				failed=true;
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
		public TeachSkill (Entity host,Entity pupil,Skill skill,List<Listenable<Events.Load>> loadListeners){
			super();
			this.host=host;
			this.pupil=pupil;
			this.skill=skill;
			this.loadListeners=loadListeners;
		}
		public TeachSkill (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Entity pupil,Skill skill){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.pupil=pupil;
			this.skill=skill;
			this.loadListeners=loadListeners;
		}
		public TeachSkill (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class TeachTrait extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Entity pupil;
		protected Trait trait;
		protected List<Listenable<Events.Load>> loadListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public TeachTrait (){
		}
		public String getName(){
			return "TeachTrait";
		}
		public String getDescription(){
			return "Teaching an trait";
		}
		public ActivityType getType(){
			return ActivityTypes.Learning;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(pupil.has(trait.getId())){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Entity getPupil(){
			return pupil;
		}
		public void setPupil(Entity newPupil){
			pupil=newPupil;
		}
		public Trait getTrait(){
			return trait;
		}
		public void setTrait(Trait newTrait){
			trait=newTrait;
		}
		public TeachTrait (Entity pupil,Trait trait){
			this.pupil=pupil;
			this.trait=trait;
		}
		public Boolean step(Entity host){
			if((host.has(Skills.TeachTraits.id))){
				Skills.TeachTraits skill = (Skills.TeachTraits)host.get(Skills.TeachTraits.id);
				if((skill.get(trait.getId()).isOffCooldown())){
					skill.get(trait.getId()).use(host,pupil);
				}
			}
			else if((Range.chance(0.1))){
				pupil.gain(trait);
			}
			return true;
		}
		public Boolean on(Events.Load event){
			if((pupil.has(trait.getId()))){
				failed=true;
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
		public TeachTrait (Entity host,Entity pupil,Trait trait,List<Listenable<Events.Load>> loadListeners){
			super();
			this.host=host;
			this.pupil=pupil;
			this.trait=trait;
			this.loadListeners=loadListeners;
		}
		public TeachTrait (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Entity pupil,Trait trait){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.pupil=pupil;
			this.trait=trait;
			this.loadListeners=loadListeners;
		}
		public TeachTrait (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
	public static class TeachAffinity extends Activity {
		public static Activity.Id id = new Activity.Id();
		public static List<Usable> allUsables = new ArrayList<Usable>();
		protected Entity host = null;
		protected Entity pupil;
		protected Affinity affinity;
		protected List<Listenable<Events.Load>> loadListeners = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public TeachAffinity (){
		}
		public String getName(){
			return "TeachAffinity";
		}
		public String getDescription(){
			return "Teaching an affinity";
		}
		public ActivityType getType(){
			return ActivityTypes.Learning;
		}
		public List<Usable> getUsables(){
			return allUsables;
		}
		public Boolean hasSucceeded(Entity host){
			if(pupil.has(affinity.getId())){
				return true;
			}
			return false;
		}
		public Boolean hasFailed(Entity host){
			return false;
		}
		public Activity.Id getId(){
			return id;
		}
		public Entity getPupil(){
			return pupil;
		}
		public void setPupil(Entity newPupil){
			pupil=newPupil;
		}
		public Affinity getAffinity(){
			return affinity;
		}
		public void setAffinity(Affinity newAffinity){
			affinity=newAffinity;
		}
		public TeachAffinity (Entity pupil,Affinity affinity){
			this.pupil=pupil;
			this.affinity=affinity;
		}
		public Boolean step(Entity host){
			if((host.has(Skills.TeachAffinity.id))){
				Skills.TeachAffinities skill = (Skills.TeachAffinities)host.get(Skills.TeachAffinities.id);
				if((skill.get(affinity.getId()).isOffCooldown())){
					skill.get(affinity.getId()).use(host,pupil);
				}
			}
			else{
				if((Range.chance(0.1))){
					pupil.gain(affinity);
				}
				if((Range.chance(0.05))){
					pupil.gain(affinity);
				}
			}
			return true;
		}
		public Boolean on(Events.Load event){
			if((pupil.has(affinity.getId()))){
				failed=true;
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
		public TeachAffinity (Entity host,Entity pupil,Affinity affinity,List<Listenable<Events.Load>> loadListeners){
			super();
			this.host=host;
			this.pupil=pupil;
			this.affinity=affinity;
			this.loadListeners=loadListeners;
		}
		public TeachAffinity (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners,Entity host,Entity pupil,Affinity affinity){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
			this.host=host;
			this.pupil=pupil;
			this.affinity=affinity;
			this.loadListeners=loadListeners;
		}
		public TeachAffinity (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
			super(name,description,exploredPoints,exploredAreas,targetEntity,targetDen,targetTerrain,failed,loadListeners,successListeners,failListeners);
		}
	}
}
