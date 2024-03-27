import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.text.View;

import Controller.ControlerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("Ivan", 22);
        Student student2 = new Student("Oleg", 23);
        Student student3 = new Student("Petr", 20);
        Student student4 = new Student("Ira", 21);
        Student student5 = new Student("Olga", 22);

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);

        // Создание модели
        iGetModel model1 = new ModelClass(listStudents, listStudents);
        iGetView view2 = new ViewClass();
        // С текстом на Английском
        iGetView view3 = new ViewClassEng();
        ControlerClass controller1 = new ControlerClass(model1, view3, view3);
        controller1.update();


        ControlerClass controller = new ControlerClass(model1, view2, view3);

        controller.run();
        
        // --------------------------------------------------------
        // Как превратиль класс ModelClass в prezent?
        // Необходимо разорвать соединение между getAllStudents и PrintAllStudents
        // Для этого необходимо создать дополнительную переменную в классе
        // ControlerClass
   
        

    }
}
