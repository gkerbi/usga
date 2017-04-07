package at.usga.ui.dialogs;

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

public class SearchDialog extends TitleAreaDialog {

	private String title;
	private String text;
	private int number = -1;
	protected String name;

	public SearchDialog(String title, String text) {
		super(Display.getDefault().getActiveShell());
		this.title = title;
		this.text = text;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		super.setTitle(title);
		super.setMessage(text);
		Composite group = new Composite(parent, SWT.NONE);
		group.setLayoutData(new GridData(GridData.FILL_BOTH));
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("Nummer oder Name:");

		Text text = new Text(group, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		text.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				String stringText = ((Text) e.getSource()).getText();
				try {
					number = Integer.decode(stringText);
					name = null;
				} catch (NumberFormatException ex) {
					number = -1;
					name = stringText;
				}
			}
		});

		return group;
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}

}
