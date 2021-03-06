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
import medizin.client.managed.activity.StaticToAssesmentEditActivityWrapper.View;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.StaticContentProxy;
import medizin.client.managed.request.StaticToAssesmentProxy;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.ui.*;

public abstract class StaticToAssesmentEditView_Roo_Gwt extends Composite implements View<StaticToAssesmentEditView> {

    @UiField
    IntegerBox sortOrder;

    @UiField(provided = true)
    ValueListBox<StaticContentProxy> staticContent = new ValueListBox<StaticContentProxy>(medizin.client.managed.ui.StaticContentProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.StaticContentProxy>());

    @UiField(provided = true)
    ValueListBox<AssesmentProxy> assesment = new ValueListBox<AssesmentProxy>(medizin.client.managed.ui.AssesmentProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.AssesmentProxy>());

    public void setAssesmentPickerValues(Collection<AssesmentProxy> values) {
        assesment.setAcceptableValues(values);
    }

    public void setStaticContentPickerValues(Collection<StaticContentProxy> values) {
        staticContent.setAcceptableValues(values);
    }
}
