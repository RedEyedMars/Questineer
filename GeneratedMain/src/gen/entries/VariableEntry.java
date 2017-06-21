package gen.entries;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import gen.*;
import gen.checks.*;
import gen.properties.*;
import lists.*;

public class VariableEntry implements Entry {
	public VariableEntry getSelf(){
		return this;
	}

	public static final Integer SIMPLE = 0;
	public static final Integer WITH_TYPE = 1;
	public static final Integer SHOW_TYPE = 1;
	public static final Integer SHOW_COMPLETE_TYPE = 6;
	public static final Integer GET_METHOD = 2;
	public static final Integer SHOW_AS_GET = 3;
	public static final Integer SHOW_AS_END = 4;
	public static final Integer DECLARATION = 5;
	public static final Integer DEFAULT = 0;
	public static final Integer PRIVATE = 1;
	public static final Integer PUBLIC = 2;
	public static final Integer PROTECTED = 3;
	public static final Integer FINAL = 1;
	public static final Integer STATIC = 2;

	private String name = null;
	private ClassEntry type = null;
	private IBodyStatement assignment = (IBodyStatement)null;
	private Integer mode = SIMPLE;
	private Integer access = DEFAULT;
	private Integer state = DEFAULT;
	private Boolean isParameter = false;
	private BodyEntryEntry ifEnd = (BodyEntryEntry)null;
	private Boolean isHidden = false;

	public VariableEntry(String initialName,String initialType){
		name = initialName;
		type = (ClassEntry)Generators.general.getType(initialType);
		assignment = type.getDefaultAssignment();
		ifEnd = type.getDefaultEnder();
	}
	public VariableEntry(String initialName,String initialType,IBodyStatement initialAssignment){
		name = initialName;
		type = (ClassEntry)Generators.general.getType(initialType);
		assignment = initialAssignment;
		ifEnd = type.getDefaultEnder();
	}
	public VariableEntry(String initialName,String initialType,String initialAssignment){
		name = initialName;
		type = (ClassEntry)Generators.general.getType(initialType);
		assignment = new BodyExactEntry(new StringEntry(initialAssignment));
		ifEnd = type.getDefaultEnder();
	}
	public VariableEntry(String initialName,ClassEntry initialType){
		name = initialName;
		type = initialType;
		assignment = type.getDefaultAssignment();
		ifEnd = type.getDefaultEnder();
	}
	public VariableEntry(VariableEntry variable){
		name = variable.getName();
		type = variable.getType();
		assignment = variable.getAssignment();
		ifEnd = variable.getIfEnd();
		isParameter = variable.getIsParameter();
		mode = variable.getMode();
		access = variable.getAccess();
		state = variable.getState();
	}

