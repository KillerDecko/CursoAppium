package br.sc.andremendonca.appium.page;

import br.sc.andremendonca.appium.core.BasePage;

public class AbasPage extends BasePage {
    public boolean isTab1(){
        return elementExistByText("Este é o conteúdo da Aba 1");

    }

    public void accessTab2(){
        clickByText("ABA 2");
    }

    public boolean isTab2(){
        return elementExistByText("Este é o conteúdo da Aba 2");
    }


}
