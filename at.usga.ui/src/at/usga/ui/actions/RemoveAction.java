package at.usga.ui.actions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;

import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;
import at.usga.xml.XmlHandler;

public class RemoveAction extends Action {
	private TableViewer viewer;
	private String fileName;
	private OsterhasenSchiessen osterhasenschiessen;

	public RemoveAction(TableViewer viewer, String fileName, OsterhasenSchiessen osterhasenschiessen) {
		this.viewer = viewer;
		this.fileName = fileName;
		this.osterhasenschiessen = osterhasenschiessen;
	}

	@Override
	public String getText() {
		return "Löschen";
	}

	public void run() {
		IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
		EList<Schuetze> schuetzen = osterhasenschiessen.getSchuetzen();
		for (Object object : selection.toList()) {
			schuetzen.remove(object);
		}
		viewer.refresh();
		XmlHandler.saveData(fileName, osterhasenschiessen);
	}

	@Override
	public boolean isEnabled() {
		return !viewer.getSelection().isEmpty();
	}
}
