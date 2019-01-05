package com.rem.qstnr.entities.mods.conditions;
import com.rem.qstnr.entities.mods.conditions.Condition;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.entities.mods.conditions.Conditions;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.events.Events;
import java.util.List;
public class Conditions {
	public static Condition create(String conditionName){
		if("Bleeding".equals("Bleeding")){
			return new Conditions.Bleeding();
		}
		if("BloodLoss".equals("BloodLoss")){
			return new Conditions.BloodLoss();
		}
		return null;
	}
	public Conditions (){
		super();
	}
	public static class BloodLoss extends Condition implements Source {
		public static Condition.Id id = new Condition.Id();
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		protected List<Listenable<Events.Tick>> tickListeners = null;
		public String getName(){
			return "BloodLoss";
		}
		public String getDescription(){
			return "Has bled, reducing @Con by 1";
		}
		public Boolean on(Events.Gain event){
			event.getHost().getCon().impose(0,this);
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
		public Boolean on(Events.Loss event){
			event.getHost().getCon().release(this);
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
		public Boolean on(Events.Tick event){
			if(event.getHost().getCon().getValue()>15){
				if((Range.chance(0.2))){
					event.getHost().lose(id,this);
				}
			}
			else if(event.getHost().getCon().getValue()>10){
				if((Range.chance(0.15))){
					event.getHost().lose(id,this);
				}
			}
			else if(event.getHost().getCon().getValue()>5){
				if((Range.chance(0.1))){
					event.getHost().lose(id,this);
				}
			}
			else if((Range.chance(0.05))){
				event.getHost().lose(id,this);
			}
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
		public Boolean hasRequirements(Entity candidate){
			return true;
		}
		public BloodLoss (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Tick>> tickListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
			this.tickListeners=tickListeners;
		}
		public BloodLoss (){
			super();
		}
		public BloodLoss (String name,String description,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners){
			super(name,description,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
			this.tickListeners=tickListeners;
		}
	}
	public static class Bleeding extends Condition implements Source {
		public static Condition.Id id = new Condition.Id();
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		protected List<Listenable<Events.Tick>> tickListeners = null;
		public String getName(){
			return "Bleeding";
		}
		public String getDescription(){
			return "Take @Con damage each tick, a higher @Con will stem the bleeding sooner";
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
		public Boolean on(Events.Tick event){
			event.getHost().gain(new Conditions.BloodLoss(),this);
			if(event.getHost().getCon().getValue()>15){
				if((Range.chance(0.8))){
					event.getHost().lose(id,this);
				}
			}
			else if(event.getHost().getCon().getValue()>10){
				if((Range.chance(0.6))){
					event.getHost().lose(id,this);
				}
			}
			else if((Range.chance(0.4))){
				event.getHost().lose(id,this);
			}
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
		public Boolean hasRequirements(Entity candidate){
			return true;
		}
		public Bleeding (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Tick>> tickListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
			this.tickListeners=tickListeners;
		}
		public Bleeding (){
			super();
		}
		public Bleeding (String name,String description,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners){
			super(name,description,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
			this.tickListeners=tickListeners;
		}
	}
}
