package com.rem.gen;
import com.rem.gen.Entity;
import java.util.HashMap;
import com.rem.gen.Events;
public class Conditions {
	public static com.rem.lang.helpers.output.OutputClass OUTPUT = new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact(QuestineerSource.packageName),null).add(new com.rem.lang.helpers.output.OutputExact().set("entities"),null).add(new com.rem.lang.helpers.output.OutputExact().set("mods"),null).add(new com.rem.lang.helpers.output.OutputExact().set("conditions"),null)).name(new com.rem.lang.helpers.output.OutputExact().set("Conditions")).extendType(null).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Condition")),new com.rem.lang.helpers.output.OutputExact().set("create")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("conditionName")))).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("null"))))).mark();
	public static void setup(com.rem.gen.parser.Parser.Result.Pass data){
		Events.addEventMethods(com.rem.lang.helpers.output.OutputClassStructure.getClass("Condition"),new HashMap<String, com.rem.lang.helpers.output.OutputBody>());
	}
	public static void declaration(com.rem.gen.parser.Token declarationToken){
		String conditionName = com.rem.lang.helpers.output.OutputHelper.camelize((declarationToken.get(com.rem.gen.parser.Token.Id._conditionName)).toString());
		String conditionDescription = (declarationToken.get(com.rem.gen.parser.Token.Id._DESCRIPTION)).toString();
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").encloseClass(new com.rem.lang.helpers.output.OutputClass()._package(new com.rem.lang.helpers.output.OutputCall()).name(new com.rem.lang.helpers.output.OutputExact(conditionName)).extendType(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Condition"))).implement(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Source"))).variable(new com.rem.lang.helpers.output.OutputVariable().isPublic().isStatic().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Condition")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputExact().set("id")).assign(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Condition")).add(new com.rem.lang.helpers.output.OutputExact().set("Id")),new com.rem.lang.helpers.output.OutputArguments()))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getName")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputQuote().set((conditionName).toString()))))).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("String")),new com.rem.lang.helpers.output.OutputExact().set("getDescription")).parameters(new com.rem.lang.helpers.output.OutputParameters()).body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputQuote().set((conditionDescription).toString()))))));
		com.rem.lang.helpers.output.OutputBody requirementsBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.OutputBody gainBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.OutputBody lossBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.OutputBody tickBody = new com.rem.lang.helpers.output.OutputBody();
		com.rem.lang.helpers.output.CallableOutput eventHost = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHost"),new com.rem.lang.helpers.output.OutputArguments());
		com.rem.lang.helpers.output.CallableOutput candidate = new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("candidate"));
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._requirement)){
			requirementsBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("false")))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(QuestineerSource.getRequirement(element,candidate,false)))));
		}
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._imposition)){
			gainBody.add(Entity.getImposition(element,true,eventHost));
			lossBody.add(Entity.getImposition(element,false,eventHost));
		}
		com.rem.lang.helpers.output.OutputContext gainContext = Events.addToEventMethod("gain",com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getEnclosedClass((conditionName).toString()),new com.rem.lang.helpers.output.OutputBody());
		com.rem.lang.helpers.output.OutputContext loseContext = Events.addToEventMethod("loss",com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getEnclosedClass((conditionName).toString()),new com.rem.lang.helpers.output.OutputBody());
		com.rem.lang.helpers.output.OutputContext tickContext = Events.addToEventMethod("tick",com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getEnclosedClass((conditionName).toString()),new com.rem.lang.helpers.output.OutputBody());
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._acquisition)){
			gainBody.add(QuestineerSource.getAcquisition(element,true,eventHost,gainContext));
			gainBody.add(QuestineerSource.getAcquisition(element,false,eventHost,loseContext));
		}
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._accumulation)){
			for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._imposition)){
				tickBody.add(Entity.getImposition(atom,true,eventHost));
			}
			for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._acquisition)){
				tickBody.add(QuestineerSource.getAcquisition(atom,true,eventHost,tickContext));
			}
		}
		Boolean isFirst = true;
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._to_lose)){
			for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._chance_pair)){
				com.rem.lang.helpers.output.OutputConditionalHeader chanceHeader = new com.rem.lang.helpers.output.OutputConditionalHeader();
				for(com.rem.gen.parser.Token quark:atom.getAllSafely(com.rem.gen.parser.Token.Id._has_chance)){
					chanceHeader.call(QuestineerSource.getChance(quark));
				}
				if(atom.get(com.rem.gen.parser.Token.Id._boolean_statement)==null){
					if(isFirst){
						tickBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHost"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("lose"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("id")).add(new com.rem.lang.helpers.output.OutputExact().set("this")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chanceHeader))));
					}
					else{
						tickBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHost"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("lose"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("id")).add(new com.rem.lang.helpers.output.OutputExact().set("this")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chanceHeader))));
					}
					isFirst=true;
				}
				else{
					if(isFirst){
						tickBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHost"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("lose"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("id")).add(new com.rem.lang.helpers.output.OutputExact().set("this")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chanceHeader)))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(QuestineerSource.getBooleanStatement(atom.get(com.rem.gen.parser.Token.Id._boolean_statement),tickContext)))));
						isFirst=false;
					}
					else{
						tickBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("else if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().set(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputExact().set("event"),null).add(new com.rem.lang.helpers.output.OutputExact().set("getHost"),new com.rem.lang.helpers.output.OutputArguments()).add(new com.rem.lang.helpers.output.OutputExact().set("lose"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputExact().set("id")).add(new com.rem.lang.helpers.output.OutputExact().set("this")))))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(chanceHeader)))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(QuestineerSource.getBooleanStatement(atom.get(com.rem.gen.parser.Token.Id._boolean_statement),tickContext)))));
					}
				}
			}
		}
		requirementsBody.add(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputExact().set("true"))));
		HashMap<String, com.rem.lang.helpers.output.OutputBody> eventBodies = new HashMap<String, com.rem.lang.helpers.output.OutputBody>();
		for(com.rem.gen.parser.Token element:declarationToken.getAllSafely(com.rem.gen.parser.Token.Id._event_statement)){
			com.rem.lang.helpers.output.OutputBody eventBody = new com.rem.lang.helpers.output.OutputBody();
			String eventName = (element.get(com.rem.gen.parser.Token.Id._event_names)).toString();
			if(eventName.equals("lose")){
				eventName="loss";
			}
			com.rem.lang.helpers.output.OutputContext eventContext = Events.addToEventMethod(eventName,com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getEnclosedClass((conditionName).toString()),new com.rem.lang.helpers.output.OutputBody());
			if(eventName.equals("gain")){
				eventBody=gainBody;
			}
			else if(eventName.equals("loss")){
				eventBody=lossBody;
			}
			else if(eventName.equals("tick")){
				eventBody=tickBody;
			}
			for(com.rem.gen.parser.Token atom:element.getAllSafely(com.rem.gen.parser.Token.Id._body_element)){
				eventBody.add(QuestineerSource.getBodyElement(atom,eventContext));
			}
			eventBodies.put(eventName,eventBody);
		}
		eventBodies.put("gain",gainBody);
		eventBodies.put("loss",lossBody);
		eventBodies.put("tick",tickBody);
		Events.addEventMethodsExclusive(com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getEnclosedClass((conditionName).toString()),eventBodies);
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getEnclosedClass((conditionName).toString()).method(new com.rem.lang.helpers.output.OutputMethod().access("public ").set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Boolean")),new com.rem.lang.helpers.output.OutputExact().set("hasRequirements")).parameters(new com.rem.lang.helpers.output.OutputParameters().add(new com.rem.lang.helpers.output.OutputVariable().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Entity")),new com.rem.lang.helpers.output.OutputExact().set("candidate")))).body(requirementsBody));
		com.rem.lang.helpers.output.OutputClassStructure.getClass("Conditions").getMethod("create(String)").prepend(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputConditional().init("if").body(new com.rem.lang.helpers.output.OutputBody().add(new com.rem.lang.helpers.output.OutputStatement().prefix("return ").set(new com.rem.lang.helpers.output.OutputNewObject().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Conditions")).add(conditionName),new com.rem.lang.helpers.output.OutputArguments())))).header(new com.rem.lang.helpers.output.OutputConditionalHeader().declare(null).call(new com.rem.lang.helpers.output.OutputCall().add(new com.rem.lang.helpers.output.OutputQuote().set((conditionName).toString()),null).add(new com.rem.lang.helpers.output.OutputExact().set("equals"),new com.rem.lang.helpers.output.OutputArguments().add(new com.rem.lang.helpers.output.OutputQuote().set(conditionName)))))));
	}
	public static com.rem.lang.helpers.output.Output getId(String name){
		return new com.rem.lang.helpers.output.OutputStaticCall().set(new com.rem.lang.helpers.output.OutputType().add(new com.rem.lang.helpers.output.OutputExact().set("Conditions")).add(name),new com.rem.lang.helpers.output.OutputExact().set("id"));
	}
}
