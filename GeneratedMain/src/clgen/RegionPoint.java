package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.RegionPoint;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
public class  RegionPoint   {
	public static class classes {
	}
	public static RegionPoint variables = null;
	public static RegionPoint methods = null;
	//Externals


	//Internals
protected Integer x = 0;
protected Integer y = 0;
protected Integer pixel = 0;

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
	public Integer getPixel()  {
		return pixel;
	}
	public Integer get_pixel()  {
		return pixel;
	}
public RegionPoint (final int ix,final int iy,final int ip)  {
	x = ix;
	y = iy;
	pixel = ip;
}

}