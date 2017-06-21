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

public class BodyOperatorEntry implements Entry,IBodyStatement {
	public BodyOperatorEntry getSelf(){
		return this;
	}


	private ListEntry importList = new SetEntry();
	private IBodyStatement left = (IBodyStatement)null;
	private String operator = null;
	private IBodyStatement right = (IBodyStatement)null;

	public BodyOperatorEntry(IBodyStatement iLeft,String iOperator,IBodyStatement iRight){
		left = iLeft;
		operator = iOperator;
		right = iRight;
	}
	public BodyOperatorEntry(IBodyStatement iLeft,String iOperator){
		left = iLeft;
		operator = iOperator;
	}
	public BodyOperatorEntry(IBodyStatement iLeft){
		left = iLeft;
	}
	public BodyOperatorEntry(Entry iLeft,String iOperator,Entry iRight){
		left = new BodyExactEntry(iLeft);
		operator = iOperator;
		right = new BodyExactEntry(iRight);
	}
	public BodyOperatorEntry(Entry iLeft,String iOperator){
		left = (IBodyStatement)iLeft;
		operator = iOperator;
	}
	public BodyOperatorEntry(Entry iLeft){
		left = new BodyExactEntry(iLeft);
	}

	public ListEntry getImportList(){
		return importList;
	}
	public Boolean hasEnd() {
		return true;
	}
	public IBodyStatement getLeft(){
		return left;
	}
	public String getOperator(){
		return operator;
	}
	public IBodyStatement getRight(){
		return right;
	}
	public void setRight(IBodyStatement newRight){
		right = newRight;
	}
	public void setRight(Entry newRight){
		right = new BodyExactEntry(newRight);
	}
	public void get(StringBuilder builder){
		importList.add(left.getImportList());
		if((right != null)){
			importList.add(right.getImportList());
		}
		if((right == null)){
			new ElementEntry(GeneralGenerator.exactElement,new ListEntry(left)).get(builder);
		}
		else {
			new ElementEntry(GeneralGenerator.operatorElement,new ListEntry(left,new StringEntry(operator),right)).get(builder);
		}
	}
}