package medizin.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class McSetEditor_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.managed.ui.McSetEditor_BinderImpl_GenBundle {
  public medizin.client.managed.ui.McSetEditor_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.managed.ui.McSetEditor_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OCMB{border:" + ("thin"+ " " +"solid"+ " " +"black")  + ";margin:" + ("2px")  + ";overflow:" + ("hidden")  + ";padding:" + ("5px")  + ";-moz-border-radius:" + ("5px")  + ";-webkit-border-radius:" + ("5px")  + ";}.GF2JA2OBMB,.GF2JA2ODMB{display:" + ("none")  + ";}")) : ((".GF2JA2OCMB{border:" + ("thin"+ " " +"solid"+ " " +"black")  + ";margin:" + ("2px")  + ";overflow:" + ("hidden")  + ";padding:" + ("5px")  + ";-moz-border-radius:" + ("5px")  + ";-webkit-border-radius:" + ("5px")  + ";}.GF2JA2OBMB,.GF2JA2ODMB{display:" + ("none")  + ";}"));
    }
    public java.lang.String editorPanelHidden(){
      return "GF2JA2OBMB";
    }
    public java.lang.String editorPanelVisible(){
      return "GF2JA2OCMB";
    }
    public java.lang.String viewPanelHidden(){
      return "GF2JA2ODMB";
    }
    public java.lang.String viewPanelVisible(){
      return "GF2JA2OEMB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.managed.ui.McSetEditor_BinderImpl_GenCss_style style;
  
  static {
    new McSetEditor_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.managed.ui.McSetEditor_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
