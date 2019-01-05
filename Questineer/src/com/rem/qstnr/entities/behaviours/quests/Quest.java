package com.rem.qstnr.entities.behaviours.quests;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import java.util.function.Predicate;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.misc.interfaces.Usable;
import java.util.List;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.behaviours.quests.Quest;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.environments.tiles.Terrain;
public class Quest implements Usable {
	protected Quest.Status status = Quest.Status.UNSTARTED;
	protected Activity currentActivity = null;
	protected Integer currentActivityIndex = -1;
	protected List<Activity> activities = new ArrayList<Activity>();
	protected List<Listenable<Events.StartQuest>> startQuestListeners = null;
	protected List<Listenable<Events.Fail>> failListeners = null;
	public Quest.Status getStatus(){
		return status;
	}
	public void setStatus(Quest.Status newStatus){
		status=newStatus;
	}
	public Activity getCurrentActivity(){
		return currentActivity;
	}
	public void setCurrentActivity(Activity newCurrentActivity){
		currentActivity=newCurrentActivity;
	}
	public Integer getCurrentActivityIndex(){
		return currentActivityIndex;
	}
	public void setCurrentActivityIndex(Integer newCurrentActivityIndex){
		currentActivityIndex=newCurrentActivityIndex;
	}
	public List<Activity> getActivities(){
		return activities;
	}
	public void setActivities(List<Activity> newActivities){
		activities=newActivities;
	}
	public Quest.Id getId(){
		return null;
	}
	public Boolean canChase(){
		return false;
	}
	public Float getRange(Entity user){
		return 0f;
	}
	public Predicate<Entity> getTargetCriteria(){
		return new Entity.Criteria.True();
	}
	public Predicate<Tile> getDestinationCriteria(){
		return new Tile.Criteria.Free();
	}
	public Predicate<Terrain> getTerrainCriteria(){
		return  T->false;
	}
	public Boolean use(Entity user,Activity activity){
		if(status==Status.UNSTARTED){
			on(new Events.StartQuest(this,user));
		}
		if(currentActivity!=null){
			currentActivity.on(new Events.Tick(user));
			return true;
		}
		else{
			return false;
		}
	}
	public void add(Activity newActivity){
		activities.add(newActivity);
		newActivity.add(new Quest.Listeners.Success(this,activities.size()));
		newActivity.add(new Quest.Listeners.Fail(this));
	}
	public void advanceTo(Integer newIndex){
		if(newIndex<activities.size()){
			currentActivity=activities.get(newIndex);
			currentActivityIndex=newIndex;
		}
		else{
			status=Quest.Status.SUCCESS;
		}
	}
	public Boolean on(Events.Idle idle){
		return false;
	}
	public Boolean on(Events.Collect idle){
		return false;
	}
	public Boolean on(Events.Die idle){
		return false;
	}
	public Boolean on(Events.StartQuest event){
		if(activities.isEmpty()==false){
			currentActivity=activities.get(0);
			currentActivityIndex=0;
			status=Quest.Status.IN_PROGRESS;
		}
		else{
			status=Quest.Status.FAIL;
		}
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
	public Boolean on(Events.Fail event){
		status=Quest.Status.FAIL;
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
	public Quest (Quest.Status status,Activity currentActivity,Integer currentActivityIndex,List<Activity> activities,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Fail>> failListeners){
		super();
		this.status=status;
		this.currentActivity=currentActivity;
		this.currentActivityIndex=currentActivityIndex;
		this.activities=activities;
		this.startQuestListeners=startQuestListeners;
		this.failListeners=failListeners;
	}
	public Quest (){
		super();
	}
	public static class Id extends Usable.Id {
		public Id (){
			super();
		}
	}
	public static class Listeners {
		public Listeners (){
			super();
		}
		public static class Success extends Events.Success.Listener {
			protected Quest host = null;
			protected Integer nextIndex = -1;
			public Quest getHost(){
				return host;
			}
			public void setHost(Quest newHost){
				host=newHost;
			}
			public Integer getNextIndex(){
				return nextIndex;
			}
			public void setNextIndex(Integer newNextIndex){
				nextIndex=newNextIndex;
			}
			public Success (Quest host,int nextIndex){
				this.host=host;
				this.nextIndex=nextIndex;
			}
			public Boolean listen(Events.Success event){
				host.advanceTo(nextIndex);
				return true;
			}
			public Success (Quest host,Integer nextIndex){
				super();
				this.host=host;
				this.nextIndex=nextIndex;
			}
			public Success (){
				super();
			}
		}
		public static class Fail extends Events.Fail.Listener {
			protected Quest host = null;
			public Quest getHost(){
				return host;
			}
			public void setHost(Quest newHost){
				host=newHost;
			}
			public Fail (Quest host){
				this.host=host;
			}
			public Boolean listen(Events.Fail event){
				host.on((Events.Fail)event);
				return true;
			}
			public Fail (){
				super();
			}
		}
		public static class Collect extends Events.Collect.Listener {
			protected Quest host = null;
			public Quest getHost(){
				return host;
			}
			public void setHost(Quest newHost){
				host=newHost;
			}
			public Collect (Quest host){
				this.host=host;
			}
			public Boolean listen(Events.Collect event){
				host.on(event);
				return true;
			}
			public Collect (){
				super();
			}
		}
		public static class Die extends Events.Die.Listener {
			protected Quest host = null;
			public Quest getHost(){
				return host;
			}
			public void setHost(Quest newHost){
				host=newHost;
			}
			public Die (Quest host){
				this.host=host;
			}
			public Boolean listen(Events.Die event){
				host.on(event);
				return true;
			}
			public Die (){
				super();
			}
		}
	}
	public static class Criteria implements Predicate<Quest> {
		public boolean test(Quest candidate){
			return true;
		}
		public Criteria (){
			super();
		}
		public static class Success implements Activity.Criteria {
			protected Quest host = null;
			public Quest getHost(){
				return host;
			}
			public void setHost(Quest newHost){
				host=newHost;
			}
			public Success (Quest host){
				this.host=host;
			}
			public boolean test(Activity event){
				return host.getStatus()==Quest.Status.SUCCESS;
			}
			public Success (){
				super();
			}
		}
	}
	public static enum Status {
		 UNSTARTED,
		 IN_PROGRESS,
		 SUCCESS,
		 FAIL
	}
}
