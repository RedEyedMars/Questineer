package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.multiple_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class if_context extends multiple_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public if_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public if_context() {
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
	public void parse_if_statement() {
		int _position_if_statement = -1;
		Token.Parsed _token_if_statement = null;
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
		_position_if_statement=_position;
		_token_if_statement=_token;
		_token=new Tokens.Rule.IfStatementToken();
		if(_position+2-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='i') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='f') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_89.SYNTAX);
			_position=_position+2;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain if");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_statement(if_statement)");
				_furthestPosition=_position;
			}
			_position=_position_if_statement;
		}
		else {
			parse_boolean_statement();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_statement(if_statement)");
					_furthestPosition=_position;
				}
				_position=_position_if_statement;
			}
			else {
				int _state_180 = _state;
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
				if(_state_180==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_statement(if_statement)");
						_furthestPosition=_position;
					}
					_position=_position_if_statement;
				}
				else {
					parse_std_body();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_statement(if_statement)");
							_furthestPosition=_position;
						}
						_position=_position_if_statement;
					}
					else {
						int _state_181 = _state;
						while(_position<_inputLength) {
							parse__anonymous_164();
							if(_state==FAILED) {
								break;
							}
						}
						if(_state_181==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_statement(if_statement)");
								_furthestPosition=_position;
							}
							_position=_position_if_statement;
						}
						else {
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_if_statement.add(_position_if_statement,_token);
		}
		_token=_token_if_statement;
		if(_state==FAILED) {
			support_names.reject(_position_if_statement);
			association_names.reject(_position_if_statement);
			room_names.reject(_position_if_statement);
			activity_names.reject(_position_if_statement);
			siding_names.reject(_position_if_statement);
			item_names.reject(_position_if_statement);
			aspect_names.reject(_position_if_statement);
			affinity_names.reject(_position_if_statement);
			activity_type_names.reject(_position_if_statement);
			trail_names.reject(_position_if_statement);
			attack_names.reject(_position_if_statement);
			reason_names.reject(_position_if_statement);
			trait_names.reject(_position_if_statement);
			condition_names.reject(_position_if_statement);
			payment_short_type_names.reject(_position_if_statement);
			skill_names.reject(_position_if_statement);
			map_names.reject(_position_if_statement);
			event_names.reject(_position_if_statement);
			image_names.reject(_position_if_statement);
			tile_symbols.reject(_position_if_statement);
			payment_long_type_names.reject(_position_if_statement);
			area_names.reject(_position_if_statement);
			structure_names.reject(_position_if_statement);
			tile_names.reject(_position_if_statement);
			hero_stat.reject(_position_if_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_if_statement);
			association_names.accept(_position_if_statement);
			room_names.accept(_position_if_statement);
			activity_names.accept(_position_if_statement);
			siding_names.accept(_position_if_statement);
			item_names.accept(_position_if_statement);
			aspect_names.accept(_position_if_statement);
			affinity_names.accept(_position_if_statement);
			activity_type_names.accept(_position_if_statement);
			trail_names.accept(_position_if_statement);
			attack_names.accept(_position_if_statement);
			reason_names.accept(_position_if_statement);
			trait_names.accept(_position_if_statement);
			condition_names.accept(_position_if_statement);
			payment_short_type_names.accept(_position_if_statement);
			skill_names.accept(_position_if_statement);
			map_names.accept(_position_if_statement);
			event_names.accept(_position_if_statement);
			image_names.accept(_position_if_statement);
			tile_symbols.accept(_position_if_statement);
			payment_long_type_names.accept(_position_if_statement);
			area_names.accept(_position_if_statement);
			structure_names.accept(_position_if_statement);
			tile_names.accept(_position_if_statement);
			hero_stat.accept(_position_if_statement);
		}
	}
	public void parse_if_header() {
		int _position_if_header = -1;
		Token.Parsed _token_if_header = null;
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
		_position_if_header=_position;
		_token_if_header=_token;
		_token=new Tokens.Rule.IfHeaderToken();
		parse__anonymous_163();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_header(if_header)");
				_furthestPosition=_position;
			}
			_position=_position_if_header;
		}
		else {
			parse_boolean_statement();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"if_header(if_header)");
					_furthestPosition=_position;
				}
				_position=_position_if_header;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_if_header.addAll(_token);
			_token_if_header.setValue(_token.getValue());
		}
		_token=_token_if_header;
		if(_state==FAILED) {
			support_names.reject(_position_if_header);
			association_names.reject(_position_if_header);
			room_names.reject(_position_if_header);
			activity_names.reject(_position_if_header);
			siding_names.reject(_position_if_header);
			item_names.reject(_position_if_header);
			aspect_names.reject(_position_if_header);
			affinity_names.reject(_position_if_header);
			activity_type_names.reject(_position_if_header);
			trail_names.reject(_position_if_header);
			attack_names.reject(_position_if_header);
			reason_names.reject(_position_if_header);
			trait_names.reject(_position_if_header);
			condition_names.reject(_position_if_header);
			payment_short_type_names.reject(_position_if_header);
			skill_names.reject(_position_if_header);
			map_names.reject(_position_if_header);
			event_names.reject(_position_if_header);
			image_names.reject(_position_if_header);
			tile_symbols.reject(_position_if_header);
			payment_long_type_names.reject(_position_if_header);
			area_names.reject(_position_if_header);
			structure_names.reject(_position_if_header);
			tile_names.reject(_position_if_header);
			hero_stat.reject(_position_if_header);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_if_header);
			association_names.accept(_position_if_header);
			room_names.accept(_position_if_header);
			activity_names.accept(_position_if_header);
			siding_names.accept(_position_if_header);
			item_names.accept(_position_if_header);
			aspect_names.accept(_position_if_header);
			affinity_names.accept(_position_if_header);
			activity_type_names.accept(_position_if_header);
			trail_names.accept(_position_if_header);
			attack_names.accept(_position_if_header);
			reason_names.accept(_position_if_header);
			trait_names.accept(_position_if_header);
			condition_names.accept(_position_if_header);
			payment_short_type_names.accept(_position_if_header);
			skill_names.accept(_position_if_header);
			map_names.accept(_position_if_header);
			event_names.accept(_position_if_header);
			image_names.accept(_position_if_header);
			tile_symbols.accept(_position_if_header);
			payment_long_type_names.accept(_position_if_header);
			area_names.accept(_position_if_header);
			structure_names.accept(_position_if_header);
			tile_names.accept(_position_if_header);
			hero_stat.accept(_position_if_header);
		}
	}
}