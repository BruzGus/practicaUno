package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessionManager.Session;

import java.net.MalformedURLException;
import java.util.List;

public class Control {
    protected WebElement control;
    protected By locator;
    protected List<WebElement> controls;

    public Control(By locator) {
        this.locator = locator;
    }

    public void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void findControlsList() throws MalformedURLException {
        this.controls = Session.getInstance().getDriver().findElements(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public void getText() throws MalformedURLException {
        this.findControl();
        this.control.getText();
    }

    public boolean isDisplayed() throws MalformedURLException {
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public int countItemsListToDo() throws MalformedURLException {
        this.findControlsList();
        return this.controls.size();

    }



}


