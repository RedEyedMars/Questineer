package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import main.rules.*;

public class Rules extends ParseList {

	@Override
	public String getName() {
		return "rules";
	}
	@Override
	public String getSingular() {
		return "rule";
	}

	public static final IRule base = Base.parser;
	public static final IRule import_any = ImportAny.parser;
	public static final IRule aspect_declaration = AspectDeclaration.parser;
	public static final IRule item_declaration = ItemDeclaration.parser;
	public static final IRule item_parameter = ItemParameter.parser;
	public static final IRule affinity_declaration = AffinityDeclaration.parser;
	public static final IRule condition_declaration = ConditionDeclaration.parser;
	public static final IRule condition_element = ConditionElement.parser;
	public static final IRule trait_declaration = TraitDeclaration.parser;
	public static final IRule trait_element = TraitElement.parser;
	public static final IRule activity_declaration = ActivityDeclaration.parser;
	public static final IRule activity_element = ActivityElement.parser;
	public static final IRule attack_declaration = AttackDeclaration.parser;
	public static final IRule attack_element = AttackElement.parser;
	public static final IRule support_declaration = SupportDeclaration.parser;
	public static final IRule support_element = SupportElement.parser;
	public static final IRule quest_type_declaration = QuestTypeDeclaration.parser;
	public static final IRule quest_type_element = QuestTypeElement.parser;
	public static final IRule quest_destination = QuestDestination.parser;
	public static final IRule quest_tile_description = QuestTileDescription.parser;
	public static final IRule skill_declaration = SkillDeclaration.parser;
	public static final IRule skill_element = SkillElement.parser;
	public static final IRule association_declaration = AssociationDeclaration.parser;
	public static final IRule association_element = AssociationElement.parser;
	public static final IRule association_start = AssociationStart.parser;
	public static final IRule association_join = AssociationJoin.parser;
	public static final IRule association_event = AssociationEvent.parser;
	public static final IRule reason_declaration = ReasonDeclaration.parser;
	public static final IRule statRange = StatRange.parser;
	public static final IRule entity_declaration = EntityDeclaration.parser;
	public static final IRule entity_definition = EntityDefinition.parser;
	public static final IRule map_header = MapHeader.parser;
	public static final IRule map_connection = MapConnection.parser;
	public static final IRule map_declaration = MapDeclaration.parser;
	public static final IRule shape_type = ShapeType.parser;
	public static final IRule tile_declaration = TileDeclaration.parser;
	public static final IRule tile_definition = TileDefinition.parser;
	public static final IRule tile_element = TileElement.parser;
	public static final IRule crawler_element = CrawlerElement.parser;
	public static final IRule branch_element = BranchElement.parser;
	public static final IRule tile_cost = TileCost.parser;
	public static final IRule payment_type_declaration = PaymentTypeDeclaration.parser;
	public static final IRule event_declaration = EventDeclaration.parser;
	public static final IRule num = Num.parser;
	public static final IRule range = Range.parser;
	public static final IRule operator = Operator.parser;
	public static final IRule body_element = BodyElement.parser;
	public static final IRule acquisition = Acquisition.parser;
	public static final IRule imposition = Imposition.parser;
	public static final IRule quest_addition = QuestAddition.parser;
	public static final IRule if_statement = IfStatement.parser;
	public static final IRule for_statement = ForStatement.parser;
	public static final IRule while_statement = WhileStatement.parser;
	public static final IRule boolean_statement = BooleanStatement.parser;
	public static final IRule boolean_element = BooleanElement.parser;
	public static final IRule has_chance = HasChance.parser;
	public static final IRule spawn_statement = SpawnStatement.parser;
	public static final IRule has_statement = HasStatement.parser;
	public static final IRule requirement = Requirement.parser;
	public static final IRule requirement_element = RequirementElement.parser;
	public static final IRule return_statement = ReturnStatement.parser;
	public static final IRule statement = Statement.parser;
	public static final IRule variable_declaration = VariableDeclaration.parser;
	public static final IRule variable_header = VariableHeader.parser;
	public static final IRule variable_call = VariableCall.parser;
	public static final IRule variable_call_element = VariableCallElement.parser;
	public static final IRule variable_group = VariableGroup.parser;
	public static final IRule method = Method.parser;
	public static final IRule type_name = TypeName.parser;
	public static final IRule image_declaration = ImageDeclaration.parser;
	public static final IRule image_id = ImageId.parser;
	public static final IRule animation = Animation.parser;

	public static final ChoiceParser parser = new ChoiceParser(
				base,import_any,aspect_declaration,item_declaration,item_parameter,affinity_declaration,condition_declaration,condition_element,trait_declaration,trait_element,activity_declaration,activity_element,attack_declaration,attack_element,support_declaration,support_element,quest_type_declaration,quest_type_element,quest_destination,quest_tile_description,skill_declaration,skill_element,association_declaration,association_element,association_start,association_join,association_event,reason_declaration,statRange,entity_declaration,entity_definition,map_header,map_connection,map_declaration,shape_type,tile_declaration,tile_definition,tile_element,crawler_element,branch_element,tile_cost,payment_type_declaration,event_declaration,num,range,operator,body_element,acquisition,imposition,quest_addition,if_statement,for_statement,while_statement,boolean_statement,boolean_element,has_chance,spawn_statement,has_statement,requirement,requirement_element,return_statement,statement,variable_declaration,variable_header,variable_call,variable_call_element,variable_group,method,type_name,image_declaration,image_id,animation);
}