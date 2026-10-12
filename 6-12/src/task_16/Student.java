package task_16;
public class Student {
    String name;
    int age;
    double grade1;
    double grade2;
    double grade3;

    public Student(String name, int age, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Average Grade: " + calculateAverage());
    }
}