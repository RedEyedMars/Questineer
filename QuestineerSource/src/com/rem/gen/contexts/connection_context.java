package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.affinity_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class connection_context extends affinity_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public connection_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public connection_context() {
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
	public void parse_connection_declaration() {
		int _position_connection_declaration = -1;
		Token.Parsed _token_connection_declaration = null;
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
		_position_connection_declaration=_position;
		_token_connection_declaration=_token;
		_token=new Tokens.Rule.ConnectionDeclarationToken();
		if(_position+7-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='C') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='o') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='n') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='n') {
				_state=FAILED;
			}
			if(_inputArray[_position+4]!='e') {
				_state=FAILED;
			}
			if(_inputArray[_position+5]!='c') {
				_state=FAILED;
			}
			if(_inputArray[_position+6]!='t') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_61.SYNTAX);
			_position=_position+7;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain Connect");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"connection_declaration(connection_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_connection_declaration;
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
				if(_list_name_result!=null&&tile_names.contains(_list_name_result)) {
					if(_position+_list_name_result.length()<_inputLength) {
						int _next_char = _inputArray[_position+_list_name_result.length()];
						if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,new Tokens.Name.TileNamesToken(_list_name_result));
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_names");
						_furthestPosition=_position;
					}
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"connection_declaration(connection_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_connection_declaration;
			}
			else {
				if(_position+4-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='f') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='r') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='o') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='m') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_62.SYNTAX);
					_position=_position+4;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain from");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"connection_declaration(connection_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_connection_declaration;
				}
				else {
					_token_NAME=_token;
					_token=new Tokens.Name.StartNodeNameToken();
					_position_NAME=_position;
					parse_NAME();
					if(_state==SUCCESS) {
						_token_NAME.add(_position_NAME,_token);
					}
					_token=_token_NAME;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"connection_declaration(connection_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_connection_declaration;
					}
					else {
						if(_position+2-1 >=_inputLength) {
							_state=FAILED;
						}
						else {
							if(_inputArray[_position+0]!='t') {
								_state=FAILED;
							}
							if(_inputArray[_position+1]!='o') {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,Tokens.Syntax.syntax_63.SYNTAX);
							_position=_position+2;
							while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
								++_position;
							}
						}
						else if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain to");
								_furthestPosition=_position;
							}
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"connection_declaration(connection_declaration)");
								_furthestPosition=_position;
							}
							_position=_position_connection_declaration;
						}
						else {
							_token_NAME=_token;
							_token=new Tokens.Name.EndNodeNameToken();
							_position_NAME=_position;
							parse_NAME();
							if(_state==SUCCESS) {
								_token_NAME.add(_position_NAME,_token);
							}
							_token=_token_NAME;
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"connection_declaration(connection_declaration)");
									_furthestPosition=_position;
								}
								_position=_position_connection_declaration;
							}
							else {
							}
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_connection_declaration.add(_position_connection_declaration,_token);
		}
		_token=_token_connection_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_connection_declaration);
			association_names.reject(_position_connection_declaration);
			room_names.reject(_position_connection_declaration);
			activity_names.reject(_position_connection_declaration);
			siding_names.reject(_position_connection_declaration);
			item_names.reject(_position_connection_declaration);
			aspect_names.reject(_position_connection_declaration);
			affinity_names.reject(_position_connection_declaration);
			activity_type_names.reject(_position_connection_declaration);
			trail_names.reject(_position_connection_declaration);
			attack_names.reject(_position_connection_declaration);
			reason_names.reject(_position_connection_declaration);
			trait_names.reject(_position_connection_declaration);
			condition_names.reject(_position_connection_declaration);
			payment_short_type_names.reject(_position_connection_declaration);
			skill_names.reject(_position_connection_declaration);
			map_names.reject(_position_connection_declaration);
			event_names.reject(_position_connection_declaration);
			image_names.reject(_position_connection_declaration);
			tile_symbols.reject(_position_connection_declaration);
			payment_long_type_names.reject(_position_connection_declaration);
			area_names.reject(_position_connection_declaration);
			structure_names.reject(_position_connection_declaration);
			tile_names.reject(_position_connection_declaration);
			hero_stat.reject(_position_connection_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_connection_declaration);
			association_names.accept(_position_connection_declaration);
			room_names.accept(_position_connection_declaration);
			activity_names.accept(_position_connection_declaration);
			siding_names.accept(_position_connection_declaration);
			item_names.accept(_position_connection_declaration);
			aspect_names.accept(_position_connection_declaration);
			affinity_names.accept(_position_connection_declaration);
			activity_type_names.accept(_position_connection_declaration);
			trail_names.accept(_position_connection_declaration);
			attack_names.accept(_position_connection_declaration);
			reason_names.accept(_position_connection_declaration);
			trait_names.accept(_position_connection_declaration);
			condition_names.accept(_position_connection_declaration);
			payment_short_type_names.accept(_position_connection_declaration);
			skill_names.accept(_position_connection_declaration);
			map_names.accept(_position_connection_declaration);
			event_names.accept(_position_connection_declaration);
			image_names.accept(_position_connection_declaration);
			tile_symbols.accept(_position_connection_declaration);
			payment_long_type_names.accept(_position_connection_declaration);
			area_names.accept(_position_connection_declaration);
			structure_names.accept(_position_connection_declaration);
			tile_names.accept(_position_connection_declaration);
			hero_stat.accept(_position_connection_declaration);
		}
	}
}