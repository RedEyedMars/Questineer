package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import com.rem.gen.contexts.event_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class reason_context extends event_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public reason_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public reason_context() {
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
	public void parse_reason_description_element() {
		int _position_reason_description_element = -1;
		Token.Parsed _token_reason_description_element = null;
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
		_position_reason_description_element=_position;
		_token_reason_description_element=_token;
		_token=new Tokens.Rule.ReasonDescriptionElementToken();
		int _position_regex_9 = _position;
		int _multiple_index_74 = 0;
		while(_position<_inputLength) {
			if(_inputArray[_position]!='$') {
				++_position;
				++_multiple_index_74;
			}
			else {
				break;
			}
		}
		if(_multiple_index_74==0 ) {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			_token.add(_position_regex_9,new Tokens.Plain.Description(_input.substring(_position_regex_9,_position)));
			while(_position<_inputLength&&(false)) {
				++_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"[$]+");
				_furthestPosition=_position;
			}
			_position=_position_regex_9;
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_description_element(reason_description_element)");
				_furthestPosition=_position;
			}
			_position=_position_reason_description_element;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_reason_description_element.addAll(_token);
			_token_reason_description_element.setValue(_token.getValue());
		}
		_token=_token_reason_description_element;
		if(_state==FAILED) {
			support_names.reject(_position_reason_description_element);
			association_names.reject(_position_reason_description_element);
			room_names.reject(_position_reason_description_element);
			activity_names.reject(_position_reason_description_element);
			siding_names.reject(_position_reason_description_element);
			item_names.reject(_position_reason_description_element);
			aspect_names.reject(_position_reason_description_element);
			affinity_names.reject(_position_reason_description_element);
			activity_type_names.reject(_position_reason_description_element);
			trail_names.reject(_position_reason_description_element);
			attack_names.reject(_position_reason_description_element);
			reason_names.reject(_position_reason_description_element);
			trait_names.reject(_position_reason_description_element);
			condition_names.reject(_position_reason_description_element);
			payment_short_type_names.reject(_position_reason_description_element);
			skill_names.reject(_position_reason_description_element);
			map_names.reject(_position_reason_description_element);
			event_names.reject(_position_reason_description_element);
			image_names.reject(_position_reason_description_element);
			tile_symbols.reject(_position_reason_description_element);
			payment_long_type_names.reject(_position_reason_description_element);
			area_names.reject(_position_reason_description_element);
			structure_names.reject(_position_reason_description_element);
			tile_names.reject(_position_reason_description_element);
			hero_stat.reject(_position_reason_description_element);
			_state=SUCCESS;
			_position_reason_description_element=_position;
			_token_reason_description_element=_token;
			_token=new Tokens.Rule.ReasonDescriptionElementToken();
			if(_position+1-1 >=_inputLength) {
				_state=FAILED;
			}
			else {
				if(_inputArray[_position+0]!='$') {
					_state=FAILED;
				}
			}
			if(_state==SUCCESS) {
				_token.add(_position,Tokens.Syntax.syntax_52.SYNTAX);
				_position=_position+1;
				while(_position<_inputLength&&(false)) {
					++_position;
				}
			}
			else if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain $");
					_furthestPosition=_position;
				}
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_description_element(reason_description_element)");
					_furthestPosition=_position;
				}
				_position=_position_reason_description_element;
			}
			else {
				int _position_regex_10 = _position;
				int _multiple_index_75 = 0;
				int _state_75 = _state;
				while(_position<_inputLength) {
					if(_position<_inputLength) {
						if(_inputArray[_position]=='0'||_inputArray[_position]=='1'||_inputArray[_position]=='2'||_inputArray[_position]=='3'||_inputArray[_position]=='4'||_inputArray[_position]=='5'||_inputArray[_position]=='6'||_inputArray[_position]=='7'||_inputArray[_position]=='8'||_inputArray[_position]=='9') {
							++_position;
						}
						else {
							_state=FAILED;
						}
					}
					else {
						_state=FAILED;
					}
					if(_state==FAILED) {
						break;
					}
					else {
						++_multiple_index_75;
					}
				}
				if(_state_75==SUCCESS&&_multiple_index_75>0 ) {
					_state=SUCCESS;
				}
				else {
					_state=FAILED;
				}
				if(_state==SUCCESS) {
					_token.add(_position_regex_10,new Tokens.Plain.VariableIndex(_input.substring(_position_regex_10,_position)));
					while(_position<_inputLength&&(false)) {
						++_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"\\\\d+");
						_furthestPosition=_position;
					}
					_position=_position_regex_10;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_description_element(reason_description_element)");
						_furthestPosition=_position;
					}
					_position=_position_reason_description_element;
				}
				else {
				}
			}
			if(_state==SUCCESS) {
				_token_reason_description_element.addAll(_token);
				_token_reason_description_element.setValue(_token.getValue());
			}
			_token=_token_reason_description_element;
			if(_state==FAILED) {
				support_names.reject(_position_reason_description_element);
				association_names.reject(_position_reason_description_element);
				room_names.reject(_position_reason_description_element);
				activity_names.reject(_position_reason_description_element);
				siding_names.reject(_position_reason_description_element);
				item_names.reject(_position_reason_description_element);
				aspect_names.reject(_position_reason_description_element);
				affinity_names.reject(_position_reason_description_element);
				activity_type_names.reject(_position_reason_description_element);
				trail_names.reject(_position_reason_description_element);
				attack_names.reject(_position_reason_description_element);
				reason_names.reject(_position_reason_description_element);
				trait_names.reject(_position_reason_description_element);
				condition_names.reject(_position_reason_description_element);
				payment_short_type_names.reject(_position_reason_description_element);
				skill_names.reject(_position_reason_description_element);
				map_names.reject(_position_reason_description_element);
				event_names.reject(_position_reason_description_element);
				image_names.reject(_position_reason_description_element);
				tile_symbols.reject(_position_reason_description_element);
				payment_long_type_names.reject(_position_reason_description_element);
				area_names.reject(_position_reason_description_element);
				structure_names.reject(_position_reason_description_element);
				tile_names.reject(_position_reason_description_element);
				hero_stat.reject(_position_reason_description_element);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_reason_description_element);
				association_names.accept(_position_reason_description_element);
				room_names.accept(_position_reason_description_element);
				activity_names.accept(_position_reason_description_element);
				siding_names.accept(_position_reason_description_element);
				item_names.accept(_position_reason_description_element);
				aspect_names.accept(_position_reason_description_element);
				affinity_names.accept(_position_reason_description_element);
				activity_type_names.accept(_position_reason_description_element);
				trail_names.accept(_position_reason_description_element);
				attack_names.accept(_position_reason_description_element);
				reason_names.accept(_position_reason_description_element);
				trait_names.accept(_position_reason_description_element);
				condition_names.accept(_position_reason_description_element);
				payment_short_type_names.accept(_position_reason_description_element);
				skill_names.accept(_position_reason_description_element);
				map_names.accept(_position_reason_description_element);
				event_names.accept(_position_reason_description_element);
				image_names.accept(_position_reason_description_element);
				tile_symbols.accept(_position_reason_description_element);
				payment_long_type_names.accept(_position_reason_description_element);
				area_names.accept(_position_reason_description_element);
				structure_names.accept(_position_reason_description_element);
				tile_names.accept(_position_reason_description_element);
				hero_stat.accept(_position_reason_description_element);
			}
		}
	}
	public void parse_reason_declaration() {
		int _position_reason_declaration = -1;
		Token.Parsed _token_reason_declaration = null;
		int _position_NAME = -1;
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
		_position_reason_declaration=_position;
		_token_reason_declaration=_token;
		_token=new Tokens.Rule.ReasonDeclarationToken();
		_position_NAME=_position;
		if(_state==SUCCESS&&!_recursion_protection_NAME_25.contains(_position)) {
			_recursion_protection_NAME_25.add(_position);
			parse_NAME();
			_recursion_protection_NAME_25.remove(_position_NAME);
		}
		else {
			_state=FAILED;
		}
		if(_state==SUCCESS) {
			String _value = _token.getLastValue();
			if(_value!=null) {
				reason_names.add(_value);
			}
			_token.add(_position,new Tokens.Name.ReasonNameToken(_value));
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_declaration(reason_declaration)");
				_furthestPosition=_position;
			}
			_position=_position_reason_declaration;
		}
		else {
			int _state_72 = _state;
			boolean _iteration_achieved_72 = false;
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
					_iteration_achieved_72=true;
				}
			}
			if(_iteration_achieved_72==false) {
				_state=FAILED;
			}
			else if(_state_72==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_declaration(reason_declaration)");
					_furthestPosition=_position;
				}
				_position=_position_reason_declaration;
			}
			else {
				parse_reason_description();
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_declaration(reason_declaration)");
						_furthestPosition=_position;
					}
					_position=_position_reason_declaration;
				}
				else {
				}
			}
		}
		if(_state==SUCCESS) {
			_token_reason_declaration.add(_position_reason_declaration,_token);
		}
		_token=_token_reason_declaration;
		if(_state==FAILED) {
			support_names.reject(_position_reason_declaration);
			association_names.reject(_position_reason_declaration);
			room_names.reject(_position_reason_declaration);
			activity_names.reject(_position_reason_declaration);
			siding_names.reject(_position_reason_declaration);
			item_names.reject(_position_reason_declaration);
			aspect_names.reject(_position_reason_declaration);
			affinity_names.reject(_position_reason_declaration);
			activity_type_names.reject(_position_reason_declaration);
			trail_names.reject(_position_reason_declaration);
			attack_names.reject(_position_reason_declaration);
			reason_names.reject(_position_reason_declaration);
			trait_names.reject(_position_reason_declaration);
			condition_names.reject(_position_reason_declaration);
			payment_short_type_names.reject(_position_reason_declaration);
			skill_names.reject(_position_reason_declaration);
			map_names.reject(_position_reason_declaration);
			event_names.reject(_position_reason_declaration);
			image_names.reject(_position_reason_declaration);
			tile_symbols.reject(_position_reason_declaration);
			payment_long_type_names.reject(_position_reason_declaration);
			area_names.reject(_position_reason_declaration);
			structure_names.reject(_position_reason_declaration);
			tile_names.reject(_position_reason_declaration);
			hero_stat.reject(_position_reason_declaration);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_reason_declaration);
			association_names.accept(_position_reason_declaration);
			room_names.accept(_position_reason_declaration);
			activity_names.accept(_position_reason_declaration);
			siding_names.accept(_position_reason_declaration);
			item_names.accept(_position_reason_declaration);
			aspect_names.accept(_position_reason_declaration);
			affinity_names.accept(_position_reason_declaration);
			activity_type_names.accept(_position_reason_declaration);
			trail_names.accept(_position_reason_declaration);
			attack_names.accept(_position_reason_declaration);
			reason_names.accept(_position_reason_declaration);
			trait_names.accept(_position_reason_declaration);
			condition_names.accept(_position_reason_declaration);
			payment_short_type_names.accept(_position_reason_declaration);
			skill_names.accept(_position_reason_declaration);
			map_names.accept(_position_reason_declaration);
			event_names.accept(_position_reason_declaration);
			image_names.accept(_position_reason_declaration);
			tile_symbols.accept(_position_reason_declaration);
			payment_long_type_names.accept(_position_reason_declaration);
			area_names.accept(_position_reason_declaration);
			structure_names.accept(_position_reason_declaration);
			tile_names.accept(_position_reason_declaration);
			hero_stat.accept(_position_reason_declaration);
		}
	}
	public void parse_reason_description() {
		int _position_reason_description = -1;
		Token.Parsed _token_reason_description = null;
		int _length_reason_description_brace = _inputLength;
		if(brace_2.containsKey(_position)) {
			room_names=room_names.push(_position,_pass);
			hero_stat=hero_stat.push(_position,_pass);
			_inputLength=brace_2.get(_position);
			int _position_reason_description_brace = _position;
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
			_position_reason_description=_position;
			_token_reason_description=_token;
			_token=new Tokens.Rule.ReasonDescriptionToken();
			int _state_73 = _state;
			while(_position<_inputLength) {
				parse_reason_description_element();
				if(_state==FAILED) {
					break;
				}
			}
			if(_state_73==SUCCESS&&_state==FAILED) {
				_state=SUCCESS;
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_description(reason_description)");
					_furthestPosition=_position;
				}
				_position=_position_reason_description;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_reason_description.addAll(_token);
				_token_reason_description.setValue(_token.getValue());
			}
			_token=_token_reason_description;
			if(_state==SUCCESS&&brace_2.get(_position_reason_description_brace)==_position) {
				_position+=1;
			}
			else {
				_state=SUCCESS;
				_result_acceptor.add(_result);
				_result_acceptor.add(new Parser.Result.Fail.EOB("reason_description",_position,_lineNumberRanges));
				_position=brace_2.get(_position_reason_description_brace)+1;
				_succeedOnEnd=false;
			}
			_inputLength=_length_reason_description_brace;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_state==FAILED) {
				support_names.reject(_position_reason_description);
				association_names.reject(_position_reason_description);
				room_names.reject(_position_reason_description);
				activity_names.reject(_position_reason_description);
				siding_names.reject(_position_reason_description);
				item_names.reject(_position_reason_description);
				aspect_names.reject(_position_reason_description);
				affinity_names.reject(_position_reason_description);
				activity_type_names.reject(_position_reason_description);
				trail_names.reject(_position_reason_description);
				attack_names.reject(_position_reason_description);
				reason_names.reject(_position_reason_description);
				trait_names.reject(_position_reason_description);
				condition_names.reject(_position_reason_description);
				payment_short_type_names.reject(_position_reason_description);
				skill_names.reject(_position_reason_description);
				map_names.reject(_position_reason_description);
				event_names.reject(_position_reason_description);
				image_names.reject(_position_reason_description);
				tile_symbols.reject(_position_reason_description);
				payment_long_type_names.reject(_position_reason_description);
				area_names.reject(_position_reason_description);
				structure_names.reject(_position_reason_description);
				tile_names.reject(_position_reason_description);
				hero_stat.reject(_position_reason_description);
			}
			else if(_state==SUCCESS) {
				support_names.accept(_position_reason_description);
				association_names.accept(_position_reason_description);
				room_names.accept(_position_reason_description);
				activity_names.accept(_position_reason_description);
				siding_names.accept(_position_reason_description);
				item_names.accept(_position_reason_description);
				aspect_names.accept(_position_reason_description);
				affinity_names.accept(_position_reason_description);
				activity_type_names.accept(_position_reason_description);
				trail_names.accept(_position_reason_description);
				attack_names.accept(_position_reason_description);
				reason_names.accept(_position_reason_description);
				trait_names.accept(_position_reason_description);
				condition_names.accept(_position_reason_description);
				payment_short_type_names.accept(_position_reason_description);
				skill_names.accept(_position_reason_description);
				map_names.accept(_position_reason_description);
				event_names.accept(_position_reason_description);
				image_names.accept(_position_reason_description);
				tile_symbols.accept(_position_reason_description);
				payment_long_type_names.accept(_position_reason_description);
				area_names.accept(_position_reason_description);
				structure_names.accept(_position_reason_description);
				tile_names.accept(_position_reason_description);
				hero_stat.accept(_position_reason_description);
			}
			room_names=room_names.pop();
			hero_stat=hero_stat.pop();
		}
		else {
			_state=FAILED;
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"reason_description(reason_description)");
				_furthestPosition=_position;
			}
		}
	}
}