package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.braced_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class colour_context extends braced_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public colour_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public colour_context() {
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
	public void parse_colour_declaration() {
		int _position_colour_declaration = -1;
		Token.Parsed _token_colour_declaration = null;
		int _position_NAME = -1;
		Token.Parsed _token_NAME = null;
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
		_position_colour_declaration=_position;
		_token_colour_declaration=_token;
		_token=new Tokens.Rule.ColourDeclarationToken();
		_token_NAME=_token;
		_token=new Tokens.Name.ColourNameToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_53.contains(_position)) {
			_recursion_protection_NAME_53.add(_position);
			parse_NAME();
			_recursion_protection_NAME_53.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token_NAME.add(_position_NAME,_token);
		}
		_token=_token_NAME;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"colour_declaration(colour_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_colour_declaration;
		}
		else {
			parse__anonymous_239();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"colour_declaration(colour_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_colour_declaration;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_colour_declaration.add(_position_colour_declaration,_token);
		}
		_token=_token_colour_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_colour_declaration);
			association_names.reject(_position_colour_declaration);
			room_names.reject(_position_colour_declaration);
			activity_names.reject(_position_colour_declaration);
			siding_names.reject(_position_colour_declaration);
			item_names.reject(_position_colour_declaration);
			aspect_names.reject(_position_colour_declaration);
			affinity_names.reject(_position_colour_declaration);
			activity_type_names.reject(_position_colour_declaration);
			trail_names.reject(_position_colour_declaration);
			attack_names.reject(_position_colour_declaration);
			reason_names.reject(_position_colour_declaration);
			trait_names.reject(_position_colour_declaration);
			condition_names.reject(_position_colour_declaration);
			payment_short_type_names.reject(_position_colour_declaration);
			skill_names.reject(_position_colour_declaration);
			map_names.reject(_position_colour_declaration);
			event_names.reject(_position_colour_declaration);
			image_names.reject(_position_colour_declaration);
			tile_symbols.reject(_position_colour_declaration);
			payment_long_type_names.reject(_position_colour_declaration);
			area_names.reject(_position_colour_declaration);
			structure_names.reject(_position_colour_declaration);
			tile_names.reject(_position_colour_declaration);
			hero_stat.reject(_position_colour_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_colour_declaration);
			association_names.accept(_position_colour_declaration);
			room_names.accept(_position_colour_declaration);
			activity_names.accept(_position_colour_declaration);
			siding_names.accept(_position_colour_declaration);
			item_names.accept(_position_colour_declaration);
			aspect_names.accept(_position_colour_declaration);
			affinity_names.accept(_position_colour_declaration);
			activity_type_names.accept(_position_colour_declaration);
			trail_names.accept(_position_colour_declaration);
			attack_names.accept(_position_colour_declaration);
			reason_names.accept(_position_colour_declaration);
			trait_names.accept(_position_colour_declaration);
			condition_names.accept(_position_colour_declaration);
			payment_short_type_names.accept(_position_colour_declaration);
			skill_names.accept(_position_colour_declaration);
			map_names.accept(_position_colour_declaration);
			event_names.accept(_position_colour_declaration);
			image_names.accept(_position_colour_declaration);
			tile_symbols.accept(_position_colour_declaration);
			payment_long_type_names.accept(_position_colour_declaration);
			area_names.accept(_position_colour_declaration);
			structure_names.accept(_position_colour_declaration);
			tile_names.accept(_position_colour_declaration);
			hero_stat.accept(_position_colour_declaration);
		}
	}
}