// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.StaticContent")
@ServiceName("medizin.server.domain.StaticContent")
public interface StaticContentRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.StaticContentProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.StaticContentProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countStaticContents();

    abstract Request<java.util.List<medizin.client.managed.request.StaticContentProxy>> findAllStaticContents();

    abstract Request<medizin.client.managed.request.StaticContentProxy> findStaticContent(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.StaticContentProxy>> findStaticContentEntries(int firstResult, int maxResults);
}
