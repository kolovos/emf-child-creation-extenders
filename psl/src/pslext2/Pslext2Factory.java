/**
 */
package pslext2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pslext2.Pslext2Package
 * @generated
 */
public interface Pslext2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Pslext2Factory eINSTANCE = pslext2.impl.Pslext2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Ext2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Ext2</em>'.
	 * @generated
	 */
	TaskExt2 createTaskExt2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Pslext2Package getPslext2Package();

} //Pslext2Factory
