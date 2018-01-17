package ru.rtsoft.qa.prospector.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rtsoft.qa.prospector.helpers.HelperBase;
import ru.rtsoft.qa.prospector.pages.Page;


public class CommonElementsTest extends TestBase {

  @BeforeClass
  public void login() throws InterruptedException {
    app.session().loginAsAdmin();
    waitLoadingStartPage();
  }


  @AfterClass
  public void logout() {
    app.session().logout();
  }


  @Test
  public void commonElementsPresenceCheck() {
    HelperBase helperBase = new HelperBase(app);
    Page page = new Page(app);
    helperBase.isElementPresent(page.mainMenuButton(helperBase));
    page.sidePanelsPresent();
    page.leftPanelCheck();
    helperBase.isElementPresent(page.rightPanelSummaryLink(helperBase));
    helperBase.isElementPresent(page.rightPanelGatewaysLink(helperBase));
    helperBase.isElementPresent(page.rightPanelMetersLink(helperBase));
    helperBase.isElementPresent(page.rightPanelMBusesLink(helperBase));
    helperBase.isElementPresent(page.rightPanelMEPsLink(helperBase));
    helperBase.isElementPresent(page.rightPanelDiscoveredMetersLink(helperBase));
    helperBase.isElementPresent(page.rightPanelUnknkownGatewaysLink(helperBase));
    helperBase.isElementPresent(page.rightPanelEventsLink(helperBase));
    helperBase.isElementPresent(page.rightPanelDeployedDevicesLink(helperBase));
    helperBase.isElementPresent(page.refreshButton(helperBase));
    helperBase.isElementPresent(page.languageSwitcher(helperBase));
    helperBase.isElementPresent(page.userPreferenceToggle(helperBase));
    helperBase.isElementPresent(page.helpButton(helperBase));
  }
}
