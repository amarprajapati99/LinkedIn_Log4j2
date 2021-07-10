package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass{

    /* @Description - Using FindBy for locating elements */

    @FindBy (xpath = "//input[@id='username']")
    WebElement userId;

    @FindBy (xpath = "//input[@id='password']")
    WebElement userPassword;

    @FindBy (xpath = "//button[normalize-space()='Sign in']")
    WebElement loginButton;

    /* @Description - Called parameterized constructor */

    public Login (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    public void login(String userEmail, String userPass) {
        Log.info ("enter your email id ");
        userId.sendKeys (userEmail);
        Log.info ("enter your user password ");
        userPassword.sendKeys (userPass);
        Log.info ("click on login button ");
        loginButton.click ();

    }
}
