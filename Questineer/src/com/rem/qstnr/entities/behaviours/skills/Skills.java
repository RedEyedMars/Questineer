package com.rem.qstnr.entities.behaviours.skills;
import com.rem.qstnr.entities.Entity;
import java.util.HashMap;
import com.rem.qstnr.entities.mods.traits.Traits;
import java.util.function.Predicate;
import java.util.function.Function;
import com.rem.qstnr.entities.relations.associations.Association;
import com.rem.qstnr.entities.behaviours.skills.Skills;
import com.rem.qstnr.entities.mods.affinities.Affinities;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.entities.behaviours.skills.Skill;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.entities.relations.Relationship;
import com.rem.qstnr.entities.mods.affinities.Affinity;
import com.rem.qstnr.entities.mods.traits.Trait;
public class Skills {
	public static Skill[] skills = new Skill[]{};
	public static Skill create(String skillName){
		if("TeachAffinities".equals(skillName)){
			return new Skills.TeachAffinities();
		}
		if("TeachAffinity".equals(skillName)){
			return new Skills.TeachAffinity();
		}
		if("TeachTraits".equals(skillName)){
			return new Skills.TeachTraits();
		}
		if("TeachTrait".equals(skillName)){
			return new Skills.TeachTrait();
		}
		if("TeachSkills".equals(skillName)){
			return new Skills.TeachSkills();
		}
		if("TeachSkill".equals(skillName)){
			return new Skills.TeachSkill();
		}
		if("DefendMemberOf".equals(skillName)){
			return new Skills.DefendMemberOf();
		}
		if("TerritorialAggression".equals(skillName)){
			return new Skills.TerritorialAggression();
		}
		return null;
	}
	public Skills (){
		super();
	}
	public static class TerritorialAggression extends Skill {
		public static Skill.Id id = new Skill.Id();
		public Skill.Id getId(){
			return id;
		}
		public String getName(){
			return "TerritorialAggression";
		}
		public String getDescription(){
			return "This monster establishes a radius within which it will attack unprovoked";
		}
		public void use(Entity user,Entity victim){
			user.influence(victim,new Relationship.Reasons.WithinTerritory(victim.getName(),user.getName()),-50);
;
		}
		public void load(){
		}
		public Skill copy(){
			return new Skills.TerritorialAggression();
		}
		public TerritorialAggression (){
		}
		public TerritorialAggression (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class DefendMemberOf extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected Association group;
		public Skill.Id getId(){
			return id;
		}
		public DefendMemberOf (){
			targetCriteria=new TargetCriteria();
			cost= E->Range.getRandom(5.0f,10.0f);
			range= E->Range.getRandom(8.0f,10.0f);
		}
		public String getName(){
			return "DefendMemberOf";
		}
		public String getDescription(){
			return "This monster defends other monsters of the same group as them";
		}
		public void use(Entity user,Entity victim){
			user.influence(victim,new Relationship.Reasons.AttackedFellowMember(victim.getName(),user.getName(),group.getName()),-50);
;
		}
		public void load(){
		}
		public Skill copy(){
			return new Skills.DefendMemberOf();
		}
		public Association getGroup(){
			return group;
		}
		public void setGroup(Association newGroup){
			group=newGroup;
		}
		public DefendMemberOf (Association group){
			this.group=group;
		}
		public DefendMemberOf (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,Association group){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.group=group;
		}
		public DefendMemberOf (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				if(!(user.has(group.getId()))){
					return false;
				}
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class TeachSkill extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected Skill skill;
		public Skill.Id getId(){
			return id;
		}
		public TeachSkill (){
			targetCriteria=new TargetCriteria();
			cost= E->Range.getRandom(1.0f,2.0f)+Range.getRandom(-0.15f,-0.25f);
			range= E->1.0f;
		}
		public String getName(){
			return "TeachSkill";
		}
		public String getDescription(){
			return "Teach a given skill";
		}
		public void use(Entity user,Entity victim){
			if((user.has(skill.getId()))){
	if(experience<=5){
		if(Range.chance(0.05)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=15){
		if(Range.chance(0.15)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=25){
		if(Range.chance(0.25)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=35){
		if(Range.chance(0.35)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=50){
		if(Range.chance(0.5)){
			victim.gain(skill.copy());
		}
	}
	else{
		if(experience>50){
			if(Range.chance(0.65)){
				victim.gain(skill.copy());
			}
		}
	}
}
else{
	if(experience<=5){
		if(Range.chance(0.05)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=15){
		if(Range.chance(0.1)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=25){
		if(Range.chance(0.15)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=35){
		if(Range.chance(0.2)){
			victim.gain(skill.copy());
		}
	}
	else if(experience<=50){
		if(Range.chance(0.25)){
			victim.gain(skill.copy());
		}
	}
	else{
		if(experience>50){
			if(Range.chance(0.35)){
				victim.gain(skill.copy());
			}
		}
	}
}
;
		}
		public void load(){
		}
		public Skill copy(){
			return new Skills.TeachSkill();
		}
		public Skill getSkill(){
			return skill;
		}
		public void setSkill(Skill newSkill){
			skill=newSkill;
		}
		public TeachSkill (Skill skill){
			this.skill=skill;
		}
		public TeachSkill (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,Skill skill){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.skill=skill;
		}
		public TeachSkill (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class TeachSkills extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected HashMap<Skill.Id, Skill> skills = new HashMap<Skill.Id, Skill>();
		public Skill.Id getId(){
			return id;
		}
		public TeachSkills (){
			targetCriteria=new TargetCriteria();
		}
		public String getName(){
			return "TeachSkills";
		}
		public String getDescription(){
			return "Teach any skill";
		}
		public void use(Entity user,Entity victim){
		}
		public void load(){
			for(Skill skill:Skills.skills){
	skills.put(skill.getId(),new Skills.TeachSkill(skill));
}
;
		}
		public Skill copy(){
			return new Skills.TeachSkills();
		}
		public HashMap<Skill.Id, Skill> getSkills(){
			return skills;
		}
		public void setSkills(HashMap<Skill.Id, Skill> newSkills){
			skills=newSkills;
		}
		public Skill get(Skill.Id key){
			return skills.get(key);
		}
		public TeachSkills (HashMap<Skill.Id, Skill> skills){
			super();
			this.skills=skills;
		}
		public TeachSkills (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,HashMap<Skill.Id, Skill> skills){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.skills=skills;
		}
		public TeachSkills (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class TeachTrait extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected Trait trait;
		public Skill.Id getId(){
			return id;
		}
		public TeachTrait (){
			targetCriteria=new TargetCriteria();
			cost= E->Range.getRandom(1.0f,2.0f)+Range.getRandom(-0.15f,-0.25f);
			range= E->1.0f;
		}
		public String getName(){
			return "TeachTrait";
		}
		public String getDescription(){
			return "Teach a given trait";
		}
		public void use(Entity user,Entity victim){
			if((user.has(trait.getId()))){
	if(experience<=5){
		if(Range.chance(0.05)){
			victim.gain(trait);
		}
	}
	else if(experience<=15){
		if(Range.chance(0.15)){
			victim.gain(trait);
		}
	}
	else if(experience<=25){
		if(Range.chance(0.25)){
			victim.gain(trait);
		}
	}
	else if(experience<=35){
		if(Range.chance(0.35)){
			victim.gain(trait);
		}
	}
	else if(experience<=50){
		if(Range.chance(0.5)){
			victim.gain(trait);
		}
	}
	else{
		if(experience>50){
			if(Range.chance(0.65)){
				victim.gain(trait);
			}
		}
	}
}
else{
	if(experience<=5){
		if(Range.chance(0.05)){
			victim.gain(trait);
		}
	}
	else if(experience<=15){
		if(Range.chance(0.1)){
			victim.gain(trait);
		}
	}
	else if(experience<=25){
		if(Range.chance(0.15)){
			victim.gain(trait);
		}
	}
	else if(experience<=35){
		if(Range.chance(0.2)){
			victim.gain(trait);
		}
	}
	else if(experience<=50){
		if(Range.chance(0.25)){
			victim.gain(trait);
		}
	}
	else{
		if(experience>50){
			if(Range.chance(0.35)){
				victim.gain(trait);
			}
		}
	}
}
;
		}
		public void load(){
		}
		public Skill copy(){
			return new Skills.TeachTrait();
		}
		public Trait getTrait(){
			return trait;
		}
		public void setTrait(Trait newTrait){
			trait=newTrait;
		}
		public TeachTrait (Trait trait){
			this.trait=trait;
		}
		public TeachTrait (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,Trait trait){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.trait=trait;
		}
		public TeachTrait (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class TeachTraits extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected HashMap<Trait.Id, Skill> skills = new HashMap<Trait.Id, Skill>();
		public Skill.Id getId(){
			return id;
		}
		public TeachTraits (){
			targetCriteria=new TargetCriteria();
		}
		public String getName(){
			return "TeachTraits";
		}
		public String getDescription(){
			return "Teach any trait";
		}
		public void use(Entity user,Entity victim){
		}
		public void load(){
			for(Trait trait:Traits.traits){
	skills.put(trait.getId(),new Skills.TeachTrait(trait));
}
;
		}
		public Skill copy(){
			return new Skills.TeachTraits();
		}
		public HashMap<Trait.Id, Skill> getSkills(){
			return skills;
		}
		public void setSkills(HashMap<Trait.Id, Skill> newSkills){
			skills=newSkills;
		}
		public Skill get(Trait.Id key){
			return skills.get(key);
		}
		public TeachTraits (HashMap<Trait.Id, Skill> skills){
			super();
			this.skills=skills;
		}
		public TeachTraits (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,HashMap<Trait.Id, Skill> skills){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.skills=skills;
		}
		public TeachTraits (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class TeachAffinity extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected Affinity affinity;
		public Skill.Id getId(){
			return id;
		}
		public TeachAffinity (){
			targetCriteria=new TargetCriteria();
			cost= E->Range.getRandom(1.0f,2.0f)+Range.getRandom(-0.15f,-0.25f);
			range= E->1.0f;
		}
		public String getName(){
			return "TeachAffinity";
		}
		public String getDescription(){
			return "Teach a given affinity";
		}
		public void use(Entity user,Entity victim){
			if((user.has(affinity.getId()))){
	if(experience<=5){
		if(Range.chance(0.05)){
			victim.gain(affinity);
		}
	}
	else if(experience<=15){
		if(Range.chance(0.15)){
			victim.gain(affinity);
		}
	}
	else if(experience<=25){
		if(Range.chance(0.25)){
			victim.gain(affinity);
		}
	}
	else if(experience<=35){
		if(Range.chance(0.35)){
			victim.gain(affinity);
		}
	}
	else if(experience<=50){
		if(Range.chance(0.5)){
			victim.gain(affinity);
		}
	}
	else{
		if(experience>50){
			if(Range.chance(0.65)){
				victim.gain(affinity);
			}
		}
	}
}
else{
	if(experience<=5){
		if(Range.chance(0.05)){
			victim.gain(affinity);
		}
	}
	else if(experience<=15){
		if(Range.chance(0.1)){
			victim.gain(affinity);
		}
	}
	else if(experience<=25){
		if(Range.chance(0.15)){
			victim.gain(affinity);
		}
	}
	else if(experience<=35){
		if(Range.chance(0.2)){
			victim.gain(affinity);
		}
	}
	else if(experience<=50){
		if(Range.chance(0.25)){
			victim.gain(affinity);
		}
	}
	else{
		if(experience>50){
			if(Range.chance(0.35)){
				victim.gain(affinity);
			}
		}
	}
}
;
		}
		public void load(){
		}
		public Skill copy(){
			return new Skills.TeachAffinity();
		}
		public Affinity getAffinity(){
			return affinity;
		}
		public void setAffinity(Affinity newAffinity){
			affinity=newAffinity;
		}
		public TeachAffinity (Affinity affinity){
			this.affinity=affinity;
		}
		public TeachAffinity (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,Affinity affinity){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.affinity=affinity;
		}
		public TeachAffinity (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
	public static class TeachAffinities extends Skill {
		public static Skill.Id id = new Skill.Id();
		protected HashMap<Affinity.Id, Skill> skills = new HashMap<Affinity.Id, Skill>();
		public Skill.Id getId(){
			return id;
		}
		public TeachAffinities (){
			targetCriteria=new TargetCriteria();
		}
		public String getName(){
			return "TeachAffinities";
		}
		public String getDescription(){
			return "Teach any affinity";
		}
		public void use(Entity user,Entity victim){
		}
		public void load(){
			for(Affinity affinity:Affinities.affinities){
	skills.put(affinity.getId(),new Skills.TeachAffinity(affinity));
}
;
		}
		public Skill copy(){
			return new Skills.TeachAffinities();
		}
		public HashMap<Affinity.Id, Skill> getSkills(){
			return skills;
		}
		public void setSkills(HashMap<Affinity.Id, Skill> newSkills){
			skills=newSkills;
		}
		public Skill get(Affinity.Id key){
			return skills.get(key);
		}
		public TeachAffinities (HashMap<Affinity.Id, Skill> skills){
			super();
			this.skills=skills;
		}
		public TeachAffinities (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria,HashMap<Affinity.Id, Skill> skills){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
			this.skills=skills;
		}
		public TeachAffinities (Integer experience,Integer cooldown,Function<Entity, Float> range,Function<Entity, Float> cost,Boolean hasEntityFocus,Predicate<Entity> targetCriteria,Predicate<Tile> destinationCriteria,Predicate<Terrain> terrainCriteria){
			super(experience,cooldown,range,cost,hasEntityFocus,targetCriteria,destinationCriteria,terrainCriteria);
		}
		public class TargetCriteria implements Predicate<Entity> {
			public boolean test(Entity user){
				return true;
			}
			public TargetCriteria (){
				super();
			}
		}
		public class DestinationCriteria implements Predicate<Tile> {
			public boolean test(Tile user){
				return true;
			}
			public DestinationCriteria (){
				super();
			}
		}
	}
}
