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
import java.util.Set;
import medizin.client.managed.activity.KeywordEditActivityWrapper.View;
import medizin.client.managed.request.ApplicationRequestFactory;
import medizin.client.managed.request.KeywordProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.ui.QuestionSetEditor;
import medizin.client.scaffold.activity.IsScaffoldMobileActivity;
import medizin.client.scaffold.place.ProxyEditView;
import medizin.client.scaffold.place.ProxyListPlace;
import medizin.client.scaffold.place.ProxyPlace;

public abstract class KeywordEditActivityWrapper_Roo_Gwt implements Activity, IsScaffoldMobileActivity {

    protected Activity wrapped;

    protected View<?> view;

    protected ApplicationRequestFactory requests;

    @Override
    public void start(AcceptsOneWidget display, EventBus eventBus) {
        view.setQuestionsPickerValues(Collections.<QuestionProxy>emptyList());
        requests.questionRequest().findQuestionEntries(0, 50).with(medizin.client.managed.ui.QuestionProxyRenderer.instance().getPaths()).fire(new Receiver<List<QuestionProxy>>() {

            public void onSuccess(List<QuestionProxy> response) {
                List<QuestionProxy> values = new ArrayList<QuestionProxy>();
                values.add(null);
                values.addAll(response);
                view.setQuestionsPickerValues(values);
            }
        });
        wrapped.start(display, eventBus);
    }

    public interface View_Roo_Gwt<V extends medizin.client.scaffold.place.ProxyEditView<medizin.client.managed.request.KeywordProxy, V>> extends ProxyEditView<KeywordProxy, V> {

        void setQuestionsPickerValues(Collection<QuestionProxy> values);
    }
}
