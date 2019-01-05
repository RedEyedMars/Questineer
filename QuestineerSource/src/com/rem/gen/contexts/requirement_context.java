package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.siding_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class requirement_context extends siding_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public requirement_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public requirement_context() {
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
	public void parse_requirement() {
		int _position_requirement = -1;
		Token.Parsed _token_requirement = null;
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
		_position_requirement=_position;
		_token_requirement=_token;
		_token=new Tokens.Rule.RequirementToken();
		parse_requirement_element();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement(requirement)");
				_furthestPosition=_position;
			}
			_position=_position_requirement;
		}
		else {
			int _state_192 = _state;
			while(_position<_inputLength) {
				parse__anonymous_171();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_192==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement(requirement)");
					_furthestPosition=_position;
				}
				_position=_position_requirement;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_requirement.add(_position_requirement,_token);
		}
		_token=_token_requirement;
		if(_state==FAILED) {
			support_names.reject(_position_requirement);
			association_names.reject(_position_requirement);
			room_names.reject(_position_requirement);
			activity_names.reject(_position_requirement);
			siding_names.reject(_position_requirement);
			item_names.reject(_position_requirement);
			aspect_names.reject(_position_requirement);
			affinity_names.reject(_position_requirement);
			activity_type_names.reject(_position_requirement);
			trail_names.reject(_position_requirement);
			attack_names.reject(_position_requirement);
			reason_names.reject(_position_requirement);
			trait_names.reject(_position_requirement);
			condition_names.reject(_position_requirement);
			payment_short_type_names.reject(_position_requirement);
			skill_names.reject(_position_requirement);
			map_names.reject(_position_requirement);
			event_names.reject(_position_requirement);
			image_names.reject(_position_requirement);
			tile_symbols.reject(_position_requirement);
			payment_long_type_names.reject(_position_requirement);
			area_names.reject(_position_requirement);
			structure_names.reject(_position_requirement);
			tile_names.reject(_position_requirement);
			hero_stat.reject(_position_requirement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_requirement);
			association_names.accept(_position_requirement);
			room_names.accept(_position_requirement);
			activity_names.accept(_position_requirement);
			siding_names.accept(_position_requirement);
			item_names.accept(_position_requirement);
			aspect_names.accept(_position_requirement);
			affinity_names.accept(_position_requirement);
			activity_type_names.accept(_position_requirement);
			trail_names.accept(_position_requirement);
			attack_names.accept(_position_requirement);
			reason_names.accept(_position_requirement);
			trait_names.accept(_position_requirement);
			condition_names.accept(_position_requirement);
			payment_short_type_names.accept(_position_requirement);
			skill_names.accept(_position_requirement);
			map_names.accept(_position_requirement);
			event_names.accept(_position_requirement);
			image_names.accept(_position_requirement);
			tile_symbols.accept(_position_requirement);
			payment_long_type_names.accept(_position_requirement);
			area_names.accept(_position_requirement);
			structure_names.accept(_position_requirement);
			tile_names.accept(_position_requirement);
			hero_stat.accept(_position_requirement);
		}
	}
	public void parse_requirement_element() {
		int _position_requirement_element = -1;
		Token.Parsed _token_requirement_element = null;
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
		_position_requirement_element=_position;
		_token_requirement_element=_token;
		_token=new Tokens.Rule.RequirementElementToken();
		parse__anonymous_172();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
				_furthestPosition=_position;
			}
			_position=_position_requirement_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_requirement_element.addAll(_token);
			_token_requirement_element.setValue(_token.getValue());
		}
		_token=_token_requirement_element;
		if(_state==FAILED) {
			support_names.reject(_position_requirement_element);
			association_names.reject(_position_requirement_element);
			room_names.reject(_position_requirement_element);
			activity_names.reject(_position_requirement_element);
			siding_names.reject(_position_requirement_element);
			item_names.reject(_position_requirement_element);
			aspect_names.reject(_position_requirement_element);
			affinity_names.reject(_position_requirement_element);
			activity_type_names.reject(_position_requirement_element);
			trail_names.reject(_position_requirement_element);
			attack_names.reject(_position_requirement_element);
			reason_names.reject(_position_requirement_element);
			trait_names.reject(_position_requirement_element);
			condition_names.reject(_position_requirement_element);
			payment_short_type_names.reject(_position_requirement_element);
			skill_names.reject(_position_requirement_element);
			map_names.reject(_position_requirement_element);
			event_names.reject(_position_requirement_element);
			image_names.reject(_position_requirement_element);
			tile_symbols.reject(_position_requirement_element);
			payment_long_type_names.reject(_position_requirement_element);
			area_names.reject(_position_requirement_element);
			structure_names.reject(_position_requirement_element);
			tile_names.reject(_position_requirement_element);
			hero_stat.reject(_position_requirement_element);
			_state=SUCCESS;
			_position_requirement_element=_position;
			_token_requirement_element=_token;
			_token=new Tokens.Rule.RequirementElementToken();
			parse__anonymous_174();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
					_furthestPosition=_position;
				}
				_position=_position_requirement_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_requirement_element.addAll(_token);
				_token_requirement_element.setValue(_token.getValue());
			}
			_token=_token_requirement_element;
			if(_state==FAILED) {
				support_names.reject(_position_requirement_element);
				association_names.reject(_position_requirement_element);
				room_names.reject(_position_requirement_element);
				activity_names.reject(_position_requirement_element);
				siding_names.reject(_position_requirement_element);
				item_names.reject(_position_requirement_element);
				aspect_names.reject(_position_requirement_element);
				affinity_names.reject(_position_requirement_element);
				activity_type_names.reject(_position_requirement_element);
				trail_names.reject(_position_requirement_element);
				attack_names.reject(_position_requirement_element);
				reason_names.reject(_position_requirement_element);
				trait_names.reject(_position_requirement_element);
				condition_names.reject(_position_requirement_element);
				payment_short_type_names.reject(_position_requirement_element);
				skill_names.reject(_position_requirement_element);
				map_names.reject(_position_requirement_element);
				event_names.reject(_position_requirement_element);
				image_names.reject(_position_requirement_element);
				tile_symbols.reject(_position_requirement_element);
				payment_long_type_names.reject(_position_requirement_element);
				area_names.reject(_position_requirement_element);
				structure_names.reject(_position_requirement_element);
				tile_names.reject(_position_requirement_element);
				hero_stat.reject(_position_requirement_element);
				_state=SUCCESS;
				_position_requirement_element=_position;
				_token_requirement_element=_token;
				_token=new Tokens.Rule.RequirementElementToken();
				parse__anonymous_176();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
						_furthestPosition=_position;
					}
					_position=_position_requirement_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_requirement_element.addAll(_token);
					_token_requirement_element.setValue(_token.getValue());
				}
				_token=_token_requirement_element;
				if(_state==FAILED) {
					support_names.reject(_position_requirement_element);
					association_names.reject(_position_requirement_element);
					room_names.reject(_position_requirement_element);
					activity_names.reject(_position_requirement_element);
					siding_names.reject(_position_requirement_element);
					item_names.reject(_position_requirement_element);
					aspect_names.reject(_position_requirement_element);
					affinity_names.reject(_position_requirement_element);
					activity_type_names.reject(_position_requirement_element);
					trail_names.reject(_position_requirement_element);
					attack_names.reject(_position_requirement_element);
					reason_names.reject(_position_requirement_element);
					trait_names.reject(_position_requirement_element);
					condition_names.reject(_position_requirement_element);
					payment_short_type_names.reject(_position_requirement_element);
					skill_names.reject(_position_requirement_element);
					map_names.reject(_position_requirement_element);
					event_names.reject(_position_requirement_element);
					image_names.reject(_position_requirement_element);
					tile_symbols.reject(_position_requirement_element);
					payment_long_type_names.reject(_position_requirement_element);
					area_names.reject(_position_requirement_element);
					structure_names.reject(_position_requirement_element);
					tile_names.reject(_position_requirement_element);
					hero_stat.reject(_position_requirement_element);
					_state=SUCCESS;
					_position_requirement_element=_position;
					_token_requirement_element=_token;
					_token=new Tokens.Rule.RequirementElementToken();
					parse__anonymous_178();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
							_furthestPosition=_position;
						}
						_position=_position_requirement_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_requirement_element.addAll(_token);
						_token_requirement_element.setValue(_token.getValue());
					}
					_token=_token_requirement_element;
					if(_state==FAILED) {
						support_names.reject(_position_requirement_element);
						association_names.reject(_position_requirement_element);
						room_names.reject(_position_requirement_element);
						activity_names.reject(_position_requirement_element);
						siding_names.reject(_position_requirement_element);
						item_names.reject(_position_requirement_element);
						aspect_names.reject(_position_requirement_element);
						affinity_names.reject(_position_requirement_element);
						activity_type_names.reject(_position_requirement_element);
						trail_names.reject(_position_requirement_element);
						attack_names.reject(_position_requirement_element);
						reason_names.reject(_position_requirement_element);
						trait_names.reject(_position_requirement_element);
						condition_names.reject(_position_requirement_element);
						payment_short_type_names.reject(_position_requirement_element);
						skill_names.reject(_position_requirement_element);
						map_names.reject(_position_requirement_element);
						event_names.reject(_position_requirement_element);
						image_names.reject(_position_requirement_element);
						tile_symbols.reject(_position_requirement_element);
						payment_long_type_names.reject(_position_requirement_element);
						area_names.reject(_position_requirement_element);
						structure_names.reject(_position_requirement_element);
						tile_names.reject(_position_requirement_element);
						hero_stat.reject(_position_requirement_element);
						_state=SUCCESS;
						_position_requirement_element=_position;
						_token_requirement_element=_token;
						_token=new Tokens.Rule.RequirementElementToken();
						parse__anonymous_180();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
								_furthestPosition=_position;
							}
							_position=_position_requirement_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_requirement_element.addAll(_token);
							_token_requirement_element.setValue(_token.getValue());
						}
						_token=_token_requirement_element;
						if(_state==FAILED) {
							support_names.reject(_position_requirement_element);
							association_names.reject(_position_requirement_element);
							room_names.reject(_position_requirement_element);
							activity_names.reject(_position_requirement_element);
							siding_names.reject(_position_requirement_element);
							item_names.reject(_position_requirement_element);
							aspect_names.reject(_position_requirement_element);
							affinity_names.reject(_position_requirement_element);
							activity_type_names.reject(_position_requirement_element);
							trail_names.reject(_position_requirement_element);
							attack_names.reject(_position_requirement_element);
							reason_names.reject(_position_requirement_element);
							trait_names.reject(_position_requirement_element);
							condition_names.reject(_position_requirement_element);
							payment_short_type_names.reject(_position_requirement_element);
							skill_names.reject(_position_requirement_element);
							map_names.reject(_position_requirement_element);
							event_names.reject(_position_requirement_element);
							image_names.reject(_position_requirement_element);
							tile_symbols.reject(_position_requirement_element);
							payment_long_type_names.reject(_position_requirement_element);
							area_names.reject(_position_requirement_element);
							structure_names.reject(_position_requirement_element);
							tile_names.reject(_position_requirement_element);
							hero_stat.reject(_position_requirement_element);
							_state=SUCCESS;
							_position_requirement_element=_position;
							_token_requirement_element=_token;
							_token=new Tokens.Rule.RequirementElementToken();
							parse__anonymous_182();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
									_furthestPosition=_position;
								}
								_position=_position_requirement_element;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_requirement_element.addAll(_token);
								_token_requirement_element.setValue(_token.getValue());
							}
							_token=_token_requirement_element;
							if(_state==FAILED) {
								support_names.reject(_position_requirement_element);
								association_names.reject(_position_requirement_element);
								room_names.reject(_position_requirement_element);
								activity_names.reject(_position_requirement_element);
								siding_names.reject(_position_requirement_element);
								item_names.reject(_position_requirement_element);
								aspect_names.reject(_position_requirement_element);
								affinity_names.reject(_position_requirement_element);
								activity_type_names.reject(_position_requirement_element);
								trail_names.reject(_position_requirement_element);
								attack_names.reject(_position_requirement_element);
								reason_names.reject(_position_requirement_element);
								trait_names.reject(_position_requirement_element);
								condition_names.reject(_position_requirement_element);
								payment_short_type_names.reject(_position_requirement_element);
								skill_names.reject(_position_requirement_element);
								map_names.reject(_position_requirement_element);
								event_names.reject(_position_requirement_element);
								image_names.reject(_position_requirement_element);
								tile_symbols.reject(_position_requirement_element);
								payment_long_type_names.reject(_position_requirement_element);
								area_names.reject(_position_requirement_element);
								structure_names.reject(_position_requirement_element);
								tile_names.reject(_position_requirement_element);
								hero_stat.reject(_position_requirement_element);
								_state=SUCCESS;
								_position_requirement_element=_position;
								_token_requirement_element=_token;
								_token=new Tokens.Rule.RequirementElementToken();
								parse__anonymous_183();
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
										_furthestPosition=_position;
									}
									_position=_position_requirement_element;
								}
								else {
								}
								if(_state==SUCCESS) {
									_token_requirement_element.addAll(_token);
									_token_requirement_element.setValue(_token.getValue());
								}
								_token=_token_requirement_element;
								if(_state==FAILED) {
									support_names.reject(_position_requirement_element);
									association_names.reject(_position_requirement_element);
									room_names.reject(_position_requirement_element);
									activity_names.reject(_position_requirement_element);
									siding_names.reject(_position_requirement_element);
									item_names.reject(_position_requirement_element);
									aspect_names.reject(_position_requirement_element);
									affinity_names.reject(_position_requirement_element);
									activity_type_names.reject(_position_requirement_element);
									trail_names.reject(_position_requirement_element);
									attack_names.reject(_position_requirement_element);
									reason_names.reject(_position_requirement_element);
									trait_names.reject(_position_requirement_element);
									condition_names.reject(_position_requirement_element);
									payment_short_type_names.reject(_position_requirement_element);
									skill_names.reject(_position_requirement_element);
									map_names.reject(_position_requirement_element);
									event_names.reject(_position_requirement_element);
									image_names.reject(_position_requirement_element);
									tile_symbols.reject(_position_requirement_element);
									payment_long_type_names.reject(_position_requirement_element);
									area_names.reject(_position_requirement_element);
									structure_names.reject(_position_requirement_element);
									tile_names.reject(_position_requirement_element);
									hero_stat.reject(_position_requirement_element);
									_state=SUCCESS;
									_position_requirement_element=_position;
									_token_requirement_element=_token;
									_token=new Tokens.Rule.RequirementElementToken();
									parse__anonymous_184();
									if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
											_furthestPosition=_position;
										}
										_position=_position_requirement_element;
									}
									else {
									}
									if(_state==SUCCESS) {
										_token_requirement_element.addAll(_token);
										_token_requirement_element.setValue(_token.getValue());
									}
									_token=_token_requirement_element;
									if(_state==FAILED) {
										support_names.reject(_position_requirement_element);
										association_names.reject(_position_requirement_element);
										room_names.reject(_position_requirement_element);
										activity_names.reject(_position_requirement_element);
										siding_names.reject(_position_requirement_element);
										item_names.reject(_position_requirement_element);
										aspect_names.reject(_position_requirement_element);
										affinity_names.reject(_position_requirement_element);
										activity_type_names.reject(_position_requirement_element);
										trail_names.reject(_position_requirement_element);
										attack_names.reject(_position_requirement_element);
										reason_names.reject(_position_requirement_element);
										trait_names.reject(_position_requirement_element);
										condition_names.reject(_position_requirement_element);
										payment_short_type_names.reject(_position_requirement_element);
										skill_names.reject(_position_requirement_element);
										map_names.reject(_position_requirement_element);
										event_names.reject(_position_requirement_element);
										image_names.reject(_position_requirement_element);
										tile_symbols.reject(_position_requirement_element);
										payment_long_type_names.reject(_position_requirement_element);
										area_names.reject(_position_requirement_element);
										structure_names.reject(_position_requirement_element);
										tile_names.reject(_position_requirement_element);
										hero_stat.reject(_position_requirement_element);
										_state=SUCCESS;
										_position_requirement_element=_position;
										_token_requirement_element=_token;
										_token=new Tokens.Rule.RequirementElementToken();
										parse__anonymous_185();
										if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
												_furthestPosition=_position;
											}
											_position=_position_requirement_element;
										}
										else {
										}
										if(_state==SUCCESS) {
											_token_requirement_element.addAll(_token);
											_token_requirement_element.setValue(_token.getValue());
										}
										_token=_token_requirement_element;
										if(_state==FAILED) {
											support_names.reject(_position_requirement_element);
											association_names.reject(_position_requirement_element);
											room_names.reject(_position_requirement_element);
											activity_names.reject(_position_requirement_element);
											siding_names.reject(_position_requirement_element);
											item_names.reject(_position_requirement_element);
											aspect_names.reject(_position_requirement_element);
											affinity_names.reject(_position_requirement_element);
											activity_type_names.reject(_position_requirement_element);
											trail_names.reject(_position_requirement_element);
											attack_names.reject(_position_requirement_element);
											reason_names.reject(_position_requirement_element);
											trait_names.reject(_position_requirement_element);
											condition_names.reject(_position_requirement_element);
											payment_short_type_names.reject(_position_requirement_element);
											skill_names.reject(_position_requirement_element);
											map_names.reject(_position_requirement_element);
											event_names.reject(_position_requirement_element);
											image_names.reject(_position_requirement_element);
											tile_symbols.reject(_position_requirement_element);
											payment_long_type_names.reject(_position_requirement_element);
											area_names.reject(_position_requirement_element);
											structure_names.reject(_position_requirement_element);
											tile_names.reject(_position_requirement_element);
											hero_stat.reject(_position_requirement_element);
											_state=SUCCESS;
											_position_requirement_element=_position;
											_token_requirement_element=_token;
											_token=new Tokens.Rule.RequirementElementToken();
											parse__anonymous_186();
											if(_state==FAILED) {
												if(_position>=_furthestPosition) {
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
													_furthestPosition=_position;
												}
												_position=_position_requirement_element;
											}
											else {
											}
											if(_state==SUCCESS) {
												_token_requirement_element.addAll(_token);
												_token_requirement_element.setValue(_token.getValue());
											}
											_token=_token_requirement_element;
											if(_state==FAILED) {
												support_names.reject(_position_requirement_element);
												association_names.reject(_position_requirement_element);
												room_names.reject(_position_requirement_element);
												activity_names.reject(_position_requirement_element);
												siding_names.reject(_position_requirement_element);
												item_names.reject(_position_requirement_element);
												aspect_names.reject(_position_requirement_element);
												affinity_names.reject(_position_requirement_element);
												activity_type_names.reject(_position_requirement_element);
												trail_names.reject(_position_requirement_element);
												attack_names.reject(_position_requirement_element);
												reason_names.reject(_position_requirement_element);
												trait_names.reject(_position_requirement_element);
												condition_names.reject(_position_requirement_element);
												payment_short_type_names.reject(_position_requirement_element);
												skill_names.reject(_position_requirement_element);
												map_names.reject(_position_requirement_element);
												event_names.reject(_position_requirement_element);
												image_names.reject(_position_requirement_element);
												tile_symbols.reject(_position_requirement_element);
												payment_long_type_names.reject(_position_requirement_element);
												area_names.reject(_position_requirement_element);
												structure_names.reject(_position_requirement_element);
												tile_names.reject(_position_requirement_element);
												hero_stat.reject(_position_requirement_element);
												_state=SUCCESS;
												_position_requirement_element=_position;
												_token_requirement_element=_token;
												_token=new Tokens.Rule.RequirementElementToken();
												parse__anonymous_187();
												if(_state==FAILED) {
													if(_position>=_furthestPosition) {
														_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
														_furthestPosition=_position;
													}
													_position=_position_requirement_element;
												}
												else {
												}
												if(_state==SUCCESS) {
													_token_requirement_element.addAll(_token);
													_token_requirement_element.setValue(_token.getValue());
												}
												_token=_token_requirement_element;
												if(_state==FAILED) {
													support_names.reject(_position_requirement_element);
													association_names.reject(_position_requirement_element);
													room_names.reject(_position_requirement_element);
													activity_names.reject(_position_requirement_element);
													siding_names.reject(_position_requirement_element);
													item_names.reject(_position_requirement_element);
													aspect_names.reject(_position_requirement_element);
													affinity_names.reject(_position_requirement_element);
													activity_type_names.reject(_position_requirement_element);
													trail_names.reject(_position_requirement_element);
													attack_names.reject(_position_requirement_element);
													reason_names.reject(_position_requirement_element);
													trait_names.reject(_position_requirement_element);
													condition_names.reject(_position_requirement_element);
													payment_short_type_names.reject(_position_requirement_element);
													skill_names.reject(_position_requirement_element);
													map_names.reject(_position_requirement_element);
													event_names.reject(_position_requirement_element);
													image_names.reject(_position_requirement_element);
													tile_symbols.reject(_position_requirement_element);
													payment_long_type_names.reject(_position_requirement_element);
													area_names.reject(_position_requirement_element);
													structure_names.reject(_position_requirement_element);
													tile_names.reject(_position_requirement_element);
													hero_stat.reject(_position_requirement_element);
													_state=SUCCESS;
													_position_requirement_element=_position;
													_token_requirement_element=_token;
													_token=new Tokens.Rule.RequirementElementToken();
													parse__anonymous_188();
													if(_state==FAILED) {
														if(_position>=_furthestPosition) {
															_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"requirement_element(requirement_element)");
															_furthestPosition=_position;
														}
														_position=_position_requirement_element;
													}
													else {
													}
													if(_state==SUCCESS) {
														_token_requirement_element.addAll(_token);
														_token_requirement_element.setValue(_token.getValue());
													}
													_token=_token_requirement_element;
													if(_state==FAILED) {
														support_names.reject(_position_requirement_element);
														association_names.reject(_position_requirement_element);
														room_names.reject(_position_requirement_element);
														activity_names.reject(_position_requirement_element);
														siding_names.reject(_position_requirement_element);
														item_names.reject(_position_requirement_element);
														aspect_names.reject(_position_requirement_element);
														affinity_names.reject(_position_requirement_element);
														activity_type_names.reject(_position_requirement_element);
														trail_names.reject(_position_requirement_element);
														attack_names.reject(_position_requirement_element);
														reason_names.reject(_position_requirement_element);
														trait_names.reject(_position_requirement_element);
														condition_names.reject(_position_requirement_element);
														payment_short_type_names.reject(_position_requirement_element);
														skill_names.reject(_position_requirement_element);
														map_names.reject(_position_requirement_element);
														event_names.reject(_position_requirement_element);
														image_names.reject(_position_requirement_element);
														tile_symbols.reject(_position_requirement_element);
														payment_long_type_names.reject(_position_requirement_element);
														area_names.reject(_position_requirement_element);
														structure_names.reject(_position_requirement_element);
														tile_names.reject(_position_requirement_element);
														hero_stat.reject(_position_requirement_element);
													}
													else if(_state==SUCCESS) {
														support_names.accept(_position_requirement_element);
														association_names.accept(_position_requirement_element);
														room_names.accept(_position_requirement_element);
														activity_names.accept(_position_requirement_element);
														siding_names.accept(_position_requirement_element);
														item_names.accept(_position_requirement_element);
														aspect_names.accept(_position_requirement_element);
														affinity_names.accept(_position_requirement_element);
														activity_type_names.accept(_position_requirement_element);
														trail_names.accept(_position_requirement_element);
														attack_names.accept(_position_requirement_element);
														reason_names.accept(_position_requirement_element);
														trait_names.accept(_position_requirement_element);
														condition_names.accept(_position_requirement_element);
														payment_short_type_names.accept(_position_requirement_element);
														skill_names.accept(_position_requirement_element);
														map_names.accept(_position_requirement_element);
														event_names.accept(_position_requirement_element);
														image_names.accept(_position_requirement_element);
														tile_symbols.accept(_position_requirement_element);
														payment_long_type_names.accept(_position_requirement_element);
														area_names.accept(_position_requirement_element);
														structure_names.accept(_position_requirement_element);
														tile_names.accept(_position_requirement_element);
														hero_stat.accept(_position_requirement_element);
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
		}
	}
}