/**
 */
package pslext.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pslext.PslextFactory;
import pslext.TaskExt;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Ext</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskExtTest extends TestCase {

	/**
	 * The fixture for this Task Ext test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExt fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaskExtTest.class);
	}

	/**
	 * Constructs a new Task Ext test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskExtTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Task Ext test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaskExt fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Task Ext test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExt getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PslextFactory.eINSTANCE.createTaskExt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TaskExtTest
