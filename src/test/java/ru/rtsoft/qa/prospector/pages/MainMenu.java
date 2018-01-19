package ru.rtsoft.qa.prospector.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.rtsoft.qa.prospector.application.Application;
import ru.rtsoft.qa.prospector.helpers.HelperBase;

public class MainMenu extends Page {

  public MainMenu(Application app) {
    super(app);
  }

  public WebElement mainMenuConfigurationItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(1)"));
  }

  public WebElement mainMenuImportItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(2)"));
  }

  public WebElement mainMenuTOUItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(3)"));
  }

  public WebElement mainMenuATMItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(4)"));
  }

  public WebElement mainMenuReportingItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(5)"));
  }

  public WebElement mainMenuQoRItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(6)"));
  }

  public WebElement mainMenuSecurityItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(7)"));
  }

  public WebElement mainMenuLogsItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(8)"));
  }

  public WebElement mainMenuGeneralSettingsItem(HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("#nes-menu .parent-menu>li:nth-of-type(9)"));
  }

  public WebElement mainMenuConfigurationFileManagerSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuConfigurationSchedulesSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuConfigurationFirmwareManagerSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(5)"));
  }

  public WebElement mainMenuConfigurationTemplateJobsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(6)"));
  }

  public WebElement mainMenuConfigurationTemplateSchedulesSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(7)"));
  }

  public WebElement mainMenuConfigurationServerWANConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(8)"));
  }

  public WebElement mainMenuConfigurationOpticalPortAccessKeysSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(9)"));
  }

  public WebElement mainMenuConfigurationAttributeManagerSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(10)"));
  }

  public WebElement mainMenuConfigurationHierarchyManagerSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(11)"));
  }

  public WebElement mainMenuConfigurationEventsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(12)"));
  }

  public WebElement mainMenuImportImportHistorySubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuImportGatewaysSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuImportMetersSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuImportFileSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuTOUDashboardSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuATMDashboardSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuATMAssignmentHistorySubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuATMSettingsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuReportingResultsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuReportingReportsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuQoRDashboardSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuQoRReportsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuQoRChartsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuQoRSettingsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuSecurityGroupManagerSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuSecurityUserManagerSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuLogsAuditSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuLogsNESMessageLogSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuLogsEMLogSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuLogsNESSysSoftwareLogSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuGeneralSettingsSystemSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuGeneralSettingsUserPreferenceSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuGeneralSettingsSolutionSettingsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuGeneralSettingsPurgeSettingsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(1)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesEventConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesWANConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesPhaseConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesLowVoltageGridConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesProcessConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(5)"));
  }

  public WebElement mainMenuConfigurationDCNTemplatesParameterlessCommandsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(6)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesLPMemoryConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(1)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesLPConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(2)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesControlRelayConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(3)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesDisconnectConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(4)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesDisconnectThresholdsConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(5)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesDisplayConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(6)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesEventLogConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(7)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesOpticalPortConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(8)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesPQAlarmThresholdConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(9)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesPrePaySettingsConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(10)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesDemandInitialSettingsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(11)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesDemandReconfigurationSettingsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(12)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesParameterlessCommandsSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(13)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesReadScheduleSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(14)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesBillingScheduleSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(15)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesCDLPConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(16)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesCELConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(17)"));
  }

  public WebElement mainMenuConfigurationDeviceTemplatesSelfReadRetrievalConfigurationSubItem (HelperBase helperBase){
    return app.driver.findElement(By.cssSelector("ul[ng-mouseleave='closeSubMenu(2)']>li:nth-of-type(18)"));
  }


}
