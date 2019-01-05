package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.body_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class quest_context extends body_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public quest_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public quest_context() {
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
	public void parse_quest_type_element() {
		int _position_quest_type_element = -1;
		Token.Parsed _token_quest_type_element = null;
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
		_position_quest_type_element=_position;
		_token_quest_type_element=_token;
		_token=new Tokens.Rule.QuestTypeElementToken();
		parse_comments();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_element(quest_type_element)");
				_furthestPosition=_position;
			}
			_position=_position_quest_type_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_quest_type_element.addAll(_token);
			_token_quest_type_element.setValue(_token.getValue());
		}
		_token=_token_quest_type_element;
		if(_state==FAILED) {
			support_names.reject(_position_quest_type_element);
			association_names.reject(_position_quest_type_element);
			room_names.reject(_position_quest_type_element);
			activity_names.reject(_position_quest_type_element);
			siding_names.reject(_position_quest_type_element);
			item_names.reject(_position_quest_type_element);
			aspect_names.reject(_position_quest_type_element);
			affinity_names.reject(_position_quest_type_element);
			activity_type_names.reject(_position_quest_type_element);
			trail_names.reject(_position_quest_type_element);
			attack_names.reject(_position_quest_type_element);
			reason_names.reject(_position_quest_type_element);
			trait_names.reject(_position_quest_type_element);
			condition_names.reject(_position_quest_type_element);
			payment_short_type_names.reject(_position_quest_type_element);
			skill_names.reject(_position_quest_type_element);
			map_names.reject(_position_quest_type_element);
			event_names.reject(_position_quest_type_element);
			image_names.reject(_position_quest_type_element);
			tile_symbols.reject(_position_quest_type_element);
			payment_long_type_names.reject(_position_quest_type_element);
			area_names.reject(_position_quest_type_element);
			structure_names.reject(_position_quest_type_element);
			tile_names.reject(_position_quest_type_element);
			hero_stat.reject(_position_quest_type_element);
			_state=SUCCESS;
			_position_quest_type_element=_position;
			_token_quest_type_element=_token;
			_token=new Tokens.Rule.QuestTypeElementToken();
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='+') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_14.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain +");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_element(quest_type_element)");
					_furthestPosition=_position;
				}
				_position=_position_quest_type_element;
			}
			else {
				parse_variable_declaration();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_element(quest_type_element)");
						_furthestPosition=_position;
					}
					_position=_position_quest_type_element;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_quest_type_element.addAll(_token);
				_token_quest_type_element.setValue(_token.getValue());
			}
			_token=_token_quest_type_element;
			if(_state==FAILED) {
				support_names.reject(_position_quest_type_element);
				association_names.reject(_position_quest_type_element);
				room_names.reject(_position_quest_type_element);
				activity_names.reject(_position_quest_type_element);
				siding_names.reject(_position_quest_type_element);
				item_names.reject(_position_quest_type_element);
				aspect_names.reject(_position_quest_type_element);
				affinity_names.reject(_position_quest_type_element);
				activity_type_names.reject(_position_quest_type_element);
				trail_names.reject(_position_quest_type_element);
				attack_names.reject(_position_quest_type_element);
				reason_names.reject(_position_quest_type_element);
				trait_names.reject(_position_quest_type_element);
				condition_names.reject(_position_quest_type_element);
				payment_short_type_names.reject(_position_quest_type_element);
				skill_names.reject(_position_quest_type_element);
				map_names.reject(_position_quest_type_element);
				event_names.reject(_position_quest_type_element);
				image_names.reject(_position_quest_type_element);
				tile_symbols.reject(_position_quest_type_element);
				payment_long_type_names.reject(_position_quest_type_element);
				area_names.reject(_position_quest_type_element);
				structure_names.reject(_position_quest_type_element);
				tile_names.reject(_position_quest_type_element);
				hero_stat.reject(_position_quest_type_element);
				_state=SUCCESS;
				_position_quest_type_element=_position;
				_token_quest_type_element=_token;
				_token=new Tokens.Rule.QuestTypeElementToken();
				parse__anonymous_33();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_element(quest_type_element)");
						_furthestPosition=_position;
					}
					_position=_position_quest_type_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_quest_type_element.addAll(_token);
					_token_quest_type_element.setValue(_token.getValue());
				}
				_token=_token_quest_type_element;
				if(_state==FAILED) {
					support_names.reject(_position_quest_type_element);
					association_names.reject(_position_quest_type_element);
					room_names.reject(_position_quest_type_element);
					activity_names.reject(_position_quest_type_element);
					siding_names.reject(_position_quest_type_element);
					item_names.reject(_position_quest_type_element);
					aspect_names.reject(_position_quest_type_element);
					affinity_names.reject(_position_quest_type_element);
					activity_type_names.reject(_position_quest_type_element);
					trail_names.reject(_position_quest_type_element);
					attack_names.reject(_position_quest_type_element);
					reason_names.reject(_position_quest_type_element);
					trait_names.reject(_position_quest_type_element);
					condition_names.reject(_position_quest_type_element);
					payment_short_type_names.reject(_position_quest_type_element);
					skill_names.reject(_position_quest_type_element);
					map_names.reject(_position_quest_type_element);
					event_names.reject(_position_quest_type_element);
					image_names.reject(_position_quest_type_element);
					tile_symbols.reject(_position_quest_type_element);
					payment_long_type_names.reject(_position_quest_type_element);
					area_names.reject(_position_quest_type_element);
					structure_names.reject(_position_quest_type_element);
					tile_names.reject(_position_quest_type_element);
					hero_stat.reject(_position_quest_type_element);
					_state=SUCCESS;
					_position_quest_type_element=_position;
					_token_quest_type_element=_token;
					_token=new Tokens.Rule.QuestTypeElementToken();
					parse__anonymous_34();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_element(quest_type_element)");
							_furthestPosition=_position;
						}
						_position=_position_quest_type_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_quest_type_element.addAll(_token);
						_token_quest_type_element.setValue(_token.getValue());
					}
					_token=_token_quest_type_element;
					if(_state==FAILED) {
						support_names.reject(_position_quest_type_element);
						association_names.reject(_position_quest_type_element);
						room_names.reject(_position_quest_type_element);
						activity_names.reject(_position_quest_type_element);
						siding_names.reject(_position_quest_type_element);
						item_names.reject(_position_quest_type_element);
						aspect_names.reject(_position_quest_type_element);
						affinity_names.reject(_position_quest_type_element);
						activity_type_names.reject(_position_quest_type_element);
						trail_names.reject(_position_quest_type_element);
						attack_names.reject(_position_quest_type_element);
						reason_names.reject(_position_quest_type_element);
						trait_names.reject(_position_quest_type_element);
						condition_names.reject(_position_quest_type_element);
						payment_short_type_names.reject(_position_quest_type_element);
						skill_names.reject(_position_quest_type_element);
						map_names.reject(_position_quest_type_element);
						event_names.reject(_position_quest_type_element);
						image_names.reject(_position_quest_type_element);
						tile_symbols.reject(_position_quest_type_element);
						payment_long_type_names.reject(_position_quest_type_element);
						area_names.reject(_position_quest_type_element);
						structure_names.reject(_position_quest_type_element);
						tile_names.reject(_position_quest_type_element);
						hero_stat.reject(_position_quest_type_element);
						_state=SUCCESS;
						_position_quest_type_element=_position;
						_token_quest_type_element=_token;
						_token=new Tokens.Rule.QuestTypeElementToken();
						if(_position+1-1 >=_inputLength) {
							_state=FAILED;
						}
						else {
							if(_inputArray[_position+0]!='\n'&&_inputArray[_position+0]!='\r') {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,Tokens.Syntax.syntax_1.SYNTAX);
							_position=_position+1;
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
						else if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain \n");
								_furthestPosition=_position;
							}
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_element(quest_type_element)");
								_furthestPosition=_position;
							}
							_position=_position_quest_type_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_quest_type_element.addAll(_token);
							_token_quest_type_element.setValue(_token.getValue());
						}
						_token=_token_quest_type_element;
						if(_state==FAILED) {
							support_names.reject(_position_quest_type_element);
							association_names.reject(_position_quest_type_element);
							room_names.reject(_position_quest_type_element);
							activity_names.reject(_position_quest_type_element);
							siding_names.reject(_position_quest_type_element);
							item_names.reject(_position_quest_type_element);
							aspect_names.reject(_position_quest_type_element);
							affinity_names.reject(_position_quest_type_element);
							activity_type_names.reject(_position_quest_type_element);
							trail_names.reject(_position_quest_type_element);
							attack_names.reject(_position_quest_type_element);
							reason_names.reject(_position_quest_type_element);
							trait_names.reject(_position_quest_type_element);
							condition_names.reject(_position_quest_type_element);
							payment_short_type_names.reject(_position_quest_type_element);
							skill_names.reject(_position_quest_type_element);
							map_names.reject(_position_quest_type_element);
							event_names.reject(_position_quest_type_element);
							image_names.reject(_position_quest_type_element);
							tile_symbols.reject(_position_quest_type_element);
							payment_long_type_names.reject(_position_quest_type_element);
							area_names.reject(_position_quest_type_element);
							structure_names.reject(_position_quest_type_element);
							tile_names.reject(_position_quest_type_element);
							hero_stat.reject(_position_quest_type_element);
						}
						else if(_state==SUCCESS) {
							support_names.accept(_position_quest_type_element);
							association_names.accept(_position_quest_type_element);
							room_names.accept(_position_quest_type_element);
							activity_names.accept(_position_quest_type_element);
							siding_names.accept(_position_quest_type_element);
							item_names.accept(_position_quest_type_element);
							aspect_names.accept(_position_quest_type_element);
							affinity_names.accept(_position_quest_type_element);
							activity_type_names.accept(_position_quest_type_element);
							trail_names.accept(_position_quest_type_element);
							attack_names.accept(_position_quest_type_element);
							reason_names.accept(_position_quest_type_element);
							trait_names.accept(_position_quest_type_element);
							condition_names.accept(_position_quest_type_element);
							payment_short_type_names.accept(_position_quest_type_element);
							skill_names.accept(_position_quest_type_element);
							map_names.accept(_position_quest_type_element);
							event_names.accept(_position_quest_type_element);
							image_names.accept(_position_quest_type_element);
							tile_symbols.accept(_position_quest_type_element);
							payment_long_type_names.accept(_position_quest_type_element);
							area_names.accept(_position_quest_type_element);
							structure_names.accept(_position_quest_type_element);
							tile_names.accept(_position_quest_type_element);
							hero_stat.accept(_position_quest_type_element);
						}
					}
				}
			}
		}
	}
	public void parse_quest_destination() {
		int _position_quest_destination = -1;
		Token.Parsed _token_quest_destination = null;
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
		_position_quest_destination=_position;
		_token_quest_destination=_token;
		_token=new Tokens.Rule.QuestDestinationToken();
		if(_position+4-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='g') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='o') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='t') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='o') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_34.SYNTAX);
			_position=_position+4;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain goto");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_destination(quest_destination)");
				_furthestPosition=_position;
			}
			_position=_position_quest_destination;
		}
		else {
			parse__anonymous_36();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_destination(quest_destination)");
					_furthestPosition=_position;
				}
				_position=_position_quest_destination;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='r') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='c') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='h') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_36.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain reach");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_destination(quest_destination)");
						_furthestPosition=_position;
					}
					_position=_position_quest_destination;
				}
				else {
					parse_std_body();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_destination(quest_destination)");
							_furthestPosition=_position;
						}
						_position=_position_quest_destination;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_quest_destination.add(_position_quest_destination,_token);
		}
		_token=_token_quest_destination;
		if(_state==FAILED) {
			support_names.reject(_position_quest_destination);
			association_names.reject(_position_quest_destination);
			room_names.reject(_position_quest_destination);
			activity_names.reject(_position_quest_destination);
			siding_names.reject(_position_quest_destination);
			item_names.reject(_position_quest_destination);
			aspect_names.reject(_position_quest_destination);
			affinity_names.reject(_position_quest_destination);
			activity_type_names.reject(_position_quest_destination);
			trail_names.reject(_position_quest_destination);
			attack_names.reject(_position_quest_destination);
			reason_names.reject(_position_quest_destination);
			trait_names.reject(_position_quest_destination);
			condition_names.reject(_position_quest_destination);
			payment_short_type_names.reject(_position_quest_destination);
			skill_names.reject(_position_quest_destination);
			map_names.reject(_position_quest_destination);
			event_names.reject(_position_quest_destination);
			image_names.reject(_position_quest_destination);
			tile_symbols.reject(_position_quest_destination);
			payment_long_type_names.reject(_position_quest_destination);
			area_names.reject(_position_quest_destination);
			structure_names.reject(_position_quest_destination);
			tile_names.reject(_position_quest_destination);
			hero_stat.reject(_position_quest_destination);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_quest_destination);
			association_names.accept(_position_quest_destination);
			room_names.accept(_position_quest_destination);
			activity_names.accept(_position_quest_destination);
			siding_names.accept(_position_quest_destination);
			item_names.accept(_position_quest_destination);
			aspect_names.accept(_position_quest_destination);
			affinity_names.accept(_position_quest_destination);
			activity_type_names.accept(_position_quest_destination);
			trail_names.accept(_position_quest_destination);
			attack_names.accept(_position_quest_destination);
			reason_names.accept(_position_quest_destination);
			trait_names.accept(_position_quest_destination);
			condition_names.accept(_position_quest_destination);
			payment_short_type_names.accept(_position_quest_destination);
			skill_names.accept(_position_quest_destination);
			map_names.accept(_position_quest_destination);
			event_names.accept(_position_quest_destination);
			image_names.accept(_position_quest_destination);
			tile_symbols.accept(_position_quest_destination);
			payment_long_type_names.accept(_position_quest_destination);
			area_names.accept(_position_quest_destination);
			structure_names.accept(_position_quest_destination);
			tile_names.accept(_position_quest_destination);
			hero_stat.accept(_position_quest_destination);
		}
	}
	public void parse_quest_tile_description() {
		int _position_quest_tile_description = -1;
		Token.Parsed _token_quest_tile_description = null;
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
		_position_quest_tile_description=_position;
		_token_quest_tile_description=_token;
		_token=new Tokens.Rule.QuestTileDescriptionToken();
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
			if(_list_name_result!=null&&map_names.contains(_list_name_result)) {
				if(_position+_list_name_result.length()<_inputLength) {
					int _next_char = _inputArray[_position+_list_name_result.length()];
					if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,new Tokens.Name.MapNamesToken(_list_name_result));
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"map_names");
					_furthestPosition=_position;
				}
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_tile_description(quest_tile_description)");
				_furthestPosition=_position;
			}
			_position=_position_quest_tile_description;
		}
		else {
			parse_select_tile_name();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_tile_description(quest_tile_description)");
					_furthestPosition=_position;
				}
				_position=_position_quest_tile_description;
			}
			else {
				parse_ORDINAL();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_tile_description(quest_tile_description)");
						_furthestPosition=_position;
					}
					_position=_position_quest_tile_description;
				}
				else {
					parse_INTEGER();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_tile_description(quest_tile_description)");
							_furthestPosition=_position;
						}
						_position=_position_quest_tile_description;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_quest_tile_description.add(_position_quest_tile_description,_token);
		}
		_token=_token_quest_tile_description;
		if(_state==FAILED) {
			support_names.reject(_position_quest_tile_description);
			association_names.reject(_position_quest_tile_description);
			room_names.reject(_position_quest_tile_description);
			activity_names.reject(_position_quest_tile_description);
			siding_names.reject(_position_quest_tile_description);
			item_names.reject(_position_quest_tile_description);
			aspect_names.reject(_position_quest_tile_description);
			affinity_names.reject(_position_quest_tile_description);
			activity_type_names.reject(_position_quest_tile_description);
			trail_names.reject(_position_quest_tile_description);
			attack_names.reject(_position_quest_tile_description);
			reason_names.reject(_position_quest_tile_description);
			trait_names.reject(_position_quest_tile_description);
			condition_names.reject(_position_quest_tile_description);
			payment_short_type_names.reject(_position_quest_tile_description);
			skill_names.reject(_position_quest_tile_description);
			map_names.reject(_position_quest_tile_description);
			event_names.reject(_position_quest_tile_description);
			image_names.reject(_position_quest_tile_description);
			tile_symbols.reject(_position_quest_tile_description);
			payment_long_type_names.reject(_position_quest_tile_description);
			area_names.reject(_position_quest_tile_description);
			structure_names.reject(_position_quest_tile_description);
			tile_names.reject(_position_quest_tile_description);
			hero_stat.reject(_position_quest_tile_description);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_quest_tile_description);
			association_names.accept(_position_quest_tile_description);
			room_names.accept(_position_quest_tile_description);
			activity_names.accept(_position_quest_tile_description);
			siding_names.accept(_position_quest_tile_description);
			item_names.accept(_position_quest_tile_description);
			aspect_names.accept(_position_quest_tile_description);
			affinity_names.accept(_position_quest_tile_description);
			activity_type_names.accept(_position_quest_tile_description);
			trail_names.accept(_position_quest_tile_description);
			attack_names.accept(_position_quest_tile_description);
			reason_names.accept(_position_quest_tile_description);
			trait_names.accept(_position_quest_tile_description);
			condition_names.accept(_position_quest_tile_description);
			payment_short_type_names.accept(_position_quest_tile_description);
			skill_names.accept(_position_quest_tile_description);
			map_names.accept(_position_quest_tile_description);
			event_names.accept(_position_quest_tile_description);
			image_names.accept(_position_quest_tile_description);
			tile_symbols.accept(_position_quest_tile_description);
			payment_long_type_names.accept(_position_quest_tile_description);
			area_names.accept(_position_quest_tile_description);
			structure_names.accept(_position_quest_tile_description);
			tile_names.accept(_position_quest_tile_description);
			hero_stat.accept(_position_quest_tile_description);
		}
	}
	public void parse_quest_addition() {
		int _position_quest_addition = -1;
		Token.Parsed _token_quest_addition = null;
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
		_position_quest_addition=_position;
		_token_quest_addition=_token;
		_token=new Tokens.Rule.QuestAdditionToken();
		if(_position+2-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='<') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='<') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_113.SYNTAX);
			_position=_position+2;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain <<");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_addition(quest_addition)");
				_furthestPosition=_position;
			}
			_position=_position_quest_addition;
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
				if(_list_name_result!=null&&activity_names.contains(_list_name_result)) {
					if(_position+_list_name_result.length()<_inputLength) {
						int _next_char = _inputArray[_position+_list_name_result.length()];
						if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,new Tokens.Name.ActivityNamesToken(_list_name_result));
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_names");
						_furthestPosition=_position;
					}
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_addition(quest_addition)");
					_furthestPosition=_position;
				}
				_position=_position_quest_addition;
			}
			else {
				int _state_174 = _state;
				parse__anonymous_152();
				if(_state_174==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_addition(quest_addition)");
						_furthestPosition=_position;
					}
					_position=_position_quest_addition;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_quest_addition.add(_position_quest_addition,_token);
		}
		_token=_token_quest_addition;
		if(_state==FAILED) {
			support_names.reject(_position_quest_addition);
			association_names.reject(_position_quest_addition);
			room_names.reject(_position_quest_addition);
			activity_names.reject(_position_quest_addition);
			siding_names.reject(_position_quest_addition);
			item_names.reject(_position_quest_addition);
			aspect_names.reject(_position_quest_addition);
			affinity_names.reject(_position_quest_addition);
			activity_type_names.reject(_position_quest_addition);
			trail_names.reject(_position_quest_addition);
			attack_names.reject(_position_quest_addition);
			reason_names.reject(_position_quest_addition);
			trait_names.reject(_position_quest_addition);
			condition_names.reject(_position_quest_addition);
			payment_short_type_names.reject(_position_quest_addition);
			skill_names.reject(_position_quest_addition);
			map_names.reject(_position_quest_addition);
			event_names.reject(_position_quest_addition);
			image_names.reject(_position_quest_addition);
			tile_symbols.reject(_position_quest_addition);
			payment_long_type_names.reject(_position_quest_addition);
			area_names.reject(_position_quest_addition);
			structure_names.reject(_position_quest_addition);
			tile_names.reject(_position_quest_addition);
			hero_stat.reject(_position_quest_addition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_quest_addition);
			association_names.accept(_position_quest_addition);
			room_names.accept(_position_quest_addition);
			activity_names.accept(_position_quest_addition);
			siding_names.accept(_position_quest_addition);
			item_names.accept(_position_quest_addition);
			aspect_names.accept(_position_quest_addition);
			affinity_names.accept(_position_quest_addition);
			activity_type_names.accept(_position_quest_addition);
			trail_names.accept(_position_quest_addition);
			attack_names.accept(_position_quest_addition);
			reason_names.accept(_position_quest_addition);
			trait_names.accept(_position_quest_addition);
			condition_names.accept(_position_quest_addition);
			payment_short_type_names.accept(_position_quest_addition);
			skill_names.accept(_position_quest_addition);
			map_names.accept(_position_quest_addition);
			event_names.accept(_position_quest_addition);
			image_names.accept(_position_quest_addition);
			tile_symbols.accept(_position_quest_addition);
			payment_long_type_names.accept(_position_quest_addition);
			area_names.accept(_position_quest_addition);
			structure_names.accept(_position_quest_addition);
			tile_names.accept(_position_quest_addition);
			hero_stat.accept(_position_quest_addition);
		}
	}
	public void parse_quest_type_declaration() {
		int _position_quest_type_declaration = -1;
		Token.Parsed _token_quest_type_declaration = null;
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
		_position_quest_type_declaration=_position;
		_token_quest_type_declaration=_token;
		_token=new Tokens.Rule.QuestTypeDeclarationToken();
		if(_position+4-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='t') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='y') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='p') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='e') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_32.SYNTAX);
			_position=_position+4;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain type");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_declaration(quest_type_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_quest_type_declaration;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.QuestNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_declaration(quest_type_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_quest_type_declaration;
			}
			else {
				int _state_49 = _state;
				while(_position<_inputLength) {
					if(_position+1-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='\n'&&_inputArray[_position+0]!='\r') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_1.SYNTAX);
						_position=_position+1;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain \n");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_49==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_declaration(quest_type_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_quest_type_declaration;
				}
				else {
					parse_DESCRIPTION();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_declaration(quest_type_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_quest_type_declaration;
					}
					else {
						int _state_50 = _state;
						while(_position<_inputLength) {
							parse_quest_type_element();
							if(_state==FAILED) {
								break;
							}
						}
						if(_state_50==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"quest_type_declaration(quest_type_declaration)");
								_furthestPosition=_position;
							}
							_position=_position_quest_type_declaration;
						}
						else {
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_quest_type_declaration.add(_position_quest_type_declaration,_token);
		}
		_token=_token_quest_type_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_quest_type_declaration);
			association_names.reject(_position_quest_type_declaration);
			room_names.reject(_position_quest_type_declaration);
			activity_names.reject(_position_quest_type_declaration);
			siding_names.reject(_position_quest_type_declaration);
			item_names.reject(_position_quest_type_declaration);
			aspect_names.reject(_position_quest_type_declaration);
			affinity_names.reject(_position_quest_type_declaration);
			activity_type_names.reject(_position_quest_type_declaration);
			trail_names.reject(_position_quest_type_declaration);
			attack_names.reject(_position_quest_type_declaration);
			reason_names.reject(_position_quest_type_declaration);
			trait_names.reject(_position_quest_type_declaration);
			condition_names.reject(_position_quest_type_declaration);
			payment_short_type_names.reject(_position_quest_type_declaration);
			skill_names.reject(_position_quest_type_declaration);
			map_names.reject(_position_quest_type_declaration);
			event_names.reject(_position_quest_type_declaration);
			image_names.reject(_position_quest_type_declaration);
			tile_symbols.reject(_position_quest_type_declaration);
			payment_long_type_names.reject(_position_quest_type_declaration);
			area_names.reject(_position_quest_type_declaration);
			structure_names.reject(_position_quest_type_declaration);
			tile_names.reject(_position_quest_type_declaration);
			hero_stat.reject(_position_quest_type_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_quest_type_declaration);
			association_names.accept(_position_quest_type_declaration);
			room_names.accept(_position_quest_type_declaration);
			activity_names.accept(_position_quest_type_declaration);
			siding_names.accept(_position_quest_type_declaration);
			item_names.accept(_position_quest_type_declaration);
			aspect_names.accept(_position_quest_type_declaration);
			affinity_names.accept(_position_quest_type_declaration);
			activity_type_names.accept(_position_quest_type_declaration);
			trail_names.accept(_position_quest_type_declaration);
			attack_names.accept(_position_quest_type_declaration);
			reason_names.accept(_position_quest_type_declaration);
			trait_names.accept(_position_quest_type_declaration);
			condition_names.accept(_position_quest_type_declaration);
			payment_short_type_names.accept(_position_quest_type_declaration);
			skill_names.accept(_position_quest_type_declaration);
			map_names.accept(_position_quest_type_declaration);
			event_names.accept(_position_quest_type_declaration);
			image_names.accept(_position_quest_type_declaration);
			tile_symbols.accept(_position_quest_type_declaration);
			payment_long_type_names.accept(_position_quest_type_declaration);
			area_names.accept(_position_quest_type_declaration);
			structure_names.accept(_position_quest_type_declaration);
			tile_names.accept(_position_quest_type_declaration);
			hero_stat.accept(_position_quest_type_declaration);
		}
	}
}