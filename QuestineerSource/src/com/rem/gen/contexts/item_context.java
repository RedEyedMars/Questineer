package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.method_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class item_context extends method_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public item_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public item_context() {
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
	public void parse_item_parameter() {
		int _position_item_parameter = -1;
		Token.Parsed _token_item_parameter = null;
		int _position_stat_range = -1;
		Token.Parsed _token_stat_range = null;
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
		_position_item_parameter=_position;
		_token_item_parameter=_token;
		_token=new Tokens.Rule.ItemParameterToken();
		if(_position+2-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='h') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='p') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_6.SYNTAX);
			_position=_position+2;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain hp");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
				_furthestPosition=_position;
			}
			_position=_position_item_parameter;
		}
		else {
			_token_stat_range=_token;
			_token=new Tokens.Name.HpToken();
			_position_stat_range=_position;
			parse_stat_range();
			if(_state==SUCCESS) {
				_token_stat_range.add(_position_stat_range,_token);
			}
			_token=_token_stat_range;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
					_furthestPosition=_position;
				}
				_position=_position_item_parameter;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_item_parameter.addAll(_token);
			_token_item_parameter.setValue(_token.getValue());
		}
		_token=_token_item_parameter;
		if(_state==FAILED) {
			support_names.reject(_position_item_parameter);
			association_names.reject(_position_item_parameter);
			room_names.reject(_position_item_parameter);
			activity_names.reject(_position_item_parameter);
			siding_names.reject(_position_item_parameter);
			item_names.reject(_position_item_parameter);
			aspect_names.reject(_position_item_parameter);
			affinity_names.reject(_position_item_parameter);
			activity_type_names.reject(_position_item_parameter);
			trail_names.reject(_position_item_parameter);
			attack_names.reject(_position_item_parameter);
			reason_names.reject(_position_item_parameter);
			trait_names.reject(_position_item_parameter);
			condition_names.reject(_position_item_parameter);
			payment_short_type_names.reject(_position_item_parameter);
			skill_names.reject(_position_item_parameter);
			map_names.reject(_position_item_parameter);
			event_names.reject(_position_item_parameter);
			image_names.reject(_position_item_parameter);
			tile_symbols.reject(_position_item_parameter);
			payment_long_type_names.reject(_position_item_parameter);
			area_names.reject(_position_item_parameter);
			structure_names.reject(_position_item_parameter);
			tile_names.reject(_position_item_parameter);
			hero_stat.reject(_position_item_parameter);
			_state=SUCCESS;
			_position_item_parameter=_position;
			_token_item_parameter=_token;
			_token=new Tokens.Rule.ItemParameterToken();
			if(_position+3-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='d') {
					_state=FAILED;
				}
				if(_inputArray[_position+1]!='m') {
					_state=FAILED;
				}
				if(_inputArray[_position+2]!='g') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_7.SYNTAX);
				_position=_position+3;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain dmg");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
					_furthestPosition=_position;
				}
				_position=_position_item_parameter;
			}
			else {
				_token_stat_range=_token;
				_token=new Tokens.Name.AttackToken();
				_position_stat_range=_position;
				parse_stat_range();
				if(_state==SUCCESS) {
					_token_stat_range.add(_position_stat_range,_token);
				}
				_token=_token_stat_range;
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
						_furthestPosition=_position;
					}
					_position=_position_item_parameter;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_item_parameter.addAll(_token);
				_token_item_parameter.setValue(_token.getValue());
			}
			_token=_token_item_parameter;
			if(_state==FAILED) {
				support_names.reject(_position_item_parameter);
				association_names.reject(_position_item_parameter);
				room_names.reject(_position_item_parameter);
				activity_names.reject(_position_item_parameter);
				siding_names.reject(_position_item_parameter);
				item_names.reject(_position_item_parameter);
				aspect_names.reject(_position_item_parameter);
				affinity_names.reject(_position_item_parameter);
				activity_type_names.reject(_position_item_parameter);
				trail_names.reject(_position_item_parameter);
				attack_names.reject(_position_item_parameter);
				reason_names.reject(_position_item_parameter);
				trait_names.reject(_position_item_parameter);
				condition_names.reject(_position_item_parameter);
				payment_short_type_names.reject(_position_item_parameter);
				skill_names.reject(_position_item_parameter);
				map_names.reject(_position_item_parameter);
				event_names.reject(_position_item_parameter);
				image_names.reject(_position_item_parameter);
				tile_symbols.reject(_position_item_parameter);
				payment_long_type_names.reject(_position_item_parameter);
				area_names.reject(_position_item_parameter);
				structure_names.reject(_position_item_parameter);
				tile_names.reject(_position_item_parameter);
				hero_stat.reject(_position_item_parameter);
				_state=SUCCESS;
				_position_item_parameter=_position;
				_token_item_parameter=_token;
				_token=new Tokens.Rule.ItemParameterToken();
				if(_position+3-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='d') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='f') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_8.SYNTAX);
					_position=_position+3;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain def");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
						_furthestPosition=_position;
					}
					_position=_position_item_parameter;
				}
				else {
					_token_stat_range=_token;
					_token=new Tokens.Name.DefenseToken();
					_position_stat_range=_position;
					parse_stat_range();
					if(_state==SUCCESS) {
						_token_stat_range.add(_position_stat_range,_token);
					}
					_token=_token_stat_range;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
							_furthestPosition=_position;
						}
						_position=_position_item_parameter;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_item_parameter.addAll(_token);
					_token_item_parameter.setValue(_token.getValue());
				}
				_token=_token_item_parameter;
				if(_state==FAILED) {
					support_names.reject(_position_item_parameter);
					association_names.reject(_position_item_parameter);
					room_names.reject(_position_item_parameter);
					activity_names.reject(_position_item_parameter);
					siding_names.reject(_position_item_parameter);
					item_names.reject(_position_item_parameter);
					aspect_names.reject(_position_item_parameter);
					affinity_names.reject(_position_item_parameter);
					activity_type_names.reject(_position_item_parameter);
					trail_names.reject(_position_item_parameter);
					attack_names.reject(_position_item_parameter);
					reason_names.reject(_position_item_parameter);
					trait_names.reject(_position_item_parameter);
					condition_names.reject(_position_item_parameter);
					payment_short_type_names.reject(_position_item_parameter);
					skill_names.reject(_position_item_parameter);
					map_names.reject(_position_item_parameter);
					event_names.reject(_position_item_parameter);
					image_names.reject(_position_item_parameter);
					tile_symbols.reject(_position_item_parameter);
					payment_long_type_names.reject(_position_item_parameter);
					area_names.reject(_position_item_parameter);
					structure_names.reject(_position_item_parameter);
					tile_names.reject(_position_item_parameter);
					hero_stat.reject(_position_item_parameter);
					_state=SUCCESS;
					_position_item_parameter=_position;
					_token_item_parameter=_token;
					_token=new Tokens.Rule.ItemParameterToken();
					if(_position+5-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='v') {
							_state=FAILED;
						}
						if(_inputArray[_position+1]!='a') {
							_state=FAILED;
						}
						if(_inputArray[_position+2]!='l') {
							_state=FAILED;
						}
						if(_inputArray[_position+3]!='u') {
							_state=FAILED;
						}
						if(_inputArray[_position+4]!='e') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_9.SYNTAX);
						_position=_position+5;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain value");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
							_furthestPosition=_position;
						}
						_position=_position_item_parameter;
					}
					else {
						_token_stat_range=_token;
						_token=new Tokens.Name.ValueToken();
						_position_stat_range=_position;
						parse_stat_range();
						if(_state==SUCCESS) {
							_token_stat_range.add(_position_stat_range,_token);
						}
						_token=_token_stat_range;
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
								_furthestPosition=_position;
							}
							_position=_position_item_parameter;
						}
						else {
						}
					}
					if(_state==SUCCESS) {
						_token_item_parameter.addAll(_token);
						_token_item_parameter.setValue(_token.getValue());
					}
					_token=_token_item_parameter;
					if(_state==FAILED) {
						support_names.reject(_position_item_parameter);
						association_names.reject(_position_item_parameter);
						room_names.reject(_position_item_parameter);
						activity_names.reject(_position_item_parameter);
						siding_names.reject(_position_item_parameter);
						item_names.reject(_position_item_parameter);
						aspect_names.reject(_position_item_parameter);
						affinity_names.reject(_position_item_parameter);
						activity_type_names.reject(_position_item_parameter);
						trail_names.reject(_position_item_parameter);
						attack_names.reject(_position_item_parameter);
						reason_names.reject(_position_item_parameter);
						trait_names.reject(_position_item_parameter);
						condition_names.reject(_position_item_parameter);
						payment_short_type_names.reject(_position_item_parameter);
						skill_names.reject(_position_item_parameter);
						map_names.reject(_position_item_parameter);
						event_names.reject(_position_item_parameter);
						image_names.reject(_position_item_parameter);
						tile_symbols.reject(_position_item_parameter);
						payment_long_type_names.reject(_position_item_parameter);
						area_names.reject(_position_item_parameter);
						structure_names.reject(_position_item_parameter);
						tile_names.reject(_position_item_parameter);
						hero_stat.reject(_position_item_parameter);
						_state=SUCCESS;
						_position_item_parameter=_position;
						_token_item_parameter=_token;
						_token=new Tokens.Rule.ItemParameterToken();
						if(_position+6-1 >=_inputLength) {
							_state=FAILED;
						}
						else {
							if(_inputArray[_position+0]!='w') {
								_state=FAILED;
							}
							if(_inputArray[_position+1]!='e') {
								_state=FAILED;
							}
							if(_inputArray[_position+2]!='i') {
								_state=FAILED;
							}
							if(_inputArray[_position+3]!='g') {
								_state=FAILED;
							}
							if(_inputArray[_position+4]!='h') {
								_state=FAILED;
							}
							if(_inputArray[_position+5]!='t') {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,Tokens.Syntax.syntax_10.SYNTAX);
							_position=_position+6;
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
						else if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain weight");
								_furthestPosition=_position;
							}
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
								_furthestPosition=_position;
							}
							_position=_position_item_parameter;
						}
						else {
							_token_stat_range=_token;
							_token=new Tokens.Name.WeightToken();
							_position_stat_range=_position;
							parse_stat_range();
							if(_state==SUCCESS) {
								_token_stat_range.add(_position_stat_range,_token);
							}
							_token=_token_stat_range;
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
									_furthestPosition=_position;
								}
								_position=_position_item_parameter;
							}
							else {
							}
						}
						if(_state==SUCCESS) {
							_token_item_parameter.addAll(_token);
							_token_item_parameter.setValue(_token.getValue());
						}
						_token=_token_item_parameter;
						if(_state==FAILED) {
							support_names.reject(_position_item_parameter);
							association_names.reject(_position_item_parameter);
							room_names.reject(_position_item_parameter);
							activity_names.reject(_position_item_parameter);
							siding_names.reject(_position_item_parameter);
							item_names.reject(_position_item_parameter);
							aspect_names.reject(_position_item_parameter);
							affinity_names.reject(_position_item_parameter);
							activity_type_names.reject(_position_item_parameter);
							trail_names.reject(_position_item_parameter);
							attack_names.reject(_position_item_parameter);
							reason_names.reject(_position_item_parameter);
							trait_names.reject(_position_item_parameter);
							condition_names.reject(_position_item_parameter);
							payment_short_type_names.reject(_position_item_parameter);
							skill_names.reject(_position_item_parameter);
							map_names.reject(_position_item_parameter);
							event_names.reject(_position_item_parameter);
							image_names.reject(_position_item_parameter);
							tile_symbols.reject(_position_item_parameter);
							payment_long_type_names.reject(_position_item_parameter);
							area_names.reject(_position_item_parameter);
							structure_names.reject(_position_item_parameter);
							tile_names.reject(_position_item_parameter);
							hero_stat.reject(_position_item_parameter);
							_state=SUCCESS;
							_position_item_parameter=_position;
							_token_item_parameter=_token;
							_token=new Tokens.Rule.ItemParameterToken();
							parse__anonymous_6();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
									_furthestPosition=_position;
								}
								_position=_position_item_parameter;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_item_parameter.addAll(_token);
								_token_item_parameter.setValue(_token.getValue());
							}
							_token=_token_item_parameter;
							if(_state==FAILED) {
								support_names.reject(_position_item_parameter);
								association_names.reject(_position_item_parameter);
								room_names.reject(_position_item_parameter);
								activity_names.reject(_position_item_parameter);
								siding_names.reject(_position_item_parameter);
								item_names.reject(_position_item_parameter);
								aspect_names.reject(_position_item_parameter);
								affinity_names.reject(_position_item_parameter);
								activity_type_names.reject(_position_item_parameter);
								trail_names.reject(_position_item_parameter);
								attack_names.reject(_position_item_parameter);
								reason_names.reject(_position_item_parameter);
								trait_names.reject(_position_item_parameter);
								condition_names.reject(_position_item_parameter);
								payment_short_type_names.reject(_position_item_parameter);
								skill_names.reject(_position_item_parameter);
								map_names.reject(_position_item_parameter);
								event_names.reject(_position_item_parameter);
								image_names.reject(_position_item_parameter);
								tile_symbols.reject(_position_item_parameter);
								payment_long_type_names.reject(_position_item_parameter);
								area_names.reject(_position_item_parameter);
								structure_names.reject(_position_item_parameter);
								tile_names.reject(_position_item_parameter);
								hero_stat.reject(_position_item_parameter);
								_state=SUCCESS;
								_position_item_parameter=_position;
								_token_item_parameter=_token;
								_token=new Tokens.Rule.ItemParameterToken();
								parse_event_statement();
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
										_furthestPosition=_position;
									}
									_position=_position_item_parameter;
								}
								else {
								}
								if(_state==SUCCESS) {
									_token_item_parameter.addAll(_token);
									_token_item_parameter.setValue(_token.getValue());
								}
								_token=_token_item_parameter;
								if(_state==FAILED) {
									support_names.reject(_position_item_parameter);
									association_names.reject(_position_item_parameter);
									room_names.reject(_position_item_parameter);
									activity_names.reject(_position_item_parameter);
									siding_names.reject(_position_item_parameter);
									item_names.reject(_position_item_parameter);
									aspect_names.reject(_position_item_parameter);
									affinity_names.reject(_position_item_parameter);
									activity_type_names.reject(_position_item_parameter);
									trail_names.reject(_position_item_parameter);
									attack_names.reject(_position_item_parameter);
									reason_names.reject(_position_item_parameter);
									trait_names.reject(_position_item_parameter);
									condition_names.reject(_position_item_parameter);
									payment_short_type_names.reject(_position_item_parameter);
									skill_names.reject(_position_item_parameter);
									map_names.reject(_position_item_parameter);
									event_names.reject(_position_item_parameter);
									image_names.reject(_position_item_parameter);
									tile_symbols.reject(_position_item_parameter);
									payment_long_type_names.reject(_position_item_parameter);
									area_names.reject(_position_item_parameter);
									structure_names.reject(_position_item_parameter);
									tile_names.reject(_position_item_parameter);
									hero_stat.reject(_position_item_parameter);
									_state=SUCCESS;
									_position_item_parameter=_position;
									_token_item_parameter=_token;
									_token=new Tokens.Rule.ItemParameterToken();
									parse__anonymous_8();
									if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
											_furthestPosition=_position;
										}
										_position=_position_item_parameter;
									}
									else {
									}
									if(_state==SUCCESS) {
										_token_item_parameter.addAll(_token);
										_token_item_parameter.setValue(_token.getValue());
									}
									_token=_token_item_parameter;
									if(_state==FAILED) {
										support_names.reject(_position_item_parameter);
										association_names.reject(_position_item_parameter);
										room_names.reject(_position_item_parameter);
										activity_names.reject(_position_item_parameter);
										siding_names.reject(_position_item_parameter);
										item_names.reject(_position_item_parameter);
										aspect_names.reject(_position_item_parameter);
										affinity_names.reject(_position_item_parameter);
										activity_type_names.reject(_position_item_parameter);
										trail_names.reject(_position_item_parameter);
										attack_names.reject(_position_item_parameter);
										reason_names.reject(_position_item_parameter);
										trait_names.reject(_position_item_parameter);
										condition_names.reject(_position_item_parameter);
										payment_short_type_names.reject(_position_item_parameter);
										skill_names.reject(_position_item_parameter);
										map_names.reject(_position_item_parameter);
										event_names.reject(_position_item_parameter);
										image_names.reject(_position_item_parameter);
										tile_symbols.reject(_position_item_parameter);
										payment_long_type_names.reject(_position_item_parameter);
										area_names.reject(_position_item_parameter);
										structure_names.reject(_position_item_parameter);
										tile_names.reject(_position_item_parameter);
										hero_stat.reject(_position_item_parameter);
										_state=SUCCESS;
										_position_item_parameter=_position;
										_token_item_parameter=_token;
										_token=new Tokens.Rule.ItemParameterToken();
										parse__anonymous_9();
										if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
												_furthestPosition=_position;
											}
											_position=_position_item_parameter;
										}
										else {
										}
										if(_state==SUCCESS) {
											_token_item_parameter.addAll(_token);
											_token_item_parameter.setValue(_token.getValue());
										}
										_token=_token_item_parameter;
										if(_state==FAILED) {
											support_names.reject(_position_item_parameter);
											association_names.reject(_position_item_parameter);
											room_names.reject(_position_item_parameter);
											activity_names.reject(_position_item_parameter);
											siding_names.reject(_position_item_parameter);
											item_names.reject(_position_item_parameter);
											aspect_names.reject(_position_item_parameter);
											affinity_names.reject(_position_item_parameter);
											activity_type_names.reject(_position_item_parameter);
											trail_names.reject(_position_item_parameter);
											attack_names.reject(_position_item_parameter);
											reason_names.reject(_position_item_parameter);
											trait_names.reject(_position_item_parameter);
											condition_names.reject(_position_item_parameter);
											payment_short_type_names.reject(_position_item_parameter);
											skill_names.reject(_position_item_parameter);
											map_names.reject(_position_item_parameter);
											event_names.reject(_position_item_parameter);
											image_names.reject(_position_item_parameter);
											tile_symbols.reject(_position_item_parameter);
											payment_long_type_names.reject(_position_item_parameter);
											area_names.reject(_position_item_parameter);
											structure_names.reject(_position_item_parameter);
											tile_names.reject(_position_item_parameter);
											hero_stat.reject(_position_item_parameter);
											_state=SUCCESS;
											_position_item_parameter=_position;
											_token_item_parameter=_token;
											_token=new Tokens.Rule.ItemParameterToken();
											parse__anonymous_10();
											if(_state==FAILED) {
												if(_position>=_furthestPosition) {
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_parameter(item_parameter)");
													_furthestPosition=_position;
												}
												_position=_position_item_parameter;
											}
											else {
											}
											if(_state==SUCCESS) {
												_token_item_parameter.addAll(_token);
												_token_item_parameter.setValue(_token.getValue());
											}
											_token=_token_item_parameter;
											if(_state==FAILED) {
												support_names.reject(_position_item_parameter);
												association_names.reject(_position_item_parameter);
												room_names.reject(_position_item_parameter);
												activity_names.reject(_position_item_parameter);
												siding_names.reject(_position_item_parameter);
												item_names.reject(_position_item_parameter);
												aspect_names.reject(_position_item_parameter);
												affinity_names.reject(_position_item_parameter);
												activity_type_names.reject(_position_item_parameter);
												trail_names.reject(_position_item_parameter);
												attack_names.reject(_position_item_parameter);
												reason_names.reject(_position_item_parameter);
												trait_names.reject(_position_item_parameter);
												condition_names.reject(_position_item_parameter);
												payment_short_type_names.reject(_position_item_parameter);
												skill_names.reject(_position_item_parameter);
												map_names.reject(_position_item_parameter);
												event_names.reject(_position_item_parameter);
												image_names.reject(_position_item_parameter);
												tile_symbols.reject(_position_item_parameter);
												payment_long_type_names.reject(_position_item_parameter);
												area_names.reject(_position_item_parameter);
												structure_names.reject(_position_item_parameter);
												tile_names.reject(_position_item_parameter);
												hero_stat.reject(_position_item_parameter);
											}
											else if(_state==SUCCESS) {
												support_names.accept(_position_item_parameter);
												association_names.accept(_position_item_parameter);
												room_names.accept(_position_item_parameter);
												activity_names.accept(_position_item_parameter);
												siding_names.accept(_position_item_parameter);
												item_names.accept(_position_item_parameter);
												aspect_names.accept(_position_item_parameter);
												affinity_names.accept(_position_item_parameter);
												activity_type_names.accept(_position_item_parameter);
												trail_names.accept(_position_item_parameter);
												attack_names.accept(_position_item_parameter);
												reason_names.accept(_position_item_parameter);
												trait_names.accept(_position_item_parameter);
												condition_names.accept(_position_item_parameter);
												payment_short_type_names.accept(_position_item_parameter);
												skill_names.accept(_position_item_parameter);
												map_names.accept(_position_item_parameter);
												event_names.accept(_position_item_parameter);
												image_names.accept(_position_item_parameter);
												tile_symbols.accept(_position_item_parameter);
												payment_long_type_names.accept(_position_item_parameter);
												area_names.accept(_position_item_parameter);
												structure_names.accept(_position_item_parameter);
												tile_names.accept(_position_item_parameter);
												hero_stat.accept(_position_item_parameter);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void parse_item_declaration() {
		int _position_item_declaration = -1;
		Token.Parsed _token_item_declaration = null;
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
		_position_item_declaration=_position;
		_token_item_declaration=_token;
		_token=new Tokens.Rule.ItemDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_5.contains(_position)) {
			_recursion_protection_NAME_5.add(_position);
			parse_NAME();
			_recursion_protection_NAME_5.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				item_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.ItemNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_declaration(item_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_item_declaration;
		}
		else {
			int _state_17 = _state;
			parse__anonymous_4();
			if(_state_17==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_declaration(item_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_item_declaration;
			}
			else {
				int _state_19 = _state;
				while(_position<_inputLength) {
					parse__anonymous_5();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_19==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_declaration(item_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_item_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_item_declaration.add(_position_item_declaration,_token);
		}
		_token=_token_item_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_item_declaration);
			association_names.reject(_position_item_declaration);
			room_names.reject(_position_item_declaration);
			activity_names.reject(_position_item_declaration);
			siding_names.reject(_position_item_declaration);
			item_names.reject(_position_item_declaration);
			aspect_names.reject(_position_item_declaration);
			affinity_names.reject(_position_item_declaration);
			activity_type_names.reject(_position_item_declaration);
			trail_names.reject(_position_item_declaration);
			attack_names.reject(_position_item_declaration);
			reason_names.reject(_position_item_declaration);
			trait_names.reject(_position_item_declaration);
			condition_names.reject(_position_item_declaration);
			payment_short_type_names.reject(_position_item_declaration);
			skill_names.reject(_position_item_declaration);
			map_names.reject(_position_item_declaration);
			event_names.reject(_position_item_declaration);
			image_names.reject(_position_item_declaration);
			tile_symbols.reject(_position_item_declaration);
			payment_long_type_names.reject(_position_item_declaration);
			area_names.reject(_position_item_declaration);
			structure_names.reject(_position_item_declaration);
			tile_names.reject(_position_item_declaration);
			hero_stat.reject(_position_item_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_item_declaration);
			association_names.accept(_position_item_declaration);
			room_names.accept(_position_item_declaration);
			activity_names.accept(_position_item_declaration);
			siding_names.accept(_position_item_declaration);
			item_names.accept(_position_item_declaration);
			aspect_names.accept(_position_item_declaration);
			affinity_names.accept(_position_item_declaration);
			activity_type_names.accept(_position_item_declaration);
			trail_names.accept(_position_item_declaration);
			attack_names.accept(_position_item_declaration);
			reason_names.accept(_position_item_declaration);
			trait_names.accept(_position_item_declaration);
			condition_names.accept(_position_item_declaration);
			payment_short_type_names.accept(_position_item_declaration);
			skill_names.accept(_position_item_declaration);
			map_names.accept(_position_item_declaration);
			event_names.accept(_position_item_declaration);
			image_names.accept(_position_item_declaration);
			tile_symbols.accept(_position_item_declaration);
			payment_long_type_names.accept(_position_item_declaration);
			area_names.accept(_position_item_declaration);
			structure_names.accept(_position_item_declaration);
			tile_names.accept(_position_item_declaration);
			hero_stat.accept(_position_item_declaration);
		}
	}
	public void parse_item_hit_element() {
		int _position_item_hit_element = -1;
		Token.Parsed _token_item_hit_element = null;
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
		_position_item_hit_element=_position;
		_token_item_hit_element=_token;
		_token=new Tokens.Rule.ItemHitElementToken();
		parse_has_chance();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_hit_element(item_hit_element)");
				_furthestPosition=_position;
			}
			_position=_position_item_hit_element;
		}
		else {
			int _state_25 = _state;
			parse_if_header();
			if(_state_25==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_hit_element(item_hit_element)");
					_furthestPosition=_position;
				}
				_position=_position_item_hit_element;
			}
			else {
				parse_std_body();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_hit_element(item_hit_element)");
						_furthestPosition=_position;
					}
					_position=_position_item_hit_element;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_item_hit_element.add(_position_item_hit_element,_token);
		}
		_token=_token_item_hit_element;
		if(_state==FAILED) {
			support_names.reject(_position_item_hit_element);
			association_names.reject(_position_item_hit_element);
			room_names.reject(_position_item_hit_element);
			activity_names.reject(_position_item_hit_element);
			siding_names.reject(_position_item_hit_element);
			item_names.reject(_position_item_hit_element);
			aspect_names.reject(_position_item_hit_element);
			affinity_names.reject(_position_item_hit_element);
			activity_type_names.reject(_position_item_hit_element);
			trail_names.reject(_position_item_hit_element);
			attack_names.reject(_position_item_hit_element);
			reason_names.reject(_position_item_hit_element);
			trait_names.reject(_position_item_hit_element);
			condition_names.reject(_position_item_hit_element);
			payment_short_type_names.reject(_position_item_hit_element);
			skill_names.reject(_position_item_hit_element);
			map_names.reject(_position_item_hit_element);
			event_names.reject(_position_item_hit_element);
			image_names.reject(_position_item_hit_element);
			tile_symbols.reject(_position_item_hit_element);
			payment_long_type_names.reject(_position_item_hit_element);
			area_names.reject(_position_item_hit_element);
			structure_names.reject(_position_item_hit_element);
			tile_names.reject(_position_item_hit_element);
			hero_stat.reject(_position_item_hit_element);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_item_hit_element);
			association_names.accept(_position_item_hit_element);
			room_names.accept(_position_item_hit_element);
			activity_names.accept(_position_item_hit_element);
			siding_names.accept(_position_item_hit_element);
			item_names.accept(_position_item_hit_element);
			aspect_names.accept(_position_item_hit_element);
			affinity_names.accept(_position_item_hit_element);
			activity_type_names.accept(_position_item_hit_element);
			trail_names.accept(_position_item_hit_element);
			attack_names.accept(_position_item_hit_element);
			reason_names.accept(_position_item_hit_element);
			trait_names.accept(_position_item_hit_element);
			condition_names.accept(_position_item_hit_element);
			payment_short_type_names.accept(_position_item_hit_element);
			skill_names.accept(_position_item_hit_element);
			map_names.accept(_position_item_hit_element);
			event_names.accept(_position_item_hit_element);
			image_names.accept(_position_item_hit_element);
			tile_symbols.accept(_position_item_hit_element);
			payment_long_type_names.accept(_position_item_hit_element);
			area_names.accept(_position_item_hit_element);
			structure_names.accept(_position_item_hit_element);
			tile_names.accept(_position_item_hit_element);
			hero_stat.accept(_position_item_hit_element);
		}
	}
}