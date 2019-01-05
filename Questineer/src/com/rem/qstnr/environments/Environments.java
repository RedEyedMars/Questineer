package com.rem.qstnr.environments;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.environments.Areas;
import com.rem.qstnr.environments.Environments;
import java.util.function.Function;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Tiles;
import com.rem.qstnr.environments.Environment;
import java.util.List;
import java.util.Map;
public class Environments {
	public static Environment create(String environmentName){
		if(environmentName.equals("Forest")){
			return new Environments.Forest();
		}
		if(environmentName.equals("Town")){
			return new Environments.Town();
		}
		return null;
	}
	public Environments (){
		super();
	}
	public static class Town extends Environment {
		public Town (){
			if(name==null){
				name="Town";
			}
			Areas.Town.starttown=new Areas.Town.StartTown.Generator(this);
			Areas.Town.starttown.setup();
			areaGenerator=Areas.Town.starttown;
			floorTiles.add(Tiles.Town.StoneFloor::create);
			floorTiles.add(Tiles.Town.Path::create);
			floorTiles.add(Tiles.Town.Grass::create);
		}
		public Boolean load(){
			return super.load();
		}
		public Town (String name,Area startArea,Area.Generator areaGenerator,List<Function<Environment.Position, Tile>> floorTiles,List<Area> areas,Map<Area, Integer> activeAreas,Tile.IdMap tiles,Area.IdMap areaMap){
			super(name,startArea,areaGenerator,floorTiles,areas,activeAreas,tiles,areaMap);
		}
		public static class Factory implements Environment.Factory {
			public Environment create(){
				return new Environments.Town();
			}
			public Factory (){
				super();
			}
		}
	}
	public static class Forest extends Environment {
		public Forest (){
			if(name==null){
				name="Forest";
			}
			Areas.Forest.stream=new Areas.Forest.Stream.Generator(this);
			Areas.Forest.stream.setup();
			Areas.Forest.beginnerdens=new Areas.Forest.BeginnerDens.Generator(this);
			Areas.Forest.beginnerdens.setup();
			Areas.Forest.beginnergrasses=new Areas.Forest.BeginnerGrasses.Generator(this);
			Areas.Forest.beginnergrasses.setup();
			Areas.Forest.beginnermonsters=new Areas.Forest.BeginnerMonsters.Generator(this);
			Areas.Forest.beginnermonsters.setup();
			Areas.Forest.entrypoints=new Areas.Forest.EntryPoints.Generator(this);
			Areas.Forest.entrypoints.setup();
			Areas.Forest.roombeginner=new Areas.Forest.RoomBeginner.Generator(this);
			Areas.Forest.roombeginner.setup();
			Areas.Forest.entrance=new Areas.Forest.Entrance.Generator(this);
			Areas.Forest.entrance.setup();
			areaGenerator=Areas.Forest.entrance;
			floorTiles.add(Tiles.Forest.Water::create);
			floorTiles.add(Tiles.Forest.Path::create);
			floorTiles.add(Tiles.Forest.Grass::create);
		}
		public Boolean load(){
			return super.load();
		}
		public Forest (String name,Area startArea,Area.Generator areaGenerator,List<Function<Environment.Position, Tile>> floorTiles,List<Area> areas,Map<Area, Integer> activeAreas,Tile.IdMap tiles,Area.IdMap areaMap){
			super(name,startArea,areaGenerator,floorTiles,areas,activeAreas,tiles,areaMap);
		}
		public static class Factory implements Environment.Factory {
			public Environment create(){
				return new Environments.Forest();
			}
			public Factory (){
				super();
			}
		}
	}
}
