package ru.rtsoft.qa.prospector.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rtsoft.qa.prospector.helpers.HelperBase;
import ru.rtsoft.qa.prospector.pages.MainMenu;
import ru.rtsoft.qa.prospector.pages.Page;

import static org.testng.Assert.assertTrue;


public class CommonElementsTest extends TestBase {

  @BeforeClass
  public void login() {
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
    MainMenu mainMenu = new MainMenu(app);
    assertTrue(helperBase.isElementPresent(page.mainMenuButton(helperBase)));
    page.sidePanelsPresent();
    page.leftPanelCheck();
    assertTrue(helperBase.isElementPresent(page.rightPanelSummaryLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelGatewaysLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelMetersLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelMBusesLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelMEPsLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelDiscoveredMetersLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelUnknkownGatewaysLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelEventsLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.rightPanelDeployedDevicesLink(helperBase)));
    assertTrue(helperBase.isElementPresent(page.refreshButton(helperBase)));
    assertTrue(helperBase.isElementPresent(page.languageSwitcher(helperBase)));
    assertTrue(helperBase.isElementPresent(page.userPreferenceToggle(helperBase)));
    assertTrue(helperBase.isElementPresent(page.helpButton(helperBase)));

    page.mainMenuButton(helperBase).click();
    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuConfigurationItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationFileManagerSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationSchedulesSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationFirmwareManagerSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationTemplateJobsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationTemplateSchedulesSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationServerWANConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationOpticalPortAccessKeysSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationAttributeManagerSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationHierarchyManagerSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationEventsSubItem(helperBase)));
    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesEventConfigurationSubItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDCNTemplatesWANConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDCNTemplatesPhaseConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDCNTemplatesLowVoltageGridConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDCNTemplatesProcessConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDCNTemplatesParameterlessCommandsSubItem(helperBase)));
    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuConfigurationDeviceTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDeviceTemplatesLPMemoryConfigurationSubItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesLPConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesControlRelayConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesDisconnectConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesDisconnectThresholdsConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesDisplayConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesEventLogConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesOpticalPortConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesPQAlarmThresholdConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesPrePaySettingsConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesDemandInitialSettingsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesDemandReconfigurationSettingsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesParameterlessCommandsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesReadScheduleSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesBillingScheduleSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesCDLPConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesCELConfigurationSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuConfigurationDeviceTemplatesSelfReadRetrievalConfigurationSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuImportItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuImportImportHistorySubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuImportGatewaysSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuImportMetersSubItem(helperBase)));
    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuImportFileSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuImportFileManageImportKeysSubItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuImportFileManageExportKeysSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuImportFileImportFileSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuTOUItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuTOUDashboardSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuATMItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuATMDashboardSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuATMAssignmentHistorySubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuATMSettingsSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuReportingItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuReportingResultsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuReportingReportsSubItem(helperBase)));
    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuQoRItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuQoRDashboardSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuQoRReportsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuQoRChartsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuQoRSettingsSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuSecurityItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuSecurityGroupManagerSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuSecurityUserManagerSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuLogsItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuLogsAuditSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuLogsNESMessageLogSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuLogsRetrieveEMLogSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuLogsNESSysSoftwareLogSubItem(helperBase)));

    new Actions(app.driver).
            moveToElement(mainMenu.mainMenuGeneralSettingsItem(helperBase)).
            perform();
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuGeneralSettingsSystemSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuGeneralSettingsUserPreferenceSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuGeneralSettingsSolutionSettingsSubItem(helperBase)));
    assertTrue(helperBase.isElementPresent(mainMenu.mainMenuGeneralSettingsPurgeSettingsSubItem(helperBase)));
    mainMenu.mainMenuCloseButton(helperBase).click();
  }
}
