package com.rem.gen;
public class Supports {
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("entities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("behaviours"),null).add(new com.rem.lang.helpers.output.OutputExact().set("skills"),null).add(new com.rem.lang.helpers.output.OutputExact().set("supports"),null)).name(new com.rem.lang.helpers.output.OutputExact().set("Supports")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Support")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("supportName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).mark();
	public static com.rem.lang.helpers.output.Output getId(String name){
		return new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Supports")).add(name),new com.rem.lang.helpers.output.OutputExact().set("id"));
	}
	public static void declaration(com.rem.gen.parser.Token declarationToken){
		String supportName = com.rem.lang.helpers.output.OutputHelper.camelize((declarationToken.get(com.rem.gen.parser.Token.Id._supportName)).toString());
		com.rem.lang.helpers.output.OutputOperator description = new com.rem.lang.helpers.output.OutputOperator("+");
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._DESCRIPTION)){
			description.add(new com.rem.lang.helpers.output.OutputQuote().set(element));
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact().set("supportName")).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Support"))).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Support")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("id")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Support")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputArguments()))).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Skill")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("skillId")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Skill")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputArguments()))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Support")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("getSupportId")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("id"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Skill")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("getId")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("skillId"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getName")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputQuote().set((supportName).toString()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getDescription")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(description)))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("use")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("user"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("victim")))).body(new com.rem.lang.helpers.output.OutputBody())));
		boolean isFirst = true;
		com.rem.lang.helpers.output.OutputContext useContext = com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("use(Entity,Entity)");
		for(com.rem.gen.parser.Token element:declarationToken.getAll()){
			switch(element.getName()){
				case _cooldown :{
					com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("()").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("cost")).operator("=").right(Entity.getStatRange(element.get(com.rem.gen.parser.Token.Id._stat_range),useContext)))));
					break;
				}
				case _range :{
					com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("()").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputOperator().left(new com.rem.lang.helpers.output.OutputExact().set("range")).operator("=").right(Entity.getStatRange(element.get(com.rem.gen.parser.Token.Id._stat_range),useContext)))));
					break;
				}
				case _miss :{
					com.rem.lang.helpers.output.Output setMiss = new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputCall())));
					for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._option)){
						com.rem.lang.helpers.output.Output chance = QuestineerSource.getChance(atom.get(com.rem.gen.parser.Token.Id._has_chance));
						if(atom.get(com.rem.gen.parser.Token.Id._boolean_statement)!=null){
							com.rem.lang.helpers.output.Output bool = QuestineerSource.getBooleanStatement(atom.get(com.rem.gen.parser.Token.Id._boolean_statement),useContext);
							if(isFirst){
								com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("use(Entity,Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(setMiss))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chance)))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(bool))));
								isFirst=false;
							}
							else{
								com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("use(Entity,Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(setMiss))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chance)))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(bool))));
							}
						}
						else{
							if(isFirst){
								com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("use(Entity,Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(setMiss))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chance))));
								isFirst=false;
							}
							else{
								com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getEnclosedClass((supportName).toString()).getMethod("use(Entity,Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(setMiss))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chance))));
							}
						}
					}
					break;
				}
			}
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Supports").getMethod("create(String)").prepend(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Supports")).add(supportName),new com.rem.lang.helpers.output.OutputArguments())))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputQuote().set((supportName).toString()),null).add(new com.rem.lang.helpers.output.OutputExact().set("equals"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("supportName")))))));
	}
}
