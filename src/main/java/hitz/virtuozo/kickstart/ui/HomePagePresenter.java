package hitz.virtuozo.kickstart.ui;

import hitz.virtuozo.infra.Presenter;
import hitz.virtuozo.infra.View;
import hitz.virtuozo.kickstart.ui.HomePagePresenter.HomeView;
import hitz.virtuozo.kickstart.ui.pages.HomePage;

public class HomePagePresenter extends Presenter<HomeView>{
  private static final HomePagePresenter instance = new HomePagePresenter(new HomePage());
  
  public static HomePagePresenter get() {
    return instance;
  }
  
  private HomePagePresenter(HomeView view) {
    super(view);
  }
  
  @Override
  protected void unbind() {
    this.view().detach();
  }
  
  public interface HomeView extends View {
    void detach();
  }
}