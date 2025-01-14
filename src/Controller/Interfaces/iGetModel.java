package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {

    public List<Student> getAllStudents();

    public void printAllStudents(List<Student> buffer);

    public boolean deletedStudent(int studentID);
}
