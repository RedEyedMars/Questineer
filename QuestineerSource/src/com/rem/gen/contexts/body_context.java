package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.if_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class body_context extends if_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public body_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public body_context() {
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
	public void parse_body_defined_statement() {
		int _position_body_defined_statement = -1;
		Token.Parsed _token_body_defined_statement = null;
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
		_position_body_defined_statement=_position;
		_token_body_defined_statement=_token;
		_token=new Tokens.Rule.BodyDefinedStatementToken();
		parse__anonymous_138();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
				_furthestPosition=_position;
			}
			_position=_position_body_defined_statement;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_body_defined_statement.addAll(_token);
			_token_body_defined_statement.setValue(_token.getValue());
		}
		_token=_token_body_defined_statement;
		if(_state==FAILED) {
			support_names.reject(_position_body_defined_statement);
			association_names.reject(_position_body_defined_statement);
			room_names.reject(_position_body_defined_statement);
			activity_names.reject(_position_body_defined_statement);
			siding_names.reject(_position_body_defined_statement);
			item_names.reject(_position_body_defined_statement);
			aspect_names.reject(_position_body_defined_statement);
			affinity_names.reject(_position_body_defined_statement);
			activity_type_names.reject(_position_body_defined_statement);
			trail_names.reject(_position_body_defined_statement);
			attack_names.reject(_position_body_defined_statement);
			reason_names.reject(_position_body_defined_statement);
			trait_names.reject(_position_body_defined_statement);
			condition_names.reject(_position_body_defined_statement);
			payment_short_type_names.reject(_position_body_defined_statement);
			skill_names.reject(_position_body_defined_statement);
			map_names.reject(_position_body_defined_statement);
			event_names.reject(_position_body_defined_statement);
			image_names.reject(_position_body_defined_statement);
			tile_symbols.reject(_position_body_defined_statement);
			payment_long_type_names.reject(_position_body_defined_statement);
			area_names.reject(_position_body_defined_statement);
			structure_names.reject(_position_body_defined_statement);
			tile_names.reject(_position_body_defined_statement);
			hero_stat.reject(_position_body_defined_statement);
			_state=SUCCESS;
			_position_body_defined_statement=_position;
			_token_body_defined_statement=_token;
			_token=new Tokens.Rule.BodyDefinedStatementToken();
			parse__anonymous_139();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
					_furthestPosition=_position;
				}
				_position=_position_body_defined_statement;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_body_defined_statement.addAll(_token);
				_token_body_defined_statement.setValue(_token.getValue());
			}
			_token=_token_body_defined_statement;
			if(_state==FAILED) {
				support_names.reject(_position_body_defined_statement);
				association_names.reject(_position_body_defined_statement);
				room_names.reject(_position_body_defined_statement);
				activity_names.reject(_position_body_defined_statement);
				siding_names.reject(_position_body_defined_statement);
				item_names.reject(_position_body_defined_statement);
				aspect_names.reject(_position_body_defined_statement);
				affinity_names.reject(_position_body_defined_statement);
				activity_type_names.reject(_position_body_defined_statement);
				trail_names.reject(_position_body_defined_statement);
				attack_names.reject(_position_body_defined_statement);
				reason_names.reject(_position_body_defined_statement);
				trait_names.reject(_position_body_defined_statement);
				condition_names.reject(_position_body_defined_statement);
				payment_short_type_names.reject(_position_body_defined_statement);
				skill_names.reject(_position_body_defined_statement);
				map_names.reject(_position_body_defined_statement);
				event_names.reject(_position_body_defined_statement);
				image_names.reject(_position_body_defined_statement);
				tile_symbols.reject(_position_body_defined_statement);
				payment_long_type_names.reject(_position_body_defined_statement);
				area_names.reject(_position_body_defined_statement);
				structure_names.reject(_position_body_defined_statement);
				tile_names.reject(_position_body_defined_statement);
				hero_stat.reject(_position_body_defined_statement);
				_state=SUCCESS;
				_position_body_defined_statement=_position;
				_token_body_defined_statement=_token;
				_token=new Tokens.Rule.BodyDefinedStatementToken();
				parse__anonymous_140();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
						_furthestPosition=_position;
					}
					_position=_position_body_defined_statement;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_body_defined_statement.addAll(_token);
					_token_body_defined_statement.setValue(_token.getValue());
				}
				_token=_token_body_defined_statement;
				if(_state==FAILED) {
					support_names.reject(_position_body_defined_statement);
					association_names.reject(_position_body_defined_statement);
					room_names.reject(_position_body_defined_statement);
					activity_names.reject(_position_body_defined_statement);
					siding_names.reject(_position_body_defined_statement);
					item_names.reject(_position_body_defined_statement);
					aspect_names.reject(_position_body_defined_statement);
					affinity_names.reject(_position_body_defined_statement);
					activity_type_names.reject(_position_body_defined_statement);
					trail_names.reject(_position_body_defined_statement);
					attack_names.reject(_position_body_defined_statement);
					reason_names.reject(_position_body_defined_statement);
					trait_names.reject(_position_body_defined_statement);
					condition_names.reject(_position_body_defined_statement);
					payment_short_type_names.reject(_position_body_defined_statement);
					skill_names.reject(_position_body_defined_statement);
					map_names.reject(_position_body_defined_statement);
					event_names.reject(_position_body_defined_statement);
					image_names.reject(_position_body_defined_statement);
					tile_symbols.reject(_position_body_defined_statement);
					payment_long_type_names.reject(_position_body_defined_statement);
					area_names.reject(_position_body_defined_statement);
					structure_names.reject(_position_body_defined_statement);
					tile_names.reject(_position_body_defined_statement);
					hero_stat.reject(_position_body_defined_statement);
					_state=SUCCESS;
					_position_body_defined_statement=_position;
					_token_body_defined_statement=_token;
					_token=new Tokens.Rule.BodyDefinedStatementToken();
					parse__anonymous_141();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
							_furthestPosition=_position;
						}
						_position=_position_body_defined_statement;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_body_defined_statement.addAll(_token);
						_token_body_defined_statement.setValue(_token.getValue());
					}
					_token=_token_body_defined_statement;
					if(_state==FAILED) {
						support_names.reject(_position_body_defined_statement);
						association_names.reject(_position_body_defined_statement);
						room_names.reject(_position_body_defined_statement);
						activity_names.reject(_position_body_defined_statement);
						siding_names.reject(_position_body_defined_statement);
						item_names.reject(_position_body_defined_statement);
						aspect_names.reject(_position_body_defined_statement);
						affinity_names.reject(_position_body_defined_statement);
						activity_type_names.reject(_position_body_defined_statement);
						trail_names.reject(_position_body_defined_statement);
						attack_names.reject(_position_body_defined_statement);
						reason_names.reject(_position_body_defined_statement);
						trait_names.reject(_position_body_defined_statement);
						condition_names.reject(_position_body_defined_statement);
						payment_short_type_names.reject(_position_body_defined_statement);
						skill_names.reject(_position_body_defined_statement);
						map_names.reject(_position_body_defined_statement);
						event_names.reject(_position_body_defined_statement);
						image_names.reject(_position_body_defined_statement);
						tile_symbols.reject(_position_body_defined_statement);
						payment_long_type_names.reject(_position_body_defined_statement);
						area_names.reject(_position_body_defined_statement);
						structure_names.reject(_position_body_defined_statement);
						tile_names.reject(_position_body_defined_statement);
						hero_stat.reject(_position_body_defined_statement);
						_state=SUCCESS;
						_position_body_defined_statement=_position;
						_token_body_defined_statement=_token;
						_token=new Tokens.Rule.BodyDefinedStatementToken();
						parse_spawn_statement();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
								_furthestPosition=_position;
							}
							_position=_position_body_defined_statement;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_body_defined_statement.addAll(_token);
							_token_body_defined_statement.setValue(_token.getValue());
						}
						_token=_token_body_defined_statement;
						if(_state==FAILED) {
							support_names.reject(_position_body_defined_statement);
							association_names.reject(_position_body_defined_statement);
							room_names.reject(_position_body_defined_statement);
							activity_names.reject(_position_body_defined_statement);
							siding_names.reject(_position_body_defined_statement);
							item_names.reject(_position_body_defined_statement);
							aspect_names.reject(_position_body_defined_statement);
							affinity_names.reject(_position_body_defined_statement);
							activity_type_names.reject(_position_body_defined_statement);
							trail_names.reject(_position_body_defined_statement);
							attack_names.reject(_position_body_defined_statement);
							reason_names.reject(_position_body_defined_statement);
							trait_names.reject(_position_body_defined_statement);
							condition_names.reject(_position_body_defined_statement);
							payment_short_type_names.reject(_position_body_defined_statement);
							skill_names.reject(_position_body_defined_statement);
							map_names.reject(_position_body_defined_statement);
							event_names.reject(_position_body_defined_statement);
							image_names.reject(_position_body_defined_statement);
							tile_symbols.reject(_position_body_defined_statement);
							payment_long_type_names.reject(_position_body_defined_statement);
							area_names.reject(_position_body_defined_statement);
							structure_names.reject(_position_body_defined_statement);
							tile_names.reject(_position_body_defined_statement);
							hero_stat.reject(_position_body_defined_statement);
							_state=SUCCESS;
							_position_body_defined_statement=_position;
							_token_body_defined_statement=_token;
							_token=new Tokens.Rule.BodyDefinedStatementToken();
							parse_activity_statement();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
									_furthestPosition=_position;
								}
								_position=_position_body_defined_statement;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_body_defined_statement.addAll(_token);
								_token_body_defined_statement.setValue(_token.getValue());
							}
							_token=_token_body_defined_statement;
							if(_state==FAILED) {
								support_names.reject(_position_body_defined_statement);
								association_names.reject(_position_body_defined_statement);
								room_names.reject(_position_body_defined_statement);
								activity_names.reject(_position_body_defined_statement);
								siding_names.reject(_position_body_defined_statement);
								item_names.reject(_position_body_defined_statement);
								aspect_names.reject(_position_body_defined_statement);
								affinity_names.reject(_position_body_defined_statement);
								activity_type_names.reject(_position_body_defined_statement);
								trail_names.reject(_position_body_defined_statement);
								attack_names.reject(_position_body_defined_statement);
								reason_names.reject(_position_body_defined_statement);
								trait_names.reject(_position_body_defined_statement);
								condition_names.reject(_position_body_defined_statement);
								payment_short_type_names.reject(_position_body_defined_statement);
								skill_names.reject(_position_body_defined_statement);
								map_names.reject(_position_body_defined_statement);
								event_names.reject(_position_body_defined_statement);
								image_names.reject(_position_body_defined_statement);
								tile_symbols.reject(_position_body_defined_statement);
								payment_long_type_names.reject(_position_body_defined_statement);
								area_names.reject(_position_body_defined_statement);
								structure_names.reject(_position_body_defined_statement);
								tile_names.reject(_position_body_defined_statement);
								hero_stat.reject(_position_body_defined_statement);
								_state=SUCCESS;
								_position_body_defined_statement=_position;
								_token_body_defined_statement=_token;
								_token=new Tokens.Rule.BodyDefinedStatementToken();
								parse_association_statement();
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_defined_statement(body_defined_statement)");
										_furthestPosition=_position;
									}
									_position=_position_body_defined_statement;
								}
								else {
								}
								if(_state==SUCCESS) {
									_token_body_defined_statement.addAll(_token);
									_token_body_defined_statement.setValue(_token.getValue());
								}
								_token=_token_body_defined_statement;
								if(_state==FAILED) {
									support_names.reject(_position_body_defined_statement);
									association_names.reject(_position_body_defined_statement);
									room_names.reject(_position_body_defined_statement);
									activity_names.reject(_position_body_defined_statement);
									siding_names.reject(_position_body_defined_statement);
									item_names.reject(_position_body_defined_statement);
									aspect_names.reject(_position_body_defined_statement);
									affinity_names.reject(_position_body_defined_statement);
									activity_type_names.reject(_position_body_defined_statement);
									trail_names.reject(_position_body_defined_statement);
									attack_names.reject(_position_body_defined_statement);
									reason_names.reject(_position_body_defined_statement);
									trait_names.reject(_position_body_defined_statement);
									condition_names.reject(_position_body_defined_statement);
									payment_short_type_names.reject(_position_body_defined_statement);
									skill_names.reject(_position_body_defined_statement);
									map_names.reject(_position_body_defined_statement);
									event_names.reject(_position_body_defined_statement);
									image_names.reject(_position_body_defined_statement);
									tile_symbols.reject(_position_body_defined_statement);
									payment_long_type_names.reject(_position_body_defined_statement);
									area_names.reject(_position_body_defined_statement);
									structure_names.reject(_position_body_defined_statement);
									tile_names.reject(_position_body_defined_statement);
									hero_stat.reject(_position_body_defined_statement);
								}
								else if(_state==SUCCESS) {
									support_names.accept(_position_body_defined_statement);
									association_names.accept(_position_body_defined_statement);
									room_names.accept(_position_body_defined_statement);
									activity_names.accept(_position_body_defined_statement);
									siding_names.accept(_position_body_defined_statement);
									item_names.accept(_position_body_defined_statement);
									aspect_names.accept(_position_body_defined_statement);
									affinity_names.accept(_position_body_defined_statement);
									activity_type_names.accept(_position_body_defined_statement);
									trail_names.accept(_position_body_defined_statement);
									attack_names.accept(_position_body_defined_statement);
									reason_names.accept(_position_body_defined_statement);
									trait_names.accept(_position_body_defined_statement);
									condition_names.accept(_position_body_defined_statement);
									payment_short_type_names.accept(_position_body_defined_statement);
									skill_names.accept(_position_body_defined_statement);
									map_names.accept(_position_body_defined_statement);
									event_names.accept(_position_body_defined_statement);
									image_names.accept(_position_body_defined_statement);
									tile_symbols.accept(_position_body_defined_statement);
									payment_long_type_names.accept(_position_body_defined_statement);
									area_names.accept(_position_body_defined_statement);
									structure_names.accept(_position_body_defined_statement);
									tile_names.accept(_position_body_defined_statement);
									hero_stat.accept(_position_body_defined_statement);
								}
							}
						}
					}
				}
			}
		}
	}
	public void parse_body_element() {
		int _position_body_element = -1;
		Token.Parsed _token_body_element = null;
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
		_position_body_element=_position;
		_token_body_element=_token;
		_token=new Tokens.Rule.BodyElementToken();
		parse_return_statement();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
				_furthestPosition=_position;
			}
			_position=_position_body_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_body_element.add(_position_body_element,_token);
		}
		_token=_token_body_element;
		if(_state==FAILED) {
			support_names.reject(_position_body_element);
			association_names.reject(_position_body_element);
			room_names.reject(_position_body_element);
			activity_names.reject(_position_body_element);
			siding_names.reject(_position_body_element);
			item_names.reject(_position_body_element);
			aspect_names.reject(_position_body_element);
			affinity_names.reject(_position_body_element);
			activity_type_names.reject(_position_body_element);
			trail_names.reject(_position_body_element);
			attack_names.reject(_position_body_element);
			reason_names.reject(_position_body_element);
			trait_names.reject(_position_body_element);
			condition_names.reject(_position_body_element);
			payment_short_type_names.reject(_position_body_element);
			skill_names.reject(_position_body_element);
			map_names.reject(_position_body_element);
			event_names.reject(_position_body_element);
			image_names.reject(_position_body_element);
			tile_symbols.reject(_position_body_element);
			payment_long_type_names.reject(_position_body_element);
			area_names.reject(_position_body_element);
			structure_names.reject(_position_body_element);
			tile_names.reject(_position_body_element);
			hero_stat.reject(_position_body_element);
			_state=SUCCESS;
			_position_body_element=_position;
			_token_body_element=_token;
			_token=new Tokens.Rule.BodyElementToken();
			parse_if_statement();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
					_furthestPosition=_position;
				}
				_position=_position_body_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_body_element.add(_position_body_element,_token);
			}
			_token=_token_body_element;
			if(_state==FAILED) {
				support_names.reject(_position_body_element);
				association_names.reject(_position_body_element);
				room_names.reject(_position_body_element);
				activity_names.reject(_position_body_element);
				siding_names.reject(_position_body_element);
				item_names.reject(_position_body_element);
				aspect_names.reject(_position_body_element);
				affinity_names.reject(_position_body_element);
				activity_type_names.reject(_position_body_element);
				trail_names.reject(_position_body_element);
				attack_names.reject(_position_body_element);
				reason_names.reject(_position_body_element);
				trait_names.reject(_position_body_element);
				condition_names.reject(_position_body_element);
				payment_short_type_names.reject(_position_body_element);
				skill_names.reject(_position_body_element);
				map_names.reject(_position_body_element);
				event_names.reject(_position_body_element);
				image_names.reject(_position_body_element);
				tile_symbols.reject(_position_body_element);
				payment_long_type_names.reject(_position_body_element);
				area_names.reject(_position_body_element);
				structure_names.reject(_position_body_element);
				tile_names.reject(_position_body_element);
				hero_stat.reject(_position_body_element);
				_state=SUCCESS;
				_position_body_element=_position;
				_token_body_element=_token;
				_token=new Tokens.Rule.BodyElementToken();
				parse_while_statement();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
						_furthestPosition=_position;
					}
					_position=_position_body_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_body_element.add(_position_body_element,_token);
				}
				_token=_token_body_element;
				if(_state==FAILED) {
					support_names.reject(_position_body_element);
					association_names.reject(_position_body_element);
					room_names.reject(_position_body_element);
					activity_names.reject(_position_body_element);
					siding_names.reject(_position_body_element);
					item_names.reject(_position_body_element);
					aspect_names.reject(_position_body_element);
					affinity_names.reject(_position_body_element);
					activity_type_names.reject(_position_body_element);
					trail_names.reject(_position_body_element);
					attack_names.reject(_position_body_element);
					reason_names.reject(_position_body_element);
					trait_names.reject(_position_body_element);
					condition_names.reject(_position_body_element);
					payment_short_type_names.reject(_position_body_element);
					skill_names.reject(_position_body_element);
					map_names.reject(_position_body_element);
					event_names.reject(_position_body_element);
					image_names.reject(_position_body_element);
					tile_symbols.reject(_position_body_element);
					payment_long_type_names.reject(_position_body_element);
					area_names.reject(_position_body_element);
					structure_names.reject(_position_body_element);
					tile_names.reject(_position_body_element);
					hero_stat.reject(_position_body_element);
					_state=SUCCESS;
					_position_body_element=_position;
					_token_body_element=_token;
					_token=new Tokens.Rule.BodyElementToken();
					parse_for_statement();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
							_furthestPosition=_position;
						}
						_position=_position_body_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_body_element.add(_position_body_element,_token);
					}
					_token=_token_body_element;
					if(_state==FAILED) {
						support_names.reject(_position_body_element);
						association_names.reject(_position_body_element);
						room_names.reject(_position_body_element);
						activity_names.reject(_position_body_element);
						siding_names.reject(_position_body_element);
						item_names.reject(_position_body_element);
						aspect_names.reject(_position_body_element);
						affinity_names.reject(_position_body_element);
						activity_type_names.reject(_position_body_element);
						trail_names.reject(_position_body_element);
						attack_names.reject(_position_body_element);
						reason_names.reject(_position_body_element);
						trait_names.reject(_position_body_element);
						condition_names.reject(_position_body_element);
						payment_short_type_names.reject(_position_body_element);
						skill_names.reject(_position_body_element);
						map_names.reject(_position_body_element);
						event_names.reject(_position_body_element);
						image_names.reject(_position_body_element);
						tile_symbols.reject(_position_body_element);
						payment_long_type_names.reject(_position_body_element);
						area_names.reject(_position_body_element);
						structure_names.reject(_position_body_element);
						tile_names.reject(_position_body_element);
						hero_stat.reject(_position_body_element);
						_state=SUCCESS;
						_position_body_element=_position;
						_token_body_element=_token;
						_token=new Tokens.Rule.BodyElementToken();
						parse_body_defined_statement();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
								_furthestPosition=_position;
							}
							_position=_position_body_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_body_element.add(_position_body_element,_token);
						}
						_token=_token_body_element;
						if(_state==FAILED) {
							support_names.reject(_position_body_element);
							association_names.reject(_position_body_element);
							room_names.reject(_position_body_element);
							activity_names.reject(_position_body_element);
							siding_names.reject(_position_body_element);
							item_names.reject(_position_body_element);
							aspect_names.reject(_position_body_element);
							affinity_names.reject(_position_body_element);
							activity_type_names.reject(_position_body_element);
							trail_names.reject(_position_body_element);
							attack_names.reject(_position_body_element);
							reason_names.reject(_position_body_element);
							trait_names.reject(_position_body_element);
							condition_names.reject(_position_body_element);
							payment_short_type_names.reject(_position_body_element);
							skill_names.reject(_position_body_element);
							map_names.reject(_position_body_element);
							event_names.reject(_position_body_element);
							image_names.reject(_position_body_element);
							tile_symbols.reject(_position_body_element);
							payment_long_type_names.reject(_position_body_element);
							area_names.reject(_position_body_element);
							structure_names.reject(_position_body_element);
							tile_names.reject(_position_body_element);
							hero_stat.reject(_position_body_element);
							_state=SUCCESS;
							_position_body_element=_position;
							_token_body_element=_token;
							_token=new Tokens.Rule.BodyElementToken();
							parse_variable_declaration();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
									_furthestPosition=_position;
								}
								_position=_position_body_element;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_body_element.add(_position_body_element,_token);
							}
							_token=_token_body_element;
							if(_state==FAILED) {
								support_names.reject(_position_body_element);
								association_names.reject(_position_body_element);
								room_names.reject(_position_body_element);
								activity_names.reject(_position_body_element);
								siding_names.reject(_position_body_element);
								item_names.reject(_position_body_element);
								aspect_names.reject(_position_body_element);
								affinity_names.reject(_position_body_element);
								activity_type_names.reject(_position_body_element);
								trail_names.reject(_position_body_element);
								attack_names.reject(_position_body_element);
								reason_names.reject(_position_body_element);
								trait_names.reject(_position_body_element);
								condition_names.reject(_position_body_element);
								payment_short_type_names.reject(_position_body_element);
								skill_names.reject(_position_body_element);
								map_names.reject(_position_body_element);
								event_names.reject(_position_body_element);
								image_names.reject(_position_body_element);
								tile_symbols.reject(_position_body_element);
								payment_long_type_names.reject(_position_body_element);
								area_names.reject(_position_body_element);
								structure_names.reject(_position_body_element);
								tile_names.reject(_position_body_element);
								hero_stat.reject(_position_body_element);
								_state=SUCCESS;
								_position_body_element=_position;
								_token_body_element=_token;
								_token=new Tokens.Rule.BodyElementToken();
								parse_statement();
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
										_furthestPosition=_position;
									}
									_position=_position_body_element;
								}
								else {
									int _state_170 = _state;
									parse__anonymous_137();
									if(_state_170==SUCCESS&&_state==FAILED) {
										_state=SUCCESS;
									}
									if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"body_element(body_element)");
											_furthestPosition=_position;
										}
										_position=_position_body_element;
									}
									else {
									}
								}
								if(_state==SUCCESS) {
									_token_body_element.add(_position_body_element,_token);
								}
								_token=_token_body_element;
								if(_state==FAILED) {
									support_names.reject(_position_body_element);
									association_names.reject(_position_body_element);
									room_names.reject(_position_body_element);
									activity_names.reject(_position_body_element);
									siding_names.reject(_position_body_element);
									item_names.reject(_position_body_element);
									aspect_names.reject(_position_body_element);
									affinity_names.reject(_position_body_element);
									activity_type_names.reject(_position_body_element);
									trail_names.reject(_position_body_element);
									attack_names.reject(_position_body_element);
									reason_names.reject(_position_body_element);
									trait_names.reject(_position_body_element);
									condition_names.reject(_position_body_element);
									payment_short_type_names.reject(_position_body_element);
									skill_names.reject(_position_body_element);
									map_names.reject(_position_body_element);
									event_names.reject(_position_body_element);
									image_names.reject(_position_body_element);
									tile_symbols.reject(_position_body_element);
									payment_long_type_names.reject(_position_body_element);
									area_names.reject(_position_body_element);
									structure_names.reject(_position_body_element);
									tile_names.reject(_position_body_element);
									hero_stat.reject(_position_body_element);
								}
								else if(_state==SUCCESS) {
									support_names.accept(_position_body_element);
									association_names.accept(_position_body_element);
									room_names.accept(_position_body_element);
									activity_names.accept(_position_body_element);
									siding_names.accept(_position_body_element);
									item_names.accept(_position_body_element);
									aspect_names.accept(_position_body_element);
									affinity_names.accept(_position_body_element);
									activity_type_names.accept(_position_body_element);
									trail_names.accept(_position_body_element);
									attack_names.accept(_position_body_element);
									reason_names.accept(_position_body_element);
									trait_names.accept(_position_body_element);
									condition_names.accept(_position_body_element);
									payment_short_type_names.accept(_position_body_element);
									skill_names.accept(_position_body_element);
									map_names.accept(_position_body_element);
									event_names.accept(_position_body_element);
									image_names.accept(_position_body_element);
									tile_symbols.accept(_position_body_element);
									payment_long_type_names.accept(_position_body_element);
									area_names.accept(_position_body_element);
									structure_names.accept(_position_body_element);
									tile_names.accept(_position_body_element);
									hero_stat.accept(_position_body_element);
								}
							}
						}
					}
				}
			}
		}
	}
}