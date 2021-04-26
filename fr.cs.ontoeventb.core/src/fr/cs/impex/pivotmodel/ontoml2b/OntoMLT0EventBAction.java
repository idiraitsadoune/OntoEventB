package fr.cs.impex.pivotmodel.ontoml2b;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

import fr.cs.impex.pivotmodel.ontoml2pm.OntoMLModelApi;
import fr.cs.impex.pivotmodel.pm2b.PivotModelApi;
import fr.cs.rodindev.rodinapi.RodinContext;
import fr.cs.rodindev.rodinapi.RodinCreation;
import pivotmodel.Ontology;

public class OntoMLT0EventBAction implements IObjectActionDelegate{

	protected ISelection selection;
	
	public OntoMLT0EventBAction () {
		super();
	}
	
	@Override
	public void run(IAction action) {
		List<IFile> files = (selection instanceof IStructuredSelection) ? ((IStructuredSelection) selection).toList()
				: Collections.EMPTY_LIST;

		if (files.size() > 0) {
			IFile file = files.get(0);
			String fileName = file.getName().split("\\.")[0];
			IProject iProject = file.getProject();

			if (file.getFileExtension().equals("xml")) {

				OntoMLModelApi.readOntoMLlFile(file);
				OntoMLModelApi.OntoMLToPmOntology(fileName);
				Ontology pmOntology = OntoMLModelApi.getOntology();
				
				RodinContext rodinContext = PivotModelApi.pivotModelToContext(pmOntology);
				try {
					IRodinProject rodinProject = RodinCreation.createRodinProject(iProject.getName());
					RodinCreation.creatRodinContext(rodinContext,rodinProject);
					
				} catch (RodinDBException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

}
