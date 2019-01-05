package com.rem.qstnr.gui;
import java.util.ArrayList;
import java.nio.FloatBuffer;
import com.rem.qstnr.gui.images.ImageStates;
import com.rem.qstnr.gui.Gui;
import org.lwjgl.opengl.PixelFormat;
import java.util.List;
import com.rem.qstnr.gui.InputHandler;
import org.lwjgl.opengl.GL11;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.DisplayMode;
import com.rem.qstnr.game.Game;
import com.rem.qstnr.gui.Renderer;
import com.rem.qstnr.gui.images.ImageLoader;
import org.lwjgl.opengl.Display;
public class Gui {
	protected FloatBuffer placeHolder = null;
	public static Boolean isRunning = true;
	protected ImageLoader imageLoader = null;
	protected InputHandler inputHandler = null;
	public static Game game = null;
	public static Renderer renderer = null;
	public static StringBuilder _log = new StringBuilder();
	protected int finishedKey = Keyboard.KEY_ESCAPE;
	protected String window_title = "OpenGL Window";
	protected boolean VSyncEnabled = true;
	protected boolean useCurrentDisplay = false;
	protected boolean fullScreen = false;
	protected boolean showMessages = true;
	protected int displayWidth = 1024;
	protected int displayHeight = 786;
	protected int displayColorBits = -1;
	protected int displayFrequency = -1;
	protected int depthBufferBits = 24;
	protected DisplayMode originalDisplayMode = null;
	protected DisplayMode displayMode = null;
	public FloatBuffer getPlaceHolder(){
		return placeHolder;
	}
	public void setPlaceHolder(FloatBuffer newPlaceHolder){
		placeHolder=newPlaceHolder;
	}
	public ImageLoader getImageLoader(){
		return imageLoader;
	}
	public void setImageLoader(ImageLoader newImageLoader){
		imageLoader=newImageLoader;
	}
	public InputHandler getInputHandler(){
		return inputHandler;
	}
	public void setInputHandler(InputHandler newInputHandler){
		inputHandler=newInputHandler;
	}
	public Gui (){
		load();
		run();
	}
	public void load(){
		initializeDisplay();
		renderer=new Renderer();
		renderer.load(displayMode);
		inputHandler=new InputHandler();
		inputHandler.load(displayMode);
		imageLoader=new ImageLoader();
		imageLoader.load();
		game=new Game();
		game.load();
	}
	public static void log(String toLog){
		_log.append(toLog);
		_log.append("\n");
	}
	public int getFinishedKey(){
		return finishedKey;
	}
	public void setFinishedKey(int newFinishedKey){
		finishedKey=newFinishedKey;
	}
	public String getWindowTitle(){
		return window_title;
	}
	public void setWindowTitle(String newWindowTitle){
		window_title=newWindowTitle;
	}
	public boolean getVSyncEnabled(){
		return VSyncEnabled;
	}
	public void setVSyncEnabled(boolean newVSyncEnabled){
		VSyncEnabled=newVSyncEnabled;
	}
	public boolean getUseCurrentDisplay(){
		return useCurrentDisplay;
	}
	public void setUseCurrentDisplay(boolean newUseCurrentDisplay){
		useCurrentDisplay=newUseCurrentDisplay;
	}
	public boolean getFullScreen(){
		return fullScreen;
	}
	public void setFullScreen(boolean newFullScreen){
		fullScreen=newFullScreen;
	}
	public boolean getShowMessages(){
		return showMessages;
	}
	public void setShowMessages(boolean newShowMessages){
		showMessages=newShowMessages;
	}
	public int getDisplayWidth(){
		return displayWidth;
	}
	public void setDisplayWidth(int newDisplayWidth){
		displayWidth=newDisplayWidth;
	}
	public int getDisplayHeight(){
		return displayHeight;
	}
	public void setDisplayHeight(int newDisplayHeight){
		displayHeight=newDisplayHeight;
	}
	public int getDisplayColorBits(){
		return displayColorBits;
	}
	public void setDisplayColorBits(int newDisplayColorBits){
		displayColorBits=newDisplayColorBits;
	}
	public int getDisplayFrequency(){
		return displayFrequency;
	}
	public void setDisplayFrequency(int newDisplayFrequency){
		displayFrequency=newDisplayFrequency;
	}
	public int getDepthBufferBits(){
		return depthBufferBits;
	}
	public void setDepthBufferBits(int newDepthBufferBits){
		depthBufferBits=newDepthBufferBits;
	}
	public DisplayMode getOriginalDisplayMode(){
		return originalDisplayMode;
	}
	public void setOriginalDisplayMode(DisplayMode newOriginalDisplayMode){
		originalDisplayMode=newOriginalDisplayMode;
	}
	public DisplayMode getDisplayMode(){
		return displayMode;
	}
	public void setDisplayMode(DisplayMode newDisplayMode){
		displayMode=newDisplayMode;
	}
	public void initializeDisplay(){
		originalDisplayMode=Display.getDisplayMode();
		Gui.log("GLApp.initDisplay(): Current display mode is "+originalDisplayMode);
		if(displayHeight==-1){
			displayHeight=originalDisplayMode.getHeight();
		}
		if(displayWidth==-1){
			displayWidth=originalDisplayMode.getWidth();
		}
		if(displayColorBits==-1){
			displayColorBits=originalDisplayMode.getBitsPerPixel();
		}
		if(displayFrequency==-1){
			displayFrequency=originalDisplayMode.getFrequency();
		}
		try{
			if(useCurrentDisplay){
				displayMode=originalDisplayMode;
			}
			else{
				displayMode=getDisplayMode(displayWidth,displayHeight,displayColorBits,displayFrequency);
				if(displayMode==null){
					displayMode=getDisplayMode(1024,768,32,60);
					if(displayMode==null){
						displayMode=getDisplayMode(1024,768,16,60);
						if(displayMode==null){
							displayMode=getDisplayMode(originalDisplayMode.getWidth(),originalDisplayMode.getHeight(),originalDisplayMode.getBitsPerPixel(),originalDisplayMode.getFrequency());
							if(displayMode==null){
								System.err.println("Gui Load Display Cant find a compatible Display Mode!!!");
							}
						}
					}
				}
			}
			Gui.log("initializeDisplay: Setting display mode to "+displayMode+" with pixel depth = "+depthBufferBits);
			Display.setDisplayMode(displayMode);
			displayMode=displayMode;
			displayWidth=displayMode.getWidth();
			displayHeight=displayMode.getHeight();
			displayColorBits=displayMode.getBitsPerPixel();
			displayFrequency=displayMode.getFrequency();
		}
		catch(Exception e0){
			e0.printStackTrace();
			System.err.println("initializeDisplay: Failed to create display: ");
			System.exit(1);
		}
		try{
			Display.create(new PixelFormat(0,depthBufferBits,8));
			Display.setTitle(window_title);
			Display.setFullscreen(fullScreen);
			Display.setVSyncEnabled(VSyncEnabled);
		}
		catch(Exception e0){
			e0.printStackTrace();
			System.err.println("initializeDisplay: Failed to create OpenGL window");
			System.exit(1);
		}
	}
	public DisplayMode getDisplayMode(int width,int height,int colourBits,int frequency){
		try{
			DisplayMode[] allDisplayModes = Display.getAvailableDisplayModes();
			DisplayMode tempDisplayMode = null;
			for(int i = 0;i<allDisplayModes.length;++i){
				tempDisplayMode=allDisplayModes[i];
				if(tempDisplayMode.getWidth()==width&&tempDisplayMode.getHeight()==height&&tempDisplayMode.getBitsPerPixel()==colourBits&&tempDisplayMode.getFrequency()==frequency){
					return tempDisplayMode;
				}
			}
		}
		catch(Exception e0){
			e0.printStackTrace();
			System.err.println("getDisplayMode Failed");
		}
		return null;
	}
	public void run(){
		try{
			while(isRunning){
				if(Display.isVisible()==false){
					Thread.sleep(200L);
				}
				else if(Display.isCloseRequested()){
					isRunning=false;
				}
				else{
					Thread.sleep(1);
				}
				inputHandler.handle();
				game.update();
				renderer.render();
				Display.update();
			}
		}
		catch(InterruptedException e0){
			e0.printStackTrace();
		}
		inputHandler.end();
		renderer.end();
	}
	public Gui (FloatBuffer placeHolder,ImageLoader imageLoader,InputHandler inputHandler,int finishedKey,String window_title,boolean VSyncEnabled,boolean useCurrentDisplay,boolean fullScreen,boolean showMessages,int displayWidth,int displayHeight,int displayColorBits,int displayFrequency,int depthBufferBits,DisplayMode originalDisplayMode,DisplayMode displayMode){
		super();
		this.placeHolder=placeHolder;
		this.imageLoader=imageLoader;
		this.inputHandler=inputHandler;
		this.finishedKey=finishedKey;
		this.window_title=window_title;
		this.VSyncEnabled=VSyncEnabled;
		this.useCurrentDisplay=useCurrentDisplay;
		this.fullScreen=fullScreen;
		this.showMessages=showMessages;
		this.displayWidth=displayWidth;
		this.displayHeight=displayHeight;
		this.displayColorBits=displayColorBits;
		this.displayFrequency=displayFrequency;
		this.depthBufferBits=depthBufferBits;
		this.originalDisplayMode=originalDisplayMode;
		this.displayMode=displayMode;
	}
	public static interface Renderable {
		public int getTexture();
		public void render();
		public void animate();
	}
	public static interface Statable {
		public Gui.Image.States asStates();
		public Gui.Drawable asStates(Gui.Drawable drawable);
	}
	public static class Image implements Renderable {
		protected String imageFileName = null;
		protected Gui.Image.Dimensions pixels = null;
		protected Gui.Image.Dimensions frames = null;
		protected int texture = -1;
		protected FloatBuffer[][] textureBuffer = null;
		public String getImageFileName(){
			return imageFileName;
		}
		public void setImageFileName(String newImageFileName){
			imageFileName=newImageFileName;
		}
		public Gui.Image.Dimensions getPixels(){
			return pixels;
		}
		public void setPixels(Gui.Image.Dimensions newPixels){
			pixels=newPixels;
		}
		public Gui.Image.Dimensions getFrames(){
			return frames;
		}
		public void setFrames(Gui.Image.Dimensions newFrames){
			frames=newFrames;
		}
		public int getTexture(){
			return texture;
		}
		public void setTexture(int newTexture){
			texture=newTexture;
		}
		public FloatBuffer[][] getTextureBuffer(){
			return textureBuffer;
		}
		public void setTextureBuffer(FloatBuffer[][] newTextureBuffer){
			textureBuffer=newTextureBuffer;
		}
		public int getImageTexture(){
			return texture;
		}
		public void animate(){
		}
		public void render(){
			GL11.glTexCoordPointer(2,0,textureBuffer[0][0]);
		}
		public Gui.Image.Crop getCrop(int frameX,int frameY){
			return new Gui.Image.Crop(frameX,frameY);
		}
		public Gui.Image.AnimationType.Stationary createStationary(int animationX,int animationY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createStationary();
		}
		public Gui.Image.AnimationType.Progression createProgression(int animationX,int animationY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createProgression();
		}
		public Gui.Image.AnimationType.Progression.X createProgressionX(int animationX,int animationY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createProgressionX();
		}
		public Gui.Image.AnimationType.Progression.Y createProgressionY(int animationX,int animationY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createProgressionY();
		}
		public Gui.Image.AnimationType.Progression.Bounded createProgressionBounded(int animationX,int animationY,int startX,int startY,int endX,int endY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createProgressionBounded(startX,startY,endX,endY);
		}
		public Gui.Image.AnimationType.Progression.Bounded.X createProgressionBoundedX(int animationX,int animationY,int startX,int startY,int endX,int endY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createProgressionBoundedX(startX,startY,endX,endY);
		}
		public Gui.Image.AnimationType.Progression.Bounded.Y createProgressionBoundedY(int animationX,int animationY,int startX,int startY,int endX,int endY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createProgressionBoundedY(startX,startY,endX,endY);
		}
		public Gui.Image.AnimationType.Cycle createCycle(int animationX,int animationY,int direction){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createCycle(direction);
		}
		public Gui.Image.AnimationType.Cycle.X createCycleX(int animationX,int animationY,int direction){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createCycleX(direction);
		}
		public Gui.Image.AnimationType.Cycle.Y createCycleY(int animationX,int animationY,int direction){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createCycleY(direction);
		}
		public Gui.Image.AnimationType.Cycle.Bounded createCycleBounded(int animationX,int animationY,int direction,int startX,int startY,int endX,int endY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createCycleBounded(direction,startX,startY,endX,endY);
		}
		public Gui.Image.AnimationType.Cycle.Bounded.X createCycleBoundedX(int animationX,int animationY,int direction,int startX,int startY,int endX,int endY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createCycleBoundedX(direction,startX,startY,endX,endY);
		}
		public Gui.Image.AnimationType.Cycle.Bounded.Y createCycleBoundedY(int animationX,int animationY,int direction,int startX,int startY,int endX,int endY){
			Gui.Image.AnimationType base = new Gui.Image.AnimationType(animationX,animationY);
			return base.createCycleBoundedY(direction,startX,startY,endX,endY);
		}
		public Image (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super();
			this.imageFileName=imageFileName;
			this.pixels=pixels;
			this.frames=frames;
			this.texture=texture;
			this.textureBuffer=textureBuffer;
		}
		public Image (){
			super();
		}
		public static class Dimensions {
			protected int width = -1;
			protected int height = -1;
			public int getWidth(){
				return width;
			}
			public void setWidth(int newWidth){
				width=newWidth;
			}
			public int getHeight(){
				return height;
			}
			public void setHeight(int newHeight){
				height=newHeight;
			}
			public Dimensions (int width,int height){
				super();
				this.width=width;
				this.height=height;
			}
			public Dimensions (){
				super();
			}
		}
		public class Crop implements Renderable {
			protected int frameX = 0;
			protected int frameY = 0;
			public int getFrameX(){
				return frameX;
			}
			public void setFrameX(int newFrameX){
				frameX=newFrameX;
			}
			public int getFrameY(){
				return frameY;
			}
			public void setFrameY(int newFrameY){
				frameY=newFrameY;
			}
			public Crop (int frameX,int frameY){
				this.frameX=frameX;
				this.frameY=frameY;
			}
			public void animate(){
			}
			public void render(){
				GL11.glTexCoordPointer(2,0,textureBuffer[frameX][frameY]);
			}
			public int getTexture(){
				return getImageTexture();
			}
			public Crop (){
				super();
			}
		}
		public static class States implements Renderable, Statable {
			protected Gui.Renderable current = null;
			protected ImageStates id = ImageStates.DEFAULT;
			protected ImageStates state = ImageStates.DEFAULT;
			public Gui.Renderable getCurrent(){
				return current;
			}
			public void setCurrent(Gui.Renderable newCurrent){
				current=newCurrent;
			}
			public ImageStates getId(){
				return id;
			}
			public void setId(ImageStates newId){
				id=newId;
			}
			public ImageStates getState(){
				return state;
			}
			public void setState(ImageStates newState){
				state=newState;
			}
			public void animate(){
				current.animate();
			}
			public void render(){
				current.render();
			}
			public int getTexture(){
				return current.getTexture();
			}
			public void changeState(ImageStates newState){
			}
			public Gui.Image.States asStates(){
				return this;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				return drawable.image(this);
			}
			public final Gui.Image.States idle(){
				changeState(ImageStates.idle);
				return this;
			}
			public final Gui.Image.States male_idle(){
				changeState(ImageStates.male_idle);
				return this;
			}
			public final Gui.Image.States right(){
				changeState(ImageStates.right);
				return this;
			}
			public final Gui.Image.States male_walk_right(){
				changeState(ImageStates.male_walk_right);
				return this;
			}
			public final Gui.Image.States left(){
				changeState(ImageStates.left);
				return this;
			}
			public final Gui.Image.States male_walk_left(){
				changeState(ImageStates.male_walk_left);
				return this;
			}
			public final Gui.Image.States male_walk(){
				changeState(ImageStates.male_walk);
				return this;
			}
			public final Gui.Image.States walk(){
				changeState(ImageStates.walk);
				return this;
			}
			public final Gui.Image.States male(){
				changeState(ImageStates.male);
				return this;
			}
			public final Gui.Image.States wolf_idle(){
				changeState(ImageStates.wolf_idle);
				return this;
			}
			public final Gui.Image.States walkRight(){
				changeState(ImageStates.walkRight);
				return this;
			}
			public final Gui.Image.States wolf_walkRight(){
				changeState(ImageStates.wolf_walkRight);
				return this;
			}
			public final Gui.Image.States walkLeft(){
				changeState(ImageStates.walkLeft);
				return this;
			}
			public final Gui.Image.States wolf_walkLeft(){
				changeState(ImageStates.wolf_walkLeft);
				return this;
			}
			public final Gui.Image.States wolf(){
				changeState(ImageStates.wolf);
				return this;
			}
			public final Gui.Image.States killer_bees_idle(){
				changeState(ImageStates.killer_bees_idle);
				return this;
			}
			public final Gui.Image.States killer_bees_walk(){
				changeState(ImageStates.killer_bees_walk);
				return this;
			}
			public final Gui.Image.States killer_bees(){
				changeState(ImageStates.killer_bees);
				return this;
			}
			public final Gui.Image.States praying_mantis_idle(){
				changeState(ImageStates.praying_mantis_idle);
				return this;
			}
			public final Gui.Image.States praying_mantis_walk(){
				changeState(ImageStates.praying_mantis_walk);
				return this;
			}
			public final Gui.Image.States praying_mantis(){
				changeState(ImageStates.praying_mantis);
				return this;
			}
			public final Gui.Image.States bear_idle(){
				changeState(ImageStates.bear_idle);
				return this;
			}
			public final Gui.Image.States bear_walk(){
				changeState(ImageStates.bear_walk);
				return this;
			}
			public final Gui.Image.States bear(){
				changeState(ImageStates.bear);
				return this;
			}
			public final Gui.Image.States grass(){
				changeState(ImageStates.grass);
				return this;
			}
			public final Gui.Image.States path(){
				changeState(ImageStates.path);
				return this;
			}
			public final Gui.Image.States long_grass(){
				changeState(ImageStates.long_grass);
				return this;
			}
			public final Gui.Image.States tree(){
				changeState(ImageStates.tree);
				return this;
			}
			public final Gui.Image.States lone_rock(){
				changeState(ImageStates.lone_rock);
				return this;
			}
			public final Gui.Image.States bear_den(){
				changeState(ImageStates.bear_den);
				return this;
			}
			public final Gui.Image.States ethereal_pedestal_0(){
				changeState(ImageStates.ethereal_pedestal_0);
				return this;
			}
			public final Gui.Image.States ethereal_pedestal_1(){
				changeState(ImageStates.ethereal_pedestal_1);
				return this;
			}
			public final Gui.Image.States water(){
				changeState(ImageStates.water);
				return this;
			}
			public final Gui.Image.States lake_0(){
				changeState(ImageStates.lake_0);
				return this;
			}
			public final Gui.Image.States lake_1(){
				changeState(ImageStates.lake_1);
				return this;
			}
			public final Gui.Image.States lake_2(){
				changeState(ImageStates.lake_2);
				return this;
			}
			public final Gui.Image.States lake_3(){
				changeState(ImageStates.lake_3);
				return this;
			}
			public final Gui.Image.States bridge(){
				changeState(ImageStates.bridge);
				return this;
			}
			public final Gui.Image.States minor(){
				changeState(ImageStates.minor);
				return this;
			}
			public final Gui.Image.States major(){
				changeState(ImageStates.major);
				return this;
			}
			public final Gui.Image.States treasure(){
				changeState(ImageStates.treasure);
				return this;
			}
			public final Gui.Image.States legendary(){
				changeState(ImageStates.legendary);
				return this;
			}
			public final Gui.Image.States none(){
				changeState(ImageStates.none);
				return this;
			}
			public final Gui.Image.States male_none(){
				changeState(ImageStates.male_none);
				return this;
			}
			public final Gui.Image.States male_mayor_idle(){
				changeState(ImageStates.male_mayor_idle);
				return this;
			}
			public final Gui.Image.States male_mayor_walk_right(){
				changeState(ImageStates.male_mayor_walk_right);
				return this;
			}
			public final Gui.Image.States male_mayor_walk_left(){
				changeState(ImageStates.male_mayor_walk_left);
				return this;
			}
			public final Gui.Image.States male_mayor_walk(){
				changeState(ImageStates.male_mayor_walk);
				return this;
			}
			public final Gui.Image.States male_mayor(){
				changeState(ImageStates.male_mayor);
				return this;
			}
			public final Gui.Image.States mayor(){
				changeState(ImageStates.mayor);
				return this;
			}
			public final Gui.Image.States male_bar_tender_idle(){
				changeState(ImageStates.male_bar_tender_idle);
				return this;
			}
			public final Gui.Image.States male_bar_tender_walk_right(){
				changeState(ImageStates.male_bar_tender_walk_right);
				return this;
			}
			public final Gui.Image.States male_bar_tender_walk_left(){
				changeState(ImageStates.male_bar_tender_walk_left);
				return this;
			}
			public final Gui.Image.States male_bar_tender_walk(){
				changeState(ImageStates.male_bar_tender_walk);
				return this;
			}
			public final Gui.Image.States male_bar_tender(){
				changeState(ImageStates.male_bar_tender);
				return this;
			}
			public final Gui.Image.States bar_tender(){
				changeState(ImageStates.bar_tender);
				return this;
			}
			public final Gui.Image.States stone_floor(){
				changeState(ImageStates.stone_floor);
				return this;
			}
			public final Gui.Image.States stone_walls_0(){
				changeState(ImageStates.stone_walls_0);
				return this;
			}
			public final Gui.Image.States stone_walls_1(){
				changeState(ImageStates.stone_walls_1);
				return this;
			}
			public final Gui.Image.States stone_walls_2(){
				changeState(ImageStates.stone_walls_2);
				return this;
			}
			public final Gui.Image.States stone_walls_3(){
				changeState(ImageStates.stone_walls_3);
				return this;
			}
			public final Gui.Image.States stone_walls_4(){
				changeState(ImageStates.stone_walls_4);
				return this;
			}
			public final Gui.Image.States stone_walls_5(){
				changeState(ImageStates.stone_walls_5);
				return this;
			}
			public final Gui.Image.States mayors_desk_0(){
				changeState(ImageStates.mayors_desk_0);
				return this;
			}
			public final Gui.Image.States mayors_desk_1(){
				changeState(ImageStates.mayors_desk_1);
				return this;
			}
			public final Gui.Image.States bar_0(){
				changeState(ImageStates.bar_0);
				return this;
			}
			public final Gui.Image.States bar_1(){
				changeState(ImageStates.bar_1);
				return this;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super();
				this.current=current;
				this.id=id;
				this.state=state;
			}
			public States (){
				super();
			}
		}
		public class AnimationType implements Renderable {
			protected int x = 0;
			protected int y = 0;
			public int getX(){
				return x;
			}
			public void setX(int newX){
				x=newX;
			}
			public int getY(){
				return y;
			}
			public void setY(int newY){
				y=newY;
			}
			public AnimationType (int x,int y){
				this.x=x;
				this.y=y;
			}
			public void animate(){
			}
			public void render(){
				GL11.glTexCoordPointer(2,0,textureBuffer[x][y]);
			}
			public void animationRender(){
				GL11.glTexCoordPointer(2,0,textureBuffer[x][y]);
			}
			public int getTexture(){
				return getImageTexture();
			}
			public void tick(Double millisSinceLastFrame){
				animate();
				setFrameX(x);
				setFrameY(y);
			}
			public void setFrameX(int newX){
				this.x=newX;
			}
			public void setFrameY(int newY){
				this.y=newY;
			}
			public Gui.Image.AnimationType.Stationary createStationary(){
				return new Gui.Image.AnimationType.Stationary();
			}
			public Gui.Image.AnimationType.Progression createProgression(){
				return new Gui.Image.AnimationType.Progression();
			}
			public Gui.Image.AnimationType.Progression.X createProgressionX(){
				return new Gui.Image.AnimationType.Progression().createX();
			}
			public Gui.Image.AnimationType.Progression.Y createProgressionY(){
				return new Gui.Image.AnimationType.Progression().createY();
			}
			public Gui.Image.AnimationType.Progression.Bounded createProgressionBounded(int startX,int startY,int endX,int endY){
				return new Gui.Image.AnimationType.Progression().createBounded(startX,startY,endX,endY);
			}
			public Gui.Image.AnimationType.Progression.Bounded.X createProgressionBoundedX(int startX,int startY,int endX,int endY){
				return new Gui.Image.AnimationType.Progression().createBoundedX(startX,startY,endX,endY);
			}
			public Gui.Image.AnimationType.Progression.Bounded.Y createProgressionBoundedY(int startX,int startY,int endX,int endY){
				return new Gui.Image.AnimationType.Progression().createBoundedY(startX,startY,endX,endY);
			}
			public Gui.Image.AnimationType.Cycle createCycle(int direction){
				return new Gui.Image.AnimationType.Cycle(direction);
			}
			public Gui.Image.AnimationType.Cycle.X createCycleX(int direction){
				return new Gui.Image.AnimationType.Cycle(direction).createX();
			}
			public Gui.Image.AnimationType.Cycle.Y createCycleY(int direction){
				return new Gui.Image.AnimationType.Cycle(direction).createY();
			}
			public Gui.Image.AnimationType.Cycle.Bounded createCycleBounded(int direction,int startX,int startY,int endX,int endY){
				return new Gui.Image.AnimationType.Cycle(direction).createBounded(startX,startY,endX,endY);
			}
			public Gui.Image.AnimationType.Cycle.Bounded.X createCycleBoundedX(int direction,int startX,int startY,int endX,int endY){
				return new Gui.Image.AnimationType.Cycle(direction).createBoundedX(startX,startY,endX,endY);
			}
			public Gui.Image.AnimationType.Cycle.Bounded.Y createCycleBoundedY(int direction,int startX,int startY,int endX,int endY){
				return new Gui.Image.AnimationType.Cycle(direction).createBoundedY(startX,startY,endX,endY);
			}
			public AnimationType (){
				super();
			}
			public class Stationary implements Gui.Renderable {
				public void animate(){
				}
				public void render(){
					animationRender();
				}
				public int getTexture(){
					return getImageTexture();
				}
				public Stationary (){
				}
			}
			public class Progression implements Gui.Renderable {
				public void animate(){
				}
				public void render(){
					animationRender();
				}
				public int getTexture(){
					return getImageTexture();
				}
				public Progression (){
				}
				public Gui.Image.AnimationType.Progression.X createX(){
					return new Gui.Image.AnimationType.Progression.X();
				}
				public Gui.Image.AnimationType.Progression.Y createY(){
					return new Gui.Image.AnimationType.Progression.Y();
				}
				public Gui.Image.AnimationType.Progression.Bounded createBounded(int startX,int startY,int endX,int endY){
					return new Gui.Image.AnimationType.Progression.Bounded(startX,startY,endX,endY);
				}
				public Gui.Image.AnimationType.Progression.Bounded.X createBoundedX(int startX,int startY,int endX,int endY){
					return new Gui.Image.AnimationType.Progression.Bounded(startX,startY,endX,endY).createX();
				}
				public Gui.Image.AnimationType.Progression.Bounded.Y createBoundedY(int startX,int startY,int endX,int endY){
					return new Gui.Image.AnimationType.Progression.Bounded(startX,startY,endX,endY).createY();
				}
				public class X implements Gui.Renderable {
					public void animate(){
						x+=1;
						if((x==frames.getWidth())){
							x=0;
						}
					}
					public void render(){
						animationRender();
					}
					public int getTexture(){
						return getImageTexture();
					}
					public X (){
					}
				}
				public class Y implements Gui.Renderable {
					public void animate(){
						y+=1;
						if((y==frames.getHeight())){
							y=0;
						}
					}
					public void render(){
						animationRender();
					}
					public int getTexture(){
						return getImageTexture();
					}
					public Y (){
					}
				}
				public class Bounded implements Gui.Renderable {
					protected int startX = 0;
					protected int startY = 0;
					protected int endX = 0;
					protected int endY = 0;
					public void animate(){
					}
					public void render(){
						animationRender();
					}
					public int getTexture(){
						return getImageTexture();
					}
					public int getStartX(){
						return startX;
					}
					public void setStartX(int newStartX){
						startX=newStartX;
					}
					public int getStartY(){
						return startY;
					}
					public void setStartY(int newStartY){
						startY=newStartY;
					}
					public int getEndX(){
						return endX;
					}
					public void setEndX(int newEndX){
						endX=newEndX;
					}
					public int getEndY(){
						return endY;
					}
					public void setEndY(int newEndY){
						endY=newEndY;
					}
					public Bounded (int startX,int startY,int endX,int endY){
						this.startX=startX;
						this.startY=startY;
						this.endX=endX;
						this.endY=endY;
					}
					public Gui.Image.AnimationType.Progression.Bounded.X createX(){
						return new Gui.Image.AnimationType.Progression.Bounded.X();
					}
					public Gui.Image.AnimationType.Progression.Bounded.Y createY(){
						return new Gui.Image.AnimationType.Progression.Bounded.Y();
					}
					public Bounded (){
						super();
					}
					public class X implements Gui.Renderable {
						public void animate(){
							x+=1;
							if((x==endX)){
								y+=1;
							}
							if((x==endX)){
								x=startX;
							}
							if((y==endY)){
								y=startY;
							}
						}
						public void render(){
							animationRender();
						}
						public int getTexture(){
							return getImageTexture();
						}
						public X (){
						}
					}
					public class Y implements Gui.Renderable {
						public void animate(){
							y+=1;
							if((y==endY)){
								x+=1;
							}
							if((y==endY)){
								y=startY;
							}
							if((x==endX)){
								x=startX;
							}
						}
						public void render(){
							animationRender();
						}
						public int getTexture(){
							return getImageTexture();
						}
						public Y (){
						}
					}
				}
			}
			public class Cycle implements Gui.Renderable {
				protected int direction = 1;
				public void animate(){
				}
				public void render(){
					animationRender();
				}
				public int getTexture(){
					return getImageTexture();
				}
				public int getDirection(){
					return direction;
				}
				public void setDirection(int newDirection){
					direction=newDirection;
				}
				public Cycle (int direction){
					this.direction=direction;
				}
				public Gui.Image.AnimationType.Cycle.X createX(){
					return new Gui.Image.AnimationType.Cycle.X();
				}
				public Gui.Image.AnimationType.Cycle.Y createY(){
					return new Gui.Image.AnimationType.Cycle.Y();
				}
				public Gui.Image.AnimationType.Cycle.Bounded createBounded(int startX,int startY,int endX,int endY){
					return new Gui.Image.AnimationType.Cycle.Bounded(startX,startY,endX,endY);
				}
				public Gui.Image.AnimationType.Cycle.Bounded.X createBoundedX(int startX,int startY,int endX,int endY){
					return new Gui.Image.AnimationType.Cycle.Bounded(startX,startY,endX,endY).createX();
				}
				public Gui.Image.AnimationType.Cycle.Bounded.Y createBoundedY(int startX,int startY,int endX,int endY){
					return new Gui.Image.AnimationType.Cycle.Bounded(startX,startY,endX,endY).createY();
				}
				public Cycle (){
					super();
				}
				public class X implements Gui.Renderable {
					public void animate(){
						x+=direction;
						if((x==frames.getWidth()-1)){
							direction=-1;
						}
						if((x==0)){
							direction=1;
						}
					}
					public void render(){
						animationRender();
					}
					public int getTexture(){
						return getImageTexture();
					}
					public X (){
					}
				}
				public class Y implements Gui.Renderable {
					public void animate(){
						y+=direction;
						if((y==frames.getHeight())){
							direction=-1;
						}
						if((y==0)){
							direction=1;
						}
					}
					public void render(){
						animationRender();
					}
					public int getTexture(){
						return getImageTexture();
					}
					public Y (){
					}
				}
				public class Bounded implements Gui.Renderable {
					protected int startX = 0;
					protected int startY = 0;
					protected int endX = 0;
					protected int endY = 0;
					public void animate(){
					}
					public void render(){
						animationRender();
					}
					public int getTexture(){
						return getImageTexture();
					}
					public int getStartX(){
						return startX;
					}
					public void setStartX(int newStartX){
						startX=newStartX;
					}
					public int getStartY(){
						return startY;
					}
					public void setStartY(int newStartY){
						startY=newStartY;
					}
					public int getEndX(){
						return endX;
					}
					public void setEndX(int newEndX){
						endX=newEndX;
					}
					public int getEndY(){
						return endY;
					}
					public void setEndY(int newEndY){
						endY=newEndY;
					}
					public Bounded (int startX,int startY,int endX,int endY){
						this.startX=startX;
						this.startY=startY;
						this.endX=endX;
						this.endY=endY;
					}
					public Gui.Image.AnimationType.Cycle.Bounded.X createX(){
						return new Gui.Image.AnimationType.Cycle.Bounded.X();
					}
					public Gui.Image.AnimationType.Cycle.Bounded.Y createY(){
						return new Gui.Image.AnimationType.Cycle.Bounded.Y();
					}
					public Bounded (){
						super();
					}
					public class X implements Gui.Renderable {
						public void animate(){
							x+=direction;
							if((direction==1&&x==endX&&y<endY&&direction==-1&&x==startX&&y>startY)){
								y+=direction;
							}
							if((direction==1&&x==endX&&y<endY)){
								x=startX;
							}
							if((direction==-1&&x==startX&&y>startY)){
								x=endX;
							}
							if((direction==1&&x==endX&&y==endY)){
								direction=-1;
							}
							if((direction==-1&&x==startX&&y==startY)){
								direction=1;
							}
						}
						public void render(){
							animationRender();
						}
						public int getTexture(){
							return getImageTexture();
						}
						public X (){
						}
					}
					public class Y implements Gui.Renderable {
						public void animate(){
							y+=direction;
							if((direction==1&&y==endY&&x<endX&&direction==-1&&y==startY&&x>startX)){
								x+=direction;
							}
							if((direction==1&&y==endY&&x<endX)){
								y=startY;
							}
							if((direction==-1&&y==startY&&x>startX)){
								y=endY;
							}
							if((direction==1&&y==endY&&x==endX)){
								direction=-1;
							}
							if((direction==-1&&y==startY&&x==startX)){
								direction=1;
							}
						}
						public void render(){
							animationRender();
						}
						public int getTexture(){
							return getImageTexture();
						}
						public Y (){
						}
					}
				}
			}
		}
	}
	public static class Colour {
		public Float getRedF(){
			return null;
		}
		public Float getGreenF(){
			return null;
		}
		public Float getBlueF(){
			return null;
		}
		public Integer getRedI(){
			return null;
		}
		public Integer getGreenI(){
			return null;
		}
		public Integer getBlueI(){
			return null;
		}
		public Float[] asFloatArray(){
			return null;
		}
		public int[] asintArray(){
			return null;
		}
		public int getTexture(){
			return 0;
		}
		public void render(){
		}
		public void endRender(){
		}
		public Colour (){
			super();
		}
	}
	public static class Drawable {
		protected FloatBuffer vertexBuffer = null;
		protected List<Gui.Drawable.ChangeListener> changeListeners = null;
		protected float visualX = 0f;
		protected float visualY = 0f;
		protected float visualWidth = 1f;
		protected float visualHeight = 1f;
		protected float visualRotationPointX = 0f;
		protected float visualRotationPointY = 0f;
		protected float visualAngle = 0f;
		protected float angle = 0f;
		protected Renderer.Layer displayLayer = null;
		public FloatBuffer getVertexBuffer(){
			return vertexBuffer;
		}
		public void setVertexBuffer(FloatBuffer newVertexBuffer){
			vertexBuffer=newVertexBuffer;
		}
		public List<Gui.Drawable.ChangeListener> getChangeListeners(){
			return changeListeners;
		}
		public void setChangeListeners(List<Gui.Drawable.ChangeListener> newChangeListeners){
			changeListeners=newChangeListeners;
		}
		public float getVisualX(){
			return visualX;
		}
		public void setVisualX(float newVisualX){
			visualX=newVisualX;
			if(changeListeners!=null){
				for(Gui.Drawable.ChangeListener changeListener:changeListeners){
					changeListener.setVisualX(newVisualX);
				}
			}
		}
		public float getVisualY(){
			return visualY;
		}
		public void setVisualY(float newVisualY){
			visualY=newVisualY;
			if(changeListeners!=null){
				for(Gui.Drawable.ChangeListener changeListener:changeListeners){
					changeListener.setVisualY(newVisualY);
				}
			}
		}
		public float getVisualWidth(){
			return visualWidth;
		}
		public void setVisualWidth(float newVisualWidth){
			visualWidth=newVisualWidth;
			if(changeListeners!=null){
				for(Gui.Drawable.ChangeListener changeListener:changeListeners){
					changeListener.setVisualWidth(newVisualWidth);
				}
			}
		}
		public float getVisualHeight(){
			return visualHeight;
		}
		public void setVisualHeight(float newVisualHeight){
			visualHeight=newVisualHeight;
			if(changeListeners!=null){
				for(Gui.Drawable.ChangeListener changeListener:changeListeners){
					changeListener.setVisualHeight(newVisualHeight);
				}
			}
		}
		public float getVisualRotationPointX(){
			return visualRotationPointX;
		}
		public void setVisualRotationPointX(float newVisualRotationPointX){
			visualRotationPointX=newVisualRotationPointX;
		}
		public float getVisualRotationPointY(){
			return visualRotationPointY;
		}
		public void setVisualRotationPointY(float newVisualRotationPointY){
			visualRotationPointY=newVisualRotationPointY;
		}
		public float getVisualAngle(){
			return visualAngle;
		}
		public void setVisualAngle(float newVisualAngle){
			visualAngle=newVisualAngle;
		}
		public float getAngle(){
			return angle;
		}
		public void setAngle(float newAngle){
			visualAngle=(float)(180.0*newAngle/Math.PI);
			angle=newAngle;
			if(changeListeners!=null){
				for(Gui.Drawable.ChangeListener changeListener:changeListeners){
					changeListener.setAngle(newAngle);
				}
			}
		}
		public Renderer.Layer getDisplayLayer(){
			return displayLayer;
		}
		public void setDisplayLayer(Renderer.Layer newDisplayLayer){
			displayLayer=newDisplayLayer;
		}
		public void display(){
			if(displayLayer==null){
				displayLayer=Renderer.botLayer;
				displayLayer.add(this);
			}
		}
		public void undisplay(){
			if(displayLayer==null){
				Renderer.botLayer.remove(this);
			}
			else{
				displayLayer.remove(this);
				displayLayer=null;
			}
		}
		public void display(Renderer.Layer layer){
			if(displayLayer==null){
				displayLayer=layer;
				displayLayer.add(this);
			}
			else if(displayLayer!=layer){
				displayLayer.remove(this);
				displayLayer=layer;
				displayLayer.add(this);
			}
		}
		public void undisplay(Renderer.Layer layer){
			if(displayLayer!=null){
				displayLayer.remove(this);
			}
			if(layer!=null){
				layer.remove(this);
			}
			displayLayer=null;
		}
		public void render(){
			GL11.glPushMatrix();
			GL11.glTranslatef(visualX,visualY,0.0f);
			if(visualAngle!=0f){
				GL11.glTranslatef(visualRotationPointX,visualRotationPointY,0.0f);
				GL11.glRotatef(visualAngle,0,0,1);
				GL11.glTranslatef(-1f*visualRotationPointX,-1f*visualRotationPointY,0.0f);
			}
			GL11.glScalef(visualWidth,visualHeight,1f);
			GL11.glVertexPointer(3,0,vertexBuffer);
		}
		public void animate(){
		}
		public void load(){
		}
		public int getTexture(){
			return 0;
		}
		public Gui.Drawable image(Gui.Renderable image){
			return null;
		}
		public Gui.Drawable colour(Gui.Colour colour){
			return null;
		}
		public void add(Gui.Drawable.ChangeListener changeListener){
			if(changeListeners==null){
				changeListeners=new ArrayList<Gui.Drawable.ChangeListener>();
			}
			changeListeners.add(changeListener);
		}
		public Drawable (FloatBuffer vertexBuffer,List<Gui.Drawable.ChangeListener> changeListeners,float visualX,float visualY,float visualWidth,float visualHeight,float visualRotationPointX,float visualRotationPointY,float visualAngle,float angle,Renderer.Layer displayLayer){
			super();
			this.vertexBuffer=vertexBuffer;
			this.changeListeners=changeListeners;
			this.visualX=visualX;
			this.visualY=visualY;
			this.visualWidth=visualWidth;
			this.visualHeight=visualHeight;
			this.visualRotationPointX=visualRotationPointX;
			this.visualRotationPointY=visualRotationPointY;
			this.visualAngle=visualAngle;
			this.angle=angle;
			this.displayLayer=displayLayer;
		}
		public Drawable (){
			super();
		}
		public static enum Predefined {
		}
		public static class ChangeListener {
			public void setVisualX(Float newX){
			}
			public void setVisualY(Float newY){
			}
			public void setVisualWidth(Float newWidth){
			}
			public void setVisualHeight(Float newHeight){
			}
			public void setAngle(Float newAngle){
			}
			public ChangeListener (){
				super();
			}
		}
		public static class Multi {
			public Multi (){
				super();
			}
			public static class Image extends Drawable {
				protected Gui.Drawable[][] images = null;
				public Gui.Drawable[][] getImages(){
					return images;
				}
				public void setImages(Gui.Drawable[][] newImages){
					images=newImages;
				}
				public void setVisualX(Float newVisualX){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualX(newVisualX+j*visualWidth);
						}
					}
				}
				public void setVisualY(Float newVisualY){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualY(newVisualY+i*visualHeight);
						}
					}
				}
				public void setVisualWidth(Float newVisualWidth){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualWidth(newVisualWidth);
						}
					}
				}
				public void setVisualHeight(Float newVisualHeight){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualHeight(newVisualHeight);
						}
					}
				}
				public void setVisualRotationPointX(Float newVisualRotationPointX){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualRotationPointX(newVisualRotationPointX);
						}
					}
				}
				public void setVisualRotationPointY(Float newVisualRotationPointY){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualRotationPointY(newVisualRotationPointY);
						}
					}
				}
				public void setVisualAngle(Float newVisualAngle){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setVisualAngle(newVisualAngle);
						}
					}
				}
				public void setAngle(Float newAngle){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].setAngle(newAngle);
						}
					}
				}
				public void display(){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].display();
						}
					}
				}
				public void undisplay(){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].undisplay();
						}
					}
				}
				public void display(Renderer.Layer layer){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].display(layer);
						}
					}
				}
				public void undisplay(Renderer.Layer layer){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].undisplay(layer);
						}
					}
				}
				public void render(){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].render();
						}
					}
				}
				public void animate(){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].animate();
						}
					}
				}
				public void load(){
					for(int i = 0;i<images.length;++i){
						for(int j = 0;j<images[i].length;++j){
							images[i][j].load();
						}
					}
				}
				public int getTexture(){
					return images[0][0].getTexture();
				}
				public Image (Gui.Drawable[][] images){
					super();
					this.images=images;
				}
				public Image (){
					super();
				}
			}
		}
	}
}
