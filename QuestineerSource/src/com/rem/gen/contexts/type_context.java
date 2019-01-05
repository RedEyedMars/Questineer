package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.for_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class type_context extends for_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public type_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public type_context() {
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
	public void parse_type_name() {
		int _position_type_name = -1;
		Token.Parsed _token_type_name = null;
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
		_position_type_name=_position;
		_token_type_name=_token;
		_token=new Tokens.Rule.TypeNameToken();
		parse__anonymous_200();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"type_name(type_name)");
				_furthestPosition=_position;
			}
			_position=_position_type_name;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_type_name.add(_position_type_name,_token);
		}
		_token=_token_type_name;
		if(_state==FAILED) {
			support_names.reject(_position_type_name);
			association_names.reject(_position_type_name);
			room_names.reject(_position_type_name);
			activity_names.reject(_position_type_name);
			siding_names.reject(_position_type_name);
			item_names.reject(_position_type_name);
			aspect_names.reject(_position_type_name);
			affinity_names.reject(_position_type_name);
			activity_type_names.reject(_position_type_name);
			trail_names.reject(_position_type_name);
			attack_names.reject(_position_type_name);
			reason_names.reject(_position_type_name);
			trait_names.reject(_position_type_name);
			condition_names.reject(_position_type_name);
			payment_short_type_names.reject(_position_type_name);
			skill_names.reject(_position_type_name);
			map_names.reject(_position_type_name);
			event_names.reject(_position_type_name);
			image_names.reject(_position_type_name);
			tile_symbols.reject(_position_type_name);
			payment_long_type_names.reject(_position_type_name);
			area_names.reject(_position_type_name);
			structure_names.reject(_position_type_name);
			tile_names.reject(_position_type_name);
			hero_stat.reject(_position_type_name);
			_state=SUCCESS;
			_position_type_name=_position;
			_token_type_name=_token;
			_token=new Tokens.Rule.TypeNameToken();
			int _state_216 = _state;
			parse__anonymous_201();
			if(_state_216==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"type_name(type_name)");
					_furthestPosition=_position;
				}
				_position=_position_type_name;
			}
			else {
				_token_NAME=_token;
				_token=new Tokens.Name.TypeNameToken();
				_position_NAME=_position;
				parse_NAME();
				if(_state==SUCCESS) {
					_token_NAME.add(_position_NAME,_token);
				}
				_token=_token_NAME;
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"type_name(type_name)");
						_furthestPosition=_position;
					}
					_position=_position_type_name;
				}
				else {
					int _state_217 = _state;
					while(_position<_inputLength) {
						parse__anonymous_202();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_217==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"type_name(type_name)");
							_furthestPosition=_position;
						}
						_position=_position_type_name;
					}
					else {
						int _state_218 = _state;
						while(_position<_inputLength) {
							if(_position+2-1 >=_inputLength) {
								_state=FAILED;
							}
							else {
								if(_inputArray[_position+0]!='[') {
									_state=FAILED;
								}
								if(_inputArray[_position+1]!=']') {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,Tokens.Syntax.syntax_149.isListToken);
								_position=_position+2;
								while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
									++_position;
								}
							}
							else if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain []");
									_furthestPosition=_position;
								}
							}
							if(_state==FAILED) {
								break;
							}
						}
						if(_state_218==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"type_name(type_name)");
								_furthestPosition=_position;
							}
							_position=_position_type_name;
						}
						else {
						}
					}
				}
			}
			if(_state==SUCCESS) {
				_token_type_name.add(_position_type_name,_token);
			}
			_token=_token_type_name;
			if(_state==FAILED) {
				support_names.reject(_position_type_name);
				association_names.reject(_position_type_name);
				room_names.reject(_position_type_name);
				activity_names.reject(_position_type_name);
				siding_names.reject(_position_type_name);
				item_names.reject(_position_type_name);
				aspect_names.reject(_position_type_name);
				affinity_names.reject(_position_type_name);
				activity_type_names.reject(_position_type_name);
				trail_names.reject(_position_type_name);
				attack_names.reject(_position_type_name);
				reason_names.reject(_position_type_name);
				trait_names.reject(_position_type_name);
				condition_names.reject(_position_type_name);
				payment_short_type_names.reject(_position_type_name);
				skill_names.reject(_position_type_name);
				map_names.reject(_position_type_name);
				event_names.reject(_position_type_name);
				image_names.reject(_position_type_name);
				tile_symbols.reject(_position_type_name);
				payment_long_type_names.reject(_position_type_name);
				area_names.reject(_position_type_name);
				structure_names.reject(_position_type_name);
				tile_names.reject(_position_type_name);
				hero_stat.reject(_position_type_name);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_type_name);
				association_names.accept(_position_type_name);
				room_names.accept(_position_type_name);
				activity_names.accept(_position_type_name);
				siding_names.accept(_position_type_name);
				item_names.accept(_position_type_name);
				aspect_names.accept(_position_type_name);
				affinity_names.accept(_position_type_name);
				activity_type_names.accept(_position_type_name);
				trail_names.accept(_position_type_name);
				attack_names.accept(_position_type_name);
				reason_names.accept(_position_type_name);
				trait_names.accept(_position_type_name);
				condition_names.accept(_position_type_name);
				payment_short_type_names.accept(_position_type_name);
				skill_names.accept(_position_type_name);
				map_names.accept(_position_type_name);
				event_names.accept(_position_type_name);
				image_names.accept(_position_type_name);
				tile_symbols.accept(_position_type_name);
				payment_long_type_names.accept(_position_type_name);
				area_names.accept(_position_type_name);
				structure_names.accept(_position_type_name);
				tile_names.accept(_position_type_name);
				hero_stat.accept(_position_type_name);
			}
		}
	}
}