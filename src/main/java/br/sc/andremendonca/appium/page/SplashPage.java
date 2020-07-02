package br.sc.andremendonca.appium.page;

import br.sc.andremendonca.appium.core.BasePage;
import br.sc.andremendonca.appium.core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static br.sc.andremendonca.appium.core.DriverFactory.getDriver;

public class SplashPage  extends BasePage {
    public boolean isSplashScreenVisible(){
        return elementExistByText("Splash!");
    }

    public void waitSplashDisappear(){
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
    }
}
