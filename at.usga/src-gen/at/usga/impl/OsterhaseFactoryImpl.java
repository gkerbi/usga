/**
 */
package at.usga.impl;

import at.usga.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsterhaseFactoryImpl extends EFactoryImpl implements OsterhaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsterhaseFactory init() {
		try {
			OsterhaseFactory theOsterhaseFactory = (OsterhaseFactory)EPackage.Registry.INSTANCE.getEFactory("http://osterhase/1.0"); 
			if (theOsterhaseFactory != null) {
				return theOsterhaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsterhaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsterhaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsterhasePackage.SERIE: return createSerie();
			case OsterhasePackage.SCHUETZE: return createSchuetze();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN: return createOsterhasenSchiessen();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serie createSerie() {
		SerieImpl serie = new SerieImpl();
		return serie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schuetze createSchuetze() {
		SchuetzeImpl schuetze = new SchuetzeImpl();
		return schuetze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsterhasenSchiessen createOsterhasenSchiessen() {
		OsterhasenSchiessenImpl osterhasenSchiessen = new OsterhasenSchiessenImpl();
		return osterhasenSchiessen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsterhasePackage getOsterhasePackage() {
		return (OsterhasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsterhasePackage getPackage() {
		return OsterhasePackage.eINSTANCE;
	}

} //OsterhaseFactoryImpl
