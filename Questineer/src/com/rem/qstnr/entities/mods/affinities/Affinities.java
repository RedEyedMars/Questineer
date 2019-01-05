package com.rem.qstnr.entities.mods.affinities;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.entities.mods.affinities.Affinities;
import com.rem.qstnr.entities.mods.affinities.Affinity;
public class Affinities {
	public static Affinities.Fire fire = new Affinities.Fire();
	public static Affinities.Ice ice = new Affinities.Ice();
	public static Affinities.Water water = new Affinities.Water();
	public static Affinities.Wild wild = new Affinities.Wild();
	public static Affinities.Earth earth = new Affinities.Earth();
	public static Affinities.Ethereal ethereal = new Affinities.Ethereal();
	public static Affinities.Light light = new Affinities.Light();
	public static Affinities.Dark dark = new Affinities.Dark();
	public static Affinity[] affinities = new Affinity[]{fire,ice,water,wild,earth,ethereal,light,dark};
	public static Affinity create(String affinityName){
		if("Dark".equals("dark")){
			return new Affinities.Dark();
		}
		if("Light".equals("light")){
			return new Affinities.Light();
		}
		if("Ethereal".equals("ethereal")){
			return new Affinities.Ethereal();
		}
		if("Earth".equals("earth")){
			return new Affinities.Earth();
		}
		if("Wild".equals("wild")){
			return new Affinities.Wild();
		}
		if("Water".equals("water")){
			return new Affinities.Water();
		}
		if("Ice".equals("ice")){
			return new Affinities.Ice();
		}
		if("Fire".equals("fire")){
			return new Affinities.Fire();
		}
		return null;
	}
	public Affinities (){
		super();
	}
	public static class Fire extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "fire";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Ice.id)||defender.has(Affinities.Wild.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Earth.id)||defender.has(Affinities.Water.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Fire (){
			super();
		}
		public Fire (String name){
			super(name);
		}
	}
	public static class Ice extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "ice";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Wild.id)||defender.has(Affinities.Earth.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Water.id)||defender.has(Affinities.Fire.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Ice (){
			super();
		}
		public Ice (String name){
			super(name);
		}
	}
	public static class Water extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "water";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Fire.id)||defender.has(Affinities.Ice.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Wild.id)||defender.has(Affinities.Earth.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Water (){
			super();
		}
		public Water (String name){
			super(name);
		}
	}
	public static class Wild extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "wild";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Earth.id)||defender.has(Affinities.Water.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Fire.id)||defender.has(Affinities.Ice.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Wild (){
			super();
		}
		public Wild (String name){
			super(name);
		}
	}
	public static class Earth extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "earth";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Water.id)||defender.has(Affinities.Fire.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Ice.id)||defender.has(Affinities.Wild.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Earth (){
			super();
		}
		public Earth (String name){
			super(name);
		}
	}
	public static class Ethereal extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "ethereal";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Light.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Dark.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Ethereal (){
			super();
		}
		public Ethereal (String name){
			super(name);
		}
	}
	public static class Light extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "light";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Dark.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Ethereal.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Light (){
			super();
		}
		public Light (String name){
			super(name);
		}
	}
	public static class Dark extends Affinity {
		public static Affinity.Id id = new Affinity.Id();
		public String getName(){
			return "dark";
		}
		public Double modify(Entity defender,Double damage){
			if(defender.has(Affinities.Ethereal.id)){
				damage*=2.0;
			}
			if(defender.has(Affinities.Light.id)){
				damage/=2.0;
			}
			return damage;
		}
		public Dark (){
			super();
		}
		public Dark (String name){
			super(name);
		}
	}
}
