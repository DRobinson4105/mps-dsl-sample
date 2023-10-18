package NewLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SConcept;

public class typeof_FunctionDeclaration_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_FunctionDeclaration_InferenceRule() {
  }
  public void applyRule(final SNode functionDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode ft = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941610e62d9L, "NewLanguage.structure.FunctionType"));

    for (SNode parameter : ListSequence.fromList(SLinkOperations.getChildren(functionDeclaration, LINKS.parameters$NTzl))) {
      ListSequence.fromList(SLinkOperations.getChildren(ft, LINKS.parameterTypes$aRdG)).addElement(typeCheckingContext.typeOf(parameter, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "7613513929779084877", true));
    }

    final SNode rtype_typevar_7613513929779084883 = typeCheckingContext.createNewRuntimeTypesVariable();
    SLinkOperations.setTarget(ft, LINKS.returnType$aRFI, typeCheckingContext.getRepresentative(rtype_typevar_7613513929779084883));

    {
      SNode _nodeToCheck_1029348928467 = functionDeclaration;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "7613513929779090675", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "7613513929779090002", true), (SNode) ft, _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.MethodDeclaration$IE;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink parameterTypes$aRdG = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941610e62d9L, 0x2170c941610e62dcL, "parameterTypes");
    /*package*/ static final SContainmentLink parameters$NTzl = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bce40a80L, 0x69a8a294bce40a81L, "parameters");
    /*package*/ static final SContainmentLink returnType$aRFI = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941610e62d9L, 0x2170c941610e62deL, "returnType");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept MethodDeclaration$IE = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bce40a80L, "NewLanguage.structure.MethodDeclaration");
  }
}
