package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.support_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class float_context extends support_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public float_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public float_context() {
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
	public void parse_FLOAT() {
		int _position_FLOAT = -1;
		Token.Parsed _token_FLOAT = null;
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
		_position_FLOAT=_position;
		_token_FLOAT=_token;
		_token=new Tokens.Rule.FLOATToken();
		int _position_regex_2 = _position;
		if(_position<_inputLength) {
			if(_inputArray[_position]=='-') {
				++_position;
			}
		}
		int _multiple_index_4 = 0;
		int _state_4 = _state;
		while(_position<_inputLength) {
			if(_position<_inputLength) {
				if(_inputArray[_position]=='0'||_inputArray[_position]=='1'||_inputArray[_position]=='2'||_inputArray[_position]=='3'||_inputArray[_position]=='4'||_inputArray[_position]=='5'||_inputArray[_position]=='6'||_inputArray[_position]=='7'||_inputArray[_position]=='8'||_inputArray[_position]=='9') {
					++_position;
				}
				else {
					_state=FAILED;
				}
			}
			else {
				_state=FAILED;
			}
			if(_state==FAILED) {
				break;
			}
			else {
				++_multiple_index_4;
			}
		}
		if(_state_4==SUCCESS&&_multiple_index_4>0 ) {
			_state=SUCCESS;
		}
		else {
			_state=FAILED;
		}
		if(_position<_inputLength) {
			if(_inputArray[_position]=='.') {
				++_position;
			}
			else {
				_state=FAILED;
			}
		}
		else {
			_state=FAILED;
		}
		int _multiple_index_5 = 0;
		int _state_5 = _state;
		while(_position<_inputLength) {
			if(_position<_inputLength) {
				if(_inputArray[_position]=='0'||_inputArray[_position]=='1'||_inputArray[_position]=='2'||_inputArray[_position]=='3'||_inputArray[_position]=='4'||_inputArray[_position]=='5'||_inputArray[_position]=='6'||_inputArray[_position]=='7'||_inputArray[_position]=='8'||_inputArray[_position]=='9') {
					++_position;
				}
				else {
					_state=FAILED;
				}
			}
			else {
				_state=FAILED;
			}
			if(_state==FAILED) {
				break;
			}
			else {
				++_multiple_index_5;
			}
		}
		if(_state_5==SUCCESS&&_multiple_index_5>0 ) {
			_state=SUCCESS;
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token.setValue(_input.substring(_position_regex_2,_position));
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"[-]?\\\\d+\\.\\\\d+");
				_furthestPosition=_position;
			}
			_position=_position_regex_2;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"FLOAT(FLOAT)");
				_furthestPosition=_position;
			}
			_position=_position_FLOAT;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_FLOAT.add(_position_FLOAT,_token);
		}
		_token=_token_FLOAT;
		if(_state==FAILED) {
			support_names.reject(_position_FLOAT);
			association_names.reject(_position_FLOAT);
			room_names.reject(_position_FLOAT);
			activity_names.reject(_position_FLOAT);
			siding_names.reject(_position_FLOAT);
			item_names.reject(_position_FLOAT);
			aspect_names.reject(_position_FLOAT);
			affinity_names.reject(_position_FLOAT);
			activity_type_names.reject(_position_FLOAT);
			trail_names.reject(_position_FLOAT);
			attack_names.reject(_position_FLOAT);
			reason_names.reject(_position_FLOAT);
			trait_names.reject(_position_FLOAT);
			condition_names.reject(_position_FLOAT);
			payment_short_type_names.reject(_position_FLOAT);
			skill_names.reject(_position_FLOAT);
			map_names.reject(_position_FLOAT);
			event_names.reject(_position_FLOAT);
			image_names.reject(_position_FLOAT);
			tile_symbols.reject(_position_FLOAT);
			payment_long_type_names.reject(_position_FLOAT);
			area_names.reject(_position_FLOAT);
			structure_names.reject(_position_FLOAT);
			tile_names.reject(_position_FLOAT);
			hero_stat.reject(_position_FLOAT);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_FLOAT);
			association_names.accept(_position_FLOAT);
			room_names.accept(_position_FLOAT);
			activity_names.accept(_position_FLOAT);
			siding_names.accept(_position_FLOAT);
			item_names.accept(_position_FLOAT);
			aspect_names.accept(_position_FLOAT);
			affinity_names.accept(_position_FLOAT);
			activity_type_names.accept(_position_FLOAT);
			trail_names.accept(_position_FLOAT);
			attack_names.accept(_position_FLOAT);
			reason_names.accept(_position_FLOAT);
			trait_names.accept(_position_FLOAT);
			condition_names.accept(_position_FLOAT);
			payment_short_type_names.accept(_position_FLOAT);
			skill_names.accept(_position_FLOAT);
			map_names.accept(_position_FLOAT);
			event_names.accept(_position_FLOAT);
			image_names.accept(_position_FLOAT);
			tile_symbols.accept(_position_FLOAT);
			payment_long_type_names.accept(_position_FLOAT);
			area_names.accept(_position_FLOAT);
			structure_names.accept(_position_FLOAT);
			tile_names.accept(_position_FLOAT);
			hero_stat.accept(_position_FLOAT);
		}
	}
}