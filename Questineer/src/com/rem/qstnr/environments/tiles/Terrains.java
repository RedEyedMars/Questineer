package com.rem.qstnr.environments.tiles;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.gui.Gui;
import java.util.List;
import com.rem.qstnr.gui.images.Images;
import com.rem.qstnr.overview.treasuries.Treasury;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.gui.images.Drawables;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Tiles;
import com.rem.qstnr.gui.Renderer;
import com.rem.qstnr.environments.Environment;
import com.rem.qstnr.environments.tiles.Terrains;
import com.rem.qstnr.menus.Menu;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.entities.Entities;
import com.rem.qstnr.environments.tiles.Terrain;
public class Terrains {
	public static Terrain create(String tileName){
		if(tileName.equals("Bridge")){
			return new Terrains.Forest.Bridge();
		}
		if(tileName.equals("Tree")){
			return new Terrains.Forest.Tree();
		}
		if(tileName.equals("WoodWalls")){
			return new Terrains.Town.WoodWalls();
		}
		if(tileName.equals("StoneWalls")){
			return new Terrains.Town.StoneWalls();
		}
		if(tileName.equals("SouthWestDoor")){
			return new Terrains.Town.SouthWestDoor();
		}
		if(tileName.equals("Tree")){
			return new Terrains.Town.Tree();
		}
		return null;
	}
	public Terrains (){
		super();
	}
	public static class MonsterDens {
		public static Terrain.MonsterDen create(String tileName){
			if(tileName.equals("ElderStagPedestal")){
				return new Terrains.MonsterDens.Forest.ElderStagPedestal();
			}
			if(tileName.equals("BearDen")){
				return new Terrains.MonsterDens.Forest.BearDen();
			}
			if(tileName.equals("LoneRock")){
				return new Terrains.MonsterDens.Forest.LoneRock();
			}
			if(tileName.equals("LongGrass")){
				return new Terrains.MonsterDens.Forest.LongGrass();
			}
			if(tileName.equals("MayorsDesk")){
				return new Terrains.MonsterDens.Town.MayorsDesk();
			}
			if(tileName.equals("Bar")){
				return new Terrains.MonsterDens.Town.Bar();
			}
			return null;
		}
		public MonsterDens (){
			super();
		}
		public static class Town {
			public Town (){
				super();
			}
			public static class Bar extends Terrain.MonsterDen {
				public static Terrain.MonsterDen.Id id = new Terrain.MonsterDen.Id();
				protected Gui.Drawable drawable = null;
				protected int numberOfMonsters = 0;
				protected int maxNumberOfMonsters = 0;
				public Bar (){
					super();
				}
				public Terrain.MonsterDen.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.MonsterDens.Town.Bar.Cost9());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					Entity newEntityBarTender = new Entities.BarTender.Factory().create();
					if(newEntityBarTender.getLocation().moveToAround(getFloorTile())){
						newEntityBarTender.setSpawn(getFloorTile());
						newEntityBarTender.add(new Tile.Listener.Die(getFloorTile()));
					}
					super.load();
					maxNumberOfMonsters=Range.getRandom(0,0);
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					while(numberOfMonsters<maxNumberOfMonsters){
						generateMonster();
					}
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						drawable=Images.town.getAsBar(Drawables.square);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.MonsterDens.Town.Bar create(Environment.Position position){
					return new Terrains.MonsterDens.Town.Bar();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Town.StoneFloor(position.getX(),position.getY(),position.getParent());
				}
				public int getNumberOfMonsters(){
					return numberOfMonsters;
				}
				public void setNumberOfMonsters(int newNumberOfMonsters){
					numberOfMonsters=newNumberOfMonsters;
				}
				public int getMaxNumberOfMonsters(){
					return maxNumberOfMonsters;
				}
				public void setMaxNumberOfMonsters(int newMaxNumberOfMonsters){
					maxNumberOfMonsters=newMaxNumberOfMonsters;
				}
				public void generateMonster(){
					switch(Range.getRandom(0,1)){
					}
					++numberOfMonsters;
				}
				public Bar (Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super();
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public Bar (Tile floorTile,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super(floorTile);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public Bar (Tile floorTile){
					super(floorTile);
				}
				public Bar (int hp,int maxHp,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super(hp,maxHp);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public Bar (int hp,int maxHp){
					super(hp,maxHp);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.MonsterDens.Town.Bar.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getTown()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.MonsterDens.Town.Bar());
					}
				}
				public static class Cost9 extends Treasury.Cost {
					public int getAmount(){
						return 10;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Wood.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.MonsterDens.Town.Bar.Cost9.Reward();
					}
					public Cost9 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.MonsterDens.Town.Bar.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class MayorsDesk extends Terrain.MonsterDen {
				public static Terrain.MonsterDen.Id id = new Terrain.MonsterDen.Id();
				protected Gui.Drawable drawable = null;
				protected int numberOfMonsters = 0;
				protected int maxNumberOfMonsters = 0;
				public MayorsDesk (){
					super();
				}
				public Terrain.MonsterDen.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.MonsterDens.Town.MayorsDesk.Cost10());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					Entity newEntityMayor = new Entities.Mayor.Factory().create();
					if(newEntityMayor.getLocation().moveToAround(getFloorTile())){
						newEntityMayor.setSpawn(getFloorTile());
						newEntityMayor.add(new Tile.Listener.Die(getFloorTile()));
					}
					super.load();
					maxNumberOfMonsters=Range.getRandom(0,0);
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					while(numberOfMonsters<maxNumberOfMonsters){
						generateMonster();
					}
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						drawable=Images.town.getAsMayorsDesk(Drawables.square);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.MonsterDens.Town.MayorsDesk create(Environment.Position position){
					return new Terrains.MonsterDens.Town.MayorsDesk();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Town.StoneFloor(position.getX(),position.getY(),position.getParent());
				}
				public int getNumberOfMonsters(){
					return numberOfMonsters;
				}
				public void setNumberOfMonsters(int newNumberOfMonsters){
					numberOfMonsters=newNumberOfMonsters;
				}
				public int getMaxNumberOfMonsters(){
					return maxNumberOfMonsters;
				}
				public void setMaxNumberOfMonsters(int newMaxNumberOfMonsters){
					maxNumberOfMonsters=newMaxNumberOfMonsters;
				}
				public void generateMonster(){
					switch(Range.getRandom(0,1)){
					}
					++numberOfMonsters;
				}
				public MayorsDesk (Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super();
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public MayorsDesk (Tile floorTile,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super(floorTile);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public MayorsDesk (Tile floorTile){
					super(floorTile);
				}
				public MayorsDesk (int hp,int maxHp,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super(hp,maxHp);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public MayorsDesk (int hp,int maxHp){
					super(hp,maxHp);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.MonsterDens.Town.MayorsDesk.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getTown()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.MonsterDens.Town.MayorsDesk());
					}
				}
				public static class Cost10 extends Treasury.Cost {
					public int getAmount(){
						return 8;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Wood.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.MonsterDens.Town.MayorsDesk.Cost10.Reward();
					}
					public Cost10 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.MonsterDens.Town.MayorsDesk.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
		}
		public static class Forest {
			public Forest (){
				super();
			}
			public static class LongGrass extends Terrain.MonsterDen {
				public static Terrain.MonsterDen.Id id = new Terrain.MonsterDen.Id();
				protected Gui.Drawable drawable = null;
				protected int numberOfMonsters = 0;
				protected int maxNumberOfMonsters = 0;
				protected Entity.Factory Praying_MatrisFactory = new Entities.PrayingMatris.Factory();
				protected Entity.Factory Killer_BeesFactory = new Entities.KillerBees.Factory();
				public LongGrass (){
					super();
				}
				public Terrain.MonsterDen.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.MonsterDens.Forest.LongGrass.Cost27());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					maxNumberOfMonsters=Range.getRandom(0,4);
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					while(numberOfMonsters<maxNumberOfMonsters){
						generateMonster();
					}
					super.tick(millisSinceLastFrame);
					return true;
				}
				public boolean isPassable(int directionX,int directionY){
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Foliage.States imageStates = Images.foliage.asStates();
						imageStates.long_grass();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.MonsterDens.Forest.LongGrass create(Environment.Position position){
					return new Terrains.MonsterDens.Forest.LongGrass();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public int getNumberOfMonsters(){
					return numberOfMonsters;
				}
				public void setNumberOfMonsters(int newNumberOfMonsters){
					numberOfMonsters=newNumberOfMonsters;
				}
				public int getMaxNumberOfMonsters(){
					return maxNumberOfMonsters;
				}
				public void setMaxNumberOfMonsters(int newMaxNumberOfMonsters){
					maxNumberOfMonsters=newMaxNumberOfMonsters;
				}
				public void generateMonster(){
					switch(Range.getRandom(0,2)){
						case 0 :{
							Entity newEntityPraying_Matris = Praying_MatrisFactory.create();
							if(newEntityPraying_Matris.getLocation().moveToAround(getFloorTile())){
								newEntityPraying_Matris.setSpawn(getFloorTile());
								newEntityPraying_Matris.add(new Tile.Listener.Die(getFloorTile()));
							}
						}
						case 1 :{
							Entity newEntityKiller_Bees = Killer_BeesFactory.create();
							if(newEntityKiller_Bees.getLocation().moveToAround(getFloorTile())){
								newEntityKiller_Bees.setSpawn(getFloorTile());
								newEntityKiller_Bees.add(new Tile.Listener.Die(getFloorTile()));
							}
						}
					}
					++numberOfMonsters;
				}
				public Entity.Factory getPrayingMatrisFactory(){
					return Praying_MatrisFactory;
				}
				public void setPrayingMatrisFactory(Entity.Factory newPrayingMatrisFactory){
					Praying_MatrisFactory=newPrayingMatrisFactory;
				}
				public Entity.Factory getKillerBeesFactory(){
					return Killer_BeesFactory;
				}
				public void setKillerBeesFactory(Entity.Factory newKillerBeesFactory){
					Killer_BeesFactory=newKillerBeesFactory;
				}
				public LongGrass (Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory Praying_MatrisFactory,Entity.Factory Killer_BeesFactory){
					super();
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.Praying_MatrisFactory=Praying_MatrisFactory;
					this.Killer_BeesFactory=Killer_BeesFactory;
				}
				public LongGrass (Tile floorTile,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory Praying_MatrisFactory,Entity.Factory Killer_BeesFactory){
					super(floorTile);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.Praying_MatrisFactory=Praying_MatrisFactory;
					this.Killer_BeesFactory=Killer_BeesFactory;
				}
				public LongGrass (Tile floorTile){
					super(floorTile);
				}
				public LongGrass (int hp,int maxHp,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory Praying_MatrisFactory,Entity.Factory Killer_BeesFactory){
					super(hp,maxHp);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.Praying_MatrisFactory=Praying_MatrisFactory;
					this.Killer_BeesFactory=Killer_BeesFactory;
				}
				public LongGrass (int hp,int maxHp){
					super(hp,maxHp);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.MonsterDens.Forest.LongGrass.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.MonsterDens.Forest.LongGrass());
					}
				}
				public static class Cost27 extends Treasury.Cost {
					public Treasury.Reward getReward(){
						return new Terrains.MonsterDens.Forest.LongGrass.Cost27.Reward();
					}
					public Boolean isFree(){
						return true;
					}
					public Cost27 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.MonsterDens.Forest.LongGrass.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class LoneRock extends Terrain.MonsterDen {
				public static Terrain.MonsterDen.Id id = new Terrain.MonsterDen.Id();
				protected Gui.Drawable drawable = null;
				protected int numberOfMonsters = 0;
				protected int maxNumberOfMonsters = 0;
				protected Entity.Factory WolfFactory = new Entities.Wolf.Factory();
				protected Entity.Factory Dire_WolfFactory = new Entities.DireWolf.Factory();
				public LoneRock (){
					super();
				}
				public Terrain.MonsterDen.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.MonsterDens.Forest.LoneRock.Cost28());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					maxNumberOfMonsters=Range.getRandom(0,3);
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					while(numberOfMonsters<maxNumberOfMonsters){
						generateMonster();
					}
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Forest.States imageStates = Images.forest.asStates();
						imageStates.lone_rock();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.MonsterDens.Forest.LoneRock create(Environment.Position position){
					return new Terrains.MonsterDens.Forest.LoneRock();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public int getNumberOfMonsters(){
					return numberOfMonsters;
				}
				public void setNumberOfMonsters(int newNumberOfMonsters){
					numberOfMonsters=newNumberOfMonsters;
				}
				public int getMaxNumberOfMonsters(){
					return maxNumberOfMonsters;
				}
				public void setMaxNumberOfMonsters(int newMaxNumberOfMonsters){
					maxNumberOfMonsters=newMaxNumberOfMonsters;
				}
				public void generateMonster(){
					switch(Range.getRandom(0,2)){
						case 0 :{
							Entity newEntityWolf = WolfFactory.create();
							if(newEntityWolf.getLocation().moveToAround(getFloorTile())){
								newEntityWolf.setSpawn(getFloorTile());
								newEntityWolf.add(new Tile.Listener.Die(getFloorTile()));
							}
						}
						case 1 :{
							Entity newEntityDire_Wolf = Dire_WolfFactory.create();
							if(newEntityDire_Wolf.getLocation().moveToAround(getFloorTile())){
								newEntityDire_Wolf.setSpawn(getFloorTile());
								newEntityDire_Wolf.add(new Tile.Listener.Die(getFloorTile()));
							}
						}
					}
					++numberOfMonsters;
				}
				public Entity.Factory getWolfFactory(){
					return WolfFactory;
				}
				public void setWolfFactory(Entity.Factory newWolfFactory){
					WolfFactory=newWolfFactory;
				}
				public Entity.Factory getDireWolfFactory(){
					return Dire_WolfFactory;
				}
				public void setDireWolfFactory(Entity.Factory newDireWolfFactory){
					Dire_WolfFactory=newDireWolfFactory;
				}
				public LoneRock (Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory WolfFactory,Entity.Factory Dire_WolfFactory){
					super();
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.WolfFactory=WolfFactory;
					this.Dire_WolfFactory=Dire_WolfFactory;
				}
				public LoneRock (Tile floorTile,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory WolfFactory,Entity.Factory Dire_WolfFactory){
					super(floorTile);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.WolfFactory=WolfFactory;
					this.Dire_WolfFactory=Dire_WolfFactory;
				}
				public LoneRock (Tile floorTile){
					super(floorTile);
				}
				public LoneRock (int hp,int maxHp,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory WolfFactory,Entity.Factory Dire_WolfFactory){
					super(hp,maxHp);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.WolfFactory=WolfFactory;
					this.Dire_WolfFactory=Dire_WolfFactory;
				}
				public LoneRock (int hp,int maxHp){
					super(hp,maxHp);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.MonsterDens.Forest.LoneRock.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.MonsterDens.Forest.LoneRock());
					}
				}
				public static class Cost28 extends Treasury.Cost {
					public int getAmount(){
						return 3;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.MonsterDens.Forest.LoneRock.Cost28.Reward();
					}
					public Cost28 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.MonsterDens.Forest.LoneRock.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class BearDen extends Terrain.MonsterDen {
				public static Terrain.MonsterDen.Id id = new Terrain.MonsterDen.Id();
				protected Gui.Drawable drawable = null;
				protected int numberOfMonsters = 0;
				protected int maxNumberOfMonsters = 0;
				protected Entity.Factory Bear_CubFactory = new Entities.BearCub.Factory();
				protected Entity.Factory Mother_BearFactory = new Entities.MotherBear.Factory();
				public BearDen (){
					super();
				}
				public Terrain.MonsterDen.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.MonsterDens.Forest.BearDen.Cost29());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					maxNumberOfMonsters=Range.getRandom(0,3);
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					while(numberOfMonsters<maxNumberOfMonsters){
						generateMonster();
					}
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Forest.States imageStates = Images.forest.asStates();
						imageStates.bear_den();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.MonsterDens.Forest.BearDen create(Environment.Position position){
					return new Terrains.MonsterDens.Forest.BearDen();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public int getNumberOfMonsters(){
					return numberOfMonsters;
				}
				public void setNumberOfMonsters(int newNumberOfMonsters){
					numberOfMonsters=newNumberOfMonsters;
				}
				public int getMaxNumberOfMonsters(){
					return maxNumberOfMonsters;
				}
				public void setMaxNumberOfMonsters(int newMaxNumberOfMonsters){
					maxNumberOfMonsters=newMaxNumberOfMonsters;
				}
				public void generateMonster(){
					switch(Range.getRandom(0,2)){
						case 0 :{
							Entity newEntityBear_Cub = Bear_CubFactory.create();
							if(newEntityBear_Cub.getLocation().moveToAround(getFloorTile())){
								newEntityBear_Cub.setSpawn(getFloorTile());
								newEntityBear_Cub.add(new Tile.Listener.Die(getFloorTile()));
							}
						}
						case 1 :{
							Entity newEntityMother_Bear = Mother_BearFactory.create();
							if(newEntityMother_Bear.getLocation().moveToAround(getFloorTile())){
								newEntityMother_Bear.setSpawn(getFloorTile());
								newEntityMother_Bear.add(new Tile.Listener.Die(getFloorTile()));
							}
						}
					}
					++numberOfMonsters;
				}
				public Entity.Factory getBearCubFactory(){
					return Bear_CubFactory;
				}
				public void setBearCubFactory(Entity.Factory newBearCubFactory){
					Bear_CubFactory=newBearCubFactory;
				}
				public Entity.Factory getMotherBearFactory(){
					return Mother_BearFactory;
				}
				public void setMotherBearFactory(Entity.Factory newMotherBearFactory){
					Mother_BearFactory=newMotherBearFactory;
				}
				public BearDen (Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory Bear_CubFactory,Entity.Factory Mother_BearFactory){
					super();
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.Bear_CubFactory=Bear_CubFactory;
					this.Mother_BearFactory=Mother_BearFactory;
				}
				public BearDen (Tile floorTile,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory Bear_CubFactory,Entity.Factory Mother_BearFactory){
					super(floorTile);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.Bear_CubFactory=Bear_CubFactory;
					this.Mother_BearFactory=Mother_BearFactory;
				}
				public BearDen (Tile floorTile){
					super(floorTile);
				}
				public BearDen (int hp,int maxHp,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters,Entity.Factory Bear_CubFactory,Entity.Factory Mother_BearFactory){
					super(hp,maxHp);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
					this.Bear_CubFactory=Bear_CubFactory;
					this.Mother_BearFactory=Mother_BearFactory;
				}
				public BearDen (int hp,int maxHp){
					super(hp,maxHp);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.MonsterDens.Forest.BearDen.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.MonsterDens.Forest.BearDen());
					}
				}
				public static class Cost29 extends Treasury.Cost {
					public int getAmount(){
						return 3;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.MonsterDens.Forest.BearDen.Cost29.Reward();
					}
					public Cost29 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.MonsterDens.Forest.BearDen.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class ElderStagPedestal extends Terrain.MonsterDen {
				public static Terrain.MonsterDen.Id id = new Terrain.MonsterDen.Id();
				protected Gui.Drawable drawable = null;
				protected int numberOfMonsters = 0;
				protected int maxNumberOfMonsters = 0;
				public ElderStagPedestal (){
					super();
				}
				public Terrain.MonsterDen.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.MonsterDens.Forest.ElderStagPedestal.Cost30());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					Entity newEntityElder_Stag = new Entities.ElderStag.Factory().create();
					if(newEntityElder_Stag.getLocation().moveToAround(getFloorTile())){
						newEntityElder_Stag.setSpawn(getFloorTile());
						newEntityElder_Stag.add(new Tile.Listener.Die(getFloorTile()));
					}
					super.load();
					maxNumberOfMonsters=Range.getRandom(0,0);
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					while(numberOfMonsters<maxNumberOfMonsters){
						generateMonster();
					}
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						drawable=Images.forest.getAsEtherealPedestal(Drawables.square);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.MonsterDens.Forest.ElderStagPedestal create(Environment.Position position){
					return new Terrains.MonsterDens.Forest.ElderStagPedestal();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public int getNumberOfMonsters(){
					return numberOfMonsters;
				}
				public void setNumberOfMonsters(int newNumberOfMonsters){
					numberOfMonsters=newNumberOfMonsters;
				}
				public int getMaxNumberOfMonsters(){
					return maxNumberOfMonsters;
				}
				public void setMaxNumberOfMonsters(int newMaxNumberOfMonsters){
					maxNumberOfMonsters=newMaxNumberOfMonsters;
				}
				public void generateMonster(){
					switch(Range.getRandom(0,1)){
					}
					++numberOfMonsters;
				}
				public ElderStagPedestal (Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super();
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public ElderStagPedestal (Tile floorTile,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super(floorTile);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public ElderStagPedestal (Tile floorTile){
					super(floorTile);
				}
				public ElderStagPedestal (int hp,int maxHp,Gui.Drawable drawable,int numberOfMonsters,int maxNumberOfMonsters){
					super(hp,maxHp);
					this.drawable=drawable;
					this.numberOfMonsters=numberOfMonsters;
					this.maxNumberOfMonsters=maxNumberOfMonsters;
				}
				public ElderStagPedestal (int hp,int maxHp){
					super(hp,maxHp);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.MonsterDens.Forest.ElderStagPedestal.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.MonsterDens.Forest.ElderStagPedestal());
					}
				}
				public static class Cost30 extends Treasury.Cost {
					public int getAmount(){
						return 30;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.MonsterDens.Forest.ElderStagPedestal.Cost30.Reward();
					}
					public Cost30 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.MonsterDens.Forest.ElderStagPedestal.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
		}
	}
	public static class Chests {
		public static Terrain.Chest create(String tileName){
			if(tileName.equals("LegendaryChest")){
				return new Terrains.Chests.Forest.LegendaryChest();
			}
			if(tileName.equals("TreasureChest")){
				return new Terrains.Chests.Forest.TreasureChest();
			}
			if(tileName.equals("MajorChest")){
				return new Terrains.Chests.Forest.MajorChest();
			}
			if(tileName.equals("MinorChest")){
				return new Terrains.Chests.Forest.MinorChest();
			}
			return null;
		}
		public Chests (){
			super();
		}
		public static class Town {
			public Town (){
				super();
			}
		}
		public static class Forest {
			public Forest (){
				super();
			}
			public static class MinorChest extends Terrain.Chest {
				public static Terrain.Chest.Id id = new Terrain.Chest.Id();
				protected Gui.Drawable drawable = null;
				public MinorChest (){
					super();
				}
				public Terrain.Chest.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.Chests.Forest.MinorChest.Cost19());
					costs.add(new Terrains.Chests.Forest.MinorChest.Cost20());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Chests.States imageStates = Images.chests.asStates();
						imageStates.minor();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.Chests.Forest.MinorChest create(Environment.Position position){
					return new Terrains.Chests.Forest.MinorChest();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public MinorChest (Gui.Drawable drawable){
					super();
					this.drawable=drawable;
				}
				public MinorChest (Tile floorTile,Gui.Drawable drawable){
					super(floorTile);
					this.drawable=drawable;
				}
				public MinorChest (Tile floorTile){
					super(floorTile);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.Chests.Forest.MinorChest.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.Chests.Forest.MinorChest());
					}
				}
				public static class Cost19 extends Treasury.Cost {
					public int getAmount(){
						return 3;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.MinorChest.Cost19.Reward();
					}
					public Cost19 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.MinorChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
				public static class Cost20 extends Treasury.Cost {
					public int getAmount(){
						return 5;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Gold.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.MinorChest.Cost20.Reward();
					}
					public Cost20 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.MinorChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class MajorChest extends Terrain.Chest {
				public static Terrain.Chest.Id id = new Terrain.Chest.Id();
				protected Gui.Drawable drawable = null;
				public MajorChest (){
					super();
				}
				public Terrain.Chest.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.Chests.Forest.MajorChest.Cost21());
					costs.add(new Terrains.Chests.Forest.MajorChest.Cost22());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Chests.States imageStates = Images.chests.asStates();
						imageStates.major();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.Chests.Forest.MajorChest create(Environment.Position position){
					return new Terrains.Chests.Forest.MajorChest();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public MajorChest (Gui.Drawable drawable){
					super();
					this.drawable=drawable;
				}
				public MajorChest (Tile floorTile,Gui.Drawable drawable){
					super(floorTile);
					this.drawable=drawable;
				}
				public MajorChest (Tile floorTile){
					super(floorTile);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.Chests.Forest.MajorChest.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.Chests.Forest.MajorChest());
					}
				}
				public static class Cost21 extends Treasury.Cost {
					public int getAmount(){
						return 6;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.MajorChest.Cost21.Reward();
					}
					public Cost21 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.MajorChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
				public static class Cost22 extends Treasury.Cost {
					public int getAmount(){
						return 12;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Gold.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.MajorChest.Cost22.Reward();
					}
					public Cost22 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.MajorChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class TreasureChest extends Terrain.Chest {
				public static Terrain.Chest.Id id = new Terrain.Chest.Id();
				protected Gui.Drawable drawable = null;
				public TreasureChest (){
					super();
				}
				public Terrain.Chest.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.Chests.Forest.TreasureChest.Cost23());
					costs.add(new Terrains.Chests.Forest.TreasureChest.Cost24());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Chests.States imageStates = Images.chests.asStates();
						imageStates.treasure();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.Chests.Forest.TreasureChest create(Environment.Position position){
					return new Terrains.Chests.Forest.TreasureChest();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public TreasureChest (Gui.Drawable drawable){
					super();
					this.drawable=drawable;
				}
				public TreasureChest (Tile floorTile,Gui.Drawable drawable){
					super(floorTile);
					this.drawable=drawable;
				}
				public TreasureChest (Tile floorTile){
					super(floorTile);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.Chests.Forest.TreasureChest.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.Chests.Forest.TreasureChest());
					}
				}
				public static class Cost23 extends Treasury.Cost {
					public int getAmount(){
						return 10;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.TreasureChest.Cost23.Reward();
					}
					public Cost23 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.TreasureChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
				public static class Cost24 extends Treasury.Cost {
					public int getAmount(){
						return 20;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Gold.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.TreasureChest.Cost24.Reward();
					}
					public Cost24 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.TreasureChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
			public static class LegendaryChest extends Terrain.Chest {
				public static Terrain.Chest.Id id = new Terrain.Chest.Id();
				protected Gui.Drawable drawable = null;
				public LegendaryChest (){
					super();
				}
				public Terrain.Chest.Id getId(){
					return id;
				}
				public List<Treasury.Cost> getCosts(){
					List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
					costs.add(new Terrains.Chests.Forest.LegendaryChest.Cost25());
					costs.add(new Terrains.Chests.Forest.LegendaryChest.Cost26());
					return costs;
				}
				public void generate(){
				}
				public Boolean load(){
					super.load();
					return true;
				}
				public Boolean tick(Double millisSinceLastFrame){
					super.tick(millisSinceLastFrame);
					return true;
				}
				public void setDrawable(Gui.Drawable newDrawable){
					drawable=newDrawable;
				}
				public void setFloorTile(Tile newFloorTile){
					if(drawable!=null){
						drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
						drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
					}
					super.setFloorTile(newFloorTile);
				}
				public void display(){
					getDrawable().display(Renderer.midLayer);
				}
				public void undisplay(){
					getDrawable().undisplay(Renderer.midLayer);
				}
				public Gui.Drawable getDrawable(){
					if(drawable==null){
						Images.Chests.States imageStates = Images.chests.asStates();
						imageStates.legendary();
						drawable=Drawables.square.image(imageStates);
						if(floorTile!=null){
							drawable.setVisualX(floorTile.getDrawable().getVisualX());
							drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
						}
						drawable.setVisualWidth((float)getWidth()/6.0f);
						drawable.setVisualHeight((float)getHeight()/6.0f);
					}
					return drawable;
				}
				public static Terrains.Chests.Forest.LegendaryChest create(Environment.Position position){
					return new Terrains.Chests.Forest.LegendaryChest();
				}
				public static Tile createFloor(Environment.Position position){
					return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
				}
				public LegendaryChest (Gui.Drawable drawable){
					super();
					this.drawable=drawable;
				}
				public LegendaryChest (Tile floorTile,Gui.Drawable drawable){
					super(floorTile);
					this.drawable=drawable;
				}
				public LegendaryChest (Tile floorTile){
					super(floorTile);
				}
				public static class Placer implements Menu.Placable {
					public Placer (){
					}
					public void place(Area area,int placeX,int placeY){
						Tile floor = area.getTile(placeX,placeY);
						if(floor==null){
							floor=Terrains.Chests.Forest.LegendaryChest.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
							area.add(floor);
						}
						floor.setTerrain(new Terrains.Chests.Forest.LegendaryChest());
					}
				}
				public static class Cost25 extends Treasury.Cost {
					public int getAmount(){
						return 20;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Fairy_Dust.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.LegendaryChest.Cost25.Reward();
					}
					public Cost25 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.LegendaryChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
				public static class Cost26 extends Treasury.Cost {
					public int getAmount(){
						return 50;
					}
					public Treasury.PaymentType.Id getType(){
						return Treasury.PaymentTypes.Gold.id;
					}
					public Treasury.Reward getReward(){
						return new Terrains.Chests.Forest.LegendaryChest.Cost26.Reward();
					}
					public Cost26 (){
						super();
					}
					public static class Reward extends Treasury.Reward {
						public Boolean isPlacable(){
							return true;
						}
						public Menu.Placable getPlacable(){
							return new Terrains.Chests.Forest.LegendaryChest.Placer();
						}
						public Reward (){
							super();
						}
					}
				}
			}
		}
	}
	public static class Town {
		public Town (){
			super();
		}
		public static class Tree extends Terrain {
			public static Terrain.Id id = new Terrain.Id();
			protected Gui.Drawable drawable = null;
			public Tree (){
				super();
			}
			public Terrain.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Terrains.Town.Tree.Cost3());
				costs.add(new Terrains.Town.Tree.Cost4());
				costs.add(new Terrains.Town.Tree.Cost5());
				return costs;
			}
			public void generate(){
			}
			public Boolean load(){
				super.load();
				return true;
			}
			public Boolean tick(Double millisSinceLastFrame){
				super.tick(millisSinceLastFrame);
				return true;
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void setFloorTile(Tile newFloorTile){
				if(drawable!=null){
					drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
					drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
				}
				super.setFloorTile(newFloorTile);
			}
			public void display(){
				getDrawable().display(Renderer.midLayer);
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.midLayer);
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Foliage.States imageStates = Images.foliage.asStates();
					imageStates.tree();
					drawable=Drawables.square.image(imageStates);
					if(floorTile!=null){
						drawable.setVisualX(floorTile.getDrawable().getVisualX());
						drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
					}
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Terrains.Town.Tree create(Environment.Position position){
				return new Terrains.Town.Tree();
			}
			public static Tile createFloor(Environment.Position position){
				return new Tiles.Town.Grass(position.getX(),position.getY(),position.getParent());
			}
			public Tree (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Tree (Tile floorTile,Gui.Drawable drawable){
				super(floorTile);
				this.drawable=drawable;
			}
			public Tree (Tile floorTile){
				super(floorTile);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					Tile floor = area.getTile(placeX,placeY);
					if(floor==null){
						floor=Terrains.Town.Tree.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getTown()));
						area.add(floor);
					}
					floor.setTerrain(new Terrains.Town.Tree());
				}
			}
			public static class Cost3 extends Treasury.Cost {
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Seed.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Town.Tree.Cost3.Reward();
				}
				public Cost3 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Town.Tree.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
			public static class Cost4 extends Treasury.Cost {
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.TreeSeed.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Town.Tree.Cost4.Reward();
				}
				public Cost4 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Town.Tree.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
			public static class Cost5 extends Treasury.Cost {
				public int getAmount(){
					return 2;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Fairy_Dust.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Town.Tree.Cost5.Reward();
				}
				public Cost5 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Town.Tree.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class SouthWestDoor extends Terrain {
			public static Terrain.Id id = new Terrain.Id();
			protected Gui.Drawable drawable = null;
			public SouthWestDoor (){
				super();
			}
			public Terrain.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Terrains.Town.SouthWestDoor.Cost6());
				return costs;
			}
			public void generate(){
			}
			public Boolean load(){
				super.load();
				return true;
			}
			public Boolean tick(Double millisSinceLastFrame){
				super.tick(millisSinceLastFrame);
				return true;
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void setFloorTile(Tile newFloorTile){
				if(drawable!=null){
					drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
					drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
				}
				super.setFloorTile(newFloorTile);
			}
			public void display(){
				getDrawable().display(Renderer.midLayer);
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.midLayer);
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					drawable=Images.town.getAsStoneWalls(Drawables.square);
					if(floorTile!=null){
						drawable.setVisualX(floorTile.getDrawable().getVisualX());
						drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
					}
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Terrains.Town.SouthWestDoor create(Environment.Position position){
				return new Terrains.Town.SouthWestDoor();
			}
			public static Tile createFloor(Environment.Position position){
				return new Tiles.Town.StoneFloor(position.getX(),position.getY(),position.getParent());
			}
			public SouthWestDoor (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public SouthWestDoor (Tile floorTile,Gui.Drawable drawable){
				super(floorTile);
				this.drawable=drawable;
			}
			public SouthWestDoor (Tile floorTile){
				super(floorTile);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					Tile floor = area.getTile(placeX,placeY);
					if(floor==null){
						floor=Terrains.Town.SouthWestDoor.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getTown()));
						area.add(floor);
					}
					floor.setTerrain(new Terrains.Town.SouthWestDoor());
				}
			}
			public static class Cost6 extends Treasury.Cost {
				public int getAmount(){
					return 2;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Wood.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Town.SouthWestDoor.Cost6.Reward();
				}
				public Cost6 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Town.SouthWestDoor.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class StoneWalls extends Terrain {
			public static Terrain.Id id = new Terrain.Id();
			protected Gui.Drawable drawable = null;
			public StoneWalls (){
				super();
			}
			public Terrain.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Terrains.Town.StoneWalls.Cost7());
				return costs;
			}
			public void generate(){
			}
			public Boolean load(){
				super.load();
				return true;
			}
			public Boolean tick(Double millisSinceLastFrame){
				super.tick(millisSinceLastFrame);
				return true;
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void setFloorTile(Tile newFloorTile){
				if(drawable!=null){
					drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
					drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
				}
				super.setFloorTile(newFloorTile);
			}
			public void display(){
				getDrawable().display(Renderer.midLayer);
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.midLayer);
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					drawable=Images.town.getAsStoneWalls(Drawables.square);
					if(floorTile!=null){
						drawable.setVisualX(floorTile.getDrawable().getVisualX());
						drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
					}
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Terrains.Town.StoneWalls create(Environment.Position position){
				return new Terrains.Town.StoneWalls();
			}
			public static Tile createFloor(Environment.Position position){
				return new Tiles.Town.StoneFloor(position.getX(),position.getY(),position.getParent());
			}
			public StoneWalls (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public StoneWalls (Tile floorTile,Gui.Drawable drawable){
				super(floorTile);
				this.drawable=drawable;
			}
			public StoneWalls (Tile floorTile){
				super(floorTile);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					Tile floor = area.getTile(placeX,placeY);
					if(floor==null){
						floor=Terrains.Town.StoneWalls.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getTown()));
						area.add(floor);
					}
					floor.setTerrain(new Terrains.Town.StoneWalls());
				}
			}
			public static class Cost7 extends Treasury.Cost {
				public int getAmount(){
					return 2;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Stone.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Town.StoneWalls.Cost7.Reward();
				}
				public Cost7 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Town.StoneWalls.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class WoodWalls extends Terrain {
			public static Terrain.Id id = new Terrain.Id();
			protected Gui.Drawable drawable = null;
			public WoodWalls (){
				super();
			}
			public Terrain.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Terrains.Town.WoodWalls.Cost8());
				return costs;
			}
			public void generate(){
			}
			public Boolean load(){
				super.load();
				return true;
			}
			public Boolean tick(Double millisSinceLastFrame){
				super.tick(millisSinceLastFrame);
				return true;
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void setFloorTile(Tile newFloorTile){
				if(drawable!=null){
					drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
					drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
				}
				super.setFloorTile(newFloorTile);
			}
			public void display(){
				getDrawable().display(Renderer.midLayer);
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.midLayer);
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					drawable=Images.town.getAsStoneWalls(Drawables.square);
					if(floorTile!=null){
						drawable.setVisualX(floorTile.getDrawable().getVisualX());
						drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
					}
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Terrains.Town.WoodWalls create(Environment.Position position){
				return new Terrains.Town.WoodWalls();
			}
			public static Tile createFloor(Environment.Position position){
				return new Tiles.Town.StoneFloor(position.getX(),position.getY(),position.getParent());
			}
			public WoodWalls (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public WoodWalls (Tile floorTile,Gui.Drawable drawable){
				super(floorTile);
				this.drawable=drawable;
			}
			public WoodWalls (Tile floorTile){
				super(floorTile);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					Tile floor = area.getTile(placeX,placeY);
					if(floor==null){
						floor=Terrains.Town.WoodWalls.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getTown()));
						area.add(floor);
					}
					floor.setTerrain(new Terrains.Town.WoodWalls());
				}
			}
			public static class Cost8 extends Treasury.Cost {
				public int getAmount(){
					return 2;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Wood.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Town.WoodWalls.Cost8.Reward();
				}
				public Cost8 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Town.WoodWalls.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
	}
	public static class Forest {
		public Forest (){
			super();
		}
		public static class Tree extends Terrain {
			public static Terrain.Id id = new Terrain.Id();
			protected Gui.Drawable drawable = null;
			public Tree (){
				super();
			}
			public Terrain.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Terrains.Forest.Tree.Cost14());
				costs.add(new Terrains.Forest.Tree.Cost15());
				costs.add(new Terrains.Forest.Tree.Cost16());
				return costs;
			}
			public void generate(){
			}
			public Boolean load(){
				super.load();
				return true;
			}
			public Boolean tick(Double millisSinceLastFrame){
				super.tick(millisSinceLastFrame);
				return true;
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void setFloorTile(Tile newFloorTile){
				if(drawable!=null){
					drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
					drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
				}
				super.setFloorTile(newFloorTile);
			}
			public void display(){
				getDrawable().display(Renderer.midLayer);
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.midLayer);
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Foliage.States imageStates = Images.foliage.asStates();
					imageStates.tree();
					drawable=Drawables.square.image(imageStates);
					if(floorTile!=null){
						drawable.setVisualX(floorTile.getDrawable().getVisualX());
						drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
					}
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Terrains.Forest.Tree create(Environment.Position position){
				return new Terrains.Forest.Tree();
			}
			public static Tile createFloor(Environment.Position position){
				return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
			}
			public Tree (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Tree (Tile floorTile,Gui.Drawable drawable){
				super(floorTile);
				this.drawable=drawable;
			}
			public Tree (Tile floorTile){
				super(floorTile);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					Tile floor = area.getTile(placeX,placeY);
					if(floor==null){
						floor=Terrains.Forest.Tree.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
						area.add(floor);
					}
					floor.setTerrain(new Terrains.Forest.Tree());
				}
			}
			public static class Cost14 extends Treasury.Cost {
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Seed.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Forest.Tree.Cost14.Reward();
				}
				public Cost14 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Forest.Tree.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
			public static class Cost15 extends Treasury.Cost {
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.TreeSeed.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Forest.Tree.Cost15.Reward();
				}
				public Cost15 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Forest.Tree.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
			public static class Cost16 extends Treasury.Cost {
				public int getAmount(){
					return 2;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Fairy_Dust.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Forest.Tree.Cost16.Reward();
				}
				public Cost16 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Forest.Tree.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class Bridge extends Terrain {
			public static Terrain.Id id = new Terrain.Id();
			protected Gui.Drawable drawable = null;
			public Bridge (){
				super();
			}
			public Terrain.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Terrains.Forest.Bridge.Cost17());
				costs.add(new Terrains.Forest.Bridge.Cost18());
				return costs;
			}
			public void generate(){
			}
			public Boolean load(){
				super.load();
				return true;
			}
			public Boolean tick(Double millisSinceLastFrame){
				super.tick(millisSinceLastFrame);
				return true;
			}
			public boolean isPassable(int directionX,int directionY){
				return true;
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void setFloorTile(Tile newFloorTile){
				if(drawable!=null){
					drawable.setVisualX(newFloorTile.getDrawable().getVisualX());
					drawable.setVisualY(newFloorTile.getDrawable().getVisualY());
				}
				super.setFloorTile(newFloorTile);
			}
			public void display(){
				getDrawable().display(Renderer.midLayer);
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.midLayer);
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Outside.States imageStates = Images.outside.asStates();
					imageStates.bridge();
					drawable=Drawables.square.image(imageStates);
					if(floorTile!=null){
						drawable.setVisualX(floorTile.getDrawable().getVisualX());
						drawable.setVisualY(floorTile.getDrawable().getVisualY()+0.025f);
					}
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Terrains.Forest.Bridge create(Environment.Position position){
				return new Terrains.Forest.Bridge();
			}
			public static Tile createFloor(Environment.Position position){
				return new Tiles.Forest.Water(position.getX(),position.getY(),position.getParent());
			}
			public Bridge (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Bridge (Tile floorTile,Gui.Drawable drawable){
				super(floorTile);
				this.drawable=drawable;
			}
			public Bridge (Tile floorTile){
				super(floorTile);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					Tile floor = area.getTile(placeX,placeY);
					if(floor==null){
						floor=Terrains.Forest.Bridge.createFloor(new Environment.Position(placeX,placeY,Gui.game.getEnvironments().getForest()));
						area.add(floor);
					}
					floor.setTerrain(new Terrains.Forest.Bridge());
				}
			}
			public static class Cost17 extends Treasury.Cost {
				public int getAmount(){
					return 1;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Fairy_Dust.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Forest.Bridge.Cost17.Reward();
				}
				public Cost17 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Forest.Bridge.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
			public static class Cost18 extends Treasury.Cost {
				public int getAmount(){
					return 1;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Gold.id;
				}
				public Treasury.Reward getReward(){
					return new Terrains.Forest.Bridge.Cost18.Reward();
				}
				public Cost18 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Terrains.Forest.Bridge.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
	}
}
