package com.rem.qstnr.entities.behaviours.activities;
import com.rem.qstnr.entities.behaviours.activities.ActivityType;
import com.rem.qstnr.entities.behaviours.activities.ActivityTypes;
public class ActivityTypes {
	public static ActivityType None = new ActivityType("None",ActivityType.Id.None);
	public static ActivityType Violent = new ActivityType("Violent",ActivityType.Id.Violent);
	public static ActivityType Helping = new ActivityType("Helping",ActivityType.Id.Helping);
	public static ActivityType Questing = new ActivityType("Questing",ActivityType.Id.Questing);
	public static ActivityType Tracking = new ActivityType("Tracking",ActivityType.Id.Tracking);
	public static ActivityType Learning = new ActivityType("Learning",ActivityType.Id.Learning);
	public static ActivityType from(ActivityType.Id id){
		switch(id){
			case Violent :{
				return ActivityTypes.Violent;
			}
			case Helping :{
				return ActivityTypes.Helping;
			}
			case Questing :{
				return ActivityTypes.Questing;
			}
			case Tracking :{
				return ActivityTypes.Tracking;
			}
			case Learning :{
				return ActivityTypes.Learning;
			}
		}
		return null;
	}
	public ActivityTypes (){
		super();
	}
}
