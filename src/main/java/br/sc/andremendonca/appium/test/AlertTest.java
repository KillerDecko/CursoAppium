package br.sc.andremendonca.appium.test;

import br.sc.andremendonca.appium.core.BaseTest;
import br.sc.andremendonca.appium.page.AlertaPage;
import br.sc.andremendonca.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlertTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AlertaPage alert = new AlertaPage();
    @Before
    public void setupAlertScreen(){
        menu.accessAlertas();
    }

    @Test
    public void mustConfirmAlert(){
        //Access Alert Menu
       //setupAlertScreen
        //Click Confirm ALert
        alert.clickAlertConfirm();
        //Verify Alert Text
        assertEquals("Info", alert.getAlertTitle());
        assertEquals("Confirma a operação?", alert.getAlertMessage());
        //Confirm Alert
        alert.confirmAlert();

        //Verify New message
        assertEquals("Confirmado", alert.getAlertMessage());
        //Quit
        alert.exit();
    }

    @Test
    public void mustClickOutsideAlert(){
        //Access Alert Menu
        //setupAlertScreen
        //Click Alerta Simples
        alert.clickAlertaSimples();

        //Click Outside Alert
        forceWait(1000);
        alert.clickOutsideAlert();

        //Verify if message disappears
        Assert.assertFalse(alert.elementExistByText("Pode clicar no OK ou fora da caixa para sair"));
    }
}
