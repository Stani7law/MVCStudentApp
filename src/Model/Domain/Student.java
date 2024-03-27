package Model.Domain;



/** Класс СТУДЕНТЫ наследует данные от класса Person */
// имплементируем интерфейс Comparable и передаём ему <Student>
// Comparable позволяет определить логику измерения и добавляем мотод с
// последующим переопределением compareTo.
public class Student extends Person implements Comparable<Student> {
    
    /** номер студента */
    private int id;
    /** генерированный номер */
    private static int generalID;

    public Student(String name, int age) {
        super(name, age);
        this.id = generalID;
        generalID++;// Генерация уникального студента

    }

    public int getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return "Student [id = " + id +
                ", Name = " + getName() +
                ", Age = " + getAge() + "]";
    }

    // данный метод позволяет определить логику сравнения, но саму логику опысываем
    // самостоятельно

    //@Override
    public int compareTo(Student o) {
        // сравнивать студентов будем по возрасту
        if (o.getAge() == super.getAge()) {
            return 0;
            
        }
        if (o.getAge() > getAge()) {
            return -1;
        } else {
            return 1;
        }
    }

    

}
