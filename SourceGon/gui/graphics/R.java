package com.rem.otl.pc.gui.graphics;

import java.io.InputStream;

public class R {


	public static InputStream getResource(String name){
		return R.class.getResourceAsStream(name);
	}

}
