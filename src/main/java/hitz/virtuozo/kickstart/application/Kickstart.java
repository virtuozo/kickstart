package hitz.virtuozo.kickstart.application;

import hitz.virtuozo.infra.PlaceRepository;
import hitz.virtuozo.ui.HTML;

import com.google.gwt.core.client.EntryPoint;

public class Kickstart implements EntryPoint {
  
  @Override
  public void onModuleLoad() {
    PlaceRepository.get().put(Places.values()).forwardTo(HTML.body()).go(Places.HOME);
  }
}