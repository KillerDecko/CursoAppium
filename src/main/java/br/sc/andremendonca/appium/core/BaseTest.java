package br.sc.andremendonca.appium.core;
import static br.sc.andremendonca.appium.core.DriverFactory.getDriver;
import static br.sc.andremendonca.appium.core.DriverFactory.killDriver;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import sun.rmi.rmic.iiop.Generator;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    @Rule
    public TestName testName = new TestName();

    @AfterClass
    public static void finalizeClass(){
        killDriver();
    }

    @After
    public void tearDown(){
        takeScreenShot();
        getDriver().resetApp();
    }

    public void takeScreenShot(){
        File image = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(image,new File("target/screenshots/"+testName.getMethodName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void forceWait(long miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
