package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.conditional_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class drawable_context extends conditional_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public drawable_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public drawable_context() {
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
	public void parse_drawable_grid_element() {
		int _position_drawable_grid_element = -1;
		Token.Parsed _token_drawable_grid_element = null;
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
		_position_drawable_grid_element=_position;
		_token_drawable_grid_element=_token;
		_token=new Tokens.Rule.DrawableGridElementToken();
		parse_multiple_drawable_points();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_grid_element(drawable_grid_element)");
				_furthestPosition=_position;
			}
			_position=_position_drawable_grid_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_drawable_grid_element.add(_position_drawable_grid_element,_token);
		}
		_token=_token_drawable_grid_element;
		if(_state==FAILED) {
			support_names.reject(_position_drawable_grid_element);
			association_names.reject(_position_drawable_grid_element);
			room_names.reject(_position_drawable_grid_element);
			activity_names.reject(_position_drawable_grid_element);
			siding_names.reject(_position_drawable_grid_element);
			item_names.reject(_position_drawable_grid_element);
			aspect_names.reject(_position_drawable_grid_element);
			affinity_names.reject(_position_drawable_grid_element);
			activity_type_names.reject(_position_drawable_grid_element);
			trail_names.reject(_position_drawable_grid_element);
			attack_names.reject(_position_drawable_grid_element);
			reason_names.reject(_position_drawable_grid_element);
			trait_names.reject(_position_drawable_grid_element);
			condition_names.reject(_position_drawable_grid_element);
			payment_short_type_names.reject(_position_drawable_grid_element);
			skill_names.reject(_position_drawable_grid_element);
			map_names.reject(_position_drawable_grid_element);
			event_names.reject(_position_drawable_grid_element);
			image_names.reject(_position_drawable_grid_element);
			tile_symbols.reject(_position_drawable_grid_element);
			payment_long_type_names.reject(_position_drawable_grid_element);
			area_names.reject(_position_drawable_grid_element);
			structure_names.reject(_position_drawable_grid_element);
			tile_names.reject(_position_drawable_grid_element);
			hero_stat.reject(_position_drawable_grid_element);
			_state=SUCCESS;
			_position_drawable_grid_element=_position;
			_token_drawable_grid_element=_token;
			_token=new Tokens.Rule.DrawableGridElementToken();
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_grid_element(drawable_grid_element)");
					_furthestPosition=_position;
				}
				_position=_position_drawable_grid_element;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_drawable_grid_element.add(_position_drawable_grid_element,_token);
			}
			_token=_token_drawable_grid_element;
			if(_state==FAILED) {
				support_names.reject(_position_drawable_grid_element);
				association_names.reject(_position_drawable_grid_element);
				room_names.reject(_position_drawable_grid_element);
				activity_names.reject(_position_drawable_grid_element);
				siding_names.reject(_position_drawable_grid_element);
				item_names.reject(_position_drawable_grid_element);
				aspect_names.reject(_position_drawable_grid_element);
				affinity_names.reject(_position_drawable_grid_element);
				activity_type_names.reject(_position_drawable_grid_element);
				trail_names.reject(_position_drawable_grid_element);
				attack_names.reject(_position_drawable_grid_element);
				reason_names.reject(_position_drawable_grid_element);
				trait_names.reject(_position_drawable_grid_element);
				condition_names.reject(_position_drawable_grid_element);
				payment_short_type_names.reject(_position_drawable_grid_element);
				skill_names.reject(_position_drawable_grid_element);
				map_names.reject(_position_drawable_grid_element);
				event_names.reject(_position_drawable_grid_element);
				image_names.reject(_position_drawable_grid_element);
				tile_symbols.reject(_position_drawable_grid_element);
				payment_long_type_names.reject(_position_drawable_grid_element);
				area_names.reject(_position_drawable_grid_element);
				structure_names.reject(_position_drawable_grid_element);
				tile_names.reject(_position_drawable_grid_element);
				hero_stat.reject(_position_drawable_grid_element);
				_state=SUCCESS;
				_position_drawable_grid_element=_position;
				_token_drawable_grid_element=_token;
				_token=new Tokens.Rule.DrawableGridElementToken();
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='\n'&&_inputArray[_position+0]!='\r') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_1.endLine);
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_grid_element(drawable_grid_element)");
						_furthestPosition=_position;
					}
					_position=_position_drawable_grid_element;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_drawable_grid_element.add(_position_drawable_grid_element,_token);
				}
				_token=_token_drawable_grid_element;
				if(_state==FAILED) {
					support_names.reject(_position_drawable_grid_element);
					association_names.reject(_position_drawable_grid_element);
					room_names.reject(_position_drawable_grid_element);
					activity_names.reject(_position_drawable_grid_element);
					siding_names.reject(_position_drawable_grid_element);
					item_names.reject(_position_drawable_grid_element);
					aspect_names.reject(_position_drawable_grid_element);
					affinity_names.reject(_position_drawable_grid_element);
					activity_type_names.reject(_position_drawable_grid_element);
					trail_names.reject(_position_drawable_grid_element);
					attack_names.reject(_position_drawable_grid_element);
					reason_names.reject(_position_drawable_grid_element);
					trait_names.reject(_position_drawable_grid_element);
					condition_names.reject(_position_drawable_grid_element);
					payment_short_type_names.reject(_position_drawable_grid_element);
					skill_names.reject(_position_drawable_grid_element);
					map_names.reject(_position_drawable_grid_element);
					event_names.reject(_position_drawable_grid_element);
					image_names.reject(_position_drawable_grid_element);
					tile_symbols.reject(_position_drawable_grid_element);
					payment_long_type_names.reject(_position_drawable_grid_element);
					area_names.reject(_position_drawable_grid_element);
					structure_names.reject(_position_drawable_grid_element);
					tile_names.reject(_position_drawable_grid_element);
					hero_stat.reject(_position_drawable_grid_element);
					_state=SUCCESS;
					_position_drawable_grid_element=_position;
					_token_drawable_grid_element=_token;
					_token=new Tokens.Rule.DrawableGridElementToken();
					if(_position+1-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='.') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_69.space);
						_position=_position+1;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_grid_element(drawable_grid_element)");
							_furthestPosition=_position;
						}
						_position=_position_drawable_grid_element;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_drawable_grid_element.add(_position_drawable_grid_element,_token);
					}
					_token=_token_drawable_grid_element;
					if(_state==FAILED) {
						support_names.reject(_position_drawable_grid_element);
						association_names.reject(_position_drawable_grid_element);
						room_names.reject(_position_drawable_grid_element);
						activity_names.reject(_position_drawable_grid_element);
						siding_names.reject(_position_drawable_grid_element);
						item_names.reject(_position_drawable_grid_element);
						aspect_names.reject(_position_drawable_grid_element);
						affinity_names.reject(_position_drawable_grid_element);
						activity_type_names.reject(_position_drawable_grid_element);
						trail_names.reject(_position_drawable_grid_element);
						attack_names.reject(_position_drawable_grid_element);
						reason_names.reject(_position_drawable_grid_element);
						trait_names.reject(_position_drawable_grid_element);
						condition_names.reject(_position_drawable_grid_element);
						payment_short_type_names.reject(_position_drawable_grid_element);
						skill_names.reject(_position_drawable_grid_element);
						map_names.reject(_position_drawable_grid_element);
						event_names.reject(_position_drawable_grid_element);
						image_names.reject(_position_drawable_grid_element);
						tile_symbols.reject(_position_drawable_grid_element);
						payment_long_type_names.reject(_position_drawable_grid_element);
						area_names.reject(_position_drawable_grid_element);
						structure_names.reject(_position_drawable_grid_element);
						tile_names.reject(_position_drawable_grid_element);
						hero_stat.reject(_position_drawable_grid_element);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_drawable_grid_element);
						association_names.accept(_position_drawable_grid_element);
						room_names.accept(_position_drawable_grid_element);
						activity_names.accept(_position_drawable_grid_element);
						siding_names.accept(_position_drawable_grid_element);
						item_names.accept(_position_drawable_grid_element);
						aspect_names.accept(_position_drawable_grid_element);
						affinity_names.accept(_position_drawable_grid_element);
						activity_type_names.accept(_position_drawable_grid_element);
						trail_names.accept(_position_drawable_grid_element);
						attack_names.accept(_position_drawable_grid_element);
						reason_names.accept(_position_drawable_grid_element);
						trait_names.accept(_position_drawable_grid_element);
						condition_names.accept(_position_drawable_grid_element);
						payment_short_type_names.accept(_position_drawable_grid_element);
						skill_names.accept(_position_drawable_grid_element);
						map_names.accept(_position_drawable_grid_element);
						event_names.accept(_position_drawable_grid_element);
						image_names.accept(_position_drawable_grid_element);
						tile_symbols.accept(_position_drawable_grid_element);
						payment_long_type_names.accept(_position_drawable_grid_element);
						area_names.accept(_position_drawable_grid_element);
						structure_names.accept(_position_drawable_grid_element);
						tile_names.accept(_position_drawable_grid_element);
						hero_stat.accept(_position_drawable_grid_element);
					}
				}
			}
		}
	}
	public void parse_drawable_arthmetic_operator() {
		int _position_drawable_arthmetic_operator = -1;
		Token.Parsed _token_drawable_arthmetic_operator = null;
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
		_position_drawable_arthmetic_operator=_position;
		_token_drawable_arthmetic_operator=_token;
		_token=new Tokens.Rule.DrawableArthmeticOperatorToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='+') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_14.plus);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain +");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_arthmetic_operator(drawable_arthmetic_operator)");
				_furthestPosition=_position;
			}
			_position=_position_drawable_arthmetic_operator;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_drawable_arthmetic_operator.add(_position_drawable_arthmetic_operator,_token);
		}
		_token=_token_drawable_arthmetic_operator;
		if(_state==FAILED) {
			support_names.reject(_position_drawable_arthmetic_operator);
			association_names.reject(_position_drawable_arthmetic_operator);
			room_names.reject(_position_drawable_arthmetic_operator);
			activity_names.reject(_position_drawable_arthmetic_operator);
			siding_names.reject(_position_drawable_arthmetic_operator);
			item_names.reject(_position_drawable_arthmetic_operator);
			aspect_names.reject(_position_drawable_arthmetic_operator);
			affinity_names.reject(_position_drawable_arthmetic_operator);
			activity_type_names.reject(_position_drawable_arthmetic_operator);
			trail_names.reject(_position_drawable_arthmetic_operator);
			attack_names.reject(_position_drawable_arthmetic_operator);
			reason_names.reject(_position_drawable_arthmetic_operator);
			trait_names.reject(_position_drawable_arthmetic_operator);
			condition_names.reject(_position_drawable_arthmetic_operator);
			payment_short_type_names.reject(_position_drawable_arthmetic_operator);
			skill_names.reject(_position_drawable_arthmetic_operator);
			map_names.reject(_position_drawable_arthmetic_operator);
			event_names.reject(_position_drawable_arthmetic_operator);
			image_names.reject(_position_drawable_arthmetic_operator);
			tile_symbols.reject(_position_drawable_arthmetic_operator);
			payment_long_type_names.reject(_position_drawable_arthmetic_operator);
			area_names.reject(_position_drawable_arthmetic_operator);
			structure_names.reject(_position_drawable_arthmetic_operator);
			tile_names.reject(_position_drawable_arthmetic_operator);
			hero_stat.reject(_position_drawable_arthmetic_operator);
			_state=SUCCESS;
			_position_drawable_arthmetic_operator=_position;
			_token_drawable_arthmetic_operator=_token;
			_token=new Tokens.Rule.DrawableArthmeticOperatorToken();
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='-') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_15.minus);
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_arthmetic_operator(drawable_arthmetic_operator)");
					_furthestPosition=_position;
				}
				_position=_position_drawable_arthmetic_operator;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_drawable_arthmetic_operator.add(_position_drawable_arthmetic_operator,_token);
			}
			_token=_token_drawable_arthmetic_operator;
			if(_state==FAILED) {
				support_names.reject(_position_drawable_arthmetic_operator);
				association_names.reject(_position_drawable_arthmetic_operator);
				room_names.reject(_position_drawable_arthmetic_operator);
				activity_names.reject(_position_drawable_arthmetic_operator);
				siding_names.reject(_position_drawable_arthmetic_operator);
				item_names.reject(_position_drawable_arthmetic_operator);
				aspect_names.reject(_position_drawable_arthmetic_operator);
				affinity_names.reject(_position_drawable_arthmetic_operator);
				activity_type_names.reject(_position_drawable_arthmetic_operator);
				trail_names.reject(_position_drawable_arthmetic_operator);
				attack_names.reject(_position_drawable_arthmetic_operator);
				reason_names.reject(_position_drawable_arthmetic_operator);
				trait_names.reject(_position_drawable_arthmetic_operator);
				condition_names.reject(_position_drawable_arthmetic_operator);
				payment_short_type_names.reject(_position_drawable_arthmetic_operator);
				skill_names.reject(_position_drawable_arthmetic_operator);
				map_names.reject(_position_drawable_arthmetic_operator);
				event_names.reject(_position_drawable_arthmetic_operator);
				image_names.reject(_position_drawable_arthmetic_operator);
				tile_symbols.reject(_position_drawable_arthmetic_operator);
				payment_long_type_names.reject(_position_drawable_arthmetic_operator);
				area_names.reject(_position_drawable_arthmetic_operator);
				structure_names.reject(_position_drawable_arthmetic_operator);
				tile_names.reject(_position_drawable_arthmetic_operator);
				hero_stat.reject(_position_drawable_arthmetic_operator);
				_state=SUCCESS;
				_position_drawable_arthmetic_operator=_position;
				_token_drawable_arthmetic_operator=_token;
				_token=new Tokens.Rule.DrawableArthmeticOperatorToken();
				if(_position+1-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='/') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_53.divide);
					_position=_position+1;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain /");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_arthmetic_operator(drawable_arthmetic_operator)");
						_furthestPosition=_position;
					}
					_position=_position_drawable_arthmetic_operator;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_drawable_arthmetic_operator.add(_position_drawable_arthmetic_operator,_token);
				}
				_token=_token_drawable_arthmetic_operator;
				if(_state==FAILED) {
					support_names.reject(_position_drawable_arthmetic_operator);
					association_names.reject(_position_drawable_arthmetic_operator);
					room_names.reject(_position_drawable_arthmetic_operator);
					activity_names.reject(_position_drawable_arthmetic_operator);
					siding_names.reject(_position_drawable_arthmetic_operator);
					item_names.reject(_position_drawable_arthmetic_operator);
					aspect_names.reject(_position_drawable_arthmetic_operator);
					affinity_names.reject(_position_drawable_arthmetic_operator);
					activity_type_names.reject(_position_drawable_arthmetic_operator);
					trail_names.reject(_position_drawable_arthmetic_operator);
					attack_names.reject(_position_drawable_arthmetic_operator);
					reason_names.reject(_position_drawable_arthmetic_operator);
					trait_names.reject(_position_drawable_arthmetic_operator);
					condition_names.reject(_position_drawable_arthmetic_operator);
					payment_short_type_names.reject(_position_drawable_arthmetic_operator);
					skill_names.reject(_position_drawable_arthmetic_operator);
					map_names.reject(_position_drawable_arthmetic_operator);
					event_names.reject(_position_drawable_arthmetic_operator);
					image_names.reject(_position_drawable_arthmetic_operator);
					tile_symbols.reject(_position_drawable_arthmetic_operator);
					payment_long_type_names.reject(_position_drawable_arthmetic_operator);
					area_names.reject(_position_drawable_arthmetic_operator);
					structure_names.reject(_position_drawable_arthmetic_operator);
					tile_names.reject(_position_drawable_arthmetic_operator);
					hero_stat.reject(_position_drawable_arthmetic_operator);
					_state=SUCCESS;
					_position_drawable_arthmetic_operator=_position;
					_token_drawable_arthmetic_operator=_token;
					_token=new Tokens.Rule.DrawableArthmeticOperatorToken();
					if(_position+1-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='*') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_19.multiply);
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
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_arthmetic_operator(drawable_arthmetic_operator)");
							_furthestPosition=_position;
						}
						_position=_position_drawable_arthmetic_operator;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_drawable_arthmetic_operator.add(_position_drawable_arthmetic_operator,_token);
					}
					_token=_token_drawable_arthmetic_operator;
					if(_state==FAILED) {
						support_names.reject(_position_drawable_arthmetic_operator);
						association_names.reject(_position_drawable_arthmetic_operator);
						room_names.reject(_position_drawable_arthmetic_operator);
						activity_names.reject(_position_drawable_arthmetic_operator);
						siding_names.reject(_position_drawable_arthmetic_operator);
						item_names.reject(_position_drawable_arthmetic_operator);
						aspect_names.reject(_position_drawable_arthmetic_operator);
						affinity_names.reject(_position_drawable_arthmetic_operator);
						activity_type_names.reject(_position_drawable_arthmetic_operator);
						trail_names.reject(_position_drawable_arthmetic_operator);
						attack_names.reject(_position_drawable_arthmetic_operator);
						reason_names.reject(_position_drawable_arthmetic_operator);
						trait_names.reject(_position_drawable_arthmetic_operator);
						condition_names.reject(_position_drawable_arthmetic_operator);
						payment_short_type_names.reject(_position_drawable_arthmetic_operator);
						skill_names.reject(_position_drawable_arthmetic_operator);
						map_names.reject(_position_drawable_arthmetic_operator);
						event_names.reject(_position_drawable_arthmetic_operator);
						image_names.reject(_position_drawable_arthmetic_operator);
						tile_symbols.reject(_position_drawable_arthmetic_operator);
						payment_long_type_names.reject(_position_drawable_arthmetic_operator);
						area_names.reject(_position_drawable_arthmetic_operator);
						structure_names.reject(_position_drawable_arthmetic_operator);
						tile_names.reject(_position_drawable_arthmetic_operator);
						hero_stat.reject(_position_drawable_arthmetic_operator);
					}
					else if(_state==SUCCESS) {
						support_names.accept(_position_drawable_arthmetic_operator);
						association_names.accept(_position_drawable_arthmetic_operator);
						room_names.accept(_position_drawable_arthmetic_operator);
						activity_names.accept(_position_drawable_arthmetic_operator);
						siding_names.accept(_position_drawable_arthmetic_operator);
						item_names.accept(_position_drawable_arthmetic_operator);
						aspect_names.accept(_position_drawable_arthmetic_operator);
						affinity_names.accept(_position_drawable_arthmetic_operator);
						activity_type_names.accept(_position_drawable_arthmetic_operator);
						trail_names.accept(_position_drawable_arthmetic_operator);
						attack_names.accept(_position_drawable_arthmetic_operator);
						reason_names.accept(_position_drawable_arthmetic_operator);
						trait_names.accept(_position_drawable_arthmetic_operator);
						condition_names.accept(_position_drawable_arthmetic_operator);
						payment_short_type_names.accept(_position_drawable_arthmetic_operator);
						skill_names.accept(_position_drawable_arthmetic_operator);
						map_names.accept(_position_drawable_arthmetic_operator);
						event_names.accept(_position_drawable_arthmetic_operator);
						image_names.accept(_position_drawable_arthmetic_operator);
						tile_symbols.accept(_position_drawable_arthmetic_operator);
						payment_long_type_names.accept(_position_drawable_arthmetic_operator);
						area_names.accept(_position_drawable_arthmetic_operator);
						structure_names.accept(_position_drawable_arthmetic_operator);
						tile_names.accept(_position_drawable_arthmetic_operator);
						hero_stat.accept(_position_drawable_arthmetic_operator);
					}
				}
			}
		}
	}
	public void parse_drawable_declaration() {
		int _position_drawable_declaration = -1;
		Token.Parsed _token_drawable_declaration = null;
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
		_position_drawable_declaration=_position;
		_token_drawable_declaration=_token;
		_token=new Tokens.Rule.DrawableDeclarationToken();
		_token_NAME=_token;
		_token=new Tokens.Name.DrawableNameToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_52.contains(_position)) {
			_recursion_protection_NAME_52.add(_position);
			parse_NAME();
			_recursion_protection_NAME_52.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token_NAME.add(_position_NAME,_token);
		}
		_token=_token_NAME;
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_declaration(drawable_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_drawable_declaration;
		}
		else {
			int _state_246 = _state;
			boolean _iteration_achieved_246 = false;
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
				else {
					_iteration_achieved_246=true;
				}
			}
			if(_iteration_achieved_246==false) {
				_state=FAILED;
			}
			else if(_state_246==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_declaration(drawable_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_drawable_declaration;
			}
			else {
				int _state_247 = _state;
				boolean _iteration_achieved_247 = false;
				while(_position<_inputLength) {
					parse_drawable_grid_element();
					if(_state==FAILED) {
						break;
					}
					else {
						_iteration_achieved_247=true;
					}
				}
				if(_iteration_achieved_247==false) {
					_state=FAILED;
				}
				else if(_state_247==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_declaration(drawable_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_drawable_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_drawable_declaration.add(_position_drawable_declaration,_token);
		}
		_token=_token_drawable_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_drawable_declaration);
			association_names.reject(_position_drawable_declaration);
			room_names.reject(_position_drawable_declaration);
			activity_names.reject(_position_drawable_declaration);
			siding_names.reject(_position_drawable_declaration);
			item_names.reject(_position_drawable_declaration);
			aspect_names.reject(_position_drawable_declaration);
			affinity_names.reject(_position_drawable_declaration);
			activity_type_names.reject(_position_drawable_declaration);
			trail_names.reject(_position_drawable_declaration);
			attack_names.reject(_position_drawable_declaration);
			reason_names.reject(_position_drawable_declaration);
			trait_names.reject(_position_drawable_declaration);
			condition_names.reject(_position_drawable_declaration);
			payment_short_type_names.reject(_position_drawable_declaration);
			skill_names.reject(_position_drawable_declaration);
			map_names.reject(_position_drawable_declaration);
			event_names.reject(_position_drawable_declaration);
			image_names.reject(_position_drawable_declaration);
			tile_symbols.reject(_position_drawable_declaration);
			payment_long_type_names.reject(_position_drawable_declaration);
			area_names.reject(_position_drawable_declaration);
			structure_names.reject(_position_drawable_declaration);
			tile_names.reject(_position_drawable_declaration);
			hero_stat.reject(_position_drawable_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_drawable_declaration);
			association_names.accept(_position_drawable_declaration);
			room_names.accept(_position_drawable_declaration);
			activity_names.accept(_position_drawable_declaration);
			siding_names.accept(_position_drawable_declaration);
			item_names.accept(_position_drawable_declaration);
			aspect_names.accept(_position_drawable_declaration);
			affinity_names.accept(_position_drawable_declaration);
			activity_type_names.accept(_position_drawable_declaration);
			trail_names.accept(_position_drawable_declaration);
			attack_names.accept(_position_drawable_declaration);
			reason_names.accept(_position_drawable_declaration);
			trait_names.accept(_position_drawable_declaration);
			condition_names.accept(_position_drawable_declaration);
			payment_short_type_names.accept(_position_drawable_declaration);
			skill_names.accept(_position_drawable_declaration);
			map_names.accept(_position_drawable_declaration);
			event_names.accept(_position_drawable_declaration);
			image_names.accept(_position_drawable_declaration);
			tile_symbols.accept(_position_drawable_declaration);
			payment_long_type_names.accept(_position_drawable_declaration);
			area_names.accept(_position_drawable_declaration);
			structure_names.accept(_position_drawable_declaration);
			tile_names.accept(_position_drawable_declaration);
			hero_stat.accept(_position_drawable_declaration);
		}
	}
	public void parse_drawable_dimensions() {
		int _position_drawable_dimensions = -1;
		Token.Parsed _token_drawable_dimensions = null;
		int _length_drawable_dimensions_brace = _inputLength;
		if(brace_5.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_5.get(_position);
			int _position_drawable_dimensions_brace = _position;
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
			_position_drawable_dimensions=_position;
			_token_drawable_dimensions=_token;
			_token=new Tokens.Rule.DrawableDimensionsToken();
			parse__anonymous_224();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_dimensions(drawable_dimensions)");
					_furthestPosition=_position;
				}
				_position=_position_drawable_dimensions;
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_dimensions(drawable_dimensions)");
						_furthestPosition=_position;
					}
					_position=_position_drawable_dimensions;
				}
				else {
					parse__anonymous_226();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_dimensions(drawable_dimensions)");
							_furthestPosition=_position;
						}
						_position=_position_drawable_dimensions;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_drawable_dimensions.add(_position_drawable_dimensions,_token);
			}
			_token=_token_drawable_dimensions;
			if(_state==SUCCESS&&brace_5.get(_position_drawable_dimensions_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("drawable_dimensions",_position,_lineNumberRanges));
				_position=brace_5.get(_position_drawable_dimensions_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_drawable_dimensions_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_drawable_dimensions);
				association_names.reject(_position_drawable_dimensions);
				room_names.reject(_position_drawable_dimensions);
				activity_names.reject(_position_drawable_dimensions);
				siding_names.reject(_position_drawable_dimensions);
				item_names.reject(_position_drawable_dimensions);
				aspect_names.reject(_position_drawable_dimensions);
				affinity_names.reject(_position_drawable_dimensions);
				activity_type_names.reject(_position_drawable_dimensions);
				trail_names.reject(_position_drawable_dimensions);
				attack_names.reject(_position_drawable_dimensions);
				reason_names.reject(_position_drawable_dimensions);
				trait_names.reject(_position_drawable_dimensions);
				condition_names.reject(_position_drawable_dimensions);
				payment_short_type_names.reject(_position_drawable_dimensions);
				skill_names.reject(_position_drawable_dimensions);
				map_names.reject(_position_drawable_dimensions);
				event_names.reject(_position_drawable_dimensions);
				image_names.reject(_position_drawable_dimensions);
				tile_symbols.reject(_position_drawable_dimensions);
				payment_long_type_names.reject(_position_drawable_dimensions);
				area_names.reject(_position_drawable_dimensions);
				structure_names.reject(_position_drawable_dimensions);
				tile_names.reject(_position_drawable_dimensions);
				hero_stat.reject(_position_drawable_dimensions);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_drawable_dimensions);
				association_names.accept(_position_drawable_dimensions);
				room_names.accept(_position_drawable_dimensions);
				activity_names.accept(_position_drawable_dimensions);
				siding_names.accept(_position_drawable_dimensions);
				item_names.accept(_position_drawable_dimensions);
				aspect_names.accept(_position_drawable_dimensions);
				affinity_names.accept(_position_drawable_dimensions);
				activity_type_names.accept(_position_drawable_dimensions);
				trail_names.accept(_position_drawable_dimensions);
				attack_names.accept(_position_drawable_dimensions);
				reason_names.accept(_position_drawable_dimensions);
				trait_names.accept(_position_drawable_dimensions);
				condition_names.accept(_position_drawable_dimensions);
				payment_short_type_names.accept(_position_drawable_dimensions);
				skill_names.accept(_position_drawable_dimensions);
				map_names.accept(_position_drawable_dimensions);
				event_names.accept(_position_drawable_dimensions);
				image_names.accept(_position_drawable_dimensions);
				tile_symbols.accept(_position_drawable_dimensions);
				payment_long_type_names.accept(_position_drawable_dimensions);
				area_names.accept(_position_drawable_dimensions);
				structure_names.accept(_position_drawable_dimensions);
				tile_names.accept(_position_drawable_dimensions);
				hero_stat.accept(_position_drawable_dimensions);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_dimensions(drawable_dimensions)");
				_furthestPosition=_position;
			}
		}
	}
	public void parse_drawable_multiple_element() {
		int _position_drawable_multiple_element = -1;
		Token.Parsed _token_drawable_multiple_element = null;
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
		_position_drawable_multiple_element=_position;
		_token_drawable_multiple_element=_token;
		_token=new Tokens.Rule.DrawableMultipleElementToken();
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
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
				_furthestPosition=_position;
			}
			_position=_position_drawable_multiple_element;
		}
		else {
			_token_NAME=_token;
			_token=new Tokens.Name.DrawableNameToken();
			_position_NAME=_position;
			parse_NAME();
			if(_state==SUCCESS) {
				_token_NAME.add(_position_NAME,_token);
			}
			_token=_token_NAME;
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
					_furthestPosition=_position;
				}
				_position=_position_drawable_multiple_element;
			}
			else {
				parse__anonymous_228();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
						_furthestPosition=_position;
					}
					_position=_position_drawable_multiple_element;
				}
				else {
					parse__anonymous_230();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
							_furthestPosition=_position;
						}
						_position=_position_drawable_multiple_element;
					}
					else {
						parse__anonymous_232();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
								_furthestPosition=_position;
							}
							_position=_position_drawable_multiple_element;
						}
						else {
							if(_position+1-1 >=_inputLength) {
								_state=FAILED;
							}
							else {
								if(_inputArray[_position+0]!='&') {
									_state=FAILED;
								}
							}
							if(_state==SUCCESS) {
								_token.add(_position,Tokens.Syntax.syntax_68.SYNTAX);
								_position=_position+1;
								while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
									++_position;
								}
							}
							else if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain &");
									_furthestPosition=_position;
								}
							}
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
									_furthestPosition=_position;
								}
								_position=_position_drawable_multiple_element;
							}
							else {
								int _state_254 = _state;
								parse__anonymous_234();
								if(_state_254==SUCCESS&&_state==FAILED) {
									_state=SUCCESS;
								}
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
										_furthestPosition=_position;
									}
									_position=_position_drawable_multiple_element;
								}
								else {
									if(_position+1-1 >=_inputLength) {
										_state=FAILED;
									}
									else {
										if(_inputArray[_position+0]!='&') {
											_state=FAILED;
										}
									}
									if(_state==SUCCESS) {
										_token.add(_position,Tokens.Syntax.syntax_68.SYNTAX);
										_position=_position+1;
										while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
											++_position;
										}
									}
									else if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain &");
											_furthestPosition=_position;
										}
									}
									if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
											_furthestPosition=_position;
										}
										_position=_position_drawable_multiple_element;
									}
									else {
										parse__anonymous_236();
										if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_element(drawable_multiple_element)");
												_furthestPosition=_position;
											}
											_position=_position_drawable_multiple_element;
										}
										else {
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_drawable_multiple_element.add(_position_drawable_multiple_element,_token);
		}
		_token=_token_drawable_multiple_element;
		if(_state==FAILED) {
			support_names.reject(_position_drawable_multiple_element);
			association_names.reject(_position_drawable_multiple_element);
			room_names.reject(_position_drawable_multiple_element);
			activity_names.reject(_position_drawable_multiple_element);
			siding_names.reject(_position_drawable_multiple_element);
			item_names.reject(_position_drawable_multiple_element);
			aspect_names.reject(_position_drawable_multiple_element);
			affinity_names.reject(_position_drawable_multiple_element);
			activity_type_names.reject(_position_drawable_multiple_element);
			trail_names.reject(_position_drawable_multiple_element);
			attack_names.reject(_position_drawable_multiple_element);
			reason_names.reject(_position_drawable_multiple_element);
			trait_names.reject(_position_drawable_multiple_element);
			condition_names.reject(_position_drawable_multiple_element);
			payment_short_type_names.reject(_position_drawable_multiple_element);
			skill_names.reject(_position_drawable_multiple_element);
			map_names.reject(_position_drawable_multiple_element);
			event_names.reject(_position_drawable_multiple_element);
			image_names.reject(_position_drawable_multiple_element);
			tile_symbols.reject(_position_drawable_multiple_element);
			payment_long_type_names.reject(_position_drawable_multiple_element);
			area_names.reject(_position_drawable_multiple_element);
			structure_names.reject(_position_drawable_multiple_element);
			tile_names.reject(_position_drawable_multiple_element);
			hero_stat.reject(_position_drawable_multiple_element);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_drawable_multiple_element);
			association_names.accept(_position_drawable_multiple_element);
			room_names.accept(_position_drawable_multiple_element);
			activity_names.accept(_position_drawable_multiple_element);
			siding_names.accept(_position_drawable_multiple_element);
			item_names.accept(_position_drawable_multiple_element);
			aspect_names.accept(_position_drawable_multiple_element);
			affinity_names.accept(_position_drawable_multiple_element);
			activity_type_names.accept(_position_drawable_multiple_element);
			trail_names.accept(_position_drawable_multiple_element);
			attack_names.accept(_position_drawable_multiple_element);
			reason_names.accept(_position_drawable_multiple_element);
			trait_names.accept(_position_drawable_multiple_element);
			condition_names.accept(_position_drawable_multiple_element);
			payment_short_type_names.accept(_position_drawable_multiple_element);
			skill_names.accept(_position_drawable_multiple_element);
			map_names.accept(_position_drawable_multiple_element);
			event_names.accept(_position_drawable_multiple_element);
			image_names.accept(_position_drawable_multiple_element);
			tile_symbols.accept(_position_drawable_multiple_element);
			payment_long_type_names.accept(_position_drawable_multiple_element);
			area_names.accept(_position_drawable_multiple_element);
			structure_names.accept(_position_drawable_multiple_element);
			tile_names.accept(_position_drawable_multiple_element);
			hero_stat.accept(_position_drawable_multiple_element);
		}
	}
	public void parse_drawable_multiple_value() {
		int _position_drawable_multiple_value = -1;
		Token.Parsed _token_drawable_multiple_value = null;
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
		_position_drawable_multiple_value=_position;
		_token_drawable_multiple_value=_token;
		_token=new Tokens.Rule.DrawableMultipleValueToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='X') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_157.x);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain X");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_value(drawable_multiple_value)");
				_furthestPosition=_position;
			}
			_position=_position_drawable_multiple_value;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_drawable_multiple_value.add(_position_drawable_multiple_value,_token);
		}
		_token=_token_drawable_multiple_value;
		if(_state==FAILED) {
			support_names.reject(_position_drawable_multiple_value);
			association_names.reject(_position_drawable_multiple_value);
			room_names.reject(_position_drawable_multiple_value);
			activity_names.reject(_position_drawable_multiple_value);
			siding_names.reject(_position_drawable_multiple_value);
			item_names.reject(_position_drawable_multiple_value);
			aspect_names.reject(_position_drawable_multiple_value);
			affinity_names.reject(_position_drawable_multiple_value);
			activity_type_names.reject(_position_drawable_multiple_value);
			trail_names.reject(_position_drawable_multiple_value);
			attack_names.reject(_position_drawable_multiple_value);
			reason_names.reject(_position_drawable_multiple_value);
			trait_names.reject(_position_drawable_multiple_value);
			condition_names.reject(_position_drawable_multiple_value);
			payment_short_type_names.reject(_position_drawable_multiple_value);
			skill_names.reject(_position_drawable_multiple_value);
			map_names.reject(_position_drawable_multiple_value);
			event_names.reject(_position_drawable_multiple_value);
			image_names.reject(_position_drawable_multiple_value);
			tile_symbols.reject(_position_drawable_multiple_value);
			payment_long_type_names.reject(_position_drawable_multiple_value);
			area_names.reject(_position_drawable_multiple_value);
			structure_names.reject(_position_drawable_multiple_value);
			tile_names.reject(_position_drawable_multiple_value);
			hero_stat.reject(_position_drawable_multiple_value);
			_state=SUCCESS;
			_position_drawable_multiple_value=_position;
			_token_drawable_multiple_value=_token;
			_token=new Tokens.Rule.DrawableMultipleValueToken();
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='Y') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_158.y);
				_position=_position+1;
				while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain Y");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_value(drawable_multiple_value)");
					_furthestPosition=_position;
				}
				_position=_position_drawable_multiple_value;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_drawable_multiple_value.add(_position_drawable_multiple_value,_token);
			}
			_token=_token_drawable_multiple_value;
			if(_state==FAILED) {
				support_names.reject(_position_drawable_multiple_value);
				association_names.reject(_position_drawable_multiple_value);
				room_names.reject(_position_drawable_multiple_value);
				activity_names.reject(_position_drawable_multiple_value);
				siding_names.reject(_position_drawable_multiple_value);
				item_names.reject(_position_drawable_multiple_value);
				aspect_names.reject(_position_drawable_multiple_value);
				affinity_names.reject(_position_drawable_multiple_value);
				activity_type_names.reject(_position_drawable_multiple_value);
				trail_names.reject(_position_drawable_multiple_value);
				attack_names.reject(_position_drawable_multiple_value);
				reason_names.reject(_position_drawable_multiple_value);
				trait_names.reject(_position_drawable_multiple_value);
				condition_names.reject(_position_drawable_multiple_value);
				payment_short_type_names.reject(_position_drawable_multiple_value);
				skill_names.reject(_position_drawable_multiple_value);
				map_names.reject(_position_drawable_multiple_value);
				event_names.reject(_position_drawable_multiple_value);
				image_names.reject(_position_drawable_multiple_value);
				tile_symbols.reject(_position_drawable_multiple_value);
				payment_long_type_names.reject(_position_drawable_multiple_value);
				area_names.reject(_position_drawable_multiple_value);
				structure_names.reject(_position_drawable_multiple_value);
				tile_names.reject(_position_drawable_multiple_value);
				hero_stat.reject(_position_drawable_multiple_value);
				_state=SUCCESS;
				_position_drawable_multiple_value=_position;
				_token_drawable_multiple_value=_token;
				_token=new Tokens.Rule.DrawableMultipleValueToken();
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='W') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='d') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='h') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_159.width);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain Width");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_value(drawable_multiple_value)");
						_furthestPosition=_position;
					}
					_position=_position_drawable_multiple_value;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_drawable_multiple_value.add(_position_drawable_multiple_value,_token);
				}
				_token=_token_drawable_multiple_value;
				if(_state==FAILED) {
					support_names.reject(_position_drawable_multiple_value);
					association_names.reject(_position_drawable_multiple_value);
					room_names.reject(_position_drawable_multiple_value);
					activity_names.reject(_position_drawable_multiple_value);
					siding_names.reject(_position_drawable_multiple_value);
					item_names.reject(_position_drawable_multiple_value);
					aspect_names.reject(_position_drawable_multiple_value);
					affinity_names.reject(_position_drawable_multiple_value);
					activity_type_names.reject(_position_drawable_multiple_value);
					trail_names.reject(_position_drawable_multiple_value);
					attack_names.reject(_position_drawable_multiple_value);
					reason_names.reject(_position_drawable_multiple_value);
					trait_names.reject(_position_drawable_multiple_value);
					condition_names.reject(_position_drawable_multiple_value);
					payment_short_type_names.reject(_position_drawable_multiple_value);
					skill_names.reject(_position_drawable_multiple_value);
					map_names.reject(_position_drawable_multiple_value);
					event_names.reject(_position_drawable_multiple_value);
					image_names.reject(_position_drawable_multiple_value);
					tile_symbols.reject(_position_drawable_multiple_value);
					payment_long_type_names.reject(_position_drawable_multiple_value);
					area_names.reject(_position_drawable_multiple_value);
					structure_names.reject(_position_drawable_multiple_value);
					tile_names.reject(_position_drawable_multiple_value);
					hero_stat.reject(_position_drawable_multiple_value);
					_state=SUCCESS;
					_position_drawable_multiple_value=_position;
					_token_drawable_multiple_value=_token;
					_token=new Tokens.Rule.DrawableMultipleValueToken();
					if(_position+6-1 >=_inputLength) {
						_state=FAILED;
					}
					else {
						if(_inputArray[_position+0]!='H') {
							_state=FAILED;
						}
						if(_inputArray[_position+1]!='e') {
							_state=FAILED;
						}
						if(_inputArray[_position+2]!='i') {
							_state=FAILED;
						}
						if(_inputArray[_position+3]!='g') {
							_state=FAILED;
						}
						if(_inputArray[_position+4]!='h') {
							_state=FAILED;
						}
						if(_inputArray[_position+5]!='t') {
							_state=FAILED;
						}
					}
					if(_state==SUCCESS) {
						_token.add(_position,Tokens.Syntax.syntax_160.height);
						_position=_position+6;
						while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
							++_position;
						}
					}
					else if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain Height");
							_furthestPosition=_position;
						}
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_value(drawable_multiple_value)");
							_furthestPosition=_position;
						}
						_position=_position_drawable_multiple_value;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_drawable_multiple_value.add(_position_drawable_multiple_value,_token);
					}
					_token=_token_drawable_multiple_value;
					if(_state==FAILED) {
						support_names.reject(_position_drawable_multiple_value);
						association_names.reject(_position_drawable_multiple_value);
						room_names.reject(_position_drawable_multiple_value);
						activity_names.reject(_position_drawable_multiple_value);
						siding_names.reject(_position_drawable_multiple_value);
						item_names.reject(_position_drawable_multiple_value);
						aspect_names.reject(_position_drawable_multiple_value);
						affinity_names.reject(_position_drawable_multiple_value);
						activity_type_names.reject(_position_drawable_multiple_value);
						trail_names.reject(_position_drawable_multiple_value);
						attack_names.reject(_position_drawable_multiple_value);
						reason_names.reject(_position_drawable_multiple_value);
						trait_names.reject(_position_drawable_multiple_value);
						condition_names.reject(_position_drawable_multiple_value);
						payment_short_type_names.reject(_position_drawable_multiple_value);
						skill_names.reject(_position_drawable_multiple_value);
						map_names.reject(_position_drawable_multiple_value);
						event_names.reject(_position_drawable_multiple_value);
						image_names.reject(_position_drawable_multiple_value);
						tile_symbols.reject(_position_drawable_multiple_value);
						payment_long_type_names.reject(_position_drawable_multiple_value);
						area_names.reject(_position_drawable_multiple_value);
						structure_names.reject(_position_drawable_multiple_value);
						tile_names.reject(_position_drawable_multiple_value);
						hero_stat.reject(_position_drawable_multiple_value);
						_state=SUCCESS;
						_position_drawable_multiple_value=_position;
						_token_drawable_multiple_value=_token;
						_token=new Tokens.Rule.DrawableMultipleValueToken();
						parse_FLOAT();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_value(drawable_multiple_value)");
								_furthestPosition=_position;
							}
							_position=_position_drawable_multiple_value;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_drawable_multiple_value.add(_position_drawable_multiple_value,_token);
						}
						_token=_token_drawable_multiple_value;
						if(_state==FAILED) {
							support_names.reject(_position_drawable_multiple_value);
							association_names.reject(_position_drawable_multiple_value);
							room_names.reject(_position_drawable_multiple_value);
							activity_names.reject(_position_drawable_multiple_value);
							siding_names.reject(_position_drawable_multiple_value);
							item_names.reject(_position_drawable_multiple_value);
							aspect_names.reject(_position_drawable_multiple_value);
							affinity_names.reject(_position_drawable_multiple_value);
							activity_type_names.reject(_position_drawable_multiple_value);
							trail_names.reject(_position_drawable_multiple_value);
							attack_names.reject(_position_drawable_multiple_value);
							reason_names.reject(_position_drawable_multiple_value);
							trait_names.reject(_position_drawable_multiple_value);
							condition_names.reject(_position_drawable_multiple_value);
							payment_short_type_names.reject(_position_drawable_multiple_value);
							skill_names.reject(_position_drawable_multiple_value);
							map_names.reject(_position_drawable_multiple_value);
							event_names.reject(_position_drawable_multiple_value);
							image_names.reject(_position_drawable_multiple_value);
							tile_symbols.reject(_position_drawable_multiple_value);
							payment_long_type_names.reject(_position_drawable_multiple_value);
							area_names.reject(_position_drawable_multiple_value);
							structure_names.reject(_position_drawable_multiple_value);
							tile_names.reject(_position_drawable_multiple_value);
							hero_stat.reject(_position_drawable_multiple_value);
							_state=SUCCESS;
							_position_drawable_multiple_value=_position;
							_token_drawable_multiple_value=_token;
							_token=new Tokens.Rule.DrawableMultipleValueToken();
							parse_INTEGER();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"drawable_multiple_value(drawable_multiple_value)");
									_furthestPosition=_position;
								}
								_position=_position_drawable_multiple_value;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_drawable_multiple_value.add(_position_drawable_multiple_value,_token);
							}
							_token=_token_drawable_multiple_value;
							if(_state==FAILED) {
								support_names.reject(_position_drawable_multiple_value);
								association_names.reject(_position_drawable_multiple_value);
								room_names.reject(_position_drawable_multiple_value);
								activity_names.reject(_position_drawable_multiple_value);
								siding_names.reject(_position_drawable_multiple_value);
								item_names.reject(_position_drawable_multiple_value);
								aspect_names.reject(_position_drawable_multiple_value);
								affinity_names.reject(_position_drawable_multiple_value);
								activity_type_names.reject(_position_drawable_multiple_value);
								trail_names.reject(_position_drawable_multiple_value);
								attack_names.reject(_position_drawable_multiple_value);
								reason_names.reject(_position_drawable_multiple_value);
								trait_names.reject(_position_drawable_multiple_value);
								condition_names.reject(_position_drawable_multiple_value);
								payment_short_type_names.reject(_position_drawable_multiple_value);
								skill_names.reject(_position_drawable_multiple_value);
								map_names.reject(_position_drawable_multiple_value);
								event_names.reject(_position_drawable_multiple_value);
								image_names.reject(_position_drawable_multiple_value);
								tile_symbols.reject(_position_drawable_multiple_value);
								payment_long_type_names.reject(_position_drawable_multiple_value);
								area_names.reject(_position_drawable_multiple_value);
								structure_names.reject(_position_drawable_multiple_value);
								tile_names.reject(_position_drawable_multiple_value);
								hero_stat.reject(_position_drawable_multiple_value);
							}
							else if(_state==SUCCESS) {
								support_names.accept(_position_drawable_multiple_value);
								association_names.accept(_position_drawable_multiple_value);
								room_names.accept(_position_drawable_multiple_value);
								activity_names.accept(_position_drawable_multiple_value);
								siding_names.accept(_position_drawable_multiple_value);
								item_names.accept(_position_drawable_multiple_value);
								aspect_names.accept(_position_drawable_multiple_value);
								affinity_names.accept(_position_drawable_multiple_value);
								activity_type_names.accept(_position_drawable_multiple_value);
								trail_names.accept(_position_drawable_multiple_value);
								attack_names.accept(_position_drawable_multiple_value);
								reason_names.accept(_position_drawable_multiple_value);
								trait_names.accept(_position_drawable_multiple_value);
								condition_names.accept(_position_drawable_multiple_value);
								payment_short_type_names.accept(_position_drawable_multiple_value);
								skill_names.accept(_position_drawable_multiple_value);
								map_names.accept(_position_drawable_multiple_value);
								event_names.accept(_position_drawable_multiple_value);
								image_names.accept(_position_drawable_multiple_value);
								tile_symbols.accept(_position_drawable_multiple_value);
								payment_long_type_names.accept(_position_drawable_multiple_value);
								area_names.accept(_position_drawable_multiple_value);
								structure_names.accept(_position_drawable_multiple_value);
								tile_names.accept(_position_drawable_multiple_value);
								hero_stat.accept(_position_drawable_multiple_value);
							}
						}
					}
				}
			}
		}
	}
}