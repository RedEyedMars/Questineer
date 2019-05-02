package com.rem.qstnr.entities.items.aspects;
import com.rem.qstnr.events.Events;
import java.util.ArrayList;
import java.util.List;
import com.rem.qstnr.entities.items.aspects.Aspect;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.entities.mods.conditions.Conditions;
import com.rem.qstnr.misc.interfaces.Listenable;
public class Aspect implements Source {
	protected String name;
	protected String description;
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
	public Aspect.Id getId(){
		return null;
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
		event.getHost().getStr().release(this);
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
		if((event.getHost().getDex().getValue()<5&&Range.chance(0.05))){
			event.getHost().gain(new Conditions.Bleeding(),this);
		}
		event.getHost().getStr().impose(-1,this);
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
		if((event.getAttacker().getDex().getValue()>event.getDefender().getDex().getValue())){
			if((Range.chance(0.5))){
				event.getDefender().gain(new Conditions.Bleeding(),this);
			}
		}
		else{
			if((event.getDefender().getDex().getValue()>event.getAttacker().getDex().getValue()-5)){
				if((Range.chance(0.2))){
					event.getDefender().gain(new Conditions.Bleeding(),this);
				}
			}
		}
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
	public Aspect (String name,String description,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners){
		super();
		this.name=name;
		this.description=description;
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
	}
	public Aspect (){
		super();
	}
	public static class Id {
		public Id (){
			super();
		}
	}
}
