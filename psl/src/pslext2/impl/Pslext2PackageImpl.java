/**
 */
package pslext2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import psl.PslPackage;

import pslext2.Pslext2Factory;
import pslext2.Pslext2Package;
import pslext2.TaskExt2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Pslext2PackageImpl extends EPackageImpl implements Pslext2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskExt2EClass = null;

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
	 * @see pslext2.Pslext2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Pslext2PackageImpl() {
		super(eNS_URI, Pslext2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Pslext2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Pslext2Package init() {
		if (isInited) return (Pslext2Package)EPackage.Registry.INSTANCE.getEPackage(Pslext2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredPslext2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Pslext2PackageImpl thePslext2Package = registeredPslext2Package instanceof Pslext2PackageImpl ? (Pslext2PackageImpl)registeredPslext2Package : new Pslext2PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PslPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePslext2Package.createPackageContents();

		// Initialize created meta-data
		thePslext2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePslext2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Pslext2Package.eNS_URI, thePslext2Package);
		return thePslext2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskExt2() {
		return taskExt2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pslext2Factory getPslext2Factory() {
		return (Pslext2Factory)getEFactoryInstance();
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
		taskExt2EClass = createEClass(TASK_EXT2);
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
		taskExt2EClass.getESuperTypes().add(thePslPackage.getTask());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskExt2EClass, TaskExt2.class, "TaskExt2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Pslext2PackageImpl
