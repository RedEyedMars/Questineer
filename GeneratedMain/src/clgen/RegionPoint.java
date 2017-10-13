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

	public Integer getX() {
		return x;
	}
	public Integer getY() {
		return y;
	}
public RegionPoint (final int ix,final int iy) {
	x = ix;
	y = iy;
}

}