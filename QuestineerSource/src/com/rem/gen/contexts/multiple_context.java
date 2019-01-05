package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.number_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class multiple_context extends number_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public multiple_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public multiple_context() {
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
	public void parse_multiple_drawable_declaration() {
		int _position_multiple_drawable_declaration = -1;
		Token.Parsed _token_multiple_drawable_declaration = null;
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
		_position_multiple_drawable_declaration=_position;
		_token_multiple_drawable_declaration=_token;
		_token=new Tokens.Rule.MultipleDrawableDeclarationToken();
		int _state_243 = _state;
		boolean _iteration_achieved_243 = false;
		while(_position<_inputLength) {
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='*') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_19.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain *");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				break;
			}
			else {
				_iteration_achieved_243=true;
			}
		}
		if(_iteration_achieved_243==false) {
			_state=FAILED;
		}
		else if(_state_243==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_declaration(multiple_drawable_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_multiple_drawable_declaration;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.MultipleNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_declaration(multiple_drawable_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_multiple_drawable_declaration;
			}
			else {
				int _state_244 = _state;
				boolean _iteration_achieved_244 = false;
				while(_position<_inputLength) {
					if(_position+1-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='*') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_19.SYNTAX);
						_position=_position+1;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain *");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						break;
					}
					else {
						_iteration_achieved_244=true;
					}
				}
				if(_iteration_achieved_244==false) {
					_state=FAILED;
				}
				else if(_state_244==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_declaration(multiple_drawable_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_multiple_drawable_declaration;
				}
				else {
					int _state_245 = _state;
					boolean _iteration_achieved_245 = false;
					while(_position<_inputLength) {
						parse_drawable_multiple_element();
						if(_state==FAILED) {
							break;
						}
						else {
							_iteration_achieved_245=true;
						}
					}
					if(_iteration_achieved_245==false) {
						_state=FAILED;
					}
					else if(_state_245==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_declaration(multiple_drawable_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_multiple_drawable_declaration;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_multiple_drawable_declaration.add(_position_multiple_drawable_declaration,_token);
		}
		_token=_token_multiple_drawable_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_multiple_drawable_declaration);
			association_names.reject(_position_multiple_drawable_declaration);
			room_names.reject(_position_multiple_drawable_declaration);
			activity_names.reject(_position_multiple_drawable_declaration);
			siding_names.reject(_position_multiple_drawable_declaration);
			item_names.reject(_position_multiple_drawable_declaration);
			aspect_names.reject(_position_multiple_drawable_declaration);
			affinity_names.reject(_position_multiple_drawable_declaration);
			activity_type_names.reject(_position_multiple_drawable_declaration);
			trail_names.reject(_position_multiple_drawable_declaration);
			attack_names.reject(_position_multiple_drawable_declaration);
			reason_names.reject(_position_multiple_drawable_declaration);
			trait_names.reject(_position_multiple_drawable_declaration);
			condition_names.reject(_position_multiple_drawable_declaration);
			payment_short_type_names.reject(_position_multiple_drawable_declaration);
			skill_names.reject(_position_multiple_drawable_declaration);
			map_names.reject(_position_multiple_drawable_declaration);
			event_names.reject(_position_multiple_drawable_declaration);
			image_names.reject(_position_multiple_drawable_declaration);
			tile_symbols.reject(_position_multiple_drawable_declaration);
			payment_long_type_names.reject(_position_multiple_drawable_declaration);
			area_names.reject(_position_multiple_drawable_declaration);
			structure_names.reject(_position_multiple_drawable_declaration);
			tile_names.reject(_position_multiple_drawable_declaration);
			hero_stat.reject(_position_multiple_drawable_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_multiple_drawable_declaration);
			association_names.accept(_position_multiple_drawable_declaration);
			room_names.accept(_position_multiple_drawable_declaration);
			activity_names.accept(_position_multiple_drawable_declaration);
			siding_names.accept(_position_multiple_drawable_declaration);
			item_names.accept(_position_multiple_drawable_declaration);
			aspect_names.accept(_position_multiple_drawable_declaration);
			affinity_names.accept(_position_multiple_drawable_declaration);
			activity_type_names.accept(_position_multiple_drawable_declaration);
			trail_names.accept(_position_multiple_drawable_declaration);
			attack_names.accept(_position_multiple_drawable_declaration);
			reason_names.accept(_position_multiple_drawable_declaration);
			trait_names.accept(_position_multiple_drawable_declaration);
			condition_names.accept(_position_multiple_drawable_declaration);
			payment_short_type_names.accept(_position_multiple_drawable_declaration);
			skill_names.accept(_position_multiple_drawable_declaration);
			map_names.accept(_position_multiple_drawable_declaration);
			event_names.accept(_position_multiple_drawable_declaration);
			image_names.accept(_position_multiple_drawable_declaration);
			tile_symbols.accept(_position_multiple_drawable_declaration);
			payment_long_type_names.accept(_position_multiple_drawable_declaration);
			area_names.accept(_position_multiple_drawable_declaration);
			structure_names.accept(_position_multiple_drawable_declaration);
			tile_names.accept(_position_multiple_drawable_declaration);
			hero_stat.accept(_position_multiple_drawable_declaration);
		}
	}
	public void parse_multiple_drawable_points() {
		int _position_multiple_drawable_points = -1;
		Token.Parsed _token_multiple_drawable_points = null;
		int _position_INTEGER = -1;
		Token.Parsed _token_INTEGER = null;
		int _length_multiple_drawable_points_brace = _inputLength;
		if(brace_3.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_3.get(_position);
			int _position_multiple_drawable_points_brace = _position;
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
			_position_multiple_drawable_points=_position;
			_token_multiple_drawable_points=_token;
			_token=new Tokens.Rule.MultipleDrawablePointsToken();
			_token_INTEGER=_token;
			_token=new Tokens.Name.PointToken();
			_position_INTEGER=_position;
			parse_INTEGER();
			if(_state==SUCCESS) {
				_token_INTEGER.add(_position_INTEGER,_token);
			}
			_token=_token_INTEGER;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_points(multiple_drawable_points)");
					_furthestPosition=_position;
				}
				_position=_position_multiple_drawable_points;
			}
			else {
				int _state_248 = _state;
				while(_position<_inputLength) {
					parse__anonymous_223();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_248==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_points(multiple_drawable_points)");
						_furthestPosition=_position;
					}
					_position=_position_multiple_drawable_points;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_multiple_drawable_points.add(_position_multiple_drawable_points,_token);
			}
			_token=_token_multiple_drawable_points;
			if(_state==SUCCESS&&brace_3.get(_position_multiple_drawable_points_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("multiple_drawable_points",_position,_lineNumberRanges));
				_position=brace_3.get(_position_multiple_drawable_points_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_multiple_drawable_points_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_multiple_drawable_points);
				association_names.reject(_position_multiple_drawable_points);
				room_names.reject(_position_multiple_drawable_points);
				activity_names.reject(_position_multiple_drawable_points);
				siding_names.reject(_position_multiple_drawable_points);
				item_names.reject(_position_multiple_drawable_points);
				aspect_names.reject(_position_multiple_drawable_points);
				affinity_names.reject(_position_multiple_drawable_points);
				activity_type_names.reject(_position_multiple_drawable_points);
				trail_names.reject(_position_multiple_drawable_points);
				attack_names.reject(_position_multiple_drawable_points);
				reason_names.reject(_position_multiple_drawable_points);
				trait_names.reject(_position_multiple_drawable_points);
				condition_names.reject(_position_multiple_drawable_points);
				payment_short_type_names.reject(_position_multiple_drawable_points);
				skill_names.reject(_position_multiple_drawable_points);
				map_names.reject(_position_multiple_drawable_points);
				event_names.reject(_position_multiple_drawable_points);
				image_names.reject(_position_multiple_drawable_points);
				tile_symbols.reject(_position_multiple_drawable_points);
				payment_long_type_names.reject(_position_multiple_drawable_points);
				area_names.reject(_position_multiple_drawable_points);
				structure_names.reject(_position_multiple_drawable_points);
				tile_names.reject(_position_multiple_drawable_points);
				hero_stat.reject(_position_multiple_drawable_points);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_multiple_drawable_points);
				association_names.accept(_position_multiple_drawable_points);
				room_names.accept(_position_multiple_drawable_points);
				activity_names.accept(_position_multiple_drawable_points);
				siding_names.accept(_position_multiple_drawable_points);
				item_names.accept(_position_multiple_drawable_points);
				aspect_names.accept(_position_multiple_drawable_points);
				affinity_names.accept(_position_multiple_drawable_points);
				activity_type_names.accept(_position_multiple_drawable_points);
				trail_names.accept(_position_multiple_drawable_points);
				attack_names.accept(_position_multiple_drawable_points);
				reason_names.accept(_position_multiple_drawable_points);
				trait_names.accept(_position_multiple_drawable_points);
				condition_names.accept(_position_multiple_drawable_points);
				payment_short_type_names.accept(_position_multiple_drawable_points);
				skill_names.accept(_position_multiple_drawable_points);
				map_names.accept(_position_multiple_drawable_points);
				event_names.accept(_position_multiple_drawable_points);
				image_names.accept(_position_multiple_drawable_points);
				tile_symbols.accept(_position_multiple_drawable_points);
				payment_long_type_names.accept(_position_multiple_drawable_points);
				area_names.accept(_position_multiple_drawable_points);
				structure_names.accept(_position_multiple_drawable_points);
				tile_names.accept(_position_multiple_drawable_points);
				hero_stat.accept(_position_multiple_drawable_points);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"multiple_drawable_points(multiple_drawable_points)");
				_furthestPosition=_position;
			}
		}
	}
}