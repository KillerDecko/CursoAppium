package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwipeTest extends BaseTest {

    MenuPage menu = new MenuPage();

    @Before
    public void setMenu(){
        menu.accessSwipe();
    }

    @Test
    public void mustSwipeScreen(){
        //Verify Text "a esquerda"
        Assert.assertTrue(menu.elementExistByText("a esquerda"));

        //Swipe Right
        menu.swipeRight();

        //Verify Text "E veja se"
        Assert.assertTrue(menu.elementExistByText("E veja se"));

        // Click button right
        menu.clickByText("›");
        // Verify text 'Chegar até o fim!'
        Assert.assertTrue(menu.elementExistByText("Chegar até o fim!"));

        //swipe left
        menu.swipeLeft();
        // click button left
        menu.clickByText("‹");
        //Verify Text "a esquerda"
        Assert.assertTrue(menu.elementExistByText("a esquerda"));

    }
}
