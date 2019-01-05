package com.rem.qstnr.events;
import com.rem.qstnr.events.Event;
public class Event {
	public Event (){
		super();
	}
	public static enum Id {
		 gain,
		 loss,
		 equip,
		 unequip,
		 change_item,
		 pre_attack,
		 post_attack,
		 hit,
		 miss,
		 die,
		 collect,
		 joined,
		 startQuest,
		 idle,
		 success,
		 fail,
		 load,
		 start,
		 tick
	}
}
