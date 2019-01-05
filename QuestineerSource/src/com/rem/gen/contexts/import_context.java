package com.rem.gen.contexts;
import java.util.*;
import java.io.*;
import java.io.File;
import com.rem.gen.contexts.attack_context;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Parser;
import com.rem.gen.parser.Tokens;

public abstract class import_context extends attack_context{
	protected Parser __parser__ = null;
	protected Tokens __tokens__ = null;
	public import_context(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
		super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
	}
	public import_context() {
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
	public void parse_import_event() {
		int _position_import_event = -1;
		Token.Parsed _token_import_event = null;
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
		_position_import_event=_position;
		_token_import_event=_token;
		_token=new Tokens.Rule.ImportEventToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_event(import_event)");
				_furthestPosition=_position;
			}
			_position=_position_import_event;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_event(import_event)");
					_furthestPosition=_position;
				}
				_position=_position_import_event;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='v') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_99.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .evts");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_event(import_event)");
						_furthestPosition=_position;
					}
					_position=_position_import_event;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_event(import_event)");
							_furthestPosition=_position;
						}
						_position=_position_import_event;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("events/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".evts");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportEventFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_event;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_event.add(_position_import_event,_token);
		}
		_token=_token_import_event;
		if(_state==FAILED) {
			support_names.reject(_position_import_event);
			association_names.reject(_position_import_event);
			room_names.reject(_position_import_event);
			activity_names.reject(_position_import_event);
			siding_names.reject(_position_import_event);
			item_names.reject(_position_import_event);
			aspect_names.reject(_position_import_event);
			affinity_names.reject(_position_import_event);
			activity_type_names.reject(_position_import_event);
			trail_names.reject(_position_import_event);
			attack_names.reject(_position_import_event);
			reason_names.reject(_position_import_event);
			trait_names.reject(_position_import_event);
			condition_names.reject(_position_import_event);
			payment_short_type_names.reject(_position_import_event);
			skill_names.reject(_position_import_event);
			map_names.reject(_position_import_event);
			event_names.reject(_position_import_event);
			image_names.reject(_position_import_event);
			tile_symbols.reject(_position_import_event);
			payment_long_type_names.reject(_position_import_event);
			area_names.reject(_position_import_event);
			structure_names.reject(_position_import_event);
			tile_names.reject(_position_import_event);
			hero_stat.reject(_position_import_event);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_event);
			association_names.accept(_position_import_event);
			room_names.accept(_position_import_event);
			activity_names.accept(_position_import_event);
			siding_names.accept(_position_import_event);
			item_names.accept(_position_import_event);
			aspect_names.accept(_position_import_event);
			affinity_names.accept(_position_import_event);
			activity_type_names.accept(_position_import_event);
			trail_names.accept(_position_import_event);
			attack_names.accept(_position_import_event);
			reason_names.accept(_position_import_event);
			trait_names.accept(_position_import_event);
			condition_names.accept(_position_import_event);
			payment_short_type_names.accept(_position_import_event);
			skill_names.accept(_position_import_event);
			map_names.accept(_position_import_event);
			event_names.accept(_position_import_event);
			image_names.accept(_position_import_event);
			tile_symbols.accept(_position_import_event);
			payment_long_type_names.accept(_position_import_event);
			area_names.accept(_position_import_event);
			structure_names.accept(_position_import_event);
			tile_names.accept(_position_import_event);
			hero_stat.accept(_position_import_event);
		}
	}
	public void parse_import_payment_type__file_import() {
		int _position_import_payment_type__file_import = -1;
		Token.Parsed _token_import_payment_type__file_import = null;
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
		_position_import_payment_type__file_import=_position;
		_token_import_payment_type__file_import=_token;
		_token=new Tokens.Rule.ImportPaymentTypeFileImportToken();
		int _state_151 = _state;
		while(_position<_inputLength) {
			parse__anonymous_119();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_151==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_payment_type__file_import.addAll(_token);
			_token_import_payment_type__file_import.setValue(_token.getValue());
		}
		_token=_token_import_payment_type__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_payment_type__file_import);
			association_names.reject(_position_import_payment_type__file_import);
			room_names.reject(_position_import_payment_type__file_import);
			activity_names.reject(_position_import_payment_type__file_import);
			siding_names.reject(_position_import_payment_type__file_import);
			item_names.reject(_position_import_payment_type__file_import);
			aspect_names.reject(_position_import_payment_type__file_import);
			affinity_names.reject(_position_import_payment_type__file_import);
			activity_type_names.reject(_position_import_payment_type__file_import);
			trail_names.reject(_position_import_payment_type__file_import);
			attack_names.reject(_position_import_payment_type__file_import);
			reason_names.reject(_position_import_payment_type__file_import);
			trait_names.reject(_position_import_payment_type__file_import);
			condition_names.reject(_position_import_payment_type__file_import);
			payment_short_type_names.reject(_position_import_payment_type__file_import);
			skill_names.reject(_position_import_payment_type__file_import);
			map_names.reject(_position_import_payment_type__file_import);
			event_names.reject(_position_import_payment_type__file_import);
			image_names.reject(_position_import_payment_type__file_import);
			tile_symbols.reject(_position_import_payment_type__file_import);
			payment_long_type_names.reject(_position_import_payment_type__file_import);
			area_names.reject(_position_import_payment_type__file_import);
			structure_names.reject(_position_import_payment_type__file_import);
			tile_names.reject(_position_import_payment_type__file_import);
			hero_stat.reject(_position_import_payment_type__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_payment_type__file_import);
			association_names.accept(_position_import_payment_type__file_import);
			room_names.accept(_position_import_payment_type__file_import);
			activity_names.accept(_position_import_payment_type__file_import);
			siding_names.accept(_position_import_payment_type__file_import);
			item_names.accept(_position_import_payment_type__file_import);
			aspect_names.accept(_position_import_payment_type__file_import);
			affinity_names.accept(_position_import_payment_type__file_import);
			activity_type_names.accept(_position_import_payment_type__file_import);
			trail_names.accept(_position_import_payment_type__file_import);
			attack_names.accept(_position_import_payment_type__file_import);
			reason_names.accept(_position_import_payment_type__file_import);
			trait_names.accept(_position_import_payment_type__file_import);
			condition_names.accept(_position_import_payment_type__file_import);
			payment_short_type_names.accept(_position_import_payment_type__file_import);
			skill_names.accept(_position_import_payment_type__file_import);
			map_names.accept(_position_import_payment_type__file_import);
			event_names.accept(_position_import_payment_type__file_import);
			image_names.accept(_position_import_payment_type__file_import);
			tile_symbols.accept(_position_import_payment_type__file_import);
			payment_long_type_names.accept(_position_import_payment_type__file_import);
			area_names.accept(_position_import_payment_type__file_import);
			structure_names.accept(_position_import_payment_type__file_import);
			tile_names.accept(_position_import_payment_type__file_import);
			hero_stat.accept(_position_import_payment_type__file_import);
		}
	}
	public void parse_import_support__file_import() {
		int _position_import_support__file_import = -1;
		Token.Parsed _token_import_support__file_import = null;
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
		_position_import_support__file_import=_position;
		_token_import_support__file_import=_token;
		_token=new Tokens.Rule.ImportSupportFileImportToken();
		int _state_59 = _state;
		while(_position<_inputLength) {
			parse__anonymous_46();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_59==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_support__file_import.addAll(_token);
			_token_import_support__file_import.setValue(_token.getValue());
		}
		_token=_token_import_support__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_support__file_import);
			association_names.reject(_position_import_support__file_import);
			room_names.reject(_position_import_support__file_import);
			activity_names.reject(_position_import_support__file_import);
			siding_names.reject(_position_import_support__file_import);
			item_names.reject(_position_import_support__file_import);
			aspect_names.reject(_position_import_support__file_import);
			affinity_names.reject(_position_import_support__file_import);
			activity_type_names.reject(_position_import_support__file_import);
			trail_names.reject(_position_import_support__file_import);
			attack_names.reject(_position_import_support__file_import);
			reason_names.reject(_position_import_support__file_import);
			trait_names.reject(_position_import_support__file_import);
			condition_names.reject(_position_import_support__file_import);
			payment_short_type_names.reject(_position_import_support__file_import);
			skill_names.reject(_position_import_support__file_import);
			map_names.reject(_position_import_support__file_import);
			event_names.reject(_position_import_support__file_import);
			image_names.reject(_position_import_support__file_import);
			tile_symbols.reject(_position_import_support__file_import);
			payment_long_type_names.reject(_position_import_support__file_import);
			area_names.reject(_position_import_support__file_import);
			structure_names.reject(_position_import_support__file_import);
			tile_names.reject(_position_import_support__file_import);
			hero_stat.reject(_position_import_support__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_support__file_import);
			association_names.accept(_position_import_support__file_import);
			room_names.accept(_position_import_support__file_import);
			activity_names.accept(_position_import_support__file_import);
			siding_names.accept(_position_import_support__file_import);
			item_names.accept(_position_import_support__file_import);
			aspect_names.accept(_position_import_support__file_import);
			affinity_names.accept(_position_import_support__file_import);
			activity_type_names.accept(_position_import_support__file_import);
			trail_names.accept(_position_import_support__file_import);
			attack_names.accept(_position_import_support__file_import);
			reason_names.accept(_position_import_support__file_import);
			trait_names.accept(_position_import_support__file_import);
			condition_names.accept(_position_import_support__file_import);
			payment_short_type_names.accept(_position_import_support__file_import);
			skill_names.accept(_position_import_support__file_import);
			map_names.accept(_position_import_support__file_import);
			event_names.accept(_position_import_support__file_import);
			image_names.accept(_position_import_support__file_import);
			tile_symbols.accept(_position_import_support__file_import);
			payment_long_type_names.accept(_position_import_support__file_import);
			area_names.accept(_position_import_support__file_import);
			structure_names.accept(_position_import_support__file_import);
			tile_names.accept(_position_import_support__file_import);
			hero_stat.accept(_position_import_support__file_import);
		}
	}
	public void parse_import_reason() {
		int _position_import_reason = -1;
		Token.Parsed _token_import_reason = null;
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
		_position_import_reason=_position;
		_token_import_reason=_token;
		_token=new Tokens.Rule.ImportReasonToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_reason(import_reason)");
				_furthestPosition=_position;
			}
			_position=_position_import_reason;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_reason(import_reason)");
					_furthestPosition=_position;
				}
				_position=_position_import_reason;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='r') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='n') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_51.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .rsns");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_reason(import_reason)");
						_furthestPosition=_position;
					}
					_position=_position_import_reason;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_reason(import_reason)");
							_furthestPosition=_position;
						}
						_position=_position_import_reason;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/relations/reasons/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".rsns");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportReasonFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_reason;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_reason.add(_position_import_reason,_token);
		}
		_token=_token_import_reason;
		if(_state==FAILED) {
			support_names.reject(_position_import_reason);
			association_names.reject(_position_import_reason);
			room_names.reject(_position_import_reason);
			activity_names.reject(_position_import_reason);
			siding_names.reject(_position_import_reason);
			item_names.reject(_position_import_reason);
			aspect_names.reject(_position_import_reason);
			affinity_names.reject(_position_import_reason);
			activity_type_names.reject(_position_import_reason);
			trail_names.reject(_position_import_reason);
			attack_names.reject(_position_import_reason);
			reason_names.reject(_position_import_reason);
			trait_names.reject(_position_import_reason);
			condition_names.reject(_position_import_reason);
			payment_short_type_names.reject(_position_import_reason);
			skill_names.reject(_position_import_reason);
			map_names.reject(_position_import_reason);
			event_names.reject(_position_import_reason);
			image_names.reject(_position_import_reason);
			tile_symbols.reject(_position_import_reason);
			payment_long_type_names.reject(_position_import_reason);
			area_names.reject(_position_import_reason);
			structure_names.reject(_position_import_reason);
			tile_names.reject(_position_import_reason);
			hero_stat.reject(_position_import_reason);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_reason);
			association_names.accept(_position_import_reason);
			room_names.accept(_position_import_reason);
			activity_names.accept(_position_import_reason);
			siding_names.accept(_position_import_reason);
			item_names.accept(_position_import_reason);
			aspect_names.accept(_position_import_reason);
			affinity_names.accept(_position_import_reason);
			activity_type_names.accept(_position_import_reason);
			trail_names.accept(_position_import_reason);
			attack_names.accept(_position_import_reason);
			reason_names.accept(_position_import_reason);
			trait_names.accept(_position_import_reason);
			condition_names.accept(_position_import_reason);
			payment_short_type_names.accept(_position_import_reason);
			skill_names.accept(_position_import_reason);
			map_names.accept(_position_import_reason);
			event_names.accept(_position_import_reason);
			image_names.accept(_position_import_reason);
			tile_symbols.accept(_position_import_reason);
			payment_long_type_names.accept(_position_import_reason);
			area_names.accept(_position_import_reason);
			structure_names.accept(_position_import_reason);
			tile_names.accept(_position_import_reason);
			hero_stat.accept(_position_import_reason);
		}
	}
	public void parse_import_attack() {
		int _position_import_attack = -1;
		Token.Parsed _token_import_attack = null;
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
		_position_import_attack=_position;
		_token_import_attack=_token;
		_token=new Tokens.Rule.ImportAttackToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_attack(import_attack)");
				_furthestPosition=_position;
			}
			_position=_position_import_attack;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_attack(import_attack)");
					_furthestPosition=_position;
				}
				_position=_position_import_attack;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='k') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_37.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .atks");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_attack(import_attack)");
						_furthestPosition=_position;
					}
					_position=_position_import_attack;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_attack(import_attack)");
							_furthestPosition=_position;
						}
						_position=_position_import_attack;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/behaviours/skills/attacks/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".atks");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportAttackFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_attack;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_attack.add(_position_import_attack,_token);
		}
		_token=_token_import_attack;
		if(_state==FAILED) {
			support_names.reject(_position_import_attack);
			association_names.reject(_position_import_attack);
			room_names.reject(_position_import_attack);
			activity_names.reject(_position_import_attack);
			siding_names.reject(_position_import_attack);
			item_names.reject(_position_import_attack);
			aspect_names.reject(_position_import_attack);
			affinity_names.reject(_position_import_attack);
			activity_type_names.reject(_position_import_attack);
			trail_names.reject(_position_import_attack);
			attack_names.reject(_position_import_attack);
			reason_names.reject(_position_import_attack);
			trait_names.reject(_position_import_attack);
			condition_names.reject(_position_import_attack);
			payment_short_type_names.reject(_position_import_attack);
			skill_names.reject(_position_import_attack);
			map_names.reject(_position_import_attack);
			event_names.reject(_position_import_attack);
			image_names.reject(_position_import_attack);
			tile_symbols.reject(_position_import_attack);
			payment_long_type_names.reject(_position_import_attack);
			area_names.reject(_position_import_attack);
			structure_names.reject(_position_import_attack);
			tile_names.reject(_position_import_attack);
			hero_stat.reject(_position_import_attack);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_attack);
			association_names.accept(_position_import_attack);
			room_names.accept(_position_import_attack);
			activity_names.accept(_position_import_attack);
			siding_names.accept(_position_import_attack);
			item_names.accept(_position_import_attack);
			aspect_names.accept(_position_import_attack);
			affinity_names.accept(_position_import_attack);
			activity_type_names.accept(_position_import_attack);
			trail_names.accept(_position_import_attack);
			attack_names.accept(_position_import_attack);
			reason_names.accept(_position_import_attack);
			trait_names.accept(_position_import_attack);
			condition_names.accept(_position_import_attack);
			payment_short_type_names.accept(_position_import_attack);
			skill_names.accept(_position_import_attack);
			map_names.accept(_position_import_attack);
			event_names.accept(_position_import_attack);
			image_names.accept(_position_import_attack);
			tile_symbols.accept(_position_import_attack);
			payment_long_type_names.accept(_position_import_attack);
			area_names.accept(_position_import_attack);
			structure_names.accept(_position_import_attack);
			tile_names.accept(_position_import_attack);
			hero_stat.accept(_position_import_attack);
		}
	}
	public void parse_import_tile() {
		int _position_import_tile = -1;
		Token.Parsed _token_import_tile = null;
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
		_position_import_tile=_position;
		_token_import_tile=_token;
		_token=new Tokens.Rule.ImportTileToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_tile(import_tile)");
				_furthestPosition=_position;
			}
			_position=_position_import_tile;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_tile(import_tile)");
					_furthestPosition=_position;
				}
				_position=_position_import_tile;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='l') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='e') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_74.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .tile");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_tile(import_tile)");
						_furthestPosition=_position;
					}
					_position=_position_import_tile;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_tile(import_tile)");
							_furthestPosition=_position;
						}
						_position=_position_import_tile;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("../tiles/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".tile");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportTileFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_tile;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_tile.add(_position_import_tile,_token);
		}
		_token=_token_import_tile;
		if(_state==FAILED) {
			support_names.reject(_position_import_tile);
			association_names.reject(_position_import_tile);
			room_names.reject(_position_import_tile);
			activity_names.reject(_position_import_tile);
			siding_names.reject(_position_import_tile);
			item_names.reject(_position_import_tile);
			aspect_names.reject(_position_import_tile);
			affinity_names.reject(_position_import_tile);
			activity_type_names.reject(_position_import_tile);
			trail_names.reject(_position_import_tile);
			attack_names.reject(_position_import_tile);
			reason_names.reject(_position_import_tile);
			trait_names.reject(_position_import_tile);
			condition_names.reject(_position_import_tile);
			payment_short_type_names.reject(_position_import_tile);
			skill_names.reject(_position_import_tile);
			map_names.reject(_position_import_tile);
			event_names.reject(_position_import_tile);
			image_names.reject(_position_import_tile);
			tile_symbols.reject(_position_import_tile);
			payment_long_type_names.reject(_position_import_tile);
			area_names.reject(_position_import_tile);
			structure_names.reject(_position_import_tile);
			tile_names.reject(_position_import_tile);
			hero_stat.reject(_position_import_tile);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_tile);
			association_names.accept(_position_import_tile);
			room_names.accept(_position_import_tile);
			activity_names.accept(_position_import_tile);
			siding_names.accept(_position_import_tile);
			item_names.accept(_position_import_tile);
			aspect_names.accept(_position_import_tile);
			affinity_names.accept(_position_import_tile);
			activity_type_names.accept(_position_import_tile);
			trail_names.accept(_position_import_tile);
			attack_names.accept(_position_import_tile);
			reason_names.accept(_position_import_tile);
			trait_names.accept(_position_import_tile);
			condition_names.accept(_position_import_tile);
			payment_short_type_names.accept(_position_import_tile);
			skill_names.accept(_position_import_tile);
			map_names.accept(_position_import_tile);
			event_names.accept(_position_import_tile);
			image_names.accept(_position_import_tile);
			tile_symbols.accept(_position_import_tile);
			payment_long_type_names.accept(_position_import_tile);
			area_names.accept(_position_import_tile);
			structure_names.accept(_position_import_tile);
			tile_names.accept(_position_import_tile);
			hero_stat.accept(_position_import_tile);
		}
	}
	public void parse_import_attack__file_import() {
		int _position_import_attack__file_import = -1;
		Token.Parsed _token_import_attack__file_import = null;
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
		_position_import_attack__file_import=_position;
		_token_import_attack__file_import=_token;
		_token=new Tokens.Rule.ImportAttackFileImportToken();
		int _state_53 = _state;
		while(_position<_inputLength) {
			parse__anonymous_38();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_53==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_attack__file_import.addAll(_token);
			_token_import_attack__file_import.setValue(_token.getValue());
		}
		_token=_token_import_attack__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_attack__file_import);
			association_names.reject(_position_import_attack__file_import);
			room_names.reject(_position_import_attack__file_import);
			activity_names.reject(_position_import_attack__file_import);
			siding_names.reject(_position_import_attack__file_import);
			item_names.reject(_position_import_attack__file_import);
			aspect_names.reject(_position_import_attack__file_import);
			affinity_names.reject(_position_import_attack__file_import);
			activity_type_names.reject(_position_import_attack__file_import);
			trail_names.reject(_position_import_attack__file_import);
			attack_names.reject(_position_import_attack__file_import);
			reason_names.reject(_position_import_attack__file_import);
			trait_names.reject(_position_import_attack__file_import);
			condition_names.reject(_position_import_attack__file_import);
			payment_short_type_names.reject(_position_import_attack__file_import);
			skill_names.reject(_position_import_attack__file_import);
			map_names.reject(_position_import_attack__file_import);
			event_names.reject(_position_import_attack__file_import);
			image_names.reject(_position_import_attack__file_import);
			tile_symbols.reject(_position_import_attack__file_import);
			payment_long_type_names.reject(_position_import_attack__file_import);
			area_names.reject(_position_import_attack__file_import);
			structure_names.reject(_position_import_attack__file_import);
			tile_names.reject(_position_import_attack__file_import);
			hero_stat.reject(_position_import_attack__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_attack__file_import);
			association_names.accept(_position_import_attack__file_import);
			room_names.accept(_position_import_attack__file_import);
			activity_names.accept(_position_import_attack__file_import);
			siding_names.accept(_position_import_attack__file_import);
			item_names.accept(_position_import_attack__file_import);
			aspect_names.accept(_position_import_attack__file_import);
			affinity_names.accept(_position_import_attack__file_import);
			activity_type_names.accept(_position_import_attack__file_import);
			trail_names.accept(_position_import_attack__file_import);
			attack_names.accept(_position_import_attack__file_import);
			reason_names.accept(_position_import_attack__file_import);
			trait_names.accept(_position_import_attack__file_import);
			condition_names.accept(_position_import_attack__file_import);
			payment_short_type_names.accept(_position_import_attack__file_import);
			skill_names.accept(_position_import_attack__file_import);
			map_names.accept(_position_import_attack__file_import);
			event_names.accept(_position_import_attack__file_import);
			image_names.accept(_position_import_attack__file_import);
			tile_symbols.accept(_position_import_attack__file_import);
			payment_long_type_names.accept(_position_import_attack__file_import);
			area_names.accept(_position_import_attack__file_import);
			structure_names.accept(_position_import_attack__file_import);
			tile_names.accept(_position_import_attack__file_import);
			hero_stat.accept(_position_import_attack__file_import);
		}
	}
	public void parse_import_animation_type__file_import() {
		int _position_import_animation_type__file_import = -1;
		Token.Parsed _token_import_animation_type__file_import = null;
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
		_position_import_animation_type__file_import=_position;
		_token_import_animation_type__file_import=_token;
		_token=new Tokens.Rule.ImportAnimationTypeFileImportToken();
		int _state_219 = _state;
		while(_position<_inputLength) {
			parse__anonymous_203();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_219==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_animation_type__file_import.addAll(_token);
			_token_import_animation_type__file_import.setValue(_token.getValue());
		}
		_token=_token_import_animation_type__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_animation_type__file_import);
			association_names.reject(_position_import_animation_type__file_import);
			room_names.reject(_position_import_animation_type__file_import);
			activity_names.reject(_position_import_animation_type__file_import);
			siding_names.reject(_position_import_animation_type__file_import);
			item_names.reject(_position_import_animation_type__file_import);
			aspect_names.reject(_position_import_animation_type__file_import);
			affinity_names.reject(_position_import_animation_type__file_import);
			activity_type_names.reject(_position_import_animation_type__file_import);
			trail_names.reject(_position_import_animation_type__file_import);
			attack_names.reject(_position_import_animation_type__file_import);
			reason_names.reject(_position_import_animation_type__file_import);
			trait_names.reject(_position_import_animation_type__file_import);
			condition_names.reject(_position_import_animation_type__file_import);
			payment_short_type_names.reject(_position_import_animation_type__file_import);
			skill_names.reject(_position_import_animation_type__file_import);
			map_names.reject(_position_import_animation_type__file_import);
			event_names.reject(_position_import_animation_type__file_import);
			image_names.reject(_position_import_animation_type__file_import);
			tile_symbols.reject(_position_import_animation_type__file_import);
			payment_long_type_names.reject(_position_import_animation_type__file_import);
			area_names.reject(_position_import_animation_type__file_import);
			structure_names.reject(_position_import_animation_type__file_import);
			tile_names.reject(_position_import_animation_type__file_import);
			hero_stat.reject(_position_import_animation_type__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_animation_type__file_import);
			association_names.accept(_position_import_animation_type__file_import);
			room_names.accept(_position_import_animation_type__file_import);
			activity_names.accept(_position_import_animation_type__file_import);
			siding_names.accept(_position_import_animation_type__file_import);
			item_names.accept(_position_import_animation_type__file_import);
			aspect_names.accept(_position_import_animation_type__file_import);
			affinity_names.accept(_position_import_animation_type__file_import);
			activity_type_names.accept(_position_import_animation_type__file_import);
			trail_names.accept(_position_import_animation_type__file_import);
			attack_names.accept(_position_import_animation_type__file_import);
			reason_names.accept(_position_import_animation_type__file_import);
			trait_names.accept(_position_import_animation_type__file_import);
			condition_names.accept(_position_import_animation_type__file_import);
			payment_short_type_names.accept(_position_import_animation_type__file_import);
			skill_names.accept(_position_import_animation_type__file_import);
			map_names.accept(_position_import_animation_type__file_import);
			event_names.accept(_position_import_animation_type__file_import);
			image_names.accept(_position_import_animation_type__file_import);
			tile_symbols.accept(_position_import_animation_type__file_import);
			payment_long_type_names.accept(_position_import_animation_type__file_import);
			area_names.accept(_position_import_animation_type__file_import);
			structure_names.accept(_position_import_animation_type__file_import);
			tile_names.accept(_position_import_animation_type__file_import);
			hero_stat.accept(_position_import_animation_type__file_import);
		}
	}
	public void parse_import_colour() {
		int _position_import_colour = -1;
		Token.Parsed _token_import_colour = null;
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
		_position_import_colour=_position;
		_token_import_colour=_token;
		_token=new Tokens.Rule.ImportColourToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_colour(import_colour)");
				_furthestPosition=_position;
			}
			_position=_position_import_colour;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_colour(import_colour)");
					_furthestPosition=_position;
				}
				_position=_position_import_colour;
			}
			else {
				if(_position+8-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='c') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='o') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='l') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='o') {
						_state=FAILED;
					}
					if(_inputArray[_position+5]!='u') {
						_state=FAILED;
					}
					if(_inputArray[_position+6]!='r') {
						_state=FAILED;
					}
					if(_inputArray[_position+7]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_161.SYNTAX);
					_position=_position+8;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .colours");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_colour(import_colour)");
						_furthestPosition=_position;
					}
					_position=_position_import_colour;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_colour(import_colour)");
							_furthestPosition=_position;
						}
						_position=_position_import_colour;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("gui/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".colours");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportColourFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_colour;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_colour.add(_position_import_colour,_token);
		}
		_token=_token_import_colour;
		if(_state==FAILED) {
			support_names.reject(_position_import_colour);
			association_names.reject(_position_import_colour);
			room_names.reject(_position_import_colour);
			activity_names.reject(_position_import_colour);
			siding_names.reject(_position_import_colour);
			item_names.reject(_position_import_colour);
			aspect_names.reject(_position_import_colour);
			affinity_names.reject(_position_import_colour);
			activity_type_names.reject(_position_import_colour);
			trail_names.reject(_position_import_colour);
			attack_names.reject(_position_import_colour);
			reason_names.reject(_position_import_colour);
			trait_names.reject(_position_import_colour);
			condition_names.reject(_position_import_colour);
			payment_short_type_names.reject(_position_import_colour);
			skill_names.reject(_position_import_colour);
			map_names.reject(_position_import_colour);
			event_names.reject(_position_import_colour);
			image_names.reject(_position_import_colour);
			tile_symbols.reject(_position_import_colour);
			payment_long_type_names.reject(_position_import_colour);
			area_names.reject(_position_import_colour);
			structure_names.reject(_position_import_colour);
			tile_names.reject(_position_import_colour);
			hero_stat.reject(_position_import_colour);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_colour);
			association_names.accept(_position_import_colour);
			room_names.accept(_position_import_colour);
			activity_names.accept(_position_import_colour);
			siding_names.accept(_position_import_colour);
			item_names.accept(_position_import_colour);
			aspect_names.accept(_position_import_colour);
			affinity_names.accept(_position_import_colour);
			activity_type_names.accept(_position_import_colour);
			trail_names.accept(_position_import_colour);
			attack_names.accept(_position_import_colour);
			reason_names.accept(_position_import_colour);
			trait_names.accept(_position_import_colour);
			condition_names.accept(_position_import_colour);
			payment_short_type_names.accept(_position_import_colour);
			skill_names.accept(_position_import_colour);
			map_names.accept(_position_import_colour);
			event_names.accept(_position_import_colour);
			image_names.accept(_position_import_colour);
			tile_symbols.accept(_position_import_colour);
			payment_long_type_names.accept(_position_import_colour);
			area_names.accept(_position_import_colour);
			structure_names.accept(_position_import_colour);
			tile_names.accept(_position_import_colour);
			hero_stat.accept(_position_import_colour);
		}
	}
	public void parse_import_any() {
		int _position_import_any = -1;
		Token.Parsed _token_import_any = null;
		int _position_import_item = -1;
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
		_position_import_any=_position;
		_token_import_any=_token;
		_token=new Tokens.Rule.ImportAnyToken();
		parse_import_payment_type();
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
				_furthestPosition=_position;
			}
			_position=_position_import_any;
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_any.add(_position_import_any,_token);
		}
		_token=_token_import_any;
		if(_state==FAILED) {
			support_names.reject(_position_import_any);
			association_names.reject(_position_import_any);
			room_names.reject(_position_import_any);
			activity_names.reject(_position_import_any);
			siding_names.reject(_position_import_any);
			item_names.reject(_position_import_any);
			aspect_names.reject(_position_import_any);
			affinity_names.reject(_position_import_any);
			activity_type_names.reject(_position_import_any);
			trail_names.reject(_position_import_any);
			attack_names.reject(_position_import_any);
			reason_names.reject(_position_import_any);
			trait_names.reject(_position_import_any);
			condition_names.reject(_position_import_any);
			payment_short_type_names.reject(_position_import_any);
			skill_names.reject(_position_import_any);
			map_names.reject(_position_import_any);
			event_names.reject(_position_import_any);
			image_names.reject(_position_import_any);
			tile_symbols.reject(_position_import_any);
			payment_long_type_names.reject(_position_import_any);
			area_names.reject(_position_import_any);
			structure_names.reject(_position_import_any);
			tile_names.reject(_position_import_any);
			hero_stat.reject(_position_import_any);
			_state=SUCCESS;
			_position_import_any=_position;
			_token_import_any=_token;
			_token=new Tokens.Rule.ImportAnyToken();
			parse_import_event();
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
					_furthestPosition=_position;
				}
				_position=_position_import_any;
			}
			else {
			}
			if(_state==SUCCESS) {
				_token_import_any.add(_position_import_any,_token);
			}
			_token=_token_import_any;
			if(_state==FAILED) {
				support_names.reject(_position_import_any);
				association_names.reject(_position_import_any);
				room_names.reject(_position_import_any);
				activity_names.reject(_position_import_any);
				siding_names.reject(_position_import_any);
				item_names.reject(_position_import_any);
				aspect_names.reject(_position_import_any);
				affinity_names.reject(_position_import_any);
				activity_type_names.reject(_position_import_any);
				trail_names.reject(_position_import_any);
				attack_names.reject(_position_import_any);
				reason_names.reject(_position_import_any);
				trait_names.reject(_position_import_any);
				condition_names.reject(_position_import_any);
				payment_short_type_names.reject(_position_import_any);
				skill_names.reject(_position_import_any);
				map_names.reject(_position_import_any);
				event_names.reject(_position_import_any);
				image_names.reject(_position_import_any);
				tile_symbols.reject(_position_import_any);
				payment_long_type_names.reject(_position_import_any);
				area_names.reject(_position_import_any);
				structure_names.reject(_position_import_any);
				tile_names.reject(_position_import_any);
				hero_stat.reject(_position_import_any);
				_state=SUCCESS;
				_position_import_any=_position;
				_token_import_any=_token;
				_token=new Tokens.Rule.ImportAnyToken();
				_position_import_item=_position;
				if(_state==SUCCESS&&!_recursion_protection_import_item_0.contains(_position)) {
					_recursion_protection_import_item_0.add(_position);
					parse_import_item();
					_recursion_protection_import_item_0.remove(_position_import_item);
				}
				else {
					_state=FAILED;
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
						_furthestPosition=_position;
					}
					_position=_position_import_any;
				}
				else {
				}
				if(_state==SUCCESS) {
					_token_import_any.add(_position_import_any,_token);
				}
				_token=_token_import_any;
				if(_state==FAILED) {
					support_names.reject(_position_import_any);
					association_names.reject(_position_import_any);
					room_names.reject(_position_import_any);
					activity_names.reject(_position_import_any);
					siding_names.reject(_position_import_any);
					item_names.reject(_position_import_any);
					aspect_names.reject(_position_import_any);
					affinity_names.reject(_position_import_any);
					activity_type_names.reject(_position_import_any);
					trail_names.reject(_position_import_any);
					attack_names.reject(_position_import_any);
					reason_names.reject(_position_import_any);
					trait_names.reject(_position_import_any);
					condition_names.reject(_position_import_any);
					payment_short_type_names.reject(_position_import_any);
					skill_names.reject(_position_import_any);
					map_names.reject(_position_import_any);
					event_names.reject(_position_import_any);
					image_names.reject(_position_import_any);
					tile_symbols.reject(_position_import_any);
					payment_long_type_names.reject(_position_import_any);
					area_names.reject(_position_import_any);
					structure_names.reject(_position_import_any);
					tile_names.reject(_position_import_any);
					hero_stat.reject(_position_import_any);
					_state=SUCCESS;
					_position_import_any=_position;
					_token_import_any=_token;
					_token=new Tokens.Rule.ImportAnyToken();
					parse_import_image();
					if(_state==FAILED) {
						if(_position>=_furthestPosition) {
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
							_furthestPosition=_position;
						}
						_position=_position_import_any;
					}
					else {
					}
					if(_state==SUCCESS) {
						_token_import_any.add(_position_import_any,_token);
					}
					_token=_token_import_any;
					if(_state==FAILED) {
						support_names.reject(_position_import_any);
						association_names.reject(_position_import_any);
						room_names.reject(_position_import_any);
						activity_names.reject(_position_import_any);
						siding_names.reject(_position_import_any);
						item_names.reject(_position_import_any);
						aspect_names.reject(_position_import_any);
						affinity_names.reject(_position_import_any);
						activity_type_names.reject(_position_import_any);
						trail_names.reject(_position_import_any);
						attack_names.reject(_position_import_any);
						reason_names.reject(_position_import_any);
						trait_names.reject(_position_import_any);
						condition_names.reject(_position_import_any);
						payment_short_type_names.reject(_position_import_any);
						skill_names.reject(_position_import_any);
						map_names.reject(_position_import_any);
						event_names.reject(_position_import_any);
						image_names.reject(_position_import_any);
						tile_symbols.reject(_position_import_any);
						payment_long_type_names.reject(_position_import_any);
						area_names.reject(_position_import_any);
						structure_names.reject(_position_import_any);
						tile_names.reject(_position_import_any);
						hero_stat.reject(_position_import_any);
						_state=SUCCESS;
						_position_import_any=_position;
						_token_import_any=_token;
						_token=new Tokens.Rule.ImportAnyToken();
						parse_import_trait();
						if(_state==FAILED) {
							if(_position>=_furthestPosition) {
								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
								_furthestPosition=_position;
							}
							_position=_position_import_any;
						}
						else {
						}
						if(_state==SUCCESS) {
							_token_import_any.add(_position_import_any,_token);
						}
						_token=_token_import_any;
						if(_state==FAILED) {
							support_names.reject(_position_import_any);
							association_names.reject(_position_import_any);
							room_names.reject(_position_import_any);
							activity_names.reject(_position_import_any);
							siding_names.reject(_position_import_any);
							item_names.reject(_position_import_any);
							aspect_names.reject(_position_import_any);
							affinity_names.reject(_position_import_any);
							activity_type_names.reject(_position_import_any);
							trail_names.reject(_position_import_any);
							attack_names.reject(_position_import_any);
							reason_names.reject(_position_import_any);
							trait_names.reject(_position_import_any);
							condition_names.reject(_position_import_any);
							payment_short_type_names.reject(_position_import_any);
							skill_names.reject(_position_import_any);
							map_names.reject(_position_import_any);
							event_names.reject(_position_import_any);
							image_names.reject(_position_import_any);
							tile_symbols.reject(_position_import_any);
							payment_long_type_names.reject(_position_import_any);
							area_names.reject(_position_import_any);
							structure_names.reject(_position_import_any);
							tile_names.reject(_position_import_any);
							hero_stat.reject(_position_import_any);
							_state=SUCCESS;
							_position_import_any=_position;
							_token_import_any=_token;
							_token=new Tokens.Rule.ImportAnyToken();
							parse_import_aspect();
							if(_state==FAILED) {
								if(_position>=_furthestPosition) {
									_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
									_furthestPosition=_position;
								}
								_position=_position_import_any;
							}
							else {
							}
							if(_state==SUCCESS) {
								_token_import_any.add(_position_import_any,_token);
							}
							_token=_token_import_any;
							if(_state==FAILED) {
								support_names.reject(_position_import_any);
								association_names.reject(_position_import_any);
								room_names.reject(_position_import_any);
								activity_names.reject(_position_import_any);
								siding_names.reject(_position_import_any);
								item_names.reject(_position_import_any);
								aspect_names.reject(_position_import_any);
								affinity_names.reject(_position_import_any);
								activity_type_names.reject(_position_import_any);
								trail_names.reject(_position_import_any);
								attack_names.reject(_position_import_any);
								reason_names.reject(_position_import_any);
								trait_names.reject(_position_import_any);
								condition_names.reject(_position_import_any);
								payment_short_type_names.reject(_position_import_any);
								skill_names.reject(_position_import_any);
								map_names.reject(_position_import_any);
								event_names.reject(_position_import_any);
								image_names.reject(_position_import_any);
								tile_symbols.reject(_position_import_any);
								payment_long_type_names.reject(_position_import_any);
								area_names.reject(_position_import_any);
								structure_names.reject(_position_import_any);
								tile_names.reject(_position_import_any);
								hero_stat.reject(_position_import_any);
								_state=SUCCESS;
								_position_import_any=_position;
								_token_import_any=_token;
								_token=new Tokens.Rule.ImportAnyToken();
								parse_import_affinity();
								if(_state==FAILED) {
									if(_position>=_furthestPosition) {
										_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
										_furthestPosition=_position;
									}
									_position=_position_import_any;
								}
								else {
								}
								if(_state==SUCCESS) {
									_token_import_any.add(_position_import_any,_token);
								}
								_token=_token_import_any;
								if(_state==FAILED) {
									support_names.reject(_position_import_any);
									association_names.reject(_position_import_any);
									room_names.reject(_position_import_any);
									activity_names.reject(_position_import_any);
									siding_names.reject(_position_import_any);
									item_names.reject(_position_import_any);
									aspect_names.reject(_position_import_any);
									affinity_names.reject(_position_import_any);
									activity_type_names.reject(_position_import_any);
									trail_names.reject(_position_import_any);
									attack_names.reject(_position_import_any);
									reason_names.reject(_position_import_any);
									trait_names.reject(_position_import_any);
									condition_names.reject(_position_import_any);
									payment_short_type_names.reject(_position_import_any);
									skill_names.reject(_position_import_any);
									map_names.reject(_position_import_any);
									event_names.reject(_position_import_any);
									image_names.reject(_position_import_any);
									tile_symbols.reject(_position_import_any);
									payment_long_type_names.reject(_position_import_any);
									area_names.reject(_position_import_any);
									structure_names.reject(_position_import_any);
									tile_names.reject(_position_import_any);
									hero_stat.reject(_position_import_any);
									_state=SUCCESS;
									_position_import_any=_position;
									_token_import_any=_token;
									_token=new Tokens.Rule.ImportAnyToken();
									parse_import_condition();
									if(_state==FAILED) {
										if(_position>=_furthestPosition) {
											_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
											_furthestPosition=_position;
										}
										_position=_position_import_any;
									}
									else {
									}
									if(_state==SUCCESS) {
										_token_import_any.add(_position_import_any,_token);
									}
									_token=_token_import_any;
									if(_state==FAILED) {
										support_names.reject(_position_import_any);
										association_names.reject(_position_import_any);
										room_names.reject(_position_import_any);
										activity_names.reject(_position_import_any);
										siding_names.reject(_position_import_any);
										item_names.reject(_position_import_any);
										aspect_names.reject(_position_import_any);
										affinity_names.reject(_position_import_any);
										activity_type_names.reject(_position_import_any);
										trail_names.reject(_position_import_any);
										attack_names.reject(_position_import_any);
										reason_names.reject(_position_import_any);
										trait_names.reject(_position_import_any);
										condition_names.reject(_position_import_any);
										payment_short_type_names.reject(_position_import_any);
										skill_names.reject(_position_import_any);
										map_names.reject(_position_import_any);
										event_names.reject(_position_import_any);
										image_names.reject(_position_import_any);
										tile_symbols.reject(_position_import_any);
										payment_long_type_names.reject(_position_import_any);
										area_names.reject(_position_import_any);
										structure_names.reject(_position_import_any);
										tile_names.reject(_position_import_any);
										hero_stat.reject(_position_import_any);
										_state=SUCCESS;
										_position_import_any=_position;
										_token_import_any=_token;
										_token=new Tokens.Rule.ImportAnyToken();
										parse_import_activity();
										if(_state==FAILED) {
											if(_position>=_furthestPosition) {
												_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
												_furthestPosition=_position;
											}
											_position=_position_import_any;
										}
										else {
										}
										if(_state==SUCCESS) {
											_token_import_any.add(_position_import_any,_token);
										}
										_token=_token_import_any;
										if(_state==FAILED) {
											support_names.reject(_position_import_any);
											association_names.reject(_position_import_any);
											room_names.reject(_position_import_any);
											activity_names.reject(_position_import_any);
											siding_names.reject(_position_import_any);
											item_names.reject(_position_import_any);
											aspect_names.reject(_position_import_any);
											affinity_names.reject(_position_import_any);
											activity_type_names.reject(_position_import_any);
											trail_names.reject(_position_import_any);
											attack_names.reject(_position_import_any);
											reason_names.reject(_position_import_any);
											trait_names.reject(_position_import_any);
											condition_names.reject(_position_import_any);
											payment_short_type_names.reject(_position_import_any);
											skill_names.reject(_position_import_any);
											map_names.reject(_position_import_any);
											event_names.reject(_position_import_any);
											image_names.reject(_position_import_any);
											tile_symbols.reject(_position_import_any);
											payment_long_type_names.reject(_position_import_any);
											area_names.reject(_position_import_any);
											structure_names.reject(_position_import_any);
											tile_names.reject(_position_import_any);
											hero_stat.reject(_position_import_any);
											_state=SUCCESS;
											_position_import_any=_position;
											_token_import_any=_token;
											_token=new Tokens.Rule.ImportAnyToken();
											parse_import_quest();
											if(_state==FAILED) {
												if(_position>=_furthestPosition) {
													_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
													_furthestPosition=_position;
												}
												_position=_position_import_any;
											}
											else {
											}
											if(_state==SUCCESS) {
												_token_import_any.add(_position_import_any,_token);
											}
											_token=_token_import_any;
											if(_state==FAILED) {
												support_names.reject(_position_import_any);
												association_names.reject(_position_import_any);
												room_names.reject(_position_import_any);
												activity_names.reject(_position_import_any);
												siding_names.reject(_position_import_any);
												item_names.reject(_position_import_any);
												aspect_names.reject(_position_import_any);
												affinity_names.reject(_position_import_any);
												activity_type_names.reject(_position_import_any);
												trail_names.reject(_position_import_any);
												attack_names.reject(_position_import_any);
												reason_names.reject(_position_import_any);
												trait_names.reject(_position_import_any);
												condition_names.reject(_position_import_any);
												payment_short_type_names.reject(_position_import_any);
												skill_names.reject(_position_import_any);
												map_names.reject(_position_import_any);
												event_names.reject(_position_import_any);
												image_names.reject(_position_import_any);
												tile_symbols.reject(_position_import_any);
												payment_long_type_names.reject(_position_import_any);
												area_names.reject(_position_import_any);
												structure_names.reject(_position_import_any);
												tile_names.reject(_position_import_any);
												hero_stat.reject(_position_import_any);
												_state=SUCCESS;
												_position_import_any=_position;
												_token_import_any=_token;
												_token=new Tokens.Rule.ImportAnyToken();
												parse_import_skill();
												if(_state==FAILED) {
													if(_position>=_furthestPosition) {
														_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
														_furthestPosition=_position;
													}
													_position=_position_import_any;
												}
												else {
												}
												if(_state==SUCCESS) {
													_token_import_any.add(_position_import_any,_token);
												}
												_token=_token_import_any;
												if(_state==FAILED) {
													support_names.reject(_position_import_any);
													association_names.reject(_position_import_any);
													room_names.reject(_position_import_any);
													activity_names.reject(_position_import_any);
													siding_names.reject(_position_import_any);
													item_names.reject(_position_import_any);
													aspect_names.reject(_position_import_any);
													affinity_names.reject(_position_import_any);
													activity_type_names.reject(_position_import_any);
													trail_names.reject(_position_import_any);
													attack_names.reject(_position_import_any);
													reason_names.reject(_position_import_any);
													trait_names.reject(_position_import_any);
													condition_names.reject(_position_import_any);
													payment_short_type_names.reject(_position_import_any);
													skill_names.reject(_position_import_any);
													map_names.reject(_position_import_any);
													event_names.reject(_position_import_any);
													image_names.reject(_position_import_any);
													tile_symbols.reject(_position_import_any);
													payment_long_type_names.reject(_position_import_any);
													area_names.reject(_position_import_any);
													structure_names.reject(_position_import_any);
													tile_names.reject(_position_import_any);
													hero_stat.reject(_position_import_any);
													_state=SUCCESS;
													_position_import_any=_position;
													_token_import_any=_token;
													_token=new Tokens.Rule.ImportAnyToken();
													parse_import_attack();
													if(_state==FAILED) {
														if(_position>=_furthestPosition) {
															_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
															_furthestPosition=_position;
														}
														_position=_position_import_any;
													}
													else {
													}
													if(_state==SUCCESS) {
														_token_import_any.add(_position_import_any,_token);
													}
													_token=_token_import_any;
													if(_state==FAILED) {
														support_names.reject(_position_import_any);
														association_names.reject(_position_import_any);
														room_names.reject(_position_import_any);
														activity_names.reject(_position_import_any);
														siding_names.reject(_position_import_any);
														item_names.reject(_position_import_any);
														aspect_names.reject(_position_import_any);
														affinity_names.reject(_position_import_any);
														activity_type_names.reject(_position_import_any);
														trail_names.reject(_position_import_any);
														attack_names.reject(_position_import_any);
														reason_names.reject(_position_import_any);
														trait_names.reject(_position_import_any);
														condition_names.reject(_position_import_any);
														payment_short_type_names.reject(_position_import_any);
														skill_names.reject(_position_import_any);
														map_names.reject(_position_import_any);
														event_names.reject(_position_import_any);
														image_names.reject(_position_import_any);
														tile_symbols.reject(_position_import_any);
														payment_long_type_names.reject(_position_import_any);
														area_names.reject(_position_import_any);
														structure_names.reject(_position_import_any);
														tile_names.reject(_position_import_any);
														hero_stat.reject(_position_import_any);
														_state=SUCCESS;
														_position_import_any=_position;
														_token_import_any=_token;
														_token=new Tokens.Rule.ImportAnyToken();
														parse_import_support();
														if(_state==FAILED) {
															if(_position>=_furthestPosition) {
																_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																_furthestPosition=_position;
															}
															_position=_position_import_any;
														}
														else {
														}
														if(_state==SUCCESS) {
															_token_import_any.add(_position_import_any,_token);
														}
														_token=_token_import_any;
														if(_state==FAILED) {
															support_names.reject(_position_import_any);
															association_names.reject(_position_import_any);
															room_names.reject(_position_import_any);
															activity_names.reject(_position_import_any);
															siding_names.reject(_position_import_any);
															item_names.reject(_position_import_any);
															aspect_names.reject(_position_import_any);
															affinity_names.reject(_position_import_any);
															activity_type_names.reject(_position_import_any);
															trail_names.reject(_position_import_any);
															attack_names.reject(_position_import_any);
															reason_names.reject(_position_import_any);
															trait_names.reject(_position_import_any);
															condition_names.reject(_position_import_any);
															payment_short_type_names.reject(_position_import_any);
															skill_names.reject(_position_import_any);
															map_names.reject(_position_import_any);
															event_names.reject(_position_import_any);
															image_names.reject(_position_import_any);
															tile_symbols.reject(_position_import_any);
															payment_long_type_names.reject(_position_import_any);
															area_names.reject(_position_import_any);
															structure_names.reject(_position_import_any);
															tile_names.reject(_position_import_any);
															hero_stat.reject(_position_import_any);
															_state=SUCCESS;
															_position_import_any=_position;
															_token_import_any=_token;
															_token=new Tokens.Rule.ImportAnyToken();
															parse_import_map();
															if(_state==FAILED) {
																if(_position>=_furthestPosition) {
																	_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																	_furthestPosition=_position;
																}
																_position=_position_import_any;
															}
															else {
															}
															if(_state==SUCCESS) {
																_token_import_any.add(_position_import_any,_token);
															}
															_token=_token_import_any;
															if(_state==FAILED) {
																support_names.reject(_position_import_any);
																association_names.reject(_position_import_any);
																room_names.reject(_position_import_any);
																activity_names.reject(_position_import_any);
																siding_names.reject(_position_import_any);
																item_names.reject(_position_import_any);
																aspect_names.reject(_position_import_any);
																affinity_names.reject(_position_import_any);
																activity_type_names.reject(_position_import_any);
																trail_names.reject(_position_import_any);
																attack_names.reject(_position_import_any);
																reason_names.reject(_position_import_any);
																trait_names.reject(_position_import_any);
																condition_names.reject(_position_import_any);
																payment_short_type_names.reject(_position_import_any);
																skill_names.reject(_position_import_any);
																map_names.reject(_position_import_any);
																event_names.reject(_position_import_any);
																image_names.reject(_position_import_any);
																tile_symbols.reject(_position_import_any);
																payment_long_type_names.reject(_position_import_any);
																area_names.reject(_position_import_any);
																structure_names.reject(_position_import_any);
																tile_names.reject(_position_import_any);
																hero_stat.reject(_position_import_any);
																_state=SUCCESS;
																_position_import_any=_position;
																_token_import_any=_token;
																_token=new Tokens.Rule.ImportAnyToken();
																parse_import_association();
																if(_state==FAILED) {
																	if(_position>=_furthestPosition) {
																		_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																		_furthestPosition=_position;
																	}
																	_position=_position_import_any;
																}
																else {
																}
																if(_state==SUCCESS) {
																	_token_import_any.add(_position_import_any,_token);
																}
																_token=_token_import_any;
																if(_state==FAILED) {
																	support_names.reject(_position_import_any);
																	association_names.reject(_position_import_any);
																	room_names.reject(_position_import_any);
																	activity_names.reject(_position_import_any);
																	siding_names.reject(_position_import_any);
																	item_names.reject(_position_import_any);
																	aspect_names.reject(_position_import_any);
																	affinity_names.reject(_position_import_any);
																	activity_type_names.reject(_position_import_any);
																	trail_names.reject(_position_import_any);
																	attack_names.reject(_position_import_any);
																	reason_names.reject(_position_import_any);
																	trait_names.reject(_position_import_any);
																	condition_names.reject(_position_import_any);
																	payment_short_type_names.reject(_position_import_any);
																	skill_names.reject(_position_import_any);
																	map_names.reject(_position_import_any);
																	event_names.reject(_position_import_any);
																	image_names.reject(_position_import_any);
																	tile_symbols.reject(_position_import_any);
																	payment_long_type_names.reject(_position_import_any);
																	area_names.reject(_position_import_any);
																	structure_names.reject(_position_import_any);
																	tile_names.reject(_position_import_any);
																	hero_stat.reject(_position_import_any);
																	_state=SUCCESS;
																	_position_import_any=_position;
																	_token_import_any=_token;
																	_token=new Tokens.Rule.ImportAnyToken();
																	parse_import_reason();
																	if(_state==FAILED) {
																		if(_position>=_furthestPosition) {
																			_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																			_furthestPosition=_position;
																		}
																		_position=_position_import_any;
																	}
																	else {
																	}
																	if(_state==SUCCESS) {
																		_token_import_any.add(_position_import_any,_token);
																	}
																	_token=_token_import_any;
																	if(_state==FAILED) {
																		support_names.reject(_position_import_any);
																		association_names.reject(_position_import_any);
																		room_names.reject(_position_import_any);
																		activity_names.reject(_position_import_any);
																		siding_names.reject(_position_import_any);
																		item_names.reject(_position_import_any);
																		aspect_names.reject(_position_import_any);
																		affinity_names.reject(_position_import_any);
																		activity_type_names.reject(_position_import_any);
																		trail_names.reject(_position_import_any);
																		attack_names.reject(_position_import_any);
																		reason_names.reject(_position_import_any);
																		trait_names.reject(_position_import_any);
																		condition_names.reject(_position_import_any);
																		payment_short_type_names.reject(_position_import_any);
																		skill_names.reject(_position_import_any);
																		map_names.reject(_position_import_any);
																		event_names.reject(_position_import_any);
																		image_names.reject(_position_import_any);
																		tile_symbols.reject(_position_import_any);
																		payment_long_type_names.reject(_position_import_any);
																		area_names.reject(_position_import_any);
																		structure_names.reject(_position_import_any);
																		tile_names.reject(_position_import_any);
																		hero_stat.reject(_position_import_any);
																		_state=SUCCESS;
																		_position_import_any=_position;
																		_token_import_any=_token;
																		_token=new Tokens.Rule.ImportAnyToken();
																		parse_import_colour();
																		if(_state==FAILED) {
																			if(_position>=_furthestPosition) {
																				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																				_furthestPosition=_position;
																			}
																			_position=_position_import_any;
																		}
																		else {
																		}
																		if(_state==SUCCESS) {
																			_token_import_any.add(_position_import_any,_token);
																		}
																		_token=_token_import_any;
																		if(_state==FAILED) {
																			support_names.reject(_position_import_any);
																			association_names.reject(_position_import_any);
																			room_names.reject(_position_import_any);
																			activity_names.reject(_position_import_any);
																			siding_names.reject(_position_import_any);
																			item_names.reject(_position_import_any);
																			aspect_names.reject(_position_import_any);
																			affinity_names.reject(_position_import_any);
																			activity_type_names.reject(_position_import_any);
																			trail_names.reject(_position_import_any);
																			attack_names.reject(_position_import_any);
																			reason_names.reject(_position_import_any);
																			trait_names.reject(_position_import_any);
																			condition_names.reject(_position_import_any);
																			payment_short_type_names.reject(_position_import_any);
																			skill_names.reject(_position_import_any);
																			map_names.reject(_position_import_any);
																			event_names.reject(_position_import_any);
																			image_names.reject(_position_import_any);
																			tile_symbols.reject(_position_import_any);
																			payment_long_type_names.reject(_position_import_any);
																			area_names.reject(_position_import_any);
																			structure_names.reject(_position_import_any);
																			tile_names.reject(_position_import_any);
																			hero_stat.reject(_position_import_any);
																			_state=SUCCESS;
																			_position_import_any=_position;
																			_token_import_any=_token;
																			_token=new Tokens.Rule.ImportAnyToken();
																			parse_import_animation_type();
																			if(_state==FAILED) {
																				if(_position>=_furthestPosition) {
																					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																					_furthestPosition=_position;
																				}
																				_position=_position_import_any;
																			}
																			else {
																			}
																			if(_state==SUCCESS) {
																				_token_import_any.add(_position_import_any,_token);
																			}
																			_token=_token_import_any;
																			if(_state==FAILED) {
																				support_names.reject(_position_import_any);
																				association_names.reject(_position_import_any);
																				room_names.reject(_position_import_any);
																				activity_names.reject(_position_import_any);
																				siding_names.reject(_position_import_any);
																				item_names.reject(_position_import_any);
																				aspect_names.reject(_position_import_any);
																				affinity_names.reject(_position_import_any);
																				activity_type_names.reject(_position_import_any);
																				trail_names.reject(_position_import_any);
																				attack_names.reject(_position_import_any);
																				reason_names.reject(_position_import_any);
																				trait_names.reject(_position_import_any);
																				condition_names.reject(_position_import_any);
																				payment_short_type_names.reject(_position_import_any);
																				skill_names.reject(_position_import_any);
																				map_names.reject(_position_import_any);
																				event_names.reject(_position_import_any);
																				image_names.reject(_position_import_any);
																				tile_symbols.reject(_position_import_any);
																				payment_long_type_names.reject(_position_import_any);
																				area_names.reject(_position_import_any);
																				structure_names.reject(_position_import_any);
																				tile_names.reject(_position_import_any);
																				hero_stat.reject(_position_import_any);
																				_state=SUCCESS;
																				_position_import_any=_position;
																				_token_import_any=_token;
																				_token=new Tokens.Rule.ImportAnyToken();
																				parse_import_image();
																				if(_state==FAILED) {
																					if(_position>=_furthestPosition) {
																						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																						_furthestPosition=_position;
																					}
																					_position=_position_import_any;
																				}
																				else {
																				}
																				if(_state==SUCCESS) {
																					_token_import_any.add(_position_import_any,_token);
																				}
																				_token=_token_import_any;
																				if(_state==FAILED) {
																					support_names.reject(_position_import_any);
																					association_names.reject(_position_import_any);
																					room_names.reject(_position_import_any);
																					activity_names.reject(_position_import_any);
																					siding_names.reject(_position_import_any);
																					item_names.reject(_position_import_any);
																					aspect_names.reject(_position_import_any);
																					affinity_names.reject(_position_import_any);
																					activity_type_names.reject(_position_import_any);
																					trail_names.reject(_position_import_any);
																					attack_names.reject(_position_import_any);
																					reason_names.reject(_position_import_any);
																					trait_names.reject(_position_import_any);
																					condition_names.reject(_position_import_any);
																					payment_short_type_names.reject(_position_import_any);
																					skill_names.reject(_position_import_any);
																					map_names.reject(_position_import_any);
																					event_names.reject(_position_import_any);
																					image_names.reject(_position_import_any);
																					tile_symbols.reject(_position_import_any);
																					payment_long_type_names.reject(_position_import_any);
																					area_names.reject(_position_import_any);
																					structure_names.reject(_position_import_any);
																					tile_names.reject(_position_import_any);
																					hero_stat.reject(_position_import_any);
																					_state=SUCCESS;
																					_position_import_any=_position;
																					_token_import_any=_token;
																					_token=new Tokens.Rule.ImportAnyToken();
																					parse_import_drawable();
																					if(_state==FAILED) {
																						if(_position>=_furthestPosition) {
																							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																							_furthestPosition=_position;
																						}
																						_position=_position_import_any;
																					}
																					else {
																					}
																					if(_state==SUCCESS) {
																						_token_import_any.add(_position_import_any,_token);
																					}
																					_token=_token_import_any;
																					if(_state==FAILED) {
																						support_names.reject(_position_import_any);
																						association_names.reject(_position_import_any);
																						room_names.reject(_position_import_any);
																						activity_names.reject(_position_import_any);
																						siding_names.reject(_position_import_any);
																						item_names.reject(_position_import_any);
																						aspect_names.reject(_position_import_any);
																						affinity_names.reject(_position_import_any);
																						activity_type_names.reject(_position_import_any);
																						trail_names.reject(_position_import_any);
																						attack_names.reject(_position_import_any);
																						reason_names.reject(_position_import_any);
																						trait_names.reject(_position_import_any);
																						condition_names.reject(_position_import_any);
																						payment_short_type_names.reject(_position_import_any);
																						skill_names.reject(_position_import_any);
																						map_names.reject(_position_import_any);
																						event_names.reject(_position_import_any);
																						image_names.reject(_position_import_any);
																						tile_symbols.reject(_position_import_any);
																						payment_long_type_names.reject(_position_import_any);
																						area_names.reject(_position_import_any);
																						structure_names.reject(_position_import_any);
																						tile_names.reject(_position_import_any);
																						hero_stat.reject(_position_import_any);
																						_state=SUCCESS;
																						_position_import_any=_position;
																						_token_import_any=_token;
																						_token=new Tokens.Rule.ImportAnyToken();
																						parse_import_layer();
																						if(_state==FAILED) {
																							if(_position>=_furthestPosition) {
																								_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_any(import_any)");
																								_furthestPosition=_position;
																							}
																							_position=_position_import_any;
																						}
																						else {
																						}
																						if(_state==SUCCESS) {
																							_token_import_any.add(_position_import_any,_token);
																						}
																						_token=_token_import_any;
																						if(_state==FAILED) {
																							support_names.reject(_position_import_any);
																							association_names.reject(_position_import_any);
																							room_names.reject(_position_import_any);
																							activity_names.reject(_position_import_any);
																							siding_names.reject(_position_import_any);
																							item_names.reject(_position_import_any);
																							aspect_names.reject(_position_import_any);
																							affinity_names.reject(_position_import_any);
																							activity_type_names.reject(_position_import_any);
																							trail_names.reject(_position_import_any);
																							attack_names.reject(_position_import_any);
																							reason_names.reject(_position_import_any);
																							trait_names.reject(_position_import_any);
																							condition_names.reject(_position_import_any);
																							payment_short_type_names.reject(_position_import_any);
																							skill_names.reject(_position_import_any);
																							map_names.reject(_position_import_any);
																							event_names.reject(_position_import_any);
																							image_names.reject(_position_import_any);
																							tile_symbols.reject(_position_import_any);
																							payment_long_type_names.reject(_position_import_any);
																							area_names.reject(_position_import_any);
																							structure_names.reject(_position_import_any);
																							tile_names.reject(_position_import_any);
																							hero_stat.reject(_position_import_any);
																						}
																						else if(_state==SUCCESS) {
																							support_names.accept(_position_import_any);
																							association_names.accept(_position_import_any);
																							room_names.accept(_position_import_any);
																							activity_names.accept(_position_import_any);
																							siding_names.accept(_position_import_any);
																							item_names.accept(_position_import_any);
																							aspect_names.accept(_position_import_any);
																							affinity_names.accept(_position_import_any);
																							activity_type_names.accept(_position_import_any);
																							trail_names.accept(_position_import_any);
																							attack_names.accept(_position_import_any);
																							reason_names.accept(_position_import_any);
																							trait_names.accept(_position_import_any);
																							condition_names.accept(_position_import_any);
																							payment_short_type_names.accept(_position_import_any);
																							skill_names.accept(_position_import_any);
																							map_names.accept(_position_import_any);
																							event_names.accept(_position_import_any);
																							image_names.accept(_position_import_any);
																							tile_symbols.accept(_position_import_any);
																							payment_long_type_names.accept(_position_import_any);
																							area_names.accept(_position_import_any);
																							structure_names.accept(_position_import_any);
																							tile_names.accept(_position_import_any);
																							hero_stat.accept(_position_import_any);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public void parse_import_item() {
		int _position_import_item = -1;
		Token.Parsed _token_import_item = null;
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
		_position_import_item=_position;
		_token_import_item=_token;
		_token=new Tokens.Rule.ImportItemToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_item(import_item)");
				_furthestPosition=_position;
			}
			_position=_position_import_item;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_item(import_item)");
					_furthestPosition=_position;
				}
				_position=_position_import_item;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='m') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_4.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .itms");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_item(import_item)");
						_furthestPosition=_position;
					}
					_position=_position_import_item;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_item(import_item)");
							_furthestPosition=_position;
						}
						_position=_position_import_item;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/items/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".itms");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportItemFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_item;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_item.add(_position_import_item,_token);
		}
		_token=_token_import_item;
		if(_state==FAILED) {
			support_names.reject(_position_import_item);
			association_names.reject(_position_import_item);
			room_names.reject(_position_import_item);
			activity_names.reject(_position_import_item);
			siding_names.reject(_position_import_item);
			item_names.reject(_position_import_item);
			aspect_names.reject(_position_import_item);
			affinity_names.reject(_position_import_item);
			activity_type_names.reject(_position_import_item);
			trail_names.reject(_position_import_item);
			attack_names.reject(_position_import_item);
			reason_names.reject(_position_import_item);
			trait_names.reject(_position_import_item);
			condition_names.reject(_position_import_item);
			payment_short_type_names.reject(_position_import_item);
			skill_names.reject(_position_import_item);
			map_names.reject(_position_import_item);
			event_names.reject(_position_import_item);
			image_names.reject(_position_import_item);
			tile_symbols.reject(_position_import_item);
			payment_long_type_names.reject(_position_import_item);
			area_names.reject(_position_import_item);
			structure_names.reject(_position_import_item);
			tile_names.reject(_position_import_item);
			hero_stat.reject(_position_import_item);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_item);
			association_names.accept(_position_import_item);
			room_names.accept(_position_import_item);
			activity_names.accept(_position_import_item);
			siding_names.accept(_position_import_item);
			item_names.accept(_position_import_item);
			aspect_names.accept(_position_import_item);
			affinity_names.accept(_position_import_item);
			activity_type_names.accept(_position_import_item);
			trail_names.accept(_position_import_item);
			attack_names.accept(_position_import_item);
			reason_names.accept(_position_import_item);
			trait_names.accept(_position_import_item);
			condition_names.accept(_position_import_item);
			payment_short_type_names.accept(_position_import_item);
			skill_names.accept(_position_import_item);
			map_names.accept(_position_import_item);
			event_names.accept(_position_import_item);
			image_names.accept(_position_import_item);
			tile_symbols.accept(_position_import_item);
			payment_long_type_names.accept(_position_import_item);
			area_names.accept(_position_import_item);
			structure_names.accept(_position_import_item);
			tile_names.accept(_position_import_item);
			hero_stat.accept(_position_import_item);
		}
	}
	public void parse_import_association() {
		int _position_import_association = -1;
		Token.Parsed _token_import_association = null;
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
		_position_import_association=_position;
		_token_import_association=_token;
		_token=new Tokens.Rule.ImportAssociationToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_association(import_association)");
				_furthestPosition=_position;
			}
			_position=_position_import_association;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_association(import_association)");
					_furthestPosition=_position;
				}
				_position=_position_import_association;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='o') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_48.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .asos");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_association(import_association)");
						_furthestPosition=_position;
					}
					_position=_position_import_association;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_association(import_association)");
							_furthestPosition=_position;
						}
						_position=_position_import_association;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/relations/associations/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".asos");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportAssociationFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_association;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_association.add(_position_import_association,_token);
		}
		_token=_token_import_association;
		if(_state==FAILED) {
			support_names.reject(_position_import_association);
			association_names.reject(_position_import_association);
			room_names.reject(_position_import_association);
			activity_names.reject(_position_import_association);
			siding_names.reject(_position_import_association);
			item_names.reject(_position_import_association);
			aspect_names.reject(_position_import_association);
			affinity_names.reject(_position_import_association);
			activity_type_names.reject(_position_import_association);
			trail_names.reject(_position_import_association);
			attack_names.reject(_position_import_association);
			reason_names.reject(_position_import_association);
			trait_names.reject(_position_import_association);
			condition_names.reject(_position_import_association);
			payment_short_type_names.reject(_position_import_association);
			skill_names.reject(_position_import_association);
			map_names.reject(_position_import_association);
			event_names.reject(_position_import_association);
			image_names.reject(_position_import_association);
			tile_symbols.reject(_position_import_association);
			payment_long_type_names.reject(_position_import_association);
			area_names.reject(_position_import_association);
			structure_names.reject(_position_import_association);
			tile_names.reject(_position_import_association);
			hero_stat.reject(_position_import_association);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_association);
			association_names.accept(_position_import_association);
			room_names.accept(_position_import_association);
			activity_names.accept(_position_import_association);
			siding_names.accept(_position_import_association);
			item_names.accept(_position_import_association);
			aspect_names.accept(_position_import_association);
			affinity_names.accept(_position_import_association);
			activity_type_names.accept(_position_import_association);
			trail_names.accept(_position_import_association);
			attack_names.accept(_position_import_association);
			reason_names.accept(_position_import_association);
			trait_names.accept(_position_import_association);
			condition_names.accept(_position_import_association);
			payment_short_type_names.accept(_position_import_association);
			skill_names.accept(_position_import_association);
			map_names.accept(_position_import_association);
			event_names.accept(_position_import_association);
			image_names.accept(_position_import_association);
			tile_symbols.accept(_position_import_association);
			payment_long_type_names.accept(_position_import_association);
			area_names.accept(_position_import_association);
			structure_names.accept(_position_import_association);
			tile_names.accept(_position_import_association);
			hero_stat.accept(_position_import_association);
		}
	}
	public void parse_import_image__file_import() {
		int _position_import_image__file_import = -1;
		Token.Parsed _token_import_image__file_import = null;
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
		_position_import_image__file_import=_position;
		_token_import_image__file_import=_token;
		_token=new Tokens.Rule.ImportImageFileImportToken();
		int _state_228 = _state;
		while(_position<_inputLength) {
			parse__anonymous_210();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_228==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_image__file_import.addAll(_token);
			_token_import_image__file_import.setValue(_token.getValue());
		}
		_token=_token_import_image__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_image__file_import);
			association_names.reject(_position_import_image__file_import);
			room_names.reject(_position_import_image__file_import);
			activity_names.reject(_position_import_image__file_import);
			siding_names.reject(_position_import_image__file_import);
			item_names.reject(_position_import_image__file_import);
			aspect_names.reject(_position_import_image__file_import);
			affinity_names.reject(_position_import_image__file_import);
			activity_type_names.reject(_position_import_image__file_import);
			trail_names.reject(_position_import_image__file_import);
			attack_names.reject(_position_import_image__file_import);
			reason_names.reject(_position_import_image__file_import);
			trait_names.reject(_position_import_image__file_import);
			condition_names.reject(_position_import_image__file_import);
			payment_short_type_names.reject(_position_import_image__file_import);
			skill_names.reject(_position_import_image__file_import);
			map_names.reject(_position_import_image__file_import);
			event_names.reject(_position_import_image__file_import);
			image_names.reject(_position_import_image__file_import);
			tile_symbols.reject(_position_import_image__file_import);
			payment_long_type_names.reject(_position_import_image__file_import);
			area_names.reject(_position_import_image__file_import);
			structure_names.reject(_position_import_image__file_import);
			tile_names.reject(_position_import_image__file_import);
			hero_stat.reject(_position_import_image__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_image__file_import);
			association_names.accept(_position_import_image__file_import);
			room_names.accept(_position_import_image__file_import);
			activity_names.accept(_position_import_image__file_import);
			siding_names.accept(_position_import_image__file_import);
			item_names.accept(_position_import_image__file_import);
			aspect_names.accept(_position_import_image__file_import);
			affinity_names.accept(_position_import_image__file_import);
			activity_type_names.accept(_position_import_image__file_import);
			trail_names.accept(_position_import_image__file_import);
			attack_names.accept(_position_import_image__file_import);
			reason_names.accept(_position_import_image__file_import);
			trait_names.accept(_position_import_image__file_import);
			condition_names.accept(_position_import_image__file_import);
			payment_short_type_names.accept(_position_import_image__file_import);
			skill_names.accept(_position_import_image__file_import);
			map_names.accept(_position_import_image__file_import);
			event_names.accept(_position_import_image__file_import);
			image_names.accept(_position_import_image__file_import);
			tile_symbols.accept(_position_import_image__file_import);
			payment_long_type_names.accept(_position_import_image__file_import);
			area_names.accept(_position_import_image__file_import);
			structure_names.accept(_position_import_image__file_import);
			tile_names.accept(_position_import_image__file_import);
			hero_stat.accept(_position_import_image__file_import);
		}
	}
	public void parse_import_affinity__file_import() {
		int _position_import_affinity__file_import = -1;
		Token.Parsed _token_import_affinity__file_import = null;
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
		_position_import_affinity__file_import=_position;
		_token_import_affinity__file_import=_token;
		_token=new Tokens.Rule.ImportAffinityFileImportToken();
		int _state_26 = _state;
		while(_position<_inputLength) {
			parse__anonymous_11();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_26==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_affinity__file_import.addAll(_token);
			_token_import_affinity__file_import.setValue(_token.getValue());
		}
		_token=_token_import_affinity__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_affinity__file_import);
			association_names.reject(_position_import_affinity__file_import);
			room_names.reject(_position_import_affinity__file_import);
			activity_names.reject(_position_import_affinity__file_import);
			siding_names.reject(_position_import_affinity__file_import);
			item_names.reject(_position_import_affinity__file_import);
			aspect_names.reject(_position_import_affinity__file_import);
			affinity_names.reject(_position_import_affinity__file_import);
			activity_type_names.reject(_position_import_affinity__file_import);
			trail_names.reject(_position_import_affinity__file_import);
			attack_names.reject(_position_import_affinity__file_import);
			reason_names.reject(_position_import_affinity__file_import);
			trait_names.reject(_position_import_affinity__file_import);
			condition_names.reject(_position_import_affinity__file_import);
			payment_short_type_names.reject(_position_import_affinity__file_import);
			skill_names.reject(_position_import_affinity__file_import);
			map_names.reject(_position_import_affinity__file_import);
			event_names.reject(_position_import_affinity__file_import);
			image_names.reject(_position_import_affinity__file_import);
			tile_symbols.reject(_position_import_affinity__file_import);
			payment_long_type_names.reject(_position_import_affinity__file_import);
			area_names.reject(_position_import_affinity__file_import);
			structure_names.reject(_position_import_affinity__file_import);
			tile_names.reject(_position_import_affinity__file_import);
			hero_stat.reject(_position_import_affinity__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_affinity__file_import);
			association_names.accept(_position_import_affinity__file_import);
			room_names.accept(_position_import_affinity__file_import);
			activity_names.accept(_position_import_affinity__file_import);
			siding_names.accept(_position_import_affinity__file_import);
			item_names.accept(_position_import_affinity__file_import);
			aspect_names.accept(_position_import_affinity__file_import);
			affinity_names.accept(_position_import_affinity__file_import);
			activity_type_names.accept(_position_import_affinity__file_import);
			trail_names.accept(_position_import_affinity__file_import);
			attack_names.accept(_position_import_affinity__file_import);
			reason_names.accept(_position_import_affinity__file_import);
			trait_names.accept(_position_import_affinity__file_import);
			condition_names.accept(_position_import_affinity__file_import);
			payment_short_type_names.accept(_position_import_affinity__file_import);
			skill_names.accept(_position_import_affinity__file_import);
			map_names.accept(_position_import_affinity__file_import);
			event_names.accept(_position_import_affinity__file_import);
			image_names.accept(_position_import_affinity__file_import);
			tile_symbols.accept(_position_import_affinity__file_import);
			payment_long_type_names.accept(_position_import_affinity__file_import);
			area_names.accept(_position_import_affinity__file_import);
			structure_names.accept(_position_import_affinity__file_import);
			tile_names.accept(_position_import_affinity__file_import);
			hero_stat.accept(_position_import_affinity__file_import);
		}
	}
	public void parse_import_colour__file_import() {
		int _position_import_colour__file_import = -1;
		Token.Parsed _token_import_colour__file_import = null;
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
		_position_import_colour__file_import=_position;
		_token_import_colour__file_import=_token;
		_token=new Tokens.Rule.ImportColourFileImportToken();
		int _state_257 = _state;
		while(_position<_inputLength) {
			parse__anonymous_238();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_257==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_colour__file_import.addAll(_token);
			_token_import_colour__file_import.setValue(_token.getValue());
		}
		_token=_token_import_colour__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_colour__file_import);
			association_names.reject(_position_import_colour__file_import);
			room_names.reject(_position_import_colour__file_import);
			activity_names.reject(_position_import_colour__file_import);
			siding_names.reject(_position_import_colour__file_import);
			item_names.reject(_position_import_colour__file_import);
			aspect_names.reject(_position_import_colour__file_import);
			affinity_names.reject(_position_import_colour__file_import);
			activity_type_names.reject(_position_import_colour__file_import);
			trail_names.reject(_position_import_colour__file_import);
			attack_names.reject(_position_import_colour__file_import);
			reason_names.reject(_position_import_colour__file_import);
			trait_names.reject(_position_import_colour__file_import);
			condition_names.reject(_position_import_colour__file_import);
			payment_short_type_names.reject(_position_import_colour__file_import);
			skill_names.reject(_position_import_colour__file_import);
			map_names.reject(_position_import_colour__file_import);
			event_names.reject(_position_import_colour__file_import);
			image_names.reject(_position_import_colour__file_import);
			tile_symbols.reject(_position_import_colour__file_import);
			payment_long_type_names.reject(_position_import_colour__file_import);
			area_names.reject(_position_import_colour__file_import);
			structure_names.reject(_position_import_colour__file_import);
			tile_names.reject(_position_import_colour__file_import);
			hero_stat.reject(_position_import_colour__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_colour__file_import);
			association_names.accept(_position_import_colour__file_import);
			room_names.accept(_position_import_colour__file_import);
			activity_names.accept(_position_import_colour__file_import);
			siding_names.accept(_position_import_colour__file_import);
			item_names.accept(_position_import_colour__file_import);
			aspect_names.accept(_position_import_colour__file_import);
			affinity_names.accept(_position_import_colour__file_import);
			activity_type_names.accept(_position_import_colour__file_import);
			trail_names.accept(_position_import_colour__file_import);
			attack_names.accept(_position_import_colour__file_import);
			reason_names.accept(_position_import_colour__file_import);
			trait_names.accept(_position_import_colour__file_import);
			condition_names.accept(_position_import_colour__file_import);
			payment_short_type_names.accept(_position_import_colour__file_import);
			skill_names.accept(_position_import_colour__file_import);
			map_names.accept(_position_import_colour__file_import);
			event_names.accept(_position_import_colour__file_import);
			image_names.accept(_position_import_colour__file_import);
			tile_symbols.accept(_position_import_colour__file_import);
			payment_long_type_names.accept(_position_import_colour__file_import);
			area_names.accept(_position_import_colour__file_import);
			structure_names.accept(_position_import_colour__file_import);
			tile_names.accept(_position_import_colour__file_import);
			hero_stat.accept(_position_import_colour__file_import);
		}
	}
	public void parse_import_event__file_import() {
		int _position_import_event__file_import = -1;
		Token.Parsed _token_import_event__file_import = null;
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
		_position_import_event__file_import=_position;
		_token_import_event__file_import=_token;
		_token=new Tokens.Rule.ImportEventFileImportToken();
		int _state_152 = _state;
		while(_position<_inputLength) {
			parse__anonymous_120();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_152==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_event__file_import.addAll(_token);
			_token_import_event__file_import.setValue(_token.getValue());
		}
		_token=_token_import_event__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_event__file_import);
			association_names.reject(_position_import_event__file_import);
			room_names.reject(_position_import_event__file_import);
			activity_names.reject(_position_import_event__file_import);
			siding_names.reject(_position_import_event__file_import);
			item_names.reject(_position_import_event__file_import);
			aspect_names.reject(_position_import_event__file_import);
			affinity_names.reject(_position_import_event__file_import);
			activity_type_names.reject(_position_import_event__file_import);
			trail_names.reject(_position_import_event__file_import);
			attack_names.reject(_position_import_event__file_import);
			reason_names.reject(_position_import_event__file_import);
			trait_names.reject(_position_import_event__file_import);
			condition_names.reject(_position_import_event__file_import);
			payment_short_type_names.reject(_position_import_event__file_import);
			skill_names.reject(_position_import_event__file_import);
			map_names.reject(_position_import_event__file_import);
			event_names.reject(_position_import_event__file_import);
			image_names.reject(_position_import_event__file_import);
			tile_symbols.reject(_position_import_event__file_import);
			payment_long_type_names.reject(_position_import_event__file_import);
			area_names.reject(_position_import_event__file_import);
			structure_names.reject(_position_import_event__file_import);
			tile_names.reject(_position_import_event__file_import);
			hero_stat.reject(_position_import_event__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_event__file_import);
			association_names.accept(_position_import_event__file_import);
			room_names.accept(_position_import_event__file_import);
			activity_names.accept(_position_import_event__file_import);
			siding_names.accept(_position_import_event__file_import);
			item_names.accept(_position_import_event__file_import);
			aspect_names.accept(_position_import_event__file_import);
			affinity_names.accept(_position_import_event__file_import);
			activity_type_names.accept(_position_import_event__file_import);
			trail_names.accept(_position_import_event__file_import);
			attack_names.accept(_position_import_event__file_import);
			reason_names.accept(_position_import_event__file_import);
			trait_names.accept(_position_import_event__file_import);
			condition_names.accept(_position_import_event__file_import);
			payment_short_type_names.accept(_position_import_event__file_import);
			skill_names.accept(_position_import_event__file_import);
			map_names.accept(_position_import_event__file_import);
			event_names.accept(_position_import_event__file_import);
			image_names.accept(_position_import_event__file_import);
			tile_symbols.accept(_position_import_event__file_import);
			payment_long_type_names.accept(_position_import_event__file_import);
			area_names.accept(_position_import_event__file_import);
			structure_names.accept(_position_import_event__file_import);
			tile_names.accept(_position_import_event__file_import);
			hero_stat.accept(_position_import_event__file_import);
		}
	}
	public void parse_import_layer__file_import() {
		int _position_import_layer__file_import = -1;
		Token.Parsed _token_import_layer__file_import = null;
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
		_position_import_layer__file_import=_position;
		_token_import_layer__file_import=_token;
		_token=new Tokens.Rule.ImportLayerFileImportToken();
		int _state_258 = _state;
		while(_position<_inputLength) {
			parse__anonymous_245();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_258==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_layer__file_import.addAll(_token);
			_token_import_layer__file_import.setValue(_token.getValue());
		}
		_token=_token_import_layer__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_layer__file_import);
			association_names.reject(_position_import_layer__file_import);
			room_names.reject(_position_import_layer__file_import);
			activity_names.reject(_position_import_layer__file_import);
			siding_names.reject(_position_import_layer__file_import);
			item_names.reject(_position_import_layer__file_import);
			aspect_names.reject(_position_import_layer__file_import);
			affinity_names.reject(_position_import_layer__file_import);
			activity_type_names.reject(_position_import_layer__file_import);
			trail_names.reject(_position_import_layer__file_import);
			attack_names.reject(_position_import_layer__file_import);
			reason_names.reject(_position_import_layer__file_import);
			trait_names.reject(_position_import_layer__file_import);
			condition_names.reject(_position_import_layer__file_import);
			payment_short_type_names.reject(_position_import_layer__file_import);
			skill_names.reject(_position_import_layer__file_import);
			map_names.reject(_position_import_layer__file_import);
			event_names.reject(_position_import_layer__file_import);
			image_names.reject(_position_import_layer__file_import);
			tile_symbols.reject(_position_import_layer__file_import);
			payment_long_type_names.reject(_position_import_layer__file_import);
			area_names.reject(_position_import_layer__file_import);
			structure_names.reject(_position_import_layer__file_import);
			tile_names.reject(_position_import_layer__file_import);
			hero_stat.reject(_position_import_layer__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_layer__file_import);
			association_names.accept(_position_import_layer__file_import);
			room_names.accept(_position_import_layer__file_import);
			activity_names.accept(_position_import_layer__file_import);
			siding_names.accept(_position_import_layer__file_import);
			item_names.accept(_position_import_layer__file_import);
			aspect_names.accept(_position_import_layer__file_import);
			affinity_names.accept(_position_import_layer__file_import);
			activity_type_names.accept(_position_import_layer__file_import);
			trail_names.accept(_position_import_layer__file_import);
			attack_names.accept(_position_import_layer__file_import);
			reason_names.accept(_position_import_layer__file_import);
			trait_names.accept(_position_import_layer__file_import);
			condition_names.accept(_position_import_layer__file_import);
			payment_short_type_names.accept(_position_import_layer__file_import);
			skill_names.accept(_position_import_layer__file_import);
			map_names.accept(_position_import_layer__file_import);
			event_names.accept(_position_import_layer__file_import);
			image_names.accept(_position_import_layer__file_import);
			tile_symbols.accept(_position_import_layer__file_import);
			payment_long_type_names.accept(_position_import_layer__file_import);
			area_names.accept(_position_import_layer__file_import);
			structure_names.accept(_position_import_layer__file_import);
			tile_names.accept(_position_import_layer__file_import);
			hero_stat.accept(_position_import_layer__file_import);
		}
	}
	public void parse_import_activity__file_import() {
		int _position_import_activity__file_import = -1;
		Token.Parsed _token_import_activity__file_import = null;
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
		_position_import_activity__file_import=_position;
		_token_import_activity__file_import=_token;
		_token=new Tokens.Rule.ImportActivityFileImportToken();
		int _state_38 = _state;
		while(_position<_inputLength) {
			parse__anonymous_21();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_38==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_activity__file_import.addAll(_token);
			_token_import_activity__file_import.setValue(_token.getValue());
		}
		_token=_token_import_activity__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_activity__file_import);
			association_names.reject(_position_import_activity__file_import);
			room_names.reject(_position_import_activity__file_import);
			activity_names.reject(_position_import_activity__file_import);
			siding_names.reject(_position_import_activity__file_import);
			item_names.reject(_position_import_activity__file_import);
			aspect_names.reject(_position_import_activity__file_import);
			affinity_names.reject(_position_import_activity__file_import);
			activity_type_names.reject(_position_import_activity__file_import);
			trail_names.reject(_position_import_activity__file_import);
			attack_names.reject(_position_import_activity__file_import);
			reason_names.reject(_position_import_activity__file_import);
			trait_names.reject(_position_import_activity__file_import);
			condition_names.reject(_position_import_activity__file_import);
			payment_short_type_names.reject(_position_import_activity__file_import);
			skill_names.reject(_position_import_activity__file_import);
			map_names.reject(_position_import_activity__file_import);
			event_names.reject(_position_import_activity__file_import);
			image_names.reject(_position_import_activity__file_import);
			tile_symbols.reject(_position_import_activity__file_import);
			payment_long_type_names.reject(_position_import_activity__file_import);
			area_names.reject(_position_import_activity__file_import);
			structure_names.reject(_position_import_activity__file_import);
			tile_names.reject(_position_import_activity__file_import);
			hero_stat.reject(_position_import_activity__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_activity__file_import);
			association_names.accept(_position_import_activity__file_import);
			room_names.accept(_position_import_activity__file_import);
			activity_names.accept(_position_import_activity__file_import);
			siding_names.accept(_position_import_activity__file_import);
			item_names.accept(_position_import_activity__file_import);
			aspect_names.accept(_position_import_activity__file_import);
			affinity_names.accept(_position_import_activity__file_import);
			activity_type_names.accept(_position_import_activity__file_import);
			trail_names.accept(_position_import_activity__file_import);
			attack_names.accept(_position_import_activity__file_import);
			reason_names.accept(_position_import_activity__file_import);
			trait_names.accept(_position_import_activity__file_import);
			condition_names.accept(_position_import_activity__file_import);
			payment_short_type_names.accept(_position_import_activity__file_import);
			skill_names.accept(_position_import_activity__file_import);
			map_names.accept(_position_import_activity__file_import);
			event_names.accept(_position_import_activity__file_import);
			image_names.accept(_position_import_activity__file_import);
			tile_symbols.accept(_position_import_activity__file_import);
			payment_long_type_names.accept(_position_import_activity__file_import);
			area_names.accept(_position_import_activity__file_import);
			structure_names.accept(_position_import_activity__file_import);
			tile_names.accept(_position_import_activity__file_import);
			hero_stat.accept(_position_import_activity__file_import);
		}
	}
	public void parse_import_support() {
		int _position_import_support = -1;
		Token.Parsed _token_import_support = null;
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
		_position_import_support=_position;
		_token_import_support=_token;
		_token=new Tokens.Rule.ImportSupportToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_support(import_support)");
				_furthestPosition=_position;
			}
			_position=_position_import_support;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_support(import_support)");
					_furthestPosition=_position;
				}
				_position=_position_import_support;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='u') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='p') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_45.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .sups");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_support(import_support)");
						_furthestPosition=_position;
					}
					_position=_position_import_support;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_support(import_support)");
							_furthestPosition=_position;
						}
						_position=_position_import_support;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/behaviours/skills/supports/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".sups");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportSupportFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_support;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_support.add(_position_import_support,_token);
		}
		_token=_token_import_support;
		if(_state==FAILED) {
			support_names.reject(_position_import_support);
			association_names.reject(_position_import_support);
			room_names.reject(_position_import_support);
			activity_names.reject(_position_import_support);
			siding_names.reject(_position_import_support);
			item_names.reject(_position_import_support);
			aspect_names.reject(_position_import_support);
			affinity_names.reject(_position_import_support);
			activity_type_names.reject(_position_import_support);
			trail_names.reject(_position_import_support);
			attack_names.reject(_position_import_support);
			reason_names.reject(_position_import_support);
			trait_names.reject(_position_import_support);
			condition_names.reject(_position_import_support);
			payment_short_type_names.reject(_position_import_support);
			skill_names.reject(_position_import_support);
			map_names.reject(_position_import_support);
			event_names.reject(_position_import_support);
			image_names.reject(_position_import_support);
			tile_symbols.reject(_position_import_support);
			payment_long_type_names.reject(_position_import_support);
			area_names.reject(_position_import_support);
			structure_names.reject(_position_import_support);
			tile_names.reject(_position_import_support);
			hero_stat.reject(_position_import_support);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_support);
			association_names.accept(_position_import_support);
			room_names.accept(_position_import_support);
			activity_names.accept(_position_import_support);
			siding_names.accept(_position_import_support);
			item_names.accept(_position_import_support);
			aspect_names.accept(_position_import_support);
			affinity_names.accept(_position_import_support);
			activity_type_names.accept(_position_import_support);
			trail_names.accept(_position_import_support);
			attack_names.accept(_position_import_support);
			reason_names.accept(_position_import_support);
			trait_names.accept(_position_import_support);
			condition_names.accept(_position_import_support);
			payment_short_type_names.accept(_position_import_support);
			skill_names.accept(_position_import_support);
			map_names.accept(_position_import_support);
			event_names.accept(_position_import_support);
			image_names.accept(_position_import_support);
			tile_symbols.accept(_position_import_support);
			payment_long_type_names.accept(_position_import_support);
			area_names.accept(_position_import_support);
			structure_names.accept(_position_import_support);
			tile_names.accept(_position_import_support);
			hero_stat.accept(_position_import_support);
		}
	}
	public void parse_import_aspect__file_import() {
		int _position_import_aspect__file_import = -1;
		Token.Parsed _token_import_aspect__file_import = null;
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
		_position_import_aspect__file_import=_position;
		_token_import_aspect__file_import=_token;
		_token=new Tokens.Rule.ImportAspectFileImportToken();
		int _state_12 = _state;
		while(_position<_inputLength) {
			parse__anonymous_1();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_12==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_aspect__file_import.addAll(_token);
			_token_import_aspect__file_import.setValue(_token.getValue());
		}
		_token=_token_import_aspect__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_aspect__file_import);
			association_names.reject(_position_import_aspect__file_import);
			room_names.reject(_position_import_aspect__file_import);
			activity_names.reject(_position_import_aspect__file_import);
			siding_names.reject(_position_import_aspect__file_import);
			item_names.reject(_position_import_aspect__file_import);
			aspect_names.reject(_position_import_aspect__file_import);
			affinity_names.reject(_position_import_aspect__file_import);
			activity_type_names.reject(_position_import_aspect__file_import);
			trail_names.reject(_position_import_aspect__file_import);
			attack_names.reject(_position_import_aspect__file_import);
			reason_names.reject(_position_import_aspect__file_import);
			trait_names.reject(_position_import_aspect__file_import);
			condition_names.reject(_position_import_aspect__file_import);
			payment_short_type_names.reject(_position_import_aspect__file_import);
			skill_names.reject(_position_import_aspect__file_import);
			map_names.reject(_position_import_aspect__file_import);
			event_names.reject(_position_import_aspect__file_import);
			image_names.reject(_position_import_aspect__file_import);
			tile_symbols.reject(_position_import_aspect__file_import);
			payment_long_type_names.reject(_position_import_aspect__file_import);
			area_names.reject(_position_import_aspect__file_import);
			structure_names.reject(_position_import_aspect__file_import);
			tile_names.reject(_position_import_aspect__file_import);
			hero_stat.reject(_position_import_aspect__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_aspect__file_import);
			association_names.accept(_position_import_aspect__file_import);
			room_names.accept(_position_import_aspect__file_import);
			activity_names.accept(_position_import_aspect__file_import);
			siding_names.accept(_position_import_aspect__file_import);
			item_names.accept(_position_import_aspect__file_import);
			aspect_names.accept(_position_import_aspect__file_import);
			affinity_names.accept(_position_import_aspect__file_import);
			activity_type_names.accept(_position_import_aspect__file_import);
			trail_names.accept(_position_import_aspect__file_import);
			attack_names.accept(_position_import_aspect__file_import);
			reason_names.accept(_position_import_aspect__file_import);
			trait_names.accept(_position_import_aspect__file_import);
			condition_names.accept(_position_import_aspect__file_import);
			payment_short_type_names.accept(_position_import_aspect__file_import);
			skill_names.accept(_position_import_aspect__file_import);
			map_names.accept(_position_import_aspect__file_import);
			event_names.accept(_position_import_aspect__file_import);
			image_names.accept(_position_import_aspect__file_import);
			tile_symbols.accept(_position_import_aspect__file_import);
			payment_long_type_names.accept(_position_import_aspect__file_import);
			area_names.accept(_position_import_aspect__file_import);
			structure_names.accept(_position_import_aspect__file_import);
			tile_names.accept(_position_import_aspect__file_import);
			hero_stat.accept(_position_import_aspect__file_import);
		}
	}
	public void parse_import_map__file_import() {
		int _position_import_map__file_import = -1;
		Token.Parsed _token_import_map__file_import = null;
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
		_position_import_map__file_import=_position;
		_token_import_map__file_import=_token;
		_token=new Tokens.Rule.ImportMapFileImportToken();
		int _state_99 = _state;
		while(_position<_inputLength) {
			parse__anonymous_82();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_99==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_map__file_import.addAll(_token);
			_token_import_map__file_import.setValue(_token.getValue());
		}
		_token=_token_import_map__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_map__file_import);
			association_names.reject(_position_import_map__file_import);
			room_names.reject(_position_import_map__file_import);
			activity_names.reject(_position_import_map__file_import);
			siding_names.reject(_position_import_map__file_import);
			item_names.reject(_position_import_map__file_import);
			aspect_names.reject(_position_import_map__file_import);
			affinity_names.reject(_position_import_map__file_import);
			activity_type_names.reject(_position_import_map__file_import);
			trail_names.reject(_position_import_map__file_import);
			attack_names.reject(_position_import_map__file_import);
			reason_names.reject(_position_import_map__file_import);
			trait_names.reject(_position_import_map__file_import);
			condition_names.reject(_position_import_map__file_import);
			payment_short_type_names.reject(_position_import_map__file_import);
			skill_names.reject(_position_import_map__file_import);
			map_names.reject(_position_import_map__file_import);
			event_names.reject(_position_import_map__file_import);
			image_names.reject(_position_import_map__file_import);
			tile_symbols.reject(_position_import_map__file_import);
			payment_long_type_names.reject(_position_import_map__file_import);
			area_names.reject(_position_import_map__file_import);
			structure_names.reject(_position_import_map__file_import);
			tile_names.reject(_position_import_map__file_import);
			hero_stat.reject(_position_import_map__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_map__file_import);
			association_names.accept(_position_import_map__file_import);
			room_names.accept(_position_import_map__file_import);
			activity_names.accept(_position_import_map__file_import);
			siding_names.accept(_position_import_map__file_import);
			item_names.accept(_position_import_map__file_import);
			aspect_names.accept(_position_import_map__file_import);
			affinity_names.accept(_position_import_map__file_import);
			activity_type_names.accept(_position_import_map__file_import);
			trail_names.accept(_position_import_map__file_import);
			attack_names.accept(_position_import_map__file_import);
			reason_names.accept(_position_import_map__file_import);
			trait_names.accept(_position_import_map__file_import);
			condition_names.accept(_position_import_map__file_import);
			payment_short_type_names.accept(_position_import_map__file_import);
			skill_names.accept(_position_import_map__file_import);
			map_names.accept(_position_import_map__file_import);
			event_names.accept(_position_import_map__file_import);
			image_names.accept(_position_import_map__file_import);
			tile_symbols.accept(_position_import_map__file_import);
			payment_long_type_names.accept(_position_import_map__file_import);
			area_names.accept(_position_import_map__file_import);
			structure_names.accept(_position_import_map__file_import);
			tile_names.accept(_position_import_map__file_import);
			hero_stat.accept(_position_import_map__file_import);
		}
	}
	public void parse_import_quest() {
		int _position_import_quest = -1;
		Token.Parsed _token_import_quest = null;
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
		_position_import_quest=_position;
		_token_import_quest=_token;
		_token=new Tokens.Rule.ImportQuestToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_quest(import_quest)");
				_furthestPosition=_position;
			}
			_position=_position_import_quest;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_quest(import_quest)");
					_furthestPosition=_position;
				}
				_position=_position_import_quest;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='q') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_31.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .qsts");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_quest(import_quest)");
						_furthestPosition=_position;
					}
					_position=_position_import_quest;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_quest(import_quest)");
							_furthestPosition=_position;
						}
						_position=_position_import_quest;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/behaviours/quests/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".qsts");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportQuestFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_quest;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_quest.add(_position_import_quest,_token);
		}
		_token=_token_import_quest;
		if(_state==FAILED) {
			support_names.reject(_position_import_quest);
			association_names.reject(_position_import_quest);
			room_names.reject(_position_import_quest);
			activity_names.reject(_position_import_quest);
			siding_names.reject(_position_import_quest);
			item_names.reject(_position_import_quest);
			aspect_names.reject(_position_import_quest);
			affinity_names.reject(_position_import_quest);
			activity_type_names.reject(_position_import_quest);
			trail_names.reject(_position_import_quest);
			attack_names.reject(_position_import_quest);
			reason_names.reject(_position_import_quest);
			trait_names.reject(_position_import_quest);
			condition_names.reject(_position_import_quest);
			payment_short_type_names.reject(_position_import_quest);
			skill_names.reject(_position_import_quest);
			map_names.reject(_position_import_quest);
			event_names.reject(_position_import_quest);
			image_names.reject(_position_import_quest);
			tile_symbols.reject(_position_import_quest);
			payment_long_type_names.reject(_position_import_quest);
			area_names.reject(_position_import_quest);
			structure_names.reject(_position_import_quest);
			tile_names.reject(_position_import_quest);
			hero_stat.reject(_position_import_quest);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_quest);
			association_names.accept(_position_import_quest);
			room_names.accept(_position_import_quest);
			activity_names.accept(_position_import_quest);
			siding_names.accept(_position_import_quest);
			item_names.accept(_position_import_quest);
			aspect_names.accept(_position_import_quest);
			affinity_names.accept(_position_import_quest);
			activity_type_names.accept(_position_import_quest);
			trail_names.accept(_position_import_quest);
			attack_names.accept(_position_import_quest);
			reason_names.accept(_position_import_quest);
			trait_names.accept(_position_import_quest);
			condition_names.accept(_position_import_quest);
			payment_short_type_names.accept(_position_import_quest);
			skill_names.accept(_position_import_quest);
			map_names.accept(_position_import_quest);
			event_names.accept(_position_import_quest);
			image_names.accept(_position_import_quest);
			tile_symbols.accept(_position_import_quest);
			payment_long_type_names.accept(_position_import_quest);
			area_names.accept(_position_import_quest);
			structure_names.accept(_position_import_quest);
			tile_names.accept(_position_import_quest);
			hero_stat.accept(_position_import_quest);
		}
	}
	public void parse_import_layer() {
		int _position_import_layer = -1;
		Token.Parsed _token_import_layer = null;
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
		_position_import_layer=_position;
		_token_import_layer=_token;
		_token=new Tokens.Rule.ImportLayerToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_layer(import_layer)");
				_furthestPosition=_position;
			}
			_position=_position_import_layer;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_layer(import_layer)");
					_furthestPosition=_position;
				}
				_position=_position_import_layer;
			}
			else {
				if(_position+7-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='l') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='y') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+5]!='r') {
						_state=FAILED;
					}
					if(_inputArray[_position+6]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_162.SYNTAX);
					_position=_position+7;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .layers");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_layer(import_layer)");
						_furthestPosition=_position;
					}
					_position=_position_import_layer;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_layer(import_layer)");
							_furthestPosition=_position;
						}
						_position=_position_import_layer;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("gui/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".layers");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportLayerFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_layer;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_layer.add(_position_import_layer,_token);
		}
		_token=_token_import_layer;
		if(_state==FAILED) {
			support_names.reject(_position_import_layer);
			association_names.reject(_position_import_layer);
			room_names.reject(_position_import_layer);
			activity_names.reject(_position_import_layer);
			siding_names.reject(_position_import_layer);
			item_names.reject(_position_import_layer);
			aspect_names.reject(_position_import_layer);
			affinity_names.reject(_position_import_layer);
			activity_type_names.reject(_position_import_layer);
			trail_names.reject(_position_import_layer);
			attack_names.reject(_position_import_layer);
			reason_names.reject(_position_import_layer);
			trait_names.reject(_position_import_layer);
			condition_names.reject(_position_import_layer);
			payment_short_type_names.reject(_position_import_layer);
			skill_names.reject(_position_import_layer);
			map_names.reject(_position_import_layer);
			event_names.reject(_position_import_layer);
			image_names.reject(_position_import_layer);
			tile_symbols.reject(_position_import_layer);
			payment_long_type_names.reject(_position_import_layer);
			area_names.reject(_position_import_layer);
			structure_names.reject(_position_import_layer);
			tile_names.reject(_position_import_layer);
			hero_stat.reject(_position_import_layer);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_layer);
			association_names.accept(_position_import_layer);
			room_names.accept(_position_import_layer);
			activity_names.accept(_position_import_layer);
			siding_names.accept(_position_import_layer);
			item_names.accept(_position_import_layer);
			aspect_names.accept(_position_import_layer);
			affinity_names.accept(_position_import_layer);
			activity_type_names.accept(_position_import_layer);
			trail_names.accept(_position_import_layer);
			attack_names.accept(_position_import_layer);
			reason_names.accept(_position_import_layer);
			trait_names.accept(_position_import_layer);
			condition_names.accept(_position_import_layer);
			payment_short_type_names.accept(_position_import_layer);
			skill_names.accept(_position_import_layer);
			map_names.accept(_position_import_layer);
			event_names.accept(_position_import_layer);
			image_names.accept(_position_import_layer);
			tile_symbols.accept(_position_import_layer);
			payment_long_type_names.accept(_position_import_layer);
			area_names.accept(_position_import_layer);
			structure_names.accept(_position_import_layer);
			tile_names.accept(_position_import_layer);
			hero_stat.accept(_position_import_layer);
		}
	}
	public void parse_import_image() {
		int _position_import_image = -1;
		Token.Parsed _token_import_image = null;
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
		_position_import_image=_position;
		_token_import_image=_token;
		_token=new Tokens.Rule.ImportImageToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_image(import_image)");
				_furthestPosition=_position;
			}
			_position=_position_import_image;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_image(import_image)");
					_furthestPosition=_position;
				}
				_position=_position_import_image;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='m') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='g') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_154.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .imgs");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_image(import_image)");
						_furthestPosition=_position;
					}
					_position=_position_import_image;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_image(import_image)");
							_furthestPosition=_position;
						}
						_position=_position_import_image;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("gui/images/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".imgs");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportImageFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_image;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_image.add(_position_import_image,_token);
		}
		_token=_token_import_image;
		if(_state==FAILED) {
			support_names.reject(_position_import_image);
			association_names.reject(_position_import_image);
			room_names.reject(_position_import_image);
			activity_names.reject(_position_import_image);
			siding_names.reject(_position_import_image);
			item_names.reject(_position_import_image);
			aspect_names.reject(_position_import_image);
			affinity_names.reject(_position_import_image);
			activity_type_names.reject(_position_import_image);
			trail_names.reject(_position_import_image);
			attack_names.reject(_position_import_image);
			reason_names.reject(_position_import_image);
			trait_names.reject(_position_import_image);
			condition_names.reject(_position_import_image);
			payment_short_type_names.reject(_position_import_image);
			skill_names.reject(_position_import_image);
			map_names.reject(_position_import_image);
			event_names.reject(_position_import_image);
			image_names.reject(_position_import_image);
			tile_symbols.reject(_position_import_image);
			payment_long_type_names.reject(_position_import_image);
			area_names.reject(_position_import_image);
			structure_names.reject(_position_import_image);
			tile_names.reject(_position_import_image);
			hero_stat.reject(_position_import_image);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_image);
			association_names.accept(_position_import_image);
			room_names.accept(_position_import_image);
			activity_names.accept(_position_import_image);
			siding_names.accept(_position_import_image);
			item_names.accept(_position_import_image);
			aspect_names.accept(_position_import_image);
			affinity_names.accept(_position_import_image);
			activity_type_names.accept(_position_import_image);
			trail_names.accept(_position_import_image);
			attack_names.accept(_position_import_image);
			reason_names.accept(_position_import_image);
			trait_names.accept(_position_import_image);
			condition_names.accept(_position_import_image);
			payment_short_type_names.accept(_position_import_image);
			skill_names.accept(_position_import_image);
			map_names.accept(_position_import_image);
			event_names.accept(_position_import_image);
			image_names.accept(_position_import_image);
			tile_symbols.accept(_position_import_image);
			payment_long_type_names.accept(_position_import_image);
			area_names.accept(_position_import_image);
			structure_names.accept(_position_import_image);
			tile_names.accept(_position_import_image);
			hero_stat.accept(_position_import_image);
		}
	}
	public void parse_import_activity() {
		int _position_import_activity = -1;
		Token.Parsed _token_import_activity = null;
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
		_position_import_activity=_position;
		_token_import_activity=_token;
		_token=new Tokens.Rule.ImportActivityToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_activity(import_activity)");
				_furthestPosition=_position;
			}
			_position=_position_import_activity;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_activity(import_activity)");
					_furthestPosition=_position;
				}
				_position=_position_import_activity;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='v') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_22.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .atvs");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_activity(import_activity)");
						_furthestPosition=_position;
					}
					_position=_position_import_activity;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_activity(import_activity)");
							_furthestPosition=_position;
						}
						_position=_position_import_activity;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/behaviours/activities/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".atvs");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportActivityFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_activity;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_activity.add(_position_import_activity,_token);
		}
		_token=_token_import_activity;
		if(_state==FAILED) {
			support_names.reject(_position_import_activity);
			association_names.reject(_position_import_activity);
			room_names.reject(_position_import_activity);
			activity_names.reject(_position_import_activity);
			siding_names.reject(_position_import_activity);
			item_names.reject(_position_import_activity);
			aspect_names.reject(_position_import_activity);
			affinity_names.reject(_position_import_activity);
			activity_type_names.reject(_position_import_activity);
			trail_names.reject(_position_import_activity);
			attack_names.reject(_position_import_activity);
			reason_names.reject(_position_import_activity);
			trait_names.reject(_position_import_activity);
			condition_names.reject(_position_import_activity);
			payment_short_type_names.reject(_position_import_activity);
			skill_names.reject(_position_import_activity);
			map_names.reject(_position_import_activity);
			event_names.reject(_position_import_activity);
			image_names.reject(_position_import_activity);
			tile_symbols.reject(_position_import_activity);
			payment_long_type_names.reject(_position_import_activity);
			area_names.reject(_position_import_activity);
			structure_names.reject(_position_import_activity);
			tile_names.reject(_position_import_activity);
			hero_stat.reject(_position_import_activity);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_activity);
			association_names.accept(_position_import_activity);
			room_names.accept(_position_import_activity);
			activity_names.accept(_position_import_activity);
			siding_names.accept(_position_import_activity);
			item_names.accept(_position_import_activity);
			aspect_names.accept(_position_import_activity);
			affinity_names.accept(_position_import_activity);
			activity_type_names.accept(_position_import_activity);
			trail_names.accept(_position_import_activity);
			attack_names.accept(_position_import_activity);
			reason_names.accept(_position_import_activity);
			trait_names.accept(_position_import_activity);
			condition_names.accept(_position_import_activity);
			payment_short_type_names.accept(_position_import_activity);
			skill_names.accept(_position_import_activity);
			map_names.accept(_position_import_activity);
			event_names.accept(_position_import_activity);
			image_names.accept(_position_import_activity);
			tile_symbols.accept(_position_import_activity);
			payment_long_type_names.accept(_position_import_activity);
			area_names.accept(_position_import_activity);
			structure_names.accept(_position_import_activity);
			tile_names.accept(_position_import_activity);
			hero_stat.accept(_position_import_activity);
		}
	}
	public void parse_import_drawable__file_import() {
		int _position_import_drawable__file_import = -1;
		Token.Parsed _token_import_drawable__file_import = null;
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
		_position_import_drawable__file_import=_position;
		_token_import_drawable__file_import=_token;
		_token=new Tokens.Rule.ImportDrawableFileImportToken();
		int _state_242 = _state;
		while(_position<_inputLength) {
			parse__anonymous_222();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_242==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_drawable__file_import.addAll(_token);
			_token_import_drawable__file_import.setValue(_token.getValue());
		}
		_token=_token_import_drawable__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_drawable__file_import);
			association_names.reject(_position_import_drawable__file_import);
			room_names.reject(_position_import_drawable__file_import);
			activity_names.reject(_position_import_drawable__file_import);
			siding_names.reject(_position_import_drawable__file_import);
			item_names.reject(_position_import_drawable__file_import);
			aspect_names.reject(_position_import_drawable__file_import);
			affinity_names.reject(_position_import_drawable__file_import);
			activity_type_names.reject(_position_import_drawable__file_import);
			trail_names.reject(_position_import_drawable__file_import);
			attack_names.reject(_position_import_drawable__file_import);
			reason_names.reject(_position_import_drawable__file_import);
			trait_names.reject(_position_import_drawable__file_import);
			condition_names.reject(_position_import_drawable__file_import);
			payment_short_type_names.reject(_position_import_drawable__file_import);
			skill_names.reject(_position_import_drawable__file_import);
			map_names.reject(_position_import_drawable__file_import);
			event_names.reject(_position_import_drawable__file_import);
			image_names.reject(_position_import_drawable__file_import);
			tile_symbols.reject(_position_import_drawable__file_import);
			payment_long_type_names.reject(_position_import_drawable__file_import);
			area_names.reject(_position_import_drawable__file_import);
			structure_names.reject(_position_import_drawable__file_import);
			tile_names.reject(_position_import_drawable__file_import);
			hero_stat.reject(_position_import_drawable__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_drawable__file_import);
			association_names.accept(_position_import_drawable__file_import);
			room_names.accept(_position_import_drawable__file_import);
			activity_names.accept(_position_import_drawable__file_import);
			siding_names.accept(_position_import_drawable__file_import);
			item_names.accept(_position_import_drawable__file_import);
			aspect_names.accept(_position_import_drawable__file_import);
			affinity_names.accept(_position_import_drawable__file_import);
			activity_type_names.accept(_position_import_drawable__file_import);
			trail_names.accept(_position_import_drawable__file_import);
			attack_names.accept(_position_import_drawable__file_import);
			reason_names.accept(_position_import_drawable__file_import);
			trait_names.accept(_position_import_drawable__file_import);
			condition_names.accept(_position_import_drawable__file_import);
			payment_short_type_names.accept(_position_import_drawable__file_import);
			skill_names.accept(_position_import_drawable__file_import);
			map_names.accept(_position_import_drawable__file_import);
			event_names.accept(_position_import_drawable__file_import);
			image_names.accept(_position_import_drawable__file_import);
			tile_symbols.accept(_position_import_drawable__file_import);
			payment_long_type_names.accept(_position_import_drawable__file_import);
			area_names.accept(_position_import_drawable__file_import);
			structure_names.accept(_position_import_drawable__file_import);
			tile_names.accept(_position_import_drawable__file_import);
			hero_stat.accept(_position_import_drawable__file_import);
		}
	}
	public void parse_import_reason__file_import() {
		int _position_import_reason__file_import = -1;
		Token.Parsed _token_import_reason__file_import = null;
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
		_position_import_reason__file_import=_position;
		_token_import_reason__file_import=_token;
		_token=new Tokens.Rule.ImportReasonFileImportToken();
		int _state_71 = _state;
		while(_position<_inputLength) {
			parse__anonymous_60();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_71==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_reason__file_import.addAll(_token);
			_token_import_reason__file_import.setValue(_token.getValue());
		}
		_token=_token_import_reason__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_reason__file_import);
			association_names.reject(_position_import_reason__file_import);
			room_names.reject(_position_import_reason__file_import);
			activity_names.reject(_position_import_reason__file_import);
			siding_names.reject(_position_import_reason__file_import);
			item_names.reject(_position_import_reason__file_import);
			aspect_names.reject(_position_import_reason__file_import);
			affinity_names.reject(_position_import_reason__file_import);
			activity_type_names.reject(_position_import_reason__file_import);
			trail_names.reject(_position_import_reason__file_import);
			attack_names.reject(_position_import_reason__file_import);
			reason_names.reject(_position_import_reason__file_import);
			trait_names.reject(_position_import_reason__file_import);
			condition_names.reject(_position_import_reason__file_import);
			payment_short_type_names.reject(_position_import_reason__file_import);
			skill_names.reject(_position_import_reason__file_import);
			map_names.reject(_position_import_reason__file_import);
			event_names.reject(_position_import_reason__file_import);
			image_names.reject(_position_import_reason__file_import);
			tile_symbols.reject(_position_import_reason__file_import);
			payment_long_type_names.reject(_position_import_reason__file_import);
			area_names.reject(_position_import_reason__file_import);
			structure_names.reject(_position_import_reason__file_import);
			tile_names.reject(_position_import_reason__file_import);
			hero_stat.reject(_position_import_reason__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_reason__file_import);
			association_names.accept(_position_import_reason__file_import);
			room_names.accept(_position_import_reason__file_import);
			activity_names.accept(_position_import_reason__file_import);
			siding_names.accept(_position_import_reason__file_import);
			item_names.accept(_position_import_reason__file_import);
			aspect_names.accept(_position_import_reason__file_import);
			affinity_names.accept(_position_import_reason__file_import);
			activity_type_names.accept(_position_import_reason__file_import);
			trail_names.accept(_position_import_reason__file_import);
			attack_names.accept(_position_import_reason__file_import);
			reason_names.accept(_position_import_reason__file_import);
			trait_names.accept(_position_import_reason__file_import);
			condition_names.accept(_position_import_reason__file_import);
			payment_short_type_names.accept(_position_import_reason__file_import);
			skill_names.accept(_position_import_reason__file_import);
			map_names.accept(_position_import_reason__file_import);
			event_names.accept(_position_import_reason__file_import);
			image_names.accept(_position_import_reason__file_import);
			tile_symbols.accept(_position_import_reason__file_import);
			payment_long_type_names.accept(_position_import_reason__file_import);
			area_names.accept(_position_import_reason__file_import);
			structure_names.accept(_position_import_reason__file_import);
			tile_names.accept(_position_import_reason__file_import);
			hero_stat.accept(_position_import_reason__file_import);
		}
	}
	public void parse_import_aspect() {
		int _position_import_aspect = -1;
		Token.Parsed _token_import_aspect = null;
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
		_position_import_aspect=_position;
		_token_import_aspect=_token;
		_token=new Tokens.Rule.ImportAspectToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_aspect(import_aspect)");
				_furthestPosition=_position;
			}
			_position=_position_import_aspect;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_aspect(import_aspect)");
					_furthestPosition=_position;
				}
				_position=_position_import_aspect;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='p') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_3.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .asps");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_aspect(import_aspect)");
						_furthestPosition=_position;
					}
					_position=_position_import_aspect;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_aspect(import_aspect)");
							_furthestPosition=_position;
						}
						_position=_position_import_aspect;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("aspects/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".asps");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportAspectFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_aspect;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_aspect.add(_position_import_aspect,_token);
		}
		_token=_token_import_aspect;
		if(_state==FAILED) {
			support_names.reject(_position_import_aspect);
			association_names.reject(_position_import_aspect);
			room_names.reject(_position_import_aspect);
			activity_names.reject(_position_import_aspect);
			siding_names.reject(_position_import_aspect);
			item_names.reject(_position_import_aspect);
			aspect_names.reject(_position_import_aspect);
			affinity_names.reject(_position_import_aspect);
			activity_type_names.reject(_position_import_aspect);
			trail_names.reject(_position_import_aspect);
			attack_names.reject(_position_import_aspect);
			reason_names.reject(_position_import_aspect);
			trait_names.reject(_position_import_aspect);
			condition_names.reject(_position_import_aspect);
			payment_short_type_names.reject(_position_import_aspect);
			skill_names.reject(_position_import_aspect);
			map_names.reject(_position_import_aspect);
			event_names.reject(_position_import_aspect);
			image_names.reject(_position_import_aspect);
			tile_symbols.reject(_position_import_aspect);
			payment_long_type_names.reject(_position_import_aspect);
			area_names.reject(_position_import_aspect);
			structure_names.reject(_position_import_aspect);
			tile_names.reject(_position_import_aspect);
			hero_stat.reject(_position_import_aspect);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_aspect);
			association_names.accept(_position_import_aspect);
			room_names.accept(_position_import_aspect);
			activity_names.accept(_position_import_aspect);
			siding_names.accept(_position_import_aspect);
			item_names.accept(_position_import_aspect);
			aspect_names.accept(_position_import_aspect);
			affinity_names.accept(_position_import_aspect);
			activity_type_names.accept(_position_import_aspect);
			trail_names.accept(_position_import_aspect);
			attack_names.accept(_position_import_aspect);
			reason_names.accept(_position_import_aspect);
			trait_names.accept(_position_import_aspect);
			condition_names.accept(_position_import_aspect);
			payment_short_type_names.accept(_position_import_aspect);
			skill_names.accept(_position_import_aspect);
			map_names.accept(_position_import_aspect);
			event_names.accept(_position_import_aspect);
			image_names.accept(_position_import_aspect);
			tile_symbols.accept(_position_import_aspect);
			payment_long_type_names.accept(_position_import_aspect);
			area_names.accept(_position_import_aspect);
			structure_names.accept(_position_import_aspect);
			tile_names.accept(_position_import_aspect);
			hero_stat.accept(_position_import_aspect);
		}
	}
	public void parse_import_item__file_import() {
		int _position_import_item__file_import = -1;
		Token.Parsed _token_import_item__file_import = null;
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
		_position_import_item__file_import=_position;
		_token_import_item__file_import=_token;
		_token=new Tokens.Rule.ImportItemFileImportToken();
		int _state_16 = _state;
		while(_position<_inputLength) {
			parse__anonymous_3();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_16==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_item__file_import.addAll(_token);
			_token_import_item__file_import.setValue(_token.getValue());
		}
		_token=_token_import_item__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_item__file_import);
			association_names.reject(_position_import_item__file_import);
			room_names.reject(_position_import_item__file_import);
			activity_names.reject(_position_import_item__file_import);
			siding_names.reject(_position_import_item__file_import);
			item_names.reject(_position_import_item__file_import);
			aspect_names.reject(_position_import_item__file_import);
			affinity_names.reject(_position_import_item__file_import);
			activity_type_names.reject(_position_import_item__file_import);
			trail_names.reject(_position_import_item__file_import);
			attack_names.reject(_position_import_item__file_import);
			reason_names.reject(_position_import_item__file_import);
			trait_names.reject(_position_import_item__file_import);
			condition_names.reject(_position_import_item__file_import);
			payment_short_type_names.reject(_position_import_item__file_import);
			skill_names.reject(_position_import_item__file_import);
			map_names.reject(_position_import_item__file_import);
			event_names.reject(_position_import_item__file_import);
			image_names.reject(_position_import_item__file_import);
			tile_symbols.reject(_position_import_item__file_import);
			payment_long_type_names.reject(_position_import_item__file_import);
			area_names.reject(_position_import_item__file_import);
			structure_names.reject(_position_import_item__file_import);
			tile_names.reject(_position_import_item__file_import);
			hero_stat.reject(_position_import_item__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_item__file_import);
			association_names.accept(_position_import_item__file_import);
			room_names.accept(_position_import_item__file_import);
			activity_names.accept(_position_import_item__file_import);
			siding_names.accept(_position_import_item__file_import);
			item_names.accept(_position_import_item__file_import);
			aspect_names.accept(_position_import_item__file_import);
			affinity_names.accept(_position_import_item__file_import);
			activity_type_names.accept(_position_import_item__file_import);
			trail_names.accept(_position_import_item__file_import);
			attack_names.accept(_position_import_item__file_import);
			reason_names.accept(_position_import_item__file_import);
			trait_names.accept(_position_import_item__file_import);
			condition_names.accept(_position_import_item__file_import);
			payment_short_type_names.accept(_position_import_item__file_import);
			skill_names.accept(_position_import_item__file_import);
			map_names.accept(_position_import_item__file_import);
			event_names.accept(_position_import_item__file_import);
			image_names.accept(_position_import_item__file_import);
			tile_symbols.accept(_position_import_item__file_import);
			payment_long_type_names.accept(_position_import_item__file_import);
			area_names.accept(_position_import_item__file_import);
			structure_names.accept(_position_import_item__file_import);
			tile_names.accept(_position_import_item__file_import);
			hero_stat.accept(_position_import_item__file_import);
		}
	}
	public void parse_import_trait() {
		int _position_import_trait = -1;
		Token.Parsed _token_import_trait = null;
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
		_position_import_trait=_position;
		_token_import_trait=_token;
		_token=new Tokens.Rule.ImportTraitToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_trait(import_trait)");
				_furthestPosition=_position;
			}
			_position=_position_import_trait;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_trait(import_trait)");
					_furthestPosition=_position;
				}
				_position=_position_import_trait;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='r') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_21.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .trts");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_trait(import_trait)");
						_furthestPosition=_position;
					}
					_position=_position_import_trait;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_trait(import_trait)");
							_furthestPosition=_position;
						}
						_position=_position_import_trait;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/mods/traits/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".trts");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportTraitFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_trait;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_trait.add(_position_import_trait,_token);
		}
		_token=_token_import_trait;
		if(_state==FAILED) {
			support_names.reject(_position_import_trait);
			association_names.reject(_position_import_trait);
			room_names.reject(_position_import_trait);
			activity_names.reject(_position_import_trait);
			siding_names.reject(_position_import_trait);
			item_names.reject(_position_import_trait);
			aspect_names.reject(_position_import_trait);
			affinity_names.reject(_position_import_trait);
			activity_type_names.reject(_position_import_trait);
			trail_names.reject(_position_import_trait);
			attack_names.reject(_position_import_trait);
			reason_names.reject(_position_import_trait);
			trait_names.reject(_position_import_trait);
			condition_names.reject(_position_import_trait);
			payment_short_type_names.reject(_position_import_trait);
			skill_names.reject(_position_import_trait);
			map_names.reject(_position_import_trait);
			event_names.reject(_position_import_trait);
			image_names.reject(_position_import_trait);
			tile_symbols.reject(_position_import_trait);
			payment_long_type_names.reject(_position_import_trait);
			area_names.reject(_position_import_trait);
			structure_names.reject(_position_import_trait);
			tile_names.reject(_position_import_trait);
			hero_stat.reject(_position_import_trait);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_trait);
			association_names.accept(_position_import_trait);
			room_names.accept(_position_import_trait);
			activity_names.accept(_position_import_trait);
			siding_names.accept(_position_import_trait);
			item_names.accept(_position_import_trait);
			aspect_names.accept(_position_import_trait);
			affinity_names.accept(_position_import_trait);
			activity_type_names.accept(_position_import_trait);
			trail_names.accept(_position_import_trait);
			attack_names.accept(_position_import_trait);
			reason_names.accept(_position_import_trait);
			trait_names.accept(_position_import_trait);
			condition_names.accept(_position_import_trait);
			payment_short_type_names.accept(_position_import_trait);
			skill_names.accept(_position_import_trait);
			map_names.accept(_position_import_trait);
			event_names.accept(_position_import_trait);
			image_names.accept(_position_import_trait);
			tile_symbols.accept(_position_import_trait);
			payment_long_type_names.accept(_position_import_trait);
			area_names.accept(_position_import_trait);
			structure_names.accept(_position_import_trait);
			tile_names.accept(_position_import_trait);
			hero_stat.accept(_position_import_trait);
		}
	}
	public void parse_import_animation_type() {
		int _position_import_animation_type = -1;
		Token.Parsed _token_import_animation_type = null;
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
		_position_import_animation_type=_position;
		_token_import_animation_type=_token;
		_token=new Tokens.Rule.ImportAnimationTypeToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_animation_type(import_animation_type)");
				_furthestPosition=_position;
			}
			_position=_position_import_animation_type;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_animation_type(import_animation_type)");
					_furthestPosition=_position;
				}
				_position=_position_import_animation_type;
			}
			else {
				if(_position+15-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='n') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='m') {
						_state=FAILED;
					}
					if(_inputArray[_position+5]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+6]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+7]!='i') {
						_state=FAILED;
					}
					if(_inputArray[_position+8]!='o') {
						_state=FAILED;
					}
					if(_inputArray[_position+9]!='n') {
						_state=FAILED;
					}
					if(_inputArray[_position+10]!='T') {
						_state=FAILED;
					}
					if(_inputArray[_position+11]!='y') {
						_state=FAILED;
					}
					if(_inputArray[_position+12]!='p') {
						_state=FAILED;
					}
					if(_inputArray[_position+13]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+14]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_150.SYNTAX);
					_position=_position+15;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .animationTypes");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_animation_type(import_animation_type)");
						_furthestPosition=_position;
					}
					_position=_position_import_animation_type;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_animation_type(import_animation_type)");
							_furthestPosition=_position;
						}
						_position=_position_import_animation_type;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("gui/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".animationTypes");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportAnimationTypeFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_animation_type;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_animation_type.add(_position_import_animation_type,_token);
		}
		_token=_token_import_animation_type;
		if(_state==FAILED) {
			support_names.reject(_position_import_animation_type);
			association_names.reject(_position_import_animation_type);
			room_names.reject(_position_import_animation_type);
			activity_names.reject(_position_import_animation_type);
			siding_names.reject(_position_import_animation_type);
			item_names.reject(_position_import_animation_type);
			aspect_names.reject(_position_import_animation_type);
			affinity_names.reject(_position_import_animation_type);
			activity_type_names.reject(_position_import_animation_type);
			trail_names.reject(_position_import_animation_type);
			attack_names.reject(_position_import_animation_type);
			reason_names.reject(_position_import_animation_type);
			trait_names.reject(_position_import_animation_type);
			condition_names.reject(_position_import_animation_type);
			payment_short_type_names.reject(_position_import_animation_type);
			skill_names.reject(_position_import_animation_type);
			map_names.reject(_position_import_animation_type);
			event_names.reject(_position_import_animation_type);
			image_names.reject(_position_import_animation_type);
			tile_symbols.reject(_position_import_animation_type);
			payment_long_type_names.reject(_position_import_animation_type);
			area_names.reject(_position_import_animation_type);
			structure_names.reject(_position_import_animation_type);
			tile_names.reject(_position_import_animation_type);
			hero_stat.reject(_position_import_animation_type);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_animation_type);
			association_names.accept(_position_import_animation_type);
			room_names.accept(_position_import_animation_type);
			activity_names.accept(_position_import_animation_type);
			siding_names.accept(_position_import_animation_type);
			item_names.accept(_position_import_animation_type);
			aspect_names.accept(_position_import_animation_type);
			affinity_names.accept(_position_import_animation_type);
			activity_type_names.accept(_position_import_animation_type);
			trail_names.accept(_position_import_animation_type);
			attack_names.accept(_position_import_animation_type);
			reason_names.accept(_position_import_animation_type);
			trait_names.accept(_position_import_animation_type);
			condition_names.accept(_position_import_animation_type);
			payment_short_type_names.accept(_position_import_animation_type);
			skill_names.accept(_position_import_animation_type);
			map_names.accept(_position_import_animation_type);
			event_names.accept(_position_import_animation_type);
			image_names.accept(_position_import_animation_type);
			tile_symbols.accept(_position_import_animation_type);
			payment_long_type_names.accept(_position_import_animation_type);
			area_names.accept(_position_import_animation_type);
			structure_names.accept(_position_import_animation_type);
			tile_names.accept(_position_import_animation_type);
			hero_stat.accept(_position_import_animation_type);
		}
	}
	public void parse_import_condition() {
		int _position_import_condition = -1;
		Token.Parsed _token_import_condition = null;
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
		_position_import_condition=_position;
		_token_import_condition=_token;
		_token=new Tokens.Rule.ImportConditionToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_condition(import_condition)");
				_furthestPosition=_position;
			}
			_position=_position_import_condition;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_condition(import_condition)");
					_furthestPosition=_position;
				}
				_position=_position_import_condition;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='c') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='n') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='d') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_16.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .cnds");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_condition(import_condition)");
						_furthestPosition=_position;
					}
					_position=_position_import_condition;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_condition(import_condition)");
							_furthestPosition=_position;
						}
						_position=_position_import_condition;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/mods/conditions/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".cnds");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportConditionFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_condition;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_condition.add(_position_import_condition,_token);
		}
		_token=_token_import_condition;
		if(_state==FAILED) {
			support_names.reject(_position_import_condition);
			association_names.reject(_position_import_condition);
			room_names.reject(_position_import_condition);
			activity_names.reject(_position_import_condition);
			siding_names.reject(_position_import_condition);
			item_names.reject(_position_import_condition);
			aspect_names.reject(_position_import_condition);
			affinity_names.reject(_position_import_condition);
			activity_type_names.reject(_position_import_condition);
			trail_names.reject(_position_import_condition);
			attack_names.reject(_position_import_condition);
			reason_names.reject(_position_import_condition);
			trait_names.reject(_position_import_condition);
			condition_names.reject(_position_import_condition);
			payment_short_type_names.reject(_position_import_condition);
			skill_names.reject(_position_import_condition);
			map_names.reject(_position_import_condition);
			event_names.reject(_position_import_condition);
			image_names.reject(_position_import_condition);
			tile_symbols.reject(_position_import_condition);
			payment_long_type_names.reject(_position_import_condition);
			area_names.reject(_position_import_condition);
			structure_names.reject(_position_import_condition);
			tile_names.reject(_position_import_condition);
			hero_stat.reject(_position_import_condition);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_condition);
			association_names.accept(_position_import_condition);
			room_names.accept(_position_import_condition);
			activity_names.accept(_position_import_condition);
			siding_names.accept(_position_import_condition);
			item_names.accept(_position_import_condition);
			aspect_names.accept(_position_import_condition);
			affinity_names.accept(_position_import_condition);
			activity_type_names.accept(_position_import_condition);
			trail_names.accept(_position_import_condition);
			attack_names.accept(_position_import_condition);
			reason_names.accept(_position_import_condition);
			trait_names.accept(_position_import_condition);
			condition_names.accept(_position_import_condition);
			payment_short_type_names.accept(_position_import_condition);
			skill_names.accept(_position_import_condition);
			map_names.accept(_position_import_condition);
			event_names.accept(_position_import_condition);
			image_names.accept(_position_import_condition);
			tile_symbols.accept(_position_import_condition);
			payment_long_type_names.accept(_position_import_condition);
			area_names.accept(_position_import_condition);
			structure_names.accept(_position_import_condition);
			tile_names.accept(_position_import_condition);
			hero_stat.accept(_position_import_condition);
		}
	}
	public void parse_import_tile__file_import() {
		int _position_import_tile__file_import = -1;
		Token.Parsed _token_import_tile__file_import = null;
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
		_position_import_tile__file_import=_position;
		_token_import_tile__file_import=_token;
		_token=new Tokens.Rule.ImportTileFileImportToken();
		int _state_113 = _state;
		while(_position<_inputLength) {
			parse__anonymous_94();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_113==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_tile__file_import.addAll(_token);
			_token_import_tile__file_import.setValue(_token.getValue());
		}
		_token=_token_import_tile__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_tile__file_import);
			association_names.reject(_position_import_tile__file_import);
			room_names.reject(_position_import_tile__file_import);
			activity_names.reject(_position_import_tile__file_import);
			siding_names.reject(_position_import_tile__file_import);
			item_names.reject(_position_import_tile__file_import);
			aspect_names.reject(_position_import_tile__file_import);
			affinity_names.reject(_position_import_tile__file_import);
			activity_type_names.reject(_position_import_tile__file_import);
			trail_names.reject(_position_import_tile__file_import);
			attack_names.reject(_position_import_tile__file_import);
			reason_names.reject(_position_import_tile__file_import);
			trait_names.reject(_position_import_tile__file_import);
			condition_names.reject(_position_import_tile__file_import);
			payment_short_type_names.reject(_position_import_tile__file_import);
			skill_names.reject(_position_import_tile__file_import);
			map_names.reject(_position_import_tile__file_import);
			event_names.reject(_position_import_tile__file_import);
			image_names.reject(_position_import_tile__file_import);
			tile_symbols.reject(_position_import_tile__file_import);
			payment_long_type_names.reject(_position_import_tile__file_import);
			area_names.reject(_position_import_tile__file_import);
			structure_names.reject(_position_import_tile__file_import);
			tile_names.reject(_position_import_tile__file_import);
			hero_stat.reject(_position_import_tile__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_tile__file_import);
			association_names.accept(_position_import_tile__file_import);
			room_names.accept(_position_import_tile__file_import);
			activity_names.accept(_position_import_tile__file_import);
			siding_names.accept(_position_import_tile__file_import);
			item_names.accept(_position_import_tile__file_import);
			aspect_names.accept(_position_import_tile__file_import);
			affinity_names.accept(_position_import_tile__file_import);
			activity_type_names.accept(_position_import_tile__file_import);
			trail_names.accept(_position_import_tile__file_import);
			attack_names.accept(_position_import_tile__file_import);
			reason_names.accept(_position_import_tile__file_import);
			trait_names.accept(_position_import_tile__file_import);
			condition_names.accept(_position_import_tile__file_import);
			payment_short_type_names.accept(_position_import_tile__file_import);
			skill_names.accept(_position_import_tile__file_import);
			map_names.accept(_position_import_tile__file_import);
			event_names.accept(_position_import_tile__file_import);
			image_names.accept(_position_import_tile__file_import);
			tile_symbols.accept(_position_import_tile__file_import);
			payment_long_type_names.accept(_position_import_tile__file_import);
			area_names.accept(_position_import_tile__file_import);
			structure_names.accept(_position_import_tile__file_import);
			tile_names.accept(_position_import_tile__file_import);
			hero_stat.accept(_position_import_tile__file_import);
		}
	}
	public void parse_import_trait__file_import() {
		int _position_import_trait__file_import = -1;
		Token.Parsed _token_import_trait__file_import = null;
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
		_position_import_trait__file_import=_position;
		_token_import_trait__file_import=_token;
		_token=new Tokens.Rule.ImportTraitFileImportToken();
		int _state_35 = _state;
		while(_position<_inputLength) {
			parse__anonymous_20();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_35==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_trait__file_import.addAll(_token);
			_token_import_trait__file_import.setValue(_token.getValue());
		}
		_token=_token_import_trait__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_trait__file_import);
			association_names.reject(_position_import_trait__file_import);
			room_names.reject(_position_import_trait__file_import);
			activity_names.reject(_position_import_trait__file_import);
			siding_names.reject(_position_import_trait__file_import);
			item_names.reject(_position_import_trait__file_import);
			aspect_names.reject(_position_import_trait__file_import);
			affinity_names.reject(_position_import_trait__file_import);
			activity_type_names.reject(_position_import_trait__file_import);
			trail_names.reject(_position_import_trait__file_import);
			attack_names.reject(_position_import_trait__file_import);
			reason_names.reject(_position_import_trait__file_import);
			trait_names.reject(_position_import_trait__file_import);
			condition_names.reject(_position_import_trait__file_import);
			payment_short_type_names.reject(_position_import_trait__file_import);
			skill_names.reject(_position_import_trait__file_import);
			map_names.reject(_position_import_trait__file_import);
			event_names.reject(_position_import_trait__file_import);
			image_names.reject(_position_import_trait__file_import);
			tile_symbols.reject(_position_import_trait__file_import);
			payment_long_type_names.reject(_position_import_trait__file_import);
			area_names.reject(_position_import_trait__file_import);
			structure_names.reject(_position_import_trait__file_import);
			tile_names.reject(_position_import_trait__file_import);
			hero_stat.reject(_position_import_trait__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_trait__file_import);
			association_names.accept(_position_import_trait__file_import);
			room_names.accept(_position_import_trait__file_import);
			activity_names.accept(_position_import_trait__file_import);
			siding_names.accept(_position_import_trait__file_import);
			item_names.accept(_position_import_trait__file_import);
			aspect_names.accept(_position_import_trait__file_import);
			affinity_names.accept(_position_import_trait__file_import);
			activity_type_names.accept(_position_import_trait__file_import);
			trail_names.accept(_position_import_trait__file_import);
			attack_names.accept(_position_import_trait__file_import);
			reason_names.accept(_position_import_trait__file_import);
			trait_names.accept(_position_import_trait__file_import);
			condition_names.accept(_position_import_trait__file_import);
			payment_short_type_names.accept(_position_import_trait__file_import);
			skill_names.accept(_position_import_trait__file_import);
			map_names.accept(_position_import_trait__file_import);
			event_names.accept(_position_import_trait__file_import);
			image_names.accept(_position_import_trait__file_import);
			tile_symbols.accept(_position_import_trait__file_import);
			payment_long_type_names.accept(_position_import_trait__file_import);
			area_names.accept(_position_import_trait__file_import);
			structure_names.accept(_position_import_trait__file_import);
			tile_names.accept(_position_import_trait__file_import);
			hero_stat.accept(_position_import_trait__file_import);
		}
	}
	public void parse_import_affinity() {
		int _position_import_affinity = -1;
		Token.Parsed _token_import_affinity = null;
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
		_position_import_affinity=_position;
		_token_import_affinity=_token;
		_token=new Tokens.Rule.ImportAffinityToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_affinity(import_affinity)");
				_furthestPosition=_position;
			}
			_position=_position_import_affinity;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_affinity(import_affinity)");
					_furthestPosition=_position;
				}
				_position=_position_import_affinity;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='f') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='t') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_13.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .afts");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_affinity(import_affinity)");
						_furthestPosition=_position;
					}
					_position=_position_import_affinity;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_affinity(import_affinity)");
							_furthestPosition=_position;
						}
						_position=_position_import_affinity;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/mods/affinities/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".afts");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportAffinityFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_affinity;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_affinity.add(_position_import_affinity,_token);
		}
		_token=_token_import_affinity;
		if(_state==FAILED) {
			support_names.reject(_position_import_affinity);
			association_names.reject(_position_import_affinity);
			room_names.reject(_position_import_affinity);
			activity_names.reject(_position_import_affinity);
			siding_names.reject(_position_import_affinity);
			item_names.reject(_position_import_affinity);
			aspect_names.reject(_position_import_affinity);
			affinity_names.reject(_position_import_affinity);
			activity_type_names.reject(_position_import_affinity);
			trail_names.reject(_position_import_affinity);
			attack_names.reject(_position_import_affinity);
			reason_names.reject(_position_import_affinity);
			trait_names.reject(_position_import_affinity);
			condition_names.reject(_position_import_affinity);
			payment_short_type_names.reject(_position_import_affinity);
			skill_names.reject(_position_import_affinity);
			map_names.reject(_position_import_affinity);
			event_names.reject(_position_import_affinity);
			image_names.reject(_position_import_affinity);
			tile_symbols.reject(_position_import_affinity);
			payment_long_type_names.reject(_position_import_affinity);
			area_names.reject(_position_import_affinity);
			structure_names.reject(_position_import_affinity);
			tile_names.reject(_position_import_affinity);
			hero_stat.reject(_position_import_affinity);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_affinity);
			association_names.accept(_position_import_affinity);
			room_names.accept(_position_import_affinity);
			activity_names.accept(_position_import_affinity);
			siding_names.accept(_position_import_affinity);
			item_names.accept(_position_import_affinity);
			aspect_names.accept(_position_import_affinity);
			affinity_names.accept(_position_import_affinity);
			activity_type_names.accept(_position_import_affinity);
			trail_names.accept(_position_import_affinity);
			attack_names.accept(_position_import_affinity);
			reason_names.accept(_position_import_affinity);
			trait_names.accept(_position_import_affinity);
			condition_names.accept(_position_import_affinity);
			payment_short_type_names.accept(_position_import_affinity);
			skill_names.accept(_position_import_affinity);
			map_names.accept(_position_import_affinity);
			event_names.accept(_position_import_affinity);
			image_names.accept(_position_import_affinity);
			tile_symbols.accept(_position_import_affinity);
			payment_long_type_names.accept(_position_import_affinity);
			area_names.accept(_position_import_affinity);
			structure_names.accept(_position_import_affinity);
			tile_names.accept(_position_import_affinity);
			hero_stat.accept(_position_import_affinity);
		}
	}
	public void parse_import_payment_type() {
		int _position_import_payment_type = -1;
		Token.Parsed _token_import_payment_type = null;
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
		_position_import_payment_type=_position;
		_token_import_payment_type=_token;
		_token=new Tokens.Rule.ImportPaymentTypeToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_payment_type(import_payment_type)");
				_furthestPosition=_position;
			}
			_position=_position_import_payment_type;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_payment_type(import_payment_type)");
					_furthestPosition=_position;
				}
				_position=_position_import_payment_type;
			}
			else {
				if(_position+8-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='p') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='y') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='m') {
						_state=FAILED;
					}
					if(_inputArray[_position+5]!='e') {
						_state=FAILED;
					}
					if(_inputArray[_position+6]!='n') {
						_state=FAILED;
					}
					if(_inputArray[_position+7]!='t') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_98.SYNTAX);
					_position=_position+8;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .payment");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_payment_type(import_payment_type)");
						_furthestPosition=_position;
					}
					_position=_position_import_payment_type;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_payment_type(import_payment_type)");
							_furthestPosition=_position;
						}
						_position=_position_import_payment_type;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("overview/treasuries/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".payment");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportPaymentTypeFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_payment_type;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_payment_type.add(_position_import_payment_type,_token);
		}
		_token=_token_import_payment_type;
		if(_state==FAILED) {
			support_names.reject(_position_import_payment_type);
			association_names.reject(_position_import_payment_type);
			room_names.reject(_position_import_payment_type);
			activity_names.reject(_position_import_payment_type);
			siding_names.reject(_position_import_payment_type);
			item_names.reject(_position_import_payment_type);
			aspect_names.reject(_position_import_payment_type);
			affinity_names.reject(_position_import_payment_type);
			activity_type_names.reject(_position_import_payment_type);
			trail_names.reject(_position_import_payment_type);
			attack_names.reject(_position_import_payment_type);
			reason_names.reject(_position_import_payment_type);
			trait_names.reject(_position_import_payment_type);
			condition_names.reject(_position_import_payment_type);
			payment_short_type_names.reject(_position_import_payment_type);
			skill_names.reject(_position_import_payment_type);
			map_names.reject(_position_import_payment_type);
			event_names.reject(_position_import_payment_type);
			image_names.reject(_position_import_payment_type);
			tile_symbols.reject(_position_import_payment_type);
			payment_long_type_names.reject(_position_import_payment_type);
			area_names.reject(_position_import_payment_type);
			structure_names.reject(_position_import_payment_type);
			tile_names.reject(_position_import_payment_type);
			hero_stat.reject(_position_import_payment_type);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_payment_type);
			association_names.accept(_position_import_payment_type);
			room_names.accept(_position_import_payment_type);
			activity_names.accept(_position_import_payment_type);
			siding_names.accept(_position_import_payment_type);
			item_names.accept(_position_import_payment_type);
			aspect_names.accept(_position_import_payment_type);
			affinity_names.accept(_position_import_payment_type);
			activity_type_names.accept(_position_import_payment_type);
			trail_names.accept(_position_import_payment_type);
			attack_names.accept(_position_import_payment_type);
			reason_names.accept(_position_import_payment_type);
			trait_names.accept(_position_import_payment_type);
			condition_names.accept(_position_import_payment_type);
			payment_short_type_names.accept(_position_import_payment_type);
			skill_names.accept(_position_import_payment_type);
			map_names.accept(_position_import_payment_type);
			event_names.accept(_position_import_payment_type);
			image_names.accept(_position_import_payment_type);
			tile_symbols.accept(_position_import_payment_type);
			payment_long_type_names.accept(_position_import_payment_type);
			area_names.accept(_position_import_payment_type);
			structure_names.accept(_position_import_payment_type);
			tile_names.accept(_position_import_payment_type);
			hero_stat.accept(_position_import_payment_type);
		}
	}
	public void parse_import_drawable() {
		int _position_import_drawable = -1;
		Token.Parsed _token_import_drawable = null;
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
		_position_import_drawable=_position;
		_token_import_drawable=_token;
		_token=new Tokens.Rule.ImportDrawableToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_drawable(import_drawable)");
				_furthestPosition=_position;
			}
			_position=_position_import_drawable;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_drawable(import_drawable)");
					_furthestPosition=_position;
				}
				_position=_position_import_drawable;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='d') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='w') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='b') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_156.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .dwbs");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_drawable(import_drawable)");
						_furthestPosition=_position;
					}
					_position=_position_import_drawable;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_drawable(import_drawable)");
							_furthestPosition=_position;
						}
						_position=_position_import_drawable;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("gui/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".dwbs");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportDrawableFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_drawable;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_drawable.add(_position_import_drawable,_token);
		}
		_token=_token_import_drawable;
		if(_state==FAILED) {
			support_names.reject(_position_import_drawable);
			association_names.reject(_position_import_drawable);
			room_names.reject(_position_import_drawable);
			activity_names.reject(_position_import_drawable);
			siding_names.reject(_position_import_drawable);
			item_names.reject(_position_import_drawable);
			aspect_names.reject(_position_import_drawable);
			affinity_names.reject(_position_import_drawable);
			activity_type_names.reject(_position_import_drawable);
			trail_names.reject(_position_import_drawable);
			attack_names.reject(_position_import_drawable);
			reason_names.reject(_position_import_drawable);
			trait_names.reject(_position_import_drawable);
			condition_names.reject(_position_import_drawable);
			payment_short_type_names.reject(_position_import_drawable);
			skill_names.reject(_position_import_drawable);
			map_names.reject(_position_import_drawable);
			event_names.reject(_position_import_drawable);
			image_names.reject(_position_import_drawable);
			tile_symbols.reject(_position_import_drawable);
			payment_long_type_names.reject(_position_import_drawable);
			area_names.reject(_position_import_drawable);
			structure_names.reject(_position_import_drawable);
			tile_names.reject(_position_import_drawable);
			hero_stat.reject(_position_import_drawable);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_drawable);
			association_names.accept(_position_import_drawable);
			room_names.accept(_position_import_drawable);
			activity_names.accept(_position_import_drawable);
			siding_names.accept(_position_import_drawable);
			item_names.accept(_position_import_drawable);
			aspect_names.accept(_position_import_drawable);
			affinity_names.accept(_position_import_drawable);
			activity_type_names.accept(_position_import_drawable);
			trail_names.accept(_position_import_drawable);
			attack_names.accept(_position_import_drawable);
			reason_names.accept(_position_import_drawable);
			trait_names.accept(_position_import_drawable);
			condition_names.accept(_position_import_drawable);
			payment_short_type_names.accept(_position_import_drawable);
			skill_names.accept(_position_import_drawable);
			map_names.accept(_position_import_drawable);
			event_names.accept(_position_import_drawable);
			image_names.accept(_position_import_drawable);
			tile_symbols.accept(_position_import_drawable);
			payment_long_type_names.accept(_position_import_drawable);
			area_names.accept(_position_import_drawable);
			structure_names.accept(_position_import_drawable);
			tile_names.accept(_position_import_drawable);
			hero_stat.accept(_position_import_drawable);
		}
	}
	public void parse_import_condition__file_import() {
		int _position_import_condition__file_import = -1;
		Token.Parsed _token_import_condition__file_import = null;
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
		_position_import_condition__file_import=_position;
		_token_import_condition__file_import=_token;
		_token=new Tokens.Rule.ImportConditionFileImportToken();
		int _state_30 = _state;
		while(_position<_inputLength) {
			parse__anonymous_14();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_30==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_condition__file_import.addAll(_token);
			_token_import_condition__file_import.setValue(_token.getValue());
		}
		_token=_token_import_condition__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_condition__file_import);
			association_names.reject(_position_import_condition__file_import);
			room_names.reject(_position_import_condition__file_import);
			activity_names.reject(_position_import_condition__file_import);
			siding_names.reject(_position_import_condition__file_import);
			item_names.reject(_position_import_condition__file_import);
			aspect_names.reject(_position_import_condition__file_import);
			affinity_names.reject(_position_import_condition__file_import);
			activity_type_names.reject(_position_import_condition__file_import);
			trail_names.reject(_position_import_condition__file_import);
			attack_names.reject(_position_import_condition__file_import);
			reason_names.reject(_position_import_condition__file_import);
			trait_names.reject(_position_import_condition__file_import);
			condition_names.reject(_position_import_condition__file_import);
			payment_short_type_names.reject(_position_import_condition__file_import);
			skill_names.reject(_position_import_condition__file_import);
			map_names.reject(_position_import_condition__file_import);
			event_names.reject(_position_import_condition__file_import);
			image_names.reject(_position_import_condition__file_import);
			tile_symbols.reject(_position_import_condition__file_import);
			payment_long_type_names.reject(_position_import_condition__file_import);
			area_names.reject(_position_import_condition__file_import);
			structure_names.reject(_position_import_condition__file_import);
			tile_names.reject(_position_import_condition__file_import);
			hero_stat.reject(_position_import_condition__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_condition__file_import);
			association_names.accept(_position_import_condition__file_import);
			room_names.accept(_position_import_condition__file_import);
			activity_names.accept(_position_import_condition__file_import);
			siding_names.accept(_position_import_condition__file_import);
			item_names.accept(_position_import_condition__file_import);
			aspect_names.accept(_position_import_condition__file_import);
			affinity_names.accept(_position_import_condition__file_import);
			activity_type_names.accept(_position_import_condition__file_import);
			trail_names.accept(_position_import_condition__file_import);
			attack_names.accept(_position_import_condition__file_import);
			reason_names.accept(_position_import_condition__file_import);
			trait_names.accept(_position_import_condition__file_import);
			condition_names.accept(_position_import_condition__file_import);
			payment_short_type_names.accept(_position_import_condition__file_import);
			skill_names.accept(_position_import_condition__file_import);
			map_names.accept(_position_import_condition__file_import);
			event_names.accept(_position_import_condition__file_import);
			image_names.accept(_position_import_condition__file_import);
			tile_symbols.accept(_position_import_condition__file_import);
			payment_long_type_names.accept(_position_import_condition__file_import);
			area_names.accept(_position_import_condition__file_import);
			structure_names.accept(_position_import_condition__file_import);
			tile_names.accept(_position_import_condition__file_import);
			hero_stat.accept(_position_import_condition__file_import);
		}
	}
	public void parse_import_skill() {
		int _position_import_skill = -1;
		Token.Parsed _token_import_skill = null;
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
		_position_import_skill=_position;
		_token_import_skill=_token;
		_token=new Tokens.Rule.ImportSkillToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_skill(import_skill)");
				_furthestPosition=_position;
			}
			_position=_position_import_skill;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_skill(import_skill)");
					_furthestPosition=_position;
				}
				_position=_position_import_skill;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='s') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='k') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='l') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_46.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .skls");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_skill(import_skill)");
						_furthestPosition=_position;
					}
					_position=_position_import_skill;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_skill(import_skill)");
							_furthestPosition=_position;
						}
						_position=_position_import_skill;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("entities/behaviours/skills/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".skls");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportSkillFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_skill;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_skill.add(_position_import_skill,_token);
		}
		_token=_token_import_skill;
		if(_state==FAILED) {
			support_names.reject(_position_import_skill);
			association_names.reject(_position_import_skill);
			room_names.reject(_position_import_skill);
			activity_names.reject(_position_import_skill);
			siding_names.reject(_position_import_skill);
			item_names.reject(_position_import_skill);
			aspect_names.reject(_position_import_skill);
			affinity_names.reject(_position_import_skill);
			activity_type_names.reject(_position_import_skill);
			trail_names.reject(_position_import_skill);
			attack_names.reject(_position_import_skill);
			reason_names.reject(_position_import_skill);
			trait_names.reject(_position_import_skill);
			condition_names.reject(_position_import_skill);
			payment_short_type_names.reject(_position_import_skill);
			skill_names.reject(_position_import_skill);
			map_names.reject(_position_import_skill);
			event_names.reject(_position_import_skill);
			image_names.reject(_position_import_skill);
			tile_symbols.reject(_position_import_skill);
			payment_long_type_names.reject(_position_import_skill);
			area_names.reject(_position_import_skill);
			structure_names.reject(_position_import_skill);
			tile_names.reject(_position_import_skill);
			hero_stat.reject(_position_import_skill);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_skill);
			association_names.accept(_position_import_skill);
			room_names.accept(_position_import_skill);
			activity_names.accept(_position_import_skill);
			siding_names.accept(_position_import_skill);
			item_names.accept(_position_import_skill);
			aspect_names.accept(_position_import_skill);
			affinity_names.accept(_position_import_skill);
			activity_type_names.accept(_position_import_skill);
			trail_names.accept(_position_import_skill);
			attack_names.accept(_position_import_skill);
			reason_names.accept(_position_import_skill);
			trait_names.accept(_position_import_skill);
			condition_names.accept(_position_import_skill);
			payment_short_type_names.accept(_position_import_skill);
			skill_names.accept(_position_import_skill);
			map_names.accept(_position_import_skill);
			event_names.accept(_position_import_skill);
			image_names.accept(_position_import_skill);
			tile_symbols.accept(_position_import_skill);
			payment_long_type_names.accept(_position_import_skill);
			area_names.accept(_position_import_skill);
			structure_names.accept(_position_import_skill);
			tile_names.accept(_position_import_skill);
			hero_stat.accept(_position_import_skill);
		}
	}
	public void parse_import_map() {
		int _position_import_map = -1;
		Token.Parsed _token_import_map = null;
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
		_position_import_map=_position;
		_token_import_map=_token;
		_token=new Tokens.Rule.ImportMapToken();
		if(_position+1-1 >=_inputLength) {
			_state=FAILED;
		}
		else {
			if(_inputArray[_position+0]!='>') {
				_state=FAILED;
			}
		}
		if(_state==SUCCESS) {
			_token.add(_position,Tokens.Syntax.syntax_2.SYNTAX);
			_position=_position+1;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
		}
		else if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain >");
				_furthestPosition=_position;
			}
		}
		if(_state==FAILED) {
			if(_position>=_furthestPosition) {
				_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_map(import_map)");
				_furthestPosition=_position;
			}
			_position=_position_import_map;
		}
		else {
			parse_FILE_NAME();
			if(_state==SUCCESS) {
				_import_FILE_NAME_value=_token.getLastValue();
			}
			if(_state==FAILED) {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_map(import_map)");
					_furthestPosition=_position;
				}
				_position=_position_import_map;
			}
			else {
				if(_position+5-1 >=_inputLength) {
					_state=FAILED;
				}
				else {
					if(_inputArray[_position+0]!='.') {
						_state=FAILED;
					}
					if(_inputArray[_position+1]!='m') {
						_state=FAILED;
					}
					if(_inputArray[_position+2]!='a') {
						_state=FAILED;
					}
					if(_inputArray[_position+3]!='p') {
						_state=FAILED;
					}
					if(_inputArray[_position+4]!='s') {
						_state=FAILED;
					}
				}
				if(_state==SUCCESS) {
					_token.add(_position,Tokens.Syntax.syntax_66.SYNTAX);
					_position=_position+5;
					while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
						++_position;
					}
				}
				else if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"unexpected plain .maps");
						_furthestPosition=_position;
					}
				}
				if(_state==FAILED) {
					if(_position>=_furthestPosition) {
						_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_map(import_map)");
						_furthestPosition=_position;
					}
					_position=_position_import_map;
				}
				else {
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
							_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,"import_map(import_map)");
							_furthestPosition=_position;
						}
						_position=_position_import_map;
					}
					else {
					}
				}
			}
		}
		if(_state==SUCCESS) {
			StringBuilder _fileNameBuilder = new StringBuilder();
			_fileNameBuilder.append("environments/maps/");
			_fileNameBuilder.append(_import_FILE_NAME_value);
			_fileNameBuilder.append(".maps");
			String _import_file_name = _directoryName+_fileNameBuilder.toString();
			if(new File(_import_file_name).exists()) {
				if(Parser.contexts.containsKey(_import_file_name)==false) {
					Parser.Context _import_context = new Parser.Context.ImportMapFileImport(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
					Parser.contexts.put(_import_file_name,_import_context);
				}
				Parser.contexts.get(_import_file_name).set_root(new Token.Parsed(Token.Id.ROOT));
				Parser.contexts.get(_import_file_name).set_token(Parser.contexts.get(_import_file_name).get_root());
				_token.add(_position,new Token.Parsed.Import(_import_file_name));
				addImportThread(_import_file_name);
			}
			else {
				if(_position>=_furthestPosition) {
					_result=new Parser.Result.Fail(FAILED,_position,_lineNumberRanges,_input,_fileName,_directoryName+_fileNameBuilder.toString()+" cannot be found!");
					_furthestPosition=_position;
				}
				_position=_position_import_map;
				_state=FAILED;
				System.err.println("Could not find file:"+_directoryName+_fileNameBuilder.toString());
			}
		}
		if(_state==SUCCESS) {
			_token_import_map.add(_position_import_map,_token);
		}
		_token=_token_import_map;
		if(_state==FAILED) {
			support_names.reject(_position_import_map);
			association_names.reject(_position_import_map);
			room_names.reject(_position_import_map);
			activity_names.reject(_position_import_map);
			siding_names.reject(_position_import_map);
			item_names.reject(_position_import_map);
			aspect_names.reject(_position_import_map);
			affinity_names.reject(_position_import_map);
			activity_type_names.reject(_position_import_map);
			trail_names.reject(_position_import_map);
			attack_names.reject(_position_import_map);
			reason_names.reject(_position_import_map);
			trait_names.reject(_position_import_map);
			condition_names.reject(_position_import_map);
			payment_short_type_names.reject(_position_import_map);
			skill_names.reject(_position_import_map);
			map_names.reject(_position_import_map);
			event_names.reject(_position_import_map);
			image_names.reject(_position_import_map);
			tile_symbols.reject(_position_import_map);
			payment_long_type_names.reject(_position_import_map);
			area_names.reject(_position_import_map);
			structure_names.reject(_position_import_map);
			tile_names.reject(_position_import_map);
			hero_stat.reject(_position_import_map);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_map);
			association_names.accept(_position_import_map);
			room_names.accept(_position_import_map);
			activity_names.accept(_position_import_map);
			siding_names.accept(_position_import_map);
			item_names.accept(_position_import_map);
			aspect_names.accept(_position_import_map);
			affinity_names.accept(_position_import_map);
			activity_type_names.accept(_position_import_map);
			trail_names.accept(_position_import_map);
			attack_names.accept(_position_import_map);
			reason_names.accept(_position_import_map);
			trait_names.accept(_position_import_map);
			condition_names.accept(_position_import_map);
			payment_short_type_names.accept(_position_import_map);
			skill_names.accept(_position_import_map);
			map_names.accept(_position_import_map);
			event_names.accept(_position_import_map);
			image_names.accept(_position_import_map);
			tile_symbols.accept(_position_import_map);
			payment_long_type_names.accept(_position_import_map);
			area_names.accept(_position_import_map);
			structure_names.accept(_position_import_map);
			tile_names.accept(_position_import_map);
			hero_stat.accept(_position_import_map);
		}
	}
	public void parse_import_skill__file_import() {
		int _position_import_skill__file_import = -1;
		Token.Parsed _token_import_skill__file_import = null;
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
		_position_import_skill__file_import=_position;
		_token_import_skill__file_import=_token;
		_token=new Tokens.Rule.ImportSkillFileImportToken();
		int _state_63 = _state;
		while(_position<_inputLength) {
			parse__anonymous_51();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_63==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_skill__file_import.addAll(_token);
			_token_import_skill__file_import.setValue(_token.getValue());
		}
		_token=_token_import_skill__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_skill__file_import);
			association_names.reject(_position_import_skill__file_import);
			room_names.reject(_position_import_skill__file_import);
			activity_names.reject(_position_import_skill__file_import);
			siding_names.reject(_position_import_skill__file_import);
			item_names.reject(_position_import_skill__file_import);
			aspect_names.reject(_position_import_skill__file_import);
			affinity_names.reject(_position_import_skill__file_import);
			activity_type_names.reject(_position_import_skill__file_import);
			trail_names.reject(_position_import_skill__file_import);
			attack_names.reject(_position_import_skill__file_import);
			reason_names.reject(_position_import_skill__file_import);
			trait_names.reject(_position_import_skill__file_import);
			condition_names.reject(_position_import_skill__file_import);
			payment_short_type_names.reject(_position_import_skill__file_import);
			skill_names.reject(_position_import_skill__file_import);
			map_names.reject(_position_import_skill__file_import);
			event_names.reject(_position_import_skill__file_import);
			image_names.reject(_position_import_skill__file_import);
			tile_symbols.reject(_position_import_skill__file_import);
			payment_long_type_names.reject(_position_import_skill__file_import);
			area_names.reject(_position_import_skill__file_import);
			structure_names.reject(_position_import_skill__file_import);
			tile_names.reject(_position_import_skill__file_import);
			hero_stat.reject(_position_import_skill__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_skill__file_import);
			association_names.accept(_position_import_skill__file_import);
			room_names.accept(_position_import_skill__file_import);
			activity_names.accept(_position_import_skill__file_import);
			siding_names.accept(_position_import_skill__file_import);
			item_names.accept(_position_import_skill__file_import);
			aspect_names.accept(_position_import_skill__file_import);
			affinity_names.accept(_position_import_skill__file_import);
			activity_type_names.accept(_position_import_skill__file_import);
			trail_names.accept(_position_import_skill__file_import);
			attack_names.accept(_position_import_skill__file_import);
			reason_names.accept(_position_import_skill__file_import);
			trait_names.accept(_position_import_skill__file_import);
			condition_names.accept(_position_import_skill__file_import);
			payment_short_type_names.accept(_position_import_skill__file_import);
			skill_names.accept(_position_import_skill__file_import);
			map_names.accept(_position_import_skill__file_import);
			event_names.accept(_position_import_skill__file_import);
			image_names.accept(_position_import_skill__file_import);
			tile_symbols.accept(_position_import_skill__file_import);
			payment_long_type_names.accept(_position_import_skill__file_import);
			area_names.accept(_position_import_skill__file_import);
			structure_names.accept(_position_import_skill__file_import);
			tile_names.accept(_position_import_skill__file_import);
			hero_stat.accept(_position_import_skill__file_import);
		}
	}
	public void parse_import_association__file_import() {
		int _position_import_association__file_import = -1;
		Token.Parsed _token_import_association__file_import = null;
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
		_position_import_association__file_import=_position;
		_token_import_association__file_import=_token;
		_token=new Tokens.Rule.ImportAssociationFileImportToken();
		int _state_69 = _state;
		while(_position<_inputLength) {
			parse__anonymous_57();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_69==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_association__file_import.addAll(_token);
			_token_import_association__file_import.setValue(_token.getValue());
		}
		_token=_token_import_association__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_association__file_import);
			association_names.reject(_position_import_association__file_import);
			room_names.reject(_position_import_association__file_import);
			activity_names.reject(_position_import_association__file_import);
			siding_names.reject(_position_import_association__file_import);
			item_names.reject(_position_import_association__file_import);
			aspect_names.reject(_position_import_association__file_import);
			affinity_names.reject(_position_import_association__file_import);
			activity_type_names.reject(_position_import_association__file_import);
			trail_names.reject(_position_import_association__file_import);
			attack_names.reject(_position_import_association__file_import);
			reason_names.reject(_position_import_association__file_import);
			trait_names.reject(_position_import_association__file_import);
			condition_names.reject(_position_import_association__file_import);
			payment_short_type_names.reject(_position_import_association__file_import);
			skill_names.reject(_position_import_association__file_import);
			map_names.reject(_position_import_association__file_import);
			event_names.reject(_position_import_association__file_import);
			image_names.reject(_position_import_association__file_import);
			tile_symbols.reject(_position_import_association__file_import);
			payment_long_type_names.reject(_position_import_association__file_import);
			area_names.reject(_position_import_association__file_import);
			structure_names.reject(_position_import_association__file_import);
			tile_names.reject(_position_import_association__file_import);
			hero_stat.reject(_position_import_association__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_association__file_import);
			association_names.accept(_position_import_association__file_import);
			room_names.accept(_position_import_association__file_import);
			activity_names.accept(_position_import_association__file_import);
			siding_names.accept(_position_import_association__file_import);
			item_names.accept(_position_import_association__file_import);
			aspect_names.accept(_position_import_association__file_import);
			affinity_names.accept(_position_import_association__file_import);
			activity_type_names.accept(_position_import_association__file_import);
			trail_names.accept(_position_import_association__file_import);
			attack_names.accept(_position_import_association__file_import);
			reason_names.accept(_position_import_association__file_import);
			trait_names.accept(_position_import_association__file_import);
			condition_names.accept(_position_import_association__file_import);
			payment_short_type_names.accept(_position_import_association__file_import);
			skill_names.accept(_position_import_association__file_import);
			map_names.accept(_position_import_association__file_import);
			event_names.accept(_position_import_association__file_import);
			image_names.accept(_position_import_association__file_import);
			tile_symbols.accept(_position_import_association__file_import);
			payment_long_type_names.accept(_position_import_association__file_import);
			area_names.accept(_position_import_association__file_import);
			structure_names.accept(_position_import_association__file_import);
			tile_names.accept(_position_import_association__file_import);
			hero_stat.accept(_position_import_association__file_import);
		}
	}
	public void parse_import_quest__file_import() {
		int _position_import_quest__file_import = -1;
		Token.Parsed _token_import_quest__file_import = null;
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
		_position_import_quest__file_import=_position;
		_token_import_quest__file_import=_token;
		_token=new Tokens.Rule.ImportQuestFileImportToken();
		int _state_48 = _state;
		while(_position<_inputLength) {
			parse__anonymous_32();
			if(_state==FAILED) {
				break;
			}
		}
		if(_state_48==SUCCESS&&_state==FAILED) {
			_state=SUCCESS;
		}
		if(_state==FAILED) {
		}
		else {
		}
		if(_state==SUCCESS) {
			_token_import_quest__file_import.addAll(_token);
			_token_import_quest__file_import.setValue(_token.getValue());
		}
		_token=_token_import_quest__file_import;
		if(_state==FAILED) {
			support_names.reject(_position_import_quest__file_import);
			association_names.reject(_position_import_quest__file_import);
			room_names.reject(_position_import_quest__file_import);
			activity_names.reject(_position_import_quest__file_import);
			siding_names.reject(_position_import_quest__file_import);
			item_names.reject(_position_import_quest__file_import);
			aspect_names.reject(_position_import_quest__file_import);
			affinity_names.reject(_position_import_quest__file_import);
			activity_type_names.reject(_position_import_quest__file_import);
			trail_names.reject(_position_import_quest__file_import);
			attack_names.reject(_position_import_quest__file_import);
			reason_names.reject(_position_import_quest__file_import);
			trait_names.reject(_position_import_quest__file_import);
			condition_names.reject(_position_import_quest__file_import);
			payment_short_type_names.reject(_position_import_quest__file_import);
			skill_names.reject(_position_import_quest__file_import);
			map_names.reject(_position_import_quest__file_import);
			event_names.reject(_position_import_quest__file_import);
			image_names.reject(_position_import_quest__file_import);
			tile_symbols.reject(_position_import_quest__file_import);
			payment_long_type_names.reject(_position_import_quest__file_import);
			area_names.reject(_position_import_quest__file_import);
			structure_names.reject(_position_import_quest__file_import);
			tile_names.reject(_position_import_quest__file_import);
			hero_stat.reject(_position_import_quest__file_import);
		}
		else if(_state==SUCCESS) {
			support_names.accept(_position_import_quest__file_import);
			association_names.accept(_position_import_quest__file_import);
			room_names.accept(_position_import_quest__file_import);
			activity_names.accept(_position_import_quest__file_import);
			siding_names.accept(_position_import_quest__file_import);
			item_names.accept(_position_import_quest__file_import);
			aspect_names.accept(_position_import_quest__file_import);
			affinity_names.accept(_position_import_quest__file_import);
			activity_type_names.accept(_position_import_quest__file_import);
			trail_names.accept(_position_import_quest__file_import);
			attack_names.accept(_position_import_quest__file_import);
			reason_names.accept(_position_import_quest__file_import);
			trait_names.accept(_position_import_quest__file_import);
			condition_names.accept(_position_import_quest__file_import);
			payment_short_type_names.accept(_position_import_quest__file_import);
			skill_names.accept(_position_import_quest__file_import);
			map_names.accept(_position_import_quest__file_import);
			event_names.accept(_position_import_quest__file_import);
			image_names.accept(_position_import_quest__file_import);
			tile_symbols.accept(_position_import_quest__file_import);
			payment_long_type_names.accept(_position_import_quest__file_import);
			area_names.accept(_position_import_quest__file_import);
			structure_names.accept(_position_import_quest__file_import);
			tile_names.accept(_position_import_quest__file_import);
			hero_stat.accept(_position_import_quest__file_import);
		}
	}
}