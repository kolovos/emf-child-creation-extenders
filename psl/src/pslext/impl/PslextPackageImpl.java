/**
 */
package pslext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import psl.PslPackage;

import pslext.PslextFactory;
import pslext.PslextPackage;
import pslext.TaskExt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PslextPackageImpl extends EPackageImpl implements PslextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskExtEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pslext.PslextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PslextPackageImpl() {
		super(eNS_URI, PslextFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PslextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PslextPackage init() {
		if (isInited) return (PslextPackage)EPackage.Registry.INSTANCE.getEPackage(PslextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPslextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PslextPackageImpl thePslextPackage = registeredPslextPackage instanceof PslextPackageImpl ? (PslextPackageImpl)registeredPslextPackage : new PslextPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PslPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePslextPackage.createPackageContents();

		// Initialize created meta-data
		thePslextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePslextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PslextPackage.eNS_URI, thePslextPackage);
		return thePslextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskExt() {
		return taskExtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PslextFactory getPslextFactory() {
		return (PslextFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taskExtEClass = createEClass(TASK_EXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PslPackage thePslPackage = (PslPackage)EPackage.Registry.INSTANCE.getEPackage(PslPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		taskExtEClass.getESuperTypes().add(thePslPackage.getTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskExtEClass, TaskExt.class, "TaskExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PslextPackageImpl
