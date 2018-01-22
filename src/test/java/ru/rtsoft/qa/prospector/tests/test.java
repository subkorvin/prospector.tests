package ru.rtsoft.qa.prospector.tests;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.rtsoft.qa.prospector.helpers.HelperBase;
import ru.rtsoft.qa.prospector.pages.MainMenu;
import ru.rtsoft.qa.prospector.pages.Page;

public class test extends TestBase {

  @BeforeClass
  public void login() {
    app.session().loginAsAdmin();
    waitLoadingStartPage();
  }


  @AfterClass (enabled = false)
  public void logout() {
    app.session().logout();
  }


  @Test
  public void test() throws InterruptedException {
    HelperBase helperBase = new HelperBase(app);
    Page page = new Page(app);
    MainMenu mainMenu = new MainMenu(app);

    page.mainMenuButton(helperBase).click();
    new Actions(app.driver).moveToElement(mainMenu.mainMenuConfigurationItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesEventConfigurationSubItem(helperBase)).pause(1000).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesWANConfigurationSubItem(helperBase)).pause(1000).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesPhaseConfigurationSubItem(helperBase)).pause(1000).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesLowVoltageGridConfigurationSubItem(helperBase)).pause(1000).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesProcessConfigurationSubItem(helperBase)).pause(1000).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesSubItem(helperBase)).
            moveToElement(mainMenu.mainMenuConfigurationDCNTemplatesParameterlessCommandsSubItem(helperBase)).
//            pause(1000).
            perform();

//    page.mainMenuConfigurationItem(helperBase).click();
//app.driver.findElement(By.cssSelector(""))
    Thread.sleep(5000);
  }
}
