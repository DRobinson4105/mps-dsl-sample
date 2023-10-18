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
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class LExpression__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294c049151cL, "NewLanguage.structure.LExpression");

  public static final SMethod<Object> computeImpl_idb_il9omHZr = new SMethodBuilder<Object>(new SJavaCompoundTypeImpl(Object.class)).name("computeImpl").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("b_il9omHZr").build(SMethodBuilder.createJavaParameter(Frame.class, ""), SMethodBuilder.createJavaParameter(EvaluatorEnvironment.class, ""));
  public static final SMethod<ExpressionResult> computeL_idb_il9oY767 = new SMethodBuilder<ExpressionResult>(new SJavaCompoundTypeImpl(ExpressionResult.class)).name("computeL").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("b_il9oY767").build(SMethodBuilder.createJavaParameter(Frame.class, ""), SMethodBuilder.createJavaParameter(EvaluatorEnvironment.class, ""));
  public static final SMethod<ExpressionResult> computeLImpl_idb_il9oY7IT = new SMethodBuilder<ExpressionResult>(new SJavaCompoundTypeImpl(ExpressionResult.class)).name("computeLImpl").modifiers(8, AccessPrivileges.PUBLIC).concept(CONCEPT).id("b_il9oY7IT").build(SMethodBuilder.createJavaParameter(Frame.class, ""), SMethodBuilder.createJavaParameter(EvaluatorEnvironment.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(computeImpl_idb_il9omHZr, computeL_idb_il9oY767, computeLImpl_idb_il9oY7IT);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Object computeImpl_idb_il9omHZr(@NotNull SNode __thisNode__, Frame frame, EvaluatorEnvironment env) {
    return LExpression__BehaviorDescriptor.computeLImpl_idb_il9oY7IT.invoke(__thisNode__, frame, env).get();
  }
  /*package*/ static ExpressionResult computeL_idb_il9oY767(@NotNull SNode __thisNode__, Frame frame, EvaluatorEnvironment env) {
    env.increment();
    return ((ExpressionResult) LExpression__BehaviorDescriptor.computeLImpl_idb_il9oY7IT.invoke(__thisNode__, frame, env));
  }
  /*package*/ static ExpressionResult computeLImpl_idb_il9oY7IT(@NotNull SNode __thisNode__, Frame frame, EvaluatorEnvironment env) {
    return new ExpressionResult() {
      @Override
      public Object get() {
        return "NO COMPUTE METHOD";
      }

      @Override
      public void set(Object v) {
      }
    };
  }

  /*package*/ LExpression__BehaviorDescriptor() {
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
        return (T) ((Object) computeImpl_idb_il9omHZr(node, (Frame) parameters[0], (EvaluatorEnvironment) parameters[1]));
      case 1:
        return (T) ((ExpressionResult) computeL_idb_il9oY767(node, (Frame) parameters[0], (EvaluatorEnvironment) parameters[1]));
      case 2:
        return (T) ((ExpressionResult) computeLImpl_idb_il9oY7IT(node, (Frame) parameters[0], (EvaluatorEnvironment) parameters[1]));
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
}
