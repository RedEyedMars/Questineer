package gen;

import java.io.*;
import java.util.*;
import com.rem.parser.*;
import com.rem.parser.generation.*;
import com.rem.parser.token.*;
import com.rem.parser.parser.*;
import gen.checks.*;
import gen.entries.*;
import gen.properties.*;
import lists.*;

public class StdFlow extends FlowController {
	public static void main(String[] args){
		if(args.length==1){
			new StdFlow().parse(args[0]);
		}
		else {
			System.err.println("No filename provided!");
		}
	}


	private IParser rootParser = (IParser)Rules.base;
	private List<IParser> rules = (List<IParser>)Rules.parser;
	private List<IParser> listnames = (List<IParser>)Listnames.parser;
	private RegexParser lazyNameParser = (RegexParser)GeneralTokens.NAME;


	public IParser getRootParser(){
		return rootParser;
	}
	public List<IParser> getRules(){
		return rules;
	}
	public List<IParser> getListnames(){
		return listnames;
	}
	public RegexParser getLazyNameParser(){
		return lazyNameParser;
	}
	public void assignListElementNames(ParseContext context,IToken root){
		context.retainList(new HeroStats());
	}
	public String getDirectory(String fileName,String knownDirectory){
		return "../Resource/";
	}
	public void setup(ParseContext context){
	}
	public Generator[] getGenerators(){
		return Generators._;
	}
}