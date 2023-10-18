package NewLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;
import com.mbeddr.mpsutil.grammarcells.runtime.SideTransformationHolderCell;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.lang.core.editor.BaseKeyPack_KeyPack.KEYWORD_StyleKey;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.openapi.editor.menus.transformation.SPropertyInfo;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.core.behavior.PropertyAttribute__BehaviorDescriptor;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.mbeddr.mpsutil.grammarcells.runtime.StringOrSequenceQuery;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.mbeddr.mpsutil.grammarcells.runtime.MultiTextActionItem;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import com.mbeddr.mpsutil.grammarcells.runtime.GrammarCellsUtil;
import com.mbeddr.mpsutil.grammarcells.runtime.menu.CompositeTransformationMenuLookup;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuLookup;
import com.mbeddr.mpsutil.grammarcells.runtime.ListInsertActionLookup;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftBraceStyleClass;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightBraceStyleClass;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;

/*package*/ class TraitDeclaration_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public TraitDeclaration_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createSideTransformationHolderProcessor_0();
  }

  private EditorCell createSideTransformationHolderProcessor_0() {
    final EditorCell editorCell = createCollection_0();
    if (editorCell instanceof EditorCell_Collection) {
      SideTransformationHolderCell.processParentCollection((EditorCell_Collection) editorCell);
    }
    editorCell.setBig(true);
    setCellContext(editorCell);
    return editorCell;
  }
  private EditorCell createCollection_0() {
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = new jetbrains.mps.nodeEditor.cells.EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_sp56ww_a0");
    editorCell.addEditorCell(createCustomFactory_1());
    editorCell.addEditorCell(createProperty_0());
    editorCell.addEditorCell(createSideTransformationCell4_0());
    if (nodeCondition_sp56ww_a3a0()) {
      editorCell.addEditorCell(createCustomFactory_3());
    }
    editorCell.addEditorCell(createConstant_1());
    editorCell.addEditorCell(createRefNodeList_1());
    editorCell.addEditorCell(createConstant_3());
    return editorCell;
  }
  private boolean nodeCondition_sp56ww_a3a0() {
    return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.parentTraits$7MES)).isNotEmpty();
  }
  private EditorCell createCustomFactory_0(final EditorContext editorContext, final SNode node) {


    final EditorCell cell = createReadOnlyModelAccessor_0();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        return cell;
      }
    }.invoke();
    Style style = new StyleImpl();
    new KEYWORD_StyleKey().apply(style);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createCustomFactory_1() {
    return createCustomFactory_0(getEditorContext(), myNode);
  }
  private EditorCell createReadOnlyModelAccessor_0() {
    EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new ModelAccessor.ReadOnly() {
      public String getText() {
        return SConceptOperations.conceptAlias(SNodeOperations.getConcept(myNode));
      }
    }, myNode);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ALIAS_EDITOR_COMPONENT");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.EDITABLE, true);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createProperty_0() {
    getCellFactory().pushCellContext();
    try {
      final SProperty property = PROPS.name$MnvL;
      getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
      editorCell.setDefaultText("<no name>");
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      setCellContext(editorCell);
      Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
      Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property);
        }
      });
      if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    } finally {
      getCellFactory().popCellContext();
    }
  }
  private EditorCell createSideTransformationCell4_0() {
    SideTransformationHolderCell editorCell = new SideTransformationHolderCell(getEditorContext(), myNode, null, "grammar.optional for TraitDeclaration.parentTraits") {
      @Override
      public List<MenuPart<TransformationMenuItem, TransformationMenuContext>> createMenuParts() {
        return ListSequence.fromListAndArray(new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>(), new GenericMenuPart_a0c0a_0());
      }
    };
    editorCell.setCellId("SideTransformationCell4_sp56ww_c0a");
    return editorCell;
  }
  private class GenericMenuPart_a0c0a_0 implements MenuPart<TransformationMenuItem, TransformationMenuContext> {

    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(final TransformationMenuContext ctx) {
      List<TransformationMenuItem> items = ListSequence.fromList(new ArrayList<TransformationMenuItem>());
      final SNode sourceNode = ctx.getNode();
      final Iterable<String> matchingTexts = new StringOrSequenceQuery() {
        public Object queryStringOrSequence() {
          return Sequence.<String>singleton("extends");
        }
      }.query();
      final boolean isApplicable = ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(ctx.getNode(), CONCEPTS.TraitDeclaration$N5), LINKS.parentTraits$7MES)).isEmpty();

      if (isApplicable && Sequence.fromIterable(matchingTexts).isNotEmpty()) {
        ListSequence.fromList(items).addElement(new MultiTextActionItem(matchingTexts, ctx) {
          @Override
          public void execute(@NotNull String pattern) {
            doSubstitute(pattern);
          }
          public SNode doSubstitute(@NotNull String pattern) {
            SNode result = ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(ctx.getNode(), CONCEPTS.TraitDeclaration$N5), LINKS.parentTraits$7MES)).insertElement(0, SNodeFactoryOperations.createNewNode(CONCEPTS.TraitReference$YD, null));

            return result;
          }
          @Override
          public SAbstractConcept getOutputConcept() {
            return CONCEPTS.TraitDeclaration$N5;
          }
        });
      }
      return items;
    }
  }
  private EditorCell createCustomFactory_2(final EditorContext editorContext, final SNode node) {

    if (!(new Object() {
      public boolean showWrapped() {
        return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.parentTraits$7MES)).isNotEmpty();
      }
    }.showWrapped())) {
      return jetbrains.mps.nodeEditor.cells.EditorCell_Collection.createVertical(editorContext, node);
    }

    final EditorCell cell = createCollection_1();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        EditorCell_Collection collection = as_n9tszy_a0a0a0a0a0a4a71(cell, EditorCell_Collection.class);
        if (collection != null) {
          final SNode sourceNode = myNode;
          final List<String> matchingTexts = Sequence.fromIterable(new StringOrSequenceQuery() {
            public Object queryStringOrSequence() {
              return Sequence.<String>singleton("extends");
            }
          }.query()).toListSequence();
          for (EditorCell child : Sequence.fromIterable(GrammarCellsUtil.getUnwrappedChildren(collection))) {
            if (Objects.equals(child.getSNode().getContainmentLink(), LINKS.parentTraits$7MES)) {
              final String parentCellId = collection.getCellId();
              CompositeTransformationMenuLookup.filter(child, (TransformationMenuLookup l) -> !((l instanceof ListInsertActionLookup && Objects.equals(((ListInsertActionLookup) l).getSourceCellId(), parentCellId))));
              String description = "Insert child into " + child.getSNode().getContainmentLink();
              SNodeReference trace = new SNodePointer("r:527499a9-7de7-4cac-8dc4-1a7be839383b(NewLanguage.editor)", "7613513929782230168");
              _FunctionTypes._void_P1_E0<? super SNode> postprocessor = null;
              CompositeTransformationMenuLookup.add(child, new ListInsertActionLookup(matchingTexts, false, parentCellId, description, child.getSNode(), trace, postprocessor));
              CompositeTransformationMenuLookup.add(child, new ListInsertActionLookup(matchingTexts, true, parentCellId, description, child.getSNode(), trace, postprocessor));
            }
          }
        }
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_3() {
    return createCustomFactory_2(getEditorContext(), myNode);
  }
  private EditorCell createCollection_1() {
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = new jetbrains.mps.nodeEditor.cells.EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_sp56ww_a3a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createRefNodeList_0());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "extends");
    editorCell.setCellId("Constant_sp56ww_a0d0a");
    Style style = new StyleImpl();
    new KEYWORD_StyleKey().apply(style);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_0() {
    AbstractCellListHandler handler = new parentTraitsListHandler_sp56ww_b0d0a(myNode, getEditorContext());
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_parentTraits");
    editorCell.setSRole(handler.getElementSRole());
    return editorCell;
  }
  private static class parentTraitsListHandler_sp56ww_b0d0a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public parentTraitsListHandler_sp56ww_b0d0a(SNode ownerNode, EditorContext context) {
      super(context, false);
      myNode = ownerNode;
    }

    @NotNull
    public SNode getNode() {
      return myNode;
    }
    public SContainmentLink getSLink() {
      return LINKS.parentTraits$7MES;
    }
    public SAbstractConcept getChildSConcept() {
      return CONCEPTS.TraitReference$YD;
    }

    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell, false);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(parentTraitsListHandler_sp56ww_b0d0a.this.getNode(), LINKS.parentTraits$7MES));
      try {
        EditorCell emptyCell = null;
        emptyCell = super.createEmptyCell();
        installElementCellActions(null, emptyCell, true);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }

    private static final Object OBJ = new Object();

    public void installElementCellActions(SNode elementNode, EditorCell elementCell, boolean isEmptyCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_COMPLETE_SET) == null) {
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_COMPLETE_SET, OBJ);
          elementCell.setSubstituteInfo((isEmptyCell ? new SEmptyContainmentSubstituteInfo(elementCell) : new SChildSubstituteInfo(elementCell)));
        }
      }
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_DELETE_SET) == null) {
        if (elementNode != null) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_DELETE_SET, OBJ);
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
        }
      }
      if (elementCell.getUserObject(ELEMENT_CELL_BACKSPACE_SET) == null) {
        if (elementNode != null) {
          elementCell.putUserObject(ELEMENT_CELL_BACKSPACE_SET, OBJ);
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
      }
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        if (elementNode != null) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, OBJ);
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
      }
    }
    @Override
    public EditorCell createSeparatorCell(SNode prevNode, SNode nextNode) {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), getNode(), ",");
      editorCell.setSelectable(false);
      Style style = new StyleImpl();
      style.set(StyleAttributes.LAYOUT_CONSTRAINT, "");
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      editorCell.getStyle().putAll(style);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(prevNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
      return editorCell;
    }
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_sp56ww_e0a");
    Style style = new StyleImpl();
    new LeftBraceStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_1() {
    AbstractCellListHandler handler = new methodDeclarationsListHandler_sp56ww_f0a(myNode, getEditorContext());
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_methodDeclarations");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSRole(handler.getElementSRole());
    return editorCell;
  }
  private static class methodDeclarationsListHandler_sp56ww_f0a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public methodDeclarationsListHandler_sp56ww_f0a(SNode ownerNode, EditorContext context) {
      super(context, false);
      myNode = ownerNode;
    }

    @NotNull
    public SNode getNode() {
      return myNode;
    }
    public SContainmentLink getSLink() {
      return LINKS.methodDeclarations$ZsGT;
    }
    public SAbstractConcept getChildSConcept() {
      return CONCEPTS.MethodDeclaration$IE;
    }

    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell, false);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(methodDeclarationsListHandler_sp56ww_f0a.this.getNode(), LINKS.methodDeclarations$ZsGT));
      try {
        EditorCell emptyCell = null;
        emptyCell = createConstant_2();
        installElementCellActions(null, emptyCell, true);
        setCellContext(emptyCell);
        return emptyCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }

    private static final Object OBJ = new Object();

    public void installElementCellActions(SNode elementNode, EditorCell elementCell, boolean isEmptyCell) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_COMPLETE_SET) == null) {
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_COMPLETE_SET, OBJ);
          elementCell.setSubstituteInfo((isEmptyCell ? new SEmptyContainmentSubstituteInfo(elementCell) : new SChildSubstituteInfo(elementCell)));
        }
      }
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_DELETE_SET) == null) {
        if (elementNode != null) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_DELETE_SET, OBJ);
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
        }
      }
      if (elementCell.getUserObject(ELEMENT_CELL_BACKSPACE_SET) == null) {
        if (elementNode != null) {
          elementCell.putUserObject(ELEMENT_CELL_BACKSPACE_SET, OBJ);
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
      }
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        if (elementNode != null) {
          elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, OBJ);
        }
      }
    }
    private EditorCell createConstant_2() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
      editorCell.setCellId("Constant_sp56ww_a5a0");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_3() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_sp56ww_g0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    new RightBraceStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private static <T> T as_n9tszy_a0a0a0a0a0a4a71(Object o, Class<T> type) {
    return (type.isInstance(o) ? (T) o : null);
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink parentTraits$7MES = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2bfa9913b4017060L, 0x69a8a294bd25a500L, "parentTraits");
    /*package*/ static final SContainmentLink methodDeclarations$ZsGT = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2bfa9913b4017060L, 0x2bfa9913b4017065L, "methodDeclarations");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept PropertyAttribute$Gb = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute");
    /*package*/ static final SConcept TraitDeclaration$N5 = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x2bfa9913b4017060L, "NewLanguage.structure.TraitDeclaration");
    /*package*/ static final SConcept TraitReference$YD = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bd25a4f8L, "NewLanguage.structure.TraitReference");
    /*package*/ static final SConcept MethodDeclaration$IE = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bce40a80L, "NewLanguage.structure.MethodDeclaration");
  }
}
