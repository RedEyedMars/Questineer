package com.rem.qstnr.environments;
import com.rem.qstnr.environments.buildings.Building;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import com.rem.qstnr.environments.AreaSet;
import java.util.function.Function;
import com.rem.qstnr.misc.streams.Streamer;
import java.util.Iterator;
import com.rem.qstnr.environment.interfaces.EntryPointJoinable;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.events.Event;
import com.rem.qstnr.environments.Environment;
import java.util.Map;
import java.util.stream.IntStream;
public class Area extends Environment.Position implements EntryPointJoinable {
	protected List<Tile> tiles = Collections.synchronizedList(new ArrayList<Tile>());
	protected Map<Integer, Map<Integer, Tile>> layout = new HashMap<Integer, Map<Integer, Tile>>();
	protected List<Tile> entryPoints = new ArrayList<Tile>();
	protected List<EntryPointListener> entryPointsListeners = new ArrayList<EntryPointListener>();
	protected Tile.IdMap tileMap = new Tile.IdMap();
	protected List<Terrain> terrains = Collections.synchronizedList(new ArrayList<Terrain>());
	protected Terrain.IdMap terrainMap = new Terrain.IdMap();
	protected Map<Integer, Set<Integer>> openSides = new HashMap<Integer, Set<Integer>>();
	protected Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths = new HashMap<Integer, Map<Integer, List<Tile>>>();
	protected Map<Area, Tile> sisterAreas = new HashMap<Area, Tile>();
	protected ArrayList<Set<Area>> areaDistances = new ArrayList<Set<Area>>(32);
	protected int furthestDistanceToArea = 0;
	protected Building.TypeMap buildings = new Building.TypeMap();
	protected List<Entity> entities = Collections.synchronizedList(new ArrayList<Entity>());
	protected Integer width = 0;
	protected Integer height = 0;
	protected Integer currentTickPosition = 0;
	protected Area.Event.Tick.Listener[] tickEvents = new Area.Event.Tick.Listener[256];
	protected Area.Generator generator = null;
	public List<Tile> getTiles(){
		return tiles;
	}
	public void setTiles(List<Tile> newTiles){
		tiles=newTiles;
	}
	public Map<Integer, Map<Integer, Tile>> getLayout(){
		return layout;
	}
	public void setLayout(Map<Integer, Map<Integer, Tile>> newLayout){
		layout=newLayout;
	}
	public List<Tile> getEntryPoints(){
		return entryPoints;
	}
	public void setEntryPoints(List<Tile> newEntryPoints){
		entryPoints=newEntryPoints;
	}
	public List<EntryPointListener> getEntryPointsListeners(){
		return entryPointsListeners;
	}
	public void setEntryPointsListeners(List<EntryPointListener> newEntryPointsListeners){
		entryPointsListeners=newEntryPointsListeners;
	}
	public Tile.IdMap getTileMap(){
		return tileMap;
	}
	public void setTileMap(Tile.IdMap newTileMap){
		tileMap=newTileMap;
	}
	public List<Terrain> getTerrains(){
		return terrains;
	}
	public void setTerrains(List<Terrain> newTerrains){
		terrains=newTerrains;
	}
	public Terrain.IdMap getTerrainMap(){
		return terrainMap;
	}
	public void setTerrainMap(Terrain.IdMap newTerrainMap){
		terrainMap=newTerrainMap;
	}
	public Map<Integer, Set<Integer>> getOpenSides(){
		return openSides;
	}
	public void setOpenSides(Map<Integer, Set<Integer>> newOpenSides){
		openSides=newOpenSides;
	}
	public Map<Integer, Map<Integer, List<Tile>>> getEntryToEntryPaths(){
		return entryToEntryPaths;
	}
	public void setEntryToEntryPaths(Map<Integer, Map<Integer, List<Tile>>> newEntryToEntryPaths){
		entryToEntryPaths=newEntryToEntryPaths;
	}
	public Map<Area, Tile> getSisterAreas(){
		return sisterAreas;
	}
	public void setSisterAreas(Map<Area, Tile> newSisterAreas){
		sisterAreas=newSisterAreas;
	}
	public ArrayList<Set<Area>> getAreaDistances(){
		return areaDistances;
	}
	public void setAreaDistances(ArrayList<Set<Area>> newAreaDistances){
		areaDistances=newAreaDistances;
	}
	public int getFurthestDistanceToArea(){
		return furthestDistanceToArea;
	}
	public void setFurthestDistanceToArea(int newFurthestDistanceToArea){
		furthestDistanceToArea=newFurthestDistanceToArea;
	}
	public Building.TypeMap getBuildings(){
		return buildings;
	}
	public void setBuildings(Building.TypeMap newBuildings){
		buildings=newBuildings;
	}
	public List<Entity> getEntities(){
		return entities;
	}
	public void setEntities(List<Entity> newEntities){
		entities=newEntities;
	}
	public Integer getWidth(){
		return width;
	}
	public void setWidth(Integer newWidth){
		width=newWidth;
	}
	public Integer getHeight(){
		return height;
	}
	public void setHeight(Integer newHeight){
		height=newHeight;
	}
	public Integer getCurrentTickPosition(){
		return currentTickPosition;
	}
	public void setCurrentTickPosition(Integer newCurrentTickPosition){
		currentTickPosition=newCurrentTickPosition;
	}
	public Area.Event.Tick.Listener[] getTickEvents(){
		return tickEvents;
	}
	public void setTickEvents(Area.Event.Tick.Listener[] newTickEvents){
		tickEvents=newTickEvents;
	}
	public Area.Generator getGenerator(){
		return generator;
	}
	public void setGenerator(Area.Generator newGenerator){
		generator=newGenerator;
	}
	public Area.Id getId(){
		return null;
	}
	public Area (int x,int y,Environment parent){
		super(x,y,parent);
	}
	public Area (){
		super();
	}
	public void display(){
		tiles.parallelStream().forEach( T->T.display());
	}
	public void undisplay(){
		tiles.parallelStream().forEach( T->T.undisplay());
	}
	public List<Tile> getTiles(Predicate<Tile> test){
		return tiles.parallelStream().filter(test).collect(Collectors.toList());
	}
	public Tile getRandomTile(Predicate<Tile> test){
		List<Tile> result = tiles.parallelStream().filter(test).collect(Collectors.toList());
		return result.get(Range.getRandom(0,result.size()));
	}
	public Tile getUnassignedEntryPoint(){
		return entryPoints.stream().filter( E->E.getPortal().getDestination()==null).findAny().orElse(null);
	}
	public Tile getTile(Integer x,Integer y){
		if(layout.containsKey(x)){
			return layout.get(x).get(y);
		}
		else{
			return null;
		}
	}
	public <TileType extends Tile> TileType getOffsideTile(Function<Environment.Position, TileType> factory){
		int x = Range.select(openSides.keySet());
		int y = Range.select(openSides.get(x));
		TileType newTile = factory.apply(new Environment.Position(x,y,parent));
		add(newTile);
		return newTile;
	}
	public Terrain.MonsterDen getMonsterDen(Terrain.Id findId){
		if(terrainMap.has(findId)==false){
			return null;
		}
		else{
			return (Terrain.MonsterDen)Range.select(terrainMap.getAll(findId));
		}
	}
	public Terrain.MonsterDen getMonsterDen(Predicate<Terrain> findCriteria){
		return (Terrain.MonsterDen)terrains.parallelStream().filter(findCriteria).findAny().orElse(null);
	}
	public int getDistanceToArea(Area area){
		if(this==area){
			return 0;
		}
		return IntStream.range(1,furthestDistanceToArea).parallel().filter( I->areaDistances.get(I).contains(area)).findFirst().orElse(-1);
	}
	public void findDistance(Area findArea){
		IntStream.range(0,furthestDistanceToArea).filter( I->areaDistances.get(I).parallelStream().anyMatch( area->area.entryPoints.stream().anyMatch( entryPoint->entryPoint.getPortal().getDestinationArea()==findArea))).findFirst().ifPresent( I->setDistanceToArea(I+1,findArea));
	}
	public void setDistanceToArea(int distance,Area area){
		if(distance>furthestDistanceToArea){
			furthestDistanceToArea=distance;
		}
		areaDistances.get(distance).add(area);
	}
	public boolean containsEntryPoint(Tile entryPoint){
		return entryPoints.contains(entryPoint);
	}
	public Tile getEntryPoint(Integer index){
		return entryPoints.get(index);
	}
	public Tile getTile(Tile.Id findId){
		if(tileMap.has(findId)==false){
			return null;
		}
		else{
			return Range.select(tileMap.getAll(findId));
		}
	}
	public Tile get(Tile.Id findId){
		if(tileMap.has(findId)==false){
			return null;
		}
		else{
			return Range.select(tileMap.getAll(findId));
		}
	}
	public Terrain get(Terrain.Id findId){
		if(terrainMap.has(findId)==false){
			return null;
		}
		else{
			return Range.select(terrainMap.getAll(findId));
		}
	}
	public Boolean load(){
		IntStream.range(0,32).forEach( A->areaDistances.add(new HashSet<Area>()));
		areaDistances.get(0).add(this);
		IntStream.range(0,256).parallel().forEach( C->tickEvents[C]=new Area.Event.Tick.Listener());
		tiles.stream().forEach( T->T.load());
		return true;
	}
	public Boolean tick(Double millisSinceLastFrame){
		tiles.stream().forEach( T->T.tick(millisSinceLastFrame));
		tickEvents[currentTickPosition].tick(millisSinceLastFrame);
		if(currentTickPosition>=255){
			currentTickPosition=0;
		}
		else{
			++currentTickPosition;
		}
		return true;
	}
	public Tile join(Tile yourEntryPoint){
		Tile myEntryPoint = entryPoints.stream().filter( E->E.getPortal().getDestination()==null).findAny().orElse(null);
		if(myEntryPoint!=null){
			getParent().getAreas().stream().forEach( A->A.findDistance(yourEntryPoint.getArea()));
			yourEntryPoint.getArea().getParent().getAreas().stream().forEach( A->A.findDistance(myEntryPoint.getArea()));
			return myEntryPoint;
		}
		else{
			return null;
		}
	}
	public void addEvent(Integer offset,Area.Event.Tick event){
		tickEvents[(currentTickPosition+offset)%256].add(event);
	}
	public Boolean add(Entity entity){
		if(getParent()!=null&&entity.getIsPlayerAffiliated()){
			getParent().addActiveArea(this);
		}
		return entities.add(entity);
	}
	public void replace(Tile toRemove,Tile toAdd){
		remove(toRemove);
		add(toAdd);
	}
	public Boolean add(Tile newTile){
		newTile.setArea(this);
		if(newTile.getX()+newTile.getWidth()>width){
			width=newTile.getX()+newTile.getWidth();
		}
		if(newTile.getY()+newTile.getHeight()>height){
			height=newTile.getY()+newTile.getHeight();
		}
		synchronized(layout){
			tiles.add(newTile);
			if(layout.containsKey(newTile.getX())==false){
				layout.put(newTile.getX(),new HashMap<Integer, Tile>());
			}
			layout.get(newTile.getX()).put(newTile.getY(),newTile);
			if(openSides.containsKey(newTile.getX())){
				openSides.get(newTile.getX()).remove(newTile.getY());
			}
			openSide(newTile.getX()+1,newTile.getY());
			openSide(newTile.getX()-1,newTile.getY());
			openSide(newTile.getX(),newTile.getY()+1);
			openSide(newTile.getX(),newTile.getY()-1);
		}
		if(parent!=null){
			parent.add(newTile);
		}
		tileMap.add(newTile);
		return tiles.add(newTile);
	}
	public Boolean add(Terrain newTile){
		terrainMap.add(newTile);
		return terrains.add(newTile);
	}
	public void addEntryPoint(Tile newTile){
		synchronized(entryPoints){
			if(entryPointsListeners.isEmpty()==false){
				boolean canContinue = true;
				while(canContinue&&entryPointsListeners.isEmpty()==false){
					canContinue=entryPointsListeners.remove(0).listen(newTile);
				}
			}
			entryPoints.add(newTile);
		}
	}
	public void openSide(Integer x,Integer y){
		if(!layout.containsKey(x)|| !layout.get(x).containsKey(y)){
			if(!openSides.containsKey(x)){
				openSides.put(x,new HashSet<Integer>());
			}
			openSides.get(x).add(y);
		}
	}
	public void swapFloor(Integer oldX,Integer oldY,Integer newX,Integer newY){
		if(layout.containsKey(newX)==false){
			layout.put(newX,new HashMap<Integer, Tile>());
		}
		layout.get(newX).put(newY,layout.get(oldX).remove(oldY));
	}
	public void swapTerrain(Terrain oldTile,Terrain newTile){
		if(oldTile!=null){
			terrainMap.remove(oldTile);
		}
		if(newTile!=null){
			terrainMap.add(newTile);
		}
	}
	public Boolean remove(Entity entity){
		return entities.remove(entity);
	}
	public Boolean remove(Tile oldTile){
		oldTile.getNeighbours().stream().forEach( N->N.resetNeighbour(oldTile));
		oldTile.setArea(null);
		tileMap.remove(oldTile);
		if(oldTile.getPortal()!=null){
			synchronized(entryPoints){
				entryPoints.remove(oldTile);
			}
		}
		tileMap.remove((Tile)oldTile);
		if(layout.containsKey(oldTile.getX())){
			layout.get(oldTile.getX()).remove(oldTile.getY());
		}
		return tiles.remove(oldTile);
	}
	public Boolean remove(Terrain oldTerrain){
		return terrains.remove(terrainMap.remove(oldTerrain));
	}
	public boolean has(Predicate<Tile> criteria){
		return tiles.parallelStream().anyMatch(criteria);
	}
	public Tile getUnexploredPoint(Entity explorer){
		return entryPoints.stream().filter( tile->!tile.getPortal().hasExplored(explorer)).filter( tile->!tile.hasOccupant(explorer)).findAny().orElse(null);
	}
	public List<Entity> collectEntities(Predicate<Entity> predicate){
		return entities.parallelStream().filter(predicate).collect(Collectors.toList());
	}
	public List<Entity> getEntitiesWithin(Environment.Position position,Float range){
		return collectEntities( entity->entity.getLocation().getDistanceTo(position)<=range);
	}
	public List<Entity> getEntitiesWithin(Environment.Position position,Float range,Predicate<Entity> criteria){
		return entities.parallelStream().filter(criteria).filter( entity->entity.getLocation().getDistanceTo(position)<=range).collect(Collectors.toList());
	}
	public Entity getClosestEntity(Environment.Position position,Predicate<Entity> criteria){
		return entities.stream().filter(criteria).sorted(new Entity.Comparators.Distance.Ascending(position)).findFirst().orElse(null);
	}
	public Tile getClosestEntryPoint(Environment.Position position){
		return entryPoints.stream().sorted(new Tile.Comparators.Distance.Ascending(position)).findFirst().orElse(null);
	}
	public Terrain getClosestTile(Environment.Position position,Terrain.Id terrainId){
		if(terrainMap.has(terrainId)==false){
			return null;
		}
		Tile result = terrainMap.getAll(terrainId).stream().map( T->T.getFloorTile()).sorted(new Tile.Comparators.Distance.Ascending(position)).findFirst().orElse(null);
		return result!=null?result.getTerrain():null;
	}
	public Tile getClosestTile(Environment.Position position,Tile.Id tileId){
		if(tileMap.has(tileId)==false){
			return null;
		}
		return tileMap.getAll(tileId).stream().sorted(new Tile.Comparators.Distance.Ascending(position)).findFirst().orElse(null);
	}
	public Tile getClosestTile(Environment.Position position,Predicate<Tile> criteria){
		return IntStream.range(0,furthestDistanceToArea).parallel().boxed().flatMap( I->getAllTilesAsStream(I)).filter(criteria).sorted(new Tile.Comparators.Distance.Ascending.Complex(position)).findFirst().orElse(null);
	}
	public void getAllTiles(int distance,ArrayList<Tile> collector){
		areaDistances.get(distance).stream().forEach( A->collector.addAll(A.tiles));
	}
	public List<Tile> getAllTiles(int distance){
		return areaDistances.get(distance).parallelStream().flatMap( A->A.tiles.parallelStream()).collect(Collectors.toList());
	}
	public Stream<Tile> getAllTilesAsStream(int distance){
		return areaDistances.get(distance).parallelStream().flatMap( A->A.tiles.parallelStream());
	}
	public void add(Building building){
		buildings.add(building);
	}
	public Boolean isWithin(Environment.Position otherPosition){
		return otherPosition.getX()>=0&&otherPosition.getX()<width&&otherPosition.getY()>=0&&otherPosition.getY()<height;
	}
	public Tile getEntryPointToward(Area area){
		if(sisterAreas.containsKey(area)){
			return sisterAreas.get(area);
		}
		else{
			Tile found = entryPoints.parallelStream().filter( E->E.getPortal().getDestinationArea()==area).findAny().orElseGet(()->entryPoints.parallelStream().filter( E->E.getPortal().getDestinationArea()!=null).filter( E->E.getPortal().getDestinationArea().canGetToAreaFrom(area,E.getPortal().getDestination(),Collections.synchronizedSet(new AreaSet(Area.this)))).findFirst().orElse(null));
			if(found!=null){
				sisterAreas.put(area,found);
			}
			return found;
		}
	}
	public Boolean canGetToAreaFrom(Area findArea,Tile previousEntryPoint,Set<Area> investigated){
		if(this==findArea){
			return true;
		}
		if(investigated.add(this)){
			return entryPoints.parallelStream().filter( entryPoint->entryPoint!=previousEntryPoint&&entryPoint.getPortal().getDestinationArea()!=null).anyMatch( entryPoint->entryPoint.getPortal().getDestinationArea().canGetToAreaFrom(findArea,entryPoint.getPortal().getDestination(),investigated));
		}
		else{
			return false;
		}
	}
	public List<Tile> getAbsolutePathBetweenEntryPoints(Integer startPoint,Integer endPoint){
		synchronized(entryToEntryPaths){
			if(entryToEntryPaths.containsKey(startPoint)){
				if(entryToEntryPaths.get(startPoint).containsKey(endPoint)){
					return entryToEntryPaths.get(startPoint).get(endPoint);
				}
			}
			else{
				entryToEntryPaths.put(startPoint,new HashMap<Integer, List<Tile>>());
			}
			if(!entryToEntryPaths.containsKey(endPoint)){
				entryToEntryPaths.put(endPoint,new HashMap<Integer, List<Tile>>());
			}
		}
		Tile endTile = entryPoints.get(endPoint);
		Tile tile = entryPoints.get(startPoint);
		List<Tile.Path> tried = new ArrayList<Tile.Path>();
		Tile.Path.Ways ways = new Tile.Path.Ways(endTile);
		Set<Tile> investigated = new HashSet<Tile>();
		investigated.add(null);
		Iterator<Tile.Path> paths = new Streamer.Iterator<Tile.Path>(new Tile.Path(null,tile,endTile), P->{						P.getTile().getNeighbours().stream().filter( N->investigated.add(N)).forEach( N->ways.extend(P,N));
						return ways.pollFirst();
 });
		Tile.Path path = paths.next();
		tried.add(path);
		while(path.getTile()!=endTile&&paths.hasNext()){
			path=paths.next();
			tried.add(path);
		}
		if(path.getTile()==endTile){
			List<Tile> pathAsList = path.collect();
			List<Tile> reverseList = path.collectReverse();
			synchronized(entryToEntryPaths){
				entryToEntryPaths.get(startPoint).put(endPoint,pathAsList);
				entryToEntryPaths.get(endPoint).put(startPoint,reverseList);
			}
			return pathAsList;
		}
		else{
			System.err.println("Could not make path!"+entryPoints.get(startPoint)+" to "+endTile);
			tried.stream().forEach(System.err::println);
			return null;
		}
	}
	public void clearAbsolutePathBetweenEntryPoints(Integer startPoint,Integer endPoint){
		synchronized(entryToEntryPaths){
			if(entryToEntryPaths.containsKey(startPoint)){
				if(entryToEntryPaths.get(startPoint).containsKey(endPoint)){
					entryToEntryPaths.get(startPoint).remove(endPoint);
				}
			}
			if(entryToEntryPaths.containsKey(endPoint)){
				if(entryToEntryPaths.get(startPoint).containsKey(startPoint)){
					entryToEntryPaths.get(endPoint).remove(startPoint);
				}
			}
		}
	}
	public Area (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
		super();
		this.tiles=tiles;
		this.layout=layout;
		this.entryPoints=entryPoints;
		this.entryPointsListeners=entryPointsListeners;
		this.tileMap=tileMap;
		this.terrains=terrains;
		this.terrainMap=terrainMap;
		this.openSides=openSides;
		this.entryToEntryPaths=entryToEntryPaths;
		this.sisterAreas=sisterAreas;
		this.areaDistances=areaDistances;
		this.furthestDistanceToArea=furthestDistanceToArea;
		this.buildings=buildings;
		this.entities=entities;
		this.width=width;
		this.height=height;
		this.currentTickPosition=currentTickPosition;
		this.tickEvents=tickEvents;
		this.generator=generator;
	}
	public Area (Integer x,Integer y,Environment parent,List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
		super(x,y,parent);
		this.tiles=tiles;
		this.layout=layout;
		this.entryPoints=entryPoints;
		this.entryPointsListeners=entryPointsListeners;
		this.tileMap=tileMap;
		this.terrains=terrains;
		this.terrainMap=terrainMap;
		this.openSides=openSides;
		this.entryToEntryPaths=entryToEntryPaths;
		this.sisterAreas=sisterAreas;
		this.areaDistances=areaDistances;
		this.furthestDistanceToArea=furthestDistanceToArea;
		this.buildings=buildings;
		this.entities=entities;
		this.width=width;
		this.height=height;
		this.currentTickPosition=currentTickPosition;
		this.tickEvents=tickEvents;
		this.generator=generator;
	}
	public Area (Integer x,Integer y,Environment parent){
		super(x,y,parent);
	}
	public static enum Predefined {
	}
	public static enum Id {
		 None
	}
	public static enum Imports {
	}
	public static interface EntryPointListener {
		public Boolean listen(Tile newEntryPoint);
	}
	public static class Event {
		public Event (){
			super();
		}
		public static interface Tick {
			public void tick(Double millisSinceLastFrame);
			public static class Listener extends ArrayList<Area.Event.Tick> {
				public void tick(Double millisSinceLastFrame){
					this.stream().forEach( T->T.tick(millisSinceLastFrame));
					clear();
				}
			}
		}
	}
	public static interface Generator {
		public Area generate();
		public void generate(Area.Generator.Instance instance);
		public static class Instance {
			protected int x;
			protected int y;
			protected Area area;
			public int getX(){
				return x;
			}
			public void setX(int newX){
				x=newX;
			}
			public int getY(){
				return y;
			}
			public void setY(int newY){
				y=newY;
			}
			public Area getArea(){
				return area;
			}
			public void setArea(Area newArea){
				area=newArea;
			}
			public Instance (int x,int y,Area area){
				this.x=x;
				this.y=y;
				this.area=area;
			}
			public Instance offset(int x,int y){
				this.x=x;
				this.y=y;
				return this;
			}
			public Instance clone(){
				return new Instance(x,y,area);
			}
			public Tile getAnyUnoccupiedTile(){
				return area.getRandomTile( F->!F.hasOccupant());
			}
			public Tile getTile(Function<Environment.Position, Tile> factory){
				Tile result = area.getTile(x,y);
				if(result==null){
					result=factory.apply(new Environment.Position(x,y,area.getParent()));
					area.add(result);
				}
				return result;
			}
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
			public static class Ascending implements Comparator<Area> {
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
				public int compare(Area area1,Area area2){
					return (int)((double)origin.getDistanceTo(area1)-(double)origin.getDistanceTo(area2));
				}
				public Ascending (){
					super();
				}
			}
			public static class Descending implements Comparator<Area> {
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
				public int compare(Area area1,Area area2){
					return (int)((double)origin.getDistanceTo(area2)-(double)origin.getDistanceTo(area1));
				}
				public Descending (){
					super();
				}
			}
		}
	}
	public static interface Factory {
		public Area create();
		public Area create(int x,int y,Environment parent);
	}
	public static class IdMap {
		protected Map<Area.Id, java.util.List<Area>> map = new HashMap<Area.Id, java.util.List<Area>>();
		public Map<Area.Id, java.util.List<Area>> getMap(){
			return map;
		}
		public void setMap(Map<Area.Id, java.util.List<Area>> newMap){
			map=newMap;
		}
		public boolean add(Area addObject){
			synchronized(this){
				if(map.containsKey((Area.Id)addObject.getId())==false){
					map.put((Area.Id)addObject.getId(),new ArrayList<Area>());
				}
				return map.get((Area.Id)addObject.getId()).add(addObject);
			}
		}
		public Area get(Area.Id id,Area.Factory factory){
			synchronized(this){
				List<Area> result = map.get(id);
				if(result==null){
					result=new ArrayList<Area>();
					map.put(id,result);
					Area newObject = factory.create();
					result.add(newObject);
					return newObject;
				}
				else{
					if(result.isEmpty()){
						Area newObject = factory.create();
						result.add(newObject);
						return newObject;
					}
					else{
						return result.get(0);
					}
				}
			}
		}
		public Area get(Area.Id findId){
			synchronized(this){
				List<Area> result = map.get(findId);
				if(result!=null&&result.isEmpty()==false){
					return result.get(0);
				}
				else{
					return null;
				}
			}
		}
		public List<Area> getAll(Area.Id findId){
			synchronized(this){
				return map.get(findId);
			}
		}
		public boolean has(Area.Id findId){
			synchronized(this){
				return map.containsKey(findId)&&map.get(findId).isEmpty()==false;
			}
		}
		public boolean remove(Area addObject){
			synchronized(this){
				if(map.containsKey((Area.Id)addObject.getId())){
					return map.get((Area.Id)addObject.getId()).remove(addObject);
				}
				else{
					return false;
				}
			}
		}
		public IdMap (Map<Area.Id, java.util.List<Area>> map){
			super();
			this.map=map;
		}
		public IdMap (){
			super();
		}
	}
}
