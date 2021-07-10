package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut extends BaseClass{

    /*Used FindBy Annotations for getting elements using locators
     * Initialize web elements */
    @FindBy(xpath = "//img[@id='ember34']")
    WebElement clickOnMe;

    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement signOut;

    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signIn;

    public SignOut (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    public void setSignOut(){
        Log.info ("click on me");
        clickOnMe.click ();
        Log.info ("click on sign-out");
        signOut.click ();
        Log.info ("click on sign-in");
        signIn.click ();
    }
}
