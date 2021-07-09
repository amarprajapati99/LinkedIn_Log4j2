package com.bridgelabz.selenium.base;

import com.bridgelabz.selenium.pages.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @BeforeMethod
    public void setUp() {

         WebDriverManager.chromedriver ().setup ();
         driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.get ("https://www.linkedin.com/login");

        Log.info ("launched the browser");
        driver.manage ().timeouts ().implicitlyWait (20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown () {
        driver.close ();
        Reporter.log ("close the browser",true);

    }
}

