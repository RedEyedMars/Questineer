package com.rem.gen;
import com.rem.gen.Entity;
import java.util.HashMap;
import com.rem.gen.Events;
import java.util.Map;
public class Traits {
	public static com.rem.lang.helpers.output.OutputArguments traitsAsParameter = new com.rem.lang.helpers.output.OutputArguments();
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("entities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("mods"),null).add(new com.rem.lang.helpers.output.OutputExact().set("traits"),null)).name(new com.rem.lang.helpers.output.OutputExact().set("Traits")).extendType(null).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")).array(),new com.rem.lang.helpers.output.OutputExact().set("traits")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")),new com.rem.lang.helpers.output.OutputArguments().add(traitsAsParameter).array(new com.rem.lang.helpers.output.OutputExact().set(""))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("traitName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).mark();
	public static void output(){
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").removeVariable("traits");
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")).array(),new com.rem.lang.helpers.output.OutputExact().set("traits")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")),new com.rem.lang.helpers.output.OutputArguments().add(traitsAsParameter).array(new com.rem.lang.helpers.output.OutputExact().set("")))));
	}
	public static com.rem.lang.helpers.output.CallableOutput getId(String name){
		return new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")).add(name),new com.rem.lang.helpers.output.OutputCall());
	}
	public static void declaration(com.rem.gen.parser.Token declarationToken){
		String traitName = (declarationToken.get(com.rem.gen.parser.Token.Id._traitName)).toString();
		String traitClassName = com.rem.lang.helpers.output.OutputHelper.camelize(traitName);
		com.rem.lang.helpers.output.OutputBody gainBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.OutputBody lossBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.OutputBody requirementsBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.Output eventHost = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHost"),new com.rem.lang.helpers.output.OutputArguments());
		com.rem.lang.helpers.output.CallableOutput candidate = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("candidate"));
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._impose)){
			gainBody.add(Entity.getImposition(element,true,eventHost));
			lossBody.add(Entity.getImposition(element,false,eventHost));
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact(traitClassName)).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait"))).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("id")).assign(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Trait")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")).add(traitClassName),new com.rem.lang.helpers.output.OutputCall()))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getName")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputQuote().set((traitClassName).toString()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("boolean")),new com.rem.lang.helpers.output.OutputExact().set("hasRequirements")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("candidate")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(traitClassName),new com.rem.lang.helpers.output.OutputExact(traitName)).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(traitClassName),new com.rem.lang.helpers.output.OutputArguments())));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Trait").getEnclosedClass("Id").variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact(traitName)));
		traitsAsParameter.add(new com.rem.lang.helpers.output.OutputExact(traitName));
		Map<String, com.rem.lang.helpers.output.OutputBody> eventBodies = new HashMap<String, com.rem.lang.helpers.output.OutputBody>();
		eventBodies.put("gain",gainBody);
		eventBodies.put("loss",lossBody);
		Events.addEventMethodsExclusive(com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").getEnclosedClass((traitClassName).toString()),eventBodies);
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._requirement)){
			com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").getEnclosedClass((traitClassName).toString()).getMethod("hasRequirements(Entity)").prepend(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(QuestineerSource.getRequirement(element,candidate,false)))));
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Traits").getMethod("create(String)").prepend(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Traits")).add(traitClassName),new com.rem.lang.helpers.output.OutputArguments())))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputQuote().set((traitClassName).toString()),null).add(new com.rem.lang.helpers.output.OutputExact().set("equals"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("traitName")))))));
	}
}
