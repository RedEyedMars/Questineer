package com.rem.qstnr.entities.items;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.items.aspects.Aspect;
import com.rem.qstnr.misc.interfaces.Source;
import java.util.function.Function;
import com.rem.qstnr.entities.items.Item;
import com.rem.qstnr.misc.streams.Streamer;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.misc.ListMaps;
public class Item implements Source {
	protected String name = null;
	protected Entity equipper = null;
	protected Integer hp = null;
	protected Integer maxHp = null;
	protected Function<Entity, Float> dmg = null;
	protected Function<Entity, Float> def = null;
	protected Integer value = null;
	protected Integer weight = null;
	protected ListMaps.Sources.Aspect aspects = new ListMaps.Sources.Aspect();
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public Entity getEquipper(){
		return equipper;
	}
	public void setEquipper(Entity newEquipper){
		equipper=newEquipper;
	}
	public Integer getHp(){
		return hp;
	}
	public void setHp(Integer newHp){
		hp=newHp;
	}
	public Integer getMaxHp(){
		return maxHp;
	}
	public void setMaxHp(Integer newMaxHp){
		maxHp=newMaxHp;
	}
	public Function<Entity, Float> getDmg(){
		return dmg;
	}
	public void setDmg(Function<Entity, Float> newDmg){
		dmg=newDmg;
	}
	public Function<Entity, Float> getDef(){
		return def;
	}
	public void setDef(Function<Entity, Float> newDef){
		def=newDef;
	}
	public Integer getValue(){
		return value;
	}
	public void setValue(Integer newValue){
		value=newValue;
	}
	public Integer getWeight(){
		return weight;
	}
	public void setWeight(Integer newWeight){
		weight=newWeight;
	}
	public Float getDmg(Entity entity){
		return dmg.apply(entity);
	}
	public Float getDef(Entity entity){
		return def.apply(entity);
	}
	public void decreaseHp(Entity host,int amount){
		hp-=amount;
		on(new Events.ChangeItem(host,this));
	}
	public Boolean on(Events.Equip event){
		equipper=event.getHost();
		return true;
	}
	public Boolean on(Events.Unequip event){
		equipper=null;
		return true;
	}
	public Boolean on(Events.ChangeItem event){
		return true;
	}
	public Boolean has(Aspect.Id findId){
		return Streamer.has(aspects.getAll(), aspect->aspect.getId(),findId);
	}
	public Aspect get(Aspect.Id findId){
		return Streamer.get(aspects.getAll(), aspect->aspect.getId(),findId);
	}
	public void gain(Aspect aspect,Source source){
		aspects.add(source,aspect);
	}
	public void gain(Aspect aspect){
		aspects.add(this,aspect);
	}
	public void lose(Aspect.Id removeId,Source source){
		Aspect toRemove = Streamer.get(aspects.getFrom(source), aspect->aspect.getId(),removeId);
		if(toRemove==null){
			throw new RuntimeException("Aspect"+":"+removeId+"  not found!");
		}
		else{
			aspects.remove(source,toRemove);
		}
	}
	public ListMaps.Sources.Aspect getAspects(){
		return aspects;
	}
	public void setAspects(ListMaps.Sources.Aspect newAspects){
		aspects=newAspects;
	}
	public Item (String name,Entity equipper,Integer hp,Integer maxHp,Function<Entity, Float> dmg,Function<Entity, Float> def,Integer value,Integer weight,ListMaps.Sources.Aspect aspects){
		super();
		this.name=name;
		this.equipper=equipper;
		this.hp=hp;
		this.maxHp=maxHp;
		this.dmg=dmg;
		this.def=def;
		this.value=value;
		this.weight=weight;
		this.aspects=aspects;
	}
	public Item (){
		super();
	}
}
