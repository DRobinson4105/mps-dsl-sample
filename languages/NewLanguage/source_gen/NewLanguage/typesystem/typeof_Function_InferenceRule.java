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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SConcept;
import org.jetbrains.mps.openapi.language.SInterfaceConcept;

public class typeof_Function_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_Function_InferenceRule() {
  }
  public void applyRule(final SNode function, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    SNode ft = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941610e62d9L, "NewLanguage.structure.FunctionType"));

    for (SNode parameter : ListSequence.fromList(SLinkOperations.getChildren(function, LINKS.parameters$XXrE))) {
      ListSequence.fromList(SLinkOperations.getChildren(ft, LINKS.parameterTypes$aRdG)).addElement(typeCheckingContext.typeOf(parameter, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295631462", true));
    }

    final SNode rtype_typevar_2409647083295631468 = typeCheckingContext.createNewRuntimeTypesVariable();
    SLinkOperations.setTarget(ft, LINKS.returnType$aRFI, typeCheckingContext.getRepresentative(rtype_typevar_2409647083295631468));

    for (SNode ret : ListSequence.fromList(SNodeOperations.getNodeDescendants(SLinkOperations.getTarget(function, LINKS.body$XS2j), CONCEPTS.ReturnStatement$AC, false, new SAbstractConcept[]{CONCEPTS.ICallable$5s}))) {
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(ret, LINKS.expression$XPyl);
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295644971", 0, null);
        typeCheckingContext.createLessThanInequality((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295644981", true), (SNode) SLinkOperations.getTarget(function, LINKS.returnType$V$M6), false, true, _info_12389875345);
      }
      {
        SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(ret, LINKS.expression$XPyl);
        EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295631480", 0, null);
        typeCheckingContext.createGreaterThanInequality((SNode) SLinkOperations.getTarget(ft, LINKS.returnType$aRFI), (SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295631482", true), false, true, _info_12389875345);
      }
    }

    {
      SNode _nodeToCheck_1029348928467 = function;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295631500", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:03b63f59-a307-4616-ac93-9aa75e1634ad(NewLanguage.typesystem)", "2409647083295631504", true), (SNode) ft, _info_12389875345);
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return CONCEPTS.Function$tz;
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink parameterTypes$aRdG = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941610e62d9L, 0x2170c941610e62dcL, "parameterTypes");
    /*package*/ static final SContainmentLink parameters$XXrE = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2f07de6465348273L, 0x2f07de646534827fL, "parameters");
    /*package*/ static final SContainmentLink returnType$aRFI = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941610e62d9L, 0x2170c941610e62deL, "returnType");
    /*package*/ static final SContainmentLink expression$XPyl = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2f07de64654b9c43L, 0x2f07de64654b9c44L, "expression");
    /*package*/ static final SContainmentLink returnType$V$M6 = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2f07de6465348273L, 0x2e549525893b8a0L, "returnType");
    /*package*/ static final SContainmentLink body$XS2j = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2f07de6465348273L, 0x2f07de646534827dL, "body");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept ReturnStatement$AC = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2f07de64654b9c43L, "NewLanguage.structure.ReturnStatement");
    /*package*/ static final SInterfaceConcept ICallable$5s = MetaAdapterFactory.getInterfaceConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2e54952596b4e3eL, "NewLanguage.structure.ICallable");
    /*package*/ static final SConcept Function$tz = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2f07de6465348273L, "NewLanguage.structure.Function");
  }
}
