package ru.rtsoft.qa.prospector.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.rtsoft.qa.prospector.application.Application;
import ru.rtsoft.qa.prospector.helpers.HelperBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Page {

  protected Application app;
  protected WebDriver driver;
  protected WebDriverWait wait;

  public Page(Application app) {
    this.app = app;
    this.driver = app.getDriver();
    wait = new WebDriverWait(driver, 10);
  }

  public void mainMenuButtonPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("#nes-button")));
  }

  public void sidePanelsPresent() {
    List<WebElement> panels = app.driver.findElements(By.cssSelector("div[class='header']>span[class='text']"));
    List<String> expected = Arrays.asList("Filters", "System");
    List<String> actual = new ArrayList<>();
    for (WebElement panel : panels) {
      String panelName = panel.getAttribute("textContent");
      actual.add(panelName);
    }
    assertEquals(expected, actual);
  }

  public void leftPanelCheck(){
    List<WebElement> nodes = app.driver.findElements(By.cssSelector(".cell.text"));
    List<String> expected = Arrays.asList("Hierarchy", "Attributes");
    List<String> actual = new ArrayList<>();
    for (WebElement node : nodes) {
      String nodeName = node.getAttribute("textContent");
      actual.add(nodeName);
    }
    assertEquals(expected, actual);
  }

  public void rightPanelSummaryLinkPresentCheck(HelperBase helperBase){
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/Summary']")));
  }

  public void rightPanelGatewaysLinkPresentCheck(HelperBase helperBase){
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/DataConcentrators']")));
  }

  public void rightPanelMetersLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/Meters']")));
  }

  public void rightPanelMBusesLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/Mbuses']")));
  }

  public void rightPanelMEPsLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/Meps']")));
  }

  public void rightPanelDiscoveredMetersLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/DiscoveredMeters']")));
  }

  public void rightPanelUnknkownGatewaysLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/UnknownDC']")));
  }

  public void rightPanelEventsLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/Events']")));
  }

  public void rightPanelDeployedDevicesLinkPresentCheck(HelperBase helperBase) {
    assertTrue(helperBase.isElementPresent(By.cssSelector("a[href='#/CC/DeployedDevices']")));
  }

  public void refreshButtonPresentCheck(HelperBase helperBase){
    assertTrue(helperBase.isElementPresent(By.cssSelector("#refresh")));
  }

  public void languageSwitcherPresentCheck(HelperBase helperBase){
    assertTrue(helperBase.isElementPresent(By.cssSelector("li:nth-of-type(2) .pro-dropdown-toggle")));
  }

  public void userPreferenceTogglePresentCheck(HelperBase helperBase){
    assertTrue(helperBase.isElementPresent(By.cssSelector("li:nth-of-type(3) .pro-dropdown-toggle")));
  }

  public void helpButtonPresentCheck(HelperBase helperBase){
    assertTrue(helperBase.isElementPresent(By.cssSelector(".pro-navbar-button.pro-icon.pro-icon-help")));
  }
}
