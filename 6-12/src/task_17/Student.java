package task_17;
public class Student {
    String name;
    int age;
    static String school = "IB School";
    static int count = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", School: " + school);
    }

    static void showStudentCount() {
        System.out.println("Total students: " + count);
    }
}