package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.state_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class range_context extends state_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public range_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public range_context() {
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
	public void parse_range() {
		int _position_range = -1;
		Token.Parsed _token_range = null;
		int _position_number = -1;
		Token.Parsed _token_number = null;
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
		_position_range=_position;
		_token_range=_token;
		_token=new Tokens.Rule.RangeToken();
		_token_number=_token;
		_token=new Tokens.Name.LeftToken();
		_position_number=_position;
		parse_number();
		if(_state==SUCCESS) {
			_token_number.add(_position_number,_token);
		}
		_token=_token_number;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"range(range)");
				_furthestPosition=_position;
			}
			_position=_position_range;
		}
		else {
			parse__anonymous_135();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"range(range)");
					_furthestPosition=_position;
				}
				_position=_position_range;
			}
			else {
				int _state_169 = _state;
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='%') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_56.percent);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain %");
						_furthestPosition=_position;
					}
				}
				if(_state_169==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"range(range)");
						_furthestPosition=_position;
					}
					_position=_position_range;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_range.addAll(_token);
			_token_range.setValue(_token.getValue());
		}
		_token=_token_range;
		if(_state==FAILED) {
			support_names.reject(_position_range);
			association_names.reject(_position_range);
			room_names.reject(_position_range);
			activity_names.reject(_position_range);
			siding_names.reject(_position_range);
			item_names.reject(_position_range);
			aspect_names.reject(_position_range);
			affinity_names.reject(_position_range);
			activity_type_names.reject(_position_range);
			trail_names.reject(_position_range);
			attack_names.reject(_position_range);
			reason_names.reject(_position_range);
			trait_names.reject(_position_range);
			condition_names.reject(_position_range);
			payment_short_type_names.reject(_position_range);
			skill_names.reject(_position_range);
			map_names.reject(_position_range);
			event_names.reject(_position_range);
			image_names.reject(_position_range);
			tile_symbols.reject(_position_range);
			payment_long_type_names.reject(_position_range);
			area_names.reject(_position_range);
			structure_names.reject(_position_range);
			tile_names.reject(_position_range);
			hero_stat.reject(_position_range);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_range);
			association_names.accept(_position_range);
			room_names.accept(_position_range);
			activity_names.accept(_position_range);
			siding_names.accept(_position_range);
			item_names.accept(_position_range);
			aspect_names.accept(_position_range);
			affinity_names.accept(_position_range);
			activity_type_names.accept(_position_range);
			trail_names.accept(_position_range);
			attack_names.accept(_position_range);
			reason_names.accept(_position_range);
			trait_names.accept(_position_range);
			condition_names.accept(_position_range);
			payment_short_type_names.accept(_position_range);
			skill_names.accept(_position_range);
			map_names.accept(_position_range);
			event_names.accept(_position_range);
			image_names.accept(_position_range);
			tile_symbols.accept(_position_range);
			payment_long_type_names.accept(_position_range);
			area_names.accept(_position_range);
			structure_names.accept(_position_range);
			tile_names.accept(_position_range);
			hero_stat.accept(_position_range);
		}
	}
}