package com.rem.qstnr.environments;
import com.rem.qstnr.environments.buildings.Building;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.ArrayList;
import com.rem.qstnr.environments.tiles.Terrains;
import java.util.function.Consumer;
import java.util.List;
import java.util.stream.Stream;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.environments.Areas;
import com.rem.qstnr.environments.Environments;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Tiles;
import com.rem.qstnr.environments.tiles.Terrain;
import com.rem.qstnr.environments.Environment;
import java.util.Map;
import java.util.stream.IntStream;
public class Areas {
	public Areas (){
		super();
	}
	public static class Town {
		public static StartTown.Generator starttown = null;
		public Town (){
			super();
		}
		public static class StartTown extends Area {
			public StartTown (){
				super();
			}
			public StartTown (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public StartTown (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Town parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Town getParent(){
					return parent;
				}
				public void setParent(Environments.Town newParent){
					parent=newParent;
				}
				public Generator (Environments.Town initialParent){
					parent=initialParent;
				}
				public Areas.Town.StartTown generate(){
					Areas.Town.StartTown newArea = new Areas.Town.StartTown(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Areas.Town.StartTown.Generator.Fillers.fill5x5WithGrass(5,5,Generator);
;
;
 });
					generationPoints.add( Generator->{						Areas.Town.StartTown.Generator.Fillers.fill3x3WithPath(3,3,Generator);
;
;
 });
					generationPoints.add( Generator->{						Generator.getArea().getOffsideTile(Tiles.Town.Path::create).setPortal(Areas.Forest.entrance);
;
 });
				}
				public static void createGrass(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Town.Grass::create);
				}
				public static void createPath(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Town.Path::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Town parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public static void fill5x5WithGrass(int fillWidth,int fillHeight,Area.Generator.Instance instance){
						Area.Generator.Instance delver = instance.clone();
						int startX = Range.getRandom(delver.getX(),instance.getArea().getWidth()-6-delver.getX());
						int startY = Range.getRandom(delver.getY(),instance.getArea().getWidth()-6-delver.getY());
						IntStream.range(startX,startX+fillWidth).forEach( X->IntStream.range(startY,startY+fillHeight).forEach( Y->Areas.Town.StartTown.Generator.createGrass(delver.offset(X,Y))));
					}
					public static void fill3x3WithPath(int fillWidth,int fillHeight,Area.Generator.Instance instance){
						Area.Generator.Instance delver = instance.clone();
						int startX = Range.getRandom(delver.getX(),instance.getArea().getWidth()-4-delver.getX());
						int startY = Range.getRandom(delver.getY(),instance.getArea().getWidth()-4-delver.getY());
						IntStream.range(startX,startX+fillWidth).forEach( X->IntStream.range(startY,startY+fillHeight).forEach( Y->Areas.Town.StartTown.Generator.createPath(delver.offset(X,Y))));
					}
					public Fillers (){
						super();
					}
				}
			}
		}
	}
	public static class Forest {
		public static Entrance.Generator entrance = null;
		public static RoomBeginner.Generator roombeginner = null;
		public static EntryPoints.Generator entrypoints = null;
		public static BeginnerMonsters.Generator beginnermonsters = null;
		public static BeginnerGrasses.Generator beginnergrasses = null;
		public static BeginnerDens.Generator beginnerdens = null;
		public static Stream.Generator stream = null;
		public Forest (){
			super();
		}
		public static class Entrance extends Area {
			public Entrance (){
				super();
			}
			public Entrance (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Entrance (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.Entrance generate(){
					Areas.Forest.Entrance newArea = new Areas.Forest.Entrance(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Areas.Forest.Entrance.Generator.Fillers.fill4x4WithGrass(4,4,Generator);
;
;
 });
					generationPoints.add( Generator->{						Generator.getArea().getOffsideTile(Tiles.Forest.Path::create).setPortal(Areas.Forest.roombeginner);
;
 });
				}
				public static void createGrass(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Forest.Grass::create);
				}
				public static void createPath(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Forest.Path::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public static void fill4x4WithGrass(int fillWidth,int fillHeight,Area.Generator.Instance instance){
						Area.Generator.Instance delver = instance.clone();
						int startX = Range.getRandom(delver.getX(),instance.getArea().getWidth()-5-delver.getX());
						int startY = Range.getRandom(delver.getY(),instance.getArea().getWidth()-5-delver.getY());
						IntStream.range(startX,startX+fillWidth).forEach( X->IntStream.range(startY,startY+fillHeight).forEach( Y->Areas.Forest.Entrance.Generator.createGrass(delver.offset(X,Y))));
					}
					public Fillers (){
						super();
					}
				}
			}
		}
		public static class RoomBeginner extends Area {
			public RoomBeginner (){
				super();
			}
			public RoomBeginner (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public RoomBeginner (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.RoomBeginner generate(){
					Areas.Forest.RoomBeginner newArea = new Areas.Forest.RoomBeginner(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Areas.Forest.RoomBeginner.Generator.Fillers.fill8x8WithGrass(Range.getRandom(2,8),Range.getRandom(2,8),Generator);
;
;
 });
					generationPoints.add( Generator->{						Areas.Forest.stream.generate(Generator);
;
 });
					generationPoints.add( Generator->{						Areas.Forest.beginnermonsters.generate(Generator);
;
 });
					generationPoints.add( Generator->{						Areas.Forest.entrypoints.generate(Generator);
;
 });
				}
				public static void createGrass(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Forest.Grass::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public static void fill8x8WithGrass(int fillWidth,int fillHeight,Area.Generator.Instance instance){
						Area.Generator.Instance delver = instance.clone();
						int startX = Range.getRandom(delver.getX(),instance.getArea().getWidth()-9-delver.getX());
						int startY = Range.getRandom(delver.getY(),instance.getArea().getWidth()-9-delver.getY());
						IntStream.range(startX,startX+fillWidth).forEach( X->IntStream.range(startY,startY+fillHeight).forEach( Y->Areas.Forest.RoomBeginner.Generator.createGrass(delver.offset(X,Y))));
					}
					public Fillers (){
						super();
					}
				}
			}
		}
		public static class EntryPoints extends Area {
			public EntryPoints (){
				super();
			}
			public EntryPoints (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public EntryPoints (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.EntryPoints generate(){
					Areas.Forest.EntryPoints newArea = new Areas.Forest.EntryPoints(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Generator.getArea().getOffsideTile(Tiles.Forest.Path::create).setPortal(Areas.Forest.roombeginner);
;
 });
					generationPoints.add( Generator->{						Generator.getArea().getOffsideTile(Tiles.Forest.Path::create).setPortal(Areas.Forest.roombeginner);
;
 });
					generationPoints.add( Generator->{						Generator.getArea().getOffsideTile(Tiles.Forest.Path::create).setPortal(Areas.Forest.roombeginner);
;
 });
				}
				public static void createPath(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Forest.Path::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public Fillers (){
						super();
					}
				}
			}
		}
		public static class BeginnerMonsters extends Area {
			public BeginnerMonsters (){
				super();
			}
			public BeginnerMonsters (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public BeginnerMonsters (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.BeginnerMonsters generate(){
					Areas.Forest.BeginnerMonsters newArea = new Areas.Forest.BeginnerMonsters(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Areas.Forest.beginnergrasses.generate(Generator);
;
 });
					generationPoints.add( Generator->{						Areas.Forest.beginnerdens.generate(Generator);
;
 });
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public Fillers (){
						super();
					}
				}
			}
		}
		public static class BeginnerGrasses extends Area {
			public BeginnerGrasses (){
				super();
			}
			public BeginnerGrasses (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public BeginnerGrasses (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.BeginnerGrasses generate(){
					Areas.Forest.BeginnerGrasses newArea = new Areas.Forest.BeginnerGrasses(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Areas.Forest.BeginnerGrasses.Generator.Fillers.fill2x2WithLongGrass(Range.getRandom(0,2),Range.getRandom(0,2),Generator);
;
;
 });
				}
				public static void createLongGrass(Area.Generator.Instance Generator){
					Generator.getTile(Terrains.MonsterDens.Forest.LongGrass::createFloor).setTerrain(Terrains.MonsterDens.Forest.LongGrass::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public static void fill2x2WithLongGrass(int fillWidth,int fillHeight,Area.Generator.Instance instance){
						Area.Generator.Instance delver = instance.clone();
						int startX = Range.getRandom(delver.getX(),instance.getArea().getWidth()-3-delver.getX());
						int startY = Range.getRandom(delver.getY(),instance.getArea().getWidth()-3-delver.getY());
						IntStream.range(startX,startX+fillWidth).forEach( X->IntStream.range(startY,startY+fillHeight).forEach( Y->Areas.Forest.BeginnerGrasses.Generator.createLongGrass(delver.offset(X,Y))));
					}
					public Fillers (){
						super();
					}
				}
			}
		}
		public static class BeginnerDens extends Area {
			public BeginnerDens (){
				super();
			}
			public BeginnerDens (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public BeginnerDens (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.BeginnerDens generate(){
					Areas.Forest.BeginnerDens newArea = new Areas.Forest.BeginnerDens(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						switch(Range.getRandom(0,2)){
							case 0 :{
								Generator.getAnyUnoccupiedTile().setTerrain(Terrains.MonsterDens.Forest.LoneRock::create);
 break;
							}
							case 1 :{
								Generator.getAnyUnoccupiedTile().setTerrain(Terrains.MonsterDens.Forest.BearDen::create);
 break;
							}
						}
 });
				}
				public static void createLoneRock(Area.Generator.Instance Generator){
					Generator.getTile(Terrains.MonsterDens.Forest.LoneRock::createFloor).setTerrain(Terrains.MonsterDens.Forest.LoneRock::create);
				}
				public static void createBearDen(Area.Generator.Instance Generator){
					Generator.getTile(Terrains.MonsterDens.Forest.BearDen::createFloor).setTerrain(Terrains.MonsterDens.Forest.BearDen::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public Fillers (){
						super();
					}
				}
			}
		}
		public static class Stream extends Area {
			public Stream (){
				super();
			}
			public Stream (Integer x,Integer y,Environment parent){
				super(x,y,parent);
			}
			public Stream (List<Tile> tiles,Map<Integer, Map<Integer, Tile>> layout,List<Tile> entryPoints,List<EntryPointListener> entryPointsListeners,Tile.IdMap tileMap,List<Terrain> terrains,Terrain.IdMap terrainMap,Map<Integer, Set<Integer>> openSides,Map<Integer, Map<Integer, List<Tile>>> entryToEntryPaths,Map<Area, Tile> sisterAreas,ArrayList<Set<Area>> areaDistances,int furthestDistanceToArea,Building.TypeMap buildings,List<Entity> entities,Integer width,Integer height,Integer currentTickPosition,Area.Event.Tick.Listener[] tickEvents,Area.Generator generator){
				super(tiles,layout,entryPoints,entryPointsListeners,tileMap,terrains,terrainMap,openSides,entryToEntryPaths,sisterAreas,areaDistances,furthestDistanceToArea,buildings,entities,width,height,currentTickPosition,tickEvents,generator);
			}
			public static class Generator implements Area.Generator {
				protected List<Consumer<Area.Generator.Instance>> generationPoints = new ArrayList<Consumer<Area.Generator.Instance>>();
				protected Environments.Forest parent = null;
				public List<Consumer<Area.Generator.Instance>> getGenerationPoints(){
					return generationPoints;
				}
				public void setGenerationPoints(List<Consumer<Area.Generator.Instance>> newGenerationPoints){
					generationPoints=newGenerationPoints;
				}
				public Environments.Forest getParent(){
					return parent;
				}
				public void setParent(Environments.Forest newParent){
					parent=newParent;
				}
				public Generator (Environments.Forest initialParent){
					parent=initialParent;
				}
				public Areas.Forest.Stream generate(){
					Areas.Forest.Stream newArea = new Areas.Forest.Stream(0,0,parent);
					this.generate(newArea);
					return newArea;
				}
				public void generate(Area newArea){
					newArea.setGenerator(this);
					this.generate(new Area.Generator.Instance(0,0,newArea));
				}
				public void generate(Area.Generator.Instance instance){
					generationPoints.forEach( P->P.accept(instance));
				}
				public void setup(){
					generationPoints.add( Generator->{						Areas.Forest.Stream.Generator.Fillers.fill1x8WithWater(1,Range.getRandom(0,8),Generator);
;
;
 });
				}
				public static void createWater(Area.Generator.Instance Generator){
					Generator.getTile(Tiles.Forest.Water::create);
				}
				public Generator (List<Consumer<Area.Generator.Instance>> generationPoints,Environments.Forest parent){
					super();
					this.generationPoints=generationPoints;
					this.parent=parent;
				}
				public Generator (){
					super();
				}
				public static class Fillers {
					public static void fill1x8WithWater(int fillWidth,int fillHeight,Area.Generator.Instance instance){
						Area.Generator.Instance delver = instance.clone();
						int startX = Range.getRandom(delver.getX(),instance.getArea().getWidth()-2-delver.getX());
						int startY = Range.getRandom(delver.getY(),instance.getArea().getWidth()-9-delver.getY());
						IntStream.range(startX,startX+fillWidth).forEach( X->IntStream.range(startY,startY+fillHeight).forEach( Y->Areas.Forest.Stream.Generator.createWater(delver.offset(X,Y))));
					}
					public Fillers (){
						super();
					}
				}
			}
		}
	}
}
