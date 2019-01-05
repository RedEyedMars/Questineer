package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.association_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class method_context extends association_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public method_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public method_context() {
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
	public void parse_method_parameters() {
		int _position_method_parameters = -1;
		Token.Parsed _token_method_parameters = null;
		int _length_method_parameters_brace = _inputLength;
		if(brace_5.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_5.get(_position);
			int _position_method_parameters_brace = _position;
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
			_position_method_parameters=_position;
			_token_method_parameters=_token;
			_token=new Tokens.Rule.MethodParametersToken();
			int _state_161 = _state;
			parse__anonymous_126();
			if(_state_161==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method_parameters(method_parameters)");
					_furthestPosition=_position;
				}
				_position=_position_method_parameters;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_method_parameters.add(_position_method_parameters,_token);
			}
			_token=_token_method_parameters;
			if(_state==SUCCESS&&brace_5.get(_position_method_parameters_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("method_parameters",_position,_lineNumberRanges));
				_position=brace_5.get(_position_method_parameters_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_method_parameters_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_method_parameters);
				association_names.reject(_position_method_parameters);
				room_names.reject(_position_method_parameters);
				activity_names.reject(_position_method_parameters);
				siding_names.reject(_position_method_parameters);
				item_names.reject(_position_method_parameters);
				aspect_names.reject(_position_method_parameters);
				affinity_names.reject(_position_method_parameters);
				activity_type_names.reject(_position_method_parameters);
				trail_names.reject(_position_method_parameters);
				attack_names.reject(_position_method_parameters);
				reason_names.reject(_position_method_parameters);
				trait_names.reject(_position_method_parameters);
				condition_names.reject(_position_method_parameters);
				payment_short_type_names.reject(_position_method_parameters);
				skill_names.reject(_position_method_parameters);
				map_names.reject(_position_method_parameters);
				event_names.reject(_position_method_parameters);
				image_names.reject(_position_method_parameters);
				tile_symbols.reject(_position_method_parameters);
				payment_long_type_names.reject(_position_method_parameters);
				area_names.reject(_position_method_parameters);
				structure_names.reject(_position_method_parameters);
				tile_names.reject(_position_method_parameters);
				hero_stat.reject(_position_method_parameters);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_method_parameters);
				association_names.accept(_position_method_parameters);
				room_names.accept(_position_method_parameters);
				activity_names.accept(_position_method_parameters);
				siding_names.accept(_position_method_parameters);
				item_names.accept(_position_method_parameters);
				aspect_names.accept(_position_method_parameters);
				affinity_names.accept(_position_method_parameters);
				activity_type_names.accept(_position_method_parameters);
				trail_names.accept(_position_method_parameters);
				attack_names.accept(_position_method_parameters);
				reason_names.accept(_position_method_parameters);
				trait_names.accept(_position_method_parameters);
				condition_names.accept(_position_method_parameters);
				payment_short_type_names.accept(_position_method_parameters);
				skill_names.accept(_position_method_parameters);
				map_names.accept(_position_method_parameters);
				event_names.accept(_position_method_parameters);
				image_names.accept(_position_method_parameters);
				tile_symbols.accept(_position_method_parameters);
				payment_long_type_names.accept(_position_method_parameters);
				area_names.accept(_position_method_parameters);
				structure_names.accept(_position_method_parameters);
				tile_names.accept(_position_method_parameters);
				hero_stat.accept(_position_method_parameters);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method_parameters(method_parameters)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_method_arguments() {
		int _position_method_arguments = -1;
		Token.Parsed _token_method_arguments = null;
		int _length_method_arguments_brace = _inputLength;
		if(brace_5.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_5.get(_position);
			int _position_method_arguments_brace = _position;
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
			_position_method_arguments=_position;
			_token_method_arguments=_token;
			_token=new Tokens.Rule.MethodArgumentsToken();
			int _state_157 = _state;
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
			if(_state_157==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method_arguments(method_arguments)");
					_furthestPosition=_position;
				}
				_position=_position_method_arguments;
			}
			else {
				int _state_158 = _state;
				parse_statement();
				if(_state_158==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method_arguments(method_arguments)");
						_furthestPosition=_position;
					}
					_position=_position_method_arguments;
				}
				else {
					int _state_159 = _state;
					while(_position<_inputLength) {
						parse__anonymous_125();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_159==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method_arguments(method_arguments)");
							_furthestPosition=_position;
						}
						_position=_position_method_arguments;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_method_arguments.add(_position_method_arguments,_token);
			}
			_token=_token_method_arguments;
			if(_state==SUCCESS&&brace_5.get(_position_method_arguments_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("method_arguments",_position,_lineNumberRanges));
				_position=brace_5.get(_position_method_arguments_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_method_arguments_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_method_arguments);
				association_names.reject(_position_method_arguments);
				room_names.reject(_position_method_arguments);
				activity_names.reject(_position_method_arguments);
				siding_names.reject(_position_method_arguments);
				item_names.reject(_position_method_arguments);
				aspect_names.reject(_position_method_arguments);
				affinity_names.reject(_position_method_arguments);
				activity_type_names.reject(_position_method_arguments);
				trail_names.reject(_position_method_arguments);
				attack_names.reject(_position_method_arguments);
				reason_names.reject(_position_method_arguments);
				trait_names.reject(_position_method_arguments);
				condition_names.reject(_position_method_arguments);
				payment_short_type_names.reject(_position_method_arguments);
				skill_names.reject(_position_method_arguments);
				map_names.reject(_position_method_arguments);
				event_names.reject(_position_method_arguments);
				image_names.reject(_position_method_arguments);
				tile_symbols.reject(_position_method_arguments);
				payment_long_type_names.reject(_position_method_arguments);
				area_names.reject(_position_method_arguments);
				structure_names.reject(_position_method_arguments);
				tile_names.reject(_position_method_arguments);
				hero_stat.reject(_position_method_arguments);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_method_arguments);
				association_names.accept(_position_method_arguments);
				room_names.accept(_position_method_arguments);
				activity_names.accept(_position_method_arguments);
				siding_names.accept(_position_method_arguments);
				item_names.accept(_position_method_arguments);
				aspect_names.accept(_position_method_arguments);
				affinity_names.accept(_position_method_arguments);
				activity_type_names.accept(_position_method_arguments);
				trail_names.accept(_position_method_arguments);
				attack_names.accept(_position_method_arguments);
				reason_names.accept(_position_method_arguments);
				trait_names.accept(_position_method_arguments);
				condition_names.accept(_position_method_arguments);
				payment_short_type_names.accept(_position_method_arguments);
				skill_names.accept(_position_method_arguments);
				map_names.accept(_position_method_arguments);
				event_names.accept(_position_method_arguments);
				image_names.accept(_position_method_arguments);
				tile_symbols.accept(_position_method_arguments);
				payment_long_type_names.accept(_position_method_arguments);
				area_names.accept(_position_method_arguments);
				structure_names.accept(_position_method_arguments);
				tile_names.accept(_position_method_arguments);
				hero_stat.accept(_position_method_arguments);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method_arguments(method_arguments)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_method() {
		int _position_method = -1;
		Token.Parsed _token_method = null;
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
		_position_method=_position;
		_token_method=_token;
		_token=new Tokens.Rule.MethodToken();
		if(_position+3-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='n') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='e') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='w') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_147.NEW);
			_position=_position+3;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain new");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method(method)");
				_furthestPosition=_position;
			}
			_position=_position_method;
		}
		else {
			parse_type_name();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method(method)");
					_furthestPosition=_position;
				}
				_position=_position_method;
			}
			else {
				parse_method_arguments();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method(method)");
						_furthestPosition=_position;
					}
					_position=_position_method;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_method.add(_position_method,_token);
		}
		_token=_token_method;
		if(_state==FAILED) {
			support_names.reject(_position_method);
			association_names.reject(_position_method);
			room_names.reject(_position_method);
			activity_names.reject(_position_method);
			siding_names.reject(_position_method);
			item_names.reject(_position_method);
			aspect_names.reject(_position_method);
			affinity_names.reject(_position_method);
			activity_type_names.reject(_position_method);
			trail_names.reject(_position_method);
			attack_names.reject(_position_method);
			reason_names.reject(_position_method);
			trait_names.reject(_position_method);
			condition_names.reject(_position_method);
			payment_short_type_names.reject(_position_method);
			skill_names.reject(_position_method);
			map_names.reject(_position_method);
			event_names.reject(_position_method);
			image_names.reject(_position_method);
			tile_symbols.reject(_position_method);
			payment_long_type_names.reject(_position_method);
			area_names.reject(_position_method);
			structure_names.reject(_position_method);
			tile_names.reject(_position_method);
			hero_stat.reject(_position_method);
			_state=SUCCESS;
			_position_method=_position;
			_token_method=_token;
			_token=new Tokens.Rule.MethodToken();
			_token_NAME=_token;
			_token=new Tokens.Name.MethodNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method(method)");
					_furthestPosition=_position;
				}
				_position=_position_method;
			}
			else {
				parse_method_arguments();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"method(method)");
						_furthestPosition=_position;
					}
					_position=_position_method;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_method.add(_position_method,_token);
			}
			_token=_token_method;
			if(_state==FAILED) {
				support_names.reject(_position_method);
				association_names.reject(_position_method);
				room_names.reject(_position_method);
				activity_names.reject(_position_method);
				siding_names.reject(_position_method);
				item_names.reject(_position_method);
				aspect_names.reject(_position_method);
				affinity_names.reject(_position_method);
				activity_type_names.reject(_position_method);
				trail_names.reject(_position_method);
				attack_names.reject(_position_method);
				reason_names.reject(_position_method);
				trait_names.reject(_position_method);
				condition_names.reject(_position_method);
				payment_short_type_names.reject(_position_method);
				skill_names.reject(_position_method);
				map_names.reject(_position_method);
				event_names.reject(_position_method);
				image_names.reject(_position_method);
				tile_symbols.reject(_position_method);
				payment_long_type_names.reject(_position_method);
				area_names.reject(_position_method);
				structure_names.reject(_position_method);
				tile_names.reject(_position_method);
				hero_stat.reject(_position_method);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_method);
				association_names.accept(_position_method);
				room_names.accept(_position_method);
				activity_names.accept(_position_method);
				siding_names.accept(_position_method);
				item_names.accept(_position_method);
				aspect_names.accept(_position_method);
				affinity_names.accept(_position_method);
				activity_type_names.accept(_position_method);
				trail_names.accept(_position_method);
				attack_names.accept(_position_method);
				reason_names.accept(_position_method);
				trait_names.accept(_position_method);
				condition_names.accept(_position_method);
				payment_short_type_names.accept(_position_method);
				skill_names.accept(_position_method);
				map_names.accept(_position_method);
				event_names.accept(_position_method);
				image_names.accept(_position_method);
				tile_symbols.accept(_position_method);
				payment_long_type_names.accept(_position_method);
				area_names.accept(_position_method);
				structure_names.accept(_position_method);
				tile_names.accept(_position_method);
				hero_stat.accept(_position_method);
			}
		}
	}
}