package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.select_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class activity_context extends select_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public activity_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public activity_context() {
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
	public void parse_activity_element() {
		int _position_activity_element = -1;
		Token.Parsed _token_activity_element = null;
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
		_position_activity_element=_position;
		_token_activity_element=_token;
		_token=new Tokens.Rule.ActivityElementToken();
		parse_comments();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
				_furthestPosition=_position;
			}
			_position=_position_activity_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_activity_element.addAll(_token);
			_token_activity_element.setValue(_token.getValue());
		}
		_token=_token_activity_element;
		if(_state==FAILED) {
			support_names.reject(_position_activity_element);
			association_names.reject(_position_activity_element);
			room_names.reject(_position_activity_element);
			activity_names.reject(_position_activity_element);
			siding_names.reject(_position_activity_element);
			item_names.reject(_position_activity_element);
			aspect_names.reject(_position_activity_element);
			affinity_names.reject(_position_activity_element);
			activity_type_names.reject(_position_activity_element);
			trail_names.reject(_position_activity_element);
			attack_names.reject(_position_activity_element);
			reason_names.reject(_position_activity_element);
			trait_names.reject(_position_activity_element);
			condition_names.reject(_position_activity_element);
			payment_short_type_names.reject(_position_activity_element);
			skill_names.reject(_position_activity_element);
			map_names.reject(_position_activity_element);
			event_names.reject(_position_activity_element);
			image_names.reject(_position_activity_element);
			tile_symbols.reject(_position_activity_element);
			payment_long_type_names.reject(_position_activity_element);
			area_names.reject(_position_activity_element);
			structure_names.reject(_position_activity_element);
			tile_names.reject(_position_activity_element);
			hero_stat.reject(_position_activity_element);
			_state=SUCCESS;
			_position_activity_element=_position;
			_token_activity_element=_token;
			_token=new Tokens.Rule.ActivityElementToken();
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
					_furthestPosition=_position;
				}
				_position=_position_activity_element;
			}
			else {
				parse_variable_declaration();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
						_furthestPosition=_position;
					}
					_position=_position_activity_element;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_activity_element.addAll(_token);
				_token_activity_element.setValue(_token.getValue());
			}
			_token=_token_activity_element;
			if(_state==FAILED) {
				support_names.reject(_position_activity_element);
				association_names.reject(_position_activity_element);
				room_names.reject(_position_activity_element);
				activity_names.reject(_position_activity_element);
				siding_names.reject(_position_activity_element);
				item_names.reject(_position_activity_element);
				aspect_names.reject(_position_activity_element);
				affinity_names.reject(_position_activity_element);
				activity_type_names.reject(_position_activity_element);
				trail_names.reject(_position_activity_element);
				attack_names.reject(_position_activity_element);
				reason_names.reject(_position_activity_element);
				trait_names.reject(_position_activity_element);
				condition_names.reject(_position_activity_element);
				payment_short_type_names.reject(_position_activity_element);
				skill_names.reject(_position_activity_element);
				map_names.reject(_position_activity_element);
				event_names.reject(_position_activity_element);
				image_names.reject(_position_activity_element);
				tile_symbols.reject(_position_activity_element);
				payment_long_type_names.reject(_position_activity_element);
				area_names.reject(_position_activity_element);
				structure_names.reject(_position_activity_element);
				tile_names.reject(_position_activity_element);
				hero_stat.reject(_position_activity_element);
				_state=SUCCESS;
				_position_activity_element=_position;
				_token_activity_element=_token;
				_token=new Tokens.Rule.ActivityElementToken();
				if(_position+3-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='g') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='t') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_24.SYNTAX);
					_position=_position+3;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain get");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
						_furthestPosition=_position;
					}
					_position=_position_activity_element;
				}
				else {
					parse__anonymous_24();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
							_furthestPosition=_position;
						}
						_position=_position_activity_element;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_activity_element.addAll(_token);
					_token_activity_element.setValue(_token.getValue());
				}
				_token=_token_activity_element;
				if(_state==FAILED) {
					support_names.reject(_position_activity_element);
					association_names.reject(_position_activity_element);
					room_names.reject(_position_activity_element);
					activity_names.reject(_position_activity_element);
					siding_names.reject(_position_activity_element);
					item_names.reject(_position_activity_element);
					aspect_names.reject(_position_activity_element);
					affinity_names.reject(_position_activity_element);
					activity_type_names.reject(_position_activity_element);
					trail_names.reject(_position_activity_element);
					attack_names.reject(_position_activity_element);
					reason_names.reject(_position_activity_element);
					trait_names.reject(_position_activity_element);
					condition_names.reject(_position_activity_element);
					payment_short_type_names.reject(_position_activity_element);
					skill_names.reject(_position_activity_element);
					map_names.reject(_position_activity_element);
					event_names.reject(_position_activity_element);
					image_names.reject(_position_activity_element);
					tile_symbols.reject(_position_activity_element);
					payment_long_type_names.reject(_position_activity_element);
					area_names.reject(_position_activity_element);
					structure_names.reject(_position_activity_element);
					tile_names.reject(_position_activity_element);
					hero_stat.reject(_position_activity_element);
					_state=SUCCESS;
					_position_activity_element=_position;
					_token_activity_element=_token;
					_token=new Tokens.Rule.ActivityElementToken();
					parse__anonymous_27();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
							_furthestPosition=_position;
						}
						_position=_position_activity_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_activity_element.addAll(_token);
						_token_activity_element.setValue(_token.getValue());
					}
					_token=_token_activity_element;
					if(_state==FAILED) {
						support_names.reject(_position_activity_element);
						association_names.reject(_position_activity_element);
						room_names.reject(_position_activity_element);
						activity_names.reject(_position_activity_element);
						siding_names.reject(_position_activity_element);
						item_names.reject(_position_activity_element);
						aspect_names.reject(_position_activity_element);
						affinity_names.reject(_position_activity_element);
						activity_type_names.reject(_position_activity_element);
						trail_names.reject(_position_activity_element);
						attack_names.reject(_position_activity_element);
						reason_names.reject(_position_activity_element);
						trait_names.reject(_position_activity_element);
						condition_names.reject(_position_activity_element);
						payment_short_type_names.reject(_position_activity_element);
						skill_names.reject(_position_activity_element);
						map_names.reject(_position_activity_element);
						event_names.reject(_position_activity_element);
						image_names.reject(_position_activity_element);
						tile_symbols.reject(_position_activity_element);
						payment_long_type_names.reject(_position_activity_element);
						area_names.reject(_position_activity_element);
						structure_names.reject(_position_activity_element);
						tile_names.reject(_position_activity_element);
						hero_stat.reject(_position_activity_element);
						_state=SUCCESS;
						_position_activity_element=_position;
						_token_activity_element=_token;
						_token=new Tokens.Rule.ActivityElementToken();
						parse__anonymous_29();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
								_furthestPosition=_position;
							}
							_position=_position_activity_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_activity_element.addAll(_token);
							_token_activity_element.setValue(_token.getValue());
						}
						_token=_token_activity_element;
						if(_state==FAILED) {
							support_names.reject(_position_activity_element);
							association_names.reject(_position_activity_element);
							room_names.reject(_position_activity_element);
							activity_names.reject(_position_activity_element);
							siding_names.reject(_position_activity_element);
							item_names.reject(_position_activity_element);
							aspect_names.reject(_position_activity_element);
							affinity_names.reject(_position_activity_element);
							activity_type_names.reject(_position_activity_element);
							trail_names.reject(_position_activity_element);
							attack_names.reject(_position_activity_element);
							reason_names.reject(_position_activity_element);
							trait_names.reject(_position_activity_element);
							condition_names.reject(_position_activity_element);
							payment_short_type_names.reject(_position_activity_element);
							skill_names.reject(_position_activity_element);
							map_names.reject(_position_activity_element);
							event_names.reject(_position_activity_element);
							image_names.reject(_position_activity_element);
							tile_symbols.reject(_position_activity_element);
							payment_long_type_names.reject(_position_activity_element);
							area_names.reject(_position_activity_element);
							structure_names.reject(_position_activity_element);
							tile_names.reject(_position_activity_element);
							hero_stat.reject(_position_activity_element);
							_state=SUCCESS;
							_position_activity_element=_position;
							_token_activity_element=_token;
							_token=new Tokens.Rule.ActivityElementToken();
							parse__anonymous_30();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
									_furthestPosition=_position;
								}
								_position=_position_activity_element;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_activity_element.addAll(_token);
								_token_activity_element.setValue(_token.getValue());
							}
							_token=_token_activity_element;
							if(_state==FAILED) {
								support_names.reject(_position_activity_element);
								association_names.reject(_position_activity_element);
								room_names.reject(_position_activity_element);
								activity_names.reject(_position_activity_element);
								siding_names.reject(_position_activity_element);
								item_names.reject(_position_activity_element);
								aspect_names.reject(_position_activity_element);
								affinity_names.reject(_position_activity_element);
								activity_type_names.reject(_position_activity_element);
								trail_names.reject(_position_activity_element);
								attack_names.reject(_position_activity_element);
								reason_names.reject(_position_activity_element);
								trait_names.reject(_position_activity_element);
								condition_names.reject(_position_activity_element);
								payment_short_type_names.reject(_position_activity_element);
								skill_names.reject(_position_activity_element);
								map_names.reject(_position_activity_element);
								event_names.reject(_position_activity_element);
								image_names.reject(_position_activity_element);
								tile_symbols.reject(_position_activity_element);
								payment_long_type_names.reject(_position_activity_element);
								area_names.reject(_position_activity_element);
								structure_names.reject(_position_activity_element);
								tile_names.reject(_position_activity_element);
								hero_stat.reject(_position_activity_element);
								_state=SUCCESS;
								_position_activity_element=_position;
								_token_activity_element=_token;
								_token=new Tokens.Rule.ActivityElementToken();
								parse_event_statement();
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
										_furthestPosition=_position;
									}
									_position=_position_activity_element;
								}
								else {
								}
								if(_state==SUCCESS) {
									_token_activity_element.addAll(_token);
									_token_activity_element.setValue(_token.getValue());
								}
								_token=_token_activity_element;
								if(_state==FAILED) {
									support_names.reject(_position_activity_element);
									association_names.reject(_position_activity_element);
									room_names.reject(_position_activity_element);
									activity_names.reject(_position_activity_element);
									siding_names.reject(_position_activity_element);
									item_names.reject(_position_activity_element);
									aspect_names.reject(_position_activity_element);
									affinity_names.reject(_position_activity_element);
									activity_type_names.reject(_position_activity_element);
									trail_names.reject(_position_activity_element);
									attack_names.reject(_position_activity_element);
									reason_names.reject(_position_activity_element);
									trait_names.reject(_position_activity_element);
									condition_names.reject(_position_activity_element);
									payment_short_type_names.reject(_position_activity_element);
									skill_names.reject(_position_activity_element);
									map_names.reject(_position_activity_element);
									event_names.reject(_position_activity_element);
									image_names.reject(_position_activity_element);
									tile_symbols.reject(_position_activity_element);
									payment_long_type_names.reject(_position_activity_element);
									area_names.reject(_position_activity_element);
									structure_names.reject(_position_activity_element);
									tile_names.reject(_position_activity_element);
									hero_stat.reject(_position_activity_element);
									_state=SUCCESS;
									_position_activity_element=_position;
									_token_activity_element=_token;
									_token=new Tokens.Rule.ActivityElementToken();
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
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_element(activity_element)");
											_furthestPosition=_position;
										}
										_position=_position_activity_element;
									}
									else {
									}
									if(_state==SUCCESS) {
										_token_activity_element.addAll(_token);
										_token_activity_element.setValue(_token.getValue());
									}
									_token=_token_activity_element;
									if(_state==FAILED) {
										support_names.reject(_position_activity_element);
										association_names.reject(_position_activity_element);
										room_names.reject(_position_activity_element);
										activity_names.reject(_position_activity_element);
										siding_names.reject(_position_activity_element);
										item_names.reject(_position_activity_element);
										aspect_names.reject(_position_activity_element);
										affinity_names.reject(_position_activity_element);
										activity_type_names.reject(_position_activity_element);
										trail_names.reject(_position_activity_element);
										attack_names.reject(_position_activity_element);
										reason_names.reject(_position_activity_element);
										trait_names.reject(_position_activity_element);
										condition_names.reject(_position_activity_element);
										payment_short_type_names.reject(_position_activity_element);
										skill_names.reject(_position_activity_element);
										map_names.reject(_position_activity_element);
										event_names.reject(_position_activity_element);
										image_names.reject(_position_activity_element);
										tile_symbols.reject(_position_activity_element);
										payment_long_type_names.reject(_position_activity_element);
										area_names.reject(_position_activity_element);
										structure_names.reject(_position_activity_element);
										tile_names.reject(_position_activity_element);
										hero_stat.reject(_position_activity_element);
									}
									else if(_state==SUCCESS) {
										support_names.accept(_position_activity_element);
										association_names.accept(_position_activity_element);
										room_names.accept(_position_activity_element);
										activity_names.accept(_position_activity_element);
										siding_names.accept(_position_activity_element);
										item_names.accept(_position_activity_element);
										aspect_names.accept(_position_activity_element);
										affinity_names.accept(_position_activity_element);
										activity_type_names.accept(_position_activity_element);
										trail_names.accept(_position_activity_element);
										attack_names.accept(_position_activity_element);
										reason_names.accept(_position_activity_element);
										trait_names.accept(_position_activity_element);
										condition_names.accept(_position_activity_element);
										payment_short_type_names.accept(_position_activity_element);
										skill_names.accept(_position_activity_element);
										map_names.accept(_position_activity_element);
										event_names.accept(_position_activity_element);
										image_names.accept(_position_activity_element);
										tile_symbols.accept(_position_activity_element);
										payment_long_type_names.accept(_position_activity_element);
										area_names.accept(_position_activity_element);
										structure_names.accept(_position_activity_element);
										tile_names.accept(_position_activity_element);
										hero_stat.accept(_position_activity_element);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void parse_activity_statement() {
		int _position_activity_statement = -1;
		Token.Parsed _token_activity_statement = null;
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
		_position_activity_statement=_position;
		_token_activity_statement=_token;
		_token=new Tokens.Rule.ActivityStatementToken();
		parse_variable_call();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_statement(activity_statement)");
				_furthestPosition=_position;
			}
			_position=_position_activity_statement;
		}
		else {
			int _state_176 = _state;
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!=':') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_59.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain :");
					_furthestPosition=_position;
				}
			}
			if(_state_176==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_statement(activity_statement)");
					_furthestPosition=_position;
				}
				_position=_position_activity_statement;
			}
			else {
				parse__anonymous_154();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_statement(activity_statement)");
						_furthestPosition=_position;
					}
					_position=_position_activity_statement;
				}
				else {
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
						if(_list_name_result!=null&&activity_names.contains(_list_name_result)) {
							if(_position+_list_name_result.length()<_inputLength) {
								int _next_char = _inputArray[_position+_list_name_result.length()];
								if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,new Tokens.Name.ActivityNamesToken(_list_name_result));
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
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_names");
								_furthestPosition=_position;
							}
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_statement(activity_statement)");
							_furthestPosition=_position;
						}
						_position=_position_activity_statement;
					}
					else {
						parse__anonymous_155();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_statement(activity_statement)");
								_furthestPosition=_position;
							}
							_position=_position_activity_statement;
						}
						else {
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_activity_statement.add(_position_activity_statement,_token);
		}
		_token=_token_activity_statement;
		if(_state==FAILED) {
			support_names.reject(_position_activity_statement);
			association_names.reject(_position_activity_statement);
			room_names.reject(_position_activity_statement);
			activity_names.reject(_position_activity_statement);
			siding_names.reject(_position_activity_statement);
			item_names.reject(_position_activity_statement);
			aspect_names.reject(_position_activity_statement);
			affinity_names.reject(_position_activity_statement);
			activity_type_names.reject(_position_activity_statement);
			trail_names.reject(_position_activity_statement);
			attack_names.reject(_position_activity_statement);
			reason_names.reject(_position_activity_statement);
			trait_names.reject(_position_activity_statement);
			condition_names.reject(_position_activity_statement);
			payment_short_type_names.reject(_position_activity_statement);
			skill_names.reject(_position_activity_statement);
			map_names.reject(_position_activity_statement);
			event_names.reject(_position_activity_statement);
			image_names.reject(_position_activity_statement);
			tile_symbols.reject(_position_activity_statement);
			payment_long_type_names.reject(_position_activity_statement);
			area_names.reject(_position_activity_statement);
			structure_names.reject(_position_activity_statement);
			tile_names.reject(_position_activity_statement);
			hero_stat.reject(_position_activity_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_activity_statement);
			association_names.accept(_position_activity_statement);
			room_names.accept(_position_activity_statement);
			activity_names.accept(_position_activity_statement);
			siding_names.accept(_position_activity_statement);
			item_names.accept(_position_activity_statement);
			aspect_names.accept(_position_activity_statement);
			affinity_names.accept(_position_activity_statement);
			activity_type_names.accept(_position_activity_statement);
			trail_names.accept(_position_activity_statement);
			attack_names.accept(_position_activity_statement);
			reason_names.accept(_position_activity_statement);
			trait_names.accept(_position_activity_statement);
			condition_names.accept(_position_activity_statement);
			payment_short_type_names.accept(_position_activity_statement);
			skill_names.accept(_position_activity_statement);
			map_names.accept(_position_activity_statement);
			event_names.accept(_position_activity_statement);
			image_names.accept(_position_activity_statement);
			tile_symbols.accept(_position_activity_statement);
			payment_long_type_names.accept(_position_activity_statement);
			area_names.accept(_position_activity_statement);
			structure_names.accept(_position_activity_statement);
			tile_names.accept(_position_activity_statement);
			hero_stat.accept(_position_activity_statement);
		}
	}
	public void parse_activity_type_declaration() {
		int _position_activity_type_declaration = -1;
		Token.Parsed _token_activity_type_declaration = null;
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
		_position_activity_type_declaration=_position;
		_token_activity_type_declaration=_token;
		_token=new Tokens.Rule.ActivityTypeDeclarationToken();
		int _state_44 = _state;
		boolean _iteration_achieved_44 = false;
		while(_position<_inputLength) {
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
				break;
			}
			else {
				_iteration_achieved_44=true;
			}
		}
		if(_iteration_achieved_44==false) {
			_state=FAILED;
		}
		else if(_state_44==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_declaration(activity_type_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_activity_type_declaration;
		}
		else {
			parse__anonymous_31();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_declaration(activity_type_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_activity_type_declaration;
			}
			else {
				int _state_45 = _state;
				boolean _iteration_achieved_45 = false;
				while(_position<_inputLength) {
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
						break;
					}
					else {
						_iteration_achieved_45=true;
					}
				}
				if(_iteration_achieved_45==false) {
					_state=FAILED;
				}
				else if(_state_45==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_declaration(activity_type_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_activity_type_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_activity_type_declaration.add(_position_activity_type_declaration,_token);
		}
		_token=_token_activity_type_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_activity_type_declaration);
			association_names.reject(_position_activity_type_declaration);
			room_names.reject(_position_activity_type_declaration);
			activity_names.reject(_position_activity_type_declaration);
			siding_names.reject(_position_activity_type_declaration);
			item_names.reject(_position_activity_type_declaration);
			aspect_names.reject(_position_activity_type_declaration);
			affinity_names.reject(_position_activity_type_declaration);
			activity_type_names.reject(_position_activity_type_declaration);
			trail_names.reject(_position_activity_type_declaration);
			attack_names.reject(_position_activity_type_declaration);
			reason_names.reject(_position_activity_type_declaration);
			trait_names.reject(_position_activity_type_declaration);
			condition_names.reject(_position_activity_type_declaration);
			payment_short_type_names.reject(_position_activity_type_declaration);
			skill_names.reject(_position_activity_type_declaration);
			map_names.reject(_position_activity_type_declaration);
			event_names.reject(_position_activity_type_declaration);
			image_names.reject(_position_activity_type_declaration);
			tile_symbols.reject(_position_activity_type_declaration);
			payment_long_type_names.reject(_position_activity_type_declaration);
			area_names.reject(_position_activity_type_declaration);
			structure_names.reject(_position_activity_type_declaration);
			tile_names.reject(_position_activity_type_declaration);
			hero_stat.reject(_position_activity_type_declaration);
			_state=SUCCESS;
			_position_activity_type_declaration=_position;
			_token_activity_type_declaration=_token;
			_token=new Tokens.Rule.ActivityTypeDeclarationToken();
			int _state_46 = _state;
			boolean _iteration_achieved_46 = false;
			while(_position<_inputLength) {
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
					break;
				}
				else {
					_iteration_achieved_46=true;
				}
			}
			if(_iteration_achieved_46==false) {
				_state=FAILED;
			}
			else if(_state_46==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_declaration(activity_type_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_activity_type_declaration;
			}
			else {
				parse_NAME();
				if(_state==SUCCESS) {
					String _value = _token.getLastValue();
					if(_value!=null) {
						activity_type_names.add(_value);
					}
					_token.add(_position,new Tokens.Name.ActivityTypeNameToken(_value));
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_declaration(activity_type_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_activity_type_declaration;
				}
				else {
					int _state_47 = _state;
					boolean _iteration_achieved_47 = false;
					while(_position<_inputLength) {
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
							break;
						}
						else {
							_iteration_achieved_47=true;
						}
					}
					if(_iteration_achieved_47==false) {
						_state=FAILED;
					}
					else if(_state_47==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_declaration(activity_type_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_activity_type_declaration;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_activity_type_declaration.add(_position_activity_type_declaration,_token);
			}
			_token=_token_activity_type_declaration;
			if(_state==FAILED) {
				support_names.reject(_position_activity_type_declaration);
				association_names.reject(_position_activity_type_declaration);
				room_names.reject(_position_activity_type_declaration);
				activity_names.reject(_position_activity_type_declaration);
				siding_names.reject(_position_activity_type_declaration);
				item_names.reject(_position_activity_type_declaration);
				aspect_names.reject(_position_activity_type_declaration);
				affinity_names.reject(_position_activity_type_declaration);
				activity_type_names.reject(_position_activity_type_declaration);
				trail_names.reject(_position_activity_type_declaration);
				attack_names.reject(_position_activity_type_declaration);
				reason_names.reject(_position_activity_type_declaration);
				trait_names.reject(_position_activity_type_declaration);
				condition_names.reject(_position_activity_type_declaration);
				payment_short_type_names.reject(_position_activity_type_declaration);
				skill_names.reject(_position_activity_type_declaration);
				map_names.reject(_position_activity_type_declaration);
				event_names.reject(_position_activity_type_declaration);
				image_names.reject(_position_activity_type_declaration);
				tile_symbols.reject(_position_activity_type_declaration);
				payment_long_type_names.reject(_position_activity_type_declaration);
				area_names.reject(_position_activity_type_declaration);
				structure_names.reject(_position_activity_type_declaration);
				tile_names.reject(_position_activity_type_declaration);
				hero_stat.reject(_position_activity_type_declaration);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_activity_type_declaration);
				association_names.accept(_position_activity_type_declaration);
				room_names.accept(_position_activity_type_declaration);
				activity_names.accept(_position_activity_type_declaration);
				siding_names.accept(_position_activity_type_declaration);
				item_names.accept(_position_activity_type_declaration);
				aspect_names.accept(_position_activity_type_declaration);
				affinity_names.accept(_position_activity_type_declaration);
				activity_type_names.accept(_position_activity_type_declaration);
				trail_names.accept(_position_activity_type_declaration);
				attack_names.accept(_position_activity_type_declaration);
				reason_names.accept(_position_activity_type_declaration);
				trait_names.accept(_position_activity_type_declaration);
				condition_names.accept(_position_activity_type_declaration);
				payment_short_type_names.accept(_position_activity_type_declaration);
				skill_names.accept(_position_activity_type_declaration);
				map_names.accept(_position_activity_type_declaration);
				event_names.accept(_position_activity_type_declaration);
				image_names.accept(_position_activity_type_declaration);
				tile_symbols.accept(_position_activity_type_declaration);
				payment_long_type_names.accept(_position_activity_type_declaration);
				area_names.accept(_position_activity_type_declaration);
				structure_names.accept(_position_activity_type_declaration);
				tile_names.accept(_position_activity_type_declaration);
				hero_stat.accept(_position_activity_type_declaration);
			}
		}
	}
	public void parse_activity_declaration() {
		int _position_activity_declaration = -1;
		Token.Parsed _token_activity_declaration = null;
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
		_position_activity_declaration=_position;
		_token_activity_declaration=_token;
		_token=new Tokens.Rule.ActivityDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_12.contains(_position)) {
			_recursion_protection_NAME_12.add(_position);
			parse_NAME();
			_recursion_protection_NAME_12.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				activity_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.ActivityNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_declaration(activity_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_activity_declaration;
		}
		else {
			int _state_39 = _state;
			parse_method_parameters();
			if(_state_39==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_declaration(activity_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_activity_declaration;
			}
			else {
				int _state_40 = _state;
				parse__anonymous_22();
				if(_state_40==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_declaration(activity_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_activity_declaration;
				}
				else {
					int _state_42 = _state;
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
					if(_state_42==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_declaration(activity_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_activity_declaration;
					}
					else {
						parse_DESCRIPTION();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_declaration(activity_declaration)");
								_furthestPosition=_position;
							}
							_position=_position_activity_declaration;
						}
						else {
							int _state_43 = _state;
							while(_position<_inputLength) {
								parse_activity_element();
								if(_state==FAILED) {
									break;
								}
							}
							if(_state_43==SUCCESS&&_state==FAILED) {
								_state=SUCCESS;
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_declaration(activity_declaration)");
									_furthestPosition=_position;
								}
								_position=_position_activity_declaration;
							}
							else {
							}
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_activity_declaration.add(_position_activity_declaration,_token);
		}
		_token=_token_activity_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_activity_declaration);
			association_names.reject(_position_activity_declaration);
			room_names.reject(_position_activity_declaration);
			activity_names.reject(_position_activity_declaration);
			siding_names.reject(_position_activity_declaration);
			item_names.reject(_position_activity_declaration);
			aspect_names.reject(_position_activity_declaration);
			affinity_names.reject(_position_activity_declaration);
			activity_type_names.reject(_position_activity_declaration);
			trail_names.reject(_position_activity_declaration);
			attack_names.reject(_position_activity_declaration);
			reason_names.reject(_position_activity_declaration);
			trait_names.reject(_position_activity_declaration);
			condition_names.reject(_position_activity_declaration);
			payment_short_type_names.reject(_position_activity_declaration);
			skill_names.reject(_position_activity_declaration);
			map_names.reject(_position_activity_declaration);
			event_names.reject(_position_activity_declaration);
			image_names.reject(_position_activity_declaration);
			tile_symbols.reject(_position_activity_declaration);
			payment_long_type_names.reject(_position_activity_declaration);
			area_names.reject(_position_activity_declaration);
			structure_names.reject(_position_activity_declaration);
			tile_names.reject(_position_activity_declaration);
			hero_stat.reject(_position_activity_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_activity_declaration);
			association_names.accept(_position_activity_declaration);
			room_names.accept(_position_activity_declaration);
			activity_names.accept(_position_activity_declaration);
			siding_names.accept(_position_activity_declaration);
			item_names.accept(_position_activity_declaration);
			aspect_names.accept(_position_activity_declaration);
			affinity_names.accept(_position_activity_declaration);
			activity_type_names.accept(_position_activity_declaration);
			trail_names.accept(_position_activity_declaration);
			attack_names.accept(_position_activity_declaration);
			reason_names.accept(_position_activity_declaration);
			trait_names.accept(_position_activity_declaration);
			condition_names.accept(_position_activity_declaration);
			payment_short_type_names.accept(_position_activity_declaration);
			skill_names.accept(_position_activity_declaration);
			map_names.accept(_position_activity_declaration);
			event_names.accept(_position_activity_declaration);
			image_names.accept(_position_activity_declaration);
			tile_symbols.accept(_position_activity_declaration);
			payment_long_type_names.accept(_position_activity_declaration);
			area_names.accept(_position_activity_declaration);
			structure_names.accept(_position_activity_declaration);
			tile_names.accept(_position_activity_declaration);
			hero_stat.accept(_position_activity_declaration);
		}
	}
}