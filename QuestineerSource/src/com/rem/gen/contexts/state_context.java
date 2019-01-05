package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.hints_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class state_context extends hints_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public state_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public state_context() {
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
	public void parse_state_range_element() {
		int _position_state_range_element = -1;
		Token.Parsed _token_state_range_element = null;
		int _position_number = -1;
		Token.Parsed _token_number = null;
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
		_position_state_range_element=_position;
		_token_state_range_element=_token;
		_token=new Tokens.Rule.StateRangeElementToken();
		parse_braced_statement();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
				_furthestPosition=_position;
			}
			_position=_position_state_range_element;
		}
		else {
			int _state_77 = _state;
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
				if(_list_name_result!=null&&hero_stat.contains(_list_name_result)) {
					if(_position+_list_name_result.length()<_inputLength) {
						int _next_char = _inputArray[_position+_list_name_result.length()];
						if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,new Tokens.Name.HeroStatToken(_list_name_result));
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"hero_stat");
						_furthestPosition=_position;
					}
				}
			}
			if(_state_77==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
					_furthestPosition=_position;
				}
				_position=_position_state_range_element;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_state_range_element.addAll(_token);
			_token_state_range_element.setValue(_token.getValue());
		}
		_token=_token_state_range_element;
		if(_state==FAILED) {
			support_names.reject(_position_state_range_element);
			association_names.reject(_position_state_range_element);
			room_names.reject(_position_state_range_element);
			activity_names.reject(_position_state_range_element);
			siding_names.reject(_position_state_range_element);
			item_names.reject(_position_state_range_element);
			aspect_names.reject(_position_state_range_element);
			affinity_names.reject(_position_state_range_element);
			activity_type_names.reject(_position_state_range_element);
			trail_names.reject(_position_state_range_element);
			attack_names.reject(_position_state_range_element);
			reason_names.reject(_position_state_range_element);
			trait_names.reject(_position_state_range_element);
			condition_names.reject(_position_state_range_element);
			payment_short_type_names.reject(_position_state_range_element);
			skill_names.reject(_position_state_range_element);
			map_names.reject(_position_state_range_element);
			event_names.reject(_position_state_range_element);
			image_names.reject(_position_state_range_element);
			tile_symbols.reject(_position_state_range_element);
			payment_long_type_names.reject(_position_state_range_element);
			area_names.reject(_position_state_range_element);
			structure_names.reject(_position_state_range_element);
			tile_names.reject(_position_state_range_element);
			hero_stat.reject(_position_state_range_element);
			_state=SUCCESS;
			_position_state_range_element=_position;
			_token_state_range_element=_token;
			_token=new Tokens.Rule.StateRangeElementToken();
			_token_number=_token;
			_token=new Tokens.Name.LeftToken();
			_position_number=_position;
			parse_number();
			if(_state==SUCCESS) {
				_token_number.add(_position_number,_token);
			}
			_token=_token_number;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
					_furthestPosition=_position;
				}
				_position=_position_state_range_element;
			}
			else {
				int _state_78 = _state;
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='d') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_54.left_DAYS);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain d");
						_furthestPosition=_position;
					}
				}
				if(_state_78==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
						_furthestPosition=_position;
					}
					_position=_position_state_range_element;
				}
				else {
					int _state_79 = _state;
					parse__anonymous_63();
					if(_state_79==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
							_furthestPosition=_position;
						}
						_position=_position_state_range_element;
					}
					else {
						int _state_81 = _state;
						if(_position+1-1 >=_inputLength) {
							_state=FAILED;
						}
						else {
							if(_inputArray[_position+0]!='%') {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,Tokens.Syntax.syntax_56.percent);
							_position=_position+1;
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
						else if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain %");
								_furthestPosition=_position;
							}
						}
						if(_state_81==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
								_furthestPosition=_position;
							}
							_position=_position_state_range_element;
						}
						else {
							int _state_82 = _state;
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
								if(_list_name_result!=null&&hero_stat.contains(_list_name_result)) {
									if(_position+_list_name_result.length()<_inputLength) {
										int _next_char = _inputArray[_position+_list_name_result.length()];
										if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
											_state=FAILED;
										}
									}
									if(_state==SUCCESS) {
										_token.add(_position,new Tokens.Name.HeroStatToken(_list_name_result));
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
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"hero_stat");
										_furthestPosition=_position;
									}
								}
							}
							if(_state_82==SUCCESS&&_state==FAILED) {
								_state=SUCCESS;
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"state_range_element(state_range_element)");
									_furthestPosition=_position;
								}
								_position=_position_state_range_element;
							}
							else {
							}
						}
					}
				}
			}
			if(_state==SUCCESS) {
				_token_state_range_element.addAll(_token);
				_token_state_range_element.setValue(_token.getValue());
			}
			_token=_token_state_range_element;
			if(_state==FAILED) {
				support_names.reject(_position_state_range_element);
				association_names.reject(_position_state_range_element);
				room_names.reject(_position_state_range_element);
				activity_names.reject(_position_state_range_element);
				siding_names.reject(_position_state_range_element);
				item_names.reject(_position_state_range_element);
				aspect_names.reject(_position_state_range_element);
				affinity_names.reject(_position_state_range_element);
				activity_type_names.reject(_position_state_range_element);
				trail_names.reject(_position_state_range_element);
				attack_names.reject(_position_state_range_element);
				reason_names.reject(_position_state_range_element);
				trait_names.reject(_position_state_range_element);
				condition_names.reject(_position_state_range_element);
				payment_short_type_names.reject(_position_state_range_element);
				skill_names.reject(_position_state_range_element);
				map_names.reject(_position_state_range_element);
				event_names.reject(_position_state_range_element);
				image_names.reject(_position_state_range_element);
				tile_symbols.reject(_position_state_range_element);
				payment_long_type_names.reject(_position_state_range_element);
				area_names.reject(_position_state_range_element);
				structure_names.reject(_position_state_range_element);
				tile_names.reject(_position_state_range_element);
				hero_stat.reject(_position_state_range_element);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_state_range_element);
				association_names.accept(_position_state_range_element);
				room_names.accept(_position_state_range_element);
				activity_names.accept(_position_state_range_element);
				siding_names.accept(_position_state_range_element);
				item_names.accept(_position_state_range_element);
				aspect_names.accept(_position_state_range_element);
				affinity_names.accept(_position_state_range_element);
				activity_type_names.accept(_position_state_range_element);
				trail_names.accept(_position_state_range_element);
				attack_names.accept(_position_state_range_element);
				reason_names.accept(_position_state_range_element);
				trait_names.accept(_position_state_range_element);
				condition_names.accept(_position_state_range_element);
				payment_short_type_names.accept(_position_state_range_element);
				skill_names.accept(_position_state_range_element);
				map_names.accept(_position_state_range_element);
				event_names.accept(_position_state_range_element);
				image_names.accept(_position_state_range_element);
				tile_symbols.accept(_position_state_range_element);
				payment_long_type_names.accept(_position_state_range_element);
				area_names.accept(_position_state_range_element);
				structure_names.accept(_position_state_range_element);
				tile_names.accept(_position_state_range_element);
				hero_stat.accept(_position_state_range_element);
			}
		}
	}
}