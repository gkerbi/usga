/**
 */
package at.usga.impl;

import at.usga.OsterhasePackage;
import at.usga.Schuetze;
import at.usga.Serie;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schuetze</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.usga.impl.SchuetzeImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.usga.impl.SchuetzeImpl#isJung <em>Jung</em>}</li>
 *   <li>{@link at.usga.impl.SchuetzeImpl#getOrt <em>Ort</em>}</li>
 *   <li>{@link at.usga.impl.SchuetzeImpl#getSerien <em>Serien</em>}</li>
 *   <li>{@link at.usga.impl.SchuetzeImpl#getNummer <em>Nummer</em>}</li>
 *   <li>{@link at.usga.impl.SchuetzeImpl#getBemerkung <em>Bemerkung</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchuetzeImpl extends EObjectImpl implements Schuetze {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isJung() <em>Jung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJung() <em>Jung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJung()
	 * @generated
	 * @ordered
	 */
	protected boolean jung = JUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected static final String ORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrt() <em>Ort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrt()
	 * @generated
	 * @ordered
	 */
	protected String ort = ORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSerien() <em>Serien</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerien()
	 * @generated
	 * @ordered
	 */
	protected EList<Serie> serien;

	/**
	 * The default value of the '{@link #getNummer() <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummer()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMMER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNummer() <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummer()
	 * @generated
	 * @ordered
	 */
	protected int nummer = NUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEMERKUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBemerkung() <em>Bemerkung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemerkung()
	 * @generated
	 * @ordered
	 */
	protected String bemerkung = BEMERKUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchuetzeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsterhasePackage.Literals.SCHUETZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SCHUETZE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJung() {
		return jung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJung(boolean newJung) {
		boolean oldJung = jung;
		jung = newJung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SCHUETZE__JUNG, oldJung, jung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrt() {
		return ort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrt(String newOrt) {
		String oldOrt = ort;
		ort = newOrt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SCHUETZE__ORT, oldOrt, ort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Serie> getSerien() {
		if (serien == null) {
			serien = new EObjectContainmentEList<Serie>(Serie.class, this, OsterhasePackage.SCHUETZE__SERIEN);
		}
		return serien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNummer() {
		return nummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNummer(int newNummer) {
		int oldNummer = nummer;
		nummer = newNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SCHUETZE__NUMMER, oldNummer, nummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBemerkung() {
		return bemerkung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBemerkung(String newBemerkung) {
		String oldBemerkung = bemerkung;
		bemerkung = newBemerkung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SCHUETZE__BEMERKUNG, oldBemerkung, bemerkung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsterhasePackage.SCHUETZE__SERIEN:
				return ((InternalEList<?>)getSerien()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsterhasePackage.SCHUETZE__NAME:
				return getName();
			case OsterhasePackage.SCHUETZE__JUNG:
				return isJung();
			case OsterhasePackage.SCHUETZE__ORT:
				return getOrt();
			case OsterhasePackage.SCHUETZE__SERIEN:
				return getSerien();
			case OsterhasePackage.SCHUETZE__NUMMER:
				return getNummer();
			case OsterhasePackage.SCHUETZE__BEMERKUNG:
				return getBemerkung();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsterhasePackage.SCHUETZE__NAME:
				setName((String)newValue);
				return;
			case OsterhasePackage.SCHUETZE__JUNG:
				setJung((Boolean)newValue);
				return;
			case OsterhasePackage.SCHUETZE__ORT:
				setOrt((String)newValue);
				return;
			case OsterhasePackage.SCHUETZE__SERIEN:
				getSerien().clear();
				getSerien().addAll((Collection<? extends Serie>)newValue);
				return;
			case OsterhasePackage.SCHUETZE__NUMMER:
				setNummer((Integer)newValue);
				return;
			case OsterhasePackage.SCHUETZE__BEMERKUNG:
				setBemerkung((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OsterhasePackage.SCHUETZE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OsterhasePackage.SCHUETZE__JUNG:
				setJung(JUNG_EDEFAULT);
				return;
			case OsterhasePackage.SCHUETZE__ORT:
				setOrt(ORT_EDEFAULT);
				return;
			case OsterhasePackage.SCHUETZE__SERIEN:
				getSerien().clear();
				return;
			case OsterhasePackage.SCHUETZE__NUMMER:
				setNummer(NUMMER_EDEFAULT);
				return;
			case OsterhasePackage.SCHUETZE__BEMERKUNG:
				setBemerkung(BEMERKUNG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OsterhasePackage.SCHUETZE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OsterhasePackage.SCHUETZE__JUNG:
				return jung != JUNG_EDEFAULT;
			case OsterhasePackage.SCHUETZE__ORT:
				return ORT_EDEFAULT == null ? ort != null : !ORT_EDEFAULT.equals(ort);
			case OsterhasePackage.SCHUETZE__SERIEN:
				return serien != null && !serien.isEmpty();
			case OsterhasePackage.SCHUETZE__NUMMER:
				return nummer != NUMMER_EDEFAULT;
			case OsterhasePackage.SCHUETZE__BEMERKUNG:
				return BEMERKUNG_EDEFAULT == null ? bemerkung != null : !BEMERKUNG_EDEFAULT.equals(bemerkung);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", jung: ");
		result.append(jung);
		result.append(", ort: ");
		result.append(ort);
		result.append(", nummer: ");
		result.append(nummer);
		result.append(", bemerkung: ");
		result.append(bemerkung);
		result.append(')');
		return result.toString();
	}

} //SchuetzeImpl
