package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.has_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class description_context extends has_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public description_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public description_context() {
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
	public void parse_DESCRIPTION() {
		int _position_DESCRIPTION = -1;
		Token.Parsed _token_DESCRIPTION = null;
		int _length_DESCRIPTION_brace = _inputLength;
		if(brace_2.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_2.get(_position);
			int _position_DESCRIPTION_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
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
			_position_DESCRIPTION=_position;
			_token_DESCRIPTION=_token;
			_token=new Tokens.Rule.DESCRIPTIONToken();
			int _position_regex_6 = _position;
			int _multiple_index_10 = 0;
			int _state_10 = _state;
			while(_position<_inputLength) {
				if(_position<_inputLength) {
					++_position;
				}
				else {
					_state=FAILED;
				}
				if(_state==FAILED) {
					break;
				}
				else {
					++_multiple_index_10;
				}
			}
			if(_state_10==SUCCESS&&_multiple_index_10>0 ) {
				_state=SUCCESS;
			}
			else {
				_state=FAILED;
			}
			if(_state==SUCCESS) {
				_token.setValue(_input.substring(_position_regex_6,_position));
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,".+");
					_furthestPosition=_position;
				}
				_position=_position_regex_6;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"DESCRIPTION(DESCRIPTION)");
					_furthestPosition=_position;
				}
				_position=_position_DESCRIPTION;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_DESCRIPTION.add(_position_DESCRIPTION,_token);
			}
			_token=_token_DESCRIPTION;
			if(_state==SUCCESS&&brace_2.get(_position_DESCRIPTION_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("DESCRIPTION",_position,_lineNumberRanges));
				_position=brace_2.get(_position_DESCRIPTION_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_DESCRIPTION_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_DESCRIPTION);
				association_names.reject(_position_DESCRIPTION);
				room_names.reject(_position_DESCRIPTION);
				activity_names.reject(_position_DESCRIPTION);
				siding_names.reject(_position_DESCRIPTION);
				item_names.reject(_position_DESCRIPTION);
				aspect_names.reject(_position_DESCRIPTION);
				affinity_names.reject(_position_DESCRIPTION);
				activity_type_names.reject(_position_DESCRIPTION);
				trail_names.reject(_position_DESCRIPTION);
				attack_names.reject(_position_DESCRIPTION);
				reason_names.reject(_position_DESCRIPTION);
				trait_names.reject(_position_DESCRIPTION);
				condition_names.reject(_position_DESCRIPTION);
				payment_short_type_names.reject(_position_DESCRIPTION);
				skill_names.reject(_position_DESCRIPTION);
				map_names.reject(_position_DESCRIPTION);
				event_names.reject(_position_DESCRIPTION);
				image_names.reject(_position_DESCRIPTION);
				tile_symbols.reject(_position_DESCRIPTION);
				payment_long_type_names.reject(_position_DESCRIPTION);
				area_names.reject(_position_DESCRIPTION);
				structure_names.reject(_position_DESCRIPTION);
				tile_names.reject(_position_DESCRIPTION);
				hero_stat.reject(_position_DESCRIPTION);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_DESCRIPTION);
				association_names.accept(_position_DESCRIPTION);
				room_names.accept(_position_DESCRIPTION);
				activity_names.accept(_position_DESCRIPTION);
				siding_names.accept(_position_DESCRIPTION);
				item_names.accept(_position_DESCRIPTION);
				aspect_names.accept(_position_DESCRIPTION);
				affinity_names.accept(_position_DESCRIPTION);
				activity_type_names.accept(_position_DESCRIPTION);
				trail_names.accept(_position_DESCRIPTION);
				attack_names.accept(_position_DESCRIPTION);
				reason_names.accept(_position_DESCRIPTION);
				trait_names.accept(_position_DESCRIPTION);
				condition_names.accept(_position_DESCRIPTION);
				payment_short_type_names.accept(_position_DESCRIPTION);
				skill_names.accept(_position_DESCRIPTION);
				map_names.accept(_position_DESCRIPTION);
				event_names.accept(_position_DESCRIPTION);
				image_names.accept(_position_DESCRIPTION);
				tile_symbols.accept(_position_DESCRIPTION);
				payment_long_type_names.accept(_position_DESCRIPTION);
				area_names.accept(_position_DESCRIPTION);
				structure_names.accept(_position_DESCRIPTION);
				tile_names.accept(_position_DESCRIPTION);
				hero_stat.accept(_position_DESCRIPTION);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"DESCRIPTION(DESCRIPTION)");
				_furthestPosition=_position;
			}
		}
	}
}