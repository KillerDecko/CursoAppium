package br.sc.andremendonca.appium.page;

import br.sc.andremendonca.appium.core.BasePage;
import org.openqa.selenium.By;

public class AlertaPage extends BasePage {

    public void clickAlertConfirm(){
        clickByText("ALERTA CONFIRM");
    }

    public void clickAlertaSimples(){
        clickByText("ALERTA SIMPLES");
    }

    public String getAlertTitle(){
        return getText(By.id("android:id/alertTitle"));
    }

    public String getAlertMessage(){
        return getText(By.id("android:id/message"));
    }

    public void confirmAlert(){
        clickByText("CONFIRMAR");
    }

    public void exit(){
        clickByText("SAIR");
    }

    public void clickOutsideAlert(){
        tap(100, 150);
    }

}
