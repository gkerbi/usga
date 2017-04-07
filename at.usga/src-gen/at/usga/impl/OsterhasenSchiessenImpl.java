/**
 */
package at.usga.impl;

import at.usga.OsterhasePackage;
import at.usga.OsterhasenSchiessen;
import at.usga.Schuetze;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osterhasen Schiessen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.usga.impl.OsterhasenSchiessenImpl#getPreisjung <em>Preisjung</em>}</li>
 *   <li>{@link at.usga.impl.OsterhasenSchiessenImpl#getPreisalt <em>Preisalt</em>}</li>
 *   <li>{@link at.usga.impl.OsterhasenSchiessenImpl#getPreisnachkauf <em>Preisnachkauf</em>}</li>
 *   <li>{@link at.usga.impl.OsterhasenSchiessenImpl#getAltersgrenze <em>Altersgrenze</em>}</li>
 *   <li>{@link at.usga.impl.OsterhasenSchiessenImpl#getSchuetzen <em>Schuetzen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsterhasenSchiessenImpl extends EObjectImpl implements OsterhasenSchiessen {
	/**
	 * The cached value of the '{@link #getPreisjung() <em>Preisjung</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreisjung()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> preisjung;

	/**
	 * The cached value of the '{@link #getPreisalt() <em>Preisalt</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreisalt()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> preisalt;

	/**
	 * The cached value of the '{@link #getPreisnachkauf() <em>Preisnachkauf</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreisnachkauf()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> preisnachkauf;

	/**
	 * The cached value of the '{@link #getAltersgrenze() <em>Altersgrenze</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltersgrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> altersgrenze;

	/**
	 * The cached value of the '{@link #getSchuetzen() <em>Schuetzen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuetzen()
	 * @generated
	 * @ordered
	 */
	protected EList<Schuetze> schuetzen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsterhasenSchiessenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsterhasePackage.Literals.OSTERHASEN_SCHIESSEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getPreisjung() {
		if (preisjung == null) {
			preisjung = new EDataTypeUniqueEList<Double>(Double.class, this, OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISJUNG);
		}
		return preisjung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getPreisalt() {
		if (preisalt == null) {
			preisalt = new EDataTypeUniqueEList<Double>(Double.class, this, OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISALT);
		}
		return preisalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getPreisnachkauf() {
		if (preisnachkauf == null) {
			preisnachkauf = new EDataTypeUniqueEList<Double>(Double.class, this, OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISNACHKAUF);
		}
		return preisnachkauf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getAltersgrenze() {
		if (altersgrenze == null) {
			altersgrenze = new EDataTypeUniqueEList<Integer>(Integer.class, this, OsterhasePackage.OSTERHASEN_SCHIESSEN__ALTERSGRENZE);
		}
		return altersgrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schuetze> getSchuetzen() {
		if (schuetzen == null) {
			schuetzen = new EObjectContainmentEList<Schuetze>(Schuetze.class, this, OsterhasePackage.OSTERHASEN_SCHIESSEN__SCHUETZEN);
		}
		return schuetzen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__SCHUETZEN:
				return ((InternalEList<?>)getSchuetzen()).basicRemove(otherEnd, msgs);
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
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISJUNG:
				return getPreisjung();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISALT:
				return getPreisalt();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISNACHKAUF:
				return getPreisnachkauf();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__ALTERSGRENZE:
				return getAltersgrenze();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__SCHUETZEN:
				return getSchuetzen();
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
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISJUNG:
				getPreisjung().clear();
				getPreisjung().addAll((Collection<? extends Double>)newValue);
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISALT:
				getPreisalt().clear();
				getPreisalt().addAll((Collection<? extends Double>)newValue);
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISNACHKAUF:
				getPreisnachkauf().clear();
				getPreisnachkauf().addAll((Collection<? extends Double>)newValue);
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__ALTERSGRENZE:
				getAltersgrenze().clear();
				getAltersgrenze().addAll((Collection<? extends Integer>)newValue);
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__SCHUETZEN:
				getSchuetzen().clear();
				getSchuetzen().addAll((Collection<? extends Schuetze>)newValue);
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
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISJUNG:
				getPreisjung().clear();
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISALT:
				getPreisalt().clear();
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISNACHKAUF:
				getPreisnachkauf().clear();
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__ALTERSGRENZE:
				getAltersgrenze().clear();
				return;
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__SCHUETZEN:
				getSchuetzen().clear();
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
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISJUNG:
				return preisjung != null && !preisjung.isEmpty();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISALT:
				return preisalt != null && !preisalt.isEmpty();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__PREISNACHKAUF:
				return preisnachkauf != null && !preisnachkauf.isEmpty();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__ALTERSGRENZE:
				return altersgrenze != null && !altersgrenze.isEmpty();
			case OsterhasePackage.OSTERHASEN_SCHIESSEN__SCHUETZEN:
				return schuetzen != null && !schuetzen.isEmpty();
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
		result.append(" (preisjung: ");
		result.append(preisjung);
		result.append(", preisalt: ");
		result.append(preisalt);
		result.append(", preisnachkauf: ");
		result.append(preisnachkauf);
		result.append(", altersgrenze: ");
		result.append(altersgrenze);
		result.append(')');
		return result.toString();
	}

} //OsterhasenSchiessenImpl
