package lists;

import com.rem.parser.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;

public class Rulenames extends ParseList {

	@Override
	public String getName() {
		return "rulenames";
	}
	@Override
	public String getSingular() {
		return "rulename";
	}

	public static final RegexParser base = new RegexParser("base","rulenames","base");
	public static final RegexParser import_any = new RegexParser("import_any","rulenames","import_any");
	public static final RegexParser aspect_declaration = new RegexParser("aspect_declaration","rulenames","aspect_declaration");
	public static final RegexParser item_declaration = new RegexParser("item_declaration","rulenames","item_declaration");
	public static final RegexParser item_parameter = new RegexParser("item_parameter","rulenames","item_parameter");
	public static final RegexParser affinity_declaration = new RegexParser("affinity_declaration","rulenames","affinity_declaration");
	public static final RegexParser condition_declaration = new RegexParser("condition_declaration","rulenames","condition_declaration");
	public static final RegexParser condition_element = new RegexParser("condition_element","rulenames","condition_element");
	public static final RegexParser trait_declaration = new RegexParser("trait_declaration","rulenames","trait_declaration");
	public static final RegexParser trait_element = new RegexParser("trait_element","rulenames","trait_element");
	public static final RegexParser activity_declaration = new RegexParser("activity_declaration","rulenames","activity_declaration");
	public static final RegexParser activity_element = new RegexParser("activity_element","rulenames","activity_element");
	public static final RegexParser attack_declaration = new RegexParser("attack_declaration","rulenames","attack_declaration");
	public static final RegexParser attack_element = new RegexParser("attack_element","rulenames","attack_element");
	public static final RegexParser support_declaration = new RegexParser("support_declaration","rulenames","support_declaration");
	public static final RegexParser support_element = new RegexParser("support_element","rulenames","support_element");
	public static final RegexParser quest_type_declaration = new RegexParser("quest_type_declaration","rulenames","quest_type_declaration");
	public static final RegexParser quest_type_element = new RegexParser("quest_type_element","rulenames","quest_type_element");
	public static final RegexParser quest_destination = new RegexParser("quest_destination","rulenames","quest_destination");
	public static final RegexParser quest_tile_description = new RegexParser("quest_tile_description","rulenames","quest_tile_description");
	public static final RegexParser skill_declaration = new RegexParser("skill_declaration","rulenames","skill_declaration");
	public static final RegexParser skill_element = new RegexParser("skill_element","rulenames","skill_element");
	public static final RegexParser association_declaration = new RegexParser("association_declaration","rulenames","association_declaration");
	public static final RegexParser association_element = new RegexParser("association_element","rulenames","association_element");
	public static final RegexParser association_start = new RegexParser("association_start","rulenames","association_start");
	public static final RegexParser association_join = new RegexParser("association_join","rulenames","association_join");
	public static final RegexParser association_event = new RegexParser("association_event","rulenames","association_event");
	public static final RegexParser reason_declaration = new RegexParser("reason_declaration","rulenames","reason_declaration");
	public static final RegexParser statRange = new RegexParser("statRange","rulenames","statRange");
	public static final RegexParser entity_declaration = new RegexParser("entity_declaration","rulenames","entity_declaration");
	public static final RegexParser entity_definition = new RegexParser("entity_definition","rulenames","entity_definition");
	public static final RegexParser map_header = new RegexParser("map_header","rulenames","map_header");
	public static final RegexParser map_connection = new RegexParser("map_connection","rulenames","map_connection");
	public static final RegexParser map_declaration = new RegexParser("map_declaration","rulenames","map_declaration");
	public static final RegexParser shape_type = new RegexParser("shape_type","rulenames","shape_type");
	public static final RegexParser tile_declaration = new RegexParser("tile_declaration","rulenames","tile_declaration");
	public static final RegexParser tile_definition = new RegexParser("tile_definition","rulenames","tile_definition");
	public static final RegexParser tile_element = new RegexParser("tile_element","rulenames","tile_element");
	public static final RegexParser crawler_element = new RegexParser("crawler_element","rulenames","crawler_element");
	public static final RegexParser branch_element = new RegexParser("branch_element","rulenames","branch_element");
	public static final RegexParser tile_cost = new RegexParser("tile_cost","rulenames","tile_cost");
	public static final RegexParser payment_type_declaration = new RegexParser("payment_type_declaration","rulenames","payment_type_declaration");
	public static final RegexParser event_declaration = new RegexParser("event_declaration","rulenames","event_declaration");
	public static final RegexParser num = new RegexParser("num","rulenames","num");
	public static final RegexParser range = new RegexParser("range","rulenames","range");
	public static final RegexParser operator = new RegexParser("operator","rulenames","operator");
	public static final RegexParser body_element = new RegexParser("body_element","rulenames","body_element");
	public static final RegexParser acquisition = new RegexParser("acquisition","rulenames","acquisition");
	public static final RegexParser imposition = new RegexParser("imposition","rulenames","imposition");
	public static final RegexParser quest_addition = new RegexParser("quest_addition","rulenames","quest_addition");
	public static final RegexParser if_statement = new RegexParser("if_statement","rulenames","if_statement");
	public static final RegexParser for_statement = new RegexParser("for_statement","rulenames","for_statement");
	public static final RegexParser while_statement = new RegexParser("while_statement","rulenames","while_statement");
	public static final RegexParser boolean_statement = new RegexParser("boolean_statement","rulenames","boolean_statement");
	public static final RegexParser boolean_element = new RegexParser("boolean_element","rulenames","boolean_element");
	public static final RegexParser has_chance = new RegexParser("has_chance","rulenames","has_chance");
	public static final RegexParser spawn_statement = new RegexParser("spawn_statement","rulenames","spawn_statement");
	public static final RegexParser has_statement = new RegexParser("has_statement","rulenames","has_statement");
	public static final RegexParser requirement = new RegexParser("requirement","rulenames","requirement");
	public static final RegexParser requirement_element = new RegexParser("requirement_element","rulenames","requirement_element");
	public static final RegexParser return_statement = new RegexParser("return_statement","rulenames","return_statement");
	public static final RegexParser statement = new RegexParser("statement","rulenames","statement");
	public static final RegexParser variable_declaration = new RegexParser("variable_declaration","rulenames","variable_declaration");
	public static final RegexParser variable_header = new RegexParser("variable_header","rulenames","variable_header");
	public static final RegexParser variable_call = new RegexParser("variable_call","rulenames","variable_call");
	public static final RegexParser variable_call_element = new RegexParser("variable_call_element","rulenames","variable_call_element");
	public static final RegexParser variable_group = new RegexParser("variable_group","rulenames","variable_group");
	public static final RegexParser method = new RegexParser("method","rulenames","method");
	public static final RegexParser type_name = new RegexParser("type_name","rulenames","type_name");
	public static final RegexParser image_declaration = new RegexParser("image_declaration","rulenames","image_declaration");
	public static final RegexParser image_id = new RegexParser("image_id","rulenames","image_id");
	public static final RegexParser animation = new RegexParser("animation","rulenames","animation");

	public static final ChoiceParser parser = new ChoiceParser(
				base,import_any,aspect_declaration,item_declaration,item_parameter,affinity_declaration,condition_declaration,condition_element,trait_declaration,trait_element,activity_declaration,activity_element,attack_declaration,attack_element,support_declaration,support_element,quest_type_declaration,quest_type_element,quest_destination,quest_tile_description,skill_declaration,skill_element,association_declaration,association_element,association_start,association_join,association_event,reason_declaration,statRange,entity_declaration,entity_definition,map_header,map_connection,map_declaration,shape_type,tile_declaration,tile_definition,tile_element,crawler_element,branch_element,tile_cost,payment_type_declaration,event_declaration,num,range,operator,body_element,acquisition,imposition,quest_addition,if_statement,for_statement,while_statement,boolean_statement,boolean_element,has_chance,spawn_statement,has_statement,requirement,requirement_element,return_statement,statement,variable_declaration,variable_header,variable_call,variable_call_element,variable_group,method,type_name,image_declaration,image_id,animation);
}