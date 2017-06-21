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
	public static final RegexParser event_declaration = new RegexParser("event_declaration","rulenames","event_declaration");
	public static final RegexParser aspect_declaration = new RegexParser("aspect_declaration","rulenames","aspect_declaration");
	public static final RegexParser item_declaration = new RegexParser("item_declaration","rulenames","item_declaration");
	public static final RegexParser item_parameter = new RegexParser("item_parameter","rulenames","item_parameter");
	public static final RegexParser attack_declaration = new RegexParser("attack_declaration","rulenames","attack_declaration");
	public static final RegexParser attack_element = new RegexParser("attack_element","rulenames","attack_element");
	public static final RegexParser skill_declaration = new RegexParser("skill_declaration","rulenames","skill_declaration");
	public static final RegexParser affinity_declaration = new RegexParser("affinity_declaration","rulenames","affinity_declaration");
	public static final RegexParser condition_declaration = new RegexParser("condition_declaration","rulenames","condition_declaration");
	public static final RegexParser condition_element = new RegexParser("condition_element","rulenames","condition_element");
	public static final RegexParser trait_declaration = new RegexParser("trait_declaration","rulenames","trait_declaration");
	public static final RegexParser trait_element = new RegexParser("trait_element","rulenames","trait_element");
	public static final RegexParser statRange = new RegexParser("statRange","rulenames","statRange");
	public static final RegexParser num = new RegexParser("num","rulenames","num");
	public static final RegexParser range = new RegexParser("range","rulenames","range");
	public static final RegexParser operator = new RegexParser("operator","rulenames","operator");
	public static final RegexParser body_element = new RegexParser("body_element","rulenames","body_element");
	public static final RegexParser acquisition = new RegexParser("acquisition","rulenames","acquisition");
	public static final RegexParser imposition = new RegexParser("imposition","rulenames","imposition");
	public static final RegexParser if_statement = new RegexParser("if_statement","rulenames","if_statement");
	public static final RegexParser boolean_statement = new RegexParser("boolean_statement","rulenames","boolean_statement");
	public static final RegexParser boolean_element = new RegexParser("boolean_element","rulenames","boolean_element");
	public static final RegexParser has_chance = new RegexParser("has_chance","rulenames","has_chance");
	public static final RegexParser has_statement = new RegexParser("has_statement","rulenames","has_statement");
	public static final RegexParser requirement = new RegexParser("requirement","rulenames","requirement");
	public static final RegexParser requirement_element = new RegexParser("requirement_element","rulenames","requirement_element");
	public static final RegexParser return_statement = new RegexParser("return_statement","rulenames","return_statement");
	public static final RegexParser statement = new RegexParser("statement","rulenames","statement");
	public static final RegexParser variable_declaration = new RegexParser("variable_declaration","rulenames","variable_declaration");
	public static final RegexParser variable_call = new RegexParser("variable_call","rulenames","variable_call");
	public static final RegexParser method = new RegexParser("method","rulenames","method");
	public static final RegexParser type_name = new RegexParser("type_name","rulenames","type_name");
	public static final RegexParser image_declaration = new RegexParser("image_declaration","rulenames","image_declaration");
	public static final RegexParser image_id = new RegexParser("image_id","rulenames","image_id");
	public static final RegexParser animation = new RegexParser("animation","rulenames","animation");

	public static final ChoiceParser parser = new ChoiceParser(
				base,import_any,event_declaration,aspect_declaration,item_declaration,item_parameter,attack_declaration,attack_element,skill_declaration,affinity_declaration,condition_declaration,condition_element,trait_declaration,trait_element,statRange,num,range,operator,body_element,acquisition,imposition,if_statement,boolean_statement,boolean_element,has_chance,has_statement,requirement,requirement_element,return_statement,statement,variable_declaration,variable_call,method,type_name,image_declaration,image_id,animation);
}