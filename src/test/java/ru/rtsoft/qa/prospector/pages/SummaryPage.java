package ru.rtsoft.qa.prospector.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.rtsoft.qa.prospector.application.Application;
import ru.rtsoft.qa.prospector.helpers.HelperBase;

public class SummaryPage extends Page {

  public SummaryPage(Application app) {
    super(app);
  }

  public WebElement exportButton(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector(".pro-menu-horizontal.pro-menu a[ng-click='scope.showExportWindow()']"));
  }

  public WebElement settingsButton(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector(".pro-menu-horizontal.pro-menu .pro-settings"));
  }

  public WebElement gatewaySection(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//tr[.//div[. = 'Gateway Communication Status']]"));
  }

  public WebElement metersSection(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//tr[.//div[. = 'Meter Status']]"));
  }

  public WebElement eventsSection(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//tr[.//div[. = 'Events Status']]"));
  }

  public WebElement gatewaysPieChart(HelperBase helperBase) {
    WebElement section = app.driver.findElement(By.xpath("//div[. = 'Gateway Communication Status']/.."));
    return section.findElement(By.cssSelector("svg[class='pro-chart-pie']"));
  }

  public WebElement metersPieChart(HelperBase helperBase) {
    WebElement section = app.driver.findElement(By.xpath("//div[. = 'Meter Status']/.."));
    return section.findElement(By.cssSelector("svg[class='pro-chart-pie']"));
  }

  public WebElement eventsPieChart(HelperBase helperBase) {
    WebElement section = app.driver.findElement(By.xpath("//div[. = 'Events Status']/.."));
    return section.findElement(By.cssSelector("svg[class='pro-chart-pie']"));
  }

  public WebElement gatewaysPieChartLegendCommunicated(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//td[. = 'Communicated Today']"));
  }

  public WebElement gatewaysPieChartLegendNotCommunicated(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//td[. = 'Not Communicated Today']"));
  }

  public WebElement gatewaysBarChartLegendSucceeded(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//span[. = 'Succeeded']"));
  }

  public WebElement gatewaysBarChartLegendFailed(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//span[. = 'Failed']"));
  }

  public WebElement metersPieChartLegendBoxEnabled(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='legend-box'][title^='Enabled:']"));
  }

  public WebElement metersPieChartLegendEnabled(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='pro-page-summary-chart-legenda cursor-pointer'][title^='Enabled:']"));
  }

  public WebElement metersPieChartLegendBoxAddPending(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='legend-box'][title^='Add Pending:']"));
  }

  public WebElement metersPieChartLegendAddPending(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='pro-page-summary-chart-legenda cursor-pointer'][title^='Add Pending:']"));
  }

  public WebElement metersPieChartLegendBoxCommissioned(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='legend-box'][title^='Commissioned:']"));
  }

  public WebElement metersPieChartLegendCommissioned(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='pro-page-summary-chart-legenda cursor-pointer'][title^='Commissioned:']"));
  }

  public WebElement metersPieChartLegendBoxAddFailed(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='legend-box'][title^='Add Failed:']"));
  }

  public WebElement metersPieChartLegendAddFailed(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='pro-page-summary-chart-legenda cursor-pointer'][title^='Add Failed:']"));
  }

  public WebElement metersPieChartLegendBoxRemovePending(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='legend-box'][title^='Remove Pending:']"));
  }

  public WebElement metersPieChartLegendRemovePending(HelperBase helperBase) {
    return app.driver.findElement(By.cssSelector("td[class='pro-page-summary-chart-legenda cursor-pointer'][title^='Remove Pending:']"));
  }

  public WebElement metersBarChartLegendRegisterReadsAvailable(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//span[. = 'Register Reads Available']"));
  }

  public WebElement metersBarChartLegendRegisterReadsUnavailable(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//span[. = 'Register Reads Unavailable']"));
  }

  public WebElement metersBarChartLegendLPReadsAvailable(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//span[. = 'Load Profile Reads Available']"));
  }

  public WebElement metersBarChartLegendLPReadsUnavailable(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//span[. = 'Load Profile Reads Unavailable']"));
  }

  public WebElement eventsPieChartLegendCritical(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//td[. = 'Critical']"));
  }

  public WebElement eventsPieChartLegendNonCritical(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//td[. = 'Non-Critical']"));
  }

  public WebElement eventsBarChartLegendGatewayEvents(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//label[. = 'Gateway Events']"));
  }

  public WebElement eventsBarChartLegendDeviceEvents(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//label[. = 'Device Events']"));
  }

  public WebElement eventsBarChartLegendSystemEvents(HelperBase helperBase) {
    return app.driver.findElement(By.xpath("//label[. = 'System Events']"));
  }

}
