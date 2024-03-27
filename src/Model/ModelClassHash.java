package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel {

    public HashMap<Integer, Student> hashMap;


/**
 * Конструктор позволяющий инициализировать HashMap студентов
 * @param hashMapStudents список студентов до вывода HashMap
 */
    public ModelClassHash(List<Student> hashMapStudents) {
        this.hashMap = new HashMap<>();
        for (Student student : hashMapStudents){
            this.hashMap.put(student.getId(), student);
        }
    }

    

    /** Метод вывода списка студентов из HashMap */
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Student student : hashMap.values()){
            students.add(student);

        }
        return students;
       
    }


    public void printAllStudents(List<Student> students) {
        System.out.println("----------------------Список студентов-----------------");

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------------------------");

    }

    
    /**
     * Метод удаления студента по его идентификатору
     * @param studentID идентификатор студента
     */
    public boolean deletedStudent(int studentID) {
        if(!hashMap.containsKey(studentID)){
            return false;
        }else{
            hashMap.remove(studentID);
            return true;

        }

       

    }

}
