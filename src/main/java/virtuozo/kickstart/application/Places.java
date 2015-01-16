package virtuozo.kickstart.application;

import virtuozo.infra.Presenter;
import virtuozo.infra.interfaces.Place;
import virtuozo.kickstart.ui.HomePagePresenter;

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