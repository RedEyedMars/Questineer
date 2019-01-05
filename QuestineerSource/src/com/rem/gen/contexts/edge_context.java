package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.structures_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class edge_context extends structures_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public edge_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public edge_context() {
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
	public void parse_edge_if() {
		int _position_edge_if = -1;
		Token.Parsed _token_edge_if = null;
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
		_position_edge_if=_position;
		_token_edge_if=_token;
		_token=new Tokens.Rule.EdgeIfToken();
		parse__anonymous_104();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_if(edge_if)");
				_furthestPosition=_position;
			}
			_position=_position_edge_if;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_edge_if.add(_position_edge_if,_token);
		}
		_token=_token_edge_if;
		if(_state==FAILED) {
			support_names.reject(_position_edge_if);
			association_names.reject(_position_edge_if);
			room_names.reject(_position_edge_if);
			activity_names.reject(_position_edge_if);
			siding_names.reject(_position_edge_if);
			item_names.reject(_position_edge_if);
			aspect_names.reject(_position_edge_if);
			affinity_names.reject(_position_edge_if);
			activity_type_names.reject(_position_edge_if);
			trail_names.reject(_position_edge_if);
			attack_names.reject(_position_edge_if);
			reason_names.reject(_position_edge_if);
			trait_names.reject(_position_edge_if);
			condition_names.reject(_position_edge_if);
			payment_short_type_names.reject(_position_edge_if);
			skill_names.reject(_position_edge_if);
			map_names.reject(_position_edge_if);
			event_names.reject(_position_edge_if);
			image_names.reject(_position_edge_if);
			tile_symbols.reject(_position_edge_if);
			payment_long_type_names.reject(_position_edge_if);
			area_names.reject(_position_edge_if);
			structure_names.reject(_position_edge_if);
			tile_names.reject(_position_edge_if);
			hero_stat.reject(_position_edge_if);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_edge_if);
			association_names.accept(_position_edge_if);
			room_names.accept(_position_edge_if);
			activity_names.accept(_position_edge_if);
			siding_names.accept(_position_edge_if);
			item_names.accept(_position_edge_if);
			aspect_names.accept(_position_edge_if);
			affinity_names.accept(_position_edge_if);
			activity_type_names.accept(_position_edge_if);
			trail_names.accept(_position_edge_if);
			attack_names.accept(_position_edge_if);
			reason_names.accept(_position_edge_if);
			trait_names.accept(_position_edge_if);
			condition_names.accept(_position_edge_if);
			payment_short_type_names.accept(_position_edge_if);
			skill_names.accept(_position_edge_if);
			map_names.accept(_position_edge_if);
			event_names.accept(_position_edge_if);
			image_names.accept(_position_edge_if);
			tile_symbols.accept(_position_edge_if);
			payment_long_type_names.accept(_position_edge_if);
			area_names.accept(_position_edge_if);
			structure_names.accept(_position_edge_if);
			tile_names.accept(_position_edge_if);
			hero_stat.accept(_position_edge_if);
		}
	}
	public void parse_edge_if_operator() {
		int _position_edge_if_operator = -1;
		Token.Parsed _token_edge_if_operator = null;
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
		_position_edge_if_operator=_position;
		_token_edge_if_operator=_token;
		_token=new Tokens.Rule.EdgeIfOperatorToken();
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
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_if_operator(edge_if_operator)");
				_furthestPosition=_position;
			}
			_position=_position_edge_if_operator;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_edge_if_operator.add(_position_edge_if_operator,_token);
		}
		_token=_token_edge_if_operator;
		if(_state==FAILED) {
			support_names.reject(_position_edge_if_operator);
			association_names.reject(_position_edge_if_operator);
			room_names.reject(_position_edge_if_operator);
			activity_names.reject(_position_edge_if_operator);
			siding_names.reject(_position_edge_if_operator);
			item_names.reject(_position_edge_if_operator);
			aspect_names.reject(_position_edge_if_operator);
			affinity_names.reject(_position_edge_if_operator);
			activity_type_names.reject(_position_edge_if_operator);
			trail_names.reject(_position_edge_if_operator);
			attack_names.reject(_position_edge_if_operator);
			reason_names.reject(_position_edge_if_operator);
			trait_names.reject(_position_edge_if_operator);
			condition_names.reject(_position_edge_if_operator);
			payment_short_type_names.reject(_position_edge_if_operator);
			skill_names.reject(_position_edge_if_operator);
			map_names.reject(_position_edge_if_operator);
			event_names.reject(_position_edge_if_operator);
			image_names.reject(_position_edge_if_operator);
			tile_symbols.reject(_position_edge_if_operator);
			payment_long_type_names.reject(_position_edge_if_operator);
			area_names.reject(_position_edge_if_operator);
			structure_names.reject(_position_edge_if_operator);
			tile_names.reject(_position_edge_if_operator);
			hero_stat.reject(_position_edge_if_operator);
			_state=SUCCESS;
			_position_edge_if_operator=_position;
			_token_edge_if_operator=_token;
			_token=new Tokens.Rule.EdgeIfOperatorToken();
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_if_operator(edge_if_operator)");
					_furthestPosition=_position;
				}
				_position=_position_edge_if_operator;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_edge_if_operator.add(_position_edge_if_operator,_token);
			}
			_token=_token_edge_if_operator;
			if(_state==FAILED) {
				support_names.reject(_position_edge_if_operator);
				association_names.reject(_position_edge_if_operator);
				room_names.reject(_position_edge_if_operator);
				activity_names.reject(_position_edge_if_operator);
				siding_names.reject(_position_edge_if_operator);
				item_names.reject(_position_edge_if_operator);
				aspect_names.reject(_position_edge_if_operator);
				affinity_names.reject(_position_edge_if_operator);
				activity_type_names.reject(_position_edge_if_operator);
				trail_names.reject(_position_edge_if_operator);
				attack_names.reject(_position_edge_if_operator);
				reason_names.reject(_position_edge_if_operator);
				trait_names.reject(_position_edge_if_operator);
				condition_names.reject(_position_edge_if_operator);
				payment_short_type_names.reject(_position_edge_if_operator);
				skill_names.reject(_position_edge_if_operator);
				map_names.reject(_position_edge_if_operator);
				event_names.reject(_position_edge_if_operator);
				image_names.reject(_position_edge_if_operator);
				tile_symbols.reject(_position_edge_if_operator);
				payment_long_type_names.reject(_position_edge_if_operator);
				area_names.reject(_position_edge_if_operator);
				structure_names.reject(_position_edge_if_operator);
				tile_names.reject(_position_edge_if_operator);
				hero_stat.reject(_position_edge_if_operator);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_edge_if_operator);
				association_names.accept(_position_edge_if_operator);
				room_names.accept(_position_edge_if_operator);
				activity_names.accept(_position_edge_if_operator);
				siding_names.accept(_position_edge_if_operator);
				item_names.accept(_position_edge_if_operator);
				aspect_names.accept(_position_edge_if_operator);
				affinity_names.accept(_position_edge_if_operator);
				activity_type_names.accept(_position_edge_if_operator);
				trail_names.accept(_position_edge_if_operator);
				attack_names.accept(_position_edge_if_operator);
				reason_names.accept(_position_edge_if_operator);
				trait_names.accept(_position_edge_if_operator);
				condition_names.accept(_position_edge_if_operator);
				payment_short_type_names.accept(_position_edge_if_operator);
				skill_names.accept(_position_edge_if_operator);
				map_names.accept(_position_edge_if_operator);
				event_names.accept(_position_edge_if_operator);
				image_names.accept(_position_edge_if_operator);
				tile_symbols.accept(_position_edge_if_operator);
				payment_long_type_names.accept(_position_edge_if_operator);
				area_names.accept(_position_edge_if_operator);
				structure_names.accept(_position_edge_if_operator);
				tile_names.accept(_position_edge_if_operator);
				hero_stat.accept(_position_edge_if_operator);
			}
		}
	}
	public void parse_edge_definition() {
		int _position_edge_definition = -1;
		Token.Parsed _token_edge_definition = null;
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
		_position_edge_definition=_position;
		_token_edge_definition=_token;
		_token=new Tokens.Rule.EdgeDefinitionToken();
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
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_definition(edge_definition)");
				_furthestPosition=_position;
			}
			_position=_position_edge_definition;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.EdgeTileNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_definition(edge_definition)");
					_furthestPosition=_position;
				}
				_position=_position_edge_definition;
			}
			else {
				int _state_136 = _state;
				while(_position<_inputLength) {
					parse__anonymous_101();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_136==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_definition(edge_definition)");
						_furthestPosition=_position;
					}
					_position=_position_edge_definition;
				}
				else {
					parse_direction_name();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_definition(edge_definition)");
							_furthestPosition=_position;
						}
						_position=_position_edge_definition;
					}
					else {
						int _state_137 = _state;
						while(_position<_inputLength) {
							parse__anonymous_102();
							if(_state==FAILED) {
								break;
							}
						}
						if(_state_137==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_definition(edge_definition)");
								_furthestPosition=_position;
							}
							_position=_position_edge_definition;
						}
						else {
							int _state_138 = _state;
							while(_position<_inputLength) {
								parse__anonymous_103();
								if(_state==FAILED) {
									break;
								}
							}
							if(_state_138==SUCCESS&&_state==FAILED) {
								_state=SUCCESS;
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"edge_definition(edge_definition)");
									_furthestPosition=_position;
								}
								_position=_position_edge_definition;
							}
							else {
							}
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_edge_definition.add(_position_edge_definition,_token);
		}
		_token=_token_edge_definition;
		if(_state==FAILED) {
			support_names.reject(_position_edge_definition);
			association_names.reject(_position_edge_definition);
			room_names.reject(_position_edge_definition);
			activity_names.reject(_position_edge_definition);
			siding_names.reject(_position_edge_definition);
			item_names.reject(_position_edge_definition);
			aspect_names.reject(_position_edge_definition);
			affinity_names.reject(_position_edge_definition);
			activity_type_names.reject(_position_edge_definition);
			trail_names.reject(_position_edge_definition);
			attack_names.reject(_position_edge_definition);
			reason_names.reject(_position_edge_definition);
			trait_names.reject(_position_edge_definition);
			condition_names.reject(_position_edge_definition);
			payment_short_type_names.reject(_position_edge_definition);
			skill_names.reject(_position_edge_definition);
			map_names.reject(_position_edge_definition);
			event_names.reject(_position_edge_definition);
			image_names.reject(_position_edge_definition);
			tile_symbols.reject(_position_edge_definition);
			payment_long_type_names.reject(_position_edge_definition);
			area_names.reject(_position_edge_definition);
			structure_names.reject(_position_edge_definition);
			tile_names.reject(_position_edge_definition);
			hero_stat.reject(_position_edge_definition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_edge_definition);
			association_names.accept(_position_edge_definition);
			room_names.accept(_position_edge_definition);
			activity_names.accept(_position_edge_definition);
			siding_names.accept(_position_edge_definition);
			item_names.accept(_position_edge_definition);
			aspect_names.accept(_position_edge_definition);
			affinity_names.accept(_position_edge_definition);
			activity_type_names.accept(_position_edge_definition);
			trail_names.accept(_position_edge_definition);
			attack_names.accept(_position_edge_definition);
			reason_names.accept(_position_edge_definition);
			trait_names.accept(_position_edge_definition);
			condition_names.accept(_position_edge_definition);
			payment_short_type_names.accept(_position_edge_definition);
			skill_names.accept(_position_edge_definition);
			map_names.accept(_position_edge_definition);
			event_names.accept(_position_edge_definition);
			image_names.accept(_position_edge_definition);
			tile_symbols.accept(_position_edge_definition);
			payment_long_type_names.accept(_position_edge_definition);
			area_names.accept(_position_edge_definition);
			structure_names.accept(_position_edge_definition);
			tile_names.accept(_position_edge_definition);
			hero_stat.accept(_position_edge_definition);
		}
	}
}