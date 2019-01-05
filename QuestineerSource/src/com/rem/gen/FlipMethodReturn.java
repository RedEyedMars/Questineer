package com.rem.gen;
import java.util.ArrayList;
import java.util.List;
public class FlipMethodReturn {
	protected List<com.rem.lang.helpers.output.OutputArguments> arguments = new ArrayList<com.rem.lang.helpers.output.OutputArguments>();
	protected List<com.rem.lang.helpers.output.OutputArguments> yLayers = new ArrayList<com.rem.lang.helpers.output.OutputArguments>();
	protected int yLayerSize = 0;
	protected int index = 0;
	public List<com.rem.lang.helpers.output.OutputArguments> getArguments(){
		return arguments;
	}
	public List<com.rem.lang.helpers.output.OutputArguments> getYLayers(){
		return yLayers;
	}
	public int getYLayerSize(){
		return yLayerSize;
	}
	public int getIndex(){
		return index;
	}
	public void incrementIndex(){
		index+=1;
	}
	public void setArguments(List<com.rem.lang.helpers.output.OutputArguments> newArguments){
		arguments=newArguments;
	}
	public void setYLayers(List<com.rem.lang.helpers.output.OutputArguments> newYLayers){
		yLayers=newYLayers;
	}
	public void setYLayerSize(int newYLayerSize){
		yLayerSize=newYLayerSize;
	}
}
