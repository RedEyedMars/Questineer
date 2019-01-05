package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.spawn_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class stat_context extends spawn_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public stat_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public stat_context() {
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
	public void parse_stat_range() {
		int _position_stat_range = -1;
		Token.Parsed _token_stat_range = null;
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
		_position_stat_range=_position;
		_token_stat_range=_token;
		_token=new Tokens.Rule.StatRangeToken();
		parse_state_range_element();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"stat_range(stat_range)");
				_furthestPosition=_position;
			}
			_position=_position_stat_range;
		}
		else {
			int _state_76 = _state;
			parse__anonymous_61();
			if(_state_76==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"stat_range(stat_range)");
					_furthestPosition=_position;
				}
				_position=_position_stat_range;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_stat_range.add(_position_stat_range,_token);
		}
		_token=_token_stat_range;
		if(_state==FAILED) {
			support_names.reject(_position_stat_range);
			association_names.reject(_position_stat_range);
			room_names.reject(_position_stat_range);
			activity_names.reject(_position_stat_range);
			siding_names.reject(_position_stat_range);
			item_names.reject(_position_stat_range);
			aspect_names.reject(_position_stat_range);
			affinity_names.reject(_position_stat_range);
			activity_type_names.reject(_position_stat_range);
			trail_names.reject(_position_stat_range);
			attack_names.reject(_position_stat_range);
			reason_names.reject(_position_stat_range);
			trait_names.reject(_position_stat_range);
			condition_names.reject(_position_stat_range);
			payment_short_type_names.reject(_position_stat_range);
			skill_names.reject(_position_stat_range);
			map_names.reject(_position_stat_range);
			event_names.reject(_position_stat_range);
			image_names.reject(_position_stat_range);
			tile_symbols.reject(_position_stat_range);
			payment_long_type_names.reject(_position_stat_range);
			area_names.reject(_position_stat_range);
			structure_names.reject(_position_stat_range);
			tile_names.reject(_position_stat_range);
			hero_stat.reject(_position_stat_range);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_stat_range);
			association_names.accept(_position_stat_range);
			room_names.accept(_position_stat_range);
			activity_names.accept(_position_stat_range);
			siding_names.accept(_position_stat_range);
			item_names.accept(_position_stat_range);
			aspect_names.accept(_position_stat_range);
			affinity_names.accept(_position_stat_range);
			activity_type_names.accept(_position_stat_range);
			trail_names.accept(_position_stat_range);
			attack_names.accept(_position_stat_range);
			reason_names.accept(_position_stat_range);
			trait_names.accept(_position_stat_range);
			condition_names.accept(_position_stat_range);
			payment_short_type_names.accept(_position_stat_range);
			skill_names.accept(_position_stat_range);
			map_names.accept(_position_stat_range);
			event_names.accept(_position_stat_range);
			image_names.accept(_position_stat_range);
			tile_symbols.accept(_position_stat_range);
			payment_long_type_names.accept(_position_stat_range);
			area_names.accept(_position_stat_range);
			structure_names.accept(_position_stat_range);
			tile_names.accept(_position_stat_range);
			hero_stat.accept(_position_stat_range);
		}
	}
}