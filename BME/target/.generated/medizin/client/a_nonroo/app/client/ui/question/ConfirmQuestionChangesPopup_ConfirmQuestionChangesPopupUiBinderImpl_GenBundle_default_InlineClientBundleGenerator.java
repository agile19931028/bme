package medizin.client.a_nonroo.app.client.ui.question;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle {
  public medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GF2JA2OODB{margin:" + ("1em")  + ";float:" + ("left")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OPDB{margin:" + ("1.5em")  + ";padding:" + ("1em")  + ";float:" + ("left")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}")) : ((".GF2JA2OODB{margin:" + ("1em")  + ";float:" + ("right")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}.GF2JA2OPDB{margin:" + ("1.5em")  + ";padding:" + ("1em")  + ";float:" + ("right")  + ";background:" + ("none")  + ";cursor:" + ("pointer")  + ";}"));
    }
    public java.lang.String button(){
      return "GF2JA2OODB";
    }
    public java.lang.String panel(){
      return "GF2JA2OPDB";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenCss_style style;
  
  static {
    new ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@medizin.client.a_nonroo.app.client.ui.question.ConfirmQuestionChangesPopup_ConfirmQuestionChangesPopupUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
