package fr.cs.ontoeventb.core.owl2pm;

//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.apache.jena.ontology.OntModel;
import org.eclipse.core.resources.IFile;
//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.IResource;
//import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import pivotmodel.Ontology;

public class OwlToPmAction implements IObjectActionDelegate {

	protected ISelection selection;

	public OwlToPmAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		List<IFile> files = (selection instanceof IStructuredSelection) ? ((IStructuredSelection) selection).toList()
				: Collections.EMPTY_LIST;

		if (files.size() > 0) {
			IFile file = files.get(0);
			String fileName = file.getName().split("\\.")[0];
			

			if (file.getFileExtension().equals("owl")) {

				OntModel ontModel = OwlModelApi.readOwlFile(file);
				Ontology pmOntology = OwlModelApi.owlModelToPmOntology(fileName, ontModel);
				OwlModelApi.savePmModel(pmOntology, file.getFullPath().toString().split("\\.")[0] + ".pm");

			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

}
