package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.isa_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class trails_context extends isa_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public trails_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public trails_context() {
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
	public void parse_trails_declaration() {
		int _position_trails_declaration = -1;
		Token.Parsed _token_trails_declaration = null;
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
		_position_trails_declaration=_position;
		_token_trails_declaration=_token;
		_token=new Tokens.Rule.TrailsDeclarationToken();
		if(_position+6-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='T') {
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
			if(_inputArray[_position+4]!='l') {
				_state=FAILED;
			}
			if(_inputArray[_position+5]!='s') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_60.SYNTAX);
			_position=_position+6;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain Trails");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"trails_declaration(trails_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_trails_declaration;
		}
		else {
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!=':') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_59.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain :");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"trails_declaration(trails_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_trails_declaration;
			}
			else {
				int _state_91 = _state;
				while(_position<_inputLength) {
					parse__anonymous_73();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_91==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"trails_declaration(trails_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_trails_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_trails_declaration.add(_position_trails_declaration,_token);
		}
		_token=_token_trails_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_trails_declaration);
			association_names.reject(_position_trails_declaration);
			room_names.reject(_position_trails_declaration);
			activity_names.reject(_position_trails_declaration);
			siding_names.reject(_position_trails_declaration);
			item_names.reject(_position_trails_declaration);
			aspect_names.reject(_position_trails_declaration);
			affinity_names.reject(_position_trails_declaration);
			activity_type_names.reject(_position_trails_declaration);
			trail_names.reject(_position_trails_declaration);
			attack_names.reject(_position_trails_declaration);
			reason_names.reject(_position_trails_declaration);
			trait_names.reject(_position_trails_declaration);
			condition_names.reject(_position_trails_declaration);
			payment_short_type_names.reject(_position_trails_declaration);
			skill_names.reject(_position_trails_declaration);
			map_names.reject(_position_trails_declaration);
			event_names.reject(_position_trails_declaration);
			image_names.reject(_position_trails_declaration);
			tile_symbols.reject(_position_trails_declaration);
			payment_long_type_names.reject(_position_trails_declaration);
			area_names.reject(_position_trails_declaration);
			structure_names.reject(_position_trails_declaration);
			tile_names.reject(_position_trails_declaration);
			hero_stat.reject(_position_trails_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_trails_declaration);
			association_names.accept(_position_trails_declaration);
			room_names.accept(_position_trails_declaration);
			activity_names.accept(_position_trails_declaration);
			siding_names.accept(_position_trails_declaration);
			item_names.accept(_position_trails_declaration);
			aspect_names.accept(_position_trails_declaration);
			affinity_names.accept(_position_trails_declaration);
			activity_type_names.accept(_position_trails_declaration);
			trail_names.accept(_position_trails_declaration);
			attack_names.accept(_position_trails_declaration);
			reason_names.accept(_position_trails_declaration);
			trait_names.accept(_position_trails_declaration);
			condition_names.accept(_position_trails_declaration);
			payment_short_type_names.accept(_position_trails_declaration);
			skill_names.accept(_position_trails_declaration);
			map_names.accept(_position_trails_declaration);
			event_names.accept(_position_trails_declaration);
			image_names.accept(_position_trails_declaration);
			tile_symbols.accept(_position_trails_declaration);
			payment_long_type_names.accept(_position_trails_declaration);
			area_names.accept(_position_trails_declaration);
			structure_names.accept(_position_trails_declaration);
			tile_names.accept(_position_trails_declaration);
			hero_stat.accept(_position_trails_declaration);
		}
	}
}