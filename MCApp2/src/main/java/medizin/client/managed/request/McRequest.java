// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.Mc")
@ServiceName("medizin.server.domain.Mc")
public interface McRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.McProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.McProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countMcs();

    abstract Request<java.util.List<medizin.client.managed.request.McProxy>> findAllMcs();

    abstract Request<medizin.client.managed.request.McProxy> findMc(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.McProxy>> findMcEntries(int firstResult, int maxResults);
}
