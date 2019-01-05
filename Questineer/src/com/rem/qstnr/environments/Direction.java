package com.rem.qstnr.environments;
import com.rem.qstnr.entities.Entity;
import com.rem.qstnr.gui.images.ImageStates;
import com.rem.qstnr.environments.Environment;
import com.rem.qstnr.environments.Direction;
public class Direction {
	public static Direction.Right right = new Direction.Right();
	public static Direction.Left left = new Direction.Left();
	public static Direction.Up up = new Direction.Up();
	public static Direction.Down down = new Direction.Down();
	public static Direction[] leftDown = new Direction[]{left,down};
	public static Direction[] leftUp = new Direction[]{left,up};
	public static Direction[] rightDown = new Direction[]{right,down};
	public static Direction[] rightUp = new Direction[]{right,up};
	public static Direction[] all = new Direction[]{down,left,right,up};
	public Entity.Event move(Environment.Movable movable){
		return null;
	}
	public int getX(){
		return 0;
	}
	public int getY(){
		return 0;
	}
	public Float getFloatValue(){
		return null;
	}
	public ImageStates getStateId(){
		return null;
	}
	public Direction (){
		super();
	}
	public static class Right extends Direction {
		public Entity.Event move(Environment.Movable movable){
			return movable.moveX(1);
		}
		public int getX(){
			return 1;
		}
		public int getY(){
			return 0;
		}
		public Float getFloatValue(){
			return 0f;
		}
		public ImageStates getStateId(){
			return ImageStates.right;
		}
		public Right (){
			super();
		}
	}
	public static class Left extends Direction {
		public Entity.Event move(Environment.Movable movable){
			return movable.moveX(-1);
		}
		public int getX(){
			return -1;
		}
		public int getY(){
			return 0;
		}
		public Float getFloatValue(){
			return (float)Math.PI;
		}
		public ImageStates getStateId(){
			return ImageStates.left;
		}
		public Left (){
			super();
		}
	}
	public static class Up extends Direction {
		public Entity.Event move(Environment.Movable movable){
			return movable.moveY(1);
		}
		public int getX(){
			return 0;
		}
		public int getY(){
			return 1;
		}
		public Float getFloatValue(){
			return (float)(Math.PI/2.0);
		}
		public ImageStates getStateId(){
			return ImageStates.right;
		}
		public Up (){
			super();
		}
	}
	public static class Down extends Direction {
		public Entity.Event move(Environment.Movable movable){
			return movable.moveY(-1);
		}
		public int getX(){
			return 0;
		}
		public int getY(){
			return -1;
		}
		public Float getFloatValue(){
			return (float)(Math.PI*1.5);
		}
		public ImageStates getStateId(){
			return ImageStates.left;
		}
		public Down (){
			super();
		}
	}
}
