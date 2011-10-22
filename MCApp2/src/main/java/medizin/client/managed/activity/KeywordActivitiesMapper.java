// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestContext;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.KeywordProxy;
import medizin.client.managed.request.KeywordRequest;
import medizin.client.managed.ui.KeywordDetailsView;
import medizin.client.managed.ui.KeywordEditView;
import medizin.client.managed.ui.KeywordListView;
import medizin.client.managed.ui.KeywordMobileDetailsView;
import medizin.client.managed.ui.KeywordMobileEditView;
import medizin.client.scaffold.ScaffoldApp;
import medizin.client.scaffold.place.CreateAndEditProxy;
import medizin.client.scaffold.place.FindAndEditProxy;
import medizin.client.scaffold.place.ProxyPlace;

public class KeywordActivitiesMapper {

    private final ApplicationRequestFactory requests;

    private final PlaceController placeController;

    public KeywordActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new KeywordDetailsActivity((EntityProxyId<KeywordProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? KeywordMobileDetailsView.instance() : KeywordDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }

    @SuppressWarnings("unchecked")
    private EntityProxyId<medizin.client.managed.request.KeywordProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<KeywordProxy>) place.getProxyId();
    }

    private Activity makeCreateActivity() {
        KeywordEditView.instance().setCreating(true);
        final KeywordRequest request = requests.keywordRequest();
        Activity activity = new CreateAndEditProxy<KeywordProxy>(KeywordProxy.class, request, ScaffoldApp.isMobile() ? KeywordMobileEditView.instance() : KeywordEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(KeywordProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new KeywordEditActivityWrapper(requests, ScaffoldApp.isMobile() ? KeywordMobileEditView.instance() : KeywordEditView.instance(), activity, null);
    }

    private Activity makeEditActivity(ProxyPlace place) {
        KeywordEditView.instance().setCreating(false);
        EntityProxyId<KeywordProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<KeywordProxy>(proxyId, requests, ScaffoldApp.isMobile() ? KeywordMobileEditView.instance() : KeywordEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(KeywordProxy proxy) {
                KeywordRequest request = requests.keywordRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new KeywordEditActivityWrapper(requests, ScaffoldApp.isMobile() ? KeywordMobileEditView.instance() : KeywordEditView.instance(), activity, proxyId);
    }
}
