package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.comments_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class siding_context extends comments_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public siding_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public siding_context() {
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
	public void parse_siding_definition() {
		int _position_siding_definition = -1;
		Token.Parsed _token_siding_definition = null;
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
		_position_siding_definition=_position;
		_token_siding_definition=_token;
		_token=new Tokens.Rule.SidingDefinitionToken();
		int _state_139 = _state;
		boolean _iteration_achieved_139 = false;
		while(_position<_inputLength) {
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
			if(_state==FAILED) {
				break;
			}
			else {
				_iteration_achieved_139=true;
			}
		}
		if(_iteration_achieved_139==false) {
			_state=FAILED;
		}
		else if(_state_139==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"siding_definition(siding_definition)");
				_furthestPosition=_position;
			}
			_position=_position_siding_definition;
		}
		else {
			parse_NAME();
			if(_state==SUCCESS) {
				String _value = _token.getLastValue();
				if(_value!=null) {
					siding_names.add(_value);
				}
				_token.add(_position,new Tokens.Name.SidingNameToken(_value));
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"siding_definition(siding_definition)");
					_furthestPosition=_position;
				}
				_position=_position_siding_definition;
			}
			else {
				int _state_140 = _state;
				boolean _iteration_achieved_140 = false;
				while(_position<_inputLength) {
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
					if(_state==FAILED) {
						break;
					}
					else {
						_iteration_achieved_140=true;
					}
				}
				if(_iteration_achieved_140==false) {
					_state=FAILED;
				}
				else if(_state_140==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"siding_definition(siding_definition)");
						_furthestPosition=_position;
					}
					_position=_position_siding_definition;
				}
				else {
					int _state_141 = _state;
					while(_position<_inputLength) {
						parse_tile_definition_element();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_141==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"siding_definition(siding_definition)");
							_furthestPosition=_position;
						}
						_position=_position_siding_definition;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_siding_definition.add(_position_siding_definition,_token);
		}
		_token=_token_siding_definition;
		if(_state==FAILED) {
			support_names.reject(_position_siding_definition);
			association_names.reject(_position_siding_definition);
			room_names.reject(_position_siding_definition);
			activity_names.reject(_position_siding_definition);
			siding_names.reject(_position_siding_definition);
			item_names.reject(_position_siding_definition);
			aspect_names.reject(_position_siding_definition);
			affinity_names.reject(_position_siding_definition);
			activity_type_names.reject(_position_siding_definition);
			trail_names.reject(_position_siding_definition);
			attack_names.reject(_position_siding_definition);
			reason_names.reject(_position_siding_definition);
			trait_names.reject(_position_siding_definition);
			condition_names.reject(_position_siding_definition);
			payment_short_type_names.reject(_position_siding_definition);
			skill_names.reject(_position_siding_definition);
			map_names.reject(_position_siding_definition);
			event_names.reject(_position_siding_definition);
			image_names.reject(_position_siding_definition);
			tile_symbols.reject(_position_siding_definition);
			payment_long_type_names.reject(_position_siding_definition);
			area_names.reject(_position_siding_definition);
			structure_names.reject(_position_siding_definition);
			tile_names.reject(_position_siding_definition);
			hero_stat.reject(_position_siding_definition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_siding_definition);
			association_names.accept(_position_siding_definition);
			room_names.accept(_position_siding_definition);
			activity_names.accept(_position_siding_definition);
			siding_names.accept(_position_siding_definition);
			item_names.accept(_position_siding_definition);
			aspect_names.accept(_position_siding_definition);
			affinity_names.accept(_position_siding_definition);
			activity_type_names.accept(_position_siding_definition);
			trail_names.accept(_position_siding_definition);
			attack_names.accept(_position_siding_definition);
			reason_names.accept(_position_siding_definition);
			trait_names.accept(_position_siding_definition);
			condition_names.accept(_position_siding_definition);
			payment_short_type_names.accept(_position_siding_definition);
			skill_names.accept(_position_siding_definition);
			map_names.accept(_position_siding_definition);
			event_names.accept(_position_siding_definition);
			image_names.accept(_position_siding_definition);
			tile_symbols.accept(_position_siding_definition);
			payment_long_type_names.accept(_position_siding_definition);
			area_names.accept(_position_siding_definition);
			structure_names.accept(_position_siding_definition);
			tile_names.accept(_position_siding_definition);
			hero_stat.accept(_position_siding_definition);
		}
	}
}