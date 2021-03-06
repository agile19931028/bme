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
import medizin.client.managed.activity.EventAccessEditActivityWrapper.View;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.EventAccessProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;
import medizin.client.shared.AccessRights;

public class EventAccessEditActivityWrapper extends EventAccessEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<EventAccessProxy> proxyId;

    public EventAccessEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<medizin.client.managed.request.EventAccessProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(EventAccessProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New EventAccess" : "Edit EventAccess";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends medizin.client.scaffold.place.ProxyEditView<medizin.client.managed.request.EventAccessProxy, V>> extends View_Roo_Gwt<V> {
    }
}
