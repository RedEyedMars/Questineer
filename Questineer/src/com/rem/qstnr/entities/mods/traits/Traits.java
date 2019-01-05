package com.rem.qstnr.entities.mods.traits;
import com.rem.qstnr.entities.Entity;
import java.util.ArrayList;
import com.rem.qstnr.entities.mods.traits.Traits;
import com.rem.qstnr.misc.interfaces.Listenable;
import com.rem.qstnr.events.Events;
import java.util.List;
import com.rem.qstnr.entities.mods.traits.Trait;
public class Traits {
	public static Wounded Wounded = new Wounded();
	public static Maimed Maimed = new Maimed();
	public static WoundHealed WoundHealed = new WoundHealed();
	public static WoundScarred WoundScarred = new WoundScarred();
	public static Cowardly Cowardly = new Cowardly();
	public static Hardy Hardy = new Hardy();
	public static HandyWithAKnife HandyWithAKnife = new HandyWithAKnife();
	public static ButterFingers ButterFingers = new ButterFingers();
	public static Confused Confused = new Confused();
	public static Trait[] traits = new Trait[]{Wounded,Maimed,WoundHealed,WoundScarred,Cowardly,Hardy,HandyWithAKnife,ButterFingers,Confused};
	public static Trait create(String traitName){
		if("Confused".equals(traitName)){
			return new Traits.Confused();
		}
		if("ButterFingers".equals(traitName)){
			return new Traits.ButterFingers();
		}
		if("HandyWithAKnife".equals(traitName)){
			return new Traits.HandyWithAKnife();
		}
		if("Hardy".equals(traitName)){
			return new Traits.Hardy();
		}
		if("Cowardly".equals(traitName)){
			return new Traits.Cowardly();
		}
		if("WoundScarred".equals(traitName)){
			return new Traits.WoundScarred();
		}
		if("WoundHealed".equals(traitName)){
			return new Traits.WoundHealed();
		}
		if("Maimed".equals(traitName)){
			return new Traits.Maimed();
		}
		if("Wounded".equals(traitName)){
			return new Traits.Wounded();
		}
		return null;
	}
	public Traits (){
		super();
	}
	public static class Wounded extends Trait {
		public static Trait.Id id = Trait.Id.Wounded;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "Wounded";
		}
		public boolean hasRequirements(Entity candidate){
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public Wounded (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Wounded (){
			super();
		}
		public Wounded (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Wounded (String name,String description){
			super(name,description);
		}
	}
	public static class Maimed extends Trait {
		public static Trait.Id id = Trait.Id.Maimed;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "Maimed";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.getCon().getValue()<=7){
				return false;
			}
			if(candidate.has(Trait.Id.Wounded)){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public Maimed (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Maimed (){
			super();
		}
		public Maimed (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Maimed (String name,String description){
			super(name,description);
		}
	}
	public static class WoundHealed extends Trait {
		public static Trait.Id id = Trait.Id.WoundHealed;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "WoundHealed";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.getCon().getValue()<=6){
				return false;
			}
			if(candidate.has(Trait.Id.Wounded)){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public WoundHealed (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public WoundHealed (){
			super();
		}
		public WoundHealed (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public WoundHealed (String name,String description){
			super(name,description);
		}
	}
	public static class WoundScarred extends Trait {
		public static Trait.Id id = Trait.Id.WoundScarred;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "WoundScarred";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.has(Trait.Id.Wounded)){
				return false;
			}
			if(!(candidate.has(Trait.Id.Hardy))){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public WoundScarred (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public WoundScarred (){
			super();
		}
		public WoundScarred (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public WoundScarred (String name,String description){
			super(name,description);
		}
	}
	public static class Cowardly extends Trait {
		public static Trait.Id id = Trait.Id.Cowardly;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "Cowardly";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.has(Trait.Id.Wounded)&&candidate.has(Trait.Id.Confused)){
				return false;
			}
			if(!(candidate.has(Trait.Id.Hardy))){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public Cowardly (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Cowardly (){
			super();
		}
		public Cowardly (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Cowardly (String name,String description){
			super(name,description);
		}
	}
	public static class Hardy extends Trait {
		public static Trait.Id id = Trait.Id.Hardy;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "Hardy";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.getCon().getValue()<=10){
				return false;
			}
			if(candidate.has(Trait.Id.WoundHealed)&&candidate.has(Trait.Id.WoundScarred)){
				return false;
			}
			if(!(candidate.has(Trait.Id.Cowardly))){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public Hardy (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Hardy (){
			super();
		}
		public Hardy (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Hardy (String name,String description){
			super(name,description);
		}
	}
	public static class HandyWithAKnife extends Trait {
		public static Trait.Id id = Trait.Id.HandyWithAKnife;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "HandyWithAKnife";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.getDex().getValue()<=13){
				return false;
			}
			if(!(candidate.has(Trait.Id.ButterFingers))){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public HandyWithAKnife (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public HandyWithAKnife (){
			super();
		}
		public HandyWithAKnife (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public HandyWithAKnife (String name,String description){
			super(name,description);
		}
	}
	public static class ButterFingers extends Trait {
		public static Trait.Id id = Trait.Id.ButterFingers;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "ButterFingers";
		}
		public boolean hasRequirements(Entity candidate){
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public ButterFingers (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public ButterFingers (){
			super();
		}
		public ButterFingers (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public ButterFingers (String name,String description){
			super(name,description);
		}
	}
	public static class Confused extends Trait {
		public static Trait.Id id = Trait.Id.Confused;
		protected List<Listenable<Events.Gain>> gainListeners = null;
		protected List<Listenable<Events.Loss>> lossListeners = null;
		public String getName(){
			return "Confused";
		}
		public boolean hasRequirements(Entity candidate){
			if(candidate.getMnd().getValue()>=12){
				return false;
			}
			return true;
		}
		public Boolean on(Events.Gain event){
			return true;
		}
		public Boolean add(Events.Gain.Listener newListener){
			if(gainListeners==null){
				gainListeners=new ArrayList<Listenable<Events.Gain>>();
			}
			return gainListeners.add(newListener);
		}
		public List<Listenable<Events.Gain>> getGainListeners(){
			return gainListeners;
		}
		public void setGainListeners(List<Listenable<Events.Gain>> newGainListeners){
			gainListeners=newGainListeners;
		}
		public Boolean on(Events.Loss event){
			return true;
		}
		public Boolean add(Events.Loss.Listener newListener){
			if(lossListeners==null){
				lossListeners=new ArrayList<Listenable<Events.Loss>>();
			}
			return lossListeners.add(newListener);
		}
		public List<Listenable<Events.Loss>> getLossListeners(){
			return lossListeners;
		}
		public void setLossListeners(List<Listenable<Events.Loss>> newLossListeners){
			lossListeners=newLossListeners;
		}
		public Confused (List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super();
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Confused (){
			super();
		}
		public Confused (String name,String description,List<Listenable<Events.Gain>> gainListeners,List<Listenable<Events.Loss>> lossListeners){
			super(name,description);
			this.gainListeners=gainListeners;
			this.lossListeners=lossListeners;
		}
		public Confused (String name,String description){
			super(name,description);
		}
	}
}
