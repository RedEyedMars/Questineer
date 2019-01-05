package com.rem.gen;
import com.rem.gen.RegionEdge;
public class RegionEdge {
	protected Integer startEdge = 0;
	protected Integer endEdge = 0;
	public Integer getStartEdge(){
		return startEdge;
	}
	public Integer getEndEdge(){
		return endEdge;
	}
	public RegionEdge (Integer initialStart,Integer initialEnd){
		startEdge=initialStart;
		endEdge=initialEnd;
	}
	public Integer getStart(){
		return startEdge;
	}
	public Integer getEnd(){
		return endEdge;
	}
}
