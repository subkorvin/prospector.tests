package ru.rtsoft.qa.prospector.application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.rtsoft.qa.prospector.helpers.SessionHelper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Application {
  private final Properties properties;
  public WebDriver driver;
  public WebDriverWait wait;

  private String browser;
  private SessionHelper sessionHelper;

  public Application(String browser) {
    this.browser = browser;
    properties = new Properties();
  }


  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }

  public void stop() {
    if (driver != null) {
      driver.quit();
    }
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }

  public SessionHelper session() {
    if (sessionHelper == null) {
      sessionHelper = new SessionHelper(this);
    }
    return sessionHelper;
  }

  public WebDriver getDriver() {
    if (driver == null) {
      if (Objects.equals(browser, BrowserType.FIREFOX)) {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
      } else if (Objects.equals(browser, BrowserType.CHROME)) {
        Map<String, Object> prefs =new HashMap<String, Object>();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("disable-infobars");
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        option.setExperimentalOption("prefs", prefs);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, option);
        driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
      } else if (Objects.equals(browser, BrowserType.IE)) {
        driver = new InternetExplorerDriver();
      } else if (Objects.equals(browser, BrowserType.EDGE)){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
      }
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //неявное ожидание
      wait = new WebDriverWait(driver, 3); // тайм-аут явного ожидания
      openStartPage();
    }
    return driver;
  }

  private void openStartPage() {
//    driver.get(properties.getProperty("web.baseUrl"));
    driver.navigate().to("https://sendbox/EM5/");
  }

}
