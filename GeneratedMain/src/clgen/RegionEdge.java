package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.RegionEdge;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
public class  RegionEdge   {
	public static class classes {
	}
	public static RegionEdge variables = null;
	public static RegionEdge methods = null;
	//Externals


	//Internals
protected Integer startEdge = 0;
protected Integer endEdge = 0;

	public Integer getStartEdge()  {
		return startEdge;
	}
	public Integer get_startEdge()  {
		return startEdge;
	}
	public Integer getEndEdge()  {
		return endEdge;
	}
	public Integer get_endEdge()  {
		return endEdge;
	}
public RegionEdge (final Integer initialStart,final Integer initialEnd)  {
	startEdge = initialStart;
	endEdge = initialEnd;
}
public Integer getStart()  {
	return startEdge;
}
public Integer getEnd()  {
	return endEdge;
}

}