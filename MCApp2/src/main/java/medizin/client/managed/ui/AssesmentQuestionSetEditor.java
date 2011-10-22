// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.Editor.Ignore;
import com.google.gwt.editor.client.EditorDelegate;
import com.google.gwt.editor.client.LeafValueEditor;
import com.google.gwt.editor.client.ValueAwareEditor;
import com.google.gwt.editor.client.adapters.EditorSource;
import com.google.gwt.editor.client.adapters.ListEditor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.ui.AssesmentQuestionSetEditor.Style;
import medizin.client.scaffold.ui.CollectionRenderer;

public class AssesmentQuestionSetEditor extends AssesmentQuestionSetEditor_Roo_Gwt {

    @UiField
    FlowPanel container;

    @UiField(provided = true)
    @Ignore
    ValueListBox<AssesmentQuestionProxy> picker = new ValueListBox<AssesmentQuestionProxy>(medizin.client.managed.ui.AssesmentQuestionProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<AssesmentQuestionProxy>());

    @UiField
    Button add;

    @UiField
    HTMLPanel editorPanel;

    @UiField
    Button clickToEdit;

    @UiField
    HTMLPanel viewPanel;

    @UiField
    Label viewLabel;

    @UiField
    Style style;

    boolean editing = false;

    private Set<AssesmentQuestionProxy> values;

    private final List<AssesmentQuestionProxy> displayedList;

    public AssesmentQuestionSetEditor() {
        initWidget(GWT.<Binder>create(Binder.class).createAndBindUi(this));
        Driver driver = GWT.<Driver>create(Driver.class);
        ListEditor<AssesmentQuestionProxy, NameLabel> editor = ListEditor.of(new NameLabelSource());
        ListEditor<AssesmentQuestionProxy, NameLabel> listEditor = editor;
        driver.initialize(listEditor);
        driver.display(new ArrayList<AssesmentQuestionProxy>());
        displayedList = listEditor.getList();
        editing = false;
    }

    @UiHandler("add")
    public void addClicked(ClickEvent e) {
        if (!displayedList.contains(picker.getValue())) {
            displayedList.add(picker.getValue());
            viewLabel.setText(makeFlatList(displayedList));
        }
    }

    @UiHandler("clickToEdit")
    public void clickToEditClicked(ClickEvent e) {
        toggleEditorMode();
    }

    @Override
    public void flush() {
    }

    @Override
    public Set<medizin.client.managed.request.AssesmentQuestionProxy> getValue() {
        if (values == null && displayedList.size() == 0) {
            return null;
        }
        return new HashSet<AssesmentQuestionProxy>(displayedList);
    }

    public void onLoad() {
        makeEditable(false);
    }

    @Override
    public void onPropertyChange(String... strings) {
    }

    public void setAcceptableValues(Collection<AssesmentQuestionProxy> proxies) {
        picker.setAcceptableValues(proxies);
    }

    @Override
    public void setDelegate(EditorDelegate<Set<AssesmentQuestionProxy>> editorDelegate) {
    }

    @Override
    public void setValue(Set<AssesmentQuestionProxy> values) {
        this.values = values;
        makeEditable(editing = false);
        if (displayedList != null) {
            displayedList.clear();
        }
        if (values != null) {
            for (AssesmentQuestionProxy e : values) {
                displayedList.add(e);
            }
        }
        viewLabel.setText(makeFlatList(values));
    }

    private void makeEditable(boolean editable) {
        if (editable) {
            editorPanel.setStylePrimaryName(style.editorPanelVisible());
            viewPanel.setStylePrimaryName(style.viewPanelHidden());
            clickToEdit.setText("Done");
        } else {
            editorPanel.setStylePrimaryName(style.editorPanelHidden());
            viewPanel.setStylePrimaryName(style.viewPanelVisible());
            clickToEdit.setText("Edit");
        }
    }

    private String makeFlatList(Collection<AssesmentQuestionProxy> values) {
        return CollectionRenderer.of(medizin.client.managed.ui.AssesmentQuestionProxyRenderer.instance()).render(values);
    }

    private void toggleEditorMode() {
        editing = !editing;
        makeEditable(editing);
    }

    interface Binder extends UiBinder<Widget, AssesmentQuestionSetEditor> {
    }

    interface Driver extends RequestFactoryEditorDriver<List<AssesmentQuestionProxy>, ListEditor<AssesmentQuestionProxy, NameLabel>> {
    }

    class NameLabel extends Composite implements ValueAwareEditor<AssesmentQuestionProxy> {

        final Label idEditor = new Label();

        public NameLabel() {
            this(null);
        }

        public NameLabel(EventBus eventBus) {
            initWidget(idEditor);
        }

        public void flush() {
        }

        @Override
        public void onPropertyChange(String... strings) {
        }

        @Override
        public void setDelegate(EditorDelegate<AssesmentQuestionProxy> editorDelegate) {
        }

        @Override
        public void setValue(AssesmentQuestionProxy proxy) {
        }
    }

    interface Style extends CssResource {

        String editorPanelHidden();

        String editorPanelVisible();

        String viewPanelHidden();

        String viewPanelVisible();
    }

    private class NameLabelSource extends EditorSource<NameLabel> {

        @Override
        public NameLabel create(int index) {
            NameLabel label = new NameLabel();
            container.insert(label, index);
            return label;
        }

        @Override
        public void dispose(NameLabel subEditor) {
            subEditor.removeFromParent();
        }

        @Override
        public void setIndex(NameLabel editor, int index) {
            container.insert(editor, index);
        }
    }
}
