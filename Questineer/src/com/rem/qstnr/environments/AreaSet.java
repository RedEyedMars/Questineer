package com.rem.qstnr.environments;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.environments.AreaSet;
import java.util.HashSet;
public class AreaSet extends HashSet<Area> {
	public AreaSet (){
		super();
	}
	public AreaSet (Area initialArea){
		super();
		add(initialArea);
	}
}
