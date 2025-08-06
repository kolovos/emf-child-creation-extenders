/**
 */
package pslext;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pslext.PslextPackage
 * @generated
 */
public interface PslextFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PslextFactory eINSTANCE = pslext.impl.PslextFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Ext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Ext</em>'.
	 * @generated
	 */
	TaskExt createTaskExt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PslextPackage getPslextPackage();

} //PslextFactory
