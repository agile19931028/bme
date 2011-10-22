// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package medizin.client.managed.request;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtMirroredFrom;

@RooGwtMirroredFrom("medizin.server.domain.Comment")
@ServiceName("medizin.server.domain.Comment")
public interface CommentRequest extends RequestContext {

    abstract InstanceRequest<medizin.client.managed.request.CommentProxy, java.lang.Void> persist();

    abstract InstanceRequest<medizin.client.managed.request.CommentProxy, java.lang.Void> remove();

    abstract Request<java.lang.Long> countComments();

    abstract Request<java.util.List<medizin.client.managed.request.CommentProxy>> findAllComments();

    abstract Request<medizin.client.managed.request.CommentProxy> findComment(Long id);

    abstract Request<java.util.List<medizin.client.managed.request.CommentProxy>> findCommentEntries(int firstResult, int maxResults);
}