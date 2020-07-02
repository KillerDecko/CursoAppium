package br.sc.andremendonca.appium.page;


import br.sc.andremendonca.appium.core.BasePage;

public class MenuPage extends BasePage {

    public void accessFormulario() {

        String menuName = "Formulário";
        clickByText(menuName);

    }

    public void accessSplash(){
        String menuName = "Splash";
        clickByText(menuName);
    }

    public void accessAlertas(){
        String menuName = "Alertas";
        clickByText(menuName);
    }

    public void accessTabs(){
        String menuName = "Abas";
        clickByText(menuName);
    }

    public void accessAccordion(){
        String menuName = "Accordion";
        clickByText(menuName);
    }

    public void accessCliques(){
        String menuName = "Cliques";
        clickByText(menuName);
    }
    public void accessSwipe(){
        String menuName = "Swipe";
        clickByText(menuName);
    }
    public void accessSwipeList(){
        String menuName = "Swipe";
        clickByText(menuName);
    }


}

