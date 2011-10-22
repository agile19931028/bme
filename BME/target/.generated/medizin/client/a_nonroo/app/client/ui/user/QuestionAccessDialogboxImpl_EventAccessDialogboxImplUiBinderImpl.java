package medizin.client.a_nonroo.app.client.ui.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl>, medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl.EventAccessDialogboxImplUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl owner) {

    medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle) GWT.create(medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenBundle.class);
    medizin.client.a_nonroo.app.client.ui.user.QuestionAccessDialogboxImpl_EventAccessDialogboxImplUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable tableEvent = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ListBox searchInstitution = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ListBox searchEvent = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox searchQuestion = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox checkQuestiontext = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.CheckBox checkKeywords = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.SimplePager f_SimplePager2 = new com.google.gwt.user.cellview.client.SimplePager(com.google.gwt.user.cellview.client.SimplePager.TextLocation.RIGHT);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button closeButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div style='height:3em;'></div> <span id='" + domId0 + "'></span> <div class='" + "" + style.controls() + "" + "'> <span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span> <span id='" + domId3 + "'></span> <span id='" + domId4 + "'></span> <span id='" + domId5 + "'></span> <span id='" + domId6 + "'></span> </div> <div style='height:3em;'></div><div class='" + "" + style.bar() + "" + "'> <span id='" + domId7 + "'></span> </div>");

    tableEvent.setWidth("100%");
    tableEvent.setPageSize(8);
    checkQuestiontext.setHTML("Fragentext");
    checkKeywords.setHTML("Keywords");
    f_SimplePager2.setDisplay(tableEvent);
    closeButton.setHTML("Schliessen");
    closeButton.addStyleName("ui-button");
    closeButton.addStyleName("ui-widget");
    closeButton.addStyleName("ui-state-default");
    closeButton.addStyleName("ui-corner-all");
    closeButton.addStyleName("ui-button-text-only");
    closeButton.addStyleName("" + style.right() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(tableEvent, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(searchInstitution, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(searchEvent, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(searchQuestion, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(checkQuestiontext, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(checkKeywords, domId5Element);
    f_HTMLPanel1.addAndReplaceElement(f_SimplePager2, domId6Element);
    f_HTMLPanel1.addAndReplaceElement(closeButton, domId7Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCloseButtonClick(event);
      }
    };
    closeButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.checkKeywords = checkKeywords;
    owner.checkQuestiontext = checkQuestiontext;
    owner.closeButton = closeButton;
    owner.searchEvent = searchEvent;
    owner.searchInstitution = searchInstitution;
    owner.searchQuestion = searchQuestion;
    owner.tableEvent = tableEvent;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
