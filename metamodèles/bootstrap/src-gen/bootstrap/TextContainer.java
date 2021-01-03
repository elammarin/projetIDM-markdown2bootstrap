/**
 */
package bootstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bootstrap.TextContainer#getTextelements <em>Textelements</em>}</li>
 * </ul>
 *
 * @see bootstrap.BootstrapPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends Block {
	/**
	 * Returns the value of the '<em><b>Textelements</b></em>' containment reference list.
	 * The list contents are of type {@link bootstrap.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelements</em>' containment reference list.
	 * @see bootstrap.BootstrapPackage#getTextContainer_Textelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextelements();

} // TextContainer
