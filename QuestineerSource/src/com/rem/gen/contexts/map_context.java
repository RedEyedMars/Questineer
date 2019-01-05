package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.type_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class map_context extends type_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public map_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public map_context() {
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
	public void parse_map_header() {
		int _position_map_header = -1;
		Token.Parsed _token_map_header = null;
		int _position_NAME = -1;
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
		_position_map_header=_position;
		_token_map_header=_token;
		_token=new Tokens.Rule.MapHeaderToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_27.contains(_position)) {
			_recursion_protection_NAME_27.add(_position);
			parse_NAME();
			_recursion_protection_NAME_27.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				map_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.MapNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"map_header(map_header)");
				_furthestPosition=_position;
			}
			_position=_position_map_header;
		}
		else {
			parse_import_tile();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"map_header(map_header)");
					_furthestPosition=_position;
				}
				_position=_position_map_header;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_map_header.add(_position_map_header,_token);
		}
		_token=_token_map_header;
		if(_state==FAILED) {
			support_names.reject(_position_map_header);
			association_names.reject(_position_map_header);
			room_names.reject(_position_map_header);
			activity_names.reject(_position_map_header);
			siding_names.reject(_position_map_header);
			item_names.reject(_position_map_header);
			aspect_names.reject(_position_map_header);
			affinity_names.reject(_position_map_header);
			activity_type_names.reject(_position_map_header);
			trail_names.reject(_position_map_header);
			attack_names.reject(_position_map_header);
			reason_names.reject(_position_map_header);
			trait_names.reject(_position_map_header);
			condition_names.reject(_position_map_header);
			payment_short_type_names.reject(_position_map_header);
			skill_names.reject(_position_map_header);
			map_names.reject(_position_map_header);
			event_names.reject(_position_map_header);
			image_names.reject(_position_map_header);
			tile_symbols.reject(_position_map_header);
			payment_long_type_names.reject(_position_map_header);
			area_names.reject(_position_map_header);
			structure_names.reject(_position_map_header);
			tile_names.reject(_position_map_header);
			hero_stat.reject(_position_map_header);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_map_header);
			association_names.accept(_position_map_header);
			room_names.accept(_position_map_header);
			activity_names.accept(_position_map_header);
			siding_names.accept(_position_map_header);
			item_names.accept(_position_map_header);
			aspect_names.accept(_position_map_header);
			affinity_names.accept(_position_map_header);
			activity_type_names.accept(_position_map_header);
			trail_names.accept(_position_map_header);
			attack_names.accept(_position_map_header);
			reason_names.accept(_position_map_header);
			trait_names.accept(_position_map_header);
			condition_names.accept(_position_map_header);
			payment_short_type_names.accept(_position_map_header);
			skill_names.accept(_position_map_header);
			map_names.accept(_position_map_header);
			event_names.accept(_position_map_header);
			image_names.accept(_position_map_header);
			tile_symbols.accept(_position_map_header);
			payment_long_type_names.accept(_position_map_header);
			area_names.accept(_position_map_header);
			structure_names.accept(_position_map_header);
			tile_names.accept(_position_map_header);
			hero_stat.accept(_position_map_header);
		}
	}
}