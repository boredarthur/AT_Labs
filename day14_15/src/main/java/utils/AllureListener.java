package main.java.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import main.java.BrowserFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class AllureListener implements ITestListener {


    @Attachment(value="Page screen", type="image/png")
    public byte[] getScreenshot(){
        return ((TakesScreenshot) BrowserFactory.getDriver())
                .getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value="{0}", type="text/plain")
    public String getDom(){
        return BrowserFactory.getDriver().getPageSource();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        getScreenshot();
        getDom();
    }
}
