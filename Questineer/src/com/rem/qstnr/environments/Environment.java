package com.rem.qstnr.environments;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.HashMap;
import com.rem.qstnr.misc.interfaces.Tickable;
import java.util.ArrayList;
import com.rem.qstnr.environments.tiles.EntryPoint;
import com.rem.qstnr.environments.Direction;
import java.util.function.Predicate;
import java.util.Comparator;
import java.util.function.Function;
import com.rem.qstnr.gui.images.ImageStates;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.Environment;
import com.rem.qstnr.events.Event;
import com.rem.qstnr.misc.interfaces.Loaddable;
import java.util.Arrays;
import java.util.Map;
public class Environment implements Loaddable, Tickable {
	protected String name = null;
	protected Area startArea = null;
	protected Area.Generator areaGenerator = null;
	protected List<Function<Environment.Position, Tile>> floorTiles = new ArrayList<Function<Environment.Position, Tile>>();
	protected List<Area> areas = new ArrayList<Area>();
	protected Map<Area, Integer> activeAreas = new HashMap<Area, Integer>();
	protected Tile.IdMap tiles = new Tile.IdMap();
	protected Area.IdMap areaMap = new Area.IdMap();
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public Area getStartArea(){
		return startArea;
	}
	public void setStartArea(Area newStartArea){
		startArea=newStartArea;
	}
	public Area.Generator getAreaGenerator(){
		return areaGenerator;
	}
	public void setAreaGenerator(Area.Generator newAreaGenerator){
		areaGenerator=newAreaGenerator;
	}
	public List<Function<Environment.Position, Tile>> getFloorTiles(){
		return floorTiles;
	}
	public void setFloorTiles(List<Function<Environment.Position, Tile>> newFloorTiles){
		floorTiles=newFloorTiles;
	}
	public List<Area> getAreas(){
		return areas;
	}
	public void setAreas(List<Area> newAreas){
		areas=newAreas;
	}
	public Map<Area, Integer> getActiveAreas(){
		return activeAreas;
	}
	public void setActiveAreas(Map<Area, Integer> newActiveAreas){
		activeAreas=newActiveAreas;
	}
	public Tile.IdMap getTiles(){
		return tiles;
	}
	public void setTiles(Tile.IdMap newTiles){
		tiles=newTiles;
	}
	public Area.IdMap getAreaMap(){
		return areaMap;
	}
	public void setAreaMap(Area.IdMap newAreaMap){
		areaMap=newAreaMap;
	}
	public void add(Area newArea){
		areas.parallelStream().forEach( A->{						A.findDistance(newArea);
						A.getEntryPointToward(newArea);
 });
		areas.add(newArea);
		areaMap.add(newArea);
		newArea.setParent(this);
	}
	public void addActiveArea(Area area){
		if(activeAreas.containsKey(area)){
			activeAreas.put(area,activeAreas.get(area)+1);
		}
		else{
			activeAreas.put(area,1);
		}
	}
	public void removeActiveArea(Area area){
		if(activeAreas.containsKey(area)){
			Integer currentAmount = activeAreas.get(area);
			if(currentAmount<=1){
				activeAreas.remove(area);
			}
			else{
				activeAreas.put(area,currentAmount-1);
			}
		}
	}
	public Area getArea(Integer index){
		return areas.get(index);
	}
	public List<Area> get(Area.Id id){
		return areaMap.getAll(id);
	}
	public Tile getTile(int x,int y){
		Area found = areas.parallelStream().filter( A->A.getTile(x,y)!=null).findAny().orElse(null);
		if(found==null){
			return null;
		}
		return found.getTile(x,y);
	}
	public List<Tile> collectTiles(Tile.Id tileId,Predicate<Tile> predicate){
		if(tiles.has(tileId)==false){
			return new ArrayList<Tile>();
		}
		else{
			return tiles.getAll(tileId).stream().filter(predicate).collect(Collectors.toList());
		}
	}
	public List<Tile> getTilesWithin(Environment.Position position,Float range,Tile.Id tileId){
		return collectTiles((tileId), tile->position.getDistanceTo(tile)<=range);
	}
	public void add(Entity newEntity){
		startArea.add(newEntity);
	}
	public void add(Tile newTile){
		tiles.add(newTile);
	}
	public Boolean load(){
		Area newArea = areaGenerator.generate();
		if(startArea==null){
			startArea=newArea;
		}
		if(newArea!=null){
			newArea.load();
			add(newArea);
		}
		return true;
	}
	public Boolean tick(Double millisSinceLastFrame){
		List<Area> currentlyActive = new ArrayList<Area>();
		currentlyActive.addAll(activeAreas.keySet());
		currentlyActive.parallelStream().forEach( A->A.tick(millisSinceLastFrame));
		return true;
	}
	public boolean join(Environment otherEnvironment){
		Tile myEntryPoint = areas.stream().flatMap( A->A.getEntryPoints().stream()).filter( E->E.getPortal().getDestinationArea()==null).findAny().orElse(null);
		Tile yourEntryPoint = otherEnvironment.areas.stream().flatMap( A->A.getEntryPoints().stream()).filter( E->E.getPortal().getDestinationArea()==null).findAny().orElse(null);
		if(myEntryPoint!=null&&yourEntryPoint!=null){
			EntryPoint.addSisterTile(myEntryPoint,yourEntryPoint);
			EntryPoint.addSisterTile(yourEntryPoint,myEntryPoint);
			areas.stream().forEach( A->A.findDistance(yourEntryPoint.getArea()));
			otherEnvironment.areas.stream().forEach( A->A.findDistance(myEntryPoint.getArea()));
			return true;
		}
		else{
			return false;
		}
	}
	public Environment (String name,Area startArea,Area.Generator areaGenerator,List<Function<Environment.Position, Tile>> floorTiles,List<Area> areas,Map<Area, Integer> activeAreas,Tile.IdMap tiles,Area.IdMap areaMap){
		super();
		this.name=name;
		this.startArea=startArea;
		this.areaGenerator=areaGenerator;
		this.floorTiles=floorTiles;
		this.areas=areas;
		this.activeAreas=activeAreas;
		this.tiles=tiles;
		this.areaMap=areaMap;
	}
	public Environment (){
		super();
	}
	public static interface Movable {
		public Entity.Event moveX(Integer x);
		public Entity.Event moveY(Integer y);
	}
	public static interface Areaable {
		public Area getArea();
	}
	public static class Position {
		protected Integer x = Integer.MIN_VALUE;
		protected Integer y = Integer.MIN_VALUE;
		protected Environment parent = null;
		public Integer getX(){
			return x;
		}
		public void setX(Integer newX){
			x=newX;
		}
		public Integer getY(){
			return y;
		}
		public void setY(Integer newY){
			y=newY;
		}
		public Environment getParent(){
			return parent;
		}
		public void setParent(Environment newParent){
			parent=newParent;
		}
		public Position (){
		}
		public Position (int x,int y){
			this.x=x;
			this.y=y;
		}
		public Position (int x,int y,Environment parent){
			this.x=x;
			this.y=y;
			this.parent=parent;
		}
		public Position (Position otherPosition){
			this.x=otherPosition.x;
			this.y=otherPosition.y;
			this.parent=otherPosition.parent;
		}
		public Double getDistanceTo(Position otherPosition){
			int xDirection = otherPosition.getX()-getX();
			int yDirection = otherPosition.getY()-getY();
			return Math.sqrt(xDirection*xDirection+yDirection*yDirection);
		}
		public Double getDirectionTo(Position otherPosition){
			Integer xDirection = otherPosition.getX()-getX();
			Integer yDirection = otherPosition.getX()-getY();
			if(xDirection==0){
				if(yDirection>0){
					return Math.PI/2.0;
				}
				else if(yDirection<0){
					return Math.PI*3.0/2.0;
				}
				else{
					return 0.0;
				}
			}
			else{
				return Math.atan2(yDirection,xDirection);
			}
		}
		public Direction getDirectionOf(Position otherPosition){
			Integer xDirection = otherPosition.getX()-getX();
			if(xDirection>0){
				return Direction.right;
			}
			else if(xDirection<0){
				return Direction.left;
			}
			Integer yDirection = otherPosition.getY()-getY();
			if(yDirection>0){
				return Direction.up;
			}
			else if(yDirection<0){
				return Direction.down;
			}
			else{
				return null;
			}
		}
		public Direction[] getDirectionsOf(Position otherPosition){
			Integer xDirection = otherPosition.getX()-getX();
			Integer yDirection = otherPosition.getY()-getY();
			if(xDirection>0){
				if(yDirection>0){
					return Direction.rightUp;
				}
				else if(yDirection<0){
					return Direction.rightDown;
				}
				else{
					return new Direction[]{Direction.right};
				}
			}
			else if(xDirection<0){
				if(yDirection>0){
					return Direction.leftUp;
				}
				else if(yDirection<0){
					return Direction.leftDown;
				}
				else{
					return new Direction[]{Direction.left};
				}
			}
			else if(yDirection>0){
				return new Direction[]{Direction.up};
			}
			else if(yDirection<0){
				return new Direction[]{Direction.down};
			}
			else{
				return new Direction[]{};
			}
		}
		public Boolean isWithin(Environment.Position otherPosition,Integer width,Integer height){
			Integer dX = otherPosition.getX()-x;
			Integer dY = otherPosition.getY()-y;
			return dX>=0&&dX<=width&&dY>=0&&dY<=height;
		}
		public Boolean isWithin(Environment.Position otherPosition,Float range,Double angleLeft,Double angleRight){
			Integer xDirection = getX()-otherPosition.getX();
			Integer yDirection = getY()-otherPosition.getY();
			Double radius = Math.sqrt(Math.pow(xDirection,2.0)+Math.pow(yDirection,2.0));
			if(xDirection==0){
				if(yDirection<0){
					return radius<=range&&angleLeft>=Math.PI*3.0/2.0&&angleRight<=Math.PI*3.0/2.0;
				}
				else if(yDirection>0){
					return radius<=range&&angleLeft>=Math.PI/2.0&&angleRight<=Math.PI/2.0;
				}
				else{
					return true;
				}
			}
			else{
				Double angle = Math.atan2(yDirection,xDirection);
				return radius<=range&&angleLeft>=angle&&angleRight<=angle;
			}
		}
		public Position (Integer x,Integer y,Environment parent){
			super();
			this.x=x;
			this.y=y;
			this.parent=parent;
		}
	}
	public static class Location extends Environment.Position implements Environment.Movable, Environment.Areaable {
		protected Entity host = null;
		protected Float radius = 0.5f;
		protected Float facing = 0f;
		protected Area area = null;
		protected Tile tile = null;
		public Entity getHost(){
			return host;
		}
		public void setHost(Entity newHost){
			host=newHost;
		}
		public Float getRadius(){
			return radius;
		}
		public void setRadius(Float newRadius){
			radius=newRadius;
		}
		public Float getFacing(){
			return facing;
		}
		public void setFacing(Float newFacing){
			facing=newFacing;
		}
		public Area getArea(){
			return area;
		}
		public Tile getTile(){
			return tile;
		}
		public void setTile(Tile newTile){
			tile=newTile;
		}
		public Location (Environment.Position position){
			super(position);
		}
		public Location (Entity entity){
			this.host=entity;
		}
		public void setX(Integer newX){
			super.setX(newX);
			if(host!=null){
				host.getDrawable().setVisualX(((float)newX+getY())/11.1f);
				host.getDrawable().setVisualY(((float)getY()-newX)/23.099998f+0.05f);
			}
		}
		public void setY(Integer newY){
			super.setY(newY);
			if(host!=null){
				host.getDrawable().setVisualX(((float)getX()+newY)/11.1f);
				host.getDrawable().setVisualY(((float)newY-getX())/23.099998f+0.05f);
			}
		}
		public void setArea(Area newArea){
			if(host!=null){
				if(area!=null){
					area.remove(host);
				}
				newArea.add(host);
			}
			area=newArea;
		}
		public Boolean isWithin(Environment.Location otherLocation,Float range,Double angleLeft,Double angleRight){
			Float tFacing = otherLocation.getFacing();
			return super.isWithin(otherLocation,range,angleLeft+tFacing,angleRight+tFacing);
		}
		public Boolean isWithin(Environment.Position otherPosition){
			return super.isWithin(otherPosition,radius,Math.PI*2.0,0.0);
		}
		public List<Entity> getEntitiesWithin(Float within){
			return area.getEntitiesWithin(this,within);
		}
		public List<Entity> getEntitiesWithin(Float within,Predicate<Entity> targetCriteria){
			return area.getEntitiesWithin(this,within,targetCriteria);
		}
		public Entity getClosestEntity(Predicate<Entity> criteria){
			return area.getClosestEntity(this,criteria);
		}
		public Tile getClosestTile(Predicate<Tile> criteria){
			return area.getClosestTile(this,criteria);
		}
		public List<Area> getAreasWith(Predicate<Tile> criteria,Comparator<Area> comparator,Float range){
			return parent.getAreas().parallelStream().filter( A->A.getDistanceTo(area)<range).filter( A->A.has(criteria)).sorted(comparator).collect(Collectors.toList());
		}
		public List<Area> getAreasWithTile(Tile.Id tileId,Float range){
			return parent.getAreas().parallelStream().filter( A->A.getDistanceTo(area)<range).filter( A->A.getTileMap().has(tileId)).collect(Collectors.toList());
		}
		public List<Tile> getTilesWithin(Float range,Tile.Id id){
			if(area.getTileMap().has(id)==false){
				return new ArrayList<Tile>();
			}
			return area.getTileMap().getAll(id).parallelStream().filter( T->getDistanceTo(T)<=range).collect(Collectors.toList());
		}
		public Tile getUnexploredPoint(){
			return area.getUnexploredPoint(host);
		}
		public void step(Integer speed,Environment.Position otherPosition){
			step(speed,getDirectionOf(otherPosition));
		}
		public void step(Integer speed,Direction direction){
			if(direction!=null){
				facing=direction.getFloatValue();
				host.changeState(ImageStates.walk);
				host.changeState(direction.getStateId());
				area.addEvent(speed,new Environment.Location.Event.Move(this,direction));
			}
		}
		public void stepUsingWay(Integer speed,Direction direction,Tile.Way way){
			if(direction!=null){
				facing=direction.getFloatValue();
				host.changeState(ImageStates.walk);
				host.changeState(direction.getStateId());
				area.addEvent(speed,new Environment.Location.Event.MoveByWay(this,direction,way));
			}
		}
		public Boolean isCloseAsPossibleTo(Tile tile){
			if(tile.isPassable(0,0)){
				return isWithin(tile);
			}
			else{
				return Arrays.stream(getDirectionsOf(tile)).anyMatch( direction->isCloseAsPossibleTo(tile.getNeighbour(direction)));
			}
		}
		public void move(Integer xDirection,Integer yDirection){
			x+=xDirection;
			y+=yDirection;
		}
		public Entity.Event moveX(Integer xDirection){
			Tile nextTile = area.getTile(x+xDirection,y);
			if(nextTile==null){
				return new Entity.Event.FailedToMove(nextTile);
			}
			else if(nextTile.isPassable(-xDirection,0)){
				return nextTile.accept(host);
			}
			else if(nextTile.hasOccupant()){
				return new Entity.Event.FailedToMove.TileHasOccupant(nextTile,nextTile.getOccupant());
			}
			else if(nextTile.getTerrain()!=null&&nextTile.getTerrain().isPassable(-xDirection,0)==false){
				return new Entity.Event.FailedToMove.TerrainImpassable(nextTile,nextTile.getTerrain());
			}
			else{
				return new Entity.Event.FailedToMove(nextTile);
			}
		}
		public Entity.Event moveY(Integer yDirection){
			Tile nextTile = area.getTile(x,y+yDirection);
			if(nextTile==null){
				return new Entity.Event.FailedToMove(nextTile);
			}
			else if(nextTile.isPassable(0,-yDirection)){
				return nextTile.accept(host);
			}
			else if(nextTile.hasOccupant()){
				return new Entity.Event.FailedToMove.TileHasOccupant(nextTile,nextTile.getOccupant());
			}
			else if(nextTile.getTerrain()!=null&&nextTile.getTerrain().isPassable(0,-yDirection)==false){
				return new Entity.Event.FailedToMove.TerrainImpassable(nextTile,nextTile.getTerrain());
			}
			else{
				return new Entity.Event.FailedToMove(nextTile);
			}
		}
		public void moveTo(Environment.Position otherPosition){
			x=otherPosition.x;
			y=otherPosition.y;
			parent=otherPosition.getParent();
		}
		public void moveTo(Tile otherTile){
			x=otherTile.x;
			y=otherTile.y;
			parent=otherTile.getParent();
			area=otherTile.getArea();
			tile=otherTile;
			otherTile.accept(host);
		}
		public boolean moveToAround(Tile otherTile){
			Tile moveToTile = otherTile;
			if(otherTile.hasOccupant()){
				moveToTile=otherTile.getArea().getTiles().parallelStream().filter( T->!T.hasOccupant()).sorted(new Tile.Comparators.Distance.Ascending(otherTile)).findFirst().orElse(null);
			}
			if(moveToTile!=null){
				moveTo(moveToTile);
				return true;
			}
			else{
				return false;
			}
		}
		public Tile.Way getWay(Tile endTile){
			Tile.Path path = new Tile.Path(null,tile,endTile);
			Tile.Path.Ways ways = new Tile.Path.Ways();
			ways.add(path);
			Set<Tile> investigated = new HashSet<Tile>();
			investigated.add(null);
			investigated.add(tile);
			List<Tile.Path> tried = new ArrayList<Tile.Path>();
			while(path.getTile()!=endTile&&ways.isEmpty()==false){
				path=ways.pollFirst();
				tried.add(path);
				for(Tile neighbour:path.getTile().getNeighbours()){
					if(investigated.add(neighbour)&&(neighbour.isPassable(path.getTile())||neighbour.hasObstruction())){
						ways.add(new Tile.Path(path,neighbour,endTile));
					}
				}
			}
			if(path.getTile()==endTile){
				return new Tile.Way(path.collect());
			}
			else{
				System.err.println("Could not make path!");
				for(Tile.Path trie:tried){
					System.out.println(path);
				}
				return null;
			}
		}
		public Location (Entity host,Float radius,Float facing,Area area,Tile tile){
			super();
			this.host=host;
			this.radius=radius;
			this.facing=facing;
			this.area=area;
			this.tile=tile;
		}
		public Location (){
			super();
		}
		public Location (Integer x,Integer y,Environment parent,Entity host,Float radius,Float facing,Area area,Tile tile){
			super(x,y,parent);
			this.host=host;
			this.radius=radius;
			this.facing=facing;
			this.area=area;
			this.tile=tile;
		}
		public Location (Integer x,Integer y,Environment parent){
			super(x,y,parent);
		}
		public static class Event {
			public Event (){
				super();
			}
			public static class Move implements Area.Event.Tick {
				protected Environment.Location actor = null;
				protected Direction direction = null;
				public Environment.Location getActor(){
					return actor;
				}
				public void setActor(Environment.Location newActor){
					actor=newActor;
				}
				public Direction getDirection(){
					return direction;
				}
				public void setDirection(Direction newDirection){
					direction=newDirection;
				}
				public Move (Environment.Location actor,Direction direction){
					this.actor=actor;
					this.direction=direction;
				}
				public void tick(Double millisSinceLastFrame){
					Entity.Event event = direction.move(actor);
					actor.getHost().changeState(ImageStates.idle);
					if(event!=null){
						actor.getHost().addEvent(event);
					}
				}
				public Move (){
					super();
				}
			}
			public static class MoveByWay implements Area.Event.Tick {
				protected Environment.Location actor = null;
				protected Direction direction = null;
				protected Tile.Way way = null;
				public Environment.Location getActor(){
					return actor;
				}
				public void setActor(Environment.Location newActor){
					actor=newActor;
				}
				public Direction getDirection(){
					return direction;
				}
				public void setDirection(Direction newDirection){
					direction=newDirection;
				}
				public Tile.Way getWay(){
					return way;
				}
				public void setWay(Tile.Way newWay){
					way=newWay;
				}
				public MoveByWay (Environment.Location actor,Direction direction,Tile.Way way){
					this.actor=actor;
					this.direction=direction;
					this.way=way;
				}
				public void tick(Double millisSinceLastFrame){
					Entity.Event event = direction.move(actor);
					actor.getHost().changeState(ImageStates.idle);
					if(event!=null){
						if(event instanceof Entity.Event.FailedToMove){
							way.fail();
						}
						actor.getHost().addEvent(event);
					}
				}
				public MoveByWay (){
					super();
				}
			}
		}
	}
	public static interface FactoryHelper {
		public void populate(Environment client,Float x,Float y);
	}
	public static interface Factory {
		public Environment create();
	}
}
