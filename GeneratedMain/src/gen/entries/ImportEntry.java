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

public class ImportEntry implements Entry {
	public ImportEntry getSelf(){
		return this;
	}


	private String packageName = null;
	private String name = null;
	private String gamePackage = null;
	private Integer mode = 0;
	private ImportEntry superPackage = null;

	public ImportEntry(String initialPackage,String initialName){
		packageName = initialPackage;
		name = initialName;
		if((!packageName.startsWith("java"))){
			gamePackage = Generators.general.getPackageName();
		}
	}

	public String getPackageName(){
		return packageName;
	}
	public String getName(){
		return name;
	}
	public String getGamePackage(){
		return gamePackage;
	}
	public Integer getMode(){
		return mode;
	}	public ImportEntry getSuperPackage(){
		return superPackage;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setPackage(String newPackage){
		packageName = newPackage;
	}
	public void setSuperPackage(ImportEntry newSuperPackage){
		superPackage = newSuperPackage;
	}
	public Entry get(String option){
		if((superPackage != null)){
			return superPackage.get(option);
		}
		else {
			if((option.equals("AS_PACKAGE"))){
				return new ElementEntry(GeneralGenerator.declarePackageElement,new ListEntry(new StringEntry(gamePackage),new StringEntry(packageName),new StringEntry(name)));
			}
			if((option.equals("PLAIN"))){
				return new ElementEntry(GeneralGenerator.plainPackageElement,new ListEntry(new StringEntry(gamePackage),new StringEntry(packageName)));
			}
			else {
				return null;
			}
		}
	}
	public void get(StringBuilder builder){
		if((name.equals("void") || name.equals(""))){
			new ListEntry().get(builder);
		}
		else if((superPackage != null)){
			superPackage.get(builder);
		}
		else if((gamePackage != null)){
			new TabEntry(0,new ListEntry(new ElementEntry(GeneralGenerator.importGamePackageElement,new ListEntry(new StringEntry(gamePackage),new StringEntry(packageName),new StringEntry(name))))).get(builder);
		}
		else {
			new TabEntry(0,new ListEntry(new ElementEntry(GeneralGenerator.importStdPackageElement,new ListEntry(new StringEntry(packageName),new StringEntry(name))))).get(builder);
		}
	}
}