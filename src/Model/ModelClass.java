package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

/**
 * Обычное хранилище в памяти
 * Хранит СТУДЕНТОВ
 */
public class ModelClass extends ModelClassHash implements iGetModel {

    private List<Student> students;

    

    public ModelClass(List<Student> hashMapStudents, List<Student> students) {
        super(hashMapStudents);
        this.students = students;
    }
    /**
     * Метод возвращает список студентов List<Student>
     * 
     * @return
     */
    public List<Student> getAllStudents() {

        return students;
    }
    public void printAllStudents(List<Student> students) {
        System.out.println("----------------------Список студентов-----------------");

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------");

    }

    

        
}

    

    

   

    


