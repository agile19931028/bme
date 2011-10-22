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
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;

public abstract class QuestionEventDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<QuestionEventProxy> {

    @UiField
    SpanElement eventName;

    @UiField
    SpanElement institution;

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    QuestionEventProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(QuestionEventProxy proxy) {
        this.proxy = proxy;
        eventName.setInnerText(proxy.getEventName() == null ? "" : String.valueOf(proxy.getEventName()));
        institution.setInnerText(proxy.getInstitution() == null ? "" : medizin.client.managed.ui.InstitutionProxyRenderer.instance().render(proxy.getInstitution()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(medizin.client.managed.ui.QuestionEventProxyRenderer.instance().render(proxy));
    }
}
