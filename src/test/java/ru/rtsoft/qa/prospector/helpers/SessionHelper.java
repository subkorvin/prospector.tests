package ru.rtsoft.qa.prospector.helpers;

import org.openqa.selenium.By;
import ru.rtsoft.qa.prospector.application.Application;

/**
 * Created by korvin on 20.02.2017.
 */
public class SessionHelper extends HelperBase {

  public SessionHelper(Application app) {
    super(app);
  }

  public void loginAsAdmin() {
    type(By.name("UserName"), app.getProperty("web.adminLogin"));
    type(By.name("Password"), app.getProperty("web.adminPassword"));
    click(By.cssSelector("input[value='Sign In']"));
  }

  public void logout() {
    click(By.cssSelector("a[ng-click='scope.logout()']"));
  }

  public void changePassword(String confirmationLink, String password) {
    driver.get(confirmationLink);
    type(By.name("password"), password);
    type(By.name("password_confirm"), password);
    click(By.cssSelector("button[type='submit']"));
  }
}
