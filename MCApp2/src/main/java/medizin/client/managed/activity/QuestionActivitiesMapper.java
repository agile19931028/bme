// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.RequestContext;
import java.util.Set;
import medizin.client.managed.request.AnswerProxy;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.CommentProxy;
import medizin.client.managed.request.KeywordProxy;
import medizin.client.managed.request.McProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.request.QuestionRequest;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.managed.ui.AnswerSetEditor;
import medizin.client.managed.ui.KeywordSetEditor;
import medizin.client.managed.ui.McSetEditor;
import medizin.client.managed.ui.QuestionDetailsView;
import medizin.client.managed.ui.QuestionEditView;
import medizin.client.managed.ui.QuestionListView;
import medizin.client.managed.ui.QuestionMobileDetailsView;
import medizin.client.managed.ui.QuestionMobileEditView;
import medizin.client.scaffold.ScaffoldApp;
import medizin.client.scaffold.place.CreateAndEditProxy;
import medizin.client.scaffold.place.FindAndEditProxy;
import medizin.client.scaffold.place.ProxyPlace;

public class QuestionActivitiesMapper {

    private final ApplicationRequestFactory requests;

    private final PlaceController placeController;

    public QuestionActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new QuestionDetailsActivity((EntityProxyId<QuestionProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? QuestionMobileDetailsView.instance() : QuestionDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }

    @SuppressWarnings("unchecked")
    private EntityProxyId<medizin.client.managed.request.QuestionProxy> coerceId(ProxyPlace place) {
        return (EntityProxyId<QuestionProxy>) place.getProxyId();
    }

    private Activity makeCreateActivity() {
        QuestionEditView.instance().setCreating(true);
        final QuestionRequest request = requests.questionRequest();
        Activity activity = new CreateAndEditProxy<QuestionProxy>(QuestionProxy.class, request, ScaffoldApp.isMobile() ? QuestionMobileEditView.instance() : QuestionEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(QuestionProxy proxy) {
                request.persist().using(proxy);
                return request;
            }
        };
        return new QuestionEditActivityWrapper(requests, ScaffoldApp.isMobile() ? QuestionMobileEditView.instance() : QuestionEditView.instance(), activity, null);
    }

    private Activity makeEditActivity(ProxyPlace place) {
        QuestionEditView.instance().setCreating(false);
        EntityProxyId<QuestionProxy> proxyId = coerceId(place);
        Activity activity = new FindAndEditProxy<QuestionProxy>(proxyId, requests, ScaffoldApp.isMobile() ? QuestionMobileEditView.instance() : QuestionEditView.instance(), placeController) {

            @Override
            protected RequestContext createSaveRequest(QuestionProxy proxy) {
                QuestionRequest request = requests.questionRequest();
                request.persist().using(proxy);
                return request;
            }
        };
        return new QuestionEditActivityWrapper(requests, ScaffoldApp.isMobile() ? QuestionMobileEditView.instance() : QuestionEditView.instance(), activity, proxyId);
    }
}
