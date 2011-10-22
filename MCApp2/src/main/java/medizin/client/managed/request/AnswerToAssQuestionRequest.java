// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.AnswerToAssQuestion")
@ServiceName("medizin.server.domain.AnswerToAssQuestion")
public interface AnswerToAssQuestionRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.AnswerToAssQuestionProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countAnswerToAssQuestions();

    abstract Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> findAllAnswerToAssQuestions();

    abstract Request<medizin.client.managed.request.AnswerToAssQuestionProxy> findAnswerToAssQuestion(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.AnswerToAssQuestionProxy>> findAnswerToAssQuestionEntries(int firstResult, int maxResults);
}
