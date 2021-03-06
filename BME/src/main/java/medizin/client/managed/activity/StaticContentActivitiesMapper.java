// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestContext;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.StaticContentProxy;
import medizin.client.managed.request.StaticContentRequest;
import medizin.client.managed.ui.StaticContentDetailsView;
import medizin.client.managed.ui.StaticContentEditView;
import medizin.client.managed.ui.StaticContentListView;
import medizin.client.managed.ui.StaticContentMobileDetailsView;
import medizin.client.managed.ui.StaticContentMobileEditView;
import medizin.client.scaffold.ScaffoldApp;
import medizin.client.scaffold.place.CreateAndEditProxy;
import medizin.client.scaffold.place.FindAndEditProxy;
import medizin.client.scaffold.place.ProxyPlace;

public class StaticContentActivitiesMapper {

    private final ApplicationRequestFactory requests;

    private final PlaceController placeController;

    public StaticContentActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new StaticContentDetailsActivity((EntityProxyId<StaticContentProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? StaticContentMobileDetailsView.instance() : StaticContentDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }

    @SuppressWarnings("unchecked")
    private EntityProxyId<medizin.client.managed.request.StaticContentProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<StaticContentProxy>) place.getProxyId();
    }

    private Activity makeCreateActivity() {
        StaticContentEditView.instance().setCreating(true);
        final StaticContentRequest request = requests.staticContentRequest();
        Activity activity = new CreateAndEditProxy<StaticContentProxy>(StaticContentProxy.class, request, ScaffoldApp.isMobile() ? StaticContentMobileEditView.instance() : StaticContentEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(StaticContentProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new StaticContentEditActivityWrapper(requests, ScaffoldApp.isMobile() ? StaticContentMobileEditView.instance() : StaticContentEditView.instance(), activity, null);
    }

    private Activity makeEditActivity(ProxyPlace place) {
        StaticContentEditView.instance().setCreating(false);
        EntityProxyId<StaticContentProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<StaticContentProxy>(proxyId, requests, ScaffoldApp.isMobile() ? StaticContentMobileEditView.instance() : StaticContentEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(StaticContentProxy proxy) {
                StaticContentRequest request = requests.staticContentRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new StaticContentEditActivityWrapper(requests, ScaffoldApp.isMobile() ? StaticContentMobileEditView.instance() : StaticContentEditView.instance(), activity, proxyId);
    }
}
