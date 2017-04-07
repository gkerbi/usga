/**
 */
package at.usga;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.usga.Serie#getTeiler <em>Teiler</em>}</li>
 *   <li>{@link at.usga.Serie#isBezahlt <em>Bezahlt</em>}</li>
 *   <li>{@link at.usga.Serie#isAusgegeben <em>Ausgegeben</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.usga.OsterhasePackage#getSerie()
 * @model
 * @generated
 */
public interface Serie extends EObject {
	/**
	 * Returns the value of the '<em><b>Teiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teiler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teiler</em>' attribute.
	 * @see #setTeiler(double)
	 * @see at.usga.OsterhasePackage#getSerie_Teiler()
	 * @model
	 * @generated
	 */
	double getTeiler();

	/**
	 * Sets the value of the '{@link at.usga.Serie#getTeiler <em>Teiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teiler</em>' attribute.
	 * @see #getTeiler()
	 * @generated
	 */
	void setTeiler(double value);

	/**
	 * Returns the value of the '<em><b>Bezahlt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bezahlt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezahlt</em>' attribute.
	 * @see #setBezahlt(boolean)
	 * @see at.usga.OsterhasePackage#getSerie_Bezahlt()
	 * @model
	 * @generated
	 */
	boolean isBezahlt();

	/**
	 * Sets the value of the '{@link at.usga.Serie#isBezahlt <em>Bezahlt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezahlt</em>' attribute.
	 * @see #isBezahlt()
	 * @generated
	 */
	void setBezahlt(boolean value);

	/**
	 * Returns the value of the '<em><b>Ausgegeben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ausgegeben</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ausgegeben</em>' attribute.
	 * @see #setAusgegeben(boolean)
	 * @see at.usga.OsterhasePackage#getSerie_Ausgegeben()
	 * @model
	 * @generated
	 */
	boolean isAusgegeben();

	/**
	 * Sets the value of the '{@link at.usga.Serie#isAusgegeben <em>Ausgegeben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausgegeben</em>' attribute.
	 * @see #isAusgegeben()
	 * @generated
	 */
	void setAusgegeben(boolean value);

} // Serie
