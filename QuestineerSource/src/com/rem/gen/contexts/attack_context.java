package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.AnonymousContext;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class attack_context extends AnonymousContext{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public attack_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public attack_context() {
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
	public void parse_attack_declaration() {
		int _position_attack_declaration = -1;
		Token.Parsed _token_attack_declaration = null;
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
		_position_attack_declaration=_position;
		_token_attack_declaration=_token;
		_token=new Tokens.Rule.AttackDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_15.contains(_position)) {
			_recursion_protection_NAME_15.add(_position);
			parse_NAME();
			_recursion_protection_NAME_15.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				attack_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.AttackNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_declaration(attack_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_attack_declaration;
		}
		else {
			int _state_54 = _state;
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
			if(_state_54==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_declaration(attack_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_attack_declaration;
			}
			else {
				parse_DESCRIPTION();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_declaration(attack_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_attack_declaration;
				}
				else {
					int _state_55 = _state;
					while(_position<_inputLength) {
						parse_attack_element();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_55==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_declaration(attack_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_attack_declaration;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_attack_declaration.add(_position_attack_declaration,_token);
		}
		_token=_token_attack_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_attack_declaration);
			association_names.reject(_position_attack_declaration);
			room_names.reject(_position_attack_declaration);
			activity_names.reject(_position_attack_declaration);
			siding_names.reject(_position_attack_declaration);
			item_names.reject(_position_attack_declaration);
			aspect_names.reject(_position_attack_declaration);
			affinity_names.reject(_position_attack_declaration);
			activity_type_names.reject(_position_attack_declaration);
			trail_names.reject(_position_attack_declaration);
			attack_names.reject(_position_attack_declaration);
			reason_names.reject(_position_attack_declaration);
			trait_names.reject(_position_attack_declaration);
			condition_names.reject(_position_attack_declaration);
			payment_short_type_names.reject(_position_attack_declaration);
			skill_names.reject(_position_attack_declaration);
			map_names.reject(_position_attack_declaration);
			event_names.reject(_position_attack_declaration);
			image_names.reject(_position_attack_declaration);
			tile_symbols.reject(_position_attack_declaration);
			payment_long_type_names.reject(_position_attack_declaration);
			area_names.reject(_position_attack_declaration);
			structure_names.reject(_position_attack_declaration);
			tile_names.reject(_position_attack_declaration);
			hero_stat.reject(_position_attack_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_attack_declaration);
			association_names.accept(_position_attack_declaration);
			room_names.accept(_position_attack_declaration);
			activity_names.accept(_position_attack_declaration);
			siding_names.accept(_position_attack_declaration);
			item_names.accept(_position_attack_declaration);
			aspect_names.accept(_position_attack_declaration);
			affinity_names.accept(_position_attack_declaration);
			activity_type_names.accept(_position_attack_declaration);
			trail_names.accept(_position_attack_declaration);
			attack_names.accept(_position_attack_declaration);
			reason_names.accept(_position_attack_declaration);
			trait_names.accept(_position_attack_declaration);
			condition_names.accept(_position_attack_declaration);
			payment_short_type_names.accept(_position_attack_declaration);
			skill_names.accept(_position_attack_declaration);
			map_names.accept(_position_attack_declaration);
			event_names.accept(_position_attack_declaration);
			image_names.accept(_position_attack_declaration);
			tile_symbols.accept(_position_attack_declaration);
			payment_long_type_names.accept(_position_attack_declaration);
			area_names.accept(_position_attack_declaration);
			structure_names.accept(_position_attack_declaration);
			tile_names.accept(_position_attack_declaration);
			hero_stat.accept(_position_attack_declaration);
		}
	}
	public void parse_attack_element() {
		int _position_attack_element = -1;
		Token.Parsed _token_attack_element = null;
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
		_position_attack_element=_position;
		_token_attack_element=_token;
		_token=new Tokens.Rule.AttackElementToken();
		parse_comments();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_element(attack_element)");
				_furthestPosition=_position;
			}
			_position=_position_attack_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_attack_element.addAll(_token);
			_token_attack_element.setValue(_token.getValue());
		}
		_token=_token_attack_element;
		if(_state==FAILED) {
			support_names.reject(_position_attack_element);
			association_names.reject(_position_attack_element);
			room_names.reject(_position_attack_element);
			activity_names.reject(_position_attack_element);
			siding_names.reject(_position_attack_element);
			item_names.reject(_position_attack_element);
			aspect_names.reject(_position_attack_element);
			affinity_names.reject(_position_attack_element);
			activity_type_names.reject(_position_attack_element);
			trail_names.reject(_position_attack_element);
			attack_names.reject(_position_attack_element);
			reason_names.reject(_position_attack_element);
			trait_names.reject(_position_attack_element);
			condition_names.reject(_position_attack_element);
			payment_short_type_names.reject(_position_attack_element);
			skill_names.reject(_position_attack_element);
			map_names.reject(_position_attack_element);
			event_names.reject(_position_attack_element);
			image_names.reject(_position_attack_element);
			tile_symbols.reject(_position_attack_element);
			payment_long_type_names.reject(_position_attack_element);
			area_names.reject(_position_attack_element);
			structure_names.reject(_position_attack_element);
			tile_names.reject(_position_attack_element);
			hero_stat.reject(_position_attack_element);
			_state=SUCCESS;
			_position_attack_element=_position;
			_token_attack_element=_token;
			_token=new Tokens.Rule.AttackElementToken();
			parse__anonymous_39();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_element(attack_element)");
					_furthestPosition=_position;
				}
				_position=_position_attack_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_attack_element.addAll(_token);
				_token_attack_element.setValue(_token.getValue());
			}
			_token=_token_attack_element;
			if(_state==FAILED) {
				support_names.reject(_position_attack_element);
				association_names.reject(_position_attack_element);
				room_names.reject(_position_attack_element);
				activity_names.reject(_position_attack_element);
				siding_names.reject(_position_attack_element);
				item_names.reject(_position_attack_element);
				aspect_names.reject(_position_attack_element);
				affinity_names.reject(_position_attack_element);
				activity_type_names.reject(_position_attack_element);
				trail_names.reject(_position_attack_element);
				attack_names.reject(_position_attack_element);
				reason_names.reject(_position_attack_element);
				trait_names.reject(_position_attack_element);
				condition_names.reject(_position_attack_element);
				payment_short_type_names.reject(_position_attack_element);
				skill_names.reject(_position_attack_element);
				map_names.reject(_position_attack_element);
				event_names.reject(_position_attack_element);
				image_names.reject(_position_attack_element);
				tile_symbols.reject(_position_attack_element);
				payment_long_type_names.reject(_position_attack_element);
				area_names.reject(_position_attack_element);
				structure_names.reject(_position_attack_element);
				tile_names.reject(_position_attack_element);
				hero_stat.reject(_position_attack_element);
				_state=SUCCESS;
				_position_attack_element=_position;
				_token_attack_element=_token;
				_token=new Tokens.Rule.AttackElementToken();
				parse__anonymous_40();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_element(attack_element)");
						_furthestPosition=_position;
					}
					_position=_position_attack_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_attack_element.addAll(_token);
					_token_attack_element.setValue(_token.getValue());
				}
				_token=_token_attack_element;
				if(_state==FAILED) {
					support_names.reject(_position_attack_element);
					association_names.reject(_position_attack_element);
					room_names.reject(_position_attack_element);
					activity_names.reject(_position_attack_element);
					siding_names.reject(_position_attack_element);
					item_names.reject(_position_attack_element);
					aspect_names.reject(_position_attack_element);
					affinity_names.reject(_position_attack_element);
					activity_type_names.reject(_position_attack_element);
					trail_names.reject(_position_attack_element);
					attack_names.reject(_position_attack_element);
					reason_names.reject(_position_attack_element);
					trait_names.reject(_position_attack_element);
					condition_names.reject(_position_attack_element);
					payment_short_type_names.reject(_position_attack_element);
					skill_names.reject(_position_attack_element);
					map_names.reject(_position_attack_element);
					event_names.reject(_position_attack_element);
					image_names.reject(_position_attack_element);
					tile_symbols.reject(_position_attack_element);
					payment_long_type_names.reject(_position_attack_element);
					area_names.reject(_position_attack_element);
					structure_names.reject(_position_attack_element);
					tile_names.reject(_position_attack_element);
					hero_stat.reject(_position_attack_element);
					_state=SUCCESS;
					_position_attack_element=_position;
					_token_attack_element=_token;
					_token=new Tokens.Rule.AttackElementToken();
					parse__anonymous_41();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_element(attack_element)");
							_furthestPosition=_position;
						}
						_position=_position_attack_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_attack_element.addAll(_token);
						_token_attack_element.setValue(_token.getValue());
					}
					_token=_token_attack_element;
					if(_state==FAILED) {
						support_names.reject(_position_attack_element);
						association_names.reject(_position_attack_element);
						room_names.reject(_position_attack_element);
						activity_names.reject(_position_attack_element);
						siding_names.reject(_position_attack_element);
						item_names.reject(_position_attack_element);
						aspect_names.reject(_position_attack_element);
						affinity_names.reject(_position_attack_element);
						activity_type_names.reject(_position_attack_element);
						trail_names.reject(_position_attack_element);
						attack_names.reject(_position_attack_element);
						reason_names.reject(_position_attack_element);
						trait_names.reject(_position_attack_element);
						condition_names.reject(_position_attack_element);
						payment_short_type_names.reject(_position_attack_element);
						skill_names.reject(_position_attack_element);
						map_names.reject(_position_attack_element);
						event_names.reject(_position_attack_element);
						image_names.reject(_position_attack_element);
						tile_symbols.reject(_position_attack_element);
						payment_long_type_names.reject(_position_attack_element);
						area_names.reject(_position_attack_element);
						structure_names.reject(_position_attack_element);
						tile_names.reject(_position_attack_element);
						hero_stat.reject(_position_attack_element);
						_state=SUCCESS;
						_position_attack_element=_position;
						_token_attack_element=_token;
						_token=new Tokens.Rule.AttackElementToken();
						parse__anonymous_44();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_element(attack_element)");
								_furthestPosition=_position;
							}
							_position=_position_attack_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_attack_element.addAll(_token);
							_token_attack_element.setValue(_token.getValue());
						}
						_token=_token_attack_element;
						if(_state==FAILED) {
							support_names.reject(_position_attack_element);
							association_names.reject(_position_attack_element);
							room_names.reject(_position_attack_element);
							activity_names.reject(_position_attack_element);
							siding_names.reject(_position_attack_element);
							item_names.reject(_position_attack_element);
							aspect_names.reject(_position_attack_element);
							affinity_names.reject(_position_attack_element);
							activity_type_names.reject(_position_attack_element);
							trail_names.reject(_position_attack_element);
							attack_names.reject(_position_attack_element);
							reason_names.reject(_position_attack_element);
							trait_names.reject(_position_attack_element);
							condition_names.reject(_position_attack_element);
							payment_short_type_names.reject(_position_attack_element);
							skill_names.reject(_position_attack_element);
							map_names.reject(_position_attack_element);
							event_names.reject(_position_attack_element);
							image_names.reject(_position_attack_element);
							tile_symbols.reject(_position_attack_element);
							payment_long_type_names.reject(_position_attack_element);
							area_names.reject(_position_attack_element);
							structure_names.reject(_position_attack_element);
							tile_names.reject(_position_attack_element);
							hero_stat.reject(_position_attack_element);
							_state=SUCCESS;
							_position_attack_element=_position;
							_token_attack_element=_token;
							_token=new Tokens.Rule.AttackElementToken();
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
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_element(attack_element)");
									_furthestPosition=_position;
								}
								_position=_position_attack_element;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_attack_element.addAll(_token);
								_token_attack_element.setValue(_token.getValue());
							}
							_token=_token_attack_element;
							if(_state==FAILED) {
								support_names.reject(_position_attack_element);
								association_names.reject(_position_attack_element);
								room_names.reject(_position_attack_element);
								activity_names.reject(_position_attack_element);
								siding_names.reject(_position_attack_element);
								item_names.reject(_position_attack_element);
								aspect_names.reject(_position_attack_element);
								affinity_names.reject(_position_attack_element);
								activity_type_names.reject(_position_attack_element);
								trail_names.reject(_position_attack_element);
								attack_names.reject(_position_attack_element);
								reason_names.reject(_position_attack_element);
								trait_names.reject(_position_attack_element);
								condition_names.reject(_position_attack_element);
								payment_short_type_names.reject(_position_attack_element);
								skill_names.reject(_position_attack_element);
								map_names.reject(_position_attack_element);
								event_names.reject(_position_attack_element);
								image_names.reject(_position_attack_element);
								tile_symbols.reject(_position_attack_element);
								payment_long_type_names.reject(_position_attack_element);
								area_names.reject(_position_attack_element);
								structure_names.reject(_position_attack_element);
								tile_names.reject(_position_attack_element);
								hero_stat.reject(_position_attack_element);
							}
							else if(_state==SUCCESS) {
								support_names.accept(_position_attack_element);
								association_names.accept(_position_attack_element);
								room_names.accept(_position_attack_element);
								activity_names.accept(_position_attack_element);
								siding_names.accept(_position_attack_element);
								item_names.accept(_position_attack_element);
								aspect_names.accept(_position_attack_element);
								affinity_names.accept(_position_attack_element);
								activity_type_names.accept(_position_attack_element);
								trail_names.accept(_position_attack_element);
								attack_names.accept(_position_attack_element);
								reason_names.accept(_position_attack_element);
								trait_names.accept(_position_attack_element);
								condition_names.accept(_position_attack_element);
								payment_short_type_names.accept(_position_attack_element);
								skill_names.accept(_position_attack_element);
								map_names.accept(_position_attack_element);
								event_names.accept(_position_attack_element);
								image_names.accept(_position_attack_element);
								tile_symbols.accept(_position_attack_element);
								payment_long_type_names.accept(_position_attack_element);
								area_names.accept(_position_attack_element);
								structure_names.accept(_position_attack_element);
								tile_names.accept(_position_attack_element);
								hero_stat.accept(_position_attack_element);
							}
						}
					}
				}
			}
		}
	}
}