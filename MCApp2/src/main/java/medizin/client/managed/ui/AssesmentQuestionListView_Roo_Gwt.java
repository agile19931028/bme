// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.text.client.DateTimeFormatRenderer;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.HashSet;
import java.util.Set;
import medizin.client.managed.request.AnswerToAssQuestionProxy;
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.AssesmentQuestionProxy;
import medizin.client.managed.request.PersonProxy;
import medizin.client.managed.request.QuestionProxy;
import medizin.client.scaffold.place.AbstractProxyListView;

public abstract class AssesmentQuestionListView_Roo_Gwt extends AbstractProxyListView<AssesmentQuestionProxy> {

    @UiField
    CellTable<AssesmentQuestionProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("dateAdded");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getDateAdded());
            }
        }, "Date Added");
        paths.add("dateChanged");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.util.Date> renderer = new DateTimeFormatRenderer(DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT));

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getDateChanged());
            }
        }, "Date Changed");
        paths.add("rewiewer");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getRewiewer());
            }
        }, "Rewiewer");
        paths.add("autor");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<medizin.client.managed.request.PersonProxy> renderer = medizin.client.managed.ui.PersonProxyRenderer.instance();

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getAutor());
            }
        }, "Autor");
        paths.add("id");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("version");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
        paths.add("orderAversion");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getOrderAversion());
            }
        }, "Order Aversion");
        paths.add("orderBversion");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getOrderBversion());
            }
        }, "Order Bversion");
        paths.add("trenschaerfe");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Double> renderer = new AbstractRenderer<java.lang.Double>() {

                public String render(java.lang.Double obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getTrenschaerfe());
            }
        }, "Trenschaerfe");
        paths.add("schwierigkeit");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Double> renderer = new AbstractRenderer<java.lang.Double>() {

                public String render(java.lang.Double obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getSchwierigkeit());
            }
        }, "Schwierigkeit");
        paths.add("isAssQuestionAcceptedRewiever");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getIsAssQuestionAcceptedRewiever());
            }
        }, "Is Ass Question Accepted Rewiever");
        paths.add("isAssQuestionAcceptedAdmin");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getIsAssQuestionAcceptedAdmin());
            }
        }, "Is Ass Question Accepted Admin");
        paths.add("isAssQuestionAdminProposal");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getIsAssQuestionAdminProposal());
            }
        }, "Is Ass Question Admin Proposal");
        paths.add("isAssQuestionAcceptedAutor");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.lang.Boolean> renderer = new AbstractRenderer<java.lang.Boolean>() {

                public String render(java.lang.Boolean obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getIsAssQuestionAcceptedAutor());
            }
        }, "Is Ass Question Accepted Autor");
        paths.add("question");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<medizin.client.managed.request.QuestionProxy> renderer = medizin.client.managed.ui.QuestionProxyRenderer.instance();

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getQuestion());
            }
        }, "Question");
        paths.add("assesment");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<medizin.client.managed.request.AssesmentProxy> renderer = medizin.client.managed.ui.AssesmentProxyRenderer.instance();

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getAssesment());
            }
        }, "Assesment");
        paths.add("answersToAssQuestion");
        table.addColumn(new TextColumn<AssesmentQuestionProxy>() {

            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.AnswerToAssQuestionProxyRenderer.instance());

            @Override
            public String getValue(AssesmentQuestionProxy object) {
                return renderer.render(object.getAnswersToAssQuestion());
            }
        }, "Answers To Ass Question");
    }
}
