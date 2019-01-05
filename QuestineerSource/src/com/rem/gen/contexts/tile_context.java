package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.import_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class tile_context extends import_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public tile_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public tile_context() {
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
	public void parse_tile_id_choice() {
		int _position_tile_id_choice = -1;
		Token.Parsed _token_tile_id_choice = null;
		int _position_INTEGER = -1;
		Token.Parsed _token_INTEGER = null;
		int _length_tile_id_choice_brace = _inputLength;
		if(brace_3.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_3.get(_position);
			int _position_tile_id_choice_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
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
			_position_tile_id_choice=_position;
			_token_tile_id_choice=_token;
			_token=new Tokens.Rule.TileIdChoiceToken();
			_token_INTEGER=_token;
			_token=new Tokens.Name.IndexToken();
			_position_INTEGER=_position;
			parse_INTEGER();
			if(_state==SUCCESS) {
				_token_INTEGER.add(_position_INTEGER,_token);
			}
			_token=_token_INTEGER;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_id_choice(tile_id_choice)");
					_furthestPosition=_position;
				}
				_position=_position_tile_id_choice;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_tile_id_choice.add(_position_tile_id_choice,_token);
			}
			_token=_token_tile_id_choice;
			if(_state==FAILED) {
				support_names.reject(_position_tile_id_choice);
				association_names.reject(_position_tile_id_choice);
				room_names.reject(_position_tile_id_choice);
				activity_names.reject(_position_tile_id_choice);
				siding_names.reject(_position_tile_id_choice);
				item_names.reject(_position_tile_id_choice);
				aspect_names.reject(_position_tile_id_choice);
				affinity_names.reject(_position_tile_id_choice);
				activity_type_names.reject(_position_tile_id_choice);
				trail_names.reject(_position_tile_id_choice);
				attack_names.reject(_position_tile_id_choice);
				reason_names.reject(_position_tile_id_choice);
				trait_names.reject(_position_tile_id_choice);
				condition_names.reject(_position_tile_id_choice);
				payment_short_type_names.reject(_position_tile_id_choice);
				skill_names.reject(_position_tile_id_choice);
				map_names.reject(_position_tile_id_choice);
				event_names.reject(_position_tile_id_choice);
				image_names.reject(_position_tile_id_choice);
				tile_symbols.reject(_position_tile_id_choice);
				payment_long_type_names.reject(_position_tile_id_choice);
				area_names.reject(_position_tile_id_choice);
				structure_names.reject(_position_tile_id_choice);
				tile_names.reject(_position_tile_id_choice);
				hero_stat.reject(_position_tile_id_choice);
				_state=SUCCESS;
				_position_tile_id_choice=_position;
				_token_tile_id_choice=_token;
				_token=new Tokens.Rule.TileIdChoiceToken();
				parse__anonymous_128();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_id_choice(tile_id_choice)");
						_furthestPosition=_position;
					}
					_position=_position_tile_id_choice;
				}
				else {
					int _state_164 = _state;
					while(_position<_inputLength) {
						parse__anonymous_129();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_164==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_id_choice(tile_id_choice)");
							_furthestPosition=_position;
						}
						_position=_position_tile_id_choice;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_tile_id_choice.add(_position_tile_id_choice,_token);
				}
				_token=_token_tile_id_choice;
				if(_state==FAILED) {
					support_names.reject(_position_tile_id_choice);
					association_names.reject(_position_tile_id_choice);
					room_names.reject(_position_tile_id_choice);
					activity_names.reject(_position_tile_id_choice);
					siding_names.reject(_position_tile_id_choice);
					item_names.reject(_position_tile_id_choice);
					aspect_names.reject(_position_tile_id_choice);
					affinity_names.reject(_position_tile_id_choice);
					activity_type_names.reject(_position_tile_id_choice);
					trail_names.reject(_position_tile_id_choice);
					attack_names.reject(_position_tile_id_choice);
					reason_names.reject(_position_tile_id_choice);
					trait_names.reject(_position_tile_id_choice);
					condition_names.reject(_position_tile_id_choice);
					payment_short_type_names.reject(_position_tile_id_choice);
					skill_names.reject(_position_tile_id_choice);
					map_names.reject(_position_tile_id_choice);
					event_names.reject(_position_tile_id_choice);
					image_names.reject(_position_tile_id_choice);
					tile_symbols.reject(_position_tile_id_choice);
					payment_long_type_names.reject(_position_tile_id_choice);
					area_names.reject(_position_tile_id_choice);
					structure_names.reject(_position_tile_id_choice);
					tile_names.reject(_position_tile_id_choice);
					hero_stat.reject(_position_tile_id_choice);
				}
				else if(_state==SUCCESS) {
					support_names.accept(_position_tile_id_choice);
					association_names.accept(_position_tile_id_choice);
					room_names.accept(_position_tile_id_choice);
					activity_names.accept(_position_tile_id_choice);
					siding_names.accept(_position_tile_id_choice);
					item_names.accept(_position_tile_id_choice);
					aspect_names.accept(_position_tile_id_choice);
					affinity_names.accept(_position_tile_id_choice);
					activity_type_names.accept(_position_tile_id_choice);
					trail_names.accept(_position_tile_id_choice);
					attack_names.accept(_position_tile_id_choice);
					reason_names.accept(_position_tile_id_choice);
					trait_names.accept(_position_tile_id_choice);
					condition_names.accept(_position_tile_id_choice);
					payment_short_type_names.accept(_position_tile_id_choice);
					skill_names.accept(_position_tile_id_choice);
					map_names.accept(_position_tile_id_choice);
					event_names.accept(_position_tile_id_choice);
					image_names.accept(_position_tile_id_choice);
					tile_symbols.accept(_position_tile_id_choice);
					payment_long_type_names.accept(_position_tile_id_choice);
					area_names.accept(_position_tile_id_choice);
					structure_names.accept(_position_tile_id_choice);
					tile_names.accept(_position_tile_id_choice);
					hero_stat.accept(_position_tile_id_choice);
				}
				room_names=room_names.pop();
				hero_stat=hero_stat.pop();
			}
			if(_state==SUCCESS&&brace_3.get(_position_tile_id_choice_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("tile_id_choice",_position,_lineNumberRanges));
				_position=brace_3.get(_position_tile_id_choice_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_tile_id_choice_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_id_choice(tile_id_choice)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_tile_payment_type() {
		int _position_tile_payment_type = -1;
		Token.Parsed _token_tile_payment_type = null;
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
		_position_tile_payment_type=_position;
		_token_tile_payment_type=_token;
		_token=new Tokens.Rule.TilePaymentTypeToken();
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
			if(_list_name_result!=null&&payment_long_type_names.contains(_list_name_result)) {
				if(_position+_list_name_result.length()<_inputLength) {
					int _next_char = _inputArray[_position+_list_name_result.length()];
					if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,new Tokens.Name.PaymentLongTypeNamesToken(_list_name_result));
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_long_type_names");
					_furthestPosition=_position;
				}
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_payment_type(tile_payment_type)");
				_furthestPosition=_position;
			}
			_position=_position_tile_payment_type;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_tile_payment_type.add(_position_tile_payment_type,_token);
		}
		_token=_token_tile_payment_type;
		if(_state==FAILED) {
			support_names.reject(_position_tile_payment_type);
			association_names.reject(_position_tile_payment_type);
			room_names.reject(_position_tile_payment_type);
			activity_names.reject(_position_tile_payment_type);
			siding_names.reject(_position_tile_payment_type);
			item_names.reject(_position_tile_payment_type);
			aspect_names.reject(_position_tile_payment_type);
			affinity_names.reject(_position_tile_payment_type);
			activity_type_names.reject(_position_tile_payment_type);
			trail_names.reject(_position_tile_payment_type);
			attack_names.reject(_position_tile_payment_type);
			reason_names.reject(_position_tile_payment_type);
			trait_names.reject(_position_tile_payment_type);
			condition_names.reject(_position_tile_payment_type);
			payment_short_type_names.reject(_position_tile_payment_type);
			skill_names.reject(_position_tile_payment_type);
			map_names.reject(_position_tile_payment_type);
			event_names.reject(_position_tile_payment_type);
			image_names.reject(_position_tile_payment_type);
			tile_symbols.reject(_position_tile_payment_type);
			payment_long_type_names.reject(_position_tile_payment_type);
			area_names.reject(_position_tile_payment_type);
			structure_names.reject(_position_tile_payment_type);
			tile_names.reject(_position_tile_payment_type);
			hero_stat.reject(_position_tile_payment_type);
			_state=SUCCESS;
			_position_tile_payment_type=_position;
			_token_tile_payment_type=_token;
			_token=new Tokens.Rule.TilePaymentTypeToken();
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
				if(_list_name_result!=null&&payment_short_type_names.contains(_list_name_result)) {
					if(_position+_list_name_result.length()<_inputLength) {
						int _next_char = _inputArray[_position+_list_name_result.length()];
						if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,new Tokens.Name.PaymentShortTypeNamesToken(_list_name_result));
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_short_type_names");
						_furthestPosition=_position;
					}
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_payment_type(tile_payment_type)");
					_furthestPosition=_position;
				}
				_position=_position_tile_payment_type;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_tile_payment_type.add(_position_tile_payment_type,_token);
			}
			_token=_token_tile_payment_type;
			if(_state==FAILED) {
				support_names.reject(_position_tile_payment_type);
				association_names.reject(_position_tile_payment_type);
				room_names.reject(_position_tile_payment_type);
				activity_names.reject(_position_tile_payment_type);
				siding_names.reject(_position_tile_payment_type);
				item_names.reject(_position_tile_payment_type);
				aspect_names.reject(_position_tile_payment_type);
				affinity_names.reject(_position_tile_payment_type);
				activity_type_names.reject(_position_tile_payment_type);
				trail_names.reject(_position_tile_payment_type);
				attack_names.reject(_position_tile_payment_type);
				reason_names.reject(_position_tile_payment_type);
				trait_names.reject(_position_tile_payment_type);
				condition_names.reject(_position_tile_payment_type);
				payment_short_type_names.reject(_position_tile_payment_type);
				skill_names.reject(_position_tile_payment_type);
				map_names.reject(_position_tile_payment_type);
				event_names.reject(_position_tile_payment_type);
				image_names.reject(_position_tile_payment_type);
				tile_symbols.reject(_position_tile_payment_type);
				payment_long_type_names.reject(_position_tile_payment_type);
				area_names.reject(_position_tile_payment_type);
				structure_names.reject(_position_tile_payment_type);
				tile_names.reject(_position_tile_payment_type);
				hero_stat.reject(_position_tile_payment_type);
				_state=SUCCESS;
				_position_tile_payment_type=_position;
				_token_tile_payment_type=_token;
				_token=new Tokens.Rule.TilePaymentTypeToken();
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
					if(_list_name_result!=null&&item_names.contains(_list_name_result)) {
						if(_position+_list_name_result.length()<_inputLength) {
							int _next_char = _inputArray[_position+_list_name_result.length()];
							if(_next_char == 95 || (_next_char >= 48 && _next_char <= 57 ) || (_next_char >= 65 && _next_char <= 90 ) || (_next_char >= 97 && _next_char <= 122 )) {
								_state=FAILED;
							}
						}
						if(_state==SUCCESS) {
							_token.add(_position,new Tokens.Name.ItemNamesToken(_list_name_result));
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"item_names");
							_furthestPosition=_position;
						}
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_payment_type(tile_payment_type)");
						_furthestPosition=_position;
					}
					_position=_position_tile_payment_type;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_tile_payment_type.add(_position_tile_payment_type,_token);
				}
				_token=_token_tile_payment_type;
				if(_state==FAILED) {
					support_names.reject(_position_tile_payment_type);
					association_names.reject(_position_tile_payment_type);
					room_names.reject(_position_tile_payment_type);
					activity_names.reject(_position_tile_payment_type);
					siding_names.reject(_position_tile_payment_type);
					item_names.reject(_position_tile_payment_type);
					aspect_names.reject(_position_tile_payment_type);
					affinity_names.reject(_position_tile_payment_type);
					activity_type_names.reject(_position_tile_payment_type);
					trail_names.reject(_position_tile_payment_type);
					attack_names.reject(_position_tile_payment_type);
					reason_names.reject(_position_tile_payment_type);
					trait_names.reject(_position_tile_payment_type);
					condition_names.reject(_position_tile_payment_type);
					payment_short_type_names.reject(_position_tile_payment_type);
					skill_names.reject(_position_tile_payment_type);
					map_names.reject(_position_tile_payment_type);
					event_names.reject(_position_tile_payment_type);
					image_names.reject(_position_tile_payment_type);
					tile_symbols.reject(_position_tile_payment_type);
					payment_long_type_names.reject(_position_tile_payment_type);
					area_names.reject(_position_tile_payment_type);
					structure_names.reject(_position_tile_payment_type);
					tile_names.reject(_position_tile_payment_type);
					hero_stat.reject(_position_tile_payment_type);
				}
				else if(_state==SUCCESS) {
					support_names.accept(_position_tile_payment_type);
					association_names.accept(_position_tile_payment_type);
					room_names.accept(_position_tile_payment_type);
					activity_names.accept(_position_tile_payment_type);
					siding_names.accept(_position_tile_payment_type);
					item_names.accept(_position_tile_payment_type);
					aspect_names.accept(_position_tile_payment_type);
					affinity_names.accept(_position_tile_payment_type);
					activity_type_names.accept(_position_tile_payment_type);
					trail_names.accept(_position_tile_payment_type);
					attack_names.accept(_position_tile_payment_type);
					reason_names.accept(_position_tile_payment_type);
					trait_names.accept(_position_tile_payment_type);
					condition_names.accept(_position_tile_payment_type);
					payment_short_type_names.accept(_position_tile_payment_type);
					skill_names.accept(_position_tile_payment_type);
					map_names.accept(_position_tile_payment_type);
					event_names.accept(_position_tile_payment_type);
					image_names.accept(_position_tile_payment_type);
					tile_symbols.accept(_position_tile_payment_type);
					payment_long_type_names.accept(_position_tile_payment_type);
					area_names.accept(_position_tile_payment_type);
					structure_names.accept(_position_tile_payment_type);
					tile_names.accept(_position_tile_payment_type);
					hero_stat.accept(_position_tile_payment_type);
				}
			}
		}
	}
	public void parse_tile_dimensions() {
		int _position_tile_dimensions = -1;
		Token.Parsed _token_tile_dimensions = null;
		int _position_INTEGER = -1;
		Token.Parsed _token_INTEGER = null;
		int _length_tile_dimensions_brace = _inputLength;
		if(brace_3.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_3.get(_position);
			int _position_tile_dimensions_brace = _position;
			_position+=1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
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
			_position_tile_dimensions=_position;
			_token_tile_dimensions=_token;
			_token=new Tokens.Rule.TileDimensionsToken();
			_token_INTEGER=_token;
			_token=new Tokens.Name.WidthToken();
			_position_INTEGER=_position;
			parse_INTEGER();
			if(_state==SUCCESS) {
				_token_INTEGER.add(_position_INTEGER,_token);
			}
			_token=_token_INTEGER;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_dimensions(tile_dimensions)");
					_furthestPosition=_position;
				}
				_position=_position_tile_dimensions;
			}
			else {
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!=',') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_23.SYNTAX);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ,");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_dimensions(tile_dimensions)");
						_furthestPosition=_position;
					}
					_position=_position_tile_dimensions;
				}
				else {
					_token_INTEGER=_token;
					_token=new Tokens.Name.HeightToken();
					_position_INTEGER=_position;
					parse_INTEGER();
					if(_state==SUCCESS) {
						_token_INTEGER.add(_position_INTEGER,_token);
					}
					_token=_token_INTEGER;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_dimensions(tile_dimensions)");
							_furthestPosition=_position;
						}
						_position=_position_tile_dimensions;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_tile_dimensions.add(_position_tile_dimensions,_token);
			}
			_token=_token_tile_dimensions;
			if(_state==SUCCESS&&brace_3.get(_position_tile_dimensions_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("tile_dimensions",_position,_lineNumberRanges));
				_position=brace_3.get(_position_tile_dimensions_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_tile_dimensions_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_tile_dimensions);
				association_names.reject(_position_tile_dimensions);
				room_names.reject(_position_tile_dimensions);
				activity_names.reject(_position_tile_dimensions);
				siding_names.reject(_position_tile_dimensions);
				item_names.reject(_position_tile_dimensions);
				aspect_names.reject(_position_tile_dimensions);
				affinity_names.reject(_position_tile_dimensions);
				activity_type_names.reject(_position_tile_dimensions);
				trail_names.reject(_position_tile_dimensions);
				attack_names.reject(_position_tile_dimensions);
				reason_names.reject(_position_tile_dimensions);
				trait_names.reject(_position_tile_dimensions);
				condition_names.reject(_position_tile_dimensions);
				payment_short_type_names.reject(_position_tile_dimensions);
				skill_names.reject(_position_tile_dimensions);
				map_names.reject(_position_tile_dimensions);
				event_names.reject(_position_tile_dimensions);
				image_names.reject(_position_tile_dimensions);
				tile_symbols.reject(_position_tile_dimensions);
				payment_long_type_names.reject(_position_tile_dimensions);
				area_names.reject(_position_tile_dimensions);
				structure_names.reject(_position_tile_dimensions);
				tile_names.reject(_position_tile_dimensions);
				hero_stat.reject(_position_tile_dimensions);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_tile_dimensions);
				association_names.accept(_position_tile_dimensions);
				room_names.accept(_position_tile_dimensions);
				activity_names.accept(_position_tile_dimensions);
				siding_names.accept(_position_tile_dimensions);
				item_names.accept(_position_tile_dimensions);
				aspect_names.accept(_position_tile_dimensions);
				affinity_names.accept(_position_tile_dimensions);
				activity_type_names.accept(_position_tile_dimensions);
				trail_names.accept(_position_tile_dimensions);
				attack_names.accept(_position_tile_dimensions);
				reason_names.accept(_position_tile_dimensions);
				trait_names.accept(_position_tile_dimensions);
				condition_names.accept(_position_tile_dimensions);
				payment_short_type_names.accept(_position_tile_dimensions);
				skill_names.accept(_position_tile_dimensions);
				map_names.accept(_position_tile_dimensions);
				event_names.accept(_position_tile_dimensions);
				image_names.accept(_position_tile_dimensions);
				tile_symbols.accept(_position_tile_dimensions);
				payment_long_type_names.accept(_position_tile_dimensions);
				area_names.accept(_position_tile_dimensions);
				structure_names.accept(_position_tile_dimensions);
				tile_names.accept(_position_tile_dimensions);
				hero_stat.accept(_position_tile_dimensions);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_dimensions(tile_dimensions)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_tile_declaration() {
		int _position_tile_declaration = -1;
		Token.Parsed _token_tile_declaration = null;
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
		_position_tile_declaration=_position;
		_token_tile_declaration=_token;
		_token=new Tokens.Rule.TileDeclarationToken();
		parse__anonymous_95();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_declaration(tile_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_tile_declaration;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_tile_declaration.add(_position_tile_declaration,_token);
		}
		_token=_token_tile_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_tile_declaration);
			association_names.reject(_position_tile_declaration);
			room_names.reject(_position_tile_declaration);
			activity_names.reject(_position_tile_declaration);
			siding_names.reject(_position_tile_declaration);
			item_names.reject(_position_tile_declaration);
			aspect_names.reject(_position_tile_declaration);
			affinity_names.reject(_position_tile_declaration);
			activity_type_names.reject(_position_tile_declaration);
			trail_names.reject(_position_tile_declaration);
			attack_names.reject(_position_tile_declaration);
			reason_names.reject(_position_tile_declaration);
			trait_names.reject(_position_tile_declaration);
			condition_names.reject(_position_tile_declaration);
			payment_short_type_names.reject(_position_tile_declaration);
			skill_names.reject(_position_tile_declaration);
			map_names.reject(_position_tile_declaration);
			event_names.reject(_position_tile_declaration);
			image_names.reject(_position_tile_declaration);
			tile_symbols.reject(_position_tile_declaration);
			payment_long_type_names.reject(_position_tile_declaration);
			area_names.reject(_position_tile_declaration);
			structure_names.reject(_position_tile_declaration);
			tile_names.reject(_position_tile_declaration);
			hero_stat.reject(_position_tile_declaration);
			_state=SUCCESS;
			_position_tile_declaration=_position;
			_token_tile_declaration=_token;
			_token=new Tokens.Rule.TileDeclarationToken();
			parse__anonymous_96();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_declaration(tile_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_tile_declaration;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_tile_declaration.add(_position_tile_declaration,_token);
			}
			_token=_token_tile_declaration;
			if(_state==FAILED) {
				support_names.reject(_position_tile_declaration);
				association_names.reject(_position_tile_declaration);
				room_names.reject(_position_tile_declaration);
				activity_names.reject(_position_tile_declaration);
				siding_names.reject(_position_tile_declaration);
				item_names.reject(_position_tile_declaration);
				aspect_names.reject(_position_tile_declaration);
				affinity_names.reject(_position_tile_declaration);
				activity_type_names.reject(_position_tile_declaration);
				trail_names.reject(_position_tile_declaration);
				attack_names.reject(_position_tile_declaration);
				reason_names.reject(_position_tile_declaration);
				trait_names.reject(_position_tile_declaration);
				condition_names.reject(_position_tile_declaration);
				payment_short_type_names.reject(_position_tile_declaration);
				skill_names.reject(_position_tile_declaration);
				map_names.reject(_position_tile_declaration);
				event_names.reject(_position_tile_declaration);
				image_names.reject(_position_tile_declaration);
				tile_symbols.reject(_position_tile_declaration);
				payment_long_type_names.reject(_position_tile_declaration);
				area_names.reject(_position_tile_declaration);
				structure_names.reject(_position_tile_declaration);
				tile_names.reject(_position_tile_declaration);
				hero_stat.reject(_position_tile_declaration);
				_state=SUCCESS;
				_position_tile_declaration=_position;
				_token_tile_declaration=_token;
				_token=new Tokens.Rule.TileDeclarationToken();
				parse__anonymous_98();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_declaration(tile_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_tile_declaration;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_tile_declaration.add(_position_tile_declaration,_token);
				}
				_token=_token_tile_declaration;
				if(_state==FAILED) {
					support_names.reject(_position_tile_declaration);
					association_names.reject(_position_tile_declaration);
					room_names.reject(_position_tile_declaration);
					activity_names.reject(_position_tile_declaration);
					siding_names.reject(_position_tile_declaration);
					item_names.reject(_position_tile_declaration);
					aspect_names.reject(_position_tile_declaration);
					affinity_names.reject(_position_tile_declaration);
					activity_type_names.reject(_position_tile_declaration);
					trail_names.reject(_position_tile_declaration);
					attack_names.reject(_position_tile_declaration);
					reason_names.reject(_position_tile_declaration);
					trait_names.reject(_position_tile_declaration);
					condition_names.reject(_position_tile_declaration);
					payment_short_type_names.reject(_position_tile_declaration);
					skill_names.reject(_position_tile_declaration);
					map_names.reject(_position_tile_declaration);
					event_names.reject(_position_tile_declaration);
					image_names.reject(_position_tile_declaration);
					tile_symbols.reject(_position_tile_declaration);
					payment_long_type_names.reject(_position_tile_declaration);
					area_names.reject(_position_tile_declaration);
					structure_names.reject(_position_tile_declaration);
					tile_names.reject(_position_tile_declaration);
					hero_stat.reject(_position_tile_declaration);
					_state=SUCCESS;
					_position_tile_declaration=_position;
					_token_tile_declaration=_token;
					_token=new Tokens.Rule.TileDeclarationToken();
					parse__anonymous_99();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_declaration(tile_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_tile_declaration;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_tile_declaration.add(_position_tile_declaration,_token);
					}
					_token=_token_tile_declaration;
					if(_state==FAILED) {
						support_names.reject(_position_tile_declaration);
						association_names.reject(_position_tile_declaration);
						room_names.reject(_position_tile_declaration);
						activity_names.reject(_position_tile_declaration);
						siding_names.reject(_position_tile_declaration);
						item_names.reject(_position_tile_declaration);
						aspect_names.reject(_position_tile_declaration);
						affinity_names.reject(_position_tile_declaration);
						activity_type_names.reject(_position_tile_declaration);
						trail_names.reject(_position_tile_declaration);
						attack_names.reject(_position_tile_declaration);
						reason_names.reject(_position_tile_declaration);
						trait_names.reject(_position_tile_declaration);
						condition_names.reject(_position_tile_declaration);
						payment_short_type_names.reject(_position_tile_declaration);
						skill_names.reject(_position_tile_declaration);
						map_names.reject(_position_tile_declaration);
						event_names.reject(_position_tile_declaration);
						image_names.reject(_position_tile_declaration);
						tile_symbols.reject(_position_tile_declaration);
						payment_long_type_names.reject(_position_tile_declaration);
						area_names.reject(_position_tile_declaration);
						structure_names.reject(_position_tile_declaration);
						tile_names.reject(_position_tile_declaration);
						hero_stat.reject(_position_tile_declaration);
						_state=SUCCESS;
						_position_tile_declaration=_position;
						_token_tile_declaration=_token;
						_token=new Tokens.Rule.TileDeclarationToken();
						parse__anonymous_100();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_declaration(tile_declaration)");
								_furthestPosition=_position;
							}
							_position=_position_tile_declaration;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_tile_declaration.add(_position_tile_declaration,_token);
						}
						_token=_token_tile_declaration;
						if(_state==FAILED) {
							support_names.reject(_position_tile_declaration);
							association_names.reject(_position_tile_declaration);
							room_names.reject(_position_tile_declaration);
							activity_names.reject(_position_tile_declaration);
							siding_names.reject(_position_tile_declaration);
							item_names.reject(_position_tile_declaration);
							aspect_names.reject(_position_tile_declaration);
							affinity_names.reject(_position_tile_declaration);
							activity_type_names.reject(_position_tile_declaration);
							trail_names.reject(_position_tile_declaration);
							attack_names.reject(_position_tile_declaration);
							reason_names.reject(_position_tile_declaration);
							trait_names.reject(_position_tile_declaration);
							condition_names.reject(_position_tile_declaration);
							payment_short_type_names.reject(_position_tile_declaration);
							skill_names.reject(_position_tile_declaration);
							map_names.reject(_position_tile_declaration);
							event_names.reject(_position_tile_declaration);
							image_names.reject(_position_tile_declaration);
							tile_symbols.reject(_position_tile_declaration);
							payment_long_type_names.reject(_position_tile_declaration);
							area_names.reject(_position_tile_declaration);
							structure_names.reject(_position_tile_declaration);
							tile_names.reject(_position_tile_declaration);
							hero_stat.reject(_position_tile_declaration);
						}
						else if(_state==SUCCESS) {
							support_names.accept(_position_tile_declaration);
							association_names.accept(_position_tile_declaration);
							room_names.accept(_position_tile_declaration);
							activity_names.accept(_position_tile_declaration);
							siding_names.accept(_position_tile_declaration);
							item_names.accept(_position_tile_declaration);
							aspect_names.accept(_position_tile_declaration);
							affinity_names.accept(_position_tile_declaration);
							activity_type_names.accept(_position_tile_declaration);
							trail_names.accept(_position_tile_declaration);
							attack_names.accept(_position_tile_declaration);
							reason_names.accept(_position_tile_declaration);
							trait_names.accept(_position_tile_declaration);
							condition_names.accept(_position_tile_declaration);
							payment_short_type_names.accept(_position_tile_declaration);
							skill_names.accept(_position_tile_declaration);
							map_names.accept(_position_tile_declaration);
							event_names.accept(_position_tile_declaration);
							image_names.accept(_position_tile_declaration);
							tile_symbols.accept(_position_tile_declaration);
							payment_long_type_names.accept(_position_tile_declaration);
							area_names.accept(_position_tile_declaration);
							structure_names.accept(_position_tile_declaration);
							tile_names.accept(_position_tile_declaration);
							hero_stat.accept(_position_tile_declaration);
						}
					}
				}
			}
		}
	}
	public void parse_tile_definition_element() {
		int _position_tile_definition_element = -1;
		Token.Parsed _token_tile_definition_element = null;
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
		_position_tile_definition_element=_position;
		_token_tile_definition_element=_token;
		_token=new Tokens.Rule.TileDefinitionElementToken();
		parse_tile_dimensions();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
				_furthestPosition=_position;
			}
			_position=_position_tile_definition_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_tile_definition_element.addAll(_token);
			_token_tile_definition_element.setValue(_token.getValue());
		}
		_token=_token_tile_definition_element;
		if(_state==FAILED) {
			support_names.reject(_position_tile_definition_element);
			association_names.reject(_position_tile_definition_element);
			room_names.reject(_position_tile_definition_element);
			activity_names.reject(_position_tile_definition_element);
			siding_names.reject(_position_tile_definition_element);
			item_names.reject(_position_tile_definition_element);
			aspect_names.reject(_position_tile_definition_element);
			affinity_names.reject(_position_tile_definition_element);
			activity_type_names.reject(_position_tile_definition_element);
			trail_names.reject(_position_tile_definition_element);
			attack_names.reject(_position_tile_definition_element);
			reason_names.reject(_position_tile_definition_element);
			trait_names.reject(_position_tile_definition_element);
			condition_names.reject(_position_tile_definition_element);
			payment_short_type_names.reject(_position_tile_definition_element);
			skill_names.reject(_position_tile_definition_element);
			map_names.reject(_position_tile_definition_element);
			event_names.reject(_position_tile_definition_element);
			image_names.reject(_position_tile_definition_element);
			tile_symbols.reject(_position_tile_definition_element);
			payment_long_type_names.reject(_position_tile_definition_element);
			area_names.reject(_position_tile_definition_element);
			structure_names.reject(_position_tile_definition_element);
			tile_names.reject(_position_tile_definition_element);
			hero_stat.reject(_position_tile_definition_element);
			_state=SUCCESS;
			_position_tile_definition_element=_position;
			_token_tile_definition_element=_token;
			_token=new Tokens.Rule.TileDefinitionElementToken();
			parse__anonymous_112();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
					_furthestPosition=_position;
				}
				_position=_position_tile_definition_element;
			}
			else {
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!=';') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_96.SYNTAX);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ;");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
						_furthestPosition=_position;
					}
					_position=_position_tile_definition_element;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_tile_definition_element.addAll(_token);
				_token_tile_definition_element.setValue(_token.getValue());
			}
			_token=_token_tile_definition_element;
			if(_state==FAILED) {
				support_names.reject(_position_tile_definition_element);
				association_names.reject(_position_tile_definition_element);
				room_names.reject(_position_tile_definition_element);
				activity_names.reject(_position_tile_definition_element);
				siding_names.reject(_position_tile_definition_element);
				item_names.reject(_position_tile_definition_element);
				aspect_names.reject(_position_tile_definition_element);
				affinity_names.reject(_position_tile_definition_element);
				activity_type_names.reject(_position_tile_definition_element);
				trail_names.reject(_position_tile_definition_element);
				attack_names.reject(_position_tile_definition_element);
				reason_names.reject(_position_tile_definition_element);
				trait_names.reject(_position_tile_definition_element);
				condition_names.reject(_position_tile_definition_element);
				payment_short_type_names.reject(_position_tile_definition_element);
				skill_names.reject(_position_tile_definition_element);
				map_names.reject(_position_tile_definition_element);
				event_names.reject(_position_tile_definition_element);
				image_names.reject(_position_tile_definition_element);
				tile_symbols.reject(_position_tile_definition_element);
				payment_long_type_names.reject(_position_tile_definition_element);
				area_names.reject(_position_tile_definition_element);
				structure_names.reject(_position_tile_definition_element);
				tile_names.reject(_position_tile_definition_element);
				hero_stat.reject(_position_tile_definition_element);
				_state=SUCCESS;
				_position_tile_definition_element=_position;
				_token_tile_definition_element=_token;
				_token=new Tokens.Rule.TileDefinitionElementToken();
				parse__anonymous_113();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
						_furthestPosition=_position;
					}
					_position=_position_tile_definition_element;
				}
				else {
					if(_position+1-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!=';') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_96.SYNTAX);
						_position=_position+1;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ;");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
							_furthestPosition=_position;
						}
						_position=_position_tile_definition_element;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_tile_definition_element.addAll(_token);
					_token_tile_definition_element.setValue(_token.getValue());
				}
				_token=_token_tile_definition_element;
				if(_state==FAILED) {
					support_names.reject(_position_tile_definition_element);
					association_names.reject(_position_tile_definition_element);
					room_names.reject(_position_tile_definition_element);
					activity_names.reject(_position_tile_definition_element);
					siding_names.reject(_position_tile_definition_element);
					item_names.reject(_position_tile_definition_element);
					aspect_names.reject(_position_tile_definition_element);
					affinity_names.reject(_position_tile_definition_element);
					activity_type_names.reject(_position_tile_definition_element);
					trail_names.reject(_position_tile_definition_element);
					attack_names.reject(_position_tile_definition_element);
					reason_names.reject(_position_tile_definition_element);
					trait_names.reject(_position_tile_definition_element);
					condition_names.reject(_position_tile_definition_element);
					payment_short_type_names.reject(_position_tile_definition_element);
					skill_names.reject(_position_tile_definition_element);
					map_names.reject(_position_tile_definition_element);
					event_names.reject(_position_tile_definition_element);
					image_names.reject(_position_tile_definition_element);
					tile_symbols.reject(_position_tile_definition_element);
					payment_long_type_names.reject(_position_tile_definition_element);
					area_names.reject(_position_tile_definition_element);
					structure_names.reject(_position_tile_definition_element);
					tile_names.reject(_position_tile_definition_element);
					hero_stat.reject(_position_tile_definition_element);
					_state=SUCCESS;
					_position_tile_definition_element=_position;
					_token_tile_definition_element=_token;
					_token=new Tokens.Rule.TileDefinitionElementToken();
					_token_NAME=_token;
					_token=new Tokens.Name.ImageNameToken();
					_position_NAME=_position;
					parse_NAME();
					if(_state==SUCCESS) {
						_token_NAME.add(_position_NAME,_token);
					}
					_token=_token_NAME;
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
							_furthestPosition=_position;
						}
						_position=_position_tile_definition_element;
					}
					else {
						int _state_147 = _state;
						while(_position<_inputLength) {
							parse__anonymous_115();
							if(_state==FAILED) {
								break;
							}
						}
						if(_state_147==SUCCESS&&_state==FAILED) {
							_state=SUCCESS;
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
								_furthestPosition=_position;
							}
							_position=_position_tile_definition_element;
						}
						else {
							if(_position+1-1 >=_inputLength) {
								_state=FAILED;
							}
							else {
								if(_inputArray[_position+0]!=';') {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,Tokens.Syntax.syntax_96.SYNTAX);
								_position=_position+1;
								while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
									++_position;
								}
							}
							else if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain ;");
									_furthestPosition=_position;
								}
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition_element(tile_definition_element)");
									_furthestPosition=_position;
								}
								_position=_position_tile_definition_element;
							}
							else {
							}
						}
					}
					if(_state==SUCCESS) {
						_token_tile_definition_element.addAll(_token);
						_token_tile_definition_element.setValue(_token.getValue());
					}
					_token=_token_tile_definition_element;
					if(_state==FAILED) {
						support_names.reject(_position_tile_definition_element);
						association_names.reject(_position_tile_definition_element);
						room_names.reject(_position_tile_definition_element);
						activity_names.reject(_position_tile_definition_element);
						siding_names.reject(_position_tile_definition_element);
						item_names.reject(_position_tile_definition_element);
						aspect_names.reject(_position_tile_definition_element);
						affinity_names.reject(_position_tile_definition_element);
						activity_type_names.reject(_position_tile_definition_element);
						trail_names.reject(_position_tile_definition_element);
						attack_names.reject(_position_tile_definition_element);
						reason_names.reject(_position_tile_definition_element);
						trait_names.reject(_position_tile_definition_element);
						condition_names.reject(_position_tile_definition_element);
						payment_short_type_names.reject(_position_tile_definition_element);
						skill_names.reject(_position_tile_definition_element);
						map_names.reject(_position_tile_definition_element);
						event_names.reject(_position_tile_definition_element);
						image_names.reject(_position_tile_definition_element);
						tile_symbols.reject(_position_tile_definition_element);
						payment_long_type_names.reject(_position_tile_definition_element);
						area_names.reject(_position_tile_definition_element);
						structure_names.reject(_position_tile_definition_element);
						tile_names.reject(_position_tile_definition_element);
						hero_stat.reject(_position_tile_definition_element);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_tile_definition_element);
						association_names.accept(_position_tile_definition_element);
						room_names.accept(_position_tile_definition_element);
						activity_names.accept(_position_tile_definition_element);
						siding_names.accept(_position_tile_definition_element);
						item_names.accept(_position_tile_definition_element);
						aspect_names.accept(_position_tile_definition_element);
						affinity_names.accept(_position_tile_definition_element);
						activity_type_names.accept(_position_tile_definition_element);
						trail_names.accept(_position_tile_definition_element);
						attack_names.accept(_position_tile_definition_element);
						reason_names.accept(_position_tile_definition_element);
						trait_names.accept(_position_tile_definition_element);
						condition_names.accept(_position_tile_definition_element);
						payment_short_type_names.accept(_position_tile_definition_element);
						skill_names.accept(_position_tile_definition_element);
						map_names.accept(_position_tile_definition_element);
						event_names.accept(_position_tile_definition_element);
						image_names.accept(_position_tile_definition_element);
						tile_symbols.accept(_position_tile_definition_element);
						payment_long_type_names.accept(_position_tile_definition_element);
						area_names.accept(_position_tile_definition_element);
						structure_names.accept(_position_tile_definition_element);
						tile_names.accept(_position_tile_definition_element);
						hero_stat.accept(_position_tile_definition_element);
					}
				}
			}
		}
	}
	public void parse_tile_definition() {
		int _position_tile_definition = -1;
		Token.Parsed _token_tile_definition = null;
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
		_position_tile_definition=_position;
		_token_tile_definition=_token;
		_token=new Tokens.Rule.TileDefinitionToken();
		int _state_142 = _state;
		parse__anonymous_107();
		if(_state_142==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition(tile_definition)");
				_furthestPosition=_position;
			}
			_position=_position_tile_definition;
		}
		else {
			parse_NAME();
			if(_state==SUCCESS) {
				String _value = _token.getLastValue();
				if(_value!=null) {
					tile_names.add(_value);
				}
				_token.add(_position,new Tokens.Name.TileNameToken(_value));
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition(tile_definition)");
					_furthestPosition=_position;
				}
				_position=_position_tile_definition;
			}
			else {
				int _state_144 = _state;
				while(_position<_inputLength) {
					parse_tile_definition_element();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_144==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition(tile_definition)");
						_furthestPosition=_position;
					}
					_position=_position_tile_definition;
				}
				else {
					int _state_145 = _state;
					while(_position<_inputLength) {
						parse_tile_element();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_145==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_definition(tile_definition)");
							_furthestPosition=_position;
						}
						_position=_position_tile_definition;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_tile_definition.add(_position_tile_definition,_token);
		}
		_token=_token_tile_definition;
		if(_state==FAILED) {
			support_names.reject(_position_tile_definition);
			association_names.reject(_position_tile_definition);
			room_names.reject(_position_tile_definition);
			activity_names.reject(_position_tile_definition);
			siding_names.reject(_position_tile_definition);
			item_names.reject(_position_tile_definition);
			aspect_names.reject(_position_tile_definition);
			affinity_names.reject(_position_tile_definition);
			activity_type_names.reject(_position_tile_definition);
			trail_names.reject(_position_tile_definition);
			attack_names.reject(_position_tile_definition);
			reason_names.reject(_position_tile_definition);
			trait_names.reject(_position_tile_definition);
			condition_names.reject(_position_tile_definition);
			payment_short_type_names.reject(_position_tile_definition);
			skill_names.reject(_position_tile_definition);
			map_names.reject(_position_tile_definition);
			event_names.reject(_position_tile_definition);
			image_names.reject(_position_tile_definition);
			tile_symbols.reject(_position_tile_definition);
			payment_long_type_names.reject(_position_tile_definition);
			area_names.reject(_position_tile_definition);
			structure_names.reject(_position_tile_definition);
			tile_names.reject(_position_tile_definition);
			hero_stat.reject(_position_tile_definition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_tile_definition);
			association_names.accept(_position_tile_definition);
			room_names.accept(_position_tile_definition);
			activity_names.accept(_position_tile_definition);
			siding_names.accept(_position_tile_definition);
			item_names.accept(_position_tile_definition);
			aspect_names.accept(_position_tile_definition);
			affinity_names.accept(_position_tile_definition);
			activity_type_names.accept(_position_tile_definition);
			trail_names.accept(_position_tile_definition);
			attack_names.accept(_position_tile_definition);
			reason_names.accept(_position_tile_definition);
			trait_names.accept(_position_tile_definition);
			condition_names.accept(_position_tile_definition);
			payment_short_type_names.accept(_position_tile_definition);
			skill_names.accept(_position_tile_definition);
			map_names.accept(_position_tile_definition);
			event_names.accept(_position_tile_definition);
			image_names.accept(_position_tile_definition);
			tile_symbols.accept(_position_tile_definition);
			payment_long_type_names.accept(_position_tile_definition);
			area_names.accept(_position_tile_definition);
			structure_names.accept(_position_tile_definition);
			tile_names.accept(_position_tile_definition);
			hero_stat.accept(_position_tile_definition);
		}
	}
	public void parse_tile_element() {
		int _position_tile_element = -1;
		Token.Parsed _token_tile_element = null;
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
		_position_tile_element=_position;
		_token_tile_element=_token;
		_token=new Tokens.Rule.TileElementToken();
		parse_comments();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_element(tile_element)");
				_furthestPosition=_position;
			}
			_position=_position_tile_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_tile_element.addAll(_token);
			_token_tile_element.setValue(_token.getValue());
		}
		_token=_token_tile_element;
		if(_state==FAILED) {
			support_names.reject(_position_tile_element);
			association_names.reject(_position_tile_element);
			room_names.reject(_position_tile_element);
			activity_names.reject(_position_tile_element);
			siding_names.reject(_position_tile_element);
			item_names.reject(_position_tile_element);
			aspect_names.reject(_position_tile_element);
			affinity_names.reject(_position_tile_element);
			activity_type_names.reject(_position_tile_element);
			trail_names.reject(_position_tile_element);
			attack_names.reject(_position_tile_element);
			reason_names.reject(_position_tile_element);
			trait_names.reject(_position_tile_element);
			condition_names.reject(_position_tile_element);
			payment_short_type_names.reject(_position_tile_element);
			skill_names.reject(_position_tile_element);
			map_names.reject(_position_tile_element);
			event_names.reject(_position_tile_element);
			image_names.reject(_position_tile_element);
			tile_symbols.reject(_position_tile_element);
			payment_long_type_names.reject(_position_tile_element);
			area_names.reject(_position_tile_element);
			structure_names.reject(_position_tile_element);
			tile_names.reject(_position_tile_element);
			hero_stat.reject(_position_tile_element);
			_state=SUCCESS;
			_position_tile_element=_position;
			_token_tile_element=_token;
			_token=new Tokens.Rule.TileElementToken();
			if(_position+2-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='\n'&&_inputArray[_position+0]!='\r') {
					_state=FAILED;
				}
				if(_inputArray[_position+1]!='\t') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_5.SYNTAX);
				_position=_position+2;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain \n\t");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_element(tile_element)");
					_furthestPosition=_position;
				}
				_position=_position_tile_element;
			}
			else {
				parse_edge_definition();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_element(tile_element)");
						_furthestPosition=_position;
					}
					_position=_position_tile_element;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_tile_element.addAll(_token);
				_token_tile_element.setValue(_token.getValue());
			}
			_token=_token_tile_element;
			if(_state==FAILED) {
				support_names.reject(_position_tile_element);
				association_names.reject(_position_tile_element);
				room_names.reject(_position_tile_element);
				activity_names.reject(_position_tile_element);
				siding_names.reject(_position_tile_element);
				item_names.reject(_position_tile_element);
				aspect_names.reject(_position_tile_element);
				affinity_names.reject(_position_tile_element);
				activity_type_names.reject(_position_tile_element);
				trail_names.reject(_position_tile_element);
				attack_names.reject(_position_tile_element);
				reason_names.reject(_position_tile_element);
				trait_names.reject(_position_tile_element);
				condition_names.reject(_position_tile_element);
				payment_short_type_names.reject(_position_tile_element);
				skill_names.reject(_position_tile_element);
				map_names.reject(_position_tile_element);
				event_names.reject(_position_tile_element);
				image_names.reject(_position_tile_element);
				tile_symbols.reject(_position_tile_element);
				payment_long_type_names.reject(_position_tile_element);
				area_names.reject(_position_tile_element);
				structure_names.reject(_position_tile_element);
				tile_names.reject(_position_tile_element);
				hero_stat.reject(_position_tile_element);
				_state=SUCCESS;
				_position_tile_element=_position;
				_token_tile_element=_token;
				_token=new Tokens.Rule.TileElementToken();
				if(_position+2-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='\n'&&_inputArray[_position+0]!='\r') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='\t') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_5.SYNTAX);
					_position=_position+2;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain \n\t");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_element(tile_element)");
						_furthestPosition=_position;
					}
					_position=_position_tile_element;
				}
				else {
					parse__anonymous_116();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_element(tile_element)");
							_furthestPosition=_position;
						}
						_position=_position_tile_element;
					}
					else {
					}
				}
				if(_state==SUCCESS) {
					_token_tile_element.addAll(_token);
					_token_tile_element.setValue(_token.getValue());
				}
				_token=_token_tile_element;
				if(_state==FAILED) {
					support_names.reject(_position_tile_element);
					association_names.reject(_position_tile_element);
					room_names.reject(_position_tile_element);
					activity_names.reject(_position_tile_element);
					siding_names.reject(_position_tile_element);
					item_names.reject(_position_tile_element);
					aspect_names.reject(_position_tile_element);
					affinity_names.reject(_position_tile_element);
					activity_type_names.reject(_position_tile_element);
					trail_names.reject(_position_tile_element);
					attack_names.reject(_position_tile_element);
					reason_names.reject(_position_tile_element);
					trait_names.reject(_position_tile_element);
					condition_names.reject(_position_tile_element);
					payment_short_type_names.reject(_position_tile_element);
					skill_names.reject(_position_tile_element);
					map_names.reject(_position_tile_element);
					event_names.reject(_position_tile_element);
					image_names.reject(_position_tile_element);
					tile_symbols.reject(_position_tile_element);
					payment_long_type_names.reject(_position_tile_element);
					area_names.reject(_position_tile_element);
					structure_names.reject(_position_tile_element);
					tile_names.reject(_position_tile_element);
					hero_stat.reject(_position_tile_element);
					_state=SUCCESS;
					_position_tile_element=_position;
					_token_tile_element=_token;
					_token=new Tokens.Rule.TileElementToken();
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
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_element(tile_element)");
							_furthestPosition=_position;
						}
						_position=_position_tile_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_tile_element.addAll(_token);
						_token_tile_element.setValue(_token.getValue());
					}
					_token=_token_tile_element;
					if(_state==FAILED) {
						support_names.reject(_position_tile_element);
						association_names.reject(_position_tile_element);
						room_names.reject(_position_tile_element);
						activity_names.reject(_position_tile_element);
						siding_names.reject(_position_tile_element);
						item_names.reject(_position_tile_element);
						aspect_names.reject(_position_tile_element);
						affinity_names.reject(_position_tile_element);
						activity_type_names.reject(_position_tile_element);
						trail_names.reject(_position_tile_element);
						attack_names.reject(_position_tile_element);
						reason_names.reject(_position_tile_element);
						trait_names.reject(_position_tile_element);
						condition_names.reject(_position_tile_element);
						payment_short_type_names.reject(_position_tile_element);
						skill_names.reject(_position_tile_element);
						map_names.reject(_position_tile_element);
						event_names.reject(_position_tile_element);
						image_names.reject(_position_tile_element);
						tile_symbols.reject(_position_tile_element);
						payment_long_type_names.reject(_position_tile_element);
						area_names.reject(_position_tile_element);
						structure_names.reject(_position_tile_element);
						tile_names.reject(_position_tile_element);
						hero_stat.reject(_position_tile_element);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_tile_element);
						association_names.accept(_position_tile_element);
						room_names.accept(_position_tile_element);
						activity_names.accept(_position_tile_element);
						siding_names.accept(_position_tile_element);
						item_names.accept(_position_tile_element);
						aspect_names.accept(_position_tile_element);
						affinity_names.accept(_position_tile_element);
						activity_type_names.accept(_position_tile_element);
						trail_names.accept(_position_tile_element);
						attack_names.accept(_position_tile_element);
						reason_names.accept(_position_tile_element);
						trait_names.accept(_position_tile_element);
						condition_names.accept(_position_tile_element);
						payment_short_type_names.accept(_position_tile_element);
						skill_names.accept(_position_tile_element);
						map_names.accept(_position_tile_element);
						event_names.accept(_position_tile_element);
						image_names.accept(_position_tile_element);
						tile_symbols.accept(_position_tile_element);
						payment_long_type_names.accept(_position_tile_element);
						area_names.accept(_position_tile_element);
						structure_names.accept(_position_tile_element);
						tile_names.accept(_position_tile_element);
						hero_stat.accept(_position_tile_element);
					}
				}
			}
		}
	}
	public void parse_tile_cost() {
		int _position_tile_cost = -1;
		Token.Parsed _token_tile_cost = null;
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
		_position_tile_cost=_position;
		_token_tile_cost=_token;
		_token=new Tokens.Rule.TileCostToken();
		if(_position+4-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='F') {
				_state=FAILED;
			}
			if(_inputArray[_position+1]!='r') {
				_state=FAILED;
			}
			if(_inputArray[_position+2]!='e') {
				_state=FAILED;
			}
			if(_inputArray[_position+3]!='e') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_97.FREE);
			_position=_position+4;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain Free");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_cost(tile_cost)");
				_furthestPosition=_position;
			}
			_position=_position_tile_cost;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_tile_cost.add(_position_tile_cost,_token);
		}
		_token=_token_tile_cost;
		if(_state==FAILED) {
			support_names.reject(_position_tile_cost);
			association_names.reject(_position_tile_cost);
			room_names.reject(_position_tile_cost);
			activity_names.reject(_position_tile_cost);
			siding_names.reject(_position_tile_cost);
			item_names.reject(_position_tile_cost);
			aspect_names.reject(_position_tile_cost);
			affinity_names.reject(_position_tile_cost);
			activity_type_names.reject(_position_tile_cost);
			trail_names.reject(_position_tile_cost);
			attack_names.reject(_position_tile_cost);
			reason_names.reject(_position_tile_cost);
			trait_names.reject(_position_tile_cost);
			condition_names.reject(_position_tile_cost);
			payment_short_type_names.reject(_position_tile_cost);
			skill_names.reject(_position_tile_cost);
			map_names.reject(_position_tile_cost);
			event_names.reject(_position_tile_cost);
			image_names.reject(_position_tile_cost);
			tile_symbols.reject(_position_tile_cost);
			payment_long_type_names.reject(_position_tile_cost);
			area_names.reject(_position_tile_cost);
			structure_names.reject(_position_tile_cost);
			tile_names.reject(_position_tile_cost);
			hero_stat.reject(_position_tile_cost);
			_state=SUCCESS;
			_position_tile_cost=_position;
			_token_tile_cost=_token;
			_token=new Tokens.Rule.TileCostToken();
			int _state_149 = _state;
			_token_INTEGER=_token;
			_token=new Tokens.Name.PaymentToken();
			_position_INTEGER=_position;
			parse_INTEGER();
			if(_state==SUCCESS) {
				_token_INTEGER.add(_position_INTEGER,_token);
			}
			_token=_token_INTEGER;
			if(_state_149==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_cost(tile_cost)");
					_furthestPosition=_position;
				}
				_position=_position_tile_cost;
			}
			else {
				parse_tile_payment_type();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_cost(tile_cost)");
						_furthestPosition=_position;
					}
					_position=_position_tile_cost;
				}
				else {
					int _state_150 = _state;
					parse__anonymous_118();
					if(_state_150==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"tile_cost(tile_cost)");
							_furthestPosition=_position;
						}
						_position=_position_tile_cost;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_tile_cost.add(_position_tile_cost,_token);
			}
			_token=_token_tile_cost;
			if(_state==FAILED) {
				support_names.reject(_position_tile_cost);
				association_names.reject(_position_tile_cost);
				room_names.reject(_position_tile_cost);
				activity_names.reject(_position_tile_cost);
				siding_names.reject(_position_tile_cost);
				item_names.reject(_position_tile_cost);
				aspect_names.reject(_position_tile_cost);
				affinity_names.reject(_position_tile_cost);
				activity_type_names.reject(_position_tile_cost);
				trail_names.reject(_position_tile_cost);
				attack_names.reject(_position_tile_cost);
				reason_names.reject(_position_tile_cost);
				trait_names.reject(_position_tile_cost);
				condition_names.reject(_position_tile_cost);
				payment_short_type_names.reject(_position_tile_cost);
				skill_names.reject(_position_tile_cost);
				map_names.reject(_position_tile_cost);
				event_names.reject(_position_tile_cost);
				image_names.reject(_position_tile_cost);
				tile_symbols.reject(_position_tile_cost);
				payment_long_type_names.reject(_position_tile_cost);
				area_names.reject(_position_tile_cost);
				structure_names.reject(_position_tile_cost);
				tile_names.reject(_position_tile_cost);
				hero_stat.reject(_position_tile_cost);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_tile_cost);
				association_names.accept(_position_tile_cost);
				room_names.accept(_position_tile_cost);
				activity_names.accept(_position_tile_cost);
				siding_names.accept(_position_tile_cost);
				item_names.accept(_position_tile_cost);
				aspect_names.accept(_position_tile_cost);
				affinity_names.accept(_position_tile_cost);
				activity_type_names.accept(_position_tile_cost);
				trail_names.accept(_position_tile_cost);
				attack_names.accept(_position_tile_cost);
				reason_names.accept(_position_tile_cost);
				trait_names.accept(_position_tile_cost);
				condition_names.accept(_position_tile_cost);
				payment_short_type_names.accept(_position_tile_cost);
				skill_names.accept(_position_tile_cost);
				map_names.accept(_position_tile_cost);
				event_names.accept(_position_tile_cost);
				image_names.accept(_position_tile_cost);
				tile_symbols.accept(_position_tile_cost);
				payment_long_type_names.accept(_position_tile_cost);
				area_names.accept(_position_tile_cost);
				structure_names.accept(_position_tile_cost);
				tile_names.accept(_position_tile_cost);
				hero_stat.accept(_position_tile_cost);
			}
		}
	}
}