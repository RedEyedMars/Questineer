package main.rules;

import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import lists.*;

public class ImportAny extends ConcreteRule {

	public static final IRule parser = new ImportAny();

	public ImportAny(){
		super("import_any");
	}
	@Override
	public void setup(){
		set(
			new ChoiceParser(
					PaymentImports.IMPORT_PAYMENT_TYPE,
					EventImports.IMPORT_EVENT,
					ItemImports.IMPORT_ITEM,
					ImageImports.IMPORT_IMAGE,
					TraitImports.IMPORT_TRAIT,
					AspectImports.IMPORT_ASPECT,
					AffinityImports.IMPORT_AFFINITY,
					ConditionImports.IMPORT_CONDITION,
					ActivityImports.IMPORT_ACTIVITY,
					SkillImports.IMPORT_SKILL,
					AttackImports.IMPORT_ATTACK,
					SupportImports.IMPORT_SUPPORT,
					QuestImports.IMPORT_QUEST,
					MapImports.IMPORT_MAP,
					ReasonImports.IMPORT_REASON,
					AssociationImports.IMPORT_ASSOCIATION,
					ColourImporters.IMPORT_COLOUR,
					AnimationImportss.IMPORT_ANIMATION_TYPE,
					ImageImports.IMPORT_IMAGE,
					DrawableImportss.IMPORT_DRAWABLE,
					LayerImporters.IMPORT_LAYER));

	}

}