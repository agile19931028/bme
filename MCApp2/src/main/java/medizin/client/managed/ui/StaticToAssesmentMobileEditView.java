// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.requestfactory.shared.RequestFactory;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import java.util.Collection;
import java.util.List;
import medizin.client.managed.activity.StaticToAssesmentEditActivityWrapper;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.StaticContentProxy;
import medizin.client.managed.request.StaticToAssesmentProxy;
import medizin.client.managed.ui.StaticToAssesmentMobileEditView.Binder;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.ui.*;

public class StaticToAssesmentMobileEditView extends StaticToAssesmentMobileEditView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static medizin.client.managed.ui.StaticToAssesmentMobileEditView instance;

    @UiField
    Button save;

    @UiField
    DivElement errors;

    private Delegate delegate;

    public StaticToAssesmentMobileEditView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static medizin.client.managed.ui.StaticToAssesmentMobileEditView instance() {
        if (instance == null) {
            instance = new StaticToAssesmentMobileEditView();
        }
        return instance;
    }

    @Override
    public RequestFactoryEditorDriver<medizin.client.managed.request.StaticToAssesmentProxy, medizin.client.managed.ui.StaticToAssesmentMobileEditView> createEditorDriver() {
        RequestFactoryEditorDriver<StaticToAssesmentProxy, StaticToAssesmentMobileEditView> driver = GWT.create(Driver.class);
        driver.initialize(this);
        return driver;
    }

    public void setCreating(boolean creating) {
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setEnabled(boolean enabled) {
        save.setEnabled(enabled);
    }

    public void showErrors(List<EditorError> errors) {
        SafeHtmlBuilder b = new SafeHtmlBuilder();
        for (EditorError error : errors) {
            b.appendEscaped(error.getPath()).appendEscaped(": ");
            b.appendEscaped(error.getMessage()).appendHtmlConstant("<br>");
        }
        this.errors.setInnerHTML(b.toSafeHtml().asString());
    }

    @UiHandler("save")
    void onSave(ClickEvent event) {
        delegate.saveClicked();
    }

    interface Binder extends UiBinder<HTMLPanel, StaticToAssesmentMobileEditView> {
    }

    interface Driver extends RequestFactoryEditorDriver<StaticToAssesmentProxy, StaticToAssesmentMobileEditView> {
    }
}
