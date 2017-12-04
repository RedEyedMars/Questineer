package clgen;
import java.util.*;
import java.io.*;
import lists.*;
import com.rem.parser.generation.classwise.*;
import com.rem.parser.generation.*;
import com.rem.parser.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.*;
import clgen.FlipMethodReturn;
import com.rem.parser.generation.*;
import com.rem.parser.generation.classwise.*;
import clent.*;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.util.List;
import java.util.ArrayList;
public class  FlipMethodReturn   {
	public static class classes {
	}
	public static FlipMethodReturn variables = null;
	public static FlipMethodReturn methods = null;
	//Externals


	//Internals
protected List<ExternalStatement.Parameters> arguments = new ArrayList<ExternalStatement.Parameters>();
protected List<ExternalStatement.Parameters> yLayers = new ArrayList<ExternalStatement.Parameters>();
protected Integer yLayerSize = 0;
protected Integer index = 0;

	public List<ExternalStatement.Parameters> getArguments()  {
		return arguments;
	}
	public List<ExternalStatement.Parameters> get_arguments()  {
		return arguments;
	}
	public List<ExternalStatement.Parameters> getYLayers()  {
		return yLayers;
	}
	public List<ExternalStatement.Parameters> get_yLayers()  {
		return yLayers;
	}
	public Integer getYLayerSize()  {
		return yLayerSize;
	}
	public Integer get_yLayerSize()  {
		return yLayerSize;
	}
	public Integer getIndex()  {
		return index;
	}
	public Integer get_index()  {
		return index;
	}
public void incrementIndex()  {
	index += 1;
}
public void setArguments(final List<ExternalStatement.Parameters> newArguments)  {
	arguments = newArguments;
}
public void setYLayers(final List<ExternalStatement.Parameters> newYLayers)  {
	yLayers = newYLayers;
}
public void setYLayerSize(final int newYLayerSize)  {
	yLayerSize = newYLayerSize;
}

}