package ru.rtsoft.qa.prospector.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


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
  public void commonElementsTest(){

  }


}
