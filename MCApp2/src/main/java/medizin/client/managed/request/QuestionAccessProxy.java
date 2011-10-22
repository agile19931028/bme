// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.ProxyForName;
import medizin.client.shared.AccessRights;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.QuestionAccess")
@ProxyForName("medizin.server.domain.QuestionAccess")
public interface QuestionAccessProxy extends EntityProxy {

    abstract AccessRights getAccRights();

    abstract void setAccRights(AccessRights accRights);

    abstract PersonProxy getPerson();

    abstract void setPerson(PersonProxy person);

    abstract QuestionProxy getQuestion();

    abstract void setQuestion(QuestionProxy question);

    abstract QuestionEventProxy getQuestionEvent();

    abstract void setQuestionEvent(QuestionEventProxy questionEvent);

    abstract Long getId();

    abstract void setId(Long id);

    abstract Integer getVersion();

    abstract void setVersion(Integer version);
}
