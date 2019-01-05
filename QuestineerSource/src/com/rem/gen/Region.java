package com.rem.gen;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import com.rem.gen.RegionZone;
import com.rem.gen.Region;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import com.rem.gen.RegionPoint;
public class Region {
	public static int PIXEL_ZERO = -16777216;
	public static int PIXEL_GREEN = -11731200;
	public static int PIXEL_RED = -65536;
	public static int PIXEL_CYAN = -16711681;
	public static int PIXEL_PURPLE = -65316;
	public static int PIXEL_YELLOW = -10240;
	protected Integer x = 0;
	protected Integer y = 0;
	protected Integer pixel = 0;
	protected Map<Integer, Set<RegionPoint>> pixelMap = new HashMap<Integer, Set<RegionPoint>>();
	protected Map<Integer, Set<RegionPoint>> horizontals = new HashMap<Integer, Set<RegionPoint>>();
	public Integer getX(){
		return x;
	}
	public Integer getY(){
		return y;
	}
	public Integer getPixel(){
		return pixel;
	}
	public Map<Integer, Set<RegionPoint>> getPixelMap(){
		return pixelMap;
	}
	public Map<Integer, Set<RegionPoint>> getHorizontals(){
		return horizontals;
	}
	public Region (int ix,int iy,int ipixel){
		x=ix;
		y=iy;
		pixel=ipixel;
		pixelMap.put(pixel,new HashSet<RegionPoint>());
		pixelMap.get(pixel).add(new RegionPoint(x,y,pixel));
		horizontals.put(y,new HashSet<RegionPoint>());
		horizontals.get(y).add(new RegionPoint(x,y,pixel));
	}
	public void add(Region otherRegion){
		for(Integer p:otherRegion.pixelMap.keySet()){
			if(pixelMap.containsKey(p)==false){
				pixelMap.put(p,new HashSet<RegionPoint>());
			}
			pixelMap.get(p).addAll(otherRegion.pixelMap.get(p));
		}
		for(Integer y:otherRegion.horizontals.keySet()){
			if(horizontals.containsKey(y)==false){
				horizontals.put(y,new HashSet<RegionPoint>());
			}
			horizontals.get(y).addAll(otherRegion.horizontals.get(y));
		}
	}
	public List<RegionZone> getPoints(List<List<RegionPoint>> zones){
		List<RegionZone> points = new ArrayList<RegionZone>();
		for(List<RegionPoint> zone:zones){
			RegionZone zonePoints = new RegionZone();
			points.add(zonePoints);
			Integer i = 1;
			while(i<zone.size()-1){
				if(zone.get(i).getPixel()==PIXEL_CYAN&&zone.get(i+1).getPixel()==PIXEL_RED){
					int baseX = zone.get(i).getX();
					int endX = zone.get(i+1).getX();
					int y = zone.get(i).getY();
					while(y>=zone.get(i-1).getY()){
						for(RegionPoint point:horizontals.get(y)){
							if(point.getX()>=baseX&&point.getX()<=endX){
								zonePoints.add(point);
							}
						}
						--y;
					}
				}
				++i;
			}
			for(RegionPoint point:zone){
				zonePoints.addEdgePoint(point);
			}
		}
		return points;
	}
	public List<List<RegionPoint>> getZones(){
		List<List<RegionPoint>> results = new ArrayList<List<RegionPoint>>();
		if(pixelMap.containsKey(PIXEL_YELLOW)){
			for(RegionPoint yellowPoint:pixelMap.get(PIXEL_YELLOW)){
				List<RegionPoint> zone = new ArrayList<RegionPoint>();
				zone.add(yellowPoint);
				makeZone(results,zone,getCounterPoints(yellowPoint),yellowPoint);
			}
		}
		return results;
	}
	public void makeZone(List<List<RegionPoint>> zones,List<RegionPoint> zone,List<RegionPoint> counters,RegionPoint startPoint){
		for(RegionPoint point:counters){
			if(point.getPixel()==PIXEL_YELLOW){
				if(point==startPoint){
					zones.add(zone);
				}
			}
			else{
				List<RegionPoint> newZone = new ArrayList<RegionPoint>();
				newZone.addAll(zone);
				newZone.add(point);
				makeZone(zones,newZone,getCounterPoints(point),startPoint);
			}
		}
	}
	public List<RegionPoint> getCounterPoints(RegionPoint point){
		List<RegionPoint> result = new ArrayList<RegionPoint>();
		if(point.getPixel()==PIXEL_YELLOW||point.getPixel()==PIXEL_RED||point.getPixel()==PIXEL_GREEN){
			if(pixelMap.containsKey(PIXEL_CYAN)){
				for(RegionPoint otherPoint:pixelMap.get(PIXEL_CYAN)){
					if(point.getX()==otherPoint.getX()){
						result.add(otherPoint);
					}
				}
			}
		}
		else if(point.getPixel()==PIXEL_CYAN){
			if(pixelMap.containsKey(PIXEL_YELLOW)){
				for(RegionPoint otherPoint:pixelMap.get(PIXEL_YELLOW)){
					if(point.getY()==otherPoint.getY()){
						result.add(otherPoint);
					}
				}
			}
			if(pixelMap.containsKey(PIXEL_RED)){
				for(RegionPoint otherPoint:pixelMap.get(PIXEL_RED)){
					if(point.getY()==otherPoint.getY()){
						result.add(otherPoint);
					}
				}
			}
		}
		return result;
	}
	public Boolean isBlack(){
		return pixel==PIXEL_ZERO;
	}
	public Boolean isWhite(){
		return pixel==-1;
	}
	public Boolean isCompatible(Region other){
		if(pixel==PIXEL_ZERO){
			if(other.pixel==PIXEL_ZERO){
				return true;
			}
			else{
				return false;
			}
		}
		else if(pixel==-1){
			if(other.pixel==-1){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			if(other.pixel==PIXEL_ZERO){
				return false;
			}
			else if(other.pixel==-1){
				return false;
			}
			else{
				return true;
			}
		}
	}
}
