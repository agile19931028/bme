package medizin.client.a_nonroo.app.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenCss_style() {
    private boolean injected;
    public boolean ensureInjected() {
      if (!injected) {
        injected = true;
        com.google.gwt.dom.client.StyleInjector.inject(getText());
        return true;
      }
      return false;
    }
    public String getName() {
      return "style";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OLT{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}")) : ((".GF2JA2OLT{border:" + ("0"+ " " +"solid"+ " " +"#ddf")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}"));
    }
    public java.lang.String panelHTML(){
      return "GF2JA2OLT";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenCss_style style;
  
  static {
    new AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.AcceptAssQuestionViewImpl_AcceptAssQuestionViewImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
