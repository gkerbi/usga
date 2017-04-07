/**
 */
package at.usga;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schuetze</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.usga.Schuetze#getName <em>Name</em>}</li>
 *   <li>{@link at.usga.Schuetze#isJung <em>Jung</em>}</li>
 *   <li>{@link at.usga.Schuetze#getOrt <em>Ort</em>}</li>
 *   <li>{@link at.usga.Schuetze#getSerien <em>Serien</em>}</li>
 *   <li>{@link at.usga.Schuetze#getNummer <em>Nummer</em>}</li>
 *   <li>{@link at.usga.Schuetze#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.usga.OsterhasePackage#getSchuetze()
 * @model
 * @generated
 */
public interface Schuetze extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.usga.OsterhasePackage#getSchuetze_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.usga.Schuetze#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jung</em>' attribute.
	 * @see #setJung(boolean)
	 * @see at.usga.OsterhasePackage#getSchuetze_Jung()
	 * @model unique="false"
	 * @generated
	 */
	boolean isJung();

	/**
	 * Sets the value of the '{@link at.usga.Schuetze#isJung <em>Jung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jung</em>' attribute.
	 * @see #isJung()
	 * @generated
	 */
	void setJung(boolean value);

	/**
	 * Returns the value of the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ort</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ort</em>' attribute.
	 * @see #setOrt(String)
	 * @see at.usga.OsterhasePackage#getSchuetze_Ort()
	 * @model unique="false"
	 * @generated
	 */
	String getOrt();

	/**
	 * Sets the value of the '{@link at.usga.Schuetze#getOrt <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ort</em>' attribute.
	 * @see #getOrt()
	 * @generated
	 */
	void setOrt(String value);

	/**
	 * Returns the value of the '<em><b>Serien</b></em>' containment reference list.
	 * The list contents are of type {@link at.usga.Serie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serien</em>' containment reference list.
	 * @see at.usga.OsterhasePackage#getSchuetze_Serien()
	 * @model containment="true"
	 * @generated
	 */
	EList<Serie> getSerien();

	/**
	 * Returns the value of the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nummer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nummer</em>' attribute.
	 * @see #setNummer(int)
	 * @see at.usga.OsterhasePackage#getSchuetze_Nummer()
	 * @model
	 * @generated
	 */
	int getNummer();

	/**
	 * Sets the value of the '{@link at.usga.Schuetze#getNummer <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nummer</em>' attribute.
	 * @see #getNummer()
	 * @generated
	 */
	void setNummer(int value);

	/**
	 * Returns the value of the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bemerkung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bemerkung</em>' attribute.
	 * @see #setBemerkung(String)
	 * @see at.usga.OsterhasePackage#getSchuetze_Bemerkung()
	 * @model
	 * @generated
	 */
	String getBemerkung();

	/**
	 * Sets the value of the '{@link at.usga.Schuetze#getBemerkung <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemerkung</em>' attribute.
	 * @see #getBemerkung()
	 * @generated
	 */
	void setBemerkung(String value);

} // Schuetze
