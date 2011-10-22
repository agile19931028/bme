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
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.ScaffoldMobileApp;
import medizin.client.scaffold.ui.MobileProxyListView;

public abstract class AssesmentQuestionMobileListView_Roo_Gwt extends MobileProxyListView<AssesmentQuestionProxy> {

    protected Set<String> paths = new HashSet<String>();

    public AssesmentQuestionMobileListView_Roo_Gwt(String buttonText, SafeHtmlRenderer<medizin.client.managed.request.AssesmentQuestionProxy> renderer) {
        super(buttonText, renderer);
    }

    public void init() {
        paths.add("dateAdded");
        paths.add("dateChanged");
        paths.add("dateAdded");
    }
}