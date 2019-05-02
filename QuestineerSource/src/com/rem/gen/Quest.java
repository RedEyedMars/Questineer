package com.rem.gen;
public class Quest {
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("entities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("behaviours"),null).add(new com.rem.lang.helpers.output.OutputExact().set("quests"),null)).name(new com.rem.lang.helpers.output.OutputExact().set("Quest")).extendType(null).implement(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Usable"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Status")),new com.rem.lang.helpers.output.OutputExact().set("status")).assign(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Status")),new com.rem.lang.helpers.output.OutputExact().set("UNSTARTED")))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")),new com.rem.lang.helpers.output.OutputExact().set("currentActivity")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Integer")),new com.rem.lang.helpers.output.OutputExact().set("currentActivityIndex")).assign(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator()).operator("-").right(new com.rem.lang.helpers.output.OutputExact().set("1")))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")))),new com.rem.lang.helpers.output.OutputExact().set("activities")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("ArrayList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")))),new com.rem.lang.helpers.output.OutputArguments()))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("getId")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("canChase")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Float")),new com.rem.lang.helpers.output.OutputExact().set("getRange")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("user")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("0f"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Predicate")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")))),new com.rem.lang.helpers.output.OutputExact().set("getTargetCriteria")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")).add(new com.rem.lang.helpers.output.OutputExact().set("Criteria")).add(new com.rem.lang.helpers.output.OutputExact().set("True")),new com.rem.lang.helpers.output.OutputArguments()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Predicate")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Tile")))),new com.rem.lang.helpers.output.OutputExact().set("getDestinationCriteria")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Tile")).add(new com.rem.lang.helpers.output.OutputExact().set("Criteria")).add(new com.rem.lang.helpers.output.OutputExact().set("Free")),new com.rem.lang.helpers.output.OutputArguments()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Predicate")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Terrain")))),new com.rem.lang.helpers.output.OutputExact().set("getTerrainCriteria")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputLambda().declare(new com.rem.lang.helpers.output.OutputVariable().set(com.rem.lang.helpers.output.OutputType.Any,new com.rem.lang.helpers.output.OutputExact().set("T"))).call(new com.rem.lang.helpers.output.OutputExact().set("false")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("use")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("user"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")),new com.rem.lang.helpers.output.OutputExact().set("activity")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("on"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("StartQuest")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("this")).add(new com.rem.lang.helpers.output.OutputExact().set("user")))))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("status")).operator("==").right(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Status")),new com.rem.lang.helpers.output.OutputExact().set("UNSTARTED")))))).add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("currentActivity"),null).add(new com.rem.lang.helpers.output.OutputExact().set("on"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Tick")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("user"))))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("currentActivity")).operator("!=").right(new com.rem.lang.helpers.output.OutputExact().set("null"))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("add")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")),new com.rem.lang.helpers.output.OutputExact().set("newActivity")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("activities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("newActivity"))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("newActivity"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Listeners")).add(new com.rem.lang.helpers.output.OutputExact().set("Success")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("this")).add(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("activities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("size"),new com.rem.lang.helpers.output.OutputArguments()))))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("newActivity"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Listeners")).add(new com.rem.lang.helpers.output.OutputExact().set("Fail")),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("this"))))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("advanceTo")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Integer")),new com.rem.lang.helpers.output.OutputExact().set("newIndex")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("currentActivity")).operator("=").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("activities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("get"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("newIndex")))))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("currentActivityIndex")).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("newIndex"))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("newIndex")).operator("<").right(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("activities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("size"),new com.rem.lang.helpers.output.OutputArguments()))))).add(new com.rem.lang.helpers.output.OutputConditional().init("else").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("status")).operator("=").right(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Status")),new com.rem.lang.helpers.output.OutputExact().set("SUCCESS"))))))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("on")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Idle")),new com.rem.lang.helpers.output.OutputExact().set("idle")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("on")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Collect")),new com.rem.lang.helpers.output.OutputExact().set("idle")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("on")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Die")),new com.rem.lang.helpers.output.OutputExact().set("idle")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))))).encloseClass(Quest.Id.OUTPUT).encloseClass(Quest.Listeners.OUTPUT).encloseClass(Quest.Criteria.OUTPUT).encloseClass(Quest.Status.OUTPUT).mark();
	public static class Id {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Id")).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Usable")).add(new com.rem.lang.helpers.output.OutputExact().set("Id"))).mark();
	}
	public static class Listeners {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Listeners")).extendType(null).encloseClass(Listeners.Success.OUTPUT).encloseClass(Listeners.Fail.OUTPUT).encloseClass(Listeners.Collect.OUTPUT).encloseClass(Listeners.Die.OUTPUT).mark();
		public static class Success {
			public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Success")).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Success")).add(new com.rem.lang.helpers.output.OutputExact().set("Listener"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Integer")),new com.rem.lang.helpers.output.OutputExact().set("nextIndex")).assign(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputOperator()).operator("-").right(new com.rem.lang.helpers.output.OutputExact().set("1")))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Success")),new com.rem.lang.helpers.output.OutputExact().set("")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("int")),new com.rem.lang.helpers.output.OutputExact().set("nextIndex")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("host"),null)).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("host")))).add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("nextIndex"),null)).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("nextIndex")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("listen")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Success")),new com.rem.lang.helpers.output.OutputExact().set("event")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("host"),null).add(new com.rem.lang.helpers.output.OutputExact().set("advanceTo"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("nextIndex"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))))).mark();
		}
		public static class Fail {
			public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Fail")).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Fail")).add(new com.rem.lang.helpers.output.OutputExact().set("Listener"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Fail")),new com.rem.lang.helpers.output.OutputExact().set("")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("host"),null)).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("host")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("listen")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Fail")),new com.rem.lang.helpers.output.OutputExact().set("event")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("host"),null).add(new com.rem.lang.helpers.output.OutputExact().set("on"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputCast().type(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Fail"))).subject(new com.rem.lang.helpers.output.OutputExact().set("event")))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))))).mark();
		}
		public static class Collect {
			public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Collect")).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Collect")).add(new com.rem.lang.helpers.output.OutputExact().set("Listener"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Collect")),new com.rem.lang.helpers.output.OutputExact().set("")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("host"),null)).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("host")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("listen")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Collect")),new com.rem.lang.helpers.output.OutputExact().set("event")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("host"),null).add(new com.rem.lang.helpers.output.OutputExact().set("on"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("event"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))))).mark();
		}
		public static class Die {
			public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Die")).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Die")).add(new com.rem.lang.helpers.output.OutputExact().set("Listener"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Die")),new com.rem.lang.helpers.output.OutputExact().set("")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("host"),null)).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("host")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("listen")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Events")).add(new com.rem.lang.helpers.output.OutputExact().set("Die")),new com.rem.lang.helpers.output.OutputExact().set("event")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("host"),null).add(new com.rem.lang.helpers.output.OutputExact().set("on"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("event"))))).add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))))).mark();
		}
	}
	public static class Criteria {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Criteria")).extendType(null).implement(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Predicate")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("test")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("candidate")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))))).encloseClass(Criteria.Success.OUTPUT).mark();
		public static class Success {
			public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("Success")).extendType(null).implement(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")).add(new com.rem.lang.helpers.output.OutputExact().set("Criteria"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Success")),new com.rem.lang.helpers.output.OutputExact().set("")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("this"),null).add(new com.rem.lang.helpers.output.OutputExact().set("host"),null)).operator("=").right(new com.rem.lang.helpers.output.OutputExact().set("host")))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("test")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")),new com.rem.lang.helpers.output.OutputExact().set("event")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("host"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getStatus"),new com.rem.lang.helpers.output.OutputArguments())).operator("==").right(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Quest")).add(new com.rem.lang.helpers.output.OutputExact().set("Status")),new com.rem.lang.helpers.output.OutputExact().set("SUCCESS"))))))).mark();
		}
	}
	public static class Status {
		public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).isEnum().name(new com.rem.lang.helpers.output.OutputExact().set("Status")).extendType(null).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("UNSTARTED"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("IN_PROGRESS"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("SUCCESS"))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("FAIL"))).mark();
	}
}