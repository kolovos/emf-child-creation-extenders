/**
 */
package pslext2;

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
 * @see pslext2.Pslext2Factory
 * @model kind="package"
 * @generated
 */
public interface Pslext2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pslext2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pslext2";

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
	Pslext2Package eINSTANCE = pslext2.impl.Pslext2PackageImpl.init();

	/**
	 * The meta object id for the '{@link pslext2.impl.TaskExt2Impl <em>Task Ext2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pslext2.impl.TaskExt2Impl
	 * @see pslext2.impl.Pslext2PackageImpl#getTaskExt2()
	 * @generated
	 */
	int TASK_EXT2 = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXT2__NAME = PslPackage.TASK__NAME;

	/**
	 * The number of structural features of the '<em>Task Ext2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXT2_FEATURE_COUNT = PslPackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Ext2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXT2_OPERATION_COUNT = PslPackage.TASK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pslext2.TaskExt2 <em>Task Ext2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ext2</em>'.
	 * @see pslext2.TaskExt2
	 * @generated
	 */
	EClass getTaskExt2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Pslext2Factory getPslext2Factory();

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
		 * The meta object literal for the '{@link pslext2.impl.TaskExt2Impl <em>Task Ext2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pslext2.impl.TaskExt2Impl
		 * @see pslext2.impl.Pslext2PackageImpl#getTaskExt2()
		 * @generated
		 */
		EClass TASK_EXT2 = eINSTANCE.getTaskExt2();

	}

} //Pslext2Package
