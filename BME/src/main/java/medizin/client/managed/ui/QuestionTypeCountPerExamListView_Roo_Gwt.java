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
import medizin.client.managed.request.AssesmentProxy;
import medizin.client.managed.request.QuestionTypeCountPerExamProxy;
import medizin.client.managed.request.QuestionTypeProxy;
import medizin.client.scaffold.place.AbstractProxyListView;

public abstract class QuestionTypeCountPerExamListView_Roo_Gwt extends AbstractProxyListView<QuestionTypeCountPerExamProxy> {

    @UiField
    CellTable<QuestionTypeCountPerExamProxy> table;

    protected Set<String> paths = new HashSet<String>();

    public void init() {
        paths.add("questionTypesAssigned");
        table.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.util.Set> renderer = medizin.client.scaffold.place.CollectionRenderer.of(medizin.client.managed.ui.QuestionTypeProxyRenderer.instance());

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getQuestionTypesAssigned());
            }
        }, "Question Types Assigned");
        paths.add("assesment");
        table.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<medizin.client.managed.request.AssesmentProxy> renderer = medizin.client.managed.ui.AssesmentProxyRenderer.instance();

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getAssesment());
            }
        }, "Assesment");
        paths.add("questionTypeCount");
        table.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getQuestionTypeCount());
            }
        }, "Question Type Count");
        paths.add("sort_order");
        table.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getSort_order());
            }
        }, "Sort_order");
        paths.add("id");
        table.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.lang.Long> renderer = new AbstractRenderer<java.lang.Long>() {

                public String render(java.lang.Long obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getId());
            }
        }, "Id");
        paths.add("version");
        table.addColumn(new TextColumn<QuestionTypeCountPerExamProxy>() {

            Renderer<java.lang.Integer> renderer = new AbstractRenderer<java.lang.Integer>() {

                public String render(java.lang.Integer obj) {
                    return obj == null ? "" : String.valueOf(obj);
                }
            };

            @Override
            public String getValue(QuestionTypeCountPerExamProxy object) {
                return renderer.render(object.getVersion());
            }
        }, "Version");
    }
}