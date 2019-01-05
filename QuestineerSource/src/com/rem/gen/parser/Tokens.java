package com.rem.gen.parser;
import java.util.*;
import java.io.*;
import java.util.List;
import com.rem.gen.parser.Token;
import com.rem.gen.parser.Tokens;

public class Tokens{
	public Tokens() {
	}
	public static class Plain{
		public Plain() {
		}
		public static class Description extends Token.Parsed{
			protected String value = null;
			public Description(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public Description(final String value) {
				this.value = value;
			}
			public Description() {
			}
			public String getValue() {
				return value;
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._description;
			}
		}
		public static class VariableIndex extends Token.Parsed{
			protected String value = null;
			public VariableIndex(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public VariableIndex(final String value) {
				this.value = value;
			}
			public VariableIndex() {
			}
			public String getValue() {
				return value;
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._variableIndex;
			}
		}
	}
	public static class Syntax{
		public Syntax() {
		}
		public static class syntax_0 extends Token.Parsed{
			public static Tokens.Syntax.syntax_0 SYNTAX = new Tokens.Syntax.syntax_0(Token.Id._SYNTAX);
			public syntax_0(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_0() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_0 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "load";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_1 extends Token.Parsed{
			public static Tokens.Syntax.syntax_1 SYNTAX = new Tokens.Syntax.syntax_1(Token.Id._SYNTAX);
			public static Token.Parsed endLine = new Tokens.Syntax.syntax_1(Token.Id._endLine);
			public syntax_1(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_1() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_1 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "\\n";
			}
			public void setValue(String newValue) {
			}
			public void setEndLine(Token.Parsed newEndLine) {
				endLine = newEndLine;
			}
		}
		public static class syntax_2 extends Token.Parsed{
			public static Tokens.Syntax.syntax_2 SYNTAX = new Tokens.Syntax.syntax_2(Token.Id._SYNTAX);
			public syntax_2(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_2() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_2 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ">";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_3 extends Token.Parsed{
			public static Tokens.Syntax.syntax_3 SYNTAX = new Tokens.Syntax.syntax_3(Token.Id._SYNTAX);
			public syntax_3(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_3() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_3 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".asps";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_4 extends Token.Parsed{
			public static Tokens.Syntax.syntax_4 SYNTAX = new Tokens.Syntax.syntax_4(Token.Id._SYNTAX);
			public syntax_4(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_4() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_4 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".itms";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_5 extends Token.Parsed{
			public static Tokens.Syntax.syntax_5 SYNTAX = new Tokens.Syntax.syntax_5(Token.Id._SYNTAX);
			public syntax_5(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_5() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_5 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "\\n\\t";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_6 extends Token.Parsed{
			public static Tokens.Syntax.syntax_6 SYNTAX = new Tokens.Syntax.syntax_6(Token.Id._SYNTAX);
			public syntax_6(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_6() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_6 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "hp";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_7 extends Token.Parsed{
			public static Tokens.Syntax.syntax_7 SYNTAX = new Tokens.Syntax.syntax_7(Token.Id._SYNTAX);
			public syntax_7(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_7() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_7 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "dmg";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_8 extends Token.Parsed{
			public static Tokens.Syntax.syntax_8 SYNTAX = new Tokens.Syntax.syntax_8(Token.Id._SYNTAX);
			public syntax_8(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_8() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_8 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "def";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_9 extends Token.Parsed{
			public static Tokens.Syntax.syntax_9 SYNTAX = new Tokens.Syntax.syntax_9(Token.Id._SYNTAX);
			public syntax_9(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_9() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_9 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "value";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_10 extends Token.Parsed{
			public static Tokens.Syntax.syntax_10 SYNTAX = new Tokens.Syntax.syntax_10(Token.Id._SYNTAX);
			public syntax_10(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_10() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_10 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "weight";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_11 extends Token.Parsed{
			public static Tokens.Syntax.syntax_11 SYNTAX = new Tokens.Syntax.syntax_11(Token.Id._SYNTAX);
			public syntax_11(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_11() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_11 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "hit";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_12 extends Token.Parsed{
			public static Tokens.Syntax.syntax_12 SYNTAX = new Tokens.Syntax.syntax_12(Token.Id._SYNTAX);
			public syntax_12(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_12() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_12 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "\\n\\t\\t";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_13 extends Token.Parsed{
			public static Tokens.Syntax.syntax_13 SYNTAX = new Tokens.Syntax.syntax_13(Token.Id._SYNTAX);
			public syntax_13(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_13() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_13 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".afts";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_14 extends Token.Parsed{
			public static Tokens.Syntax.syntax_14 SYNTAX = new Tokens.Syntax.syntax_14(Token.Id._SYNTAX);
			public static Token.Parsed PLUS = new Tokens.Syntax.syntax_14(Token.Id._PLUS);
			public static Token.Parsed plus = new Tokens.Syntax.syntax_14(Token.Id._plus);
			public syntax_14(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_14() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_14 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "+";
			}
			public void setValue(String newValue) {
			}
			public void setPLUS(Token.Parsed newPLUS) {
				PLUS = newPLUS;
			}
			public void setPlus(Token.Parsed newPlus) {
				plus = newPlus;
			}
		}
		public static class syntax_15 extends Token.Parsed{
			public static Tokens.Syntax.syntax_15 SYNTAX = new Tokens.Syntax.syntax_15(Token.Id._SYNTAX);
			public static Token.Parsed MINUS = new Tokens.Syntax.syntax_15(Token.Id._MINUS);
			public static Token.Parsed minus = new Tokens.Syntax.syntax_15(Token.Id._minus);
			public syntax_15(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_15() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_15 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "-";
			}
			public void setValue(String newValue) {
			}
			public void setMINUS(Token.Parsed newMINUS) {
				MINUS = newMINUS;
			}
			public void setMinus(Token.Parsed newMinus) {
				minus = newMinus;
			}
		}
		public static class syntax_16 extends Token.Parsed{
			public static Tokens.Syntax.syntax_16 SYNTAX = new Tokens.Syntax.syntax_16(Token.Id._SYNTAX);
			public syntax_16(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_16() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_16 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".cnds";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_17 extends Token.Parsed{
			public static Tokens.Syntax.syntax_17 SYNTAX = new Tokens.Syntax.syntax_17(Token.Id._SYNTAX);
			public syntax_17(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_17() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_17 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "?";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_18 extends Token.Parsed{
			public static Tokens.Syntax.syntax_18 SYNTAX = new Tokens.Syntax.syntax_18(Token.Id._SYNTAX);
			public syntax_18(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_18() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_18 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "loss";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_19 extends Token.Parsed{
			public static Tokens.Syntax.syntax_19 SYNTAX = new Tokens.Syntax.syntax_19(Token.Id._SYNTAX);
			public static Token.Parsed MULTIPLY = new Tokens.Syntax.syntax_19(Token.Id._MULTIPLY);
			public static Token.Parsed defaultState = new Tokens.Syntax.syntax_19(Token.Id._defaultState);
			public static Token.Parsed multiply = new Tokens.Syntax.syntax_19(Token.Id._multiply);
			public syntax_19(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_19() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_19 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "*";
			}
			public void setValue(String newValue) {
			}
			public void setMULTIPLY(Token.Parsed newMULTIPLY) {
				MULTIPLY = newMULTIPLY;
			}
			public void setDefaultState(Token.Parsed newDefaultState) {
				defaultState = newDefaultState;
			}
			public void setMultiply(Token.Parsed newMultiply) {
				multiply = newMultiply;
			}
		}
		public static class syntax_20 extends Token.Parsed{
			public static Tokens.Syntax.syntax_20 SYNTAX = new Tokens.Syntax.syntax_20(Token.Id._SYNTAX);
			public syntax_20(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_20() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_20 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "accumulate";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_21 extends Token.Parsed{
			public static Tokens.Syntax.syntax_21 SYNTAX = new Tokens.Syntax.syntax_21(Token.Id._SYNTAX);
			public syntax_21(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_21() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_21 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".trts";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_22 extends Token.Parsed{
			public static Tokens.Syntax.syntax_22 SYNTAX = new Tokens.Syntax.syntax_22(Token.Id._SYNTAX);
			public syntax_22(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_22() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_22 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".atvs";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_23 extends Token.Parsed{
			public static Tokens.Syntax.syntax_23 SYNTAX = new Tokens.Syntax.syntax_23(Token.Id._SYNTAX);
			public syntax_23(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_23() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_23 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ",";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_24 extends Token.Parsed{
			public static Tokens.Syntax.syntax_24 SYNTAX = new Tokens.Syntax.syntax_24(Token.Id._SYNTAX);
			public syntax_24(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_24() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_24 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "get";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_25 extends Token.Parsed{
			public static Tokens.Syntax.syntax_25 SYNTAX = new Tokens.Syntax.syntax_25(Token.Id._SYNTAX);
			public syntax_25(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_25() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_25 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "target";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_26 extends Token.Parsed{
			public static Tokens.Syntax.syntax_26 SYNTAX = new Tokens.Syntax.syntax_26(Token.Id._SYNTAX);
			public syntax_26(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_26() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_26 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "destination";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_27 extends Token.Parsed{
			public static Tokens.Syntax.syntax_27 SYNTAX = new Tokens.Syntax.syntax_27(Token.Id._SYNTAX);
			public static Token.Parsed SUCCEED = new Tokens.Syntax.syntax_27(Token.Id._SUCCEED);
			public syntax_27(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_27() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_27 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "succeed";
			}
			public void setValue(String newValue) {
			}
			public void setSUCCEED(Token.Parsed newSUCCEED) {
				SUCCEED = newSUCCEED;
			}
		}
		public static class syntax_28 extends Token.Parsed{
			public static Tokens.Syntax.syntax_28 SYNTAX = new Tokens.Syntax.syntax_28(Token.Id._SYNTAX);
			public static Token.Parsed FAIL = new Tokens.Syntax.syntax_28(Token.Id._FAIL);
			public syntax_28(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_28() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_28 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "fail";
			}
			public void setValue(String newValue) {
			}
			public void setFAIL(Token.Parsed newFAIL) {
				FAIL = newFAIL;
			}
		}
		public static class syntax_29 extends Token.Parsed{
			public static Tokens.Syntax.syntax_29 SYNTAX = new Tokens.Syntax.syntax_29(Token.Id._SYNTAX);
			public syntax_29(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_29() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_29 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "listen";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_30 extends Token.Parsed{
			public static Tokens.Syntax.syntax_30 SYNTAX = new Tokens.Syntax.syntax_30(Token.Id._SYNTAX);
			public syntax_30(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_30() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_30 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "step";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_31 extends Token.Parsed{
			public static Tokens.Syntax.syntax_31 SYNTAX = new Tokens.Syntax.syntax_31(Token.Id._SYNTAX);
			public syntax_31(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_31() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_31 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".qsts";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_32 extends Token.Parsed{
			public static Tokens.Syntax.syntax_32 SYNTAX = new Tokens.Syntax.syntax_32(Token.Id._SYNTAX);
			public syntax_32(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_32() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_32 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "type";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_33 extends Token.Parsed{
			public static Tokens.Syntax.syntax_33 SYNTAX = new Tokens.Syntax.syntax_33(Token.Id._SYNTAX);
			public syntax_33(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_33() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_33 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "start";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_34 extends Token.Parsed{
			public static Tokens.Syntax.syntax_34 SYNTAX = new Tokens.Syntax.syntax_34(Token.Id._SYNTAX);
			public syntax_34(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_34() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_34 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "goto";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_35 extends Token.Parsed{
			public static Tokens.Syntax.syntax_35 SYNTAX = new Tokens.Syntax.syntax_35(Token.Id._SYNTAX);
			public syntax_35(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_35() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_35 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "|";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_36 extends Token.Parsed{
			public static Tokens.Syntax.syntax_36 SYNTAX = new Tokens.Syntax.syntax_36(Token.Id._SYNTAX);
			public syntax_36(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_36() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_36 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "reach";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_37 extends Token.Parsed{
			public static Tokens.Syntax.syntax_37 SYNTAX = new Tokens.Syntax.syntax_37(Token.Id._SYNTAX);
			public syntax_37(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_37() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_37 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".atks";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_38 extends Token.Parsed{
			public static Tokens.Syntax.syntax_38 SYNTAX = new Tokens.Syntax.syntax_38(Token.Id._SYNTAX);
			public syntax_38(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_38() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_38 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "comments";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_39 extends Token.Parsed{
			public static Tokens.Syntax.syntax_39 SYNTAX = new Tokens.Syntax.syntax_39(Token.Id._SYNTAX);
			public syntax_39(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_39() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_39 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "range";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_40 extends Token.Parsed{
			public static Tokens.Syntax.syntax_40 SYNTAX = new Tokens.Syntax.syntax_40(Token.Id._SYNTAX);
			public syntax_40(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_40() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_40 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "cd";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_41 extends Token.Parsed{
			public static Tokens.Syntax.syntax_41 SYNTAX = new Tokens.Syntax.syntax_41(Token.Id._SYNTAX);
			public syntax_41(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_41() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_41 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "body";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_42 extends Token.Parsed{
			public static Tokens.Syntax.syntax_42 SYNTAX = new Tokens.Syntax.syntax_42(Token.Id._SYNTAX);
			public syntax_42(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_42() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_42 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "mind";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_43 extends Token.Parsed{
			public static Tokens.Syntax.syntax_43 SYNTAX = new Tokens.Syntax.syntax_43(Token.Id._SYNTAX);
			public syntax_43(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_43() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_43 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "damage";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_44 extends Token.Parsed{
			public static Tokens.Syntax.syntax_44 SYNTAX = new Tokens.Syntax.syntax_44(Token.Id._SYNTAX);
			public syntax_44(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_44() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_44 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "miss";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_45 extends Token.Parsed{
			public static Tokens.Syntax.syntax_45 SYNTAX = new Tokens.Syntax.syntax_45(Token.Id._SYNTAX);
			public syntax_45(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_45() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_45 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".sups";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_46 extends Token.Parsed{
			public static Tokens.Syntax.syntax_46 SYNTAX = new Tokens.Syntax.syntax_46(Token.Id._SYNTAX);
			public syntax_46(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_46() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_46 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".skls";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_47 extends Token.Parsed{
			public static Tokens.Syntax.syntax_47 SYNTAX = new Tokens.Syntax.syntax_47(Token.Id._SYNTAX);
			public syntax_47(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_47() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_47 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "use";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_48 extends Token.Parsed{
			public static Tokens.Syntax.syntax_48 SYNTAX = new Tokens.Syntax.syntax_48(Token.Id._SYNTAX);
			public syntax_48(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_48() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_48 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".asos";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_49 extends Token.Parsed{
			public static Tokens.Syntax.syntax_49 SYNTAX = new Tokens.Syntax.syntax_49(Token.Id._SYNTAX);
			public syntax_49(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_49() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_49 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "on";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_50 extends Token.Parsed{
			public static Tokens.Syntax.syntax_50 SYNTAX = new Tokens.Syntax.syntax_50(Token.Id._SYNTAX);
			public syntax_50(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_50() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_50 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "join";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_51 extends Token.Parsed{
			public static Tokens.Syntax.syntax_51 SYNTAX = new Tokens.Syntax.syntax_51(Token.Id._SYNTAX);
			public syntax_51(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_51() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_51 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".rsns";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_52 extends Token.Parsed{
			public static Tokens.Syntax.syntax_52 SYNTAX = new Tokens.Syntax.syntax_52(Token.Id._SYNTAX);
			public syntax_52(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_52() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_52 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "$";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_53 extends Token.Parsed{
			public static Tokens.Syntax.syntax_53 SYNTAX = new Tokens.Syntax.syntax_53(Token.Id._SYNTAX);
			public static Token.Parsed DIVIDE = new Tokens.Syntax.syntax_53(Token.Id._DIVIDE);
			public static Token.Parsed divide = new Tokens.Syntax.syntax_53(Token.Id._divide);
			public syntax_53(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_53() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_53 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "/";
			}
			public void setValue(String newValue) {
			}
			public void setDIVIDE(Token.Parsed newDIVIDE) {
				DIVIDE = newDIVIDE;
			}
			public void setDivide(Token.Parsed newDivide) {
				divide = newDivide;
			}
		}
		public static class syntax_54 extends Token.Parsed{
			public static Tokens.Syntax.syntax_54 SYNTAX = new Tokens.Syntax.syntax_54(Token.Id._SYNTAX);
			public static Token.Parsed left_DAYS = new Tokens.Syntax.syntax_54(Token.Id._left_DAYS);
			public static Token.Parsed right_DAYS = new Tokens.Syntax.syntax_54(Token.Id._right_DAYS);
			public syntax_54(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_54() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_54 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "d";
			}
			public void setValue(String newValue) {
			}
			public void setLeftDAYS(Token.Parsed newLeftDAYS) {
				left_DAYS = newLeftDAYS;
			}
			public void setRightDAYS(Token.Parsed newRightDAYS) {
				right_DAYS = newRightDAYS;
			}
		}
		public static class syntax_55 extends Token.Parsed{
			public static Tokens.Syntax.syntax_55 SYNTAX = new Tokens.Syntax.syntax_55(Token.Id._SYNTAX);
			public syntax_55(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_55() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_55 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "..";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_56 extends Token.Parsed{
			public static Tokens.Syntax.syntax_56 SYNTAX = new Tokens.Syntax.syntax_56(Token.Id._SYNTAX);
			public static Token.Parsed percent = new Tokens.Syntax.syntax_56(Token.Id._percent);
			public syntax_56(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_56() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_56 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "%";
			}
			public void setValue(String newValue) {
			}
			public void setPercent(Token.Parsed newPercent) {
				percent = newPercent;
			}
		}
		public static class syntax_57 extends Token.Parsed{
			public static Tokens.Syntax.syntax_57 SYNTAX = new Tokens.Syntax.syntax_57(Token.Id._SYNTAX);
			public syntax_57(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_57() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_57 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "->";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_58 extends Token.Parsed{
			public static Tokens.Syntax.syntax_58 SYNTAX = new Tokens.Syntax.syntax_58(Token.Id._SYNTAX);
			public syntax_58(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_58() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_58 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Hints";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_59 extends Token.Parsed{
			public static Tokens.Syntax.syntax_59 SYNTAX = new Tokens.Syntax.syntax_59(Token.Id._SYNTAX);
			public syntax_59(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_59() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_59 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ":";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_60 extends Token.Parsed{
			public static Tokens.Syntax.syntax_60 SYNTAX = new Tokens.Syntax.syntax_60(Token.Id._SYNTAX);
			public syntax_60(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_60() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_60 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Trails";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_61 extends Token.Parsed{
			public static Tokens.Syntax.syntax_61 SYNTAX = new Tokens.Syntax.syntax_61(Token.Id._SYNTAX);
			public syntax_61(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_61() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_61 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Connect";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_62 extends Token.Parsed{
			public static Tokens.Syntax.syntax_62 SYNTAX = new Tokens.Syntax.syntax_62(Token.Id._SYNTAX);
			public syntax_62(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_62() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_62 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "from";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_63 extends Token.Parsed{
			public static Tokens.Syntax.syntax_63 SYNTAX = new Tokens.Syntax.syntax_63(Token.Id._SYNTAX);
			public syntax_63(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_63() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_63 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "to";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_64 extends Token.Parsed{
			public static Tokens.Syntax.syntax_64 SYNTAX = new Tokens.Syntax.syntax_64(Token.Id._SYNTAX);
			public syntax_64(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_64() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_64 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Buildings";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_65 extends Token.Parsed{
			public static Tokens.Syntax.syntax_65 SYNTAX = new Tokens.Syntax.syntax_65(Token.Id._SYNTAX);
			public syntax_65(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_65() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_65 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "\\n\\t\\t\\t";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_66 extends Token.Parsed{
			public static Tokens.Syntax.syntax_66 SYNTAX = new Tokens.Syntax.syntax_66(Token.Id._SYNTAX);
			public syntax_66(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_66() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_66 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".maps";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_67 extends Token.Parsed{
			public static Tokens.Syntax.syntax_67 SYNTAX = new Tokens.Syntax.syntax_67(Token.Id._SYNTAX);
			public syntax_67(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_67() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_67 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Rectangle";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_68 extends Token.Parsed{
			public static Tokens.Syntax.syntax_68 SYNTAX = new Tokens.Syntax.syntax_68(Token.Id._SYNTAX);
			public syntax_68(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_68() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_68 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "&";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_69 extends Token.Parsed{
			public static Tokens.Syntax.syntax_69 SYNTAX = new Tokens.Syntax.syntax_69(Token.Id._SYNTAX);
			public static Token.Parsed findType = new Tokens.Syntax.syntax_69(Token.Id._findType);
			public static Token.Parsed space = new Tokens.Syntax.syntax_69(Token.Id._space);
			public syntax_69(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_69() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_69 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".";
			}
			public void setValue(String newValue) {
			}
			public void setFindType(Token.Parsed newFindType) {
				findType = newFindType;
			}
			public void setSpace(Token.Parsed newSpace) {
				space = newSpace;
			}
		}
		public static class syntax_70 extends Token.Parsed{
			public static Tokens.Syntax.syntax_70 SYNTAX = new Tokens.Syntax.syntax_70(Token.Id._SYNTAX);
			public syntax_70(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_70() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_70 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "as";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_71 extends Token.Parsed{
			public static Tokens.Syntax.syntax_71 SYNTAX = new Tokens.Syntax.syntax_71(Token.Id._SYNTAX);
			public syntax_71(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_71() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_71 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "in";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_72 extends Token.Parsed{
			public static Tokens.Syntax.syntax_72 SYNTAX = new Tokens.Syntax.syntax_72(Token.Id._SYNTAX);
			public static Token.Parsed offside = new Tokens.Syntax.syntax_72(Token.Id._offside);
			public syntax_72(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_72() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_72 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "OffSide";
			}
			public void setValue(String newValue) {
			}
			public void setOffside(Token.Parsed newOffside) {
				offside = newOffside;
			}
		}
		public static class syntax_73 extends Token.Parsed{
			public static Tokens.Syntax.syntax_73 SYNTAX = new Tokens.Syntax.syntax_73(Token.Id._SYNTAX);
			public syntax_73(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_73() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_73 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Sides";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_74 extends Token.Parsed{
			public static Tokens.Syntax.syntax_74 SYNTAX = new Tokens.Syntax.syntax_74(Token.Id._SYNTAX);
			public syntax_74(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_74() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_74 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".tile";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_75 extends Token.Parsed{
			public static Tokens.Syntax.syntax_75 SYNTAX = new Tokens.Syntax.syntax_75(Token.Id._SYNTAX);
			public syntax_75(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_75() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_75 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Floor";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_76 extends Token.Parsed{
			public static Tokens.Syntax.syntax_76 SYNTAX = new Tokens.Syntax.syntax_76(Token.Id._SYNTAX);
			public syntax_76(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_76() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_76 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Edge";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_77 extends Token.Parsed{
			public static Tokens.Syntax.syntax_77 SYNTAX = new Tokens.Syntax.syntax_77(Token.Id._SYNTAX);
			public syntax_77(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_77() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_77 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Terrain";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_78 extends Token.Parsed{
			public static Tokens.Syntax.syntax_78 SYNTAX = new Tokens.Syntax.syntax_78(Token.Id._SYNTAX);
			public syntax_78(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_78() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_78 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Dens";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_79 extends Token.Parsed{
			public static Tokens.Syntax.syntax_79 SYNTAX = new Tokens.Syntax.syntax_79(Token.Id._SYNTAX);
			public syntax_79(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_79() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_79 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Chests";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_80 extends Token.Parsed{
			public static Tokens.Syntax.syntax_80 SYNTAX = new Tokens.Syntax.syntax_80(Token.Id._SYNTAX);
			public syntax_80(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_80() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_80 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Circle";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_81 extends Token.Parsed{
			public static Tokens.Syntax.syntax_81 SYNTAX = new Tokens.Syntax.syntax_81(Token.Id._SYNTAX);
			public syntax_81(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_81() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_81 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Court";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_82 extends Token.Parsed{
			public static Tokens.Syntax.syntax_82 SYNTAX = new Tokens.Syntax.syntax_82(Token.Id._SYNTAX);
			public syntax_82(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_82() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_82 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Square";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_83 extends Token.Parsed{
			public static Tokens.Syntax.syntax_83 SYNTAX = new Tokens.Syntax.syntax_83(Token.Id._SYNTAX);
			public syntax_83(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_83() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_83 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "North";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_84 extends Token.Parsed{
			public static Tokens.Syntax.syntax_84 SYNTAX = new Tokens.Syntax.syntax_84(Token.Id._SYNTAX);
			public syntax_84(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_84() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_84 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "East";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_85 extends Token.Parsed{
			public static Tokens.Syntax.syntax_85 SYNTAX = new Tokens.Syntax.syntax_85(Token.Id._SYNTAX);
			public syntax_85(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_85() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_85 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "South";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_86 extends Token.Parsed{
			public static Tokens.Syntax.syntax_86 SYNTAX = new Tokens.Syntax.syntax_86(Token.Id._SYNTAX);
			public syntax_86(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_86() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_86 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "West";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_87 extends Token.Parsed{
			public static Tokens.Syntax.syntax_87 SYNTAX = new Tokens.Syntax.syntax_87(Token.Id._SYNTAX);
			public syntax_87(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_87() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_87 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "==";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_88 extends Token.Parsed{
			public static Tokens.Syntax.syntax_88 SYNTAX = new Tokens.Syntax.syntax_88(Token.Id._SYNTAX);
			public syntax_88(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_88() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_88 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "!=";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_89 extends Token.Parsed{
			public static Tokens.Syntax.syntax_89 SYNTAX = new Tokens.Syntax.syntax_89(Token.Id._SYNTAX);
			public static Token.Parsed IF = new Tokens.Syntax.syntax_89(Token.Id._IF);
			public syntax_89(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_89() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_89 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "if";
			}
			public void setValue(String newValue) {
			}
			public void setIF(Token.Parsed newIF) {
				IF = newIF;
			}
		}
		public static class syntax_90 extends Token.Parsed{
			public static Tokens.Syntax.syntax_90 SYNTAX = new Tokens.Syntax.syntax_90(Token.Id._SYNTAX);
			public syntax_90(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_90() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_90 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Neighbour";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_91 extends Token.Parsed{
			public static Tokens.Syntax.syntax_91 SYNTAX = new Tokens.Syntax.syntax_91(Token.Id._SYNTAX);
			public syntax_91(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_91() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_91 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Direction";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_92 extends Token.Parsed{
			public static Tokens.Syntax.syntax_92 SYNTAX = new Tokens.Syntax.syntax_92(Token.Id._SYNTAX);
			public syntax_92(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_92() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_92 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "null";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_93 extends Token.Parsed{
			public static Tokens.Syntax.syntax_93 SYNTAX = new Tokens.Syntax.syntax_93(Token.Id._SYNTAX);
			public syntax_93(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_93() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_93 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "::";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_94 extends Token.Parsed{
			public static Tokens.Syntax.syntax_94 SYNTAX = new Tokens.Syntax.syntax_94(Token.Id._SYNTAX);
			public static Token.Parsed IMPASSABLE = new Tokens.Syntax.syntax_94(Token.Id._IMPASSABLE);
			public syntax_94(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_94() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_94 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Impassable";
			}
			public void setValue(String newValue) {
			}
			public void setIMPASSABLE(Token.Parsed newIMPASSABLE) {
				IMPASSABLE = newIMPASSABLE;
			}
		}
		public static class syntax_95 extends Token.Parsed{
			public static Tokens.Syntax.syntax_95 SYNTAX = new Tokens.Syntax.syntax_95(Token.Id._SYNTAX);
			public static Token.Parsed PASSABLE = new Tokens.Syntax.syntax_95(Token.Id._PASSABLE);
			public syntax_95(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_95() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_95 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Passable";
			}
			public void setValue(String newValue) {
			}
			public void setPASSABLE(Token.Parsed newPASSABLE) {
				PASSABLE = newPASSABLE;
			}
		}
		public static class syntax_96 extends Token.Parsed{
			public static Tokens.Syntax.syntax_96 SYNTAX = new Tokens.Syntax.syntax_96(Token.Id._SYNTAX);
			public syntax_96(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_96() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_96 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ";";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_97 extends Token.Parsed{
			public static Tokens.Syntax.syntax_97 SYNTAX = new Tokens.Syntax.syntax_97(Token.Id._SYNTAX);
			public static Token.Parsed FREE = new Tokens.Syntax.syntax_97(Token.Id._FREE);
			public syntax_97(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_97() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_97 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Free";
			}
			public void setValue(String newValue) {
			}
			public void setFREE(Token.Parsed newFREE) {
				FREE = newFREE;
			}
		}
		public static class syntax_98 extends Token.Parsed{
			public static Tokens.Syntax.syntax_98 SYNTAX = new Tokens.Syntax.syntax_98(Token.Id._SYNTAX);
			public syntax_98(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_98() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_98 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".payment";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_99 extends Token.Parsed{
			public static Tokens.Syntax.syntax_99 SYNTAX = new Tokens.Syntax.syntax_99(Token.Id._SYNTAX);
			public syntax_99(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_99() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_99 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".evts";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_100 extends Token.Parsed{
			public static Tokens.Syntax.syntax_100 SYNTAX = new Tokens.Syntax.syntax_100(Token.Id._SYNTAX);
			public syntax_100(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_100() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_100 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "!";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_101 extends Token.Parsed{
			public static Tokens.Syntax.syntax_101 SYNTAX = new Tokens.Syntax.syntax_101(Token.Id._SYNTAX);
			public syntax_101(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_101() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_101 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "+=";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_102 extends Token.Parsed{
			public static Tokens.Syntax.syntax_102 SYNTAX = new Tokens.Syntax.syntax_102(Token.Id._SYNTAX);
			public syntax_102(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_102() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_102 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "-=";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_103 extends Token.Parsed{
			public static Tokens.Syntax.syntax_103 SYNTAX = new Tokens.Syntax.syntax_103(Token.Id._SYNTAX);
			public syntax_103(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_103() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_103 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "=";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_104 extends Token.Parsed{
			public static Tokens.Syntax.syntax_104 SYNTAX = new Tokens.Syntax.syntax_104(Token.Id._SYNTAX);
			public syntax_104(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_104() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_104 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "gains";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_105 extends Token.Parsed{
			public static Tokens.Syntax.syntax_105 SYNTAX = new Tokens.Syntax.syntax_105(Token.Id._SYNTAX);
			public syntax_105(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_105() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_105 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "equip";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_106 extends Token.Parsed{
			public static Tokens.Syntax.syntax_106 SYNTAX = new Tokens.Syntax.syntax_106(Token.Id._SYNTAX);
			public syntax_106(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_106() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_106 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "loses";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_107 extends Token.Parsed{
			public static Tokens.Syntax.syntax_107 SYNTAX = new Tokens.Syntax.syntax_107(Token.Id._SYNTAX);
			public syntax_107(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_107() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_107 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "unequip";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_108 extends Token.Parsed{
			public static Tokens.Syntax.syntax_108 SYNTAX = new Tokens.Syntax.syntax_108(Token.Id._SYNTAX);
			public static Token.Parsed THIS = new Tokens.Syntax.syntax_108(Token.Id._THIS);
			public syntax_108(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_108() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_108 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "this";
			}
			public void setValue(String newValue) {
			}
			public void setTHIS(Token.Parsed newTHIS) {
				THIS = newTHIS;
			}
		}
		public static class syntax_109 extends Token.Parsed{
			public static Tokens.Syntax.syntax_109 SYNTAX = new Tokens.Syntax.syntax_109(Token.Id._SYNTAX);
			public static Token.Parsed impose = new Tokens.Syntax.syntax_109(Token.Id._impose);
			public syntax_109(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_109() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_109 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "impose";
			}
			public void setValue(String newValue) {
			}
			public void setImpose(Token.Parsed newImpose) {
				impose = newImpose;
			}
		}
		public static class syntax_110 extends Token.Parsed{
			public static Tokens.Syntax.syntax_110 SYNTAX = new Tokens.Syntax.syntax_110(Token.Id._SYNTAX);
			public static Token.Parsed release = new Tokens.Syntax.syntax_110(Token.Id._release);
			public syntax_110(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_110() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_110 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "release";
			}
			public void setValue(String newValue) {
			}
			public void setRelease(Token.Parsed newRelease) {
				release = newRelease;
			}
		}
		public static class syntax_111 extends Token.Parsed{
			public static Tokens.Syntax.syntax_111 SYNTAX = new Tokens.Syntax.syntax_111(Token.Id._SYNTAX);
			public syntax_111(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_111() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_111 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "influence";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_112 extends Token.Parsed{
			public static Tokens.Syntax.syntax_112 SYNTAX = new Tokens.Syntax.syntax_112(Token.Id._SYNTAX);
			public syntax_112(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_112() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_112 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "because";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_113 extends Token.Parsed{
			public static Tokens.Syntax.syntax_113 SYNTAX = new Tokens.Syntax.syntax_113(Token.Id._SYNTAX);
			public syntax_113(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_113() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_113 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "<<";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_114 extends Token.Parsed{
			public static Tokens.Syntax.syntax_114 SYNTAX = new Tokens.Syntax.syntax_114(Token.Id._SYNTAX);
			public syntax_114(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_114() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_114 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "spawn";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_115 extends Token.Parsed{
			public static Tokens.Syntax.syntax_115 SYNTAX = new Tokens.Syntax.syntax_115(Token.Id._SYNTAX);
			public syntax_115(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_115() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_115 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "around";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_116 extends Token.Parsed{
			public static Tokens.Syntax.syntax_116 SYNTAX = new Tokens.Syntax.syntax_116(Token.Id._SYNTAX);
			public syntax_116(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_116() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_116 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "at";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_117 extends Token.Parsed{
			public static Tokens.Syntax.syntax_117 SYNTAX = new Tokens.Syntax.syntax_117(Token.Id._SYNTAX);
			public static Token.Parsed ELSE = new Tokens.Syntax.syntax_117(Token.Id._ELSE);
			public syntax_117(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_117() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_117 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "else";
			}
			public void setValue(String newValue) {
			}
			public void setELSE(Token.Parsed newELSE) {
				ELSE = newELSE;
			}
		}
		public static class syntax_118 extends Token.Parsed{
			public static Tokens.Syntax.syntax_118 SYNTAX = new Tokens.Syntax.syntax_118(Token.Id._SYNTAX);
			public syntax_118(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_118() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_118 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "and";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_119 extends Token.Parsed{
			public static Tokens.Syntax.syntax_119 SYNTAX = new Tokens.Syntax.syntax_119(Token.Id._SYNTAX);
			public syntax_119(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_119() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_119 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "for";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_120 extends Token.Parsed{
			public static Tokens.Syntax.syntax_120 SYNTAX = new Tokens.Syntax.syntax_120(Token.Id._SYNTAX);
			public syntax_120(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_120() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_120 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "while";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_121 extends Token.Parsed{
			public static Tokens.Syntax.syntax_121 SYNTAX = new Tokens.Syntax.syntax_121(Token.Id._SYNTAX);
			public syntax_121(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_121() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_121 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "chance";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_122 extends Token.Parsed{
			public static Tokens.Syntax.syntax_122 SYNTAX = new Tokens.Syntax.syntax_122(Token.Id._SYNTAX);
			public syntax_122(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_122() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_122 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "is";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_123 extends Token.Parsed{
			public static Tokens.Syntax.syntax_123 SYNTAX = new Tokens.Syntax.syntax_123(Token.Id._SYNTAX);
			public syntax_123(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_123() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_123 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "a";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_124 extends Token.Parsed{
			public static Tokens.Syntax.syntax_124 SYNTAX = new Tokens.Syntax.syntax_124(Token.Id._SYNTAX);
			public syntax_124(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_124() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_124 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "spawned";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_125 extends Token.Parsed{
			public static Tokens.Syntax.syntax_125 SYNTAX = new Tokens.Syntax.syntax_125(Token.Id._SYNTAX);
			public syntax_125(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_125() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_125 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "has";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_126 extends Token.Parsed{
			public static Tokens.Syntax.syntax_126 SYNTAX = new Tokens.Syntax.syntax_126(Token.Id._SYNTAX);
			public syntax_126(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_126() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_126 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "stat";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_127 extends Token.Parsed{
			public static Tokens.Syntax.syntax_127 SYNTAX = new Tokens.Syntax.syntax_127(Token.Id._SYNTAX);
			public syntax_127(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_127() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_127 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "attack";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_128 extends Token.Parsed{
			public static Tokens.Syntax.syntax_128 SYNTAX = new Tokens.Syntax.syntax_128(Token.Id._SYNTAX);
			public syntax_128(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_128() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_128 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "exp";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_129 extends Token.Parsed{
			public static Tokens.Syntax.syntax_129 SYNTAX = new Tokens.Syntax.syntax_129(Token.Id._SYNTAX);
			public syntax_129(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_129() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_129 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "trait";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_130 extends Token.Parsed{
			public static Tokens.Syntax.syntax_130 SYNTAX = new Tokens.Syntax.syntax_130(Token.Id._SYNTAX);
			public syntax_130(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_130() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_130 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "of";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_131 extends Token.Parsed{
			public static Tokens.Syntax.syntax_131 SYNTAX = new Tokens.Syntax.syntax_131(Token.Id._SYNTAX);
			public syntax_131(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_131() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_131 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "association";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_132 extends Token.Parsed{
			public static Tokens.Syntax.syntax_132 SYNTAX = new Tokens.Syntax.syntax_132(Token.Id._SYNTAX);
			public syntax_132(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_132() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_132 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "with";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_133 extends Token.Parsed{
			public static Tokens.Syntax.syntax_133 SYNTAX = new Tokens.Syntax.syntax_133(Token.Id._SYNTAX);
			public syntax_133(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_133() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_133 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "skill";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_134 extends Token.Parsed{
			public static Tokens.Syntax.syntax_134 SYNTAX = new Tokens.Syntax.syntax_134(Token.Id._SYNTAX);
			public syntax_134(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_134() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_134 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "return";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_135 extends Token.Parsed{
			public static Tokens.Syntax.syntax_135 SYNTAX = new Tokens.Syntax.syntax_135(Token.Id._SYNTAX);
			public syntax_135(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_135() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_135 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Entity";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_136 extends Token.Parsed{
			public static Tokens.Syntax.syntax_136 SYNTAX = new Tokens.Syntax.syntax_136(Token.Id._SYNTAX);
			public syntax_136(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_136() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_136 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "true";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_137 extends Token.Parsed{
			public static Tokens.Syntax.syntax_137 SYNTAX = new Tokens.Syntax.syntax_137(Token.Id._SYNTAX);
			public syntax_137(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_137() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_137 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "false";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_138 extends Token.Parsed{
			public static Tokens.Syntax.syntax_138 SYNTAX = new Tokens.Syntax.syntax_138(Token.Id._SYNTAX);
			public syntax_138(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_138() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_138 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "<-";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_139 extends Token.Parsed{
			public static Tokens.Syntax.syntax_139 SYNTAX = new Tokens.Syntax.syntax_139(Token.Id._SYNTAX);
			public syntax_139(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_139() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_139 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "=>";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_140 extends Token.Parsed{
			public static Tokens.Syntax.syntax_140 SYNTAX = new Tokens.Syntax.syntax_140(Token.Id._SYNTAX);
			public syntax_140(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_140() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_140 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "group";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_141 extends Token.Parsed{
			public static Tokens.Syntax.syntax_141 SYNTAX = new Tokens.Syntax.syntax_141(Token.Id._SYNTAX);
			public syntax_141(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_141() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_141 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "affinity";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_142 extends Token.Parsed{
			public static Tokens.Syntax.syntax_142 SYNTAX = new Tokens.Syntax.syntax_142(Token.Id._SYNTAX);
			public syntax_142(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_142() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_142 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "condition";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_143 extends Token.Parsed{
			public static Tokens.Syntax.syntax_143 SYNTAX = new Tokens.Syntax.syntax_143(Token.Id._SYNTAX);
			public syntax_143(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_143() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_143 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "activity";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_144 extends Token.Parsed{
			public static Tokens.Syntax.syntax_144 SYNTAX = new Tokens.Syntax.syntax_144(Token.Id._SYNTAX);
			public syntax_144(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_144() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_144 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "practice";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_145 extends Token.Parsed{
			public static Tokens.Syntax.syntax_145 SYNTAX = new Tokens.Syntax.syntax_145(Token.Id._SYNTAX);
			public syntax_145(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_145() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_145 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "map";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_146 extends Token.Parsed{
			public static Tokens.Syntax.syntax_146 SYNTAX = new Tokens.Syntax.syntax_146(Token.Id._SYNTAX);
			public syntax_146(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_146() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_146 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "tile";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_147 extends Token.Parsed{
			public static Tokens.Syntax.syntax_147 SYNTAX = new Tokens.Syntax.syntax_147(Token.Id._SYNTAX);
			public static Token.Parsed NEW = new Tokens.Syntax.syntax_147(Token.Id._NEW);
			public syntax_147(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_147() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_147 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "new";
			}
			public void setValue(String newValue) {
			}
			public void setNEW(Token.Parsed newNEW) {
				NEW = newNEW;
			}
		}
		public static class syntax_148 extends Token.Parsed{
			public static Tokens.Syntax.syntax_148 SYNTAX = new Tokens.Syntax.syntax_148(Token.Id._SYNTAX);
			public syntax_148(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_148() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_148 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Map";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_149 extends Token.Parsed{
			public static Tokens.Syntax.syntax_149 SYNTAX = new Tokens.Syntax.syntax_149(Token.Id._SYNTAX);
			public static Token.Parsed isListToken = new Tokens.Syntax.syntax_149(Token.Id._isListToken);
			public syntax_149(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_149() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_149 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "[]";
			}
			public void setValue(String newValue) {
			}
			public void setIsListToken(Token.Parsed newIsListToken) {
				isListToken = newIsListToken;
			}
		}
		public static class syntax_150 extends Token.Parsed{
			public static Tokens.Syntax.syntax_150 SYNTAX = new Tokens.Syntax.syntax_150(Token.Id._SYNTAX);
			public syntax_150(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_150() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_150 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".animationTypes";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_151 extends Token.Parsed{
			public static Tokens.Syntax.syntax_151 SYNTAX = new Tokens.Syntax.syntax_151(Token.Id._SYNTAX);
			public syntax_151(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_151() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_151 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "<=";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_152 extends Token.Parsed{
			public static Tokens.Syntax.syntax_152 SYNTAX = new Tokens.Syntax.syntax_152(Token.Id._SYNTAX);
			public syntax_152(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_152() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_152 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ">=";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_153 extends Token.Parsed{
			public static Tokens.Syntax.syntax_153 SYNTAX = new Tokens.Syntax.syntax_153(Token.Id._SYNTAX);
			public syntax_153(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_153() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_153 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "<";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_154 extends Token.Parsed{
			public static Tokens.Syntax.syntax_154 SYNTAX = new Tokens.Syntax.syntax_154(Token.Id._SYNTAX);
			public syntax_154(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_154() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_154 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".imgs";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_155 extends Token.Parsed{
			public static Tokens.Syntax.syntax_155 SYNTAX = new Tokens.Syntax.syntax_155(Token.Id._SYNTAX);
			public syntax_155(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_155() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_155 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".png";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_156 extends Token.Parsed{
			public static Tokens.Syntax.syntax_156 SYNTAX = new Tokens.Syntax.syntax_156(Token.Id._SYNTAX);
			public syntax_156(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_156() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_156 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".dwbs";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_157 extends Token.Parsed{
			public static Tokens.Syntax.syntax_157 SYNTAX = new Tokens.Syntax.syntax_157(Token.Id._SYNTAX);
			public static Token.Parsed x = new Tokens.Syntax.syntax_157(Token.Id._x);
			public syntax_157(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_157() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_157 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "X";
			}
			public void setValue(String newValue) {
			}
			public void setX(Token.Parsed newX) {
				x = newX;
			}
		}
		public static class syntax_158 extends Token.Parsed{
			public static Tokens.Syntax.syntax_158 SYNTAX = new Tokens.Syntax.syntax_158(Token.Id._SYNTAX);
			public static Token.Parsed y = new Tokens.Syntax.syntax_158(Token.Id._y);
			public syntax_158(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_158() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_158 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Y";
			}
			public void setValue(String newValue) {
			}
			public void setY(Token.Parsed newY) {
				y = newY;
			}
		}
		public static class syntax_159 extends Token.Parsed{
			public static Tokens.Syntax.syntax_159 SYNTAX = new Tokens.Syntax.syntax_159(Token.Id._SYNTAX);
			public static Token.Parsed width = new Tokens.Syntax.syntax_159(Token.Id._width);
			public syntax_159(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_159() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_159 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Width";
			}
			public void setValue(String newValue) {
			}
			public void setWidth(Token.Parsed newWidth) {
				width = newWidth;
			}
		}
		public static class syntax_160 extends Token.Parsed{
			public static Tokens.Syntax.syntax_160 SYNTAX = new Tokens.Syntax.syntax_160(Token.Id._SYNTAX);
			public static Token.Parsed height = new Tokens.Syntax.syntax_160(Token.Id._height);
			public syntax_160(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_160() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_160 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return "Height";
			}
			public void setValue(String newValue) {
			}
			public void setHeight(Token.Parsed newHeight) {
				height = newHeight;
			}
		}
		public static class syntax_161 extends Token.Parsed{
			public static Tokens.Syntax.syntax_161 SYNTAX = new Tokens.Syntax.syntax_161(Token.Id._SYNTAX);
			public syntax_161(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_161() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_161 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".colours";
			}
			public void setValue(String newValue) {
			}
		}
		public static class syntax_162 extends Token.Parsed{
			public static Tokens.Syntax.syntax_162 SYNTAX = new Tokens.Syntax.syntax_162(Token.Id._SYNTAX);
			public syntax_162(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public syntax_162() {
			}
			public void setSYNTAX(Tokens.Syntax.syntax_162 newSYNTAX) {
				SYNTAX = newSYNTAX;
			}
			public String getValue() {
				return ".layers";
			}
			public void setValue(String newValue) {
			}
		}
	}
	public static class Name{
		public Name() {
		}
		public static class LoadBodyToken extends Token.Parsed{
			protected String value = null;
			public LoadBodyToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LoadBodyToken(final String value) {
				this.value = value;
			}
			public LoadBodyToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._loadBody;
			}
		}
		public static class AspectNameToken extends Token.Parsed{
			protected String value = null;
			public AspectNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AspectNameToken(final String value) {
				this.value = value;
			}
			public AspectNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._aspectName;
			}
		}
		public static class ItemNameToken extends Token.Parsed{
			protected String value = null;
			public ItemNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ItemNameToken(final String value) {
				this.value = value;
			}
			public ItemNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._itemName;
			}
		}
		public static class HpToken extends Token.Parsed{
			protected String value = null;
			public HpToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public HpToken(final String value) {
				this.value = value;
			}
			public HpToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._hp;
			}
		}
		public static class AttackToken extends Token.Parsed{
			protected String value = null;
			public AttackToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AttackToken(final String value) {
				this.value = value;
			}
			public AttackToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._attack;
			}
		}
		public static class DefenseToken extends Token.Parsed{
			protected String value = null;
			public DefenseToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DefenseToken(final String value) {
				this.value = value;
			}
			public DefenseToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._defense;
			}
		}
		public static class ValueToken extends Token.Parsed{
			protected String value = null;
			public ValueToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ValueToken(final String value) {
				this.value = value;
			}
			public ValueToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._value;
			}
		}
		public static class WeightToken extends Token.Parsed{
			protected String value = null;
			public WeightToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public WeightToken(final String value) {
				this.value = value;
			}
			public WeightToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._weight;
			}
		}
		public static class HitToken extends Token.Parsed{
			protected String value = null;
			public HitToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public HitToken(final String value) {
				this.value = value;
			}
			public HitToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._hit;
			}
		}
		public static class GainAspectToken extends Token.Parsed{
			protected String value = null;
			public GainAspectToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GainAspectToken(final String value) {
				this.value = value;
			}
			public GainAspectToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._gain_aspect;
			}
		}
		public static class AspectNamesToken extends Token.Parsed{
			protected String value = null;
			public AspectNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AspectNamesToken(final String value) {
				this.value = value;
			}
			public AspectNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._aspect_names;
			}
		}
		public static class NAMEToken extends Token.Parsed{
			protected String value = null;
			public NAMEToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public NAMEToken(final String value) {
				this.value = value;
			}
			public NAMEToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._NAME;
			}
		}
		public static class GainTraitToken extends Token.Parsed{
			protected String value = null;
			public GainTraitToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GainTraitToken(final String value) {
				this.value = value;
			}
			public GainTraitToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._gain_trait;
			}
		}
		public static class TraitNamesToken extends Token.Parsed{
			protected String value = null;
			public TraitNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TraitNamesToken(final String value) {
				this.value = value;
			}
			public TraitNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._trait_names;
			}
		}
		public static class GainAttackToken extends Token.Parsed{
			protected String value = null;
			public GainAttackToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GainAttackToken(final String value) {
				this.value = value;
			}
			public GainAttackToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._gain_attack;
			}
		}
		public static class AttackNamesToken extends Token.Parsed{
			protected String value = null;
			public AttackNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AttackNamesToken(final String value) {
				this.value = value;
			}
			public AttackNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._attack_names;
			}
		}
		public static class AffinityNameToken extends Token.Parsed{
			protected String value = null;
			public AffinityNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AffinityNameToken(final String value) {
				this.value = value;
			}
			public AffinityNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._affinityName;
			}
		}
		public static class StrengthNameToken extends Token.Parsed{
			protected String value = null;
			public StrengthNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public StrengthNameToken(final String value) {
				this.value = value;
			}
			public StrengthNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._strength_name;
			}
		}
		public static class AffinityNamesToken extends Token.Parsed{
			protected String value = null;
			public AffinityNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AffinityNamesToken(final String value) {
				this.value = value;
			}
			public AffinityNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._affinity_names;
			}
		}
		public static class WeaknessNameToken extends Token.Parsed{
			protected String value = null;
			public WeaknessNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public WeaknessNameToken(final String value) {
				this.value = value;
			}
			public WeaknessNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._weakness_name;
			}
		}
		public static class ConditionNameToken extends Token.Parsed{
			protected String value = null;
			public ConditionNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ConditionNameToken(final String value) {
				this.value = value;
			}
			public ConditionNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._conditionName;
			}
		}
		public static class ToLoseToken extends Token.Parsed{
			protected String value = null;
			public ToLoseToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ToLoseToken(final String value) {
				this.value = value;
			}
			public ToLoseToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._to_lose;
			}
		}
		public static class ChancePairToken extends Token.Parsed{
			protected String value = null;
			public ChancePairToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ChancePairToken(final String value) {
				this.value = value;
			}
			public ChancePairToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._chance_pair;
			}
		}
		public static class AccumulationToken extends Token.Parsed{
			protected String value = null;
			public AccumulationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AccumulationToken(final String value) {
				this.value = value;
			}
			public AccumulationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._accumulation;
			}
		}
		public static class TraitNameToken extends Token.Parsed{
			protected String value = null;
			public TraitNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TraitNameToken(final String value) {
				this.value = value;
			}
			public TraitNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._traitName;
			}
		}
		public static class ActivityNameToken extends Token.Parsed{
			protected String value = null;
			public ActivityNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ActivityNameToken(final String value) {
				this.value = value;
			}
			public ActivityNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._activityName;
			}
		}
		public static class ClassNameToken extends Token.Parsed{
			protected String value = null;
			public ClassNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ClassNameToken(final String value) {
				this.value = value;
			}
			public ClassNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._className;
			}
		}
		public static class GetTargetToken extends Token.Parsed{
			protected String value = null;
			public GetTargetToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GetTargetToken(final String value) {
				this.value = value;
			}
			public GetTargetToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._getTarget;
			}
		}
		public static class GetDestinationToken extends Token.Parsed{
			protected String value = null;
			public GetDestinationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GetDestinationToken(final String value) {
				this.value = value;
			}
			public GetDestinationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._getDestination;
			}
		}
		public static class EndStateToken extends Token.Parsed{
			protected String value = null;
			public EndStateToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EndStateToken(final String value) {
				this.value = value;
			}
			public EndStateToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._endState;
			}
		}
		public static class ListenToken extends Token.Parsed{
			protected String value = null;
			public ListenToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ListenToken(final String value) {
				this.value = value;
			}
			public ListenToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._listen;
			}
		}
		public static class StepToken extends Token.Parsed{
			protected String value = null;
			public StepToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public StepToken(final String value) {
				this.value = value;
			}
			public StepToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._step;
			}
		}
		public static class ActivityTypeNameToken extends Token.Parsed{
			protected String value = null;
			public ActivityTypeNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ActivityTypeNameToken(final String value) {
				this.value = value;
			}
			public ActivityTypeNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._activityTypeName;
			}
		}
		public static class ActivityTypeNamesToken extends Token.Parsed{
			protected String value = null;
			public ActivityTypeNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ActivityTypeNamesToken(final String value) {
				this.value = value;
			}
			public ActivityTypeNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._activity_type_names;
			}
		}
		public static class QuestNameToken extends Token.Parsed{
			protected String value = null;
			public QuestNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public QuestNameToken(final String value) {
				this.value = value;
			}
			public QuestNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._questName;
			}
		}
		public static class EventStatementToken extends Token.Parsed{
			protected String value = null;
			public EventStatementToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EventStatementToken(final String value) {
				this.value = value;
			}
			public EventStatementToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._event_statement;
			}
		}
		public static class EventNamesToken extends Token.Parsed{
			protected String value = null;
			public EventNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EventNamesToken(final String value) {
				this.value = value;
			}
			public EventNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._event_names;
			}
		}
		public static class MapNamesToken extends Token.Parsed{
			protected String value = null;
			public MapNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MapNamesToken(final String value) {
				this.value = value;
			}
			public MapNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._map_names;
			}
		}
		public static class AttackNameToken extends Token.Parsed{
			protected String value = null;
			public AttackNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AttackNameToken(final String value) {
				this.value = value;
			}
			public AttackNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._attackName;
			}
		}
		public static class RangeToken extends Token.Parsed{
			protected String value = null;
			public RangeToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RangeToken(final String value) {
				this.value = value;
			}
			public RangeToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._range;
			}
		}
		public static class CooldownToken extends Token.Parsed{
			protected String value = null;
			public CooldownToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public CooldownToken(final String value) {
				this.value = value;
			}
			public CooldownToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._cooldown;
			}
		}
		public static class DamageToken extends Token.Parsed{
			protected String value = null;
			public DamageToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DamageToken(final String value) {
				this.value = value;
			}
			public DamageToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._damage;
			}
		}
		public static class DmgTypeToken extends Token.Parsed{
			protected String value = null;
			public DmgTypeToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DmgTypeToken(final String value) {
				this.value = value;
			}
			public DmgTypeToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._dmg_type;
			}
		}
		public static class ByStatToken extends Token.Parsed{
			protected String value = null;
			public ByStatToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ByStatToken(final String value) {
				this.value = value;
			}
			public ByStatToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._by_stat;
			}
		}
		public static class MissToken extends Token.Parsed{
			protected String value = null;
			public MissToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MissToken(final String value) {
				this.value = value;
			}
			public MissToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._miss;
			}
		}
		public static class OptionToken extends Token.Parsed{
			protected String value = null;
			public OptionToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public OptionToken(final String value) {
				this.value = value;
			}
			public OptionToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._option;
			}
		}
		public static class SupportNameToken extends Token.Parsed{
			protected String value = null;
			public SupportNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SupportNameToken(final String value) {
				this.value = value;
			}
			public SupportNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._supportName;
			}
		}
		public static class SkillNameToken extends Token.Parsed{
			protected String value = null;
			public SkillNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SkillNameToken(final String value) {
				this.value = value;
			}
			public SkillNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._skillName;
			}
		}
		public static class RequireToken extends Token.Parsed{
			protected String value = null;
			public RequireToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireToken(final String value) {
				this.value = value;
			}
			public RequireToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require;
			}
		}
		public static class UseToken extends Token.Parsed{
			protected String value = null;
			public UseToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public UseToken(final String value) {
				this.value = value;
			}
			public UseToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._use;
			}
		}
		public static class LoadToken extends Token.Parsed{
			protected String value = null;
			public LoadToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LoadToken(final String value) {
				this.value = value;
			}
			public LoadToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._load;
			}
		}
		public static class AssociationNameToken extends Token.Parsed{
			protected String value = null;
			public AssociationNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AssociationNameToken(final String value) {
				this.value = value;
			}
			public AssociationNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._associationName;
			}
		}
		public static class SpecificNameToken extends Token.Parsed{
			protected String value = null;
			public SpecificNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SpecificNameToken(final String value) {
				this.value = value;
			}
			public SpecificNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._specificName;
			}
		}
		public static class OnEventToken extends Token.Parsed{
			protected String value = null;
			public OnEventToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public OnEventToken(final String value) {
				this.value = value;
			}
			public OnEventToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._onEvent;
			}
		}
		public static class ReasonNameToken extends Token.Parsed{
			protected String value = null;
			public ReasonNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ReasonNameToken(final String value) {
				this.value = value;
			}
			public ReasonNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._reasonName;
			}
		}
		public static class OperatorToken extends Token.Parsed{
			protected String value = null;
			public OperatorToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public OperatorToken(final String value) {
				this.value = value;
			}
			public OperatorToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._operator;
			}
		}
		public static class HeroStatToken extends Token.Parsed{
			protected String value = null;
			public HeroStatToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public HeroStatToken(final String value) {
				this.value = value;
			}
			public HeroStatToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._hero_stat;
			}
		}
		public static class LeftToken extends Token.Parsed{
			protected String value = null;
			public LeftToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LeftToken(final String value) {
				this.value = value;
			}
			public LeftToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._left;
			}
		}
		public static class RightToken extends Token.Parsed{
			protected String value = null;
			public RightToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RightToken(final String value) {
				this.value = value;
			}
			public RightToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._right;
			}
		}
		public static class EntityNameToken extends Token.Parsed{
			protected String value = null;
			public EntityNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EntityNameToken(final String value) {
				this.value = value;
			}
			public EntityNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._entityName;
			}
		}
		public static class ImageNameToken extends Token.Parsed{
			protected String value = null;
			public ImageNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ImageNameToken(final String value) {
				this.value = value;
			}
			public ImageNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._imageName;
			}
		}
		public static class ImageIdToken extends Token.Parsed{
			protected String value = null;
			public ImageIdToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ImageIdToken(final String value) {
				this.value = value;
			}
			public ImageIdToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._imageId;
			}
		}
		public static class StatRangeToken extends Token.Parsed{
			protected String value = null;
			public StatRangeToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public StatRangeToken(final String value) {
				this.value = value;
			}
			public StatRangeToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._stat_range;
			}
		}
		public static class SkillToken extends Token.Parsed{
			protected String value = null;
			public SkillToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SkillToken(final String value) {
				this.value = value;
			}
			public SkillToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._skill;
			}
		}
		public static class SkillNamesToken extends Token.Parsed{
			protected String value = null;
			public SkillNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SkillNamesToken(final String value) {
				this.value = value;
			}
			public SkillNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._skill_names;
			}
		}
		public static class TrailNameToken extends Token.Parsed{
			protected String value = null;
			public TrailNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TrailNameToken(final String value) {
				this.value = value;
			}
			public TrailNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._trailName;
			}
		}
		public static class TileNamesToken extends Token.Parsed{
			protected String value = null;
			public TileNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TileNamesToken(final String value) {
				this.value = value;
			}
			public TileNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_names;
			}
		}
		public static class StartNodeNameToken extends Token.Parsed{
			protected String value = null;
			public StartNodeNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public StartNodeNameToken(final String value) {
				this.value = value;
			}
			public StartNodeNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._startNodeName;
			}
		}
		public static class EndNodeNameToken extends Token.Parsed{
			protected String value = null;
			public EndNodeNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EndNodeNameToken(final String value) {
				this.value = value;
			}
			public EndNodeNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._endNodeName;
			}
		}
		public static class BuildingNameToken extends Token.Parsed{
			protected String value = null;
			public BuildingNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public BuildingNameToken(final String value) {
				this.value = value;
			}
			public BuildingNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._buildingName;
			}
		}
		public static class StructureDefinitionToken extends Token.Parsed{
			protected String value = null;
			public StructureDefinitionToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public StructureDefinitionToken(final String value) {
				this.value = value;
			}
			public StructureDefinitionToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._structure_definition;
			}
		}
		public static class RoomNameToken extends Token.Parsed{
			protected String value = null;
			public RoomNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RoomNameToken(final String value) {
				this.value = value;
			}
			public RoomNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._roomName;
			}
		}
		public static class DefaultTileNameToken extends Token.Parsed{
			protected String value = null;
			public DefaultTileNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DefaultTileNameToken(final String value) {
				this.value = value;
			}
			public DefaultTileNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._defaultTileName;
			}
		}
		public static class DefaultSizeToken extends Token.Parsed{
			protected String value = null;
			public DefaultSizeToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DefaultSizeToken(final String value) {
				this.value = value;
			}
			public DefaultSizeToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._defaultSize;
			}
		}
		public static class AmountToken extends Token.Parsed{
			protected String value = null;
			public AmountToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AmountToken(final String value) {
				this.value = value;
			}
			public AmountToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._amount;
			}
		}
		public static class PaymentTypeToken extends Token.Parsed{
			protected String value = null;
			public PaymentTypeToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PaymentTypeToken(final String value) {
				this.value = value;
			}
			public PaymentTypeToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._paymentType;
			}
		}
		public static class PaymentLongTypeNamesToken extends Token.Parsed{
			protected String value = null;
			public PaymentLongTypeNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PaymentLongTypeNamesToken(final String value) {
				this.value = value;
			}
			public PaymentLongTypeNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._payment_long_type_names;
			}
		}
		public static class PaymentShortTypeNamesToken extends Token.Parsed{
			protected String value = null;
			public PaymentShortTypeNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PaymentShortTypeNamesToken(final String value) {
				this.value = value;
			}
			public PaymentShortTypeNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._payment_short_type_names;
			}
		}
		public static class MapNameToken extends Token.Parsed{
			protected String value = null;
			public MapNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MapNameToken(final String value) {
				this.value = value;
			}
			public MapNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._mapName;
			}
		}
		public static class AreaNameToken extends Token.Parsed{
			protected String value = null;
			public AreaNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AreaNameToken(final String value) {
				this.value = value;
			}
			public AreaNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._areaName;
			}
		}
		public static class SubGeneratorToken extends Token.Parsed{
			protected String value = null;
			public SubGeneratorToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SubGeneratorToken(final String value) {
				this.value = value;
			}
			public SubGeneratorToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._sub_generator;
			}
		}
		public static class AreaNamesToken extends Token.Parsed{
			protected String value = null;
			public AreaNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AreaNamesToken(final String value) {
				this.value = value;
			}
			public AreaNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._area_names;
			}
		}
		public static class ProbabilityToken extends Token.Parsed{
			protected String value = null;
			public ProbabilityToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ProbabilityToken(final String value) {
				this.value = value;
			}
			public ProbabilityToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._probability;
			}
		}
		public static class DestinationToken extends Token.Parsed{
			protected String value = null;
			public DestinationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DestinationToken(final String value) {
				this.value = value;
			}
			public DestinationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._destination;
			}
		}
		public static class RoomNamesToken extends Token.Parsed{
			protected String value = null;
			public RoomNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RoomNamesToken(final String value) {
				this.value = value;
			}
			public RoomNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._room_names;
			}
		}
		public static class NodeNameToken extends Token.Parsed{
			protected String value = null;
			public NodeNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public NodeNameToken(final String value) {
				this.value = value;
			}
			public NodeNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._nodeName;
			}
		}
		public static class TrailNamesToken extends Token.Parsed{
			protected String value = null;
			public TrailNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TrailNamesToken(final String value) {
				this.value = value;
			}
			public TrailNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._trail_names;
			}
		}
		public static class PatchWidthToken extends Token.Parsed{
			protected String value = null;
			public PatchWidthToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PatchWidthToken(final String value) {
				this.value = value;
			}
			public PatchWidthToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._patchWidth;
			}
		}
		public static class PatchHeightToken extends Token.Parsed{
			protected String value = null;
			public PatchHeightToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PatchHeightToken(final String value) {
				this.value = value;
			}
			public PatchHeightToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._patchHeight;
			}
		}
		public static class LowerBoundToken extends Token.Parsed{
			protected String value = null;
			public LowerBoundToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LowerBoundToken(final String value) {
				this.value = value;
			}
			public LowerBoundToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._lowerBound;
			}
		}
		public static class UpperBoundToken extends Token.Parsed{
			protected String value = null;
			public UpperBoundToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public UpperBoundToken(final String value) {
				this.value = value;
			}
			public UpperBoundToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._upperBound;
			}
		}
		public static class SidingNamesToken extends Token.Parsed{
			protected String value = null;
			public SidingNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SidingNamesToken(final String value) {
				this.value = value;
			}
			public SidingNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._siding_names;
			}
		}
		public static class FloorDeclarationToken extends Token.Parsed{
			protected String value = null;
			public FloorDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FloorDeclarationToken(final String value) {
				this.value = value;
			}
			public FloorDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._floor_declaration;
			}
		}
		public static class SidingDeclarationToken extends Token.Parsed{
			protected String value = null;
			public SidingDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SidingDeclarationToken(final String value) {
				this.value = value;
			}
			public SidingDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._siding_declaration;
			}
		}
		public static class TerrainDeclarationToken extends Token.Parsed{
			protected String value = null;
			public TerrainDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TerrainDeclarationToken(final String value) {
				this.value = value;
			}
			public TerrainDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._terrain_declaration;
			}
		}
		public static class DensDeclarationToken extends Token.Parsed{
			protected String value = null;
			public DensDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DensDeclarationToken(final String value) {
				this.value = value;
			}
			public DensDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._dens_declaration;
			}
		}
		public static class ChestsDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ChestsDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ChestsDeclarationToken(final String value) {
				this.value = value;
			}
			public ChestsDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._chests_declaration;
			}
		}
		public static class WidthToken extends Token.Parsed{
			protected String value = null;
			public WidthToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public WidthToken(final String value) {
				this.value = value;
			}
			public WidthToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._width;
			}
		}
		public static class HeightToken extends Token.Parsed{
			protected String value = null;
			public HeightToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public HeightToken(final String value) {
				this.value = value;
			}
			public HeightToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._height;
			}
		}
		public static class EdgeTileNameToken extends Token.Parsed{
			protected String value = null;
			public EdgeTileNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EdgeTileNameToken(final String value) {
				this.value = value;
			}
			public EdgeTileNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._edgeTileName;
			}
		}
		public static class NeighbourIfToken extends Token.Parsed{
			protected String value = null;
			public NeighbourIfToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public NeighbourIfToken(final String value) {
				this.value = value;
			}
			public NeighbourIfToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._neighbourIf;
			}
		}
		public static class SidingNameToken extends Token.Parsed{
			protected String value = null;
			public SidingNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SidingNameToken(final String value) {
				this.value = value;
			}
			public SidingNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._sidingName;
			}
		}
		public static class FloorParentNameToken extends Token.Parsed{
			protected String value = null;
			public FloorParentNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FloorParentNameToken(final String value) {
				this.value = value;
			}
			public FloorParentNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._floorParentName;
			}
		}
		public static class TileNameToken extends Token.Parsed{
			protected String value = null;
			public TileNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TileNameToken(final String value) {
				this.value = value;
			}
			public TileNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._tileName;
			}
		}
		public static class TileRateToken extends Token.Parsed{
			protected String value = null;
			public TileRateToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TileRateToken(final String value) {
				this.value = value;
			}
			public TileRateToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_rate;
			}
		}
		public static class EntityToken extends Token.Parsed{
			protected String value = null;
			public EntityToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EntityToken(final String value) {
				this.value = value;
			}
			public EntityToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity;
			}
		}
		public static class PaymentToken extends Token.Parsed{
			protected String value = null;
			public PaymentToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PaymentToken(final String value) {
				this.value = value;
			}
			public PaymentToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._payment;
			}
		}
		public static class ItemNamesToken extends Token.Parsed{
			protected String value = null;
			public ItemNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ItemNamesToken(final String value) {
				this.value = value;
			}
			public ItemNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._item_names;
			}
		}
		public static class TypeNameToken extends Token.Parsed{
			protected String value = null;
			public TypeNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public TypeNameToken(final String value) {
				this.value = value;
			}
			public TypeNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._typeName;
			}
		}
		public static class ShortFormToken extends Token.Parsed{
			protected String value = null;
			public ShortFormToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ShortFormToken(final String value) {
				this.value = value;
			}
			public ShortFormToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._shortForm;
			}
		}
		public static class LongFormToken extends Token.Parsed{
			protected String value = null;
			public LongFormToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LongFormToken(final String value) {
				this.value = value;
			}
			public LongFormToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._longForm;
			}
		}
		public static class EventNameToken extends Token.Parsed{
			protected String value = null;
			public EventNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EventNameToken(final String value) {
				this.value = value;
			}
			public EventNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._eventName;
			}
		}
		public static class ParameterToken extends Token.Parsed{
			protected String value = null;
			public ParameterToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ParameterToken(final String value) {
				this.value = value;
			}
			public ParameterToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._parameter;
			}
		}
		public static class IndexToken extends Token.Parsed{
			protected String value = null;
			public IndexToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public IndexToken(final String value) {
				this.value = value;
			}
			public IndexToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._index;
			}
		}
		public static class NamePartToken extends Token.Parsed{
			protected String value = null;
			public NamePartToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public NamePartToken(final String value) {
				this.value = value;
			}
			public NamePartToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._namePart;
			}
		}
		public static class AcquisitionToken extends Token.Parsed{
			protected String value = null;
			public AcquisitionToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AcquisitionToken(final String value) {
				this.value = value;
			}
			public AcquisitionToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._acquisition;
			}
		}
		public static class ImpositionToken extends Token.Parsed{
			protected String value = null;
			public ImpositionToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ImpositionToken(final String value) {
				this.value = value;
			}
			public ImpositionToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._imposition;
			}
		}
		public static class InfluenceToken extends Token.Parsed{
			protected String value = null;
			public InfluenceToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public InfluenceToken(final String value) {
				this.value = value;
			}
			public InfluenceToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._influence;
			}
		}
		public static class QuestAdditionToken extends Token.Parsed{
			protected String value = null;
			public QuestAdditionToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public QuestAdditionToken(final String value) {
				this.value = value;
			}
			public QuestAdditionToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._quest_addition;
			}
		}
		public static class GAINSToken extends Token.Parsed{
			protected String value = null;
			public GAINSToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GAINSToken(final String value) {
				this.value = value;
			}
			public GAINSToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._GAINS;
			}
		}
		public static class LOSESToken extends Token.Parsed{
			protected String value = null;
			public LOSESToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LOSESToken(final String value) {
				this.value = value;
			}
			public LOSESToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._LOSES;
			}
		}
		public static class ConditionNamesToken extends Token.Parsed{
			protected String value = null;
			public ConditionNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ConditionNamesToken(final String value) {
				this.value = value;
			}
			public ConditionNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._condition_names;
			}
		}
		public static class SourceNameToken extends Token.Parsed{
			protected String value = null;
			public SourceNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SourceNameToken(final String value) {
				this.value = value;
			}
			public SourceNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._source_name;
			}
		}
		public static class ReasonNamesToken extends Token.Parsed{
			protected String value = null;
			public ReasonNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ReasonNamesToken(final String value) {
				this.value = value;
			}
			public ReasonNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._reason_names;
			}
		}
		public static class ActivityNamesToken extends Token.Parsed{
			protected String value = null;
			public ActivityNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ActivityNamesToken(final String value) {
				this.value = value;
			}
			public ActivityNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._activity_names;
			}
		}
		public static class MethodToken extends Token.Parsed{
			protected String value = null;
			public MethodToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MethodToken(final String value) {
				this.value = value;
			}
			public MethodToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._method;
			}
		}
		public static class MethodArgumentsToken extends Token.Parsed{
			protected String value = null;
			public MethodArgumentsToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MethodArgumentsToken(final String value) {
				this.value = value;
			}
			public MethodArgumentsToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._method_arguments;
			}
		}
		public static class AssociationNamesToken extends Token.Parsed{
			protected String value = null;
			public AssociationNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AssociationNamesToken(final String value) {
				this.value = value;
			}
			public AssociationNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_names;
			}
		}
		public static class RecruiterToken extends Token.Parsed{
			protected String value = null;
			public RecruiterToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RecruiterToken(final String value) {
				this.value = value;
			}
			public RecruiterToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._recruiter;
			}
		}
		public static class LowerBoundXToken extends Token.Parsed{
			protected String value = null;
			public LowerBoundXToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LowerBoundXToken(final String value) {
				this.value = value;
			}
			public LowerBoundXToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._lowerBoundX;
			}
		}
		public static class UpperBoundXToken extends Token.Parsed{
			protected String value = null;
			public UpperBoundXToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public UpperBoundXToken(final String value) {
				this.value = value;
			}
			public UpperBoundXToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._upperBoundX;
			}
		}
		public static class LowerBoundYToken extends Token.Parsed{
			protected String value = null;
			public LowerBoundYToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LowerBoundYToken(final String value) {
				this.value = value;
			}
			public LowerBoundYToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._lowerBoundY;
			}
		}
		public static class UpperBoundYToken extends Token.Parsed{
			protected String value = null;
			public UpperBoundYToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public UpperBoundYToken(final String value) {
				this.value = value;
			}
			public UpperBoundYToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._upperBoundY;
			}
		}
		public static class ElseStatementToken extends Token.Parsed{
			protected String value = null;
			public ElseStatementToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ElseStatementToken(final String value) {
				this.value = value;
			}
			public ElseStatementToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._else_statement;
			}
		}
		public static class FromListToken extends Token.Parsed{
			protected String value = null;
			public FromListToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FromListToken(final String value) {
				this.value = value;
			}
			public FromListToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._fromList;
			}
		}
		public static class FromVariableToken extends Token.Parsed{
			protected String value = null;
			public FromVariableToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FromVariableToken(final String value) {
				this.value = value;
			}
			public FromVariableToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._fromVariable;
			}
		}
		public static class EnvironmentNameToken extends Token.Parsed{
			protected String value = null;
			public EnvironmentNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EnvironmentNameToken(final String value) {
				this.value = value;
			}
			public EnvironmentNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._environmentName;
			}
		}
		public static class RequireStatToken extends Token.Parsed{
			protected String value = null;
			public RequireStatToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireStatToken(final String value) {
				this.value = value;
			}
			public RequireStatToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require_stat;
			}
		}
		public static class VariableNameToken extends Token.Parsed{
			protected String value = null;
			public VariableNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public VariableNameToken(final String value) {
				this.value = value;
			}
			public VariableNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._variableName;
			}
		}
		public static class RequireExpToken extends Token.Parsed{
			protected String value = null;
			public RequireExpToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireExpToken(final String value) {
				this.value = value;
			}
			public RequireExpToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require_exp;
			}
		}
		public static class RequireAttackToken extends Token.Parsed{
			protected String value = null;
			public RequireAttackToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireAttackToken(final String value) {
				this.value = value;
			}
			public RequireAttackToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require_attack;
			}
		}
		public static class RequireTraitToken extends Token.Parsed{
			protected String value = null;
			public RequireTraitToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireTraitToken(final String value) {
				this.value = value;
			}
			public RequireTraitToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require_trait;
			}
		}
		public static class RequireAssociationToken extends Token.Parsed{
			protected String value = null;
			public RequireAssociationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireAssociationToken(final String value) {
				this.value = value;
			}
			public RequireAssociationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require_association;
			}
		}
		public static class RequireSkillToken extends Token.Parsed{
			protected String value = null;
			public RequireSkillToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RequireSkillToken(final String value) {
				this.value = value;
			}
			public RequireSkillToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._require_skill;
			}
		}
		public static class EntitySelectorToken extends Token.Parsed{
			protected String value = null;
			public EntitySelectorToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public EntitySelectorToken(final String value) {
				this.value = value;
			}
			public EntitySelectorToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity_selector;
			}
		}
		public static class MapSelectorToken extends Token.Parsed{
			protected String value = null;
			public MapSelectorToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MapSelectorToken(final String value) {
				this.value = value;
			}
			public MapSelectorToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._map_selector;
			}
		}
		public static class ExactToken extends Token.Parsed{
			protected String value = null;
			public ExactToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ExactToken(final String value) {
				this.value = value;
			}
			public ExactToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._exact;
			}
		}
		public static class CastToken extends Token.Parsed{
			protected String value = null;
			public CastToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public CastToken(final String value) {
				this.value = value;
			}
			public CastToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._cast;
			}
		}
		public static class AccessStaticToken extends Token.Parsed{
			protected String value = null;
			public AccessStaticToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AccessStaticToken(final String value) {
				this.value = value;
			}
			public AccessStaticToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._access_static;
			}
		}
		public static class QuoteToken extends Token.Parsed{
			protected String value = null;
			public QuoteToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public QuoteToken(final String value) {
				this.value = value;
			}
			public QuoteToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._quote;
			}
		}
		public static class SymbolNameToken extends Token.Parsed{
			protected String value = null;
			public SymbolNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SymbolNameToken(final String value) {
				this.value = value;
			}
			public SymbolNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._symbolName;
			}
		}
		public static class MethodNameToken extends Token.Parsed{
			protected String value = null;
			public MethodNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MethodNameToken(final String value) {
				this.value = value;
			}
			public MethodNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._methodName;
			}
		}
		public static class MapDeclarationToken extends Token.Parsed{
			protected String value = null;
			public MapDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MapDeclarationToken(final String value) {
				this.value = value;
			}
			public MapDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._mapDeclaration;
			}
		}
		public static class AnimationTypeNameToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AnimationTypeNameToken(final String value) {
				this.value = value;
			}
			public AnimationTypeNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._animationTypeName;
			}
		}
		public static class StatementToken extends Token.Parsed{
			protected String value = null;
			public StatementToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public StatementToken(final String value) {
				this.value = value;
			}
			public StatementToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._statement;
			}
		}
		public static class AnimationTypeOperatorToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeOperatorToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AnimationTypeOperatorToken(final String value) {
				this.value = value;
			}
			public AnimationTypeOperatorToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_operator;
			}
		}
		public static class LeftNameToken extends Token.Parsed{
			protected String value = null;
			public LeftNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LeftNameToken(final String value) {
				this.value = value;
			}
			public LeftNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._leftName;
			}
		}
		public static class LowXToken extends Token.Parsed{
			protected String value = null;
			public LowXToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LowXToken(final String value) {
				this.value = value;
			}
			public LowXToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._lowX;
			}
		}
		public static class LowYToken extends Token.Parsed{
			protected String value = null;
			public LowYToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LowYToken(final String value) {
				this.value = value;
			}
			public LowYToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._lowY;
			}
		}
		public static class HighXToken extends Token.Parsed{
			protected String value = null;
			public HighXToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public HighXToken(final String value) {
				this.value = value;
			}
			public HighXToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._highX;
			}
		}
		public static class HighYToken extends Token.Parsed{
			protected String value = null;
			public HighYToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public HighYToken(final String value) {
				this.value = value;
			}
			public HighYToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._highY;
			}
		}
		public static class UnflippedValueToken extends Token.Parsed{
			protected String value = null;
			public UnflippedValueToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public UnflippedValueToken(final String value) {
				this.value = value;
			}
			public UnflippedValueToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._unflippedValue;
			}
		}
		public static class FlippedValueToken extends Token.Parsed{
			protected String value = null;
			public FlippedValueToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FlippedValueToken(final String value) {
				this.value = value;
			}
			public FlippedValueToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._flippedValue;
			}
		}
		public static class FrameNameToken extends Token.Parsed{
			protected String value = null;
			public FrameNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FrameNameToken(final String value) {
				this.value = value;
			}
			public FrameNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._frameName;
			}
		}
		public static class FrameWidthToken extends Token.Parsed{
			protected String value = null;
			public FrameWidthToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FrameWidthToken(final String value) {
				this.value = value;
			}
			public FrameWidthToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._frameWidth;
			}
		}
		public static class FrameHeightToken extends Token.Parsed{
			protected String value = null;
			public FrameHeightToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FrameHeightToken(final String value) {
				this.value = value;
			}
			public FrameHeightToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._frameHeight;
			}
		}
		public static class ImageFileToken extends Token.Parsed{
			protected String value = null;
			public ImageFileToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ImageFileToken(final String value) {
				this.value = value;
			}
			public ImageFileToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._imageFile;
			}
		}
		public static class ParentStateToken extends Token.Parsed{
			protected String value = null;
			public ParentStateToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ParentStateToken(final String value) {
				this.value = value;
			}
			public ParentStateToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._parentState;
			}
		}
		public static class AnimationIdToken extends Token.Parsed{
			protected String value = null;
			public AnimationIdToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AnimationIdToken(final String value) {
				this.value = value;
			}
			public AnimationIdToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._animationId;
			}
		}
		public static class FinalStateToken extends Token.Parsed{
			protected String value = null;
			public FinalStateToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FinalStateToken(final String value) {
				this.value = value;
			}
			public FinalStateToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._finalState;
			}
		}
		public static class FlipAnimationIdToken extends Token.Parsed{
			protected String value = null;
			public FlipAnimationIdToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FlipAnimationIdToken(final String value) {
				this.value = value;
			}
			public FlipAnimationIdToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._flipAnimationId;
			}
		}
		public static class ImageNamesToken extends Token.Parsed{
			protected String value = null;
			public ImageNamesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ImageNamesToken(final String value) {
				this.value = value;
			}
			public ImageNamesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._image_names;
			}
		}
		public static class DeltaToken extends Token.Parsed{
			protected String value = null;
			public DeltaToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DeltaToken(final String value) {
				this.value = value;
			}
			public DeltaToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._delta;
			}
		}
		public static class FramesToken extends Token.Parsed{
			protected String value = null;
			public FramesToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public FramesToken(final String value) {
				this.value = value;
			}
			public FramesToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._frames;
			}
		}
		public static class MultipleNameToken extends Token.Parsed{
			protected String value = null;
			public MultipleNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public MultipleNameToken(final String value) {
				this.value = value;
			}
			public MultipleNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._multipleName;
			}
		}
		public static class DrawableNameToken extends Token.Parsed{
			protected String value = null;
			public DrawableNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DrawableNameToken(final String value) {
				this.value = value;
			}
			public DrawableNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawableName;
			}
		}
		public static class PointToken extends Token.Parsed{
			protected String value = null;
			public PointToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PointToken(final String value) {
				this.value = value;
			}
			public PointToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._point;
			}
		}
		public static class LeftParameterToken extends Token.Parsed{
			protected String value = null;
			public LeftParameterToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LeftParameterToken(final String value) {
				this.value = value;
			}
			public LeftParameterToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._leftParameter;
			}
		}
		public static class RightParameterToken extends Token.Parsed{
			protected String value = null;
			public RightParameterToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RightParameterToken(final String value) {
				this.value = value;
			}
			public RightParameterToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._rightParameter;
			}
		}
		public static class NewStateNameToken extends Token.Parsed{
			protected String value = null;
			public NewStateNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public NewStateNameToken(final String value) {
				this.value = value;
			}
			public NewStateNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._newStateName;
			}
		}
		public static class PositionToken extends Token.Parsed{
			protected String value = null;
			public PositionToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public PositionToken(final String value) {
				this.value = value;
			}
			public PositionToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._position;
			}
		}
		public static class SupplementaryToken extends Token.Parsed{
			protected String value = null;
			public SupplementaryToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public SupplementaryToken(final String value) {
				this.value = value;
			}
			public SupplementaryToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._supplementary;
			}
		}
		public static class DimensionsToken extends Token.Parsed{
			protected String value = null;
			public DimensionsToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public DimensionsToken(final String value) {
				this.value = value;
			}
			public DimensionsToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._dimensions;
			}
		}
		public static class RotationToken extends Token.Parsed{
			protected String value = null;
			public RotationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RotationToken(final String value) {
				this.value = value;
			}
			public RotationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._rotation;
			}
		}
		public static class AngleToken extends Token.Parsed{
			protected String value = null;
			public AngleToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AngleToken(final String value) {
				this.value = value;
			}
			public AngleToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._angle;
			}
		}
		public static class ColourNameToken extends Token.Parsed{
			protected String value = null;
			public ColourNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public ColourNameToken(final String value) {
				this.value = value;
			}
			public ColourNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._colourName;
			}
		}
		public static class AsIntToken extends Token.Parsed{
			protected String value = null;
			public AsIntToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AsIntToken(final String value) {
				this.value = value;
			}
			public AsIntToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._asInt;
			}
		}
		public static class RedToken extends Token.Parsed{
			protected String value = null;
			public RedToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public RedToken(final String value) {
				this.value = value;
			}
			public RedToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._red;
			}
		}
		public static class BlueToken extends Token.Parsed{
			protected String value = null;
			public BlueToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public BlueToken(final String value) {
				this.value = value;
			}
			public BlueToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._blue;
			}
		}
		public static class GreenToken extends Token.Parsed{
			protected String value = null;
			public GreenToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public GreenToken(final String value) {
				this.value = value;
			}
			public GreenToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._green;
			}
		}
		public static class AsFloatToken extends Token.Parsed{
			protected String value = null;
			public AsFloatToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public AsFloatToken(final String value) {
				this.value = value;
			}
			public AsFloatToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._asFloat;
			}
		}
		public static class LayerDeclarationToken extends Token.Parsed{
			protected String value = null;
			public LayerDeclarationToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LayerDeclarationToken(final String value) {
				this.value = value;
			}
			public LayerDeclarationToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._layer_declaration;
			}
		}
		public static class LayerNameToken extends Token.Parsed{
			protected String value = null;
			public LayerNameToken(final Token.Id initalSuperName, final String value) {
				super(initalSuperName);
				this.value = value;
			}
			public LayerNameToken(final String value) {
				this.value = value;
			}
			public LayerNameToken() {
			}
			public String getValue() {
				if(children.isEmpty()) {
					return value;
				}
				else {
					return children.get(0).getValue();
				}
			}
			public void setValue(String newValue) {
				value=newValue;
			}
			public Token.Id getName() {
				return Token.Id._layerName;
			}
		}
	}
	public static class Rule{
		public Rule() {
		}
		public static class BaseToken extends Token.Parsed{
			protected String value = null;
			public BaseToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public BaseToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._base;
			}
		}
		public static class ImportAnyToken extends Token.Parsed{
			protected String value = null;
			public ImportAnyToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAnyToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_any;
			}
		}
		public static class CommentsToken extends Token.Parsed{
			protected String value = null;
			public CommentsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public CommentsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._comments;
			}
		}
		public static class NAMEToken extends Token.Parsed{
			protected String value = null;
			public NAMEToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public NAMEToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._NAME;
			}
		}
		public static class FLOATToken extends Token.Parsed{
			protected String value = null;
			public FLOATToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public FLOATToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._FLOAT;
			}
		}
		public static class INTEGERToken extends Token.Parsed{
			protected String value = null;
			public INTEGERToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public INTEGERToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._INTEGER;
			}
		}
		public static class FILENAMEToken extends Token.Parsed{
			protected String value = null;
			public FILENAMEToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public FILENAMEToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._FILE_NAME;
			}
		}
		public static class TITLEToken extends Token.Parsed{
			protected String value = null;
			public TITLEToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TITLEToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._TITLE;
			}
		}
		public static class DESCRIPTIONToken extends Token.Parsed{
			protected String value = null;
			public DESCRIPTIONToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DESCRIPTIONToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._DESCRIPTION;
			}
		}
		public static class ORDINALToken extends Token.Parsed{
			protected String value = null;
			public ORDINALToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ORDINALToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._ORDINAL;
			}
		}
		public static class ImportAspectToken extends Token.Parsed{
			protected String value = null;
			public ImportAspectToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAspectToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_aspect;
			}
		}
		public static class ImportAspectFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportAspectFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAspectFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_aspect__file_import;
			}
		}
		public static class AspectDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AspectDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AspectDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._aspect_declaration;
			}
		}
		public static class ImportItemToken extends Token.Parsed{
			protected String value = null;
			public ImportItemToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportItemToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_item;
			}
		}
		public static class ImportItemFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportItemFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportItemFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_item__file_import;
			}
		}
		public static class ItemDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ItemDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ItemDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._item_declaration;
			}
		}
		public static class ItemParameterToken extends Token.Parsed{
			protected String value = null;
			public ItemParameterToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ItemParameterToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._item_parameter;
			}
		}
		public static class ItemHitElementToken extends Token.Parsed{
			protected String value = null;
			public ItemHitElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ItemHitElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._item_hit_element;
			}
		}
		public static class ImportAffinityToken extends Token.Parsed{
			protected String value = null;
			public ImportAffinityToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAffinityToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_affinity;
			}
		}
		public static class ImportAffinityFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportAffinityFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAffinityFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_affinity__file_import;
			}
		}
		public static class AffinityDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AffinityDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AffinityDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._affinity_declaration;
			}
		}
		public static class AffinityElementToken extends Token.Parsed{
			protected String value = null;
			public AffinityElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AffinityElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._affinity_element;
			}
		}
		public static class ImportConditionToken extends Token.Parsed{
			protected String value = null;
			public ImportConditionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportConditionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_condition;
			}
		}
		public static class ImportConditionFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportConditionFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportConditionFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_condition__file_import;
			}
		}
		public static class ConditionDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ConditionDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ConditionDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._condition_declaration;
			}
		}
		public static class ConditionElementToken extends Token.Parsed{
			protected String value = null;
			public ConditionElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ConditionElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._condition_element;
			}
		}
		public static class ImportTraitToken extends Token.Parsed{
			protected String value = null;
			public ImportTraitToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportTraitToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_trait;
			}
		}
		public static class ImportTraitFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportTraitFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportTraitFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_trait__file_import;
			}
		}
		public static class TraitDeclarationToken extends Token.Parsed{
			protected String value = null;
			public TraitDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TraitDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._trait_declaration;
			}
		}
		public static class TraitElementToken extends Token.Parsed{
			protected String value = null;
			public TraitElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TraitElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._trait_element;
			}
		}
		public static class ImportActivityToken extends Token.Parsed{
			protected String value = null;
			public ImportActivityToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportActivityToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_activity;
			}
		}
		public static class ImportActivityFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportActivityFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportActivityFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_activity__file_import;
			}
		}
		public static class ActivityDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ActivityDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ActivityDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._activity_declaration;
			}
		}
		public static class ActivityElementToken extends Token.Parsed{
			protected String value = null;
			public ActivityElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ActivityElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._activity_element;
			}
		}
		public static class ActivityTypeDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ActivityTypeDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ActivityTypeDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._activity_type_declaration;
			}
		}
		public static class ImportQuestToken extends Token.Parsed{
			protected String value = null;
			public ImportQuestToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportQuestToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_quest;
			}
		}
		public static class ImportQuestFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportQuestFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportQuestFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_quest__file_import;
			}
		}
		public static class QuestTypeDeclarationToken extends Token.Parsed{
			protected String value = null;
			public QuestTypeDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public QuestTypeDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._quest_type_declaration;
			}
		}
		public static class QuestTypeElementToken extends Token.Parsed{
			protected String value = null;
			public QuestTypeElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public QuestTypeElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._quest_type_element;
			}
		}
		public static class QuestDestinationToken extends Token.Parsed{
			protected String value = null;
			public QuestDestinationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public QuestDestinationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._quest_destination;
			}
		}
		public static class QuestTileDescriptionToken extends Token.Parsed{
			protected String value = null;
			public QuestTileDescriptionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public QuestTileDescriptionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._quest_tile_description;
			}
		}
		public static class SelectTileNameToken extends Token.Parsed{
			protected String value = null;
			public SelectTileNameToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SelectTileNameToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._select_tile_name;
			}
		}
		public static class ImportAttackToken extends Token.Parsed{
			protected String value = null;
			public ImportAttackToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAttackToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_attack;
			}
		}
		public static class ImportAttackFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportAttackFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAttackFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_attack__file_import;
			}
		}
		public static class AttackDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AttackDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AttackDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._attack_declaration;
			}
		}
		public static class AttackElementToken extends Token.Parsed{
			protected String value = null;
			public AttackElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AttackElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._attack_element;
			}
		}
		public static class ImportSupportToken extends Token.Parsed{
			protected String value = null;
			public ImportSupportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportSupportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_support;
			}
		}
		public static class ImportSupportFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportSupportFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportSupportFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_support__file_import;
			}
		}
		public static class SupportDeclarationToken extends Token.Parsed{
			protected String value = null;
			public SupportDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SupportDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._support_declaration;
			}
		}
		public static class SupportElementToken extends Token.Parsed{
			protected String value = null;
			public SupportElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SupportElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._support_element;
			}
		}
		public static class ImportSkillToken extends Token.Parsed{
			protected String value = null;
			public ImportSkillToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportSkillToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_skill;
			}
		}
		public static class ImportSkillFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportSkillFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportSkillFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_skill__file_import;
			}
		}
		public static class SkillDeclarationToken extends Token.Parsed{
			protected String value = null;
			public SkillDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SkillDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._skill_declaration;
			}
		}
		public static class SkillElementToken extends Token.Parsed{
			protected String value = null;
			public SkillElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SkillElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._skill_element;
			}
		}
		public static class ImportAssociationToken extends Token.Parsed{
			protected String value = null;
			public ImportAssociationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAssociationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_association;
			}
		}
		public static class ImportAssociationFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportAssociationFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAssociationFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_association__file_import;
			}
		}
		public static class AssociationDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AssociationDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AssociationDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_declaration;
			}
		}
		public static class AssociationElementToken extends Token.Parsed{
			protected String value = null;
			public AssociationElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AssociationElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_element;
			}
		}
		public static class AssociationStartToken extends Token.Parsed{
			protected String value = null;
			public AssociationStartToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AssociationStartToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_start;
			}
		}
		public static class AssociationJoinToken extends Token.Parsed{
			protected String value = null;
			public AssociationJoinToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AssociationJoinToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_join;
			}
		}
		public static class AssociationEventToken extends Token.Parsed{
			protected String value = null;
			public AssociationEventToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AssociationEventToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_event;
			}
		}
		public static class ImportReasonToken extends Token.Parsed{
			protected String value = null;
			public ImportReasonToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportReasonToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_reason;
			}
		}
		public static class ImportReasonFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportReasonFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportReasonFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_reason__file_import;
			}
		}
		public static class ReasonDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ReasonDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ReasonDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._reason_declaration;
			}
		}
		public static class ReasonDescriptionToken extends Token.Parsed{
			protected String value = null;
			public ReasonDescriptionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ReasonDescriptionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._reason_description;
			}
		}
		public static class ReasonDescriptionElementToken extends Token.Parsed{
			protected String value = null;
			public ReasonDescriptionElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ReasonDescriptionElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._reason_description_element;
			}
		}
		public static class StatRangeToken extends Token.Parsed{
			protected String value = null;
			public StatRangeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StatRangeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._stat_range;
			}
		}
		public static class StateRangeElementToken extends Token.Parsed{
			protected String value = null;
			public StateRangeElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StateRangeElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._state_range_element;
			}
		}
		public static class EntityDefinitionBodyToken extends Token.Parsed{
			protected String value = null;
			public EntityDefinitionBodyToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EntityDefinitionBodyToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity_definition_body;
			}
		}
		public static class EntityDeclarationToken extends Token.Parsed{
			protected String value = null;
			public EntityDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EntityDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity_declaration;
			}
		}
		public static class EntityImageSpecificationToken extends Token.Parsed{
			protected String value = null;
			public EntityImageSpecificationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EntityImageSpecificationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity_image_specification;
			}
		}
		public static class EntityDefinitionToken extends Token.Parsed{
			protected String value = null;
			public EntityDefinitionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EntityDefinitionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity_definition;
			}
		}
		public static class HintsToken extends Token.Parsed{
			protected String value = null;
			public HintsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public HintsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._hints;
			}
		}
		public static class TrailsDeclarationToken extends Token.Parsed{
			protected String value = null;
			public TrailsDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TrailsDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._trails_declaration;
			}
		}
		public static class TrailDeclarationToken extends Token.Parsed{
			protected String value = null;
			public TrailDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TrailDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._trail_declaration;
			}
		}
		public static class ConnectionDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ConnectionDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ConnectionDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._connection_declaration;
			}
		}
		public static class StructuresDeclarationToken extends Token.Parsed{
			protected String value = null;
			public StructuresDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StructuresDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._structures_declaration;
			}
		}
		public static class StructureDeclarationToken extends Token.Parsed{
			protected String value = null;
			public StructureDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StructureDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._structure_declaration;
			}
		}
		public static class StructurePaymentToken extends Token.Parsed{
			protected String value = null;
			public StructurePaymentToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StructurePaymentToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._structure_payment;
			}
		}
		public static class ImportMapToken extends Token.Parsed{
			protected String value = null;
			public ImportMapToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportMapToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_map;
			}
		}
		public static class ImportMapFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportMapFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportMapFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_map__file_import;
			}
		}
		public static class AreaShapeNameToken extends Token.Parsed{
			protected String value = null;
			public AreaShapeNameToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AreaShapeNameToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._area_shape_name;
			}
		}
		public static class MapHeaderToken extends Token.Parsed{
			protected String value = null;
			public MapHeaderToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public MapHeaderToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._map_header;
			}
		}
		public static class AreaDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AreaDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AreaDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._area_declaration;
			}
		}
		public static class PatchOptionsToken extends Token.Parsed{
			protected String value = null;
			public PatchOptionsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchOptionsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_options;
			}
		}
		public static class PatchElementToken extends Token.Parsed{
			protected String value = null;
			public PatchElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_element;
			}
		}
		public static class PatchProbabilityToken extends Token.Parsed{
			protected String value = null;
			public PatchProbabilityToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchProbabilityToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_probability;
			}
		}
		public static class PatchGotoToken extends Token.Parsed{
			protected String value = null;
			public PatchGotoToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchGotoToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_goto;
			}
		}
		public static class PatchPositionToken extends Token.Parsed{
			protected String value = null;
			public PatchPositionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchPositionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_position;
			}
		}
		public static class PatchDimensionToken extends Token.Parsed{
			protected String value = null;
			public PatchDimensionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchDimensionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_dimension;
			}
		}
		public static class PatchRangeToken extends Token.Parsed{
			protected String value = null;
			public PatchRangeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchRangeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_range;
			}
		}
		public static class PatchRimcalsToken extends Token.Parsed{
			protected String value = null;
			public PatchRimcalsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PatchRimcalsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._patch_rimcals;
			}
		}
		public static class ImportTileToken extends Token.Parsed{
			protected String value = null;
			public ImportTileToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportTileToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_tile;
			}
		}
		public static class ImportTileFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportTileFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportTileFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_tile__file_import;
			}
		}
		public static class TileDeclarationToken extends Token.Parsed{
			protected String value = null;
			public TileDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_declaration;
			}
		}
		public static class TileDimensionsToken extends Token.Parsed{
			protected String value = null;
			public TileDimensionsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileDimensionsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_dimensions;
			}
		}
		public static class ShapeTypeToken extends Token.Parsed{
			protected String value = null;
			public ShapeTypeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ShapeTypeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._shape_type;
			}
		}
		public static class DirectionNameToken extends Token.Parsed{
			protected String value = null;
			public DirectionNameToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DirectionNameToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._direction_name;
			}
		}
		public static class EdgeIfOperatorToken extends Token.Parsed{
			protected String value = null;
			public EdgeIfOperatorToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EdgeIfOperatorToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._edge_if_operator;
			}
		}
		public static class EdgeDefinitionToken extends Token.Parsed{
			protected String value = null;
			public EdgeDefinitionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EdgeDefinitionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._edge_definition;
			}
		}
		public static class EdgeIfToken extends Token.Parsed{
			protected String value = null;
			public EdgeIfToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EdgeIfToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._edge_if;
			}
		}
		public static class SidingDefinitionToken extends Token.Parsed{
			protected String value = null;
			public SidingDefinitionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SidingDefinitionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._siding_definition;
			}
		}
		public static class TileDefinitionToken extends Token.Parsed{
			protected String value = null;
			public TileDefinitionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileDefinitionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_definition;
			}
		}
		public static class TileDefinitionElementToken extends Token.Parsed{
			protected String value = null;
			public TileDefinitionElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileDefinitionElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_definition_element;
			}
		}
		public static class TileElementToken extends Token.Parsed{
			protected String value = null;
			public TileElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_element;
			}
		}
		public static class TileCostToken extends Token.Parsed{
			protected String value = null;
			public TileCostToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileCostToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_cost;
			}
		}
		public static class TilePaymentTypeToken extends Token.Parsed{
			protected String value = null;
			public TilePaymentTypeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TilePaymentTypeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_payment_type;
			}
		}
		public static class ImportPaymentTypeToken extends Token.Parsed{
			protected String value = null;
			public ImportPaymentTypeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportPaymentTypeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_payment_type;
			}
		}
		public static class ImportPaymentTypeFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportPaymentTypeFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportPaymentTypeFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_payment_type__file_import;
			}
		}
		public static class PaymentTypeDeclarationToken extends Token.Parsed{
			protected String value = null;
			public PaymentTypeDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public PaymentTypeDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._payment_type_declaration;
			}
		}
		public static class ImportEventToken extends Token.Parsed{
			protected String value = null;
			public ImportEventToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportEventToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_event;
			}
		}
		public static class ImportEventFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportEventFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportEventFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_event__file_import;
			}
		}
		public static class EventDeclarationToken extends Token.Parsed{
			protected String value = null;
			public EventDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EventDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._event_declaration;
			}
		}
		public static class EventStatementToken extends Token.Parsed{
			protected String value = null;
			public EventStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EventStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._event_statement;
			}
		}
		public static class QUOTEToken extends Token.Parsed{
			protected String value = null;
			public QUOTEToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public QUOTEToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._QUOTE;
			}
		}
		public static class NOTToken extends Token.Parsed{
			protected String value = null;
			public NOTToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public NOTToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._NOT;
			}
		}
		public static class StdBodyToken extends Token.Parsed{
			protected String value = null;
			public StdBodyToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StdBodyToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._std_body;
			}
		}
		public static class MethodArgumentsToken extends Token.Parsed{
			protected String value = null;
			public MethodArgumentsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public MethodArgumentsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._method_arguments;
			}
		}
		public static class MethodParametersToken extends Token.Parsed{
			protected String value = null;
			public MethodParametersToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public MethodParametersToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._method_parameters;
			}
		}
		public static class BracedStatementToken extends Token.Parsed{
			protected String value = null;
			public BracedStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public BracedStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._braced_statement;
			}
		}
		public static class TileIdChoiceToken extends Token.Parsed{
			protected String value = null;
			public TileIdChoiceToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TileIdChoiceToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._tile_id_choice;
			}
		}
		public static class EntityIdChoiceToken extends Token.Parsed{
			protected String value = null;
			public EntityIdChoiceToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public EntityIdChoiceToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._entity_id_choice;
			}
		}
		public static class NumberToken extends Token.Parsed{
			protected String value = null;
			public NumberToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public NumberToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._number;
			}
		}
		public static class RangeToken extends Token.Parsed{
			protected String value = null;
			public RangeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public RangeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._range;
			}
		}
		public static class OperatorToken extends Token.Parsed{
			protected String value = null;
			public OperatorToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public OperatorToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._operator;
			}
		}
		public static class BodyElementToken extends Token.Parsed{
			protected String value = null;
			public BodyElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public BodyElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._body_element;
			}
		}
		public static class BodyDefinedStatementToken extends Token.Parsed{
			protected String value = null;
			public BodyDefinedStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public BodyDefinedStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._body_defined_statement;
			}
		}
		public static class AcquisitionToken extends Token.Parsed{
			protected String value = null;
			public AcquisitionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AcquisitionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._acquisition;
			}
		}
		public static class ImpositionToken extends Token.Parsed{
			protected String value = null;
			public ImpositionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImpositionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._imposition;
			}
		}
		public static class InfluenceToken extends Token.Parsed{
			protected String value = null;
			public InfluenceToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public InfluenceToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._influence;
			}
		}
		public static class QuestAdditionToken extends Token.Parsed{
			protected String value = null;
			public QuestAdditionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public QuestAdditionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._quest_addition;
			}
		}
		public static class ActivityStatementToken extends Token.Parsed{
			protected String value = null;
			public ActivityStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ActivityStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._activity_statement;
			}
		}
		public static class AssociationStatementToken extends Token.Parsed{
			protected String value = null;
			public AssociationStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AssociationStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._association_statement;
			}
		}
		public static class SpawnStatementToken extends Token.Parsed{
			protected String value = null;
			public SpawnStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SpawnStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._spawn_statement;
			}
		}
		public static class IfHeaderToken extends Token.Parsed{
			protected String value = null;
			public IfHeaderToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public IfHeaderToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._if_header;
			}
		}
		public static class IfStatementToken extends Token.Parsed{
			protected String value = null;
			public IfStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public IfStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._if_statement;
			}
		}
		public static class InlineIfStatementToken extends Token.Parsed{
			protected String value = null;
			public InlineIfStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public InlineIfStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._inline_if_statement;
			}
		}
		public static class ForStatementToken extends Token.Parsed{
			protected String value = null;
			public ForStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ForStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._for_statement;
			}
		}
		public static class WhileStatementToken extends Token.Parsed{
			protected String value = null;
			public WhileStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public WhileStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._while_statement;
			}
		}
		public static class BooleanStatementToken extends Token.Parsed{
			protected String value = null;
			public BooleanStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public BooleanStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._boolean_statement;
			}
		}
		public static class BooleanElementToken extends Token.Parsed{
			protected String value = null;
			public BooleanElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public BooleanElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._boolean_element;
			}
		}
		public static class HasChanceToken extends Token.Parsed{
			protected String value = null;
			public HasChanceToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public HasChanceToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._has_chance;
			}
		}
		public static class ConditionalChanceToken extends Token.Parsed{
			protected String value = null;
			public ConditionalChanceToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ConditionalChanceToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._conditional_chance;
			}
		}
		public static class IsAStatementToken extends Token.Parsed{
			protected String value = null;
			public IsAStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public IsAStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._isA_statement;
			}
		}
		public static class SpawnedStatementToken extends Token.Parsed{
			protected String value = null;
			public SpawnedStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public SpawnedStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._spawned_statement;
			}
		}
		public static class HasStatementToken extends Token.Parsed{
			protected String value = null;
			public HasStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public HasStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._has_statement;
			}
		}
		public static class RequirementToken extends Token.Parsed{
			protected String value = null;
			public RequirementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public RequirementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._requirement;
			}
		}
		public static class RequirementElementToken extends Token.Parsed{
			protected String value = null;
			public RequirementElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public RequirementElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._requirement_element;
			}
		}
		public static class ReturnStatementToken extends Token.Parsed{
			protected String value = null;
			public ReturnStatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ReturnStatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._return_statement;
			}
		}
		public static class StatementToken extends Token.Parsed{
			protected String value = null;
			public StatementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public StatementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._statement;
			}
		}
		public static class VariableDeclarationToken extends Token.Parsed{
			protected String value = null;
			public VariableDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public VariableDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._variable_declaration;
			}
		}
		public static class VariableHeaderToken extends Token.Parsed{
			protected String value = null;
			public VariableHeaderToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public VariableHeaderToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._variable_header;
			}
		}
		public static class VariableCallToken extends Token.Parsed{
			protected String value = null;
			public VariableCallToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public VariableCallToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._variable_call;
			}
		}
		public static class VariableCallElementToken extends Token.Parsed{
			protected String value = null;
			public VariableCallElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public VariableCallElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._variable_call_element;
			}
		}
		public static class VariableGroupToken extends Token.Parsed{
			protected String value = null;
			public VariableGroupToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public VariableGroupToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._variable_group;
			}
		}
		public static class MethodToken extends Token.Parsed{
			protected String value = null;
			public MethodToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public MethodToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._method;
			}
		}
		public static class TypeNameToken extends Token.Parsed{
			protected String value = null;
			public TypeNameToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public TypeNameToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._type_name;
			}
		}
		public static class ImportAnimationTypeToken extends Token.Parsed{
			protected String value = null;
			public ImportAnimationTypeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAnimationTypeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_animation_type;
			}
		}
		public static class ImportAnimationTypeFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportAnimationTypeFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportAnimationTypeFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_animation_type__file_import;
			}
		}
		public static class AnimationTypeContinuationOperatorToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeContinuationOperatorToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeContinuationOperatorToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_continuation_operator;
			}
		}
		public static class AnimationTypeArithmeticOperatorToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeArithmeticOperatorToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeArithmeticOperatorToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_arithmetic_operator;
			}
		}
		public static class AnimationTypeBooleanOperatorToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeBooleanOperatorToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeBooleanOperatorToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_boolean_operator;
			}
		}
		public static class AnimationTypeDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_declaration;
			}
		}
		public static class AnimationTypeElementToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_element;
			}
		}
		public static class AnimationTypeConditionToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeConditionToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeConditionToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_condition;
			}
		}
		public static class AnimationTypeValueToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeValueToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeValueToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_value;
			}
		}
		public static class AnimationTypeBooleanToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeBooleanToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeBooleanToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_boolean;
			}
		}
		public static class AnimationTypeVariableDeclarationToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeVariableDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeVariableDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_variable_declaration;
			}
		}
		public static class AnimationTypeCoordinateVariableToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeCoordinateVariableToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeCoordinateVariableToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_coordinate_variable;
			}
		}
		public static class AnimationTypeFlipVariableToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeFlipVariableToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeFlipVariableToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_flip_variable;
			}
		}
		public static class AnimationVariableValueToken extends Token.Parsed{
			protected String value = null;
			public AnimationVariableValueToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationVariableValueToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_variable_value;
			}
		}
		public static class AnimationVariableValueBasicToken extends Token.Parsed{
			protected String value = null;
			public AnimationVariableValueBasicToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationVariableValueBasicToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_variable_value_basic;
			}
		}
		public static class AnimationVariableValueRangeToken extends Token.Parsed{
			protected String value = null;
			public AnimationVariableValueRangeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationVariableValueRangeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_variable_value_range;
			}
		}
		public static class AnimationTypeVariablesToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeVariablesToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeVariablesToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_variables;
			}
		}
		public static class AnimationTypeBodyToken extends Token.Parsed{
			protected String value = null;
			public AnimationTypeBodyToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationTypeBodyToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_type_body;
			}
		}
		public static class AnimationFrameDataToken extends Token.Parsed{
			protected String value = null;
			public AnimationFrameDataToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationFrameDataToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_frame_data;
			}
		}
		public static class ImportImageToken extends Token.Parsed{
			protected String value = null;
			public ImportImageToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportImageToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_image;
			}
		}
		public static class ImportImageFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportImageFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportImageFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_image__file_import;
			}
		}
		public static class ImageTypeToken extends Token.Parsed{
			protected String value = null;
			public ImageTypeToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImageTypeToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._image_type;
			}
		}
		public static class AnimationSubstatesToken extends Token.Parsed{
			protected String value = null;
			public AnimationSubstatesToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationSubstatesToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_substates;
			}
		}
		public static class ImageDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ImageDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImageDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._image_declaration;
			}
		}
		public static class AnimationStateToken extends Token.Parsed{
			protected String value = null;
			public AnimationStateToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationStateToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation_state;
			}
		}
		public static class ImageIdToken extends Token.Parsed{
			protected String value = null;
			public ImageIdToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImageIdToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._image_id;
			}
		}
		public static class AnimationToken extends Token.Parsed{
			protected String value = null;
			public AnimationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public AnimationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._animation;
			}
		}
		public static class ImportDrawableToken extends Token.Parsed{
			protected String value = null;
			public ImportDrawableToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportDrawableToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_drawable;
			}
		}
		public static class ImportDrawableFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportDrawableFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportDrawableFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_drawable__file_import;
			}
		}
		public static class MultipleDrawableDeclarationToken extends Token.Parsed{
			protected String value = null;
			public MultipleDrawableDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public MultipleDrawableDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._multiple_drawable_declaration;
			}
		}
		public static class DrawableDeclarationToken extends Token.Parsed{
			protected String value = null;
			public DrawableDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DrawableDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawable_declaration;
			}
		}
		public static class MultipleDrawablePointsToken extends Token.Parsed{
			protected String value = null;
			public MultipleDrawablePointsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public MultipleDrawablePointsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._multiple_drawable_points;
			}
		}
		public static class DrawableDimensionsToken extends Token.Parsed{
			protected String value = null;
			public DrawableDimensionsToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DrawableDimensionsToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawable_dimensions;
			}
		}
		public static class DrawableGridElementToken extends Token.Parsed{
			protected String value = null;
			public DrawableGridElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DrawableGridElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawable_grid_element;
			}
		}
		public static class DrawableMultipleElementToken extends Token.Parsed{
			protected String value = null;
			public DrawableMultipleElementToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DrawableMultipleElementToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawable_multiple_element;
			}
		}
		public static class DrawableArthmeticOperatorToken extends Token.Parsed{
			protected String value = null;
			public DrawableArthmeticOperatorToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DrawableArthmeticOperatorToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawable_arthmetic_operator;
			}
		}
		public static class DrawableMultipleValueToken extends Token.Parsed{
			protected String value = null;
			public DrawableMultipleValueToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public DrawableMultipleValueToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._drawable_multiple_value;
			}
		}
		public static class ImportColourToken extends Token.Parsed{
			protected String value = null;
			public ImportColourToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportColourToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_colour;
			}
		}
		public static class ImportColourFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportColourFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportColourFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_colour__file_import;
			}
		}
		public static class ColourDeclarationToken extends Token.Parsed{
			protected String value = null;
			public ColourDeclarationToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ColourDeclarationToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._colour_declaration;
			}
		}
		public static class ImportLayerToken extends Token.Parsed{
			protected String value = null;
			public ImportLayerToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportLayerToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_layer;
			}
		}
		public static class ImportLayerFileImportToken extends Token.Parsed{
			protected String value = null;
			public ImportLayerFileImportToken(final Token.Id initalSuperName) {
				super(initalSuperName);
			}
			public ImportLayerFileImportToken() {
			}
			public String getValue() {
				if(value==null) {
					return super.getValue();
				}
				else {
					return value;
				}
			}
			public void setValue(String newValue) {
				value = newValue;
			}
			public Token.Id getName() {
				return Token.Id._import_layer__file_import;
			}
		}
	}
}