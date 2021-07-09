package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass{

    /*Used FindBy Annotations for getting elements using locators
     * Initialize web elements */
    @FindBy (xpath = "//li[@class='global-nav__primary-item ']//span[1]")
    WebElement clickOnMe;
    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement signOut;

    /*Called parameterized constructor */
    public Logout (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void setClickOnMe(){
        clickOnMe.click ();
        signOut.click ();
    }
}
