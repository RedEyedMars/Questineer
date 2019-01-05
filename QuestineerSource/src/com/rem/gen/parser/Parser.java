package com.rem.gen.parser;
import java.util.*;
import java.io.*;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.rem.gen.contexts.FinalContext;
import java.io.BufferedReader;
import java.io.FileReader;
import com.rem.gen.parser.Token;
import com.rem.lang.helpers.input.PrintMethodType;
import com.rem.gen.parser.Parser;

public class Parser implements com.rem.lang.helpers.ParseControlPort.Parser<Parser.Result,Parser.Result.Pass, Token, Token.Id>{
	public static Integer SUCCESS = 0;
	public static Integer FAILED = 1;
	public static Integer FIRST_PASS = 0;
	public static Integer SECOND_PASS = 1;
	public static Set<String> fileNames = new HashSet<String>();
	public static Map<String,Parser.Context> contexts = new HashMap<String,Parser.Context>();
	protected Parser.NameList aspect_names_root = new Parser.NameList(null);
	protected Parser.NameList item_names_root = new Parser.NameList(null);
	protected Parser.NameList affinity_names_root = new Parser.NameList(null);
	protected Parser.NameList condition_names_root = new Parser.NameList(null);
	protected Parser.NameList trait_names_root = new Parser.NameList(null);
	protected Parser.NameList activity_type_names_root = new Parser.NameList(null);
	protected Parser.NameList activity_names_root = new Parser.NameList(null);
	protected Parser.NameList attack_names_root = new Parser.NameList(null);
	protected Parser.NameList support_names_root = new Parser.NameList(null);
	protected Parser.NameList skill_names_root = new Parser.NameList(null);
	protected Parser.NameList association_names_root = new Parser.NameList(null);
	protected Parser.NameList reason_names_root = new Parser.NameList(null);
	protected Parser.NameList hero_stat_root = new Parser.NameList(null);
	protected Parser.NameList room_names_root = new Parser.NameList(null);
	protected Parser.NameList trail_names_root = new Parser.NameList(null);
	protected Parser.NameList structure_names_root = new Parser.NameList(null);
	protected Parser.NameList map_names_root = new Parser.NameList(null);
	protected Parser.NameList area_names_root = new Parser.NameList(null);
	protected Parser.NameList siding_names_root = new Parser.NameList(null);
	protected Parser.NameList tile_names_root = new Parser.NameList(null);
	protected Parser.NameList tile_symbols_root = new Parser.NameList(null);
	protected Parser.NameList payment_long_type_names_root = new Parser.NameList(null);
	protected Parser.NameList payment_short_type_names_root = new Parser.NameList(null);
	protected Parser.NameList event_names_root = new Parser.NameList(null);
	protected Parser.NameList image_names_root = new Parser.NameList(null);
	public Parser() {
	}
	public void setSUCCESS(Integer newSUCCESS) {
		SUCCESS = newSUCCESS;
	}
	public void setFAILED(Integer newFAILED) {
		FAILED = newFAILED;
	}
	public void setFIRSTPASS(Integer newFIRSTPASS) {
		FIRST_PASS = newFIRSTPASS;
	}
	public void setSECONDPASS(Integer newSECONDPASS) {
		SECOND_PASS = newSECONDPASS;
	}
	public void setFileNames(Set<String> newFileNames) {
		fileNames = newFileNames;
	}
	public void setContexts(Map<String,Parser.Context> newContexts) {
		contexts = newContexts;
	}
	public Parser.Result parse(String fileName) {
		long startParseTime = System.currentTimeMillis();
		Parser.Result firstResult = parseFile(fileName,FIRST_PASS);
		if(firstResult.getState()==SUCCESS) {
			System.out.println("First-Pass Successful");
			fileNames.clear();
			Parser.Result secondResult = parseFile(fileName,SECOND_PASS);
			if(secondResult.getState()==SUCCESS) {
				System.out.println("Second-Pass Successful");
			}
			else {
				System.out.println("Second-Pass Failed");
			}
			secondResult.setParseTime(System.currentTimeMillis()-startParseTime);
			return secondResult;
		}
		else {
			System.out.println("First-Pass Failed");
			firstResult.setParseTime(System.currentTimeMillis()-startParseTime);
			return firstResult;
		}
	}
	public Parser.Result parseFile(String fileName,int _pass) {
		hero_stat_root.add("STR");
		hero_stat_root.add("DEX");
		hero_stat_root.add("CON");
		hero_stat_root.add("KNW");
		hero_stat_root.add("MND");
		hero_stat_root.add("CRM");
		tile_names_root.add("None");
		if(_pass==FIRST_PASS) {
			Parser.Context context = new FinalContext(aspect_names_root,item_names_root,affinity_names_root,condition_names_root,trait_names_root,activity_type_names_root,activity_names_root,attack_names_root,support_names_root,skill_names_root,association_names_root,reason_names_root,hero_stat_root,room_names_root,trail_names_root,structure_names_root,map_names_root,area_names_root,siding_names_root,tile_names_root,tile_symbols_root,payment_long_type_names_root,payment_short_type_names_root,event_names_root,image_names_root);
			contexts.put(fileName,context);
			return context.parse(fileName,FIRST_PASS);
		}
		else {
			contexts.get(fileName)._root=new Token.Parsed(Token.Id.ROOT);
			contexts.get(fileName)._token=contexts.get(fileName)._root;
			return contexts.get(fileName).parse(fileName,SECOND_PASS);
		}
	}
	public static String readLine(String input,int position) {
		int indexOfLine = input.indexOf('\n',position);
		if(indexOfLine==-1 ) {
			return input.substring(position);
		}
		else {
			return input.substring(position,indexOfLine);
		}
	}
	public Parser.Result.Pass asPass(Parser.Result result) {
		return (result instanceof Parser.Result.Pass)?((Parser.Result.Pass)result):null;
	}
	public Parser.NameList getAspectNamesRoot() {
		return aspect_names_root;
	}
	public void setAspectNamesRoot(Parser.NameList newAspectNamesRoot) {
		aspect_names_root = newAspectNamesRoot;
	}
	public Parser.NameList getItemNamesRoot() {
		return item_names_root;
	}
	public void setItemNamesRoot(Parser.NameList newItemNamesRoot) {
		item_names_root = newItemNamesRoot;
	}
	public Parser.NameList getAffinityNamesRoot() {
		return affinity_names_root;
	}
	public void setAffinityNamesRoot(Parser.NameList newAffinityNamesRoot) {
		affinity_names_root = newAffinityNamesRoot;
	}
	public Parser.NameList getConditionNamesRoot() {
		return condition_names_root;
	}
	public void setConditionNamesRoot(Parser.NameList newConditionNamesRoot) {
		condition_names_root = newConditionNamesRoot;
	}
	public Parser.NameList getTraitNamesRoot() {
		return trait_names_root;
	}
	public void setTraitNamesRoot(Parser.NameList newTraitNamesRoot) {
		trait_names_root = newTraitNamesRoot;
	}
	public Parser.NameList getActivityTypeNamesRoot() {
		return activity_type_names_root;
	}
	public void setActivityTypeNamesRoot(Parser.NameList newActivityTypeNamesRoot) {
		activity_type_names_root = newActivityTypeNamesRoot;
	}
	public Parser.NameList getActivityNamesRoot() {
		return activity_names_root;
	}
	public void setActivityNamesRoot(Parser.NameList newActivityNamesRoot) {
		activity_names_root = newActivityNamesRoot;
	}
	public Parser.NameList getAttackNamesRoot() {
		return attack_names_root;
	}
	public void setAttackNamesRoot(Parser.NameList newAttackNamesRoot) {
		attack_names_root = newAttackNamesRoot;
	}
	public Parser.NameList getSupportNamesRoot() {
		return support_names_root;
	}
	public void setSupportNamesRoot(Parser.NameList newSupportNamesRoot) {
		support_names_root = newSupportNamesRoot;
	}
	public Parser.NameList getSkillNamesRoot() {
		return skill_names_root;
	}
	public void setSkillNamesRoot(Parser.NameList newSkillNamesRoot) {
		skill_names_root = newSkillNamesRoot;
	}
	public Parser.NameList getAssociationNamesRoot() {
		return association_names_root;
	}
	public void setAssociationNamesRoot(Parser.NameList newAssociationNamesRoot) {
		association_names_root = newAssociationNamesRoot;
	}
	public Parser.NameList getReasonNamesRoot() {
		return reason_names_root;
	}
	public void setReasonNamesRoot(Parser.NameList newReasonNamesRoot) {
		reason_names_root = newReasonNamesRoot;
	}
	public Parser.NameList getHeroStatRoot() {
		return hero_stat_root;
	}
	public void setHeroStatRoot(Parser.NameList newHeroStatRoot) {
		hero_stat_root = newHeroStatRoot;
	}
	public Parser.NameList getRoomNamesRoot() {
		return room_names_root;
	}
	public void setRoomNamesRoot(Parser.NameList newRoomNamesRoot) {
		room_names_root = newRoomNamesRoot;
	}
	public Parser.NameList getTrailNamesRoot() {
		return trail_names_root;
	}
	public void setTrailNamesRoot(Parser.NameList newTrailNamesRoot) {
		trail_names_root = newTrailNamesRoot;
	}
	public Parser.NameList getStructureNamesRoot() {
		return structure_names_root;
	}
	public void setStructureNamesRoot(Parser.NameList newStructureNamesRoot) {
		structure_names_root = newStructureNamesRoot;
	}
	public Parser.NameList getMapNamesRoot() {
		return map_names_root;
	}
	public void setMapNamesRoot(Parser.NameList newMapNamesRoot) {
		map_names_root = newMapNamesRoot;
	}
	public Parser.NameList getAreaNamesRoot() {
		return area_names_root;
	}
	public void setAreaNamesRoot(Parser.NameList newAreaNamesRoot) {
		area_names_root = newAreaNamesRoot;
	}
	public Parser.NameList getSidingNamesRoot() {
		return siding_names_root;
	}
	public void setSidingNamesRoot(Parser.NameList newSidingNamesRoot) {
		siding_names_root = newSidingNamesRoot;
	}
	public Parser.NameList getTileNamesRoot() {
		return tile_names_root;
	}
	public void setTileNamesRoot(Parser.NameList newTileNamesRoot) {
		tile_names_root = newTileNamesRoot;
	}
	public Parser.NameList getTileSymbolsRoot() {
		return tile_symbols_root;
	}
	public void setTileSymbolsRoot(Parser.NameList newTileSymbolsRoot) {
		tile_symbols_root = newTileSymbolsRoot;
	}
	public Parser.NameList getPaymentLongTypeNamesRoot() {
		return payment_long_type_names_root;
	}
	public void setPaymentLongTypeNamesRoot(Parser.NameList newPaymentLongTypeNamesRoot) {
		payment_long_type_names_root = newPaymentLongTypeNamesRoot;
	}
	public Parser.NameList getPaymentShortTypeNamesRoot() {
		return payment_short_type_names_root;
	}
	public void setPaymentShortTypeNamesRoot(Parser.NameList newPaymentShortTypeNamesRoot) {
		payment_short_type_names_root = newPaymentShortTypeNamesRoot;
	}
	public Parser.NameList getEventNamesRoot() {
		return event_names_root;
	}
	public void setEventNamesRoot(Parser.NameList newEventNamesRoot) {
		event_names_root = newEventNamesRoot;
	}
	public Parser.NameList getImageNamesRoot() {
		return image_names_root;
	}
	public void setImageNamesRoot(Parser.NameList newImageNamesRoot) {
		image_names_root = newImageNamesRoot;
	}
	public static abstract class Context{
		protected Integer SUCCESS = Parser.SUCCESS;
		protected Integer FAILED = Parser.FAILED;
		protected Integer FIRST_PASS = Parser.FIRST_PASS;
		protected Integer SECOND_PASS = Parser.SECOND_PASS;
		protected int _pass = FIRST_PASS;
		protected int _position = 0;
		protected int _inputLength = -1;
		protected int _state = SUCCESS;
		protected int _furthestPosition = -1;
		protected int _lineNumber = 1;
		protected String _input = null;
		protected String _directoryName = null;
		protected String _fileName = null;
		protected char[] _inputArray = null;
		protected Parser.Result _result = null;
		protected Parser.Result.Acceptor _result_acceptor = new Parser.Result.Acceptor();
		protected Boolean _succeedOnEnd = true;
		protected String _list_name_result = null;
		protected List<Integer> _lineNumberRanges = new ArrayList<Integer>();
		protected Token.Parsed _root = new Token.Parsed(Token.Id.ROOT);
		protected Token.Parsed _token = _root;
		protected Set<ImportThread> _import_threads = new HashSet<ImportThread>();
		protected Map<Integer,Integer> brace_0 = new HashMap<Integer,Integer>();
		protected Parser.NameList aspect_names_root = null;
		protected Parser.NameList aspect_names = null;
		protected Map<Integer,String> _preparsed_NAME = new HashMap<Integer,String>();
		protected Parser.NameList item_names_root = null;
		protected Parser.NameList item_names = null;
		protected Parser.NameList affinity_names_root = null;
		protected Parser.NameList affinity_names = null;
		protected Parser.NameList condition_names_root = null;
		protected Parser.NameList condition_names = null;
		protected Parser.NameList trait_names_root = null;
		protected Parser.NameList trait_names = null;
		protected Parser.NameList activity_type_names_root = null;
		protected Parser.NameList activity_type_names = null;
		protected Parser.NameList activity_names_root = null;
		protected Parser.NameList activity_names = null;
		protected Parser.NameList attack_names_root = null;
		protected Parser.NameList attack_names = null;
		protected Parser.NameList support_names_root = null;
		protected Parser.NameList support_names = null;
		protected Parser.NameList skill_names_root = null;
		protected Parser.NameList skill_names = null;
		protected Parser.NameList association_names_root = null;
		protected Parser.NameList association_names = null;
		protected Parser.NameList reason_names_root = null;
		protected Parser.NameList reason_names = null;
		protected Parser.NameList hero_stat_root = null;
		protected Parser.NameList hero_stat = null;
		protected Parser.NameList room_names_root = null;
		protected Parser.NameList room_names = null;
		protected Parser.NameList trail_names_root = null;
		protected Parser.NameList trail_names = null;
		protected Parser.NameList structure_names_root = null;
		protected Parser.NameList structure_names = null;
		protected Parser.NameList map_names_root = null;
		protected Parser.NameList map_names = null;
		protected Parser.NameList area_names_root = null;
		protected Parser.NameList area_names = null;
		protected Parser.NameList siding_names_root = null;
		protected Parser.NameList siding_names = null;
		protected Parser.NameList tile_names_root = null;
		protected Parser.NameList tile_names = null;
		protected Parser.NameList tile_symbols_root = null;
		protected Parser.NameList tile_symbols = null;
		protected Parser.NameList payment_long_type_names_root = null;
		protected Parser.NameList payment_long_type_names = null;
		protected Parser.NameList payment_short_type_names_root = null;
		protected Parser.NameList payment_short_type_names = null;
		protected Parser.NameList event_names_root = null;
		protected Parser.NameList event_names = null;
		protected Parser.NameList image_names_root = null;
		protected Parser.NameList image_names = null;
		protected Set<Integer> _recursion_protection_import_item_0 = new HashSet<Integer>();
		protected Map<Integer,Integer> brace_1 = new HashMap<Integer,Integer>();
		protected Map<Integer,Integer> brace_2 = new HashMap<Integer,Integer>();
		protected String _import_FILE_NAME_value = null;
		protected Set<Integer> _recursion_protection_comments_1 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_2 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_3 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_import_any_4 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_5 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_6 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_7 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_8 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_9 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_10 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_11 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_12 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_13 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_14 = new HashSet<Integer>();
		protected Map<Integer,Integer> brace_3 = new HashMap<Integer,Integer>();
		protected Set<Integer> _recursion_protection_NAME_15 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_16 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_17 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_18 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_19 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_20 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_21 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_22 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_23 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_24 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_25 = new HashSet<Integer>();
		protected Map<Integer,Integer> brace_4 = new HashMap<Integer,Integer>();
		protected Set<Integer> _recursion_protection_comments_26 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_27 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_28 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_29 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_30 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_31 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_32 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_33 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_34 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_35 = new HashSet<Integer>();
		protected Map<Integer,Integer> brace_5 = new HashMap<Integer,Integer>();
		protected Set<Integer> _recursion_protection_statement_36 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_37 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_38 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_39 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_40 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_animation_type_declaration_41 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_INTEGER_42 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_FLOAT_43 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_44 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_45 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_46 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_47 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_48 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_49 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_INTEGER_50 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_51 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_52 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_53 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_comments_54 = new HashSet<Integer>();
		protected Set<Integer> _recursion_protection_NAME_55 = new HashSet<Integer>();
		protected int _readInput_1 = 0;
		public Context(final Parser.NameList aspect_names_root, final Parser.NameList item_names_root, final Parser.NameList affinity_names_root, final Parser.NameList condition_names_root, final Parser.NameList trait_names_root, final Parser.NameList activity_type_names_root, final Parser.NameList activity_names_root, final Parser.NameList attack_names_root, final Parser.NameList support_names_root, final Parser.NameList skill_names_root, final Parser.NameList association_names_root, final Parser.NameList reason_names_root, final Parser.NameList hero_stat_root, final Parser.NameList room_names_root, final Parser.NameList trail_names_root, final Parser.NameList structure_names_root, final Parser.NameList map_names_root, final Parser.NameList area_names_root, final Parser.NameList siding_names_root, final Parser.NameList tile_names_root, final Parser.NameList tile_symbols_root, final Parser.NameList payment_long_type_names_root, final Parser.NameList payment_short_type_names_root, final Parser.NameList event_names_root, final Parser.NameList image_names_root) {
			if(aspect_names_root != null){
				this.aspect_names_root = aspect_names_root;
			}
			if(item_names_root != null){
				this.item_names_root = item_names_root;
			}
			if(affinity_names_root != null){
				this.affinity_names_root = affinity_names_root;
			}
			if(condition_names_root != null){
				this.condition_names_root = condition_names_root;
			}
			if(trait_names_root != null){
				this.trait_names_root = trait_names_root;
			}
			if(activity_type_names_root != null){
				this.activity_type_names_root = activity_type_names_root;
			}
			if(activity_names_root != null){
				this.activity_names_root = activity_names_root;
			}
			if(attack_names_root != null){
				this.attack_names_root = attack_names_root;
			}
			if(support_names_root != null){
				this.support_names_root = support_names_root;
			}
			if(skill_names_root != null){
				this.skill_names_root = skill_names_root;
			}
			if(association_names_root != null){
				this.association_names_root = association_names_root;
			}
			if(reason_names_root != null){
				this.reason_names_root = reason_names_root;
			}
			if(hero_stat_root != null){
				this.hero_stat_root = hero_stat_root;
			}
			if(room_names_root != null){
				this.room_names_root = room_names_root;
			}
			if(trail_names_root != null){
				this.trail_names_root = trail_names_root;
			}
			if(structure_names_root != null){
				this.structure_names_root = structure_names_root;
			}
			if(map_names_root != null){
				this.map_names_root = map_names_root;
			}
			if(area_names_root != null){
				this.area_names_root = area_names_root;
			}
			if(siding_names_root != null){
				this.siding_names_root = siding_names_root;
			}
			if(tile_names_root != null){
				this.tile_names_root = tile_names_root;
			}
			if(tile_symbols_root != null){
				this.tile_symbols_root = tile_symbols_root;
			}
			if(payment_long_type_names_root != null){
				this.payment_long_type_names_root = payment_long_type_names_root;
			}
			if(payment_short_type_names_root != null){
				this.payment_short_type_names_root = payment_short_type_names_root;
			}
			if(event_names_root != null){
				this.event_names_root = event_names_root;
			}
			if(image_names_root != null){
				this.image_names_root = image_names_root;
			}
			aspect_names=aspect_names_root.push();
			item_names=item_names_root.push();
			affinity_names=affinity_names_root.push();
			condition_names=condition_names_root.push();
			trait_names=trait_names_root.push();
			activity_type_names=activity_type_names_root.push();
			activity_names=activity_names_root.push();
			attack_names=attack_names_root.push();
			support_names=support_names_root.push();
			skill_names=skill_names_root.push();
			association_names=association_names_root.push();
			reason_names=reason_names_root.push();
			hero_stat=hero_stat_root.push();
			room_names=room_names_root.push();
			trail_names=trail_names_root.push();
			structure_names=structure_names_root.push();
			map_names=map_names_root.push();
			area_names=area_names_root.push();
			siding_names=siding_names_root.push();
			tile_names=tile_names_root.push();
			tile_symbols=tile_symbols_root.push();
			payment_long_type_names=payment_long_type_names_root.push();
			payment_short_type_names=payment_short_type_names_root.push();
			event_names=event_names_root.push();
			image_names=image_names_root.push();
		}
		public Context() {
			aspect_names=aspect_names_root.push();
			item_names=item_names_root.push();
			affinity_names=affinity_names_root.push();
			condition_names=condition_names_root.push();
			trait_names=trait_names_root.push();
			activity_type_names=activity_type_names_root.push();
			activity_names=activity_names_root.push();
			attack_names=attack_names_root.push();
			support_names=support_names_root.push();
			skill_names=skill_names_root.push();
			association_names=association_names_root.push();
			reason_names=reason_names_root.push();
			hero_stat=hero_stat_root.push();
			room_names=room_names_root.push();
			trail_names=trail_names_root.push();
			structure_names=structure_names_root.push();
			map_names=map_names_root.push();
			area_names=area_names_root.push();
			siding_names=siding_names_root.push();
			tile_names=tile_names_root.push();
			tile_symbols=tile_symbols_root.push();
			payment_long_type_names=payment_long_type_names_root.push();
			payment_short_type_names=payment_short_type_names_root.push();
			event_names=event_names_root.push();
			image_names=image_names_root.push();
		}
		public Integer getSUCCESS() {
			return SUCCESS;
		}
		public void setSUCCESS(Integer newSUCCESS) {
			SUCCESS = newSUCCESS;
		}
		public Integer getFAILED() {
			return FAILED;
		}
		public void setFAILED(Integer newFAILED) {
			FAILED = newFAILED;
		}
		public Integer getFIRSTPASS() {
			return FIRST_PASS;
		}
		public void setFIRSTPASS(Integer newFIRSTPASS) {
			FIRST_PASS = newFIRSTPASS;
		}
		public Integer getSECONDPASS() {
			return SECOND_PASS;
		}
		public void setSECONDPASS(Integer newSECONDPASS) {
			SECOND_PASS = newSECONDPASS;
		}
		public int get_pass() {
			return _pass;
		}
		public void set_pass(int new_pass) {
			_pass = new_pass;
		}
		public int get_position() {
			return _position;
		}
		public void set_position(int new_position) {
			_position = new_position;
		}
		public int get_inputLength() {
			return _inputLength;
		}
		public void set_inputLength(int new_inputLength) {
			_inputLength = new_inputLength;
		}
		public int get_state() {
			return _state;
		}
		public void set_state(int new_state) {
			_state = new_state;
		}
		public int get_furthestPosition() {
			return _furthestPosition;
		}
		public void set_furthestPosition(int new_furthestPosition) {
			_furthestPosition = new_furthestPosition;
		}
		public int get_lineNumber() {
			return _lineNumber;
		}
		public void set_lineNumber(int new_lineNumber) {
			_lineNumber = new_lineNumber;
		}
		public String get_input() {
			return _input;
		}
		public void set_input(String new_input) {
			_input = new_input;
		}
		public String get_directoryName() {
			return _directoryName;
		}
		public void set_directoryName(String new_directoryName) {
			_directoryName = new_directoryName;
		}
		public String get_fileName() {
			return _fileName;
		}
		public void set_fileName(String new_fileName) {
			_fileName = new_fileName;
		}
		public char[] get_inputArray() {
			return _inputArray;
		}
		public void set_inputArray(char[] new_inputArray) {
			_inputArray = new_inputArray;
		}
		public Parser.Result get_result() {
			return _result;
		}
		public void set_result(Parser.Result new_result) {
			_result = new_result;
		}
		public Parser.Result.Acceptor get_resultAcceptor() {
			return _result_acceptor;
		}
		public void set_resultAcceptor(Parser.Result.Acceptor new_resultAcceptor) {
			_result_acceptor = new_resultAcceptor;
		}
		public Boolean get_succeedOnEnd() {
			return _succeedOnEnd;
		}
		public void set_succeedOnEnd(Boolean new_succeedOnEnd) {
			_succeedOnEnd = new_succeedOnEnd;
		}
		public String get_listNameResult() {
			return _list_name_result;
		}
		public void set_listNameResult(String new_listNameResult) {
			_list_name_result = new_listNameResult;
		}
		public List<Integer> get_lineNumberRanges() {
			return _lineNumberRanges;
		}
		public void set_lineNumberRanges(List<Integer> new_lineNumberRanges) {
			_lineNumberRanges = new_lineNumberRanges;
		}
		public Token.Parsed get_root() {
			return _root;
		}
		public void set_root(Token.Parsed new_root) {
			_root = new_root;
		}
		public Token.Parsed get_token() {
			return _token;
		}
		public void set_token(Token.Parsed new_token) {
			_token = new_token;
		}
		public Set<ImportThread> get_importThreads() {
			return _import_threads;
		}
		public void set_importThreads(Set<ImportThread> new_importThreads) {
			_import_threads = new_importThreads;
		}
		public Parser.Result parse(String _fileName,int _pass_index) {
			Stack<Integer> brace_open_5 = new Stack<Integer>();
			Stack<Integer> brace_open_4 = new Stack<Integer>();
			Stack<Integer> brace_open_3 = new Stack<Integer>();
			Stack<Integer> brace_open_2 = new Stack<Integer>();
			Stack<Integer> brace_open_1 = new Stack<Integer>();
			Parser.NameList.Builder _builder_NAME = new Parser.NameList.Builder.NAME(_preparsed_NAME);
			Stack<Integer> brace_open_0 = new Stack<Integer>();
			if(fileNames.add(_fileName)==false) {
				return null;
			}
			_pass=_pass_index;
			_directoryName="./";
			int indexOfDirectorySlash = _fileName.lastIndexOf("/");
			if(indexOfDirectorySlash==-1 ) {
				indexOfDirectorySlash=_fileName.lastIndexOf("\\");
			}
			if(indexOfDirectorySlash>-1 ) {
				_directoryName=_fileName.substring(0,indexOfDirectorySlash+1);
				_fileName=_fileName.substring(indexOfDirectorySlash+1);
			}
			StringBuilder _inputBuffer = new StringBuilder();
			try {
				BufferedReader _inputReader = new BufferedReader(new FileReader(_directoryName+_fileName));
				int _readInput = _inputReader.read();
				boolean escaping = false;
				boolean quoting = false;
				while(_readInput>=0 ) {
					_builder_NAME.add(_position,(char)_readInput);
					if(_readInput!=13 ) {
						_inputBuffer.append((char)_readInput);
					}
					if(_readInput=='\n') {
						_lineNumberRanges.add(_position);
					}
					if(escaping) {
						escaping=false;
					}
					else if(!escaping&&_readInput=='\\') {
						escaping=true;
					}
					else if(!quoting&&_readInput=='\"') {
						quoting=true;
						brace_open_0.push(_position);
					}
					else if(quoting&&_readInput=='\"') {
						quoting=false;
						brace_0.put(brace_open_0.pop(),_position);
					}
					else if(!quoting&&!escaping) {
						if(_readInput=='#') {
							if(!brace_open_1.isEmpty()) {
								brace_1.put(brace_open_1.pop(),_position);
							}
						}
						if(_readInput==')') {
							if(!brace_open_5.isEmpty()) {
								brace_5.put(brace_open_5.pop(),_position);
							}
						}
						if(_readInput==']') {
							if(!brace_open_3.isEmpty()) {
								brace_3.put(brace_open_3.pop(),_position);
							}
						}
						if(_readInput=='}') {
							if(!brace_open_4.isEmpty()) {
								brace_4.put(brace_open_4.pop(),_position);
							}
						}
						if(_readInput=='~') {
							if(!brace_open_2.isEmpty()) {
								brace_2.put(brace_open_2.pop(),_position);
							}
						}
						if(_readInput=='#') {
							brace_open_1.push(_position);
						}
						if(_readInput=='(') {
							brace_open_5.push(_position);
						}
						if(_readInput=='[') {
							brace_open_3.push(_position);
						}
						if(_readInput=='{') {
							brace_open_4.push(_position);
						}
						if(_readInput=='~') {
							brace_open_2.push(_position);
						}
					}
					if(_readInput!=13 ) {
						++_position;
					}
					_readInput_1=_readInput;
					_readInput=_inputReader.read();
				}
				_lineNumberRanges.add(_position);
				_inputReader.close();
			}
			catch(IOException e0) {
			}
			_builder_NAME.end(_position);
			_input=_inputBuffer.toString();
			_inputArray=_input.toCharArray();
			_inputLength=_inputArray.length;
			this._fileName=_fileName;
			_furthestPosition=0;
			_result=null;
			_position=0;
			_state=SUCCESS;
			while(_position<_inputLength&&(false||_inputArray[_position]==' '||_inputArray[_position]=='\t')) {
				++_position;
			}
			if(_pass==Parser.SECOND_PASS) {
				support_names.extend();
				association_names.extend();
				room_names.extend();
				activity_names.extend();
				siding_names.extend();
				item_names.extend();
				aspect_names.extend();
				affinity_names.extend();
				activity_type_names.extend();
				trail_names.extend();
				attack_names.extend();
				reason_names.extend();
				trait_names.extend();
				condition_names.extend();
				payment_short_type_names.extend();
				skill_names.extend();
				map_names.extend();
				event_names.extend();
				image_names.extend();
				tile_symbols.extend();
				payment_long_type_names.extend();
				area_names.extend();
				structure_names.extend();
				tile_names.extend();
				hero_stat.extend();
			}
			_parse_root();
			if(_pass==Parser.FIRST_PASS) {
				support_names.keep();
				association_names.keep();
				room_names.keep();
				activity_names.keep();
				siding_names.keep();
				item_names.keep();
				aspect_names.keep();
				affinity_names.keep();
				activity_type_names.keep();
				trail_names.keep();
				attack_names.keep();
				reason_names.keep();
				trait_names.keep();
				condition_names.keep();
				payment_short_type_names.keep();
				skill_names.keep();
				map_names.keep();
				event_names.keep();
				image_names.keep();
				tile_symbols.keep();
				payment_long_type_names.keep();
				area_names.keep();
				structure_names.keep();
				tile_names.keep();
				hero_stat.keep();
			}
			try {
				for(ImportThread _import_thread:_import_threads) {
					_import_thread.join();
					if(_import_thread.getContext().get_state()==FAILED) {
						_state=FAILED;
					}
				}
			}
			catch(Exception e0) {
			}
			_import_threads.clear();
			if(_state==SUCCESS&&_position==_inputLength) {
				if(_succeedOnEnd) {
					Parser.Result.Pass pass = new Parser.Result.Pass(SUCCESS,_position,_lineNumberRanges,_input,_fileName,_root);
					pass.setup();
					_result=pass;
				}
				else {
					_result_acceptor.setFileName(_fileName);
					_result=_result_acceptor;
					_state=FAILED;
				}
			}
			else if(_state==SUCCESS) {
				if(_result!=null) {
					_result_acceptor.add(_result);
				}
				_result_acceptor.add(new Parser.Result.Fail.EOF(_fileName));
				_result_acceptor.setFileName(_fileName);
				_result=_result_acceptor;
				_state=FAILED;
			}
			else if(_state==FAILED) {
				_result_acceptor.add(_result);
				_result_acceptor.setFileName(_fileName);
				_result=_result_acceptor;
			}
			_result.setSupportNames(support_names);
			_result.setAssociationNames(association_names);
			_result.setRoomNames(room_names);
			_result.setActivityNames(activity_names);
			_result.setSidingNames(siding_names);
			_result.setItemNames(item_names);
			_result.setAspectNames(aspect_names);
			_result.setAffinityNames(affinity_names);
			_result.setActivityTypeNames(activity_type_names);
			_result.setTrailNames(trail_names);
			_result.setAttackNames(attack_names);
			_result.setReasonNames(reason_names);
			_result.setTraitNames(trait_names);
			_result.setConditionNames(condition_names);
			_result.setPaymentShortTypeNames(payment_short_type_names);
			_result.setSkillNames(skill_names);
			_result.setMapNames(map_names);
			_result.setEventNames(event_names);
			_result.setImageNames(image_names);
			_result.setTileSymbols(tile_symbols);
			_result.setPaymentLongTypeNames(payment_long_type_names);
			_result.setAreaNames(area_names);
			_result.setStructureNames(structure_names);
			_result.setTileNames(tile_names);
			_result.setHeroStat(hero_stat);
			return _result;
		}
		public void addImportThread(String importFileName) {
			synchronized(_import_threads) {
				ImportThread thread = new ImportThread(this,Parser.contexts.get(importFileName),importFileName);
				_import_threads.add(thread);
				thread.start();
			}
		}
		public Map<Integer,Integer> getBrace0() {
			return brace_0;
		}
		public void setBrace0(Map<Integer,Integer> newBrace0) {
			brace_0 = newBrace0;
		}
		public Parser.NameList getAspectNamesRoot() {
			return aspect_names_root;
		}
		public void setAspectNamesRoot(Parser.NameList newAspectNamesRoot) {
			aspect_names_root = newAspectNamesRoot;
		}
		public Parser.NameList getAspectNames() {
			return aspect_names;
		}
		public void setAspectNames(Parser.NameList newAspectNames) {
			aspect_names = newAspectNames;
		}
		public Map<Integer,String> get_preparsedNAME() {
			return _preparsed_NAME;
		}
		public void set_preparsedNAME(Map<Integer,String> new_preparsedNAME) {
			_preparsed_NAME = new_preparsedNAME;
		}
		public Parser.NameList getItemNamesRoot() {
			return item_names_root;
		}
		public void setItemNamesRoot(Parser.NameList newItemNamesRoot) {
			item_names_root = newItemNamesRoot;
		}
		public Parser.NameList getItemNames() {
			return item_names;
		}
		public void setItemNames(Parser.NameList newItemNames) {
			item_names = newItemNames;
		}
		public Parser.NameList getAffinityNamesRoot() {
			return affinity_names_root;
		}
		public void setAffinityNamesRoot(Parser.NameList newAffinityNamesRoot) {
			affinity_names_root = newAffinityNamesRoot;
		}
		public Parser.NameList getAffinityNames() {
			return affinity_names;
		}
		public void setAffinityNames(Parser.NameList newAffinityNames) {
			affinity_names = newAffinityNames;
		}
		public Parser.NameList getConditionNamesRoot() {
			return condition_names_root;
		}
		public void setConditionNamesRoot(Parser.NameList newConditionNamesRoot) {
			condition_names_root = newConditionNamesRoot;
		}
		public Parser.NameList getConditionNames() {
			return condition_names;
		}
		public void setConditionNames(Parser.NameList newConditionNames) {
			condition_names = newConditionNames;
		}
		public Parser.NameList getTraitNamesRoot() {
			return trait_names_root;
		}
		public void setTraitNamesRoot(Parser.NameList newTraitNamesRoot) {
			trait_names_root = newTraitNamesRoot;
		}
		public Parser.NameList getTraitNames() {
			return trait_names;
		}
		public void setTraitNames(Parser.NameList newTraitNames) {
			trait_names = newTraitNames;
		}
		public Parser.NameList getActivityTypeNamesRoot() {
			return activity_type_names_root;
		}
		public void setActivityTypeNamesRoot(Parser.NameList newActivityTypeNamesRoot) {
			activity_type_names_root = newActivityTypeNamesRoot;
		}
		public Parser.NameList getActivityTypeNames() {
			return activity_type_names;
		}
		public void setActivityTypeNames(Parser.NameList newActivityTypeNames) {
			activity_type_names = newActivityTypeNames;
		}
		public Parser.NameList getActivityNamesRoot() {
			return activity_names_root;
		}
		public void setActivityNamesRoot(Parser.NameList newActivityNamesRoot) {
			activity_names_root = newActivityNamesRoot;
		}
		public Parser.NameList getActivityNames() {
			return activity_names;
		}
		public void setActivityNames(Parser.NameList newActivityNames) {
			activity_names = newActivityNames;
		}
		public Parser.NameList getAttackNamesRoot() {
			return attack_names_root;
		}
		public void setAttackNamesRoot(Parser.NameList newAttackNamesRoot) {
			attack_names_root = newAttackNamesRoot;
		}
		public Parser.NameList getAttackNames() {
			return attack_names;
		}
		public void setAttackNames(Parser.NameList newAttackNames) {
			attack_names = newAttackNames;
		}
		public Parser.NameList getSupportNamesRoot() {
			return support_names_root;
		}
		public void setSupportNamesRoot(Parser.NameList newSupportNamesRoot) {
			support_names_root = newSupportNamesRoot;
		}
		public Parser.NameList getSupportNames() {
			return support_names;
		}
		public void setSupportNames(Parser.NameList newSupportNames) {
			support_names = newSupportNames;
		}
		public Parser.NameList getSkillNamesRoot() {
			return skill_names_root;
		}
		public void setSkillNamesRoot(Parser.NameList newSkillNamesRoot) {
			skill_names_root = newSkillNamesRoot;
		}
		public Parser.NameList getSkillNames() {
			return skill_names;
		}
		public void setSkillNames(Parser.NameList newSkillNames) {
			skill_names = newSkillNames;
		}
		public Parser.NameList getAssociationNamesRoot() {
			return association_names_root;
		}
		public void setAssociationNamesRoot(Parser.NameList newAssociationNamesRoot) {
			association_names_root = newAssociationNamesRoot;
		}
		public Parser.NameList getAssociationNames() {
			return association_names;
		}
		public void setAssociationNames(Parser.NameList newAssociationNames) {
			association_names = newAssociationNames;
		}
		public Parser.NameList getReasonNamesRoot() {
			return reason_names_root;
		}
		public void setReasonNamesRoot(Parser.NameList newReasonNamesRoot) {
			reason_names_root = newReasonNamesRoot;
		}
		public Parser.NameList getReasonNames() {
			return reason_names;
		}
		public void setReasonNames(Parser.NameList newReasonNames) {
			reason_names = newReasonNames;
		}
		public Parser.NameList getHeroStatRoot() {
			return hero_stat_root;
		}
		public void setHeroStatRoot(Parser.NameList newHeroStatRoot) {
			hero_stat_root = newHeroStatRoot;
		}
		public Parser.NameList getHeroStat() {
			return hero_stat;
		}
		public void setHeroStat(Parser.NameList newHeroStat) {
			hero_stat = newHeroStat;
		}
		public Parser.NameList getRoomNamesRoot() {
			return room_names_root;
		}
		public void setRoomNamesRoot(Parser.NameList newRoomNamesRoot) {
			room_names_root = newRoomNamesRoot;
		}
		public Parser.NameList getRoomNames() {
			return room_names;
		}
		public void setRoomNames(Parser.NameList newRoomNames) {
			room_names = newRoomNames;
		}
		public Parser.NameList getTrailNamesRoot() {
			return trail_names_root;
		}
		public void setTrailNamesRoot(Parser.NameList newTrailNamesRoot) {
			trail_names_root = newTrailNamesRoot;
		}
		public Parser.NameList getTrailNames() {
			return trail_names;
		}
		public void setTrailNames(Parser.NameList newTrailNames) {
			trail_names = newTrailNames;
		}
		public Parser.NameList getStructureNamesRoot() {
			return structure_names_root;
		}
		public void setStructureNamesRoot(Parser.NameList newStructureNamesRoot) {
			structure_names_root = newStructureNamesRoot;
		}
		public Parser.NameList getStructureNames() {
			return structure_names;
		}
		public void setStructureNames(Parser.NameList newStructureNames) {
			structure_names = newStructureNames;
		}
		public Parser.NameList getMapNamesRoot() {
			return map_names_root;
		}
		public void setMapNamesRoot(Parser.NameList newMapNamesRoot) {
			map_names_root = newMapNamesRoot;
		}
		public Parser.NameList getMapNames() {
			return map_names;
		}
		public void setMapNames(Parser.NameList newMapNames) {
			map_names = newMapNames;
		}
		public Parser.NameList getAreaNamesRoot() {
			return area_names_root;
		}
		public void setAreaNamesRoot(Parser.NameList newAreaNamesRoot) {
			area_names_root = newAreaNamesRoot;
		}
		public Parser.NameList getAreaNames() {
			return area_names;
		}
		public void setAreaNames(Parser.NameList newAreaNames) {
			area_names = newAreaNames;
		}
		public Parser.NameList getSidingNamesRoot() {
			return siding_names_root;
		}
		public void setSidingNamesRoot(Parser.NameList newSidingNamesRoot) {
			siding_names_root = newSidingNamesRoot;
		}
		public Parser.NameList getSidingNames() {
			return siding_names;
		}
		public void setSidingNames(Parser.NameList newSidingNames) {
			siding_names = newSidingNames;
		}
		public Parser.NameList getTileNamesRoot() {
			return tile_names_root;
		}
		public void setTileNamesRoot(Parser.NameList newTileNamesRoot) {
			tile_names_root = newTileNamesRoot;
		}
		public Parser.NameList getTileNames() {
			return tile_names;
		}
		public void setTileNames(Parser.NameList newTileNames) {
			tile_names = newTileNames;
		}
		public Parser.NameList getTileSymbolsRoot() {
			return tile_symbols_root;
		}
		public void setTileSymbolsRoot(Parser.NameList newTileSymbolsRoot) {
			tile_symbols_root = newTileSymbolsRoot;
		}
		public Parser.NameList getTileSymbols() {
			return tile_symbols;
		}
		public void setTileSymbols(Parser.NameList newTileSymbols) {
			tile_symbols = newTileSymbols;
		}
		public Parser.NameList getPaymentLongTypeNamesRoot() {
			return payment_long_type_names_root;
		}
		public void setPaymentLongTypeNamesRoot(Parser.NameList newPaymentLongTypeNamesRoot) {
			payment_long_type_names_root = newPaymentLongTypeNamesRoot;
		}
		public Parser.NameList getPaymentLongTypeNames() {
			return payment_long_type_names;
		}
		public void setPaymentLongTypeNames(Parser.NameList newPaymentLongTypeNames) {
			payment_long_type_names = newPaymentLongTypeNames;
		}
		public Parser.NameList getPaymentShortTypeNamesRoot() {
			return payment_short_type_names_root;
		}
		public void setPaymentShortTypeNamesRoot(Parser.NameList newPaymentShortTypeNamesRoot) {
			payment_short_type_names_root = newPaymentShortTypeNamesRoot;
		}
		public Parser.NameList getPaymentShortTypeNames() {
			return payment_short_type_names;
		}
		public void setPaymentShortTypeNames(Parser.NameList newPaymentShortTypeNames) {
			payment_short_type_names = newPaymentShortTypeNames;
		}
		public Parser.NameList getEventNamesRoot() {
			return event_names_root;
		}
		public void setEventNamesRoot(Parser.NameList newEventNamesRoot) {
			event_names_root = newEventNamesRoot;
		}
		public Parser.NameList getEventNames() {
			return event_names;
		}
		public void setEventNames(Parser.NameList newEventNames) {
			event_names = newEventNames;
		}
		public Parser.NameList getImageNamesRoot() {
			return image_names_root;
		}
		public void setImageNamesRoot(Parser.NameList newImageNamesRoot) {
			image_names_root = newImageNamesRoot;
		}
		public Parser.NameList getImageNames() {
			return image_names;
		}
		public void setImageNames(Parser.NameList newImageNames) {
			image_names = newImageNames;
		}
		public Set<Integer> get_recursionProtectionImportItem0() {
			return _recursion_protection_import_item_0;
		}
		public void set_recursionProtectionImportItem0(Set<Integer> new_recursionProtectionImportItem0) {
			_recursion_protection_import_item_0 = new_recursionProtectionImportItem0;
		}
		public Map<Integer,Integer> getBrace1() {
			return brace_1;
		}
		public void setBrace1(Map<Integer,Integer> newBrace1) {
			brace_1 = newBrace1;
		}
		public Map<Integer,Integer> getBrace2() {
			return brace_2;
		}
		public void setBrace2(Map<Integer,Integer> newBrace2) {
			brace_2 = newBrace2;
		}
		public String get_importFILENAMEValue() {
			return _import_FILE_NAME_value;
		}
		public void set_importFILENAMEValue(String new_importFILENAMEValue) {
			_import_FILE_NAME_value = new_importFILENAMEValue;
		}
		public Set<Integer> get_recursionProtectionComments1() {
			return _recursion_protection_comments_1;
		}
		public void set_recursionProtectionComments1(Set<Integer> new_recursionProtectionComments1) {
			_recursion_protection_comments_1 = new_recursionProtectionComments1;
		}
		public Set<Integer> get_recursionProtectionNAME2() {
			return _recursion_protection_NAME_2;
		}
		public void set_recursionProtectionNAME2(Set<Integer> new_recursionProtectionNAME2) {
			_recursion_protection_NAME_2 = new_recursionProtectionNAME2;
		}
		public Set<Integer> get_recursionProtectionComments3() {
			return _recursion_protection_comments_3;
		}
		public void set_recursionProtectionComments3(Set<Integer> new_recursionProtectionComments3) {
			_recursion_protection_comments_3 = new_recursionProtectionComments3;
		}
		public Set<Integer> get_recursionProtectionImportAny4() {
			return _recursion_protection_import_any_4;
		}
		public void set_recursionProtectionImportAny4(Set<Integer> new_recursionProtectionImportAny4) {
			_recursion_protection_import_any_4 = new_recursionProtectionImportAny4;
		}
		public Set<Integer> get_recursionProtectionNAME5() {
			return _recursion_protection_NAME_5;
		}
		public void set_recursionProtectionNAME5(Set<Integer> new_recursionProtectionNAME5) {
			_recursion_protection_NAME_5 = new_recursionProtectionNAME5;
		}
		public Set<Integer> get_recursionProtectionComments6() {
			return _recursion_protection_comments_6;
		}
		public void set_recursionProtectionComments6(Set<Integer> new_recursionProtectionComments6) {
			_recursion_protection_comments_6 = new_recursionProtectionComments6;
		}
		public Set<Integer> get_recursionProtectionComments7() {
			return _recursion_protection_comments_7;
		}
		public void set_recursionProtectionComments7(Set<Integer> new_recursionProtectionComments7) {
			_recursion_protection_comments_7 = new_recursionProtectionComments7;
		}
		public Set<Integer> get_recursionProtectionNAME8() {
			return _recursion_protection_NAME_8;
		}
		public void set_recursionProtectionNAME8(Set<Integer> new_recursionProtectionNAME8) {
			_recursion_protection_NAME_8 = new_recursionProtectionNAME8;
		}
		public Set<Integer> get_recursionProtectionComments9() {
			return _recursion_protection_comments_9;
		}
		public void set_recursionProtectionComments9(Set<Integer> new_recursionProtectionComments9) {
			_recursion_protection_comments_9 = new_recursionProtectionComments9;
		}
		public Set<Integer> get_recursionProtectionNAME10() {
			return _recursion_protection_NAME_10;
		}
		public void set_recursionProtectionNAME10(Set<Integer> new_recursionProtectionNAME10) {
			_recursion_protection_NAME_10 = new_recursionProtectionNAME10;
		}
		public Set<Integer> get_recursionProtectionComments11() {
			return _recursion_protection_comments_11;
		}
		public void set_recursionProtectionComments11(Set<Integer> new_recursionProtectionComments11) {
			_recursion_protection_comments_11 = new_recursionProtectionComments11;
		}
		public Set<Integer> get_recursionProtectionNAME12() {
			return _recursion_protection_NAME_12;
		}
		public void set_recursionProtectionNAME12(Set<Integer> new_recursionProtectionNAME12) {
			_recursion_protection_NAME_12 = new_recursionProtectionNAME12;
		}
		public Set<Integer> get_recursionProtectionNAME13() {
			return _recursion_protection_NAME_13;
		}
		public void set_recursionProtectionNAME13(Set<Integer> new_recursionProtectionNAME13) {
			_recursion_protection_NAME_13 = new_recursionProtectionNAME13;
		}
		public Set<Integer> get_recursionProtectionComments14() {
			return _recursion_protection_comments_14;
		}
		public void set_recursionProtectionComments14(Set<Integer> new_recursionProtectionComments14) {
			_recursion_protection_comments_14 = new_recursionProtectionComments14;
		}
		public Map<Integer,Integer> getBrace3() {
			return brace_3;
		}
		public void setBrace3(Map<Integer,Integer> newBrace3) {
			brace_3 = newBrace3;
		}
		public Set<Integer> get_recursionProtectionNAME15() {
			return _recursion_protection_NAME_15;
		}
		public void set_recursionProtectionNAME15(Set<Integer> new_recursionProtectionNAME15) {
			_recursion_protection_NAME_15 = new_recursionProtectionNAME15;
		}
		public Set<Integer> get_recursionProtectionComments16() {
			return _recursion_protection_comments_16;
		}
		public void set_recursionProtectionComments16(Set<Integer> new_recursionProtectionComments16) {
			_recursion_protection_comments_16 = new_recursionProtectionComments16;
		}
		public Set<Integer> get_recursionProtectionNAME17() {
			return _recursion_protection_NAME_17;
		}
		public void set_recursionProtectionNAME17(Set<Integer> new_recursionProtectionNAME17) {
			_recursion_protection_NAME_17 = new_recursionProtectionNAME17;
		}
		public Set<Integer> get_recursionProtectionComments18() {
			return _recursion_protection_comments_18;
		}
		public void set_recursionProtectionComments18(Set<Integer> new_recursionProtectionComments18) {
			_recursion_protection_comments_18 = new_recursionProtectionComments18;
		}
		public Set<Integer> get_recursionProtectionComments19() {
			return _recursion_protection_comments_19;
		}
		public void set_recursionProtectionComments19(Set<Integer> new_recursionProtectionComments19) {
			_recursion_protection_comments_19 = new_recursionProtectionComments19;
		}
		public Set<Integer> get_recursionProtectionNAME20() {
			return _recursion_protection_NAME_20;
		}
		public void set_recursionProtectionNAME20(Set<Integer> new_recursionProtectionNAME20) {
			_recursion_protection_NAME_20 = new_recursionProtectionNAME20;
		}
		public Set<Integer> get_recursionProtectionComments21() {
			return _recursion_protection_comments_21;
		}
		public void set_recursionProtectionComments21(Set<Integer> new_recursionProtectionComments21) {
			_recursion_protection_comments_21 = new_recursionProtectionComments21;
		}
		public Set<Integer> get_recursionProtectionNAME22() {
			return _recursion_protection_NAME_22;
		}
		public void set_recursionProtectionNAME22(Set<Integer> new_recursionProtectionNAME22) {
			_recursion_protection_NAME_22 = new_recursionProtectionNAME22;
		}
		public Set<Integer> get_recursionProtectionComments23() {
			return _recursion_protection_comments_23;
		}
		public void set_recursionProtectionComments23(Set<Integer> new_recursionProtectionComments23) {
			_recursion_protection_comments_23 = new_recursionProtectionComments23;
		}
		public Set<Integer> get_recursionProtectionComments24() {
			return _recursion_protection_comments_24;
		}
		public void set_recursionProtectionComments24(Set<Integer> new_recursionProtectionComments24) {
			_recursion_protection_comments_24 = new_recursionProtectionComments24;
		}
		public Set<Integer> get_recursionProtectionNAME25() {
			return _recursion_protection_NAME_25;
		}
		public void set_recursionProtectionNAME25(Set<Integer> new_recursionProtectionNAME25) {
			_recursion_protection_NAME_25 = new_recursionProtectionNAME25;
		}
		public Map<Integer,Integer> getBrace4() {
			return brace_4;
		}
		public void setBrace4(Map<Integer,Integer> newBrace4) {
			brace_4 = newBrace4;
		}
		public Set<Integer> get_recursionProtectionComments26() {
			return _recursion_protection_comments_26;
		}
		public void set_recursionProtectionComments26(Set<Integer> new_recursionProtectionComments26) {
			_recursion_protection_comments_26 = new_recursionProtectionComments26;
		}
		public Set<Integer> get_recursionProtectionNAME27() {
			return _recursion_protection_NAME_27;
		}
		public void set_recursionProtectionNAME27(Set<Integer> new_recursionProtectionNAME27) {
			_recursion_protection_NAME_27 = new_recursionProtectionNAME27;
		}
		public Set<Integer> get_recursionProtectionNAME28() {
			return _recursion_protection_NAME_28;
		}
		public void set_recursionProtectionNAME28(Set<Integer> new_recursionProtectionNAME28) {
			_recursion_protection_NAME_28 = new_recursionProtectionNAME28;
		}
		public Set<Integer> get_recursionProtectionComments29() {
			return _recursion_protection_comments_29;
		}
		public void set_recursionProtectionComments29(Set<Integer> new_recursionProtectionComments29) {
			_recursion_protection_comments_29 = new_recursionProtectionComments29;
		}
		public Set<Integer> get_recursionProtectionComments30() {
			return _recursion_protection_comments_30;
		}
		public void set_recursionProtectionComments30(Set<Integer> new_recursionProtectionComments30) {
			_recursion_protection_comments_30 = new_recursionProtectionComments30;
		}
		public Set<Integer> get_recursionProtectionNAME31() {
			return _recursion_protection_NAME_31;
		}
		public void set_recursionProtectionNAME31(Set<Integer> new_recursionProtectionNAME31) {
			_recursion_protection_NAME_31 = new_recursionProtectionNAME31;
		}
		public Set<Integer> get_recursionProtectionNAME32() {
			return _recursion_protection_NAME_32;
		}
		public void set_recursionProtectionNAME32(Set<Integer> new_recursionProtectionNAME32) {
			_recursion_protection_NAME_32 = new_recursionProtectionNAME32;
		}
		public Set<Integer> get_recursionProtectionComments33() {
			return _recursion_protection_comments_33;
		}
		public void set_recursionProtectionComments33(Set<Integer> new_recursionProtectionComments33) {
			_recursion_protection_comments_33 = new_recursionProtectionComments33;
		}
		public Set<Integer> get_recursionProtectionNAME34() {
			return _recursion_protection_NAME_34;
		}
		public void set_recursionProtectionNAME34(Set<Integer> new_recursionProtectionNAME34) {
			_recursion_protection_NAME_34 = new_recursionProtectionNAME34;
		}
		public Set<Integer> get_recursionProtectionComments35() {
			return _recursion_protection_comments_35;
		}
		public void set_recursionProtectionComments35(Set<Integer> new_recursionProtectionComments35) {
			_recursion_protection_comments_35 = new_recursionProtectionComments35;
		}
		public Map<Integer,Integer> getBrace5() {
			return brace_5;
		}
		public void setBrace5(Map<Integer,Integer> newBrace5) {
			brace_5 = newBrace5;
		}
		public Set<Integer> get_recursionProtectionStatement36() {
			return _recursion_protection_statement_36;
		}
		public void set_recursionProtectionStatement36(Set<Integer> new_recursionProtectionStatement36) {
			_recursion_protection_statement_36 = new_recursionProtectionStatement36;
		}
		public Set<Integer> get_recursionProtectionComments37() {
			return _recursion_protection_comments_37;
		}
		public void set_recursionProtectionComments37(Set<Integer> new_recursionProtectionComments37) {
			_recursion_protection_comments_37 = new_recursionProtectionComments37;
		}
		public Set<Integer> get_recursionProtectionNAME38() {
			return _recursion_protection_NAME_38;
		}
		public void set_recursionProtectionNAME38(Set<Integer> new_recursionProtectionNAME38) {
			_recursion_protection_NAME_38 = new_recursionProtectionNAME38;
		}
		public Set<Integer> get_recursionProtectionComments39() {
			return _recursion_protection_comments_39;
		}
		public void set_recursionProtectionComments39(Set<Integer> new_recursionProtectionComments39) {
			_recursion_protection_comments_39 = new_recursionProtectionComments39;
		}
		public Set<Integer> get_recursionProtectionNAME40() {
			return _recursion_protection_NAME_40;
		}
		public void set_recursionProtectionNAME40(Set<Integer> new_recursionProtectionNAME40) {
			_recursion_protection_NAME_40 = new_recursionProtectionNAME40;
		}
		public Set<Integer> get_recursionProtectionAnimationTypeDeclaration41() {
			return _recursion_protection_animation_type_declaration_41;
		}
		public void set_recursionProtectionAnimationTypeDeclaration41(Set<Integer> new_recursionProtectionAnimationTypeDeclaration41) {
			_recursion_protection_animation_type_declaration_41 = new_recursionProtectionAnimationTypeDeclaration41;
		}
		public Set<Integer> get_recursionProtectionINTEGER42() {
			return _recursion_protection_INTEGER_42;
		}
		public void set_recursionProtectionINTEGER42(Set<Integer> new_recursionProtectionINTEGER42) {
			_recursion_protection_INTEGER_42 = new_recursionProtectionINTEGER42;
		}
		public Set<Integer> get_recursionProtectionFLOAT43() {
			return _recursion_protection_FLOAT_43;
		}
		public void set_recursionProtectionFLOAT43(Set<Integer> new_recursionProtectionFLOAT43) {
			_recursion_protection_FLOAT_43 = new_recursionProtectionFLOAT43;
		}
		public Set<Integer> get_recursionProtectionNAME44() {
			return _recursion_protection_NAME_44;
		}
		public void set_recursionProtectionNAME44(Set<Integer> new_recursionProtectionNAME44) {
			_recursion_protection_NAME_44 = new_recursionProtectionNAME44;
		}
		public Set<Integer> get_recursionProtectionNAME45() {
			return _recursion_protection_NAME_45;
		}
		public void set_recursionProtectionNAME45(Set<Integer> new_recursionProtectionNAME45) {
			_recursion_protection_NAME_45 = new_recursionProtectionNAME45;
		}
		public Set<Integer> get_recursionProtectionNAME46() {
			return _recursion_protection_NAME_46;
		}
		public void set_recursionProtectionNAME46(Set<Integer> new_recursionProtectionNAME46) {
			_recursion_protection_NAME_46 = new_recursionProtectionNAME46;
		}
		public Set<Integer> get_recursionProtectionNAME47() {
			return _recursion_protection_NAME_47;
		}
		public void set_recursionProtectionNAME47(Set<Integer> new_recursionProtectionNAME47) {
			_recursion_protection_NAME_47 = new_recursionProtectionNAME47;
		}
		public Set<Integer> get_recursionProtectionComments48() {
			return _recursion_protection_comments_48;
		}
		public void set_recursionProtectionComments48(Set<Integer> new_recursionProtectionComments48) {
			_recursion_protection_comments_48 = new_recursionProtectionComments48;
		}
		public Set<Integer> get_recursionProtectionNAME49() {
			return _recursion_protection_NAME_49;
		}
		public void set_recursionProtectionNAME49(Set<Integer> new_recursionProtectionNAME49) {
			_recursion_protection_NAME_49 = new_recursionProtectionNAME49;
		}
		public Set<Integer> get_recursionProtectionINTEGER50() {
			return _recursion_protection_INTEGER_50;
		}
		public void set_recursionProtectionINTEGER50(Set<Integer> new_recursionProtectionINTEGER50) {
			_recursion_protection_INTEGER_50 = new_recursionProtectionINTEGER50;
		}
		public Set<Integer> get_recursionProtectionComments51() {
			return _recursion_protection_comments_51;
		}
		public void set_recursionProtectionComments51(Set<Integer> new_recursionProtectionComments51) {
			_recursion_protection_comments_51 = new_recursionProtectionComments51;
		}
		public Set<Integer> get_recursionProtectionNAME52() {
			return _recursion_protection_NAME_52;
		}
		public void set_recursionProtectionNAME52(Set<Integer> new_recursionProtectionNAME52) {
			_recursion_protection_NAME_52 = new_recursionProtectionNAME52;
		}
		public Set<Integer> get_recursionProtectionNAME53() {
			return _recursion_protection_NAME_53;
		}
		public void set_recursionProtectionNAME53(Set<Integer> new_recursionProtectionNAME53) {
			_recursion_protection_NAME_53 = new_recursionProtectionNAME53;
		}
		public Set<Integer> get_recursionProtectionComments54() {
			return _recursion_protection_comments_54;
		}
		public void set_recursionProtectionComments54(Set<Integer> new_recursionProtectionComments54) {
			_recursion_protection_comments_54 = new_recursionProtectionComments54;
		}
		public Set<Integer> get_recursionProtectionNAME55() {
			return _recursion_protection_NAME_55;
		}
		public void set_recursionProtectionNAME55(Set<Integer> new_recursionProtectionNAME55) {
			_recursion_protection_NAME_55 = new_recursionProtectionNAME55;
		}
		public int get_readInput1() {
			return _readInput_1;
		}
		public void set_readInput1(int new_readInput1) {
			_readInput_1 = new_readInput1;
		}
		public abstract void parse_attack_declaration();
		public abstract void parse_import_event();
		public abstract void parse_tile_id_choice();
		public abstract void parse_tile_payment_type();
		public abstract void parse_animation_type_continuation_operator();
		public abstract void parse_patch_options();
		public abstract void parse_skill_element();
		public abstract void parse_animation_type_condition();
		public abstract void parse_import_payment_type__file_import();
		public abstract void parse_image_declaration();
		public abstract void parse_condition_element();
		public abstract void parse_import_support__file_import();
		public abstract void parse_acquisition();
		public abstract void parse_variable_group();
		public abstract void parse_import_reason();
		public abstract void parse_event_statement();
		public abstract void parse_variable_declaration();
		public abstract void parse_animation_type_boolean();
		public abstract void parse_patch_rimcals();
		public abstract void parse_reason_description_element();
		public abstract void parse_import_attack();
		public abstract void parse_trait_element();
		public abstract void parse_import_tile();
		public abstract void parse_ORDINAL();
		public abstract void parse_structure_declaration();
		public abstract void parse_import_attack__file_import();
		public abstract void parse_entity_image_specification();
		public abstract void parse_conditional_chance();
		public abstract void parse_tile_dimensions();
		public abstract void parse_drawable_grid_element();
		public abstract void parse_reason_declaration();
		public abstract void parse_structure_payment();
		public abstract void parse_std_body();
		public abstract void parse_patch_probability();
		public abstract void parse_spawned_statement();
		public abstract void parse_select_tile_name();
		public abstract void parse_import_animation_type__file_import();
		public abstract void parse_import_colour();
		public abstract void parse_activity_element();
		public abstract void parse_association_declaration();
		public abstract void parse_entity_id_choice();
		public abstract void parse_method_parameters();
		public abstract void parse_import_any();
		public abstract void parse_import_item();
		public abstract void parse_item_parameter();
		public abstract void parse_affinity_declaration();
		public abstract void parse_connection_declaration();
		public abstract void parse__anonymous_190();
		public abstract void parse__anonymous_195();
		public abstract void parse__anonymous_196();
		public abstract void parse__anonymous_197();
		public abstract void parse__anonymous_198();
		public abstract void parse_aspect_declaration();
		public abstract void parse__anonymous_191();
		public abstract void parse_entity_declaration();
		public abstract void parse__anonymous_192();
		public abstract void parse__anonymous_193();
		public abstract void parse__anonymous_194();
		public abstract void parse_number();
		public abstract void parse_import_association();
		public abstract void parse__anonymous_188();
		public abstract void parse__anonymous_189();
		public abstract void parse_import_image__file_import();
		public abstract void parse_multiple_drawable_declaration();
		public abstract void parse__anonymous_184();
		public abstract void parse__anonymous_185();
		public abstract void parse_drawable_arthmetic_operator();
		public abstract void parse__anonymous_186();
		public abstract void parse_animation_type_coordinate_variable();
		public abstract void parse__anonymous_187();
		public abstract void parse__anonymous_180();
		public abstract void parse__anonymous_181();
		public abstract void parse__anonymous_182();
		public abstract void parse__anonymous_183();
		public abstract void parse_animation();
		public abstract void parse__anonymous_177();
		public abstract void parse__anonymous_178();
		public abstract void parse__anonymous_179();
		public abstract void parse_if_statement();
		public abstract void parse_import_affinity__file_import();
		public abstract void parse_import_colour__file_import();
		public abstract void parse_import_event__file_import();
		public abstract void parse_body_defined_statement();
		public abstract void parse_import_layer__file_import();
		public abstract void parse_import_activity__file_import();
		public abstract void parse_quest_type_element();
		public abstract void parse_import_support();
		public abstract void parse_structures_declaration();
		public abstract void parse__anonymous_199();
		public abstract void parse_drawable_declaration();
		public abstract void parse_edge_if();
		public abstract void parse__anonymous_6();
		public abstract void parse__anonymous_5();
		public abstract void parse__anonymous_8();
		public abstract void parse__anonymous_7();
		public abstract void parse_trail_declaration();
		public abstract void parse__anonymous_2();
		public abstract void parse__anonymous_1();
		public abstract void parse__anonymous_4();
		public abstract void parse__anonymous_3();
		public abstract void parse_import_aspect__file_import();
		public abstract void parse_imposition();
		public abstract void parse__anonymous_9();
		public abstract void parse_import_map__file_import();
		public abstract void parse_image_type();
		public abstract void parse_trait_declaration();
		public abstract void parse_drawable_dimensions();
		public abstract void parse_support_declaration();
		public abstract void parse_activity_statement();
		public abstract void parse__anonymous_0();
		public abstract void parse_edge_if_operator();
		public abstract void parse_support_element();
		public abstract void parse_FLOAT();
		public abstract void parse_animation_substates();
		public abstract void parse_event_declaration();
		public abstract void parse_quest_destination();
		public abstract void parse_comments();
		public abstract void parse_siding_definition();
		public abstract void parse_import_quest();
		public abstract void parse_affinity_element();
		public abstract void parse__anonymous_99();
		public abstract void parse_import_layer();
		public abstract void parse__anonymous_98();
		public abstract void parse_requirement();
		public abstract void parse__anonymous_91();
		public abstract void parse__anonymous_90();
		public abstract void parse_variable_call();
		public abstract void parse__anonymous_93();
		public abstract void parse__anonymous_92();
		public abstract void parse__anonymous_95();
		public abstract void parse__anonymous_94();
		public abstract void parse__anonymous_97();
		public abstract void parse__anonymous_96();
		public abstract void parse_import_image();
		public abstract void parse_activity_type_declaration();
		public abstract void parse_import_activity();
		public abstract void parse_attack_element();
		public abstract void parse__anonymous_88();
		public abstract void parse__anonymous_87();
		public abstract void parse__anonymous_230();
		public abstract void parse__anonymous_89();
		public abstract void parse__anonymous_110();
		public abstract void parse_animation_type_declaration();
		public abstract void parse__anonymous_231();
		public abstract void parse_FILE_NAME();
		public abstract void parse__anonymous_80();
		public abstract void parse__anonymous_104();
		public abstract void parse__anonymous_225();
		public abstract void parse__anonymous_105();
		public abstract void parse__anonymous_226();
		public abstract void parse__anonymous_82();
		public abstract void parse__anonymous_106();
		public abstract void parse__anonymous_227();
		public abstract void parse__anonymous_81();
		public abstract void parse__anonymous_107();
		public abstract void parse_isA_statement();
		public abstract void parse__anonymous_228();
		public abstract void parse__anonymous_84();
		public abstract void parse__anonymous_100();
		public abstract void parse__anonymous_221();
		public abstract void parse__anonymous_83();
		public abstract void parse__anonymous_101();
		public abstract void parse__anonymous_222();
		public abstract void parse__anonymous_86();
		public abstract void parse__anonymous_102();
		public abstract void parse__anonymous_223();
		public abstract void parse__anonymous_85();
		public abstract void parse__anonymous_103();
		public abstract void parse__anonymous_224();
		public abstract void parse_trails_declaration();
		public abstract void parse_animation_variable_value_basic();
		public abstract void parse__anonymous_108();
		public abstract void parse__anonymous_229();
		public abstract void parse__anonymous_109();
		public abstract void parse_animation_state();
		public abstract void parse_return_statement();
		public abstract void parse_boolean_statement();
		public abstract void parse__anonymous_77();
		public abstract void parse_import_drawable__file_import();
		public abstract void parse__anonymous_76();
		public abstract void parse__anonymous_79();
		public abstract void parse__anonymous_78();
		public abstract void parse_patch_position();
		public abstract void parse__anonymous_220();
		public abstract void parse__anonymous_214();
		public abstract void parse__anonymous_215();
		public abstract void parse__anonymous_71();
		public abstract void parse__anonymous_216();
		public abstract void parse__anonymous_70();
		public abstract void parse__anonymous_217();
		public abstract void parse__anonymous_73();
		public abstract void parse__anonymous_210();
		public abstract void parse__anonymous_72();
		public abstract void parse__anonymous_211();
		public abstract void parse__anonymous_75();
		public abstract void parse_boolean_element();
		public abstract void parse__anonymous_212();
		public abstract void parse__anonymous_74();
		public abstract void parse__anonymous_213();
		public abstract void parse_direction_name();
		public abstract void parse_animation_type_arithmetic_operator();
		public abstract void parse__anonymous_218();
		public abstract void parse__anonymous_219();
		public abstract void parse_area_shape_name();
		public abstract void parse__anonymous_66();
		public abstract void parse__anonymous_65();
		public abstract void parse__anonymous_130();
		public abstract void parse__anonymous_68();
		public abstract void parse__anonymous_131();
		public abstract void parse__anonymous_67();
		public abstract void parse__anonymous_132();
		public abstract void parse_has_chance();
		public abstract void parse__anonymous_69();
		public abstract void parse_animation_type_element();
		public abstract void parse__anonymous_126();
		public abstract void parse__anonymous_127();
		public abstract void parse__anonymous_60();
		public abstract void parse__anonymous_128();
		public abstract void parse__anonymous_129();
		public abstract void parse__anonymous_62();
		public abstract void parse__anonymous_122();
		public abstract void parse__anonymous_243();
		public abstract void parse_DESCRIPTION();
		public abstract void parse__anonymous_61();
		public abstract void parse__anonymous_123();
		public abstract void parse__anonymous_244();
		public abstract void parse__anonymous_64();
		public abstract void parse__anonymous_124();
		public abstract void parse__anonymous_245();
		public abstract void parse__anonymous_63();
		public abstract void parse__anonymous_125();
		public abstract void parse__anonymous_55();
		public abstract void parse__anonymous_54();
		public abstract void parse__anonymous_240();
		public abstract void parse__anonymous_57();
		public abstract void parse__anonymous_120();
		public abstract void parse__anonymous_241();
		public abstract void parse__anonymous_56();
		public abstract void parse_import_reason__file_import();
		public abstract void parse__anonymous_121();
		public abstract void parse__anonymous_242();
		public abstract void parse__anonymous_59();
		public abstract void parse__anonymous_58();
		public abstract void parse_animation_type_variable_declaration();
		public abstract void parse__anonymous_115();
		public abstract void parse__anonymous_236();
		public abstract void parse__anonymous_116();
		public abstract void parse__anonymous_237();
		public abstract void parse__anonymous_117();
		public abstract void parse_for_statement();
		public abstract void parse__anonymous_238();
		public abstract void parse__anonymous_118();
		public abstract void parse__anonymous_239();
		public abstract void parse__anonymous_51();
		public abstract void parse__anonymous_111();
		public abstract void parse__anonymous_232();
		public abstract void parse__anonymous_50();
		public abstract void parse__anonymous_112();
		public abstract void parse__anonymous_233();
		public abstract void parse__anonymous_53();
		public abstract void parse__anonymous_113();
		public abstract void parse__anonymous_234();
		public abstract void parse__anonymous_52();
		public abstract void parse__anonymous_114();
		public abstract void parse__anonymous_235();
		public abstract void parse_animation_type_variables();
		public abstract void parse_import_aspect();
		public abstract void parse__anonymous_119();
		public abstract void parse_type_name();
		public abstract void parse_entity_definition_body();
		public abstract void parse__anonymous_44();
		public abstract void parse__anonymous_151();
		public abstract void parse__anonymous_43();
		public abstract void parse__anonymous_152();
		public abstract void parse__anonymous_46();
		public abstract void parse__anonymous_153();
		public abstract void parse__anonymous_45();
		public abstract void parse_map_header();
		public abstract void parse__anonymous_154();
		public abstract void parse__anonymous_48();
		public abstract void parse__anonymous_47();
		public abstract void parse_operator();
		public abstract void parse_import_item__file_import();
		public abstract void parse__anonymous_49();
		public abstract void parse__anonymous_150();
		public abstract void parse__anonymous_148();
		public abstract void parse__anonymous_149();
		public abstract void parse__anonymous_40();
		public abstract void parse__anonymous_144();
		public abstract void parse_condition_declaration();
		public abstract void parse__anonymous_145();
		public abstract void parse__anonymous_42();
		public abstract void parse__anonymous_146();
		public abstract void parse__anonymous_41();
		public abstract void parse__anonymous_147();
		public abstract void parse_INTEGER();
		public abstract void parse_import_trait();
		public abstract void parse_spawn_statement();
		public abstract void parse_stat_range();
		public abstract void parse__anonymous_33();
		public abstract void parse__anonymous_140();
		public abstract void parse__anonymous_32();
		public abstract void parse__anonymous_141();
		public abstract void parse__anonymous_35();
		public abstract void parse__anonymous_142();
		public abstract void parse__anonymous_34();
		public abstract void parse__anonymous_143();
		public abstract void parse__anonymous_37();
		public abstract void parse_skill_declaration();
		public abstract void parse__anonymous_36();
		public abstract void parse__anonymous_39();
		public abstract void parse_NAME();
		public abstract void parse__anonymous_38();
		public abstract void parse__anonymous_137();
		public abstract void parse__anonymous_138();
		public abstract void parse_NOT();
		public abstract void parse__anonymous_139();
		public abstract void parse__anonymous_133();
		public abstract void parse__anonymous_134();
		public abstract void parse__anonymous_31();
		public abstract void parse__anonymous_135();
		public abstract void parse_import_animation_type();
		public abstract void parse__anonymous_30();
		public abstract void parse__anonymous_136();
		public abstract void parse_shape_type();
		public abstract void parse_image_id();
		public abstract void parse_import_condition();
		public abstract void parse_item_declaration();
		public abstract void parse__anonymous_29();
		public abstract void parse_QUOTE();
		public abstract void parse_animation_variable_value_range();
		public abstract void parse_association_event();
		public abstract void parse__anonymous_22();
		public abstract void parse_method_arguments();
		public abstract void parse__anonymous_173();
		public abstract void parse__anonymous_21();
		public abstract void parse__anonymous_174();
		public abstract void parse__anonymous_24();
		public abstract void parse__anonymous_175();
		public abstract void parse__anonymous_23();
		public abstract void parse__anonymous_176();
		public abstract void parse__anonymous_26();
		public abstract void parse__anonymous_25();
		public abstract void parse_import_tile__file_import();
		public abstract void parse__anonymous_170();
		public abstract void parse__anonymous_28();
		public abstract void parse__anonymous_171();
		public abstract void parse__anonymous_27();
		public abstract void parse__anonymous_172();
		public abstract void parse_patch_dimension();
		public abstract void parse__anonymous_166();
		public abstract void parse__anonymous_167();
		public abstract void parse__anonymous_20();
		public abstract void parse__anonymous_168();
		public abstract void parse__anonymous_169();
		public abstract void parse_statement();
		public abstract void parse_animation_type_value();
		public abstract void parse_import_trait__file_import();
		public abstract void parse_drawable_multiple_element();
		public abstract void parse_import_affinity();
		public abstract void parse__anonymous_19();
		public abstract void parse__anonymous_18();
		public abstract void parse__anonymous_11();
		public abstract void parse_import_payment_type();
		public abstract void parse__anonymous_162();
		public abstract void parse__anonymous_10();
		public abstract void parse__anonymous_163();
		public abstract void parse__anonymous_13();
		public abstract void parse__anonymous_164();
		public abstract void parse__anonymous_12();
		public abstract void parse__anonymous_165();
		public abstract void parse_variable_call_element();
		public abstract void parse__anonymous_15();
		public abstract void parse_area_declaration();
		public abstract void parse__anonymous_14();
		public abstract void parse__anonymous_17();
		public abstract void parse__anonymous_160();
		public abstract void parse__anonymous_16();
		public abstract void parse_patch_element();
		public abstract void parse__anonymous_161();
		public abstract void parse__anonymous_159();
		public abstract void parse__anonymous_155();
		public abstract void parse__anonymous_156();
		public abstract void parse__anonymous_157();
		public abstract void parse__anonymous_158();
		public abstract void parse_body_element();
		public abstract void parse_TITLE();
		public abstract void parse_entity_definition();
		public abstract void parse_patch_goto();
		public abstract void parse_base();
		public abstract void parse_import_drawable();
		public abstract void parse_while_statement();
		public abstract void parse_import_condition__file_import();
		public abstract void parse_method();
		public abstract void parse_association_element();
		public abstract void parse_hints();
		public abstract void parse_state_range_element();
		public abstract void parse_variable_header();
		public abstract void parse_tile_declaration();
		public abstract void parse_has_statement();
		public abstract void parse_animation_type_boolean_operator();
		public abstract void parse_range();
		public abstract void parse_animation_type_body();
		public abstract void parse_tile_definition_element();
		public abstract void parse_quest_tile_description();
		public abstract void parse_animation_variable_value();
		public abstract void parse_requirement_element();
		public abstract void parse_import_skill();
		public abstract void parse_import_map();
		public abstract void parse_association_start();
		public abstract void parse_edge_definition();
		public abstract void parse_payment_type_declaration();
		public abstract void parse_if_header();
		public abstract void parse_influence();
		public abstract void parse_quest_addition();
		public abstract void parse_patch_range();
		public abstract void parse_tile_definition();
		public abstract void parse_association_statement();
		public abstract void parse_quest_type_declaration();
		public abstract void parse_import_skill__file_import();
		public abstract void parse_animation_type_flip_variable();
		public abstract void parse_multiple_drawable_points();
		public abstract void parse_import_association__file_import();
		public abstract void parse_association_join();
		public abstract void parse__anonymous_203();
		public abstract void parse_tile_element();
		public abstract void parse__anonymous_204();
		public abstract void parse__anonymous_205();
		public abstract void parse__anonymous_206();
		public abstract void parse__anonymous_200();
		public abstract void parse__anonymous_201();
		public abstract void parse_item_hit_element();
		public abstract void parse__anonymous_202();
		public abstract void parse_inline_if_statement();
		public abstract void parse__anonymous_207();
		public abstract void parse__anonymous_208();
		public abstract void parse__anonymous_209();
		public abstract void parse_animation_frame_data();
		public abstract void parse_activity_declaration();
		public abstract void parse_braced_statement();
		public abstract void parse_import_quest__file_import();
		public abstract void parse_reason_description();
		public abstract void parse_drawable_multiple_value();
		public abstract void parse_tile_cost();
		public abstract void parse_colour_declaration();
		public void _parse_root() {
			parse_base();
		}
		public static class ImportThread extends Thread{
			protected Parser.Context parentContext = null;
			protected Parser.Context context = null;
			protected String fileName = null;
			public ImportThread(final Parser.Context parentContext, final Parser.Context context, final String fileName) {
				if(parentContext != null){
					this.parentContext = parentContext;
				}
				if(context != null){
					this.context = context;
				}
				this.fileName = fileName;
			}
			public ImportThread() {
			}
			public Parser.Context getParentContext() {
				return parentContext;
			}
			public void setParentContext(Parser.Context newParentContext) {
				parentContext = newParentContext;
			}
			public Parser.Context getContext() {
				return context;
			}
			public void setContext(Parser.Context newContext) {
				context = newContext;
			}
			public String getFileName() {
				return fileName;
			}
			public void setFileName(String newFileName) {
				fileName = newFileName;
			}
			public void run() {
				Parser.Result result = context.parse(fileName,parentContext.get_pass());
				if(result!=null) {
					parentContext.get_resultAcceptor().add(result);
					result.setFileName(fileName);
				}
			}
		}
		public static class ImportAspectFileImport extends FinalContext{
			public ImportAspectFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportAspectFileImport() {
			}
			public void _parse_root() {
				parse_import_aspect__file_import();
			}
		}
		public static class ImportItemFileImport extends FinalContext{
			public ImportItemFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportItemFileImport() {
			}
			public void _parse_root() {
				parse_import_item__file_import();
			}
		}
		public static class ImportAffinityFileImport extends FinalContext{
			public ImportAffinityFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportAffinityFileImport() {
			}
			public void _parse_root() {
				parse_import_affinity__file_import();
			}
		}
		public static class ImportConditionFileImport extends FinalContext{
			public ImportConditionFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportConditionFileImport() {
			}
			public void _parse_root() {
				parse_import_condition__file_import();
			}
		}
		public static class ImportTraitFileImport extends FinalContext{
			public ImportTraitFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportTraitFileImport() {
			}
			public void _parse_root() {
				parse_import_trait__file_import();
			}
		}
		public static class ImportActivityFileImport extends FinalContext{
			public ImportActivityFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportActivityFileImport() {
			}
			public void _parse_root() {
				parse_import_activity__file_import();
			}
		}
		public static class ImportQuestFileImport extends FinalContext{
			public ImportQuestFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportQuestFileImport() {
			}
			public void _parse_root() {
				parse_import_quest__file_import();
			}
		}
		public static class ImportAttackFileImport extends FinalContext{
			public ImportAttackFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportAttackFileImport() {
			}
			public void _parse_root() {
				parse_import_attack__file_import();
			}
		}
		public static class ImportSupportFileImport extends FinalContext{
			public ImportSupportFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportSupportFileImport() {
			}
			public void _parse_root() {
				parse_import_support__file_import();
			}
		}
		public static class ImportSkillFileImport extends FinalContext{
			public ImportSkillFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportSkillFileImport() {
			}
			public void _parse_root() {
				parse_import_skill__file_import();
			}
		}
		public static class ImportAssociationFileImport extends FinalContext{
			public ImportAssociationFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportAssociationFileImport() {
			}
			public void _parse_root() {
				parse_import_association__file_import();
			}
		}
		public static class ImportReasonFileImport extends FinalContext{
			public ImportReasonFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportReasonFileImport() {
			}
			public void _parse_root() {
				parse_import_reason__file_import();
			}
		}
		public static class ImportMapFileImport extends FinalContext{
			public ImportMapFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportMapFileImport() {
			}
			public void _parse_root() {
				parse_import_map__file_import();
			}
		}
		public static class ImportTileFileImport extends FinalContext{
			public ImportTileFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportTileFileImport() {
			}
			public void _parse_root() {
				parse_import_tile__file_import();
			}
		}
		public static class ImportPaymentTypeFileImport extends FinalContext{
			public ImportPaymentTypeFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportPaymentTypeFileImport() {
			}
			public void _parse_root() {
				parse_import_payment_type__file_import();
			}
		}
		public static class ImportEventFileImport extends FinalContext{
			public ImportEventFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportEventFileImport() {
			}
			public void _parse_root() {
				parse_import_event__file_import();
			}
		}
		public static class ImportAnimationTypeFileImport extends FinalContext{
			public ImportAnimationTypeFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportAnimationTypeFileImport() {
			}
			public void _parse_root() {
				parse_import_animation_type__file_import();
			}
		}
		public static class ImportImageFileImport extends FinalContext{
			public ImportImageFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportImageFileImport() {
			}
			public void _parse_root() {
				parse_import_image__file_import();
			}
		}
		public static class ImportDrawableFileImport extends FinalContext{
			public ImportDrawableFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportDrawableFileImport() {
			}
			public void _parse_root() {
				parse_import_drawable__file_import();
			}
		}
		public static class ImportColourFileImport extends FinalContext{
			public ImportColourFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportColourFileImport() {
			}
			public void _parse_root() {
				parse_import_colour__file_import();
			}
		}
		public static class ImportLayerFileImport extends FinalContext{
			public ImportLayerFileImport(final Parser.NameList initalSuperAspectNamesRoot, final Parser.NameList initalSuperItemNamesRoot, final Parser.NameList initalSuperAffinityNamesRoot, final Parser.NameList initalSuperConditionNamesRoot, final Parser.NameList initalSuperTraitNamesRoot, final Parser.NameList initalSuperActivityTypeNamesRoot, final Parser.NameList initalSuperActivityNamesRoot, final Parser.NameList initalSuperAttackNamesRoot, final Parser.NameList initalSuperSupportNamesRoot, final Parser.NameList initalSuperSkillNamesRoot, final Parser.NameList initalSuperAssociationNamesRoot, final Parser.NameList initalSuperReasonNamesRoot, final Parser.NameList initalSuperHeroStatRoot, final Parser.NameList initalSuperRoomNamesRoot, final Parser.NameList initalSuperTrailNamesRoot, final Parser.NameList initalSuperStructureNamesRoot, final Parser.NameList initalSuperMapNamesRoot, final Parser.NameList initalSuperAreaNamesRoot, final Parser.NameList initalSuperSidingNamesRoot, final Parser.NameList initalSuperTileNamesRoot, final Parser.NameList initalSuperTileSymbolsRoot, final Parser.NameList initalSuperPaymentLongTypeNamesRoot, final Parser.NameList initalSuperPaymentShortTypeNamesRoot, final Parser.NameList initalSuperEventNamesRoot, final Parser.NameList initalSuperImageNamesRoot) {
				super(initalSuperAspectNamesRoot, initalSuperItemNamesRoot, initalSuperAffinityNamesRoot, initalSuperConditionNamesRoot, initalSuperTraitNamesRoot, initalSuperActivityTypeNamesRoot, initalSuperActivityNamesRoot, initalSuperAttackNamesRoot, initalSuperSupportNamesRoot, initalSuperSkillNamesRoot, initalSuperAssociationNamesRoot, initalSuperReasonNamesRoot, initalSuperHeroStatRoot, initalSuperRoomNamesRoot, initalSuperTrailNamesRoot, initalSuperStructureNamesRoot, initalSuperMapNamesRoot, initalSuperAreaNamesRoot, initalSuperSidingNamesRoot, initalSuperTileNamesRoot, initalSuperTileSymbolsRoot, initalSuperPaymentLongTypeNamesRoot, initalSuperPaymentShortTypeNamesRoot, initalSuperEventNamesRoot, initalSuperImageNamesRoot);
			}
			public ImportLayerFileImport() {
			}
			public void _parse_root() {
				parse_import_layer__file_import();
			}
		}
	}
	public static class NameList extends HashSet<String>{
		protected NameList parent = null;
		protected Map<Integer,NameList> children = new HashMap<Integer,NameList>();
		protected List<NameList.Addition> additions = new ArrayList<NameList.Addition>();
		protected int addition_position = -1;
		public NameList(final NameList parent) {
			super();
			if(parent != null){
				this.parent = parent;
			}
		}
		public NameList() {
		}
		public NameList getParent() {
			return parent;
		}
		public void setParent(NameList newParent) {
			parent = newParent;
		}
		public Map<Integer,NameList> getChildren() {
			return children;
		}
		public void setChildren(Map<Integer,NameList> newChildren) {
			children = newChildren;
		}
		public List<NameList.Addition> getAdditions() {
			return additions;
		}
		public void setAdditions(List<NameList.Addition> newAdditions) {
			additions = newAdditions;
		}
		public int getAdditionPosition() {
			return addition_position;
		}
		public void setAdditionPosition(int newAdditionPosition) {
			addition_position = newAdditionPosition;
		}
		public NameList push(int position,int pass) {
			NameList result = null;
			if(pass==Parser.SECOND_PASS) {
				synchronized(children) {
					result=children.get(position);
				}
			}
			if(result==null) {
				result=new NameList(this);
				if(pass==Parser.FIRST_PASS) {
					synchronized(children) {
						children.put(position,result);
					}
				}
			}
			else {
				result.clear();
			}
			synchronized(this) {
				synchronized(result) {
					for(String newEntry:this) {
						result.safe_add(newEntry);
					}
				}
			}
			return result;
		}
		public NameList push() {
			NameList result = new NameList(this);
			synchronized(this) {
				synchronized(result) {
					for(String newEntry:this) {
						result.safe_add(newEntry);
					}
				}
			}
			return result;
		}
		public NameList pop() {
			return parent;
		}
		public boolean add(String addition) {
			synchronized(this) {
				if(super.add(addition)) {
					additions.add(new NameList.Addition(addition_position,addition));
					return true;
				}
				else {
					return false;
				}
			}
		}
		public boolean safe_add(String addition) {
			return super.add(addition);
		}
		public void start(int position) {
			addition_position=position;
		}
		public void accept(int position) {
			addition_position=position;
		}
		public void reject(int position) {
			synchronized(this) {
				addition_position=position;
				int i = additions.size()-1;
				while(i>=0 ) {
					if(additions.get(i).getPosition()>=addition_position) {
						remove(additions.remove(i).getEntry());
					}
					else {
						break;
					}
					--i;
				}
			}
		}
		public void extend() {
			synchronized(parent) {
				for(String entry:parent) {
					safe_add(entry);
				}
			}
		}
		public void keep() {
			synchronized(this) {
				synchronized(parent) {
					for(NameList.Addition addition:additions) {
						parent.safe_add(addition.getEntry());
					}
				}
				additions.clear();
			}
		}
		public static class Addition{
			protected Integer position;
			protected String entry;
			public Addition(final Integer position, final String entry) {
				this.position = position;
				this.entry = entry;
			}
			public Addition() {
			}
			public Integer getPosition() {
				return position;
			}
			public void setPosition(Integer newPosition) {
				position = newPosition;
			}
			public String getEntry() {
				return entry;
			}
			public void setEntry(String newEntry) {
				entry = newEntry;
			}
		}
		public static class Builder{
			protected StringBuilder builder = null;
			protected int length = 0;
			protected int state = 0;
			protected boolean multiple_satisfied = false;
			protected Map<Integer,String> _output = null;
			public Builder(final Map<Integer,String> _output) {
				if(_output != null){
					this._output = _output;
				}
			}
			public Builder() {
			}
			public StringBuilder getBuilder() {
				return builder;
			}
			public void setBuilder(StringBuilder newBuilder) {
				builder = newBuilder;
			}
			public int getLength() {
				return length;
			}
			public void setLength(int newLength) {
				length = newLength;
			}
			public int getState() {
				return state;
			}
			public void setState(int newState) {
				state = newState;
			}
			public boolean getMultipleSatisfied() {
				return multiple_satisfied;
			}
			public void setMultipleSatisfied(boolean newMultipleSatisfied) {
				multiple_satisfied = newMultipleSatisfied;
			}
			public Map<Integer,String> get_output() {
				return _output;
			}
			public void set_output(Map<Integer,String> new_output) {
				_output = new_output;
			}
			public boolean can(int position,char newChar) {
				return false;
			}
			public boolean add(int position,char newChar) {
				if(can(position,newChar)) {
					if(builder==null) {
						builder=new StringBuilder();
						length=0;
					}
					builder.append(newChar);
					length+=1;
					return true;
				}
				else {
					if(builder!=null&&state>=0 ) {
						String result = builder.toString();
						_output.put(position-length,result);
					}
					builder=null;
					state=0;
					return false;
				}
			}
			public void end(int position) {
				if(builder!=null&&state>=0 ) {
					String result = builder.toString();
					_output.put(position-length,result);
				}
			}
			public static class NAME extends Parser.NameList.Builder{
				public NAME(final Map<Integer,String> initalSuper_output) {
					super(initalSuper_output);
				}
				public NAME() {
				}
				public boolean can(int position,char nextChar) {
					switch(state) {
						case 0: {
							if((nextChar>='a'&&nextChar<='z')||(nextChar>='A'&&nextChar<='Z')||nextChar=='_') {
								state=1;
								return true;
							}
							else {
								state=-1;
								return false;
							}
						}
						case 1: {
							if((nextChar>='a'&&nextChar<='z')||(nextChar>='A'&&nextChar<='Z')||(nextChar>='0'&&nextChar<='9')||nextChar=='_') {
								return true;
							}
							else {
								state=2;
								return can(position,nextChar);
							}
						}
					}
					return false;
				}
			}
		}
	}
	public static class Result{
		protected Integer state = -1;
		protected Integer position = -1;
		protected List<Integer> lineNumberRanges = null;
		protected String input = null;
		protected String fileName = null;
		protected long parseTime = -1;
		protected Set<String> support_names = null;
		protected Set<String> association_names = null;
		protected Set<String> room_names = null;
		protected Set<String> activity_names = null;
		protected Set<String> siding_names = null;
		protected Set<String> item_names = null;
		protected Set<String> aspect_names = null;
		protected Set<String> affinity_names = null;
		protected Set<String> activity_type_names = null;
		protected Set<String> trail_names = null;
		protected Set<String> attack_names = null;
		protected Set<String> reason_names = null;
		protected Set<String> trait_names = null;
		protected Set<String> condition_names = null;
		protected Set<String> payment_short_type_names = null;
		protected Set<String> skill_names = null;
		protected Set<String> map_names = null;
		protected Set<String> event_names = null;
		protected Set<String> image_names = null;
		protected Set<String> tile_symbols = null;
		protected Set<String> payment_long_type_names = null;
		protected Set<String> area_names = null;
		protected Set<String> structure_names = null;
		protected Set<String> tile_names = null;
		protected Set<String> hero_stat = null;
		public Result(final Integer state, final Integer position, final List<Integer> lineNumberRanges, final String input, final String fileName) {
			this.state = state;
			this.position = position;
			if(lineNumberRanges != null){
				this.lineNumberRanges = lineNumberRanges;
			}
			this.input = input;
			this.fileName = fileName;
		}
		public Result() {
		}
		public Integer getState() {
			return state;
		}
		public void setState(Integer newState) {
			state = newState;
		}
		public Integer getPosition() {
			return position;
		}
		public void setPosition(Integer newPosition) {
			position = newPosition;
		}
		public List<Integer> getLineNumberRanges() {
			return lineNumberRanges;
		}
		public void setLineNumberRanges(List<Integer> newLineNumberRanges) {
			lineNumberRanges = newLineNumberRanges;
		}
		public String getInput() {
			return input;
		}
		public void setInput(String newInput) {
			input = newInput;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String newFileName) {
			fileName=newFileName;
		}
		public long getParseTime() {
			return parseTime;
		}
		public void setParseTime(long newParseTime) {
			parseTime = newParseTime;
		}
		public Integer getLineNumber(Integer position) {
			Integer upperBound = 0;
			Integer lineNumber = 0;
			while(lineNumber<lineNumberRanges.size()&&upperBound<position) {
				upperBound=lineNumberRanges.get(lineNumber);
				lineNumber+=1;
			}
			return lineNumber;
		}
		public Integer getLineNumber() {
			Integer upperBound = 0;
			Integer lineNumber = 0;
			while(lineNumber<lineNumberRanges.size()&&upperBound<position) {
				upperBound=lineNumberRanges.get(lineNumber);
				lineNumber+=1;
			}
			return lineNumber;
		}
		public String toString() {
			if(state==Parser.FAILED) {
				Integer lineNumber = getLineNumber();
				Integer rangeIndex = lineNumber-1;
				if(rangeIndex<0 ) {
					rangeIndex=0;
				}
				Integer upperBound = lineNumberRanges.get(rangeIndex);
				Integer lowerBound = 0;
				if(rangeIndex>0 ) {
					lowerBound=lineNumberRanges.get(rangeIndex-1)+1;
				}
				String errorAt;
				if(upperBound<input.length()) {
					errorAt=input.substring(lowerBound,position)+"$>"+input.substring(position,upperBound);
				}
				else {
					errorAt=input.substring(lowerBound,position)+"<$"+input.substring(position);
				}
				if(parseTime<=0 ) {
					if(fileName==null) {
						return "\n\tLine Number: "+lineNumber+"\n\tError: "+errorAt;
					}
					else {
						return "\nFile: "+fileName+" Line : "+lineNumber+"\n\tError: "+errorAt;
					}
				}
				else {
					if(position==-1 ) {
						if(parseTime<1000 ) {
							return "File: "+fileName+"\nParse Time: "+parseTime+"ms";
						}
						else {
							int minutes = (int)(parseTime/1000);
							int hundreds = (int)(parseTime/100)%10;
							int tens = (int)(parseTime/10)%10;
							int ones = ((int)parseTime)%10;
							return "File: "+fileName+"\nParse Time: "+minutes+"."+hundreds+""+tens+""+ones+"s";
						}
					}
					else {
						if(parseTime<1000 ) {
							return "\n\tError: "+errorAt+"\n\tFile: "+fileName+" Line : "+lineNumber+"\n\tParse Time: "+parseTime+"ms";
						}
						else {
							int minutes = (int)(parseTime/1000);
							int hundreds = (int)(parseTime/100)%10;
							int tens = (int)(parseTime/10)%10;
							int ones = ((int)parseTime)%10;
							return "\n\tError: "+errorAt+"\n\tFile: "+fileName+" Line: "+lineNumber+"\n\tParse Time: "+minutes+"."+hundreds+""+tens+""+ones+"s";
						}
					}
				}
			}
			else {
				if(parseTime<=0 ) {
					if(fileName==null) {
						return "";
					}
					else {
						return "File: "+fileName;
					}
				}
				else {
					if(parseTime<1000 ) {
						if(fileName==null) {
							return "Parse Time: "+parseTime+"ms";
						}
						else {
							return "File: "+fileName+"\nParse Time: "+parseTime+"ms";
						}
					}
					else {
						int minutes = (int)(parseTime/1000);
						int hundreds = (int)(parseTime/100)%10;
						int tens = (int)(parseTime/10)%10;
						int ones = ((int)parseTime)%10;
						if(fileName==null) {
							return "Parse Time: "+minutes+"."+hundreds+""+tens+""+ones+"s";
						}
						else {
							return "File: "+fileName+"\nParse Time: "+minutes+"."+hundreds+""+tens+""+ones+"s";
						}
					}
				}
			}
		}
		public Set<String> getSupportNames() {
			return support_names;
		}
		public void setSupportNames(Set<String> newSupportNames) {
			support_names = newSupportNames;
		}
		public Set<String> getAssociationNames() {
			return association_names;
		}
		public void setAssociationNames(Set<String> newAssociationNames) {
			association_names = newAssociationNames;
		}
		public Set<String> getRoomNames() {
			return room_names;
		}
		public void setRoomNames(Set<String> newRoomNames) {
			room_names = newRoomNames;
		}
		public Set<String> getActivityNames() {
			return activity_names;
		}
		public void setActivityNames(Set<String> newActivityNames) {
			activity_names = newActivityNames;
		}
		public Set<String> getSidingNames() {
			return siding_names;
		}
		public void setSidingNames(Set<String> newSidingNames) {
			siding_names = newSidingNames;
		}
		public Set<String> getItemNames() {
			return item_names;
		}
		public void setItemNames(Set<String> newItemNames) {
			item_names = newItemNames;
		}
		public Set<String> getAspectNames() {
			return aspect_names;
		}
		public void setAspectNames(Set<String> newAspectNames) {
			aspect_names = newAspectNames;
		}
		public Set<String> getAffinityNames() {
			return affinity_names;
		}
		public void setAffinityNames(Set<String> newAffinityNames) {
			affinity_names = newAffinityNames;
		}
		public Set<String> getActivityTypeNames() {
			return activity_type_names;
		}
		public void setActivityTypeNames(Set<String> newActivityTypeNames) {
			activity_type_names = newActivityTypeNames;
		}
		public Set<String> getTrailNames() {
			return trail_names;
		}
		public void setTrailNames(Set<String> newTrailNames) {
			trail_names = newTrailNames;
		}
		public Set<String> getAttackNames() {
			return attack_names;
		}
		public void setAttackNames(Set<String> newAttackNames) {
			attack_names = newAttackNames;
		}
		public Set<String> getReasonNames() {
			return reason_names;
		}
		public void setReasonNames(Set<String> newReasonNames) {
			reason_names = newReasonNames;
		}
		public Set<String> getTraitNames() {
			return trait_names;
		}
		public void setTraitNames(Set<String> newTraitNames) {
			trait_names = newTraitNames;
		}
		public Set<String> getConditionNames() {
			return condition_names;
		}
		public void setConditionNames(Set<String> newConditionNames) {
			condition_names = newConditionNames;
		}
		public Set<String> getPaymentShortTypeNames() {
			return payment_short_type_names;
		}
		public void setPaymentShortTypeNames(Set<String> newPaymentShortTypeNames) {
			payment_short_type_names = newPaymentShortTypeNames;
		}
		public Set<String> getSkillNames() {
			return skill_names;
		}
		public void setSkillNames(Set<String> newSkillNames) {
			skill_names = newSkillNames;
		}
		public Set<String> getMapNames() {
			return map_names;
		}
		public void setMapNames(Set<String> newMapNames) {
			map_names = newMapNames;
		}
		public Set<String> getEventNames() {
			return event_names;
		}
		public void setEventNames(Set<String> newEventNames) {
			event_names = newEventNames;
		}
		public Set<String> getImageNames() {
			return image_names;
		}
		public void setImageNames(Set<String> newImageNames) {
			image_names = newImageNames;
		}
		public Set<String> getTileSymbols() {
			return tile_symbols;
		}
		public void setTileSymbols(Set<String> newTileSymbols) {
			tile_symbols = newTileSymbols;
		}
		public Set<String> getPaymentLongTypeNames() {
			return payment_long_type_names;
		}
		public void setPaymentLongTypeNames(Set<String> newPaymentLongTypeNames) {
			payment_long_type_names = newPaymentLongTypeNames;
		}
		public Set<String> getAreaNames() {
			return area_names;
		}
		public void setAreaNames(Set<String> newAreaNames) {
			area_names = newAreaNames;
		}
		public Set<String> getStructureNames() {
			return structure_names;
		}
		public void setStructureNames(Set<String> newStructureNames) {
			structure_names = newStructureNames;
		}
		public Set<String> getTileNames() {
			return tile_names;
		}
		public void setTileNames(Set<String> newTileNames) {
			tile_names = newTileNames;
		}
		public Set<String> getHeroStat() {
			return hero_stat;
		}
		public void setHeroStat(Set<String> newHeroStat) {
			hero_stat = newHeroStat;
		}
		public static class Pass extends Parser.Result implements Supplier<Token>{
			protected Token.Parsed parsedRoot = null;
			protected Token.Branch root = null;
			public Pass(final Integer initalSuperState, final Integer initalSuperPosition, final List<Integer> initalSuperLineNumberRanges, final String initalSuperInput, final String initalSuperFileName, final Token.Parsed parsedRoot) {
				super(initalSuperState, initalSuperPosition, initalSuperLineNumberRanges, initalSuperInput, initalSuperFileName);
				if(parsedRoot != null){
					this.parsedRoot = parsedRoot;
				}
			}
			public Pass(final Token.Parsed parsedRoot) {
				if(parsedRoot != null){
					this.parsedRoot = parsedRoot;
				}
			}
			public Pass() {
			}
			public Token.Parsed getParsedRoot() {
				return parsedRoot;
			}
			public void setParsedRoot(Token.Parsed newParsedRoot) {
				parsedRoot = newParsedRoot;
			}
			public Token get(){
				return root;
			}
			public Token.Branch getRoot() {
				return root;
			}
			public void setRoot(Token.Branch newRoot) {
				root = newRoot;
			}
			public void setup() {
				root=new Token.Branch();
				setup(root,parsedRoot,0);
			}
			public void setup(Token.Branch current,Token.Parsed currentParsed,Integer currentPosition) {
				List<Token.Parsed> children = currentParsed.getChildren();
				List<Integer> positions = currentParsed.getPositions();
				Integer size = currentParsed.getChildren().size();
				for(Integer i = 0;i<size;i++) {
					if(children.get(i).getChildren().isEmpty()==false) {
						if(children.get(i).getName()==null) {
							setup(current,children.get(i),positions.get(i));
						}
						else {
							Token.Branch newToken = new Token.Branch(children.get(i).getName(),positions.get(i),currentPosition,this);
							current.add(newToken);
							setup(newToken,children.get(i),positions.get(i));
						}
					}
					else {
						current.add(new Token.Leaf(children.get(i).getName(),children.get(i).getValue(),positions.get(i),currentPosition,this));
					}
				}
			}
			public String toString() {
				if(fileName!=null) {
					String realFileName = fileName;
					fileName=null;
					String result = super.toString();
					fileName=realFileName;
					if(result.equals("")) {
						return null;
					}
					else {
						return "Passed: "+result;
					}
				}
				else {
					return null;
				}
			}
		}
		public static class Fail extends Parser.Result{
			protected String ruleName = null;
			public Fail(final Integer initalSuperState, final Integer initalSuperPosition, final List<Integer> initalSuperLineNumberRanges, final String initalSuperInput, final String initalSuperFileName, final String ruleName) {
				super(initalSuperState, initalSuperPosition, initalSuperLineNumberRanges, initalSuperInput, initalSuperFileName);
				this.ruleName = ruleName;
			}
			public Fail(final String ruleName) {
				this.ruleName = ruleName;
			}
			public Fail() {
			}
			public String getRuleName() {
				return ruleName;
			}
			public void setRuleName(String newRuleName) {
				ruleName = newRuleName;
			}
			public String toString() {
				return "Failed: "+ruleName+super.toString();
			}
			public static class EOF extends Parser.Result{
				protected String erroneousFile = null;
				public EOF(final Integer initalSuperState, final Integer initalSuperPosition, final List<Integer> initalSuperLineNumberRanges, final String initalSuperInput, final String initalSuperFileName, final String erroneousFile) {
					super(initalSuperState, initalSuperPosition, initalSuperLineNumberRanges, initalSuperInput, initalSuperFileName);
					this.erroneousFile = erroneousFile;
				}
				public EOF(final String erroneousFile) {
					this.erroneousFile = erroneousFile;
				}
				public EOF() {
				}
				public String getErroneousFile() {
					return erroneousFile;
				}
				public void setErroneousFile(String newErroneousFile) {
					erroneousFile = newErroneousFile;
				}
				public String toString() {
					return "End of file not reached:"+erroneousFile;
				}
			}
			public static class EOB extends Parser.Result{
				protected String myRuleName = null;
				protected Integer myPosition = -1;
				protected List<Integer> myLineNumberRanges = null;
				public EOB(final Integer initalSuperState, final Integer initalSuperPosition, final List<Integer> initalSuperLineNumberRanges, final String initalSuperInput, final String initalSuperFileName, final String myRuleName, final Integer myPosition, final List<Integer> myLineNumberRanges) {
					super(initalSuperState, initalSuperPosition, initalSuperLineNumberRanges, initalSuperInput, initalSuperFileName);
					this.myRuleName = myRuleName;
					this.myPosition = myPosition;
					if(myLineNumberRanges != null){
						this.myLineNumberRanges = myLineNumberRanges;
					}
				}
				public EOB(final String myRuleName, final Integer myPosition, final List<Integer> myLineNumberRanges) {
					this.myRuleName = myRuleName;
					this.myPosition = myPosition;
					if(myLineNumberRanges != null){
						this.myLineNumberRanges = myLineNumberRanges;
					}
				}
				public EOB() {
				}
				public String getMyRuleName() {
					return myRuleName;
				}
				public void setMyRuleName(String newMyRuleName) {
					myRuleName = newMyRuleName;
				}
				public Integer getMyPosition() {
					return myPosition;
				}
				public void setMyPosition(Integer newMyPosition) {
					myPosition = newMyPosition;
				}
				public List<Integer> getMyLineNumberRanges() {
					return myLineNumberRanges;
				}
				public void setMyLineNumberRanges(List<Integer> newMyLineNumberRanges) {
					myLineNumberRanges = newMyLineNumberRanges;
				}
				public String toString() {
					lineNumberRanges=myLineNumberRanges;
					position=myPosition;
					return "End of brace not reached by ["+myRuleName+"]:"+getLineNumber();
				}
			}
		}
		public static class Acceptor extends Parser.Result{
			protected List<Parser.Result> results = new ArrayList<Parser.Result>();
			public Acceptor(final Integer initalSuperState, final Integer initalSuperPosition, final List<Integer> initalSuperLineNumberRanges, final String initalSuperInput, final String initalSuperFileName, final List<Parser.Result> results) {
				super(initalSuperState, initalSuperPosition, initalSuperLineNumberRanges, initalSuperInput, initalSuperFileName);
				if(results != null){
					this.results = results;
				}
			}
			public Acceptor(final List<Parser.Result> results) {
				if(results != null){
					this.results = results;
				}
			}
			public Acceptor() {
			}
			public List<Parser.Result> getResults() {
				return results;
			}
			public void setResults(List<Parser.Result> newResults) {
				results = newResults;
			}
			public void add(Parser.Result result) {
				result.setFileName(null);
				results.add(result);
			}
			public String toString() {
				StringBuilder builder = new StringBuilder();
				for(Parser.Result result:results) {
					if(result!=null) {
						String resultString = result.toString();
						if(resultString!=null) {
							builder.append("\n");
							builder.append(resultString);
						}
					}
				}
				return super.toString()+builder.toString();
			}
		}
	}
	@Override
	public Consumer<Result> printMethod(PrintMethodType arg0) {
		return R->System.out.println(R.toString());
	}
}