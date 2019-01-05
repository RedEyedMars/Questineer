package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.range_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class payment_context extends range_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public payment_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public payment_context() {
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
	public void parse_payment_type_declaration() {
		int _position_payment_type_declaration = -1;
		Token.Parsed _token_payment_type_declaration = null;
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
		_position_payment_type_declaration=_position;
		_token_payment_type_declaration=_token;
		_token=new Tokens.Rule.PaymentTypeDeclarationToken();
		_token_NAME=_token;
		_token=new Tokens.Name.TypeNameToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_31.contains(_position)) {
			_recursion_protection_NAME_31.add(_position);
			parse_NAME();
			_recursion_protection_NAME_31.remove(_position_NAME);
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
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_payment_type_declaration;
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
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_payment_type_declaration;
			}
			else {
				parse_NAME();
				if(_state==SUCCESS) {
					String _value = _token.getLastValue();
					if(_value!=null) {
						payment_short_type_names.add(_value);
					}
					_token.add(_position,new Tokens.Name.ShortFormToken(_value));
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_payment_type_declaration;
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_payment_type_declaration;
					}
					else {
						parse_NAME();
						if(_state==SUCCESS) {
							String _value = _token.getLastValue();
							if(_value!=null) {
								payment_long_type_names.add(_value);
							}
							_token.add(_position,new Tokens.Name.LongFormToken(_value));
						}
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
								_furthestPosition=_position;
							}
							_position=_position_payment_type_declaration;
						}
						else {
						}
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_payment_type_declaration.add(_position_payment_type_declaration,_token);
		}
		_token=_token_payment_type_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_payment_type_declaration);
			association_names.reject(_position_payment_type_declaration);
			room_names.reject(_position_payment_type_declaration);
			activity_names.reject(_position_payment_type_declaration);
			siding_names.reject(_position_payment_type_declaration);
			item_names.reject(_position_payment_type_declaration);
			aspect_names.reject(_position_payment_type_declaration);
			affinity_names.reject(_position_payment_type_declaration);
			activity_type_names.reject(_position_payment_type_declaration);
			trail_names.reject(_position_payment_type_declaration);
			attack_names.reject(_position_payment_type_declaration);
			reason_names.reject(_position_payment_type_declaration);
			trait_names.reject(_position_payment_type_declaration);
			condition_names.reject(_position_payment_type_declaration);
			payment_short_type_names.reject(_position_payment_type_declaration);
			skill_names.reject(_position_payment_type_declaration);
			map_names.reject(_position_payment_type_declaration);
			event_names.reject(_position_payment_type_declaration);
			image_names.reject(_position_payment_type_declaration);
			tile_symbols.reject(_position_payment_type_declaration);
			payment_long_type_names.reject(_position_payment_type_declaration);
			area_names.reject(_position_payment_type_declaration);
			structure_names.reject(_position_payment_type_declaration);
			tile_names.reject(_position_payment_type_declaration);
			hero_stat.reject(_position_payment_type_declaration);
			_state=SUCCESS;
			_position_payment_type_declaration=_position;
			_token_payment_type_declaration=_token;
			_token=new Tokens.Rule.PaymentTypeDeclarationToken();
			_position_NAME=_position;
			if(_state==SUCCESS&&!_recursion_protection_NAME_32.contains(_position)) {
				_recursion_protection_NAME_32.add(_position);
				parse_NAME();
				_recursion_protection_NAME_32.remove(_position_NAME);
			}
			else {
				_state=FAILED;
			}
			if(_state==SUCCESS) {
				String _value = _token.getLastValue();
				if(_value!=null) {
					payment_short_type_names.add(_value);
				}
				_token.add(_position,new Tokens.Name.ShortFormToken(_value));
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_payment_type_declaration;
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_payment_type_declaration;
				}
				else {
					parse_NAME();
					if(_state==SUCCESS) {
						String _value = _token.getLastValue();
						if(_value!=null) {
							payment_long_type_names.add(_value);
						}
						_token.add(_position,new Tokens.Name.LongFormToken(_value));
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"payment_type_declaration(payment_type_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_payment_type_declaration;
					}
					else {
					}
				}
			}
			if(_state==SUCCESS) {
				_token_payment_type_declaration.add(_position_payment_type_declaration,_token);
			}
			_token=_token_payment_type_declaration;
			if(_state==FAILED) {
				support_names.reject(_position_payment_type_declaration);
				association_names.reject(_position_payment_type_declaration);
				room_names.reject(_position_payment_type_declaration);
				activity_names.reject(_position_payment_type_declaration);
				siding_names.reject(_position_payment_type_declaration);
				item_names.reject(_position_payment_type_declaration);
				aspect_names.reject(_position_payment_type_declaration);
				affinity_names.reject(_position_payment_type_declaration);
				activity_type_names.reject(_position_payment_type_declaration);
				trail_names.reject(_position_payment_type_declaration);
				attack_names.reject(_position_payment_type_declaration);
				reason_names.reject(_position_payment_type_declaration);
				trait_names.reject(_position_payment_type_declaration);
				condition_names.reject(_position_payment_type_declaration);
				payment_short_type_names.reject(_position_payment_type_declaration);
				skill_names.reject(_position_payment_type_declaration);
				map_names.reject(_position_payment_type_declaration);
				event_names.reject(_position_payment_type_declaration);
				image_names.reject(_position_payment_type_declaration);
				tile_symbols.reject(_position_payment_type_declaration);
				payment_long_type_names.reject(_position_payment_type_declaration);
				area_names.reject(_position_payment_type_declaration);
				structure_names.reject(_position_payment_type_declaration);
				tile_names.reject(_position_payment_type_declaration);
				hero_stat.reject(_position_payment_type_declaration);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_payment_type_declaration);
				association_names.accept(_position_payment_type_declaration);
				room_names.accept(_position_payment_type_declaration);
				activity_names.accept(_position_payment_type_declaration);
				siding_names.accept(_position_payment_type_declaration);
				item_names.accept(_position_payment_type_declaration);
				aspect_names.accept(_position_payment_type_declaration);
				affinity_names.accept(_position_payment_type_declaration);
				activity_type_names.accept(_position_payment_type_declaration);
				trail_names.accept(_position_payment_type_declaration);
				attack_names.accept(_position_payment_type_declaration);
				reason_names.accept(_position_payment_type_declaration);
				trait_names.accept(_position_payment_type_declaration);
				condition_names.accept(_position_payment_type_declaration);
				payment_short_type_names.accept(_position_payment_type_declaration);
				skill_names.accept(_position_payment_type_declaration);
				map_names.accept(_position_payment_type_declaration);
				event_names.accept(_position_payment_type_declaration);
				image_names.accept(_position_payment_type_declaration);
				tile_symbols.accept(_position_payment_type_declaration);
				payment_long_type_names.accept(_position_payment_type_declaration);
				area_names.accept(_position_payment_type_declaration);
				structure_names.accept(_position_payment_type_declaration);
				tile_names.accept(_position_payment_type_declaration);
				hero_stat.accept(_position_payment_type_declaration);
			}
		}
	}
}