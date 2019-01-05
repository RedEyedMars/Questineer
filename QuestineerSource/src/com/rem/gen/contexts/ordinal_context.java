package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.trait_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class ordinal_context extends trait_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public ordinal_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public ordinal_context() {
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
	public void parse_ORDINAL() {
		int _position_ORDINAL = -1;
		Token.Parsed _token_ORDINAL = null;
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
		_position_ORDINAL=_position;
		_token_ORDINAL=_token;
		_token=new Tokens.Rule.ORDINALToken();
		int _position_regex_7 = _position;
		if(_position<_inputLength) {
			if(_inputArray[_position]=='<'||_inputArray[_position]=='>') {
				++_position;
			}
			else {
				_state=FAILED;
			}
		}
		else {
			_state=FAILED;
		}
		int _state_11 = _state;
		if(_position<_inputLength) {
			if(_position<_inputLength) {
				if(_inputArray[_position]=='=') {
					++_position;
				}
				else {
					_state=FAILED;
				}
			}
			else {
				_state=FAILED;
			}
		}
		if(_state_11==SUCCESS) {
			_state=SUCCESS;
		}
		if(_state==SUCCESS) {
			_token.setValue(_input.substring(_position_regex_7,_position));
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"[<>]=?");
				_furthestPosition=_position;
			}
			_position=_position_regex_7;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"ORDINAL(ORDINAL)");
				_furthestPosition=_position;
			}
			_position=_position_ORDINAL;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_ORDINAL.add(_position_ORDINAL,_token);
		}
		_token=_token_ORDINAL;
		if(_state==FAILED) {
			support_names.reject(_position_ORDINAL);
			association_names.reject(_position_ORDINAL);
			room_names.reject(_position_ORDINAL);
			activity_names.reject(_position_ORDINAL);
			siding_names.reject(_position_ORDINAL);
			item_names.reject(_position_ORDINAL);
			aspect_names.reject(_position_ORDINAL);
			affinity_names.reject(_position_ORDINAL);
			activity_type_names.reject(_position_ORDINAL);
			trail_names.reject(_position_ORDINAL);
			attack_names.reject(_position_ORDINAL);
			reason_names.reject(_position_ORDINAL);
			trait_names.reject(_position_ORDINAL);
			condition_names.reject(_position_ORDINAL);
			payment_short_type_names.reject(_position_ORDINAL);
			skill_names.reject(_position_ORDINAL);
			map_names.reject(_position_ORDINAL);
			event_names.reject(_position_ORDINAL);
			image_names.reject(_position_ORDINAL);
			tile_symbols.reject(_position_ORDINAL);
			payment_long_type_names.reject(_position_ORDINAL);
			area_names.reject(_position_ORDINAL);
			structure_names.reject(_position_ORDINAL);
			tile_names.reject(_position_ORDINAL);
			hero_stat.reject(_position_ORDINAL);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_ORDINAL);
			association_names.accept(_position_ORDINAL);
			room_names.accept(_position_ORDINAL);
			activity_names.accept(_position_ORDINAL);
			siding_names.accept(_position_ORDINAL);
			item_names.accept(_position_ORDINAL);
			aspect_names.accept(_position_ORDINAL);
			affinity_names.accept(_position_ORDINAL);
			activity_type_names.accept(_position_ORDINAL);
			trail_names.accept(_position_ORDINAL);
			attack_names.accept(_position_ORDINAL);
			reason_names.accept(_position_ORDINAL);
			trait_names.accept(_position_ORDINAL);
			condition_names.accept(_position_ORDINAL);
			payment_short_type_names.accept(_position_ORDINAL);
			skill_names.accept(_position_ORDINAL);
			map_names.accept(_position_ORDINAL);
			event_names.accept(_position_ORDINAL);
			image_names.accept(_position_ORDINAL);
			tile_symbols.accept(_position_ORDINAL);
			payment_long_type_names.accept(_position_ORDINAL);
			area_names.accept(_position_ORDINAL);
			structure_names.accept(_position_ORDINAL);
			tile_names.accept(_position_ORDINAL);
			hero_stat.accept(_position_ORDINAL);
		}
	}
}