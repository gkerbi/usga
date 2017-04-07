/**
 */
package at.usga.impl;

import at.usga.OsterhaseFactory;
import at.usga.OsterhasePackage;
import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;
import at.usga.Serie;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsterhasePackageImpl extends EPackageImpl implements OsterhasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schuetzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osterhasenSchiessenEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.usga.OsterhasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsterhasePackageImpl() {
		super(eNS_URI, OsterhaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OsterhasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsterhasePackage init() {
		if (isInited) return (OsterhasePackage)EPackage.Registry.INSTANCE.getEPackage(OsterhasePackage.eNS_URI);

		// Obtain or create and register package
		OsterhasePackageImpl theOsterhasePackage = (OsterhasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OsterhasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OsterhasePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOsterhasePackage.createPackageContents();

		// Initialize created meta-data
		theOsterhasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsterhasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsterhasePackage.eNS_URI, theOsterhasePackage);
		return theOsterhasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerie() {
		return serieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerie_Teiler() {
		return (EAttribute)serieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerie_Bezahlt() {
		return (EAttribute)serieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSerie_Ausgegeben() {
		return (EAttribute)serieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchuetze() {
		return schuetzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchuetze_Name() {
		return (EAttribute)schuetzeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchuetze_Jung() {
		return (EAttribute)schuetzeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchuetze_Ort() {
		return (EAttribute)schuetzeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchuetze_Serien() {
		return (EReference)schuetzeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchuetze_Nummer() {
		return (EAttribute)schuetzeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchuetze_Bemerkung() {
		return (EAttribute)schuetzeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOsterhasenSchiessen() {
		return osterhasenSchiessenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsterhasenSchiessen_Preisjung() {
		return (EAttribute)osterhasenSchiessenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsterhasenSchiessen_Preisalt() {
		return (EAttribute)osterhasenSchiessenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsterhasenSchiessen_Preisnachkauf() {
		return (EAttribute)osterhasenSchiessenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOsterhasenSchiessen_Altersgrenze() {
		return (EAttribute)osterhasenSchiessenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOsterhasenSchiessen_Schuetzen() {
		return (EReference)osterhasenSchiessenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsterhaseFactory getOsterhaseFactory() {
		return (OsterhaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serieEClass = createEClass(SERIE);
		createEAttribute(serieEClass, SERIE__TEILER);
		createEAttribute(serieEClass, SERIE__BEZAHLT);
		createEAttribute(serieEClass, SERIE__AUSGEGEBEN);

		schuetzeEClass = createEClass(SCHUETZE);
		createEAttribute(schuetzeEClass, SCHUETZE__NAME);
		createEAttribute(schuetzeEClass, SCHUETZE__JUNG);
		createEAttribute(schuetzeEClass, SCHUETZE__ORT);
		createEReference(schuetzeEClass, SCHUETZE__SERIEN);
		createEAttribute(schuetzeEClass, SCHUETZE__NUMMER);
		createEAttribute(schuetzeEClass, SCHUETZE__BEMERKUNG);

		osterhasenSchiessenEClass = createEClass(OSTERHASEN_SCHIESSEN);
		createEAttribute(osterhasenSchiessenEClass, OSTERHASEN_SCHIESSEN__PREISJUNG);
		createEAttribute(osterhasenSchiessenEClass, OSTERHASEN_SCHIESSEN__PREISALT);
		createEAttribute(osterhasenSchiessenEClass, OSTERHASEN_SCHIESSEN__PREISNACHKAUF);
		createEAttribute(osterhasenSchiessenEClass, OSTERHASEN_SCHIESSEN__ALTERSGRENZE);
		createEReference(osterhasenSchiessenEClass, OSTERHASEN_SCHIESSEN__SCHUETZEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(serieEClass, Serie.class, "Serie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSerie_Teiler(), ecorePackage.getEDouble(), "teiler", null, 0, 1, Serie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerie_Bezahlt(), ecorePackage.getEBoolean(), "bezahlt", null, 0, 1, Serie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerie_Ausgegeben(), ecorePackage.getEBoolean(), "ausgegeben", null, 0, 1, Serie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schuetzeEClass, Schuetze.class, "Schuetze", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchuetze_Name(), ecorePackage.getEString(), "name", null, 0, 1, Schuetze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchuetze_Jung(), ecorePackage.getEBoolean(), "jung", null, 0, 1, Schuetze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchuetze_Ort(), ecorePackage.getEString(), "ort", null, 0, 1, Schuetze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchuetze_Serien(), this.getSerie(), null, "serien", null, 0, -1, Schuetze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchuetze_Nummer(), ecorePackage.getEInt(), "nummer", null, 0, 1, Schuetze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchuetze_Bemerkung(), ecorePackage.getEString(), "bemerkung", null, 0, 1, Schuetze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osterhasenSchiessenEClass, OsterhasenSchiessen.class, "OsterhasenSchiessen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsterhasenSchiessen_Preisjung(), ecorePackage.getEDouble(), "preisjung", null, 0, 10, OsterhasenSchiessen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsterhasenSchiessen_Preisalt(), ecorePackage.getEDouble(), "preisalt", null, 0, 10, OsterhasenSchiessen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsterhasenSchiessen_Preisnachkauf(), ecorePackage.getEDouble(), "preisnachkauf", null, 0, 10, OsterhasenSchiessen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOsterhasenSchiessen_Altersgrenze(), ecorePackage.getEInt(), "altersgrenze", null, 1980, 2010, OsterhasenSchiessen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsterhasenSchiessen_Schuetzen(), this.getSchuetze(), null, "schuetzen", null, 0, -1, OsterhasenSchiessen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OsterhasePackageImpl
