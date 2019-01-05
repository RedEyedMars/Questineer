package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.acquisition_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class variable_context extends acquisition_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public variable_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public variable_context() {
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
	public void parse_variable_group() {
		int _position_variable_group = -1;
		Token.Parsed _token_variable_group = null;
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
		_position_variable_group=_position;
		_token_variable_group=_token;
		_token=new Tokens.Rule.VariableGroupToken();
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
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
				_furthestPosition=_position;
			}
			_position=_position_variable_group;
		}
		else {
			if(_position+11-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='a') {
					_state=FAILED;
				}
				if(_inputArray[_position+1]!='s') {
					_state=FAILED;
				}
				if(_inputArray[_position+2]!='s') {
					_state=FAILED;
				}
				if(_inputArray[_position+3]!='o') {
					_state=FAILED;
				}
				if(_inputArray[_position+4]!='c') {
					_state=FAILED;
				}
				if(_inputArray[_position+5]!='i') {
					_state=FAILED;
				}
				if(_inputArray[_position+6]!='a') {
					_state=FAILED;
				}
				if(_inputArray[_position+7]!='t') {
					_state=FAILED;
				}
				if(_inputArray[_position+8]!='i') {
					_state=FAILED;
				}
				if(_inputArray[_position+9]!='o') {
					_state=FAILED;
				}
				if(_inputArray[_position+10]!='n') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_131.SYNTAX);
				_position=_position+11;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain association");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
					_furthestPosition=_position;
				}
				_position=_position_variable_group;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_variable_group.add(_position_variable_group,_token);
		}
		_token=_token_variable_group;
		if(_state==FAILED) {
			support_names.reject(_position_variable_group);
			association_names.reject(_position_variable_group);
			room_names.reject(_position_variable_group);
			activity_names.reject(_position_variable_group);
			siding_names.reject(_position_variable_group);
			item_names.reject(_position_variable_group);
			aspect_names.reject(_position_variable_group);
			affinity_names.reject(_position_variable_group);
			activity_type_names.reject(_position_variable_group);
			trail_names.reject(_position_variable_group);
			attack_names.reject(_position_variable_group);
			reason_names.reject(_position_variable_group);
			trait_names.reject(_position_variable_group);
			condition_names.reject(_position_variable_group);
			payment_short_type_names.reject(_position_variable_group);
			skill_names.reject(_position_variable_group);
			map_names.reject(_position_variable_group);
			event_names.reject(_position_variable_group);
			image_names.reject(_position_variable_group);
			tile_symbols.reject(_position_variable_group);
			payment_long_type_names.reject(_position_variable_group);
			area_names.reject(_position_variable_group);
			structure_names.reject(_position_variable_group);
			tile_names.reject(_position_variable_group);
			hero_stat.reject(_position_variable_group);
			_state=SUCCESS;
			_position_variable_group=_position;
			_token_variable_group=_token;
			_token=new Tokens.Rule.VariableGroupToken();
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
				if(_list_name_result!=null&&skill_names.contains(_list_name_result)) {
					if(_position+_list_name_result.length()<_inputLength) {
						int _next_char = _inputArray[_position+_list_name_result.length()];
						if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,new Tokens.Name.SkillNamesToken(_list_name_result));
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"skill_names");
						_furthestPosition=_position;
					}
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
					_furthestPosition=_position;
				}
				_position=_position_variable_group;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='k') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='l') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='l') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_133.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain skill");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
						_furthestPosition=_position;
					}
					_position=_position_variable_group;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_variable_group.add(_position_variable_group,_token);
			}
			_token=_token_variable_group;
			if(_state==FAILED) {
				support_names.reject(_position_variable_group);
				association_names.reject(_position_variable_group);
				room_names.reject(_position_variable_group);
				activity_names.reject(_position_variable_group);
				siding_names.reject(_position_variable_group);
				item_names.reject(_position_variable_group);
				aspect_names.reject(_position_variable_group);
				affinity_names.reject(_position_variable_group);
				activity_type_names.reject(_position_variable_group);
				trail_names.reject(_position_variable_group);
				attack_names.reject(_position_variable_group);
				reason_names.reject(_position_variable_group);
				trait_names.reject(_position_variable_group);
				condition_names.reject(_position_variable_group);
				payment_short_type_names.reject(_position_variable_group);
				skill_names.reject(_position_variable_group);
				map_names.reject(_position_variable_group);
				event_names.reject(_position_variable_group);
				image_names.reject(_position_variable_group);
				tile_symbols.reject(_position_variable_group);
				payment_long_type_names.reject(_position_variable_group);
				area_names.reject(_position_variable_group);
				structure_names.reject(_position_variable_group);
				tile_names.reject(_position_variable_group);
				hero_stat.reject(_position_variable_group);
				_state=SUCCESS;
				_position_variable_group=_position;
				_token_variable_group=_token;
				_token=new Tokens.Rule.VariableGroupToken();
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
						_furthestPosition=_position;
					}
					_position=_position_variable_group;
				}
				else {
					if(_position+5-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='g') {
							_state=FAILED;
						}
						if(_inputArray[_position+1]!='r') {
							_state=FAILED;
						}
						if(_inputArray[_position+2]!='o') {
							_state=FAILED;
						}
						if(_inputArray[_position+3]!='u') {
							_state=FAILED;
						}
						if(_inputArray[_position+4]!='p') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_140.SYNTAX);
						_position=_position+5;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain group");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
							_furthestPosition=_position;
						}
						_position=_position_variable_group;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_variable_group.add(_position_variable_group,_token);
				}
				_token=_token_variable_group;
				if(_state==FAILED) {
					support_names.reject(_position_variable_group);
					association_names.reject(_position_variable_group);
					room_names.reject(_position_variable_group);
					activity_names.reject(_position_variable_group);
					siding_names.reject(_position_variable_group);
					item_names.reject(_position_variable_group);
					aspect_names.reject(_position_variable_group);
					affinity_names.reject(_position_variable_group);
					activity_type_names.reject(_position_variable_group);
					trail_names.reject(_position_variable_group);
					attack_names.reject(_position_variable_group);
					reason_names.reject(_position_variable_group);
					trait_names.reject(_position_variable_group);
					condition_names.reject(_position_variable_group);
					payment_short_type_names.reject(_position_variable_group);
					skill_names.reject(_position_variable_group);
					map_names.reject(_position_variable_group);
					event_names.reject(_position_variable_group);
					image_names.reject(_position_variable_group);
					tile_symbols.reject(_position_variable_group);
					payment_long_type_names.reject(_position_variable_group);
					area_names.reject(_position_variable_group);
					structure_names.reject(_position_variable_group);
					tile_names.reject(_position_variable_group);
					hero_stat.reject(_position_variable_group);
					_state=SUCCESS;
					_position_variable_group=_position;
					_token_variable_group=_token;
					_token=new Tokens.Rule.VariableGroupToken();
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
						if(_list_name_result!=null&&affinity_names.contains(_list_name_result)) {
							if(_position+_list_name_result.length()<_inputLength) {
								int _next_char = _inputArray[_position+_list_name_result.length()];
								if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,new Tokens.Name.AffinityNamesToken(_list_name_result));
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
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"affinity_names");
								_furthestPosition=_position;
							}
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
							_furthestPosition=_position;
						}
						_position=_position_variable_group;
					}
					else {
						if(_position+8-1 >=_inputLength) {
							_state=FAILED;
						}
						else {
							if(_inputArray[_position+0]!='a') {
								_state=FAILED;
							}
							if(_inputArray[_position+1]!='f') {
								_state=FAILED;
							}
							if(_inputArray[_position+2]!='f') {
								_state=FAILED;
							}
							if(_inputArray[_position+3]!='i') {
								_state=FAILED;
							}
							if(_inputArray[_position+4]!='n') {
								_state=FAILED;
							}
							if(_inputArray[_position+5]!='i') {
								_state=FAILED;
							}
							if(_inputArray[_position+6]!='t') {
								_state=FAILED;
							}
							if(_inputArray[_position+7]!='y') {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,Tokens.Syntax.syntax_141.SYNTAX);
							_position=_position+8;
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
						else if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain affinity");
								_furthestPosition=_position;
							}
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
								_furthestPosition=_position;
							}
							_position=_position_variable_group;
						}
						else {
						}
					}
					if(_state==SUCCESS) {
						_token_variable_group.add(_position_variable_group,_token);
					}
					_token=_token_variable_group;
					if(_state==FAILED) {
						support_names.reject(_position_variable_group);
						association_names.reject(_position_variable_group);
						room_names.reject(_position_variable_group);
						activity_names.reject(_position_variable_group);
						siding_names.reject(_position_variable_group);
						item_names.reject(_position_variable_group);
						aspect_names.reject(_position_variable_group);
						affinity_names.reject(_position_variable_group);
						activity_type_names.reject(_position_variable_group);
						trail_names.reject(_position_variable_group);
						attack_names.reject(_position_variable_group);
						reason_names.reject(_position_variable_group);
						trait_names.reject(_position_variable_group);
						condition_names.reject(_position_variable_group);
						payment_short_type_names.reject(_position_variable_group);
						skill_names.reject(_position_variable_group);
						map_names.reject(_position_variable_group);
						event_names.reject(_position_variable_group);
						image_names.reject(_position_variable_group);
						tile_symbols.reject(_position_variable_group);
						payment_long_type_names.reject(_position_variable_group);
						area_names.reject(_position_variable_group);
						structure_names.reject(_position_variable_group);
						tile_names.reject(_position_variable_group);
						hero_stat.reject(_position_variable_group);
						_state=SUCCESS;
						_position_variable_group=_position;
						_token_variable_group=_token;
						_token=new Tokens.Rule.VariableGroupToken();
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
							if(_list_name_result!=null&&attack_names.contains(_list_name_result)) {
								if(_position+_list_name_result.length()<_inputLength) {
									int _next_char = _inputArray[_position+_list_name_result.length()];
									if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
										_state=FAILED;
									}
								}
								if(_state==SUCCESS) {
									_token.add(_position,new Tokens.Name.AttackNamesToken(_list_name_result));
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
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_names");
									_furthestPosition=_position;
								}
							}
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
								_furthestPosition=_position;
							}
							_position=_position_variable_group;
						}
						else {
							if(_position+6-1 >=_inputLength) {
								_state=FAILED;
							}
							else {
								if(_inputArray[_position+0]!='a') {
									_state=FAILED;
								}
								if(_inputArray[_position+1]!='t') {
									_state=FAILED;
								}
								if(_inputArray[_position+2]!='t') {
									_state=FAILED;
								}
								if(_inputArray[_position+3]!='a') {
									_state=FAILED;
								}
								if(_inputArray[_position+4]!='c') {
									_state=FAILED;
								}
								if(_inputArray[_position+5]!='k') {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,Tokens.Syntax.syntax_127.SYNTAX);
								_position=_position+6;
								while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
									++_position;
								}
							}
							else if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain attack");
									_furthestPosition=_position;
								}
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
									_furthestPosition=_position;
								}
								_position=_position_variable_group;
							}
							else {
							}
						}
						if(_state==SUCCESS) {
							_token_variable_group.add(_position_variable_group,_token);
						}
						_token=_token_variable_group;
						if(_state==FAILED) {
							support_names.reject(_position_variable_group);
							association_names.reject(_position_variable_group);
							room_names.reject(_position_variable_group);
							activity_names.reject(_position_variable_group);
							siding_names.reject(_position_variable_group);
							item_names.reject(_position_variable_group);
							aspect_names.reject(_position_variable_group);
							affinity_names.reject(_position_variable_group);
							activity_type_names.reject(_position_variable_group);
							trail_names.reject(_position_variable_group);
							attack_names.reject(_position_variable_group);
							reason_names.reject(_position_variable_group);
							trait_names.reject(_position_variable_group);
							condition_names.reject(_position_variable_group);
							payment_short_type_names.reject(_position_variable_group);
							skill_names.reject(_position_variable_group);
							map_names.reject(_position_variable_group);
							event_names.reject(_position_variable_group);
							image_names.reject(_position_variable_group);
							tile_symbols.reject(_position_variable_group);
							payment_long_type_names.reject(_position_variable_group);
							area_names.reject(_position_variable_group);
							structure_names.reject(_position_variable_group);
							tile_names.reject(_position_variable_group);
							hero_stat.reject(_position_variable_group);
							_state=SUCCESS;
							_position_variable_group=_position;
							_token_variable_group=_token;
							_token=new Tokens.Rule.VariableGroupToken();
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
								if(_list_name_result!=null&&trait_names.contains(_list_name_result)) {
									if(_position+_list_name_result.length()<_inputLength) {
										int _next_char = _inputArray[_position+_list_name_result.length()];
										if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
											_state=FAILED;
										}
									}
									if(_state==SUCCESS) {
										_token.add(_position,new Tokens.Name.TraitNamesToken(_list_name_result));
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
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"trait_names");
										_furthestPosition=_position;
									}
								}
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
									_furthestPosition=_position;
								}
								_position=_position_variable_group;
							}
							else {
								if(_position+5-1 >=_inputLength) {
									_state=FAILED;
								}
								else {
									if(_inputArray[_position+0]!='t') {
										_state=FAILED;
									}
									if(_inputArray[_position+1]!='r') {
										_state=FAILED;
									}
									if(_inputArray[_position+2]!='a') {
										_state=FAILED;
									}
									if(_inputArray[_position+3]!='i') {
										_state=FAILED;
									}
									if(_inputArray[_position+4]!='t') {
										_state=FAILED;
									}
								}
								if(_state==SUCCESS) {
									_token.add(_position,Tokens.Syntax.syntax_129.SYNTAX);
									_position=_position+5;
									while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
										++_position;
									}
								}
								else if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain trait");
										_furthestPosition=_position;
									}
								}
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
										_furthestPosition=_position;
									}
									_position=_position_variable_group;
								}
								else {
								}
							}
							if(_state==SUCCESS) {
								_token_variable_group.add(_position_variable_group,_token);
							}
							_token=_token_variable_group;
							if(_state==FAILED) {
								support_names.reject(_position_variable_group);
								association_names.reject(_position_variable_group);
								room_names.reject(_position_variable_group);
								activity_names.reject(_position_variable_group);
								siding_names.reject(_position_variable_group);
								item_names.reject(_position_variable_group);
								aspect_names.reject(_position_variable_group);
								affinity_names.reject(_position_variable_group);
								activity_type_names.reject(_position_variable_group);
								trail_names.reject(_position_variable_group);
								attack_names.reject(_position_variable_group);
								reason_names.reject(_position_variable_group);
								trait_names.reject(_position_variable_group);
								condition_names.reject(_position_variable_group);
								payment_short_type_names.reject(_position_variable_group);
								skill_names.reject(_position_variable_group);
								map_names.reject(_position_variable_group);
								event_names.reject(_position_variable_group);
								image_names.reject(_position_variable_group);
								tile_symbols.reject(_position_variable_group);
								payment_long_type_names.reject(_position_variable_group);
								area_names.reject(_position_variable_group);
								structure_names.reject(_position_variable_group);
								tile_names.reject(_position_variable_group);
								hero_stat.reject(_position_variable_group);
								_state=SUCCESS;
								_position_variable_group=_position;
								_token_variable_group=_token;
								_token=new Tokens.Rule.VariableGroupToken();
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
									if(_list_name_result!=null&&condition_names.contains(_list_name_result)) {
										if(_position+_list_name_result.length()<_inputLength) {
											int _next_char = _inputArray[_position+_list_name_result.length()];
											if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
												_state=FAILED;
											}
										}
										if(_state==SUCCESS) {
											_token.add(_position,new Tokens.Name.ConditionNamesToken(_list_name_result));
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
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"condition_names");
											_furthestPosition=_position;
										}
									}
								}
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
										_furthestPosition=_position;
									}
									_position=_position_variable_group;
								}
								else {
									if(_position+9-1 >=_inputLength) {
										_state=FAILED;
									}
									else {
										if(_inputArray[_position+0]!='c') {
											_state=FAILED;
										}
										if(_inputArray[_position+1]!='o') {
											_state=FAILED;
										}
										if(_inputArray[_position+2]!='n') {
											_state=FAILED;
										}
										if(_inputArray[_position+3]!='d') {
											_state=FAILED;
										}
										if(_inputArray[_position+4]!='i') {
											_state=FAILED;
										}
										if(_inputArray[_position+5]!='t') {
											_state=FAILED;
										}
										if(_inputArray[_position+6]!='i') {
											_state=FAILED;
										}
										if(_inputArray[_position+7]!='o') {
											_state=FAILED;
										}
										if(_inputArray[_position+8]!='n') {
											_state=FAILED;
										}
									}
									if(_state==SUCCESS) {
										_token.add(_position,Tokens.Syntax.syntax_142.SYNTAX);
										_position=_position+9;
										while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
											++_position;
										}
									}
									else if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain condition");
											_furthestPosition=_position;
										}
									}
									if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
											_furthestPosition=_position;
										}
										_position=_position_variable_group;
									}
									else {
									}
								}
								if(_state==SUCCESS) {
									_token_variable_group.add(_position_variable_group,_token);
								}
								_token=_token_variable_group;
								if(_state==FAILED) {
									support_names.reject(_position_variable_group);
									association_names.reject(_position_variable_group);
									room_names.reject(_position_variable_group);
									activity_names.reject(_position_variable_group);
									siding_names.reject(_position_variable_group);
									item_names.reject(_position_variable_group);
									aspect_names.reject(_position_variable_group);
									affinity_names.reject(_position_variable_group);
									activity_type_names.reject(_position_variable_group);
									trail_names.reject(_position_variable_group);
									attack_names.reject(_position_variable_group);
									reason_names.reject(_position_variable_group);
									trait_names.reject(_position_variable_group);
									condition_names.reject(_position_variable_group);
									payment_short_type_names.reject(_position_variable_group);
									skill_names.reject(_position_variable_group);
									map_names.reject(_position_variable_group);
									event_names.reject(_position_variable_group);
									image_names.reject(_position_variable_group);
									tile_symbols.reject(_position_variable_group);
									payment_long_type_names.reject(_position_variable_group);
									area_names.reject(_position_variable_group);
									structure_names.reject(_position_variable_group);
									tile_names.reject(_position_variable_group);
									hero_stat.reject(_position_variable_group);
									_state=SUCCESS;
									_position_variable_group=_position;
									_token_variable_group=_token;
									_token=new Tokens.Rule.VariableGroupToken();
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
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
											_furthestPosition=_position;
										}
										_position=_position_variable_group;
									}
									else {
										if(_position+8-1 >=_inputLength) {
											_state=FAILED;
										}
										else {
											if(_inputArray[_position+0]!='a') {
												_state=FAILED;
											}
											if(_inputArray[_position+1]!='c') {
												_state=FAILED;
											}
											if(_inputArray[_position+2]!='t') {
												_state=FAILED;
											}
											if(_inputArray[_position+3]!='i') {
												_state=FAILED;
											}
											if(_inputArray[_position+4]!='v') {
												_state=FAILED;
											}
											if(_inputArray[_position+5]!='i') {
												_state=FAILED;
											}
											if(_inputArray[_position+6]!='t') {
												_state=FAILED;
											}
											if(_inputArray[_position+7]!='y') {
												_state=FAILED;
											}
										}
										if(_state==SUCCESS) {
											_token.add(_position,Tokens.Syntax.syntax_143.SYNTAX);
											_position=_position+8;
											while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
												++_position;
											}
										}
										else if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain activity");
												_furthestPosition=_position;
											}
										}
										if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
												_furthestPosition=_position;
											}
											_position=_position_variable_group;
										}
										else {
										}
									}
									if(_state==SUCCESS) {
										_token_variable_group.add(_position_variable_group,_token);
									}
									_token=_token_variable_group;
									if(_state==FAILED) {
										support_names.reject(_position_variable_group);
										association_names.reject(_position_variable_group);
										room_names.reject(_position_variable_group);
										activity_names.reject(_position_variable_group);
										siding_names.reject(_position_variable_group);
										item_names.reject(_position_variable_group);
										aspect_names.reject(_position_variable_group);
										affinity_names.reject(_position_variable_group);
										activity_type_names.reject(_position_variable_group);
										trail_names.reject(_position_variable_group);
										attack_names.reject(_position_variable_group);
										reason_names.reject(_position_variable_group);
										trait_names.reject(_position_variable_group);
										condition_names.reject(_position_variable_group);
										payment_short_type_names.reject(_position_variable_group);
										skill_names.reject(_position_variable_group);
										map_names.reject(_position_variable_group);
										event_names.reject(_position_variable_group);
										image_names.reject(_position_variable_group);
										tile_symbols.reject(_position_variable_group);
										payment_long_type_names.reject(_position_variable_group);
										area_names.reject(_position_variable_group);
										structure_names.reject(_position_variable_group);
										tile_names.reject(_position_variable_group);
										hero_stat.reject(_position_variable_group);
										_state=SUCCESS;
										_position_variable_group=_position;
										_token_variable_group=_token;
										_token=new Tokens.Rule.VariableGroupToken();
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
											if(_list_name_result!=null&&activity_type_names.contains(_list_name_result)) {
												if(_position+_list_name_result.length()<_inputLength) {
													int _next_char = _inputArray[_position+_list_name_result.length()];
													if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
														_state=FAILED;
													}
												}
												if(_state==SUCCESS) {
													_token.add(_position,new Tokens.Name.ActivityTypeNamesToken(_list_name_result));
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
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_names");
													_furthestPosition=_position;
												}
											}
										}
										if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
												_furthestPosition=_position;
											}
											_position=_position_variable_group;
										}
										else {
											if(_position+8-1 >=_inputLength) {
												_state=FAILED;
											}
											else {
												if(_inputArray[_position+0]!='p') {
													_state=FAILED;
												}
												if(_inputArray[_position+1]!='r') {
													_state=FAILED;
												}
												if(_inputArray[_position+2]!='a') {
													_state=FAILED;
												}
												if(_inputArray[_position+3]!='c') {
													_state=FAILED;
												}
												if(_inputArray[_position+4]!='t') {
													_state=FAILED;
												}
												if(_inputArray[_position+5]!='i') {
													_state=FAILED;
												}
												if(_inputArray[_position+6]!='c') {
													_state=FAILED;
												}
												if(_inputArray[_position+7]!='e') {
													_state=FAILED;
												}
											}
											if(_state==SUCCESS) {
												_token.add(_position,Tokens.Syntax.syntax_144.SYNTAX);
												_position=_position+8;
												while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
													++_position;
												}
											}
											else if(_state==FAILED) {
												if(_position>=_furthestPosition) {
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain practice");
													_furthestPosition=_position;
												}
											}
											if(_state==FAILED) {
												if(_position>=_furthestPosition) {
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
													_furthestPosition=_position;
												}
												_position=_position_variable_group;
											}
											else {
											}
										}
										if(_state==SUCCESS) {
											_token_variable_group.add(_position_variable_group,_token);
										}
										_token=_token_variable_group;
										if(_state==FAILED) {
											support_names.reject(_position_variable_group);
											association_names.reject(_position_variable_group);
											room_names.reject(_position_variable_group);
											activity_names.reject(_position_variable_group);
											siding_names.reject(_position_variable_group);
											item_names.reject(_position_variable_group);
											aspect_names.reject(_position_variable_group);
											affinity_names.reject(_position_variable_group);
											activity_type_names.reject(_position_variable_group);
											trail_names.reject(_position_variable_group);
											attack_names.reject(_position_variable_group);
											reason_names.reject(_position_variable_group);
											trait_names.reject(_position_variable_group);
											condition_names.reject(_position_variable_group);
											payment_short_type_names.reject(_position_variable_group);
											skill_names.reject(_position_variable_group);
											map_names.reject(_position_variable_group);
											event_names.reject(_position_variable_group);
											image_names.reject(_position_variable_group);
											tile_symbols.reject(_position_variable_group);
											payment_long_type_names.reject(_position_variable_group);
											area_names.reject(_position_variable_group);
											structure_names.reject(_position_variable_group);
											tile_names.reject(_position_variable_group);
											hero_stat.reject(_position_variable_group);
											_state=SUCCESS;
											_position_variable_group=_position;
											_token_variable_group=_token;
											_token=new Tokens.Rule.VariableGroupToken();
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
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
													_furthestPosition=_position;
												}
												_position=_position_variable_group;
											}
											else {
												int _state_213 = _state;
												_token_NAME=_token;
												_token=new Tokens.Name.SymbolNameToken();
												_position_NAME=_position;
												parse_NAME();
												if(_state==SUCCESS) {
													_token_NAME.add(_position_NAME,_token);
												}
												_token=_token_NAME;
												if(_state_213==SUCCESS&&_state==FAILED) {
													_state=SUCCESS;
												}
												if(_state==FAILED) {
													if(_position>=_furthestPosition) {
														_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
														_furthestPosition=_position;
													}
													_position=_position_variable_group;
												}
												else {
													int _state_214 = _state;
													boolean _iteration_achieved_214 = false;
													while(_position<_inputLength) {
														parse__anonymous_199();
														if(_state==FAILED) {
															break;
														}
														else {
															_iteration_achieved_214=true;
														}
													}
													if(_iteration_achieved_214==false) {
														_state=FAILED;
													}
													else if(_state_214==SUCCESS&&_state==FAILED) {
														_state=SUCCESS;
													}
													if(_state==FAILED) {
														if(_position>=_furthestPosition) {
															_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
															_furthestPosition=_position;
														}
														_position=_position_variable_group;
													}
													else {
													}
												}
											}
											if(_state==SUCCESS) {
												_token_variable_group.add(_position_variable_group,_token);
											}
											_token=_token_variable_group;
											if(_state==FAILED) {
												support_names.reject(_position_variable_group);
												association_names.reject(_position_variable_group);
												room_names.reject(_position_variable_group);
												activity_names.reject(_position_variable_group);
												siding_names.reject(_position_variable_group);
												item_names.reject(_position_variable_group);
												aspect_names.reject(_position_variable_group);
												affinity_names.reject(_position_variable_group);
												activity_type_names.reject(_position_variable_group);
												trail_names.reject(_position_variable_group);
												attack_names.reject(_position_variable_group);
												reason_names.reject(_position_variable_group);
												trait_names.reject(_position_variable_group);
												condition_names.reject(_position_variable_group);
												payment_short_type_names.reject(_position_variable_group);
												skill_names.reject(_position_variable_group);
												map_names.reject(_position_variable_group);
												event_names.reject(_position_variable_group);
												image_names.reject(_position_variable_group);
												tile_symbols.reject(_position_variable_group);
												payment_long_type_names.reject(_position_variable_group);
												area_names.reject(_position_variable_group);
												structure_names.reject(_position_variable_group);
												tile_names.reject(_position_variable_group);
												hero_stat.reject(_position_variable_group);
												_state=SUCCESS;
												_position_variable_group=_position;
												_token_variable_group=_token;
												_token=new Tokens.Rule.VariableGroupToken();
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
														_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
														_furthestPosition=_position;
													}
													_position=_position_variable_group;
												}
												else {
												}
												if(_state==SUCCESS) {
													_token_variable_group.add(_position_variable_group,_token);
												}
												_token=_token_variable_group;
												if(_state==FAILED) {
													support_names.reject(_position_variable_group);
													association_names.reject(_position_variable_group);
													room_names.reject(_position_variable_group);
													activity_names.reject(_position_variable_group);
													siding_names.reject(_position_variable_group);
													item_names.reject(_position_variable_group);
													aspect_names.reject(_position_variable_group);
													affinity_names.reject(_position_variable_group);
													activity_type_names.reject(_position_variable_group);
													trail_names.reject(_position_variable_group);
													attack_names.reject(_position_variable_group);
													reason_names.reject(_position_variable_group);
													trait_names.reject(_position_variable_group);
													condition_names.reject(_position_variable_group);
													payment_short_type_names.reject(_position_variable_group);
													skill_names.reject(_position_variable_group);
													map_names.reject(_position_variable_group);
													event_names.reject(_position_variable_group);
													image_names.reject(_position_variable_group);
													tile_symbols.reject(_position_variable_group);
													payment_long_type_names.reject(_position_variable_group);
													area_names.reject(_position_variable_group);
													structure_names.reject(_position_variable_group);
													tile_names.reject(_position_variable_group);
													hero_stat.reject(_position_variable_group);
													_state=SUCCESS;
													_position_variable_group=_position;
													_token_variable_group=_token;
													_token=new Tokens.Rule.VariableGroupToken();
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
														if(_list_name_result!=null&&skill_names.contains(_list_name_result)) {
															if(_position+_list_name_result.length()<_inputLength) {
																int _next_char = _inputArray[_position+_list_name_result.length()];
																if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
																	_state=FAILED;
																}
															}
															if(_state==SUCCESS) {
																_token.add(_position,new Tokens.Name.SkillNamesToken(_list_name_result));
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
																_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"skill_names");
																_furthestPosition=_position;
															}
														}
													}
													if(_state==FAILED) {
														if(_position>=_furthestPosition) {
															_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
															_furthestPosition=_position;
														}
														_position=_position_variable_group;
													}
													else {
													}
													if(_state==SUCCESS) {
														_token_variable_group.add(_position_variable_group,_token);
													}
													_token=_token_variable_group;
													if(_state==FAILED) {
														support_names.reject(_position_variable_group);
														association_names.reject(_position_variable_group);
														room_names.reject(_position_variable_group);
														activity_names.reject(_position_variable_group);
														siding_names.reject(_position_variable_group);
														item_names.reject(_position_variable_group);
														aspect_names.reject(_position_variable_group);
														affinity_names.reject(_position_variable_group);
														activity_type_names.reject(_position_variable_group);
														trail_names.reject(_position_variable_group);
														attack_names.reject(_position_variable_group);
														reason_names.reject(_position_variable_group);
														trait_names.reject(_position_variable_group);
														condition_names.reject(_position_variable_group);
														payment_short_type_names.reject(_position_variable_group);
														skill_names.reject(_position_variable_group);
														map_names.reject(_position_variable_group);
														event_names.reject(_position_variable_group);
														image_names.reject(_position_variable_group);
														tile_symbols.reject(_position_variable_group);
														payment_long_type_names.reject(_position_variable_group);
														area_names.reject(_position_variable_group);
														structure_names.reject(_position_variable_group);
														tile_names.reject(_position_variable_group);
														hero_stat.reject(_position_variable_group);
														_state=SUCCESS;
														_position_variable_group=_position;
														_token_variable_group=_token;
														_token=new Tokens.Rule.VariableGroupToken();
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
																_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																_furthestPosition=_position;
															}
															_position=_position_variable_group;
														}
														else {
														}
														if(_state==SUCCESS) {
															_token_variable_group.add(_position_variable_group,_token);
														}
														_token=_token_variable_group;
														if(_state==FAILED) {
															support_names.reject(_position_variable_group);
															association_names.reject(_position_variable_group);
															room_names.reject(_position_variable_group);
															activity_names.reject(_position_variable_group);
															siding_names.reject(_position_variable_group);
															item_names.reject(_position_variable_group);
															aspect_names.reject(_position_variable_group);
															affinity_names.reject(_position_variable_group);
															activity_type_names.reject(_position_variable_group);
															trail_names.reject(_position_variable_group);
															attack_names.reject(_position_variable_group);
															reason_names.reject(_position_variable_group);
															trait_names.reject(_position_variable_group);
															condition_names.reject(_position_variable_group);
															payment_short_type_names.reject(_position_variable_group);
															skill_names.reject(_position_variable_group);
															map_names.reject(_position_variable_group);
															event_names.reject(_position_variable_group);
															image_names.reject(_position_variable_group);
															tile_symbols.reject(_position_variable_group);
															payment_long_type_names.reject(_position_variable_group);
															area_names.reject(_position_variable_group);
															structure_names.reject(_position_variable_group);
															tile_names.reject(_position_variable_group);
															hero_stat.reject(_position_variable_group);
															_state=SUCCESS;
															_position_variable_group=_position;
															_token_variable_group=_token;
															_token=new Tokens.Rule.VariableGroupToken();
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
																if(_list_name_result!=null&&affinity_names.contains(_list_name_result)) {
																	if(_position+_list_name_result.length()<_inputLength) {
																		int _next_char = _inputArray[_position+_list_name_result.length()];
																		if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
																			_state=FAILED;
																		}
																	}
																	if(_state==SUCCESS) {
																		_token.add(_position,new Tokens.Name.AffinityNamesToken(_list_name_result));
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
																		_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"affinity_names");
																		_furthestPosition=_position;
																	}
																}
															}
															if(_state==FAILED) {
																if(_position>=_furthestPosition) {
																	_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																	_furthestPosition=_position;
																}
																_position=_position_variable_group;
															}
															else {
															}
															if(_state==SUCCESS) {
																_token_variable_group.add(_position_variable_group,_token);
															}
															_token=_token_variable_group;
															if(_state==FAILED) {
																support_names.reject(_position_variable_group);
																association_names.reject(_position_variable_group);
																room_names.reject(_position_variable_group);
																activity_names.reject(_position_variable_group);
																siding_names.reject(_position_variable_group);
																item_names.reject(_position_variable_group);
																aspect_names.reject(_position_variable_group);
																affinity_names.reject(_position_variable_group);
																activity_type_names.reject(_position_variable_group);
																trail_names.reject(_position_variable_group);
																attack_names.reject(_position_variable_group);
																reason_names.reject(_position_variable_group);
																trait_names.reject(_position_variable_group);
																condition_names.reject(_position_variable_group);
																payment_short_type_names.reject(_position_variable_group);
																skill_names.reject(_position_variable_group);
																map_names.reject(_position_variable_group);
																event_names.reject(_position_variable_group);
																image_names.reject(_position_variable_group);
																tile_symbols.reject(_position_variable_group);
																payment_long_type_names.reject(_position_variable_group);
																area_names.reject(_position_variable_group);
																structure_names.reject(_position_variable_group);
																tile_names.reject(_position_variable_group);
																hero_stat.reject(_position_variable_group);
																_state=SUCCESS;
																_position_variable_group=_position;
																_token_variable_group=_token;
																_token=new Tokens.Rule.VariableGroupToken();
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
																	if(_list_name_result!=null&&attack_names.contains(_list_name_result)) {
																		if(_position+_list_name_result.length()<_inputLength) {
																			int _next_char = _inputArray[_position+_list_name_result.length()];
																			if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
																				_state=FAILED;
																			}
																		}
																		if(_state==SUCCESS) {
																			_token.add(_position,new Tokens.Name.AttackNamesToken(_list_name_result));
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
																			_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"attack_names");
																			_furthestPosition=_position;
																		}
																	}
																}
																if(_state==FAILED) {
																	if(_position>=_furthestPosition) {
																		_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																		_furthestPosition=_position;
																	}
																	_position=_position_variable_group;
																}
																else {
																}
																if(_state==SUCCESS) {
																	_token_variable_group.add(_position_variable_group,_token);
																}
																_token=_token_variable_group;
																if(_state==FAILED) {
																	support_names.reject(_position_variable_group);
																	association_names.reject(_position_variable_group);
																	room_names.reject(_position_variable_group);
																	activity_names.reject(_position_variable_group);
																	siding_names.reject(_position_variable_group);
																	item_names.reject(_position_variable_group);
																	aspect_names.reject(_position_variable_group);
																	affinity_names.reject(_position_variable_group);
																	activity_type_names.reject(_position_variable_group);
																	trail_names.reject(_position_variable_group);
																	attack_names.reject(_position_variable_group);
																	reason_names.reject(_position_variable_group);
																	trait_names.reject(_position_variable_group);
																	condition_names.reject(_position_variable_group);
																	payment_short_type_names.reject(_position_variable_group);
																	skill_names.reject(_position_variable_group);
																	map_names.reject(_position_variable_group);
																	event_names.reject(_position_variable_group);
																	image_names.reject(_position_variable_group);
																	tile_symbols.reject(_position_variable_group);
																	payment_long_type_names.reject(_position_variable_group);
																	area_names.reject(_position_variable_group);
																	structure_names.reject(_position_variable_group);
																	tile_names.reject(_position_variable_group);
																	hero_stat.reject(_position_variable_group);
																	_state=SUCCESS;
																	_position_variable_group=_position;
																	_token_variable_group=_token;
																	_token=new Tokens.Rule.VariableGroupToken();
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
																		if(_list_name_result!=null&&trait_names.contains(_list_name_result)) {
																			if(_position+_list_name_result.length()<_inputLength) {
																				int _next_char = _inputArray[_position+_list_name_result.length()];
																				if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
																					_state=FAILED;
																				}
																			}
																			if(_state==SUCCESS) {
																				_token.add(_position,new Tokens.Name.TraitNamesToken(_list_name_result));
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
																				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"trait_names");
																				_furthestPosition=_position;
																			}
																		}
																	}
																	if(_state==FAILED) {
																		if(_position>=_furthestPosition) {
																			_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																			_furthestPosition=_position;
																		}
																		_position=_position_variable_group;
																	}
																	else {
																	}
																	if(_state==SUCCESS) {
																		_token_variable_group.add(_position_variable_group,_token);
																	}
																	_token=_token_variable_group;
																	if(_state==FAILED) {
																		support_names.reject(_position_variable_group);
																		association_names.reject(_position_variable_group);
																		room_names.reject(_position_variable_group);
																		activity_names.reject(_position_variable_group);
																		siding_names.reject(_position_variable_group);
																		item_names.reject(_position_variable_group);
																		aspect_names.reject(_position_variable_group);
																		affinity_names.reject(_position_variable_group);
																		activity_type_names.reject(_position_variable_group);
																		trail_names.reject(_position_variable_group);
																		attack_names.reject(_position_variable_group);
																		reason_names.reject(_position_variable_group);
																		trait_names.reject(_position_variable_group);
																		condition_names.reject(_position_variable_group);
																		payment_short_type_names.reject(_position_variable_group);
																		skill_names.reject(_position_variable_group);
																		map_names.reject(_position_variable_group);
																		event_names.reject(_position_variable_group);
																		image_names.reject(_position_variable_group);
																		tile_symbols.reject(_position_variable_group);
																		payment_long_type_names.reject(_position_variable_group);
																		area_names.reject(_position_variable_group);
																		structure_names.reject(_position_variable_group);
																		tile_names.reject(_position_variable_group);
																		hero_stat.reject(_position_variable_group);
																		_state=SUCCESS;
																		_position_variable_group=_position;
																		_token_variable_group=_token;
																		_token=new Tokens.Rule.VariableGroupToken();
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
																			if(_list_name_result!=null&&condition_names.contains(_list_name_result)) {
																				if(_position+_list_name_result.length()<_inputLength) {
																					int _next_char = _inputArray[_position+_list_name_result.length()];
																					if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
																						_state=FAILED;
																					}
																				}
																				if(_state==SUCCESS) {
																					_token.add(_position,new Tokens.Name.ConditionNamesToken(_list_name_result));
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
																					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"condition_names");
																					_furthestPosition=_position;
																				}
																			}
																		}
																		if(_state==FAILED) {
																			if(_position>=_furthestPosition) {
																				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																				_furthestPosition=_position;
																			}
																			_position=_position_variable_group;
																		}
																		else {
																		}
																		if(_state==SUCCESS) {
																			_token_variable_group.add(_position_variable_group,_token);
																		}
																		_token=_token_variable_group;
																		if(_state==FAILED) {
																			support_names.reject(_position_variable_group);
																			association_names.reject(_position_variable_group);
																			room_names.reject(_position_variable_group);
																			activity_names.reject(_position_variable_group);
																			siding_names.reject(_position_variable_group);
																			item_names.reject(_position_variable_group);
																			aspect_names.reject(_position_variable_group);
																			affinity_names.reject(_position_variable_group);
																			activity_type_names.reject(_position_variable_group);
																			trail_names.reject(_position_variable_group);
																			attack_names.reject(_position_variable_group);
																			reason_names.reject(_position_variable_group);
																			trait_names.reject(_position_variable_group);
																			condition_names.reject(_position_variable_group);
																			payment_short_type_names.reject(_position_variable_group);
																			skill_names.reject(_position_variable_group);
																			map_names.reject(_position_variable_group);
																			event_names.reject(_position_variable_group);
																			image_names.reject(_position_variable_group);
																			tile_symbols.reject(_position_variable_group);
																			payment_long_type_names.reject(_position_variable_group);
																			area_names.reject(_position_variable_group);
																			structure_names.reject(_position_variable_group);
																			tile_names.reject(_position_variable_group);
																			hero_stat.reject(_position_variable_group);
																			_state=SUCCESS;
																			_position_variable_group=_position;
																			_token_variable_group=_token;
																			_token=new Tokens.Rule.VariableGroupToken();
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
																					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																					_furthestPosition=_position;
																				}
																				_position=_position_variable_group;
																			}
																			else {
																			}
																			if(_state==SUCCESS) {
																				_token_variable_group.add(_position_variable_group,_token);
																			}
																			_token=_token_variable_group;
																			if(_state==FAILED) {
																				support_names.reject(_position_variable_group);
																				association_names.reject(_position_variable_group);
																				room_names.reject(_position_variable_group);
																				activity_names.reject(_position_variable_group);
																				siding_names.reject(_position_variable_group);
																				item_names.reject(_position_variable_group);
																				aspect_names.reject(_position_variable_group);
																				affinity_names.reject(_position_variable_group);
																				activity_type_names.reject(_position_variable_group);
																				trail_names.reject(_position_variable_group);
																				attack_names.reject(_position_variable_group);
																				reason_names.reject(_position_variable_group);
																				trait_names.reject(_position_variable_group);
																				condition_names.reject(_position_variable_group);
																				payment_short_type_names.reject(_position_variable_group);
																				skill_names.reject(_position_variable_group);
																				map_names.reject(_position_variable_group);
																				event_names.reject(_position_variable_group);
																				image_names.reject(_position_variable_group);
																				tile_symbols.reject(_position_variable_group);
																				payment_long_type_names.reject(_position_variable_group);
																				area_names.reject(_position_variable_group);
																				structure_names.reject(_position_variable_group);
																				tile_names.reject(_position_variable_group);
																				hero_stat.reject(_position_variable_group);
																				_state=SUCCESS;
																				_position_variable_group=_position;
																				_token_variable_group=_token;
																				_token=new Tokens.Rule.VariableGroupToken();
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
																					if(_list_name_result!=null&&activity_type_names.contains(_list_name_result)) {
																						if(_position+_list_name_result.length()<_inputLength) {
																							int _next_char = _inputArray[_position+_list_name_result.length()];
																							if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
																								_state=FAILED;
																							}
																						}
																						if(_state==SUCCESS) {
																							_token.add(_position,new Tokens.Name.ActivityTypeNamesToken(_list_name_result));
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
																							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"activity_type_names");
																							_furthestPosition=_position;
																						}
																					}
																				}
																				if(_state==FAILED) {
																					if(_position>=_furthestPosition) {
																						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																						_furthestPosition=_position;
																					}
																					_position=_position_variable_group;
																				}
																				else {
																				}
																				if(_state==SUCCESS) {
																					_token_variable_group.add(_position_variable_group,_token);
																				}
																				_token=_token_variable_group;
																				if(_state==FAILED) {
																					support_names.reject(_position_variable_group);
																					association_names.reject(_position_variable_group);
																					room_names.reject(_position_variable_group);
																					activity_names.reject(_position_variable_group);
																					siding_names.reject(_position_variable_group);
																					item_names.reject(_position_variable_group);
																					aspect_names.reject(_position_variable_group);
																					affinity_names.reject(_position_variable_group);
																					activity_type_names.reject(_position_variable_group);
																					trail_names.reject(_position_variable_group);
																					attack_names.reject(_position_variable_group);
																					reason_names.reject(_position_variable_group);
																					trait_names.reject(_position_variable_group);
																					condition_names.reject(_position_variable_group);
																					payment_short_type_names.reject(_position_variable_group);
																					skill_names.reject(_position_variable_group);
																					map_names.reject(_position_variable_group);
																					event_names.reject(_position_variable_group);
																					image_names.reject(_position_variable_group);
																					tile_symbols.reject(_position_variable_group);
																					payment_long_type_names.reject(_position_variable_group);
																					area_names.reject(_position_variable_group);
																					structure_names.reject(_position_variable_group);
																					tile_names.reject(_position_variable_group);
																					hero_stat.reject(_position_variable_group);
																					_state=SUCCESS;
																					_position_variable_group=_position;
																					_token_variable_group=_token;
																					_token=new Tokens.Rule.VariableGroupToken();
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
																							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																							_furthestPosition=_position;
																						}
																						_position=_position_variable_group;
																					}
																					else {
																						int _state_215 = _state;
																						_token_NAME=_token;
																						_token=new Tokens.Name.SymbolNameToken();
																						_position_NAME=_position;
																						parse_NAME();
																						if(_state==SUCCESS) {
																							_token_NAME.add(_position_NAME,_token);
																						}
																						_token=_token_NAME;
																						if(_state_215==SUCCESS&&_state==FAILED) {
																							_state=SUCCESS;
																						}
																						if(_state==FAILED) {
																							if(_position>=_furthestPosition) {
																								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_group(variable_group)");
																								_furthestPosition=_position;
																							}
																							_position=_position_variable_group;
																						}
																						else {
																						}
																					}
																					if(_state==SUCCESS) {
																						_token_variable_group.add(_position_variable_group,_token);
																					}
																					_token=_token_variable_group;
																					if(_state==FAILED) {
																						support_names.reject(_position_variable_group);
																						association_names.reject(_position_variable_group);
																						room_names.reject(_position_variable_group);
																						activity_names.reject(_position_variable_group);
																						siding_names.reject(_position_variable_group);
																						item_names.reject(_position_variable_group);
																						aspect_names.reject(_position_variable_group);
																						affinity_names.reject(_position_variable_group);
																						activity_type_names.reject(_position_variable_group);
																						trail_names.reject(_position_variable_group);
																						attack_names.reject(_position_variable_group);
																						reason_names.reject(_position_variable_group);
																						trait_names.reject(_position_variable_group);
																						condition_names.reject(_position_variable_group);
																						payment_short_type_names.reject(_position_variable_group);
																						skill_names.reject(_position_variable_group);
																						map_names.reject(_position_variable_group);
																						event_names.reject(_position_variable_group);
																						image_names.reject(_position_variable_group);
																						tile_symbols.reject(_position_variable_group);
																						payment_long_type_names.reject(_position_variable_group);
																						area_names.reject(_position_variable_group);
																						structure_names.reject(_position_variable_group);
																						tile_names.reject(_position_variable_group);
																						hero_stat.reject(_position_variable_group);
																					}
																					else if(_state==SUCCESS) {
																						support_names.accept(_position_variable_group);
																						association_names.accept(_position_variable_group);
																						room_names.accept(_position_variable_group);
																						activity_names.accept(_position_variable_group);
																						siding_names.accept(_position_variable_group);
																						item_names.accept(_position_variable_group);
																						aspect_names.accept(_position_variable_group);
																						affinity_names.accept(_position_variable_group);
																						activity_type_names.accept(_position_variable_group);
																						trail_names.accept(_position_variable_group);
																						attack_names.accept(_position_variable_group);
																						reason_names.accept(_position_variable_group);
																						trait_names.accept(_position_variable_group);
																						condition_names.accept(_position_variable_group);
																						payment_short_type_names.accept(_position_variable_group);
																						skill_names.accept(_position_variable_group);
																						map_names.accept(_position_variable_group);
																						event_names.accept(_position_variable_group);
																						image_names.accept(_position_variable_group);
																						tile_symbols.accept(_position_variable_group);
																						payment_long_type_names.accept(_position_variable_group);
																						area_names.accept(_position_variable_group);
																						structure_names.accept(_position_variable_group);
																						tile_names.accept(_position_variable_group);
																						hero_stat.accept(_position_variable_group);
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void parse_variable_declaration() {
		int _position_variable_declaration = -1;
		Token.Parsed _token_variable_declaration = null;
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
		_position_variable_declaration=_position;
		_token_variable_declaration=_token;
		_token=new Tokens.Rule.VariableDeclarationToken();
		parse_variable_header();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_declaration(variable_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_variable_declaration;
		}
		else {
			int _state_210 = _state;
			parse__anonymous_193();
			if(_state_210==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_declaration(variable_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_variable_declaration;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_variable_declaration.add(_position_variable_declaration,_token);
		}
		_token=_token_variable_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_variable_declaration);
			association_names.reject(_position_variable_declaration);
			room_names.reject(_position_variable_declaration);
			activity_names.reject(_position_variable_declaration);
			siding_names.reject(_position_variable_declaration);
			item_names.reject(_position_variable_declaration);
			aspect_names.reject(_position_variable_declaration);
			affinity_names.reject(_position_variable_declaration);
			activity_type_names.reject(_position_variable_declaration);
			trail_names.reject(_position_variable_declaration);
			attack_names.reject(_position_variable_declaration);
			reason_names.reject(_position_variable_declaration);
			trait_names.reject(_position_variable_declaration);
			condition_names.reject(_position_variable_declaration);
			payment_short_type_names.reject(_position_variable_declaration);
			skill_names.reject(_position_variable_declaration);
			map_names.reject(_position_variable_declaration);
			event_names.reject(_position_variable_declaration);
			image_names.reject(_position_variable_declaration);
			tile_symbols.reject(_position_variable_declaration);
			payment_long_type_names.reject(_position_variable_declaration);
			area_names.reject(_position_variable_declaration);
			structure_names.reject(_position_variable_declaration);
			tile_names.reject(_position_variable_declaration);
			hero_stat.reject(_position_variable_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_variable_declaration);
			association_names.accept(_position_variable_declaration);
			room_names.accept(_position_variable_declaration);
			activity_names.accept(_position_variable_declaration);
			siding_names.accept(_position_variable_declaration);
			item_names.accept(_position_variable_declaration);
			aspect_names.accept(_position_variable_declaration);
			affinity_names.accept(_position_variable_declaration);
			activity_type_names.accept(_position_variable_declaration);
			trail_names.accept(_position_variable_declaration);
			attack_names.accept(_position_variable_declaration);
			reason_names.accept(_position_variable_declaration);
			trait_names.accept(_position_variable_declaration);
			condition_names.accept(_position_variable_declaration);
			payment_short_type_names.accept(_position_variable_declaration);
			skill_names.accept(_position_variable_declaration);
			map_names.accept(_position_variable_declaration);
			event_names.accept(_position_variable_declaration);
			image_names.accept(_position_variable_declaration);
			tile_symbols.accept(_position_variable_declaration);
			payment_long_type_names.accept(_position_variable_declaration);
			area_names.accept(_position_variable_declaration);
			structure_names.accept(_position_variable_declaration);
			tile_names.accept(_position_variable_declaration);
			hero_stat.accept(_position_variable_declaration);
		}
	}
	public void parse_variable_call() {
		int _position_variable_call = -1;
		Token.Parsed _token_variable_call = null;
		int _position_range = -1;
		Token.Parsed _token_range = null;
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
		_position_variable_call=_position;
		_token_variable_call=_token;
		_token=new Tokens.Rule.VariableCallToken();
		_token_range=_token;
		_token=new Tokens.Name.RangeToken();
		_position_range=_position;
		parse_range();
		if(_state==SUCCESS) {
			_token_range.add(_position_range,_token);
		}
		_token=_token_range;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call(variable_call)");
				_furthestPosition=_position;
			}
			_position=_position_variable_call;
		}
		else {
			int _state_211 = _state;
			while(_position<_inputLength) {
				parse__anonymous_194();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_211==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call(variable_call)");
					_furthestPosition=_position;
				}
				_position=_position_variable_call;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_variable_call.add(_position_variable_call,_token);
		}
		_token=_token_variable_call;
		if(_state==FAILED) {
			support_names.reject(_position_variable_call);
			association_names.reject(_position_variable_call);
			room_names.reject(_position_variable_call);
			activity_names.reject(_position_variable_call);
			siding_names.reject(_position_variable_call);
			item_names.reject(_position_variable_call);
			aspect_names.reject(_position_variable_call);
			affinity_names.reject(_position_variable_call);
			activity_type_names.reject(_position_variable_call);
			trail_names.reject(_position_variable_call);
			attack_names.reject(_position_variable_call);
			reason_names.reject(_position_variable_call);
			trait_names.reject(_position_variable_call);
			condition_names.reject(_position_variable_call);
			payment_short_type_names.reject(_position_variable_call);
			skill_names.reject(_position_variable_call);
			map_names.reject(_position_variable_call);
			event_names.reject(_position_variable_call);
			image_names.reject(_position_variable_call);
			tile_symbols.reject(_position_variable_call);
			payment_long_type_names.reject(_position_variable_call);
			area_names.reject(_position_variable_call);
			structure_names.reject(_position_variable_call);
			tile_names.reject(_position_variable_call);
			hero_stat.reject(_position_variable_call);
			_state=SUCCESS;
			_position_variable_call=_position;
			_token_variable_call=_token;
			_token=new Tokens.Rule.VariableCallToken();
			parse__anonymous_195();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call(variable_call)");
					_furthestPosition=_position;
				}
				_position=_position_variable_call;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_variable_call.add(_position_variable_call,_token);
			}
			_token=_token_variable_call;
			if(_state==FAILED) {
				support_names.reject(_position_variable_call);
				association_names.reject(_position_variable_call);
				room_names.reject(_position_variable_call);
				activity_names.reject(_position_variable_call);
				siding_names.reject(_position_variable_call);
				item_names.reject(_position_variable_call);
				aspect_names.reject(_position_variable_call);
				affinity_names.reject(_position_variable_call);
				activity_type_names.reject(_position_variable_call);
				trail_names.reject(_position_variable_call);
				attack_names.reject(_position_variable_call);
				reason_names.reject(_position_variable_call);
				trait_names.reject(_position_variable_call);
				condition_names.reject(_position_variable_call);
				payment_short_type_names.reject(_position_variable_call);
				skill_names.reject(_position_variable_call);
				map_names.reject(_position_variable_call);
				event_names.reject(_position_variable_call);
				image_names.reject(_position_variable_call);
				tile_symbols.reject(_position_variable_call);
				payment_long_type_names.reject(_position_variable_call);
				area_names.reject(_position_variable_call);
				structure_names.reject(_position_variable_call);
				tile_names.reject(_position_variable_call);
				hero_stat.reject(_position_variable_call);
				_state=SUCCESS;
				_position_variable_call=_position;
				_token_variable_call=_token;
				_token=new Tokens.Rule.VariableCallToken();
				parse_variable_call_element();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call(variable_call)");
						_furthestPosition=_position;
					}
					_position=_position_variable_call;
				}
				else {
					int _state_212 = _state;
					while(_position<_inputLength) {
						parse__anonymous_196();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_212==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call(variable_call)");
							_furthestPosition=_position;
						}
						_position=_position_variable_call;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_variable_call.add(_position_variable_call,_token);
				}
				_token=_token_variable_call;
				if(_state==FAILED) {
					support_names.reject(_position_variable_call);
					association_names.reject(_position_variable_call);
					room_names.reject(_position_variable_call);
					activity_names.reject(_position_variable_call);
					siding_names.reject(_position_variable_call);
					item_names.reject(_position_variable_call);
					aspect_names.reject(_position_variable_call);
					affinity_names.reject(_position_variable_call);
					activity_type_names.reject(_position_variable_call);
					trail_names.reject(_position_variable_call);
					attack_names.reject(_position_variable_call);
					reason_names.reject(_position_variable_call);
					trait_names.reject(_position_variable_call);
					condition_names.reject(_position_variable_call);
					payment_short_type_names.reject(_position_variable_call);
					skill_names.reject(_position_variable_call);
					map_names.reject(_position_variable_call);
					event_names.reject(_position_variable_call);
					image_names.reject(_position_variable_call);
					tile_symbols.reject(_position_variable_call);
					payment_long_type_names.reject(_position_variable_call);
					area_names.reject(_position_variable_call);
					structure_names.reject(_position_variable_call);
					tile_names.reject(_position_variable_call);
					hero_stat.reject(_position_variable_call);
				}
				else if(_state==SUCCESS) {
					support_names.accept(_position_variable_call);
					association_names.accept(_position_variable_call);
					room_names.accept(_position_variable_call);
					activity_names.accept(_position_variable_call);
					siding_names.accept(_position_variable_call);
					item_names.accept(_position_variable_call);
					aspect_names.accept(_position_variable_call);
					affinity_names.accept(_position_variable_call);
					activity_type_names.accept(_position_variable_call);
					trail_names.accept(_position_variable_call);
					attack_names.accept(_position_variable_call);
					reason_names.accept(_position_variable_call);
					trait_names.accept(_position_variable_call);
					condition_names.accept(_position_variable_call);
					payment_short_type_names.accept(_position_variable_call);
					skill_names.accept(_position_variable_call);
					map_names.accept(_position_variable_call);
					event_names.accept(_position_variable_call);
					image_names.accept(_position_variable_call);
					tile_symbols.accept(_position_variable_call);
					payment_long_type_names.accept(_position_variable_call);
					area_names.accept(_position_variable_call);
					structure_names.accept(_position_variable_call);
					tile_names.accept(_position_variable_call);
					hero_stat.accept(_position_variable_call);
				}
			}
		}
	}
	public void parse_variable_call_element() {
		int _position_variable_call_element = -1;
		Token.Parsed _token_variable_call_element = null;
		int _position_QUOTE = -1;
		int _position_NAME = -1;
		Token.Parsed _token_QUOTE = null;
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
		_position_variable_call_element=_position;
		_token_variable_call_element=_token;
		_token=new Tokens.Rule.VariableCallElementToken();
		parse_braced_statement();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
				_furthestPosition=_position;
			}
			_position=_position_variable_call_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_variable_call_element.addAll(_token);
			_token_variable_call_element.setValue(_token.getValue());
		}
		_token=_token_variable_call_element;
		if(_state==FAILED) {
			support_names.reject(_position_variable_call_element);
			association_names.reject(_position_variable_call_element);
			room_names.reject(_position_variable_call_element);
			activity_names.reject(_position_variable_call_element);
			siding_names.reject(_position_variable_call_element);
			item_names.reject(_position_variable_call_element);
			aspect_names.reject(_position_variable_call_element);
			affinity_names.reject(_position_variable_call_element);
			activity_type_names.reject(_position_variable_call_element);
			trail_names.reject(_position_variable_call_element);
			attack_names.reject(_position_variable_call_element);
			reason_names.reject(_position_variable_call_element);
			trait_names.reject(_position_variable_call_element);
			condition_names.reject(_position_variable_call_element);
			payment_short_type_names.reject(_position_variable_call_element);
			skill_names.reject(_position_variable_call_element);
			map_names.reject(_position_variable_call_element);
			event_names.reject(_position_variable_call_element);
			image_names.reject(_position_variable_call_element);
			tile_symbols.reject(_position_variable_call_element);
			payment_long_type_names.reject(_position_variable_call_element);
			area_names.reject(_position_variable_call_element);
			structure_names.reject(_position_variable_call_element);
			tile_names.reject(_position_variable_call_element);
			hero_stat.reject(_position_variable_call_element);
			_state=SUCCESS;
			_position_variable_call_element=_position;
			_token_variable_call_element=_token;
			_token=new Tokens.Rule.VariableCallElementToken();
			parse__anonymous_197();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
					_furthestPosition=_position;
				}
				_position=_position_variable_call_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_variable_call_element.addAll(_token);
				_token_variable_call_element.setValue(_token.getValue());
			}
			_token=_token_variable_call_element;
			if(_state==FAILED) {
				support_names.reject(_position_variable_call_element);
				association_names.reject(_position_variable_call_element);
				room_names.reject(_position_variable_call_element);
				activity_names.reject(_position_variable_call_element);
				siding_names.reject(_position_variable_call_element);
				item_names.reject(_position_variable_call_element);
				aspect_names.reject(_position_variable_call_element);
				affinity_names.reject(_position_variable_call_element);
				activity_type_names.reject(_position_variable_call_element);
				trail_names.reject(_position_variable_call_element);
				attack_names.reject(_position_variable_call_element);
				reason_names.reject(_position_variable_call_element);
				trait_names.reject(_position_variable_call_element);
				condition_names.reject(_position_variable_call_element);
				payment_short_type_names.reject(_position_variable_call_element);
				skill_names.reject(_position_variable_call_element);
				map_names.reject(_position_variable_call_element);
				event_names.reject(_position_variable_call_element);
				image_names.reject(_position_variable_call_element);
				tile_symbols.reject(_position_variable_call_element);
				payment_long_type_names.reject(_position_variable_call_element);
				area_names.reject(_position_variable_call_element);
				structure_names.reject(_position_variable_call_element);
				tile_names.reject(_position_variable_call_element);
				hero_stat.reject(_position_variable_call_element);
				_state=SUCCESS;
				_position_variable_call_element=_position;
				_token_variable_call_element=_token;
				_token=new Tokens.Rule.VariableCallElementToken();
				parse__anonymous_198();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
						_furthestPosition=_position;
					}
					_position=_position_variable_call_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_variable_call_element.addAll(_token);
					_token_variable_call_element.setValue(_token.getValue());
				}
				_token=_token_variable_call_element;
				if(_state==FAILED) {
					support_names.reject(_position_variable_call_element);
					association_names.reject(_position_variable_call_element);
					room_names.reject(_position_variable_call_element);
					activity_names.reject(_position_variable_call_element);
					siding_names.reject(_position_variable_call_element);
					item_names.reject(_position_variable_call_element);
					aspect_names.reject(_position_variable_call_element);
					affinity_names.reject(_position_variable_call_element);
					activity_type_names.reject(_position_variable_call_element);
					trail_names.reject(_position_variable_call_element);
					attack_names.reject(_position_variable_call_element);
					reason_names.reject(_position_variable_call_element);
					trait_names.reject(_position_variable_call_element);
					condition_names.reject(_position_variable_call_element);
					payment_short_type_names.reject(_position_variable_call_element);
					skill_names.reject(_position_variable_call_element);
					map_names.reject(_position_variable_call_element);
					event_names.reject(_position_variable_call_element);
					image_names.reject(_position_variable_call_element);
					tile_symbols.reject(_position_variable_call_element);
					payment_long_type_names.reject(_position_variable_call_element);
					area_names.reject(_position_variable_call_element);
					structure_names.reject(_position_variable_call_element);
					tile_names.reject(_position_variable_call_element);
					hero_stat.reject(_position_variable_call_element);
					_state=SUCCESS;
					_position_variable_call_element=_position;
					_token_variable_call_element=_token;
					_token=new Tokens.Rule.VariableCallElementToken();
					parse_method();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
							_furthestPosition=_position;
						}
						_position=_position_variable_call_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_variable_call_element.addAll(_token);
						_token_variable_call_element.setValue(_token.getValue());
					}
					_token=_token_variable_call_element;
					if(_state==FAILED) {
						support_names.reject(_position_variable_call_element);
						association_names.reject(_position_variable_call_element);
						room_names.reject(_position_variable_call_element);
						activity_names.reject(_position_variable_call_element);
						siding_names.reject(_position_variable_call_element);
						item_names.reject(_position_variable_call_element);
						aspect_names.reject(_position_variable_call_element);
						affinity_names.reject(_position_variable_call_element);
						activity_type_names.reject(_position_variable_call_element);
						trail_names.reject(_position_variable_call_element);
						attack_names.reject(_position_variable_call_element);
						reason_names.reject(_position_variable_call_element);
						trait_names.reject(_position_variable_call_element);
						condition_names.reject(_position_variable_call_element);
						payment_short_type_names.reject(_position_variable_call_element);
						skill_names.reject(_position_variable_call_element);
						map_names.reject(_position_variable_call_element);
						event_names.reject(_position_variable_call_element);
						image_names.reject(_position_variable_call_element);
						tile_symbols.reject(_position_variable_call_element);
						payment_long_type_names.reject(_position_variable_call_element);
						area_names.reject(_position_variable_call_element);
						structure_names.reject(_position_variable_call_element);
						tile_names.reject(_position_variable_call_element);
						hero_stat.reject(_position_variable_call_element);
						_state=SUCCESS;
						_position_variable_call_element=_position;
						_token_variable_call_element=_token;
						_token=new Tokens.Rule.VariableCallElementToken();
						parse_variable_group();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
								_furthestPosition=_position;
							}
							_position=_position_variable_call_element;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_variable_call_element.addAll(_token);
							_token_variable_call_element.setValue(_token.getValue());
						}
						_token=_token_variable_call_element;
						if(_state==FAILED) {
							support_names.reject(_position_variable_call_element);
							association_names.reject(_position_variable_call_element);
							room_names.reject(_position_variable_call_element);
							activity_names.reject(_position_variable_call_element);
							siding_names.reject(_position_variable_call_element);
							item_names.reject(_position_variable_call_element);
							aspect_names.reject(_position_variable_call_element);
							affinity_names.reject(_position_variable_call_element);
							activity_type_names.reject(_position_variable_call_element);
							trail_names.reject(_position_variable_call_element);
							attack_names.reject(_position_variable_call_element);
							reason_names.reject(_position_variable_call_element);
							trait_names.reject(_position_variable_call_element);
							condition_names.reject(_position_variable_call_element);
							payment_short_type_names.reject(_position_variable_call_element);
							skill_names.reject(_position_variable_call_element);
							map_names.reject(_position_variable_call_element);
							event_names.reject(_position_variable_call_element);
							image_names.reject(_position_variable_call_element);
							tile_symbols.reject(_position_variable_call_element);
							payment_long_type_names.reject(_position_variable_call_element);
							area_names.reject(_position_variable_call_element);
							structure_names.reject(_position_variable_call_element);
							tile_names.reject(_position_variable_call_element);
							hero_stat.reject(_position_variable_call_element);
							_state=SUCCESS;
							_position_variable_call_element=_position;
							_token_variable_call_element=_token;
							_token=new Tokens.Rule.VariableCallElementToken();
							_token_NAME=_token;
							_token=new Tokens.Name.VariableNameToken();
							_position_NAME=_position;
							parse_NAME();
							if(_state==SUCCESS) {
								_token_NAME.add(_position_NAME,_token);
							}
							_token=_token_NAME;
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
									_furthestPosition=_position;
								}
								_position=_position_variable_call_element;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_variable_call_element.addAll(_token);
								_token_variable_call_element.setValue(_token.getValue());
							}
							_token=_token_variable_call_element;
							if(_state==FAILED) {
								support_names.reject(_position_variable_call_element);
								association_names.reject(_position_variable_call_element);
								room_names.reject(_position_variable_call_element);
								activity_names.reject(_position_variable_call_element);
								siding_names.reject(_position_variable_call_element);
								item_names.reject(_position_variable_call_element);
								aspect_names.reject(_position_variable_call_element);
								affinity_names.reject(_position_variable_call_element);
								activity_type_names.reject(_position_variable_call_element);
								trail_names.reject(_position_variable_call_element);
								attack_names.reject(_position_variable_call_element);
								reason_names.reject(_position_variable_call_element);
								trait_names.reject(_position_variable_call_element);
								condition_names.reject(_position_variable_call_element);
								payment_short_type_names.reject(_position_variable_call_element);
								skill_names.reject(_position_variable_call_element);
								map_names.reject(_position_variable_call_element);
								event_names.reject(_position_variable_call_element);
								image_names.reject(_position_variable_call_element);
								tile_symbols.reject(_position_variable_call_element);
								payment_long_type_names.reject(_position_variable_call_element);
								area_names.reject(_position_variable_call_element);
								structure_names.reject(_position_variable_call_element);
								tile_names.reject(_position_variable_call_element);
								hero_stat.reject(_position_variable_call_element);
								_state=SUCCESS;
								_position_variable_call_element=_position;
								_token_variable_call_element=_token;
								_token=new Tokens.Rule.VariableCallElementToken();
								_token_QUOTE=_token;
								_token=new Tokens.Name.QuoteToken();
								_position_QUOTE=_position;
								parse_QUOTE();
								if(_state==SUCCESS) {
									_token_QUOTE.add(_position_QUOTE,_token);
								}
								_token=_token_QUOTE;
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_call_element(variable_call_element)");
										_furthestPosition=_position;
									}
									_position=_position_variable_call_element;
								}
								else {
								}
								if(_state==SUCCESS) {
									_token_variable_call_element.addAll(_token);
									_token_variable_call_element.setValue(_token.getValue());
								}
								_token=_token_variable_call_element;
								if(_state==FAILED) {
									support_names.reject(_position_variable_call_element);
									association_names.reject(_position_variable_call_element);
									room_names.reject(_position_variable_call_element);
									activity_names.reject(_position_variable_call_element);
									siding_names.reject(_position_variable_call_element);
									item_names.reject(_position_variable_call_element);
									aspect_names.reject(_position_variable_call_element);
									affinity_names.reject(_position_variable_call_element);
									activity_type_names.reject(_position_variable_call_element);
									trail_names.reject(_position_variable_call_element);
									attack_names.reject(_position_variable_call_element);
									reason_names.reject(_position_variable_call_element);
									trait_names.reject(_position_variable_call_element);
									condition_names.reject(_position_variable_call_element);
									payment_short_type_names.reject(_position_variable_call_element);
									skill_names.reject(_position_variable_call_element);
									map_names.reject(_position_variable_call_element);
									event_names.reject(_position_variable_call_element);
									image_names.reject(_position_variable_call_element);
									tile_symbols.reject(_position_variable_call_element);
									payment_long_type_names.reject(_position_variable_call_element);
									area_names.reject(_position_variable_call_element);
									structure_names.reject(_position_variable_call_element);
									tile_names.reject(_position_variable_call_element);
									hero_stat.reject(_position_variable_call_element);
								}
								else if(_state==SUCCESS) {
									support_names.accept(_position_variable_call_element);
									association_names.accept(_position_variable_call_element);
									room_names.accept(_position_variable_call_element);
									activity_names.accept(_position_variable_call_element);
									siding_names.accept(_position_variable_call_element);
									item_names.accept(_position_variable_call_element);
									aspect_names.accept(_position_variable_call_element);
									affinity_names.accept(_position_variable_call_element);
									activity_type_names.accept(_position_variable_call_element);
									trail_names.accept(_position_variable_call_element);
									attack_names.accept(_position_variable_call_element);
									reason_names.accept(_position_variable_call_element);
									trait_names.accept(_position_variable_call_element);
									condition_names.accept(_position_variable_call_element);
									payment_short_type_names.accept(_position_variable_call_element);
									skill_names.accept(_position_variable_call_element);
									map_names.accept(_position_variable_call_element);
									event_names.accept(_position_variable_call_element);
									image_names.accept(_position_variable_call_element);
									tile_symbols.accept(_position_variable_call_element);
									payment_long_type_names.accept(_position_variable_call_element);
									area_names.accept(_position_variable_call_element);
									structure_names.accept(_position_variable_call_element);
									tile_names.accept(_position_variable_call_element);
									hero_stat.accept(_position_variable_call_element);
								}
							}
						}
					}
				}
			}
		}
	}
	public void parse_variable_header() {
		int _position_variable_header = -1;
		Token.Parsed _token_variable_header = null;
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
		_position_variable_header=_position;
		_token_variable_header=_token;
		_token=new Tokens.Rule.VariableHeaderToken();
		parse_type_name();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_header(variable_header)");
				_furthestPosition=_position;
			}
			_position=_position_variable_header;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.VariableNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"variable_header(variable_header)");
					_furthestPosition=_position;
				}
				_position=_position_variable_header;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_variable_header.add(_position_variable_header,_token);
		}
		_token=_token_variable_header;
		if(_state==FAILED) {
			support_names.reject(_position_variable_header);
			association_names.reject(_position_variable_header);
			room_names.reject(_position_variable_header);
			activity_names.reject(_position_variable_header);
			siding_names.reject(_position_variable_header);
			item_names.reject(_position_variable_header);
			aspect_names.reject(_position_variable_header);
			affinity_names.reject(_position_variable_header);
			activity_type_names.reject(_position_variable_header);
			trail_names.reject(_position_variable_header);
			attack_names.reject(_position_variable_header);
			reason_names.reject(_position_variable_header);
			trait_names.reject(_position_variable_header);
			condition_names.reject(_position_variable_header);
			payment_short_type_names.reject(_position_variable_header);
			skill_names.reject(_position_variable_header);
			map_names.reject(_position_variable_header);
			event_names.reject(_position_variable_header);
			image_names.reject(_position_variable_header);
			tile_symbols.reject(_position_variable_header);
			payment_long_type_names.reject(_position_variable_header);
			area_names.reject(_position_variable_header);
			structure_names.reject(_position_variable_header);
			tile_names.reject(_position_variable_header);
			hero_stat.reject(_position_variable_header);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_variable_header);
			association_names.accept(_position_variable_header);
			room_names.accept(_position_variable_header);
			activity_names.accept(_position_variable_header);
			siding_names.accept(_position_variable_header);
			item_names.accept(_position_variable_header);
			aspect_names.accept(_position_variable_header);
			affinity_names.accept(_position_variable_header);
			activity_type_names.accept(_position_variable_header);
			trail_names.accept(_position_variable_header);
			attack_names.accept(_position_variable_header);
			reason_names.accept(_position_variable_header);
			trait_names.accept(_position_variable_header);
			condition_names.accept(_position_variable_header);
			payment_short_type_names.accept(_position_variable_header);
			skill_names.accept(_position_variable_header);
			map_names.accept(_position_variable_header);
			event_names.accept(_position_variable_header);
			image_names.accept(_position_variable_header);
			tile_symbols.accept(_position_variable_header);
			payment_long_type_names.accept(_position_variable_header);
			area_names.accept(_position_variable_header);
			structure_names.accept(_position_variable_header);
			tile_names.accept(_position_variable_header);
			hero_stat.accept(_position_variable_header);
		}
	}
}