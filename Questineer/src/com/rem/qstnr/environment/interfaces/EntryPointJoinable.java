package com.rem.qstnr.environment.interfaces;
import com.rem.qstnr.environments.tiles.Tile;
import com.rem.qstnr.environment.interfaces.EntryPointJoinable;
public interface EntryPointJoinable {
	public Tile join(Tile entryPoint);
}
