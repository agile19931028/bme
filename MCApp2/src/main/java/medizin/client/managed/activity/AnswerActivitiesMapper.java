// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestContext;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.AnswerRequest;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.ui.AnswerDetailsView;
import medizin.client.managed.ui.AnswerEditView;
import medizin.client.managed.ui.AnswerListView;
import medizin.client.managed.ui.AnswerMobileDetailsView;
import medizin.client.managed.ui.AnswerMobileEditView;
import medizin.client.scaffold.ScaffoldApp;
import medizin.client.scaffold.place.CreateAndEditProxy;
import medizin.client.scaffold.place.FindAndEditProxy;
import medizin.client.scaffold.place.ProxyPlace;
import medizin.client.shared.Validity;

public class AnswerActivitiesMapper {

    private final ApplicationRequestFactory requests;

    private final PlaceController placeController;

    public AnswerActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new AnswerDetailsActivity((EntityProxyId<AnswerProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? AnswerMobileDetailsView.instance() : AnswerDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }

    @SuppressWarnings("unchecked")
    private EntityProxyId<medizin.client.managed.request.AnswerProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<AnswerProxy>) place.getProxyId();
    }

    private Activity makeCreateActivity() {
        AnswerEditView.instance().setCreating(true);
        final AnswerRequest request = requests.answerRequest();
        Activity activity = new CreateAndEditProxy<AnswerProxy>(AnswerProxy.class, request, ScaffoldApp.isMobile() ? AnswerMobileEditView.instance() : AnswerEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(AnswerProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new AnswerEditActivityWrapper(requests, ScaffoldApp.isMobile() ? AnswerMobileEditView.instance() : AnswerEditView.instance(), activity, null);
    }

    private Activity makeEditActivity(ProxyPlace place) {
        AnswerEditView.instance().setCreating(false);
        EntityProxyId<AnswerProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<AnswerProxy>(proxyId, requests, ScaffoldApp.isMobile() ? AnswerMobileEditView.instance() : AnswerEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(AnswerProxy proxy) {
                AnswerRequest request = requests.answerRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new AnswerEditActivityWrapper(requests, ScaffoldApp.isMobile() ? AnswerMobileEditView.instance() : AnswerEditView.instance(), activity, proxyId);
    }
}
