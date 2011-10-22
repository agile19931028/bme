// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.scaffold.place.ProxyDetailsView;

public abstract class QuestionTypeMobileDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<QuestionTypeProxy> {

    @UiField
    Element questionTypeName;

    @UiField
    Element isWeil;

    @UiField
    Element trueAnswers;

    @UiField
    Element falseAnswers;

    @UiField
    Element sumAnswers;

    @UiField
    Element maxLetters;

    @UiField
    Element id;

    @UiField
    Element version;

    QuestionTypeProxy proxy;

    public void setValue(QuestionTypeProxy proxy) {
        this.proxy = proxy;
        questionTypeName.setInnerText(proxy.getQuestionTypeName() == null ? "" : String.valueOf(proxy.getQuestionTypeName()));
        isWeil.setInnerText(proxy.getIsWeil() == null ? "" : String.valueOf(proxy.getIsWeil()));
        trueAnswers.setInnerText(proxy.getTrueAnswers() == null ? "" : String.valueOf(proxy.getTrueAnswers()));
        falseAnswers.setInnerText(proxy.getFalseAnswers() == null ? "" : String.valueOf(proxy.getFalseAnswers()));
        sumAnswers.setInnerText(proxy.getSumAnswers() == null ? "" : String.valueOf(proxy.getSumAnswers()));
        maxLetters.setInnerText(proxy.getMaxLetters() == null ? "" : String.valueOf(proxy.getMaxLetters()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
    }
}
