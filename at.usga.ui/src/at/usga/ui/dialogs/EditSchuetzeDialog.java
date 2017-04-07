package at.usga.ui.dialogs;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.usga.Schuetze;

public class EditSchuetzeDialog extends TitleAreaDialog {

	private Schuetze schuetze;
	private boolean jung;
	private String name;
	private String ort;
	private String title;
	private String text;
	private String bemerkung;

	public EditSchuetzeDialog(String title, String text, Schuetze schuetze) {
		super(Display.getDefault().getActiveShell());
		this.title = title;
		this.text = text;
		this.schuetze = schuetze;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		super.setTitle(title);
		super.setMessage(text);
		Composite group = new Composite(parent, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_BOTH));
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("Nummer:");

		label = new Label(group, SWT.BORDER);
		label.setText(String.valueOf(schuetze.getNummer()));

		label = new Label(group, SWT.NONE);
		label.setText("Name:");

		Text text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		name = schuetze.getName();
		if (name != null) {
			text.setText(name);
		}
		text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				name = ((Text) e.getSource()).getText();
			}

		});

		label = new Label(group, SWT.NONE);
		label.setText("Ort/Verein:");

		text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		ort = schuetze.getOrt();
		if (ort != null) {
			text.setText(ort);
		}
		text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				ort = ((Text) e.getSource()).getText();
			}

		});

		label = new Label(group, SWT.NONE);
		label.setText("Jungschütze:");

		Button button = new Button(group, SWT.CHECK);
		jung = schuetze.isJung();
		button.setText("Jahrgang 2000 und jünger");
		button.setSelection(jung);
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				jung = ((Button) e.getSource()).getSelection();
			}
		});
		
		label = new Label(group, SWT.NONE);
		label.setText("Bemerkung:");

		text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		bemerkung = schuetze.getBemerkung();
		if (bemerkung != null) {
			text.setText(bemerkung);
		}
		text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				bemerkung = ((Text) e.getSource()).getText();
			}

		});

		return group;
	}

	public boolean isJung() {
		return jung;
	}

	public String getName() {
		return name;
	}

	public String getOrt() {
		return ort;
	}

	public String getBemerkung() {
		return bemerkung;
	}
}
