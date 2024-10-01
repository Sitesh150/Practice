package utils;

import base.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class ListenersImplement implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
        CommonUtils commonUtils = new CommonUtils();
        TakesScreenshot takesScreenshot = (TakesScreenshot) DriverManager
                .driverInstance().getDriver();
        String fileName = result.getMethod().getMethodName();
        File fileSrc = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File fileDest = new File("./test-output/screenshots/" + commonUtils
                .dateAndTime() + "/" +  fileName +  ".png");
        try {
            FileUtils.copyFile(fileSrc, fileDest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
