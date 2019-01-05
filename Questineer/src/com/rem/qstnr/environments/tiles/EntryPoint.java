package com.rem.qstnr.environments.tiles;
import java.util.function.Function;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.environments.tiles.EntryPoint;
public class EntryPoint {
	protected Tile tile = null;
	protected Tile destination = null;
	protected Function<Entity, Entity.Event> onAccept = null;
	public Tile getTile(){
		return tile;
	}
	public void setTile(Tile newTile){
		tile=newTile;
	}
	public Tile getDestination(){
		return destination;
	}
	public void setDestination(Tile newDestination){
		destination=newDestination;
	}
	public Function<Entity, Entity.Event> getOnAccept(){
		return onAccept;
	}
	public void setOnAccept(Function<Entity, Entity.Event> newOnAccept){
		onAccept=newOnAccept;
	}
	public EntryPoint (Tile tile,Area.Generator generator){
		this.tile=tile;
		this.onAccept=( newOccupant->{						Area newArea = generator.generate();
						newArea.load();
						newArea.getParent().add(newArea);
						destination=newArea.getUnassignedEntryPoint();
						addSisterTile(tile,destination);
						addSisterTile(destination,tile);
						return tile.getPortal().getOnAccept().apply(newOccupant);
 });
	}
	public Area getArea(){
		return tile.getArea();
	}
	public Area getDestinationArea(){
		if(destination==null){
			return null;
		}
		else{
			return destination.getArea();
		}
	}
	public boolean hasExplored(Entity explorer){
		return destination==null?false:explorer.hasExplored(destination.getArea());
	}
	public static void addSisterTile(Tile tile,Tile destination){
		Entity.Event event = new Entity.Event.MovedToNewArea(tile.getArea(),destination.getArea());
		tile.setHasOccupant(()->tile.getOccupant()!=null||destination.getOccupant()!=null);
		tile.setHasOccupantWhoIs( candidate->tile.getOccupant()==candidate||destination.getOccupant()==candidate);
		tile.getPortal().setOnAccept( E->{						destination.take(E);
						E.getLocation().setArea(destination.getArea());
						return event;
 });
		tile.getPortal().destination=destination;
	}
	public EntryPoint (Tile tile,Tile destination,Function<Entity, Entity.Event> onAccept){
		super();
		this.tile=tile;
		this.destination=destination;
		this.onAccept=onAccept;
	}
	public EntryPoint (){
		super();
	}
}
