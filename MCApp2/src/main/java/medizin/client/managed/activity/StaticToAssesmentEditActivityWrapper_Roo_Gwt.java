// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import medizin.client.managed.activity.StaticToAssesmentEditActivityWrapper.View;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.StaticContentProxy;
import medizin.client.managed.request.StaticToAssesmentProxy;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;

public abstract class StaticToAssesmentEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setStaticContentPickerValues(Collections.<StaticContentProxy>emptyList());
        requests.staticContentRequest().findStaticContentEntries(0, 50).with(medizin.client.managed.ui.StaticContentProxyRenderer.instance().getPaths()).fire(new Receiver<List<StaticContentProxy>>() {

            public void onSuccess(List<StaticContentProxy> response) {
                List<StaticContentProxy> values = new ArrayList<StaticContentProxy>();
                values.add(null);
                values.addAll(response);
                view.setStaticContentPickerValues(values);
            }
        });
        view.setAssesmentPickerValues(Collections.<AssesmentProxy>emptyList());
        requests.assesmentRequest().findAssesmentEntries(0, 50).with(medizin.client.managed.ui.AssesmentProxyRenderer.instance().getPaths()).fire(new Receiver<List<AssesmentProxy>>() {

            public void onSuccess(List<AssesmentProxy> response) {
                List<AssesmentProxy> values = new ArrayList<AssesmentProxy>();
                values.add(null);
                values.addAll(response);
                view.setAssesmentPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends medizin.client.scaffold.place.ProxyEditView<medizin.client.managed.request.StaticToAssesmentProxy, V>> extends ProxyEditView<StaticToAssesmentProxy, V> {

        void setStaticContentPickerValues(Collection<StaticContentProxy> values);

        void setAssesmentPickerValues(Collection<AssesmentProxy> values);
    }
}
