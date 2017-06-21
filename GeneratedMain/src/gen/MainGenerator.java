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

public class MainGenerator extends Generator {



	public MainGenerator(){
	}
	public void setup(ParseContext data){
		this.addPage();
		IToken rooT = data.getRoot();
		List<IToken> importsImportAny = rooT.getAll("import_any");
		if(importsImportAny != null){
			for(IToken imports:importsImportAny){
				List<IToken> import_eventsIMPORTEVENT = imports.getAll("IMPORT_EVENT");
				if(import_eventsIMPORTEVENT != null){
					for(IToken import_events:import_eventsIMPORTEVENT){
						List<IToken> elementEventDeclaration = import_events.getAll("event_declaration");
						if(elementEventDeclaration != null){
							for(IToken element:elementEventDeclaration){
								Entry in = Generators.events.generateEventDeclaration(element);
							}
						}
					}
				}
			}
		}
	}
	public void generate(ParseContext data){
		IToken rooT = data.getRoot();
		List<IToken> importsImportAny = rooT.getAll("import_any");
		if(importsImportAny != null){
			for(IToken imports:importsImportAny){
				Entry doop = generateImportAny(imports);
			}
		}
	}
	public Entry generateImportAny(IToken import_any){
		List<IToken> import_eventsIMPORTEVENT = import_any.getAll("IMPORT_EVENT");
		if(import_eventsIMPORTEVENT != null){
			for(IToken import_events:import_eventsIMPORTEVENT){
				List<IToken> elementEventDeclaration = import_events.getAll("event_declaration");
				if(elementEventDeclaration != null){
					for(IToken element:elementEventDeclaration){
						Entry in = Generators.events.generateEventDeclaration(element);
					}
				}
			}
		}
		List<IToken> import_itemsIMPORTITEM = import_any.getAll("IMPORT_ITEM");
		if(import_itemsIMPORTITEM != null){
			for(IToken import_items:import_itemsIMPORTITEM){
				List<IToken> elementImportAny = import_items.getAll("import_any");
				if(elementImportAny != null){
					for(IToken element:elementImportAny){
						Entry in = generateImportAny(element);
					}
				}
				List<IToken> elementItemDeclaration = import_items.getAll("item_declaration");
				if(elementItemDeclaration != null){
					for(IToken element:elementItemDeclaration){
						Entry in = Generators.items.generateItem(element);
					}
				}
			}
		}
		List<IToken> import_aspectsIMPORTASPECT = import_any.getAll("IMPORT_ASPECT");
		if(import_aspectsIMPORTASPECT != null){
			for(IToken import_aspects:import_aspectsIMPORTASPECT){
				List<IToken> elementAspectDeclaration = import_aspects.getAll("aspect_declaration");
				if(elementAspectDeclaration != null){
					for(IToken element:elementAspectDeclaration){
						Entry in = Generators.aspects.generateAspect(element);
					}
				}
			}
		}
		List<IToken> import_affinitiesIMPORTAFFINITY = import_any.getAll("IMPORT_AFFINITY");
		if(import_affinitiesIMPORTAFFINITY != null){
			for(IToken import_affinities:import_affinitiesIMPORTAFFINITY){
				List<IToken> elementAffinityDeclaration = import_affinities.getAll("affinity_declaration");
				if(elementAffinityDeclaration != null){
					for(IToken element:elementAffinityDeclaration){
						Entry in = Generators.affinities.generateAffinity(element);
					}
				}
			}
		}
		List<IToken> import_traitsIMPORTTRAIT = import_any.getAll("IMPORT_TRAIT");
		if(import_traitsIMPORTTRAIT != null){
			for(IToken import_traits:import_traitsIMPORTTRAIT){
				List<IToken> elementTraitDeclaration = import_traits.getAll("trait_declaration");
				if(elementTraitDeclaration != null){
					for(IToken element:elementTraitDeclaration){
						Entry in = Generators.traits.generateTrait(element);
					}
				}
			}
		}
		List<IToken> import_attacksIMPORTATTACK = import_any.getAll("IMPORT_ATTACK");
		if(import_attacksIMPORTATTACK != null){
			for(IToken import_attacks:import_attacksIMPORTATTACK){
				List<IToken> elementAttackDeclaration = import_attacks.getAll("attack_declaration");
				if(elementAttackDeclaration != null){
					for(IToken element:elementAttackDeclaration){
						Entry in = Generators.attacks.generateAttackDeclaration(element);
					}
				}
			}
		}
		List<IToken> import_conditionsIMPORTCONDITION = import_any.getAll("IMPORT_CONDITION");
		if(import_conditionsIMPORTCONDITION != null){
			for(IToken import_conditions:import_conditionsIMPORTCONDITION){
				List<IToken> elementConditionDeclaration = import_conditions.getAll("condition_declaration");
				if(elementConditionDeclaration != null){
					for(IToken element:elementConditionDeclaration){
						Entry in = Generators.conditions.generateCondition(element);
					}
				}
			}
		}
		return null;
	}


	public String getName(){
		return "Main";
	}

		public void generateRoot(IToken root){
	}

	public IParser getLazyNameParser(){
		return null;
	}
}