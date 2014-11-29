package hitz.virtuozo.kickstart.application;

import hitz.virtuozo.infra.Place;
import hitz.virtuozo.infra.Presenter;
import hitz.virtuozo.kickstart.ui.HomePagePresenter;

public enum Places implements Place {
  HOME{
    @Override
    public Presenter<?> presenter() {
      return HomePagePresenter.get();
    }
  };
  
  @Override
  public String token() {
    return this.name().toLowerCase();
  }
}