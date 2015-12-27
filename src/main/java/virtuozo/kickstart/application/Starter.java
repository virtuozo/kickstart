package virtuozo.kickstart.application;

import virtuozo.infra.Historian;
import virtuozo.ui.HTML;

import com.google.gwt.core.client.EntryPoint;

public class Starter implements EntryPoint {
  
  @Override
  public void onModuleLoad() {
    Historian.get().handle(Places.values()).target(HTML.body()).forwardTo(Places.HOME);
  }
}