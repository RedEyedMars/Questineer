package com.rem.qstnr.menus;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.menus.Menu;
public class Menu {
	public Menu (){
		super();
	}
	public static interface Placable {
		public void place(Area area,int x,int y);
	}
}
