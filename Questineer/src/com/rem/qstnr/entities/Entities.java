package com.rem.qstnr.entities;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.entities.items.Item;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.entities.behaviours.skills.Skills;
import com.rem.qstnr.gui.images.ImageStates;
import com.rem.qstnr.gui.Gui;
import java.util.List;
import com.rem.qstnr.entities.mods.affinities.Affinities;
import com.rem.qstnr.gui.images.Images;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.entities.relations.associations.Associations;
import java.util.LinkedList;
import com.rem.qstnr.entities.Entities;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.gui.images.Drawables;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.entities.relations.Relationship;
import com.rem.qstnr.environments.Environment;
import com.rem.qstnr.misc.ListMaps;
public class Entities {
	public static Entity createEntity(String entityName){
		return null;
	}
	public Entities (){
		super();
	}
	public static class Hero extends Entity {
		protected Gui.Image.States imageStates = null;
		protected Gui.Drawable drawable = null;
		public Gui.Image.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Gui.Image.States newImageStates){
			imageStates=newImageStates;
		}
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public Hero (Gui.Statable image){
			imageStates=image.asStates();
		}
		public Entity.Id getId(){
			return Entity.Id.Hero;
		}
		public boolean getIsPlayerAffiliated(){
			return true;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public Hero (Gui.Image.States imageStates,Gui.Drawable drawable){
			super();
			this.imageStates=imageStates;
			this.drawable=drawable;
		}
		public Hero (){
			super();
		}
		public Hero (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Image.States imageStates,Gui.Drawable drawable){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.imageStates=imageStates;
			this.drawable=drawable;
		}
		public Hero (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
	}
	public static class BarTender extends Entity {
		public static Entity.Id id = Entity.Id.BarTender;
		protected Gui.Drawable drawable = null;
		protected Images.TownsPeople.States imageStates = Images.towns_people.asStates();
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public BarTender (){
			imageStates.male_bar_tender();
			this.str.setValue(Range.getIntegerBetween(15,15));
			this.dex.setValue(Range.getIntegerBetween(10,10));
			this.con.setValue(Range.getIntegerBetween(50,50));
			this.knw.setValue(Range.getIntegerBetween(40,40));
			this.mnd.setValue(Range.getIntegerBetween(15,15));
			this.crm.setValue(Range.getIntegerBetween(40,40));
		}
		public Entity.Id getId(){
			return Entity.Id.BarTender;
		}
		public Images.TownsPeople.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.TownsPeople.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public BarTender (Gui.Drawable drawable,Images.TownsPeople.States imageStates){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public BarTender (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.TownsPeople.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public BarTender (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.BarTender();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Mayor extends Entity {
		public static Entity.Id id = Entity.Id.Mayor;
		protected Gui.Drawable drawable = null;
		protected Images.TownsPeople.States imageStates = Images.towns_people.asStates();
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public Mayor (){
			imageStates.male_mayor();
			this.str.setValue(Range.getIntegerBetween(25,25));
			this.dex.setValue(Range.getIntegerBetween(30,30));
			this.con.setValue(Range.getIntegerBetween(20,20));
			this.knw.setValue(Range.getIntegerBetween(40,40));
			this.mnd.setValue(Range.getIntegerBetween(25,25));
			this.crm.setValue(Range.getIntegerBetween(75,75));
		}
		public Entity.Id getId(){
			return Entity.Id.Mayor;
		}
		public Images.TownsPeople.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.TownsPeople.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public Mayor (Gui.Drawable drawable,Images.TownsPeople.States imageStates){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public Mayor (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.TownsPeople.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public Mayor (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.Mayor();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class PrayingMatris extends Entity {
		public static Entity.Id id = Entity.Id.PrayingMatris;
		protected Gui.Drawable drawable = null;
		protected Images.Monsters1.States imageStates = Images.monsters_1.asStates();
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public PrayingMatris (){
			imageStates.praying_mantis();
			this.str.setValue(Range.getIntegerBetween(5,5));
			this.dex.setValue(Range.getIntegerBetween(6,6));
			this.con.setValue(Range.getIntegerBetween(2,2));
			this.knw.setValue(Range.getIntegerBetween(1,1));
			this.mnd.setValue(Range.getIntegerBetween(1,1));
			this.crm.setValue(Range.getIntegerBetween(1,1));
		}
		public Entity.Id getId(){
			return Entity.Id.PrayingMatris;
		}
		public Images.Monsters1.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.Monsters1.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public PrayingMatris (Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public PrayingMatris (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public PrayingMatris (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.PrayingMatris();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class KillerBees extends Entity {
		public static Entity.Id id = Entity.Id.KillerBees;
		protected Gui.Drawable drawable = null;
		protected Images.Monsters1.States imageStates = Images.monsters_1.asStates();
		protected List<Listenable<Events.Load>> loadListeners = null;
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public KillerBees (){
			imageStates.killer_bees();
			this.str.setValue(Range.getIntegerBetween(2,2));
			this.dex.setValue(Range.getIntegerBetween(3,3));
			this.con.setValue(Range.getIntegerBetween(1,1));
			this.knw.setValue(Range.getIntegerBetween(1,1));
			this.mnd.setValue(Range.getIntegerBetween(1,1));
			this.crm.setValue(Range.getIntegerBetween(1,1));
		}
		public Entity.Id getId(){
			return Entity.Id.KillerBees;
		}
		public Images.Monsters1.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.Monsters1.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public Boolean on(Events.Load event){
			event.getHost().join(null,event.getHost().getSpawn().get(Associations.Hive.id,new Associations.Hive.Factory()));
			event.getHost().gain(new Skills.DefendMemberOf(event.getHost().get(Associations.Hive.id)));
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
		public KillerBees (Gui.Drawable drawable,Images.Monsters1.States imageStates,List<Listenable<Events.Load>> loadListeners){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public KillerBees (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public KillerBees (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.KillerBees();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Wolf extends Entity {
		public static Entity.Id id = Entity.Id.Wolf;
		protected Gui.Drawable drawable = null;
		protected Images.Monsters1.States imageStates = Images.monsters_1.asStates();
		protected List<Listenable<Events.Load>> loadListeners = null;
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public Wolf (){
			imageStates.wolf();
			this.gain(new Affinities.Wild(),this);
			this.str.setValue(Range.getIntegerBetween(7,7));
			this.dex.setValue(Range.getIntegerBetween(4,4));
			this.con.setValue(Range.getIntegerBetween(4,4));
			this.knw.setValue(Range.getIntegerBetween(1,1));
			this.mnd.setValue(Range.getIntegerBetween(3,3));
			this.crm.setValue(Range.getIntegerBetween(2,2));
			this.gain(new Skills.TerritorialAggression(),this);
		}
		public Entity.Id getId(){
			return Entity.Id.Wolf;
		}
		public Images.Monsters1.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.Monsters1.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public Boolean on(Events.Load event){
			event.getHost().join(null,event.getHost().getSpawn().get(Associations.Pack.id,new Associations.Pack.Factory()));
			event.getHost().gain(new Skills.DefendMemberOf(event.getHost().get(Associations.Pack.id)));
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
		public Wolf (Gui.Drawable drawable,Images.Monsters1.States imageStates,List<Listenable<Events.Load>> loadListeners){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public Wolf (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public Wolf (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.Wolf();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class DireWolf extends Entity {
		public static Entity.Id id = Entity.Id.DireWolf;
		protected Gui.Drawable drawable = null;
		protected Images.Monsters1.States imageStates = Images.monsters_1.asStates();
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public DireWolf (){
			imageStates.wolf();
			this.gain(new Affinities.Wild(),this);
			this.gain(new Skills.TerritorialAggression(),this);
			this.str.setValue(Range.getIntegerBetween(9,9));
			this.dex.setValue(Range.getIntegerBetween(5,5));
			this.con.setValue(Range.getIntegerBetween(6,6));
			this.knw.setValue(Range.getIntegerBetween(3,3));
			this.mnd.setValue(Range.getIntegerBetween(2,2));
			this.crm.setValue(Range.getIntegerBetween(2,2));
		}
		public Entity.Id getId(){
			return Entity.Id.DireWolf;
		}
		public Images.Monsters1.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.Monsters1.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public DireWolf (Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public DireWolf (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
		}
		public DireWolf (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.DireWolf();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class BearCub extends Entity {
		public static Entity.Id id = Entity.Id.BearCub;
		protected Gui.Drawable drawable = null;
		protected Images.Monsters1.States imageStates = Images.monsters_1.asStates();
		protected List<Listenable<Events.Load>> loadListeners = null;
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public BearCub (){
			imageStates.bear();
			this.gain(new Affinities.Wild(),this);
			this.str.setValue(Range.getIntegerBetween(4,4));
			this.dex.setValue(Range.getIntegerBetween(3,3));
			this.con.setValue(Range.getIntegerBetween(8,8));
			this.knw.setValue(Range.getIntegerBetween(1,1));
			this.mnd.setValue(Range.getIntegerBetween(3,3));
			this.crm.setValue(Range.getIntegerBetween(2,2));
		}
		public Entity.Id getId(){
			return Entity.Id.BearCub;
		}
		public Images.Monsters1.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.Monsters1.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public Boolean on(Events.Load event){
			event.getHost().join(null,event.getHost().getSpawn().get(Associations.Cubs.id,new Associations.Cubs.Factory()));
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
		public BearCub (Gui.Drawable drawable,Images.Monsters1.States imageStates,List<Listenable<Events.Load>> loadListeners){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public BearCub (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public BearCub (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.BearCub();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class MotherBear extends Entity {
		public static Entity.Id id = Entity.Id.MotherBear;
		protected Gui.Drawable drawable = null;
		protected Images.Monsters1.States imageStates = Images.monsters_1.asStates();
		protected List<Listenable<Events.Load>> loadListeners = null;
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public MotherBear (){
			imageStates.bear();
			this.gain(new Affinities.Wild(),this);
			this.str.setValue(Range.getIntegerBetween(9,9));
			this.dex.setValue(Range.getIntegerBetween(4,4));
			this.con.setValue(Range.getIntegerBetween(11,11));
			this.knw.setValue(Range.getIntegerBetween(3,3));
			this.mnd.setValue(Range.getIntegerBetween(2,2));
			this.crm.setValue(Range.getIntegerBetween(2,2));
			this.gain(new Skills.TerritorialAggression(),this);
		}
		public Entity.Id getId(){
			return Entity.Id.MotherBear;
		}
		public Images.Monsters1.States getImageStates(){
			return imageStates;
		}
		public void setImageStates(Images.Monsters1.States newImageStates){
			imageStates=newImageStates;
		}
		public Gui.Drawable getDrawable(){
			if(drawable==null){
				drawable=Drawables.square.image(imageStates);
				drawable.setVisualWidth(2/13f);
				drawable.setVisualHeight(2/13f);
			}
			return drawable;
		}
		public void changeState(ImageStates newState){
			imageStates.changeState(newState);
		}
		public Boolean isIdle(){
			return imageStates.getId()==ImageStates.idle;
		}
		public Gui.Image.States changeTo(){
			return imageStates;
		}
		public Boolean on(Events.Load event){
			event.getHost().gain(new Skills.DefendMemberOf(event.getHost().getSpawn().get(Associations.Cubs.id,new Associations.Cubs.Factory())));
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
		public MotherBear (Gui.Drawable drawable,Images.Monsters1.States imageStates,List<Listenable<Events.Load>> loadListeners){
			super();
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public MotherBear (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable,Images.Monsters1.States imageStates){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
			this.imageStates=imageStates;
			this.loadListeners=loadListeners;
		}
		public MotherBear (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.MotherBear();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class ElderStag extends Entity {
		public static Entity.Id id = Entity.Id.ElderStag;
		protected Gui.Drawable drawable = null;
		public Gui.Drawable getDrawable(){
			return drawable;
		}
		public void setDrawable(Gui.Drawable newDrawable){
			drawable=newDrawable;
		}
		public ElderStag (){
			this.gain(new Affinities.Ethereal(),this);
			this.str.setValue(Range.getIntegerBetween(20,20));
			this.dex.setValue(Range.getIntegerBetween(15,15));
			this.con.setValue(Range.getIntegerBetween(20,20));
			this.knw.setValue(Range.getIntegerBetween(25,25));
			this.mnd.setValue(Range.getIntegerBetween(10,10));
			this.crm.setValue(Range.getIntegerBetween(15,15));
		}
		public Entity.Id getId(){
			return Entity.Id.ElderStag;
		}
		public ElderStag (Gui.Drawable drawable){
			super();
			this.drawable=drawable;
		}
		public ElderStag (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation,Gui.Drawable drawable){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
			this.drawable=drawable;
		}
		public ElderStag (String name,Integer status,Float weightHeld,Integer walkingSpeed,Tile spawn,List<Item> equippedItems,Skill focusSkill,Environment.Location location,Relationship.EntityMap relationships,LinkedList<Activity> activityList,LinkedList<Entity.Event> events,List<Listenable<Events.Die>> dieListeners,List<Listenable<Events.PreAttack>> pre_attackListeners,List<Listenable<Events.Unequip>> unequipListeners,List<Listenable<Events.Idle>> idleListeners,List<Listenable<Events.Joined>> joinedListeners,List<Listenable<Events.Start>> startListeners,List<Listenable<Events.Tick>> tickListeners,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Miss>> missListeners,List<Listenable<Events.Loss>> lossListeners,List<Listenable<Events.Fail>> failListeners,List<Listenable<Events.Hit>> hitListeners,List<Listenable<Events.Equip>> equipListeners,List<Listenable<Events.Load>> loadListeners,List<Listenable<Events.StartQuest>> startQuestListeners,List<Listenable<Events.Success>> successListeners,List<Listenable<Events.PostAttack>> post_attackListeners,List<Listenable<Events.Collect>> collectListeners,List<Listenable<Events.ChangeItem>> change_itemListeners,ListMaps.Sources.Condition conditions,ListMaps.Sources.Trait traits,ListMaps.Sources.Affinity affinitys,ListMaps.Sources.Association associations,ListMaps.Sources.Skill skills,ListMaps.Sources.Attack attacks,ListMaps.Sources.Support supports,ListMaps.Sources.Quest quests,ListMaps.Sources.Activity activitys,Entity.STR str,Entity.MND mnd,Entity.CON con,Entity.KNW knw,Entity.DEX dex,Entity.CRM crm,int violentMotivation,int helpingMotivation,int questingMotivation,int trackingMotivation,int learningMotivation){
			super(name,status,weightHeld,walkingSpeed,spawn,equippedItems,focusSkill,location,relationships,activityList,events,dieListeners,pre_attackListeners,unequipListeners,idleListeners,joinedListeners,startListeners,tickListeners,gainListeners,missListeners,lossListeners,failListeners,hitListeners,equipListeners,loadListeners,startQuestListeners,successListeners,post_attackListeners,collectListeners,change_itemListeners,conditions,traits,affinitys,associations,skills,attacks,supports,quests,activitys,str,mnd,con,knw,dex,crm,violentMotivation,helpingMotivation,questingMotivation,trackingMotivation,learningMotivation);
		}
		public static class Factory implements Entity.Factory {
			public Entity create(){
				return new Entities.ElderStag();
			}
			public Factory (){
				super();
			}
		}
	}
}
