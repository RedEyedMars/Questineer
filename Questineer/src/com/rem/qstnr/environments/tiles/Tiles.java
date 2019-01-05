package com.rem.qstnr.environments.tiles;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.environments.tiles.EntryPoint;
import com.rem.qstnr.environments.Direction;
import java.util.function.Function;
import com.rem.qstnr.entities.relations.associations.Association;
import com.rem.qstnr.gui.Gui;
import java.util.List;
import java.util.function.Supplier;
import com.rem.qstnr.menus.Menu;
import com.rem.qstnr.gui.images.Images;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.overview.treasuries.Treasury;
import com.rem.qstnr.gui.images.Drawables;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Tiles;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.gui.Renderer;
import com.rem.qstnr.environments.Environment;
import java.util.Map;
public class Tiles {
	protected Drawables dwbs = null;
	public Drawables getDwbs(){
		return dwbs;
	}
	public void setDwbs(Drawables newDwbs){
		dwbs=newDwbs;
	}
	public static Tile create(String tileName){
		if(tileName.equals("Water")){
			return new Tiles.Forest.Water();
		}
		if(tileName.equals("Path")){
			return new Tiles.Forest.Path();
		}
		if(tileName.equals("Grass")){
			return new Tiles.Forest.Grass();
		}
		if(tileName.equals("StoneFloor")){
			return new Tiles.Town.StoneFloor();
		}
		if(tileName.equals("Path")){
			return new Tiles.Town.Path();
		}
		if(tileName.equals("Grass")){
			return new Tiles.Town.Grass();
		}
		return null;
	}
	public Tiles (Drawables dwbs){
		super();
		this.dwbs=dwbs;
	}
	public Tiles (){
		super();
	}
	public static enum Predefined {
	}
	public static class Town {
		public Town (){
			super();
		}
		public static class Grass extends Tile {
			public static Tile.Id id = new Tile.Id();
			protected Gui.Drawable drawable = null;
			public Grass (){
				super();
			}
			public Tile.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Tiles.Town.Grass.Cost0());
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
			public Grass (int x,int y,Environment parent){
				super(x,y,parent);
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void display(){
				getDrawable().display(Renderer.botLayer);
				if(terrain!=null){
					terrain.display();
				}
				if(occupant!=null){
					occupant.display();
				}
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.botLayer);
				if(terrain!=null){
					terrain.undisplay();
				}
				if(occupant!=null){
					occupant.undisplay();
				}
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Foliage.States imageStates = Images.foliage.asStates();
					imageStates.grass();
					drawable=Drawables.isosquare.image(imageStates);
					drawable.setVisualX((float)(getX()+getY())/11.1f);
					drawable.setVisualY((float)(getY()-getX())/23.099998f);
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Tile create(Environment.Position position){
				return new Tiles.Town.Grass(position.getX(),position.getY(),position.getParent());
			}
			public Grass (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Grass (Integer x,Integer y,Environment parent,Gui.Drawable drawable){
				super(x,y,parent);
				this.drawable=drawable;
			}
			public Grass (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Grass (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations,Gui.Drawable drawable){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
				this.drawable=drawable;
			}
			public Grass (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					area.add(new Tiles.Town.Grass(placeX,placeY,area.getParent()));
				}
			}
			public static class Cost0 extends Treasury.Cost {
				public Treasury.Reward getReward(){
					return new Tiles.Town.Grass.Cost0.Reward();
				}
				public Boolean isFree(){
					return true;
				}
				public Cost0 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Tiles.Town.Grass.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class Path extends Tile {
			public static Tile.Id id = new Tile.Id();
			protected Gui.Drawable drawable = null;
			public Path (){
				super();
			}
			public Tile.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Tiles.Town.Path.Cost1());
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
			public Path (int x,int y,Environment parent){
				super(x,y,parent);
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void display(){
				getDrawable().display(Renderer.botLayer);
				if(terrain!=null){
					terrain.display();
				}
				if(occupant!=null){
					occupant.display();
				}
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.botLayer);
				if(terrain!=null){
					terrain.undisplay();
				}
				if(occupant!=null){
					occupant.undisplay();
				}
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Foliage.States imageStates = Images.foliage.asStates();
					imageStates.path();
					drawable=Drawables.isosquare.image(imageStates);
					drawable.setVisualX((float)(getX()+getY())/11.1f);
					drawable.setVisualY((float)(getY()-getX())/23.099998f);
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Tile create(Environment.Position position){
				return new Tiles.Town.Path(position.getX(),position.getY(),position.getParent());
			}
			public Path (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Path (Integer x,Integer y,Environment parent,Gui.Drawable drawable){
				super(x,y,parent);
				this.drawable=drawable;
			}
			public Path (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Path (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations,Gui.Drawable drawable){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
				this.drawable=drawable;
			}
			public Path (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					area.add(new Tiles.Town.Path(placeX,placeY,area.getParent()));
				}
			}
			public static class Cost1 extends Treasury.Cost {
				public int getAmount(){
					return 1;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Fairy_Dust.id;
				}
				public Treasury.Reward getReward(){
					return new Tiles.Town.Path.Cost1.Reward();
				}
				public Cost1 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Tiles.Town.Path.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class StoneFloor extends Tile {
			public static Tile.Id id = new Tile.Id();
			protected Gui.Drawable drawable = null;
			public StoneFloor (){
				super();
			}
			public Tile.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Tiles.Town.StoneFloor.Cost2());
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
			public StoneFloor (int x,int y,Environment parent){
				super(x,y,parent);
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void display(){
				getDrawable().display(Renderer.botLayer);
				if(terrain!=null){
					terrain.display();
				}
				if(occupant!=null){
					occupant.display();
				}
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.botLayer);
				if(terrain!=null){
					terrain.undisplay();
				}
				if(occupant!=null){
					occupant.undisplay();
				}
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Town.States imageStates = Images.town.asStates();
					imageStates.stone_floor();
					drawable=Drawables.isosquare.image(imageStates);
					drawable.setVisualX((float)(getX()+getY())/11.1f);
					drawable.setVisualY((float)(getY()-getX())/23.099998f);
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Tile create(Environment.Position position){
				return new Tiles.Town.StoneFloor(position.getX(),position.getY(),position.getParent());
			}
			public StoneFloor (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public StoneFloor (Integer x,Integer y,Environment parent,Gui.Drawable drawable){
				super(x,y,parent);
				this.drawable=drawable;
			}
			public StoneFloor (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public StoneFloor (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations,Gui.Drawable drawable){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
				this.drawable=drawable;
			}
			public StoneFloor (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					area.add(new Tiles.Town.StoneFloor(placeX,placeY,area.getParent()));
				}
			}
			public static class Cost2 extends Treasury.Cost {
				public int getAmount(){
					return 1;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Stone.id;
				}
				public Treasury.Reward getReward(){
					return new Tiles.Town.StoneFloor.Cost2.Reward();
				}
				public Cost2 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Tiles.Town.StoneFloor.Placer();
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
		public static class Grass extends Tile {
			public static Tile.Id id = new Tile.Id();
			protected Gui.Drawable drawable = null;
			public Grass (){
				super();
			}
			public Tile.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Tiles.Forest.Grass.Cost11());
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
			public Grass (int x,int y,Environment parent){
				super(x,y,parent);
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void display(){
				getDrawable().display(Renderer.botLayer);
				if(terrain!=null){
					terrain.display();
				}
				if(occupant!=null){
					occupant.display();
				}
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.botLayer);
				if(terrain!=null){
					terrain.undisplay();
				}
				if(occupant!=null){
					occupant.undisplay();
				}
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Foliage.States imageStates = Images.foliage.asStates();
					imageStates.grass();
					drawable=Drawables.isosquare.image(imageStates);
					drawable.setVisualX((float)(getX()+getY())/11.1f);
					drawable.setVisualY((float)(getY()-getX())/23.099998f);
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Tile create(Environment.Position position){
				return new Tiles.Forest.Grass(position.getX(),position.getY(),position.getParent());
			}
			public Grass (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Grass (Integer x,Integer y,Environment parent,Gui.Drawable drawable){
				super(x,y,parent);
				this.drawable=drawable;
			}
			public Grass (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Grass (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations,Gui.Drawable drawable){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
				this.drawable=drawable;
			}
			public Grass (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					area.add(new Tiles.Forest.Grass(placeX,placeY,area.getParent()));
				}
			}
			public static class Cost11 extends Treasury.Cost {
				public Treasury.Reward getReward(){
					return new Tiles.Forest.Grass.Cost11.Reward();
				}
				public Boolean isFree(){
					return true;
				}
				public Cost11 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Tiles.Forest.Grass.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class Path extends Tile {
			public static Tile.Id id = new Tile.Id();
			protected Gui.Drawable drawable = null;
			public Path (){
				super();
			}
			public Tile.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Tiles.Forest.Path.Cost12());
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
			public Path (int x,int y,Environment parent){
				super(x,y,parent);
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void display(){
				getDrawable().display(Renderer.botLayer);
				if(terrain!=null){
					terrain.display();
				}
				if(occupant!=null){
					occupant.display();
				}
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.botLayer);
				if(terrain!=null){
					terrain.undisplay();
				}
				if(occupant!=null){
					occupant.undisplay();
				}
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Foliage.States imageStates = Images.foliage.asStates();
					imageStates.path();
					drawable=Drawables.isosquare.image(imageStates);
					drawable.setVisualX((float)(getX()+getY())/11.1f);
					drawable.setVisualY((float)(getY()-getX())/23.099998f);
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Tile create(Environment.Position position){
				return new Tiles.Forest.Path(position.getX(),position.getY(),position.getParent());
			}
			public Path (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Path (Integer x,Integer y,Environment parent,Gui.Drawable drawable){
				super(x,y,parent);
				this.drawable=drawable;
			}
			public Path (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Path (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations,Gui.Drawable drawable){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
				this.drawable=drawable;
			}
			public Path (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					area.add(new Tiles.Forest.Path(placeX,placeY,area.getParent()));
				}
			}
			public static class Cost12 extends Treasury.Cost {
				public int getAmount(){
					return 1;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Fairy_Dust.id;
				}
				public Treasury.Reward getReward(){
					return new Tiles.Forest.Path.Cost12.Reward();
				}
				public Cost12 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Tiles.Forest.Path.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
		public static class Water extends Tile {
			public static Tile.Id id = new Tile.Id();
			protected Gui.Drawable drawable = null;
			public Water (){
				super();
			}
			public Tile.Id getId(){
				return id;
			}
			public List<Treasury.Cost> getCosts(){
				List<Treasury.Cost> costs = new ArrayList<Treasury.Cost>();
				costs.add(new Tiles.Forest.Water.Cost13());
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
			public Water (int x,int y,Environment parent){
				super(x,y,parent);
			}
			public boolean isPassable(int directionX,int directionY){
				if(terrain!=null){
					return terrain.isPassable(directionX,directionY);
				}
				else{
					return false;
				}
			}
			public void setDrawable(Gui.Drawable newDrawable){
				drawable=newDrawable;
			}
			public void display(){
				getDrawable().display(Renderer.botLayer);
				if(terrain!=null){
					terrain.display();
				}
				if(occupant!=null){
					occupant.display();
				}
			}
			public void undisplay(){
				getDrawable().undisplay(Renderer.botLayer);
				if(terrain!=null){
					terrain.undisplay();
				}
				if(occupant!=null){
					occupant.undisplay();
				}
			}
			public Gui.Drawable getDrawable(){
				if(drawable==null){
					Images.Outside.States imageStates = Images.outside.asStates();
					imageStates.water();
					drawable=Drawables.isosquare.image(imageStates);
					drawable.setVisualX((float)(getX()+getY())/11.1f);
					drawable.setVisualY((float)(getY()-getX())/23.099998f);
					drawable.setVisualWidth((float)getWidth()/6.0f);
					drawable.setVisualHeight((float)getHeight()/6.0f);
				}
				return drawable;
			}
			public static Tile create(Environment.Position position){
				return new Tiles.Forest.Water(position.getX(),position.getY(),position.getParent());
			}
			public Water (Gui.Drawable drawable){
				super();
				this.drawable=drawable;
			}
			public Water (Integer x,Integer y,Environment parent,Gui.Drawable drawable){
				super(x,y,parent);
				this.drawable=drawable;
			}
			public Water (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Water (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations,Gui.Drawable drawable){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
				this.drawable=drawable;
			}
			public Water (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
				super(neighbours,portal,terrain,occupant,area,hasOccupant,hasOccupantWhoIs,associations);
			}
			public static class Placer implements Menu.Placable {
				public Placer (){
				}
				public void place(Area area,int placeX,int placeY){
					area.add(new Tiles.Forest.Water(placeX,placeY,area.getParent()));
				}
			}
			public static class Cost13 extends Treasury.Cost {
				public int getAmount(){
					return 3;
				}
				public Treasury.PaymentType.Id getType(){
					return Treasury.PaymentTypes.Fairy_Dust.id;
				}
				public Treasury.Reward getReward(){
					return new Tiles.Forest.Water.Cost13.Reward();
				}
				public Cost13 (){
					super();
				}
				public static class Reward extends Treasury.Reward {
					public Boolean isPlacable(){
						return true;
					}
					public Menu.Placable getPlacable(){
						return new Tiles.Forest.Water.Placer();
					}
					public Reward (){
						super();
					}
				}
			}
		}
	}
}
