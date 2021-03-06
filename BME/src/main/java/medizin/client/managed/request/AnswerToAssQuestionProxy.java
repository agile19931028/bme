// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.ProxyForName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.AnswerToAssQuestion")
@ProxyForName("medizin.server.domain.AnswerToAssQuestion")
public interface AnswerToAssQuestionProxy extends EntityProxy {

    abstract Integer getSortOrder();

    abstract void setSortOrder(Integer sortOrder);

    abstract AnswerProxy getAnswers();

    abstract void setAnswers(AnswerProxy answers);

    abstract AssesmentQuestionProxy getAssesmentQuestion();

    abstract void setAssesmentQuestion(AssesmentQuestionProxy assesmentQuestion);

    abstract Long getId();

    abstract void setId(Long id);

    abstract Integer getVersion();

    abstract void setVersion(Integer version);
}
