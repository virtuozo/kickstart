package virtuozo.kickstart.interfaces;

import virtuozo.infra.Presenter;
import virtuozo.infra.View;
import virtuozo.kickstart.interfaces.HomePagePresenter.HomeView;
import virtuozo.kickstart.interfaces.pages.HomePage;

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
    this.view().unbind();
  }
  
  public interface HomeView extends View {
    void unbind();
  }
}