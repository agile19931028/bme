package medizin.client.a_nonroo.app.client.ui.assignquestion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OEW{background-color:" + ("#e6d8f2")  + ";padding:" + ("5px")  + ";position:" + ("absolute")  + ";width:" + ("96%")  + ";min-height:" + ("50px")  + ";}.GF2JA2OFW{width:" + ("100%")  + ";}")) : ((".GF2JA2OEW{background-color:" + ("#e6d8f2")  + ";padding:" + ("5px")  + ";position:" + ("absolute")  + ";width:" + ("96%")  + ";min-height:" + ("50px")  + ";}.GF2JA2OFW{width:" + ("100%")  + ";}"));
    }
    public java.lang.String displayPanel(){
      return "GF2JA2OEW";
    }
    public java.lang.String maxWidth(){
      return "GF2JA2OFW";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenCss_style style;
  
  static {
    new AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenBundle_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.assignquestion.AssesmentQuestionPanelImpl_AssesmentQuestionPanelImplUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
