package at.usga.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import at.usga.OsterhaseFactory;
import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;
import at.usga.Serie;
import at.usga.ui.actions.EditAction;
import at.usga.ui.actions.NewAction;
import at.usga.ui.dialogs.CalcDialog;
import at.usga.ui.dialogs.SearchDialog;
import at.usga.xml.XmlHandler;

public class View extends ViewPart {
	private static final Image EDIT_IMAGE = Activator.getImageDescriptor("icons/user1_edit.png").createImage();
	private static final Image DELETE_IMAGE = Activator.getImageDescriptor("icons/user1_delete.png").createImage();
	private static final Image SHOW_ALL_IMAGE = Activator.getImageDescriptor("icons/users4.png").createImage();
	private static final Image VIEW_IMAGE = Activator.getImageDescriptor("icons/user1_view.png").createImage();
	private static final Image ADD_IMAGE = Activator.getImageDescriptor("icons/navigate_plus.png").createImage();
	private static final Image REMOVE_IMAGE = Activator.getImageDescriptor("icons/navigate_minus.png").createImage();
	private static final Image NEW_IMAGE = Activator.getImageDescriptor("icons/user1_add.png").createImage();
	private static final Image CLEAR_NEW_IMAGE = Activator.getImageDescriptor("icons/user1_new.png").createImage();
	private static final Image CALC_IMAGE = Activator.getImageDescriptor("icons/sam.png").createImage();

	private static final DecimalFormat FORMAT = new DecimalFormat("0.00");

	public static final String ID = "at.usga.ui.view";
	public static final String FILE_NAME = System.getProperty("dir");

	private OsterhasenSchiessen schiessen;
	private Composite composite;
	private ScrolledComposite scrollCompo;
	private EList<Schuetze> filterList = new BasicEList<Schuetze>();
	private Composite infoComposite;
	private Group infoGroup;

