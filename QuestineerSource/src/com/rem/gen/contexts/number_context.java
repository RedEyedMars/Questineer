package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.aspect_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class number_context extends aspect_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public number_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public number_context() {
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
	public void parse_number() {
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
		_position_number=_position;
		_token_number=_token;
		_token=new Tokens.Rule.NumberToken();
		parse__anonymous_134();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"number(number)");
				_furthestPosition=_position;
			}
			_position=_position_number;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_number.addAll(_token);
			_token_number.setValue(_token.getValue());
		}
		_token=_token_number;
		if(_state==FAILED) {
			support_names.reject(_position_number);
			association_names.reject(_position_number);
			room_names.reject(_position_number);
			activity_names.reject(_position_number);
			siding_names.reject(_position_number);
			item_names.reject(_position_number);
			aspect_names.reject(_position_number);
			affinity_names.reject(_position_number);
			activity_type_names.reject(_position_number);
			trail_names.reject(_position_number);
			attack_names.reject(_position_number);
			reason_names.reject(_position_number);
			trait_names.reject(_position_number);
			condition_names.reject(_position_number);
			payment_short_type_names.reject(_position_number);
			skill_names.reject(_position_number);
			map_names.reject(_position_number);
			event_names.reject(_position_number);
			image_names.reject(_position_number);
			tile_symbols.reject(_position_number);
			payment_long_type_names.reject(_position_number);
			area_names.reject(_position_number);
			structure_names.reject(_position_number);
			tile_names.reject(_position_number);
			hero_stat.reject(_position_number);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_number);
			association_names.accept(_position_number);
			room_names.accept(_position_number);
			activity_names.accept(_position_number);
			siding_names.accept(_position_number);
			item_names.accept(_position_number);
			aspect_names.accept(_position_number);
			affinity_names.accept(_position_number);
			activity_type_names.accept(_position_number);
			trail_names.accept(_position_number);
			attack_names.accept(_position_number);
			reason_names.accept(_position_number);
			trait_names.accept(_position_number);
			condition_names.accept(_position_number);
			payment_short_type_names.accept(_position_number);
			skill_names.accept(_position_number);
			map_names.accept(_position_number);
			event_names.accept(_position_number);
			image_names.accept(_position_number);
			tile_symbols.accept(_position_number);
			payment_long_type_names.accept(_position_number);
			area_names.accept(_position_number);
			structure_names.accept(_position_number);
			tile_names.accept(_position_number);
			hero_stat.accept(_position_number);
		}
	}
}