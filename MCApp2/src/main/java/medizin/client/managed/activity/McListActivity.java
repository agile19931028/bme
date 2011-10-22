// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.view.client.Range;
import java.util.List;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.McProxy;
import medizin.client.scaffold.ScaffoldMobileApp;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.AbstractProxyListActivity;
import medizin.client.scaffold.place.ProxyListView;

public class McListActivity extends AbstractProxyListActivity<McProxy> implements IsScaffoldMobileActivity {

    private final ApplicationRequestFactory requests;

    public McListActivity(ApplicationRequestFactory requests, ProxyListView<medizin.client.managed.request.McProxy> view, PlaceController placeController) {
        super(placeController, view, McProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "Mcs";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<medizin.client.managed.request.McProxy>> createRangeRequest(Range range) {
        return requests.mcRequest().findMcEntries(range.getStart(), range.getLength());
    }

    protected void fireCountRequest(Receiver<Long> callback) {
        requests.mcRequest().countMcs().fire(callback);
    }
}
