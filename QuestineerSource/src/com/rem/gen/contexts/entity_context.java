package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.structure_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class entity_context extends structure_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public entity_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public entity_context() {
	}
	public Parser get_Parser() {
		return __parser__;
	}
	public void set_Parser(Parser new_Parser) {
		__parser__ = new_Parser;
	}
	public Tokens get_Tokens() {
		return __tokens__;
	}
	public void set_Tokens(Tokens new_Tokens) {
		__tokens__ = new_Tokens;
	}
	public void parse_entity_image_specification() {
		int _position_entity_image_specification = -1;
		Token.Parsed _token_entity_image_specification = null;
		support_names.start(_position);
		association_names.start(_position);
		room_names.start(_position);
		activity_names.start(_position);
		siding_names.start(_position);
		item_names.start(_position);
		aspect_names.start(_position);
		affinity_names.start(_position);
		activity_type_names.start(_position);
		trail_names.start(_position);
		attack_names.start(_position);
		reason_names.start(_position);
		trait_names.start(_position);
		condition_names.start(_position);
		payment_short_type_names.start(_position);
		skill_names.start(_position);
		map_names.start(_position);
		event_names.start(_position);
		image_names.start(_position);
		tile_symbols.start(_position);
		payment_long_type_names.start(_position);
		area_names.start(_position);
		structure_names.start(_position);
		tile_names.start(_position);
		hero_stat.start(_position);
		_position_entity_image_specification=_position;
		_token_entity_image_specification=_token;
		_token=new Tokens.Rule.EntityImageSpecificationToken();
		parse__anonymous_65();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_image_specification(entity_image_specification)");
				_furthestPosition=_position;
			}
			_position=_position_entity_image_specification;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_entity_image_specification.addAll(_token);
			_token_entity_image_specification.setValue(_token.getValue());
		}
		_token=_token_entity_image_specification;
		if(_state==FAILED) {
			support_names.reject(_position_entity_image_specification);
			association_names.reject(_position_entity_image_specification);
			room_names.reject(_position_entity_image_specification);
			activity_names.reject(_position_entity_image_specification);
			siding_names.reject(_position_entity_image_specification);
			item_names.reject(_position_entity_image_specification);
			aspect_names.reject(_position_entity_image_specification);
			affinity_names.reject(_position_entity_image_specification);
			activity_type_names.reject(_position_entity_image_specification);
			trail_names.reject(_position_entity_image_specification);
			attack_names.reject(_position_entity_image_specification);
			reason_names.reject(_position_entity_image_specification);
			trait_names.reject(_position_entity_image_specification);
			condition_names.reject(_position_entity_image_specification);
			payment_short_type_names.reject(_position_entity_image_specification);
			skill_names.reject(_position_entity_image_specification);
			map_names.reject(_position_entity_image_specification);
			event_names.reject(_position_entity_image_specification);
			image_names.reject(_position_entity_image_specification);
			tile_symbols.reject(_position_entity_image_specification);
			payment_long_type_names.reject(_position_entity_image_specification);
			area_names.reject(_position_entity_image_specification);
			structure_names.reject(_position_entity_image_specification);
			tile_names.reject(_position_entity_image_specification);
			hero_stat.reject(_position_entity_image_specification);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_entity_image_specification);
			association_names.accept(_position_entity_image_specification);
			room_names.accept(_position_entity_image_specification);
			activity_names.accept(_position_entity_image_specification);
			siding_names.accept(_position_entity_image_specification);
			item_names.accept(_position_entity_image_specification);
			aspect_names.accept(_position_entity_image_specification);
			affinity_names.accept(_position_entity_image_specification);
			activity_type_names.accept(_position_entity_image_specification);
			trail_names.accept(_position_entity_image_specification);
			attack_names.accept(_position_entity_image_specification);
			reason_names.accept(_position_entity_image_specification);
			trait_names.accept(_position_entity_image_specification);
			condition_names.accept(_position_entity_image_specification);
			payment_short_type_names.accept(_position_entity_image_specification);
			skill_names.accept(_position_entity_image_specification);
			map_names.accept(_position_entity_image_specification);
			event_names.accept(_position_entity_image_specification);
			image_names.accept(_position_entity_image_specification);
			tile_symbols.accept(_position_entity_image_specification);
			payment_long_type_names.accept(_position_entity_image_specification);
			area_names.accept(_position_entity_image_specification);
			structure_names.accept(_position_entity_image_specification);
			tile_names.accept(_position_entity_image_specification);
			hero_stat.accept(_position_entity_image_specification);
		}
	}
	public void parse_entity_id_choice() {
		int _position_entity_id_choice = -1;
		Token.Parsed _token_entity_id_choice = null;
		int _length_entity_id_choice_brace = _inputLength;
		if(brace_3.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_3.get(_position);
			int _position_entity_id_choice_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			support_names.start(_position);
			association_names.start(_position);
			room_names.start(_position);
			activity_names.start(_position);
			siding_names.start(_position);
			item_names.start(_position);
			aspect_names.start(_position);
			affinity_names.start(_position);
			activity_type_names.start(_position);
			trail_names.start(_position);
			attack_names.start(_position);
			reason_names.start(_position);
			trait_names.start(_position);
			condition_names.start(_position);
			payment_short_type_names.start(_position);
			skill_names.start(_position);
			map_names.start(_position);
			event_names.start(_position);
			image_names.start(_position);
			tile_symbols.start(_position);
			payment_long_type_names.start(_position);
			area_names.start(_position);
			structure_names.start(_position);
			tile_names.start(_position);
			hero_stat.start(_position);
			_position_entity_id_choice=_position;
			_token_entity_id_choice=_token;
			_token=new Tokens.Rule.EntityIdChoiceToken();
			parse__anonymous_131();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_id_choice(entity_id_choice)");
					_furthestPosition=_position;
				}
				_position=_position_entity_id_choice;
			}
			else {
				int _state_167 = _state;
				while(_position<_inputLength) {
					parse__anonymous_132();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_167==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_id_choice(entity_id_choice)");
						_furthestPosition=_position;
					}
					_position=_position_entity_id_choice;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_entity_id_choice.add(_position_entity_id_choice,_token);
			}
			_token=_token_entity_id_choice;
			if(_state==SUCCESS&&brace_3.get(_position_entity_id_choice_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("entity_id_choice",_position,_lineNumberRanges));
				_position=brace_3.get(_position_entity_id_choice_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_entity_id_choice_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_entity_id_choice);
				association_names.reject(_position_entity_id_choice);
				room_names.reject(_position_entity_id_choice);
				activity_names.reject(_position_entity_id_choice);
				siding_names.reject(_position_entity_id_choice);
				item_names.reject(_position_entity_id_choice);
				aspect_names.reject(_position_entity_id_choice);
				affinity_names.reject(_position_entity_id_choice);
				activity_type_names.reject(_position_entity_id_choice);
				trail_names.reject(_position_entity_id_choice);
				attack_names.reject(_position_entity_id_choice);
				reason_names.reject(_position_entity_id_choice);
				trait_names.reject(_position_entity_id_choice);
				condition_names.reject(_position_entity_id_choice);
				payment_short_type_names.reject(_position_entity_id_choice);
				skill_names.reject(_position_entity_id_choice);
				map_names.reject(_position_entity_id_choice);
				event_names.reject(_position_entity_id_choice);
				image_names.reject(_position_entity_id_choice);
				tile_symbols.reject(_position_entity_id_choice);
				payment_long_type_names.reject(_position_entity_id_choice);
				area_names.reject(_position_entity_id_choice);
				structure_names.reject(_position_entity_id_choice);
				tile_names.reject(_position_entity_id_choice);
				hero_stat.reject(_position_entity_id_choice);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_entity_id_choice);
				association_names.accept(_position_entity_id_choice);
				room_names.accept(_position_entity_id_choice);
				activity_names.accept(_position_entity_id_choice);
				siding_names.accept(_position_entity_id_choice);
				item_names.accept(_position_entity_id_choice);
				aspect_names.accept(_position_entity_id_choice);
				affinity_names.accept(_position_entity_id_choice);
				activity_type_names.accept(_position_entity_id_choice);
				trail_names.accept(_position_entity_id_choice);
				attack_names.accept(_position_entity_id_choice);
				reason_names.accept(_position_entity_id_choice);
				trait_names.accept(_position_entity_id_choice);
				condition_names.accept(_position_entity_id_choice);
				payment_short_type_names.accept(_position_entity_id_choice);
				skill_names.accept(_position_entity_id_choice);
				map_names.accept(_position_entity_id_choice);
				event_names.accept(_position_entity_id_choice);
				image_names.accept(_position_entity_id_choice);
				tile_symbols.accept(_position_entity_id_choice);
				payment_long_type_names.accept(_position_entity_id_choice);
				area_names.accept(_position_entity_id_choice);
				structure_names.accept(_position_entity_id_choice);
				tile_names.accept(_position_entity_id_choice);
				hero_stat.accept(_position_entity_id_choice);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_id_choice(entity_id_choice)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_entity_declaration() {
		int _position_entity_declaration = -1;
		Token.Parsed _token_entity_declaration = null;
		int _position_NAME = -1;
		Token.Parsed _token_NAME = null;
		support_names.start(_position);
		association_names.start(_position);
		room_names.start(_position);
		activity_names.start(_position);
		siding_names.start(_position);
		item_names.start(_position);
		aspect_names.start(_position);
		affinity_names.start(_position);
		activity_type_names.start(_position);
		trail_names.start(_position);
		attack_names.start(_position);
		reason_names.start(_position);
		trait_names.start(_position);
		condition_names.start(_position);
		payment_short_type_names.start(_position);
		skill_names.start(_position);
		map_names.start(_position);
		event_names.start(_position);
		image_names.start(_position);
		tile_symbols.start(_position);
		payment_long_type_names.start(_position);
		area_names.start(_position);
		structure_names.start(_position);
		tile_names.start(_position);
		hero_stat.start(_position);
		_position_entity_declaration=_position;
		_token_entity_declaration=_token;
		_token=new Tokens.Rule.EntityDeclarationToken();
		_token_NAME=_token;
		_token=new Tokens.Name.EntityNameToken();
		_position_NAME=_position;
		parse_NAME();
		if(_state==SUCCESS) {
			_token_NAME.add(_position_NAME,_token);
		}
		_token=_token_NAME;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_declaration(entity_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_entity_declaration;
		}
		else {
			int _state_84 = _state;
			parse_entity_image_specification();
			if(_state_84==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_declaration(entity_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_entity_declaration;
			}
			else {
				parse_entity_definition_body();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_declaration(entity_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_entity_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_entity_declaration.add(_position_entity_declaration,_token);
		}
		_token=_token_entity_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_entity_declaration);
			association_names.reject(_position_entity_declaration);
			room_names.reject(_position_entity_declaration);
			activity_names.reject(_position_entity_declaration);
			siding_names.reject(_position_entity_declaration);
			item_names.reject(_position_entity_declaration);
			aspect_names.reject(_position_entity_declaration);
			affinity_names.reject(_position_entity_declaration);
			activity_type_names.reject(_position_entity_declaration);
			trail_names.reject(_position_entity_declaration);
			attack_names.reject(_position_entity_declaration);
			reason_names.reject(_position_entity_declaration);
			trait_names.reject(_position_entity_declaration);
			condition_names.reject(_position_entity_declaration);
			payment_short_type_names.reject(_position_entity_declaration);
			skill_names.reject(_position_entity_declaration);
			map_names.reject(_position_entity_declaration);
			event_names.reject(_position_entity_declaration);
			image_names.reject(_position_entity_declaration);
			tile_symbols.reject(_position_entity_declaration);
			payment_long_type_names.reject(_position_entity_declaration);
			area_names.reject(_position_entity_declaration);
			structure_names.reject(_position_entity_declaration);
			tile_names.reject(_position_entity_declaration);
			hero_stat.reject(_position_entity_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_entity_declaration);
			association_names.accept(_position_entity_declaration);
			room_names.accept(_position_entity_declaration);
			activity_names.accept(_position_entity_declaration);
			siding_names.accept(_position_entity_declaration);
			item_names.accept(_position_entity_declaration);
			aspect_names.accept(_position_entity_declaration);
			affinity_names.accept(_position_entity_declaration);
			activity_type_names.accept(_position_entity_declaration);
			trail_names.accept(_position_entity_declaration);
			attack_names.accept(_position_entity_declaration);
			reason_names.accept(_position_entity_declaration);
			trait_names.accept(_position_entity_declaration);
			condition_names.accept(_position_entity_declaration);
			payment_short_type_names.accept(_position_entity_declaration);
			skill_names.accept(_position_entity_declaration);
			map_names.accept(_position_entity_declaration);
			event_names.accept(_position_entity_declaration);
			image_names.accept(_position_entity_declaration);
			tile_symbols.accept(_position_entity_declaration);
			payment_long_type_names.accept(_position_entity_declaration);
			area_names.accept(_position_entity_declaration);
			structure_names.accept(_position_entity_declaration);
			tile_names.accept(_position_entity_declaration);
			hero_stat.accept(_position_entity_declaration);
		}
	}
	public void parse_entity_definition_body() {
		int _position_entity_definition_body = -1;
		Token.Parsed _token_entity_definition_body = null;
		int _length_entity_definition_body_brace = _inputLength;
		if(brace_4.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_4.get(_position);
			int _position_entity_definition_body_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			support_names.start(_position);
			association_names.start(_position);
			room_names.start(_position);
			activity_names.start(_position);
			siding_names.start(_position);
			item_names.start(_position);
			aspect_names.start(_position);
			affinity_names.start(_position);
			activity_type_names.start(_position);
			trail_names.start(_position);
			attack_names.start(_position);
			reason_names.start(_position);
			trait_names.start(_position);
			condition_names.start(_position);
			payment_short_type_names.start(_position);
			skill_names.start(_position);
			map_names.start(_position);
			event_names.start(_position);
			image_names.start(_position);
			tile_symbols.start(_position);
			payment_long_type_names.start(_position);
			area_names.start(_position);
			structure_names.start(_position);
			tile_names.start(_position);
			hero_stat.start(_position);
			_position_entity_definition_body=_position;
			_token_entity_definition_body=_token;
			_token=new Tokens.Rule.EntityDefinitionBodyToken();
			int _state_83 = _state;
			while(_position<_inputLength) {
				parse_entity_definition();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_83==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition_body(entity_definition_body)");
					_furthestPosition=_position;
				}
				_position=_position_entity_definition_body;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_entity_definition_body.addAll(_token);
				_token_entity_definition_body.setValue(_token.getValue());
			}
			_token=_token_entity_definition_body;
			if(_state==SUCCESS&&brace_4.get(_position_entity_definition_body_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("entity_definition_body",_position,_lineNumberRanges));
				_position=brace_4.get(_position_entity_definition_body_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_entity_definition_body_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_entity_definition_body);
				association_names.reject(_position_entity_definition_body);
				room_names.reject(_position_entity_definition_body);
				activity_names.reject(_position_entity_definition_body);
				siding_names.reject(_position_entity_definition_body);
				item_names.reject(_position_entity_definition_body);
				aspect_names.reject(_position_entity_definition_body);
				affinity_names.reject(_position_entity_definition_body);
				activity_type_names.reject(_position_entity_definition_body);
				trail_names.reject(_position_entity_definition_body);
				attack_names.reject(_position_entity_definition_body);
				reason_names.reject(_position_entity_definition_body);
				trait_names.reject(_position_entity_definition_body);
				condition_names.reject(_position_entity_definition_body);
				payment_short_type_names.reject(_position_entity_definition_body);
				skill_names.reject(_position_entity_definition_body);
				map_names.reject(_position_entity_definition_body);
				event_names.reject(_position_entity_definition_body);
				image_names.reject(_position_entity_definition_body);
				tile_symbols.reject(_position_entity_definition_body);
				payment_long_type_names.reject(_position_entity_definition_body);
				area_names.reject(_position_entity_definition_body);
				structure_names.reject(_position_entity_definition_body);
				tile_names.reject(_position_entity_definition_body);
				hero_stat.reject(_position_entity_definition_body);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_entity_definition_body);
				association_names.accept(_position_entity_definition_body);
				room_names.accept(_position_entity_definition_body);
				activity_names.accept(_position_entity_definition_body);
				siding_names.accept(_position_entity_definition_body);
				item_names.accept(_position_entity_definition_body);
				aspect_names.accept(_position_entity_definition_body);
				affinity_names.accept(_position_entity_definition_body);
				activity_type_names.accept(_position_entity_definition_body);
				trail_names.accept(_position_entity_definition_body);
				attack_names.accept(_position_entity_definition_body);
				reason_names.accept(_position_entity_definition_body);
				trait_names.accept(_position_entity_definition_body);
				condition_names.accept(_position_entity_definition_body);
				payment_short_type_names.accept(_position_entity_definition_body);
				skill_names.accept(_position_entity_definition_body);
				map_names.accept(_position_entity_definition_body);
				event_names.accept(_position_entity_definition_body);
				image_names.accept(_position_entity_definition_body);
				tile_symbols.accept(_position_entity_definition_body);
				payment_long_type_names.accept(_position_entity_definition_body);
				area_names.accept(_position_entity_definition_body);
				structure_names.accept(_position_entity_definition_body);
				tile_names.accept(_position_entity_definition_body);
				hero_stat.accept(_position_entity_definition_body);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition_body(entity_definition_body)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_entity_definition() {
		int _position_entity_definition = -1;
		Token.Parsed _token_entity_definition = null;
		support_names.start(_position);
		association_names.start(_position);
		room_names.start(_position);
		activity_names.start(_position);
		siding_names.start(_position);
		item_names.start(_position);
		aspect_names.start(_position);
		affinity_names.start(_position);
		activity_type_names.start(_position);
		trail_names.start(_position);
		attack_names.start(_position);
		reason_names.start(_position);
		trait_names.start(_position);
		condition_names.start(_position);
		payment_short_type_names.start(_position);
		skill_names.start(_position);
		map_names.start(_position);
		event_names.start(_position);
		image_names.start(_position);
		tile_symbols.start(_position);
		payment_long_type_names.start(_position);
		area_names.start(_position);
		structure_names.start(_position);
		tile_names.start(_position);
		hero_stat.start(_position);
		_position_entity_definition=_position;
		_token_entity_definition=_token;
		_token=new Tokens.Rule.EntityDefinitionToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='\n'&&_inputArray[_position+0]!='\r') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_1.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain \n");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
				_furthestPosition=_position;
			}
			_position=_position_entity_definition;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_entity_definition.add(_position_entity_definition,_token);
		}
		_token=_token_entity_definition;
		if(_state==FAILED) {
			support_names.reject(_position_entity_definition);
			association_names.reject(_position_entity_definition);
			room_names.reject(_position_entity_definition);
			activity_names.reject(_position_entity_definition);
			siding_names.reject(_position_entity_definition);
			item_names.reject(_position_entity_definition);
			aspect_names.reject(_position_entity_definition);
			affinity_names.reject(_position_entity_definition);
			activity_type_names.reject(_position_entity_definition);
			trail_names.reject(_position_entity_definition);
			attack_names.reject(_position_entity_definition);
			reason_names.reject(_position_entity_definition);
			trait_names.reject(_position_entity_definition);
			condition_names.reject(_position_entity_definition);
			payment_short_type_names.reject(_position_entity_definition);
			skill_names.reject(_position_entity_definition);
			map_names.reject(_position_entity_definition);
			event_names.reject(_position_entity_definition);
			image_names.reject(_position_entity_definition);
			tile_symbols.reject(_position_entity_definition);
			payment_long_type_names.reject(_position_entity_definition);
			area_names.reject(_position_entity_definition);
			structure_names.reject(_position_entity_definition);
			tile_names.reject(_position_entity_definition);
			hero_stat.reject(_position_entity_definition);
			_state=SUCCESS;
			_position_entity_definition=_position;
			_token_entity_definition=_token;
			_token=new Tokens.Rule.EntityDefinitionToken();
			parse_comments();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
					_furthestPosition=_position;
				}
				_position=_position_entity_definition;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_entity_definition.add(_position_entity_definition,_token);
			}
			_token=_token_entity_definition;
			if(_state==FAILED) {
				support_names.reject(_position_entity_definition);
				association_names.reject(_position_entity_definition);
				room_names.reject(_position_entity_definition);
				activity_names.reject(_position_entity_definition);
				siding_names.reject(_position_entity_definition);
				item_names.reject(_position_entity_definition);
				aspect_names.reject(_position_entity_definition);
				affinity_names.reject(_position_entity_definition);
				activity_type_names.reject(_position_entity_definition);
				trail_names.reject(_position_entity_definition);
				attack_names.reject(_position_entity_definition);
				reason_names.reject(_position_entity_definition);
				trait_names.reject(_position_entity_definition);
				condition_names.reject(_position_entity_definition);
				payment_short_type_names.reject(_position_entity_definition);
				skill_names.reject(_position_entity_definition);
				map_names.reject(_position_entity_definition);
				event_names.reject(_position_entity_definition);
				image_names.reject(_position_entity_definition);
				tile_symbols.reject(_position_entity_definition);
				payment_long_type_names.reject(_position_entity_definition);
				area_names.reject(_position_entity_definition);
				structure_names.reject(_position_entity_definition);
				tile_names.reject(_position_entity_definition);
				hero_stat.reject(_position_entity_definition);
				_state=SUCCESS;
				_position_entity_definition=_position;
				_token_entity_definition=_token;
				_token=new Tokens.Rule.EntityDefinitionToken();
				parse__anonymous_67();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
						_furthestPosition=_position;
					}
					_position=_position_entity_definition;
				}
				else {
					int _state_87 = _state;
					while(_position<_inputLength) {
						parse__anonymous_69();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_87==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
							_furthestPosition=_position;
						}
						_position=_position_entity_definition;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_entity_definition.add(_position_entity_definition,_token);
				}
				_token=_token_entity_definition;
				if(_state==FAILED) {
					support_names.reject(_position_entity_definition);
					association_names.reject(_position_entity_definition);
					room_names.reject(_position_entity_definition);
					activity_names.reject(_position_entity_definition);
					siding_names.reject(_position_entity_definition);
					item_names.reject(_position_entity_definition);
					aspect_names.reject(_position_entity_definition);
					affinity_names.reject(_position_entity_definition);
					activity_type_names.reject(_position_entity_definition);
					trail_names.reject(_position_entity_definition);
					attack_names.reject(_position_entity_definition);
					reason_names.reject(_position_entity_definition);
					trait_names.reject(_position_entity_definition);
					condition_names.reject(_position_entity_definition);
					payment_short_type_names.reject(_position_entity_definition);
					skill_names.reject(_position_entity_definition);
					map_names.reject(_position_entity_definition);
					event_names.reject(_position_entity_definition);
					image_names.reject(_position_entity_definition);
					tile_symbols.reject(_position_entity_definition);
					payment_long_type_names.reject(_position_entity_definition);
					area_names.reject(_position_entity_definition);
					structure_names.reject(_position_entity_definition);
					tile_names.reject(_position_entity_definition);
					hero_stat.reject(_position_entity_definition);
					_state=SUCCESS;
					_position_entity_definition=_position;
					_token_entity_definition=_token;
					_token=new Tokens.Rule.EntityDefinitionToken();
					parse_event_statement();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
							_furthestPosition=_position;
						}
						_position=_position_entity_definition;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_entity_definition.add(_position_entity_definition,_token);
					}
					_token=_token_entity_definition;
					if(_state==FAILED) {
						support_names.reject(_position_entity_definition);
						association_names.reject(_position_entity_definition);
						room_names.reject(_position_entity_definition);
						activity_names.reject(_position_entity_definition);
						siding_names.reject(_position_entity_definition);
						item_names.reject(_position_entity_definition);
						aspect_names.reject(_position_entity_definition);
						affinity_names.reject(_position_entity_definition);
						activity_type_names.reject(_position_entity_definition);
						trail_names.reject(_position_entity_definition);
						attack_names.reject(_position_entity_definition);
						reason_names.reject(_position_entity_definition);
						trait_names.reject(_position_entity_definition);
						condition_names.reject(_position_entity_definition);
						payment_short_type_names.reject(_position_entity_definition);
						skill_names.reject(_position_entity_definition);
						map_names.reject(_position_entity_definition);
						event_names.reject(_position_entity_definition);
						image_names.reject(_position_entity_definition);
						tile_symbols.reject(_position_entity_definition);
						payment_long_type_names.reject(_position_entity_definition);
						area_names.reject(_position_entity_definition);
						structure_names.reject(_position_entity_definition);
						tile_names.reject(_position_entity_definition);
						hero_stat.reject(_position_entity_definition);
						_state=SUCCESS;
						_position_entity_definition=_position;
						_token_entity_definition=_token;
						_token=new Tokens.Rule.EntityDefinitionToken();
						parse__anonymous_71();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
								_furthestPosition=_position;
							}
							_position=_position_entity_definition;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_entity_definition.add(_position_entity_definition,_token);
						}
						_token=_token_entity_definition;
						if(_state==FAILED) {
							support_names.reject(_position_entity_definition);
							association_names.reject(_position_entity_definition);
							room_names.reject(_position_entity_definition);
							activity_names.reject(_position_entity_definition);
							siding_names.reject(_position_entity_definition);
							item_names.reject(_position_entity_definition);
							aspect_names.reject(_position_entity_definition);
							affinity_names.reject(_position_entity_definition);
							activity_type_names.reject(_position_entity_definition);
							trail_names.reject(_position_entity_definition);
							attack_names.reject(_position_entity_definition);
							reason_names.reject(_position_entity_definition);
							trait_names.reject(_position_entity_definition);
							condition_names.reject(_position_entity_definition);
							payment_short_type_names.reject(_position_entity_definition);
							skill_names.reject(_position_entity_definition);
							map_names.reject(_position_entity_definition);
							event_names.reject(_position_entity_definition);
							image_names.reject(_position_entity_definition);
							tile_symbols.reject(_position_entity_definition);
							payment_long_type_names.reject(_position_entity_definition);
							area_names.reject(_position_entity_definition);
							structure_names.reject(_position_entity_definition);
							tile_names.reject(_position_entity_definition);
							hero_stat.reject(_position_entity_definition);
							_state=SUCCESS;
							_position_entity_definition=_position;
							_token_entity_definition=_token;
							_token=new Tokens.Rule.EntityDefinitionToken();
							if(_pass==FIRST_PASS) {
								String _result = _preparsed_NAME.get(_position);
								if(_result==null) {
									_state=FAILED;
								}
								else {
									Token.Parsed _first_pass_token = new Tokens.Name.NAMEToken(_result);
									_token.add(_position,_first_pass_token);
									_position+=_result.length();
									while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
										++_position;
									}
								}
							}
							else if(_pass==SECOND_PASS) {
								_list_name_result=_preparsed_NAME.get(_position);
								if(_list_name_result!=null&&affinity_names.contains(_list_name_result)) {
									if(_position+_list_name_result.length()<_inputLength) {
										int _next_char = _inputArray[_position+_list_name_result.length()];
										if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
											_state=FAILED;
										}
									}
									if(_state==SUCCESS) {
										_token.add(_position,new Tokens.Name.AffinityNamesToken(_list_name_result));
										_position+=_list_name_result.length();
										while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
											++_position;
										}
									}
								}
								else {
									_state=FAILED;
								}
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"affinity_names");
										_furthestPosition=_position;
									}
								}
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"entity_definition(entity_definition)");
									_furthestPosition=_position;
								}
								_position=_position_entity_definition;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_entity_definition.add(_position_entity_definition,_token);
							}
							_token=_token_entity_definition;
							if(_state==FAILED) {
								support_names.reject(_position_entity_definition);
								association_names.reject(_position_entity_definition);
								room_names.reject(_position_entity_definition);
								activity_names.reject(_position_entity_definition);
								siding_names.reject(_position_entity_definition);
								item_names.reject(_position_entity_definition);
								aspect_names.reject(_position_entity_definition);
								affinity_names.reject(_position_entity_definition);
								activity_type_names.reject(_position_entity_definition);
								trail_names.reject(_position_entity_definition);
								attack_names.reject(_position_entity_definition);
								reason_names.reject(_position_entity_definition);
								trait_names.reject(_position_entity_definition);
								condition_names.reject(_position_entity_definition);
								payment_short_type_names.reject(_position_entity_definition);
								skill_names.reject(_position_entity_definition);
								map_names.reject(_position_entity_definition);
								event_names.reject(_position_entity_definition);
								image_names.reject(_position_entity_definition);
								tile_symbols.reject(_position_entity_definition);
								payment_long_type_names.reject(_position_entity_definition);
								area_names.reject(_position_entity_definition);
								structure_names.reject(_position_entity_definition);
								tile_names.reject(_position_entity_definition);
								hero_stat.reject(_position_entity_definition);
							}
							else if(_state==SUCCESS) {
								support_names.accept(_position_entity_definition);
								association_names.accept(_position_entity_definition);
								room_names.accept(_position_entity_definition);
								activity_names.accept(_position_entity_definition);
								siding_names.accept(_position_entity_definition);
								item_names.accept(_position_entity_definition);
								aspect_names.accept(_position_entity_definition);
								affinity_names.accept(_position_entity_definition);
								activity_type_names.accept(_position_entity_definition);
								trail_names.accept(_position_entity_definition);
								attack_names.accept(_position_entity_definition);
								reason_names.accept(_position_entity_definition);
								trait_names.accept(_position_entity_definition);
								condition_names.accept(_position_entity_definition);
								payment_short_type_names.accept(_position_entity_definition);
								skill_names.accept(_position_entity_definition);
								map_names.accept(_position_entity_definition);
								event_names.accept(_position_entity_definition);
								image_names.accept(_position_entity_definition);
								tile_symbols.accept(_position_entity_definition);
								payment_long_type_names.accept(_position_entity_definition);
								area_names.accept(_position_entity_definition);
								structure_names.accept(_position_entity_definition);
								tile_names.accept(_position_entity_definition);
								hero_stat.accept(_position_entity_definition);
							}
						}
					}
				}
			}
		}
	}
}