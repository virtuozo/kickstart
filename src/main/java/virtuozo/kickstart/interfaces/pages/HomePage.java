package virtuozo.kickstart.interfaces.pages;

import virtuozo.interfaces.FontAwesome;
import virtuozo.interfaces.HasComponents;
import virtuozo.interfaces.HeroPageLayout;
import virtuozo.interfaces.IconifiedList;
import virtuozo.interfaces.Navbar;
import virtuozo.interfaces.Paragraph;
import virtuozo.interfaces.Row;
import virtuozo.interfaces.ViewPort;
import virtuozo.interfaces.Row.Column;
import virtuozo.interfaces.css.BackgroundColor;
import virtuozo.kickstart.interfaces.HomePagePresenter.HomeView;

public class HomePage implements HomeView {
  private HeroPageLayout layout = HeroPageLayout.create();

  @Override
  public void render(HasComponents<?, ?> container) {
    this.layout.attach();
    this.layout.navbar().css(Navbar.Placement.TOP, Navbar.Type.INVERSE).brand().text("kickstart");
    this.layout.header().css(BackgroundColor.PRIMARY).addHeading().text("Virtuozo Kickstart Application");
    this.layout.header().addText().text("Less code, more results.");
    
    Row row = this.layout.body().addRow();
    Column main = row.addColumn().span(12, ViewPort.SMALL);
    
    main.add(Paragraph.create().text("Please, proceed to the following steps:"));
    IconifiedList list = IconifiedList.create().attachTo(main);
    list.addItem().icon(FontAwesome.CHECK).text("Change package structure in the src/main/java and src/main/resources");
    list.addItem().icon(FontAwesome.CHECK).text("Change Kickstart.gwt.xml accordingly");
    list.addItem().icon(FontAwesome.CHECK).text("Change <groupid>, <artifactId>, <version> and <finalName> tags values in the pom.xml file to reflect your project settings");
    list.addItem().icon(FontAwesome.CHECK).text("Still in pom.xml locate <properties> tag and change <main.package>, <module> and <web.target> to reflect your project settings");
  
    main.add(Paragraph.create().text("Steps to run this module"));
    list = IconifiedList.create().attachTo(main);
    list.addItem().icon(FontAwesome.CHECK).text("Package web content using mvn clean package -P gwt");
    list.addItem().icon(FontAwesome.CHECK).text("Run development mode using mvn gwt:run -P gwt");
    list.addItem().icon(FontAwesome.CHECK).text("Use the web browser to see the web page");
    list.addItem().icon(FontAwesome.CHECK).text("You can also use jetty plugin to run the compiled version using mvn jetty:run -P gwt");
  }
  
  @Override
  public void bind() {
    
  }

  @Override
  public void unbind() {

  }
}