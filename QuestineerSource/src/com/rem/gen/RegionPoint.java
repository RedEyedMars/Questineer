package com.rem.gen;
import com.rem.gen.RegionPoint;
public class RegionPoint {
	protected Integer x = 0;
	protected Integer y = 0;
	protected Integer pixel = 0;
	public Integer getX(){
		return x;
	}
	public Integer getY(){
		return y;
	}
	public Integer getPixel(){
		return pixel;
	}
	public RegionPoint (int ix,int iy,int ip){
		x=ix;
		y=iy;
		pixel=ip;
	}
}
