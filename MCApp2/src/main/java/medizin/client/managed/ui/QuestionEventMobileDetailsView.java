// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import medizin.client.managed.request.InstitutionProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.ui.QuestionEventMobileDetailsView.Binder;
import medizin.client.scaffold.place.ProxyDetailsView;

public class QuestionEventMobileDetailsView extends QuestionEventMobileDetailsView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static medizin.client.managed.ui.QuestionEventMobileDetailsView instance;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;

    public QuestionEventMobileDetailsView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static medizin.client.managed.ui.QuestionEventMobileDetailsView instance() {
        if (instance == null) {
            instance = new QuestionEventMobileDetailsView();
        }
        return instance;
    }

    public Widget asWidget() {
        return this;
    }

    public boolean confirm(String msg) {
        return Window.confirm(msg);
    }

    public QuestionEventProxy getValue() {
        return proxy;
    }

    @UiHandler("delete")
    public void onDeleteClicked(ClickEvent e) {
        delegate.deleteClicked();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    interface Binder extends UiBinder<HTMLPanel, QuestionEventMobileDetailsView> {
    }
}
