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
import medizin.client.managed.activity.AnswerEditActivityWrapper.View;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;
import medizin.client.shared.Validity;

public class AnswerEditActivityWrapper extends AnswerEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<AnswerProxy> proxyId;

    public AnswerEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<medizin.client.managed.request.AnswerProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(AnswerProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Answer" : "Edit Answer";
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

    public interface View<V extends medizin.client.scaffold.place.ProxyEditView<medizin.client.managed.request.AnswerProxy, V>> extends View_Roo_Gwt<V> {
    }
}
