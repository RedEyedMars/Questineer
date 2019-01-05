package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.title_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class base_context extends title_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public base_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public base_context() {
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
	public void parse_base() {
		int _position_base = -1;
		Token.Parsed _token_base = null;
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
		_position_base=_position;
		_token_base=_token;
		_token=new Tokens.Rule.BaseToken();
		int _state_0 = _state;
		while(_position<_inputLength) {
			parse__anonymous_0();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_0==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"base(base)");
				_furthestPosition=_position;
			}
			_position=_position_base;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_base.addAll(_token);
			_token_base.setValue(_token.getValue());
		}
		_token=_token_base;
		if(_state==FAILED) {
			support_names.reject(_position_base);
			association_names.reject(_position_base);
			room_names.reject(_position_base);
			activity_names.reject(_position_base);
			siding_names.reject(_position_base);
			item_names.reject(_position_base);
			aspect_names.reject(_position_base);
			affinity_names.reject(_position_base);
			activity_type_names.reject(_position_base);
			trail_names.reject(_position_base);
			attack_names.reject(_position_base);
			reason_names.reject(_position_base);
			trait_names.reject(_position_base);
			condition_names.reject(_position_base);
			payment_short_type_names.reject(_position_base);
			skill_names.reject(_position_base);
			map_names.reject(_position_base);
			event_names.reject(_position_base);
			image_names.reject(_position_base);
			tile_symbols.reject(_position_base);
			payment_long_type_names.reject(_position_base);
			area_names.reject(_position_base);
			structure_names.reject(_position_base);
			tile_names.reject(_position_base);
			hero_stat.reject(_position_base);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_base);
			association_names.accept(_position_base);
			room_names.accept(_position_base);
			activity_names.accept(_position_base);
			siding_names.accept(_position_base);
			item_names.accept(_position_base);
			aspect_names.accept(_position_base);
			affinity_names.accept(_position_base);
			activity_type_names.accept(_position_base);
			trail_names.accept(_position_base);
			attack_names.accept(_position_base);
			reason_names.accept(_position_base);
			trait_names.accept(_position_base);
			condition_names.accept(_position_base);
			payment_short_type_names.accept(_position_base);
			skill_names.accept(_position_base);
			map_names.accept(_position_base);
			event_names.accept(_position_base);
			image_names.accept(_position_base);
			tile_symbols.accept(_position_base);
			payment_long_type_names.accept(_position_base);
			area_names.accept(_position_base);
			structure_names.accept(_position_base);
			tile_names.accept(_position_base);
			hero_stat.accept(_position_base);
		}
	}
}