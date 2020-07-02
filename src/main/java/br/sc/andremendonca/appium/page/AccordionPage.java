package br.sc.andremendonca.appium.page;

import br.sc.andremendonca.appium.core.BasePage;
import org.openqa.selenium.By;

public class AccordionPage extends BasePage {

    public void clickOpcao(String optionNumber){
        clickByText("Opção "+optionNumber+"");

    }

    public void clickOpcao1(){
        clickByText("Opção 1");

    }

    public String getOptionText(String optionNumber){
        return getText(By.xpath("//*[@text='Opção "+optionNumber+"']/../../following-sibling::android.view.ViewGroup//android.widget.TextView"));
    }

    public String getOption1Text(){
        return getText(By.xpath("//*[@text='Opção 1']/../../following-sibling::android.view.ViewGroup//android.widget.TextView"));
    }

}
