package com.rem.gen;
import java.util.ArrayList;
import com.rem.gen.ActivityTypes;
import com.rem.gen.Events;
import java.util.List;
public class Activities {
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("entities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("behaviours"),null).add(new com.rem.lang.helpers.output.OutputExact().set("activities"),null)).name(new com.rem.lang.helpers.output.OutputExact().set("Activities")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("activityName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).mark();
	public static void setup(com.rem.gen.parser.Parser.Result.Pass data){
		Events.addToEventMethod("load",com.rem.lang.helpers.output.OutputClassStructure.getClass("Activity"),new com.rem.lang.helpers.output.OutputBody());
		Events.addToEventMethod("idle",com.rem.lang.helpers.output.OutputClassStructure.getClass("Activity"),new com.rem.lang.helpers.output.OutputBody());
		Events.addToEventMethod("success",com.rem.lang.helpers.output.OutputClassStructure.getClass("Activity"),new com.rem.lang.helpers.output.OutputBody());
		Events.addToEventMethod("fail",com.rem.lang.helpers.output.OutputClassStructure.getClass("Activity"),new com.rem.lang.helpers.output.OutputBody());
	}
	public static void declaration(com.rem.gen.parser.Token declarationToken){
		String activityName = com.rem.lang.helpers.output.OutputHelper.camelize((declarationToken.get(com.rem.gen.parser.Token.Id._activityName)).toString());
		String declaredTypeName = ActivityTypes.currentlyDeclaredTypeName;
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact(activityName)).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity"))).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("id")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputArguments()))).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Usable")))),new com.rem.lang.helpers.output.OutputExact().set("allUsables")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("ArrayList")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Usable")))),new com.rem.lang.helpers.output.OutputArguments()))).variable(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host")).assign(new com.rem.lang.helpers.output.OutputExact().set("null"))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(activityName),new com.rem.lang.helpers.output.OutputExact().set("")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody())).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getName")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputQuote().set((activityName).toString()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getDescription")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputQuote().set((declarationToken.get(com.rem.gen.parser.Token.Id._DESCRIPTION)).toString()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("ActivityType")),new com.rem.lang.helpers.output.OutputExact().set("getType")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("ActivityTypes")).add(declaredTypeName),new com.rem.lang.helpers.output.OutputCall()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("List")).template(new com.rem.lang.helpers.output.OutputType.Template().add(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Usable")))),new com.rem.lang.helpers.output.OutputExact().set("getUsables")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("allUsables"))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("hasSucceeded")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody())).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("hasFailed")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody())).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activity")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("getId")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("id"))))));
		if(declarationToken.get(com.rem.gen.parser.Token.Id._method_parameters)!=null){
			List<com.rem.lang.helpers.output.OutputVariable> variables = new ArrayList<com.rem.lang.helpers.output.OutputVariable>();
			for(com.rem.gen.parser.Token element:declarationToken.get(com.rem.gen.parser.Token.Id._method_parameters).getAllSafely(com.rem.gen.parser.Token.Id._variable_header)){
				variables.add(QuestineerSource.addVariableHeader(element,com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString())));
			}
			(com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString())).addDefaultConstructor(variables);
		}
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._variable_declaration)){
			com.rem.lang.helpers.output.OutputVariable variable = QuestineerSource.addVariableHeader(element.get(com.rem.gen.parser.Token.Id._variable_header),com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()));
			if(element.get(com.rem.gen.parser.Token.Id._statement)!=null){
				variable.assign(QuestineerSource.getStatement(element.get(com.rem.gen.parser.Token.Id._statement),com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString())));
			}
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getMethod("create(String)").prepend(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activities")).add(activityName),new com.rem.lang.helpers.output.OutputArguments())))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("activityName"),null).add(new com.rem.lang.helpers.output.OutputExact().set("equals"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set((activityName).toString())))))));
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._className)){
			com.rem.lang.helpers.output.OutputClassStructure.getClass("Entity").getMethod("gain("+element+",Source)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activities")).add(activityName),new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("allUsables"),null).add(new com.rem.lang.helpers.output.OutputExact().set("add"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact((element).toString().toLowerCase())))))));
		}
		com.rem.lang.helpers.output.OutputContext hasSucceededContext = com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("hasSucceeded(Entity)");
		com.rem.lang.helpers.output.OutputContext hasFailedContext = com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("hasFailed(Entity)");
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._endState)){
			if(element.get(com.rem.gen.parser.Token.Id._SUCCEED)!=null){
				com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("hasSucceeded(Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(QuestineerSource.getBooleanStatement(element.get(com.rem.gen.parser.Token.Id._boolean_statement),hasSucceededContext)))));
			}
			else{
				com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("hasFailed(Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(QuestineerSource.getBooleanStatement(element.get(com.rem.gen.parser.Token.Id._boolean_statement),hasFailedContext)))));
			}
		}
		if(declarationToken.get(com.rem.gen.parser.Token.Id._getTarget)!=null){
			com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("getTarget")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")).add(new com.rem.lang.helpers.output.OutputExact().set("Criteria")),new com.rem.lang.helpers.output.OutputExact().set("targetCriteria")))).body(new com.rem.lang.helpers.output.OutputBody()));
			com.rem.lang.helpers.output.OutputContext getTargetContext = com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("getTarget(Entity,Entity.Criteria)");
			for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._getTarget)){
				for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._body_element)){
					com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("getTarget(Entity,Entity.Criteria)").append(QuestineerSource.getBodyElement(atom,getTargetContext));
				}
			}
		}
		if(declarationToken.get(com.rem.gen.parser.Token.Id._getDestination)!=null){
			com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("getDestination")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody()));
			com.rem.lang.helpers.output.OutputContext getTargetContext = com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("getDestination(Entity)");
			for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._getDestination)){
				for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._body_element)){
					com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("getDestination(Entity)").append(QuestineerSource.getBodyElement(atom,getTargetContext));
				}
			}
		}
		if(declarationToken.get(com.rem.gen.parser.Token.Id._step)!=null){
			for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._step)){
				com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("step")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host")))).body(new com.rem.lang.helpers.output.OutputBody()));
				com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("step(Entity)").append(QuestineerSource.getBodyElements(element,com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("step(Entity)")));
			}
		}
		if(declarationToken.get(com.rem.gen.parser.Token.Id._listen)!=null){
			com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("void")),new com.rem.lang.helpers.output.OutputExact().set("listen")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("host"))).add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")).add(new com.rem.lang.helpers.output.OutputExact().set("Event")),new com.rem.lang.helpers.output.OutputExact().set("event")))).body(new com.rem.lang.helpers.output.OutputBody()));
			com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("listen(Entity,Entity.Event)").append(QuestineerSource.getBodyElements(declarationToken.get(com.rem.gen.parser.Token.Id._listen),com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("listen(Entity,Entity.Event)")));
		}
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._event_statement)){
			Events.addToEventMethod((element.get(com.rem.gen.parser.Token.Id._event_names)).toString(),com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()),QuestineerSource.getBodyElements(element,Events.getEventContext((element.get(com.rem.gen.parser.Token.Id._event_names)).toString(),com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()))));
		}
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("hasSucceeded(Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Activities").getEnclosedClass((activityName).toString()).getMethod("hasFailed(Entity)").append(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false"))));
	}
	public static com.rem.lang.helpers.output.Output getId(String name){
		return new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Activities")).add(name),new com.rem.lang.helpers.output.OutputExact().set("id"));
	}
}