package com.rem.qstnr.misc.streams;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.Function;
import com.rem.qstnr.misc.streams.Streamer;
import java.util.function.BiFunction;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import com.rem.qstnr.misc.interfaces.Indexable;
public class Streamer {
	public static <T> Float sum(List<T> list,BiFunction<Float, T, Float> function){
		return list.parallelStream().reduce(0f,function,(S,V)->S+V);
	}
	public static <T> Boolean has(List<? extends T> list,T obj){
		return list.parallelStream().map( O->O.equals(obj)).filter( B->B).findAny().orElse(false);
	}
	public static <T,U> Boolean has(List<? extends T> list,Function<T, U> func,U obj){
		return list.parallelStream().map( O->func.apply(O).equals(obj)).filter( B->B).findAny().orElse(false);
	}
	public static <T,U> Boolean has(List<? extends T> list,Function<T, Boolean> func){
		return list.parallelStream().filter( O->func.apply(O)).findAny().orElse(null)!=null;
	}
	public static <T> T get(List<? extends T> list,Function<T, Boolean> func){
		return list.parallelStream().map( O->func.apply(O)?O:null).filter( B->B!=null).findAny().orElse(null);
	}
	public static <T,U> T get(List<? extends T> list,Function<T, U> func,U obj){
		return list.parallelStream().map( O->func.apply(O).equals(obj)?O:null).filter( B->B!=null).findAny().orElse(null);
	}
	public static <T> List<T> collect(List<? extends T> list,Function<T, Boolean> func){
		return list.parallelStream().filter( O->func.apply(O)).collect(Collectors.toList());
	}
	public static <T,U> T race(List<? extends T> list,Predicate<T> objectTest,U start,Function<T, U> distance,BiFunction<U, U, Boolean> standingTest){
		if(list.isEmpty()){
			return null;
		}
		return (T)list.parallelStream().filter(objectTest).reduce(new Object[]{start,null},(Other,Racer)->standingTest.apply((U)Other[0],distance.apply(Racer))?Other:new Object[]{distance.apply(Racer),Racer},(Previous,Current)->standingTest.apply((U)Previous[0],(U)Current[0])?Previous:Current)[1];
	}
	public static <T> Stream<T> performOnce(int index,Stream<T> stream,Function<T, T> function){
		return stream.map( O->((Indexable)O).getIndex()==index?function.apply(O):O);
	}
	public static <T> Stream<T> perform(Function<Integer, Boolean> indexTest,Stream<T> stream,Function<T, T> function){
		return stream.map( O->indexTest.apply(((Indexable)O).getIndex())?function.apply(O):O);
	}
	public Streamer (){
		super();
	}
	public static class Iterator <T> implements java.util.Iterator<T> {
		protected T current;
		protected Function<T, T> next;
		public T getCurrent(){
			return current;
		}
		public void setCurrent(T newCurrent){
			current=newCurrent;
		}
		public Function<T, T> getNext(){
			return next;
		}
		public void setNext(Function<T, T> newNext){
			next=newNext;
		}
		public boolean hasNext(){
			return current!=null;
		}
		public T next(){
			T previous = current;
			current=next.apply(current);
			return previous;
		}
		public Iterator (T current,Function<T, T> next){
			super();
			this.current=current;
			this.next=next;
		}
		public Iterator (){
			super();
		}
	}
	public static enum Imports {
		 stream,
		 indexer
	}
}
