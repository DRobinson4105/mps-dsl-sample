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
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import com.mbeddr.mpsutil.grammarcells.runtime.CellActionWithReadAccess;
import com.mbeddr.mpsutil.grammarcells.runtime.SavedCaretPosition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.mbeddr.mpsutil.grammarcells.runtime.DelegateToParentCellAction;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftAngleBracketStyleClass;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightAngleBracketStyleClass;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.mbeddr.mpsutil.grammarcells.runtime.StringOrSequenceQuery;
import com.mbeddr.mpsutil.grammarcells.runtime.MultiTextActionItem;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.LeftBraceStyleClass;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet.RightBraceStyleClass;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;

/*package*/ class MapLiteral_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public MapLiteral_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
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
    editorCell.setCellId("Collection_1yskak_a0");
    editorCell.addEditorCell(createAlternation_0());
    editorCell.addEditorCell(createConstant_3());
    editorCell.addEditorCell(createRefNodeList_0());
    editorCell.addEditorCell(createConstant_5());
    return editorCell;
  }
  private EditorCell createAlternation_0() {
    boolean alternationCondition = true;
    alternationCondition = nodeCondition_1yskak_a0a0();
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = createCollection_1();
    } else {
      editorCell = createSideTransformationCell4_0();
    }
    return editorCell;
  }
  private boolean nodeCondition_1yskak_a0a0() {
    return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.kType$hnxd)).isNotEmpty();
  }
  private EditorCell createCollection_1() {
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = new jetbrains.mps.nodeEditor.cells.EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_1yskak_a0a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    if (nodeCondition_1yskak_a0a0a0()) {
      editorCell.addEditorCell(createCustomFactory_1());
    }
    return editorCell;
  }
  private boolean nodeCondition_1yskak_a0a0a0() {
    return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.kType$hnxd)).isNotEmpty();
  }
  private EditorCell createCustomFactory_0(final EditorContext editorContext, final SNode node) {

    if (!(new Object() {
      public boolean showWrapped() {
        return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.kType$hnxd)).isNotEmpty();
      }
    }.showWrapped())) {
      return jetbrains.mps.nodeEditor.cells.EditorCell_Collection.createVertical(editorContext, node);
    }

    final EditorCell cell = createCustomFactory_3();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            SavedCaretPosition caretPosition = new SavedCaretPosition(editorContext);
            caretPosition.save();
            SNodeOperations.deleteNode(SLinkOperations.getTarget(node, LINKS.kType$hnxd));
            editorContext.flushEvents();
            caretPosition.restore(true);
          }
        });
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            SavedCaretPosition caretPosition = new SavedCaretPosition(editorContext);
            caretPosition.save();
            SNodeOperations.deleteNode(SLinkOperations.getTarget(node, LINKS.kType$hnxd));
            editorContext.flushEvents();
            caretPosition.restore(false);
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_1() {
    return createCustomFactory_0(getEditorContext(), myNode);
  }
  private EditorCell createCustomFactory_2(final EditorContext editorContext, final SNode node) {

    if (!(new Object() {
      public boolean showWrapped() {
        return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.kType$hnxd)).isNotEmpty();
      }
    }.showWrapped())) {
      return jetbrains.mps.nodeEditor.cells.EditorCell_Collection.createVertical(editorContext, node);
    }

    final EditorCell cell = createCollection_2();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        final SNode childNode = SLinkOperations.getTarget(myNode, LINKS.kType$hnxd);
        new Object() {
          public void removeDeleteAction(EditorCell descendantCell) {
            if (descendantCell.getSNode() == childNode) {
              descendantCell.setAction(CellActionType.DELETE, new DelegateToParentCellAction(descendantCell, CellActionType.DELETE));
              descendantCell.setAction(CellActionType.BACKSPACE, new DelegateToParentCellAction(descendantCell, CellActionType.BACKSPACE));
            } else {
              if (descendantCell instanceof EditorCell_Collection) {
                for (EditorCell childCell : Sequence.fromIterable(((EditorCell_Collection) descendantCell))) {
                  removeDeleteAction(childCell);
                }
              }
            }
          }
        }.removeDeleteAction(cell);
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_3() {
    return createCustomFactory_2(getEditorContext(), myNode);
  }
  private EditorCell createCollection_2() {
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = new jetbrains.mps.nodeEditor.cells.EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_1yskak_a0a0a0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createRefNode_0());
    editorCell.addEditorCell(createConstant_1());
    editorCell.addEditorCell(createRefNode_1());
    editorCell.addEditorCell(createConstant_2());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "<");
    editorCell.setCellId("Constant_1yskak_a0a0a0a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    new LeftAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new kTypeSingleRoleHandler_1yskak_b0a0a0a0(myNode, LINKS.kType$hnxd, getEditorContext());
    return provider.createCell();
  }
  private static class kTypeSingleRoleHandler_1yskak_b0a0a0a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public kTypeSingleRoleHandler_1yskak_b0a0a0a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.kType$hnxd, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.kType$hnxd, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.kType$hnxd);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.kType$hnxd));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_kType");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no kType>";
    }
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ",");
    editorCell.setCellId("Constant_1yskak_c0a0a0a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1() {
    SingleRoleCellProvider provider = new vTypeSingleRoleHandler_1yskak_d0a0a0a0(myNode, LINKS.vType$hoeg, getEditorContext());
    return provider.createCell();
  }
  private static class vTypeSingleRoleHandler_1yskak_d0a0a0a0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public vTypeSingleRoleHandler_1yskak_d0a0a0a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.vType$hoeg, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.vType$hoeg, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.vType$hoeg);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.vType$hoeg));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_vType");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no vType>";
    }
  }
  private EditorCell createConstant_2() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ">");
    editorCell.setCellId("Constant_1yskak_e0a0a0a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    new RightAngleBracketStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createSideTransformationCell4_0() {
    SideTransformationHolderCell editorCell = new SideTransformationHolderCell(getEditorContext(), myNode, null, "grammar.optional for MapLiteral.kType") {
      @Override
      public List<MenuPart<TransformationMenuItem, TransformationMenuContext>> createMenuParts() {
        return ListSequence.fromListAndArray(new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>(), new GenericMenuPart_a0a0a0_0());
      }
    };
    editorCell.setCellId("SideTransformationCell4_1yskak_a0a0");
    return editorCell;
  }
  private class GenericMenuPart_a0a0a0_0 implements MenuPart<TransformationMenuItem, TransformationMenuContext> {

    @NotNull
    @Override
    public List<TransformationMenuItem> createItems(final TransformationMenuContext ctx) {
      List<TransformationMenuItem> result = ListSequence.fromList(new ArrayList<TransformationMenuItem>());
      final SNode sourceNode = ctx.getNode();
      final Iterable<String> matchingTexts = new StringOrSequenceQuery() {
        public Object queryStringOrSequence() {
          return Sequence.<String>singleton("<");
        }
      }.query();

      if (Sequence.fromIterable(matchingTexts).isNotEmpty()) {
        ListSequence.fromList(result).addElement(new MultiTextActionItem(matchingTexts, ctx) {
          @Override
          public void execute(@NotNull String pattern) {
            final SNode sourceNode = ctx.getNode();
            SNode newNode = SNodeFactoryOperations.setNewChild(SNodeOperations.cast(sourceNode, CONCEPTS.MapLiteral$h9), LINKS.kType$hnxd, null);
          }
          @Override
          public SAbstractConcept getOutputConcept() {
            return CONCEPTS.MapLiteral$h9;
          }
        });
      }
      return result;
    }
  }
  private EditorCell createConstant_3() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "{");
    editorCell.setCellId("Constant_1yskak_b0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    new LeftBraceStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_0() {
    AbstractCellListHandler handler = new pairsListHandler_1yskak_c0a(myNode, getEditorContext());
    jetbrains.mps.nodeEditor.cells.EditorCell_Collection editorCell = handler.createCells(new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_pairs");
    editorCell.setSRole(handler.getElementSRole());
    return editorCell;
  }
  private static class pairsListHandler_1yskak_c0a extends RefNodeListHandler {
    @NotNull
    private SNode myNode;

    public pairsListHandler_1yskak_c0a(SNode ownerNode, EditorContext context) {
      super(context, false);
      myNode = ownerNode;
    }

    @NotNull
    public SNode getNode() {
      return myNode;
    }
    public SContainmentLink getSLink() {
      return LINKS.pairs$f4NJ;
    }
    public SAbstractConcept getChildSConcept() {
      return CONCEPTS.Pair$WB;
    }

    public EditorCell createNodeCell(SNode elementNode) {
      EditorCell elementCell = getUpdateSession().updateChildNodeCell(elementNode);
      installElementCellActions(elementNode, elementCell, false);
      return elementCell;
    }
    public EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(pairsListHandler_1yskak_c0a.this.getNode(), LINKS.pairs$f4NJ));
      try {
        EditorCell emptyCell = null;
        emptyCell = createConstant_4();
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
    private EditorCell createConstant_4() {
      EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
      editorCell.setCellId("Constant_1yskak_a2a0");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_5() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "}");
    editorCell.setCellId("Constant_1yskak_d0a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    new RightBraceStyleClass(getEditorContext(), getNode()).apply(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink kType$hnxd = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bee50a63L, 0x69a8a294bf8f195aL, "kType");
    /*package*/ static final SContainmentLink vType$hoeg = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bee50a63L, 0x69a8a294bf8f195dL, "vType");
    /*package*/ static final SContainmentLink pairs$f4NJ = MetaAdapterFactory.getContainmentLink(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bee50a63L, 0x69a8a294beee9e82L, "pairs");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept MapLiteral$h9 = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294bee50a63L, "NewLanguage.structure.MapLiteral");
    /*package*/ static final SConcept Pair$WB = MetaAdapterFactory.getConcept(0x80fd2975f5c34fe6L, 0xa787f3eac6fef3beL, 0x69a8a294beee9c2cL, "NewLanguage.structure.Pair");
  }
}
