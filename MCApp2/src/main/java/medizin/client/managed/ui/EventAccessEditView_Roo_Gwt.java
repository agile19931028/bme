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
import medizin.client.managed.activity.EventAccessEditActivityWrapper;
import medizin.client.managed.activity.EventAccessEditActivityWrapper.View;
import medizin.client.managed.request.EventAccessProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.ui.*;
import medizin.client.shared.AccessRights;

public abstract class EventAccessEditView_Roo_Gwt extends Composite implements View<EventAccessEditView> {

    @UiField(provided = true)
    ValueListBox<AccessRights> accRights = new ValueListBox<AccessRights>(new AbstractRenderer<medizin.client.shared.AccessRights>() {

        public String render(medizin.client.shared.AccessRights obj) {
            return obj == null ? "" : String.valueOf(obj);
        }
    });

    @UiField(provided = true)
    ValueListBox<PersonProxy> person = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());

    @UiField(provided = true)
    ValueListBox<QuestionProxy> question = new ValueListBox<QuestionProxy>(medizin.client.managed.ui.QuestionProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.QuestionProxy>());

    @UiField(provided = true)
    ValueListBox<QuestionEventProxy> questionEvent = new ValueListBox<QuestionEventProxy>(medizin.client.managed.ui.QuestionEventProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.QuestionEventProxy>());

    public void setQuestionEventPickerValues(Collection<QuestionEventProxy> values) {
        questionEvent.setAcceptableValues(values);
    }

    public void setAccRightsPickerValues(Collection<AccessRights> values) {
        accRights.setAcceptableValues(values);
    }

    public void setQuestionPickerValues(Collection<QuestionProxy> values) {
        question.setAcceptableValues(values);
    }

    public void setPersonPickerValues(Collection<PersonProxy> values) {
        person.setAcceptableValues(values);
    }
}
