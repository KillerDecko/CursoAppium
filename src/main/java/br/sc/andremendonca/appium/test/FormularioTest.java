package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.FormularioPage;
import br.sc.andremendonca.appium.page.MenuPage;
import io.appium.java_client.MobileBy;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static br.sc.andremendonca.appium.core.DriverFactory.killDriver;
import static org.junit.Assert.*;

public class FormularioTest extends BaseTest {
    private MenuPage menu = new MenuPage();
    private FormularioPage formPage = new FormularioPage();

    @Before
    public void tearUp(){
        menu.accessFormulario();
    }

    @Test
    public void mustFillTextField() throws MalformedURLException {

        formPage.writeName("André");
        assertEquals("André", formPage.getName());


    }

    @Test
    public void mustSelectCombo() throws MalformedURLException {

        formPage.selectConsole("PS4");
        assertEquals("PS4", formPage.getConsoleValue());

    }

    @Test
    public void mustInteractWithSwitchAndCheckbox() throws MalformedURLException {

        //Verify Element State
        assertFalse(formPage.isCheckChecked());
        assertTrue(formPage.isSwitchChecked());

        //Click on Element
        formPage.clickCheck();
        formPage.clickSwitch();

        //Verify Changed data
        assertTrue(formPage.isCheckChecked());
        assertFalse(formPage.isSwitchChecked());
    }

    @Test
    public void mustCheckSavedData() throws MalformedURLException {

        //Enter Name
        formPage.writeName("TestName");

        //SelectConsole
        formPage.selectConsole("PS4");

        //Change Switch and CheckBox
        formPage.clickCheck();
        formPage.clickSwitch();

        //Click Save
        formPage.save();

        //Assert Results
        assertEquals("Nome: " + formPage.getName() + "", formPage.getSavedName());
        assertEquals("Console: ps4", formPage.getSavedConsole());
        assertTrue(formPage.getSavedSwitchValue().endsWith("Off"));
        assertTrue(formPage.getSavedCheckState().endsWith("Marcado"));

    }

    @Test
    public void mustCheckSavedNameSlowly() throws MalformedURLException {

        //Enter Name
        formPage.writeName("TestName");


        //Click Save
        formPage.saveSlowly();

        //Assert Results
        assertEquals("Nome: " + formPage.getName() + "", formPage.getSavedName());

    }
    @Test
    public void mustChangeDate(){
        formPage.clickByText("01/01/2000");
        formPage.clickByText("20");
        formPage.clickByText("OK");
        Assert.assertTrue(formPage.elementExistByText("20/2/2000"));
    }

    @Test
    public void mustChangeTime(){
        formPage.clickByText("06:00");
        formPage.click(MobileBy.AccessibilityId("10"));
        formPage.click(MobileBy.AccessibilityId("40"));
        formPage.clickByText("OK");
        Assert.assertTrue(formPage.elementExistByText("10:40"));
    }

    @Test
    public void mustInteractWithSeekBar(){
        //click seekbar
        formPage.clickSeekBar(0.67);
        //Save
        formPage.save();
        //Get Slider Value
        assertTrue(formPage.getSavedSliderValue().endsWith("67"));

    }

}
