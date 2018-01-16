package ru.rtsoft.qa.prospector.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.rtsoft.qa.prospector.application.Application;

public class Page {

  protected Application app;
  protected WebDriver driver;
  protected WebDriverWait wait;

  public Page(Application app) {
    this.app = app;
    this.driver = app.getDriver();
    wait = new WebDriverWait(driver, 10);
  }
}
