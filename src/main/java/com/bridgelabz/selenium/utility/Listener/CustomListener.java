package com.bridgelabz.selenium.utility.Listener;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Log;
import com.bridgelabz.selenium.utility.CaptureScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


public class CustomListener extends BaseClass implements ITestListener{

    CaptureScreenshot captureScreenshot = new CaptureScreenshot ();

    public void onTestFailure(ITestResult result) {
        System.out.println("Method failed " + result.getName());
        Log.warn("Test is failed" );
        try {
            captureScreenshot.captureScreenshot(result.getName(), "failed");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.warn(result.getName() + "Test is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        Log.debug(result.getName() + "Test is failing but within some success percentage");

    }

    public void onTestStart(ITestResult result) {
        Log.info(result.getName() + "Test is starting");
    }

    //onTestSuccess method is used when test is passed it will take screenshot automatically
    public void onTestSuccess(ITestResult result) {
        System.out.println("Method passed " + result.getName());
        Log.info("Test is successfully passed");
        try {
            captureScreenshot.captureScreenshot(result.getName(), "success");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void onStart (ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        Log.info(context.getName() + "Test is finished");
    }
}

