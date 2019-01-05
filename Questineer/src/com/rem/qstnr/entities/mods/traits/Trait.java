package com.rem.qstnr.entities.mods.traits;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.mods.traits.Trait;
import com.rem.qstnr.misc.interfaces.Source;
public class Trait implements Source {
	protected String name;
	protected String description;
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
	public Trait.Id getId(){
		return null;
	}
	public boolean hasRequirements(Entity candidate){
		return false;
	}
	public Trait (String name,String description){
		super();
		this.name=name;
		this.description=description;
	}
	public Trait (){
		super();
	}
	public static enum Id {
		 Wounded,
		 Maimed,
		 WoundHealed,
		 WoundScarred,
		 Cowardly,
		 Hardy,
		 HandyWithAKnife,
		 ButterFingers,
		 Confused
	}
}
