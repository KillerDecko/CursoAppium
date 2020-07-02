package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.AccordionPage;
import br.sc.andremendonca.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class AccordionTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private AccordionPage accordion = new AccordionPage();

    @Test
    public void mustInteractWithAccordion(){
        //access menu
        menu.accessAccordion();
        //Click option1
        accordion.clickOpcao("1");
        //Verify Text Option 1
        forceWait(1000);
        Assert.assertEquals("Esta é a descrição da opção 1",accordion.getOptionText("1"));
    }
}
