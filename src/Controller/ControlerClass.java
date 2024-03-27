package Controller;
// Для того чтобы контролёр мог регулировать происходящим, он должен знать о существовании Model и View

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;

import Model.Domain.Student;
import View.ViewClass;

public class ControlerClass {
    // Для добавления интерфейсов необходимо заменить поля на ->
    // private ModelClass model;
    // private ViewClass view;

    /** ModelClass реализующий интерфейс iGetMode */
    private iGetModel model;
    /** ViewClass реализующий интерфейс iGetView */
    private iGetView view;
    /** ViewClassEng реализующий интерфейс iGetView */
    private iGetView view2;
    /** Буферное хранилище */
    private List<Student> buffer = new ArrayList<>();

    /**
     * 
     * @param model ModelClass реализующий интерфейс iGetMode
     * @param view  ViewClass реализующий интерфейс iGetView
     * @param view2 ViewClassEng реализующий интерфейс iGetView
     */
    public ControlerClass(iGetModel model, iGetView view, iGetView view2) {
        this.model = model;
        this.view = view;
        this.view2 = view2;
    }

    /**
     * Метод возвразает true/false по наличии сткдентов в списке
     * 
     * @param students список студентов
     */
    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }

    }

    /** Метод что связывает ModelClass и ViewClass 
     * @apiNote  получение списка студентов 
    */
    public void update() {
        // MVC
        // view.printAllStudents(model.getAllStudents());

        // MVP
        // необходимо получить данные ModelClass во внутрь ControlerClass


        buffer = model.getAllStudents();

        if (testData(buffer)) {
            view.printAllStudents(buffer);
        } else {
            System.out.println("Список студентов пуст");
        }

    }

    /** Метод что взаимодействовать пользователю с списком по введению команд с консоли */
    public void run() {
        Command com = Command.NONE;// Создает команду
        // Бесконечный цикл
        boolean getNewIteration = true;
        while (getNewIteration) {

            String command = view.prompt("Введите команду: ");// Считать данные с консоли
            com = Command.valueOf(command.toUpperCase());// Превратить их в команду
            switch (com) {// Сравнить какую команду ввел пользователь
                case EXIT:
                    getNewIteration = false;
                    System.out.println("выход из программы!");
                    break;
                case LIST:
                    // MVC
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    System.out.println("Введите id студента для удаление");
                    Scanner scanner = new Scanner(System.in);
                    int iDStudent = scanner.nextInt();
                    if (model.deletedStudent(iDStudent)){
                        System.out.println("id студента " + iDStudent + " Удалён");
                    }else{
                        System.out.println("Студента с ID " + iDStudent + "не существует");
                    }                  
                    break;

            }
        }

    }

}
