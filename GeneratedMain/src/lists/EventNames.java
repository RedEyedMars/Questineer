package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class EventNames extends ParseList {

	@Override
	public String getName() {
		return "event_names";
	}
	@Override
	public String getSingular() {
		return "event_name";
	}

	public static final RegexParser equip = new RegexParser("equip","event_names","equip");
	public static final RegexParser unequip = new RegexParser("unequip","event_names","unequip");
	public static final RegexParser change_item = new RegexParser("change_item","event_names","change_item");
	public static final RegexParser hit = new RegexParser("hit","event_names","hit");
	public static final RegexParser miss = new RegexParser("miss","event_names","miss");
	public static final RegexParser pre_attack = new RegexParser("pre_attack","event_names","pre_attack");
	public static final RegexParser post_attack = new RegexParser("post_attack","event_names","post_attack");
	public static final RegexParser tick = new RegexParser("tick","event_names","tick");
	public static final RegexParser gain = new RegexParser("gain","event_names","gain");
	public static final RegexParser loss = new RegexParser("loss","event_names","loss");
	public static final RegexParser die = new RegexParser("die","event_names","die");

	public static final ChoiceParser parser = new ChoiceParser(
				equip,unequip,change_item,hit,miss,pre_attack,post_attack,tick,gain,loss,die);
}