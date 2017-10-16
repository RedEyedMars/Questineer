package clgen;
import clgen.Region;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import clgen.RegionPoint;
import java.util.List;
import java.util.ArrayList;
import clgen.RegionZone;
import java.util.Iterator;
public class  Region   {
	//Externals


	//Internals
protected static final int PIXEL_ZERO = -16777216;
protected static final int PIXEL_GREEN = -11731200;
protected static final int PIXEL_RED = -65536;
protected static final int PIXEL_CYAN = -16711681;
protected static final int PIXEL_PURPLE = -65316;
protected static final int PIXEL_YELLOW = -10240;
protected Integer x = 0;
protected Integer y = 0;
protected Integer pixel = 0;
protected final Map<Integer,Set<RegionPoint>> pixelMap = new HashMap<Integer,Set<RegionPoint>>();
protected final Map<Integer,Set<RegionPoint>> horizontals = new HashMap<Integer,Set<RegionPoint>>();

	public int getPIXELZERO() {
		return PIXEL_ZERO;
	}
	public int getPIXELGREEN() {
		return PIXEL_GREEN;
	}
	public int getPIXELRED() {
		return PIXEL_RED;
	}
	public int getPIXELCYAN() {
		return PIXEL_CYAN;
	}
	public int getPIXELPURPLE() {
		return PIXEL_PURPLE;
	}
	public int getPIXELYELLOW() {
		return PIXEL_YELLOW;
	}
	public Integer getX() {
		return x;
	}
	public Integer getY() {
		return y;
	}
	public Integer getPixel() {
		return pixel;
	}
	public Map<Integer,Set<RegionPoint>> getPixelMap() {
		return pixelMap;
	}
	public Map<Integer,Set<RegionPoint>> getHorizontals() {
		return horizontals;
	}
public Region (final int ix,final int iy,final int ipixel) {
	x = ix;
	y = iy;
	pixel = ipixel;
	pixelMap.put(pixel,new HashSet<RegionPoint>());
	pixelMap.get(pixel).add(new RegionPoint(x,y,pixel));
	horizontals.put(y,new HashSet<RegionPoint>());
	horizontals.get(y).add(new RegionPoint(x,y,pixel));
}
public void add(final Region otherRegion) {
	for (final Integer p :  otherRegion.pixelMap.keySet()) {
		if (pixelMap.containsKey(p) == false) {
			pixelMap.put(p,new HashSet<RegionPoint>());
		}
		pixelMap.get(p).addAll(otherRegion.pixelMap.get(p));
	}
	for (final Integer y :  otherRegion.horizontals.keySet()) {
		if (horizontals.containsKey(y) == false) {
			horizontals.put(y,new HashSet<RegionPoint>());
		}
		horizontals.get(y).addAll(otherRegion.horizontals.get(y));
	}
}
public List<RegionZone> getPoints(final List<List<RegionPoint>> zones) {
	final List<RegionZone> points = new ArrayList<RegionZone>();
	for (final List<RegionPoint> zone :  zones) {
		final RegionZone zonePoints = new RegionZone();
		points.add(zonePoints);
		Integer i = 1;
		while (i < zone.size() - 1 ) {
			if (zone.get(i).getPixel() == PIXEL_CYAN && zone.get(i+1).getPixel() == PIXEL_RED) {
				final int baseX = zone.get(i).getX();
				final int endX = zone.get(i+1).getX();
				int y = zone.get(i).getY();
				while (y >= zone.get(i - 1).getY()) {
					for (final RegionPoint point :  horizontals.get(y)) {
						if (point.getX() >= baseX && point.getX() <= endX) {
							zonePoints.add(point);
						}
					}
					y -= 1;
				}
			}
			i += 1;
		}
		for (final RegionPoint point :  zone) {
			zonePoints.addEdgePoint(point);
		}
	}
	return points;
}
public List<List<RegionPoint>> getZones() {
	final List<List<RegionPoint>> results = new ArrayList<List<RegionPoint>>();
	if (pixelMap.containsKey(PIXEL_YELLOW)) {
		for (final RegionPoint yellowPoint :  pixelMap.get(PIXEL_YELLOW)) {
			final List<RegionPoint> zone = new ArrayList<RegionPoint>();
			zone.add(yellowPoint);
			makeZone(results,zone,getCounterPoints(yellowPoint),yellowPoint);
		}
	}
	return results;
}
public void makeZone(final List<List<RegionPoint>> zones,final List<RegionPoint> zone,final List<RegionPoint> counters,final RegionPoint startPoint) {
	for (final RegionPoint point :  counters) {
		if (point.getPixel() == PIXEL_YELLOW) {
			if (point == startPoint) {
				zones.add(zone);
			}
		}
		else  {
			final List<RegionPoint> newZone = new ArrayList<RegionPoint>();
			newZone.addAll(zone);
			newZone.add(point);
			makeZone(zones,newZone,getCounterPoints(point),startPoint);
		}
	}
}
public List<RegionPoint> getCounterPoints(final RegionPoint point) {
	final List<RegionPoint> result = new ArrayList<RegionPoint>();
	if (point.getPixel() == PIXEL_YELLOW || point.getPixel() == PIXEL_RED || point.getPixel() == PIXEL_GREEN) {
		if (pixelMap.containsKey(PIXEL_CYAN)) {
			for (final RegionPoint otherPoint :  pixelMap.get(PIXEL_CYAN)) {
				if (point.getX() == otherPoint.getX()) {
					result.add(otherPoint);
				}
			}
		}
	}
	else if (point.getPixel() == PIXEL_CYAN) {
		if (pixelMap.containsKey(PIXEL_YELLOW)) {
			for (final RegionPoint otherPoint :  pixelMap.get(PIXEL_YELLOW)) {
				if (point.getY() == otherPoint.getY()) {
					result.add(otherPoint);
				}
			}
		}
		if (pixelMap.containsKey(PIXEL_RED)) {
			for (final RegionPoint otherPoint :  pixelMap.get(PIXEL_RED)) {
				if (point.getY() == otherPoint.getY()) {
					result.add(otherPoint);
				}
			}
		}
	}
	return result;
}
public Boolean isBlack() {
	return pixel == PIXEL_ZERO;
}
public Boolean isWhite() {
	return pixel == -1;
}
public Boolean isCompatible(final Region other) {
	if (pixel == PIXEL_ZERO) {
		if (other.pixel == PIXEL_ZERO) {
			return true;
		}
		else  {
			return false;
		}
	}
	else if (pixel == -1 ) {
		if (other.pixel == -1 ) {
			return true;
		}
		else  {
			return false;
		}
	}
	else  {
		if (other.pixel == PIXEL_ZERO) {
			return false;
		}
		else if (other.pixel == -1 ) {
			return false;
		}
		else  {
			return true;
		}
	}
}

}