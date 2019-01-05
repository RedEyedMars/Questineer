package com.rem.qstnr.gui.images;
import java.util.HashMap;
import java.nio.FloatBuffer;
import java.nio.ByteOrder;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import org.lwjgl.util.glu.GLU;
import java.awt.image.PixelGrabber;
import com.rem.qstnr.gui.Gui;
import org.lwjgl.opengl.GL11;
import com.rem.qstnr.gui.images.Images;
import java.nio.ByteBuffer;
import com.rem.qstnr.gui.images.Drawables;
import java.nio.IntBuffer;
import com.rem.qstnr.gui.images.ImageLoader;
import java.util.Map;
import java.io.File;
public class ImageLoader {
	protected FloatBuffer placeHolder = null;
	protected Map<Integer, Map<Integer, FloatBuffer[][]>> textureBuffers = new HashMap<Integer, Map<Integer, FloatBuffer[][]>>();
	protected Thread loadTextureBuffer8x1Loader = new ImageLoader.TextureBuffer8x1Loader();
	protected Thread loadTextureBuffer8x4Loader = new ImageLoader.TextureBuffer8x4Loader();
	public FloatBuffer getPlaceHolder(){
		return placeHolder;
	}
	public void setPlaceHolder(FloatBuffer newPlaceHolder){
		placeHolder=newPlaceHolder;
	}
	public void load(){
		Drawables.hexagon.load();
		Drawables.isosquare.load();
		Drawables.square.load();
		ImageData256x256Loader ___Resource_gui_images_townDataLoader = new ImageData256x256Loader("../Resource/gui/images/town.png");
		___Resource_gui_images_townDataLoader.start();
		ImageData256x128Loader ___Resource_gui_images_chestsDataLoader = new ImageData256x128Loader("../Resource/gui/images/chests.png");
		___Resource_gui_images_chestsDataLoader.start();
		ImageData256x128Loader ___Resource_gui_images_outsideDataLoader = new ImageData256x128Loader("../Resource/gui/images/outside.png");
		___Resource_gui_images_outsideDataLoader.start();
		ImageData256x128Loader ___Resource_gui_images_forestDataLoader = new ImageData256x128Loader("../Resource/gui/images/forest.png");
		___Resource_gui_images_forestDataLoader.start();
		ImageData256x128Loader ___Resource_gui_images_foliageDataLoader = new ImageData256x128Loader("../Resource/gui/images/foliage.png");
		___Resource_gui_images_foliageDataLoader.start();
		ImageData256x128Loader ___Resource_gui_images_monsters_1DataLoader = new ImageData256x128Loader("../Resource/gui/images/monsters_1.png");
		___Resource_gui_images_monsters_1DataLoader.start();
		loadTextureBuffer8x4Loader.start();
		ImageData256x32Loader ___Resource_gui_images_male_walkerDataLoader = new ImageData256x32Loader("../Resource/gui/images/male_walker.png");
		___Resource_gui_images_male_walkerDataLoader.start();
		loadTextureBuffer8x1Loader.start();
		try{
			loadTextureBuffer8x1Loader.join();
		}
		catch(InterruptedException e0){
			e0.printStackTrace();
		}
		___Resource_gui_images_male_walkerDataLoader.attachTextures(Images.male_hero_base,Images.Flipped.male_hero_base);
		try{
			loadTextureBuffer8x4Loader.join();
		}
		catch(InterruptedException e0){
			e0.printStackTrace();
		}
		___Resource_gui_images_monsters_1DataLoader.attachTextures(Images.monsters_1,Images.Flipped.monsters_1);
		___Resource_gui_images_foliageDataLoader.attachTextures(Images.foliage,Images.Flipped.foliage);
		___Resource_gui_images_forestDataLoader.attachTextures(Images.forest,Images.Flipped.forest);
		___Resource_gui_images_outsideDataLoader.attachTextures(Images.outside,Images.Flipped.outside);
		___Resource_gui_images_chestsDataLoader.attachTextures(Images.chests,Images.Flipped.chests);
		___Resource_gui_images_male_walkerDataLoader.attachTextures(Images.towns_people,Images.Flipped.towns_people);
		___Resource_gui_images_townDataLoader.attachTextures(Images.town,Images.Flipped.town);
	}
	public Map<Integer, Map<Integer, FloatBuffer[][]>> getTextureBuffers(){
		return textureBuffers;
	}
	public void setTextureBuffers(Map<Integer, Map<Integer, FloatBuffer[][]>> newTextureBuffers){
		textureBuffers=newTextureBuffers;
	}
	public Thread getLoadTextureBuffer8X1Loader(){
		return loadTextureBuffer8x1Loader;
	}
	public void setLoadTextureBuffer8X1Loader(Thread newLoadTextureBuffer8X1Loader){
		loadTextureBuffer8x1Loader=newLoadTextureBuffer8X1Loader;
	}
	public Thread getLoadTextureBuffer8X4Loader(){
		return loadTextureBuffer8x4Loader;
	}
	public void setLoadTextureBuffer8X4Loader(Thread newLoadTextureBuffer8X4Loader){
		loadTextureBuffer8x4Loader=newLoadTextureBuffer8X4Loader;
	}
	public ImageLoader (FloatBuffer placeHolder,Map<Integer, Map<Integer, FloatBuffer[][]>> textureBuffers,Thread loadTextureBuffer8x1Loader,Thread loadTextureBuffer8x4Loader){
		super();
		this.placeHolder=placeHolder;
		this.textureBuffers=textureBuffers;
		this.loadTextureBuffer8x1Loader=loadTextureBuffer8x1Loader;
		this.loadTextureBuffer8x4Loader=loadTextureBuffer8x4Loader;
	}
	public ImageLoader (){
		super();
	}
	public class TextureBuffer8x1Loader extends Thread {
		public void run(){
			FloatBuffer[][] textureBuffer = new FloatBuffer[8][1];
			ByteBuffer byteBuffer = null;
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[0][0]=byteBuffer.asFloatBuffer();
			textureBuffer[0][0].put(new float[]{0.0f,1.0f,0.0f,0.0f,0.125f,1.0f,0.125f,0.0f});
			textureBuffer[0][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[1][0]=byteBuffer.asFloatBuffer();
			textureBuffer[1][0].put(new float[]{0.125f,1.0f,0.125f,0.0f,0.25f,1.0f,0.25f,0.0f});
			textureBuffer[1][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[2][0]=byteBuffer.asFloatBuffer();
			textureBuffer[2][0].put(new float[]{0.25f,1.0f,0.25f,0.0f,0.375f,1.0f,0.375f,0.0f});
			textureBuffer[2][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[3][0]=byteBuffer.asFloatBuffer();
			textureBuffer[3][0].put(new float[]{0.375f,1.0f,0.375f,0.0f,0.5f,1.0f,0.5f,0.0f});
			textureBuffer[3][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[4][0]=byteBuffer.asFloatBuffer();
			textureBuffer[4][0].put(new float[]{0.5f,1.0f,0.5f,0.0f,0.625f,1.0f,0.625f,0.0f});
			textureBuffer[4][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[5][0]=byteBuffer.asFloatBuffer();
			textureBuffer[5][0].put(new float[]{0.625f,1.0f,0.625f,0.0f,0.75f,1.0f,0.75f,0.0f});
			textureBuffer[5][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[6][0]=byteBuffer.asFloatBuffer();
			textureBuffer[6][0].put(new float[]{0.75f,1.0f,0.75f,0.0f,0.875f,1.0f,0.875f,0.0f});
			textureBuffer[6][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[7][0]=byteBuffer.asFloatBuffer();
			textureBuffer[7][0].put(new float[]{0.875f,1.0f,0.875f,0.0f,1.0f,1.0f,1.0f,0.0f});
			textureBuffer[7][0].position(0);
			Images.male_hero_base.setTextureBuffer(textureBuffer);
			Images.Flipped.male_hero_base.setTextureBuffer(textureBuffer);
			Images.towns_people.setTextureBuffer(textureBuffer);
			Images.Flipped.towns_people.setTextureBuffer(textureBuffer);
		}
		public TextureBuffer8x1Loader (){
			super();
		}
	}
	public static class ImageData256x32Loader extends Thread {
		protected String fileName = null;
		protected ByteBuffer pixelBuffer = null;
		protected ByteBuffer flippedPixelBuffer = null;
		protected Boolean failed = false;
		public String getFileName(){
			return fileName;
		}
		public void setFileName(String newFileName){
			fileName=newFileName;
		}
		public ByteBuffer getPixelBuffer(){
			return pixelBuffer;
		}
		public void setPixelBuffer(ByteBuffer newPixelBuffer){
			pixelBuffer=newPixelBuffer;
		}
		public ByteBuffer getFlippedPixelBuffer(){
			return flippedPixelBuffer;
		}
		public void setFlippedPixelBuffer(ByteBuffer newFlippedPixelBuffer){
			flippedPixelBuffer=newFlippedPixelBuffer;
		}
		public Boolean getFailed(){
			return failed;
		}
		public void setFailed(Boolean newFailed){
			failed=newFailed;
		}
		public ImageData256x32Loader (String initialFileName){
			super();
			this.fileName=initialFileName;
		}
		public void run(){
			BufferedImage bufferedImage = null;
			try{
				bufferedImage=ImageIO.read(new File(fileName));
			}
			catch(Exception e0){
				e0.printStackTrace();
				failed=true;
				return ;
			}
			int[] pixels = new int[8192];
			PixelGrabber pixelGrabber = new PixelGrabber(bufferedImage,0,0,256,32,pixels,0,256);
			try{
				pixelGrabber.grabPixels();
			}
			catch(Exception e0){
				System.err.println("Pixel Grabbing interrupted!");
				failed=true;
				return ;
			}
			byte[] bytes = new byte[32768];
			byte[] flippedBytes = new byte[32768];
			int p = 0;
			int r = 0;
			int g = 0;
			int b = 0;
			int a = 0;
			int i = 0;
			int j = 0;
			int k = 0;
			for(int y = 0;y<32;++y){
				for(int x = 0;x<256;++x){
					i=(256*y)+x;
					j=i*4;
					k=4*(256*(y+1)-x-1);
					p=pixels[i];
					a=(p>>24)&0xFF;
					r=(p>>16)&0xFF;
					g=(p>>8)&0xFF;
					b=(p>>0)&0xFF;
					bytes[j+0]=(byte)r;
					bytes[j+1]=(byte)g;
					bytes[j+2]=(byte)b;
					bytes[j+3]=(byte)a;
					flippedBytes[k+0]=(byte)r;
					flippedBytes[k+1]=(byte)g;
					flippedBytes[k+2]=(byte)b;
					flippedBytes[k+3]=(byte)a;
				}
			}
			pixelBuffer=ByteBuffer.allocateDirect(32768).order(ByteOrder.nativeOrder());
			pixelBuffer.put(bytes).flip();
			flippedPixelBuffer=ByteBuffer.allocateDirect(32768).order(ByteOrder.nativeOrder());
			flippedPixelBuffer.put(flippedBytes).flip();
		}
		public void attachTextures(Gui.Image imageObject,Gui.Image flippedImageObject){
			try{
				super.join();
			}
			catch(InterruptedException e0){
				e0.printStackTrace();
			}
			if(failed==true){
				imageObject.setTexture(0);
				return ;
			}
			imageObject.setTexture(getTextureFromPixelBuffer(pixelBuffer));
			if(flippedImageObject!=null){
				flippedImageObject.setTexture(getTextureFromPixelBuffer(flippedPixelBuffer));
			}
		}
		public static int getTextureFromPixelBuffer(ByteBuffer pixels){
			int texture = 0;
			IntBuffer textureHandle = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
			GL11.glGenTextures(textureHandle);
			texture=textureHandle.get(0);
			GL11.glPushAttrib(GL11.GL_TEXTURE_BIT);
			GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_S,GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_T,GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
			GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,256,32,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);
			GL11.glPopAttrib();
			GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
			int result = GLU.gluBuild2DMipmaps(GL11.GL_TEXTURE_2D,GL11.GL_RGBA8,256,32,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);
			if(result!=0){
				System.err.println("GLApp.makeTextureMipMap(): Error occured while building mip map, result="+result+" error="+GLU.gluErrorString(result));
			}
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
			GL11.glTexEnvf(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);
			return texture;
		}
		public ImageData256x32Loader (String fileName,ByteBuffer pixelBuffer,ByteBuffer flippedPixelBuffer,Boolean failed){
			super();
			this.fileName=fileName;
			this.pixelBuffer=pixelBuffer;
			this.flippedPixelBuffer=flippedPixelBuffer;
			this.failed=failed;
		}
		public ImageData256x32Loader (){
			super();
		}
	}
	public class TextureBuffer8x4Loader extends Thread {
		public void run(){
			FloatBuffer[][] textureBuffer = new FloatBuffer[8][4];
			ByteBuffer byteBuffer = null;
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[0][0]=byteBuffer.asFloatBuffer();
			textureBuffer[0][0].put(new float[]{0.0f,0.25f,0.0f,0.0f,0.125f,0.25f,0.125f,0.0f});
			textureBuffer[0][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[0][1]=byteBuffer.asFloatBuffer();
			textureBuffer[0][1].put(new float[]{0.0f,0.5f,0.0f,0.25f,0.125f,0.5f,0.125f,0.25f});
			textureBuffer[0][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[0][2]=byteBuffer.asFloatBuffer();
			textureBuffer[0][2].put(new float[]{0.0f,0.75f,0.0f,0.5f,0.125f,0.75f,0.125f,0.5f});
			textureBuffer[0][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[0][3]=byteBuffer.asFloatBuffer();
			textureBuffer[0][3].put(new float[]{0.0f,1.0f,0.0f,0.75f,0.125f,1.0f,0.125f,0.75f});
			textureBuffer[0][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[1][0]=byteBuffer.asFloatBuffer();
			textureBuffer[1][0].put(new float[]{0.125f,0.25f,0.125f,0.0f,0.25f,0.25f,0.25f,0.0f});
			textureBuffer[1][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[1][1]=byteBuffer.asFloatBuffer();
			textureBuffer[1][1].put(new float[]{0.125f,0.5f,0.125f,0.25f,0.25f,0.5f,0.25f,0.25f});
			textureBuffer[1][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[1][2]=byteBuffer.asFloatBuffer();
			textureBuffer[1][2].put(new float[]{0.125f,0.75f,0.125f,0.5f,0.25f,0.75f,0.25f,0.5f});
			textureBuffer[1][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[1][3]=byteBuffer.asFloatBuffer();
			textureBuffer[1][3].put(new float[]{0.125f,1.0f,0.125f,0.75f,0.25f,1.0f,0.25f,0.75f});
			textureBuffer[1][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[2][0]=byteBuffer.asFloatBuffer();
			textureBuffer[2][0].put(new float[]{0.25f,0.25f,0.25f,0.0f,0.375f,0.25f,0.375f,0.0f});
			textureBuffer[2][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[2][1]=byteBuffer.asFloatBuffer();
			textureBuffer[2][1].put(new float[]{0.25f,0.5f,0.25f,0.25f,0.375f,0.5f,0.375f,0.25f});
			textureBuffer[2][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[2][2]=byteBuffer.asFloatBuffer();
			textureBuffer[2][2].put(new float[]{0.25f,0.75f,0.25f,0.5f,0.375f,0.75f,0.375f,0.5f});
			textureBuffer[2][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[2][3]=byteBuffer.asFloatBuffer();
			textureBuffer[2][3].put(new float[]{0.25f,1.0f,0.25f,0.75f,0.375f,1.0f,0.375f,0.75f});
			textureBuffer[2][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[3][0]=byteBuffer.asFloatBuffer();
			textureBuffer[3][0].put(new float[]{0.375f,0.25f,0.375f,0.0f,0.5f,0.25f,0.5f,0.0f});
			textureBuffer[3][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[3][1]=byteBuffer.asFloatBuffer();
			textureBuffer[3][1].put(new float[]{0.375f,0.5f,0.375f,0.25f,0.5f,0.5f,0.5f,0.25f});
			textureBuffer[3][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[3][2]=byteBuffer.asFloatBuffer();
			textureBuffer[3][2].put(new float[]{0.375f,0.75f,0.375f,0.5f,0.5f,0.75f,0.5f,0.5f});
			textureBuffer[3][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[3][3]=byteBuffer.asFloatBuffer();
			textureBuffer[3][3].put(new float[]{0.375f,1.0f,0.375f,0.75f,0.5f,1.0f,0.5f,0.75f});
			textureBuffer[3][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[4][0]=byteBuffer.asFloatBuffer();
			textureBuffer[4][0].put(new float[]{0.5f,0.25f,0.5f,0.0f,0.625f,0.25f,0.625f,0.0f});
			textureBuffer[4][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[4][1]=byteBuffer.asFloatBuffer();
			textureBuffer[4][1].put(new float[]{0.5f,0.5f,0.5f,0.25f,0.625f,0.5f,0.625f,0.25f});
			textureBuffer[4][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[4][2]=byteBuffer.asFloatBuffer();
			textureBuffer[4][2].put(new float[]{0.5f,0.75f,0.5f,0.5f,0.625f,0.75f,0.625f,0.5f});
			textureBuffer[4][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[4][3]=byteBuffer.asFloatBuffer();
			textureBuffer[4][3].put(new float[]{0.5f,1.0f,0.5f,0.75f,0.625f,1.0f,0.625f,0.75f});
			textureBuffer[4][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[5][0]=byteBuffer.asFloatBuffer();
			textureBuffer[5][0].put(new float[]{0.625f,0.25f,0.625f,0.0f,0.75f,0.25f,0.75f,0.0f});
			textureBuffer[5][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[5][1]=byteBuffer.asFloatBuffer();
			textureBuffer[5][1].put(new float[]{0.625f,0.5f,0.625f,0.25f,0.75f,0.5f,0.75f,0.25f});
			textureBuffer[5][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[5][2]=byteBuffer.asFloatBuffer();
			textureBuffer[5][2].put(new float[]{0.625f,0.75f,0.625f,0.5f,0.75f,0.75f,0.75f,0.5f});
			textureBuffer[5][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[5][3]=byteBuffer.asFloatBuffer();
			textureBuffer[5][3].put(new float[]{0.625f,1.0f,0.625f,0.75f,0.75f,1.0f,0.75f,0.75f});
			textureBuffer[5][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[6][0]=byteBuffer.asFloatBuffer();
			textureBuffer[6][0].put(new float[]{0.75f,0.25f,0.75f,0.0f,0.875f,0.25f,0.875f,0.0f});
			textureBuffer[6][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[6][1]=byteBuffer.asFloatBuffer();
			textureBuffer[6][1].put(new float[]{0.75f,0.5f,0.75f,0.25f,0.875f,0.5f,0.875f,0.25f});
			textureBuffer[6][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[6][2]=byteBuffer.asFloatBuffer();
			textureBuffer[6][2].put(new float[]{0.75f,0.75f,0.75f,0.5f,0.875f,0.75f,0.875f,0.5f});
			textureBuffer[6][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[6][3]=byteBuffer.asFloatBuffer();
			textureBuffer[6][3].put(new float[]{0.75f,1.0f,0.75f,0.75f,0.875f,1.0f,0.875f,0.75f});
			textureBuffer[6][3].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[7][0]=byteBuffer.asFloatBuffer();
			textureBuffer[7][0].put(new float[]{0.875f,0.25f,0.875f,0.0f,1.0f,0.25f,1.0f,0.0f});
			textureBuffer[7][0].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[7][1]=byteBuffer.asFloatBuffer();
			textureBuffer[7][1].put(new float[]{0.875f,0.5f,0.875f,0.25f,1.0f,0.5f,1.0f,0.25f});
			textureBuffer[7][1].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[7][2]=byteBuffer.asFloatBuffer();
			textureBuffer[7][2].put(new float[]{0.875f,0.75f,0.875f,0.5f,1.0f,0.75f,1.0f,0.5f});
			textureBuffer[7][2].position(0);
			byteBuffer=ByteBuffer.allocateDirect(2*4*4);
			byteBuffer.order(ByteOrder.nativeOrder());
			textureBuffer[7][3]=byteBuffer.asFloatBuffer();
			textureBuffer[7][3].put(new float[]{0.875f,1.0f,0.875f,0.75f,1.0f,1.0f,1.0f,0.75f});
			textureBuffer[7][3].position(0);
			Images.monsters_1.setTextureBuffer(textureBuffer);
			Images.Flipped.monsters_1.setTextureBuffer(textureBuffer);
			Images.foliage.setTextureBuffer(textureBuffer);
			Images.Flipped.foliage.setTextureBuffer(textureBuffer);
			Images.forest.setTextureBuffer(textureBuffer);
			Images.Flipped.forest.setTextureBuffer(textureBuffer);
			Images.outside.setTextureBuffer(textureBuffer);
			Images.Flipped.outside.setTextureBuffer(textureBuffer);
			Images.chests.setTextureBuffer(textureBuffer);
			Images.Flipped.chests.setTextureBuffer(textureBuffer);
			Images.town.setTextureBuffer(textureBuffer);
			Images.Flipped.town.setTextureBuffer(textureBuffer);
		}
		public TextureBuffer8x4Loader (){
			super();
		}
	}
	public static class ImageData256x128Loader extends Thread {
		protected String fileName = null;
		protected ByteBuffer pixelBuffer = null;
		protected ByteBuffer flippedPixelBuffer = null;
		protected Boolean failed = false;
		public String getFileName(){
			return fileName;
		}
		public void setFileName(String newFileName){
			fileName=newFileName;
		}
		public ByteBuffer getPixelBuffer(){
			return pixelBuffer;
		}
		public void setPixelBuffer(ByteBuffer newPixelBuffer){
			pixelBuffer=newPixelBuffer;
		}
		public ByteBuffer getFlippedPixelBuffer(){
			return flippedPixelBuffer;
		}
		public void setFlippedPixelBuffer(ByteBuffer newFlippedPixelBuffer){
			flippedPixelBuffer=newFlippedPixelBuffer;
		}
		public Boolean getFailed(){
			return failed;
		}
		public void setFailed(Boolean newFailed){
			failed=newFailed;
		}
		public ImageData256x128Loader (String initialFileName){
			super();
			this.fileName=initialFileName;
		}
		public void run(){
			BufferedImage bufferedImage = null;
			try{
				bufferedImage=ImageIO.read(new File(fileName));
			}
			catch(Exception e0){
				e0.printStackTrace();
				failed=true;
				return ;
			}
			int[] pixels = new int[32768];
			PixelGrabber pixelGrabber = new PixelGrabber(bufferedImage,0,0,256,128,pixels,0,256);
			try{
				pixelGrabber.grabPixels();
			}
			catch(Exception e0){
				System.err.println("Pixel Grabbing interrupted!");
				failed=true;
				return ;
			}
			byte[] bytes = new byte[131072];
			byte[] flippedBytes = new byte[131072];
			int p = 0;
			int r = 0;
			int g = 0;
			int b = 0;
			int a = 0;
			int i = 0;
			int j = 0;
			int k = 0;
			for(int y = 0;y<128;++y){
				for(int x = 0;x<256;++x){
					i=(256*y)+x;
					j=i*4;
					k=4*(256*(y+1)-x-1);
					p=pixels[i];
					a=(p>>24)&0xFF;
					r=(p>>16)&0xFF;
					g=(p>>8)&0xFF;
					b=(p>>0)&0xFF;
					bytes[j+0]=(byte)r;
					bytes[j+1]=(byte)g;
					bytes[j+2]=(byte)b;
					bytes[j+3]=(byte)a;
					flippedBytes[k+0]=(byte)r;
					flippedBytes[k+1]=(byte)g;
					flippedBytes[k+2]=(byte)b;
					flippedBytes[k+3]=(byte)a;
				}
			}
			pixelBuffer=ByteBuffer.allocateDirect(131072).order(ByteOrder.nativeOrder());
			pixelBuffer.put(bytes).flip();
			flippedPixelBuffer=ByteBuffer.allocateDirect(131072).order(ByteOrder.nativeOrder());
			flippedPixelBuffer.put(flippedBytes).flip();
		}
		public void attachTextures(Gui.Image imageObject,Gui.Image flippedImageObject){
			try{
				super.join();
			}
			catch(InterruptedException e0){
				e0.printStackTrace();
			}
			if(failed==true){
				imageObject.setTexture(0);
				return ;
			}
			imageObject.setTexture(getTextureFromPixelBuffer(pixelBuffer));
			if(flippedImageObject!=null){
				flippedImageObject.setTexture(getTextureFromPixelBuffer(flippedPixelBuffer));
			}
		}
		public static int getTextureFromPixelBuffer(ByteBuffer pixels){
			int texture = 0;
			IntBuffer textureHandle = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
			GL11.glGenTextures(textureHandle);
			texture=textureHandle.get(0);
			GL11.glPushAttrib(GL11.GL_TEXTURE_BIT);
			GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_S,GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_T,GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
			GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,256,128,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);
			GL11.glPopAttrib();
			GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
			int result = GLU.gluBuild2DMipmaps(GL11.GL_TEXTURE_2D,GL11.GL_RGBA8,256,128,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);
			if(result!=0){
				System.err.println("GLApp.makeTextureMipMap(): Error occured while building mip map, result="+result+" error="+GLU.gluErrorString(result));
			}
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
			GL11.glTexEnvf(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);
			return texture;
		}
		public ImageData256x128Loader (String fileName,ByteBuffer pixelBuffer,ByteBuffer flippedPixelBuffer,Boolean failed){
			super();
			this.fileName=fileName;
			this.pixelBuffer=pixelBuffer;
			this.flippedPixelBuffer=flippedPixelBuffer;
			this.failed=failed;
		}
		public ImageData256x128Loader (){
			super();
		}
	}
	public static class ImageData256x256Loader extends Thread {
		protected String fileName = null;
		protected ByteBuffer pixelBuffer = null;
		protected ByteBuffer flippedPixelBuffer = null;
		protected Boolean failed = false;
		public String getFileName(){
			return fileName;
		}
		public void setFileName(String newFileName){
			fileName=newFileName;
		}
		public ByteBuffer getPixelBuffer(){
			return pixelBuffer;
		}
		public void setPixelBuffer(ByteBuffer newPixelBuffer){
			pixelBuffer=newPixelBuffer;
		}
		public ByteBuffer getFlippedPixelBuffer(){
			return flippedPixelBuffer;
		}
		public void setFlippedPixelBuffer(ByteBuffer newFlippedPixelBuffer){
			flippedPixelBuffer=newFlippedPixelBuffer;
		}
		public Boolean getFailed(){
			return failed;
		}
		public void setFailed(Boolean newFailed){
			failed=newFailed;
		}
		public ImageData256x256Loader (String initialFileName){
			super();
			this.fileName=initialFileName;
		}
		public void run(){
			BufferedImage bufferedImage = null;
			try{
				bufferedImage=ImageIO.read(new File(fileName));
			}
			catch(Exception e0){
				e0.printStackTrace();
				failed=true;
				return ;
			}
			int[] pixels = new int[65536];
			PixelGrabber pixelGrabber = new PixelGrabber(bufferedImage,0,0,256,256,pixels,0,256);
			try{
				pixelGrabber.grabPixels();
			}
			catch(Exception e0){
				System.err.println("Pixel Grabbing interrupted!");
				failed=true;
				return ;
			}
			byte[] bytes = new byte[262144];
			byte[] flippedBytes = new byte[262144];
			int p = 0;
			int r = 0;
			int g = 0;
			int b = 0;
			int a = 0;
			int i = 0;
			int j = 0;
			int k = 0;
			for(int y = 0;y<256;++y){
				for(int x = 0;x<256;++x){
					i=(256*y)+x;
					j=i*4;
					k=4*(256*(y+1)-x-1);
					p=pixels[i];
					a=(p>>24)&0xFF;
					r=(p>>16)&0xFF;
					g=(p>>8)&0xFF;
					b=(p>>0)&0xFF;
					bytes[j+0]=(byte)r;
					bytes[j+1]=(byte)g;
					bytes[j+2]=(byte)b;
					bytes[j+3]=(byte)a;
					flippedBytes[k+0]=(byte)r;
					flippedBytes[k+1]=(byte)g;
					flippedBytes[k+2]=(byte)b;
					flippedBytes[k+3]=(byte)a;
				}
			}
			pixelBuffer=ByteBuffer.allocateDirect(262144).order(ByteOrder.nativeOrder());
			pixelBuffer.put(bytes).flip();
			flippedPixelBuffer=ByteBuffer.allocateDirect(262144).order(ByteOrder.nativeOrder());
			flippedPixelBuffer.put(flippedBytes).flip();
		}
		public void attachTextures(Gui.Image imageObject,Gui.Image flippedImageObject){
			try{
				super.join();
			}
			catch(InterruptedException e0){
				e0.printStackTrace();
			}
			if(failed==true){
				imageObject.setTexture(0);
				return ;
			}
			imageObject.setTexture(getTextureFromPixelBuffer(pixelBuffer));
			if(flippedImageObject!=null){
				flippedImageObject.setTexture(getTextureFromPixelBuffer(flippedPixelBuffer));
			}
		}
		public static int getTextureFromPixelBuffer(ByteBuffer pixels){
			int texture = 0;
			IntBuffer textureHandle = ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()).asIntBuffer();
			GL11.glGenTextures(textureHandle);
			texture=textureHandle.get(0);
			GL11.glPushAttrib(GL11.GL_TEXTURE_BIT);
			GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_S,GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_T,GL11.GL_REPEAT);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_NEAREST);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
			GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,256,256,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);
			GL11.glPopAttrib();
			GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
			int result = GLU.gluBuild2DMipmaps(GL11.GL_TEXTURE_2D,GL11.GL_RGBA8,256,256,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);
			if(result!=0){
				System.err.println("GLApp.makeTextureMipMap(): Error occured while building mip map, result="+result+" error="+GLU.gluErrorString(result));
			}
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_NEAREST);
			GL11.glTexEnvf(GL11.GL_TEXTURE_ENV,GL11.GL_TEXTURE_ENV_MODE,GL11.GL_MODULATE);
			return texture;
		}
		public ImageData256x256Loader (String fileName,ByteBuffer pixelBuffer,ByteBuffer flippedPixelBuffer,Boolean failed){
			super();
			this.fileName=fileName;
			this.pixelBuffer=pixelBuffer;
			this.flippedPixelBuffer=flippedPixelBuffer;
			this.failed=failed;
		}
		public ImageData256x256Loader (){
			super();
		}
	}
}
