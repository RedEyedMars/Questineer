package com.rem.qstnr.gui;
import java.util.ArrayList;
import org.lwjgl.util.glu.GLU;
import com.rem.qstnr.gui.Gui;
import java.util.List;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.input.Keyboard;
import org.lwjgl.Sys;
import java.util.LinkedList;
import org.lwjgl.opengl.DisplayMode;
import com.rem.qstnr.gui.Renderer;
import org.lwjgl.opengl.Display;
public class Renderer {
	protected Renderer.Animator animator = null;
	protected float viewX = 0f;
	protected float viewY = 0f;
	protected float viewZ = 0f;
	protected float aspectRatio = 0f;
	protected int viewportX = 0;
	protected int viewportY = 0;
	protected int viewportWidth = 0;
	protected int viewportHeight = 0;
	protected long ticksPerSecond = 0L;
	protected long animationInterval = 180L;
	protected long previousAnimationTime = 0L;
	protected long lastFrameTime = 0L;
	protected double secondsSinceLastFrame = 0.0;
	protected double avgSecsPerFrame = 0.01;
	protected int frameCount = 0;
	public static Renderer.Layer baseLayer = new Renderer.Layer();
	public static Renderer.Layer botLayer = new Renderer.Layer();
	public static Renderer.Layer midLayer = new Renderer.Layer();
	public static Renderer.Layer topLayer = new Renderer.Layer();
	public Renderer.Animator getAnimator(){
		return animator;
	}
	public void setAnimator(Renderer.Animator newAnimator){
		animator=newAnimator;
	}
	public float getViewX(){
		return viewX;
	}
	public void setViewX(float newViewX){
		viewX=newViewX;
	}
	public float getViewY(){
		return viewY;
	}
	public void setViewY(float newViewY){
		viewY=newViewY;
	}
	public float getViewZ(){
		return viewZ;
	}
	public void setViewZ(float newViewZ){
		viewZ=newViewZ;
	}
	public float getAspectRatio(){
		return aspectRatio;
	}
	public void setAspectRatio(float newAspectRatio){
		aspectRatio=newAspectRatio;
	}
	public int getViewportX(){
		return viewportX;
	}
	public void setViewportX(int newViewportX){
		viewportX=newViewportX;
	}
	public int getViewportY(){
		return viewportY;
	}
	public void setViewportY(int newViewportY){
		viewportY=newViewportY;
	}
	public int getViewportWidth(){
		return viewportWidth;
	}
	public void setViewportWidth(int newViewportWidth){
		viewportWidth=newViewportWidth;
	}
	public int getViewportHeight(){
		return viewportHeight;
	}
	public void setViewportHeight(int newViewportHeight){
		viewportHeight=newViewportHeight;
	}
	public long getTicksPerSecond(){
		return ticksPerSecond;
	}
	public void setTicksPerSecond(long newTicksPerSecond){
		ticksPerSecond=newTicksPerSecond;
	}
	public long getAnimationInterval(){
		return animationInterval;
	}
	public void setAnimationInterval(long newAnimationInterval){
		animationInterval=newAnimationInterval;
	}
	public long getPreviousAnimationTime(){
		return previousAnimationTime;
	}
	public void setPreviousAnimationTime(long newPreviousAnimationTime){
		previousAnimationTime=newPreviousAnimationTime;
	}
	public long getLastFrameTime(){
		return lastFrameTime;
	}
	public void setLastFrameTime(long newLastFrameTime){
		lastFrameTime=newLastFrameTime;
	}
	public double getSecondsSinceLastFrame(){
		return secondsSinceLastFrame;
	}
	public void setSecondsSinceLastFrame(double newSecondsSinceLastFrame){
		secondsSinceLastFrame=newSecondsSinceLastFrame;
	}
	public double getAvgSecsPerFrame(){
		return avgSecsPerFrame;
	}
	public void setAvgSecsPerFrame(double newAvgSecsPerFrame){
		avgSecsPerFrame=newAvgSecsPerFrame;
	}
	public int getFrameCount(){
		return frameCount;
	}
	public void setFrameCount(int newFrameCount){
		frameCount=newFrameCount;
	}
	public static void add(Gui.Drawable drawable,Renderer.Layer layer){
		layer.add(drawable);
	}
	public static void remove(Gui.Drawable drawable,Renderer.Layer layer){
		layer.remove(drawable);
	}
	public static Gui.Drawable add(Gui.Drawable drawable,Gui.Renderable image,Renderer.Layer layer){
		drawable=drawable.image(image);
		layer.add(drawable);
		return drawable;
	}
	public void render(){
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glLoadIdentity();
		GLU.gluLookAt(0f,0f,1f,0f,0f,0f,0f,1f,0f);
		GL11.glTranslatef(-0.7521f+viewX,-0.565f+viewY,-1.107f+viewZ);
		GL11.glScalef(1.504f,1.12875f,1f);
		if(System.currentTimeMillis()-previousAnimationTime>animationInterval){
			previousAnimationTime=System.currentTimeMillis();
			animator.animate();
		}
		GL11.glEnableClientState(GL11.GL_VERTEX_ARRAY);
		GL11.glEnableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		GL11.glFrontFace(GL11.GL_CW);
		GL11.glPushMatrix();
		baseLayer.render();
botLayer.render();
midLayer.render();
topLayer.render();
;
		GL11.glPopMatrix();
		GL11.glDisableClientState(GL11.GL_VERTEX_ARRAY);
		GL11.glDisableClientState(GL11.GL_TEXTURE_COORD_ARRAY);
		++frameCount;
		if(Sys.getTime()-lastFrameTime>ticksPerSecond){
			frameCount=0;
		}
	}
	public void load(DisplayMode displayMode){
		baseLayer.load();
botLayer.load();
midLayer.load();
topLayer.load();
;
		try{
			ticksPerSecond=Sys.getTimerResolution();
			if(aspectRatio==0f){
				aspectRatio=(float)displayMode.getWidth()/(float)displayMode.getHeight();
			}
			viewportHeight=displayMode.getHeight();
			viewportWidth=(int)((float)displayMode.getHeight()*(float)aspectRatio);
			if(viewportWidth>displayMode.getWidth()){
				viewportWidth=displayMode.getWidth();
				viewportHeight=(int)(displayMode.getWidth()/aspectRatio);
			}
			viewportX=(displayMode.getWidth()-viewportWidth)/2;
			viewportY=(displayMode.getHeight()-viewportHeight)/2;
			GL11.glEnable(GL11.GL_DEPTH_TEST);
			GL11.glDepthFunc(GL11.GL_LEQUAL);
			GL11.glClearColor(0f,0f,0f,1f);
			GL11.glEnable(GL11.GL_NORMALIZE);
			GL11.glEnable(GL11.GL_CULL_FACE);
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glEnable(GL11.GL_ALPHA_TEST);
			GL11.glAlphaFunc(GL11.GL_GREATER,0f);
			GL11.glLightModeli(GL12.GL_LIGHT_MODEL_COLOR_CONTROL,GL12.GL_SEPARATE_SPECULAR_COLOR);
			GL11.glViewport(viewportX,viewportY,viewportWidth,viewportHeight);
			setPerspective();
			GL11.glMatrixMode(GL11.GL_MODELVIEW);
			GL11.glLoadIdentity();
			updateTimer();
			Display.update();
			animator=new Renderer.Animator();
			animator.start();
		}
		catch(Exception e0){
			e0.printStackTrace();
			System.err.println("Renderer Load Failed");
		}
	}
	public void end(){
		Keyboard.destroy();
		Display.destroy();
		animator.end();
		baseLayer.end();
		botLayer.end();
		midLayer.end();
		topLayer.end();
	}
	public void setPerspective(){
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GLU.gluPerspective(40f,aspectRatio,1f,1000f);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
	}
	public void updateTimer(){
		double numToAvg = 50.0;
		secondsSinceLastFrame=(double)(Sys.getTime()-lastFrameTime)/(double)ticksPerSecond;
		lastFrameTime=Sys.getTime();
		if(secondsSinceLastFrame<1){
			avgSecsPerFrame=avgSecsPerFrame*numToAvg+secondsSinceLastFrame;
			avgSecsPerFrame/=numToAvg+1.0;
		}
	}
	public void moveView(float moveX,float moveY){
		viewX+=moveX;
		viewY+=moveY;
	}
	public Renderer (Renderer.Animator animator,float viewX,float viewY,float viewZ,float aspectRatio,int viewportX,int viewportY,int viewportWidth,int viewportHeight,long ticksPerSecond,long animationInterval,long previousAnimationTime,long lastFrameTime,double secondsSinceLastFrame,double avgSecsPerFrame,int frameCount){
		super();
		this.animator=animator;
		this.viewX=viewX;
		this.viewY=viewY;
		this.viewZ=viewZ;
		this.aspectRatio=aspectRatio;
		this.viewportX=viewportX;
		this.viewportY=viewportY;
		this.viewportWidth=viewportWidth;
		this.viewportHeight=viewportHeight;
		this.ticksPerSecond=ticksPerSecond;
		this.animationInterval=animationInterval;
		this.previousAnimationTime=previousAnimationTime;
		this.lastFrameTime=lastFrameTime;
		this.secondsSinceLastFrame=secondsSinceLastFrame;
		this.avgSecsPerFrame=avgSecsPerFrame;
		this.frameCount=frameCount;
	}
	public Renderer (){
		super();
	}
	public static class Layer extends Thread {
		public static int UNSTARTED = -1;
		public static int WAITING_FOR_EVENT = 0;
		public static int PROCESSING_EVENTS = 1;
		protected List<Gui.Drawable> layer = new ArrayList<Gui.Drawable>();
		protected LinkedList<ControlEvent> events = new LinkedList<ControlEvent>();
		protected int status = UNSTARTED;
		public List<Gui.Drawable> getLayer(){
			return layer;
		}
		public void setLayer(List<Gui.Drawable> newLayer){
			layer=newLayer;
		}
		public LinkedList<ControlEvent> getEvents(){
			return events;
		}
		public void setEvents(LinkedList<ControlEvent> newEvents){
			events=newEvents;
		}
		public int getStatus(){
			return status;
		}
		public void setStatus(int newStatus){
			status=newStatus;
		}
		public void add(Gui.Drawable toAdd){
			synchronized(events){
				events.push(new Layer.Addition(toAdd));
				if(status==WAITING_FOR_EVENT){
					events.notifyAll();
				}
			}
		}
		public void remove(Gui.Drawable toRemove){
			synchronized(events){
				events.push(new Layer.Removal(toRemove));
				if(status==WAITING_FOR_EVENT){
					events.notifyAll();
				}
			}
		}
		public void run(){
			try{
				while(Gui.isRunning){
					synchronized(events){
						while(Gui.isRunning&&events.isEmpty()){
							status=WAITING_FOR_EVENT;
							events.wait();
							status=PROCESSING_EVENTS;
						}
					}
					while(Gui.isRunning){
						synchronized(layer){
							synchronized(events){
								if(events.isEmpty()){
									break;
								}
								events.pollFirst().act();
							}
						}
					}
				}
			}
			catch(Exception e0){
				e0.printStackTrace();
			}
		}
		public void end(){
			if(status==WAITING_FOR_EVENT){
				synchronized(events){
					events.notifyAll();
				}
			}
		}
		public void load(){
			start();
		}
		public void render(){
			int previousTexture = -2;
			synchronized(layer){
				for(Gui.Drawable drawable:layer){
					if(drawable.getTexture()!=previousTexture){
						previousTexture=drawable.getTexture();
						GL11.glBindTexture(GL11.GL_TEXTURE_2D,previousTexture);
					}
					drawable.render();
				}
			}
		}
		public void animate(){
			for(int j = 0;j<layer.size();++j){
				layer.get(j).animate();
			}
		}
		public Layer (List<Gui.Drawable> layer,LinkedList<ControlEvent> events,int status){
			super();
			this.layer=layer;
			this.events=events;
			this.status=status;
		}
		public Layer (){
			super();
		}
		public static class ControlEvent {
			public void act(){
			}
			public ControlEvent (){
				super();
			}
		}
		public class Addition extends ControlEvent {
			protected Gui.Drawable toAdd = null;
			public Gui.Drawable getToAdd(){
				return toAdd;
			}
			public void setToAdd(Gui.Drawable newToAdd){
				toAdd=newToAdd;
			}
			public Addition (Gui.Drawable toAdd){
				this.toAdd=toAdd;
			}
			public void act(){
				layer.add(toAdd);
			}
			public Addition (){
				super();
			}
		}
		public class Removal extends ControlEvent {
			protected Gui.Drawable toRemove = null;
			public Gui.Drawable getToRemove(){
				return toRemove;
			}
			public void setToRemove(Gui.Drawable newToRemove){
				toRemove=newToRemove;
			}
			public Removal (Gui.Drawable toRemove){
				this.toRemove=toRemove;
			}
			public void act(){
				layer.remove(toRemove);
			}
			public Removal (){
				super();
			}
		}
	}
	public static class Animator extends Thread {
		protected int animationTicks = 0;
		public int getAnimationTicks(){
			return animationTicks;
		}
		public void setAnimationTicks(int newAnimationTicks){
			animationTicks=newAnimationTicks;
		}
		public void run(){
			while(Gui.isRunning){
				synchronized(this){
					while(Gui.isRunning&&animationTicks<1){
						try{
							wait();
						}
						catch(InterruptedException e0){
							e0.printStackTrace();
						}
					}
					animationTicks-=1;
				}
				baseLayer.animate();
botLayer.animate();
midLayer.animate();
topLayer.animate();
;
			}
		}
		public void animate(){
			synchronized(this){
				++animationTicks;
				notifyAll();
			}
		}
		public void end(){
			if(animationTicks<1){
				synchronized(this){
					++animationTicks;
					notifyAll();
				}
			}
		}
		public Animator (int animationTicks){
			super();
			this.animationTicks=animationTicks;
		}
		public Animator (){
			super();
		}
	}
}
