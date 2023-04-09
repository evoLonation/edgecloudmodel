/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.edgecloudmodel.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.example.edgecloudmodel.eCModel.ECModelPackage;
import org.xtext.example.edgecloudmodel.eCModel.Operand;
import org.xtext.example.edgecloudmodel.eCModel.OperandEnd;


/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class ECModelScopeProvider extends AbstractECModelScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
	    // We want to define the Scope for the Element's superElement cross-reference
	    if (context instanceof OperandEnd
	            && reference == ECModelPackage.Literals.OPERAND_END__OWNER) {
	        // Collect a list of candidates by going through the model
	        // EcoreUtil2 provides useful functionality to do that
	        // For example searching for all elements within the root Object's tree
	        EObject rootElement = EcoreUtil2.getRootContainer(context);
	        List<Operand> candidates = EcoreUtil2.getAllContentsOfType(rootElement, Operand.class);
	        // Create IEObjectDescriptions and puts them into an IScope instance
	        return Scopes.scopeFor(candidates);
	    }
	    return super.getScope(context, reference);
	}
}