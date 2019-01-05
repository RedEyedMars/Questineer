package com.rem.gen;
import com.rem.gen.RegionZone;
import java.util.Iterator;
import com.rem.gen.RegionZoneIterator;
import java.util.Map;
import com.rem.gen.RegionPoint;
public class RegionZoneIterator implements Iterator<RegionPoint> {
	protected RegionZone toIterate = null;
	protected Integer x = 0;
	protected Integer y = 0;
	protected Map<Integer, Map<Integer, RegionPoint>> map = null;
	public RegionZone getToIterate(){
		return toIterate;
	}
	public Integer getX(){
		return x;
	}
	public Integer getY(){
		return y;
	}
	public Map<Integer, Map<Integer, RegionPoint>> getMap(){
		return map;
	}
	public RegionZoneIterator (RegionZone iIterable){
		toIterate=iIterable;
		x=toIterate.getLowerBoundX();
		y=toIterate.getLowerBoundY();
		map=toIterate.getMap();
	}
	public boolean hasNext(){
		return x<=toIterate.getUpperBoundX()&&y<=toIterate.getUpperBoundY();
	}
	public void advanceIndex(){
		if(x==toIterate.getUpperBoundX()){
			x=toIterate.getLowerBoundX();
			++y;
		}
		else{
			++x;
		}
	}
	public RegionPoint next(){
		if(map.containsKey(x)){
			if(map.get(x).containsKey(y)){
				RegionPoint point = map.get(x).get(y);
				advanceIndex();
				return point;
			}
			else{
				advanceIndex();
				return null;
			}
		}
		else{
			advanceIndex();
			return null;
		}
	}
	public void remove(){
	}
}
