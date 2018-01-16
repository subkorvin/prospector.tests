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
    page.mainMenuButtonPresentCheck(helperBase);
    page.sidePanelsPresent();
    page.leftPanelCheck();
    page.rightPanelSummaryLinkPresentCheck(helperBase);
    page.rightPanelGatewaysLinkPresentCheck(helperBase);
    page.rightPanelMetersLinkPresentCheck(helperBase);
    page.rightPanelMBusesLinkPresentCheck(helperBase);
    page.rightPanelMEPsLinkPresentCheck(helperBase);
    page.rightPanelDiscoveredMetersLinkPresentCheck(helperBase);
    page.rightPanelUnknkownGatewaysLinkPresentCheck(helperBase);
    page.rightPanelEventsLinkPresentCheck(helperBase);
    page.rightPanelDeployedDevicesLinkPresentCheck(helperBase);
    page.refreshButtonPresentCheck(helperBase);
    page.languageSwitcherPresentCheck(helperBase);
    page.userPreferenceTogglePresentCheck(helperBase);
    page.helpButtonPresentCheck(helperBase);
  }
}
