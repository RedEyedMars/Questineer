package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.variable_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class event_context extends variable_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public event_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public event_context() {
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
	public void parse_event_statement() {
		int _position_event_statement = -1;
		Token.Parsed _token_event_statement = null;
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
		_position_event_statement=_position;
		_token_event_statement=_token;
		_token=new Tokens.Rule.EventStatementToken();
		parse__anonymous_123();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"event_statement(event_statement)");
				_furthestPosition=_position;
			}
			_position=_position_event_statement;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_event_statement.add(_position_event_statement,_token);
		}
		_token=_token_event_statement;
		if(_state==FAILED) {
			support_names.reject(_position_event_statement);
			association_names.reject(_position_event_statement);
			room_names.reject(_position_event_statement);
			activity_names.reject(_position_event_statement);
			siding_names.reject(_position_event_statement);
			item_names.reject(_position_event_statement);
			aspect_names.reject(_position_event_statement);
			affinity_names.reject(_position_event_statement);
			activity_type_names.reject(_position_event_statement);
			trail_names.reject(_position_event_statement);
			attack_names.reject(_position_event_statement);
			reason_names.reject(_position_event_statement);
			trait_names.reject(_position_event_statement);
			condition_names.reject(_position_event_statement);
			payment_short_type_names.reject(_position_event_statement);
			skill_names.reject(_position_event_statement);
			map_names.reject(_position_event_statement);
			event_names.reject(_position_event_statement);
			image_names.reject(_position_event_statement);
			tile_symbols.reject(_position_event_statement);
			payment_long_type_names.reject(_position_event_statement);
			area_names.reject(_position_event_statement);
			structure_names.reject(_position_event_statement);
			tile_names.reject(_position_event_statement);
			hero_stat.reject(_position_event_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_event_statement);
			association_names.accept(_position_event_statement);
			room_names.accept(_position_event_statement);
			activity_names.accept(_position_event_statement);
			siding_names.accept(_position_event_statement);
			item_names.accept(_position_event_statement);
			aspect_names.accept(_position_event_statement);
			affinity_names.accept(_position_event_statement);
			activity_type_names.accept(_position_event_statement);
			trail_names.accept(_position_event_statement);
			attack_names.accept(_position_event_statement);
			reason_names.accept(_position_event_statement);
			trait_names.accept(_position_event_statement);
			condition_names.accept(_position_event_statement);
			payment_short_type_names.accept(_position_event_statement);
			skill_names.accept(_position_event_statement);
			map_names.accept(_position_event_statement);
			event_names.accept(_position_event_statement);
			image_names.accept(_position_event_statement);
			tile_symbols.accept(_position_event_statement);
			payment_long_type_names.accept(_position_event_statement);
			area_names.accept(_position_event_statement);
			structure_names.accept(_position_event_statement);
			tile_names.accept(_position_event_statement);
			hero_stat.accept(_position_event_statement);
		}
	}
	public void parse_event_declaration() {
		int _position_event_declaration = -1;
		Token.Parsed _token_event_declaration = null;
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
		_position_event_declaration=_position;
		_token_event_declaration=_token;
		_token=new Tokens.Rule.EventDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_34.contains(_position)) {
			_recursion_protection_NAME_34.add(_position);
			parse_NAME();
			_recursion_protection_NAME_34.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				event_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.EventNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"event_declaration(event_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_event_declaration;
		}
		else {
			int _state_153 = _state;
			while(_position<_inputLength) {
				parse__anonymous_121();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_153==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"event_declaration(event_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_event_declaration;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_event_declaration.add(_position_event_declaration,_token);
		}
		_token=_token_event_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_event_declaration);
			association_names.reject(_position_event_declaration);
			room_names.reject(_position_event_declaration);
			activity_names.reject(_position_event_declaration);
			siding_names.reject(_position_event_declaration);
			item_names.reject(_position_event_declaration);
			aspect_names.reject(_position_event_declaration);
			affinity_names.reject(_position_event_declaration);
			activity_type_names.reject(_position_event_declaration);
			trail_names.reject(_position_event_declaration);
			attack_names.reject(_position_event_declaration);
			reason_names.reject(_position_event_declaration);
			trait_names.reject(_position_event_declaration);
			condition_names.reject(_position_event_declaration);
			payment_short_type_names.reject(_position_event_declaration);
			skill_names.reject(_position_event_declaration);
			map_names.reject(_position_event_declaration);
			event_names.reject(_position_event_declaration);
			image_names.reject(_position_event_declaration);
			tile_symbols.reject(_position_event_declaration);
			payment_long_type_names.reject(_position_event_declaration);
			area_names.reject(_position_event_declaration);
			structure_names.reject(_position_event_declaration);
			tile_names.reject(_position_event_declaration);
			hero_stat.reject(_position_event_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_event_declaration);
			association_names.accept(_position_event_declaration);
			room_names.accept(_position_event_declaration);
			activity_names.accept(_position_event_declaration);
			siding_names.accept(_position_event_declaration);
			item_names.accept(_position_event_declaration);
			aspect_names.accept(_position_event_declaration);
			affinity_names.accept(_position_event_declaration);
			activity_type_names.accept(_position_event_declaration);
			trail_names.accept(_position_event_declaration);
			attack_names.accept(_position_event_declaration);
			reason_names.accept(_position_event_declaration);
			trait_names.accept(_position_event_declaration);
			condition_names.accept(_position_event_declaration);
			payment_short_type_names.accept(_position_event_declaration);
			skill_names.accept(_position_event_declaration);
			map_names.accept(_position_event_declaration);
			event_names.accept(_position_event_declaration);
			image_names.accept(_position_event_declaration);
			tile_symbols.accept(_position_event_declaration);
			payment_long_type_names.accept(_position_event_declaration);
			area_names.accept(_position_event_declaration);
			structure_names.accept(_position_event_declaration);
			tile_names.accept(_position_event_declaration);
			hero_stat.accept(_position_event_declaration);
		}
	}
}