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
import java.util.HashSet;
import java.util.Set;
import medizin.client.managed.request.CommentProxy;
import medizin.client.scaffold.ScaffoldMobileApp;
import medizin.client.scaffold.ui.MobileProxyListView;

public class CommentMobileListView extends CommentMobileListView_Roo_Gwt {

    private static medizin.client.managed.ui.CommentMobileListView instance;

    public CommentMobileListView() {
        super("New Comment", new CellRenderer());
        init();
    }

    public static medizin.client.managed.ui.CommentMobileListView instance() {
        if (instance == null) {
            instance = new CommentMobileListView();
        }
        return instance;
    }

    public String[] getPaths() {
        return paths.toArray(new String[paths.size()]);
    }

    private static class CellRenderer extends AbstractSafeHtmlRenderer<CommentProxy> {

        private final String dateStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().dateProp();

        private final String secondaryStyle = ScaffoldMobileApp.getMobileListResources().cellListStyle().secondaryProp();

        private final Renderer<String> primaryRenderer = new AbstractRenderer<String>() {

            public String render(java.lang.String obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        private final Renderer<Long> secondaryRenderer = new AbstractRenderer<Long>() {

            public String render(java.lang.Long obj) {
                return obj == null ? "" : String.valueOf(obj);
            }
        };

        @Override
        public SafeHtml render(CommentProxy value) {
            if (value == null) {
                return SafeHtmlUtils.EMPTY_SAFE_HTML;
            }
            SafeHtmlBuilder sb = new SafeHtmlBuilder();
            if (value.getComment() != null) {
                sb.appendEscaped(primaryRenderer.render(value.getComment()));
            }
            sb.appendHtmlConstant("<div style=\"position:relative;\">");
            sb.appendHtmlConstant("<div class=\"" + secondaryStyle + "\">");
            if (value.getId() != null) {
                sb.appendEscaped(secondaryRenderer.render(value.getId()));
            }
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("<div class=\"" + dateStyle + "\">");
            sb.appendHtmlConstant("</div>");
            sb.appendHtmlConstant("</div>");
            return sb.toSafeHtml();
        }
    }
}
