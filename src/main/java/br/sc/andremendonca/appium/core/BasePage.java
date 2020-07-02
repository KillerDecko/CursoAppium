package br.sc.andremendonca.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;
import java.util.List;

import static br.sc.andremendonca.appium.core.DriverFactory.getDriver;

public class BasePage {
    public void write(By by, String text){
        getDriver().findElement(by).sendKeys(text);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public void click(By by){
        getDriver().findElement(by).click();
    }

    public void clickByText(String text){
        click(By.xpath("//*[@text='"+text+"']"));
    }


    public void selectCombo(By by, String text){
        getDriver().findElement(by).click();
        clickByText(text);
    }
    public boolean isChecked(By by){
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean elementExistByText(String text){
        List<MobileElement> elements = getDriver().findElements(By.xpath("//*[@text='"+text+"']"));
        return elements.size() > 0;

    }

    public void tap(int x, int y){
        new TouchAction(getDriver()).tap(PointOption.point(x,y)).perform();
    }

    public void scroll(double start, double end){

        Dimension size = getDriver().manage().window().getSize();

        int x = size.width /2;

        int startY = (int) (size.height * start);
        int endY = (int) (size.height * end);

        new TouchAction(getDriver())
                .press(PointOption.point(x, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, endY))
                .release()
                .perform();
    }

    public void scrollDown(){
        scroll(0.9, 0.1);
    }
    public void scrollUp(){
        scroll(0.1, 0.9);
    }

    public void swipe(double start, double end){

        Dimension size = getDriver().manage().window().getSize();

        int y = size.height /2;

        int startX = (int) (size.width * start);
        int endX = (int) (size.width * end);

        new TouchAction(getDriver())
                .press(PointOption.point(startX, y))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX,y))
                .release()
                .perform();
    }
    public void swipeLeft(){
        swipe(0.1, 0.9);
    }

    public void swipeRight(){
        swipe(0.9, 0.1);
    }
}
