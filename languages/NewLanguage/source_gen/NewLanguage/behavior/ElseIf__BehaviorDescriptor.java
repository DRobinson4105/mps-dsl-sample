package NewLanguage.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public final class ElseIf__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941630b672cL, "NewLanguage.structure.ElseIf");

  public static final SMethod<Void> run_id25KMk5z2Pug = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("run").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("25KMk5z2Pug").build(SMethodBuilder.createJavaParameter(Frame.class, ""), SMethodBuilder.createJavaParameter(EvaluatorEnvironment.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(run_id25KMk5z2Pug);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static void run_id25KMk5z2Pug(@NotNull SNode __thisNode__, Frame frame, EvaluatorEnvironment env) {
    if (((boolean) IHasCondition__BehaviorDescriptor.computeCondition_id6ACCDiXzUcQ.invoke(__thisNode__, frame, env))) {
      StatementBlock__BehaviorDescriptor.run_id1lixMam2gZ0.invoke(SLinkOperations.getTarget(__thisNode__, LINKS.body$Ehjs), frame, env);
    } else if ((SLinkOperations.getTarget(__thisNode__, LINKS.else$6lxQ) != null)) {
      ElseStatement__BehaviorDescriptor.run_id25KMk5z2Pug.invoke(SLinkOperations.getTarget(__thisNode__, LINKS.else$6lxQ), frame, env);
    }
  }

  /*package*/ ElseIf__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        run_id25KMk5z2Pug(node, (Frame) parameters[0], (EvaluatorEnvironment) parameters[1]);
        return null;
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink body$Ehjs = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941630b672cL, 0x2170c941630c3482L, "body");
    /*package*/ static final SContainmentLink else$6lxQ = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2170c941630b672cL, 0x2170c941630c36a2L, "else");
  }
}
