package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.std_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class spawned_context extends std_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public spawned_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public spawned_context() {
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
	public void parse_spawned_statement() {
		int _position_spawned_statement = -1;
		Token.Parsed _token_spawned_statement = null;
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
		_position_spawned_statement=_position;
		_token_spawned_statement=_token;
		_token=new Tokens.Rule.SpawnedStatementToken();
		if(_position+7-1 >=_inputLength) {
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
			if(_inputArray[_position+5]!='e') {
				_state=FAILED;
			}
			if(_inputArray[_position+6]!='d') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_124.SYNTAX);
			_position=_position+7;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain spawned");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"spawned_statement(spawned_statement)");
				_furthestPosition=_position;
			}
			_position=_position_spawned_statement;
		}
		else {
			if(_position+2-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='i') {
					_state=FAILED;
				}
				if(_inputArray[_position+1]!='n') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_71.SYNTAX);
				_position=_position+2;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain in");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"spawned_statement(spawned_statement)");
					_furthestPosition=_position;
				}
				_position=_position_spawned_statement;
			}
			else {
				_token_NAME=_token;
				_token=new Tokens.Name.EnvironmentNameToken();
				_position_NAME=_position;
				parse_NAME();
				if(_state==SUCCESS) {
					_token_NAME.add(_position_NAME,_token);
				}
				_token=_token_NAME;
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"spawned_statement(spawned_statement)");
						_furthestPosition=_position;
					}
					_position=_position_spawned_statement;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_spawned_statement.add(_position_spawned_statement,_token);
		}
		_token=_token_spawned_statement;
		if(_state==FAILED) {
			support_names.reject(_position_spawned_statement);
			association_names.reject(_position_spawned_statement);
			room_names.reject(_position_spawned_statement);
			activity_names.reject(_position_spawned_statement);
			siding_names.reject(_position_spawned_statement);
			item_names.reject(_position_spawned_statement);
			aspect_names.reject(_position_spawned_statement);
			affinity_names.reject(_position_spawned_statement);
			activity_type_names.reject(_position_spawned_statement);
			trail_names.reject(_position_spawned_statement);
			attack_names.reject(_position_spawned_statement);
			reason_names.reject(_position_spawned_statement);
			trait_names.reject(_position_spawned_statement);
			condition_names.reject(_position_spawned_statement);
			payment_short_type_names.reject(_position_spawned_statement);
			skill_names.reject(_position_spawned_statement);
			map_names.reject(_position_spawned_statement);
			event_names.reject(_position_spawned_statement);
			image_names.reject(_position_spawned_statement);
			tile_symbols.reject(_position_spawned_statement);
			payment_long_type_names.reject(_position_spawned_statement);
			area_names.reject(_position_spawned_statement);
			structure_names.reject(_position_spawned_statement);
			tile_names.reject(_position_spawned_statement);
			hero_stat.reject(_position_spawned_statement);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_spawned_statement);
			association_names.accept(_position_spawned_statement);
			room_names.accept(_position_spawned_statement);
			activity_names.accept(_position_spawned_statement);
			siding_names.accept(_position_spawned_statement);
			item_names.accept(_position_spawned_statement);
			aspect_names.accept(_position_spawned_statement);
			affinity_names.accept(_position_spawned_statement);
			activity_type_names.accept(_position_spawned_statement);
			trail_names.accept(_position_spawned_statement);
			attack_names.accept(_position_spawned_statement);
			reason_names.accept(_position_spawned_statement);
			trait_names.accept(_position_spawned_statement);
			condition_names.accept(_position_spawned_statement);
			payment_short_type_names.accept(_position_spawned_statement);
			skill_names.accept(_position_spawned_statement);
			map_names.accept(_position_spawned_statement);
			event_names.accept(_position_spawned_statement);
			image_names.accept(_position_spawned_statement);
			tile_symbols.accept(_position_spawned_statement);
			payment_long_type_names.accept(_position_spawned_statement);
			area_names.accept(_position_spawned_statement);
			structure_names.accept(_position_spawned_statement);
			tile_names.accept(_position_spawned_statement);
			hero_stat.accept(_position_spawned_statement);
		}
	}
}