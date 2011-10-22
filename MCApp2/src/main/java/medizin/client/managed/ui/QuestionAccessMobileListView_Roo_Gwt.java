// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.AbstractSafeHtmlRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import java.util.HashSet;
import java.util.Set;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionAccessProxy;
import medizin.client.managed.request.QuestionEventProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.ScaffoldMobileApp;
import medizin.client.scaffold.ui.MobileProxyListView;
import medizin.client.shared.AccessRights;

public abstract class QuestionAccessMobileListView_Roo_Gwt extends MobileProxyListView<QuestionAccessProxy> {

    protected Set<String> paths = new HashSet<String>();

    public QuestionAccessMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<medizin.client.managed.request.QuestionAccessProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("accRights");
        paths.add("person");
    }
}
