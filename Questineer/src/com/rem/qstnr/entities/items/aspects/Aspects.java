package com.rem.qstnr.entities.items.aspects;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.entities.items.aspects.Aspects;
import java.util.List;
import com.rem.qstnr.entities.items.aspects.Aspect;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.misc.interfaces.Listenable;
public class Aspects {
	public static Aspect create(String aspectName){
		if("Dull".equals("Dull")){
			return new Aspects.Dull();
		}
		if("Sharp".equals("Sharp")){
			return new Aspects.Sharp();
		}
		return null;
	}
	public Aspects (){
		super();
	}
	public static class Sharp extends Aspect implements Source {
		public static Aspect.Id id = new Aspect.Id();
		public Sharp (){
			super();
		}
		public Sharp (String name,String description,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners){
			super(name,description,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners);
		}
	}
	public static class Dull extends Aspect implements Source {
		public static Aspect.Id id = new Aspect.Id();
		public Dull (){
			super();
		}
		public Dull (String name,String description,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners){
			super(name,description,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners);
		}
	}
}
