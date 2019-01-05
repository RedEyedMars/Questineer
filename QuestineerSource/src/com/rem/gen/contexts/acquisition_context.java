package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.condition_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class acquisition_context extends condition_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public acquisition_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public acquisition_context() {
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
	public void parse_acquisition() {
		int _position_acquisition = -1;
		Token.Parsed _token_acquisition = null;
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
		_position_acquisition=_position;
		_token_acquisition=_token;
		_token=new Tokens.Rule.AcquisitionToken();
		parse__anonymous_142();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"acquisition(acquisition)");
				_furthestPosition=_position;
			}
			_position=_position_acquisition;
		}
		else {
			parse__anonymous_145();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"acquisition(acquisition)");
					_furthestPosition=_position;
				}
				_position=_position_acquisition;
			}
			else {
				int _state_171 = _state;
				parse__anonymous_146();
				if(_state_171==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"acquisition(acquisition)");
						_furthestPosition=_position;
					}
					_position=_position_acquisition;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_acquisition.add(_position_acquisition,_token);
		}
		_token=_token_acquisition;
		if(_state==FAILED) {
			support_names.reject(_position_acquisition);
			association_names.reject(_position_acquisition);
			room_names.reject(_position_acquisition);
			activity_names.reject(_position_acquisition);
			siding_names.reject(_position_acquisition);
			item_names.reject(_position_acquisition);
			aspect_names.reject(_position_acquisition);
			affinity_names.reject(_position_acquisition);
			activity_type_names.reject(_position_acquisition);
			trail_names.reject(_position_acquisition);
			attack_names.reject(_position_acquisition);
			reason_names.reject(_position_acquisition);
			trait_names.reject(_position_acquisition);
			condition_names.reject(_position_acquisition);
			payment_short_type_names.reject(_position_acquisition);
			skill_names.reject(_position_acquisition);
			map_names.reject(_position_acquisition);
			event_names.reject(_position_acquisition);
			image_names.reject(_position_acquisition);
			tile_symbols.reject(_position_acquisition);
			payment_long_type_names.reject(_position_acquisition);
			area_names.reject(_position_acquisition);
			structure_names.reject(_position_acquisition);
			tile_names.reject(_position_acquisition);
			hero_stat.reject(_position_acquisition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_acquisition);
			association_names.accept(_position_acquisition);
			room_names.accept(_position_acquisition);
			activity_names.accept(_position_acquisition);
			siding_names.accept(_position_acquisition);
			item_names.accept(_position_acquisition);
			aspect_names.accept(_position_acquisition);
			affinity_names.accept(_position_acquisition);
			activity_type_names.accept(_position_acquisition);
			trail_names.accept(_position_acquisition);
			attack_names.accept(_position_acquisition);
			reason_names.accept(_position_acquisition);
			trait_names.accept(_position_acquisition);
			condition_names.accept(_position_acquisition);
			payment_short_type_names.accept(_position_acquisition);
			skill_names.accept(_position_acquisition);
			map_names.accept(_position_acquisition);
			event_names.accept(_position_acquisition);
			image_names.accept(_position_acquisition);
			tile_symbols.accept(_position_acquisition);
			payment_long_type_names.accept(_position_acquisition);
			area_names.accept(_position_acquisition);
			structure_names.accept(_position_acquisition);
			tile_names.accept(_position_acquisition);
			hero_stat.accept(_position_acquisition);
		}
	}
}