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
import java.util.ArrayList;
import clgen.RegionPoint;
public class  Region   {
	//Externals


	//Internals
protected static final int PIXEL_ZERO = -16777216;
protected Integer x = 0;
protected Integer y = 0;
protected Integer pixel = 0;
protected final Map<Integer,List<RegionPoint>> pixelMap = new HashMap<Integer,List<RegionPoint>>();

	public int getPIXELZERO() {
		return PIXEL_ZERO;
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
	public Map<Integer,List<RegionPoint>> getPixelMap() {
		return pixelMap;
	}
public Region (final int ix,final int iy,final int ipixel) {
	x = ix;
	y = iy;
	pixel = ipixel;
	pixelMap.put(pixel,new ArrayList<RegionPoint>());
	pixelMap.get(pixel).add(new RegionPoint(x,y));
}
public void add(final Region otherRegion) {
	for (final Integer p :  otherRegion.pixelMap.keySet()) {
		if (pixelMap.containsKey(p) == false) {
			pixelMap.put(p,new ArrayList<RegionPoint>());
		}
		pixelMap.get(p).addAll(otherRegion.pixelMap.get(p));
	}
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