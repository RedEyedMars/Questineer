package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.shape_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class quote_context extends shape_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public quote_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public quote_context() {
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
	public void parse_QUOTE() {
		int _position_QUOTE = -1;
		Token.Parsed _token_QUOTE = null;
		int _length_QUOTE_brace = _inputLength;
		if(brace_0.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_0.get(_position);
			int _position_QUOTE_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false)) {
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
			_position_QUOTE=_position;
			_token_QUOTE=_token;
			_token=new Tokens.Rule.QUOTEToken();
			int _position_regex_12 = _position;
			int _multiple_index_155 = 0;
			int _state_155 = _state;
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
					++_multiple_index_155;
				}
			}
			if(_state_155==SUCCESS) {
				_state=SUCCESS;
			}
			if(_state==SUCCESS) {
				_token.setValue(_input.substring(_position_regex_12,_position));
				while(_position<_inputLength&&(false)) {
					++_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,".*");
					_furthestPosition=_position;
				}
				_position=_position_regex_12;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"QUOTE(QUOTE)");
					_furthestPosition=_position;
				}
				_position=_position_QUOTE;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_QUOTE.add(_position_QUOTE,_token);
			}
			_token=_token_QUOTE;
			if(_state==SUCCESS&&brace_0.get(_position_QUOTE_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("QUOTE",_position,_lineNumberRanges));
				_position=brace_0.get(_position_QUOTE_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_QUOTE_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_QUOTE);
				association_names.reject(_position_QUOTE);
				room_names.reject(_position_QUOTE);
				activity_names.reject(_position_QUOTE);
				siding_names.reject(_position_QUOTE);
				item_names.reject(_position_QUOTE);
				aspect_names.reject(_position_QUOTE);
				affinity_names.reject(_position_QUOTE);
				activity_type_names.reject(_position_QUOTE);
				trail_names.reject(_position_QUOTE);
				attack_names.reject(_position_QUOTE);
				reason_names.reject(_position_QUOTE);
				trait_names.reject(_position_QUOTE);
				condition_names.reject(_position_QUOTE);
				payment_short_type_names.reject(_position_QUOTE);
				skill_names.reject(_position_QUOTE);
				map_names.reject(_position_QUOTE);
				event_names.reject(_position_QUOTE);
				image_names.reject(_position_QUOTE);
				tile_symbols.reject(_position_QUOTE);
				payment_long_type_names.reject(_position_QUOTE);
				area_names.reject(_position_QUOTE);
				structure_names.reject(_position_QUOTE);
				tile_names.reject(_position_QUOTE);
				hero_stat.reject(_position_QUOTE);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_QUOTE);
				association_names.accept(_position_QUOTE);
				room_names.accept(_position_QUOTE);
				activity_names.accept(_position_QUOTE);
				siding_names.accept(_position_QUOTE);
				item_names.accept(_position_QUOTE);
				aspect_names.accept(_position_QUOTE);
				affinity_names.accept(_position_QUOTE);
				activity_type_names.accept(_position_QUOTE);
				trail_names.accept(_position_QUOTE);
				attack_names.accept(_position_QUOTE);
				reason_names.accept(_position_QUOTE);
				trait_names.accept(_position_QUOTE);
				condition_names.accept(_position_QUOTE);
				payment_short_type_names.accept(_position_QUOTE);
				skill_names.accept(_position_QUOTE);
				map_names.accept(_position_QUOTE);
				event_names.accept(_position_QUOTE);
				image_names.accept(_position_QUOTE);
				tile_symbols.accept(_position_QUOTE);
				payment_long_type_names.accept(_position_QUOTE);
				area_names.accept(_position_QUOTE);
				structure_names.accept(_position_QUOTE);
				tile_names.accept(_position_QUOTE);
				hero_stat.accept(_position_QUOTE);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"QUOTE(QUOTE)");
				_furthestPosition=_position;
			}
		}
	}
}