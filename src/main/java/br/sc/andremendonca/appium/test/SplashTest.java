package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.MenuPage;
import br.sc.andremendonca.appium.page.SplashPage;
import org.junit.Assert;
import org.junit.Test;

public class SplashTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private SplashPage splash = new SplashPage();

    @Test
    public void mustWaitSplashdisappear(){
        //Access Splash
        menu.accessSplash();
        //Verify that splash is being displayed
        splash.isSplashScreenVisible();
        //Wait splash disappear
        splash.waitSplashDisappear();
        //Verify if Form is appearing
        Assert.assertTrue(splash.elementExistByText("Formulário"));
    }
}
