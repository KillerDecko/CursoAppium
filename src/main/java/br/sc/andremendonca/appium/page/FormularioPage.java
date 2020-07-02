package br.sc.andremendonca.appium.page;

import br.sc.andremendonca.appium.core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static br.sc.andremendonca.appium.core.DriverFactory.getDriver;

public class FormularioPage extends BasePage {

    public void writeName(String name){
        write(MobileBy.AccessibilityId("nome"),name);
    }

    public String getName(){
        return getText(MobileBy.AccessibilityId("nome"));
    }

    public void selectConsole(String value) {
        selectCombo(MobileBy.AccessibilityId("console"),value);

    }

    public String getConsoleValue(){
        return getText(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clickCheck(){
        click(By.className("android.widget.CheckBox"));
    }

    public void clickSwitch(){
        click((MobileBy.AccessibilityId("switch")));
    }

    public boolean isCheckChecked(){
        return isChecked((By.className("android.widget.CheckBox")));
    }

    public boolean isSwitchChecked(){
        return isChecked((MobileBy.AccessibilityId("switch")));
    }

    public void clickSeekBar(double position){
        int delta = 55; //To deal with blanks spots of element
        MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
        int y = seek.getLocation().y + (seek.getSize().height / 2);
        int initialX = seek.getLocation().x + delta;
        int x = (int) (initialX + ((seek.getSize().width - 2*delta) * position));
        tap(x,y);
    }

    public void save(){
        clickByText("SALVAR");
    }

    public void saveSlowly(){
        clickByText("SALVAR DEMORADO");
    }

    public String getSavedName(){
        return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
    }

    public String getSavedConsole(){
        return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Console')]"));
    }

    public String getSavedCheckState() {
        return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox')]"));
    }

    public String getSavedSwitchValue() {
        return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch')]"));
    }

    public String getSavedSliderValue(){
       return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Slider')]"));
    }

}
