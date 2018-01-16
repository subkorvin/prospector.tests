package ru.rtsoft.qa.prospector.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.rtsoft.qa.prospector.application.Application;

import java.io.IOException;

public class TestBase {

  protected static Application app;

  @BeforeSuite
  public void setUp() throws Exception {
    app = new Application(System.getProperty("browser", BrowserType.CHROME));
    app.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws IOException {
    app.stop();
  }


  public static Application getApp() {
    return app;
  }

  protected void waitLoadingStartPage() {
    app.wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".pro-page-summary-section-title.inline"), 4));
  }
}
