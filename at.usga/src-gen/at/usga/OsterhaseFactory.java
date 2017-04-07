/**
 */
package at.usga;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.usga.OsterhasePackage
 * @generated
 */
public interface OsterhaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsterhaseFactory eINSTANCE = at.usga.impl.OsterhaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Serie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serie</em>'.
	 * @generated
	 */
	Serie createSerie();

	/**
	 * Returns a new object of class '<em>Schuetze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schuetze</em>'.
	 * @generated
	 */
	Schuetze createSchuetze();

	/**
	 * Returns a new object of class '<em>Osterhasen Schiessen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osterhasen Schiessen</em>'.
	 * @generated
	 */
	OsterhasenSchiessen createOsterhasenSchiessen();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OsterhasePackage getOsterhasePackage();

} //OsterhaseFactory
