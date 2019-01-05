package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.ordinal_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class structure_context extends ordinal_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public structure_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public structure_context() {
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
	public void parse_structure_declaration() {
		int _position_structure_declaration = -1;
		Token.Parsed _token_structure_declaration = null;
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
		_position_structure_declaration=_position;
		_token_structure_declaration=_token;
		_token=new Tokens.Rule.StructureDeclarationToken();
		parse_NAME();
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				structure_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.BuildingNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_declaration(structure_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_structure_declaration;
		}
		else {
			int _state_94 = _state;
			parse_structure_payment();
			if(_state_94==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_declaration(structure_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_structure_declaration;
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
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_declaration(structure_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_structure_declaration;
				}
				else {
					int _state_95 = _state;
					while(_position<_inputLength) {
						parse__anonymous_76();
						if(_state==FAILED) {
							break;
						}
					}
					if(_state_95==SUCCESS&&_state==FAILED) {
						_state=SUCCESS;
					}
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_declaration(structure_declaration)");
							_furthestPosition=_position;
						}
						_position=_position_structure_declaration;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			_token_structure_declaration.add(_position_structure_declaration,_token);
		}
		_token=_token_structure_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_structure_declaration);
			association_names.reject(_position_structure_declaration);
			room_names.reject(_position_structure_declaration);
			activity_names.reject(_position_structure_declaration);
			siding_names.reject(_position_structure_declaration);
			item_names.reject(_position_structure_declaration);
			aspect_names.reject(_position_structure_declaration);
			affinity_names.reject(_position_structure_declaration);
			activity_type_names.reject(_position_structure_declaration);
			trail_names.reject(_position_structure_declaration);
			attack_names.reject(_position_structure_declaration);
			reason_names.reject(_position_structure_declaration);
			trait_names.reject(_position_structure_declaration);
			condition_names.reject(_position_structure_declaration);
			payment_short_type_names.reject(_position_structure_declaration);
			skill_names.reject(_position_structure_declaration);
			map_names.reject(_position_structure_declaration);
			event_names.reject(_position_structure_declaration);
			image_names.reject(_position_structure_declaration);
			tile_symbols.reject(_position_structure_declaration);
			payment_long_type_names.reject(_position_structure_declaration);
			area_names.reject(_position_structure_declaration);
			structure_names.reject(_position_structure_declaration);
			tile_names.reject(_position_structure_declaration);
			hero_stat.reject(_position_structure_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_structure_declaration);
			association_names.accept(_position_structure_declaration);
			room_names.accept(_position_structure_declaration);
			activity_names.accept(_position_structure_declaration);
			siding_names.accept(_position_structure_declaration);
			item_names.accept(_position_structure_declaration);
			aspect_names.accept(_position_structure_declaration);
			affinity_names.accept(_position_structure_declaration);
			activity_type_names.accept(_position_structure_declaration);
			trail_names.accept(_position_structure_declaration);
			attack_names.accept(_position_structure_declaration);
			reason_names.accept(_position_structure_declaration);
			trait_names.accept(_position_structure_declaration);
			condition_names.accept(_position_structure_declaration);
			payment_short_type_names.accept(_position_structure_declaration);
			skill_names.accept(_position_structure_declaration);
			map_names.accept(_position_structure_declaration);
			event_names.accept(_position_structure_declaration);
			image_names.accept(_position_structure_declaration);
			tile_symbols.accept(_position_structure_declaration);
			payment_long_type_names.accept(_position_structure_declaration);
			area_names.accept(_position_structure_declaration);
			structure_names.accept(_position_structure_declaration);
			tile_names.accept(_position_structure_declaration);
			hero_stat.accept(_position_structure_declaration);
		}
	}
	public void parse_structure_payment() {
		int _position_structure_payment = -1;
		Token.Parsed _token_structure_payment = null;
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
		_position_structure_payment=_position;
		_token_structure_payment=_token;
		_token=new Tokens.Rule.StructurePaymentToken();
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
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_payment(structure_payment)");
				_furthestPosition=_position;
			}
			_position=_position_structure_payment;
		}
		else {
			parse__anonymous_79();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_payment(structure_payment)");
					_furthestPosition=_position;
				}
				_position=_position_structure_payment;
			}
			else {
				int _state_98 = _state;
				while(_position<_inputLength) {
					parse__anonymous_80();
					if(_state==FAILED) {
						break;
					}
				}
				if(_state_98==SUCCESS&&_state==FAILED) {
					_state=SUCCESS;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"structure_payment(structure_payment)");
						_furthestPosition=_position;
					}
					_position=_position_structure_payment;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_structure_payment.addAll(_token);
			_token_structure_payment.setValue(_token.getValue());
		}
		_token=_token_structure_payment;
		if(_state==FAILED) {
			support_names.reject(_position_structure_payment);
			association_names.reject(_position_structure_payment);
			room_names.reject(_position_structure_payment);
			activity_names.reject(_position_structure_payment);
			siding_names.reject(_position_structure_payment);
			item_names.reject(_position_structure_payment);
			aspect_names.reject(_position_structure_payment);
			affinity_names.reject(_position_structure_payment);
			activity_type_names.reject(_position_structure_payment);
			trail_names.reject(_position_structure_payment);
			attack_names.reject(_position_structure_payment);
			reason_names.reject(_position_structure_payment);
			trait_names.reject(_position_structure_payment);
			condition_names.reject(_position_structure_payment);
			payment_short_type_names.reject(_position_structure_payment);
			skill_names.reject(_position_structure_payment);
			map_names.reject(_position_structure_payment);
			event_names.reject(_position_structure_payment);
			image_names.reject(_position_structure_payment);
			tile_symbols.reject(_position_structure_payment);
			payment_long_type_names.reject(_position_structure_payment);
			area_names.reject(_position_structure_payment);
			structure_names.reject(_position_structure_payment);
			tile_names.reject(_position_structure_payment);
			hero_stat.reject(_position_structure_payment);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_structure_payment);
			association_names.accept(_position_structure_payment);
			room_names.accept(_position_structure_payment);
			activity_names.accept(_position_structure_payment);
			siding_names.accept(_position_structure_payment);
			item_names.accept(_position_structure_payment);
			aspect_names.accept(_position_structure_payment);
			affinity_names.accept(_position_structure_payment);
			activity_type_names.accept(_position_structure_payment);
			trail_names.accept(_position_structure_payment);
			attack_names.accept(_position_structure_payment);
			reason_names.accept(_position_structure_payment);
			trait_names.accept(_position_structure_payment);
			condition_names.accept(_position_structure_payment);
			payment_short_type_names.accept(_position_structure_payment);
			skill_names.accept(_position_structure_payment);
			map_names.accept(_position_structure_payment);
			event_names.accept(_position_structure_payment);
			image_names.accept(_position_structure_payment);
			tile_symbols.accept(_position_structure_payment);
			payment_long_type_names.accept(_position_structure_payment);
			area_names.accept(_position_structure_payment);
			structure_names.accept(_position_structure_payment);
			tile_names.accept(_position_structure_payment);
			hero_stat.accept(_position_structure_payment);
		}
	}
}