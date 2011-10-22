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

public abstract class EventAccessEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setAccRightsPickerValues(Arrays.asList(AccessRights.values()));
        view.setPersonPickerValues(Collections.<PersonProxy>emptyList());
        requests.personRequest().findPersonEntries(0, 50).with(medizin.client.managed.ui.PersonProxyRenderer.instance().getPaths()).fire(new Receiver<List<PersonProxy>>() {

            public void onSuccess(List<PersonProxy> response) {
                List<PersonProxy> values = new ArrayList<PersonProxy>();
                values.add(null);
                values.addAll(response);
                view.setPersonPickerValues(values);
            }
        });
        view.setQuestionPickerValues(Collections.<QuestionProxy>emptyList());
        requests.questionRequest().findQuestionEntries(0, 50).with(medizin.client.managed.ui.QuestionProxyRenderer.instance().getPaths()).fire(new Receiver<List<QuestionProxy>>() {

            public void onSuccess(List<QuestionProxy> response) {
                List<QuestionProxy> values = new ArrayList<QuestionProxy>();
                values.add(null);
                values.addAll(response);
                view.setQuestionPickerValues(values);
            }
        });
        view.setQuestionEventPickerValues(Collections.<QuestionEventProxy>emptyList());
        requests.questionEventRequest().findQuestionEventEntries(0, 50).with(medizin.client.managed.ui.QuestionEventProxyRenderer.instance().getPaths()).fire(new Receiver<List<QuestionEventProxy>>() {

            public void onSuccess(List<QuestionEventProxy> response) {
                List<QuestionEventProxy> values = new ArrayList<QuestionEventProxy>();
                values.add(null);
                values.addAll(response);
                view.setQuestionEventPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends medizin.client.scaffold.place.ProxyEditView<medizin.client.managed.request.EventAccessProxy, V>> extends ProxyEditView<EventAccessProxy, V> {

        void setAccRightsPickerValues(Collection<AccessRights> values);

        void setPersonPickerValues(Collection<PersonProxy> values);

        void setQuestionPickerValues(Collection<QuestionProxy> values);

        void setQuestionEventPickerValues(Collection<QuestionEventProxy> values);
    }
}
