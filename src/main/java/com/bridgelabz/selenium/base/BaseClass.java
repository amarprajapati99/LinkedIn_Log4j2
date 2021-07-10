package com.bridgelabz.selenium.base;

import com.bridgelabz.selenium.pages.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @Parameters ("browserName")
    @BeforeTest
    public void setup (String browserName) {

        driver = com.bridgelabz.datadriven.utility.CrossBrowser.selectDriver(browserName);
        Log.info ("launched the browser");

        driver.manage ().window ().maximize ();
        Log.info ("Open url link");
        driver.get ("https://www.linkedin.com/login");
        driver.manage ().timeouts ().implicitlyWait (20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown () {
        driver.close ();
        Reporter.log ("close the browser",true);
    }
}
