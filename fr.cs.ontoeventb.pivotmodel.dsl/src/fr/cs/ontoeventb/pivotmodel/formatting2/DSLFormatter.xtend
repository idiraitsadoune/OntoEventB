/*
 * generated by Xtext 2.25.0
 */
package fr.cs.ontoeventb.pivotmodel.formatting2

import com.google.inject.Inject
import fr.cs.ontoeventb.pivotmodel.services.DSLGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pivotmodel.MeasureType
import pivotmodel.Ontology

class DSLFormatter extends AbstractFormatter2 {
	
	@Inject extension DSLGrammarAccess

	def dispatch void format(Ontology ontology, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (classDefinition : ontology.containedClasses) {
			classDefinition.format
		}
		for (propertyDefinition : ontology.containedProperties) {
			propertyDefinition.format
		}
		for (dataTypeDefinition : ontology.containedDataTypes) {
			dataTypeDefinition.format
		}
	}

	def dispatch void format(MeasureType measureType, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		measureType.unit.format
	}
	
	// TODO: implement for DerivedUnit
}
