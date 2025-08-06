/**
 */
package pslext;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import psl.PslPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pslext.PslextFactory
 * @model kind="package"
 * @generated
 */
public interface PslextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pslext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pslext";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PslextPackage eINSTANCE = pslext.impl.PslextPackageImpl.init();

	/**
	 * The meta object id for the '{@link pslext.impl.TaskExtImpl <em>Task Ext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pslext.impl.TaskExtImpl
	 * @see pslext.impl.PslextPackageImpl#getTaskExt()
	 * @generated
	 */
	int TASK_EXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXT__NAME = PslPackage.TASK__NAME;

	/**
	 * The number of structural features of the '<em>Task Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXT_FEATURE_COUNT = PslPackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Ext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXT_OPERATION_COUNT = PslPackage.TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pslext.TaskExt <em>Task Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ext</em>'.
	 * @see pslext.TaskExt
	 * @generated
	 */
	EClass getTaskExt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PslextFactory getPslextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pslext.impl.TaskExtImpl <em>Task Ext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pslext.impl.TaskExtImpl
		 * @see pslext.impl.PslextPackageImpl#getTaskExt()
		 * @generated
		 */
		EClass TASK_EXT = eINSTANCE.getTaskExt();

	}

} //PslextPackage
