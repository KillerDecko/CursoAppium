package br.sc.andremendonca.appium.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraTesteSamsung {

    @Test
    public void mustSumTwoValues() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<MobileElement> driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        MobileElement el1 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Plus");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_02");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Equal");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Calculator input field");


        //System.out.println(el7.getText());
        Assert.assertEquals("4", el5.getText());


        driver.quit();

    }
}




