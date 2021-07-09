package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.HomePage;
import com.bridgelabz.selenium.pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

    @Test(priority =1)
    public void loginTo_Application_with_valid_credentials ()  {
        Login login = new Login (driver);
        login.login ();
    }

    @Test(priority = 2)
    public void toCheck_sendData_inTo_searchBox() throws InterruptedException {
        Login login = new Login (driver);
        login.login ();
        HomePage homePage = new HomePage (driver);
        homePage.sendText ();
    }
}
