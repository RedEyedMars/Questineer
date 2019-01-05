package com.rem.qstnr.entities.behaviours.quests;
import com.rem.qstnr.entities.behaviours.activities.Activities;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.behaviours.quests.Quests;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.environments.tiles.Terrains;
import com.rem.qstnr.entities.behaviours.quests.Quest;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.entities.Entities;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.events.Events;
import java.util.List;
import com.rem.qstnr.gui.Gui;
public class Quests {
	protected Tile tile = null;
	public Tile getTile(){
		return tile;
	}
	public void setTile(Tile newTile){
		tile=newTile;
	}
	public Quests (Tile tile){
		super();
		this.tile=tile;
	}
	public Quests (){
		super();
	}
	public static class Wolf_Pelt_Hunt extends Quest {
		protected List<Listenable<Events.StartQuest>> startQuestListeners = null;
		protected List<Listenable<Events.Idle>> idleListeners = null;
		public void generateDestinations(Entity quester){
		}
		public Boolean fulfill(Entity quester,Area destinationReached){
			return true;
		}
		public Boolean on(Events.StartQuest event){
			event.getHost().add(new Quest.Listeners.Collect(event.getQuest()));
			if((event.getHost().getLocation().getParent()==Gui.game.getEnvironments().getTown())){
				add(new Activities.FindAndGo(new Tile.Criteria(){public boolean test(Tile candidate){
	return candidate.getPortal()!=null&&candidate.getPortal().getDestinationArea()!=null&&candidate.getPortal().getDestinationArea().getParent()==Gui.game.getEnvironments().getForest();
}
}));
			}
			else if((event.getHost().getLocation().getParent()!=Gui.game.getEnvironments().getForest())){
				add(new Activities.FindAndGo(new Tile.Criteria(){public boolean test(Tile candidate){
	return candidate.getPortal()!=null&&candidate.getPortal().getDestinationArea()!=null&&candidate.getPortal().getDestinationArea().getParent()==Gui.game.getEnvironments().getTown();
}
}));
				add(new Activities.FindAndGo(new Tile.Criteria(){public boolean test(Tile candidate){
	return candidate.getPortal()!=null&&candidate.getPortal().getDestinationArea()!=null&&candidate.getPortal().getDestinationArea().getParent()==Gui.game.getEnvironments().getForest();
}
}));
			}
			add(new Activities.Hunt( candidate->candidate.getId()==Entities.Wolf.id||candidate.getId()==Entities.DireWolf.id,new Tile.Criteria(){public boolean test(Tile candidate){
	return (candidate.getTerrain()!=null&&candidate.getTerrain().getId()==Terrains.MonsterDens.Forest.LoneRock.id);
}
},6.0f,new Quest.Listeners.Die(event.getQuest()),new Quest.Criteria.Success(event.getQuest())));
			super.on(event);
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
		public Boolean on(Events.Idle event){
			event.getHost().start(new Activities.Exploring(200));
			super.on(event);
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
		public Wolf_Pelt_Hunt (List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Idle>> idleListeners){
			super();
			this.startQuestListeners=startQuestListeners;
			this.idleListeners=idleListeners;
		}
		public Wolf_Pelt_Hunt (){
			super();
		}
		public Wolf_Pelt_Hunt (Quest.Status status,Activity currentActivity,Integer currentActivityIndex,List<Activity> activities,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Idle>> idleListeners){
			super(status,currentActivity,currentActivityIndex,activities,startQuestListeners,failListeners);
			this.startQuestListeners=startQuestListeners;
			this.idleListeners=idleListeners;
		}
		public Wolf_Pelt_Hunt (Quest.Status status,Activity currentActivity,Integer currentActivityIndex,List<Activity> activities,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Fail>> failListeners){
			super(status,currentActivity,currentActivityIndex,activities,startQuestListeners,failListeners);
		}
	}
}
