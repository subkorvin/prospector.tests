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

public class Page {

  protected Application app;
  protected WebDriver driver;
  protected WebDriverWait wait;
  protected HelperBase helperBase;

  public Page(Application app) {
    this.app = app;
    this.driver = app.getDriver();
    wait = new WebDriverWait(driver, 10);
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

  public void leftPanelCheck() {
    List<WebElement> nodes = app.driver.findElements(By.cssSelector(".cell.text"));
    List<String> expected = Arrays.asList("Hierarchy", "Attributes");
    List<String> actual = new ArrayList<>();
    for (WebElement node : nodes) {
      String nodeName = node.getAttribute("textContent");
      actual.add(nodeName);
    }
    assertEquals(expected, actual);
  }

  public WebElement mainMenuButton(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("#nes-button"));
  }

  public WebElement rightPanelSummaryLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/Summary']"));
  }

  public WebElement rightPanelGatewaysLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/DataConcentrators']"));
  }

  public WebElement rightPanelMetersLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/Meters']"));
  }

  public WebElement rightPanelMBusesLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/Mbuses']"));
  }

  public WebElement rightPanelMEPsLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/Meps']"));
  }

  public WebElement rightPanelDiscoveredMetersLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/DiscoveredMeters']"));
  }

  public WebElement rightPanelUnknkownGatewaysLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/UnknownDC']"));
  }

  public WebElement rightPanelEventsLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/Events']"));
  }

  public WebElement rightPanelDeployedDevicesLink(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("a[href='#/CC/DeployedDevices']"));
  }

  public WebElement refreshButton(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("#refresh"));
  }

  public WebElement languageSwitcher(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("li:nth-of-type(2) .pro-dropdown-toggle"));
  }

  public WebElement userPreferenceToggle(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("li:nth-of-type(3) .pro-dropdown-toggle"));
  }

  public WebElement helpButton(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector(".pro-navbar-button.pro-icon.pro-icon-help"));
  }

  public WebElement leftPanelToggle(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.toggleLeftSidebar()']"));
  }

  public WebElement rightPanelToggle(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.toggleRightSidebar()']"));
  }

  public WebElement hierarchyShowAllToggle(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.discardHierarchyFilter()']"));
  }

  public WebElement hierarchyFilteredByToggle(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.applyHierarchyFilterDefault()']"));
  }

  public WebElement attributesConfigButton(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector(".cell.configure-button"));
  }

  public WebElement attributesDuplicateButton(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.duplicateAttributeInPane()']"));
  }

  public WebElement attributesRemoveButton(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.deleteAttributeInPane()']"));
  }

  public WebElement attributesAndConditionButton(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.attributeFilterChangeCondition(0)']"));
  }

  public WebElement attributesOrConditionButton(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.attributeFilterChangeCondition(1)']"));
  }

  public WebElement attributesApplyButton(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("div[ng-click='scope.applyAttributesFilter()']"));
  }

  public String getHierarchyLevel(){
    String hierarchyLevel = null;
    if (helperBase.isHierarchySelected()) {
      hierarchyLevel = app.driver.findElement(By.xpath("//div[@ng-model='scope.hierarchies.activeHierarchy']//span[@ng-bind='$select.selected.Name']")).getAttribute("innerHTML");
      }
      return hierarchyLevel;
  }

  public String getHierarchyMember(){
    String hierarchyMember = null;
    if (helperBase.isHierarchySelected()){
      hierarchyMember = app.driver.findElement(By.xpath("//td[@class='pro-tree-row-title selected']//span[@class='ng-binding']")).getAttribute("title");
    }
    return hierarchyMember;
  }
}
