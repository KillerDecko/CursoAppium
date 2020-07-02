package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.sc.andremendonca.appium.core.DriverFactory.getDriver;

public class OpcaoEscondidaTest extends BaseTest {

    private MenuPage menu = new MenuPage();

    @Test
    public void mustFindOpcaoEscondia(){
        //Scroll down
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@text='Formulário']")));

        menu.scrollDown();
        //Tap Menu
        menu.clickByText("Opção bem escondida");
        //Verify Alert Message
        Assert.assertTrue(menu.elementExistByText("Você achou essa opção"));
        //Quit Message
        menu.clickByText("OK");
    }
}
