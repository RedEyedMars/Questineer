package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.skill_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class image_context extends skill_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public image_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public image_context() {
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
	public void parse_image_declaration() {
		int _position_image_declaration = -1;
		Token.Parsed _token_image_declaration = null;
		int _position_FILE_NAME = -1;
		int _position_NAME = -1;
		Token.Parsed _token_FILE_NAME = null;
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
		_position_image_declaration=_position;
		_token_image_declaration=_token;
		_token=new Tokens.Rule.ImageDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_49.contains(_position)) {
			_recursion_protection_NAME_49.add(_position);
			parse_NAME();
			_recursion_protection_NAME_49.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				image_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.ImageNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_declaration(image_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_image_declaration;
		}
		else {
			parse__anonymous_212();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_declaration(image_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_image_declaration;
			}
			else {
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='=') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_103.SYNTAX);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain =");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_declaration(image_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_image_declaration;
				}
				else {
					_token_FILE_NAME=_token;
					_token=new Tokens.Name.ImageFileToken();
					_position_FILE_NAME=_position;
					parse_FILE_NAME();
					if(_state==SUCCESS) {
						_token_FILE_NAME.add(_position_FILE_NAME,_token);
					}
					_token=_token_FILE_NAME;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_declaration(image_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_image_declaration;
					}
					else {
						parse_image_type();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_declaration(image_declaration)");
								_furthestPosition=_position;
							}
							_position=_position_image_declaration;
						}
						else {
							int _state_232 = _state;
							while(_position<_inputLength) {
								parse__anonymous_213();
								if(_state==FAILED) {
									break;
								}
							}
							if(_state_232==SUCCESS&&_state==FAILED) {
								_state=SUCCESS;
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_declaration(image_declaration)");
									_furthestPosition=_position;
								}
								_position=_position_image_declaration;
							}
							else {
							}
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_image_declaration.add(_position_image_declaration,_token);
		}
		_token=_token_image_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_image_declaration);
			association_names.reject(_position_image_declaration);
			room_names.reject(_position_image_declaration);
			activity_names.reject(_position_image_declaration);
			siding_names.reject(_position_image_declaration);
			item_names.reject(_position_image_declaration);
			aspect_names.reject(_position_image_declaration);
			affinity_names.reject(_position_image_declaration);
			activity_type_names.reject(_position_image_declaration);
			trail_names.reject(_position_image_declaration);
			attack_names.reject(_position_image_declaration);
			reason_names.reject(_position_image_declaration);
			trait_names.reject(_position_image_declaration);
			condition_names.reject(_position_image_declaration);
			payment_short_type_names.reject(_position_image_declaration);
			skill_names.reject(_position_image_declaration);
			map_names.reject(_position_image_declaration);
			event_names.reject(_position_image_declaration);
			image_names.reject(_position_image_declaration);
			tile_symbols.reject(_position_image_declaration);
			payment_long_type_names.reject(_position_image_declaration);
			area_names.reject(_position_image_declaration);
			structure_names.reject(_position_image_declaration);
			tile_names.reject(_position_image_declaration);
			hero_stat.reject(_position_image_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_image_declaration);
			association_names.accept(_position_image_declaration);
			room_names.accept(_position_image_declaration);
			activity_names.accept(_position_image_declaration);
			siding_names.accept(_position_image_declaration);
			item_names.accept(_position_image_declaration);
			aspect_names.accept(_position_image_declaration);
			affinity_names.accept(_position_image_declaration);
			activity_type_names.accept(_position_image_declaration);
			trail_names.accept(_position_image_declaration);
			attack_names.accept(_position_image_declaration);
			reason_names.accept(_position_image_declaration);
			trait_names.accept(_position_image_declaration);
			condition_names.accept(_position_image_declaration);
			payment_short_type_names.accept(_position_image_declaration);
			skill_names.accept(_position_image_declaration);
			map_names.accept(_position_image_declaration);
			event_names.accept(_position_image_declaration);
			image_names.accept(_position_image_declaration);
			tile_symbols.accept(_position_image_declaration);
			payment_long_type_names.accept(_position_image_declaration);
			area_names.accept(_position_image_declaration);
			structure_names.accept(_position_image_declaration);
			tile_names.accept(_position_image_declaration);
			hero_stat.accept(_position_image_declaration);
		}
	}
	public void parse_image_type() {
		int _position_image_type = -1;
		Token.Parsed _token_image_type = null;
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
		_position_image_type=_position;
		_token_image_type=_token;
		_token=new Tokens.Rule.ImageTypeToken();
		if(_position+4-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='.') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='p') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='n') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='g') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_155.SYNTAX);
			_position=_position+4;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .png");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_type(image_type)");
				_furthestPosition=_position;
			}
			_position=_position_image_type;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_image_type.add(_position_image_type,_token);
		}
		_token=_token_image_type;
		if(_state==FAILED) {
			support_names.reject(_position_image_type);
			association_names.reject(_position_image_type);
			room_names.reject(_position_image_type);
			activity_names.reject(_position_image_type);
			siding_names.reject(_position_image_type);
			item_names.reject(_position_image_type);
			aspect_names.reject(_position_image_type);
			affinity_names.reject(_position_image_type);
			activity_type_names.reject(_position_image_type);
			trail_names.reject(_position_image_type);
			attack_names.reject(_position_image_type);
			reason_names.reject(_position_image_type);
			trait_names.reject(_position_image_type);
			condition_names.reject(_position_image_type);
			payment_short_type_names.reject(_position_image_type);
			skill_names.reject(_position_image_type);
			map_names.reject(_position_image_type);
			event_names.reject(_position_image_type);
			image_names.reject(_position_image_type);
			tile_symbols.reject(_position_image_type);
			payment_long_type_names.reject(_position_image_type);
			area_names.reject(_position_image_type);
			structure_names.reject(_position_image_type);
			tile_names.reject(_position_image_type);
			hero_stat.reject(_position_image_type);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_image_type);
			association_names.accept(_position_image_type);
			room_names.accept(_position_image_type);
			activity_names.accept(_position_image_type);
			siding_names.accept(_position_image_type);
			item_names.accept(_position_image_type);
			aspect_names.accept(_position_image_type);
			affinity_names.accept(_position_image_type);
			activity_type_names.accept(_position_image_type);
			trail_names.accept(_position_image_type);
			attack_names.accept(_position_image_type);
			reason_names.accept(_position_image_type);
			trait_names.accept(_position_image_type);
			condition_names.accept(_position_image_type);
			payment_short_type_names.accept(_position_image_type);
			skill_names.accept(_position_image_type);
			map_names.accept(_position_image_type);
			event_names.accept(_position_image_type);
			image_names.accept(_position_image_type);
			tile_symbols.accept(_position_image_type);
			payment_long_type_names.accept(_position_image_type);
			area_names.accept(_position_image_type);
			structure_names.accept(_position_image_type);
			tile_names.accept(_position_image_type);
			hero_stat.accept(_position_image_type);
		}
	}
	public void parse_image_id() {
		int _position_image_id = -1;
		Token.Parsed _token_image_id = null;
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
		_position_image_id=_position;
		_token_image_id=_token;
		_token=new Tokens.Rule.ImageIdToken();
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
			if(_list_name_result!=null&&image_names.contains(_list_name_result)) {
				if(_position+_list_name_result.length()<_inputLength) {
					int _next_char = _inputArray[_position+_list_name_result.length()];
					if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,new Tokens.Name.ImageNamesToken(_list_name_result));
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_names");
					_furthestPosition=_position;
				}
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_id(image_id)");
				_furthestPosition=_position;
			}
			_position=_position_image_id;
		}
		else {
			int _state_237 = _state;
			parse__anonymous_217();
			if(_state_237==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"image_id(image_id)");
					_furthestPosition=_position;
				}
				_position=_position_image_id;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_image_id.add(_position_image_id,_token);
		}
		_token=_token_image_id;
		if(_state==FAILED) {
			support_names.reject(_position_image_id);
			association_names.reject(_position_image_id);
			room_names.reject(_position_image_id);
			activity_names.reject(_position_image_id);
			siding_names.reject(_position_image_id);
			item_names.reject(_position_image_id);
			aspect_names.reject(_position_image_id);
			affinity_names.reject(_position_image_id);
			activity_type_names.reject(_position_image_id);
			trail_names.reject(_position_image_id);
			attack_names.reject(_position_image_id);
			reason_names.reject(_position_image_id);
			trait_names.reject(_position_image_id);
			condition_names.reject(_position_image_id);
			payment_short_type_names.reject(_position_image_id);
			skill_names.reject(_position_image_id);
			map_names.reject(_position_image_id);
			event_names.reject(_position_image_id);
			image_names.reject(_position_image_id);
			tile_symbols.reject(_position_image_id);
			payment_long_type_names.reject(_position_image_id);
			area_names.reject(_position_image_id);
			structure_names.reject(_position_image_id);
			tile_names.reject(_position_image_id);
			hero_stat.reject(_position_image_id);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_image_id);
			association_names.accept(_position_image_id);
			room_names.accept(_position_image_id);
			activity_names.accept(_position_image_id);
			siding_names.accept(_position_image_id);
			item_names.accept(_position_image_id);
			aspect_names.accept(_position_image_id);
			affinity_names.accept(_position_image_id);
			activity_type_names.accept(_position_image_id);
			trail_names.accept(_position_image_id);
			attack_names.accept(_position_image_id);
			reason_names.accept(_position_image_id);
			trait_names.accept(_position_image_id);
			condition_names.accept(_position_image_id);
			payment_short_type_names.accept(_position_image_id);
			skill_names.accept(_position_image_id);
			map_names.accept(_position_image_id);
			event_names.accept(_position_image_id);
			image_names.accept(_position_image_id);
			tile_symbols.accept(_position_image_id);
			payment_long_type_names.accept(_position_image_id);
			area_names.accept(_position_image_id);
			structure_names.accept(_position_image_id);
			tile_names.accept(_position_image_id);
			hero_stat.accept(_position_image_id);
		}
	}
}