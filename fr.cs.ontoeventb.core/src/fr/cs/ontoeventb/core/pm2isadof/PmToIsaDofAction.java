package fr.cs.ontoeventb.core.pm2isadof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import pivotmodel.Ontology;

public class PmToIsaDofAction implements IObjectActionDelegate {

	protected ISelection selection;

	public PmToIsaDofAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		List<IFile> files = (selection instanceof IStructuredSelection) ? ((IStructuredSelection) selection).toList()
				: Collections.EMPTY_LIST;

		if (files.size() > 0) {

			IFile file = files.get(0);
			String fExt = file.getFileExtension();
			
			if (fExt.equals("pm")) {
				
				Ontology ontology = PivotModelApi.readOntology(file);
				String location = file.getLocation().toString().substring(0, file.getLocation().toString().length()-file.getName().length());
				
				try {
					String file_name = location + ontology.getName() + ".thy";
					String file_content = PivotModelApi.pivotModelToIsaDof(ontology);
			
					FileWriter theory = new FileWriter(file_name, true);
				    BufferedWriter bw = new BufferedWriter(theory);
				    PrintWriter pw = new PrintWriter(bw);
				    
				    pw.write(file_content);

				    pw.close();
				    bw.close();
				    theory.close();
				    
					System.out.println("Theory created: " + file_name);
					
				} catch (IOException e) {
					System.out.println("An error occurred.");
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
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
