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
import medizin.client.managed.request.McProxy;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListView;

public abstract class McDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<McProxy> {

    @UiField
    SpanElement mcName;

    @UiField
    SpanElement id;

    @UiField
    SpanElement version;

    McProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(McProxy proxy) {
        this.proxy = proxy;
        mcName.setInnerText(proxy.getMcName() == null ? "" : String.valueOf(proxy.getMcName()));
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(medizin.client.managed.ui.McProxyRenderer.instance().render(proxy));
    }
}