package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.statement_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class title_context extends statement_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public title_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public title_context() {
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
	public void parse_TITLE() {
		int _position_TITLE = -1;
		Token.Parsed _token_TITLE = null;
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
		_position_TITLE=_position;
		_token_TITLE=_token;
		_token=new Tokens.Rule.TITLEToken();
		int _position_regex_5 = _position;
		int _multiple_index_9 = 0;
		while(_position<_inputLength) {
			if(_inputArray[_position]!='\n') {
				++_position;
				++_multiple_index_9;
			}
			else {
				break;
			}
		}
		if(_multiple_index_9==0 ) {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token.setValue(_input.substring(_position_regex_5,_position));
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"[\\n]+");
				_furthestPosition=_position;
			}
			_position=_position_regex_5;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"TITLE(TITLE)");
				_furthestPosition=_position;
			}
			_position=_position_TITLE;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_TITLE.add(_position_TITLE,_token);
		}
		_token=_token_TITLE;
		if(_state==FAILED) {
			support_names.reject(_position_TITLE);
			association_names.reject(_position_TITLE);
			room_names.reject(_position_TITLE);
			activity_names.reject(_position_TITLE);
			siding_names.reject(_position_TITLE);
			item_names.reject(_position_TITLE);
			aspect_names.reject(_position_TITLE);
			affinity_names.reject(_position_TITLE);
			activity_type_names.reject(_position_TITLE);
			trail_names.reject(_position_TITLE);
			attack_names.reject(_position_TITLE);
			reason_names.reject(_position_TITLE);
			trait_names.reject(_position_TITLE);
			condition_names.reject(_position_TITLE);
			payment_short_type_names.reject(_position_TITLE);
			skill_names.reject(_position_TITLE);
			map_names.reject(_position_TITLE);
			event_names.reject(_position_TITLE);
			image_names.reject(_position_TITLE);
			tile_symbols.reject(_position_TITLE);
			payment_long_type_names.reject(_position_TITLE);
			area_names.reject(_position_TITLE);
			structure_names.reject(_position_TITLE);
			tile_names.reject(_position_TITLE);
			hero_stat.reject(_position_TITLE);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_TITLE);
			association_names.accept(_position_TITLE);
			room_names.accept(_position_TITLE);
			activity_names.accept(_position_TITLE);
			siding_names.accept(_position_TITLE);
			item_names.accept(_position_TITLE);
			aspect_names.accept(_position_TITLE);
			affinity_names.accept(_position_TITLE);
			activity_type_names.accept(_position_TITLE);
			trail_names.accept(_position_TITLE);
			attack_names.accept(_position_TITLE);
			reason_names.accept(_position_TITLE);
			trait_names.accept(_position_TITLE);
			condition_names.accept(_position_TITLE);
			payment_short_type_names.accept(_position_TITLE);
			skill_names.accept(_position_TITLE);
			map_names.accept(_position_TITLE);
			event_names.accept(_position_TITLE);
			image_names.accept(_position_TITLE);
			tile_symbols.accept(_position_TITLE);
			payment_long_type_names.accept(_position_TITLE);
			area_names.accept(_position_TITLE);
			structure_names.accept(_position_TITLE);
			tile_names.accept(_position_TITLE);
			hero_stat.accept(_position_TITLE);
		}
	}
}