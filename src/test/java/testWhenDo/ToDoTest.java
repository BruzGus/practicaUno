package testWhenDo;

import activity.todo.MainTodo;
import activity.todo.NewToDo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ToDoTest {

    MainTodo mainTodo = new MainTodo();
    NewToDo newToDo = new NewToDo();

    //Verificar la creacion de un nuevo ToDo
    @Test
    public void verifyNewTodo() throws MalformedURLException {
        String title = "Eydan";
        String note = "hacer tarea";

        String resultExpected = "Eydan";

        mainTodo.addToDo.click();
        newToDo.titleTB.type(title);
        newToDo.noteTB.type(note);
        newToDo.saveButton.click();

        Assert.assertTrue("ERROR: La tarea no esta creada.", mainTodo.isDisplayedNewToDo(resultExpected));


    }

    //Definir un tamaño definido de una lista de Tareas
    @Test
    public void verifyListToDo() throws MalformedURLException {
        //Arrange
        int resultExpected = 4;
        //Act
        int resultActual = mainTodo.sizeListToDo();
        //Assert
        Assert.assertEquals("ERROR : Al evaluar el numero de items ToDo",resultExpected,resultActual);


    }


    @After
    public void closeSession() throws MalformedURLException {
        Session.getInstance().CloseSession();
    }
}
