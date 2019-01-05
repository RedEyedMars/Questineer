package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.return_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class boolean_context extends return_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public boolean_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public boolean_context() {
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
	public void parse_boolean_statement() {
		int _position_boolean_statement = -1;
		Token.Parsed _token_boolean_statement = null;
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
		_position_boolean_statement=_position;
		_token_boolean_statement=_token;
		_token=new Tokens.Rule.BooleanStatementToken();
		parse_boolean_element();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_statement(boolean_statement)");
				_furthestPosition=_position;
			}
			_position=_position_boolean_statement;
		}
		else {
			int _state_189 = _state;
			while(_position<_inputLength) {
				parse__anonymous_169();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_189==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_statement(boolean_statement)");
					_furthestPosition=_position;
				}
				_position=_position_boolean_statement;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_boolean_statement.add(_position_boolean_statement,_token);
		}
		_token=_token_boolean_statement;
		if(_state==FAILED) {
			support_names.reject(_position_boolean_statement);
			association_names.reject(_position_boolean_statement);
			room_names.reject(_position_boolean_statement);
			activity_names.reject(_position_boolean_statement);
			siding_names.reject(_position_boolean_statement);
			item_names.reject(_position_boolean_statement);
			aspect_names.reject(_position_boolean_statement);
			affinity_names.reject(_position_boolean_statement);
			activity_type_names.reject(_position_boolean_statement);
			trail_names.reject(_position_boolean_statement);
			attack_names.reject(_position_boolean_statement);
			reason_names.reject(_position_boolean_statement);
			trait_names.reject(_position_boolean_statement);
			condition_names.reject(_position_boolean_statement);
			payment_short_type_names.reject(_position_boolean_statement);
			skill_names.reject(_position_boolean_statement);
			map_names.reject(_position_boolean_statement);
			event_names.reject(_position_boolean_statement);
			image_names.reject(_position_boolean_statement);
			tile_symbols.reject(_position_boolean_statement);
			payment_long_type_names.reject(_position_boolean_statement);
			area_names.reject(_position_boolean_statement);
			structure_names.reject(_position_boolean_statement);
			tile_names.reject(_position_boolean_statement);
			hero_stat.reject(_position_boolean_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_boolean_statement);
			association_names.accept(_position_boolean_statement);
			room_names.accept(_position_boolean_statement);
			activity_names.accept(_position_boolean_statement);
			siding_names.accept(_position_boolean_statement);
			item_names.accept(_position_boolean_statement);
			aspect_names.accept(_position_boolean_statement);
			affinity_names.accept(_position_boolean_statement);
			activity_type_names.accept(_position_boolean_statement);
			trail_names.accept(_position_boolean_statement);
			attack_names.accept(_position_boolean_statement);
			reason_names.accept(_position_boolean_statement);
			trait_names.accept(_position_boolean_statement);
			condition_names.accept(_position_boolean_statement);
			payment_short_type_names.accept(_position_boolean_statement);
			skill_names.accept(_position_boolean_statement);
			map_names.accept(_position_boolean_statement);
			event_names.accept(_position_boolean_statement);
			image_names.accept(_position_boolean_statement);
			tile_symbols.accept(_position_boolean_statement);
			payment_long_type_names.accept(_position_boolean_statement);
			area_names.accept(_position_boolean_statement);
			structure_names.accept(_position_boolean_statement);
			tile_names.accept(_position_boolean_statement);
			hero_stat.accept(_position_boolean_statement);
		}
	}
	public void parse_boolean_element() {
		int _position_boolean_element = -1;
		Token.Parsed _token_boolean_element = null;
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
		_position_boolean_element=_position;
		_token_boolean_element=_token;
		_token=new Tokens.Rule.BooleanElementToken();
		parse_has_chance();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_element(boolean_element)");
				_furthestPosition=_position;
			}
			_position=_position_boolean_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_boolean_element.addAll(_token);
			_token_boolean_element.setValue(_token.getValue());
		}
		_token=_token_boolean_element;
		if(_state==FAILED) {
			support_names.reject(_position_boolean_element);
			association_names.reject(_position_boolean_element);
			room_names.reject(_position_boolean_element);
			activity_names.reject(_position_boolean_element);
			siding_names.reject(_position_boolean_element);
			item_names.reject(_position_boolean_element);
			aspect_names.reject(_position_boolean_element);
			affinity_names.reject(_position_boolean_element);
			activity_type_names.reject(_position_boolean_element);
			trail_names.reject(_position_boolean_element);
			attack_names.reject(_position_boolean_element);
			reason_names.reject(_position_boolean_element);
			trait_names.reject(_position_boolean_element);
			condition_names.reject(_position_boolean_element);
			payment_short_type_names.reject(_position_boolean_element);
			skill_names.reject(_position_boolean_element);
			map_names.reject(_position_boolean_element);
			event_names.reject(_position_boolean_element);
			image_names.reject(_position_boolean_element);
			tile_symbols.reject(_position_boolean_element);
			payment_long_type_names.reject(_position_boolean_element);
			area_names.reject(_position_boolean_element);
			structure_names.reject(_position_boolean_element);
			tile_names.reject(_position_boolean_element);
			hero_stat.reject(_position_boolean_element);
			_state=SUCCESS;
			_position_boolean_element=_position;
			_token_boolean_element=_token;
			_token=new Tokens.Rule.BooleanElementToken();
			parse_isA_statement();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_element(boolean_element)");
					_furthestPosition=_position;
				}
				_position=_position_boolean_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_boolean_element.addAll(_token);
				_token_boolean_element.setValue(_token.getValue());
			}
			_token=_token_boolean_element;
			if(_state==FAILED) {
				support_names.reject(_position_boolean_element);
				association_names.reject(_position_boolean_element);
				room_names.reject(_position_boolean_element);
				activity_names.reject(_position_boolean_element);
				siding_names.reject(_position_boolean_element);
				item_names.reject(_position_boolean_element);
				aspect_names.reject(_position_boolean_element);
				affinity_names.reject(_position_boolean_element);
				activity_type_names.reject(_position_boolean_element);
				trail_names.reject(_position_boolean_element);
				attack_names.reject(_position_boolean_element);
				reason_names.reject(_position_boolean_element);
				trait_names.reject(_position_boolean_element);
				condition_names.reject(_position_boolean_element);
				payment_short_type_names.reject(_position_boolean_element);
				skill_names.reject(_position_boolean_element);
				map_names.reject(_position_boolean_element);
				event_names.reject(_position_boolean_element);
				image_names.reject(_position_boolean_element);
				tile_symbols.reject(_position_boolean_element);
				payment_long_type_names.reject(_position_boolean_element);
				area_names.reject(_position_boolean_element);
				structure_names.reject(_position_boolean_element);
				tile_names.reject(_position_boolean_element);
				hero_stat.reject(_position_boolean_element);
				_state=SUCCESS;
				_position_boolean_element=_position;
				_token_boolean_element=_token;
				_token=new Tokens.Rule.BooleanElementToken();
				parse_spawned_statement();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_element(boolean_element)");
						_furthestPosition=_position;
					}
					_position=_position_boolean_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_boolean_element.addAll(_token);
					_token_boolean_element.setValue(_token.getValue());
				}
				_token=_token_boolean_element;
				if(_state==FAILED) {
					support_names.reject(_position_boolean_element);
					association_names.reject(_position_boolean_element);
					room_names.reject(_position_boolean_element);
					activity_names.reject(_position_boolean_element);
					siding_names.reject(_position_boolean_element);
					item_names.reject(_position_boolean_element);
					aspect_names.reject(_position_boolean_element);
					affinity_names.reject(_position_boolean_element);
					activity_type_names.reject(_position_boolean_element);
					trail_names.reject(_position_boolean_element);
					attack_names.reject(_position_boolean_element);
					reason_names.reject(_position_boolean_element);
					trait_names.reject(_position_boolean_element);
					condition_names.reject(_position_boolean_element);
					payment_short_type_names.reject(_position_boolean_element);
					skill_names.reject(_position_boolean_element);
					map_names.reject(_position_boolean_element);
					event_names.reject(_position_boolean_element);
					image_names.reject(_position_boolean_element);
					tile_symbols.reject(_position_boolean_element);
					payment_long_type_names.reject(_position_boolean_element);
					area_names.reject(_position_boolean_element);
					structure_names.reject(_position_boolean_element);
					tile_names.reject(_position_boolean_element);
					hero_stat.reject(_position_boolean_element);
					_state=SUCCESS;
					_position_boolean_element=_position;
					_token_boolean_element=_token;
					_token=new Tokens.Rule.BooleanElementToken();
					parse_has_statement();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_element(boolean_element)");
							_furthestPosition=_position;
						}
						_position=_position_boolean_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_boolean_element.addAll(_token);
						_token_boolean_element.setValue(_token.getValue());
					}
					_token=_token_boolean_element;
					if(_state==FAILED) {
						support_names.reject(_position_boolean_element);
						association_names.reject(_position_boolean_element);
						room_names.reject(_position_boolean_element);
						activity_names.reject(_position_boolean_element);
						siding_names.reject(_position_boolean_element);
						item_names.reject(_position_boolean_element);
						aspect_names.reject(_position_boolean_element);
						affinity_names.reject(_position_boolean_element);
						activity_type_names.reject(_position_boolean_element);
						trail_names.reject(_position_boolean_element);
						attack_names.reject(_position_boolean_element);
						reason_names.reject(_position_boolean_element);
						trait_names.reject(_position_boolean_element);
						condition_names.reject(_position_boolean_element);
						payment_short_type_names.reject(_position_boolean_element);
						skill_names.reject(_position_boolean_element);
						map_names.reject(_position_boolean_element);
						event_names.reject(_position_boolean_element);
						image_names.reject(_position_boolean_element);
						tile_symbols.reject(_position_boolean_element);
						payment_long_type_names.reject(_position_boolean_element);
						area_names.reject(_position_boolean_element);
						structure_names.reject(_position_boolean_element);
						tile_names.reject(_position_boolean_element);
						hero_stat.reject(_position_boolean_element);
						_state=SUCCESS;
						_position_boolean_element=_position;
						_token_boolean_element=_token;
						_token=new Tokens.Rule.BooleanElementToken();
						parse_statement();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"boolean_element(boolean_element)");
								_furthestPosition=_position;
							}
							_position=_position_boolean_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_boolean_element.addAll(_token);
							_token_boolean_element.setValue(_token.getValue());
						}
						_token=_token_boolean_element;
						if(_state==FAILED) {
							support_names.reject(_position_boolean_element);
							association_names.reject(_position_boolean_element);
							room_names.reject(_position_boolean_element);
							activity_names.reject(_position_boolean_element);
							siding_names.reject(_position_boolean_element);
							item_names.reject(_position_boolean_element);
							aspect_names.reject(_position_boolean_element);
							affinity_names.reject(_position_boolean_element);
							activity_type_names.reject(_position_boolean_element);
							trail_names.reject(_position_boolean_element);
							attack_names.reject(_position_boolean_element);
							reason_names.reject(_position_boolean_element);
							trait_names.reject(_position_boolean_element);
							condition_names.reject(_position_boolean_element);
							payment_short_type_names.reject(_position_boolean_element);
							skill_names.reject(_position_boolean_element);
							map_names.reject(_position_boolean_element);
							event_names.reject(_position_boolean_element);
							image_names.reject(_position_boolean_element);
							tile_symbols.reject(_position_boolean_element);
							payment_long_type_names.reject(_position_boolean_element);
							area_names.reject(_position_boolean_element);
							structure_names.reject(_position_boolean_element);
							tile_names.reject(_position_boolean_element);
							hero_stat.reject(_position_boolean_element);
						}
						else if(_state==SUCCESS) {
							support_names.accept(_position_boolean_element);
							association_names.accept(_position_boolean_element);
							room_names.accept(_position_boolean_element);
							activity_names.accept(_position_boolean_element);
							siding_names.accept(_position_boolean_element);
							item_names.accept(_position_boolean_element);
							aspect_names.accept(_position_boolean_element);
							affinity_names.accept(_position_boolean_element);
							activity_type_names.accept(_position_boolean_element);
							trail_names.accept(_position_boolean_element);
							attack_names.accept(_position_boolean_element);
							reason_names.accept(_position_boolean_element);
							trait_names.accept(_position_boolean_element);
							condition_names.accept(_position_boolean_element);
							payment_short_type_names.accept(_position_boolean_element);
							skill_names.accept(_position_boolean_element);
							map_names.accept(_position_boolean_element);
							event_names.accept(_position_boolean_element);
							image_names.accept(_position_boolean_element);
							tile_symbols.accept(_position_boolean_element);
							payment_long_type_names.accept(_position_boolean_element);
							area_names.accept(_position_boolean_element);
							structure_names.accept(_position_boolean_element);
							tile_names.accept(_position_boolean_element);
							hero_stat.accept(_position_boolean_element);
						}
					}
				}
			}
		}
	}
}