package Model.Domain;

public class Person {
    /** Имя посетителя */
    private String name;
    /** Возраст посетителя */
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод Принимает Возраст посетителя
     * 
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Метод присвоения нового значения возраста посетителя
     * 
     * @param age возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }

}
