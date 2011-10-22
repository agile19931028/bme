// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.Person")
@ServiceName("medizin.server.domain.Person")
public interface PersonRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.PersonProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.PersonProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countPeople();

    abstract Request<java.util.List<medizin.client.managed.request.PersonProxy>> findAllPeople();

    abstract Request<medizin.client.managed.request.PersonProxy> findPerson(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.PersonProxy>> findPersonEntries(int firstResult, int maxResults);
}
