package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.integer_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class spawn_context extends integer_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public spawn_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public spawn_context() {
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
	public void parse_spawn_statement() {
		int _position_spawn_statement = -1;
		Token.Parsed _token_spawn_statement = null;
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
		_position_spawn_statement=_position;
		_token_spawn_statement=_token;
		_token=new Tokens.Rule.SpawnStatementToken();
		parse_variable_call();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"spawn_statement(spawn_statement)");
				_furthestPosition=_position;
			}
			_position=_position_spawn_statement;
		}
		else {
			if(_position+5-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='s') {
					_state=FAILED;
				}
				if(_inputArray[_position+1]!='p') {
					_state=FAILED;
				}
				if(_inputArray[_position+2]!='a') {
					_state=FAILED;
				}
				if(_inputArray[_position+3]!='w') {
					_state=FAILED;
				}
				if(_inputArray[_position+4]!='n') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_114.SYNTAX);
				_position=_position+5;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain spawn");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"spawn_statement(spawn_statement)");
					_furthestPosition=_position;
				}
				_position=_position_spawn_statement;
			}
			else {
				parse__anonymous_157();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"spawn_statement(spawn_statement)");
						_furthestPosition=_position;
					}
					_position=_position_spawn_statement;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_spawn_statement.add(_position_spawn_statement,_token);
		}
		_token=_token_spawn_statement;
		if(_state==FAILED) {
			support_names.reject(_position_spawn_statement);
			association_names.reject(_position_spawn_statement);
			room_names.reject(_position_spawn_statement);
			activity_names.reject(_position_spawn_statement);
			siding_names.reject(_position_spawn_statement);
			item_names.reject(_position_spawn_statement);
			aspect_names.reject(_position_spawn_statement);
			affinity_names.reject(_position_spawn_statement);
			activity_type_names.reject(_position_spawn_statement);
			trail_names.reject(_position_spawn_statement);
			attack_names.reject(_position_spawn_statement);
			reason_names.reject(_position_spawn_statement);
			trait_names.reject(_position_spawn_statement);
			condition_names.reject(_position_spawn_statement);
			payment_short_type_names.reject(_position_spawn_statement);
			skill_names.reject(_position_spawn_statement);
			map_names.reject(_position_spawn_statement);
			event_names.reject(_position_spawn_statement);
			image_names.reject(_position_spawn_statement);
			tile_symbols.reject(_position_spawn_statement);
			payment_long_type_names.reject(_position_spawn_statement);
			area_names.reject(_position_spawn_statement);
			structure_names.reject(_position_spawn_statement);
			tile_names.reject(_position_spawn_statement);
			hero_stat.reject(_position_spawn_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_spawn_statement);
			association_names.accept(_position_spawn_statement);
			room_names.accept(_position_spawn_statement);
			activity_names.accept(_position_spawn_statement);
			siding_names.accept(_position_spawn_statement);
			item_names.accept(_position_spawn_statement);
			aspect_names.accept(_position_spawn_statement);
			affinity_names.accept(_position_spawn_statement);
			activity_type_names.accept(_position_spawn_statement);
			trail_names.accept(_position_spawn_statement);
			attack_names.accept(_position_spawn_statement);
			reason_names.accept(_position_spawn_statement);
			trait_names.accept(_position_spawn_statement);
			condition_names.accept(_position_spawn_statement);
			payment_short_type_names.accept(_position_spawn_statement);
			skill_names.accept(_position_spawn_statement);
			map_names.accept(_position_spawn_statement);
			event_names.accept(_position_spawn_statement);
			image_names.accept(_position_spawn_statement);
			tile_symbols.accept(_position_spawn_statement);
			payment_long_type_names.accept(_position_spawn_statement);
			area_names.accept(_position_spawn_statement);
			structure_names.accept(_position_spawn_statement);
			tile_names.accept(_position_spawn_statement);
			hero_stat.accept(_position_spawn_statement);
		}
	}
}