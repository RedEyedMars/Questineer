package com.rem.qstnr.game;
import com.rem.qstnr.entities.Entity;
import java.util.function.Function;
import java.util.Random;
import com.rem.qstnr.events.Events;
import com.rem.qstnr.gui.Gui;
import com.rem.qstnr.entities.behaviours.activities.Activities;
import com.rem.qstnr.gui.InputHandler;
import com.rem.qstnr.gui.images.Images;
import com.rem.qstnr.misc.Range;
import com.rem.qstnr.entities.relations.associations.Associations;
import com.rem.qstnr.entities.Entities;
import com.rem.qstnr.environments.Environments;
import com.rem.qstnr.environments.Area;
import com.rem.qstnr.game.Game;
import java.util.function.BiFunction;
import com.rem.qstnr.environments.Environment;
public class Game implements InputHandler.Events.KeyboardEvent.Listener, InputHandler.Events.MouseEvent.Listener {
	protected Game.EnvironmentList environments = new Game.EnvironmentList();
	protected Double lastTick = System.currentTimeMillis()/1000.0;
	protected Double thisTick = lastTick;
	protected Area focusArea = null;
	protected Entity hero = null;
	protected boolean[] pressedKeys = new boolean[256];
	public Game.EnvironmentList getEnvironments(){
		return environments;
	}
	public void setEnvironments(Game.EnvironmentList newEnvironments){
		environments=newEnvironments;
	}
	public Double getLastTick(){
		return lastTick;
	}
	public void setLastTick(Double newLastTick){
		lastTick=newLastTick;
	}
	public Double getThisTick(){
		return thisTick;
	}
	public void setThisTick(Double newThisTick){
		thisTick=newThisTick;
	}
	public Area getFocusArea(){
		return focusArea;
	}
	public void setFocusArea(Area newFocusArea){
		focusArea=newFocusArea;
	}
	public Entity getHero(){
		return hero;
	}
	public void setHero(Entity newHero){
		hero=newHero;
	}
	public boolean[] getPressedKeys(){
		return pressedKeys;
	}
	public void setPressedKeys(boolean[] newPressedKeys){
		pressedKeys=newPressedKeys;
	}
	public static void main(String[] args){
		new Gui();
	}
	public static void findSeed(){
		Long seed = new Random().nextLong();
		Range.randomizer.setSeed(seed);
		Range newRange = new Range(0,0);
		System.out.println("Seed:"+seed+"L");
	}
	public void load(){
		environments.forEach(Environment::load);
		new Associations().on(new Events.Load(null));
		hero=new Entities.Hero(Images.male_hero_base);
		hero.spawnAt(Gui.game.getEnvironments().getForest().getTile(0,0));
		hero.start(new Activities.Exploring(200));
		InputHandler.addKeyboardListener(this);
		InputHandler.addMouseListener(this);
	}
	public void listen(InputHandler.Events.KeyboardEvent.Release event){
		pressedKeys[event.getKeyInt()]=false;
	}
	public void listen(InputHandler.Events.KeyboardEvent.Press event){
		pressedKeys[event.getKeyInt()]=true;
	}
	public void listen(InputHandler.Events.MouseEvent.Release event){
	}
	public void listen(InputHandler.Events.MouseEvent.Press event){
	}
	public void listen(InputHandler.Events.MouseEvent.Drag event){
	}
	public void listen(InputHandler.Events.MouseEvent.Move event){
	}
	public void update(){
		thisTick=System.currentTimeMillis()/1000.0;
		environments.forEach(thisTick-lastTick,Environment::tick);
		if(focusArea!=hero.getLocation().getArea()){
			if(focusArea!=null){
				focusArea.undisplay();
			}
			focusArea=hero.getLocation().getArea();
		}
		focusArea.display();
		if(pressedKeys[19]){
			focusArea.undisplay();
		}
		if(pressedKeys[1]){
			Gui.isRunning=false;
		}
		if(pressedKeys[17]){
			Gui.renderer.moveView(0.0f,-0.01f);
		}
		if(pressedKeys[30]){
			Gui.renderer.moveView(0.01f,0.0f);
		}
		if(pressedKeys[31]){
			Gui.renderer.moveView(0.0f,0.01f);
		}
		if(pressedKeys[32]){
			Gui.renderer.moveView(-0.01f,0.0f);
		}
		lastTick=thisTick;
	}
	public Game (Game.EnvironmentList environments,Double lastTick,Double thisTick,Area focusArea,Entity hero,boolean[] pressedKeys){
		super();
		this.environments=environments;
		this.lastTick=lastTick;
		this.thisTick=thisTick;
		this.focusArea=focusArea;
		this.hero=hero;
		this.pressedKeys=pressedKeys;
	}
	public Game (){
		super();
	}
	public static class EnvironmentList {
		protected Environments.Town town = new Environments.Town();
		protected Environments.Forest forest = new Environments.Forest();
		public void forEach(Function<Environment, Boolean> function){
			function.apply(town);
			function.apply(forest);
		}
		public <T> void forEach(T argument,BiFunction<Environment, T, Boolean> function){
			function.apply(town,argument);
			function.apply(forest,argument);
		}
		public Environments.Town getTown(){
			return town;
		}
		public void setTown(Environments.Town newTown){
			town=newTown;
		}
		public Environments.Forest getForest(){
			return forest;
		}
		public void setForest(Environments.Forest newForest){
			forest=newForest;
		}
		public EnvironmentList (Environments.Town town,Environments.Forest forest){
			super();
			this.town=town;
			this.forest=forest;
		}
		public EnvironmentList (){
			super();
		}
	}
	public static class Imports {
		protected Environment anEnvironment = null;
		public Environment getAnEnvironment(){
			return anEnvironment;
		}
		public void setAnEnvironment(Environment newAnEnvironment){
			anEnvironment=newAnEnvironment;
		}
		public Imports (Environment anEnvironment){
			super();
			this.anEnvironment=anEnvironment;
		}
		public Imports (){
			super();
		}
	}
}
