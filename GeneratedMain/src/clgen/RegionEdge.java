package clgen;
import clgen.RegionEdge;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
public class  RegionEdge   {
	//Externals


	//Internals
protected Integer startEdge = 0;
protected Integer endEdge = 0;

	public Integer getStartEdge() {
		return startEdge;
	}
	public Integer getEndEdge() {
		return endEdge;
	}
public RegionEdge (final Integer initialStart,final Integer initialEnd) {
	startEdge = initialStart;
	endEdge = initialEnd;
}
public Integer getStart() {
	return startEdge;
}
public Integer getEnd() {
	return endEdge;
}

}