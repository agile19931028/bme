// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.Institution")
@ServiceName("medizin.server.domain.Institution")
public interface InstitutionRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.InstitutionProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countInstitutions();

    abstract Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> findAllInstitutions();

    abstract Request<medizin.client.managed.request.InstitutionProxy> findInstitution(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.InstitutionProxy>> findInstitutionEntries(int firstResult, int maxResults);
}