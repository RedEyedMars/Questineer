package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.tile_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class animation_context extends tile_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public animation_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public animation_context() {
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
	public void parse_animation_type_continuation_operator() {
		int _position_animation_type_continuation_operator = -1;
		Token.Parsed _token_animation_type_continuation_operator = null;
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
		_position_animation_type_continuation_operator=_position;
		_token_animation_type_continuation_operator=_token;
		_token=new Tokens.Rule.AnimationTypeContinuationOperatorToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='&') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_68.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain &");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_continuation_operator(animation_type_continuation_operator)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_continuation_operator;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_type_continuation_operator.add(_position_animation_type_continuation_operator,_token);
		}
		_token=_token_animation_type_continuation_operator;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_continuation_operator);
			association_names.reject(_position_animation_type_continuation_operator);
			room_names.reject(_position_animation_type_continuation_operator);
			activity_names.reject(_position_animation_type_continuation_operator);
			siding_names.reject(_position_animation_type_continuation_operator);
			item_names.reject(_position_animation_type_continuation_operator);
			aspect_names.reject(_position_animation_type_continuation_operator);
			affinity_names.reject(_position_animation_type_continuation_operator);
			activity_type_names.reject(_position_animation_type_continuation_operator);
			trail_names.reject(_position_animation_type_continuation_operator);
			attack_names.reject(_position_animation_type_continuation_operator);
			reason_names.reject(_position_animation_type_continuation_operator);
			trait_names.reject(_position_animation_type_continuation_operator);
			condition_names.reject(_position_animation_type_continuation_operator);
			payment_short_type_names.reject(_position_animation_type_continuation_operator);
			skill_names.reject(_position_animation_type_continuation_operator);
			map_names.reject(_position_animation_type_continuation_operator);
			event_names.reject(_position_animation_type_continuation_operator);
			image_names.reject(_position_animation_type_continuation_operator);
			tile_symbols.reject(_position_animation_type_continuation_operator);
			payment_long_type_names.reject(_position_animation_type_continuation_operator);
			area_names.reject(_position_animation_type_continuation_operator);
			structure_names.reject(_position_animation_type_continuation_operator);
			tile_names.reject(_position_animation_type_continuation_operator);
			hero_stat.reject(_position_animation_type_continuation_operator);
			_state=SUCCESS;
			_position_animation_type_continuation_operator=_position;
			_token_animation_type_continuation_operator=_token;
			_token=new Tokens.Rule.AnimationTypeContinuationOperatorToken();
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='|') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_35.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain |");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_continuation_operator(animation_type_continuation_operator)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_continuation_operator;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_type_continuation_operator.add(_position_animation_type_continuation_operator,_token);
			}
			_token=_token_animation_type_continuation_operator;
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_continuation_operator);
				association_names.reject(_position_animation_type_continuation_operator);
				room_names.reject(_position_animation_type_continuation_operator);
				activity_names.reject(_position_animation_type_continuation_operator);
				siding_names.reject(_position_animation_type_continuation_operator);
				item_names.reject(_position_animation_type_continuation_operator);
				aspect_names.reject(_position_animation_type_continuation_operator);
				affinity_names.reject(_position_animation_type_continuation_operator);
				activity_type_names.reject(_position_animation_type_continuation_operator);
				trail_names.reject(_position_animation_type_continuation_operator);
				attack_names.reject(_position_animation_type_continuation_operator);
				reason_names.reject(_position_animation_type_continuation_operator);
				trait_names.reject(_position_animation_type_continuation_operator);
				condition_names.reject(_position_animation_type_continuation_operator);
				payment_short_type_names.reject(_position_animation_type_continuation_operator);
				skill_names.reject(_position_animation_type_continuation_operator);
				map_names.reject(_position_animation_type_continuation_operator);
				event_names.reject(_position_animation_type_continuation_operator);
				image_names.reject(_position_animation_type_continuation_operator);
				tile_symbols.reject(_position_animation_type_continuation_operator);
				payment_long_type_names.reject(_position_animation_type_continuation_operator);
				area_names.reject(_position_animation_type_continuation_operator);
				structure_names.reject(_position_animation_type_continuation_operator);
				tile_names.reject(_position_animation_type_continuation_operator);
				hero_stat.reject(_position_animation_type_continuation_operator);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_type_continuation_operator);
				association_names.accept(_position_animation_type_continuation_operator);
				room_names.accept(_position_animation_type_continuation_operator);
				activity_names.accept(_position_animation_type_continuation_operator);
				siding_names.accept(_position_animation_type_continuation_operator);
				item_names.accept(_position_animation_type_continuation_operator);
				aspect_names.accept(_position_animation_type_continuation_operator);
				affinity_names.accept(_position_animation_type_continuation_operator);
				activity_type_names.accept(_position_animation_type_continuation_operator);
				trail_names.accept(_position_animation_type_continuation_operator);
				attack_names.accept(_position_animation_type_continuation_operator);
				reason_names.accept(_position_animation_type_continuation_operator);
				trait_names.accept(_position_animation_type_continuation_operator);
				condition_names.accept(_position_animation_type_continuation_operator);
				payment_short_type_names.accept(_position_animation_type_continuation_operator);
				skill_names.accept(_position_animation_type_continuation_operator);
				map_names.accept(_position_animation_type_continuation_operator);
				event_names.accept(_position_animation_type_continuation_operator);
				image_names.accept(_position_animation_type_continuation_operator);
				tile_symbols.accept(_position_animation_type_continuation_operator);
				payment_long_type_names.accept(_position_animation_type_continuation_operator);
				area_names.accept(_position_animation_type_continuation_operator);
				structure_names.accept(_position_animation_type_continuation_operator);
				tile_names.accept(_position_animation_type_continuation_operator);
				hero_stat.accept(_position_animation_type_continuation_operator);
			}
		}
	}
	public void parse_animation_type_condition() {
		int _position_animation_type_condition = -1;
		Token.Parsed _token_animation_type_condition = null;
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
		_position_animation_type_condition=_position;
		_token_animation_type_condition=_token;
		_token=new Tokens.Rule.AnimationTypeConditionToken();
		if(_position+2-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='i') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='f') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_89.SYNTAX);
			_position=_position+2;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain if");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_condition(animation_type_condition)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_condition;
		}
		else {
			parse_animation_type_boolean();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_condition(animation_type_condition)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_condition;
			}
			else {
				int _state_222 = _state;
				while(_position<_inputLength) {
					parse__anonymous_206();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_222==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_condition(animation_type_condition)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_condition;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_animation_type_condition.add(_position_animation_type_condition,_token);
		}
		_token=_token_animation_type_condition;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_condition);
			association_names.reject(_position_animation_type_condition);
			room_names.reject(_position_animation_type_condition);
			activity_names.reject(_position_animation_type_condition);
			siding_names.reject(_position_animation_type_condition);
			item_names.reject(_position_animation_type_condition);
			aspect_names.reject(_position_animation_type_condition);
			affinity_names.reject(_position_animation_type_condition);
			activity_type_names.reject(_position_animation_type_condition);
			trail_names.reject(_position_animation_type_condition);
			attack_names.reject(_position_animation_type_condition);
			reason_names.reject(_position_animation_type_condition);
			trait_names.reject(_position_animation_type_condition);
			condition_names.reject(_position_animation_type_condition);
			payment_short_type_names.reject(_position_animation_type_condition);
			skill_names.reject(_position_animation_type_condition);
			map_names.reject(_position_animation_type_condition);
			event_names.reject(_position_animation_type_condition);
			image_names.reject(_position_animation_type_condition);
			tile_symbols.reject(_position_animation_type_condition);
			payment_long_type_names.reject(_position_animation_type_condition);
			area_names.reject(_position_animation_type_condition);
			structure_names.reject(_position_animation_type_condition);
			tile_names.reject(_position_animation_type_condition);
			hero_stat.reject(_position_animation_type_condition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_animation_type_condition);
			association_names.accept(_position_animation_type_condition);
			room_names.accept(_position_animation_type_condition);
			activity_names.accept(_position_animation_type_condition);
			siding_names.accept(_position_animation_type_condition);
			item_names.accept(_position_animation_type_condition);
			aspect_names.accept(_position_animation_type_condition);
			affinity_names.accept(_position_animation_type_condition);
			activity_type_names.accept(_position_animation_type_condition);
			trail_names.accept(_position_animation_type_condition);
			attack_names.accept(_position_animation_type_condition);
			reason_names.accept(_position_animation_type_condition);
			trait_names.accept(_position_animation_type_condition);
			condition_names.accept(_position_animation_type_condition);
			payment_short_type_names.accept(_position_animation_type_condition);
			skill_names.accept(_position_animation_type_condition);
			map_names.accept(_position_animation_type_condition);
			event_names.accept(_position_animation_type_condition);
			image_names.accept(_position_animation_type_condition);
			tile_symbols.accept(_position_animation_type_condition);
			payment_long_type_names.accept(_position_animation_type_condition);
			area_names.accept(_position_animation_type_condition);
			structure_names.accept(_position_animation_type_condition);
			tile_names.accept(_position_animation_type_condition);
			hero_stat.accept(_position_animation_type_condition);
		}
	}
	public void parse_animation_type_boolean() {
		int _position_animation_type_boolean = -1;
		Token.Parsed _token_animation_type_boolean = null;
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
		_position_animation_type_boolean=_position;
		_token_animation_type_boolean=_token;
		_token=new Tokens.Rule.AnimationTypeBooleanToken();
		_token_NAME=_token;
		_token=new Tokens.Name.LeftNameToken();
		_position_NAME=_position;
		parse_NAME();
		if(_state==SUCCESS) {
			_token_NAME.add(_position_NAME,_token);
		}
		_token=_token_NAME;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean(animation_type_boolean)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_boolean;
		}
		else {
			parse_animation_type_boolean_operator();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean(animation_type_boolean)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_boolean;
			}
			else {
				parse_animation_type_value();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean(animation_type_boolean)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_boolean;
				}
				else {
					int _state_223 = _state;
					while(_position<_inputLength) {
						parse__anonymous_207();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_223==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean(animation_type_boolean)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_boolean;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_animation_type_boolean.add(_position_animation_type_boolean,_token);
		}
		_token=_token_animation_type_boolean;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_boolean);
			association_names.reject(_position_animation_type_boolean);
			room_names.reject(_position_animation_type_boolean);
			activity_names.reject(_position_animation_type_boolean);
			siding_names.reject(_position_animation_type_boolean);
			item_names.reject(_position_animation_type_boolean);
			aspect_names.reject(_position_animation_type_boolean);
			affinity_names.reject(_position_animation_type_boolean);
			activity_type_names.reject(_position_animation_type_boolean);
			trail_names.reject(_position_animation_type_boolean);
			attack_names.reject(_position_animation_type_boolean);
			reason_names.reject(_position_animation_type_boolean);
			trait_names.reject(_position_animation_type_boolean);
			condition_names.reject(_position_animation_type_boolean);
			payment_short_type_names.reject(_position_animation_type_boolean);
			skill_names.reject(_position_animation_type_boolean);
			map_names.reject(_position_animation_type_boolean);
			event_names.reject(_position_animation_type_boolean);
			image_names.reject(_position_animation_type_boolean);
			tile_symbols.reject(_position_animation_type_boolean);
			payment_long_type_names.reject(_position_animation_type_boolean);
			area_names.reject(_position_animation_type_boolean);
			structure_names.reject(_position_animation_type_boolean);
			tile_names.reject(_position_animation_type_boolean);
			hero_stat.reject(_position_animation_type_boolean);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_animation_type_boolean);
			association_names.accept(_position_animation_type_boolean);
			room_names.accept(_position_animation_type_boolean);
			activity_names.accept(_position_animation_type_boolean);
			siding_names.accept(_position_animation_type_boolean);
			item_names.accept(_position_animation_type_boolean);
			aspect_names.accept(_position_animation_type_boolean);
			affinity_names.accept(_position_animation_type_boolean);
			activity_type_names.accept(_position_animation_type_boolean);
			trail_names.accept(_position_animation_type_boolean);
			attack_names.accept(_position_animation_type_boolean);
			reason_names.accept(_position_animation_type_boolean);
			trait_names.accept(_position_animation_type_boolean);
			condition_names.accept(_position_animation_type_boolean);
			payment_short_type_names.accept(_position_animation_type_boolean);
			skill_names.accept(_position_animation_type_boolean);
			map_names.accept(_position_animation_type_boolean);
			event_names.accept(_position_animation_type_boolean);
			image_names.accept(_position_animation_type_boolean);
			tile_symbols.accept(_position_animation_type_boolean);
			payment_long_type_names.accept(_position_animation_type_boolean);
			area_names.accept(_position_animation_type_boolean);
			structure_names.accept(_position_animation_type_boolean);
			tile_names.accept(_position_animation_type_boolean);
			hero_stat.accept(_position_animation_type_boolean);
		}
	}
	public void parse_animation_type_coordinate_variable() {
		int _position_animation_type_coordinate_variable = -1;
		Token.Parsed _token_animation_type_coordinate_variable = null;
		int _position_INTEGER = -1;
		Token.Parsed _token_INTEGER = null;
		int _length_animation_type_coordinate_variable_brace = _inputLength;
		if(brace_5.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_5.get(_position);
			int _position_animation_type_coordinate_variable_brace = _position;
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
			_position_animation_type_coordinate_variable=_position;
			_token_animation_type_coordinate_variable=_token;
			_token=new Tokens.Rule.AnimationTypeCoordinateVariableToken();
			_token_INTEGER=_token;
			_token=new Tokens.Name.LowXToken();
			_position_INTEGER=_position;
			parse_INTEGER();
			if(_state==SUCCESS) {
				_token_INTEGER.add(_position_INTEGER,_token);
			}
			_token=_token_INTEGER;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_coordinate_variable(animation_type_coordinate_variable)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_coordinate_variable;
			}
			else {
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!=',') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_23.SYNTAX);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ,");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_coordinate_variable(animation_type_coordinate_variable)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_coordinate_variable;
				}
				else {
					_token_INTEGER=_token;
					_token=new Tokens.Name.LowYToken();
					_position_INTEGER=_position;
					parse_INTEGER();
					if(_state==SUCCESS) {
						_token_INTEGER.add(_position_INTEGER,_token);
					}
					_token=_token_INTEGER;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_coordinate_variable(animation_type_coordinate_variable)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_coordinate_variable;
					}
					else {
						int _state_224 = _state;
						parse__anonymous_208();
						if(_state_224==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_coordinate_variable(animation_type_coordinate_variable)");
								_furthestPosition=_position;
							}
							_position=_position_animation_type_coordinate_variable;
						}
						else {
						}
					}
				}
			}
			if(_state==SUCCESS) {
				_token_animation_type_coordinate_variable.add(_position_animation_type_coordinate_variable,_token);
			}
			_token=_token_animation_type_coordinate_variable;
			if(_state==SUCCESS&&brace_5.get(_position_animation_type_coordinate_variable_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("animation_type_coordinate_variable",_position,_lineNumberRanges));
				_position=brace_5.get(_position_animation_type_coordinate_variable_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_animation_type_coordinate_variable_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_coordinate_variable);
				association_names.reject(_position_animation_type_coordinate_variable);
				room_names.reject(_position_animation_type_coordinate_variable);
				activity_names.reject(_position_animation_type_coordinate_variable);
				siding_names.reject(_position_animation_type_coordinate_variable);
				item_names.reject(_position_animation_type_coordinate_variable);
				aspect_names.reject(_position_animation_type_coordinate_variable);
				affinity_names.reject(_position_animation_type_coordinate_variable);
				activity_type_names.reject(_position_animation_type_coordinate_variable);
				trail_names.reject(_position_animation_type_coordinate_variable);
				attack_names.reject(_position_animation_type_coordinate_variable);
				reason_names.reject(_position_animation_type_coordinate_variable);
				trait_names.reject(_position_animation_type_coordinate_variable);
				condition_names.reject(_position_animation_type_coordinate_variable);
				payment_short_type_names.reject(_position_animation_type_coordinate_variable);
				skill_names.reject(_position_animation_type_coordinate_variable);
				map_names.reject(_position_animation_type_coordinate_variable);
				event_names.reject(_position_animation_type_coordinate_variable);
				image_names.reject(_position_animation_type_coordinate_variable);
				tile_symbols.reject(_position_animation_type_coordinate_variable);
				payment_long_type_names.reject(_position_animation_type_coordinate_variable);
				area_names.reject(_position_animation_type_coordinate_variable);
				structure_names.reject(_position_animation_type_coordinate_variable);
				tile_names.reject(_position_animation_type_coordinate_variable);
				hero_stat.reject(_position_animation_type_coordinate_variable);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_type_coordinate_variable);
				association_names.accept(_position_animation_type_coordinate_variable);
				room_names.accept(_position_animation_type_coordinate_variable);
				activity_names.accept(_position_animation_type_coordinate_variable);
				siding_names.accept(_position_animation_type_coordinate_variable);
				item_names.accept(_position_animation_type_coordinate_variable);
				aspect_names.accept(_position_animation_type_coordinate_variable);
				affinity_names.accept(_position_animation_type_coordinate_variable);
				activity_type_names.accept(_position_animation_type_coordinate_variable);
				trail_names.accept(_position_animation_type_coordinate_variable);
				attack_names.accept(_position_animation_type_coordinate_variable);
				reason_names.accept(_position_animation_type_coordinate_variable);
				trait_names.accept(_position_animation_type_coordinate_variable);
				condition_names.accept(_position_animation_type_coordinate_variable);
				payment_short_type_names.accept(_position_animation_type_coordinate_variable);
				skill_names.accept(_position_animation_type_coordinate_variable);
				map_names.accept(_position_animation_type_coordinate_variable);
				event_names.accept(_position_animation_type_coordinate_variable);
				image_names.accept(_position_animation_type_coordinate_variable);
				tile_symbols.accept(_position_animation_type_coordinate_variable);
				payment_long_type_names.accept(_position_animation_type_coordinate_variable);
				area_names.accept(_position_animation_type_coordinate_variable);
				structure_names.accept(_position_animation_type_coordinate_variable);
				tile_names.accept(_position_animation_type_coordinate_variable);
				hero_stat.accept(_position_animation_type_coordinate_variable);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_coordinate_variable(animation_type_coordinate_variable)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_animation() {
		int _position_animation = -1;
		Token.Parsed _token_animation = null;
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
		_position_animation=_position;
		_token_animation=_token;
		_token=new Tokens.Rule.AnimationToken();
		parse_image_id();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation(animation)");
				_furthestPosition=_position;
			}
			_position=_position_animation;
		}
		else {
			int _state_239 = _state;
			while(_position<_inputLength) {
				parse__anonymous_219();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_239==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation(animation)");
					_furthestPosition=_position;
				}
				_position=_position_animation;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_animation.add(_position_animation,_token);
		}
		_token=_token_animation;
		if(_state==FAILED) {
			support_names.reject(_position_animation);
			association_names.reject(_position_animation);
			room_names.reject(_position_animation);
			activity_names.reject(_position_animation);
			siding_names.reject(_position_animation);
			item_names.reject(_position_animation);
			aspect_names.reject(_position_animation);
			affinity_names.reject(_position_animation);
			activity_type_names.reject(_position_animation);
			trail_names.reject(_position_animation);
			attack_names.reject(_position_animation);
			reason_names.reject(_position_animation);
			trait_names.reject(_position_animation);
			condition_names.reject(_position_animation);
			payment_short_type_names.reject(_position_animation);
			skill_names.reject(_position_animation);
			map_names.reject(_position_animation);
			event_names.reject(_position_animation);
			image_names.reject(_position_animation);
			tile_symbols.reject(_position_animation);
			payment_long_type_names.reject(_position_animation);
			area_names.reject(_position_animation);
			structure_names.reject(_position_animation);
			tile_names.reject(_position_animation);
			hero_stat.reject(_position_animation);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_animation);
			association_names.accept(_position_animation);
			room_names.accept(_position_animation);
			activity_names.accept(_position_animation);
			siding_names.accept(_position_animation);
			item_names.accept(_position_animation);
			aspect_names.accept(_position_animation);
			affinity_names.accept(_position_animation);
			activity_type_names.accept(_position_animation);
			trail_names.accept(_position_animation);
			attack_names.accept(_position_animation);
			reason_names.accept(_position_animation);
			trait_names.accept(_position_animation);
			condition_names.accept(_position_animation);
			payment_short_type_names.accept(_position_animation);
			skill_names.accept(_position_animation);
			map_names.accept(_position_animation);
			event_names.accept(_position_animation);
			image_names.accept(_position_animation);
			tile_symbols.accept(_position_animation);
			payment_long_type_names.accept(_position_animation);
			area_names.accept(_position_animation);
			structure_names.accept(_position_animation);
			tile_names.accept(_position_animation);
			hero_stat.accept(_position_animation);
		}
	}
	public void parse_animation_substates() {
		int _position_animation_substates = -1;
		Token.Parsed _token_animation_substates = null;
		int _length_animation_substates_brace = _inputLength;
		if(brace_4.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_4.get(_position);
			int _position_animation_substates_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' ')) {
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
			_position_animation_substates=_position;
			_token_animation_substates=_token;
			_token=new Tokens.Rule.AnimationSubstatesToken();
			int _state_229 = _state;
			while(_position<_inputLength) {
				parse__anonymous_211();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_229==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_substates(animation_substates)");
					_furthestPosition=_position;
				}
				_position=_position_animation_substates;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_substates.addAll(_token);
				_token_animation_substates.setValue(_token.getValue());
			}
			_token=_token_animation_substates;
			if(_state==SUCCESS&&brace_4.get(_position_animation_substates_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("animation_substates",_position,_lineNumberRanges));
				_position=brace_4.get(_position_animation_substates_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_animation_substates_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_animation_substates);
				association_names.reject(_position_animation_substates);
				room_names.reject(_position_animation_substates);
				activity_names.reject(_position_animation_substates);
				siding_names.reject(_position_animation_substates);
				item_names.reject(_position_animation_substates);
				aspect_names.reject(_position_animation_substates);
				affinity_names.reject(_position_animation_substates);
				activity_type_names.reject(_position_animation_substates);
				trail_names.reject(_position_animation_substates);
				attack_names.reject(_position_animation_substates);
				reason_names.reject(_position_animation_substates);
				trait_names.reject(_position_animation_substates);
				condition_names.reject(_position_animation_substates);
				payment_short_type_names.reject(_position_animation_substates);
				skill_names.reject(_position_animation_substates);
				map_names.reject(_position_animation_substates);
				event_names.reject(_position_animation_substates);
				image_names.reject(_position_animation_substates);
				tile_symbols.reject(_position_animation_substates);
				payment_long_type_names.reject(_position_animation_substates);
				area_names.reject(_position_animation_substates);
				structure_names.reject(_position_animation_substates);
				tile_names.reject(_position_animation_substates);
				hero_stat.reject(_position_animation_substates);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_substates);
				association_names.accept(_position_animation_substates);
				room_names.accept(_position_animation_substates);
				activity_names.accept(_position_animation_substates);
				siding_names.accept(_position_animation_substates);
				item_names.accept(_position_animation_substates);
				aspect_names.accept(_position_animation_substates);
				affinity_names.accept(_position_animation_substates);
				activity_type_names.accept(_position_animation_substates);
				trail_names.accept(_position_animation_substates);
				attack_names.accept(_position_animation_substates);
				reason_names.accept(_position_animation_substates);
				trait_names.accept(_position_animation_substates);
				condition_names.accept(_position_animation_substates);
				payment_short_type_names.accept(_position_animation_substates);
				skill_names.accept(_position_animation_substates);
				map_names.accept(_position_animation_substates);
				event_names.accept(_position_animation_substates);
				image_names.accept(_position_animation_substates);
				tile_symbols.accept(_position_animation_substates);
				payment_long_type_names.accept(_position_animation_substates);
				area_names.accept(_position_animation_substates);
				structure_names.accept(_position_animation_substates);
				tile_names.accept(_position_animation_substates);
				hero_stat.accept(_position_animation_substates);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_substates(animation_substates)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_animation_type_declaration() {
		int _position_animation_type_declaration = -1;
		Token.Parsed _token_animation_type_declaration = null;
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
		_position_animation_type_declaration=_position;
		_token_animation_type_declaration=_token;
		_token=new Tokens.Rule.AnimationTypeDeclarationToken();
		_token_NAME=_token;
		_token=new Tokens.Name.AnimationTypeNameToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_38.contains(_position)) {
			_recursion_protection_NAME_38.add(_position);
			parse_NAME();
			_recursion_protection_NAME_38.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token_NAME.add(_position_NAME,_token);
		}
		_token=_token_NAME;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_declaration(animation_type_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_declaration;
		}
		else {
			int _state_220 = _state;
			parse_animation_type_variables();
			if(_state_220==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_declaration(animation_type_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_declaration;
			}
			else {
				parse_animation_type_body();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_declaration(animation_type_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_animation_type_declaration.add(_position_animation_type_declaration,_token);
		}
		_token=_token_animation_type_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_declaration);
			association_names.reject(_position_animation_type_declaration);
			room_names.reject(_position_animation_type_declaration);
			activity_names.reject(_position_animation_type_declaration);
			siding_names.reject(_position_animation_type_declaration);
			item_names.reject(_position_animation_type_declaration);
			aspect_names.reject(_position_animation_type_declaration);
			affinity_names.reject(_position_animation_type_declaration);
			activity_type_names.reject(_position_animation_type_declaration);
			trail_names.reject(_position_animation_type_declaration);
			attack_names.reject(_position_animation_type_declaration);
			reason_names.reject(_position_animation_type_declaration);
			trait_names.reject(_position_animation_type_declaration);
			condition_names.reject(_position_animation_type_declaration);
			payment_short_type_names.reject(_position_animation_type_declaration);
			skill_names.reject(_position_animation_type_declaration);
			map_names.reject(_position_animation_type_declaration);
			event_names.reject(_position_animation_type_declaration);
			image_names.reject(_position_animation_type_declaration);
			tile_symbols.reject(_position_animation_type_declaration);
			payment_long_type_names.reject(_position_animation_type_declaration);
			area_names.reject(_position_animation_type_declaration);
			structure_names.reject(_position_animation_type_declaration);
			tile_names.reject(_position_animation_type_declaration);
			hero_stat.reject(_position_animation_type_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_animation_type_declaration);
			association_names.accept(_position_animation_type_declaration);
			room_names.accept(_position_animation_type_declaration);
			activity_names.accept(_position_animation_type_declaration);
			siding_names.accept(_position_animation_type_declaration);
			item_names.accept(_position_animation_type_declaration);
			aspect_names.accept(_position_animation_type_declaration);
			affinity_names.accept(_position_animation_type_declaration);
			activity_type_names.accept(_position_animation_type_declaration);
			trail_names.accept(_position_animation_type_declaration);
			attack_names.accept(_position_animation_type_declaration);
			reason_names.accept(_position_animation_type_declaration);
			trait_names.accept(_position_animation_type_declaration);
			condition_names.accept(_position_animation_type_declaration);
			payment_short_type_names.accept(_position_animation_type_declaration);
			skill_names.accept(_position_animation_type_declaration);
			map_names.accept(_position_animation_type_declaration);
			event_names.accept(_position_animation_type_declaration);
			image_names.accept(_position_animation_type_declaration);
			tile_symbols.accept(_position_animation_type_declaration);
			payment_long_type_names.accept(_position_animation_type_declaration);
			area_names.accept(_position_animation_type_declaration);
			structure_names.accept(_position_animation_type_declaration);
			tile_names.accept(_position_animation_type_declaration);
			hero_stat.accept(_position_animation_type_declaration);
		}
	}
	public void parse_animation_variable_value_basic() {
		int _position_animation_variable_value_basic = -1;
		Token.Parsed _token_animation_variable_value_basic = null;
		int _position_QUOTE = -1;
		int _position_animation_variable_value_range = -1;
		Token.Parsed _token_QUOTE = null;
		Token.Parsed _token_animation_variable_value_range = null;
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
		_position_animation_variable_value_basic=_position;
		_token_animation_variable_value_basic=_token;
		_token=new Tokens.Rule.AnimationVariableValueBasicToken();
		_token_animation_variable_value_range=_token;
		_token=new Tokens.Name.RangeToken();
		_position_animation_variable_value_range=_position;
		parse_animation_variable_value_range();
		if(_state==SUCCESS) {
			_token_animation_variable_value_range.add(_position_animation_variable_value_range,_token);
		}
		_token=_token_animation_variable_value_range;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_basic(animation_variable_value_basic)");
				_furthestPosition=_position;
			}
			_position=_position_animation_variable_value_basic;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_variable_value_basic.addAll(_token);
			_token_animation_variable_value_basic.setValue(_token.getValue());
		}
		_token=_token_animation_variable_value_basic;
		if(_state==FAILED) {
			support_names.reject(_position_animation_variable_value_basic);
			association_names.reject(_position_animation_variable_value_basic);
			room_names.reject(_position_animation_variable_value_basic);
			activity_names.reject(_position_animation_variable_value_basic);
			siding_names.reject(_position_animation_variable_value_basic);
			item_names.reject(_position_animation_variable_value_basic);
			aspect_names.reject(_position_animation_variable_value_basic);
			affinity_names.reject(_position_animation_variable_value_basic);
			activity_type_names.reject(_position_animation_variable_value_basic);
			trail_names.reject(_position_animation_variable_value_basic);
			attack_names.reject(_position_animation_variable_value_basic);
			reason_names.reject(_position_animation_variable_value_basic);
			trait_names.reject(_position_animation_variable_value_basic);
			condition_names.reject(_position_animation_variable_value_basic);
			payment_short_type_names.reject(_position_animation_variable_value_basic);
			skill_names.reject(_position_animation_variable_value_basic);
			map_names.reject(_position_animation_variable_value_basic);
			event_names.reject(_position_animation_variable_value_basic);
			image_names.reject(_position_animation_variable_value_basic);
			tile_symbols.reject(_position_animation_variable_value_basic);
			payment_long_type_names.reject(_position_animation_variable_value_basic);
			area_names.reject(_position_animation_variable_value_basic);
			structure_names.reject(_position_animation_variable_value_basic);
			tile_names.reject(_position_animation_variable_value_basic);
			hero_stat.reject(_position_animation_variable_value_basic);
			_state=SUCCESS;
			_position_animation_variable_value_basic=_position;
			_token_animation_variable_value_basic=_token;
			_token=new Tokens.Rule.AnimationVariableValueBasicToken();
			parse_INTEGER();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_basic(animation_variable_value_basic)");
					_furthestPosition=_position;
				}
				_position=_position_animation_variable_value_basic;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_variable_value_basic.addAll(_token);
				_token_animation_variable_value_basic.setValue(_token.getValue());
			}
			_token=_token_animation_variable_value_basic;
			if(_state==FAILED) {
				support_names.reject(_position_animation_variable_value_basic);
				association_names.reject(_position_animation_variable_value_basic);
				room_names.reject(_position_animation_variable_value_basic);
				activity_names.reject(_position_animation_variable_value_basic);
				siding_names.reject(_position_animation_variable_value_basic);
				item_names.reject(_position_animation_variable_value_basic);
				aspect_names.reject(_position_animation_variable_value_basic);
				affinity_names.reject(_position_animation_variable_value_basic);
				activity_type_names.reject(_position_animation_variable_value_basic);
				trail_names.reject(_position_animation_variable_value_basic);
				attack_names.reject(_position_animation_variable_value_basic);
				reason_names.reject(_position_animation_variable_value_basic);
				trait_names.reject(_position_animation_variable_value_basic);
				condition_names.reject(_position_animation_variable_value_basic);
				payment_short_type_names.reject(_position_animation_variable_value_basic);
				skill_names.reject(_position_animation_variable_value_basic);
				map_names.reject(_position_animation_variable_value_basic);
				event_names.reject(_position_animation_variable_value_basic);
				image_names.reject(_position_animation_variable_value_basic);
				tile_symbols.reject(_position_animation_variable_value_basic);
				payment_long_type_names.reject(_position_animation_variable_value_basic);
				area_names.reject(_position_animation_variable_value_basic);
				structure_names.reject(_position_animation_variable_value_basic);
				tile_names.reject(_position_animation_variable_value_basic);
				hero_stat.reject(_position_animation_variable_value_basic);
				_state=SUCCESS;
				_position_animation_variable_value_basic=_position;
				_token_animation_variable_value_basic=_token;
				_token=new Tokens.Rule.AnimationVariableValueBasicToken();
				parse_FLOAT();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_basic(animation_variable_value_basic)");
						_furthestPosition=_position;
					}
					_position=_position_animation_variable_value_basic;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_animation_variable_value_basic.addAll(_token);
					_token_animation_variable_value_basic.setValue(_token.getValue());
				}
				_token=_token_animation_variable_value_basic;
				if(_state==FAILED) {
					support_names.reject(_position_animation_variable_value_basic);
					association_names.reject(_position_animation_variable_value_basic);
					room_names.reject(_position_animation_variable_value_basic);
					activity_names.reject(_position_animation_variable_value_basic);
					siding_names.reject(_position_animation_variable_value_basic);
					item_names.reject(_position_animation_variable_value_basic);
					aspect_names.reject(_position_animation_variable_value_basic);
					affinity_names.reject(_position_animation_variable_value_basic);
					activity_type_names.reject(_position_animation_variable_value_basic);
					trail_names.reject(_position_animation_variable_value_basic);
					attack_names.reject(_position_animation_variable_value_basic);
					reason_names.reject(_position_animation_variable_value_basic);
					trait_names.reject(_position_animation_variable_value_basic);
					condition_names.reject(_position_animation_variable_value_basic);
					payment_short_type_names.reject(_position_animation_variable_value_basic);
					skill_names.reject(_position_animation_variable_value_basic);
					map_names.reject(_position_animation_variable_value_basic);
					event_names.reject(_position_animation_variable_value_basic);
					image_names.reject(_position_animation_variable_value_basic);
					tile_symbols.reject(_position_animation_variable_value_basic);
					payment_long_type_names.reject(_position_animation_variable_value_basic);
					area_names.reject(_position_animation_variable_value_basic);
					structure_names.reject(_position_animation_variable_value_basic);
					tile_names.reject(_position_animation_variable_value_basic);
					hero_stat.reject(_position_animation_variable_value_basic);
					_state=SUCCESS;
					_position_animation_variable_value_basic=_position;
					_token_animation_variable_value_basic=_token;
					_token=new Tokens.Rule.AnimationVariableValueBasicToken();
					_token_QUOTE=_token;
					_token=new Tokens.Name.QuoteToken();
					_position_QUOTE=_position;
					parse_QUOTE();
					if(_state==SUCCESS) {
						_token_QUOTE.add(_position_QUOTE,_token);
					}
					_token=_token_QUOTE;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_basic(animation_variable_value_basic)");
							_furthestPosition=_position;
						}
						_position=_position_animation_variable_value_basic;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_animation_variable_value_basic.addAll(_token);
						_token_animation_variable_value_basic.setValue(_token.getValue());
					}
					_token=_token_animation_variable_value_basic;
					if(_state==FAILED) {
						support_names.reject(_position_animation_variable_value_basic);
						association_names.reject(_position_animation_variable_value_basic);
						room_names.reject(_position_animation_variable_value_basic);
						activity_names.reject(_position_animation_variable_value_basic);
						siding_names.reject(_position_animation_variable_value_basic);
						item_names.reject(_position_animation_variable_value_basic);
						aspect_names.reject(_position_animation_variable_value_basic);
						affinity_names.reject(_position_animation_variable_value_basic);
						activity_type_names.reject(_position_animation_variable_value_basic);
						trail_names.reject(_position_animation_variable_value_basic);
						attack_names.reject(_position_animation_variable_value_basic);
						reason_names.reject(_position_animation_variable_value_basic);
						trait_names.reject(_position_animation_variable_value_basic);
						condition_names.reject(_position_animation_variable_value_basic);
						payment_short_type_names.reject(_position_animation_variable_value_basic);
						skill_names.reject(_position_animation_variable_value_basic);
						map_names.reject(_position_animation_variable_value_basic);
						event_names.reject(_position_animation_variable_value_basic);
						image_names.reject(_position_animation_variable_value_basic);
						tile_symbols.reject(_position_animation_variable_value_basic);
						payment_long_type_names.reject(_position_animation_variable_value_basic);
						area_names.reject(_position_animation_variable_value_basic);
						structure_names.reject(_position_animation_variable_value_basic);
						tile_names.reject(_position_animation_variable_value_basic);
						hero_stat.reject(_position_animation_variable_value_basic);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_animation_variable_value_basic);
						association_names.accept(_position_animation_variable_value_basic);
						room_names.accept(_position_animation_variable_value_basic);
						activity_names.accept(_position_animation_variable_value_basic);
						siding_names.accept(_position_animation_variable_value_basic);
						item_names.accept(_position_animation_variable_value_basic);
						aspect_names.accept(_position_animation_variable_value_basic);
						affinity_names.accept(_position_animation_variable_value_basic);
						activity_type_names.accept(_position_animation_variable_value_basic);
						trail_names.accept(_position_animation_variable_value_basic);
						attack_names.accept(_position_animation_variable_value_basic);
						reason_names.accept(_position_animation_variable_value_basic);
						trait_names.accept(_position_animation_variable_value_basic);
						condition_names.accept(_position_animation_variable_value_basic);
						payment_short_type_names.accept(_position_animation_variable_value_basic);
						skill_names.accept(_position_animation_variable_value_basic);
						map_names.accept(_position_animation_variable_value_basic);
						event_names.accept(_position_animation_variable_value_basic);
						image_names.accept(_position_animation_variable_value_basic);
						tile_symbols.accept(_position_animation_variable_value_basic);
						payment_long_type_names.accept(_position_animation_variable_value_basic);
						area_names.accept(_position_animation_variable_value_basic);
						structure_names.accept(_position_animation_variable_value_basic);
						tile_names.accept(_position_animation_variable_value_basic);
						hero_stat.accept(_position_animation_variable_value_basic);
					}
				}
			}
		}
	}
	public void parse_animation_state() {
		int _position_animation_state = -1;
		Token.Parsed _token_animation_state = null;
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
		_position_animation_state=_position;
		_token_animation_state=_token;
		_token=new Tokens.Rule.AnimationStateToken();
		int _state_233 = _state;
		while(_position<_inputLength) {
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
				break;
			}
		}
		if(_state_233==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_state(animation_state)");
				_furthestPosition=_position;
			}
			_position=_position_animation_state;
		}
		else {
			parse__anonymous_214();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_state(animation_state)");
					_furthestPosition=_position;
				}
				_position=_position_animation_state;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_animation_state.add(_position_animation_state,_token);
		}
		_token=_token_animation_state;
		if(_state==FAILED) {
			support_names.reject(_position_animation_state);
			association_names.reject(_position_animation_state);
			room_names.reject(_position_animation_state);
			activity_names.reject(_position_animation_state);
			siding_names.reject(_position_animation_state);
			item_names.reject(_position_animation_state);
			aspect_names.reject(_position_animation_state);
			affinity_names.reject(_position_animation_state);
			activity_type_names.reject(_position_animation_state);
			trail_names.reject(_position_animation_state);
			attack_names.reject(_position_animation_state);
			reason_names.reject(_position_animation_state);
			trait_names.reject(_position_animation_state);
			condition_names.reject(_position_animation_state);
			payment_short_type_names.reject(_position_animation_state);
			skill_names.reject(_position_animation_state);
			map_names.reject(_position_animation_state);
			event_names.reject(_position_animation_state);
			image_names.reject(_position_animation_state);
			tile_symbols.reject(_position_animation_state);
			payment_long_type_names.reject(_position_animation_state);
			area_names.reject(_position_animation_state);
			structure_names.reject(_position_animation_state);
			tile_names.reject(_position_animation_state);
			hero_stat.reject(_position_animation_state);
			_state=SUCCESS;
			_position_animation_state=_position;
			_token_animation_state=_token;
			_token=new Tokens.Rule.AnimationStateToken();
			int _state_234 = _state;
			while(_position<_inputLength) {
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
					break;
				}
			}
			if(_state_234==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_state(animation_state)");
					_furthestPosition=_position;
				}
				_position=_position_animation_state;
			}
			else {
				parse__anonymous_215();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_state(animation_state)");
						_furthestPosition=_position;
					}
					_position=_position_animation_state;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_animation_state.add(_position_animation_state,_token);
			}
			_token=_token_animation_state;
			if(_state==FAILED) {
				support_names.reject(_position_animation_state);
				association_names.reject(_position_animation_state);
				room_names.reject(_position_animation_state);
				activity_names.reject(_position_animation_state);
				siding_names.reject(_position_animation_state);
				item_names.reject(_position_animation_state);
				aspect_names.reject(_position_animation_state);
				affinity_names.reject(_position_animation_state);
				activity_type_names.reject(_position_animation_state);
				trail_names.reject(_position_animation_state);
				attack_names.reject(_position_animation_state);
				reason_names.reject(_position_animation_state);
				trait_names.reject(_position_animation_state);
				condition_names.reject(_position_animation_state);
				payment_short_type_names.reject(_position_animation_state);
				skill_names.reject(_position_animation_state);
				map_names.reject(_position_animation_state);
				event_names.reject(_position_animation_state);
				image_names.reject(_position_animation_state);
				tile_symbols.reject(_position_animation_state);
				payment_long_type_names.reject(_position_animation_state);
				area_names.reject(_position_animation_state);
				structure_names.reject(_position_animation_state);
				tile_names.reject(_position_animation_state);
				hero_stat.reject(_position_animation_state);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_state);
				association_names.accept(_position_animation_state);
				room_names.accept(_position_animation_state);
				activity_names.accept(_position_animation_state);
				siding_names.accept(_position_animation_state);
				item_names.accept(_position_animation_state);
				aspect_names.accept(_position_animation_state);
				affinity_names.accept(_position_animation_state);
				activity_type_names.accept(_position_animation_state);
				trail_names.accept(_position_animation_state);
				attack_names.accept(_position_animation_state);
				reason_names.accept(_position_animation_state);
				trait_names.accept(_position_animation_state);
				condition_names.accept(_position_animation_state);
				payment_short_type_names.accept(_position_animation_state);
				skill_names.accept(_position_animation_state);
				map_names.accept(_position_animation_state);
				event_names.accept(_position_animation_state);
				image_names.accept(_position_animation_state);
				tile_symbols.accept(_position_animation_state);
				payment_long_type_names.accept(_position_animation_state);
				area_names.accept(_position_animation_state);
				structure_names.accept(_position_animation_state);
				tile_names.accept(_position_animation_state);
				hero_stat.accept(_position_animation_state);
			}
		}
	}
	public void parse_animation_type_arithmetic_operator() {
		int _position_animation_type_arithmetic_operator = -1;
		Token.Parsed _token_animation_type_arithmetic_operator = null;
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
		_position_animation_type_arithmetic_operator=_position;
		_token_animation_type_arithmetic_operator=_token;
		_token=new Tokens.Rule.AnimationTypeArithmeticOperatorToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='+') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_14.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain +");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_arithmetic_operator(animation_type_arithmetic_operator)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_arithmetic_operator;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_type_arithmetic_operator.add(_position_animation_type_arithmetic_operator,_token);
		}
		_token=_token_animation_type_arithmetic_operator;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_arithmetic_operator);
			association_names.reject(_position_animation_type_arithmetic_operator);
			room_names.reject(_position_animation_type_arithmetic_operator);
			activity_names.reject(_position_animation_type_arithmetic_operator);
			siding_names.reject(_position_animation_type_arithmetic_operator);
			item_names.reject(_position_animation_type_arithmetic_operator);
			aspect_names.reject(_position_animation_type_arithmetic_operator);
			affinity_names.reject(_position_animation_type_arithmetic_operator);
			activity_type_names.reject(_position_animation_type_arithmetic_operator);
			trail_names.reject(_position_animation_type_arithmetic_operator);
			attack_names.reject(_position_animation_type_arithmetic_operator);
			reason_names.reject(_position_animation_type_arithmetic_operator);
			trait_names.reject(_position_animation_type_arithmetic_operator);
			condition_names.reject(_position_animation_type_arithmetic_operator);
			payment_short_type_names.reject(_position_animation_type_arithmetic_operator);
			skill_names.reject(_position_animation_type_arithmetic_operator);
			map_names.reject(_position_animation_type_arithmetic_operator);
			event_names.reject(_position_animation_type_arithmetic_operator);
			image_names.reject(_position_animation_type_arithmetic_operator);
			tile_symbols.reject(_position_animation_type_arithmetic_operator);
			payment_long_type_names.reject(_position_animation_type_arithmetic_operator);
			area_names.reject(_position_animation_type_arithmetic_operator);
			structure_names.reject(_position_animation_type_arithmetic_operator);
			tile_names.reject(_position_animation_type_arithmetic_operator);
			hero_stat.reject(_position_animation_type_arithmetic_operator);
			_state=SUCCESS;
			_position_animation_type_arithmetic_operator=_position;
			_token_animation_type_arithmetic_operator=_token;
			_token=new Tokens.Rule.AnimationTypeArithmeticOperatorToken();
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='-') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_15.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain -");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_arithmetic_operator(animation_type_arithmetic_operator)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_arithmetic_operator;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_type_arithmetic_operator.add(_position_animation_type_arithmetic_operator,_token);
			}
			_token=_token_animation_type_arithmetic_operator;
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_arithmetic_operator);
				association_names.reject(_position_animation_type_arithmetic_operator);
				room_names.reject(_position_animation_type_arithmetic_operator);
				activity_names.reject(_position_animation_type_arithmetic_operator);
				siding_names.reject(_position_animation_type_arithmetic_operator);
				item_names.reject(_position_animation_type_arithmetic_operator);
				aspect_names.reject(_position_animation_type_arithmetic_operator);
				affinity_names.reject(_position_animation_type_arithmetic_operator);
				activity_type_names.reject(_position_animation_type_arithmetic_operator);
				trail_names.reject(_position_animation_type_arithmetic_operator);
				attack_names.reject(_position_animation_type_arithmetic_operator);
				reason_names.reject(_position_animation_type_arithmetic_operator);
				trait_names.reject(_position_animation_type_arithmetic_operator);
				condition_names.reject(_position_animation_type_arithmetic_operator);
				payment_short_type_names.reject(_position_animation_type_arithmetic_operator);
				skill_names.reject(_position_animation_type_arithmetic_operator);
				map_names.reject(_position_animation_type_arithmetic_operator);
				event_names.reject(_position_animation_type_arithmetic_operator);
				image_names.reject(_position_animation_type_arithmetic_operator);
				tile_symbols.reject(_position_animation_type_arithmetic_operator);
				payment_long_type_names.reject(_position_animation_type_arithmetic_operator);
				area_names.reject(_position_animation_type_arithmetic_operator);
				structure_names.reject(_position_animation_type_arithmetic_operator);
				tile_names.reject(_position_animation_type_arithmetic_operator);
				hero_stat.reject(_position_animation_type_arithmetic_operator);
				_state=SUCCESS;
				_position_animation_type_arithmetic_operator=_position;
				_token_animation_type_arithmetic_operator=_token;
				_token=new Tokens.Rule.AnimationTypeArithmeticOperatorToken();
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='/') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_53.SYNTAX);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain /");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_arithmetic_operator(animation_type_arithmetic_operator)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_arithmetic_operator;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_animation_type_arithmetic_operator.add(_position_animation_type_arithmetic_operator,_token);
				}
				_token=_token_animation_type_arithmetic_operator;
				if(_state==FAILED) {
					support_names.reject(_position_animation_type_arithmetic_operator);
					association_names.reject(_position_animation_type_arithmetic_operator);
					room_names.reject(_position_animation_type_arithmetic_operator);
					activity_names.reject(_position_animation_type_arithmetic_operator);
					siding_names.reject(_position_animation_type_arithmetic_operator);
					item_names.reject(_position_animation_type_arithmetic_operator);
					aspect_names.reject(_position_animation_type_arithmetic_operator);
					affinity_names.reject(_position_animation_type_arithmetic_operator);
					activity_type_names.reject(_position_animation_type_arithmetic_operator);
					trail_names.reject(_position_animation_type_arithmetic_operator);
					attack_names.reject(_position_animation_type_arithmetic_operator);
					reason_names.reject(_position_animation_type_arithmetic_operator);
					trait_names.reject(_position_animation_type_arithmetic_operator);
					condition_names.reject(_position_animation_type_arithmetic_operator);
					payment_short_type_names.reject(_position_animation_type_arithmetic_operator);
					skill_names.reject(_position_animation_type_arithmetic_operator);
					map_names.reject(_position_animation_type_arithmetic_operator);
					event_names.reject(_position_animation_type_arithmetic_operator);
					image_names.reject(_position_animation_type_arithmetic_operator);
					tile_symbols.reject(_position_animation_type_arithmetic_operator);
					payment_long_type_names.reject(_position_animation_type_arithmetic_operator);
					area_names.reject(_position_animation_type_arithmetic_operator);
					structure_names.reject(_position_animation_type_arithmetic_operator);
					tile_names.reject(_position_animation_type_arithmetic_operator);
					hero_stat.reject(_position_animation_type_arithmetic_operator);
					_state=SUCCESS;
					_position_animation_type_arithmetic_operator=_position;
					_token_animation_type_arithmetic_operator=_token;
					_token=new Tokens.Rule.AnimationTypeArithmeticOperatorToken();
					if(_position+1-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='*') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_19.SYNTAX);
						_position=_position+1;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain *");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_arithmetic_operator(animation_type_arithmetic_operator)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_arithmetic_operator;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_animation_type_arithmetic_operator.add(_position_animation_type_arithmetic_operator,_token);
					}
					_token=_token_animation_type_arithmetic_operator;
					if(_state==FAILED) {
						support_names.reject(_position_animation_type_arithmetic_operator);
						association_names.reject(_position_animation_type_arithmetic_operator);
						room_names.reject(_position_animation_type_arithmetic_operator);
						activity_names.reject(_position_animation_type_arithmetic_operator);
						siding_names.reject(_position_animation_type_arithmetic_operator);
						item_names.reject(_position_animation_type_arithmetic_operator);
						aspect_names.reject(_position_animation_type_arithmetic_operator);
						affinity_names.reject(_position_animation_type_arithmetic_operator);
						activity_type_names.reject(_position_animation_type_arithmetic_operator);
						trail_names.reject(_position_animation_type_arithmetic_operator);
						attack_names.reject(_position_animation_type_arithmetic_operator);
						reason_names.reject(_position_animation_type_arithmetic_operator);
						trait_names.reject(_position_animation_type_arithmetic_operator);
						condition_names.reject(_position_animation_type_arithmetic_operator);
						payment_short_type_names.reject(_position_animation_type_arithmetic_operator);
						skill_names.reject(_position_animation_type_arithmetic_operator);
						map_names.reject(_position_animation_type_arithmetic_operator);
						event_names.reject(_position_animation_type_arithmetic_operator);
						image_names.reject(_position_animation_type_arithmetic_operator);
						tile_symbols.reject(_position_animation_type_arithmetic_operator);
						payment_long_type_names.reject(_position_animation_type_arithmetic_operator);
						area_names.reject(_position_animation_type_arithmetic_operator);
						structure_names.reject(_position_animation_type_arithmetic_operator);
						tile_names.reject(_position_animation_type_arithmetic_operator);
						hero_stat.reject(_position_animation_type_arithmetic_operator);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_animation_type_arithmetic_operator);
						association_names.accept(_position_animation_type_arithmetic_operator);
						room_names.accept(_position_animation_type_arithmetic_operator);
						activity_names.accept(_position_animation_type_arithmetic_operator);
						siding_names.accept(_position_animation_type_arithmetic_operator);
						item_names.accept(_position_animation_type_arithmetic_operator);
						aspect_names.accept(_position_animation_type_arithmetic_operator);
						affinity_names.accept(_position_animation_type_arithmetic_operator);
						activity_type_names.accept(_position_animation_type_arithmetic_operator);
						trail_names.accept(_position_animation_type_arithmetic_operator);
						attack_names.accept(_position_animation_type_arithmetic_operator);
						reason_names.accept(_position_animation_type_arithmetic_operator);
						trait_names.accept(_position_animation_type_arithmetic_operator);
						condition_names.accept(_position_animation_type_arithmetic_operator);
						payment_short_type_names.accept(_position_animation_type_arithmetic_operator);
						skill_names.accept(_position_animation_type_arithmetic_operator);
						map_names.accept(_position_animation_type_arithmetic_operator);
						event_names.accept(_position_animation_type_arithmetic_operator);
						image_names.accept(_position_animation_type_arithmetic_operator);
						tile_symbols.accept(_position_animation_type_arithmetic_operator);
						payment_long_type_names.accept(_position_animation_type_arithmetic_operator);
						area_names.accept(_position_animation_type_arithmetic_operator);
						structure_names.accept(_position_animation_type_arithmetic_operator);
						tile_names.accept(_position_animation_type_arithmetic_operator);
						hero_stat.accept(_position_animation_type_arithmetic_operator);
					}
				}
			}
		}
	}
	public void parse_animation_type_element() {
		int _position_animation_type_element = -1;
		Token.Parsed _token_animation_type_element = null;
		int _position_comments = -1;
		int _position_animation_type_declaration = -1;
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
		_position_animation_type_element=_position;
		_token_animation_type_element=_token;
		_token=new Tokens.Rule.AnimationTypeElementToken();
		_position_comments=_position;
		if(_state==SUCCESS&&!_recursion_protection_comments_39.contains(_position)) {
			_recursion_protection_comments_39.add(_position);
			parse_comments();
			_recursion_protection_comments_39.remove(_position_comments);
		}
		else {
			_state=FAILED;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_element(animation_type_element)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_type_element.add(_position_animation_type_element,_token);
		}
		_token=_token_animation_type_element;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_element);
			association_names.reject(_position_animation_type_element);
			room_names.reject(_position_animation_type_element);
			activity_names.reject(_position_animation_type_element);
			siding_names.reject(_position_animation_type_element);
			item_names.reject(_position_animation_type_element);
			aspect_names.reject(_position_animation_type_element);
			affinity_names.reject(_position_animation_type_element);
			activity_type_names.reject(_position_animation_type_element);
			trail_names.reject(_position_animation_type_element);
			attack_names.reject(_position_animation_type_element);
			reason_names.reject(_position_animation_type_element);
			trait_names.reject(_position_animation_type_element);
			condition_names.reject(_position_animation_type_element);
			payment_short_type_names.reject(_position_animation_type_element);
			skill_names.reject(_position_animation_type_element);
			map_names.reject(_position_animation_type_element);
			event_names.reject(_position_animation_type_element);
			image_names.reject(_position_animation_type_element);
			tile_symbols.reject(_position_animation_type_element);
			payment_long_type_names.reject(_position_animation_type_element);
			area_names.reject(_position_animation_type_element);
			structure_names.reject(_position_animation_type_element);
			tile_names.reject(_position_animation_type_element);
			hero_stat.reject(_position_animation_type_element);
			_state=SUCCESS;
			_position_animation_type_element=_position;
			_token_animation_type_element=_token;
			_token=new Tokens.Rule.AnimationTypeElementToken();
			parse__anonymous_204();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_element(animation_type_element)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_type_element.add(_position_animation_type_element,_token);
			}
			_token=_token_animation_type_element;
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_element);
				association_names.reject(_position_animation_type_element);
				room_names.reject(_position_animation_type_element);
				activity_names.reject(_position_animation_type_element);
				siding_names.reject(_position_animation_type_element);
				item_names.reject(_position_animation_type_element);
				aspect_names.reject(_position_animation_type_element);
				affinity_names.reject(_position_animation_type_element);
				activity_type_names.reject(_position_animation_type_element);
				trail_names.reject(_position_animation_type_element);
				attack_names.reject(_position_animation_type_element);
				reason_names.reject(_position_animation_type_element);
				trait_names.reject(_position_animation_type_element);
				condition_names.reject(_position_animation_type_element);
				payment_short_type_names.reject(_position_animation_type_element);
				skill_names.reject(_position_animation_type_element);
				map_names.reject(_position_animation_type_element);
				event_names.reject(_position_animation_type_element);
				image_names.reject(_position_animation_type_element);
				tile_symbols.reject(_position_animation_type_element);
				payment_long_type_names.reject(_position_animation_type_element);
				area_names.reject(_position_animation_type_element);
				structure_names.reject(_position_animation_type_element);
				tile_names.reject(_position_animation_type_element);
				hero_stat.reject(_position_animation_type_element);
				_state=SUCCESS;
				_position_animation_type_element=_position;
				_token_animation_type_element=_token;
				_token=new Tokens.Rule.AnimationTypeElementToken();
				_position_animation_type_declaration=_position;
				if(_state==SUCCESS&&!_recursion_protection_animation_type_declaration_41.contains(_position)) {
					_recursion_protection_animation_type_declaration_41.add(_position);
					parse_animation_type_declaration();
					_recursion_protection_animation_type_declaration_41.remove(_position_animation_type_declaration);
				}
				else {
					_state=FAILED;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_element(animation_type_element)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_animation_type_element.add(_position_animation_type_element,_token);
				}
				_token=_token_animation_type_element;
				if(_state==FAILED) {
					support_names.reject(_position_animation_type_element);
					association_names.reject(_position_animation_type_element);
					room_names.reject(_position_animation_type_element);
					activity_names.reject(_position_animation_type_element);
					siding_names.reject(_position_animation_type_element);
					item_names.reject(_position_animation_type_element);
					aspect_names.reject(_position_animation_type_element);
					affinity_names.reject(_position_animation_type_element);
					activity_type_names.reject(_position_animation_type_element);
					trail_names.reject(_position_animation_type_element);
					attack_names.reject(_position_animation_type_element);
					reason_names.reject(_position_animation_type_element);
					trait_names.reject(_position_animation_type_element);
					condition_names.reject(_position_animation_type_element);
					payment_short_type_names.reject(_position_animation_type_element);
					skill_names.reject(_position_animation_type_element);
					map_names.reject(_position_animation_type_element);
					event_names.reject(_position_animation_type_element);
					image_names.reject(_position_animation_type_element);
					tile_symbols.reject(_position_animation_type_element);
					payment_long_type_names.reject(_position_animation_type_element);
					area_names.reject(_position_animation_type_element);
					structure_names.reject(_position_animation_type_element);
					tile_names.reject(_position_animation_type_element);
					hero_stat.reject(_position_animation_type_element);
					_state=SUCCESS;
					_position_animation_type_element=_position;
					_token_animation_type_element=_token;
					_token=new Tokens.Rule.AnimationTypeElementToken();
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_element(animation_type_element)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_animation_type_element.add(_position_animation_type_element,_token);
					}
					_token=_token_animation_type_element;
					if(_state==FAILED) {
						support_names.reject(_position_animation_type_element);
						association_names.reject(_position_animation_type_element);
						room_names.reject(_position_animation_type_element);
						activity_names.reject(_position_animation_type_element);
						siding_names.reject(_position_animation_type_element);
						item_names.reject(_position_animation_type_element);
						aspect_names.reject(_position_animation_type_element);
						affinity_names.reject(_position_animation_type_element);
						activity_type_names.reject(_position_animation_type_element);
						trail_names.reject(_position_animation_type_element);
						attack_names.reject(_position_animation_type_element);
						reason_names.reject(_position_animation_type_element);
						trait_names.reject(_position_animation_type_element);
						condition_names.reject(_position_animation_type_element);
						payment_short_type_names.reject(_position_animation_type_element);
						skill_names.reject(_position_animation_type_element);
						map_names.reject(_position_animation_type_element);
						event_names.reject(_position_animation_type_element);
						image_names.reject(_position_animation_type_element);
						tile_symbols.reject(_position_animation_type_element);
						payment_long_type_names.reject(_position_animation_type_element);
						area_names.reject(_position_animation_type_element);
						structure_names.reject(_position_animation_type_element);
						tile_names.reject(_position_animation_type_element);
						hero_stat.reject(_position_animation_type_element);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_animation_type_element);
						association_names.accept(_position_animation_type_element);
						room_names.accept(_position_animation_type_element);
						activity_names.accept(_position_animation_type_element);
						siding_names.accept(_position_animation_type_element);
						item_names.accept(_position_animation_type_element);
						aspect_names.accept(_position_animation_type_element);
						affinity_names.accept(_position_animation_type_element);
						activity_type_names.accept(_position_animation_type_element);
						trail_names.accept(_position_animation_type_element);
						attack_names.accept(_position_animation_type_element);
						reason_names.accept(_position_animation_type_element);
						trait_names.accept(_position_animation_type_element);
						condition_names.accept(_position_animation_type_element);
						payment_short_type_names.accept(_position_animation_type_element);
						skill_names.accept(_position_animation_type_element);
						map_names.accept(_position_animation_type_element);
						event_names.accept(_position_animation_type_element);
						image_names.accept(_position_animation_type_element);
						tile_symbols.accept(_position_animation_type_element);
						payment_long_type_names.accept(_position_animation_type_element);
						area_names.accept(_position_animation_type_element);
						structure_names.accept(_position_animation_type_element);
						tile_names.accept(_position_animation_type_element);
						hero_stat.accept(_position_animation_type_element);
					}
				}
			}
		}
	}
	public void parse_animation_type_variable_declaration() {
		int _position_animation_type_variable_declaration = -1;
		Token.Parsed _token_animation_type_variable_declaration = null;
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
		_position_animation_type_variable_declaration=_position;
		_token_animation_type_variable_declaration=_token;
		_token=new Tokens.Rule.AnimationTypeVariableDeclarationToken();
		_token_NAME=_token;
		_token=new Tokens.Name.TypeNameToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_45.contains(_position)) {
			_recursion_protection_NAME_45.add(_position);
			parse_NAME();
			_recursion_protection_NAME_45.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token_NAME.add(_position_NAME,_token);
		}
		_token=_token_NAME;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_variable_declaration;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.VariableNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_variable_declaration;
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_variable_declaration;
				}
				else {
					parse_animation_variable_value();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_variable_declaration;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_animation_type_variable_declaration.add(_position_animation_type_variable_declaration,_token);
		}
		_token=_token_animation_type_variable_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_variable_declaration);
			association_names.reject(_position_animation_type_variable_declaration);
			room_names.reject(_position_animation_type_variable_declaration);
			activity_names.reject(_position_animation_type_variable_declaration);
			siding_names.reject(_position_animation_type_variable_declaration);
			item_names.reject(_position_animation_type_variable_declaration);
			aspect_names.reject(_position_animation_type_variable_declaration);
			affinity_names.reject(_position_animation_type_variable_declaration);
			activity_type_names.reject(_position_animation_type_variable_declaration);
			trail_names.reject(_position_animation_type_variable_declaration);
			attack_names.reject(_position_animation_type_variable_declaration);
			reason_names.reject(_position_animation_type_variable_declaration);
			trait_names.reject(_position_animation_type_variable_declaration);
			condition_names.reject(_position_animation_type_variable_declaration);
			payment_short_type_names.reject(_position_animation_type_variable_declaration);
			skill_names.reject(_position_animation_type_variable_declaration);
			map_names.reject(_position_animation_type_variable_declaration);
			event_names.reject(_position_animation_type_variable_declaration);
			image_names.reject(_position_animation_type_variable_declaration);
			tile_symbols.reject(_position_animation_type_variable_declaration);
			payment_long_type_names.reject(_position_animation_type_variable_declaration);
			area_names.reject(_position_animation_type_variable_declaration);
			structure_names.reject(_position_animation_type_variable_declaration);
			tile_names.reject(_position_animation_type_variable_declaration);
			hero_stat.reject(_position_animation_type_variable_declaration);
			_state=SUCCESS;
			_position_animation_type_variable_declaration=_position;
			_token_animation_type_variable_declaration=_token;
			_token=new Tokens.Rule.AnimationTypeVariableDeclarationToken();
			_token_NAME=_token;
			_token=new Tokens.Name.VariableNameToken();
			_position_NAME=_position;
			if(_state==SUCCESS&&!_recursion_protection_NAME_46.contains(_position)) {
				_recursion_protection_NAME_46.add(_position);
				parse_NAME();
				_recursion_protection_NAME_46.remove(_position_NAME);
			}
			else {
				_state=FAILED;
			}
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_variable_declaration;
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_variable_declaration;
				}
				else {
					parse_animation_variable_value();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variable_declaration(animation_type_variable_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_variable_declaration;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_animation_type_variable_declaration.add(_position_animation_type_variable_declaration,_token);
			}
			_token=_token_animation_type_variable_declaration;
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_variable_declaration);
				association_names.reject(_position_animation_type_variable_declaration);
				room_names.reject(_position_animation_type_variable_declaration);
				activity_names.reject(_position_animation_type_variable_declaration);
				siding_names.reject(_position_animation_type_variable_declaration);
				item_names.reject(_position_animation_type_variable_declaration);
				aspect_names.reject(_position_animation_type_variable_declaration);
				affinity_names.reject(_position_animation_type_variable_declaration);
				activity_type_names.reject(_position_animation_type_variable_declaration);
				trail_names.reject(_position_animation_type_variable_declaration);
				attack_names.reject(_position_animation_type_variable_declaration);
				reason_names.reject(_position_animation_type_variable_declaration);
				trait_names.reject(_position_animation_type_variable_declaration);
				condition_names.reject(_position_animation_type_variable_declaration);
				payment_short_type_names.reject(_position_animation_type_variable_declaration);
				skill_names.reject(_position_animation_type_variable_declaration);
				map_names.reject(_position_animation_type_variable_declaration);
				event_names.reject(_position_animation_type_variable_declaration);
				image_names.reject(_position_animation_type_variable_declaration);
				tile_symbols.reject(_position_animation_type_variable_declaration);
				payment_long_type_names.reject(_position_animation_type_variable_declaration);
				area_names.reject(_position_animation_type_variable_declaration);
				structure_names.reject(_position_animation_type_variable_declaration);
				tile_names.reject(_position_animation_type_variable_declaration);
				hero_stat.reject(_position_animation_type_variable_declaration);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_type_variable_declaration);
				association_names.accept(_position_animation_type_variable_declaration);
				room_names.accept(_position_animation_type_variable_declaration);
				activity_names.accept(_position_animation_type_variable_declaration);
				siding_names.accept(_position_animation_type_variable_declaration);
				item_names.accept(_position_animation_type_variable_declaration);
				aspect_names.accept(_position_animation_type_variable_declaration);
				affinity_names.accept(_position_animation_type_variable_declaration);
				activity_type_names.accept(_position_animation_type_variable_declaration);
				trail_names.accept(_position_animation_type_variable_declaration);
				attack_names.accept(_position_animation_type_variable_declaration);
				reason_names.accept(_position_animation_type_variable_declaration);
				trait_names.accept(_position_animation_type_variable_declaration);
				condition_names.accept(_position_animation_type_variable_declaration);
				payment_short_type_names.accept(_position_animation_type_variable_declaration);
				skill_names.accept(_position_animation_type_variable_declaration);
				map_names.accept(_position_animation_type_variable_declaration);
				event_names.accept(_position_animation_type_variable_declaration);
				image_names.accept(_position_animation_type_variable_declaration);
				tile_symbols.accept(_position_animation_type_variable_declaration);
				payment_long_type_names.accept(_position_animation_type_variable_declaration);
				area_names.accept(_position_animation_type_variable_declaration);
				structure_names.accept(_position_animation_type_variable_declaration);
				tile_names.accept(_position_animation_type_variable_declaration);
				hero_stat.accept(_position_animation_type_variable_declaration);
			}
		}
	}
	public void parse_animation_type_variables() {
		int _position_animation_type_variables = -1;
		Token.Parsed _token_animation_type_variables = null;
		int _length_animation_type_variables_brace = _inputLength;
		if(brace_5.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_5.get(_position);
			int _position_animation_type_variables_brace = _position;
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
			_position_animation_type_variables=_position;
			_token_animation_type_variables=_token;
			_token=new Tokens.Rule.AnimationTypeVariablesToken();
			int _state_225 = _state;
			parse_animation_type_variable_declaration();
			if(_state_225==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variables(animation_type_variables)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_variables;
			}
			else {
				int _state_226 = _state;
				while(_position<_inputLength) {
					parse__anonymous_209();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_226==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variables(animation_type_variables)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_variables;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_animation_type_variables.addAll(_token);
				_token_animation_type_variables.setValue(_token.getValue());
			}
			_token=_token_animation_type_variables;
			if(_state==SUCCESS&&brace_5.get(_position_animation_type_variables_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("animation_type_variables",_position,_lineNumberRanges));
				_position=brace_5.get(_position_animation_type_variables_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_animation_type_variables_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_variables);
				association_names.reject(_position_animation_type_variables);
				room_names.reject(_position_animation_type_variables);
				activity_names.reject(_position_animation_type_variables);
				siding_names.reject(_position_animation_type_variables);
				item_names.reject(_position_animation_type_variables);
				aspect_names.reject(_position_animation_type_variables);
				affinity_names.reject(_position_animation_type_variables);
				activity_type_names.reject(_position_animation_type_variables);
				trail_names.reject(_position_animation_type_variables);
				attack_names.reject(_position_animation_type_variables);
				reason_names.reject(_position_animation_type_variables);
				trait_names.reject(_position_animation_type_variables);
				condition_names.reject(_position_animation_type_variables);
				payment_short_type_names.reject(_position_animation_type_variables);
				skill_names.reject(_position_animation_type_variables);
				map_names.reject(_position_animation_type_variables);
				event_names.reject(_position_animation_type_variables);
				image_names.reject(_position_animation_type_variables);
				tile_symbols.reject(_position_animation_type_variables);
				payment_long_type_names.reject(_position_animation_type_variables);
				area_names.reject(_position_animation_type_variables);
				structure_names.reject(_position_animation_type_variables);
				tile_names.reject(_position_animation_type_variables);
				hero_stat.reject(_position_animation_type_variables);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_type_variables);
				association_names.accept(_position_animation_type_variables);
				room_names.accept(_position_animation_type_variables);
				activity_names.accept(_position_animation_type_variables);
				siding_names.accept(_position_animation_type_variables);
				item_names.accept(_position_animation_type_variables);
				aspect_names.accept(_position_animation_type_variables);
				affinity_names.accept(_position_animation_type_variables);
				activity_type_names.accept(_position_animation_type_variables);
				trail_names.accept(_position_animation_type_variables);
				attack_names.accept(_position_animation_type_variables);
				reason_names.accept(_position_animation_type_variables);
				trait_names.accept(_position_animation_type_variables);
				condition_names.accept(_position_animation_type_variables);
				payment_short_type_names.accept(_position_animation_type_variables);
				skill_names.accept(_position_animation_type_variables);
				map_names.accept(_position_animation_type_variables);
				event_names.accept(_position_animation_type_variables);
				image_names.accept(_position_animation_type_variables);
				tile_symbols.accept(_position_animation_type_variables);
				payment_long_type_names.accept(_position_animation_type_variables);
				area_names.accept(_position_animation_type_variables);
				structure_names.accept(_position_animation_type_variables);
				tile_names.accept(_position_animation_type_variables);
				hero_stat.accept(_position_animation_type_variables);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_variables(animation_type_variables)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_animation_variable_value_range() {
		int _position_animation_variable_value_range = -1;
		Token.Parsed _token_animation_variable_value_range = null;
		int _position_INTEGER = -1;
		Token.Parsed _token_INTEGER = null;
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
		_position_animation_variable_value_range=_position;
		_token_animation_variable_value_range=_token;
		_token=new Tokens.Rule.AnimationVariableValueRangeToken();
		_token_INTEGER=_token;
		_token=new Tokens.Name.LowerBoundToken();
		_position_INTEGER=_position;
		parse_INTEGER();
		if(_state==SUCCESS) {
			_token_INTEGER.add(_position_INTEGER,_token);
		}
		_token=_token_INTEGER;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_range(animation_variable_value_range)");
				_furthestPosition=_position;
			}
			_position=_position_animation_variable_value_range;
		}
		else {
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='-') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_15.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain -");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_range(animation_variable_value_range)");
					_furthestPosition=_position;
				}
				_position=_position_animation_variable_value_range;
			}
			else {
				_token_INTEGER=_token;
				_token=new Tokens.Name.UpperBoundToken();
				_position_INTEGER=_position;
				parse_INTEGER();
				if(_state==SUCCESS) {
					_token_INTEGER.add(_position_INTEGER,_token);
				}
				_token=_token_INTEGER;
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value_range(animation_variable_value_range)");
						_furthestPosition=_position;
					}
					_position=_position_animation_variable_value_range;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_animation_variable_value_range.addAll(_token);
			_token_animation_variable_value_range.setValue(_token.getValue());
		}
		_token=_token_animation_variable_value_range;
		if(_state==FAILED) {
			support_names.reject(_position_animation_variable_value_range);
			association_names.reject(_position_animation_variable_value_range);
			room_names.reject(_position_animation_variable_value_range);
			activity_names.reject(_position_animation_variable_value_range);
			siding_names.reject(_position_animation_variable_value_range);
			item_names.reject(_position_animation_variable_value_range);
			aspect_names.reject(_position_animation_variable_value_range);
			affinity_names.reject(_position_animation_variable_value_range);
			activity_type_names.reject(_position_animation_variable_value_range);
			trail_names.reject(_position_animation_variable_value_range);
			attack_names.reject(_position_animation_variable_value_range);
			reason_names.reject(_position_animation_variable_value_range);
			trait_names.reject(_position_animation_variable_value_range);
			condition_names.reject(_position_animation_variable_value_range);
			payment_short_type_names.reject(_position_animation_variable_value_range);
			skill_names.reject(_position_animation_variable_value_range);
			map_names.reject(_position_animation_variable_value_range);
			event_names.reject(_position_animation_variable_value_range);
			image_names.reject(_position_animation_variable_value_range);
			tile_symbols.reject(_position_animation_variable_value_range);
			payment_long_type_names.reject(_position_animation_variable_value_range);
			area_names.reject(_position_animation_variable_value_range);
			structure_names.reject(_position_animation_variable_value_range);
			tile_names.reject(_position_animation_variable_value_range);
			hero_stat.reject(_position_animation_variable_value_range);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_animation_variable_value_range);
			association_names.accept(_position_animation_variable_value_range);
			room_names.accept(_position_animation_variable_value_range);
			activity_names.accept(_position_animation_variable_value_range);
			siding_names.accept(_position_animation_variable_value_range);
			item_names.accept(_position_animation_variable_value_range);
			aspect_names.accept(_position_animation_variable_value_range);
			affinity_names.accept(_position_animation_variable_value_range);
			activity_type_names.accept(_position_animation_variable_value_range);
			trail_names.accept(_position_animation_variable_value_range);
			attack_names.accept(_position_animation_variable_value_range);
			reason_names.accept(_position_animation_variable_value_range);
			trait_names.accept(_position_animation_variable_value_range);
			condition_names.accept(_position_animation_variable_value_range);
			payment_short_type_names.accept(_position_animation_variable_value_range);
			skill_names.accept(_position_animation_variable_value_range);
			map_names.accept(_position_animation_variable_value_range);
			event_names.accept(_position_animation_variable_value_range);
			image_names.accept(_position_animation_variable_value_range);
			tile_symbols.accept(_position_animation_variable_value_range);
			payment_long_type_names.accept(_position_animation_variable_value_range);
			area_names.accept(_position_animation_variable_value_range);
			structure_names.accept(_position_animation_variable_value_range);
			tile_names.accept(_position_animation_variable_value_range);
			hero_stat.accept(_position_animation_variable_value_range);
		}
	}
	public void parse_animation_type_value() {
		int _position_animation_type_value = -1;
		Token.Parsed _token_animation_type_value = null;
		int _position_FLOAT = -1;
		int _position_INTEGER = -1;
		int _position_NAME = -1;
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
		_position_animation_type_value=_position;
		_token_animation_type_value=_token;
		_token=new Tokens.Rule.AnimationTypeValueToken();
		_position_INTEGER=_position;
		if(_state==SUCCESS&&!_recursion_protection_INTEGER_42.contains(_position)) {
			_recursion_protection_INTEGER_42.add(_position);
			parse_INTEGER();
			_recursion_protection_INTEGER_42.remove(_position_INTEGER);
		}
		else {
			_state=FAILED;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_value(animation_type_value)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_value;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_type_value.add(_position_animation_type_value,_token);
		}
		_token=_token_animation_type_value;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_value);
			association_names.reject(_position_animation_type_value);
			room_names.reject(_position_animation_type_value);
			activity_names.reject(_position_animation_type_value);
			siding_names.reject(_position_animation_type_value);
			item_names.reject(_position_animation_type_value);
			aspect_names.reject(_position_animation_type_value);
			affinity_names.reject(_position_animation_type_value);
			activity_type_names.reject(_position_animation_type_value);
			trail_names.reject(_position_animation_type_value);
			attack_names.reject(_position_animation_type_value);
			reason_names.reject(_position_animation_type_value);
			trait_names.reject(_position_animation_type_value);
			condition_names.reject(_position_animation_type_value);
			payment_short_type_names.reject(_position_animation_type_value);
			skill_names.reject(_position_animation_type_value);
			map_names.reject(_position_animation_type_value);
			event_names.reject(_position_animation_type_value);
			image_names.reject(_position_animation_type_value);
			tile_symbols.reject(_position_animation_type_value);
			payment_long_type_names.reject(_position_animation_type_value);
			area_names.reject(_position_animation_type_value);
			structure_names.reject(_position_animation_type_value);
			tile_names.reject(_position_animation_type_value);
			hero_stat.reject(_position_animation_type_value);
			_state=SUCCESS;
			_position_animation_type_value=_position;
			_token_animation_type_value=_token;
			_token=new Tokens.Rule.AnimationTypeValueToken();
			_position_FLOAT=_position;
			if(_state==SUCCESS&&!_recursion_protection_FLOAT_43.contains(_position)) {
				_recursion_protection_FLOAT_43.add(_position);
				parse_FLOAT();
				_recursion_protection_FLOAT_43.remove(_position_FLOAT);
			}
			else {
				_state=FAILED;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_value(animation_type_value)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_value;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_type_value.add(_position_animation_type_value,_token);
			}
			_token=_token_animation_type_value;
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_value);
				association_names.reject(_position_animation_type_value);
				room_names.reject(_position_animation_type_value);
				activity_names.reject(_position_animation_type_value);
				siding_names.reject(_position_animation_type_value);
				item_names.reject(_position_animation_type_value);
				aspect_names.reject(_position_animation_type_value);
				affinity_names.reject(_position_animation_type_value);
				activity_type_names.reject(_position_animation_type_value);
				trail_names.reject(_position_animation_type_value);
				attack_names.reject(_position_animation_type_value);
				reason_names.reject(_position_animation_type_value);
				trait_names.reject(_position_animation_type_value);
				condition_names.reject(_position_animation_type_value);
				payment_short_type_names.reject(_position_animation_type_value);
				skill_names.reject(_position_animation_type_value);
				map_names.reject(_position_animation_type_value);
				event_names.reject(_position_animation_type_value);
				image_names.reject(_position_animation_type_value);
				tile_symbols.reject(_position_animation_type_value);
				payment_long_type_names.reject(_position_animation_type_value);
				area_names.reject(_position_animation_type_value);
				structure_names.reject(_position_animation_type_value);
				tile_names.reject(_position_animation_type_value);
				hero_stat.reject(_position_animation_type_value);
				_state=SUCCESS;
				_position_animation_type_value=_position;
				_token_animation_type_value=_token;
				_token=new Tokens.Rule.AnimationTypeValueToken();
				_position_NAME=_position;
				if(_state==SUCCESS&&!_recursion_protection_NAME_44.contains(_position)) {
					_recursion_protection_NAME_44.add(_position);
					parse_NAME();
					_recursion_protection_NAME_44.remove(_position_NAME);
				}
				else {
					_state=FAILED;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_value(animation_type_value)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_value;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_animation_type_value.add(_position_animation_type_value,_token);
				}
				_token=_token_animation_type_value;
				if(_state==FAILED) {
					support_names.reject(_position_animation_type_value);
					association_names.reject(_position_animation_type_value);
					room_names.reject(_position_animation_type_value);
					activity_names.reject(_position_animation_type_value);
					siding_names.reject(_position_animation_type_value);
					item_names.reject(_position_animation_type_value);
					aspect_names.reject(_position_animation_type_value);
					affinity_names.reject(_position_animation_type_value);
					activity_type_names.reject(_position_animation_type_value);
					trail_names.reject(_position_animation_type_value);
					attack_names.reject(_position_animation_type_value);
					reason_names.reject(_position_animation_type_value);
					trait_names.reject(_position_animation_type_value);
					condition_names.reject(_position_animation_type_value);
					payment_short_type_names.reject(_position_animation_type_value);
					skill_names.reject(_position_animation_type_value);
					map_names.reject(_position_animation_type_value);
					event_names.reject(_position_animation_type_value);
					image_names.reject(_position_animation_type_value);
					tile_symbols.reject(_position_animation_type_value);
					payment_long_type_names.reject(_position_animation_type_value);
					area_names.reject(_position_animation_type_value);
					structure_names.reject(_position_animation_type_value);
					tile_names.reject(_position_animation_type_value);
					hero_stat.reject(_position_animation_type_value);
					_state=SUCCESS;
					_position_animation_type_value=_position;
					_token_animation_type_value=_token;
					_token=new Tokens.Rule.AnimationTypeValueToken();
					parse_animation_frame_data();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_value(animation_type_value)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_value;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_animation_type_value.add(_position_animation_type_value,_token);
					}
					_token=_token_animation_type_value;
					if(_state==FAILED) {
						support_names.reject(_position_animation_type_value);
						association_names.reject(_position_animation_type_value);
						room_names.reject(_position_animation_type_value);
						activity_names.reject(_position_animation_type_value);
						siding_names.reject(_position_animation_type_value);
						item_names.reject(_position_animation_type_value);
						aspect_names.reject(_position_animation_type_value);
						affinity_names.reject(_position_animation_type_value);
						activity_type_names.reject(_position_animation_type_value);
						trail_names.reject(_position_animation_type_value);
						attack_names.reject(_position_animation_type_value);
						reason_names.reject(_position_animation_type_value);
						trait_names.reject(_position_animation_type_value);
						condition_names.reject(_position_animation_type_value);
						payment_short_type_names.reject(_position_animation_type_value);
						skill_names.reject(_position_animation_type_value);
						map_names.reject(_position_animation_type_value);
						event_names.reject(_position_animation_type_value);
						image_names.reject(_position_animation_type_value);
						tile_symbols.reject(_position_animation_type_value);
						payment_long_type_names.reject(_position_animation_type_value);
						area_names.reject(_position_animation_type_value);
						structure_names.reject(_position_animation_type_value);
						tile_names.reject(_position_animation_type_value);
						hero_stat.reject(_position_animation_type_value);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_animation_type_value);
						association_names.accept(_position_animation_type_value);
						room_names.accept(_position_animation_type_value);
						activity_names.accept(_position_animation_type_value);
						siding_names.accept(_position_animation_type_value);
						item_names.accept(_position_animation_type_value);
						aspect_names.accept(_position_animation_type_value);
						affinity_names.accept(_position_animation_type_value);
						activity_type_names.accept(_position_animation_type_value);
						trail_names.accept(_position_animation_type_value);
						attack_names.accept(_position_animation_type_value);
						reason_names.accept(_position_animation_type_value);
						trait_names.accept(_position_animation_type_value);
						condition_names.accept(_position_animation_type_value);
						payment_short_type_names.accept(_position_animation_type_value);
						skill_names.accept(_position_animation_type_value);
						map_names.accept(_position_animation_type_value);
						event_names.accept(_position_animation_type_value);
						image_names.accept(_position_animation_type_value);
						tile_symbols.accept(_position_animation_type_value);
						payment_long_type_names.accept(_position_animation_type_value);
						area_names.accept(_position_animation_type_value);
						structure_names.accept(_position_animation_type_value);
						tile_names.accept(_position_animation_type_value);
						hero_stat.accept(_position_animation_type_value);
					}
				}
			}
		}
	}
	public void parse_animation_type_boolean_operator() {
		int _position_animation_type_boolean_operator = -1;
		Token.Parsed _token_animation_type_boolean_operator = null;
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
		_position_animation_type_boolean_operator=_position;
		_token_animation_type_boolean_operator=_token;
		_token=new Tokens.Rule.AnimationTypeBooleanOperatorToken();
		if(_position+2-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='=') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='=') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_87.SYNTAX);
			_position=_position+2;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ==");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean_operator(animation_type_boolean_operator)");
				_furthestPosition=_position;
			}
			_position=_position_animation_type_boolean_operator;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_type_boolean_operator.add(_position_animation_type_boolean_operator,_token);
		}
		_token=_token_animation_type_boolean_operator;
		if(_state==FAILED) {
			support_names.reject(_position_animation_type_boolean_operator);
			association_names.reject(_position_animation_type_boolean_operator);
			room_names.reject(_position_animation_type_boolean_operator);
			activity_names.reject(_position_animation_type_boolean_operator);
			siding_names.reject(_position_animation_type_boolean_operator);
			item_names.reject(_position_animation_type_boolean_operator);
			aspect_names.reject(_position_animation_type_boolean_operator);
			affinity_names.reject(_position_animation_type_boolean_operator);
			activity_type_names.reject(_position_animation_type_boolean_operator);
			trail_names.reject(_position_animation_type_boolean_operator);
			attack_names.reject(_position_animation_type_boolean_operator);
			reason_names.reject(_position_animation_type_boolean_operator);
			trait_names.reject(_position_animation_type_boolean_operator);
			condition_names.reject(_position_animation_type_boolean_operator);
			payment_short_type_names.reject(_position_animation_type_boolean_operator);
			skill_names.reject(_position_animation_type_boolean_operator);
			map_names.reject(_position_animation_type_boolean_operator);
			event_names.reject(_position_animation_type_boolean_operator);
			image_names.reject(_position_animation_type_boolean_operator);
			tile_symbols.reject(_position_animation_type_boolean_operator);
			payment_long_type_names.reject(_position_animation_type_boolean_operator);
			area_names.reject(_position_animation_type_boolean_operator);
			structure_names.reject(_position_animation_type_boolean_operator);
			tile_names.reject(_position_animation_type_boolean_operator);
			hero_stat.reject(_position_animation_type_boolean_operator);
			_state=SUCCESS;
			_position_animation_type_boolean_operator=_position;
			_token_animation_type_boolean_operator=_token;
			_token=new Tokens.Rule.AnimationTypeBooleanOperatorToken();
			if(_position+2-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='!') {
					_state=FAILED;
				}
				if(_inputArray[_position+1]!='=') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_88.SYNTAX);
				_position=_position+2;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain !=");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean_operator(animation_type_boolean_operator)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_boolean_operator;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_type_boolean_operator.add(_position_animation_type_boolean_operator,_token);
			}
			_token=_token_animation_type_boolean_operator;
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_boolean_operator);
				association_names.reject(_position_animation_type_boolean_operator);
				room_names.reject(_position_animation_type_boolean_operator);
				activity_names.reject(_position_animation_type_boolean_operator);
				siding_names.reject(_position_animation_type_boolean_operator);
				item_names.reject(_position_animation_type_boolean_operator);
				aspect_names.reject(_position_animation_type_boolean_operator);
				affinity_names.reject(_position_animation_type_boolean_operator);
				activity_type_names.reject(_position_animation_type_boolean_operator);
				trail_names.reject(_position_animation_type_boolean_operator);
				attack_names.reject(_position_animation_type_boolean_operator);
				reason_names.reject(_position_animation_type_boolean_operator);
				trait_names.reject(_position_animation_type_boolean_operator);
				condition_names.reject(_position_animation_type_boolean_operator);
				payment_short_type_names.reject(_position_animation_type_boolean_operator);
				skill_names.reject(_position_animation_type_boolean_operator);
				map_names.reject(_position_animation_type_boolean_operator);
				event_names.reject(_position_animation_type_boolean_operator);
				image_names.reject(_position_animation_type_boolean_operator);
				tile_symbols.reject(_position_animation_type_boolean_operator);
				payment_long_type_names.reject(_position_animation_type_boolean_operator);
				area_names.reject(_position_animation_type_boolean_operator);
				structure_names.reject(_position_animation_type_boolean_operator);
				tile_names.reject(_position_animation_type_boolean_operator);
				hero_stat.reject(_position_animation_type_boolean_operator);
				_state=SUCCESS;
				_position_animation_type_boolean_operator=_position;
				_token_animation_type_boolean_operator=_token;
				_token=new Tokens.Rule.AnimationTypeBooleanOperatorToken();
				if(_position+2-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='<') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='=') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_151.SYNTAX);
					_position=_position+2;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain <=");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean_operator(animation_type_boolean_operator)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_boolean_operator;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_animation_type_boolean_operator.add(_position_animation_type_boolean_operator,_token);
				}
				_token=_token_animation_type_boolean_operator;
				if(_state==FAILED) {
					support_names.reject(_position_animation_type_boolean_operator);
					association_names.reject(_position_animation_type_boolean_operator);
					room_names.reject(_position_animation_type_boolean_operator);
					activity_names.reject(_position_animation_type_boolean_operator);
					siding_names.reject(_position_animation_type_boolean_operator);
					item_names.reject(_position_animation_type_boolean_operator);
					aspect_names.reject(_position_animation_type_boolean_operator);
					affinity_names.reject(_position_animation_type_boolean_operator);
					activity_type_names.reject(_position_animation_type_boolean_operator);
					trail_names.reject(_position_animation_type_boolean_operator);
					attack_names.reject(_position_animation_type_boolean_operator);
					reason_names.reject(_position_animation_type_boolean_operator);
					trait_names.reject(_position_animation_type_boolean_operator);
					condition_names.reject(_position_animation_type_boolean_operator);
					payment_short_type_names.reject(_position_animation_type_boolean_operator);
					skill_names.reject(_position_animation_type_boolean_operator);
					map_names.reject(_position_animation_type_boolean_operator);
					event_names.reject(_position_animation_type_boolean_operator);
					image_names.reject(_position_animation_type_boolean_operator);
					tile_symbols.reject(_position_animation_type_boolean_operator);
					payment_long_type_names.reject(_position_animation_type_boolean_operator);
					area_names.reject(_position_animation_type_boolean_operator);
					structure_names.reject(_position_animation_type_boolean_operator);
					tile_names.reject(_position_animation_type_boolean_operator);
					hero_stat.reject(_position_animation_type_boolean_operator);
					_state=SUCCESS;
					_position_animation_type_boolean_operator=_position;
					_token_animation_type_boolean_operator=_token;
					_token=new Tokens.Rule.AnimationTypeBooleanOperatorToken();
					if(_position+2-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='>') {
							_state=FAILED;
						}
						if(_inputArray[_position+1]!='=') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_152.SYNTAX);
						_position=_position+2;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >=");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean_operator(animation_type_boolean_operator)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_boolean_operator;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_animation_type_boolean_operator.add(_position_animation_type_boolean_operator,_token);
					}
					_token=_token_animation_type_boolean_operator;
					if(_state==FAILED) {
						support_names.reject(_position_animation_type_boolean_operator);
						association_names.reject(_position_animation_type_boolean_operator);
						room_names.reject(_position_animation_type_boolean_operator);
						activity_names.reject(_position_animation_type_boolean_operator);
						siding_names.reject(_position_animation_type_boolean_operator);
						item_names.reject(_position_animation_type_boolean_operator);
						aspect_names.reject(_position_animation_type_boolean_operator);
						affinity_names.reject(_position_animation_type_boolean_operator);
						activity_type_names.reject(_position_animation_type_boolean_operator);
						trail_names.reject(_position_animation_type_boolean_operator);
						attack_names.reject(_position_animation_type_boolean_operator);
						reason_names.reject(_position_animation_type_boolean_operator);
						trait_names.reject(_position_animation_type_boolean_operator);
						condition_names.reject(_position_animation_type_boolean_operator);
						payment_short_type_names.reject(_position_animation_type_boolean_operator);
						skill_names.reject(_position_animation_type_boolean_operator);
						map_names.reject(_position_animation_type_boolean_operator);
						event_names.reject(_position_animation_type_boolean_operator);
						image_names.reject(_position_animation_type_boolean_operator);
						tile_symbols.reject(_position_animation_type_boolean_operator);
						payment_long_type_names.reject(_position_animation_type_boolean_operator);
						area_names.reject(_position_animation_type_boolean_operator);
						structure_names.reject(_position_animation_type_boolean_operator);
						tile_names.reject(_position_animation_type_boolean_operator);
						hero_stat.reject(_position_animation_type_boolean_operator);
						_state=SUCCESS;
						_position_animation_type_boolean_operator=_position;
						_token_animation_type_boolean_operator=_token;
						_token=new Tokens.Rule.AnimationTypeBooleanOperatorToken();
						if(_position+1-1 >=_inputLength) {
							_state=FAILED;
						}
						else {
							if(_inputArray[_position+0]!='<') {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,Tokens.Syntax.syntax_153.SYNTAX);
							_position=_position+1;
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
						else if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain <");
								_furthestPosition=_position;
							}
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean_operator(animation_type_boolean_operator)");
								_furthestPosition=_position;
							}
							_position=_position_animation_type_boolean_operator;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_animation_type_boolean_operator.add(_position_animation_type_boolean_operator,_token);
						}
						_token=_token_animation_type_boolean_operator;
						if(_state==FAILED) {
							support_names.reject(_position_animation_type_boolean_operator);
							association_names.reject(_position_animation_type_boolean_operator);
							room_names.reject(_position_animation_type_boolean_operator);
							activity_names.reject(_position_animation_type_boolean_operator);
							siding_names.reject(_position_animation_type_boolean_operator);
							item_names.reject(_position_animation_type_boolean_operator);
							aspect_names.reject(_position_animation_type_boolean_operator);
							affinity_names.reject(_position_animation_type_boolean_operator);
							activity_type_names.reject(_position_animation_type_boolean_operator);
							trail_names.reject(_position_animation_type_boolean_operator);
							attack_names.reject(_position_animation_type_boolean_operator);
							reason_names.reject(_position_animation_type_boolean_operator);
							trait_names.reject(_position_animation_type_boolean_operator);
							condition_names.reject(_position_animation_type_boolean_operator);
							payment_short_type_names.reject(_position_animation_type_boolean_operator);
							skill_names.reject(_position_animation_type_boolean_operator);
							map_names.reject(_position_animation_type_boolean_operator);
							event_names.reject(_position_animation_type_boolean_operator);
							image_names.reject(_position_animation_type_boolean_operator);
							tile_symbols.reject(_position_animation_type_boolean_operator);
							payment_long_type_names.reject(_position_animation_type_boolean_operator);
							area_names.reject(_position_animation_type_boolean_operator);
							structure_names.reject(_position_animation_type_boolean_operator);
							tile_names.reject(_position_animation_type_boolean_operator);
							hero_stat.reject(_position_animation_type_boolean_operator);
							_state=SUCCESS;
							_position_animation_type_boolean_operator=_position;
							_token_animation_type_boolean_operator=_token;
							_token=new Tokens.Rule.AnimationTypeBooleanOperatorToken();
							if(_position+1-1 >=_inputLength) {
								_state=FAILED;
							}
							else {
								if(_inputArray[_position+0]!='>') {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
								_position=_position+1;
								while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
									++_position;
								}
							}
							else if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
									_furthestPosition=_position;
								}
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_boolean_operator(animation_type_boolean_operator)");
									_furthestPosition=_position;
								}
								_position=_position_animation_type_boolean_operator;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_animation_type_boolean_operator.add(_position_animation_type_boolean_operator,_token);
							}
							_token=_token_animation_type_boolean_operator;
							if(_state==FAILED) {
								support_names.reject(_position_animation_type_boolean_operator);
								association_names.reject(_position_animation_type_boolean_operator);
								room_names.reject(_position_animation_type_boolean_operator);
								activity_names.reject(_position_animation_type_boolean_operator);
								siding_names.reject(_position_animation_type_boolean_operator);
								item_names.reject(_position_animation_type_boolean_operator);
								aspect_names.reject(_position_animation_type_boolean_operator);
								affinity_names.reject(_position_animation_type_boolean_operator);
								activity_type_names.reject(_position_animation_type_boolean_operator);
								trail_names.reject(_position_animation_type_boolean_operator);
								attack_names.reject(_position_animation_type_boolean_operator);
								reason_names.reject(_position_animation_type_boolean_operator);
								trait_names.reject(_position_animation_type_boolean_operator);
								condition_names.reject(_position_animation_type_boolean_operator);
								payment_short_type_names.reject(_position_animation_type_boolean_operator);
								skill_names.reject(_position_animation_type_boolean_operator);
								map_names.reject(_position_animation_type_boolean_operator);
								event_names.reject(_position_animation_type_boolean_operator);
								image_names.reject(_position_animation_type_boolean_operator);
								tile_symbols.reject(_position_animation_type_boolean_operator);
								payment_long_type_names.reject(_position_animation_type_boolean_operator);
								area_names.reject(_position_animation_type_boolean_operator);
								structure_names.reject(_position_animation_type_boolean_operator);
								tile_names.reject(_position_animation_type_boolean_operator);
								hero_stat.reject(_position_animation_type_boolean_operator);
							}
							else if(_state==SUCCESS) {
								support_names.accept(_position_animation_type_boolean_operator);
								association_names.accept(_position_animation_type_boolean_operator);
								room_names.accept(_position_animation_type_boolean_operator);
								activity_names.accept(_position_animation_type_boolean_operator);
								siding_names.accept(_position_animation_type_boolean_operator);
								item_names.accept(_position_animation_type_boolean_operator);
								aspect_names.accept(_position_animation_type_boolean_operator);
								affinity_names.accept(_position_animation_type_boolean_operator);
								activity_type_names.accept(_position_animation_type_boolean_operator);
								trail_names.accept(_position_animation_type_boolean_operator);
								attack_names.accept(_position_animation_type_boolean_operator);
								reason_names.accept(_position_animation_type_boolean_operator);
								trait_names.accept(_position_animation_type_boolean_operator);
								condition_names.accept(_position_animation_type_boolean_operator);
								payment_short_type_names.accept(_position_animation_type_boolean_operator);
								skill_names.accept(_position_animation_type_boolean_operator);
								map_names.accept(_position_animation_type_boolean_operator);
								event_names.accept(_position_animation_type_boolean_operator);
								image_names.accept(_position_animation_type_boolean_operator);
								tile_symbols.accept(_position_animation_type_boolean_operator);
								payment_long_type_names.accept(_position_animation_type_boolean_operator);
								area_names.accept(_position_animation_type_boolean_operator);
								structure_names.accept(_position_animation_type_boolean_operator);
								tile_names.accept(_position_animation_type_boolean_operator);
								hero_stat.accept(_position_animation_type_boolean_operator);
							}
						}
					}
				}
			}
		}
	}
	public void parse_animation_type_body() {
		int _position_animation_type_body = -1;
		Token.Parsed _token_animation_type_body = null;
		int _length_animation_type_body_brace = _inputLength;
		if(brace_4.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_4.get(_position);
			int _position_animation_type_body_brace = _position;
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
			_position_animation_type_body=_position;
			_token_animation_type_body=_token;
			_token=new Tokens.Rule.AnimationTypeBodyToken();
			int _state_227 = _state;
			while(_position<_inputLength) {
				parse_animation_type_element();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_227==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_body(animation_type_body)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_body;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_type_body.addAll(_token);
				_token_animation_type_body.setValue(_token.getValue());
			}
			_token=_token_animation_type_body;
			if(_state==SUCCESS&&brace_4.get(_position_animation_type_body_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("animation_type_body",_position,_lineNumberRanges));
				_position=brace_4.get(_position_animation_type_body_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_animation_type_body_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_body);
				association_names.reject(_position_animation_type_body);
				room_names.reject(_position_animation_type_body);
				activity_names.reject(_position_animation_type_body);
				siding_names.reject(_position_animation_type_body);
				item_names.reject(_position_animation_type_body);
				aspect_names.reject(_position_animation_type_body);
				affinity_names.reject(_position_animation_type_body);
				activity_type_names.reject(_position_animation_type_body);
				trail_names.reject(_position_animation_type_body);
				attack_names.reject(_position_animation_type_body);
				reason_names.reject(_position_animation_type_body);
				trait_names.reject(_position_animation_type_body);
				condition_names.reject(_position_animation_type_body);
				payment_short_type_names.reject(_position_animation_type_body);
				skill_names.reject(_position_animation_type_body);
				map_names.reject(_position_animation_type_body);
				event_names.reject(_position_animation_type_body);
				image_names.reject(_position_animation_type_body);
				tile_symbols.reject(_position_animation_type_body);
				payment_long_type_names.reject(_position_animation_type_body);
				area_names.reject(_position_animation_type_body);
				structure_names.reject(_position_animation_type_body);
				tile_names.reject(_position_animation_type_body);
				hero_stat.reject(_position_animation_type_body);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_type_body);
				association_names.accept(_position_animation_type_body);
				room_names.accept(_position_animation_type_body);
				activity_names.accept(_position_animation_type_body);
				siding_names.accept(_position_animation_type_body);
				item_names.accept(_position_animation_type_body);
				aspect_names.accept(_position_animation_type_body);
				affinity_names.accept(_position_animation_type_body);
				activity_type_names.accept(_position_animation_type_body);
				trail_names.accept(_position_animation_type_body);
				attack_names.accept(_position_animation_type_body);
				reason_names.accept(_position_animation_type_body);
				trait_names.accept(_position_animation_type_body);
				condition_names.accept(_position_animation_type_body);
				payment_short_type_names.accept(_position_animation_type_body);
				skill_names.accept(_position_animation_type_body);
				map_names.accept(_position_animation_type_body);
				event_names.accept(_position_animation_type_body);
				image_names.accept(_position_animation_type_body);
				tile_symbols.accept(_position_animation_type_body);
				payment_long_type_names.accept(_position_animation_type_body);
				area_names.accept(_position_animation_type_body);
				structure_names.accept(_position_animation_type_body);
				tile_names.accept(_position_animation_type_body);
				hero_stat.accept(_position_animation_type_body);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_body(animation_type_body)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_animation_variable_value() {
		int _position_animation_variable_value = -1;
		Token.Parsed _token_animation_variable_value = null;
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
		_position_animation_variable_value=_position;
		_token_animation_variable_value=_token;
		_token=new Tokens.Rule.AnimationVariableValueToken();
		parse_animation_type_coordinate_variable();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value(animation_variable_value)");
				_furthestPosition=_position;
			}
			_position=_position_animation_variable_value;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_animation_variable_value.add(_position_animation_variable_value,_token);
		}
		_token=_token_animation_variable_value;
		if(_state==FAILED) {
			support_names.reject(_position_animation_variable_value);
			association_names.reject(_position_animation_variable_value);
			room_names.reject(_position_animation_variable_value);
			activity_names.reject(_position_animation_variable_value);
			siding_names.reject(_position_animation_variable_value);
			item_names.reject(_position_animation_variable_value);
			aspect_names.reject(_position_animation_variable_value);
			affinity_names.reject(_position_animation_variable_value);
			activity_type_names.reject(_position_animation_variable_value);
			trail_names.reject(_position_animation_variable_value);
			attack_names.reject(_position_animation_variable_value);
			reason_names.reject(_position_animation_variable_value);
			trait_names.reject(_position_animation_variable_value);
			condition_names.reject(_position_animation_variable_value);
			payment_short_type_names.reject(_position_animation_variable_value);
			skill_names.reject(_position_animation_variable_value);
			map_names.reject(_position_animation_variable_value);
			event_names.reject(_position_animation_variable_value);
			image_names.reject(_position_animation_variable_value);
			tile_symbols.reject(_position_animation_variable_value);
			payment_long_type_names.reject(_position_animation_variable_value);
			area_names.reject(_position_animation_variable_value);
			structure_names.reject(_position_animation_variable_value);
			tile_names.reject(_position_animation_variable_value);
			hero_stat.reject(_position_animation_variable_value);
			_state=SUCCESS;
			_position_animation_variable_value=_position;
			_token_animation_variable_value=_token;
			_token=new Tokens.Rule.AnimationVariableValueToken();
			parse_animation_type_flip_variable();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value(animation_variable_value)");
					_furthestPosition=_position;
				}
				_position=_position_animation_variable_value;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_variable_value.add(_position_animation_variable_value,_token);
			}
			_token=_token_animation_variable_value;
			if(_state==FAILED) {
				support_names.reject(_position_animation_variable_value);
				association_names.reject(_position_animation_variable_value);
				room_names.reject(_position_animation_variable_value);
				activity_names.reject(_position_animation_variable_value);
				siding_names.reject(_position_animation_variable_value);
				item_names.reject(_position_animation_variable_value);
				aspect_names.reject(_position_animation_variable_value);
				affinity_names.reject(_position_animation_variable_value);
				activity_type_names.reject(_position_animation_variable_value);
				trail_names.reject(_position_animation_variable_value);
				attack_names.reject(_position_animation_variable_value);
				reason_names.reject(_position_animation_variable_value);
				trait_names.reject(_position_animation_variable_value);
				condition_names.reject(_position_animation_variable_value);
				payment_short_type_names.reject(_position_animation_variable_value);
				skill_names.reject(_position_animation_variable_value);
				map_names.reject(_position_animation_variable_value);
				event_names.reject(_position_animation_variable_value);
				image_names.reject(_position_animation_variable_value);
				tile_symbols.reject(_position_animation_variable_value);
				payment_long_type_names.reject(_position_animation_variable_value);
				area_names.reject(_position_animation_variable_value);
				structure_names.reject(_position_animation_variable_value);
				tile_names.reject(_position_animation_variable_value);
				hero_stat.reject(_position_animation_variable_value);
				_state=SUCCESS;
				_position_animation_variable_value=_position;
				_token_animation_variable_value=_token;
				_token=new Tokens.Rule.AnimationVariableValueToken();
				parse_animation_variable_value_basic();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_variable_value(animation_variable_value)");
						_furthestPosition=_position;
					}
					_position=_position_animation_variable_value;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_animation_variable_value.add(_position_animation_variable_value,_token);
				}
				_token=_token_animation_variable_value;
				if(_state==FAILED) {
					support_names.reject(_position_animation_variable_value);
					association_names.reject(_position_animation_variable_value);
					room_names.reject(_position_animation_variable_value);
					activity_names.reject(_position_animation_variable_value);
					siding_names.reject(_position_animation_variable_value);
					item_names.reject(_position_animation_variable_value);
					aspect_names.reject(_position_animation_variable_value);
					affinity_names.reject(_position_animation_variable_value);
					activity_type_names.reject(_position_animation_variable_value);
					trail_names.reject(_position_animation_variable_value);
					attack_names.reject(_position_animation_variable_value);
					reason_names.reject(_position_animation_variable_value);
					trait_names.reject(_position_animation_variable_value);
					condition_names.reject(_position_animation_variable_value);
					payment_short_type_names.reject(_position_animation_variable_value);
					skill_names.reject(_position_animation_variable_value);
					map_names.reject(_position_animation_variable_value);
					event_names.reject(_position_animation_variable_value);
					image_names.reject(_position_animation_variable_value);
					tile_symbols.reject(_position_animation_variable_value);
					payment_long_type_names.reject(_position_animation_variable_value);
					area_names.reject(_position_animation_variable_value);
					structure_names.reject(_position_animation_variable_value);
					tile_names.reject(_position_animation_variable_value);
					hero_stat.reject(_position_animation_variable_value);
				}
				else if(_state==SUCCESS) {
					support_names.accept(_position_animation_variable_value);
					association_names.accept(_position_animation_variable_value);
					room_names.accept(_position_animation_variable_value);
					activity_names.accept(_position_animation_variable_value);
					siding_names.accept(_position_animation_variable_value);
					item_names.accept(_position_animation_variable_value);
					aspect_names.accept(_position_animation_variable_value);
					affinity_names.accept(_position_animation_variable_value);
					activity_type_names.accept(_position_animation_variable_value);
					trail_names.accept(_position_animation_variable_value);
					attack_names.accept(_position_animation_variable_value);
					reason_names.accept(_position_animation_variable_value);
					trait_names.accept(_position_animation_variable_value);
					condition_names.accept(_position_animation_variable_value);
					payment_short_type_names.accept(_position_animation_variable_value);
					skill_names.accept(_position_animation_variable_value);
					map_names.accept(_position_animation_variable_value);
					event_names.accept(_position_animation_variable_value);
					image_names.accept(_position_animation_variable_value);
					tile_symbols.accept(_position_animation_variable_value);
					payment_long_type_names.accept(_position_animation_variable_value);
					area_names.accept(_position_animation_variable_value);
					structure_names.accept(_position_animation_variable_value);
					tile_names.accept(_position_animation_variable_value);
					hero_stat.accept(_position_animation_variable_value);
				}
			}
		}
	}
	public void parse_animation_type_flip_variable() {
		int _position_animation_type_flip_variable = -1;
		Token.Parsed _token_animation_type_flip_variable = null;
		int _position_animation_variable_value_basic = -1;
		Token.Parsed _token_animation_variable_value_basic = null;
		int _length_animation_type_flip_variable_brace = _inputLength;
		if(brace_3.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_3.get(_position);
			int _position_animation_type_flip_variable_brace = _position;
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
			_position_animation_type_flip_variable=_position;
			_token_animation_type_flip_variable=_token;
			_token=new Tokens.Rule.AnimationTypeFlipVariableToken();
			_token_animation_variable_value_basic=_token;
			_token=new Tokens.Name.UnflippedValueToken();
			_position_animation_variable_value_basic=_position;
			parse_animation_variable_value_basic();
			if(_state==SUCCESS) {
				_token_animation_variable_value_basic.add(_position_animation_variable_value_basic,_token);
			}
			_token=_token_animation_variable_value_basic;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_flip_variable(animation_type_flip_variable)");
					_furthestPosition=_position;
				}
				_position=_position_animation_type_flip_variable;
			}
			else {
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='|') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_35.SYNTAX);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain |");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_flip_variable(animation_type_flip_variable)");
						_furthestPosition=_position;
					}
					_position=_position_animation_type_flip_variable;
				}
				else {
					_token_animation_variable_value_basic=_token;
					_token=new Tokens.Name.FlippedValueToken();
					_position_animation_variable_value_basic=_position;
					parse_animation_variable_value_basic();
					if(_state==SUCCESS) {
						_token_animation_variable_value_basic.add(_position_animation_variable_value_basic,_token);
					}
					_token=_token_animation_variable_value_basic;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_flip_variable(animation_type_flip_variable)");
							_furthestPosition=_position;
						}
						_position=_position_animation_type_flip_variable;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_animation_type_flip_variable.addAll(_token);
				_token_animation_type_flip_variable.setValue(_token.getValue());
			}
			_token=_token_animation_type_flip_variable;
			if(_state==SUCCESS&&brace_3.get(_position_animation_type_flip_variable_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("animation_type_flip_variable",_position,_lineNumberRanges));
				_position=brace_3.get(_position_animation_type_flip_variable_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_animation_type_flip_variable_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_animation_type_flip_variable);
				association_names.reject(_position_animation_type_flip_variable);
				room_names.reject(_position_animation_type_flip_variable);
				activity_names.reject(_position_animation_type_flip_variable);
				siding_names.reject(_position_animation_type_flip_variable);
				item_names.reject(_position_animation_type_flip_variable);
				aspect_names.reject(_position_animation_type_flip_variable);
				affinity_names.reject(_position_animation_type_flip_variable);
				activity_type_names.reject(_position_animation_type_flip_variable);
				trail_names.reject(_position_animation_type_flip_variable);
				attack_names.reject(_position_animation_type_flip_variable);
				reason_names.reject(_position_animation_type_flip_variable);
				trait_names.reject(_position_animation_type_flip_variable);
				condition_names.reject(_position_animation_type_flip_variable);
				payment_short_type_names.reject(_position_animation_type_flip_variable);
				skill_names.reject(_position_animation_type_flip_variable);
				map_names.reject(_position_animation_type_flip_variable);
				event_names.reject(_position_animation_type_flip_variable);
				image_names.reject(_position_animation_type_flip_variable);
				tile_symbols.reject(_position_animation_type_flip_variable);
				payment_long_type_names.reject(_position_animation_type_flip_variable);
				area_names.reject(_position_animation_type_flip_variable);
				structure_names.reject(_position_animation_type_flip_variable);
				tile_names.reject(_position_animation_type_flip_variable);
				hero_stat.reject(_position_animation_type_flip_variable);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_type_flip_variable);
				association_names.accept(_position_animation_type_flip_variable);
				room_names.accept(_position_animation_type_flip_variable);
				activity_names.accept(_position_animation_type_flip_variable);
				siding_names.accept(_position_animation_type_flip_variable);
				item_names.accept(_position_animation_type_flip_variable);
				aspect_names.accept(_position_animation_type_flip_variable);
				affinity_names.accept(_position_animation_type_flip_variable);
				activity_type_names.accept(_position_animation_type_flip_variable);
				trail_names.accept(_position_animation_type_flip_variable);
				attack_names.accept(_position_animation_type_flip_variable);
				reason_names.accept(_position_animation_type_flip_variable);
				trait_names.accept(_position_animation_type_flip_variable);
				condition_names.accept(_position_animation_type_flip_variable);
				payment_short_type_names.accept(_position_animation_type_flip_variable);
				skill_names.accept(_position_animation_type_flip_variable);
				map_names.accept(_position_animation_type_flip_variable);
				event_names.accept(_position_animation_type_flip_variable);
				image_names.accept(_position_animation_type_flip_variable);
				tile_symbols.accept(_position_animation_type_flip_variable);
				payment_long_type_names.accept(_position_animation_type_flip_variable);
				area_names.accept(_position_animation_type_flip_variable);
				structure_names.accept(_position_animation_type_flip_variable);
				tile_names.accept(_position_animation_type_flip_variable);
				hero_stat.accept(_position_animation_type_flip_variable);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_type_flip_variable(animation_type_flip_variable)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_animation_frame_data() {
		int _position_animation_frame_data = -1;
		Token.Parsed _token_animation_frame_data = null;
		int _position_NAME = -1;
		Token.Parsed _token_NAME = null;
		int _length_animation_frame_data_brace = _inputLength;
		if(brace_3.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_3.get(_position);
			int _position_animation_frame_data_brace = _position;
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
			_position_animation_frame_data=_position;
			_token_animation_frame_data=_token;
			_token=new Tokens.Rule.AnimationFrameDataToken();
			_token_NAME=_token;
			_token=new Tokens.Name.FrameNameToken();
			_position_NAME=_position;
			if(_state==SUCCESS&&!_recursion_protection_NAME_47.contains(_position)) {
				_recursion_protection_NAME_47.add(_position);
				parse_NAME();
				_recursion_protection_NAME_47.remove(_position_NAME);
			}
			else {
				_state=FAILED;
			}
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_frame_data(animation_frame_data)");
					_furthestPosition=_position;
				}
				_position=_position_animation_frame_data;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_animation_frame_data.addAll(_token);
				_token_animation_frame_data.setValue(_token.getValue());
			}
			_token=_token_animation_frame_data;
			if(_state==SUCCESS&&brace_3.get(_position_animation_frame_data_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("animation_frame_data",_position,_lineNumberRanges));
				_position=brace_3.get(_position_animation_frame_data_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_animation_frame_data_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_animation_frame_data);
				association_names.reject(_position_animation_frame_data);
				room_names.reject(_position_animation_frame_data);
				activity_names.reject(_position_animation_frame_data);
				siding_names.reject(_position_animation_frame_data);
				item_names.reject(_position_animation_frame_data);
				aspect_names.reject(_position_animation_frame_data);
				affinity_names.reject(_position_animation_frame_data);
				activity_type_names.reject(_position_animation_frame_data);
				trail_names.reject(_position_animation_frame_data);
				attack_names.reject(_position_animation_frame_data);
				reason_names.reject(_position_animation_frame_data);
				trait_names.reject(_position_animation_frame_data);
				condition_names.reject(_position_animation_frame_data);
				payment_short_type_names.reject(_position_animation_frame_data);
				skill_names.reject(_position_animation_frame_data);
				map_names.reject(_position_animation_frame_data);
				event_names.reject(_position_animation_frame_data);
				image_names.reject(_position_animation_frame_data);
				tile_symbols.reject(_position_animation_frame_data);
				payment_long_type_names.reject(_position_animation_frame_data);
				area_names.reject(_position_animation_frame_data);
				structure_names.reject(_position_animation_frame_data);
				tile_names.reject(_position_animation_frame_data);
				hero_stat.reject(_position_animation_frame_data);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_animation_frame_data);
				association_names.accept(_position_animation_frame_data);
				room_names.accept(_position_animation_frame_data);
				activity_names.accept(_position_animation_frame_data);
				siding_names.accept(_position_animation_frame_data);
				item_names.accept(_position_animation_frame_data);
				aspect_names.accept(_position_animation_frame_data);
				affinity_names.accept(_position_animation_frame_data);
				activity_type_names.accept(_position_animation_frame_data);
				trail_names.accept(_position_animation_frame_data);
				attack_names.accept(_position_animation_frame_data);
				reason_names.accept(_position_animation_frame_data);
				trait_names.accept(_position_animation_frame_data);
				condition_names.accept(_position_animation_frame_data);
				payment_short_type_names.accept(_position_animation_frame_data);
				skill_names.accept(_position_animation_frame_data);
				map_names.accept(_position_animation_frame_data);
				event_names.accept(_position_animation_frame_data);
				image_names.accept(_position_animation_frame_data);
				tile_symbols.accept(_position_animation_frame_data);
				payment_long_type_names.accept(_position_animation_frame_data);
				area_names.accept(_position_animation_frame_data);
				structure_names.accept(_position_animation_frame_data);
				tile_names.accept(_position_animation_frame_data);
				hero_stat.accept(_position_animation_frame_data);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"animation_frame_data(animation_frame_data)");
				_furthestPosition=_position;
			}
		}
	}
}