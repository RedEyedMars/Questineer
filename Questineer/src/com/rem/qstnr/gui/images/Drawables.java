package com.rem.qstnr.gui.images;
import org.lwjgl.opengl.GL11;
import java.nio.FloatBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import com.rem.qstnr.gui.images.Drawables;
import com.rem.qstnr.gui.Renderer;
import com.rem.qstnr.gui.Gui;
import java.util.List;
public class Drawables {
	public static Drawables.Square square = new Drawables.Square();
	public static Drawables.Isosquare isosquare = new Drawables.Isosquare();
	public static Drawables.Hexagon hexagon = new Drawables.Hexagon();
	public Drawables (){
		super();
	}
	public static class Square extends Gui.Drawable {
		public void load(){
			float[] vertices = new float[]{0.0f,0.0f,0f,0.0f,1.0f,0f,1.0f,0.0f,0f,1.0f,1.0f,0f};
			ByteBuffer byteBuffer = ByteBuffer.allocateDirect(48);
			byteBuffer.order(ByteOrder.nativeOrder());
			vertexBuffer=byteBuffer.asFloatBuffer();
			vertexBuffer.clear();
			vertexBuffer.put(vertices);
			vertexBuffer.position(0);
		}
		public Drawables.Square image(Gui.Renderable image){
			Drawables.Square newImage = new Drawables.Square.Image(image);
			newImage.setVertexBuffer(vertexBuffer);
			return newImage;
		}
		public Drawables.Square colour(Gui.Colour colour){
			Drawables.Square newColour = new Drawables.Square.Colour(colour);
			newColour.setVertexBuffer(vertexBuffer);
			return newColour;
		}
		public Square (){
			super();
		}
		public Square (FloatBuffer vertexBuffer,List<Gui.Drawable.ChangeListener> changeListeners,float visualX,float visualY,float visualWidth,float visualHeight,float visualRotationPointX,float visualRotationPointY,float visualAngle,float angle,Renderer.Layer displayLayer){
			super(vertexBuffer,changeListeners,visualX,visualY,visualWidth,visualHeight,visualRotationPointX,visualRotationPointY,visualAngle,angle,displayLayer);
		}
		public static class Image extends Square {
			protected Gui.Renderable image = null;
			public Gui.Renderable getImage(){
				return image;
			}
			public void setImage(Gui.Renderable newImage){
				image=newImage;
			}
			public void render(){
				image.render();
				super.render();
				GL11.glDrawArrays(GL11.GL_TRIANGLE_STRIP,0,4);
				GL11.glPopMatrix();
			}
			public void animate(){
				image.animate();
			}
			public int getTexture(){
				return image.getTexture();
			}
			public Image (Gui.Renderable image){
				super();
				this.image=image;
			}
			public Image (){
				super();
			}
		}
		public static class Colour extends Square {
			protected Gui.Colour colour = null;
			public Gui.Colour getColour(){
				return colour;
			}
			public void setColour(Gui.Colour newColour){
				colour=newColour;
			}
			public void render(){
				colour.render();
				colour.endRender();
			}
			public int getTexture(){
				return colour.getTexture();
			}
			public Colour (Gui.Colour colour){
				super();
				this.colour=colour;
			}
			public Colour (){
				super();
			}
		}
	}
	public static class Isosquare extends Gui.Drawable {
		public void load(){
			float[] vertices = new float[]{0.0f,0.5f,0f,0.5f,0.75f,0f,0.5f,0.25f,0f,1.0f,0.5f,0f};
			ByteBuffer byteBuffer = ByteBuffer.allocateDirect(48);
			byteBuffer.order(ByteOrder.nativeOrder());
			vertexBuffer=byteBuffer.asFloatBuffer();
			vertexBuffer.clear();
			vertexBuffer.put(vertices);
			vertexBuffer.position(0);
		}
		public Drawables.Isosquare image(Gui.Renderable image){
			Drawables.Isosquare newImage = new Drawables.Isosquare.Image(image);
			newImage.setVertexBuffer(vertexBuffer);
			return newImage;
		}
		public Drawables.Isosquare colour(Gui.Colour colour){
			Drawables.Isosquare newColour = new Drawables.Isosquare.Colour(colour);
			newColour.setVertexBuffer(vertexBuffer);
			return newColour;
		}
		public Isosquare (){
			super();
		}
		public Isosquare (FloatBuffer vertexBuffer,List<Gui.Drawable.ChangeListener> changeListeners,float visualX,float visualY,float visualWidth,float visualHeight,float visualRotationPointX,float visualRotationPointY,float visualAngle,float angle,Renderer.Layer displayLayer){
			super(vertexBuffer,changeListeners,visualX,visualY,visualWidth,visualHeight,visualRotationPointX,visualRotationPointY,visualAngle,angle,displayLayer);
		}
		public static class Image extends Isosquare {
			protected Gui.Renderable image = null;
			public Gui.Renderable getImage(){
				return image;
			}
			public void setImage(Gui.Renderable newImage){
				image=newImage;
			}
			public void render(){
				image.render();
				super.render();
				GL11.glDrawArrays(GL11.GL_TRIANGLE_STRIP,0,4);
				GL11.glPopMatrix();
			}
			public void animate(){
				image.animate();
			}
			public int getTexture(){
				return image.getTexture();
			}
			public Image (Gui.Renderable image){
				super();
				this.image=image;
			}
			public Image (){
				super();
			}
		}
		public static class Colour extends Isosquare {
			protected Gui.Colour colour = null;
			public Gui.Colour getColour(){
				return colour;
			}
			public void setColour(Gui.Colour newColour){
				colour=newColour;
			}
			public void render(){
				colour.render();
				colour.endRender();
			}
			public int getTexture(){
				return colour.getTexture();
			}
			public Colour (Gui.Colour colour){
				super();
				this.colour=colour;
			}
			public Colour (){
				super();
			}
		}
	}
	public static class Hexagon extends Gui.Drawable {
		public void load(){
			float[] vertices = new float[]{0.0f,0.25f,0f,0.2857143f,1.0f,0f,0.2857143f,-0.5f,0f,0.71428573f,1.0f,0f,0.71428573f,-0.5f,0f,1.0f,0.25f,0f};
			ByteBuffer byteBuffer = ByteBuffer.allocateDirect(72);
			byteBuffer.order(ByteOrder.nativeOrder());
			vertexBuffer=byteBuffer.asFloatBuffer();
			vertexBuffer.clear();
			vertexBuffer.put(vertices);
			vertexBuffer.position(0);
		}
		public Drawables.Hexagon image(Gui.Renderable image){
			Drawables.Hexagon newImage = new Drawables.Hexagon.Image(image);
			newImage.setVertexBuffer(vertexBuffer);
			return newImage;
		}
		public Drawables.Hexagon colour(Gui.Colour colour){
			Drawables.Hexagon newColour = new Drawables.Hexagon.Colour(colour);
			newColour.setVertexBuffer(vertexBuffer);
			return newColour;
		}
		public Hexagon (){
			super();
		}
		public Hexagon (FloatBuffer vertexBuffer,List<Gui.Drawable.ChangeListener> changeListeners,float visualX,float visualY,float visualWidth,float visualHeight,float visualRotationPointX,float visualRotationPointY,float visualAngle,float angle,Renderer.Layer displayLayer){
			super(vertexBuffer,changeListeners,visualX,visualY,visualWidth,visualHeight,visualRotationPointX,visualRotationPointY,visualAngle,angle,displayLayer);
		}
		public static class Image extends Hexagon {
			protected Gui.Renderable image = null;
			public Gui.Renderable getImage(){
				return image;
			}
			public void setImage(Gui.Renderable newImage){
				image=newImage;
			}
			public void render(){
				image.render();
				super.render();
				GL11.glDrawArrays(GL11.GL_TRIANGLE_STRIP,0,6);
				GL11.glPopMatrix();
			}
			public void animate(){
				image.animate();
			}
			public int getTexture(){
				return image.getTexture();
			}
			public Image (Gui.Renderable image){
				super();
				this.image=image;
			}
			public Image (){
				super();
			}
		}
		public static class Colour extends Hexagon {
			protected Gui.Colour colour = null;
			public Gui.Colour getColour(){
				return colour;
			}
			public void setColour(Gui.Colour newColour){
				colour=newColour;
			}
			public void render(){
				colour.render();
				colour.endRender();
			}
			public int getTexture(){
				return colour.getTexture();
			}
			public Colour (Gui.Colour colour){
				super();
				this.colour=colour;
			}
			public Colour (){
				super();
			}
		}
	}
}
