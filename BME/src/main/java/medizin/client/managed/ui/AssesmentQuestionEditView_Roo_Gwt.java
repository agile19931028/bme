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
import java.util.Set;
import medizin.client.managed.activity.AssesmentQuestionEditActivityWrapper;
import medizin.client.managed.activity.AssesmentQuestionEditActivityWrapper.View;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.ui.*;

public abstract class AssesmentQuestionEditView_Roo_Gwt extends Composite implements View<AssesmentQuestionEditView> {

    @UiField
    DateBox dateAdded;

    @UiField
    DateBox dateChanged;

    @UiField(provided = true)
    ValueListBox<PersonProxy> rewiewer = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());

    @UiField(provided = true)
    ValueListBox<PersonProxy> autor = new ValueListBox<PersonProxy>(medizin.client.managed.ui.PersonProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.PersonProxy>());

    @UiField
    IntegerBox orderAversion;

    @UiField
    IntegerBox orderBversion;

    @UiField
    DoubleBox trenschaerfe;

    @UiField
    DoubleBox schwierigkeit;

    @UiField(provided = true)
    CheckBox isAssQuestionAcceptedRewiever = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox isAssQuestionAcceptedAdmin = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox isAssQuestionAdminProposal = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    CheckBox isAssQuestionAcceptedAutor = new CheckBox() {

        public void setValue(Boolean value) {
            super.setValue(value == null ? Boolean.FALSE : value);
        }
    };

    @UiField(provided = true)
    ValueListBox<QuestionProxy> question = new ValueListBox<QuestionProxy>(medizin.client.managed.ui.QuestionProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.QuestionProxy>());

    @UiField(provided = true)
    ValueListBox<AssesmentProxy> assesment = new ValueListBox<AssesmentProxy>(medizin.client.managed.ui.AssesmentProxyRenderer.instance(), new com.google.gwt.requestfactory.ui.client.EntityProxyKeyProvider<medizin.client.managed.request.AssesmentProxy>());

    @UiField
    AnswerToAssQuestionSetEditor answersToAssQuestion;

    public void setAssesmentPickerValues(Collection<AssesmentProxy> values) {
        assesment.setAcceptableValues(values);
    }

    public void setRewiewerPickerValues(Collection<PersonProxy> values) {
        rewiewer.setAcceptableValues(values);
    }

    public void setAnswersToAssQuestionPickerValues(Collection<AnswerToAssQuestionProxy> values) {
        answersToAssQuestion.setAcceptableValues(values);
    }

    public void setQuestionPickerValues(Collection<QuestionProxy> values) {
        question.setAcceptableValues(values);
    }

    public void setAutorPickerValues(Collection<PersonProxy> values) {
        autor.setAcceptableValues(values);
    }
}
