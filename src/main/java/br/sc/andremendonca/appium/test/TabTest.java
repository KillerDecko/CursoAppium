package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.AbasPage;
import br.sc.andremendonca.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TabTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AbasPage tabs = new AbasPage();

    @Test
    public void mustInteractWithTabs(){

        //Access Tab menu
        menu.accessTabs();
        //Verify Tab 1
        assertTrue(tabs.isTab1());
        //Access Tab 2
        tabs.accessTab2();
        //Verify Tab 2
        assertTrue(tabs.isTab2());
    }
}
