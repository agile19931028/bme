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
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.scaffold.place.ProxyDetailsView;

public abstract class PersonMobileDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<PersonProxy> {

    @UiField
    Element id;

    @UiField
    Element version;

    @UiField
    Element name;

    @UiField
    Element prename;

    @UiField
    Element shidId;

    @UiField
    Element email;

    @UiField
    Element alternativEmail;

    @UiField
    Element phoneNumber;

    @UiField
    Element isAdmin;

    @UiField
    Element isAccepted;

    @UiField
    Element questionAccesses;

    PersonProxy proxy;

    public void setValue(PersonProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        prename.setInnerText(proxy.getPrename() == null ? "" : String.valueOf(proxy.getPrename()));
        shidId.setInnerText(proxy.getShidId() == null ? "" : String.valueOf(proxy.getShidId()));
        email.setInnerText(proxy.getEmail() == null ? "" : String.valueOf(proxy.getEmail()));
        alternativEmail.setInnerText(proxy.getAlternativEmail() == null ? "" : String.valueOf(proxy.getAlternativEmail()));
        phoneNumber.setInnerText(proxy.getPhoneNumber() == null ? "" : String.valueOf(proxy.getPhoneNumber()));
        isAdmin.setInnerText(proxy.getIsAdmin() == null ? "" : String.valueOf(proxy.getIsAdmin()));
        isAccepted.setInnerText(proxy.getIsAccepted() == null ? "" : String.valueOf(proxy.getIsAccepted()));
        questionAccesses.setInnerText(proxy.getQuestionAccesses() == null ? "" : medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.QuestionAccessProxyRenderer.instance()).render(proxy.getQuestionAccesses()));
    }
}