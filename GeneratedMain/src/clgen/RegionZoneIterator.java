package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.RegionZoneIterator;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import clgen.RegionZone;
import java.util.Map;
import java.util.HashMap;
import clgen.RegionPoint;
import java.util.ArrayList;
import java.util.Iterator;
public class  RegionZoneIterator  implements Iterator<RegionPoint> {
	public static class classes {
	}
	public static RegionZoneIterator variables = null;
	public static RegionZoneIterator methods = null;
	//Externals


	//Internals
protected RegionZone toIterate = null;
protected Integer x = 0;
protected Integer y = 0;
protected Map<Integer,Map<Integer,RegionPoint>> map = null;

	public RegionZone getToIterate()  {
		return toIterate;
	}
	public RegionZone get_toIterate()  {
		return toIterate;
	}
	public Integer getX()  {
		return x;
	}
	public Integer get_x()  {
		return x;
	}
	public Integer getY()  {
		return y;
	}
	public Integer get_y()  {
		return y;
	}
	public Map<Integer,Map<Integer,RegionPoint>> getMap()  {
		return map;
	}
	public Map<Integer,Map<Integer,RegionPoint>> get_map()  {
		return map;
	}
public RegionZoneIterator (final RegionZone iIterable)  {
	toIterate = iIterable;
	x = toIterate.getLowerBoundX();
	y = toIterate.getLowerBoundY();
	map = toIterate.getMap();
}
public boolean hasNext()  {
	return x <= toIterate.getUpperBoundX() && y <= toIterate.getUpperBoundY();
}
public void advanceIndex()  {
	if (y == toIterate.getUpperBoundY()) {
		y = toIterate.getLowerBoundY();
		x += 1;
	}
	else  {
		y += 1;
	}
}
public RegionPoint next()  {
	if (map.containsKey(x)) {
		if (map.get(x).containsKey(y)) {
			final RegionPoint point = map.get(x).get(y);
			advanceIndex();
			return point;
		}
		else  {
			advanceIndex();
			return null;
		}
	}
	else  {
		advanceIndex();
		return null;
	}
}
public void remove()  {
}

}