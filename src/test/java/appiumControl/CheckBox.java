package appiumControl;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class CheckBox extends Control {


    public CheckBox(By locator) {
        super(locator);
    }

    public void check() throws MalformedURLException {
        this.findControl();
        if ( this.control.isSelected()==false)
            this.control.click();

    }

    public void unCheck() throws MalformedURLException {
        this.findControl();
        if(this.isDisplayed())
            this.control.click();
    }

}
