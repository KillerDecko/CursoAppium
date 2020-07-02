package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.CliquesPage;
import br.sc.andremendonca.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CliquesTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private CliquesPage clique = new CliquesPage();

    @Before
    public void accessPage(){
        menu.accessCliques();

    }

    @Test
    public void mustMakeLongTap(){
        //access menu
        //Long Tap
        clique.longTap();
        //Verify Text
        assertEquals("Clique Longo", clique.getTextValue());

    }

    @Test
    public void mustMakeDoubleTap(){
        clique.clickByText("Clique duplo");
        clique.clickByText("Clique duplo");

        assertEquals("Duplo Clique", clique.getTextValue());

    }
}
