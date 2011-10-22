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
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.managed.ui.QuestionAccessMobileDetailsView.Binder;
import medizin.client.scaffold.place.ProxyDetailsView;
import medizin.client.shared.AccessRights;

public class QuestionAccessMobileDetailsView extends QuestionAccessMobileDetailsView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static medizin.client.managed.ui.QuestionAccessMobileDetailsView instance;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;

    public QuestionAccessMobileDetailsView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static medizin.client.managed.ui.QuestionAccessMobileDetailsView instance() {
        if (instance == null) {
            instance = new QuestionAccessMobileDetailsView();
        }
        return instance;
    }

    public Widget asWidget() {
        return this;
    }

    public boolean confirm(String msg) {
        return Window.confirm(msg);
    }

    public QuestionAccessProxy getValue() {
        return proxy;
    }

    @UiHandler("delete")
    public void onDeleteClicked(ClickEvent e) {
        delegate.deleteClicked();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    interface Binder extends UiBinder<HTMLPanel, QuestionAccessMobileDetailsView> {
    }
}