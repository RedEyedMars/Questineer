package com.rem.qstnr.overview.treasuries;
import java.util.HashMap;
import com.rem.qstnr.misc.Int;
import com.rem.qstnr.menus.Menu;
import com.rem.qstnr.overview.treasuries.Treasury;
import java.util.Map;
public class Treasury {
	protected Map<Treasury.PaymentType.Id, Int> idMap = new HashMap<Treasury.PaymentType.Id, Int>();
	public Map<Treasury.PaymentType.Id, Int> getIdMap(){
		return idMap;
	}
	public void setIdMap(Map<Treasury.PaymentType.Id, Int> newIdMap){
		idMap=newIdMap;
	}
	public Integer get(Treasury.PaymentType.Id id){
		if(idMap.containsKey(id)==false){
			idMap.put(id,new Int(0));
		}
		return idMap.get(id).getValue();
	}
	public void increase(Treasury.PaymentType.Id id){
		if(idMap.containsKey(id)==false){
			idMap.put(id,new Int(0));
		}
		idMap.get(id).setValue(idMap.get(id).getValue()+1);
	}
	public void increase(Treasury.PaymentType.Id id,Integer amount){
		if(idMap.containsKey(id)==false){
			idMap.put(id,new Int(0));
		}
		idMap.get(id).setValue(idMap.get(id).getValue()+amount);
	}
	public Treasury (Map<Treasury.PaymentType.Id, Int> idMap){
		super();
		this.idMap=idMap;
	}
	public Treasury (){
		super();
	}
	public static class PaymentType {
		protected String shortForm;
		protected String longForm;
		public String getShortForm(){
			return shortForm;
		}
		public void setShortForm(String newShortForm){
			shortForm=newShortForm;
		}
		public String getLongForm(){
			return longForm;
		}
		public void setLongForm(String newLongForm){
			longForm=newLongForm;
		}
		public PaymentType (String shortForm,String longForm){
			super();
			this.shortForm=shortForm;
			this.longForm=longForm;
		}
		public PaymentType (){
			super();
		}
		public static class Id {
			public Id (){
				super();
			}
		}
	}
	public static class PaymentTypes {
		public PaymentTypes (){
			super();
		}
		public static class Gold {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "G";
			}
			public String getLongForm(){
				return "Gold";
			}
			public Gold (){
				super();
			}
		}
		public static class Wood {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "W";
			}
			public String getLongForm(){
				return "Wood";
			}
			public Wood (){
				super();
			}
		}
		public static class Stone {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "S";
			}
			public String getLongForm(){
				return "Stone";
			}
			public Stone (){
				super();
			}
		}
		public static class Fairy_Dust {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "FD";
			}
			public String getLongForm(){
				return "FairyDust";
			}
			public Fairy_Dust (){
				super();
			}
		}
		public static class Stick {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "Stick";
			}
			public String getLongForm(){
				return "Stick";
			}
			public Stick (){
				super();
			}
		}
		public static class Dagger {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "Dagger";
			}
			public String getLongForm(){
				return "Dagger";
			}
			public Dagger (){
				super();
			}
		}
		public static class Seed {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "Seed";
			}
			public String getLongForm(){
				return "Seed";
			}
			public Seed (){
				super();
			}
		}
		public static class TreeSeed {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "TreeSeed";
			}
			public String getLongForm(){
				return "TreeSeed";
			}
			public TreeSeed (){
				super();
			}
		}
		public static class DeadMeat {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "DeadMeat";
			}
			public String getLongForm(){
				return "DeadMeat";
			}
			public DeadMeat (){
				super();
			}
		}
		public static class Honey {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "Honey";
			}
			public String getLongForm(){
				return "Honey";
			}
			public Honey (){
				super();
			}
		}
		public static class Berries {
			public static Treasury.PaymentType.Id id = new Treasury.PaymentType.Id();
			public String getShortForm(){
				return "Berries";
			}
			public String getLongForm(){
				return "Berries";
			}
			public Berries (){
				super();
			}
		}
	}
	public static class Reward {
		public Boolean isPlacable(){
			return false;
		}
		public Menu.Placable getPlacable(){
			return null;
		}
		public Reward (){
			super();
		}
	}
	public static class Cost {
		public Boolean canPay(Treasury treasury){
			if(isFree()){
				return true;
			}
			else{
				return treasury.get(getType())>=getAmount();
			}
		}
		public Treasury.Reward getReward(){
			return null;
		}
		public Boolean isFree(){
			return false;
		}
		public int getAmount(){
			return 1;
		}
		public Treasury.PaymentType.Id getType(){
			return null;
		}
		public Cost (){
			super();
		}
	}
}
