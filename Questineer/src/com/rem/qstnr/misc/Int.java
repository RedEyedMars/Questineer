package com.rem.qstnr.misc;
import com.rem.qstnr.misc.Int;
public class Int {
	protected int value = 0;
	public int getValue(){
		return value;
	}
	public void setValue(int newValue){
		value=newValue;
	}
	public Int (){
	}
	public Int (int value){
		this.value=value;
	}
	public void increase(int amount){
		value+=amount;
	}
}
