package com.rem.gen;
import java.util.HashMap;
import com.rem.gen.RegionEdge;
import java.util.ArrayList;
import java.util.Iterator;
import com.rem.gen.RegionZoneIterator;
import java.util.List;
import java.util.Map;
import com.rem.gen.RegionPoint;
public class RegionZone implements Iterable<RegionPoint> {
	protected Map<Integer, Map<Integer, RegionPoint>> map = new HashMap<Integer, Map<Integer, RegionPoint>>();
	protected Map<Integer, List<RegionEdge>> ups = new HashMap<Integer, List<RegionEdge>>();
	protected Map<Integer, List<RegionEdge>> downs = new HashMap<Integer, List<RegionEdge>>();
	protected Map<Integer, List<RegionEdge>> rights = new HashMap<Integer, List<RegionEdge>>();
	protected Map<Integer, List<RegionEdge>> lefts = new HashMap<Integer, List<RegionEdge>>();
	protected Integer lowerBoundX = Integer.MAX_VALUE;
	protected Integer lowerBoundY = Integer.MAX_VALUE;
	protected Integer upperBoundX = 0;
	protected Integer upperBoundY = 0;
	protected RegionPoint previousEdgePoint = null;
	public Map<Integer, Map<Integer, RegionPoint>> getMap(){
		return map;
	}
	public Map<Integer, List<RegionEdge>> getUps(){
		return ups;
	}
	public Map<Integer, List<RegionEdge>> getDowns(){
		return downs;
	}
	public Map<Integer, List<RegionEdge>> getRights(){
		return rights;
	}
	public Map<Integer, List<RegionEdge>> getLefts(){
		return lefts;
	}
	public Integer getLowerBoundX(){
		return lowerBoundX;
	}
	public Integer getLowerBoundY(){
		return lowerBoundY;
	}
	public Integer getUpperBoundX(){
		return upperBoundX;
	}
	public Integer getUpperBoundY(){
		return upperBoundY;
	}
	public RegionPoint getPreviousEdgePoint(){
		return previousEdgePoint;
	}
	public void add(RegionPoint newPoint){
		if(newPoint.getX()<lowerBoundX){
			lowerBoundX=newPoint.getX();
		}
		if(newPoint.getY()<lowerBoundY){
			lowerBoundY=newPoint.getY();
		}
		if(newPoint.getX()>upperBoundX){
			upperBoundX=newPoint.getX();
		}
		if(newPoint.getY()>upperBoundY){
			upperBoundY=newPoint.getY();
		}
		if(map.containsKey(newPoint.getX())==false){
			map.put(newPoint.getX(),new HashMap<Integer, RegionPoint>());
		}
		map.get(newPoint.getX()).put(newPoint.getY(),newPoint);
	}
	public void addEdgePoint(RegionPoint edge){
		if(previousEdgePoint!=null){
			if(edge.getX()>previousEdgePoint.getX()){
				if(rights.containsKey(previousEdgePoint.getY())==false){
					rights.put(previousEdgePoint.getY(),new ArrayList<RegionEdge>());
				}
				rights.get(previousEdgePoint.getY()).add(new RegionEdge(previousEdgePoint.getX(),edge.getX()));
			}
			else if(edge.getX()<previousEdgePoint.getX()){
				if(lefts.containsKey(edge.getY())==false){
					lefts.put(edge.getY(),new ArrayList<RegionEdge>());
				}
				lefts.get(edge.getY()).add(new RegionEdge(edge.getX(),previousEdgePoint.getX()));
			}
			else if(edge.getY()>previousEdgePoint.getY()){
				if(ups.containsKey(previousEdgePoint.getX())==false){
					ups.put(previousEdgePoint.getX(),new ArrayList<RegionEdge>());
				}
				ups.get(previousEdgePoint.getX()).add(new RegionEdge(previousEdgePoint.getY(),edge.getY()));
			}
			else if(edge.getY()<previousEdgePoint.getY()){
				if(downs.containsKey(edge.getX())==false){
					downs.put(edge.getX(),new ArrayList<RegionEdge>());
				}
				downs.get(edge.getX()).add(new RegionEdge(edge.getY(),previousEdgePoint.getY()));
			}
		}
		previousEdgePoint=edge;
	}
	public Iterator<RegionPoint> iterator(){
		return new RegionZoneIterator(this);
	}
}
