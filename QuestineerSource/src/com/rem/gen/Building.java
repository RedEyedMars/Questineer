package com.rem.gen;
public class Building {
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("environments"),null).add(new com.rem.lang.helpers.output.OutputExact().set("buildings"),null)).isAbstract().name(new com.rem.lang.helpers.output.OutputExact().set("Building")).extendType(null).implement(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Area")).add(new com.rem.lang.helpers.output.OutputExact().set("Generator"))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Building")).add(new com.rem.lang.helpers.output.OutputExact().set("Type")),new com.rem.lang.helpers.output.OutputExact().set("getId")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Type")),new com.rem.lang.helpers.output.OutputExact().set("NONE")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Treasury")).add(new com.rem.lang.helpers.output.OutputExact().set("Cost")))),new com.rem.lang.helpers.output.OutputExact().set("getCosts")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isAbstract().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("generateAt")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("x"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("y"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Area")),new com.rem.lang.helpers.output.OutputExact().set("newArea"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("place")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Area")),new com.rem.lang.helpers.output.OutputExact().set("area"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("x"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("y")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("generateAt"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("x")).add(new com.rem.lang.helpers.output.OutputExact().set("y")).add(new com.rem.lang.helpers.output.OutputExact().set("area"))))))).encloseClass(Building.Imports.OUTPUT).encloseClass(Building.Type.OUTPUT).encloseClass(Building.Factory.OUTPUT).mark();
	public static com.rem.lang.helpers.output.Output getId(String name){
		return new com.rem.lang.helpers.output.OutputExact(name);
	}
	public static class Imports {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).isEnum().name(new com.rem.lang.helpers.output.OutputExact().set("Imports")).extendType(null).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Treasury")).add(new com.rem.lang.helpers.output.OutputExact().set("Cost")),new com.rem.lang.helpers.output.OutputExact().set("costs"))).mark();
	}
	public static class Type {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).isEnum().name(new com.rem.lang.helpers.output.OutputExact().set("Type")).extendType(null).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("NONE"))).mark();
	}
	public static class Factory {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).isInterface().name(new com.rem.lang.helpers.output.OutputExact().set("Factory")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isAbstract().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Building")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters())).mark();
	}
}
