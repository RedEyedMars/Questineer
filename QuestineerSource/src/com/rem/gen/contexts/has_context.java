package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.area_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class has_context extends area_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public has_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public has_context() {
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
	public void parse_has_chance() {
		int _position_has_chance = -1;
		Token.Parsed _token_has_chance = null;
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
		_position_has_chance=_position;
		_token_has_chance=_token;
		_token=new Tokens.Rule.HasChanceToken();
		parse_number();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_chance(has_chance)");
				_furthestPosition=_position;
			}
			_position=_position_has_chance;
		}
		else {
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='%') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_56.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain %");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_chance(has_chance)");
					_furthestPosition=_position;
				}
				_position=_position_has_chance;
			}
			else {
				if(_position+6-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='c') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='h') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='n') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='c') {
						_state=FAILED;
					}
					if(_inputArray[_position+5]!='e') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_121.SYNTAX);
					_position=_position+6;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain chance");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_chance(has_chance)");
						_furthestPosition=_position;
					}
					_position=_position_has_chance;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_has_chance.add(_position_has_chance,_token);
		}
		_token=_token_has_chance;
		if(_state==FAILED) {
			support_names.reject(_position_has_chance);
			association_names.reject(_position_has_chance);
			room_names.reject(_position_has_chance);
			activity_names.reject(_position_has_chance);
			siding_names.reject(_position_has_chance);
			item_names.reject(_position_has_chance);
			aspect_names.reject(_position_has_chance);
			affinity_names.reject(_position_has_chance);
			activity_type_names.reject(_position_has_chance);
			trail_names.reject(_position_has_chance);
			attack_names.reject(_position_has_chance);
			reason_names.reject(_position_has_chance);
			trait_names.reject(_position_has_chance);
			condition_names.reject(_position_has_chance);
			payment_short_type_names.reject(_position_has_chance);
			skill_names.reject(_position_has_chance);
			map_names.reject(_position_has_chance);
			event_names.reject(_position_has_chance);
			image_names.reject(_position_has_chance);
			tile_symbols.reject(_position_has_chance);
			payment_long_type_names.reject(_position_has_chance);
			area_names.reject(_position_has_chance);
			structure_names.reject(_position_has_chance);
			tile_names.reject(_position_has_chance);
			hero_stat.reject(_position_has_chance);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_has_chance);
			association_names.accept(_position_has_chance);
			room_names.accept(_position_has_chance);
			activity_names.accept(_position_has_chance);
			siding_names.accept(_position_has_chance);
			item_names.accept(_position_has_chance);
			aspect_names.accept(_position_has_chance);
			affinity_names.accept(_position_has_chance);
			activity_type_names.accept(_position_has_chance);
			trail_names.accept(_position_has_chance);
			attack_names.accept(_position_has_chance);
			reason_names.accept(_position_has_chance);
			trait_names.accept(_position_has_chance);
			condition_names.accept(_position_has_chance);
			payment_short_type_names.accept(_position_has_chance);
			skill_names.accept(_position_has_chance);
			map_names.accept(_position_has_chance);
			event_names.accept(_position_has_chance);
			image_names.accept(_position_has_chance);
			tile_symbols.accept(_position_has_chance);
			payment_long_type_names.accept(_position_has_chance);
			area_names.accept(_position_has_chance);
			structure_names.accept(_position_has_chance);
			tile_names.accept(_position_has_chance);
			hero_stat.accept(_position_has_chance);
		}
	}
	public void parse_has_statement() {
		int _position_has_statement = -1;
		Token.Parsed _token_has_statement = null;
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
		_position_has_statement=_position;
		_token_has_statement=_token;
		_token=new Tokens.Rule.HasStatementToken();
		int _state_191 = _state;
		parse_NOT();
		if(_state_191==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_statement(has_statement)");
				_furthestPosition=_position;
			}
			_position=_position_has_statement;
		}
		else {
			parse_variable_call();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_statement(has_statement)");
					_furthestPosition=_position;
				}
				_position=_position_has_statement;
			}
			else {
				if(_position+3-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='h') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_125.SYNTAX);
					_position=_position+3;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain has");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_statement(has_statement)");
						_furthestPosition=_position;
					}
					_position=_position_has_statement;
				}
				else {
					parse_requirement();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"has_statement(has_statement)");
							_furthestPosition=_position;
						}
						_position=_position_has_statement;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_has_statement.add(_position_has_statement,_token);
		}
		_token=_token_has_statement;
		if(_state==FAILED) {
			support_names.reject(_position_has_statement);
			association_names.reject(_position_has_statement);
			room_names.reject(_position_has_statement);
			activity_names.reject(_position_has_statement);
			siding_names.reject(_position_has_statement);
			item_names.reject(_position_has_statement);
			aspect_names.reject(_position_has_statement);
			affinity_names.reject(_position_has_statement);
			activity_type_names.reject(_position_has_statement);
			trail_names.reject(_position_has_statement);
			attack_names.reject(_position_has_statement);
			reason_names.reject(_position_has_statement);
			trait_names.reject(_position_has_statement);
			condition_names.reject(_position_has_statement);
			payment_short_type_names.reject(_position_has_statement);
			skill_names.reject(_position_has_statement);
			map_names.reject(_position_has_statement);
			event_names.reject(_position_has_statement);
			image_names.reject(_position_has_statement);
			tile_symbols.reject(_position_has_statement);
			payment_long_type_names.reject(_position_has_statement);
			area_names.reject(_position_has_statement);
			structure_names.reject(_position_has_statement);
			tile_names.reject(_position_has_statement);
			hero_stat.reject(_position_has_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_has_statement);
			association_names.accept(_position_has_statement);
			room_names.accept(_position_has_statement);
			activity_names.accept(_position_has_statement);
			siding_names.accept(_position_has_statement);
			item_names.accept(_position_has_statement);
			aspect_names.accept(_position_has_statement);
			affinity_names.accept(_position_has_statement);
			activity_type_names.accept(_position_has_statement);
			trail_names.accept(_position_has_statement);
			attack_names.accept(_position_has_statement);
			reason_names.accept(_position_has_statement);
			trait_names.accept(_position_has_statement);
			condition_names.accept(_position_has_statement);
			payment_short_type_names.accept(_position_has_statement);
			skill_names.accept(_position_has_statement);
			map_names.accept(_position_has_statement);
			event_names.accept(_position_has_statement);
			image_names.accept(_position_has_statement);
			tile_symbols.accept(_position_has_statement);
			payment_long_type_names.accept(_position_has_statement);
			area_names.accept(_position_has_statement);
			structure_names.accept(_position_has_statement);
			tile_names.accept(_position_has_statement);
			hero_stat.accept(_position_has_statement);
		}
	}
}