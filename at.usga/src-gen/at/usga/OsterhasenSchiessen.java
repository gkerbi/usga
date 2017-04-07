/**
 */
package at.usga;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osterhasen Schiessen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.usga.OsterhasenSchiessen#getPreisjung <em>Preisjung</em>}</li>
 *   <li>{@link at.usga.OsterhasenSchiessen#getPreisalt <em>Preisalt</em>}</li>
 *   <li>{@link at.usga.OsterhasenSchiessen#getPreisnachkauf <em>Preisnachkauf</em>}</li>
 *   <li>{@link at.usga.OsterhasenSchiessen#getAltersgrenze <em>Altersgrenze</em>}</li>
 *   <li>{@link at.usga.OsterhasenSchiessen#getSchuetzen <em>Schuetzen</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.usga.OsterhasePackage#getOsterhasenSchiessen()
 * @model
 * @generated
 */
public interface OsterhasenSchiessen extends EObject {
	/**
	 * Returns the value of the '<em><b>Preisjung</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preisjung</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preisjung</em>' attribute list.
	 * @see at.usga.OsterhasePackage#getOsterhasenSchiessen_Preisjung()
	 * @model upper="10"
	 * @generated
	 */
	EList<Double> getPreisjung();

	/**
	 * Returns the value of the '<em><b>Preisalt</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preisalt</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preisalt</em>' attribute list.
	 * @see at.usga.OsterhasePackage#getOsterhasenSchiessen_Preisalt()
	 * @model upper="10"
	 * @generated
	 */
	EList<Double> getPreisalt();

	/**
	 * Returns the value of the '<em><b>Preisnachkauf</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preisnachkauf</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preisnachkauf</em>' attribute list.
	 * @see at.usga.OsterhasePackage#getOsterhasenSchiessen_Preisnachkauf()
	 * @model upper="10"
	 * @generated
	 */
	EList<Double> getPreisnachkauf();

	/**
	 * Returns the value of the '<em><b>Altersgrenze</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altersgrenze</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altersgrenze</em>' attribute list.
	 * @see at.usga.OsterhasePackage#getOsterhasenSchiessen_Altersgrenze()
	 * @model lower="1980" upper="2010"
	 * @generated
	 */
	EList<Integer> getAltersgrenze();

	/**
	 * Returns the value of the '<em><b>Schuetzen</b></em>' containment reference list.
	 * The list contents are of type {@link at.usga.Schuetze}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schuetzen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schuetzen</em>' containment reference list.
	 * @see at.usga.OsterhasePackage#getOsterhasenSchiessen_Schuetzen()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schuetze> getSchuetzen();

} // OsterhasenSchiessen
