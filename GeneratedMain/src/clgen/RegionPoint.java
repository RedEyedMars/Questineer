package clgen;
import clgen.RegionPoint;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
public class  RegionPoint   {
	//Externals


	//Internals
protected Integer x = 0;
protected Integer y = 0;
protected Integer pixel = 0;

	public Integer getX() {
		return x;
	}
	public Integer getY() {
		return y;
	}
	public Integer getPixel() {
		return pixel;
	}
public RegionPoint (final int ix,final int iy,final int ip) {
	x = ix;
	y = iy;
	pixel = ip;
}

}