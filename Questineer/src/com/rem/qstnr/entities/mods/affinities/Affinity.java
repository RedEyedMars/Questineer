package com.rem.qstnr.entities.mods.affinities;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.mods.affinities.Affinity;
import com.rem.qstnr.misc.interfaces.Source;
public class Affinity implements Source {
	protected String name;
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public Affinity.Id getId(){
		return null;
	}
	public Double modify(Entity defender,Double damage){
		return 0.0;
	}
	public Affinity (String name){
		super();
		this.name=name;
	}
	public Affinity (){
		super();
	}
	public static class Id {
		public Id (){
			super();
		}
	}
}
