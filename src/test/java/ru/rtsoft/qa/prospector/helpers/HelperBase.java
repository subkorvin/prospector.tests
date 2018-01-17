package ru.rtsoft.qa.prospector.helpers;

import org.openqa.selenium.*;
import ru.rtsoft.qa.prospector.application.Application;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by korvin on 21.02.2017.
 */
public class HelperBase {

  protected Application app;
  protected WebDriver driver;

  public HelperBase(Application app) {
    this.app = app;
    this.driver = app.getDriver();
  }

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (!Objects.equals(text, existingText)) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }

  protected void attach(By locator, File file) {
    if (file != null) {
      driver.findElement(locator).sendKeys(file.getAbsolutePath());
    }
  }


  protected void confirm() {
    driver.switchTo().alert().accept();
  }

  public boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public boolean isElementPresent(By locator) { // функция наличия элемента при использовании неявного ожидания
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public boolean isElementPresent(WebElement webElement) { // функция наличия элемента при использовании неявного ожидания
    try {
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

  public boolean isElementPresentExplicit(By locator) {  //функция наличия элемента при использовании явного ожидания локатора
    try {
      app.wait.until((WebDriver d) -> d.findElement(locator));
      return true;
    } catch (TimeoutException ex) {
      return false;
    }
  }


  public boolean isElementChecked(By locator) {
    isElementPresent(locator);
    return Objects.equals(driver.findElement(locator).getAttribute("checked"), "true");  // аналогично следующим, упрощено студией
  }

  public boolean isElementDisabled(By locator) {
    isElementPresent(locator);
    if (Objects.equals(driver.findElement(locator).getAttribute("disabled"), "disabled")) {
      return true;
    } else return false;
  }

  public boolean isHierarchySelected(){
    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    if (isElementPresent(By.cssSelector("div[class='part right active'][ng-click='scope.applyHierarchyFilterDefault()']"))){
      return true;
    } else return false;
  }

  public boolean isAssigned(){
      if (isElementPresent(By.xpath("//td[@class='pro-tree-row-title selected']/div[@class='pro-tree-row-title-text-wrapper']/span[@title='ASSIGNED']"))){
        return true;
      } else return false;
  }

}
