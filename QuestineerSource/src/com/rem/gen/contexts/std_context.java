package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.drawable_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class std_context extends drawable_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public std_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public std_context() {
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
	public void parse_std_body() {
		int _position_std_body = -1;
		Token.Parsed _token_std_body = null;
		int _length_std_body_brace = _inputLength;
		if(brace_4.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_4.get(_position);
			int _position_std_body_brace = _position;
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
			_position_std_body=_position;
			_token_std_body=_token;
			_token=new Tokens.Rule.StdBodyToken();
			int _state_156 = _state;
			while(_position<_inputLength) {
				parse__anonymous_124();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_156==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"std_body(std_body)");
					_furthestPosition=_position;
				}
				_position=_position_std_body;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_std_body.addAll(_token);
				_token_std_body.setValue(_token.getValue());
			}
			_token=_token_std_body;
			if(_state==SUCCESS&&brace_4.get(_position_std_body_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("std_body",_position,_lineNumberRanges));
				_position=brace_4.get(_position_std_body_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_std_body_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_std_body);
				association_names.reject(_position_std_body);
				room_names.reject(_position_std_body);
				activity_names.reject(_position_std_body);
				siding_names.reject(_position_std_body);
				item_names.reject(_position_std_body);
				aspect_names.reject(_position_std_body);
				affinity_names.reject(_position_std_body);
				activity_type_names.reject(_position_std_body);
				trail_names.reject(_position_std_body);
				attack_names.reject(_position_std_body);
				reason_names.reject(_position_std_body);
				trait_names.reject(_position_std_body);
				condition_names.reject(_position_std_body);
				payment_short_type_names.reject(_position_std_body);
				skill_names.reject(_position_std_body);
				map_names.reject(_position_std_body);
				event_names.reject(_position_std_body);
				image_names.reject(_position_std_body);
				tile_symbols.reject(_position_std_body);
				payment_long_type_names.reject(_position_std_body);
				area_names.reject(_position_std_body);
				structure_names.reject(_position_std_body);
				tile_names.reject(_position_std_body);
				hero_stat.reject(_position_std_body);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_std_body);
				association_names.accept(_position_std_body);
				room_names.accept(_position_std_body);
				activity_names.accept(_position_std_body);
				siding_names.accept(_position_std_body);
				item_names.accept(_position_std_body);
				aspect_names.accept(_position_std_body);
				affinity_names.accept(_position_std_body);
				activity_type_names.accept(_position_std_body);
				trail_names.accept(_position_std_body);
				attack_names.accept(_position_std_body);
				reason_names.accept(_position_std_body);
				trait_names.accept(_position_std_body);
				condition_names.accept(_position_std_body);
				payment_short_type_names.accept(_position_std_body);
				skill_names.accept(_position_std_body);
				map_names.accept(_position_std_body);
				event_names.accept(_position_std_body);
				image_names.accept(_position_std_body);
				tile_symbols.accept(_position_std_body);
				payment_long_type_names.accept(_position_std_body);
				area_names.accept(_position_std_body);
				structure_names.accept(_position_std_body);
				tile_names.accept(_position_std_body);
				hero_stat.accept(_position_std_body);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"std_body(std_body)");
				_furthestPosition=_position;
			}
		}
	}
}