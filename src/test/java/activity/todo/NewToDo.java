package activity.todo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class NewToDo {
    public Button saveButton;
    public TextBox titleTB;
    public TextBox noteTB;

    public NewToDo(){
        this.saveButton = new Button(By.xpath("//android.widget.TextView[contains(@resource-id,'saveItem')]"));
        this.titleTB = new TextBox(By.xpath("//android.widget.EditText[contains(@resource-id,'noteTextTitle')]"));
        this.noteTB = new TextBox(By.xpath("//android.widget.EditText[contains(@resource-id,'noteTextNotes')]"));
    }


}
