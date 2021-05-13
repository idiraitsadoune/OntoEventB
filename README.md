# OntoEventB: A Generator of Event-B contexts from Ontologies

## The OntoEventB plug-in
In the context of the [IMPEX project](https://impex.loria.fr/), two modeling approaches are proposed to formalize ontology description using the Event-B models. The first one defines a formal approach to encode ontologies directly as Event-B Contexts elements (shallow approach). The second approach uses deep modeling in which first ontology generic concepts are defined in Event-B Contexts and then ontologies are defined as specific instances of these generic models in other Event-B Contexts.

The OntoEventB Rodin plug-in implements the proposed approaches and it has been developed to automatically support the formalisation of ontologies, described with ontology description languages like OWL or OntoML using set theory and predicate logic supported by the Event-B method. 

## Download & Installation Instructions
The OntoEventB tool is developed as an Eclipse plug-in to integrate it into a Rodin platform which is an Eclipse product and an IDE (Integrated Development Environment) supporting Event-B developments.

To use the OntoEventB plug-in in your Rodin platform instance, you must, first, install xText plugin ([xText update site](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/)), and then the OntoEventB plugin ([OntoEventB update site](http://wdi.supelec.fr/OntoEventB-update-site/)). After installing these plugins in your Rodin platform instance, the OntoEventB sub-menu becomes available by right-clicking on a file with a .owl, .xml, or .pm extensions in the project explorer. 

## Contacting the Author

Idir AIT SADOUNE : Associate Professor at CentraleSupélec. [Professional web page](http://wdi.centralesupelec.fr/aitsadoune/).

Feel free to send me any comments about plugin and this page.
