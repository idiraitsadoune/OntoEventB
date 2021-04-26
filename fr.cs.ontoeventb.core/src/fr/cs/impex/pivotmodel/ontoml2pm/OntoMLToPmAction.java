package fr.cs.impex.pivotmodel.ontoml2pm;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.cs.impex.pivotmodel.owl2pm.OwlModelApi;
//import iso.std.iso.is._13584._32.ed._1.tech.xml.schema.ontoml.ONTOMLType;
//import pivotmodel.Ontology;

public class OntoMLToPmAction implements IObjectActionDelegate {

	protected ISelection selection;

	public OntoMLToPmAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		List<IFile> files = (selection instanceof IStructuredSelection) ? ((IStructuredSelection) selection).toList()
				: Collections.EMPTY_LIST;

		if (files.size() > 0) {
			IFile file = files.get(0);
			String[] fileName = file.getName().split("\\.");
			String fExt = fileName[fileName.length - 1];

			if (fExt.equals("xml")) {
				OntoMLModelApi.readOntoMLlFile(file);
				OntoMLModelApi.OntoMLToPmOntology(fileName[0]);
				OwlModelApi.savePmModel(OntoMLModelApi.getOntology(),
						file.getFullPath().toString().split("\\.")[0] + ".pm");
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
