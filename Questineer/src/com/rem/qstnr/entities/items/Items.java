package com.rem.qstnr.entities.items;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.entities.items.Item;
import java.util.function.Function;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.entities.items.Items;
import java.util.List;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.entities.items.aspects.Aspects;
import com.rem.qstnr.misc.ListMaps;
import com.rem.qstnr.entities.mods.traits.Trait;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attacks;
public class Items {
	public static Item create(String itemName){
		if(itemName.equals("Berries")){
			return new Items.Berries();
		}
		if(itemName.equals("Honey")){
			return new Items.Honey();
		}
		if(itemName.equals("DeadMeat")){
			return new Items.DeadMeat();
		}
		if(itemName.equals("TreeSeed")){
			return new Items.TreeSeed();
		}
		if(itemName.equals("Seed")){
			return new Items.Seed();
		}
		if(itemName.equals("Dagger")){
			return new Items.Dagger();
		}
		if(itemName.equals("Stick")){
			return new Items.Stick();
		}
		return null;
	}
	public Items (){
		super();
	}
	public static class Id {
		public Id (){
			super();
		}
	}
	public static class Stick extends Item {
		public static Items.Id id = new Items.Id();
		public Stick (){
			name="stick";
			hp=(int)(float)(100.0f);
			maxHp=hp;
			dmg= E->1.0f;
			def= E->0.0f;
			value=(int)(float)(0.0f);
			weight=(int)(float)(5.0f);
		}
		public Stick (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
	public static class Dagger extends Item {
		public static Items.Id id = new Items.Id();
		protected List<Listenable<Events.ChangeItem>> change_itemListeners = null;
		protected List<Listenable<Events.Equip>> equipListeners = null;
		protected List<Listenable<Events.Unequip>> unequipListeners = null;
		public Dagger (){
			name="dagger";
			hp=(int)(float)(Range.getRandom(10.0f,15.0f));
			maxHp=hp;
			dmg= E->Range.getRandom(2.0f,3.0f);
			def= E->1.0f;
			value=(int)(float)(Range.getRandom(50.0f,100.0f));
			weight=(int)(float)(3.0f);
		}
		public Boolean on(Events.ChangeItem event){
			if(hp>6&& !event.getItem().has(Aspects.Sharp.id)){
				event.getItem().gain(new Aspects.Sharp(),this);
			}
			if(hp<=6&&event.getItem().has(Aspects.Sharp.id)){
				event.getItem().lose(Aspects.Sharp.id,this);
			}
			if(hp<3&& !event.getItem().has(Aspects.Dull.id)){
				event.getItem().gain(new Aspects.Dull(),this);
			}
			if(hp>=3&&event.getItem().has(Aspects.Dull.id)){
				event.getItem().lose(Aspects.Dull.id,this);
			}
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
		public Boolean on(Events.Equip event){
			if(event.getHost().has(Trait.Id.HandyWithAKnife)&& !event.getHost().has(Attacks.DaggerThrow.id)){
				event.getHost().gain(new Attacks.DaggerThrow(),this);
			}
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
		public Boolean on(Events.Unequip event){
			if(!(event.getHost().has(Trait.Id.HandyWithAKnife))&&event.getHost().has(Attacks.DaggerThrow.id)){
				event.getHost().lose(Attacks.DaggerThrow.id,this);
			}
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
		public Dagger (List<Listenable<Events.ChangeItem>> change_itemListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Unequip>> unequipListeners){
			super();
			this.change_itemListeners=change_itemListeners;
			this.equipListeners=equipListeners;
			this.unequipListeners=unequipListeners;
		}
		public Dagger (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects,List<Listenable<Events.ChangeItem>> change_itemListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Unequip>> unequipListeners){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
			this.change_itemListeners=change_itemListeners;
			this.equipListeners=equipListeners;
			this.unequipListeners=unequipListeners;
		}
		public Dagger (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
	public static class Seed extends Item {
		public static Items.Id id = new Items.Id();
		public Seed (){
			name="Seed";
		}
		public Seed (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
	public static class TreeSeed extends Item {
		public static Items.Id id = new Items.Id();
		public TreeSeed (){
			name="TreeSeed";
		}
		public TreeSeed (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
	public static class DeadMeat extends Item {
		public static Items.Id id = new Items.Id();
		public DeadMeat (){
			name="DeadMeat";
		}
		public DeadMeat (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
	public static class Honey extends Item {
		public static Items.Id id = new Items.Id();
		public Honey (){
			name="Honey";
		}
		public Honey (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
	public static class Berries extends Item {
		public static Items.Id id = new Items.Id();
		public Berries (){
			name="Berries";
		}
		public Berries (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
			super(name,equipper,hp,maxHp,dmg,def,value,weight,aspects);
		}
	}
}
