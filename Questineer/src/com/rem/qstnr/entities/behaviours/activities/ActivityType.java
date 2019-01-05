package com.rem.qstnr.entities.behaviours.activities;
import com.rem.qstnr.entities.behaviours.activities.ActivityType;
public class ActivityType {
	protected String name;
	protected ActivityType.Id id;
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public ActivityType.Id getId(){
		return id;
	}
	public void setId(ActivityType.Id newId){
		id=newId;
	}
	public ActivityType (String name,ActivityType.Id id){
		this.name=name;
		this.id=id;
	}
	public ActivityType (){
		super();
	}
	public static enum Id {
		 None,
		 Violent,
		 Helping,
		 Questing,
		 Tracking,
		 Learning
	}
}
