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
import java.util.Set;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.scaffold.place.ProxyDetailsView;

public abstract class QuestionTypeCountPerExamMobileDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<QuestionTypeCountPerExamProxy> {

    @UiField
    Element questionTypesAssigned;

    @UiField
    Element assesment;

    @UiField
    Element questionTypeCount;

    @UiField
    Element sort_order;

    @UiField
    Element id;

    @UiField
    Element version;

    QuestionTypeCountPerExamProxy proxy;

    public void setValue(QuestionTypeCountPerExamProxy proxy) {
        this.proxy = proxy;
        questionTypesAssigned.setInnerText(proxy.getQuestionTypesAssigned() == null ? "" : medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.QuestionTypeProxyRenderer.instance()).render(proxy.getQuestionTypesAssigned()));
        assesment.setInnerText(proxy.getAssesment() == null ? "" : medizin.client.managed.ui.AssesmentProxyRenderer.instance().render(proxy.getAssesment()));
        questionTypeCount.setInnerText(proxy.getQuestionTypeCount() == null ? "" : String.valueOf(proxy.getQuestionTypeCount()));
        sort_order.setInnerText(proxy.getSort_order() == null ? "" : String.valueOf(proxy.getSort_order()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
    }
}