	public View() {
		try {
			schiessen = XmlHandler.loadData(FILE_NAME);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createPartControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(5, true));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Button newButton = new Button(composite, SWT.NONE);
		newButton.setImage(CLEAR_NEW_IMAGE);
		newButton.setToolTipText("Schütze hinzufügen");
		newButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				filterList.clear();
				drawSchuetzen();
				
				NewAction newAction = new NewAction(schiessen);
				newAction.run();
				if (newAction.getSchuetze() != null) {
					addSchuetzeToFilterList(newAction.getSchuetze());
				}
				save();
				drawSchuetzen();
			};
		});
		
		Button addButton = new Button(composite, SWT.NONE);
		addButton.setImage(NEW_IMAGE);
		addButton.setToolTipText("Schütze hinzufügen");
		addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				NewAction newAction = new NewAction(schiessen);
				newAction.run();
				if (newAction.getSchuetze() != null) {
					addSchuetzeToFilterList(newAction.getSchuetze());
				}
				save();
				drawSchuetzen();
			};
		});

		Button searchButton = new Button(composite, SWT.NONE);
		searchButton.setImage(VIEW_IMAGE);
		searchButton.setToolTipText("Schütze suchen");
		searchButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				SearchDialog searchDialog = new SearchDialog("Suche", "Schützennummer oder Name eingeben");

				if (searchDialog.open() != Window.OK) {
					return;
				}

				int number = searchDialog.getNumber();
				String searchString = searchDialog.getName();

				filterList.clear();

				if (number > 0) {
					for (Schuetze schuetze : schiessen.getSchuetzen()) {
						if (number == schuetze.getNummer()) {
							addSchuetzeToFilterList(schuetze);
						}
					}
				} else if (searchString != null && !searchString.isEmpty()) {
					for (Schuetze schuetze : schiessen.getSchuetzen()) {
						String name = schuetze.getName();

						if (name != null && name.toLowerCase().contains(searchString.toLowerCase())) {
							addSchuetzeToFilterList(schuetze);
						}
					}
				}

				if (filterList == null || filterList.isEmpty()) {
					MessageDialog.openInformation(null, "Suche", "Keine Treffer bei der Suche");
				} else {
					drawSchuetzen();
				}
			};
		});

		Button showAllButton = new Button(composite, SWT.NONE);
		showAllButton.setImage(SHOW_ALL_IMAGE);
		showAllButton.setToolTipText("Alle Schützen anzeigen");
		showAllButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				filterList.clear();
				filterList.addAll(schiessen.getSchuetzen());
				drawSchuetzen();
			};
		});

		infoGroup = new Group(composite, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		infoGroup.setLayout(layout);
		infoGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

		drawSchuetzen();
	}

	private void createInfoLabels(Composite parent, String labelText, String value) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(labelText);

		label = new Label(parent, SWT.NONE);
		label.setText(value);
	}

	protected void save() {
		XmlHandler.saveData(FILE_NAME, schiessen);
	}

	private void addSchuetzeToFilterList(Schuetze schuetze) {
		if (filterList == null) {
			filterList = new BasicEList<Schuetze>();
		}
		filterList.add(schuetze);
	}

	private void drawSchuetzen() {
		drawInfoBox();

		EList<Schuetze> schuetzen = null;
		if (filterList != null && !filterList.isEmpty()) {
			schuetzen = filterList;
		} else {
			// schuetzen = schiessen.getSchuetzen();
			schuetzen = new BasicEList<Schuetze>();
		}
		ECollections.sort(schuetzen, new Comparator<Schuetze>() {

			public int compare(Schuetze o1, Schuetze o2) {
				return o2.getNummer() - o1.getNummer();
			}
		});
		if (scrollCompo != null && !scrollCompo.isDisposed()) {
			scrollCompo.dispose();
			scrollCompo = null;
		}
		scrollCompo = new ScrolledComposite(composite, SWT.V_SCROLL);
		scrollCompo.setLayout(new GridLayout(1, true));

		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.horizontalSpan = 4;
		scrollCompo.setLayoutData(layoutData);

		Composite parentCompo = new Composite(scrollCompo, SWT.NONE);
		parentCompo.setLayout(new GridLayout(1, true));
		parentCompo.setLayoutData(new GridData(GridData.FILL_BOTH));

		for (Schuetze schuetze : schuetzen) {
			addSchuetzenCombo(schuetze, parentCompo);
		}
		composite.layout();
		composite.redraw();
		scrollCompo.setContent(parentCompo);
		scrollCompo.setExpandHorizontal(true);
		scrollCompo.setExpandVertical(true);
		scrollCompo.setMinSize(parentCompo.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	private void drawInfoBox() {
		if (infoComposite != null && !infoComposite.isDisposed()) {
			infoComposite.dispose();
			infoComposite = null;
		}
		infoComposite = new Composite(infoGroup, SWT.NONE);
		GridLayout layout2 = new GridLayout(2, false);
		layout2.marginWidth = 0;
		layout2.marginHeight = 0;
		infoComposite.setLayout(layout2);
		infoComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		
		int openSeries = 0;
		for(Schuetze schuetze : schiessen.getSchuetzen()) {
			openSeries += openSeries(schuetze);
		}
		double gesamtPreis = 0;
		for(Schuetze schuetze : filterList) {
			gesamtPreis += getPriceOpenSeries(schuetze);
		}
		
		createInfoLabels(infoComposite, "Anzahl Schützen:", String.valueOf(schiessen.getSchuetzen().size()));
		createInfoLabels(infoComposite, "Offene Serien:", String.valueOf(openSeries));
		createInfoLabels(infoComposite, "-------------------------", "----------");
		createInfoLabels(infoComposite, "Gesamtpreis (gefilterte):", getEuroString(gesamtPreis));
		
		infoGroup.layout();
		infoGroup.redraw();
	}

	private void addSchuetzenCombo(final Schuetze schuetze, Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setText(String.valueOf(schuetze.getNummer()));
		group.setLayout(new GridLayout(2, true));

		FontDescriptor boldDescriptor = FontDescriptor.createFrom(group.getFont()).setStyle(SWT.BOLD).increaseHeight(10);
		Font boldFont = boldDescriptor.createFont(group.getDisplay());
		group.setFont(boldFont);

		group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Composite infoCompo = new Composite(group, SWT.NONE);
		infoCompo.setLayout(new GridLayout(3, false));
		infoCompo.setLayoutData(new GridData(GridData.FILL_BOTH));

		infoBlock(schuetze, infoCompo);

		Composite actionCompo = new Composite(group, SWT.NONE);
		actionCompo.setLayout(new GridLayout(3, true));
		actionCompo.setLayoutData(new GridData(GridData.FILL_BOTH));

		serienBlock(schuetze, infoCompo, actionCompo);
	}

	private void serienBlock(final Schuetze schuetze, Composite infoCompo, Composite actionCompo) {
		Label label;
		label = new Label(actionCompo, SWT.NONE);
		label.setText("Gelöste Serien:");

		label = new Label(actionCompo, SWT.NONE);
		String name = String.valueOf(openSeries(schuetze));
		label.setText((name != null) ? name : "---");

		GridData buttonLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		buttonLayoutData.verticalSpan = 2;

		Composite buttonCompo = new Composite(actionCompo, SWT.NONE);
		buttonCompo.setLayout(new GridLayout(2, true));
		buttonCompo.setLayoutData(buttonLayoutData);

		Button addSeriesButton = new Button(buttonCompo, SWT.NONE);
		addSeriesButton.setImage(ADD_IMAGE);
		addSeriesButton.setToolTipText("Serie hinzufügen");
		addSeriesButton.setLayoutData(new GridData());

		addSeriesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Serie createSerie = OsterhaseFactory.eINSTANCE.createSerie();
				schuetze.getSerien().add(createSerie);
				save();
				drawSchuetzen();
			}
		});

		Button removeSeriesButton = new Button(buttonCompo, SWT.NONE);
		removeSeriesButton.setImage(REMOVE_IMAGE);
		removeSeriesButton.setToolTipText("Serie entfernen");
		removeSeriesButton.setLayoutData(new GridData());
		removeSeriesButton.setEnabled(openSeries(schuetze) > 0);

		removeSeriesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Serie serie : schuetze.getSerien()) {
					if (serie.getTeiler() == 0.0) {
						schuetze.getSerien().remove(serie);
						break;
					}
				}
				save();
				drawSchuetzen();
			}
		});

		label = new Label(actionCompo, SWT.NONE);
		label.setText("Preis offene Serien:");

		label = new Label(actionCompo, SWT.NONE);
		String price = getEuroString(getPriceOpenSeries(schuetze));
		label.setText((price != null) ? price : "---");

		label = new Label(actionCompo, SWT.NONE);
		label.setText("Beste Serie:");

		label = new Label(actionCompo, SWT.NONE);
		String bestSeries = getBestSeries(schuetze);
		label.setText((bestSeries != null) ? bestSeries : "---");

		Button calcButton = new Button(actionCompo, SWT.NONE);
		calcButton.setImage(CALC_IMAGE);
		calcButton.setToolTipText("Serien auswerten");
		calcButton.setLayoutData(buttonLayoutData);
		calcButton.setEnabled(openSeries(schuetze) > 0);

		calcButton.addSelectionListener(new SelectionAdapter() {
			private ArrayList<Price> prices;

			@Override
			public void widgetSelected(SelectionEvent e) {
				prices = new ArrayList<Price>();
				while(calculate(schuetze) == CalcDialog.NEXT_SERIES && openSeries(schuetze) > 0);
				StringBuffer buffer = new StringBuffer();
				for (Price price : prices) {
					buffer.append(price.toString() + "\n");
				}
				MessageDialog.openInformation(null, "Preise", buffer.toString());
			}

			private int calculate(final Schuetze schuetze) {
				CalcDialog calcDialog = new CalcDialog("Auswertung", "Liest die Serie ein und berechnet den Preis");
				int open = calcDialog.open();
				if(open == Window.OK || open == CalcDialog.NEXT_SERIES) {
					double teiler = calcDialog.getTeiler();
					if(teiler > 0.0) {
						EList<Serie> serien = schuetze.getSerien();
						Serie createSerie = null;
						for (Serie serie : serien) {
							if(serie.getTeiler() == 0.0) {
								createSerie = serie;
								break;
							}
						}
						if(createSerie == null) {
							createSerie = OsterhaseFactory.eINSTANCE.createSerie();
							schuetze.getSerien().add(createSerie);
						}
						createSerie.setTeiler(teiler);
						prices.add(new Price(teiler));
					}
				}
				save();
				drawSchuetzen();
				return open;
			}
		});
		
		label = new Label(actionCompo, SWT.NONE);
		label.setText("Serien:");
		label.setLayoutData(new GridData(GridData.BEGINNING, GridData.BEGINNING, false, false));

		label = new Label(actionCompo, SWT.NONE);
		StringBuffer buffer = new StringBuffer();
		
		EList<Serie> serien = schuetze.getSerien();
		ECollections.sort(serien, new Comparator<Serie>() {

			public int compare(Serie arg0, Serie arg1) {
				return Double.compare(arg0.getTeiler(), arg1.getTeiler());
			}
			
		});
		for (Serie serie : serien) {
			double teiler = serie.getTeiler();
			if(teiler != 0.0) {
				buffer.append(FORMAT.format(Double.valueOf(teiler)) + " T\n");
			}
		}
		label.setText((buffer.length() > 0) ? buffer.toString() : "---");
	}

	private String getBestSeries(Schuetze schuetze) {
		double bestResult = -1.0;
		for (Serie serie : schuetze.getSerien()) {
			double teiler = serie.getTeiler();
			if (teiler != 0.0 && (teiler < bestResult || bestResult == -1.0)) {
				bestResult = teiler;
			}
		}
		if (bestResult != -1.0) {
			return FORMAT.format(Double.valueOf(bestResult)) + " T";
		}
		return null;
	}

	private double getPriceOpenSeries(Schuetze schuetze) {
		EList<Serie> serien = schuetze.getSerien();
		int openSeries = openSeries(schuetze);
		double price = 0;
		if (openSeries != 0) {
			price = openSeries * 2.50;
			if (openSeries == serien.size() && !schuetze.isJung()) {
				price += 1.50;
			}
		}
		return price;
	}

	private String getEuroString(double price) {
		return "€ " + FORMAT.format(Double.valueOf(price));
	}

	private int openSeries(Schuetze schuetze) {
		int i = 0;
		for (Serie serie : schuetze.getSerien()) {
			if (serie.getTeiler() == 0.0) {
				i++;
			}
		}
		return i;
	}

	private void infoBlock(final Schuetze schuetze, Composite infoCompo) {
		Label label = new Label(infoCompo, SWT.NONE);
		label.setText("Name:");

		label = new Label(infoCompo, SWT.NONE);
		String name = schuetze.getName();
		label.setText((name != null) ? name : "---");

		GridData buttonLayoutData = new GridData();
		buttonLayoutData.verticalSpan = 2;

		Button deleteButton = new Button(infoCompo, SWT.NONE);
		deleteButton.setImage(DELETE_IMAGE);
		deleteButton.setToolTipText("Schütze löschen");
		deleteButton.setLayoutData(buttonLayoutData);

		deleteButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog dialog = new MessageDialog(null, "Löschen", null, "Soll der Schütze '" + schuetze.getName() + "' wirklich gelöscht werden?",
						MessageDialog.QUESTION, new String[] { "Löschen", "Abbrechen" }, 1);
				boolean delete = dialog.open() == Window.OK;
				if (delete) {
					schiessen.getSchuetzen().remove(schuetze);
					if (filterList != null) {
						filterList.remove(schuetze);
					}
					drawSchuetzen();
				}
			}
		});

		label = new Label(infoCompo, SWT.NONE);
		label.setText("Ort/Verein:");

		label = new Label(infoCompo, SWT.NONE);
		String ort = schuetze.getOrt();
		label.setText((ort != null) ? ort : "---");

		label = new Label(infoCompo, SWT.NONE);
		label.setText("Jungschütze:");

		Button button = new Button(infoCompo, SWT.CHECK);
		button.setEnabled(false);
		boolean jung = schuetze.isJung();
		button.setText("Jahrgang 2000 und jünger");
		button.setSelection(jung);

		Button editButton = new Button(infoCompo, SWT.NONE);
		editButton.setImage(EDIT_IMAGE);
		editButton.setToolTipText("Schütze bearbeiten");
		editButton.setLayoutData(buttonLayoutData);

		editButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EditAction editAction = new EditAction(schiessen, schuetze);
				editAction.run();
				save();
				drawSchuetzen();
			}
		});

		label = new Label(infoCompo, SWT.NONE);
		label.setText("Bemerkung:");

		label = new Label(infoCompo, SWT.NONE);
		String bemerkung = schuetze.getBemerkung();
		label.setText((bemerkung != null) ? bemerkung : "---");
	}

	public void setFocus() {
		composite.setFocus();
	}
}