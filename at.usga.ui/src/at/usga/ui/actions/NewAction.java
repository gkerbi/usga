package at.usga.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.window.Window;

import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;
import at.usga.commands.AddSchuetzeCommand;
import at.usga.impl.OsterhaseFactoryImpl;
import at.usga.ui.dialogs.EditSchuetzeDialog;

public class NewAction extends Action {
	private OsterhasenSchiessen osterhasenschiessen;
	private Schuetze schuetze;

	public NewAction(OsterhasenSchiessen osterhasenschiessen) {
		this.osterhasenschiessen = osterhasenschiessen;
	}

	@Override
	public String getText() {
		return "Neuer Schütze";
	}

	public void run() {
		schuetze = OsterhaseFactoryImpl.eINSTANCE.createSchuetze();
		AddSchuetzeCommand command = new AddSchuetzeCommand(osterhasenschiessen, schuetze);
		command.execute();
		EditSchuetzeDialog dialog = new EditSchuetzeDialog("Neuer Schütze", "Daten für neuen Schützen eingeben", schuetze);
		if (dialog.open() != Window.OK) {
			command.undo();
			schuetze = null;
		} else {
			schuetze.setName(dialog.getName());
			schuetze.setJung(dialog.isJung());
			schuetze.setOrt(dialog.getOrt());
			schuetze.setBemerkung(dialog.getBemerkung());
			schuetze.getSerien().add(OsterhaseFactoryImpl.eINSTANCE.createSerie());
		}
	}
	
	public Schuetze getSchuetze() {
		return schuetze;
	}
	
}
