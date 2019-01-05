package com.rem.qstnr.environments.tiles;
import com.rem.qstnr.entities.Entity;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.qstnr.environments.tiles.EntryPoint;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.TreeSet;
import java.util.List;
import com.rem.qstnr.gui.Gui;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.Environment;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import com.rem.qstnr.misc.interfaces.Tickable;
import com.rem.qstnr.environments.Direction;
import java.util.function.Function;
import com.rem.qstnr.entities.relations.associations.Association;
import com.rem.qstnr.events.Events;
import java.util.function.Supplier;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.misc.interfaces.Loaddable;
public abstract class Tile extends Environment.Position implements Loaddable, Tickable, Environment.Areaable {
	protected Map<Direction, Tile> neighbours = new HashMap<Direction, Tile>();
	protected EntryPoint portal = null;
	protected Terrain terrain = null;
	protected Entity occupant = null;
	protected Area area = null;
	protected Supplier<Boolean> hasOccupant = ()->occupant!=null;
	protected Function<Entity, Boolean> hasOccupantWhoIs =  candidate->occupant==candidate;
	protected Association.IdMap associations;
	public void setNeighbours(Map<Direction, Tile> newNeighbours){
		neighbours=newNeighbours;
	}
	public EntryPoint getPortal(){
		return portal;
	}
	public void setPortal(EntryPoint newPortal){
		portal=newPortal;
	}
	public Terrain getTerrain(){
		return terrain;
	}
	public Entity getOccupant(){
		return occupant;
	}
	public void setOccupant(Entity newOccupant){
		occupant=newOccupant;
	}
	public Area getArea(){
		return area;
	}
	public void setArea(Area newArea){
		area=newArea;
	}
	public Supplier<Boolean> getHasOccupant(){
		return hasOccupant;
	}
	public void setHasOccupant(Supplier<Boolean> newHasOccupant){
		hasOccupant=newHasOccupant;
	}
	public Function<Entity, Boolean> getHasOccupantWhoIs(){
		return hasOccupantWhoIs;
	}
	public void setHasOccupantWhoIs(Function<Entity, Boolean> newHasOccupantWhoIs){
		hasOccupantWhoIs=newHasOccupantWhoIs;
	}
	public int getWidth(){
		return 1;
	}
	public int getHeight(){
		return 1;
	}
	public Tile (){
		super();
	}
	public Tile (int x,int y,Environment parent){
		super(x,y,parent);
	}
	public abstract Tile.Id getId();
	public void resetNeighbour(Tile oldTile){
		neighbours.keySet().stream().filter( D->neighbours.get(D)==oldTile).findAny().ifPresent( N->neighbours.remove(N));
	}
	public List<Tile> getNeighbours(){
		return Arrays.stream(Direction.all).map( D->neighbours.get(D)).filter( N->N!=null).collect(Collectors.toList());
	}
	public Tile getNeighbour(Direction direction){
		if(area==null){
			return null;
		}
		return neighbours.get(direction);
	}
	public boolean isWithin(Environment.Position otherPosition){
		return super.isWithin(otherPosition,getWidth(),getHeight());
	}
	public Gui.Drawable getDrawable(){
		return null;
	}
	public Boolean load(){
		Arrays.stream(Direction.all).forEach( D->neighbours.put(D,area.getTile(getX()+D.getX(),getY()+D.getY())));
		if(portal!=null){
			area.addEntryPoint(this);
		}
		if(terrain!=null){
			terrain.load();
		}
		if(occupant!=null){
			occupant.load();
		}
		return true;
	}
	public Boolean tick(Double millisSinceLastFrame){
		if(terrain!=null){
			terrain.tick(millisSinceLastFrame);
		}
		if(occupant!=null){
			occupant.tick(millisSinceLastFrame);
		}
		return true;
	}
	public void display(){
	}
	public void undisplay(){
	}
	public Entity.Event accept(Entity newOccupant){
		if(portal!=null){
			return portal.getOnAccept().apply(newOccupant);
		}
		else{
			take(newOccupant);
			return null;
		}
	}
	public void take(Entity newOccupant){
		Environment.Location location = newOccupant.getLocation();
		location.setX(getX());
		location.setY(getY());
		location.setTile(this);
		occupant=newOccupant;
	}
	public Association get(Association.Id id,Association.Factory factory){
		return associations.get(id,factory);
	}
	public String toString(){
		return "("+getX()+","+getY()+")";
	}
	public void setTerrain(Terrain newTerrain){
		terrain=newTerrain;
		if(terrain!=null){
			terrain.setFloorTile(this);
		}
	}
	public void setTerrain(Function<Environment.Position, Terrain> factory){
		setTerrain(factory.apply(this));
	}
	public boolean hasOccupant(){
		return hasOccupant.get();
	}
	public boolean hasOccupant(Entity otherEntity){
		return hasOccupantWhoIs.apply(otherEntity);
	}
	public boolean hasObstruction(){
		return occupant!=null||(terrain!=null&& !terrain.isPassable(0,0));
	}
	public boolean isPassable(int directionX,int directionY){
		if(occupant!=null){
			return false;
		}
		else if(terrain!=null&& !terrain.isPassable(directionX,directionY)){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean isPassable(Environment.Position position){
		return isPassable(position.getX()-getX(),position.getY()-getY());
	}
	public Tile setPortal(Area.Generator generator){
		this.portal=new EntryPoint(this,generator);
		return this;
	}
	public int getDistanceToUnexploredPaths(Entity explorer){
		return getDistanceToUnexploredPaths(explorer,Collections.synchronizedSet(new HashSet<Tile>()),0);
	}
	public int getDistanceToUnexploredPaths(Entity explorer,Set<Tile> investigated,int distance){
		if(investigated.add(this)){
			if(explorer.hasExplored(area)){
				return getPortal().getArea().getEntryPoints().parallelStream().reduce(Integer.MAX_VALUE,(Previous,Entry)->Entry.getDistanceToUnexploredPaths(explorer,investigated,distance+1),(Min,New)->New<Min?New:Min);
			}
			else{
				return distance;
			}
		}
		else{
			return Integer.MAX_VALUE;
		}
	}
	public Association.IdMap getAssociations(){
		return associations;
	}
	public void setAssociations(Association.IdMap newAssociations){
		associations=newAssociations;
	}
	public Tile (Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
		super();
		this.neighbours=neighbours;
		this.portal=portal;
		this.terrain=terrain;
		this.occupant=occupant;
		this.area=area;
		this.hasOccupant=hasOccupant;
		this.hasOccupantWhoIs=hasOccupantWhoIs;
		this.associations=associations;
	}
	public Tile (Integer x,Integer y,Environment parent,Map<Direction, Tile> neighbours,EntryPoint portal,Terrain terrain,Entity occupant,Area area,Supplier<Boolean> hasOccupant,Function<Entity, Boolean> hasOccupantWhoIs,Association.IdMap associations){
		super(x,y,parent);
		this.neighbours=neighbours;
		this.portal=portal;
		this.terrain=terrain;
		this.occupant=occupant;
		this.area=area;
		this.hasOccupant=hasOccupant;
		this.hasOccupantWhoIs=hasOccupantWhoIs;
		this.associations=associations;
	}
	public Tile (Integer x,Integer y,Environment parent){
		super(x,y,parent);
	}
	public static class Id {
		public Id (){
			super();
		}
	}
	public static class Comparators {
		public Comparators (){
			super();
		}
		public static class Distance {
			public Distance (){
				super();
			}
			public static class Ascending implements Comparator<Tile> {
				protected Environment.Position origin = null;
				public Environment.Position getOrigin(){
					return origin;
				}
				public void setOrigin(Environment.Position newOrigin){
					origin=newOrigin;
				}
				public Ascending (Environment.Position origin){
					this.origin=origin;
				}
				public int compare(Tile tile1,Tile tile2){
					double distance1 = origin.getDistanceTo(tile1);
					double distance2 = origin.getDistanceTo(tile2);
					if(distance1==distance2){
						if(tile1==tile2){
							return 0;
						}
						else{
							return -1;
						}
					}
					else{
						if(distance1>distance2){
							return 1;
						}
						else{
							return -1;
						}
					}
				}
				public Ascending (){
					super();
				}
				public static class Complex implements Comparator<Tile> {
					protected Environment.Position origin = null;
					public Environment.Position getOrigin(){
						return origin;
					}
					public void setOrigin(Environment.Position newOrigin){
						origin=newOrigin;
					}
					public Complex (Environment.Position origin){
						this.origin=origin;
					}
					public int compare(Tile tile1,Tile tile2){
						int distance1 = 0;
						int distance2 = 0;
						Area originArea = null;
						if(origin instanceof Environment.Areaable){
							originArea=((Environment.Areaable)origin).getArea();
						}
						if(originArea!=null&&originArea!=tile1.getArea()){
							distance1=(int)(double)tile1.getArea().getSisterAreas().get(originArea).getDistanceTo(tile1);
						}
						else{
							distance1=(int)(double)origin.getDistanceTo(tile1);
						}
						if(originArea!=null&&originArea!=tile2.getArea()){
							distance1=(int)(double)tile2.getArea().getSisterAreas().get(originArea).getDistanceTo(tile2);
						}
						else{
							distance2=(int)(double)origin.getDistanceTo(tile2);
						}
						if(distance1==distance2){
							if(tile1==tile2){
								return 0;
							}
							else{
								return -1;
							}
						}
						else{
							return distance1-distance2;
						}
					}
					public Complex (){
						super();
					}
				}
			}
			public static class Descending implements Comparator<Tile> {
				protected Environment.Position origin = null;
				public Environment.Position getOrigin(){
					return origin;
				}
				public void setOrigin(Environment.Position newOrigin){
					origin=newOrigin;
				}
				public Descending (Environment.Position origin){
					this.origin=origin;
				}
				public int compare(Tile tile1,Tile tile2){
					return (int)(float)(origin.getDistanceTo(tile2)-origin.getDistanceTo(tile1));
				}
				public Descending (){
					super();
				}
			}
		}
	}
	public static interface Factory {
		public Tile create();
	}
	public static class Listener {
		public Listener (){
			super();
		}
		public static class Die extends Events.Die.Listener {
			protected Tile host = null;
			public Tile getHost(){
				return host;
			}
			public void setHost(Tile newHost){
				host=newHost;
			}
			public Die (Tile host){
				this.host=host;
			}
			public Boolean listen(Events.Die event){
				return true;
			}
			public Die (){
				super();
			}
		}
	}
	public static interface Criteria extends Predicate<Tile> {
		public static class Free implements Tile.Criteria {
			public boolean test(Tile candidate){
				return true;
			}
		}
	}
	public static class Way {
		protected int currentIndex = 1;
		protected List<Tile> path = null;
		public int getCurrentIndex(){
			return currentIndex;
		}
		public void setCurrentIndex(int newCurrentIndex){
			currentIndex=newCurrentIndex;
		}
		public List<Tile> getPath(){
			return path;
		}
		public void setPath(List<Tile> newPath){
			path=newPath;
		}
		public Way (List<Tile> path){
			this.path=path;
		}
		public boolean step(Entity host){
			if(currentIndex<path.size()){
				host.getLocation().stepUsingWay(host.getWalkingSpeed(),host.getLocation().getDirectionOf(path.get(++currentIndex-1)),this);
				return true;
			}
			else{
				return false;
			}
		}
		public void fail(){
			--currentIndex;
		}
		public Way (int currentIndex,List<Tile> path){
			super();
			this.currentIndex=currentIndex;
			this.path=path;
		}
		public Way (){
			super();
		}
	}
	public static class Path implements Comparable<Path> {
		protected int distanceToDestination = 0;
		protected Tile tile = null;
		protected Tile.Path parent = null;
		public int getDistanceToDestination(){
			return distanceToDestination;
		}
		public void setDistanceToDestination(int newDistanceToDestination){
			distanceToDestination=newDistanceToDestination;
		}
		public Tile getTile(){
			return tile;
		}
		public void setTile(Tile newTile){
			tile=newTile;
		}
		public Tile.Path getParent(){
			return parent;
		}
		public void setParent(Tile.Path newParent){
			parent=newParent;
		}
		public Path (Path parentPath,Tile nextTile,Tile destination){
			distanceToDestination=Math.abs(destination.getX()-nextTile.getX())+Math.abs(destination.getY()-nextTile.getY());
			if(parentPath!=null){
				parent=parentPath;
				if(nextTile.isPassable(parentPath.tile)==false){
					distanceToDestination+=5000;
					if(nextTile.hasObstruction()==false){
						distanceToDestination+=5000;
					}
				}
			}
			tile=nextTile;
		}
		public List<Tile> collect(){
			List<Tile> result = parent!=null?parent.collect():new ArrayList<Tile>();
			result.add(tile);
			return result;
		}
		public List<Tile> collectReverse(){
			List<Tile> result = new ArrayList<Tile>();
			collectReverse(result);
			return result;
		}
		public void collectReverse(List<Tile> result){
			result.add(tile);
			if(parent!=null){
				parent.collectReverse(result);
			}
		}
		public boolean equals(Object otherObject){
			Path otherPath = (Path)otherObject;
			return otherPath.distanceToDestination==distanceToDestination&&otherPath.parent==parent&&otherPath.tile==tile?parent!=null?parent.equals(otherPath.parent):true:false;
		}
		public int compareTo(Path otherPath){
			if(distanceToDestination==otherPath.distanceToDestination){
				if(tile.getX()==otherPath.tile.getX()&&tile.getY()==otherPath.tile.getY()){
					return 0;
				}
				else if((tile.getX()==otherPath.tile.getX())){
					return tile.getY()-otherPath.tile.getY();
				}
				else{
					return tile.getX()-otherPath.tile.getX();
				}
			}
			else{
				return distanceToDestination-otherPath.distanceToDestination;
			}
		}
		public String toString(){
			StringBuilder builder = new StringBuilder();
			builder.append("*******\n");
			toString(builder);
			return builder.toString();
		}
		public void toString(StringBuilder builder){
			builder.append("[");
			builder.append(tile.getX());
			builder.append(",");
			builder.append(tile.getY());
			builder.append("]");
			if(parent!=null){
				parent.toString(builder);
			}
		}
		public Path (int distanceToDestination,Tile tile,Tile.Path parent){
			super();
			this.distanceToDestination=distanceToDestination;
			this.tile=tile;
			this.parent=parent;
		}
		public Path (){
			super();
		}
		public static class Ways extends TreeSet<Path> {
			protected Tile endTile;
			public Tile getEndTile(){
				return endTile;
			}
			public void setEndTile(Tile newEndTile){
				endTile=newEndTile;
			}
			public Ways (){
				this.endTile=null;
			}
			public Ways (Tile endTile){
				this.endTile=endTile;
			}
			public void extend(Tile.Path toExtend,Tile toAdd){
				add(new Tile.Path(toExtend,toAdd,endTile));
			}
		}
	}
	public static class IdMap {
		protected Map<Tile.Id, java.util.List<Tile>> map = new HashMap<Tile.Id, java.util.List<Tile>>();
		public Map<Tile.Id, java.util.List<Tile>> getMap(){
			return map;
		}
		public void setMap(Map<Tile.Id, java.util.List<Tile>> newMap){
			map=newMap;
		}
		public boolean add(Tile addObject){
			synchronized(this){
				if(map.containsKey((Tile.Id)addObject.getId())==false){
					map.put((Tile.Id)addObject.getId(),new ArrayList<Tile>());
				}
				return map.get((Tile.Id)addObject.getId()).add(addObject);
			}
		}
		public Tile get(Tile.Id id,Tile.Factory factory){
			synchronized(this){
				List<Tile> result = map.get(id);
				if(result==null){
					result=new ArrayList<Tile>();
					map.put(id,result);
					Tile newObject = factory.create();
					result.add(newObject);
					return newObject;
				}
				else{
					if(result.isEmpty()){
						Tile newObject = factory.create();
						result.add(newObject);
						return newObject;
					}
					else{
						return result.get(0);
					}
				}
			}
		}
		public Tile get(Tile.Id findId){
			synchronized(this){
				List<Tile> result = map.get(findId);
				if(result!=null&&result.isEmpty()==false){
					return result.get(0);
				}
				else{
					return null;
				}
			}
		}
		public List<Tile> getAll(Tile.Id findId){
			synchronized(this){
				return map.get(findId);
			}
		}
		public boolean has(Tile.Id findId){
			synchronized(this){
				return map.containsKey(findId)&&map.get(findId).isEmpty()==false;
			}
		}
		public boolean remove(Tile addObject){
			synchronized(this){
				if(map.containsKey((Tile.Id)addObject.getId())){
					return map.get((Tile.Id)addObject.getId()).remove(addObject);
				}
				else{
					return false;
				}
			}
		}
		public IdMap (Map<Tile.Id, java.util.List<Tile>> map){
			super();
			this.map=map;
		}
		public IdMap (){
			super();
		}
	}
}
