// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;
import medizin.client.shared.Validity;

public abstract class AnswerDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<AnswerProxy> {

    @UiField
    SpanElement dateAdded;

    @UiField
    SpanElement dateChanged;

    @UiField
    SpanElement rewiewer;

    @UiField
    SpanElement autor;

    @UiField
    SpanElement answerText;

    @UiField
    SpanElement isAnswerActive;

    @UiField
    SpanElement isPicture;

    @UiField
    SpanElement isAnswerAcceptedReviewWahrer;

    @UiField
    SpanElement isAnswerAcceptedAutor;

    @UiField
    SpanElement isAnswerAcceptedAdmin;

    @UiField
    SpanElement validity;

    @UiField
    SpanElement picturePath;

    @UiField
    SpanElement question;

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    AnswerProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(AnswerProxy proxy) {
        this.proxy = proxy;
        dateAdded.setInnerText(proxy.getDateAdded() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateAdded()));
        dateChanged.setInnerText(proxy.getDateChanged() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getDateChanged()));
        rewiewer.setInnerText(proxy.getRewiewer() == null ? "" : medizin.client.managed.ui.PersonProxyRenderer.instance().render(proxy.getRewiewer()));
        autor.setInnerText(proxy.getAutor() == null ? "" : medizin.client.managed.ui.PersonProxyRenderer.instance().render(proxy.getAutor()));
        answerText.setInnerText(proxy.getAnswerText() == null ? "" : String.valueOf(proxy.getAnswerText()));
        isAnswerActive.setInnerText(proxy.getIsAnswerActive() == null ? "" : String.valueOf(proxy.getIsAnswerActive()));
        isPicture.setInnerText(proxy.getIsPicture() == null ? "" : String.valueOf(proxy.getIsPicture()));
        isAnswerAcceptedReviewWahrer.setInnerText(proxy.getIsAnswerAcceptedReviewWahrer() == null ? "" : String.valueOf(proxy.getIsAnswerAcceptedReviewWahrer()));
        isAnswerAcceptedAutor.setInnerText(proxy.getIsAnswerAcceptedAutor() == null ? "" : String.valueOf(proxy.getIsAnswerAcceptedAutor()));
        isAnswerAcceptedAdmin.setInnerText(proxy.getIsAnswerAcceptedAdmin() == null ? "" : String.valueOf(proxy.getIsAnswerAcceptedAdmin()));
        validity.setInnerText(proxy.getValidity() == null ? "" : String.valueOf(proxy.getValidity()));
        picturePath.setInnerText(proxy.getPicturePath() == null ? "" : String.valueOf(proxy.getPicturePath()));
        question.setInnerText(proxy.getQuestion() == null ? "" : medizin.client.managed.ui.QuestionProxyRenderer.instance().render(proxy.getQuestion()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(medizin.client.managed.ui.AnswerProxyRenderer.instance().render(proxy));
    }
}
