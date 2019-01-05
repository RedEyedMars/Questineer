package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.animation_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class patch_context extends animation_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public patch_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public patch_context() {
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
	public void parse_patch_options() {
		int _position_patch_options = -1;
		Token.Parsed _token_patch_options = null;
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
		_position_patch_options=_position;
		_token_patch_options=_token;
		_token=new Tokens.Rule.PatchOptionsToken();
		parse_patch_element();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_options(patch_options)");
				_furthestPosition=_position;
			}
			_position=_position_patch_options;
		}
		else {
			int _state_102 = _state;
			while(_position<_inputLength) {
				parse__anonymous_85();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_102==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_options(patch_options)");
					_furthestPosition=_position;
				}
				_position=_position_patch_options;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_patch_options.add(_position_patch_options,_token);
		}
		_token=_token_patch_options;
		if(_state==FAILED) {
			support_names.reject(_position_patch_options);
			association_names.reject(_position_patch_options);
			room_names.reject(_position_patch_options);
			activity_names.reject(_position_patch_options);
			siding_names.reject(_position_patch_options);
			item_names.reject(_position_patch_options);
			aspect_names.reject(_position_patch_options);
			affinity_names.reject(_position_patch_options);
			activity_type_names.reject(_position_patch_options);
			trail_names.reject(_position_patch_options);
			attack_names.reject(_position_patch_options);
			reason_names.reject(_position_patch_options);
			trait_names.reject(_position_patch_options);
			condition_names.reject(_position_patch_options);
			payment_short_type_names.reject(_position_patch_options);
			skill_names.reject(_position_patch_options);
			map_names.reject(_position_patch_options);
			event_names.reject(_position_patch_options);
			image_names.reject(_position_patch_options);
			tile_symbols.reject(_position_patch_options);
			payment_long_type_names.reject(_position_patch_options);
			area_names.reject(_position_patch_options);
			structure_names.reject(_position_patch_options);
			tile_names.reject(_position_patch_options);
			hero_stat.reject(_position_patch_options);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_patch_options);
			association_names.accept(_position_patch_options);
			room_names.accept(_position_patch_options);
			activity_names.accept(_position_patch_options);
			siding_names.accept(_position_patch_options);
			item_names.accept(_position_patch_options);
			aspect_names.accept(_position_patch_options);
			affinity_names.accept(_position_patch_options);
			activity_type_names.accept(_position_patch_options);
			trail_names.accept(_position_patch_options);
			attack_names.accept(_position_patch_options);
			reason_names.accept(_position_patch_options);
			trait_names.accept(_position_patch_options);
			condition_names.accept(_position_patch_options);
			payment_short_type_names.accept(_position_patch_options);
			skill_names.accept(_position_patch_options);
			map_names.accept(_position_patch_options);
			event_names.accept(_position_patch_options);
			image_names.accept(_position_patch_options);
			tile_symbols.accept(_position_patch_options);
			payment_long_type_names.accept(_position_patch_options);
			area_names.accept(_position_patch_options);
			structure_names.accept(_position_patch_options);
			tile_names.accept(_position_patch_options);
			hero_stat.accept(_position_patch_options);
		}
	}
	public void parse_patch_rimcals() {
		int _position_patch_rimcals = -1;
		Token.Parsed _token_patch_rimcals = null;
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
		_position_patch_rimcals=_position;
		_token_patch_rimcals=_token;
		_token=new Tokens.Rule.PatchRimcalsToken();
		parse__anonymous_93();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_rimcals(patch_rimcals)");
				_furthestPosition=_position;
			}
			_position=_position_patch_rimcals;
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_rimcals(patch_rimcals)");
					_furthestPosition=_position;
				}
				_position=_position_patch_rimcals;
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
					if(_list_name_result!=null&&siding_names.contains(_list_name_result)) {
						if(_position+_list_name_result.length()<_inputLength) {
							int _next_char = _inputArray[_position+_list_name_result.length()];
							if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,new Tokens.Name.SidingNamesToken(_list_name_result));
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"siding_names");
							_furthestPosition=_position;
						}
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_rimcals(patch_rimcals)");
						_furthestPosition=_position;
					}
					_position=_position_patch_rimcals;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_patch_rimcals.add(_position_patch_rimcals,_token);
		}
		_token=_token_patch_rimcals;
		if(_state==FAILED) {
			support_names.reject(_position_patch_rimcals);
			association_names.reject(_position_patch_rimcals);
			room_names.reject(_position_patch_rimcals);
			activity_names.reject(_position_patch_rimcals);
			siding_names.reject(_position_patch_rimcals);
			item_names.reject(_position_patch_rimcals);
			aspect_names.reject(_position_patch_rimcals);
			affinity_names.reject(_position_patch_rimcals);
			activity_type_names.reject(_position_patch_rimcals);
			trail_names.reject(_position_patch_rimcals);
			attack_names.reject(_position_patch_rimcals);
			reason_names.reject(_position_patch_rimcals);
			trait_names.reject(_position_patch_rimcals);
			condition_names.reject(_position_patch_rimcals);
			payment_short_type_names.reject(_position_patch_rimcals);
			skill_names.reject(_position_patch_rimcals);
			map_names.reject(_position_patch_rimcals);
			event_names.reject(_position_patch_rimcals);
			image_names.reject(_position_patch_rimcals);
			tile_symbols.reject(_position_patch_rimcals);
			payment_long_type_names.reject(_position_patch_rimcals);
			area_names.reject(_position_patch_rimcals);
			structure_names.reject(_position_patch_rimcals);
			tile_names.reject(_position_patch_rimcals);
			hero_stat.reject(_position_patch_rimcals);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_patch_rimcals);
			association_names.accept(_position_patch_rimcals);
			room_names.accept(_position_patch_rimcals);
			activity_names.accept(_position_patch_rimcals);
			siding_names.accept(_position_patch_rimcals);
			item_names.accept(_position_patch_rimcals);
			aspect_names.accept(_position_patch_rimcals);
			affinity_names.accept(_position_patch_rimcals);
			activity_type_names.accept(_position_patch_rimcals);
			trail_names.accept(_position_patch_rimcals);
			attack_names.accept(_position_patch_rimcals);
			reason_names.accept(_position_patch_rimcals);
			trait_names.accept(_position_patch_rimcals);
			condition_names.accept(_position_patch_rimcals);
			payment_short_type_names.accept(_position_patch_rimcals);
			skill_names.accept(_position_patch_rimcals);
			map_names.accept(_position_patch_rimcals);
			event_names.accept(_position_patch_rimcals);
			image_names.accept(_position_patch_rimcals);
			tile_symbols.accept(_position_patch_rimcals);
			payment_long_type_names.accept(_position_patch_rimcals);
			area_names.accept(_position_patch_rimcals);
			structure_names.accept(_position_patch_rimcals);
			tile_names.accept(_position_patch_rimcals);
			hero_stat.accept(_position_patch_rimcals);
		}
	}
	public void parse_patch_probability() {
		int _position_patch_probability = -1;
		Token.Parsed _token_patch_probability = null;
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
		_position_patch_probability=_position;
		_token_patch_probability=_token;
		_token=new Tokens.Rule.PatchProbabilityToken();
		_token_INTEGER=_token;
		_token=new Tokens.Name.ProbabilityToken();
		_position_INTEGER=_position;
		parse_INTEGER();
		if(_state==SUCCESS) {
			_token_INTEGER.add(_position_INTEGER,_token);
		}
		_token=_token_INTEGER;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_probability(patch_probability)");
				_furthestPosition=_position;
			}
			_position=_position_patch_probability;
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_probability(patch_probability)");
					_furthestPosition=_position;
				}
				_position=_position_patch_probability;
			}
			else {
				int _state_107 = _state;
				while(_position<_inputLength) {
					parse__anonymous_87();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_107==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_probability(patch_probability)");
						_furthestPosition=_position;
					}
					_position=_position_patch_probability;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_patch_probability.add(_position_patch_probability,_token);
		}
		_token=_token_patch_probability;
		if(_state==FAILED) {
			support_names.reject(_position_patch_probability);
			association_names.reject(_position_patch_probability);
			room_names.reject(_position_patch_probability);
			activity_names.reject(_position_patch_probability);
			siding_names.reject(_position_patch_probability);
			item_names.reject(_position_patch_probability);
			aspect_names.reject(_position_patch_probability);
			affinity_names.reject(_position_patch_probability);
			activity_type_names.reject(_position_patch_probability);
			trail_names.reject(_position_patch_probability);
			attack_names.reject(_position_patch_probability);
			reason_names.reject(_position_patch_probability);
			trait_names.reject(_position_patch_probability);
			condition_names.reject(_position_patch_probability);
			payment_short_type_names.reject(_position_patch_probability);
			skill_names.reject(_position_patch_probability);
			map_names.reject(_position_patch_probability);
			event_names.reject(_position_patch_probability);
			image_names.reject(_position_patch_probability);
			tile_symbols.reject(_position_patch_probability);
			payment_long_type_names.reject(_position_patch_probability);
			area_names.reject(_position_patch_probability);
			structure_names.reject(_position_patch_probability);
			tile_names.reject(_position_patch_probability);
			hero_stat.reject(_position_patch_probability);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_patch_probability);
			association_names.accept(_position_patch_probability);
			room_names.accept(_position_patch_probability);
			activity_names.accept(_position_patch_probability);
			siding_names.accept(_position_patch_probability);
			item_names.accept(_position_patch_probability);
			aspect_names.accept(_position_patch_probability);
			affinity_names.accept(_position_patch_probability);
			activity_type_names.accept(_position_patch_probability);
			trail_names.accept(_position_patch_probability);
			attack_names.accept(_position_patch_probability);
			reason_names.accept(_position_patch_probability);
			trait_names.accept(_position_patch_probability);
			condition_names.accept(_position_patch_probability);
			payment_short_type_names.accept(_position_patch_probability);
			skill_names.accept(_position_patch_probability);
			map_names.accept(_position_patch_probability);
			event_names.accept(_position_patch_probability);
			image_names.accept(_position_patch_probability);
			tile_symbols.accept(_position_patch_probability);
			payment_long_type_names.accept(_position_patch_probability);
			area_names.accept(_position_patch_probability);
			structure_names.accept(_position_patch_probability);
			tile_names.accept(_position_patch_probability);
			hero_stat.accept(_position_patch_probability);
		}
	}
	public void parse_patch_position() {
		int _position_patch_position = -1;
		Token.Parsed _token_patch_position = null;
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
		_position_patch_position=_position;
		_token_patch_position=_token;
		_token=new Tokens.Rule.PatchPositionToken();
		if(_position+7-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='O') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='f') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='f') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='S') {
				_state=FAILED;
			}
			if(_inputArray[_position+4]!='i') {
				_state=FAILED;
			}
			if(_inputArray[_position+5]!='d') {
				_state=FAILED;
			}
			if(_inputArray[_position+6]!='e') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_72.offside);
			_position=_position+7;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain OffSide");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_position(patch_position)");
				_furthestPosition=_position;
			}
			_position=_position_patch_position;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_patch_position.add(_position_patch_position,_token);
		}
		_token=_token_patch_position;
		if(_state==FAILED) {
			support_names.reject(_position_patch_position);
			association_names.reject(_position_patch_position);
			room_names.reject(_position_patch_position);
			activity_names.reject(_position_patch_position);
			siding_names.reject(_position_patch_position);
			item_names.reject(_position_patch_position);
			aspect_names.reject(_position_patch_position);
			affinity_names.reject(_position_patch_position);
			activity_type_names.reject(_position_patch_position);
			trail_names.reject(_position_patch_position);
			attack_names.reject(_position_patch_position);
			reason_names.reject(_position_patch_position);
			trait_names.reject(_position_patch_position);
			condition_names.reject(_position_patch_position);
			payment_short_type_names.reject(_position_patch_position);
			skill_names.reject(_position_patch_position);
			map_names.reject(_position_patch_position);
			event_names.reject(_position_patch_position);
			image_names.reject(_position_patch_position);
			tile_symbols.reject(_position_patch_position);
			payment_long_type_names.reject(_position_patch_position);
			area_names.reject(_position_patch_position);
			structure_names.reject(_position_patch_position);
			tile_names.reject(_position_patch_position);
			hero_stat.reject(_position_patch_position);
			_state=SUCCESS;
			_position_patch_position=_position;
			_token_patch_position=_token;
			_token=new Tokens.Rule.PatchPositionToken();
			parse_patch_rimcals();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_position(patch_position)");
					_furthestPosition=_position;
				}
				_position=_position_patch_position;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_patch_position.add(_position_patch_position,_token);
			}
			_token=_token_patch_position;
			if(_state==FAILED) {
				support_names.reject(_position_patch_position);
				association_names.reject(_position_patch_position);
				room_names.reject(_position_patch_position);
				activity_names.reject(_position_patch_position);
				siding_names.reject(_position_patch_position);
				item_names.reject(_position_patch_position);
				aspect_names.reject(_position_patch_position);
				affinity_names.reject(_position_patch_position);
				activity_type_names.reject(_position_patch_position);
				trail_names.reject(_position_patch_position);
				attack_names.reject(_position_patch_position);
				reason_names.reject(_position_patch_position);
				trait_names.reject(_position_patch_position);
				condition_names.reject(_position_patch_position);
				payment_short_type_names.reject(_position_patch_position);
				skill_names.reject(_position_patch_position);
				map_names.reject(_position_patch_position);
				event_names.reject(_position_patch_position);
				image_names.reject(_position_patch_position);
				tile_symbols.reject(_position_patch_position);
				payment_long_type_names.reject(_position_patch_position);
				area_names.reject(_position_patch_position);
				structure_names.reject(_position_patch_position);
				tile_names.reject(_position_patch_position);
				hero_stat.reject(_position_patch_position);
				_state=SUCCESS;
				_position_patch_position=_position;
				_token_patch_position=_token;
				_token=new Tokens.Rule.PatchPositionToken();
				parse_patch_dimension();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_position(patch_position)");
						_furthestPosition=_position;
					}
					_position=_position_patch_position;
				}
				else {
					int _state_110 = _state;
					while(_position<_inputLength) {
						parse__anonymous_91();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_110==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_position(patch_position)");
							_furthestPosition=_position;
						}
						_position=_position_patch_position;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_patch_position.add(_position_patch_position,_token);
				}
				_token=_token_patch_position;
				if(_state==FAILED) {
					support_names.reject(_position_patch_position);
					association_names.reject(_position_patch_position);
					room_names.reject(_position_patch_position);
					activity_names.reject(_position_patch_position);
					siding_names.reject(_position_patch_position);
					item_names.reject(_position_patch_position);
					aspect_names.reject(_position_patch_position);
					affinity_names.reject(_position_patch_position);
					activity_type_names.reject(_position_patch_position);
					trail_names.reject(_position_patch_position);
					attack_names.reject(_position_patch_position);
					reason_names.reject(_position_patch_position);
					trait_names.reject(_position_patch_position);
					condition_names.reject(_position_patch_position);
					payment_short_type_names.reject(_position_patch_position);
					skill_names.reject(_position_patch_position);
					map_names.reject(_position_patch_position);
					event_names.reject(_position_patch_position);
					image_names.reject(_position_patch_position);
					tile_symbols.reject(_position_patch_position);
					payment_long_type_names.reject(_position_patch_position);
					area_names.reject(_position_patch_position);
					structure_names.reject(_position_patch_position);
					tile_names.reject(_position_patch_position);
					hero_stat.reject(_position_patch_position);
				}
				else if(_state==SUCCESS) {
					support_names.accept(_position_patch_position);
					association_names.accept(_position_patch_position);
					room_names.accept(_position_patch_position);
					activity_names.accept(_position_patch_position);
					siding_names.accept(_position_patch_position);
					item_names.accept(_position_patch_position);
					aspect_names.accept(_position_patch_position);
					affinity_names.accept(_position_patch_position);
					activity_type_names.accept(_position_patch_position);
					trail_names.accept(_position_patch_position);
					attack_names.accept(_position_patch_position);
					reason_names.accept(_position_patch_position);
					trait_names.accept(_position_patch_position);
					condition_names.accept(_position_patch_position);
					payment_short_type_names.accept(_position_patch_position);
					skill_names.accept(_position_patch_position);
					map_names.accept(_position_patch_position);
					event_names.accept(_position_patch_position);
					image_names.accept(_position_patch_position);
					tile_symbols.accept(_position_patch_position);
					payment_long_type_names.accept(_position_patch_position);
					area_names.accept(_position_patch_position);
					structure_names.accept(_position_patch_position);
					tile_names.accept(_position_patch_position);
					hero_stat.accept(_position_patch_position);
				}
			}
		}
	}
	public void parse_patch_dimension() {
		int _position_patch_dimension = -1;
		Token.Parsed _token_patch_dimension = null;
		int _position_patch_range = -1;
		Token.Parsed _token_patch_range = null;
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
		_position_patch_dimension=_position;
		_token_patch_dimension=_token;
		_token=new Tokens.Rule.PatchDimensionToken();
		_token_patch_range=_token;
		_token=new Tokens.Name.PatchWidthToken();
		_position_patch_range=_position;
		parse_patch_range();
		if(_state==SUCCESS) {
			_token_patch_range.add(_position_patch_range,_token);
		}
		_token=_token_patch_range;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_dimension(patch_dimension)");
				_furthestPosition=_position;
			}
			_position=_position_patch_dimension;
		}
		else {
			int _position_regex_11 = _position;
			if(_position<_inputLength) {
				if(_inputArray[_position]=='x'||_inputArray[_position]=='X') {
					++_position;
				}
				else {
					_state=FAILED;
				}
			}
			else {
				_state=FAILED;
			}
			if(_state==SUCCESS) {
				_token.setValue(_input.substring(_position_regex_11,_position));
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"[xX]");
					_furthestPosition=_position;
				}
				_position=_position_regex_11;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_dimension(patch_dimension)");
					_furthestPosition=_position;
				}
				_position=_position_patch_dimension;
			}
			else {
				_token_patch_range=_token;
				_token=new Tokens.Name.PatchHeightToken();
				_position_patch_range=_position;
				parse_patch_range();
				if(_state==SUCCESS) {
					_token_patch_range.add(_position_patch_range,_token);
				}
				_token=_token_patch_range;
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_dimension(patch_dimension)");
						_furthestPosition=_position;
					}
					_position=_position_patch_dimension;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_patch_dimension.add(_position_patch_dimension,_token);
		}
		_token=_token_patch_dimension;
		if(_state==FAILED) {
			support_names.reject(_position_patch_dimension);
			association_names.reject(_position_patch_dimension);
			room_names.reject(_position_patch_dimension);
			activity_names.reject(_position_patch_dimension);
			siding_names.reject(_position_patch_dimension);
			item_names.reject(_position_patch_dimension);
			aspect_names.reject(_position_patch_dimension);
			affinity_names.reject(_position_patch_dimension);
			activity_type_names.reject(_position_patch_dimension);
			trail_names.reject(_position_patch_dimension);
			attack_names.reject(_position_patch_dimension);
			reason_names.reject(_position_patch_dimension);
			trait_names.reject(_position_patch_dimension);
			condition_names.reject(_position_patch_dimension);
			payment_short_type_names.reject(_position_patch_dimension);
			skill_names.reject(_position_patch_dimension);
			map_names.reject(_position_patch_dimension);
			event_names.reject(_position_patch_dimension);
			image_names.reject(_position_patch_dimension);
			tile_symbols.reject(_position_patch_dimension);
			payment_long_type_names.reject(_position_patch_dimension);
			area_names.reject(_position_patch_dimension);
			structure_names.reject(_position_patch_dimension);
			tile_names.reject(_position_patch_dimension);
			hero_stat.reject(_position_patch_dimension);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_patch_dimension);
			association_names.accept(_position_patch_dimension);
			room_names.accept(_position_patch_dimension);
			activity_names.accept(_position_patch_dimension);
			siding_names.accept(_position_patch_dimension);
			item_names.accept(_position_patch_dimension);
			aspect_names.accept(_position_patch_dimension);
			affinity_names.accept(_position_patch_dimension);
			activity_type_names.accept(_position_patch_dimension);
			trail_names.accept(_position_patch_dimension);
			attack_names.accept(_position_patch_dimension);
			reason_names.accept(_position_patch_dimension);
			trait_names.accept(_position_patch_dimension);
			condition_names.accept(_position_patch_dimension);
			payment_short_type_names.accept(_position_patch_dimension);
			skill_names.accept(_position_patch_dimension);
			map_names.accept(_position_patch_dimension);
			event_names.accept(_position_patch_dimension);
			image_names.accept(_position_patch_dimension);
			tile_symbols.accept(_position_patch_dimension);
			payment_long_type_names.accept(_position_patch_dimension);
			area_names.accept(_position_patch_dimension);
			structure_names.accept(_position_patch_dimension);
			tile_names.accept(_position_patch_dimension);
			hero_stat.accept(_position_patch_dimension);
		}
	}
	public void parse_patch_element() {
		int _position_patch_element = -1;
		Token.Parsed _token_patch_element = null;
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
		_position_patch_element=_position;
		_token_patch_element=_token;
		_token=new Tokens.Rule.PatchElementToken();
		int _state_103 = _state;
		parse_patch_probability();
		if(_state_103==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
				_furthestPosition=_position;
			}
			_position=_position_patch_element;
		}
		else {
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='-') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_15.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain -");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
					_furthestPosition=_position;
				}
				_position=_position_patch_element;
			}
			else {
				parse__anonymous_86();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
						_furthestPosition=_position;
					}
					_position=_position_patch_element;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_patch_element.add(_position_patch_element,_token);
		}
		_token=_token_patch_element;
		if(_state==FAILED) {
			support_names.reject(_position_patch_element);
			association_names.reject(_position_patch_element);
			room_names.reject(_position_patch_element);
			activity_names.reject(_position_patch_element);
			siding_names.reject(_position_patch_element);
			item_names.reject(_position_patch_element);
			aspect_names.reject(_position_patch_element);
			affinity_names.reject(_position_patch_element);
			activity_type_names.reject(_position_patch_element);
			trail_names.reject(_position_patch_element);
			attack_names.reject(_position_patch_element);
			reason_names.reject(_position_patch_element);
			trait_names.reject(_position_patch_element);
			condition_names.reject(_position_patch_element);
			payment_short_type_names.reject(_position_patch_element);
			skill_names.reject(_position_patch_element);
			map_names.reject(_position_patch_element);
			event_names.reject(_position_patch_element);
			image_names.reject(_position_patch_element);
			tile_symbols.reject(_position_patch_element);
			payment_long_type_names.reject(_position_patch_element);
			area_names.reject(_position_patch_element);
			structure_names.reject(_position_patch_element);
			tile_names.reject(_position_patch_element);
			hero_stat.reject(_position_patch_element);
			_state=SUCCESS;
			_position_patch_element=_position;
			_token_patch_element=_token;
			_token=new Tokens.Rule.PatchElementToken();
			int _state_104 = _state;
			parse_patch_probability();
			if(_state_104==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
					_furthestPosition=_position;
				}
				_position=_position_patch_element;
			}
			else {
				int _state_105 = _state;
				parse_patch_position();
				if(_state_105==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
						_furthestPosition=_position;
					}
					_position=_position_patch_element;
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
							_furthestPosition=_position;
						}
						_position=_position_patch_element;
					}
					else {
						int _state_106 = _state;
						parse_patch_goto();
						if(_state_106==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_element(patch_element)");
								_furthestPosition=_position;
							}
							_position=_position_patch_element;
						}
						else {
						}
					}
				}
			}
			if(_state==SUCCESS) {
				_token_patch_element.add(_position_patch_element,_token);
			}
			_token=_token_patch_element;
			if(_state==FAILED) {
				support_names.reject(_position_patch_element);
				association_names.reject(_position_patch_element);
				room_names.reject(_position_patch_element);
				activity_names.reject(_position_patch_element);
				siding_names.reject(_position_patch_element);
				item_names.reject(_position_patch_element);
				aspect_names.reject(_position_patch_element);
				affinity_names.reject(_position_patch_element);
				activity_type_names.reject(_position_patch_element);
				trail_names.reject(_position_patch_element);
				attack_names.reject(_position_patch_element);
				reason_names.reject(_position_patch_element);
				trait_names.reject(_position_patch_element);
				condition_names.reject(_position_patch_element);
				payment_short_type_names.reject(_position_patch_element);
				skill_names.reject(_position_patch_element);
				map_names.reject(_position_patch_element);
				event_names.reject(_position_patch_element);
				image_names.reject(_position_patch_element);
				tile_symbols.reject(_position_patch_element);
				payment_long_type_names.reject(_position_patch_element);
				area_names.reject(_position_patch_element);
				structure_names.reject(_position_patch_element);
				tile_names.reject(_position_patch_element);
				hero_stat.reject(_position_patch_element);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_patch_element);
				association_names.accept(_position_patch_element);
				room_names.accept(_position_patch_element);
				activity_names.accept(_position_patch_element);
				siding_names.accept(_position_patch_element);
				item_names.accept(_position_patch_element);
				aspect_names.accept(_position_patch_element);
				affinity_names.accept(_position_patch_element);
				activity_type_names.accept(_position_patch_element);
				trail_names.accept(_position_patch_element);
				attack_names.accept(_position_patch_element);
				reason_names.accept(_position_patch_element);
				trait_names.accept(_position_patch_element);
				condition_names.accept(_position_patch_element);
				payment_short_type_names.accept(_position_patch_element);
				skill_names.accept(_position_patch_element);
				map_names.accept(_position_patch_element);
				event_names.accept(_position_patch_element);
				image_names.accept(_position_patch_element);
				tile_symbols.accept(_position_patch_element);
				payment_long_type_names.accept(_position_patch_element);
				area_names.accept(_position_patch_element);
				structure_names.accept(_position_patch_element);
				tile_names.accept(_position_patch_element);
				hero_stat.accept(_position_patch_element);
			}
		}
	}
	public void parse_patch_goto() {
		int _position_patch_goto = -1;
		Token.Parsed _token_patch_goto = null;
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
		_position_patch_goto=_position;
		_token_patch_goto=_token;
		_token=new Tokens.Rule.PatchGotoToken();
		if(_position+2-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='-') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_57.SYNTAX);
			_position=_position+2;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ->");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_goto(patch_goto)");
				_furthestPosition=_position;
			}
			_position=_position_patch_goto;
		}
		else {
			parse__anonymous_88();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_goto(patch_goto)");
					_furthestPosition=_position;
				}
				_position=_position_patch_goto;
			}
			else {
				int _state_109 = _state;
				parse__anonymous_90();
				if(_state_109==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_goto(patch_goto)");
						_furthestPosition=_position;
					}
					_position=_position_patch_goto;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_patch_goto.add(_position_patch_goto,_token);
		}
		_token=_token_patch_goto;
		if(_state==FAILED) {
			support_names.reject(_position_patch_goto);
			association_names.reject(_position_patch_goto);
			room_names.reject(_position_patch_goto);
			activity_names.reject(_position_patch_goto);
			siding_names.reject(_position_patch_goto);
			item_names.reject(_position_patch_goto);
			aspect_names.reject(_position_patch_goto);
			affinity_names.reject(_position_patch_goto);
			activity_type_names.reject(_position_patch_goto);
			trail_names.reject(_position_patch_goto);
			attack_names.reject(_position_patch_goto);
			reason_names.reject(_position_patch_goto);
			trait_names.reject(_position_patch_goto);
			condition_names.reject(_position_patch_goto);
			payment_short_type_names.reject(_position_patch_goto);
			skill_names.reject(_position_patch_goto);
			map_names.reject(_position_patch_goto);
			event_names.reject(_position_patch_goto);
			image_names.reject(_position_patch_goto);
			tile_symbols.reject(_position_patch_goto);
			payment_long_type_names.reject(_position_patch_goto);
			area_names.reject(_position_patch_goto);
			structure_names.reject(_position_patch_goto);
			tile_names.reject(_position_patch_goto);
			hero_stat.reject(_position_patch_goto);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_patch_goto);
			association_names.accept(_position_patch_goto);
			room_names.accept(_position_patch_goto);
			activity_names.accept(_position_patch_goto);
			siding_names.accept(_position_patch_goto);
			item_names.accept(_position_patch_goto);
			aspect_names.accept(_position_patch_goto);
			affinity_names.accept(_position_patch_goto);
			activity_type_names.accept(_position_patch_goto);
			trail_names.accept(_position_patch_goto);
			attack_names.accept(_position_patch_goto);
			reason_names.accept(_position_patch_goto);
			trait_names.accept(_position_patch_goto);
			condition_names.accept(_position_patch_goto);
			payment_short_type_names.accept(_position_patch_goto);
			skill_names.accept(_position_patch_goto);
			map_names.accept(_position_patch_goto);
			event_names.accept(_position_patch_goto);
			image_names.accept(_position_patch_goto);
			tile_symbols.accept(_position_patch_goto);
			payment_long_type_names.accept(_position_patch_goto);
			area_names.accept(_position_patch_goto);
			structure_names.accept(_position_patch_goto);
			tile_names.accept(_position_patch_goto);
			hero_stat.accept(_position_patch_goto);
		}
	}
	public void parse_patch_range() {
		int _position_patch_range = -1;
		Token.Parsed _token_patch_range = null;
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
		_position_patch_range=_position;
		_token_patch_range=_token;
		_token=new Tokens.Rule.PatchRangeToken();
		int _state_111 = _state;
		_token_INTEGER=_token;
		_token=new Tokens.Name.LowerBoundToken();
		_position_INTEGER=_position;
		parse_INTEGER();
		if(_state==SUCCESS) {
			_token_INTEGER.add(_position_INTEGER,_token);
		}
		_token=_token_INTEGER;
		if(_state_111==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_range(patch_range)");
				_furthestPosition=_position;
			}
			_position=_position_patch_range;
		}
		else {
			int _state_112 = _state;
			parse__anonymous_92();
			if(_state_112==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"patch_range(patch_range)");
					_furthestPosition=_position;
				}
				_position=_position_patch_range;
			}
			else {
			}
		}
		if(_state==SUCCESS) {
			_token_patch_range.addAll(_token);
			_token_patch_range.setValue(_token.getValue());
		}
		_token=_token_patch_range;
		if(_state==FAILED) {
			support_names.reject(_position_patch_range);
			association_names.reject(_position_patch_range);
			room_names.reject(_position_patch_range);
			activity_names.reject(_position_patch_range);
			siding_names.reject(_position_patch_range);
			item_names.reject(_position_patch_range);
			aspect_names.reject(_position_patch_range);
			affinity_names.reject(_position_patch_range);
			activity_type_names.reject(_position_patch_range);
			trail_names.reject(_position_patch_range);
			attack_names.reject(_position_patch_range);
			reason_names.reject(_position_patch_range);
			trait_names.reject(_position_patch_range);
			condition_names.reject(_position_patch_range);
			payment_short_type_names.reject(_position_patch_range);
			skill_names.reject(_position_patch_range);
			map_names.reject(_position_patch_range);
			event_names.reject(_position_patch_range);
			image_names.reject(_position_patch_range);
			tile_symbols.reject(_position_patch_range);
			payment_long_type_names.reject(_position_patch_range);
			area_names.reject(_position_patch_range);
			structure_names.reject(_position_patch_range);
			tile_names.reject(_position_patch_range);
			hero_stat.reject(_position_patch_range);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_patch_range);
			association_names.accept(_position_patch_range);
			room_names.accept(_position_patch_range);
			activity_names.accept(_position_patch_range);
			siding_names.accept(_position_patch_range);
			item_names.accept(_position_patch_range);
			aspect_names.accept(_position_patch_range);
			affinity_names.accept(_position_patch_range);
			activity_type_names.accept(_position_patch_range);
			trail_names.accept(_position_patch_range);
			attack_names.accept(_position_patch_range);
			reason_names.accept(_position_patch_range);
			trait_names.accept(_position_patch_range);
			condition_names.accept(_position_patch_range);
			payment_short_type_names.accept(_position_patch_range);
			skill_names.accept(_position_patch_range);
			map_names.accept(_position_patch_range);
			event_names.accept(_position_patch_range);
			image_names.accept(_position_patch_range);
			tile_symbols.accept(_position_patch_range);
			payment_long_type_names.accept(_position_patch_range);
			area_names.accept(_position_patch_range);
			structure_names.accept(_position_patch_range);
			tile_names.accept(_position_patch_range);
			hero_stat.accept(_position_patch_range);
		}
	}
}