package com.rem.qstnr.misc;
import com.rem.qstnr.entities.behaviours.skills.supports.Support;
import java.util.HashMap;
import com.rem.qstnr.entities.behaviours.activities.Activity;
import com.rem.qstnr.entities.items.aspects.Aspect;
import com.rem.qstnr.misc.interfaces.Source;
import com.rem.qstnr.misc.Int;
import com.rem.qstnr.entities.relations.associations.Association;
import java.util.Iterator;
import java.util.List;
import com.rem.qstnr.entities.mods.conditions.Condition;
import com.rem.qstnr.entities.behaviours.skills.attacks.Attack;
import java.util.LinkedList;
import com.rem.qstnr.entities.behaviours.quests.Quest;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.entities.relations.Relationship;
import com.rem.qstnr.misc.ListMaps;
import com.rem.qstnr.entities.mods.affinities.Affinity;
import com.rem.qstnr.entities.mods.traits.Trait;
public class ListMaps {
	public ListMaps (){
		super();
	}
	public static class Sources {
		public Sources (){
			super();
		}
		public static class Aspect extends HashMap<Source, LinkedList<com.rem.qstnr.entities.items.aspects.Aspect>> implements Iterable<com.rem.qstnr.entities.items.aspects.Aspect> {
			protected LinkedList<com.rem.qstnr.entities.items.aspects.Aspect> completeList = new LinkedList<com.rem.qstnr.entities.items.aspects.Aspect>();
			public LinkedList<com.rem.qstnr.entities.items.aspects.Aspect> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.items.aspects.Aspect> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.items.aspects.Aspect> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.items.aspects.Aspect> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.items.aspects.Aspect element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.items.aspects.Aspect>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.items.aspects.Aspect element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.items.aspects.Aspect> getAll(){
				return completeList;
			}
			public Aspect (LinkedList<com.rem.qstnr.entities.items.aspects.Aspect> completeList){
				super();
				this.completeList=completeList;
			}
			public Aspect (){
				super();
			}
		}
		public static class Condition extends HashMap<Source, LinkedList<com.rem.qstnr.entities.mods.conditions.Condition>> implements Iterable<com.rem.qstnr.entities.mods.conditions.Condition> {
			protected LinkedList<com.rem.qstnr.entities.mods.conditions.Condition> completeList = new LinkedList<com.rem.qstnr.entities.mods.conditions.Condition>();
			public LinkedList<com.rem.qstnr.entities.mods.conditions.Condition> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.mods.conditions.Condition> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.mods.conditions.Condition> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.mods.conditions.Condition> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.mods.conditions.Condition element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.mods.conditions.Condition>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.mods.conditions.Condition element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.mods.conditions.Condition> getAll(){
				return completeList;
			}
			public Condition (LinkedList<com.rem.qstnr.entities.mods.conditions.Condition> completeList){
				super();
				this.completeList=completeList;
			}
			public Condition (){
				super();
			}
		}
		public static class Trait extends HashMap<Source, LinkedList<com.rem.qstnr.entities.mods.traits.Trait>> implements Iterable<com.rem.qstnr.entities.mods.traits.Trait> {
			protected LinkedList<com.rem.qstnr.entities.mods.traits.Trait> completeList = new LinkedList<com.rem.qstnr.entities.mods.traits.Trait>();
			public LinkedList<com.rem.qstnr.entities.mods.traits.Trait> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.mods.traits.Trait> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.mods.traits.Trait> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.mods.traits.Trait> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.mods.traits.Trait element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.mods.traits.Trait>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.mods.traits.Trait element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.mods.traits.Trait> getAll(){
				return completeList;
			}
			public Trait (LinkedList<com.rem.qstnr.entities.mods.traits.Trait> completeList){
				super();
				this.completeList=completeList;
			}
			public Trait (){
				super();
			}
		}
		public static class Affinity extends HashMap<Source, LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity>> implements Iterable<com.rem.qstnr.entities.mods.affinities.Affinity> {
			protected LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity> completeList = new LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity>();
			public LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.mods.affinities.Affinity> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.mods.affinities.Affinity element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.mods.affinities.Affinity element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.mods.affinities.Affinity> getAll(){
				return completeList;
			}
			public Affinity (LinkedList<com.rem.qstnr.entities.mods.affinities.Affinity> completeList){
				super();
				this.completeList=completeList;
			}
			public Affinity (){
				super();
			}
		}
		public static class Association extends HashMap<Source, LinkedList<com.rem.qstnr.entities.relations.associations.Association>> implements Iterable<com.rem.qstnr.entities.relations.associations.Association> {
			protected LinkedList<com.rem.qstnr.entities.relations.associations.Association> completeList = new LinkedList<com.rem.qstnr.entities.relations.associations.Association>();
			public LinkedList<com.rem.qstnr.entities.relations.associations.Association> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.relations.associations.Association> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.relations.associations.Association> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.relations.associations.Association> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.relations.associations.Association element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.relations.associations.Association>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.relations.associations.Association element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.relations.associations.Association> getAll(){
				return completeList;
			}
			public Association (LinkedList<com.rem.qstnr.entities.relations.associations.Association> completeList){
				super();
				this.completeList=completeList;
			}
			public Association (){
				super();
			}
		}
		public static class Skill extends HashMap<Source, LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill>> implements Iterable<com.rem.qstnr.entities.behaviours.skills.Skill> {
			protected LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill> completeList = new LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill>();
			public LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.behaviours.skills.Skill> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.behaviours.skills.Skill element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.behaviours.skills.Skill element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.behaviours.skills.Skill> getAll(){
				return completeList;
			}
			public Skill (LinkedList<com.rem.qstnr.entities.behaviours.skills.Skill> completeList){
				super();
				this.completeList=completeList;
			}
			public Skill (){
				super();
			}
		}
		public static class Attack extends HashMap<Source, LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack>> implements Iterable<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> {
			protected LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> completeList = new LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack>();
			public LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.behaviours.skills.attacks.Attack element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.behaviours.skills.attacks.Attack element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> getAll(){
				return completeList;
			}
			public Attack (LinkedList<com.rem.qstnr.entities.behaviours.skills.attacks.Attack> completeList){
				super();
				this.completeList=completeList;
			}
			public Attack (){
				super();
			}
		}
		public static class Support extends HashMap<Source, LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support>> implements Iterable<com.rem.qstnr.entities.behaviours.skills.supports.Support> {
			protected LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support> completeList = new LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support>();
			public LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.behaviours.skills.supports.Support> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.behaviours.skills.supports.Support element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.behaviours.skills.supports.Support element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.behaviours.skills.supports.Support> getAll(){
				return completeList;
			}
			public Support (LinkedList<com.rem.qstnr.entities.behaviours.skills.supports.Support> completeList){
				super();
				this.completeList=completeList;
			}
			public Support (){
				super();
			}
		}
		public static class Quest extends HashMap<Source, LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest>> implements Iterable<com.rem.qstnr.entities.behaviours.quests.Quest> {
			protected LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest> completeList = new LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest>();
			public LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.behaviours.quests.Quest> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.behaviours.quests.Quest element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.behaviours.quests.Quest element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.behaviours.quests.Quest> getAll(){
				return completeList;
			}
			public Quest (LinkedList<com.rem.qstnr.entities.behaviours.quests.Quest> completeList){
				super();
				this.completeList=completeList;
			}
			public Quest (){
				super();
			}
		}
		public static class Activity extends HashMap<Source, LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity>> implements Iterable<com.rem.qstnr.entities.behaviours.activities.Activity> {
			protected LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity> completeList = new LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity>();
			public LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.entities.behaviours.activities.Activity> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.entities.behaviours.activities.Activity element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.entities.behaviours.activities.Activity element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.entities.behaviours.activities.Activity> getAll(){
				return completeList;
			}
			public Activity (LinkedList<com.rem.qstnr.entities.behaviours.activities.Activity> completeList){
				super();
				this.completeList=completeList;
			}
			public Activity (){
				super();
			}
		}
		public static class Int extends HashMap<Source, LinkedList<com.rem.qstnr.misc.Int>> implements Iterable<com.rem.qstnr.misc.Int> {
			protected LinkedList<com.rem.qstnr.misc.Int> completeList = new LinkedList<com.rem.qstnr.misc.Int>();
			public LinkedList<com.rem.qstnr.misc.Int> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.misc.Int> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.misc.Int> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.misc.Int> getFrom(Source key){
				return super.get(key);
			}
			public void add(Source key,com.rem.qstnr.misc.Int element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.misc.Int>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Source key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Source key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Source key,com.rem.qstnr.misc.Int element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.misc.Int> getAll(){
				return completeList;
			}
			public Int (LinkedList<com.rem.qstnr.misc.Int> completeList){
				super();
				this.completeList=completeList;
			}
			public Int (){
				super();
			}
		}
	}
	public static class Reasons {
		public Reasons (){
			super();
		}
		public static class Int extends HashMap<Relationship.Reason, LinkedList<com.rem.qstnr.misc.Int>> implements Iterable<com.rem.qstnr.misc.Int> {
			protected LinkedList<com.rem.qstnr.misc.Int> completeList = new LinkedList<com.rem.qstnr.misc.Int>();
			public LinkedList<com.rem.qstnr.misc.Int> getCompleteList(){
				return completeList;
			}
			public void setCompleteList(LinkedList<com.rem.qstnr.misc.Int> newCompleteList){
				completeList=newCompleteList;
			}
			public Iterator<com.rem.qstnr.misc.Int> iterator(){
				return completeList.iterator();
			}
			public LinkedList<com.rem.qstnr.misc.Int> getFrom(Relationship.Reason key){
				return super.get(key);
			}
			public void add(Relationship.Reason key,com.rem.qstnr.misc.Int element){
				if(true&& !super.containsKey(key)){
					super.put(key,new LinkedList<com.rem.qstnr.misc.Int>());
				}
				completeList.add(element);
				super.get(key).add(element);
			}
			public void removeLast(Relationship.Reason key){
				if(super.containsKey(key)&& !super.get(key).isEmpty()){
					completeList.remove(super.get(key).removeLast());
				}
			}
			public void removeAll(Relationship.Reason key){
				if(super.containsKey(key)){
					completeList.removeAll(super.get(key));
					super.get(key).clear();
				}
			}
			public void remove(Relationship.Reason key,com.rem.qstnr.misc.Int element){
				super.get(key).remove(element);
				completeList.remove(element);
			}
			public List<com.rem.qstnr.misc.Int> getAll(){
				return completeList;
			}
			public Int (LinkedList<com.rem.qstnr.misc.Int> completeList){
				super();
				this.completeList=completeList;
			}
			public Int (){
				super();
			}
		}
	}
}
