package activity.todo;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.ListView;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class MainTodo {

    public Button addToDo;


    public MainTodo(){
        this.addToDo = new Button(By.xpath("//android.widget.ImageButton[contains(@resource-id,'fab')]"));
    }

    public boolean isDisplayedSaveButton() throws MalformedURLException {
        String locator = "//android.widget.TextView[contains(@resource-id,'saveItem')]";
        Button btnSave = new Button(By.xpath(locator));
        return btnSave.isDisplayed();

    }

    public boolean isDisplayedNewToDo(String name) throws MalformedURLException {
        String locator = "//android.widget.TextView[@text='"+name+"']";
        Label label = new Label(By.xpath(locator));
        return label.isDisplayed();
    }

    //metodo va devolver cuantas listas tiene

    public int sizeListToDo() throws MalformedURLException {
        String locator = "//android.widget.ListView/android.view.ViewGroup";
        ListView listView = new ListView(By.xpath(locator));
        return listView.countItemsListToDo();
    }

}
