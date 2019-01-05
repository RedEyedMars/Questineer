package com.rem.qstnr.events;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.entities.items.aspects.Aspect;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.entities.items.Item;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attack;
import com.rem.qstnr.entities.behaviours.quests.Quest;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.events.Event;
public class Events {
	public Events (){
		super();
	}
	public static class Gain extends Event {
		public static Event.Id id = Event.Id.gain;
		protected Entity host;
		protected Aspect aspect;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Aspect getAspect(){
			return aspect;
		}
		public void setAspect(Aspect newAspect){
			aspect=newAspect;
		}
		public Gain (Entity host,Aspect aspect){
			this.host=host;
			this.aspect=aspect;
		}
		public Gain (){
			super();
		}
		public static class Listener implements Listenable<Events.Gain> {
			public Boolean listen(Events.Gain event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Loss extends Event {
		public static Event.Id id = Event.Id.loss;
		protected Entity host;
		protected Aspect aspect;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Aspect getAspect(){
			return aspect;
		}
		public void setAspect(Aspect newAspect){
			aspect=newAspect;
		}
		public Loss (Entity host,Aspect aspect){
			this.host=host;
			this.aspect=aspect;
		}
		public Loss (){
			super();
		}
		public static class Listener implements Listenable<Events.Loss> {
			public Boolean listen(Events.Loss event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Equip extends Event {
		public static Event.Id id = Event.Id.equip;
		protected Entity host;
		protected Item item;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Item getItem(){
			return item;
		}
		public void setItem(Item newItem){
			item=newItem;
		}
		public Equip (Entity host,Item item){
			this.host=host;
			this.item=item;
		}
		public Equip (){
			super();
		}
		public static class Listener implements Listenable<Events.Equip> {
			public Boolean listen(Events.Equip event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Unequip extends Event {
		public static Event.Id id = Event.Id.unequip;
		protected Entity host;
		protected Item item;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Item getItem(){
			return item;
		}
		public void setItem(Item newItem){
			item=newItem;
		}
		public Unequip (Entity host,Item item){
			this.host=host;
			this.item=item;
		}
		public Unequip (){
			super();
		}
		public static class Listener implements Listenable<Events.Unequip> {
			public Boolean listen(Events.Unequip event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class ChangeItem extends Event {
		public static Event.Id id = Event.Id.change_item;
		protected Entity host;
		protected Item item;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Item getItem(){
			return item;
		}
		public void setItem(Item newItem){
			item=newItem;
		}
		public ChangeItem (Entity host,Item item){
			this.host=host;
			this.item=item;
		}
		public ChangeItem (){
			super();
		}
		public static class Listener implements Listenable<Events.ChangeItem> {
			public Boolean listen(Events.ChangeItem event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class PreAttack extends Event {
		public static Event.Id id = Event.Id.pre_attack;
		protected Entity attacker;
		protected Entity defender;
		protected Attack.Damage damage;
		public Entity getAttacker(){
			return attacker;
		}
		public void setAttacker(Entity newAttacker){
			attacker=newAttacker;
		}
		public Entity getDefender(){
			return defender;
		}
		public void setDefender(Entity newDefender){
			defender=newDefender;
		}
		public Attack.Damage getDamage(){
			return damage;
		}
		public void setDamage(Attack.Damage newDamage){
			damage=newDamage;
		}
		public PreAttack (Entity attacker,Entity defender,Attack.Damage damage){
			this.attacker=attacker;
			this.defender=defender;
			this.damage=damage;
		}
		public PreAttack (){
			super();
		}
		public static class Listener implements Listenable<Events.PreAttack> {
			public Boolean listen(Events.PreAttack event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class PostAttack extends Event {
		public static Event.Id id = Event.Id.post_attack;
		protected Entity attacker;
		protected Entity defender;
		protected Attack.Damage damage;
		public Entity getAttacker(){
			return attacker;
		}
		public void setAttacker(Entity newAttacker){
			attacker=newAttacker;
		}
		public Entity getDefender(){
			return defender;
		}
		public void setDefender(Entity newDefender){
			defender=newDefender;
		}
		public Attack.Damage getDamage(){
			return damage;
		}
		public void setDamage(Attack.Damage newDamage){
			damage=newDamage;
		}
		public PostAttack (Entity attacker,Entity defender,Attack.Damage damage){
			this.attacker=attacker;
			this.defender=defender;
			this.damage=damage;
		}
		public PostAttack (){
			super();
		}
		public static class Listener implements Listenable<Events.PostAttack> {
			public Boolean listen(Events.PostAttack event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Hit extends Event {
		public static Event.Id id = Event.Id.hit;
		protected Entity attacker;
		protected Entity defender;
		protected Attack.Damage damage;
		public Entity getAttacker(){
			return attacker;
		}
		public void setAttacker(Entity newAttacker){
			attacker=newAttacker;
		}
		public Entity getDefender(){
			return defender;
		}
		public void setDefender(Entity newDefender){
			defender=newDefender;
		}
		public Attack.Damage getDamage(){
			return damage;
		}
		public void setDamage(Attack.Damage newDamage){
			damage=newDamage;
		}
		public Hit (Entity attacker,Entity defender,Attack.Damage damage){
			this.attacker=attacker;
			this.defender=defender;
			this.damage=damage;
		}
		public Hit (){
			super();
		}
		public static class Listener implements Listenable<Events.Hit> {
			public Boolean listen(Events.Hit event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Miss extends Event {
		public static Event.Id id = Event.Id.miss;
		protected Entity attacker;
		protected Entity defender;
		protected Attack.Damage damage;
		public Entity getAttacker(){
			return attacker;
		}
		public void setAttacker(Entity newAttacker){
			attacker=newAttacker;
		}
		public Entity getDefender(){
			return defender;
		}
		public void setDefender(Entity newDefender){
			defender=newDefender;
		}
		public Attack.Damage getDamage(){
			return damage;
		}
		public void setDamage(Attack.Damage newDamage){
			damage=newDamage;
		}
		public Miss (Entity attacker,Entity defender,Attack.Damage damage){
			this.attacker=attacker;
			this.defender=defender;
			this.damage=damage;
		}
		public Miss (){
			super();
		}
		public static class Listener implements Listenable<Events.Miss> {
			public Boolean listen(Events.Miss event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Die extends Event {
		public static Event.Id id = Event.Id.die;
		protected Source source;
		protected Entity deceased;
		public Source getSource(){
			return source;
		}
		public void setSource(Source newSource){
			source=newSource;
		}
		public Entity getDeceased(){
			return deceased;
		}
		public void setDeceased(Entity newDeceased){
			deceased=newDeceased;
		}
		public Die (Source source,Entity deceased){
			this.source=source;
			this.deceased=deceased;
		}
		public Die (){
			super();
		}
		public static class Listener implements Listenable<Events.Die> {
			public Boolean listen(Events.Die event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Collect extends Event {
		public static Event.Id id = Event.Id.collect;
		protected Source source;
		protected Entity host;
		protected Item item;
		public Source getSource(){
			return source;
		}
		public void setSource(Source newSource){
			source=newSource;
		}
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Item getItem(){
			return item;
		}
		public void setItem(Item newItem){
			item=newItem;
		}
		public Collect (Source source,Entity host,Item item){
			this.source=source;
			this.host=host;
			this.item=item;
		}
		public Collect (){
			super();
		}
		public static class Listener implements Listenable<Events.Collect> {
			public Boolean listen(Events.Collect event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Joined extends Event {
		public static Event.Id id = Event.Id.joined;
		protected Entity recruiter;
		protected Entity recruit;
		public Entity getRecruiter(){
			return recruiter;
		}
		public void setRecruiter(Entity newRecruiter){
			recruiter=newRecruiter;
		}
		public Entity getRecruit(){
			return recruit;
		}
		public void setRecruit(Entity newRecruit){
			recruit=newRecruit;
		}
		public Joined (Entity recruiter,Entity recruit){
			this.recruiter=recruiter;
			this.recruit=recruit;
		}
		public Joined (){
			super();
		}
		public static class Listener implements Listenable<Events.Joined> {
			public Boolean listen(Events.Joined event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class StartQuest extends Event {
		public static Event.Id id = Event.Id.startQuest;
		protected Quest quest;
		protected Entity host;
		public Quest getQuest(){
			return quest;
		}
		public void setQuest(Quest newQuest){
			quest=newQuest;
		}
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public StartQuest (Quest quest,Entity host){
			this.quest=quest;
			this.host=host;
		}
		public StartQuest (){
			super();
		}
		public static class Listener implements Listenable<Events.StartQuest> {
			public Boolean listen(Events.StartQuest event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Idle extends Event {
		public static Event.Id id = Event.Id.idle;
		protected Entity host;
		protected Activity idling;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Activity getIdling(){
			return idling;
		}
		public void setIdling(Activity newIdling){
			idling=newIdling;
		}
		public Idle (Entity host,Activity idling){
			this.host=host;
			this.idling=idling;
		}
		public Idle (){
			super();
		}
		public static class Listener implements Listenable<Events.Idle> {
			public Boolean listen(Events.Idle event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Success extends Event {
		public static Event.Id id = Event.Id.success;
		protected Entity host;
		protected Activity succeeded;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Activity getSucceeded(){
			return succeeded;
		}
		public void setSucceeded(Activity newSucceeded){
			succeeded=newSucceeded;
		}
		public Success (Entity host,Activity succeeded){
			this.host=host;
			this.succeeded=succeeded;
		}
		public Success (){
			super();
		}
		public static class Listener implements Listenable<Events.Success> {
			public Boolean listen(Events.Success event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Fail extends Event {
		public static Event.Id id = Event.Id.fail;
		protected Entity host;
		protected Activity failed;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Activity getFailed(){
			return failed;
		}
		public void setFailed(Activity newFailed){
			failed=newFailed;
		}
		public Fail (Entity host,Activity failed){
			this.host=host;
			this.failed=failed;
		}
		public Fail (){
			super();
		}
		public static class Listener implements Listenable<Events.Fail> {
			public Boolean listen(Events.Fail event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Load extends Event {
		public static Event.Id id = Event.Id.load;
		protected Entity host;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Load (Entity host){
			this.host=host;
		}
		public Load (){
			super();
		}
		public static class Listener implements Listenable<Events.Load> {
			public Boolean listen(Events.Load event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Start extends Event {
		public static Event.Id id = Event.Id.start;
		protected Entity host;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Start (Entity host){
			this.host=host;
		}
		public Start (){
			super();
		}
		public static class Listener implements Listenable<Events.Start> {
			public Boolean listen(Events.Start event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
	public static class Tick extends Event {
		public static Event.Id id = Event.Id.tick;
		protected Entity host;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Tick (Entity host){
			this.host=host;
		}
		public Tick (){
			super();
		}
		public static class Listener implements Listenable<Events.Tick> {
			public Boolean listen(Events.Tick event){
				return true;
			}
			public Listener (){
				super();
			}
		}
	}
}
