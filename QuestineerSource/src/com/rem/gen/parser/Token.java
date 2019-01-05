package com.rem.gen.parser;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;

public interface Token extends Function<Token.Id, Supplier<Token>>{
	public Token get(Token.Id tokenName);
	public Token getLast();
	public Token getLast(Token.Id tokenName);
	public List<Token> getAllSafely(Token.Id id);
	public List<Token> getAll();
	public void add(Token newToken);
	public String err();
	public String err(int tab);
	public void print();
	public void print(int tab);
	public void printShort();
	public String getFileName();
	public int getLineNumber();
	public String getValue();
	public Token.Id getName();
	public static enum Id{
		_SYNTAX,
		ROOT,
		ANON,
		_base,
		_loadBody,
		_import_any,
		_comments,
		_NAME,
		_FLOAT,
		_INTEGER,
		_FILE_NAME,
		_TITLE,
		_DESCRIPTION,
		_ORDINAL,
		_import_aspect,
		_import_aspect__file_import,
		_aspect_declaration,
		_aspectName,
		_import_item,
		_import_item__file_import,
		_item_declaration,
		_itemName,
		_item_parameter,
		_hp,
		_attack,
		_defense,
		_value,
		_weight,
		_hit,
		_gain_aspect,
		_aspect_names,
		_gain_trait,
		_trait_names,
		_gain_attack,
		_attack_names,
		_item_hit_element,
		_import_affinity,
		_import_affinity__file_import,
		_affinity_declaration,
		_affinityName,
		_affinity_element,
		_strength_name,
		_affinity_names,
		_weakness_name,
		_import_condition,
		_import_condition__file_import,
		_condition_declaration,
		_conditionName,
		_condition_element,
		_to_lose,
		_chance_pair,
		_accumulation,
		_import_trait,
		_import_trait__file_import,
		_trait_declaration,
		_traitName,
		_trait_element,
		_import_activity,
		_import_activity__file_import,
		_activity_declaration,
		_activityName,
		_className,
		_activity_element,
		_getTarget,
		_getDestination,
		_endState,
		_SUCCEED,
		_FAIL,
		_listen,
		_step,
		_activity_type_declaration,
		_activityTypeName,
		_activity_type_names,
		_import_quest,
		_import_quest__file_import,
		_quest_type_declaration,
		_questName,
		_quest_type_element,
		_event_statement,
		_event_names,
		_quest_destination,
		_quest_tile_description,
		_map_names,
		_select_tile_name,
		_import_attack,
		_import_attack__file_import,
		_attack_declaration,
		_attackName,
		_attack_element,
		_range,
		_cooldown,
		_damage,
		_dmg_type,
		_by_stat,
		_miss,
		_option,
		_import_support,
		_import_support__file_import,
		_support_declaration,
		_supportName,
		_support_element,
		_import_skill,
		_import_skill__file_import,
		_skill_declaration,
		_skillName,
		_skill_element,
		_require,
		_use,
		_load,
		_import_association,
		_import_association__file_import,
		_association_declaration,
		_associationName,
		_association_element,
		_association_start,
		_specificName,
		_onEvent,
		_association_join,
		_association_event,
		_import_reason,
		_import_reason__file_import,
		_reason_declaration,
		_reasonName,
		_reason_description,
		_reason_description_element,
		_description,
		_variableIndex,
		_stat_range,
		_operator,
		_PLUS,
		_MULTIPLY,
		_DIVIDE,
		_MINUS,
		_state_range_element,
		_hero_stat,
		_left,
		_left_DAYS,
		_right,
		_right_DAYS,
		_percent,
		_entity_definition_body,
		_entity_declaration,
		_entityName,
		_entity_image_specification,
		_imageName,
		_imageId,
		_entity_definition,
		_skill,
		_skill_names,
		_hints,
		_trails_declaration,
		_trail_declaration,
		_trailName,
		_connection_declaration,
		_tile_names,
		_startNodeName,
		_endNodeName,
		_structures_declaration,
		_structure_declaration,
		_buildingName,
		_structure_definition,
		_roomName,
		_defaultTileName,
		_defaultSize,
		_structure_payment,
		_amount,
		_paymentType,
		_payment_long_type_names,
		_payment_short_type_names,
		_import_map,
		_import_map__file_import,
		_area_shape_name,
		_map_header,
		_mapName,
		_area_declaration,
		_areaName,
		_patch_options,
		_patch_element,
		_sub_generator,
		_area_names,
		_patch_probability,
		_probability,
		_patch_goto,
		_destination,
		_room_names,
		_nodeName,
		_trail_names,
		_patch_position,
		_offside,
		_patch_dimension,
		_patchWidth,
		_patchHeight,
		_patch_range,
		_lowerBound,
		_upperBound,
		_patch_rimcals,
		_siding_names,
		_import_tile,
		_import_tile__file_import,
		_tile_declaration,
		_floor_declaration,
		_siding_declaration,
		_terrain_declaration,
		_dens_declaration,
		_chests_declaration,
		_tile_dimensions,
		_width,
		_height,
		_shape_type,
		_direction_name,
		_edge_if_operator,
		_edge_definition,
		_edgeTileName,
		_edge_if,
		_neighbourIf,
		_siding_definition,
		_sidingName,
		_tile_definition,
		_floorParentName,
		_tileName,
		_tile_definition_element,
		_IMPASSABLE,
		_PASSABLE,
		_tile_rate,
		_tile_element,
		_entity,
		_tile_cost,
		_FREE,
		_payment,
		_tile_payment_type,
		_item_names,
		_import_payment_type,
		_import_payment_type__file_import,
		_payment_type_declaration,
		_typeName,
		_shortForm,
		_longForm,
		_import_event,
		_import_event__file_import,
		_event_declaration,
		_eventName,
		_parameter,
		_QUOTE,
		_NOT,
		_std_body,
		_method_arguments,
		_method_parameters,
		_braced_statement,
		_tile_id_choice,
		_index,
		_namePart,
		_entity_id_choice,
		_number,
		_body_element,
		_body_defined_statement,
		_acquisition,
		_imposition,
		_influence,
		_quest_addition,
		_GAINS,
		_LOSES,
		_THIS,
		_condition_names,
		_source_name,
		_impose,
		_release,
		_reason_names,
		_activity_names,
		_activity_statement,
		_method,
		_association_statement,
		_association_names,
		_recruiter,
		_spawn_statement,
		_lowerBoundX,
		_upperBoundX,
		_lowerBoundY,
		_upperBoundY,
		_if_header,
		_ELSE,
		_IF,
		_if_statement,
		_else_statement,
		_inline_if_statement,
		_for_statement,
		_fromList,
		_fromVariable,
		_while_statement,
		_boolean_statement,
		_boolean_element,
		_has_chance,
		_conditional_chance,
		_isA_statement,
		_spawned_statement,
		_environmentName,
		_has_statement,
		_requirement,
		_requirement_element,
		_require_stat,
		_variableName,
		_require_exp,
		_require_attack,
		_require_trait,
		_require_association,
		_require_skill,
		_return_statement,
		_statement,
		_entity_selector,
		_map_selector,
		_variable_declaration,
		_variable_header,
		_variable_call,
		_exact,
		_variable_call_element,
		_cast,
		_access_static,
		_quote,
		_variable_group,
		_symbolName,
		_NEW,
		_methodName,
		_type_name,
		_mapDeclaration,
		_findType,
		_isListToken,
		_import_animation_type,
		_import_animation_type__file_import,
		_animation_type_continuation_operator,
		_animation_type_arithmetic_operator,
		_animation_type_boolean_operator,
		_animation_type_declaration,
		_animationTypeName,
		_animation_type_element,
		_animation_type_operator,
		_animation_type_condition,
		_animation_type_value,
		_animation_type_boolean,
		_leftName,
		_animation_type_variable_declaration,
		_animation_type_coordinate_variable,
		_lowX,
		_lowY,
		_highX,
		_highY,
		_animation_type_flip_variable,
		_unflippedValue,
		_flippedValue,
		_animation_variable_value,
		_animation_variable_value_basic,
		_animation_variable_value_range,
		_animation_type_variables,
		_animation_type_body,
		_animation_frame_data,
		_frameName,
		_import_image,
		_import_image__file_import,
		_image_type,
		_animation_substates,
		_image_declaration,
		_frameWidth,
		_frameHeight,
		_imageFile,
		_animation_state,
		_parentState,
		_animationId,
		_finalState,
		_flipAnimationId,
		_image_id,
		_image_names,
		_animation,
		_delta,
		_frames,
		_import_drawable,
		_import_drawable__file_import,
		_multiple_drawable_declaration,
		_multipleName,
		_drawable_declaration,
		_drawableName,
		_multiple_drawable_points,
		_point,
		_drawable_dimensions,
		_leftParameter,
		_rightParameter,
		_drawable_grid_element,
		_endLine,
		_space,
		_drawable_multiple_element,
		_defaultState,
		_newStateName,
		_position,
		_supplementary,
		_dimensions,
		_rotation,
		_angle,
		_drawable_arthmetic_operator,
		_plus,
		_minus,
		_divide,
		_multiply,
		_drawable_multiple_value,
		_x,
		_y,
		_import_colour,
		_import_colour__file_import,
		_colour_declaration,
		_colourName,
		_asInt,
		_red,
		_blue,
		_green,
		_asFloat,
		_import_layer,
		_import_layer__file_import,
		_layer_declaration,
		_layerName
	}
	public static class Parsed{
		protected List<Token.Parsed> children = new ArrayList<Token.Parsed>();
		protected List<Integer> positions = new ArrayList<Integer>();
		protected Token.Id name = null;
		public Parsed(final Token.Id name) {
			if(name != null){
				this.name = name;
			}
		}
		public Parsed() {
		}
		public List<Token.Parsed> getChildren() {
			return children;
		}
		public void setChildren(List<Token.Parsed> newChildren) {
			children = newChildren;
		}
		public List<Integer> getPositions() {
			return positions;
		}
		public void setPositions(List<Integer> newPositions) {
			positions = newPositions;
		}
		public Token.Id getName() {
			return name;
		}
		public void setName(Token.Id newName) {
			name = newName;
		}
		public String getValue() {
			if(children.isEmpty()) {
				return null;
			}
			else {
				return children.get(0).getValue();
			}
		}
		public void setValue(String newValue) {
		}
		public String getLastValue() {
			if(children.isEmpty()) {
				return null;
			}
			else {
				return children.get(children.size()-1).getValue();
			}
		}
		public void add(Integer position,Token.Parsed newToken) {
			children.add(newToken);
			positions.add(position);
		}
		public void addAll(Token.Parsed inductee) {
			for(Integer i = 0;i<inductee.children.size();i++) {
				children.add(inductee.children.get(i));
				positions.add(inductee.positions.get(i));
			}
		}
		public static class Import extends Token.Parsed{
			protected String fileName = null;
			public Import(final Token.Id initalSuperName, final String fileName) {
				super(initalSuperName);
				this.fileName = fileName;
			}
			public Import(final String fileName) {
				this.fileName = fileName;
			}
			public Import() {
			}
			public String getFileName() {
				return fileName;
			}
			public void setFileName(String newFileName) {
				fileName = newFileName;
			}
			public List<Token.Parsed> getChildren() {
				return Parser.contexts.get(fileName).get_root().getChildren();
			}
			public List<Integer> getPositions() {
				return Parser.contexts.get(fileName).get_root().getPositions();
			}
		}
	}
	public static class Leaf implements Token{
		protected Token.Id name = null;
		protected String value = null;
		protected Integer position = null;
		protected Integer parentPosition = null;
		protected Parser.Result.Pass context = null;
		public Leaf(final Token.Id name, final String value, final Integer position, final Integer parentPosition, final Parser.Result.Pass context) {
			if(name != null){
				this.name = name;
			}
			this.value = value;
			this.position = position;
			this.parentPosition = parentPosition;
			if(context != null){
				this.context = context;
			}
		}
		public Leaf() {
		}
		public Token.Id getName() {
			return name;
		}
		public void setName(Token.Id newName) {
			name = newName;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String newValue) {
			value = newValue;
		}
		public Integer getPosition() {
			return position;
		}
		public void setPosition(Integer newPosition) {
			position = newPosition;
		}
		public Integer getParentPosition() {
			return parentPosition;
		}
		public void setParentPosition(Integer newParentPosition) {
			parentPosition = newParentPosition;
		}
		public Parser.Result.Pass getContext() {
			return context;
		}
		public void setContext(Parser.Result.Pass newContext) {
			context = newContext;
		}
		public Token get(Token.Id tokenName) {
			return this;
		}
		public Token getLast() {
			return null;
		}
		public Token getLast(Token.Id tokenName) {
			return null;
		}
		public void add(Token token) {
		}
		public List<Token> getAllSafely(Token.Id id) {
			return new ArrayList<Token>();
		}
		public Supplier<Token> apply(Token.Id id){
			return null;
		}
		public List<Token> getAll() {
			return null;
		}
		public String toString() {
			return getValue();
		}
		public String err() {
			return shortString();
		}
		public String err(int tab) {
			StringBuilder builder = new StringBuilder();
			for(Integer i = 0;i<tab;i++) {
				builder.append("  ");
			}
			builder.append(shortString());
			return builder.toString();
		}
		public void print() {
			printShort();
		}
		public void print(int tab) {
			for(Integer i = 0;i<tab;i++) {
				System.out.print("  ");
			}
			printShort();
		}
		public void printShort() {
			System.out.println(shortString());
		}
		public String shortString() {
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			builder.append(name);
			builder.append(":");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}
		public String getFileName() {
			return context.getFileName();
		}
		public int getLineNumber() {
			return context.getLineNumber(position);
		}
	}
	public static class Branch implements Token{
		protected Map<Token.Id,List<Token>> namedLists = new EnumMap<Token.Id,List<Token>>(Token.Id.class);
		protected List<Token> children = new ArrayList<Token>();
		protected Token.Id name = null;
		protected Integer position = null;
		protected Integer parentPosition = null;
		protected Parser.Result.Pass context = null;
		public Branch(final Token.Id name, final Integer position, final Integer parentPosition, final Parser.Result.Pass context) {
			if(name != null){
				this.name = name;
			}
			this.position = position;
			this.parentPosition = parentPosition;
			if(context != null){
				this.context = context;
			}
		}
		public Branch() {
		}
		public Supplier<Token> apply(Token.Id id){
			return new Supplier<Token>(){
				private Iterator<Token> itr = getAllSafely(id).iterator();
				public Token get(){
					return itr.next();
				}
			};
		}
		public Map<Token.Id,List<Token>> getNamedLists() {
			return namedLists;
		}
		public void setNamedLists(Map<Token.Id,List<Token>> newNamedLists) {
			namedLists = newNamedLists;
		}
		public List<Token> getChildren() {
			return children;
		}
		public void setChildren(List<Token> newChildren) {
			children = newChildren;
		}
		public Token.Id getName() {
			return name;
		}
		public void setName(Token.Id newName) {
			name = newName;
		}
		public Integer getPosition() {
			return position;
		}
		public void setPosition(Integer newPosition) {
			position = newPosition;
		}
		public Integer getParentPosition() {
			return parentPosition;
		}
		public void setParentPosition(Integer newParentPosition) {
			parentPosition = newParentPosition;
		}
		public Parser.Result.Pass getContext() {
			return context;
		}
		public void setContext(Parser.Result.Pass newContext) {
			context = newContext;
		}
		public Token get(Token.Id tokenName) {
			List<Token> nameList = namedLists.get(tokenName);
			if(nameList==null||nameList.isEmpty()) {
				return null;
			}
			else {
				return nameList.get(0);
			}
		}
		public String getValue() {
			return children.get(0).getValue();
		}
		public String toString() {
			return children.get(0).getValue();
		}
		public Token getLast() {
			return children.get(children.size()-1);
		}
		public Token getLast(Token.Id tokenName) {
			return namedLists.get(tokenName).get(namedLists.get(tokenName).size()-1);
		}
		public void add(Token token) {
			children.add(token);
			if(namedLists.containsKey(token.getName())==false) {
				namedLists.put(token.getName(),new ArrayList<Token>());
			}
			namedLists.get(token.getName()).add(token);
		}
		public List<Token> getAllSafely(Token.Id id) {
			List<Token> list = namedLists.get(id);
			if(list==null) {
				return new ArrayList<Token>();
			}
			else {
				return list;
			}
		}
		public List<Token> getAll() {
			return children;
		}
		public String err() {
			StringBuilder builder = new StringBuilder();
			builder.append(":>");
			builder.append(name);
			for(Token node:children) {
				builder.append(node.err(1));
			}
			return builder.toString();
		}
		public String err(int tab) {
			StringBuilder builder = new StringBuilder();
			for(Integer i = 0;i<tab;i++) {
				builder.append("  ");
			}
			builder.append(name);
			for(Token node:children) {
				builder.append(node.err(tab+1));
			}
			return builder.toString();
		}
		public void print() {
			System.out.println(":>"+name);
			for(Token node:children) {
				node.print(1);
			}
		}
		public void print(int tab) {
			for(Integer i = 0;i<tab;i++) {
				System.out.print("  ");
			}
			System.out.println(name);
			for(Token node:children) {
				node.print(tab+1);
			}
		}
		public void printShort() {
			for(Token node:children) {
				System.out.print("[");
				System.out.print(node.getName());
				System.out.print(":");
				System.out.print(node.getValue());
				System.out.print("]");
			}
			System.out.println();
		}
		public String getFileName() {
			return context.getFileName();
		}
		public int getLineNumber() {
			return context.getLineNumber(position);
		}
	}
}