	public String getName(){
		return name;
	}	public ClassEntry getType(){
		return type;
	}
	public IBodyStatement getAssignment(){
		return assignment;
	}
	public Integer getMode(){
		return mode;
	}
	public Integer getAccess(){
		return access;
	}
	public Integer getState(){
		return state;
	}
	public Boolean getIsParameter(){
		return isParameter;
	}
	public BodyEntryEntry getIfEnd(){
		return ifEnd;
	}
	public Boolean getIsHidden(){
		return isHidden;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setAccess(Integer newAccess){
		access = newAccess;
	}
	public void setAccessIfNot(Integer excludeAccess,Integer newAccess){
		if((access != excludeAccess)){
			access = newAccess;
		}
	}
	public void setState(Integer newState){
		state = newState;
	}
	public void setMode(Integer newMode){
		mode = newMode;
	}
	public void setIfEnd(BodyEntryEntry newIfEnd){
		ifEnd = newIfEnd;
	}
	public void setIsHidden(Boolean newIsHidden){
		isHidden = newIsHidden;
	}
	public Boolean isFinal(){
		return (state == FINAL || state == 3);
	}
	public Boolean isStatic(){
		return (state == STATIC || state == 3);
	}
	public Boolean hasEnder(){
		if((ifEnd != null)){
			return ifEnd.hasEnd();
		}
		else {
			return false;
		}
	}
	public VariableEntry getAsGetMethod(){
		String typeName = type.getName();
		String methodName = Generators.general.buildString("get",Generator.camelize(name.toString()));
		return new VariableEntry(methodName,typeName);
	}
	public String getTypeName(){
		return type.getName();
	}
	public Entry getImport(){
		return type.getImportPackage();
	}
	public VariableEntry get(String newMode){
		VariableEntry self = (VariableEntry)this.getSelf();
		VariableEntry ret = new VariableEntry(self);
		ret.setMode(mode);
		ret.setAccess(access);
		ret.setState(state);
		if((newMode.equals("PUBLIC"))){
			ret.setAccess(PUBLIC);
			return ret;
		}
		if((newMode.equals("PRIVATE"))){
			ret.setAccess(PRIVATE);
			return ret;
		}
		if((newMode.equals("PROTECTED"))){
			ret.setAccess(PROTECTED);
			return ret;
		}
		if((newMode.equals("STATIC"))){
			ret.setState(STATIC);
			return ret;
		}
		if((newMode.equals("FINAL"))){
			ret.setState(FINAL);
			return ret;
		}
		if((newMode.equals("STATIC_FINAL"))){
			ret.setState(3);
			return ret;
		}
		if((newMode.equals("HIDDEN"))){
			ret.setIsHidden(true);
			return ret;
		}
		if((newMode.equals("SIMPLE"))){
			ret.setMode(SIMPLE);
			ret.setAccess(DEFAULT);
			ret.setState(DEFAULT);
			return ret;
		}
		if((newMode.equals("DECLARATION"))){
			ret.setMode(DECLARATION);
			return ret;
		}
		if((newMode.equals("SHOW_TYPE"))){
			ret.setMode(SHOW_TYPE);
			return ret;
		}
		if((newMode.equals("SHOW_COMPLETE_TYPE"))){
			ret.setMode(SHOW_COMPLETE_TYPE);
			return ret;
		}
		if((newMode.equals("GET_METHOD"))){
			ret.setMode(GET_METHOD);
			return ret;
		}
		if((newMode.equals("SHOW_AS_GET"))){
			ret.setMode(SHOW_AS_GET);
			return ret;
		}
		if((newMode.equals("AS_PARAMETER"))){
			ret.setIsParameter(true);
			return ret;
		}
		if((newMode.equals("SHOW_AS_END"))){
			ret.setMode(SHOW_AS_END);
			return ret;
		}
		return ret;
	}
	public void setIsParameter(Boolean newIsParameter){
		isParameter = newIsParameter;
	}
	public void get(StringBuilder builder){
		if((access == PUBLIC && isParameter == false)){
			new StringEntry("public ").get(builder);
		}
		else if((access == PRIVATE && isParameter == false)){
			new StringEntry("private ").get(builder);
		}
		else if((access == PROTECTED && isParameter == false)){
			new StringEntry("protected ").get(builder);
		}
		if((state == STATIC || state == 3 && isParameter == false)){
			new StringEntry("static ").get(builder);
		}
		if((state == FINAL || state == 3 && isParameter == false)){
			new StringEntry("final ").get(builder);
		}
		if((mode == SIMPLE && isParameter == false)){
			new StringEntry(name).get(builder);
		}
		else if((mode == SIMPLE && isParameter == true)){
			new ElementEntry(GeneralGenerator.variableAsParameterElement,new ListEntry(new StringEntry(Generator.camelize(name.toString())))).get(builder);
		}
		else if((mode == WITH_TYPE && isParameter == false)){
			new ElementEntry(GeneralGenerator.typeAndNameElement,new ListEntry(type,new StringEntry(name))).get(builder);
		}
		else if((mode == WITH_TYPE && isParameter == true)){
			new ElementEntry(GeneralGenerator.typeAndNameElement,new ListEntry(type,new ElementEntry(GeneralGenerator.variableAsParameterElement,new ListEntry(new StringEntry(Generator.camelize(name.toString())))))).get(builder);
		}
		else if((mode == SHOW_COMPLETE_TYPE && isParameter == false)){
			new ElementEntry(GeneralGenerator.typeAndNameElement,new ListEntry(type.get("COMPLETE_NAME"),new StringEntry(name))).get(builder);
		}
		else if((mode == SHOW_COMPLETE_TYPE && isParameter == true)){
			new ElementEntry(GeneralGenerator.typeAndNameElement,new ListEntry(type.get("COMPLETE_NAME"),new ElementEntry(GeneralGenerator.variableAsParameterElement,new ListEntry(new StringEntry(Generator.camelize(name.toString())))))).get(builder);
		}
		else if((mode == DECLARATION)){
			new ElementEntry(GeneralGenerator.declareMemberElement,new ListEntry(type.get("COMPLETE_NAME"),new StringEntry(name),assignment)).get(builder);
		}
		else if((mode == GET_METHOD)){
			new ElementEntry(GeneralGenerator.declareGetMethodElement,new ListEntry(type,new StringEntry(Generator.camelize(name.toString())),new StringEntry(name))).get(builder);
		}
		else if((mode == SHOW_AS_GET)){
			new ElementEntry(GeneralGenerator.getCallElement,new ListEntry(new StringEntry(Generator.camelize(name.toString())))).get(builder);
		}
		else if((mode == SHOW_AS_END)){
			new ElementEntry(GeneralGenerator.exactElement,new ListEntry(ifEnd)).get(builder);
		}
	}
}