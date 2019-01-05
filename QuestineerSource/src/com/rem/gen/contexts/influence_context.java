package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.payment_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class influence_context extends payment_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public influence_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public influence_context() {
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
	public void parse_influence() {
		int _position_influence = -1;
		Token.Parsed _token_influence = null;
		int _position_INTEGER = -1;
		Token.Parsed _token_INTEGER = null;
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
		_position_influence=_position;
		_token_influence=_token;
		_token=new Tokens.Rule.InfluenceToken();
		if(_position+9-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='i') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='n') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='f') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='l') {
				_state=FAILED;
			}
			if(_inputArray[_position+4]!='u') {
				_state=FAILED;
			}
			if(_inputArray[_position+5]!='e') {
				_state=FAILED;
			}
			if(_inputArray[_position+6]!='n') {
				_state=FAILED;
			}
			if(_inputArray[_position+7]!='c') {
				_state=FAILED;
			}
			if(_inputArray[_position+8]!='e') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_111.SYNTAX);
			_position=_position+9;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain influence");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"influence(influence)");
				_furthestPosition=_position;
			}
			_position=_position_influence;
		}
		else {
			parse_variable_call();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"influence(influence)");
					_furthestPosition=_position;
				}
				_position=_position_influence;
			}
			else {
				_token_INTEGER=_token;
				_token=new Tokens.Name.AmountToken();
				_position_INTEGER=_position;
				parse_INTEGER();
				if(_state==SUCCESS) {
					_token_INTEGER.add(_position_INTEGER,_token);
				}
				_token=_token_INTEGER;
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"influence(influence)");
						_furthestPosition=_position;
					}
					_position=_position_influence;
				}
				else {
					int _state_173 = _state;
					parse__anonymous_151();
					if(_state_173==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"influence(influence)");
							_furthestPosition=_position;
						}
						_position=_position_influence;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_influence.add(_position_influence,_token);
		}
		_token=_token_influence;
		if(_state==FAILED) {
			support_names.reject(_position_influence);
			association_names.reject(_position_influence);
			room_names.reject(_position_influence);
			activity_names.reject(_position_influence);
			siding_names.reject(_position_influence);
			item_names.reject(_position_influence);
			aspect_names.reject(_position_influence);
			affinity_names.reject(_position_influence);
			activity_type_names.reject(_position_influence);
			trail_names.reject(_position_influence);
			attack_names.reject(_position_influence);
			reason_names.reject(_position_influence);
			trait_names.reject(_position_influence);
			condition_names.reject(_position_influence);
			payment_short_type_names.reject(_position_influence);
			skill_names.reject(_position_influence);
			map_names.reject(_position_influence);
			event_names.reject(_position_influence);
			image_names.reject(_position_influence);
			tile_symbols.reject(_position_influence);
			payment_long_type_names.reject(_position_influence);
			area_names.reject(_position_influence);
			structure_names.reject(_position_influence);
			tile_names.reject(_position_influence);
			hero_stat.reject(_position_influence);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_influence);
			association_names.accept(_position_influence);
			room_names.accept(_position_influence);
			activity_names.accept(_position_influence);
			siding_names.accept(_position_influence);
			item_names.accept(_position_influence);
			aspect_names.accept(_position_influence);
			affinity_names.accept(_position_influence);
			activity_type_names.accept(_position_influence);
			trail_names.accept(_position_influence);
			attack_names.accept(_position_influence);
			reason_names.accept(_position_influence);
			trait_names.accept(_position_influence);
			condition_names.accept(_position_influence);
			payment_short_type_names.accept(_position_influence);
			skill_names.accept(_position_influence);
			map_names.accept(_position_influence);
			event_names.accept(_position_influence);
			image_names.accept(_position_influence);
			tile_symbols.accept(_position_influence);
			payment_long_type_names.accept(_position_influence);
			area_names.accept(_position_influence);
			structure_names.accept(_position_influence);
			tile_names.accept(_position_influence);
			hero_stat.accept(_position_influence);
		}
	}
}