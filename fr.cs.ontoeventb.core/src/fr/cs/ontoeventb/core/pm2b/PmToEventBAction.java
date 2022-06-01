package fr.cs.ontoeventb.core.pm2b;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.rodinp.core.*;

import fr.cs.ontoeventb.core.rodinapi.RodinContext;
import fr.cs.ontoeventb.core.rodinapi.RodinCreation;
import pivotmodel.Ontology;

public class PmToEventBAction implements IObjectActionDelegate{
	
	protected ISelection selection;
	
	public PmToEventBAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		List<IFile> files = (selection instanceof IStructuredSelection) ? 
				((IStructuredSelection) selection).toList() : Collections.EMPTY_LIST;
		
		if(files.size()>0) {
			
			IFile file = files.get(0); 
			String[] fileName = file.getName().split("\\.");
			String fExt = fileName[fileName.length-1];
			String pName = file.getProject().getName();
			
			if(fExt.equals("pm")) {
				
				Ontology ontology = PivotModelApi.readOntology(file);
				RodinContext rodinContext = PivotModelApi.pivotModelToContext(ontology);
				try {
					IRodinProject rodinProject = RodinCreation.createRodinProject(pName);
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
