package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.activity_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class association_context extends activity_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public association_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public association_context() {
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
	public void parse_association_declaration() {
		int _position_association_declaration = -1;
		Token.Parsed _token_association_declaration = null;
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
		_position_association_declaration=_position;
		_token_association_declaration=_token;
		_token=new Tokens.Rule.AssociationDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_22.contains(_position)) {
			_recursion_protection_NAME_22.add(_position);
			parse_NAME();
			_recursion_protection_NAME_22.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				association_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.AssociationNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_declaration(association_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_association_declaration;
		}
		else {
			int _state_70 = _state;
			while(_position<_inputLength) {
				parse__anonymous_58();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_70==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_declaration(association_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_association_declaration;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_association_declaration.add(_position_association_declaration,_token);
		}
		_token=_token_association_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_association_declaration);
			association_names.reject(_position_association_declaration);
			room_names.reject(_position_association_declaration);
			activity_names.reject(_position_association_declaration);
			siding_names.reject(_position_association_declaration);
			item_names.reject(_position_association_declaration);
			aspect_names.reject(_position_association_declaration);
			affinity_names.reject(_position_association_declaration);
			activity_type_names.reject(_position_association_declaration);
			trail_names.reject(_position_association_declaration);
			attack_names.reject(_position_association_declaration);
			reason_names.reject(_position_association_declaration);
			trait_names.reject(_position_association_declaration);
			condition_names.reject(_position_association_declaration);
			payment_short_type_names.reject(_position_association_declaration);
			skill_names.reject(_position_association_declaration);
			map_names.reject(_position_association_declaration);
			event_names.reject(_position_association_declaration);
			image_names.reject(_position_association_declaration);
			tile_symbols.reject(_position_association_declaration);
			payment_long_type_names.reject(_position_association_declaration);
			area_names.reject(_position_association_declaration);
			structure_names.reject(_position_association_declaration);
			tile_names.reject(_position_association_declaration);
			hero_stat.reject(_position_association_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_association_declaration);
			association_names.accept(_position_association_declaration);
			room_names.accept(_position_association_declaration);
			activity_names.accept(_position_association_declaration);
			siding_names.accept(_position_association_declaration);
			item_names.accept(_position_association_declaration);
			aspect_names.accept(_position_association_declaration);
			affinity_names.accept(_position_association_declaration);
			activity_type_names.accept(_position_association_declaration);
			trail_names.accept(_position_association_declaration);
			attack_names.accept(_position_association_declaration);
			reason_names.accept(_position_association_declaration);
			trait_names.accept(_position_association_declaration);
			condition_names.accept(_position_association_declaration);
			payment_short_type_names.accept(_position_association_declaration);
			skill_names.accept(_position_association_declaration);
			map_names.accept(_position_association_declaration);
			event_names.accept(_position_association_declaration);
			image_names.accept(_position_association_declaration);
			tile_symbols.accept(_position_association_declaration);
			payment_long_type_names.accept(_position_association_declaration);
			area_names.accept(_position_association_declaration);
			structure_names.accept(_position_association_declaration);
			tile_names.accept(_position_association_declaration);
			hero_stat.accept(_position_association_declaration);
		}
	}
	public void parse_association_event() {
		int _position_association_event = -1;
		Token.Parsed _token_association_event = null;
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
		_position_association_event=_position;
		_token_association_event=_token;
		_token=new Tokens.Rule.AssociationEventToken();
		parse_event_statement();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_event(association_event)");
				_furthestPosition=_position;
			}
			_position=_position_association_event;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_association_event.add(_position_association_event,_token);
		}
		_token=_token_association_event;
		if(_state==FAILED) {
			support_names.reject(_position_association_event);
			association_names.reject(_position_association_event);
			room_names.reject(_position_association_event);
			activity_names.reject(_position_association_event);
			siding_names.reject(_position_association_event);
			item_names.reject(_position_association_event);
			aspect_names.reject(_position_association_event);
			affinity_names.reject(_position_association_event);
			activity_type_names.reject(_position_association_event);
			trail_names.reject(_position_association_event);
			attack_names.reject(_position_association_event);
			reason_names.reject(_position_association_event);
			trait_names.reject(_position_association_event);
			condition_names.reject(_position_association_event);
			payment_short_type_names.reject(_position_association_event);
			skill_names.reject(_position_association_event);
			map_names.reject(_position_association_event);
			event_names.reject(_position_association_event);
			image_names.reject(_position_association_event);
			tile_symbols.reject(_position_association_event);
			payment_long_type_names.reject(_position_association_event);
			area_names.reject(_position_association_event);
			structure_names.reject(_position_association_event);
			tile_names.reject(_position_association_event);
			hero_stat.reject(_position_association_event);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_association_event);
			association_names.accept(_position_association_event);
			room_names.accept(_position_association_event);
			activity_names.accept(_position_association_event);
			siding_names.accept(_position_association_event);
			item_names.accept(_position_association_event);
			aspect_names.accept(_position_association_event);
			affinity_names.accept(_position_association_event);
			activity_type_names.accept(_position_association_event);
			trail_names.accept(_position_association_event);
			attack_names.accept(_position_association_event);
			reason_names.accept(_position_association_event);
			trait_names.accept(_position_association_event);
			condition_names.accept(_position_association_event);
			payment_short_type_names.accept(_position_association_event);
			skill_names.accept(_position_association_event);
			map_names.accept(_position_association_event);
			event_names.accept(_position_association_event);
			image_names.accept(_position_association_event);
			tile_symbols.accept(_position_association_event);
			payment_long_type_names.accept(_position_association_event);
			area_names.accept(_position_association_event);
			structure_names.accept(_position_association_event);
			tile_names.accept(_position_association_event);
			hero_stat.accept(_position_association_event);
		}
	}
	public void parse_association_element() {
		int _position_association_element = -1;
		Token.Parsed _token_association_element = null;
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
		_position_association_element=_position;
		_token_association_element=_token;
		_token=new Tokens.Rule.AssociationElementToken();
		parse_association_start();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_element(association_element)");
				_furthestPosition=_position;
			}
			_position=_position_association_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_association_element.addAll(_token);
			_token_association_element.setValue(_token.getValue());
		}
		_token=_token_association_element;
		if(_state==FAILED) {
			support_names.reject(_position_association_element);
			association_names.reject(_position_association_element);
			room_names.reject(_position_association_element);
			activity_names.reject(_position_association_element);
			siding_names.reject(_position_association_element);
			item_names.reject(_position_association_element);
			aspect_names.reject(_position_association_element);
			affinity_names.reject(_position_association_element);
			activity_type_names.reject(_position_association_element);
			trail_names.reject(_position_association_element);
			attack_names.reject(_position_association_element);
			reason_names.reject(_position_association_element);
			trait_names.reject(_position_association_element);
			condition_names.reject(_position_association_element);
			payment_short_type_names.reject(_position_association_element);
			skill_names.reject(_position_association_element);
			map_names.reject(_position_association_element);
			event_names.reject(_position_association_element);
			image_names.reject(_position_association_element);
			tile_symbols.reject(_position_association_element);
			payment_long_type_names.reject(_position_association_element);
			area_names.reject(_position_association_element);
			structure_names.reject(_position_association_element);
			tile_names.reject(_position_association_element);
			hero_stat.reject(_position_association_element);
			_state=SUCCESS;
			_position_association_element=_position;
			_token_association_element=_token;
			_token=new Tokens.Rule.AssociationElementToken();
			parse_association_join();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_element(association_element)");
					_furthestPosition=_position;
				}
				_position=_position_association_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_association_element.addAll(_token);
				_token_association_element.setValue(_token.getValue());
			}
			_token=_token_association_element;
			if(_state==FAILED) {
				support_names.reject(_position_association_element);
				association_names.reject(_position_association_element);
				room_names.reject(_position_association_element);
				activity_names.reject(_position_association_element);
				siding_names.reject(_position_association_element);
				item_names.reject(_position_association_element);
				aspect_names.reject(_position_association_element);
				affinity_names.reject(_position_association_element);
				activity_type_names.reject(_position_association_element);
				trail_names.reject(_position_association_element);
				attack_names.reject(_position_association_element);
				reason_names.reject(_position_association_element);
				trait_names.reject(_position_association_element);
				condition_names.reject(_position_association_element);
				payment_short_type_names.reject(_position_association_element);
				skill_names.reject(_position_association_element);
				map_names.reject(_position_association_element);
				event_names.reject(_position_association_element);
				image_names.reject(_position_association_element);
				tile_symbols.reject(_position_association_element);
				payment_long_type_names.reject(_position_association_element);
				area_names.reject(_position_association_element);
				structure_names.reject(_position_association_element);
				tile_names.reject(_position_association_element);
				hero_stat.reject(_position_association_element);
				_state=SUCCESS;
				_position_association_element=_position;
				_token_association_element=_token;
				_token=new Tokens.Rule.AssociationElementToken();
				parse_association_event();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_element(association_element)");
						_furthestPosition=_position;
					}
					_position=_position_association_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_association_element.addAll(_token);
					_token_association_element.setValue(_token.getValue());
				}
				_token=_token_association_element;
				if(_state==FAILED) {
					support_names.reject(_position_association_element);
					association_names.reject(_position_association_element);
					room_names.reject(_position_association_element);
					activity_names.reject(_position_association_element);
					siding_names.reject(_position_association_element);
					item_names.reject(_position_association_element);
					aspect_names.reject(_position_association_element);
					affinity_names.reject(_position_association_element);
					activity_type_names.reject(_position_association_element);
					trail_names.reject(_position_association_element);
					attack_names.reject(_position_association_element);
					reason_names.reject(_position_association_element);
					trait_names.reject(_position_association_element);
					condition_names.reject(_position_association_element);
					payment_short_type_names.reject(_position_association_element);
					skill_names.reject(_position_association_element);
					map_names.reject(_position_association_element);
					event_names.reject(_position_association_element);
					image_names.reject(_position_association_element);
					tile_symbols.reject(_position_association_element);
					payment_long_type_names.reject(_position_association_element);
					area_names.reject(_position_association_element);
					structure_names.reject(_position_association_element);
					tile_names.reject(_position_association_element);
					hero_stat.reject(_position_association_element);
				}
				else if(_state==SUCCESS) {
					support_names.accept(_position_association_element);
					association_names.accept(_position_association_element);
					room_names.accept(_position_association_element);
					activity_names.accept(_position_association_element);
					siding_names.accept(_position_association_element);
					item_names.accept(_position_association_element);
					aspect_names.accept(_position_association_element);
					affinity_names.accept(_position_association_element);
					activity_type_names.accept(_position_association_element);
					trail_names.accept(_position_association_element);
					attack_names.accept(_position_association_element);
					reason_names.accept(_position_association_element);
					trait_names.accept(_position_association_element);
					condition_names.accept(_position_association_element);
					payment_short_type_names.accept(_position_association_element);
					skill_names.accept(_position_association_element);
					map_names.accept(_position_association_element);
					event_names.accept(_position_association_element);
					image_names.accept(_position_association_element);
					tile_symbols.accept(_position_association_element);
					payment_long_type_names.accept(_position_association_element);
					area_names.accept(_position_association_element);
					structure_names.accept(_position_association_element);
					tile_names.accept(_position_association_element);
					hero_stat.accept(_position_association_element);
				}
			}
		}
	}
	public void parse_association_start() {
		int _position_association_start = -1;
		Token.Parsed _token_association_start = null;
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
		_position_association_start=_position;
		_token_association_start=_token;
		_token=new Tokens.Rule.AssociationStartToken();
		if(_position+5-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='s') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='t') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='a') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='r') {
				_state=FAILED;
			}
			if(_inputArray[_position+4]!='t') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_33.SYNTAX);
			_position=_position+5;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain start");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_start(association_start)");
				_furthestPosition=_position;
			}
			_position=_position_association_start;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.SpecificNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_start(association_start)");
					_furthestPosition=_position;
				}
				_position=_position_association_start;
			}
			else {
				parse__anonymous_59();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_start(association_start)");
						_furthestPosition=_position;
					}
					_position=_position_association_start;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_association_start.add(_position_association_start,_token);
		}
		_token=_token_association_start;
		if(_state==FAILED) {
			support_names.reject(_position_association_start);
			association_names.reject(_position_association_start);
			room_names.reject(_position_association_start);
			activity_names.reject(_position_association_start);
			siding_names.reject(_position_association_start);
			item_names.reject(_position_association_start);
			aspect_names.reject(_position_association_start);
			affinity_names.reject(_position_association_start);
			activity_type_names.reject(_position_association_start);
			trail_names.reject(_position_association_start);
			attack_names.reject(_position_association_start);
			reason_names.reject(_position_association_start);
			trait_names.reject(_position_association_start);
			condition_names.reject(_position_association_start);
			payment_short_type_names.reject(_position_association_start);
			skill_names.reject(_position_association_start);
			map_names.reject(_position_association_start);
			event_names.reject(_position_association_start);
			image_names.reject(_position_association_start);
			tile_symbols.reject(_position_association_start);
			payment_long_type_names.reject(_position_association_start);
			area_names.reject(_position_association_start);
			structure_names.reject(_position_association_start);
			tile_names.reject(_position_association_start);
			hero_stat.reject(_position_association_start);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_association_start);
			association_names.accept(_position_association_start);
			room_names.accept(_position_association_start);
			activity_names.accept(_position_association_start);
			siding_names.accept(_position_association_start);
			item_names.accept(_position_association_start);
			aspect_names.accept(_position_association_start);
			affinity_names.accept(_position_association_start);
			activity_type_names.accept(_position_association_start);
			trail_names.accept(_position_association_start);
			attack_names.accept(_position_association_start);
			reason_names.accept(_position_association_start);
			trait_names.accept(_position_association_start);
			condition_names.accept(_position_association_start);
			payment_short_type_names.accept(_position_association_start);
			skill_names.accept(_position_association_start);
			map_names.accept(_position_association_start);
			event_names.accept(_position_association_start);
			image_names.accept(_position_association_start);
			tile_symbols.accept(_position_association_start);
			payment_long_type_names.accept(_position_association_start);
			area_names.accept(_position_association_start);
			structure_names.accept(_position_association_start);
			tile_names.accept(_position_association_start);
			hero_stat.accept(_position_association_start);
		}
	}
	public void parse_association_statement() {
		int _position_association_statement = -1;
		Token.Parsed _token_association_statement = null;
		int _position_statement = -1;
		Token.Parsed _token_statement = null;
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
		_position_association_statement=_position;
		_token_association_statement=_token;
		_token=new Tokens.Rule.AssociationStatementToken();
		parse_variable_call();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_statement(association_statement)");
				_furthestPosition=_position;
			}
			_position=_position_association_statement;
		}
		else {
			parse__anonymous_156();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_statement(association_statement)");
					_furthestPosition=_position;
				}
				_position=_position_association_statement;
			}
			else {
				if(_pass==FIRST_PASS) {
					String _result = _preparsed_NAME.get(_position);
					if(_result==null) {
						_state=FAILED;
					}
					else {
						Token.Parsed _first_pass_token = new Tokens.Name.NAMEToken(_result);
						_token.add(_position,_first_pass_token);
						_position+=_result.length();
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
				}
				else if(_pass==SECOND_PASS) {
					_list_name_result=_preparsed_NAME.get(_position);
					if(_list_name_result!=null&&association_names.contains(_list_name_result)) {
						if(_position+_list_name_result.length()<_inputLength) {
							int _next_char = _inputArray[_position+_list_name_result.length()];
							if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,new Tokens.Name.AssociationNamesToken(_list_name_result));
							_position+=_list_name_result.length();
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
					}
					else {
						_state=FAILED;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_names");
							_furthestPosition=_position;
						}
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_statement(association_statement)");
						_furthestPosition=_position;
					}
					_position=_position_association_statement;
				}
				else {
					parse_method_arguments();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_statement(association_statement)");
							_furthestPosition=_position;
						}
						_position=_position_association_statement;
					}
					else {
						_token_statement=_token;
						_token=new Tokens.Name.RecruiterToken();
						_position_statement=_position;
						parse_statement();
						if(_state==SUCCESS) {
							_token_statement.add(_position_statement,_token);
						}
						_token=_token_statement;
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_statement(association_statement)");
								_furthestPosition=_position;
							}
							_position=_position_association_statement;
						}
						else {
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_association_statement.add(_position_association_statement,_token);
		}
		_token=_token_association_statement;
		if(_state==FAILED) {
			support_names.reject(_position_association_statement);
			association_names.reject(_position_association_statement);
			room_names.reject(_position_association_statement);
			activity_names.reject(_position_association_statement);
			siding_names.reject(_position_association_statement);
			item_names.reject(_position_association_statement);
			aspect_names.reject(_position_association_statement);
			affinity_names.reject(_position_association_statement);
			activity_type_names.reject(_position_association_statement);
			trail_names.reject(_position_association_statement);
			attack_names.reject(_position_association_statement);
			reason_names.reject(_position_association_statement);
			trait_names.reject(_position_association_statement);
			condition_names.reject(_position_association_statement);
			payment_short_type_names.reject(_position_association_statement);
			skill_names.reject(_position_association_statement);
			map_names.reject(_position_association_statement);
			event_names.reject(_position_association_statement);
			image_names.reject(_position_association_statement);
			tile_symbols.reject(_position_association_statement);
			payment_long_type_names.reject(_position_association_statement);
			area_names.reject(_position_association_statement);
			structure_names.reject(_position_association_statement);
			tile_names.reject(_position_association_statement);
			hero_stat.reject(_position_association_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_association_statement);
			association_names.accept(_position_association_statement);
			room_names.accept(_position_association_statement);
			activity_names.accept(_position_association_statement);
			siding_names.accept(_position_association_statement);
			item_names.accept(_position_association_statement);
			aspect_names.accept(_position_association_statement);
			affinity_names.accept(_position_association_statement);
			activity_type_names.accept(_position_association_statement);
			trail_names.accept(_position_association_statement);
			attack_names.accept(_position_association_statement);
			reason_names.accept(_position_association_statement);
			trait_names.accept(_position_association_statement);
			condition_names.accept(_position_association_statement);
			payment_short_type_names.accept(_position_association_statement);
			skill_names.accept(_position_association_statement);
			map_names.accept(_position_association_statement);
			event_names.accept(_position_association_statement);
			image_names.accept(_position_association_statement);
			tile_symbols.accept(_position_association_statement);
			payment_long_type_names.accept(_position_association_statement);
			area_names.accept(_position_association_statement);
			structure_names.accept(_position_association_statement);
			tile_names.accept(_position_association_statement);
			hero_stat.accept(_position_association_statement);
		}
	}
	public void parse_association_join() {
		int _position_association_join = -1;
		Token.Parsed _token_association_join = null;
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
		_position_association_join=_position;
		_token_association_join=_token;
		_token=new Tokens.Rule.AssociationJoinToken();
		if(_position+4-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='j') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='o') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='i') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='n') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_50.SYNTAX);
			_position=_position+4;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain join");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_join(association_join)");
				_furthestPosition=_position;
			}
			_position=_position_association_join;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.SpecificNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_join(association_join)");
					_furthestPosition=_position;
				}
				_position=_position_association_join;
			}
			else {
				parse_if_header();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"association_join(association_join)");
						_furthestPosition=_position;
					}
					_position=_position_association_join;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_association_join.add(_position_association_join,_token);
		}
		_token=_token_association_join;
		if(_state==FAILED) {
			support_names.reject(_position_association_join);
			association_names.reject(_position_association_join);
			room_names.reject(_position_association_join);
			activity_names.reject(_position_association_join);
			siding_names.reject(_position_association_join);
			item_names.reject(_position_association_join);
			aspect_names.reject(_position_association_join);
			affinity_names.reject(_position_association_join);
			activity_type_names.reject(_position_association_join);
			trail_names.reject(_position_association_join);
			attack_names.reject(_position_association_join);
			reason_names.reject(_position_association_join);
			trait_names.reject(_position_association_join);
			condition_names.reject(_position_association_join);
			payment_short_type_names.reject(_position_association_join);
			skill_names.reject(_position_association_join);
			map_names.reject(_position_association_join);
			event_names.reject(_position_association_join);
			image_names.reject(_position_association_join);
			tile_symbols.reject(_position_association_join);
			payment_long_type_names.reject(_position_association_join);
			area_names.reject(_position_association_join);
			structure_names.reject(_position_association_join);
			tile_names.reject(_position_association_join);
			hero_stat.reject(_position_association_join);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_association_join);
			association_names.accept(_position_association_join);
			room_names.accept(_position_association_join);
			activity_names.accept(_position_association_join);
			siding_names.accept(_position_association_join);
			item_names.accept(_position_association_join);
			aspect_names.accept(_position_association_join);
			affinity_names.accept(_position_association_join);
			activity_type_names.accept(_position_association_join);
			trail_names.accept(_position_association_join);
			attack_names.accept(_position_association_join);
			reason_names.accept(_position_association_join);
			trait_names.accept(_position_association_join);
			condition_names.accept(_position_association_join);
			payment_short_type_names.accept(_position_association_join);
			skill_names.accept(_position_association_join);
			map_names.accept(_position_association_join);
			event_names.accept(_position_association_join);
			image_names.accept(_position_association_join);
			tile_symbols.accept(_position_association_join);
			payment_long_type_names.accept(_position_association_join);
			area_names.accept(_position_association_join);
			structure_names.accept(_position_association_join);
			tile_names.accept(_position_association_join);
			hero_stat.accept(_position_association_join);
		}
	}
}