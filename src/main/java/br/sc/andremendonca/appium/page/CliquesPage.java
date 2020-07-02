package br.sc.andremendonca.appium.page;

import br.sc.andremendonca.appium.core.BasePage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import static br.sc.andremendonca.appium.core.DriverFactory.getDriver;

public class CliquesPage extends BasePage {
    public void longTap(){
         new TouchAction(getDriver())
                 .longPress(ElementOption.element(getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))))
                 .perform();
    }

    public String getTextValue(){

        return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }
}
