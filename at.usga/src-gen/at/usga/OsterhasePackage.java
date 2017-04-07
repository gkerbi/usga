/**
 */
package at.usga;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.usga.OsterhaseFactory
 * @model kind="package"
 * @generated
 */
public interface OsterhasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "at.usga";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://osterhase/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "at.usga";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsterhasePackage eINSTANCE = at.usga.impl.OsterhasePackageImpl.init();

	/**
	 * The meta object id for the '{@link at.usga.impl.SerieImpl <em>Serie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.usga.impl.SerieImpl
	 * @see at.usga.impl.OsterhasePackageImpl#getSerie()
	 * @generated
	 */
	int SERIE = 0;

	/**
	 * The feature id for the '<em><b>Teiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__TEILER = 0;

	/**
	 * The feature id for the '<em><b>Bezahlt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__BEZAHLT = 1;

	/**
	 * The feature id for the '<em><b>Ausgegeben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE__AUSGEGEBEN = 2;

	/**
	 * The number of structural features of the '<em>Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.usga.impl.SchuetzeImpl <em>Schuetze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.usga.impl.SchuetzeImpl
	 * @see at.usga.impl.OsterhasePackageImpl#getSchuetze()
	 * @generated
	 */
	int SCHUETZE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Jung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE__JUNG = 1;

	/**
	 * The feature id for the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE__ORT = 2;

	/**
	 * The feature id for the '<em><b>Serien</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE__SERIEN = 3;

	/**
	 * The feature id for the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE__NUMMER = 4;

	/**
	 * The feature id for the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE__BEMERKUNG = 5;

	/**
	 * The number of structural features of the '<em>Schuetze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHUETZE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link at.usga.impl.OsterhasenSchiessenImpl <em>Osterhasen Schiessen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.usga.impl.OsterhasenSchiessenImpl
	 * @see at.usga.impl.OsterhasePackageImpl#getOsterhasenSchiessen()
	 * @generated
	 */
	int OSTERHASEN_SCHIESSEN = 2;

	/**
	 * The feature id for the '<em><b>Preisjung</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTERHASEN_SCHIESSEN__PREISJUNG = 0;

	/**
	 * The feature id for the '<em><b>Preisalt</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTERHASEN_SCHIESSEN__PREISALT = 1;

	/**
	 * The feature id for the '<em><b>Preisnachkauf</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTERHASEN_SCHIESSEN__PREISNACHKAUF = 2;

	/**
	 * The feature id for the '<em><b>Altersgrenze</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTERHASEN_SCHIESSEN__ALTERSGRENZE = 3;

	/**
	 * The feature id for the '<em><b>Schuetzen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTERHASEN_SCHIESSEN__SCHUETZEN = 4;

	/**
	 * The number of structural features of the '<em>Osterhasen Schiessen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSTERHASEN_SCHIESSEN_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link at.usga.Serie <em>Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serie</em>'.
	 * @see at.usga.Serie
	 * @generated
	 */
	EClass getSerie();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Serie#getTeiler <em>Teiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teiler</em>'.
	 * @see at.usga.Serie#getTeiler()
	 * @see #getSerie()
	 * @generated
	 */
	EAttribute getSerie_Teiler();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Serie#isBezahlt <em>Bezahlt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezahlt</em>'.
	 * @see at.usga.Serie#isBezahlt()
	 * @see #getSerie()
	 * @generated
	 */
	EAttribute getSerie_Bezahlt();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Serie#isAusgegeben <em>Ausgegeben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ausgegeben</em>'.
	 * @see at.usga.Serie#isAusgegeben()
	 * @see #getSerie()
	 * @generated
	 */
	EAttribute getSerie_Ausgegeben();

	/**
	 * Returns the meta object for class '{@link at.usga.Schuetze <em>Schuetze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schuetze</em>'.
	 * @see at.usga.Schuetze
	 * @generated
	 */
	EClass getSchuetze();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Schuetze#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.usga.Schuetze#getName()
	 * @see #getSchuetze()
	 * @generated
	 */
	EAttribute getSchuetze_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Schuetze#isJung <em>Jung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jung</em>'.
	 * @see at.usga.Schuetze#isJung()
	 * @see #getSchuetze()
	 * @generated
	 */
	EAttribute getSchuetze_Jung();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Schuetze#getOrt <em>Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort</em>'.
	 * @see at.usga.Schuetze#getOrt()
	 * @see #getSchuetze()
	 * @generated
	 */
	EAttribute getSchuetze_Ort();

	/**
	 * Returns the meta object for the containment reference list '{@link at.usga.Schuetze#getSerien <em>Serien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serien</em>'.
	 * @see at.usga.Schuetze#getSerien()
	 * @see #getSchuetze()
	 * @generated
	 */
	EReference getSchuetze_Serien();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Schuetze#getNummer <em>Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer</em>'.
	 * @see at.usga.Schuetze#getNummer()
	 * @see #getSchuetze()
	 * @generated
	 */
	EAttribute getSchuetze_Nummer();

	/**
	 * Returns the meta object for the attribute '{@link at.usga.Schuetze#getBemerkung <em>Bemerkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bemerkung</em>'.
	 * @see at.usga.Schuetze#getBemerkung()
	 * @see #getSchuetze()
	 * @generated
	 */
	EAttribute getSchuetze_Bemerkung();

	/**
	 * Returns the meta object for class '{@link at.usga.OsterhasenSchiessen <em>Osterhasen Schiessen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osterhasen Schiessen</em>'.
	 * @see at.usga.OsterhasenSchiessen
	 * @generated
	 */
	EClass getOsterhasenSchiessen();

	/**
	 * Returns the meta object for the attribute list '{@link at.usga.OsterhasenSchiessen#getPreisjung <em>Preisjung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preisjung</em>'.
	 * @see at.usga.OsterhasenSchiessen#getPreisjung()
	 * @see #getOsterhasenSchiessen()
	 * @generated
	 */
	EAttribute getOsterhasenSchiessen_Preisjung();

	/**
	 * Returns the meta object for the attribute list '{@link at.usga.OsterhasenSchiessen#getPreisalt <em>Preisalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preisalt</em>'.
	 * @see at.usga.OsterhasenSchiessen#getPreisalt()
	 * @see #getOsterhasenSchiessen()
	 * @generated
	 */
	EAttribute getOsterhasenSchiessen_Preisalt();

	/**
	 * Returns the meta object for the attribute list '{@link at.usga.OsterhasenSchiessen#getPreisnachkauf <em>Preisnachkauf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preisnachkauf</em>'.
	 * @see at.usga.OsterhasenSchiessen#getPreisnachkauf()
	 * @see #getOsterhasenSchiessen()
	 * @generated
	 */
	EAttribute getOsterhasenSchiessen_Preisnachkauf();

	/**
	 * Returns the meta object for the attribute list '{@link at.usga.OsterhasenSchiessen#getAltersgrenze <em>Altersgrenze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altersgrenze</em>'.
	 * @see at.usga.OsterhasenSchiessen#getAltersgrenze()
	 * @see #getOsterhasenSchiessen()
	 * @generated
	 */
	EAttribute getOsterhasenSchiessen_Altersgrenze();

	/**
	 * Returns the meta object for the containment reference list '{@link at.usga.OsterhasenSchiessen#getSchuetzen <em>Schuetzen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schuetzen</em>'.
	 * @see at.usga.OsterhasenSchiessen#getSchuetzen()
	 * @see #getOsterhasenSchiessen()
	 * @generated
	 */
	EReference getOsterhasenSchiessen_Schuetzen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsterhaseFactory getOsterhaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.usga.impl.SerieImpl <em>Serie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.usga.impl.SerieImpl
		 * @see at.usga.impl.OsterhasePackageImpl#getSerie()
		 * @generated
		 */
		EClass SERIE = eINSTANCE.getSerie();

		/**
		 * The meta object literal for the '<em><b>Teiler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE__TEILER = eINSTANCE.getSerie_Teiler();

		/**
		 * The meta object literal for the '<em><b>Bezahlt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE__BEZAHLT = eINSTANCE.getSerie_Bezahlt();

		/**
		 * The meta object literal for the '<em><b>Ausgegeben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIE__AUSGEGEBEN = eINSTANCE.getSerie_Ausgegeben();

		/**
		 * The meta object literal for the '{@link at.usga.impl.SchuetzeImpl <em>Schuetze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.usga.impl.SchuetzeImpl
		 * @see at.usga.impl.OsterhasePackageImpl#getSchuetze()
		 * @generated
		 */
		EClass SCHUETZE = eINSTANCE.getSchuetze();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUETZE__NAME = eINSTANCE.getSchuetze_Name();

		/**
		 * The meta object literal for the '<em><b>Jung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUETZE__JUNG = eINSTANCE.getSchuetze_Jung();

		/**
		 * The meta object literal for the '<em><b>Ort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUETZE__ORT = eINSTANCE.getSchuetze_Ort();

		/**
		 * The meta object literal for the '<em><b>Serien</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHUETZE__SERIEN = eINSTANCE.getSchuetze_Serien();

		/**
		 * The meta object literal for the '<em><b>Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUETZE__NUMMER = eINSTANCE.getSchuetze_Nummer();

		/**
		 * The meta object literal for the '<em><b>Bemerkung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHUETZE__BEMERKUNG = eINSTANCE.getSchuetze_Bemerkung();

		/**
		 * The meta object literal for the '{@link at.usga.impl.OsterhasenSchiessenImpl <em>Osterhasen Schiessen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.usga.impl.OsterhasenSchiessenImpl
		 * @see at.usga.impl.OsterhasePackageImpl#getOsterhasenSchiessen()
		 * @generated
		 */
		EClass OSTERHASEN_SCHIESSEN = eINSTANCE.getOsterhasenSchiessen();

		/**
		 * The meta object literal for the '<em><b>Preisjung</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSTERHASEN_SCHIESSEN__PREISJUNG = eINSTANCE.getOsterhasenSchiessen_Preisjung();

		/**
		 * The meta object literal for the '<em><b>Preisalt</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSTERHASEN_SCHIESSEN__PREISALT = eINSTANCE.getOsterhasenSchiessen_Preisalt();

		/**
		 * The meta object literal for the '<em><b>Preisnachkauf</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSTERHASEN_SCHIESSEN__PREISNACHKAUF = eINSTANCE.getOsterhasenSchiessen_Preisnachkauf();

		/**
		 * The meta object literal for the '<em><b>Altersgrenze</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSTERHASEN_SCHIESSEN__ALTERSGRENZE = eINSTANCE.getOsterhasenSchiessen_Altersgrenze();

		/**
		 * The meta object literal for the '<em><b>Schuetzen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSTERHASEN_SCHIESSEN__SCHUETZEN = eINSTANCE.getOsterhasenSchiessen_Schuetzen();

	}

} //OsterhasePackage
