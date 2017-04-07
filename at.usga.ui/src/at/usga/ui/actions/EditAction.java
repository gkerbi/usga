package at.usga.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.window.Window;

import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;
import at.usga.ui.dialogs.EditSchuetzeDialog;

public class EditAction extends Action {
	private Schuetze schuetze;

	public EditAction(OsterhasenSchiessen schiessen, Schuetze schuetze) {
		this.schuetze = schuetze;
	}

	@Override
	public String getText() {
		return "Bearbeiten";
	}

	public void run() {
		if (schuetze == null) {
			return;
		}
		EditSchuetzeDialog dialog = new EditSchuetzeDialog("Bearbeiten", "Daten des Schützen bearbeiten oder ergänzen", schuetze);
		if (dialog.open() == Window.OK) {
			schuetze.setName(dialog.getName());
			schuetze.setJung(dialog.isJung());
			schuetze.setOrt(dialog.getOrt());
			schuetze.setBemerkung(dialog.getBemerkung());
		}
	}

}
