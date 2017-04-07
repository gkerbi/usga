package at.usga.ui.dialogs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.usga.sam4000.ITeilerListener;
import at.usga.sam4000.Sam4000;

public class CalcDialog extends TitleAreaDialog implements ITeilerListener {

	public static final int NEXT_SERIES = 123;
	private String title;
	private String text;
	private double teiler = 0.0;
	private Text bestShot;
	private List<Text> texts;
	private Sam4000 machine;
	private int index = 0;

	public CalcDialog(String title, String text) {
		super(Display.getDefault().getActiveShell());
		this.title = title;
		this.text = text;

		try {
			machine = Sam4000.getInstance();
			machine.addListener(this);
			machine.startEvaluation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		super.setTitle(title);
		super.setMessage(text);
		Composite group = new Composite(parent, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_BOTH));
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("1. Streifen:");

		Composite compo1 = new Composite(group, SWT.NONE);
		compo1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout(5, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;

		compo1.setLayout(layout);

		texts = new ArrayList<Text>();

		createText(compo1, texts);
		createText(compo1, texts);
		createText(compo1, texts);
		createText(compo1, texts);
		createText(compo1, texts);

		label = new Label(group, SWT.NONE);
		label.setText("2. Streifen:");

		Composite compo2 = new Composite(group, SWT.NONE);
		compo2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		compo2.setLayout(layout);

		createText(compo2, texts);
		createText(compo2, texts);
		createText(compo2, texts);
		createText(compo2, texts);
		createText(compo2, texts);

		label = new Label(group, SWT.NONE);
		label = new Label(group, SWT.NONE);

		label = new Label(group, SWT.NONE);
		label.setText("Bester Teiler:");

		bestShot = new Text(group, SWT.BORDER);
		GridData layoutData = new GridData(GridData.BEGINNING);
		layoutData.widthHint = 30;
		bestShot.setLayoutData(layoutData);
		bestShot.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				String stringText = ((Text) e.getSource()).getText();
				stringText = stringText.replace(",", ".");
				try {
					teiler = Double.parseDouble(stringText);
				} catch (NumberFormatException ex) {
					teiler = 0.0;
				}
			}
		});

		bestShot.setFocus();

		return group;
	}

	private void createText(Composite parent, List<Text> texts) {
		Text text = new Text(parent, SWT.READ_ONLY | SWT.BORDER);
		GridData layoutData = new GridData();
		layoutData.widthHint = 60;
		text.setLayoutData(layoutData);
		texts.add(text);
	}

	public double getTeiler() {
		return teiler;
	}

	public void teilerReceived(final double newTeiler) {
		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				Text text2 = texts.get(index);
				text2.setText(Double.toString(newTeiler));
				if (teiler == 0.0 || newTeiler < teiler) {
					teiler = newTeiler;
					bestShot.setText(Double.toString(newTeiler));
				}
				index++;
				if (index == 9) {
					setMessage("Serie ausgewertet", IMessageProvider.WARNING);
				}
			}

		});
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, NEXT_SERIES, "Weitere Serie", false);
		createButton(parent, IDialogConstants.OK_ID, "Speichern", true);
		createButton(parent, IDialogConstants.CANCEL_ID, "Abbrechen", false);
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if(buttonId == NEXT_SERIES) {
			setReturnCode(NEXT_SERIES);
			close();
		}
		super.buttonPressed(buttonId);
	}

	@Override
	public boolean close() {
		if (machine != null) {
			machine.removeListener(this);
			machine.stopEvaluation();
		}
		return super.close();
	}
}
