package com.rem.qstnr.gui.images;
import com.rem.qstnr.gui.images.Images;
import java.nio.FloatBuffer;
import com.rem.qstnr.gui.images.ImageStates;
import com.rem.qstnr.gui.Gui;
public class Images {
	public static Images.MaleHeroBase male_hero_base = new Images.MaleHeroBase();
	public static Images.Monsters1 monsters_1 = new Images.Monsters1();
	public static Images.Foliage foliage = new Images.Foliage();
	public static Images.Forest forest = new Images.Forest();
	public static Images.Outside outside = new Images.Outside();
	public static Images.Chests chests = new Images.Chests();
	public static Images.Chests2 chests_2 = new Images.Chests2();
	public static Images.Chests3 chests_3 = new Images.Chests3();
	public static Images.TownsPeople towns_people = new Images.TownsPeople();
	public static Images.Town town = new Images.Town();
	public Images (){
	}
	public static class Flipped {
		public static Images.MaleHeroBase male_hero_base = new Images.MaleHeroBase();
		public static Images.Monsters1 monsters_1 = new Images.Monsters1();
		public static Images.Foliage foliage = new Images.Foliage();
		public static Images.Forest forest = new Images.Forest();
		public static Images.Outside outside = new Images.Outside();
		public static Images.Chests chests = new Images.Chests();
		public static Images.Chests2 chests_2 = new Images.Chests2();
		public static Images.Chests3 chests_3 = new Images.Chests3();
		public static Images.TownsPeople towns_people = new Images.TownsPeople();
		public static Images.Town town = new Images.Town();
		public Flipped (){
			super();
		}
	}
	public static class MaleHeroBase extends Gui.Image implements Gui.Statable {
		public MaleHeroBase (){
			imageFileName="../Resource/gui/images/male_walker.png";
			pixels=new Gui.Image.Dimensions(256,32);
			frames=new Gui.Image.Dimensions(8,1);
		}
		public Images.MaleHeroBase.States asStates(){
			return new Images.MaleHeroBase.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.MaleHeroBase.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public MaleHeroBase (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable male_idleState = Images.male_hero_base.createStationary(1,0);
			protected Gui.Renderable male_walk_rightState = Images.male_hero_base.createCycleBoundedX(1,0,1,0,0,2,0);
			protected Gui.Renderable male_walk_leftState = Images.Flipped.male_hero_base.createCycleBoundedX(6,0,-1,5,0,7,0);
			public States (){
				change_to_male();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case male :{
							change_to_male();
							return ;
						}
						case male_idle :{
							change_to_male();
							return ;
						}
						case male_walk :{
							change_to_male();
							return ;
						}
						case male_walk_right :{
							change_to_male_walk();
							return ;
						}
						case male_walk_left :{
							change_to_male_walk();
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male :{
						switch(newState){
							case male_walk :{
								change_to_male_walk();
								return ;
							}
							case walk :{
								change_to_male_walk();
								return ;
							}
							case male_idle :{
								change_to_male_idle();
								return ;
							}
							case idle :{
								change_to_male_idle();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_walk :{
						switch(newState){
							case male_walk_left :{
								change_to_male_walk_left();
								return ;
							}
							case left :{
								change_to_male_walk_left();
								return ;
							}
							case male_walk_right :{
								change_to_male_walk_right();
								return ;
							}
							case right :{
								change_to_male_walk_right();
								return ;
							}
							case male_walk :{
								change_to_male_walk();
								return ;
							}
							case walk :{
								change_to_male_walk();
								return ;
							}
							case male_idle :{
								change_to_male_idle();
								return ;
							}
							case idle :{
								change_to_male_idle();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_walk_left :{
						switch(newState){
							case male_walk_right :{
								change_to_male_walk_right();
								return ;
							}
							case right :{
								change_to_male_walk_right();
								return ;
							}
							case male_walk :{
								change_to_male_walk();
								return ;
							}
							case walk :{
								change_to_male_walk();
								return ;
							}
							case male_idle :{
								change_to_male_idle();
								return ;
							}
							case idle :{
								change_to_male_idle();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_walk_right :{
						switch(newState){
							case male_walk_left :{
								change_to_male_walk_left();
								return ;
							}
							case left :{
								change_to_male_walk_left();
								return ;
							}
							case male_walk :{
								change_to_male_walk();
								return ;
							}
							case walk :{
								change_to_male_walk();
								return ;
							}
							case male_idle :{
								change_to_male_idle();
								return ;
							}
							case idle :{
								change_to_male_idle();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_idle :{
						switch(newState){
							case male_walk :{
								change_to_male_walk();
								return ;
							}
							case walk :{
								change_to_male_walk();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.MaleHeroBase.States asStates(){
				Images.MaleHeroBase.States result = new Images.MaleHeroBase.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.MaleHeroBase.States result = new Images.MaleHeroBase.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public void change_to_male(){
				setCurrent(male_idleState);
				id=ImageStates.male;
				state=ImageStates.male;
			}
			public Gui.Renderable getMaleIdleState(){
				return male_idleState;
			}
			public void setMaleIdleState(Gui.Renderable newMaleIdleState){
				male_idleState=newMaleIdleState;
			}
			public void change_to_male_idle(){
				setCurrent(male_idleState);
				id=ImageStates.idle;
				state=ImageStates.male_idle;
			}
			public void change_to_male_walk(){
				setCurrent(male_walk_rightState);
				id=ImageStates.walk;
				state=ImageStates.male_walk;
			}
			public Gui.Renderable getMaleWalkRightState(){
				return male_walk_rightState;
			}
			public void setMaleWalkRightState(Gui.Renderable newMaleWalkRightState){
				male_walk_rightState=newMaleWalkRightState;
			}
			public void change_to_male_walk_right(){
				setCurrent(male_walk_rightState);
				id=ImageStates.right;
				state=ImageStates.male_walk_right;
			}
			public Gui.Renderable getMaleWalkLeftState(){
				return male_walk_leftState;
			}
			public void setMaleWalkLeftState(Gui.Renderable newMaleWalkLeftState){
				male_walk_leftState=newMaleWalkLeftState;
			}
			public void change_to_male_walk_left(){
				setCurrent(male_walk_leftState);
				id=ImageStates.left;
				state=ImageStates.male_walk_left;
			}
			public States (Gui.Renderable male_idleState,Gui.Renderable male_walk_rightState,Gui.Renderable male_walk_leftState){
				super();
				this.male_idleState=male_idleState;
				this.male_walk_rightState=male_walk_rightState;
				this.male_walk_leftState=male_walk_leftState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable male_idleState,Gui.Renderable male_walk_rightState,Gui.Renderable male_walk_leftState){
				super(current,id,state);
				this.male_idleState=male_idleState;
				this.male_walk_rightState=male_walk_rightState;
				this.male_walk_leftState=male_walk_leftState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Monsters1 extends Gui.Image implements Gui.Statable {
		public Monsters1 (){
			imageFileName="../Resource/gui/images/monsters_1.png";
			pixels=new Gui.Image.Dimensions(256,128);
			frames=new Gui.Image.Dimensions(8,4);
		}
		public Images.Monsters1.States asStates(){
			return new Images.Monsters1.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Monsters1.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Monsters1 (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable wolf_idleState = Images.monsters_1.createStationary(1,0);
			protected Gui.Renderable wolf_walkRightState = Images.monsters_1.createCycleBoundedX(1,0,1,0,0,2,0);
			protected Gui.Renderable wolf_walkLeftState = Images.monsters_1.createCycleBoundedX(4,0,1,3,0,5,0);
			protected Gui.Renderable killer_bees_idleState = Images.monsters_1.createStationary(1,1);
			protected Gui.Renderable killer_bees_walkState = Images.monsters_1.createCycleBoundedX(1,1,1,0,1,2,0);
			protected Gui.Renderable praying_mantis_idleState = Images.monsters_1.createStationary(1,2);
			protected Gui.Renderable praying_mantis_walkState = Images.monsters_1.createCycleBoundedX(1,2,1,0,2,2,0);
			protected Gui.Renderable bear_idleState = Images.monsters_1.createStationary(1,3);
			protected Gui.Renderable bear_walkState = Images.monsters_1.createCycleBoundedX(1,3,1,0,3,2,0);
			public States (){
				change_to_wolf();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case wolf :{
							change_to_wolf();
							return ;
						}
						case wolf_idle :{
							change_to_wolf();
							return ;
						}
						case wolf_walkRight :{
							change_to_wolf();
							return ;
						}
						case wolf_walkLeft :{
							change_to_wolf();
							return ;
						}
						case killer_bees :{
							change_to_killer_bees();
							return ;
						}
						case killer_bees_idle :{
							change_to_killer_bees();
							return ;
						}
						case killer_bees_walk :{
							change_to_killer_bees();
							return ;
						}
						case praying_mantis :{
							change_to_praying_mantis();
							return ;
						}
						case praying_mantis_idle :{
							change_to_praying_mantis();
							return ;
						}
						case praying_mantis_walk :{
							change_to_praying_mantis();
							return ;
						}
						case bear :{
							change_to_bear();
							return ;
						}
						case bear_idle :{
							change_to_bear();
							return ;
						}
						case bear_walk :{
							change_to_bear();
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case wolf :{
						switch(newState){
							case wolf_walkLeft :{
								change_to_wolf_walkLeft();
								return ;
							}
							case walkLeft :{
								change_to_wolf_walkLeft();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case wolf_idle :{
								change_to_wolf_idle();
								return ;
							}
							case idle :{
								change_to_wolf_idle();
								return ;
							}
							case wolf_walkRight :{
								change_to_wolf_walkRight();
								return ;
							}
							case walkRight :{
								change_to_wolf_walkRight();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case killer_bees :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case killer_bees_walk :{
								change_to_killer_bees_walk();
								return ;
							}
							case walk :{
								change_to_killer_bees_walk();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees_idle :{
								change_to_killer_bees_idle();
								return ;
							}
							case idle :{
								change_to_killer_bees_idle();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case praying_mantis :{
						switch(newState){
							case praying_mantis_idle :{
								change_to_praying_mantis_idle();
								return ;
							}
							case idle :{
								change_to_praying_mantis_idle();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case praying_mantis_walk :{
								change_to_praying_mantis_walk();
								return ;
							}
							case walk :{
								change_to_praying_mantis_walk();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case bear :{
						switch(newState){
							case bear_walk :{
								change_to_bear_walk();
								return ;
							}
							case walk :{
								change_to_bear_walk();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear_idle :{
								change_to_bear_idle();
								return ;
							}
							case idle :{
								change_to_bear_idle();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case wolf_walkLeft :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case wolf_idle :{
								change_to_wolf_idle();
								return ;
							}
							case idle :{
								change_to_wolf_idle();
								return ;
							}
							case wolf_walkRight :{
								change_to_wolf_walkRight();
								return ;
							}
							case walkRight :{
								change_to_wolf_walkRight();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case wolf_idle :{
						switch(newState){
							case wolf_walkLeft :{
								change_to_wolf_walkLeft();
								return ;
							}
							case walkLeft :{
								change_to_wolf_walkLeft();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case wolf_walkRight :{
								change_to_wolf_walkRight();
								return ;
							}
							case walkRight :{
								change_to_wolf_walkRight();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case wolf_walkRight :{
						switch(newState){
							case wolf_walkLeft :{
								change_to_wolf_walkLeft();
								return ;
							}
							case walkLeft :{
								change_to_wolf_walkLeft();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case wolf_idle :{
								change_to_wolf_idle();
								return ;
							}
							case idle :{
								change_to_wolf_idle();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case bear_walk :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear_idle :{
								change_to_bear_idle();
								return ;
							}
							case idle :{
								change_to_bear_idle();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case bear_idle :{
						switch(newState){
							case bear_walk :{
								change_to_bear_walk();
								return ;
							}
							case walk :{
								change_to_bear_walk();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case killer_bees_walk :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees_idle :{
								change_to_killer_bees_idle();
								return ;
							}
							case idle :{
								change_to_killer_bees_idle();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case killer_bees_idle :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case killer_bees_walk :{
								change_to_killer_bees_walk();
								return ;
							}
							case walk :{
								change_to_killer_bees_walk();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case praying_mantis_idle :{
						switch(newState){
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case praying_mantis_walk :{
								change_to_praying_mantis_walk();
								return ;
							}
							case walk :{
								change_to_praying_mantis_walk();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
					case praying_mantis_walk :{
						switch(newState){
							case praying_mantis_idle :{
								change_to_praying_mantis_idle();
								return ;
							}
							case idle :{
								change_to_praying_mantis_idle();
								return ;
							}
							case wolf :{
								change_to_wolf();
								return ;
							}
							case bear :{
								change_to_bear();
								return ;
							}
							case killer_bees :{
								change_to_killer_bees();
								return ;
							}
							case praying_mantis :{
								change_to_praying_mantis();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Monsters1.States asStates(){
				Images.Monsters1.States result = new Images.Monsters1.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Monsters1.States result = new Images.Monsters1.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public void change_to_wolf(){
				setCurrent(wolf_idleState);
				id=ImageStates.wolf;
				state=ImageStates.wolf;
			}
			public Gui.Renderable getWolfIdleState(){
				return wolf_idleState;
			}
			public void setWolfIdleState(Gui.Renderable newWolfIdleState){
				wolf_idleState=newWolfIdleState;
			}
			public void change_to_wolf_idle(){
				setCurrent(wolf_idleState);
				id=ImageStates.idle;
				state=ImageStates.wolf_idle;
			}
			public Gui.Renderable getWolfWalkRightState(){
				return wolf_walkRightState;
			}
			public void setWolfWalkRightState(Gui.Renderable newWolfWalkRightState){
				wolf_walkRightState=newWolfWalkRightState;
			}
			public void change_to_wolf_walkRight(){
				setCurrent(wolf_walkRightState);
				id=ImageStates.walkRight;
				state=ImageStates.wolf_walkRight;
			}
			public Gui.Renderable getWolfWalkLeftState(){
				return wolf_walkLeftState;
			}
			public void setWolfWalkLeftState(Gui.Renderable newWolfWalkLeftState){
				wolf_walkLeftState=newWolfWalkLeftState;
			}
			public void change_to_wolf_walkLeft(){
				setCurrent(wolf_walkLeftState);
				id=ImageStates.walkLeft;
				state=ImageStates.wolf_walkLeft;
			}
			public void change_to_killer_bees(){
				setCurrent(killer_bees_idleState);
				id=ImageStates.killer_bees;
				state=ImageStates.killer_bees;
			}
			public Gui.Renderable getKillerBeesIdleState(){
				return killer_bees_idleState;
			}
			public void setKillerBeesIdleState(Gui.Renderable newKillerBeesIdleState){
				killer_bees_idleState=newKillerBeesIdleState;
			}
			public void change_to_killer_bees_idle(){
				setCurrent(killer_bees_idleState);
				id=ImageStates.idle;
				state=ImageStates.killer_bees_idle;
			}
			public Gui.Renderable getKillerBeesWalkState(){
				return killer_bees_walkState;
			}
			public void setKillerBeesWalkState(Gui.Renderable newKillerBeesWalkState){
				killer_bees_walkState=newKillerBeesWalkState;
			}
			public void change_to_killer_bees_walk(){
				setCurrent(killer_bees_walkState);
				id=ImageStates.walk;
				state=ImageStates.killer_bees_walk;
			}
			public void change_to_praying_mantis(){
				setCurrent(praying_mantis_idleState);
				id=ImageStates.praying_mantis;
				state=ImageStates.praying_mantis;
			}
			public Gui.Renderable getPrayingMantisIdleState(){
				return praying_mantis_idleState;
			}
			public void setPrayingMantisIdleState(Gui.Renderable newPrayingMantisIdleState){
				praying_mantis_idleState=newPrayingMantisIdleState;
			}
			public void change_to_praying_mantis_idle(){
				setCurrent(praying_mantis_idleState);
				id=ImageStates.idle;
				state=ImageStates.praying_mantis_idle;
			}
			public Gui.Renderable getPrayingMantisWalkState(){
				return praying_mantis_walkState;
			}
			public void setPrayingMantisWalkState(Gui.Renderable newPrayingMantisWalkState){
				praying_mantis_walkState=newPrayingMantisWalkState;
			}
			public void change_to_praying_mantis_walk(){
				setCurrent(praying_mantis_walkState);
				id=ImageStates.walk;
				state=ImageStates.praying_mantis_walk;
			}
			public void change_to_bear(){
				setCurrent(bear_idleState);
				id=ImageStates.bear;
				state=ImageStates.bear;
			}
			public Gui.Renderable getBearIdleState(){
				return bear_idleState;
			}
			public void setBearIdleState(Gui.Renderable newBearIdleState){
				bear_idleState=newBearIdleState;
			}
			public void change_to_bear_idle(){
				setCurrent(bear_idleState);
				id=ImageStates.idle;
				state=ImageStates.bear_idle;
			}
			public Gui.Renderable getBearWalkState(){
				return bear_walkState;
			}
			public void setBearWalkState(Gui.Renderable newBearWalkState){
				bear_walkState=newBearWalkState;
			}
			public void change_to_bear_walk(){
				setCurrent(bear_walkState);
				id=ImageStates.walk;
				state=ImageStates.bear_walk;
			}
			public States (Gui.Renderable wolf_idleState,Gui.Renderable wolf_walkRightState,Gui.Renderable wolf_walkLeftState,Gui.Renderable killer_bees_idleState,Gui.Renderable killer_bees_walkState,Gui.Renderable praying_mantis_idleState,Gui.Renderable praying_mantis_walkState,Gui.Renderable bear_idleState,Gui.Renderable bear_walkState){
				super();
				this.wolf_idleState=wolf_idleState;
				this.wolf_walkRightState=wolf_walkRightState;
				this.wolf_walkLeftState=wolf_walkLeftState;
				this.killer_bees_idleState=killer_bees_idleState;
				this.killer_bees_walkState=killer_bees_walkState;
				this.praying_mantis_idleState=praying_mantis_idleState;
				this.praying_mantis_walkState=praying_mantis_walkState;
				this.bear_idleState=bear_idleState;
				this.bear_walkState=bear_walkState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable wolf_idleState,Gui.Renderable wolf_walkRightState,Gui.Renderable wolf_walkLeftState,Gui.Renderable killer_bees_idleState,Gui.Renderable killer_bees_walkState,Gui.Renderable praying_mantis_idleState,Gui.Renderable praying_mantis_walkState,Gui.Renderable bear_idleState,Gui.Renderable bear_walkState){
				super(current,id,state);
				this.wolf_idleState=wolf_idleState;
				this.wolf_walkRightState=wolf_walkRightState;
				this.wolf_walkLeftState=wolf_walkLeftState;
				this.killer_bees_idleState=killer_bees_idleState;
				this.killer_bees_walkState=killer_bees_walkState;
				this.praying_mantis_idleState=praying_mantis_idleState;
				this.praying_mantis_walkState=praying_mantis_walkState;
				this.bear_idleState=bear_idleState;
				this.bear_walkState=bear_walkState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Foliage extends Gui.Image implements Gui.Statable {
		public Foliage (){
			imageFileName="../Resource/gui/images/foliage.png";
			pixels=new Gui.Image.Dimensions(256,128);
			frames=new Gui.Image.Dimensions(8,4);
		}
		public Images.Foliage.States asStates(){
			return new Images.Foliage.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Foliage.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Foliage (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable grassState = Images.foliage.createStationary(0,0);
			protected Gui.Renderable pathState = Images.foliage.createStationary(1,0);
			protected Gui.Renderable long_grassState = Images.foliage.createStationary(2,0);
			protected Gui.Renderable treeState = Images.foliage.createStationary(3,0);
			public States (){
				change_to_grass();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case grass :{
							;
							return ;
						}
						case path :{
							;
							return ;
						}
						case long_grass :{
							;
							return ;
						}
						case tree :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case path :{
								change_to_path();
								return ;
							}
							case grass :{
								change_to_grass();
								return ;
							}
							case tree :{
								change_to_tree();
								return ;
							}
							case long_grass :{
								change_to_long_grass();
								return ;
							}
						}
						return ;
					}
					case path :{
						switch(newState){
							case grass :{
								change_to_grass();
								return ;
							}
							case tree :{
								change_to_tree();
								return ;
							}
							case long_grass :{
								change_to_long_grass();
								return ;
							}
						}
						return ;
					}
					case grass :{
						switch(newState){
							case path :{
								change_to_path();
								return ;
							}
							case tree :{
								change_to_tree();
								return ;
							}
							case long_grass :{
								change_to_long_grass();
								return ;
							}
						}
						return ;
					}
					case tree :{
						switch(newState){
							case path :{
								change_to_path();
								return ;
							}
							case grass :{
								change_to_grass();
								return ;
							}
							case long_grass :{
								change_to_long_grass();
								return ;
							}
						}
						return ;
					}
					case long_grass :{
						switch(newState){
							case path :{
								change_to_path();
								return ;
							}
							case grass :{
								change_to_grass();
								return ;
							}
							case tree :{
								change_to_tree();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Foliage.States asStates(){
				Images.Foliage.States result = new Images.Foliage.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Foliage.States result = new Images.Foliage.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getGrassState(){
				return grassState;
			}
			public void setGrassState(Gui.Renderable newGrassState){
				grassState=newGrassState;
			}
			public void change_to_grass(){
				setCurrent(grassState);
				id=ImageStates.grass;
				state=ImageStates.grass;
			}
			public Gui.Renderable getPathState(){
				return pathState;
			}
			public void setPathState(Gui.Renderable newPathState){
				pathState=newPathState;
			}
			public void change_to_path(){
				setCurrent(pathState);
				id=ImageStates.path;
				state=ImageStates.path;
			}
			public Gui.Renderable getLongGrassState(){
				return long_grassState;
			}
			public void setLongGrassState(Gui.Renderable newLongGrassState){
				long_grassState=newLongGrassState;
			}
			public void change_to_long_grass(){
				setCurrent(long_grassState);
				id=ImageStates.long_grass;
				state=ImageStates.long_grass;
			}
			public Gui.Renderable getTreeState(){
				return treeState;
			}
			public void setTreeState(Gui.Renderable newTreeState){
				treeState=newTreeState;
			}
			public void change_to_tree(){
				setCurrent(treeState);
				id=ImageStates.tree;
				state=ImageStates.tree;
			}
			public States (Gui.Renderable grassState,Gui.Renderable pathState,Gui.Renderable long_grassState,Gui.Renderable treeState){
				super();
				this.grassState=grassState;
				this.pathState=pathState;
				this.long_grassState=long_grassState;
				this.treeState=treeState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable grassState,Gui.Renderable pathState,Gui.Renderable long_grassState,Gui.Renderable treeState){
				super(current,id,state);
				this.grassState=grassState;
				this.pathState=pathState;
				this.long_grassState=long_grassState;
				this.treeState=treeState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Forest extends Gui.Image implements Gui.Statable {
		public Forest (){
			imageFileName="../Resource/gui/images/forest.png";
			pixels=new Gui.Image.Dimensions(256,128);
			frames=new Gui.Image.Dimensions(8,4);
		}
		public Images.Forest.States asStates(){
			return new Images.Forest.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Forest.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Gui.Drawable getAsEtherealPedestal(Gui.Drawable drawable){
			Images.Forest.States states = new Images.Forest.States();
			return new Gui.Drawable.Multi.Image(new Gui.Drawable[][]{new Gui.Drawable[]{drawable.image(states.ethereal_pedestalState_0)},new Gui.Drawable[]{drawable.image(states.ethereal_pedestalState_1)}});
		}
		public Forest (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable lone_rockState = Images.forest.createStationary(0,0);
			protected Gui.Renderable bear_denState = Images.forest.createStationary(1,0);
			protected Gui.Renderable ethereal_pedestalState_0 = Images.forest.createStationary(2,0);
			protected Gui.Renderable ethereal_pedestalState_1 = Images.forest.createStationary(2,1);
			public States (){
				change_to_lone_rock();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case lone_rock :{
							;
							return ;
						}
						case bear_den :{
							;
							return ;
						}
						case ethereal_pedestal_0 :{
							;
							return ;
						}
						case ethereal_pedestal_1 :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case lone_rock :{
								change_to_lone_rock();
								return ;
							}
							case bear_den :{
								change_to_bear_den();
								return ;
							}
							case ethereal_pedestal_1 :{
								change_to_ethereal_pedestal_1();
								return ;
							}
							case ethereal_pedestal_0 :{
								change_to_ethereal_pedestal_0();
								return ;
							}
						}
						return ;
					}
					case lone_rock :{
						switch(newState){
							case bear_den :{
								change_to_bear_den();
								return ;
							}
							case ethereal_pedestal_1 :{
								change_to_ethereal_pedestal_1();
								return ;
							}
							case ethereal_pedestal_0 :{
								change_to_ethereal_pedestal_0();
								return ;
							}
						}
						return ;
					}
					case bear_den :{
						switch(newState){
							case lone_rock :{
								change_to_lone_rock();
								return ;
							}
							case ethereal_pedestal_1 :{
								change_to_ethereal_pedestal_1();
								return ;
							}
							case ethereal_pedestal_0 :{
								change_to_ethereal_pedestal_0();
								return ;
							}
						}
						return ;
					}
					case ethereal_pedestal_1 :{
						switch(newState){
							case lone_rock :{
								change_to_lone_rock();
								return ;
							}
							case bear_den :{
								change_to_bear_den();
								return ;
							}
							case ethereal_pedestal_0 :{
								change_to_ethereal_pedestal_0();
								return ;
							}
						}
						return ;
					}
					case ethereal_pedestal_0 :{
						switch(newState){
							case lone_rock :{
								change_to_lone_rock();
								return ;
							}
							case bear_den :{
								change_to_bear_den();
								return ;
							}
							case ethereal_pedestal_1 :{
								change_to_ethereal_pedestal_1();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Forest.States asStates(){
				Images.Forest.States result = new Images.Forest.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Forest.States result = new Images.Forest.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getLoneRockState(){
				return lone_rockState;
			}
			public void setLoneRockState(Gui.Renderable newLoneRockState){
				lone_rockState=newLoneRockState;
			}
			public void change_to_lone_rock(){
				setCurrent(lone_rockState);
				id=ImageStates.lone_rock;
				state=ImageStates.lone_rock;
			}
			public Gui.Renderable getBearDenState(){
				return bear_denState;
			}
			public void setBearDenState(Gui.Renderable newBearDenState){
				bear_denState=newBearDenState;
			}
			public void change_to_bear_den(){
				setCurrent(bear_denState);
				id=ImageStates.bear_den;
				state=ImageStates.bear_den;
			}
			public Gui.Renderable getEtherealPedestalState0(){
				return ethereal_pedestalState_0;
			}
			public void setEtherealPedestalState0(Gui.Renderable newEtherealPedestalState0){
				ethereal_pedestalState_0=newEtherealPedestalState0;
			}
			public void change_to_ethereal_pedestal_0(){
				setCurrent(ethereal_pedestalState_0);
				id=ImageStates.ethereal_pedestal_0;
				state=ImageStates.ethereal_pedestal_0;
			}
			public Gui.Renderable getEtherealPedestalState1(){
				return ethereal_pedestalState_1;
			}
			public void setEtherealPedestalState1(Gui.Renderable newEtherealPedestalState1){
				ethereal_pedestalState_1=newEtherealPedestalState1;
			}
			public void change_to_ethereal_pedestal_1(){
				setCurrent(ethereal_pedestalState_1);
				id=ImageStates.ethereal_pedestal_1;
				state=ImageStates.ethereal_pedestal_1;
			}
			public States (Gui.Renderable lone_rockState,Gui.Renderable bear_denState,Gui.Renderable ethereal_pedestalState_0,Gui.Renderable ethereal_pedestalState_1){
				super();
				this.lone_rockState=lone_rockState;
				this.bear_denState=bear_denState;
				this.ethereal_pedestalState_0=ethereal_pedestalState_0;
				this.ethereal_pedestalState_1=ethereal_pedestalState_1;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable lone_rockState,Gui.Renderable bear_denState,Gui.Renderable ethereal_pedestalState_0,Gui.Renderable ethereal_pedestalState_1){
				super(current,id,state);
				this.lone_rockState=lone_rockState;
				this.bear_denState=bear_denState;
				this.ethereal_pedestalState_0=ethereal_pedestalState_0;
				this.ethereal_pedestalState_1=ethereal_pedestalState_1;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Outside extends Gui.Image implements Gui.Statable {
		public Outside (){
			imageFileName="../Resource/gui/images/outside.png";
			pixels=new Gui.Image.Dimensions(256,128);
			frames=new Gui.Image.Dimensions(8,4);
		}
		public Images.Outside.States asStates(){
			return new Images.Outside.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Outside.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Gui.Drawable getAsLake(Gui.Drawable drawable){
			Images.Outside.States states = new Images.Outside.States();
			return new Gui.Drawable.Multi.Image(new Gui.Drawable[][]{new Gui.Drawable[]{drawable.image(states.lakeState_0),drawable.image(states.lakeState_1)},new Gui.Drawable[]{drawable.image(states.lakeState_2),drawable.image(states.lakeState_3)}});
		}
		public Outside (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable waterState = Images.outside.createStationary(0,0);
			protected Gui.Renderable lakeState_0 = Images.outside.createStationary(1,0);
			protected Gui.Renderable lakeState_1 = Images.outside.createStationary(1,1);
			protected Gui.Renderable lakeState_2 = Images.outside.createStationary(2,0);
			protected Gui.Renderable lakeState_3 = Images.outside.createStationary(2,1);
			protected Gui.Renderable bridgeState = Images.outside.createStationary(3,0);
			public States (){
				change_to_water();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case water :{
							;
							return ;
						}
						case lake_0 :{
							;
							return ;
						}
						case lake_1 :{
							;
							return ;
						}
						case lake_2 :{
							;
							return ;
						}
						case lake_3 :{
							;
							return ;
						}
						case bridge :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case lake_0 :{
								change_to_lake_0();
								return ;
							}
							case lake_1 :{
								change_to_lake_1();
								return ;
							}
							case lake_2 :{
								change_to_lake_2();
								return ;
							}
							case lake_3 :{
								change_to_lake_3();
								return ;
							}
							case bridge :{
								change_to_bridge();
								return ;
							}
							case water :{
								change_to_water();
								return ;
							}
						}
						return ;
					}
					case lake_0 :{
						switch(newState){
							case lake_1 :{
								change_to_lake_1();
								return ;
							}
							case lake_2 :{
								change_to_lake_2();
								return ;
							}
							case lake_3 :{
								change_to_lake_3();
								return ;
							}
							case bridge :{
								change_to_bridge();
								return ;
							}
							case water :{
								change_to_water();
								return ;
							}
						}
						return ;
					}
					case lake_1 :{
						switch(newState){
							case lake_0 :{
								change_to_lake_0();
								return ;
							}
							case lake_2 :{
								change_to_lake_2();
								return ;
							}
							case lake_3 :{
								change_to_lake_3();
								return ;
							}
							case bridge :{
								change_to_bridge();
								return ;
							}
							case water :{
								change_to_water();
								return ;
							}
						}
						return ;
					}
					case lake_2 :{
						switch(newState){
							case lake_0 :{
								change_to_lake_0();
								return ;
							}
							case lake_1 :{
								change_to_lake_1();
								return ;
							}
							case lake_3 :{
								change_to_lake_3();
								return ;
							}
							case bridge :{
								change_to_bridge();
								return ;
							}
							case water :{
								change_to_water();
								return ;
							}
						}
						return ;
					}
					case lake_3 :{
						switch(newState){
							case lake_0 :{
								change_to_lake_0();
								return ;
							}
							case lake_1 :{
								change_to_lake_1();
								return ;
							}
							case lake_2 :{
								change_to_lake_2();
								return ;
							}
							case bridge :{
								change_to_bridge();
								return ;
							}
							case water :{
								change_to_water();
								return ;
							}
						}
						return ;
					}
					case bridge :{
						switch(newState){
							case lake_0 :{
								change_to_lake_0();
								return ;
							}
							case lake_1 :{
								change_to_lake_1();
								return ;
							}
							case lake_2 :{
								change_to_lake_2();
								return ;
							}
							case lake_3 :{
								change_to_lake_3();
								return ;
							}
							case water :{
								change_to_water();
								return ;
							}
						}
						return ;
					}
					case water :{
						switch(newState){
							case lake_0 :{
								change_to_lake_0();
								return ;
							}
							case lake_1 :{
								change_to_lake_1();
								return ;
							}
							case lake_2 :{
								change_to_lake_2();
								return ;
							}
							case lake_3 :{
								change_to_lake_3();
								return ;
							}
							case bridge :{
								change_to_bridge();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Outside.States asStates(){
				Images.Outside.States result = new Images.Outside.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Outside.States result = new Images.Outside.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getWaterState(){
				return waterState;
			}
			public void setWaterState(Gui.Renderable newWaterState){
				waterState=newWaterState;
			}
			public void change_to_water(){
				setCurrent(waterState);
				id=ImageStates.water;
				state=ImageStates.water;
			}
			public Gui.Renderable getLakeState0(){
				return lakeState_0;
			}
			public void setLakeState0(Gui.Renderable newLakeState0){
				lakeState_0=newLakeState0;
			}
			public void change_to_lake_0(){
				setCurrent(lakeState_0);
				id=ImageStates.lake_0;
				state=ImageStates.lake_0;
			}
			public Gui.Renderable getLakeState1(){
				return lakeState_1;
			}
			public void setLakeState1(Gui.Renderable newLakeState1){
				lakeState_1=newLakeState1;
			}
			public void change_to_lake_1(){
				setCurrent(lakeState_1);
				id=ImageStates.lake_1;
				state=ImageStates.lake_1;
			}
			public Gui.Renderable getLakeState2(){
				return lakeState_2;
			}
			public void setLakeState2(Gui.Renderable newLakeState2){
				lakeState_2=newLakeState2;
			}
			public void change_to_lake_2(){
				setCurrent(lakeState_2);
				id=ImageStates.lake_2;
				state=ImageStates.lake_2;
			}
			public Gui.Renderable getLakeState3(){
				return lakeState_3;
			}
			public void setLakeState3(Gui.Renderable newLakeState3){
				lakeState_3=newLakeState3;
			}
			public void change_to_lake_3(){
				setCurrent(lakeState_3);
				id=ImageStates.lake_3;
				state=ImageStates.lake_3;
			}
			public Gui.Renderable getBridgeState(){
				return bridgeState;
			}
			public void setBridgeState(Gui.Renderable newBridgeState){
				bridgeState=newBridgeState;
			}
			public void change_to_bridge(){
				setCurrent(bridgeState);
				id=ImageStates.bridge;
				state=ImageStates.bridge;
			}
			public States (Gui.Renderable waterState,Gui.Renderable lakeState_0,Gui.Renderable lakeState_1,Gui.Renderable lakeState_2,Gui.Renderable lakeState_3,Gui.Renderable bridgeState){
				super();
				this.waterState=waterState;
				this.lakeState_0=lakeState_0;
				this.lakeState_1=lakeState_1;
				this.lakeState_2=lakeState_2;
				this.lakeState_3=lakeState_3;
				this.bridgeState=bridgeState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable waterState,Gui.Renderable lakeState_0,Gui.Renderable lakeState_1,Gui.Renderable lakeState_2,Gui.Renderable lakeState_3,Gui.Renderable bridgeState){
				super(current,id,state);
				this.waterState=waterState;
				this.lakeState_0=lakeState_0;
				this.lakeState_1=lakeState_1;
				this.lakeState_2=lakeState_2;
				this.lakeState_3=lakeState_3;
				this.bridgeState=bridgeState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Chests extends Gui.Image implements Gui.Statable {
		public Chests (){
			imageFileName="../Resource/gui/images/chests.png";
			pixels=new Gui.Image.Dimensions(256,128);
			frames=new Gui.Image.Dimensions(8,4);
		}
		public Images.Chests.States asStates(){
			return new Images.Chests.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Chests.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Chests (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable minorState = Images.chests.createStationary(0,0);
			protected Gui.Renderable majorState = Images.chests.createStationary(1,0);
			protected Gui.Renderable treasureState = Images.chests.createStationary(2,0);
			protected Gui.Renderable legendaryState = Images.chests.createStationary(3,0);
			public States (){
				change_to_minor();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case minor :{
							;
							return ;
						}
						case major :{
							;
							return ;
						}
						case treasure :{
							;
							return ;
						}
						case legendary :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case major :{
								change_to_major();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case minor :{
						switch(newState){
							case major :{
								change_to_major();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case major :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case legendary :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case major :{
								change_to_major();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case treasure :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case major :{
								change_to_major();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Chests.States asStates(){
				Images.Chests.States result = new Images.Chests.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Chests.States result = new Images.Chests.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getMinorState(){
				return minorState;
			}
			public void setMinorState(Gui.Renderable newMinorState){
				minorState=newMinorState;
			}
			public void change_to_minor(){
				setCurrent(minorState);
				id=ImageStates.minor;
				state=ImageStates.minor;
			}
			public Gui.Renderable getMajorState(){
				return majorState;
			}
			public void setMajorState(Gui.Renderable newMajorState){
				majorState=newMajorState;
			}
			public void change_to_major(){
				setCurrent(majorState);
				id=ImageStates.major;
				state=ImageStates.major;
			}
			public Gui.Renderable getTreasureState(){
				return treasureState;
			}
			public void setTreasureState(Gui.Renderable newTreasureState){
				treasureState=newTreasureState;
			}
			public void change_to_treasure(){
				setCurrent(treasureState);
				id=ImageStates.treasure;
				state=ImageStates.treasure;
			}
			public Gui.Renderable getLegendaryState(){
				return legendaryState;
			}
			public void setLegendaryState(Gui.Renderable newLegendaryState){
				legendaryState=newLegendaryState;
			}
			public void change_to_legendary(){
				setCurrent(legendaryState);
				id=ImageStates.legendary;
				state=ImageStates.legendary;
			}
			public States (Gui.Renderable minorState,Gui.Renderable majorState,Gui.Renderable treasureState,Gui.Renderable legendaryState){
				super();
				this.minorState=minorState;
				this.majorState=majorState;
				this.treasureState=treasureState;
				this.legendaryState=legendaryState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable minorState,Gui.Renderable majorState,Gui.Renderable treasureState,Gui.Renderable legendaryState){
				super(current,id,state);
				this.minorState=minorState;
				this.majorState=majorState;
				this.treasureState=treasureState;
				this.legendaryState=legendaryState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Chests2 extends Gui.Image implements Gui.Statable {
		public Chests2 (){
			imageFileName="../Resource/gui/images/BaseClawment2.png";
			pixels=new Gui.Image.Dimensions(256,512);
			frames=new Gui.Image.Dimensions(4,8);
		}
		public Images.Chests2.States asStates(){
			return new Images.Chests2.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Chests2.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Chests2 (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable minorState = Images.chests_2.createStationary(0,0);
			protected Gui.Renderable majorState = Images.chests_2.createStationary(1,0);
			protected Gui.Renderable treasureState = Images.chests_2.createStationary(2,0);
			protected Gui.Renderable legendaryState = Images.chests_2.createStationary(3,0);
			public States (){
				change_to_minor();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case minor :{
							;
							return ;
						}
						case major :{
							;
							return ;
						}
						case treasure :{
							;
							return ;
						}
						case legendary :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case major :{
								change_to_major();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case minor :{
						switch(newState){
							case major :{
								change_to_major();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case major :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case legendary :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case major :{
								change_to_major();
								return ;
							}
							case treasure :{
								change_to_treasure();
								return ;
							}
						}
						return ;
					}
					case treasure :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
							case major :{
								change_to_major();
								return ;
							}
							case legendary :{
								change_to_legendary();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Chests2.States asStates(){
				Images.Chests2.States result = new Images.Chests2.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Chests2.States result = new Images.Chests2.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getMinorState(){
				return minorState;
			}
			public void setMinorState(Gui.Renderable newMinorState){
				minorState=newMinorState;
			}
			public void change_to_minor(){
				setCurrent(minorState);
				id=ImageStates.minor;
				state=ImageStates.minor;
			}
			public Gui.Renderable getMajorState(){
				return majorState;
			}
			public void setMajorState(Gui.Renderable newMajorState){
				majorState=newMajorState;
			}
			public void change_to_major(){
				setCurrent(majorState);
				id=ImageStates.major;
				state=ImageStates.major;
			}
			public Gui.Renderable getTreasureState(){
				return treasureState;
			}
			public void setTreasureState(Gui.Renderable newTreasureState){
				treasureState=newTreasureState;
			}
			public void change_to_treasure(){
				setCurrent(treasureState);
				id=ImageStates.treasure;
				state=ImageStates.treasure;
			}
			public Gui.Renderable getLegendaryState(){
				return legendaryState;
			}
			public void setLegendaryState(Gui.Renderable newLegendaryState){
				legendaryState=newLegendaryState;
			}
			public void change_to_legendary(){
				setCurrent(legendaryState);
				id=ImageStates.legendary;
				state=ImageStates.legendary;
			}
			public States (Gui.Renderable minorState,Gui.Renderable majorState,Gui.Renderable treasureState,Gui.Renderable legendaryState){
				super();
				this.minorState=minorState;
				this.majorState=majorState;
				this.treasureState=treasureState;
				this.legendaryState=legendaryState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable minorState,Gui.Renderable majorState,Gui.Renderable treasureState,Gui.Renderable legendaryState){
				super(current,id,state);
				this.minorState=minorState;
				this.majorState=majorState;
				this.treasureState=treasureState;
				this.legendaryState=legendaryState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Chests3 extends Gui.Image implements Gui.Statable {
		public Chests3 (){
			imageFileName="../Resource/gui/images/BlueSky.png";
			pixels=new Gui.Image.Dimensions(1024,1024);
			frames=new Gui.Image.Dimensions(1,4);
		}
		public Images.Chests3.States asStates(){
			return new Images.Chests3.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Chests3.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Chests3 (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable minorState = Images.chests_3.createStationary(0,0);
			public States (){
				change_to_minor();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case minor :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case minor :{
								change_to_minor();
								return ;
							}
						}
						return ;
					}
					case minor :{
						switch(newState){
						}
						return ;
					}
				}
			}
			public Images.Chests3.States asStates(){
				Images.Chests3.States result = new Images.Chests3.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Chests3.States result = new Images.Chests3.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getMinorState(){
				return minorState;
			}
			public void setMinorState(Gui.Renderable newMinorState){
				minorState=newMinorState;
			}
			public void change_to_minor(){
				setCurrent(minorState);
				id=ImageStates.minor;
				state=ImageStates.minor;
			}
			public States (Gui.Renderable minorState){
				super();
				this.minorState=minorState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable minorState){
				super(current,id,state);
				this.minorState=minorState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class TownsPeople extends Gui.Image implements Gui.Statable {
		public TownsPeople (){
			imageFileName="../Resource/gui/images/male_walker.png";
			pixels=new Gui.Image.Dimensions(256,32);
			frames=new Gui.Image.Dimensions(8,1);
		}
		public Images.TownsPeople.States asStates(){
			return new Images.TownsPeople.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.TownsPeople.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public TownsPeople (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable male_noneState = Images.towns_people.createStationary(1,0);
			protected Gui.Renderable male_mayor_idleState = Images.towns_people.createStationary(1,0);
			protected Gui.Renderable male_mayor_walk_rightState = Images.towns_people.createCycleBoundedX(1,0,1,0,0,2,0);
			protected Gui.Renderable male_mayor_walk_leftState = Images.Flipped.towns_people.createCycleBoundedX(6,0,-1,5,0,7,0);
			protected Gui.Renderable male_bar_tender_idleState = Images.towns_people.createStationary(1,0);
			protected Gui.Renderable male_bar_tender_walk_rightState = Images.towns_people.createCycleBoundedX(1,0,1,0,0,2,0);
			protected Gui.Renderable male_bar_tender_walk_leftState = Images.Flipped.towns_people.createCycleBoundedX(6,0,-1,5,0,7,0);
			public States (){
				change_to_male();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case male :{
							change_to_male();
							return ;
						}
						case male_none :{
							change_to_male();
							return ;
						}
						case male_mayor :{
							change_to_male();
							return ;
						}
						case male_mayor_idle :{
							change_to_male_mayor();
							return ;
						}
						case male_mayor_walk :{
							change_to_male_mayor();
							return ;
						}
						case male_mayor_walk_right :{
							change_to_male_mayor_walk();
							return ;
						}
						case male_mayor_walk_left :{
							change_to_male_mayor_walk();
							return ;
						}
						case male_bar_tender :{
							change_to_male();
							return ;
						}
						case male_bar_tender_idle :{
							change_to_male_bar_tender();
							return ;
						}
						case male_bar_tender_walk :{
							change_to_male_bar_tender();
							return ;
						}
						case male_bar_tender_walk_right :{
							change_to_male_bar_tender_walk();
							return ;
						}
						case male_bar_tender_walk_left :{
							change_to_male_bar_tender_walk();
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male :{
						switch(newState){
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_mayor :{
						switch(newState){
							case male_mayor_walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_mayor_idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_mayor_walk :{
						switch(newState){
							case male_mayor_walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor_walk_left :{
								change_to_male_mayor_walk_left();
								return ;
							}
							case left :{
								change_to_male_mayor_walk_left();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_mayor_idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case male_mayor_walk_right :{
								change_to_male_mayor_walk_right();
								return ;
							}
							case right :{
								change_to_male_mayor_walk_right();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_bar_tender :{
						switch(newState){
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_bar_tender_idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_bar_tender_walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_bar_tender_walk :{
						switch(newState){
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_bar_tender_idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_bar_tender_walk_left :{
								change_to_male_bar_tender_walk_left();
								return ;
							}
							case left :{
								change_to_male_bar_tender_walk_left();
								return ;
							}
							case male_bar_tender_walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
							case male_bar_tender_walk_right :{
								change_to_male_bar_tender_walk_right();
								return ;
							}
							case right :{
								change_to_male_bar_tender_walk_right();
								return ;
							}
						}
						return ;
					}
					case male_none :{
						switch(newState){
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_bar_tender_idle :{
						switch(newState){
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_bar_tender_walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_bar_tender_walk_left :{
						switch(newState){
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_bar_tender_idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_bar_tender_walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
							case male_bar_tender_walk_right :{
								change_to_male_bar_tender_walk_right();
								return ;
							}
							case right :{
								change_to_male_bar_tender_walk_right();
								return ;
							}
						}
						return ;
					}
					case male_bar_tender_walk_right :{
						switch(newState){
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_bar_tender_idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case idle :{
								change_to_male_bar_tender_idle();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_bar_tender_walk_left :{
								change_to_male_bar_tender_walk_left();
								return ;
							}
							case left :{
								change_to_male_bar_tender_walk_left();
								return ;
							}
							case male_bar_tender_walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case walk :{
								change_to_male_bar_tender_walk();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_mayor_walk_left :{
						switch(newState){
							case male_mayor_walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_mayor_idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case male_mayor_walk_right :{
								change_to_male_mayor_walk_right();
								return ;
							}
							case right :{
								change_to_male_mayor_walk_right();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_mayor_walk_right :{
						switch(newState){
							case male_mayor_walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor_walk_left :{
								change_to_male_mayor_walk_left();
								return ;
							}
							case left :{
								change_to_male_mayor_walk_left();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male_mayor_idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case idle :{
								change_to_male_mayor_idle();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
					case male_mayor_idle :{
						switch(newState){
							case male_mayor_walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case walk :{
								change_to_male_mayor_walk();
								return ;
							}
							case male_none :{
								change_to_male_none();
								return ;
							}
							case none :{
								change_to_male_none();
								return ;
							}
							case male_bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case bar_tender :{
								change_to_male_bar_tender();
								return ;
							}
							case male_mayor :{
								change_to_male_mayor();
								return ;
							}
							case mayor :{
								change_to_male_mayor();
								return ;
							}
							case male :{
								change_to_male();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.TownsPeople.States asStates(){
				Images.TownsPeople.States result = new Images.TownsPeople.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.TownsPeople.States result = new Images.TownsPeople.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public void change_to_male(){
				setCurrent(male_noneState);
				id=ImageStates.male;
				state=ImageStates.male;
			}
			public Gui.Renderable getMaleNoneState(){
				return male_noneState;
			}
			public void setMaleNoneState(Gui.Renderable newMaleNoneState){
				male_noneState=newMaleNoneState;
			}
			public void change_to_male_none(){
				setCurrent(male_noneState);
				id=ImageStates.none;
				state=ImageStates.male_none;
			}
			public void change_to_male_mayor(){
				setCurrent(male_mayor_idleState);
				id=ImageStates.mayor;
				state=ImageStates.male_mayor;
			}
			public Gui.Renderable getMaleMayorIdleState(){
				return male_mayor_idleState;
			}
			public void setMaleMayorIdleState(Gui.Renderable newMaleMayorIdleState){
				male_mayor_idleState=newMaleMayorIdleState;
			}
			public void change_to_male_mayor_idle(){
				setCurrent(male_mayor_idleState);
				id=ImageStates.idle;
				state=ImageStates.male_mayor_idle;
			}
			public void change_to_male_mayor_walk(){
				setCurrent(male_mayor_walk_rightState);
				id=ImageStates.walk;
				state=ImageStates.male_mayor_walk;
			}
			public Gui.Renderable getMaleMayorWalkRightState(){
				return male_mayor_walk_rightState;
			}
			public void setMaleMayorWalkRightState(Gui.Renderable newMaleMayorWalkRightState){
				male_mayor_walk_rightState=newMaleMayorWalkRightState;
			}
			public void change_to_male_mayor_walk_right(){
				setCurrent(male_mayor_walk_rightState);
				id=ImageStates.right;
				state=ImageStates.male_mayor_walk_right;
			}
			public Gui.Renderable getMaleMayorWalkLeftState(){
				return male_mayor_walk_leftState;
			}
			public void setMaleMayorWalkLeftState(Gui.Renderable newMaleMayorWalkLeftState){
				male_mayor_walk_leftState=newMaleMayorWalkLeftState;
			}
			public void change_to_male_mayor_walk_left(){
				setCurrent(male_mayor_walk_leftState);
				id=ImageStates.left;
				state=ImageStates.male_mayor_walk_left;
			}
			public void change_to_male_bar_tender(){
				setCurrent(male_bar_tender_idleState);
				id=ImageStates.bar_tender;
				state=ImageStates.male_bar_tender;
			}
			public Gui.Renderable getMaleBarTenderIdleState(){
				return male_bar_tender_idleState;
			}
			public void setMaleBarTenderIdleState(Gui.Renderable newMaleBarTenderIdleState){
				male_bar_tender_idleState=newMaleBarTenderIdleState;
			}
			public void change_to_male_bar_tender_idle(){
				setCurrent(male_bar_tender_idleState);
				id=ImageStates.idle;
				state=ImageStates.male_bar_tender_idle;
			}
			public void change_to_male_bar_tender_walk(){
				setCurrent(male_bar_tender_walk_rightState);
				id=ImageStates.walk;
				state=ImageStates.male_bar_tender_walk;
			}
			public Gui.Renderable getMaleBarTenderWalkRightState(){
				return male_bar_tender_walk_rightState;
			}
			public void setMaleBarTenderWalkRightState(Gui.Renderable newMaleBarTenderWalkRightState){
				male_bar_tender_walk_rightState=newMaleBarTenderWalkRightState;
			}
			public void change_to_male_bar_tender_walk_right(){
				setCurrent(male_bar_tender_walk_rightState);
				id=ImageStates.right;
				state=ImageStates.male_bar_tender_walk_right;
			}
			public Gui.Renderable getMaleBarTenderWalkLeftState(){
				return male_bar_tender_walk_leftState;
			}
			public void setMaleBarTenderWalkLeftState(Gui.Renderable newMaleBarTenderWalkLeftState){
				male_bar_tender_walk_leftState=newMaleBarTenderWalkLeftState;
			}
			public void change_to_male_bar_tender_walk_left(){
				setCurrent(male_bar_tender_walk_leftState);
				id=ImageStates.left;
				state=ImageStates.male_bar_tender_walk_left;
			}
			public States (Gui.Renderable male_noneState,Gui.Renderable male_mayor_idleState,Gui.Renderable male_mayor_walk_rightState,Gui.Renderable male_mayor_walk_leftState,Gui.Renderable male_bar_tender_idleState,Gui.Renderable male_bar_tender_walk_rightState,Gui.Renderable male_bar_tender_walk_leftState){
				super();
				this.male_noneState=male_noneState;
				this.male_mayor_idleState=male_mayor_idleState;
				this.male_mayor_walk_rightState=male_mayor_walk_rightState;
				this.male_mayor_walk_leftState=male_mayor_walk_leftState;
				this.male_bar_tender_idleState=male_bar_tender_idleState;
				this.male_bar_tender_walk_rightState=male_bar_tender_walk_rightState;
				this.male_bar_tender_walk_leftState=male_bar_tender_walk_leftState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable male_noneState,Gui.Renderable male_mayor_idleState,Gui.Renderable male_mayor_walk_rightState,Gui.Renderable male_mayor_walk_leftState,Gui.Renderable male_bar_tender_idleState,Gui.Renderable male_bar_tender_walk_rightState,Gui.Renderable male_bar_tender_walk_leftState){
				super(current,id,state);
				this.male_noneState=male_noneState;
				this.male_mayor_idleState=male_mayor_idleState;
				this.male_mayor_walk_rightState=male_mayor_walk_rightState;
				this.male_mayor_walk_leftState=male_mayor_walk_leftState;
				this.male_bar_tender_idleState=male_bar_tender_idleState;
				this.male_bar_tender_walk_rightState=male_bar_tender_walk_rightState;
				this.male_bar_tender_walk_leftState=male_bar_tender_walk_leftState;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
	public static class Town extends Gui.Image implements Gui.Statable {
		public Town (){
			imageFileName="../Resource/gui/images/town.png";
			pixels=new Gui.Image.Dimensions(256,256);
			frames=new Gui.Image.Dimensions(8,4);
		}
		public Images.Town.States asStates(){
			return new Images.Town.States();
		}
		public Gui.Drawable asStates(Gui.Drawable drawable){
			return drawable.image(new Images.Town.States());
		}
		public Gui.Drawable asDrawable(Gui.Drawable drawable){
			return drawable.image(this);
		}
		public Gui.Drawable getAsStoneWalls(Gui.Drawable drawable){
			Images.Town.States states = new Images.Town.States();
			return new Gui.Drawable.Multi.Image(new Gui.Drawable[][]{new Gui.Drawable[]{drawable.image(states.stone_wallsState_0),drawable.image(states.stone_wallsState_1),drawable.image(states.stone_wallsState_2)},new Gui.Drawable[]{drawable.image(states.stone_wallsState_3),drawable.image(states.stone_wallsState_4),drawable.image(states.stone_wallsState_5)}});
		}
		public Gui.Drawable getAsMayorsDesk(Gui.Drawable drawable){
			Images.Town.States states = new Images.Town.States();
			return new Gui.Drawable.Multi.Image(new Gui.Drawable[][]{new Gui.Drawable[]{drawable.image(states.mayors_deskState_0),drawable.image(states.mayors_deskState_1)}});
		}
		public Gui.Drawable getAsBar(Gui.Drawable drawable){
			Images.Town.States states = new Images.Town.States();
			return new Gui.Drawable.Multi.Image(new Gui.Drawable[][]{new Gui.Drawable[]{drawable.image(states.barState_0),drawable.image(states.barState_1)}});
		}
		public Town (String imageFileName,Gui.Image.Dimensions pixels,Gui.Image.Dimensions frames,int texture,FloatBuffer[][] textureBuffer){
			super(imageFileName,pixels,frames,texture,textureBuffer);
		}
		public static class States extends Gui.Image.States {
			protected Gui.Renderable stone_floorState = Images.town.createStationary(0,0);
			protected Gui.Renderable stone_wallsState_0 = Images.town.createStationary(1,0);
			protected Gui.Renderable stone_wallsState_1 = Images.town.createStationary(1,1);
			protected Gui.Renderable stone_wallsState_2 = Images.town.createStationary(2,0);
			protected Gui.Renderable stone_wallsState_3 = Images.town.createStationary(2,1);
			protected Gui.Renderable stone_wallsState_4 = Images.town.createStationary(3,0);
			protected Gui.Renderable stone_wallsState_5 = Images.town.createStationary(3,1);
			protected Gui.Renderable mayors_deskState_0 = Images.town.createStationary(4,0);
			protected Gui.Renderable mayors_deskState_1 = Images.town.createStationary(5,0);
			protected Gui.Renderable barState_0 = Images.town.createStationary(4,0);
			protected Gui.Renderable barState_1 = Images.town.createStationary(5,0);
			public States (){
				change_to_stone_floor();
			}
			public void changeState(ImageStates newState){
				if(newState==ImageStates.ASCEND){
					switch(state){
						case stone_floor :{
							;
							return ;
						}
						case stone_walls_0 :{
							;
							return ;
						}
						case stone_walls_1 :{
							;
							return ;
						}
						case stone_walls_2 :{
							;
							return ;
						}
						case stone_walls_3 :{
							;
							return ;
						}
						case stone_walls_4 :{
							;
							return ;
						}
						case stone_walls_5 :{
							;
							return ;
						}
						case mayors_desk_0 :{
							;
							return ;
						}
						case mayors_desk_1 :{
							;
							return ;
						}
						case bar_0 :{
							;
							return ;
						}
						case bar_1 :{
							;
							return ;
						}
					}
					return ;
				}
				switch(state){
					case DEFAULT :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_floor :{
						switch(newState){
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_walls_2 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_walls_3 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_walls_0 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_walls_1 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_walls_4 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case bar_0 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case stone_walls_5 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case bar_1 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case mayors_desk_0 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_1 :{
								change_to_mayors_desk_1();
								return ;
							}
						}
						return ;
					}
					case mayors_desk_1 :{
						switch(newState){
							case stone_floor :{
								change_to_stone_floor();
								return ;
							}
							case stone_walls_2 :{
								change_to_stone_walls_2();
								return ;
							}
							case stone_walls_3 :{
								change_to_stone_walls_3();
								return ;
							}
							case stone_walls_0 :{
								change_to_stone_walls_0();
								return ;
							}
							case stone_walls_1 :{
								change_to_stone_walls_1();
								return ;
							}
							case stone_walls_4 :{
								change_to_stone_walls_4();
								return ;
							}
							case bar_0 :{
								change_to_bar_0();
								return ;
							}
							case stone_walls_5 :{
								change_to_stone_walls_5();
								return ;
							}
							case bar_1 :{
								change_to_bar_1();
								return ;
							}
							case mayors_desk_0 :{
								change_to_mayors_desk_0();
								return ;
							}
						}
						return ;
					}
				}
			}
			public Images.Town.States asStates(){
				Images.Town.States result = new Images.Town.States();
				result.setCurrent(current);
				result.setState(state);
				return result;
			}
			public Gui.Drawable asStates(Gui.Drawable drawable){
				Images.Town.States result = new Images.Town.States();
				result.setCurrent(current);
				result.setState(state);
				return drawable.image(result);
			}
			public Gui.Renderable getStoneFloorState(){
				return stone_floorState;
			}
			public void setStoneFloorState(Gui.Renderable newStoneFloorState){
				stone_floorState=newStoneFloorState;
			}
			public void change_to_stone_floor(){
				setCurrent(stone_floorState);
				id=ImageStates.stone_floor;
				state=ImageStates.stone_floor;
			}
			public Gui.Renderable getStoneWallsState0(){
				return stone_wallsState_0;
			}
			public void setStoneWallsState0(Gui.Renderable newStoneWallsState0){
				stone_wallsState_0=newStoneWallsState0;
			}
			public void change_to_stone_walls_0(){
				setCurrent(stone_wallsState_0);
				id=ImageStates.stone_walls_0;
				state=ImageStates.stone_walls_0;
			}
			public Gui.Renderable getStoneWallsState1(){
				return stone_wallsState_1;
			}
			public void setStoneWallsState1(Gui.Renderable newStoneWallsState1){
				stone_wallsState_1=newStoneWallsState1;
			}
			public void change_to_stone_walls_1(){
				setCurrent(stone_wallsState_1);
				id=ImageStates.stone_walls_1;
				state=ImageStates.stone_walls_1;
			}
			public Gui.Renderable getStoneWallsState2(){
				return stone_wallsState_2;
			}
			public void setStoneWallsState2(Gui.Renderable newStoneWallsState2){
				stone_wallsState_2=newStoneWallsState2;
			}
			public void change_to_stone_walls_2(){
				setCurrent(stone_wallsState_2);
				id=ImageStates.stone_walls_2;
				state=ImageStates.stone_walls_2;
			}
			public Gui.Renderable getStoneWallsState3(){
				return stone_wallsState_3;
			}
			public void setStoneWallsState3(Gui.Renderable newStoneWallsState3){
				stone_wallsState_3=newStoneWallsState3;
			}
			public void change_to_stone_walls_3(){
				setCurrent(stone_wallsState_3);
				id=ImageStates.stone_walls_3;
				state=ImageStates.stone_walls_3;
			}
			public Gui.Renderable getStoneWallsState4(){
				return stone_wallsState_4;
			}
			public void setStoneWallsState4(Gui.Renderable newStoneWallsState4){
				stone_wallsState_4=newStoneWallsState4;
			}
			public void change_to_stone_walls_4(){
				setCurrent(stone_wallsState_4);
				id=ImageStates.stone_walls_4;
				state=ImageStates.stone_walls_4;
			}
			public Gui.Renderable getStoneWallsState5(){
				return stone_wallsState_5;
			}
			public void setStoneWallsState5(Gui.Renderable newStoneWallsState5){
				stone_wallsState_5=newStoneWallsState5;
			}
			public void change_to_stone_walls_5(){
				setCurrent(stone_wallsState_5);
				id=ImageStates.stone_walls_5;
				state=ImageStates.stone_walls_5;
			}
			public Gui.Renderable getMayorsDeskState0(){
				return mayors_deskState_0;
			}
			public void setMayorsDeskState0(Gui.Renderable newMayorsDeskState0){
				mayors_deskState_0=newMayorsDeskState0;
			}
			public void change_to_mayors_desk_0(){
				setCurrent(mayors_deskState_0);
				id=ImageStates.mayors_desk_0;
				state=ImageStates.mayors_desk_0;
			}
			public Gui.Renderable getMayorsDeskState1(){
				return mayors_deskState_1;
			}
			public void setMayorsDeskState1(Gui.Renderable newMayorsDeskState1){
				mayors_deskState_1=newMayorsDeskState1;
			}
			public void change_to_mayors_desk_1(){
				setCurrent(mayors_deskState_1);
				id=ImageStates.mayors_desk_1;
				state=ImageStates.mayors_desk_1;
			}
			public Gui.Renderable getBarState0(){
				return barState_0;
			}
			public void setBarState0(Gui.Renderable newBarState0){
				barState_0=newBarState0;
			}
			public void change_to_bar_0(){
				setCurrent(barState_0);
				id=ImageStates.bar_0;
				state=ImageStates.bar_0;
			}
			public Gui.Renderable getBarState1(){
				return barState_1;
			}
			public void setBarState1(Gui.Renderable newBarState1){
				barState_1=newBarState1;
			}
			public void change_to_bar_1(){
				setCurrent(barState_1);
				id=ImageStates.bar_1;
				state=ImageStates.bar_1;
			}
			public States (Gui.Renderable stone_floorState,Gui.Renderable stone_wallsState_0,Gui.Renderable stone_wallsState_1,Gui.Renderable stone_wallsState_2,Gui.Renderable stone_wallsState_3,Gui.Renderable stone_wallsState_4,Gui.Renderable stone_wallsState_5,Gui.Renderable mayors_deskState_0,Gui.Renderable mayors_deskState_1,Gui.Renderable barState_0,Gui.Renderable barState_1){
				super();
				this.stone_floorState=stone_floorState;
				this.stone_wallsState_0=stone_wallsState_0;
				this.stone_wallsState_1=stone_wallsState_1;
				this.stone_wallsState_2=stone_wallsState_2;
				this.stone_wallsState_3=stone_wallsState_3;
				this.stone_wallsState_4=stone_wallsState_4;
				this.stone_wallsState_5=stone_wallsState_5;
				this.mayors_deskState_0=mayors_deskState_0;
				this.mayors_deskState_1=mayors_deskState_1;
				this.barState_0=barState_0;
				this.barState_1=barState_1;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state,Gui.Renderable stone_floorState,Gui.Renderable stone_wallsState_0,Gui.Renderable stone_wallsState_1,Gui.Renderable stone_wallsState_2,Gui.Renderable stone_wallsState_3,Gui.Renderable stone_wallsState_4,Gui.Renderable stone_wallsState_5,Gui.Renderable mayors_deskState_0,Gui.Renderable mayors_deskState_1,Gui.Renderable barState_0,Gui.Renderable barState_1){
				super(current,id,state);
				this.stone_floorState=stone_floorState;
				this.stone_wallsState_0=stone_wallsState_0;
				this.stone_wallsState_1=stone_wallsState_1;
				this.stone_wallsState_2=stone_wallsState_2;
				this.stone_wallsState_3=stone_wallsState_3;
				this.stone_wallsState_4=stone_wallsState_4;
				this.stone_wallsState_5=stone_wallsState_5;
				this.mayors_deskState_0=mayors_deskState_0;
				this.mayors_deskState_1=mayors_deskState_1;
				this.barState_0=barState_0;
				this.barState_1=barState_1;
			}
			public States (Gui.Renderable current,ImageStates id,ImageStates state){
				super(current,id,state);
			}
		}
	}
}
