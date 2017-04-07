/**
 */
package at.usga.impl;

import at.usga.OsterhasePackage;
import at.usga.Serie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.usga.impl.SerieImpl#getTeiler <em>Teiler</em>}</li>
 *   <li>{@link at.usga.impl.SerieImpl#isBezahlt <em>Bezahlt</em>}</li>
 *   <li>{@link at.usga.impl.SerieImpl#isAusgegeben <em>Ausgegeben</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerieImpl extends EObjectImpl implements Serie {
	/**
	 * The default value of the '{@link #getTeiler() <em>Teiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeiler()
	 * @generated
	 * @ordered
	 */
	protected static final double TEILER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTeiler() <em>Teiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeiler()
	 * @generated
	 * @ordered
	 */
	protected double teiler = TEILER_EDEFAULT;

	/**
	 * The default value of the '{@link #isBezahlt() <em>Bezahlt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezahlt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZAHLT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezahlt() <em>Bezahlt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezahlt()
	 * @generated
	 * @ordered
	 */
	protected boolean bezahlt = BEZAHLT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAusgegeben() <em>Ausgegeben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAusgegeben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUSGEGEBEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAusgegeben() <em>Ausgegeben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAusgegeben()
	 * @generated
	 * @ordered
	 */
	protected boolean ausgegeben = AUSGEGEBEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsterhasePackage.Literals.SERIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTeiler() {
		return teiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeiler(double newTeiler) {
		double oldTeiler = teiler;
		teiler = newTeiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SERIE__TEILER, oldTeiler, teiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBezahlt() {
		return bezahlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBezahlt(boolean newBezahlt) {
		boolean oldBezahlt = bezahlt;
		bezahlt = newBezahlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SERIE__BEZAHLT, oldBezahlt, bezahlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAusgegeben() {
		return ausgegeben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAusgegeben(boolean newAusgegeben) {
		boolean oldAusgegeben = ausgegeben;
		ausgegeben = newAusgegeben;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsterhasePackage.SERIE__AUSGEGEBEN, oldAusgegeben, ausgegeben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsterhasePackage.SERIE__TEILER:
				return getTeiler();
			case OsterhasePackage.SERIE__BEZAHLT:
				return isBezahlt();
			case OsterhasePackage.SERIE__AUSGEGEBEN:
				return isAusgegeben();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsterhasePackage.SERIE__TEILER:
				setTeiler((Double)newValue);
				return;
			case OsterhasePackage.SERIE__BEZAHLT:
				setBezahlt((Boolean)newValue);
				return;
			case OsterhasePackage.SERIE__AUSGEGEBEN:
				setAusgegeben((Boolean)newValue);
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
			case OsterhasePackage.SERIE__TEILER:
				setTeiler(TEILER_EDEFAULT);
				return;
			case OsterhasePackage.SERIE__BEZAHLT:
				setBezahlt(BEZAHLT_EDEFAULT);
				return;
			case OsterhasePackage.SERIE__AUSGEGEBEN:
				setAusgegeben(AUSGEGEBEN_EDEFAULT);
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
			case OsterhasePackage.SERIE__TEILER:
				return teiler != TEILER_EDEFAULT;
			case OsterhasePackage.SERIE__BEZAHLT:
				return bezahlt != BEZAHLT_EDEFAULT;
			case OsterhasePackage.SERIE__AUSGEGEBEN:
				return ausgegeben != AUSGEGEBEN_EDEFAULT;
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
		result.append(" (teiler: ");
		result.append(teiler);
		result.append(", bezahlt: ");
		result.append(bezahlt);
		result.append(", ausgegeben: ");
		result.append(ausgegeben);
		result.append(')');
		return result.toString();
	}

} //SerieImpl
