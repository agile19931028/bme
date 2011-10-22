// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import java.util.Set;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;
import medizin.client.scaffold.place.ProxyPlace.Operation;

public class QuestionEventDetailsActivity extends QuestionEventDetailsActivity_Roo_Gwt {

    private final PlaceController placeController;

    private final ProxyDetailsView<QuestionEventProxy> view;

    private AcceptsOneWidget display;

    public QuestionEventDetailsActivity(EntityProxyId<medizin.client.managed.request.QuestionEventProxy> proxyId, ApplicationRequestFactory requests, PlaceController placeController, ProxyDetailsView<medizin.client.managed.request.QuestionEventProxy> view) {
        this.placeController = placeController;
        this.proxyId = proxyId;
        this.requests = requests;
        view.setDelegate(this);
        this.view = view;
    }

    public void deleteClicked() {
        if (!view.confirm("Really delete this entry? You cannot undo this change.")) {
            return;
        }
        requests.questionEventRequest().remove().using(view.getValue()).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
                if (display == null) {
                    return;
                }
                placeController.goTo(getBackButtonPlace());
            }
        });
    }

    public void editClicked() {
        placeController.goTo(getEditButtonPlace());
    }

    public Place getBackButtonPlace() {
        return new ProxyListPlace(QuestionEventProxy.class);
    }

    public String getBackButtonText() {
        return "Back";
    }

    public Place getEditButtonPlace() {
        return new ProxyPlace(view.getValue().stableId(), Operation.EDIT);
    }

    public String getTitleText() {
        return "View QuestionEvent";
    }

    public boolean hasEditButton() {
        return true;
    }

    public void onCancel() {
        onStop();
    }

    public void onStop() {
        display = null;
    }

    public void start(AcceptsOneWidget displayIn, EventBus eventBus) {
        this.display = displayIn;
        Receiver<EntityProxy> callback = new Receiver<EntityProxy>() {

            public void onSuccess(EntityProxy proxy) {
                if (proxy == null) {
                    placeController.goTo(getBackButtonPlace());
                    return;
                }
                if (display == null) {
                    return;
                }
                view.setValue((QuestionEventProxy) proxy);
                display.setWidget(view);
            }
        };
        find(callback);
    }
}
