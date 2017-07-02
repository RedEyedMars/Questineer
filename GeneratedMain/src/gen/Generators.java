package gen;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import gen.checks.*;
import gen.entries.*;
import gen.properties.*;
import lists.*;

public class Generators extends Object {

	public static final GeneralGenerator general = new GeneralGenerator();
	public static final ImageGenerator image = new ImageGenerator();
	public static final EventsGenerator events = new EventsGenerator();
	public static final AffinitiesGenerator affinities = new AffinitiesGenerator();
	public static final ConditionsGenerator conditions = new ConditionsGenerator();
	public static final TraitsGenerator traits = new TraitsGenerator();
	public static final AttacksGenerator attacks = new AttacksGenerator();
	public static final SkillsGenerator skills = new SkillsGenerator();
	public static final AspectsGenerator aspects = new AspectsGenerator();
	public static final ItemsGenerator items = new ItemsGenerator();
	public static final EntitiesGenerator entities = new EntitiesGenerator();
	public static final EnvironmentsGenerator environments = new EnvironmentsGenerator();
	public static final MainGenerator main = new MainGenerator();
	public static final Generator[] _ = new Generator[]{general,image,events,affinities,conditions,traits,attacks,skills,aspects,items,entities,environments,main};
}