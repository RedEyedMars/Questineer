package com.rem.gen;
public class Terrains {
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("environments"),null).add(new com.rem.lang.helpers.output.OutputExact().set("tiles"),null)).name(new com.rem.lang.helpers.output.OutputExact().set("Terrains")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Terrain")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("tileName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).encloseClass(Terrains.MonsterDens.OUTPUT).encloseClass(Terrains.Chests.OUTPUT).mark();
	public static class MonsterDens {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("MonsterDens")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Terrain")).add(new com.rem.lang.helpers.output.OutputExact().set("MonsterDen")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("tileName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).mark();
	}
	public static class Chests {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Chests")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Terrain")).add(new com.rem.lang.helpers.output.OutputExact().set("Chest")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("tileName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).mark();
	}
}
