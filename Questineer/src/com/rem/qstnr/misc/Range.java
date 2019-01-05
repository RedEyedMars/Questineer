package com.rem.qstnr.misc;
import com.rem.qstnr.entities.Entity;
import java.util.Set;
import java.util.ArrayList;
import com.rem.qstnr.misc.Range;
import java.util.Random;
import java.util.List;
public class Range {
	public static Random randomizer = new Random();
	protected Float left = 0f;
	protected Float right = 0f;
	public Float getLeft(){
		return left;
	}
	public void setLeft(Float newLeft){
		left=newLeft;
	}
	public Float getRight(){
		return right;
	}
	public void setRight(Float newRight){
		right=newRight;
	}
	public Range (Float left,Float right){
		this.left=left;
		this.right=right;
	}
	public static int getIntegerBetween(Integer bottom,Integer top){
		return (int)(double)((top-bottom)*randomizer.nextDouble()+bottom);
	}
	public Range (Integer initialLeft,Integer initialRight){
		left=(float)initialLeft;
		right=(float)initialRight;
	}
	public Range (Float initialLeft,Integer initialRight){
		left=initialLeft;
		right=(float)initialRight;
	}
	public Range (Integer initialLeft,Float initialRight){
		left=(float)initialLeft;
		right=initialRight;
	}
	public static <T> T select(Set<T> collection){
		if(collection.isEmpty()){
			return null;
		}
		List<T> temp = new ArrayList(collection);
		return temp.get((int)(temp.size()*randomizer.nextFloat()));
	}
	public static <T> T select(List<T> collection){
		if(collection.isEmpty()){
			return null;
		}
		return collection.get((int)(collection.size()*randomizer.nextFloat()));
	}
	public static <T> T select(T[] array){
		if(array.length==0){
			return null;
		}
		return array[(int)(array.length*randomizer.nextFloat())];
	}
	public static Boolean chance(Double percent){
		return randomizer.nextDouble()<=percent;
	}
	public static Boolean chance(Float percent){
		return randomizer.nextFloat()<=percent;
	}
	public static Float getRandomFloat(){
		return randomizer.nextFloat();
	}
	public static Integer getRandom(Integer lowerBound,Integer upperBound){
		if(lowerBound>=upperBound){
			return lowerBound;
		}
		else{
			return (int)((upperBound-lowerBound)*randomizer.nextFloat())+lowerBound;
		}
	}
	public static Float getRandom(Float lowerBound,Float upperBound){
		if(lowerBound>=upperBound){
			return lowerBound;
		}
		else{
			return ((upperBound-lowerBound)*randomizer.nextFloat())+lowerBound;
		}
	}
	public static Integer normalize(Double value){
		if(value>0.001){
			return 1;
		}
		else if(value<-0.001){
			return -1;
		}
		else{
			return 0;
		}
	}
	public double getRandom(){
		return (right-left)*randomizer.nextDouble()+left;
	}
	public float getValue(Entity user){
		return (float)getRandom();
	}
	public Range (){
		super();
	}
}
