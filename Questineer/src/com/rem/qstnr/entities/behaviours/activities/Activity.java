package com.rem.qstnr.entities.behaviours.activities;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.ArrayList;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.misc.interfaces.Source;
import java.util.function.Predicate;
import com.rem.qstnr.misc.streams.Streamer;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.misc.interfaces.Usable;
import java.util.List;
import java.util.HashSet;
import com.rem.qstnr.entities.behaviours.activities.Activities;
import com.rem.qstnr.entities.behaviours.activities.ActivityType;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Terrain;
public class Activity implements Source {
	protected String name = null;
	protected String description = null;
	protected Set<Tile> exploredPoints = new HashSet<Tile>();
	protected Set<Area> exploredAreas = new HashSet<Area>();
	protected Entity targetEntity = null;
	protected Terrain.MonsterDen targetDen = null;
	protected Terrain targetTerrain = null;
	protected Boolean failed = false;
	protected List<Listenable<Events.Load>> loadListeners = null;
	protected List<Listenable<Events.Success>> successListeners = null;
	protected List<Listenable<Events.Fail>> failListeners = null;
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
	public Set<Tile> getExploredPoints(){
		return exploredPoints;
	}
	public void setExploredPoints(Set<Tile> newExploredPoints){
		exploredPoints=newExploredPoints;
	}
	public Set<Area> getExploredAreas(){
		return exploredAreas;
	}
	public void setExploredAreas(Set<Area> newExploredAreas){
		exploredAreas=newExploredAreas;
	}
	public Entity getTargetEntity(){
		return targetEntity;
	}
	public void setTargetEntity(Entity newTargetEntity){
		targetEntity=newTargetEntity;
	}
	public Terrain.MonsterDen getTargetDen(){
		return targetDen;
	}
	public void setTargetDen(Terrain.MonsterDen newTargetDen){
		targetDen=newTargetDen;
	}
	public Terrain getTargetTerrain(){
		return targetTerrain;
	}
	public void setTargetTerrain(Terrain newTargetTerrain){
		targetTerrain=newTargetTerrain;
	}
	public Boolean getFailed(){
		return failed;
	}
	public void setFailed(Boolean newFailed){
		failed=newFailed;
	}
	public ActivityType getType(){
		return null;
	}
	public void setHost(Entity newHost){
	}
	public Boolean hasTarget(){
		return targetEntity!=null||targetDen!=null||targetTerrain!=null;
	}
	public void rememberEntryPoint(Tile point){
		exploredPoints.add(point);
	}
	public void explore(Area newArea){
		exploredAreas.add(newArea);
	}
	public Boolean hasExplored(Area area){
		return exploredAreas.contains(area);
	}
	public Entity getTarget(Entity host,Entity.Criteria targetCriteria){
		return host.getLocation().getClosestEntity(targetCriteria);
	}
	public Tile getDestination(Entity host){
		return null;
	}
	public Boolean hasSucceeded(Entity host){
		return false;
	}
	public Boolean hasFailed(Entity host){
		return failed;
	}
	public List<Usable> getUsables(){
		return null;
	}
	public Usable pick(){
		if(getUsables().isEmpty()==false){
			return Range.select(getUsables());
		}
		else{
			failed=true;
			return null;
		}
	}
	public void add(Usable newUsable){
	}
	public void remove(Usable newUsable){
	}
	public void listen(Entity host,Entity.Event event){
	}
	public Boolean on(Events.Tick event){
		Entity host = event.getHost();
		if(hasSucceeded(host)){
			on(new Events.Success(host,this));
			host.stop(this);
			return true;
		}
		else if(hasFailed(host)){
			on(new Events.Fail(host,this));
			host.stop(this);
			return true;
		}
		else if(host.isIdle()){
			if(failed==false&&step(host)==false){
				return on(new Events.Idle(host,this));
			}
			else{
				return true;
			}
		}
		else{
			return true;
		}
	}
	public Boolean step(Entity host){
		if(host.getFocusSkill()==null||getUsables().contains(host.getFocusSkill())==false||host.getFocusSkill().use(host,this)==false){
			return Streamer.has(getUsables(), usable->usable!=host.getFocusSkill()&&usable.use(host,Activity.this));
		}
		return false;
	}
	public Boolean on(Events.Idle event){
		List<Entity> entitiesToTarget = event.getHost().getLocation().getEntitiesWithin(20f);
		failed=true;
		entitiesToTarget.parallelStream().map( E->new Object[]{E,Streamer.get(getUsables(), usable->usable.getTargetCriteria().test(E))}).filter( P->P[1]!=null).findAny().ifPresent( P->{						failed=false;
						event.getHost().start(new Activities.ChasingEntity(25,(Entity)P[0],((Usable)P[1]).getRange(event.getHost())));
 });
		return true;
	}
	public List<Usable> getInRangeUsables(Entity host,Entity toTarget){
		Double distanceToTarget = host.getLocation().getDistanceTo(toTarget.getLocation());
		return Streamer.collect(getUsables(), usable->usable.getRange(host)<=distanceToTarget&&usable.getTargetCriteria().test(toTarget));
	}
	public List<Usable> getAvailableUsables(Entity host,Entity toTarget){
		return Streamer.collect(getUsables(), usable->usable.getTargetCriteria().test(toTarget));
	}
	public Usable getFurthestAvailableUsable(Entity host,Entity toTarget){
		return Streamer.race(getUsables(), usable->usable.getTargetCriteria().test(toTarget),0f, usable->usable.getRange(host),(left,right)->left>right);
	}
	public List<Usable> getInRangeUsables(Entity host,Tile toTarget){
		Double distanceToTarget = host.getLocation().getDistanceTo(toTarget);
		return Streamer.collect(getUsables(), usable->usable.getRange(host)<=distanceToTarget&&usable.getDestinationCriteria().test(toTarget));
	}
	public List<Usable> getAvailableUsables(Entity host,Tile toTarget){
		return Streamer.collect(getUsables(), usable->usable.getDestinationCriteria().test(toTarget));
	}
	public Usable getFurthestAvailableUsable(Entity host,Tile toTarget){
		return Streamer.race(getUsables(), usable->usable.getDestinationCriteria().test(toTarget),-1f, usable->usable.getRange(host),(left,right)->left>right);
	}
	public List<Usable> getInRangeUsables(Entity host,Terrain toTarget){
		Double distanceToTarget = host.getLocation().getDistanceTo(toTarget.getFloorTile());
		return Streamer.collect(getUsables(), usable->usable.getRange(host)<=distanceToTarget&&usable.getTerrainCriteria().test(toTarget));
	}
	public List<Usable> getAvailableUsables(Entity host,Terrain toTarget){
		return Streamer.collect(getUsables(), usable->usable.getTerrainCriteria().test(toTarget));
	}
	public Usable getFurthestAvailableUsable(Entity host,Terrain toTarget){
		return Streamer.race(getUsables(), usable->usable.getTerrainCriteria().test(toTarget),-1f, usable->usable.getRange(host),(left,right)->left>right);
	}
	public Activity.Id getId(){
		return null;
	}
	public Boolean on(Events.Load event){
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
	public Activity (String name,String description,Set<Tile> exploredPoints,Set<Area> exploredAreas,Entity targetEntity,Terrain.MonsterDen targetDen,Terrain targetTerrain,Boolean failed,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.Fail>> failListeners){
		super();
		this.name=name;
		this.description=description;
		this.exploredPoints=exploredPoints;
		this.exploredAreas=exploredAreas;
		this.targetEntity=targetEntity;
		this.targetDen=targetDen;
		this.targetTerrain=targetTerrain;
		this.failed=failed;
		this.loadListeners=loadListeners;
		this.successListeners=successListeners;
		this.failListeners=failListeners;
	}
	public Activity (){
		super();
	}
	public static enum Predefined {
	}
	public static interface Criteria extends Predicate<Activity> {
	}
	public static class Id {
		public Id (){
			super();
		}
	}
	public static interface Factory {
		public Activity create();
	}
	public static class Listeners {
		public Listeners (){
			super();
		}
		public static class Fail extends Events.Fail.Listener {
			protected Activity host = null;
			public Activity getHost(){
				return host;
			}
			public void setHost(Activity newHost){
				host=newHost;
			}
			public Boolean listen(Events.Fail event){
				host.on(event);
				return true;
			}
			public Fail (Activity host){
				super();
				this.host=host;
			}
			public Fail (){
				super();
			}
		}
	}
}
