package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.HomePage;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.MyPost;
import com.bridgelabz.selenium.pages.SignOut;
import com.bridgelabz.selenium.utility.DataProvider;
import com.bridgelabz.selenium.utility.Listener.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners (CustomListener.class)
public class LoginTest extends BaseClass{

    @Test (dataProvider = "LoginDetails", dataProviderClass = DataProvider.class, priority = 1)
    public void loginTo_Application_with_valid_credentials (String userEmail, String userPass)  {
        Login login = new Login (driver);
        login.login (userEmail, userPass);
        SignOut signOut = new SignOut (driver);
        signOut.setSignOut ();

    }

    @Test (dataProvider = "LoginDetails", dataProviderClass = DataProvider.class, priority = 2)
    public void TestHome_isWorkingOrNot(String userEmail, String userPass) throws InterruptedException {
        Login login = new Login (driver);
        login.login (userEmail, userPass);

        HomePage homePage = new HomePage (driver);
        homePage.sendText ();

        SignOut signOut = new SignOut (driver);
        signOut.setSignOut ();
    }

    @Test (dataProvider = "LoginDetails", dataProviderClass = DataProvider.class, priority = 3)
    public void ToCheck_MyPost_IsWorking_OrNot(String userEmail, String userPass) throws InterruptedException, AWTException {
        Login login = new Login (driver);
        login.login (userEmail, userPass);

        MyPost myPost = new MyPost (driver);
        myPost.sharePost ();
        myPost.sharePhoto ();

        myPost.setClipboardData ("");
        myPost.likePost ();

        SignOut signOut = new SignOut (driver);
        signOut.setSignOut ();

    }
}

