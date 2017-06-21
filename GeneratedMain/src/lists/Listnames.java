package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class Listnames extends ParseList {

	@Override
	public String getName() {
		return "listnames";
	}
	@Override
	public String getSingular() {
		return "listname";
	}

	public static final RegexParser comment = new RegexParser("comment","listnames","comments\b");
	public static final RegexParser event_name = new RegexParser("event_name","listnames","event_names\b");
	public static final RegexParser eventToken = new RegexParser("eventToken","listnames","eventTokens\b");
	public static final RegexParser eventBrace = new RegexParser("eventBrace","listnames","eventBraces\b");
	public static final RegexParser eventImport = new RegexParser("eventImport","listnames","eventImports\b");
	public static final RegexParser aspect_name = new RegexParser("aspect_name","listnames","aspect_names\b");
	public static final RegexParser aspectToken = new RegexParser("aspectToken","listnames","aspectTokens\b");
	public static final RegexParser aspectBrace = new RegexParser("aspectBrace","listnames","aspectBraces\b");
	public static final RegexParser aspectImport = new RegexParser("aspectImport","listnames","aspectImports\b");
	public static final RegexParser itemToken = new RegexParser("itemToken","listnames","itemTokens\b");
	public static final RegexParser itemBrace = new RegexParser("itemBrace","listnames","itemBraces\b");
	public static final RegexParser itemImport = new RegexParser("itemImport","listnames","itemImports\b");
	public static final RegexParser attack_name = new RegexParser("attack_name","listnames","attack_names\b");
	public static final RegexParser attackToken = new RegexParser("attackToken","listnames","attackTokens\b");
	public static final RegexParser attackBrace = new RegexParser("attackBrace","listnames","attackBraces\b");
	public static final RegexParser attack = new RegexParser("attack","listnames","attacks\b");
	public static final RegexParser skill_name = new RegexParser("skill_name","listnames","skill_names\b");
	public static final RegexParser skillToken = new RegexParser("skillToken","listnames","skillTokens\b");
	public static final RegexParser skillBrace = new RegexParser("skillBrace","listnames","skillBraces\b");
	public static final RegexParser skillImport = new RegexParser("skillImport","listnames","skillImports\b");
	public static final RegexParser affinity_name = new RegexParser("affinity_name","listnames","affinity_names\b");
	public static final RegexParser affinityToken = new RegexParser("affinityToken","listnames","affinityTokens\b");
	public static final RegexParser affinityBrace = new RegexParser("affinityBrace","listnames","affinityBraces\b");
	public static final RegexParser affinityImport = new RegexParser("affinityImport","listnames","affinityImports\b");
	public static final RegexParser condition_name = new RegexParser("condition_name","listnames","condition_names\b");
	public static final RegexParser conditionToken = new RegexParser("conditionToken","listnames","conditionTokens\b");
	public static final RegexParser conditionBrace = new RegexParser("conditionBrace","listnames","conditionBraces\b");
	public static final RegexParser conditionImport = new RegexParser("conditionImport","listnames","conditionImports\b");
	public static final RegexParser trait_name = new RegexParser("trait_name","listnames","trait_names\b");
	public static final RegexParser traitToken = new RegexParser("traitToken","listnames","traitTokens\b");
	public static final RegexParser traitBrace = new RegexParser("traitBrace","listnames","traitBraces\b");
	public static final RegexParser trait = new RegexParser("trait","listnames","traits\b");
	public static final RegexParser hero_stat = new RegexParser("hero_stat","listnames","hero_stats\b");
	public static final RegexParser generalToken = new RegexParser("generalToken","listnames","generalTokens\b");
	public static final RegexParser generalBrace = new RegexParser("generalBrace","listnames","generalBraces\b");
	public static final RegexParser generalAltBrace = new RegexParser("generalAltBrace","listnames","generalAltBraces\b");
	public static final RegexParser image_name = new RegexParser("image_name","listnames","image_names\b");
	public static final RegexParser imageToken = new RegexParser("imageToken","listnames","imageTokens\b");
	public static final RegexParser imageBrace = new RegexParser("imageBrace","listnames","imageBraces\b");
	public static final RegexParser imageImport = new RegexParser("imageImport","listnames","imageImports\b");

	public static final ChoiceParser parser = new ChoiceParser(
				comment,event_name,eventToken,eventBrace,eventImport,aspect_name,aspectToken,aspectBrace,aspectImport,itemToken,itemBrace,itemImport,attack_name,attackToken,attackBrace,attack,skill_name,skillToken,skillBrace,skillImport,affinity_name,affinityToken,affinityBrace,affinityImport,condition_name,conditionToken,conditionBrace,conditionImport,trait_name,traitToken,traitBrace,trait,hero_stat,generalToken,generalBrace,generalAltBrace,image_name,imageToken,imageBrace,imageImport);
}