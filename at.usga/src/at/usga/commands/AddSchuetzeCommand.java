package at.usga.commands;

import java.util.Comparator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;

public class AddSchuetzeCommand {

	private OsterhasenSchiessen schiessen;
	private Schuetze schuetze;

	public AddSchuetzeCommand(OsterhasenSchiessen schiessen, Schuetze schuetze) {
		this.schiessen = schiessen;
		this.schuetze = schuetze;
	}
	
	public void execute() {
		EList<Schuetze> schuetzen = schiessen.getSchuetzen();
		schuetze.setNummer(getNextFreeNumber());
		schuetzen.add(schuetze);
	}

	public void undo() {
		schiessen.getSchuetzen().remove(schuetze);
	}
	
	private int getNextFreeNumber() {
		EList<Schuetze> schuetzen = schiessen.getSchuetzen();
		ECollections.sort(schuetzen, new Comparator<Schuetze>() {

			public int compare(Schuetze o1, Schuetze o2) {
				return o1.getNummer() - o2.getNummer();
			}});
		
		int i = 1;
		for (Schuetze schuetze : schuetzen) {
			if(schuetze.getNummer() != i) {
				break;
			}
			i++;
		}
		return i;
	}
}
