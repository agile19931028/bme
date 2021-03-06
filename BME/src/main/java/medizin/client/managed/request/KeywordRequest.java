// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.Keyword")
@ServiceName("medizin.server.domain.Keyword")
public interface KeywordRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.KeywordProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.KeywordProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countKeywords();

    abstract Request<java.util.List<medizin.client.managed.request.KeywordProxy>> findAllKeywords();

    abstract Request<medizin.client.managed.request.KeywordProxy> findKeyword(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.KeywordProxy>> findKeywordEntries(int firstResult, int maxResults);
}
